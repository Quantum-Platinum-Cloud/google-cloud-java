package dlp.snippets;

// [START dlp_deidentify_fpe]

import com.google.cloud.dlp.v2.DlpServiceClient;
import com.google.common.io.BaseEncoding;
import com.google.privacy.dlp.v2.ContentItem;
import com.google.privacy.dlp.v2.CryptoKey;
import com.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig;
import com.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig.FfxCommonNativeAlphabet;
import com.google.privacy.dlp.v2.DeidentifyConfig;
import com.google.privacy.dlp.v2.DeidentifyContentRequest;
import com.google.privacy.dlp.v2.DeidentifyContentResponse;
import com.google.privacy.dlp.v2.InfoType;
import com.google.privacy.dlp.v2.InfoTypeTransformations;
import com.google.privacy.dlp.v2.InfoTypeTransformations.InfoTypeTransformation;
import com.google.privacy.dlp.v2.InspectConfig;
import com.google.privacy.dlp.v2.KmsWrappedCryptoKey;
import com.google.privacy.dlp.v2.PrimitiveTransformation;
import com.google.privacy.dlp.v2.ProjectName;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.Arrays;

public class DeIdentifyWithFpe {

  public static void deIdentifyWithFpe() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "YOUR_PROJECT_ID";
    String textToDeIdentify = "I'm Gary and my email is gary@example.com";
    String kmsKeyName =
        "projects/YOUR_PROJECT/"
            + "locations/YOUR_KEYRING_REGION/"
            + "keyRings/YOUR_KEYRING_NAME/"
            + "cryptoKeys/YOUR_KEY_NAME";
    String wrappedAesKey = "YOUR_ENCRYPTED_AES_256_KEY";
    deIdentifyWithFpe(projectId, textToDeIdentify, kmsKeyName, wrappedAesKey);
  }

  public static void deIdentifyWithFpe(
      String projectId, String textToDeIdentify, String kmsKeyName, String wrappedAesKey)
      throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DlpServiceClient dlp = DlpServiceClient.create()) {
      // Specify what content you want the service to DeIdentify
      ContentItem contentItem = ContentItem.newBuilder().setValue(textToDeIdentify).build();

      // Specify the type of info the inspection will look for.
      // See https://cloud.google.com/dlp/docs/infotypes-reference for complete list of info types
      InfoType infoType = InfoType.newBuilder().setName("US_SOCIAL_SECURITY_NUMBER").build();
      InspectConfig inspectConfig =
          InspectConfig.newBuilder().addAllInfoTypes(Arrays.asList(infoType)).build();

      // Specify an encrypted AES-256 key and the name of the Cloud KMS key that encrypted it
      KmsWrappedCryptoKey kmsWrappedCryptoKey =
          KmsWrappedCryptoKey.newBuilder()
              .setWrappedKey(ByteString.copyFrom(BaseEncoding.base64().decode(wrappedAesKey)))
              .setCryptoKeyName(kmsKeyName)
              .build();
      CryptoKey cryptoKey = CryptoKey.newBuilder().setKmsWrapped(kmsWrappedCryptoKey).build();

      // Specify how the info from the inspection should be encrypted.
      InfoType surrogateInfoType = InfoType.newBuilder().setName("SSN_TOKEN").build();
      CryptoReplaceFfxFpeConfig cryptoReplaceFfxFpeConfig =
          CryptoReplaceFfxFpeConfig.newBuilder()
              .setCryptoKey(cryptoKey)
              // Set of characters in the input text. For more info, see
              // https://cloud.google.com/dlp/docs/reference/rest/v2/organizations.deidentifyTemplates#DeidentifyTemplate.FfxCommonNativeAlphabet
              .setCommonAlphabet(FfxCommonNativeAlphabet.NUMERIC)
              .setSurrogateInfoType(surrogateInfoType)
              .build();
      PrimitiveTransformation primitiveTransformation =
          PrimitiveTransformation.newBuilder()
              .setCryptoReplaceFfxFpeConfig(cryptoReplaceFfxFpeConfig)
              .build();
      InfoTypeTransformation infoTypeTransformation =
          InfoTypeTransformation.newBuilder()
              .setPrimitiveTransformation(primitiveTransformation)
              .build();
      InfoTypeTransformations transformations =
          InfoTypeTransformations.newBuilder().addTransformations(infoTypeTransformation).build();

      DeidentifyConfig deidentifyConfig =
          DeidentifyConfig.newBuilder().setInfoTypeTransformations(transformations).build();

      // Combine configurations into a request for the service.
      DeidentifyContentRequest request =
          DeidentifyContentRequest.newBuilder()
              .setParent(ProjectName.of(projectId).toString())
              .setItem(contentItem)
              .setInspectConfig(inspectConfig)
              .setDeidentifyConfig(deidentifyConfig)
              .build();

      // Send the request and receive response from the service
      DeidentifyContentResponse response = dlp.deidentifyContent(request);

      // Print the results
      System.out.println(
          "Text after format-preserving encryption: " + response.getItem().getValue());
    }
  }
}
// [END dlp_deidentify_fpe]
