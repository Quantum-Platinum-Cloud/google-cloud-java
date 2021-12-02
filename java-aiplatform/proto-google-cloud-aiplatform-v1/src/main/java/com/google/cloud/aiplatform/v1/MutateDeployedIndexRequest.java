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
// source: google/cloud/aiplatform/v1/index_endpoint_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for [IndexEndpointService.MutateDeployedIndex][google.cloud.aiplatform.v1.IndexEndpointService.MutateDeployedIndex].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.MutateDeployedIndexRequest}
 */
public final class MutateDeployedIndexRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.MutateDeployedIndexRequest)
    MutateDeployedIndexRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MutateDeployedIndexRequest.newBuilder() to construct.
  private MutateDeployedIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MutateDeployedIndexRequest() {
    indexEndpoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MutateDeployedIndexRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MutateDeployedIndexRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              indexEndpoint_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.aiplatform.v1.DeployedIndex.Builder subBuilder = null;
              if (deployedIndex_ != null) {
                subBuilder = deployedIndex_.toBuilder();
              }
              deployedIndex_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.DeployedIndex.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deployedIndex_);
                deployedIndex_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.class,
            com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.Builder.class);
  }

  public static final int INDEX_ENDPOINT_FIELD_NUMBER = 1;
  private volatile java.lang.Object indexEndpoint_;
  /**
   *
   *
   * <pre>
   * Required. The name of the IndexEndpoint resource into which to deploy an Index.
   * Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The indexEndpoint.
   */
  @java.lang.Override
  public java.lang.String getIndexEndpoint() {
    java.lang.Object ref = indexEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      indexEndpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the IndexEndpoint resource into which to deploy an Index.
   * Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for indexEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIndexEndpointBytes() {
    java.lang.Object ref = indexEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      indexEndpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYED_INDEX_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.DeployedIndex deployedIndex_;
  /**
   *
   *
   * <pre>
   * Required. The DeployedIndex to be updated within the IndexEndpoint.
   * Currently, the updatable fields are [DeployedIndex][automatic_resources]
   * and [DeployedIndex][dedicated_resources]
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployedIndex field is set.
   */
  @java.lang.Override
  public boolean hasDeployedIndex() {
    return deployedIndex_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The DeployedIndex to be updated within the IndexEndpoint.
   * Currently, the updatable fields are [DeployedIndex][automatic_resources]
   * and [DeployedIndex][dedicated_resources]
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployedIndex.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex() {
    return deployedIndex_ == null
        ? com.google.cloud.aiplatform.v1.DeployedIndex.getDefaultInstance()
        : deployedIndex_;
  }
  /**
   *
   *
   * <pre>
   * Required. The DeployedIndex to be updated within the IndexEndpoint.
   * Currently, the updatable fields are [DeployedIndex][automatic_resources]
   * and [DeployedIndex][dedicated_resources]
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder() {
    return getDeployedIndex();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexEndpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, indexEndpoint_);
    }
    if (deployedIndex_ != null) {
      output.writeMessage(2, getDeployedIndex());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexEndpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, indexEndpoint_);
    }
    if (deployedIndex_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDeployedIndex());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest other =
        (com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest) obj;

    if (!getIndexEndpoint().equals(other.getIndexEndpoint())) return false;
    if (hasDeployedIndex() != other.hasDeployedIndex()) return false;
    if (hasDeployedIndex()) {
      if (!getDeployedIndex().equals(other.getDeployedIndex())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INDEX_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getIndexEndpoint().hashCode();
    if (hasDeployedIndex()) {
      hash = (37 * hash) + DEPLOYED_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDeployedIndex().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for [IndexEndpointService.MutateDeployedIndex][google.cloud.aiplatform.v1.IndexEndpointService.MutateDeployedIndex].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.MutateDeployedIndexRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.MutateDeployedIndexRequest)
      com.google.cloud.aiplatform.v1.MutateDeployedIndexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.class,
              com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      indexEndpoint_ = "";

      if (deployedIndexBuilder_ == null) {
        deployedIndex_ = null;
      } else {
        deployedIndex_ = null;
        deployedIndexBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1_MutateDeployedIndexRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest build() {
      com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest buildPartial() {
      com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest result =
          new com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest(this);
      result.indexEndpoint_ = indexEndpoint_;
      if (deployedIndexBuilder_ == null) {
        result.deployedIndex_ = deployedIndex_;
      } else {
        result.deployedIndex_ = deployedIndexBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest other) {
      if (other == com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest.getDefaultInstance())
        return this;
      if (!other.getIndexEndpoint().isEmpty()) {
        indexEndpoint_ = other.indexEndpoint_;
        onChanged();
      }
      if (other.hasDeployedIndex()) {
        mergeDeployedIndex(other.getDeployedIndex());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object indexEndpoint_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource into which to deploy an Index.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The indexEndpoint.
     */
    public java.lang.String getIndexEndpoint() {
      java.lang.Object ref = indexEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        indexEndpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource into which to deploy an Index.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for indexEndpoint.
     */
    public com.google.protobuf.ByteString getIndexEndpointBytes() {
      java.lang.Object ref = indexEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        indexEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource into which to deploy an Index.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The indexEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setIndexEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      indexEndpoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource into which to deploy an Index.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndexEndpoint() {

      indexEndpoint_ = getDefaultInstance().getIndexEndpoint();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource into which to deploy an Index.
     * Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for indexEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setIndexEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      indexEndpoint_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.DeployedIndex deployedIndex_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DeployedIndex,
            com.google.cloud.aiplatform.v1.DeployedIndex.Builder,
            com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder>
        deployedIndexBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the deployedIndex field is set.
     */
    public boolean hasDeployedIndex() {
      return deployedIndexBuilder_ != null || deployedIndex_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The deployedIndex.
     */
    public com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex() {
      if (deployedIndexBuilder_ == null) {
        return deployedIndex_ == null
            ? com.google.cloud.aiplatform.v1.DeployedIndex.getDefaultInstance()
            : deployedIndex_;
      } else {
        return deployedIndexBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDeployedIndex(com.google.cloud.aiplatform.v1.DeployedIndex value) {
      if (deployedIndexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployedIndex_ = value;
        onChanged();
      } else {
        deployedIndexBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDeployedIndex(
        com.google.cloud.aiplatform.v1.DeployedIndex.Builder builderForValue) {
      if (deployedIndexBuilder_ == null) {
        deployedIndex_ = builderForValue.build();
        onChanged();
      } else {
        deployedIndexBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDeployedIndex(com.google.cloud.aiplatform.v1.DeployedIndex value) {
      if (deployedIndexBuilder_ == null) {
        if (deployedIndex_ != null) {
          deployedIndex_ =
              com.google.cloud.aiplatform.v1.DeployedIndex.newBuilder(deployedIndex_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          deployedIndex_ = value;
        }
        onChanged();
      } else {
        deployedIndexBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDeployedIndex() {
      if (deployedIndexBuilder_ == null) {
        deployedIndex_ = null;
        onChanged();
      } else {
        deployedIndex_ = null;
        deployedIndexBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.DeployedIndex.Builder getDeployedIndexBuilder() {

      onChanged();
      return getDeployedIndexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder() {
      if (deployedIndexBuilder_ != null) {
        return deployedIndexBuilder_.getMessageOrBuilder();
      } else {
        return deployedIndex_ == null
            ? com.google.cloud.aiplatform.v1.DeployedIndex.getDefaultInstance()
            : deployedIndex_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The DeployedIndex to be updated within the IndexEndpoint.
     * Currently, the updatable fields are [DeployedIndex][automatic_resources]
     * and [DeployedIndex][dedicated_resources]
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.DeployedIndex,
            com.google.cloud.aiplatform.v1.DeployedIndex.Builder,
            com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder>
        getDeployedIndexFieldBuilder() {
      if (deployedIndexBuilder_ == null) {
        deployedIndexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.DeployedIndex,
                com.google.cloud.aiplatform.v1.DeployedIndex.Builder,
                com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder>(
                getDeployedIndex(), getParentForChildren(), isClean());
        deployedIndex_ = null;
      }
      return deployedIndexBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.MutateDeployedIndexRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.MutateDeployedIndexRequest)
  private static final com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest();
  }

  public static com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateDeployedIndexRequest> PARSER =
      new com.google.protobuf.AbstractParser<MutateDeployedIndexRequest>() {
        @java.lang.Override
        public MutateDeployedIndexRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MutateDeployedIndexRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MutateDeployedIndexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateDeployedIndexRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.MutateDeployedIndexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
