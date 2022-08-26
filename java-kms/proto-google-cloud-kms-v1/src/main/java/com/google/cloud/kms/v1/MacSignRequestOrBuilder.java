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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface MacSignRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.MacSignRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
   * signing.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use for
   * signing.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The data to sign. The MAC tag is computed over this data field
   * based on the specific algorithm.
   * </pre>
   *
   * <code>bytes data = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   *
   *
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data]. If
   * specified, [KeyManagementService][google.cloud.kms.v1.KeyManagementService]
   * will verify the integrity of the received
   * [MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data] using this
   * checksum. [KeyManagementService][google.cloud.kms.v1.KeyManagementService]
   * will report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data]) is
   * equal to
   * [MacSignRequest.data_crc32c][google.cloud.kms.v1.MacSignRequest.data_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dataCrc32c field is set.
   */
  boolean hasDataCrc32C();
  /**
   *
   *
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data]. If
   * specified, [KeyManagementService][google.cloud.kms.v1.KeyManagementService]
   * will verify the integrity of the received
   * [MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data] using this
   * checksum. [KeyManagementService][google.cloud.kms.v1.KeyManagementService]
   * will report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data]) is
   * equal to
   * [MacSignRequest.data_crc32c][google.cloud.kms.v1.MacSignRequest.data_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataCrc32c.
   */
  com.google.protobuf.Int64Value getDataCrc32C();
  /**
   *
   *
   * <pre>
   * Optional. An optional CRC32C checksum of the
   * [MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data]. If
   * specified, [KeyManagementService][google.cloud.kms.v1.KeyManagementService]
   * will verify the integrity of the received
   * [MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data] using this
   * checksum. [KeyManagementService][google.cloud.kms.v1.KeyManagementService]
   * will report an error if the checksum verification fails. If you receive a
   * checksum error, your client should verify that
   * CRC32C([MacSignRequest.data][google.cloud.kms.v1.MacSignRequest.data]) is
   * equal to
   * [MacSignRequest.data_crc32c][google.cloud.kms.v1.MacSignRequest.data_crc32c],
   * and if so, perform a limited number of retries. A persistent mismatch may
   * indicate an issue in your computation of the CRC32C checksum. Note: This
   * field is defined as int64 for reasons of compatibility across different
   * languages. However, it is a non-negative integer, which will never exceed
   * 2^32-1, and can be safely downconverted to uint32 in languages that support
   * this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDataCrc32COrBuilder();
}