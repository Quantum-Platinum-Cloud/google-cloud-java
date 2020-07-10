/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CreateInspectTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CreateInspectTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * - Format:projects/[PROJECT-ID]
   * - Format:organizations/[ORGANIZATION-ID]
   * - Format:projects/[PROJECT-ID]/locations/[LOCATION-ID]
   * - Format:organizations/[ORGANIZATION-ID]/locations/[LOCATION-ID]
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   * - Format:projects/[PROJECT-ID]
   * - Format:organizations/[ORGANIZATION-ID]
   * - Format:projects/[PROJECT-ID]/locations/[LOCATION-ID]
   * - Format:organizations/[ORGANIZATION-ID]/locations/[LOCATION-ID]
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The InspectTemplate to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.InspectTemplate inspect_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inspectTemplate field is set.
   */
  boolean hasInspectTemplate();
  /**
   *
   *
   * <pre>
   * Required. The InspectTemplate to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.InspectTemplate inspect_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inspectTemplate.
   */
  com.google.privacy.dlp.v2.InspectTemplate getInspectTemplate();
  /**
   *
   *
   * <pre>
   * Required. The InspectTemplate to create.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.InspectTemplate inspect_template = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.InspectTemplateOrBuilder getInspectTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   *
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   *
   *
   * <pre>
   * The template id can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string template_id = 3;</code>
   *
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString getTemplateIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 4;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
