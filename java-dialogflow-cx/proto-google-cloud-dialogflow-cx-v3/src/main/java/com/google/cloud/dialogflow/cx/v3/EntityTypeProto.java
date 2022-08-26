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
// source: google/cloud/dialogflow/cx/v3/entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public final class EntityTypeProto {
  private EntityTypeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/dialogflow/cx/v3/entity_t"
          + "ype.proto\022\035google.cloud.dialogflow.cx.v3"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032\033goo"
          + "gle/protobuf/empty.proto\032 google/protobu"
          + "f/field_mask.proto\"\232\006\n\nEntityType\022\014\n\004nam"
          + "e\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022A\n\004ki"
          + "nd\030\003 \001(\0162..google.cloud.dialogflow.cx.v3"
          + ".EntityType.KindB\003\340A\002\022X\n\023auto_expansion_"
          + "mode\030\004 \001(\0162;.google.cloud.dialogflow.cx."
          + "v3.EntityType.AutoExpansionMode\022B\n\010entit"
          + "ies\030\005 \003(\01320.google.cloud.dialogflow.cx.v"
          + "3.EntityType.Entity\022R\n\020excluded_phrases\030"
          + "\006 \003(\01328.google.cloud.dialogflow.cx.v3.En"
          + "tityType.ExcludedPhrase\022\037\n\027enable_fuzzy_"
          + "extraction\030\007 \001(\010\022\016\n\006redact\030\t \001(\010\0323\n\006Enti"
          + "ty\022\022\n\005value\030\001 \001(\tB\003\340A\002\022\025\n\010synonyms\030\002 \003(\t"
          + "B\003\340A\002\032$\n\016ExcludedPhrase\022\022\n\005value\030\001 \001(\tB\003"
          + "\340A\002\"J\n\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\014\n\010KIN"
          + "D_MAP\020\001\022\r\n\tKIND_LIST\020\002\022\017\n\013KIND_REGEXP\020\003\""
          + "Y\n\021AutoExpansionMode\022#\n\037AUTO_EXPANSION_M"
          + "ODE_UNSPECIFIED\020\000\022\037\n\033AUTO_EXPANSION_MODE"
          + "_DEFAULT\020\001:{\352Ax\n$dialogflow.googleapis.c"
          + "om/EntityType\022Pprojects/{project}/locati"
          + "ons/{location}/agents/{agent}/entityType"
          + "s/{entity_type}\"\224\001\n\026ListEntityTypesReque"
          + "st\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$dialogflow.g"
          + "oogleapis.com/EntityType\022\025\n\rlanguage_cod"
          + "e\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token"
          + "\030\004 \001(\t\"s\n\027ListEntityTypesResponse\022?\n\014ent"
          + "ity_types\030\001 \003(\0132).google.cloud.dialogflo"
          + "w.cx.v3.EntityType\022\027\n\017next_page_token\030\002 "
          + "\001(\t\"i\n\024GetEntityTypeRequest\022:\n\004name\030\001 \001("
          + "\tB,\340A\002\372A&\n$dialogflow.googleapis.com/Ent"
          + "ityType\022\025\n\rlanguage_code\030\002 \001(\t\"\263\001\n\027Creat"
          + "eEntityTypeRequest\022<\n\006parent\030\001 \001(\tB,\340A\002\372"
          + "A&\022$dialogflow.googleapis.com/EntityType"
          + "\022C\n\013entity_type\030\002 \001(\0132).google.cloud.dia"
          + "logflow.cx.v3.EntityTypeB\003\340A\002\022\025\n\rlanguag"
          + "e_code\030\003 \001(\t\"\246\001\n\027UpdateEntityTypeRequest"
          + "\022C\n\013entity_type\030\001 \001(\0132).google.cloud.dia"
          + "logflow.cx.v3.EntityTypeB\003\340A\002\022\025\n\rlanguag"
          + "e_code\030\002 \001(\t\022/\n\013update_mask\030\003 \001(\0132\032.goog"
          + "le.protobuf.FieldMask\"d\n\027DeleteEntityTyp"
          + "eRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$dialogfl"
          + "ow.googleapis.com/EntityType\022\r\n\005force\030\002 "
          + "\001(\0102\207\t\n\013EntityTypes\022\313\001\n\017ListEntityTypes\022"
          + "5.google.cloud.dialogflow.cx.v3.ListEnti"
          + "tyTypesRequest\0326.google.cloud.dialogflow"
          + ".cx.v3.ListEntityTypesResponse\"I\202\323\344\223\002:\0228"
          + "/v3/{parent=projects/*/locations/*/agent"
          + "s/*}/entityTypes\332A\006parent\022\270\001\n\rGetEntityT"
          + "ype\0223.google.cloud.dialogflow.cx.v3.GetE"
          + "ntityTypeRequest\032).google.cloud.dialogfl"
          + "ow.cx.v3.EntityType\"G\202\323\344\223\002:\0228/v3/{name=p"
          + "rojects/*/locations/*/agents/*/entityTyp"
          + "es/*}\332A\004name\022\331\001\n\020CreateEntityType\0226.goog"
          + "le.cloud.dialogflow.cx.v3.CreateEntityTy"
          + "peRequest\032).google.cloud.dialogflow.cx.v"
          + "3.EntityType\"b\202\323\344\223\002G\"8/v3/{parent=projec"
          + "ts/*/locations/*/agents/*}/entityTypes:\013"
          + "entity_type\332A\022parent,entity_type\022\352\001\n\020Upd"
          + "ateEntityType\0226.google.cloud.dialogflow."
          + "cx.v3.UpdateEntityTypeRequest\032).google.c"
          + "loud.dialogflow.cx.v3.EntityType\"s\202\323\344\223\002S"
          + "2D/v3/{entity_type.name=projects/*/locat"
          + "ions/*/agents/*/entityTypes/*}:\013entity_t"
          + "ype\332A\027entity_type,update_mask\022\253\001\n\020Delete"
          + "EntityType\0226.google.cloud.dialogflow.cx."
          + "v3.DeleteEntityTypeRequest\032\026.google.prot"
          + "obuf.Empty\"G\202\323\344\223\002:*8/v3/{name=projects/*"
          + "/locations/*/agents/*/entityTypes/*}\332A\004n"
          + "ame\032x\312A\031dialogflow.googleapis.com\322AYhttp"
          + "s://www.googleapis.com/auth/cloud-platfo"
          + "rm,https://www.googleapis.com/auth/dialo"
          + "gflowB\303\001\n!com.google.cloud.dialogflow.cx"
          + ".v3B\017EntityTypeProtoP\001Z?google.golang.or"
          + "g/genproto/googleapis/cloud/dialogflow/c"
          + "x/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflo"
          + "w.Cx.V3\352\002!Google::Cloud::Dialogflow::CX:"
          + ":V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Kind",
              "AutoExpansionMode",
              "Entities",
              "ExcludedPhrases",
              "EnableFuzzyExtraction",
              "Redact",
            });
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EntityType_Entity_descriptor,
            new java.lang.String[] {
              "Value", "Synonyms",
            });
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_EntityType_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_EntityType_ExcludedPhrase_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListEntityTypesResponse_descriptor,
            new java.lang.String[] {
              "EntityTypes", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntityType", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "EntityType", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteEntityTypeRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}