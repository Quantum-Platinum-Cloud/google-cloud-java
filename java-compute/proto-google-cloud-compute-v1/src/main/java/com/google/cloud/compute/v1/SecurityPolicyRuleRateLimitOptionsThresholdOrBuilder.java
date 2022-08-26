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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SecurityPolicyRuleRateLimitOptionsThresholdOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of HTTP(S) requests for calculating the threshold.
   * </pre>
   *
   * <code>optional int32 count = 94851343;</code>
   *
   * @return Whether the count field is set.
   */
  boolean hasCount();
  /**
   *
   *
   * <pre>
   * Number of HTTP(S) requests for calculating the threshold.
   * </pre>
   *
   * <code>optional int32 count = 94851343;</code>
   *
   * @return The count.
   */
  int getCount();

  /**
   *
   *
   * <pre>
   * Interval over which the threshold is computed.
   * </pre>
   *
   * <code>optional int32 interval_sec = 41084375;</code>
   *
   * @return Whether the intervalSec field is set.
   */
  boolean hasIntervalSec();
  /**
   *
   *
   * <pre>
   * Interval over which the threshold is computed.
   * </pre>
   *
   * <code>optional int32 interval_sec = 41084375;</code>
   *
   * @return The intervalSec.
   */
  int getIntervalSec();
}