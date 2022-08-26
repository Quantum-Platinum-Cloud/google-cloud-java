/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_conversationsclient_batchcreatemessages_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesRequest;
import com.google.cloud.dialogflow.v2beta1.BatchCreateMessagesResponse;
import com.google.cloud.dialogflow.v2beta1.ConversationName;
import com.google.cloud.dialogflow.v2beta1.ConversationsClient;
import com.google.cloud.dialogflow.v2beta1.CreateMessageRequest;
import java.util.ArrayList;

public class AsyncBatchCreateMessages {

  public static void main(String[] args) throws Exception {
    asyncBatchCreateMessages();
  }

  public static void asyncBatchCreateMessages() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ConversationsClient conversationsClient = ConversationsClient.create()) {
      BatchCreateMessagesRequest request =
          BatchCreateMessagesRequest.newBuilder()
              .setParent(
                  ConversationName.ofProjectConversationName("[PROJECT]", "[CONVERSATION]")
                      .toString())
              .addAllRequests(new ArrayList<CreateMessageRequest>())
              .build();
      ApiFuture<BatchCreateMessagesResponse> future =
          conversationsClient.batchCreateMessagesCallable().futureCall(request);
      // Do something.
      BatchCreateMessagesResponse response = future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_conversationsclient_batchcreatemessages_async]