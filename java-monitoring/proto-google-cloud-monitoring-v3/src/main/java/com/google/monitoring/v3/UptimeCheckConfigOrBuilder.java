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
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

public interface UptimeCheckConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UptimeCheckConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique resource name for this Uptime check configuration. The format is:
   *      projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID]
   * `[PROJECT_ID_OR_NUMBER]` is the Workspace host project associated with the
   * Uptime check.
   * This field should be omitted when creating the Uptime check configuration;
   * on create, the resource name is assigned by the server and included in the
   * response.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * A unique resource name for this Uptime check configuration. The format is:
   *      projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID]
   * `[PROJECT_ID_OR_NUMBER]` is the Workspace host project associated with the
   * Uptime check.
   * This field should be omitted when creating the Uptime check configuration;
   * on create, the resource name is assigned by the server and included in the
   * response.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A human-friendly name for the Uptime check configuration. The display name
   * should be unique within a Stackdriver Workspace in order to make it easier
   * to identify; however, uniqueness is not enforced. Required.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * A human-friendly name for the Uptime check configuration. The display name
   * should be unique within a Stackdriver Workspace in order to make it easier
   * to identify; however, uniqueness is not enforced. Required.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The [monitored
   * resource](https://cloud.google.com/monitoring/api/resources) associated
   * with the configuration.
   * The following monitored resource types are valid for this field:
   *   `uptime_url`,
   *   `gce_instance`,
   *   `gae_app`,
   *   `aws_ec2_instance`,
   *   `aws_elb_load_balancer`
   *   `k8s_service`
   * </pre>
   *
   * <code>.google.api.MonitoredResource monitored_resource = 3;</code>
   *
   * @return Whether the monitoredResource field is set.
   */
  boolean hasMonitoredResource();
  /**
   *
   *
   * <pre>
   * The [monitored
   * resource](https://cloud.google.com/monitoring/api/resources) associated
   * with the configuration.
   * The following monitored resource types are valid for this field:
   *   `uptime_url`,
   *   `gce_instance`,
   *   `gae_app`,
   *   `aws_ec2_instance`,
   *   `aws_elb_load_balancer`
   *   `k8s_service`
   * </pre>
   *
   * <code>.google.api.MonitoredResource monitored_resource = 3;</code>
   *
   * @return The monitoredResource.
   */
  com.google.api.MonitoredResource getMonitoredResource();
  /**
   *
   *
   * <pre>
   * The [monitored
   * resource](https://cloud.google.com/monitoring/api/resources) associated
   * with the configuration.
   * The following monitored resource types are valid for this field:
   *   `uptime_url`,
   *   `gce_instance`,
   *   `gae_app`,
   *   `aws_ec2_instance`,
   *   `aws_elb_load_balancer`
   *   `k8s_service`
   * </pre>
   *
   * <code>.google.api.MonitoredResource monitored_resource = 3;</code>
   */
  com.google.api.MonitoredResourceOrBuilder getMonitoredResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The group resource associated with the configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.ResourceGroup resource_group = 4;</code>
   *
   * @return Whether the resourceGroup field is set.
   */
  boolean hasResourceGroup();
  /**
   *
   *
   * <pre>
   * The group resource associated with the configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.ResourceGroup resource_group = 4;</code>
   *
   * @return The resourceGroup.
   */
  com.google.monitoring.v3.UptimeCheckConfig.ResourceGroup getResourceGroup();
  /**
   *
   *
   * <pre>
   * The group resource associated with the configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.ResourceGroup resource_group = 4;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfig.ResourceGroupOrBuilder getResourceGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains information needed to make an HTTP or HTTPS check.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.HttpCheck http_check = 5;</code>
   *
   * @return Whether the httpCheck field is set.
   */
  boolean hasHttpCheck();
  /**
   *
   *
   * <pre>
   * Contains information needed to make an HTTP or HTTPS check.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.HttpCheck http_check = 5;</code>
   *
   * @return The httpCheck.
   */
  com.google.monitoring.v3.UptimeCheckConfig.HttpCheck getHttpCheck();
  /**
   *
   *
   * <pre>
   * Contains information needed to make an HTTP or HTTPS check.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.HttpCheck http_check = 5;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfig.HttpCheckOrBuilder getHttpCheckOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains information needed to make a TCP check.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.TcpCheck tcp_check = 6;</code>
   *
   * @return Whether the tcpCheck field is set.
   */
  boolean hasTcpCheck();
  /**
   *
   *
   * <pre>
   * Contains information needed to make a TCP check.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.TcpCheck tcp_check = 6;</code>
   *
   * @return The tcpCheck.
   */
  com.google.monitoring.v3.UptimeCheckConfig.TcpCheck getTcpCheck();
  /**
   *
   *
   * <pre>
   * Contains information needed to make a TCP check.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig.TcpCheck tcp_check = 6;</code>
   */
  com.google.monitoring.v3.UptimeCheckConfig.TcpCheckOrBuilder getTcpCheckOrBuilder();

  /**
   *
   *
   * <pre>
   * How often, in seconds, the Uptime check is performed.
   * Currently, the only supported values are `60s` (1 minute), `300s`
   * (5 minutes), `600s` (10 minutes), and `900s` (15 minutes). Optional,
   * defaults to `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration period = 7;</code>
   *
   * @return Whether the period field is set.
   */
  boolean hasPeriod();
  /**
   *
   *
   * <pre>
   * How often, in seconds, the Uptime check is performed.
   * Currently, the only supported values are `60s` (1 minute), `300s`
   * (5 minutes), `600s` (10 minutes), and `900s` (15 minutes). Optional,
   * defaults to `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration period = 7;</code>
   *
   * @return The period.
   */
  com.google.protobuf.Duration getPeriod();
  /**
   *
   *
   * <pre>
   * How often, in seconds, the Uptime check is performed.
   * Currently, the only supported values are `60s` (1 minute), `300s`
   * (5 minutes), `600s` (10 minutes), and `900s` (15 minutes). Optional,
   * defaults to `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration period = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * The maximum amount of time to wait for the request to complete (must be
   * between 1 and 60 seconds). Required.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * The maximum amount of time to wait for the request to complete (must be
   * between 1 and 60 seconds). Required.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * The maximum amount of time to wait for the request to complete (must be
   * between 1 and 60 seconds). Required.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * The content that is expected to appear in the data returned by the target
   * server against which the check is run.  Currently, only the first entry
   * in the `content_matchers` list is supported, and additional entries will
   * be ignored. This field is optional and should only be specified if a
   * content match is required as part of the/ Uptime check.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig.ContentMatcher content_matchers = 9;
   * </code>
   */
  java.util.List<com.google.monitoring.v3.UptimeCheckConfig.ContentMatcher>
      getContentMatchersList();
  /**
   *
   *
   * <pre>
   * The content that is expected to appear in the data returned by the target
   * server against which the check is run.  Currently, only the first entry
   * in the `content_matchers` list is supported, and additional entries will
   * be ignored. This field is optional and should only be specified if a
   * content match is required as part of the/ Uptime check.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig.ContentMatcher content_matchers = 9;
   * </code>
   */
  com.google.monitoring.v3.UptimeCheckConfig.ContentMatcher getContentMatchers(int index);
  /**
   *
   *
   * <pre>
   * The content that is expected to appear in the data returned by the target
   * server against which the check is run.  Currently, only the first entry
   * in the `content_matchers` list is supported, and additional entries will
   * be ignored. This field is optional and should only be specified if a
   * content match is required as part of the/ Uptime check.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig.ContentMatcher content_matchers = 9;
   * </code>
   */
  int getContentMatchersCount();
  /**
   *
   *
   * <pre>
   * The content that is expected to appear in the data returned by the target
   * server against which the check is run.  Currently, only the first entry
   * in the `content_matchers` list is supported, and additional entries will
   * be ignored. This field is optional and should only be specified if a
   * content match is required as part of the/ Uptime check.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig.ContentMatcher content_matchers = 9;
   * </code>
   */
  java.util.List<? extends com.google.monitoring.v3.UptimeCheckConfig.ContentMatcherOrBuilder>
      getContentMatchersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The content that is expected to appear in the data returned by the target
   * server against which the check is run.  Currently, only the first entry
   * in the `content_matchers` list is supported, and additional entries will
   * be ignored. This field is optional and should only be specified if a
   * content match is required as part of the/ Uptime check.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckConfig.ContentMatcher content_matchers = 9;
   * </code>
   */
  com.google.monitoring.v3.UptimeCheckConfig.ContentMatcherOrBuilder getContentMatchersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The list of regions from which the check will be run.
   * Some regions contain one location, and others contain more than one.
   * If this field is specified, enough regions must be provided to include a
   * minimum of 3 locations.  Not specifying this field will result in Uptime
   * checks running from all available regions.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckRegion selected_regions = 10;</code>
   *
   * @return A list containing the selectedRegions.
   */
  java.util.List<com.google.monitoring.v3.UptimeCheckRegion> getSelectedRegionsList();
  /**
   *
   *
   * <pre>
   * The list of regions from which the check will be run.
   * Some regions contain one location, and others contain more than one.
   * If this field is specified, enough regions must be provided to include a
   * minimum of 3 locations.  Not specifying this field will result in Uptime
   * checks running from all available regions.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckRegion selected_regions = 10;</code>
   *
   * @return The count of selectedRegions.
   */
  int getSelectedRegionsCount();
  /**
   *
   *
   * <pre>
   * The list of regions from which the check will be run.
   * Some regions contain one location, and others contain more than one.
   * If this field is specified, enough regions must be provided to include a
   * minimum of 3 locations.  Not specifying this field will result in Uptime
   * checks running from all available regions.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckRegion selected_regions = 10;</code>
   *
   * @param index The index of the element to return.
   * @return The selectedRegions at the given index.
   */
  com.google.monitoring.v3.UptimeCheckRegion getSelectedRegions(int index);
  /**
   *
   *
   * <pre>
   * The list of regions from which the check will be run.
   * Some regions contain one location, and others contain more than one.
   * If this field is specified, enough regions must be provided to include a
   * minimum of 3 locations.  Not specifying this field will result in Uptime
   * checks running from all available regions.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckRegion selected_regions = 10;</code>
   *
   * @return A list containing the enum numeric values on the wire for selectedRegions.
   */
  java.util.List<java.lang.Integer> getSelectedRegionsValueList();
  /**
   *
   *
   * <pre>
   * The list of regions from which the check will be run.
   * Some regions contain one location, and others contain more than one.
   * If this field is specified, enough regions must be provided to include a
   * minimum of 3 locations.  Not specifying this field will result in Uptime
   * checks running from all available regions.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.UptimeCheckRegion selected_regions = 10;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of selectedRegions at the given index.
   */
  int getSelectedRegionsValue(int index);

  /**
   *
   *
   * <pre>
   * If this is `true`, then checks are made only from the 'internal_checkers'.
   * If it is `false`, then checks are made only from the 'selected_regions'.
   * It is an error to provide 'selected_regions' when is_internal is `true`,
   * or to provide 'internal_checkers' when is_internal is `false`.
   * </pre>
   *
   * <code>bool is_internal = 15 [deprecated = true];</code>
   *
   * @deprecated google.monitoring.v3.UptimeCheckConfig.is_internal is deprecated. See
   *     google/monitoring/v3/uptime.proto;l=359
   * @return The isInternal.
   */
  @java.lang.Deprecated
  boolean getIsInternal();

  /**
   *
   *
   * <pre>
   * The internal checkers that this check will egress from. If `is_internal` is
   * `true` and this list is empty, the check will egress from all the
   * InternalCheckers configured for the project that owns this
   * `UptimeCheckConfig`.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.InternalChecker internal_checkers = 14 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.monitoring.v3.InternalChecker> getInternalCheckersList();
  /**
   *
   *
   * <pre>
   * The internal checkers that this check will egress from. If `is_internal` is
   * `true` and this list is empty, the check will egress from all the
   * InternalCheckers configured for the project that owns this
   * `UptimeCheckConfig`.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.InternalChecker internal_checkers = 14 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.monitoring.v3.InternalChecker getInternalCheckers(int index);
  /**
   *
   *
   * <pre>
   * The internal checkers that this check will egress from. If `is_internal` is
   * `true` and this list is empty, the check will egress from all the
   * InternalCheckers configured for the project that owns this
   * `UptimeCheckConfig`.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.InternalChecker internal_checkers = 14 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getInternalCheckersCount();
  /**
   *
   *
   * <pre>
   * The internal checkers that this check will egress from. If `is_internal` is
   * `true` and this list is empty, the check will egress from all the
   * InternalCheckers configured for the project that owns this
   * `UptimeCheckConfig`.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.InternalChecker internal_checkers = 14 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<? extends com.google.monitoring.v3.InternalCheckerOrBuilder>
      getInternalCheckersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The internal checkers that this check will egress from. If `is_internal` is
   * `true` and this list is empty, the check will egress from all the
   * InternalCheckers configured for the project that owns this
   * `UptimeCheckConfig`.
   * </pre>
   *
   * <code>
   * repeated .google.monitoring.v3.InternalChecker internal_checkers = 14 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.monitoring.v3.InternalCheckerOrBuilder getInternalCheckersOrBuilder(int index);

  public com.google.monitoring.v3.UptimeCheckConfig.ResourceCase getResourceCase();

  public com.google.monitoring.v3.UptimeCheckConfig.CheckRequestTypeCase getCheckRequestTypeCase();
}