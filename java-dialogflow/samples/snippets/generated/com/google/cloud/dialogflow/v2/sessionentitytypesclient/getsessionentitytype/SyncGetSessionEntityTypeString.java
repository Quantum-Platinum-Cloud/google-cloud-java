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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_sessionentitytypesclient_getsessionentitytype_string_sync]
import com.google.cloud.dialogflow.v2.SessionEntityType;
import com.google.cloud.dialogflow.v2.SessionEntityTypeName;
import com.google.cloud.dialogflow.v2.SessionEntityTypesClient;

public class SyncGetSessionEntityTypeString {

  public static void main(String[] args) throws Exception {
    syncGetSessionEntityTypeString();
  }

  public static void syncGetSessionEntityTypeString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
      String name =
          SessionEntityTypeName.ofProjectSessionEntityTypeName(
                  "[PROJECT]", "[SESSION]", "[ENTITY_TYPE]")
              .toString();
      SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
    }
  }
}
// [END dialogflow_v2_generated_sessionentitytypesclient_getsessionentitytype_string_sync]