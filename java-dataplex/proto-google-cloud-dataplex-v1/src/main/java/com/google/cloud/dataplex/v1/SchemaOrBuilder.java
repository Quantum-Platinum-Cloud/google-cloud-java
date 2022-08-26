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
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

public interface SchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Set to `true` if user-managed or `false` if managed by Dataplex. The
   * default is `false` (managed by Dataplex).
   * - Set to `false`to enable Dataplex discovery to update the schema.
   *   including new data discovery, schema inference, and schema evolution.
   *   Users retain the ability to input and edit the schema. Dataplex
   *   treats schema input by the user as though produced
   *   by a previous Dataplex discovery operation, and it will
   *   evolve the schema and take action based on that treatment.
   * - Set to `true` to fully manage the entity
   *   schema. This setting guarantees that Dataplex will not
   *   change schema fields.
   * </pre>
   *
   * <code>bool user_managed = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The userManaged.
   */
  boolean getUserManaged();

  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing data in table entities.
   * **Note:** BigQuery SchemaFields are immutable.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.SchemaField fields = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataplex.v1.Schema.SchemaField> getFieldsList();
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing data in table entities.
   * **Note:** BigQuery SchemaFields are immutable.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.SchemaField fields = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.Schema.SchemaField getFields(int index);
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing data in table entities.
   * **Note:** BigQuery SchemaFields are immutable.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.SchemaField fields = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFieldsCount();
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing data in table entities.
   * **Note:** BigQuery SchemaFields are immutable.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.SchemaField fields = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.Schema.SchemaFieldOrBuilder>
      getFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing data in table entities.
   * **Note:** BigQuery SchemaFields are immutable.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.SchemaField fields = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.Schema.SchemaFieldOrBuilder getFieldsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing the partition structure in entities.
   * If this field is empty, there are no partitions within the data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.PartitionField partition_fields = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataplex.v1.Schema.PartitionField> getPartitionFieldsList();
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing the partition structure in entities.
   * If this field is empty, there are no partitions within the data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.PartitionField partition_fields = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.Schema.PartitionField getPartitionFields(int index);
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing the partition structure in entities.
   * If this field is empty, there are no partitions within the data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.PartitionField partition_fields = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPartitionFieldsCount();
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing the partition structure in entities.
   * If this field is empty, there are no partitions within the data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.PartitionField partition_fields = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.Schema.PartitionFieldOrBuilder>
      getPartitionFieldsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The sequence of fields describing the partition structure in entities.
   * If this field is empty, there are no partitions within the data.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataplex.v1.Schema.PartitionField partition_fields = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.Schema.PartitionFieldOrBuilder getPartitionFieldsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The structure of paths containing partition data within the entity.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Schema.PartitionStyle partition_style = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for partitionStyle.
   */
  int getPartitionStyleValue();
  /**
   *
   *
   * <pre>
   * Optional. The structure of paths containing partition data within the entity.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Schema.PartitionStyle partition_style = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The partitionStyle.
   */
  com.google.cloud.dataplex.v1.Schema.PartitionStyle getPartitionStyle();
}