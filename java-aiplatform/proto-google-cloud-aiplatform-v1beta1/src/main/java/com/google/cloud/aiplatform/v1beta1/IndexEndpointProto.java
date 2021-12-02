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
// source: google/cloud/aiplatform/v1beta1/index_endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public final class IndexEndpointProto {
  private IndexEndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1beta1/index_"
          + "endpoint.proto\022\037google.cloud.aiplatform."
          + "v1beta1\032+google/cloud/aiplatform/v1beta1"
          + "/index.proto\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\0327google"
          + "/cloud/aiplatform/v1beta1/machine_resour"
          + "ces.proto\032\037google/protobuf/timestamp.pro"
          + "to\032\034google/api/annotations.proto\"\320\004\n\rInd"
          + "exEndpoint\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display"
          + "_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022M\n"
          + "\020deployed_indexes\030\004 \003(\0132..google.cloud.a"
          + "iplatform.v1beta1.DeployedIndexB\003\340A\003\022\014\n\004"
          + "etag\030\005 \001(\t\022J\n\006labels\030\006 \003(\0132:.google.clou"
          + "d.aiplatform.v1beta1.IndexEndpoint.Label"
          + "sEntry\0224\n\013create_time\030\007 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\010 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022\024\n\007ne"
          + "twork\030\t \001(\tB\003\340A\001\022+\n\036enable_private_servi"
          + "ce_connect\030\n \001(\010B\003\340A\001\032-\n\013LabelsEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:u\352Ar\n\'aipla"
          + "tform.googleapis.com/IndexEndpoint\022Gproj"
          + "ects/{project}/locations/{location}/inde"
          + "xEndpoints/{index_endpoint}\"\324\004\n\rDeployed"
          + "Index\022\017\n\002id\030\001 \001(\tB\003\340A\002\0226\n\005index\030\002 \001(\tB\'\340"
          + "A\002\372A!\n\037aiplatform.googleapis.com/Index\022\024"
          + "\n\014display_name\030\003 \001(\t\0224\n\013create_time\030\004 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022V\n\021pr"
          + "ivate_endpoints\030\005 \001(\01326.google.cloud.aip"
          + "latform.v1beta1.IndexPrivateEndpointsB\003\340"
          + "A\003\0228\n\017index_sync_time\030\006 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\022U\n\023automatic_resour"
          + "ces\030\007 \001(\01323.google.cloud.aiplatform.v1be"
          + "ta1.AutomaticResourcesB\003\340A\001\022\"\n\025enable_ac"
          + "cess_logging\030\010 \001(\010B\003\340A\001\022a\n\032deployed_inde"
          + "x_auth_config\030\t \001(\01328.google.cloud.aipla"
          + "tform.v1beta1.DeployedIndexAuthConfigB\003\340"
          + "A\001\022\037\n\022reserved_ip_ranges\030\n \003(\tB\003\340A\001\022\035\n\020d"
          + "eployment_group\030\013 \001(\tB\003\340A\001\"\263\001\n\027DeployedI"
          + "ndexAuthConfig\022\\\n\rauth_provider\030\001 \001(\0132E."
          + "google.cloud.aiplatform.v1beta1.Deployed"
          + "IndexAuthConfig.AuthProvider\032:\n\014AuthProv"
          + "ider\022\021\n\taudiences\030\001 \003(\t\022\027\n\017allowed_issue"
          + "rs\030\002 \003(\t\"Y\n\025IndexPrivateEndpoints\022\037\n\022mat"
          + "ch_grpc_address\030\001 \001(\tB\003\340A\003\022\037\n\022service_at"
          + "tachment\030\002 \001(\tB\003\340A\003B\357\001\n#com.google.cloud"
          + ".aiplatform.v1beta1B\022IndexEndpointProtoP"
          + "\001ZIgoogle.golang.org/genproto/googleapis"
          + "/cloud/aiplatform/v1beta1;aiplatform\252\002\037G"
          + "oogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\"
          + "Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud"
          + "::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.aiplatform.v1beta1.IndexProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "Network",
              "EnablePrivateServiceConnect",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor,
            new java.lang.String[] {
              "Id",
              "Index",
              "DisplayName",
              "CreateTime",
              "PrivateEndpoints",
              "IndexSyncTime",
              "AutomaticResources",
              "EnableAccessLogging",
              "DeployedIndexAuthConfig",
              "ReservedIpRanges",
              "DeploymentGroup",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor,
            new java.lang.String[] {
              "AuthProvider",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor,
            new java.lang.String[] {
              "Audiences", "AllowedIssuers",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor,
            new java.lang.String[] {
              "MatchGrpcAddress", "ServiceAttachment",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.cloud.aiplatform.v1beta1.IndexProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
