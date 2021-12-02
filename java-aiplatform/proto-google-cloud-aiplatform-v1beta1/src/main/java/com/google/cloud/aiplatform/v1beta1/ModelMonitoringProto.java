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
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelMonitoringProto {
  private ModelMonitoringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/model_"
          + "monitoring.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\031google/api/resource.proto\032(go"
          + "ogle/cloud/aiplatform/v1beta1/io.proto\032\034"
          + "google/api/annotations.proto\"\205\025\n\036ModelMo"
          + "nitoringObjectiveConfig\022i\n\020training_data"
          + "set\030\001 \001(\0132O.google.cloud.aiplatform.v1be"
          + "ta1.ModelMonitoringObjectiveConfig.Train"
          + "ingDataset\022\230\001\n)training_prediction_skew_"
          + "detection_config\030\002 \001(\0132e.google.cloud.ai"
          + "platform.v1beta1.ModelMonitoringObjectiv"
          + "eConfig.TrainingPredictionSkewDetectionC"
          + "onfig\022\211\001\n!prediction_drift_detection_con"
          + "fig\030\003 \001(\0132^.google.cloud.aiplatform.v1be"
          + "ta1.ModelMonitoringObjectiveConfig.Predi"
          + "ctionDriftDetectionConfig\022m\n\022explanation"
          + "_config\030\005 \001(\0132Q.google.cloud.aiplatform."
          + "v1beta1.ModelMonitoringObjectiveConfig.E"
          + "xplanationConfig\032\352\002\n\017TrainingDataset\0229\n\007"
          + "dataset\030\003 \001(\tB&\372A#\n!aiplatform.googleapi"
          + "s.com/DatasetH\000\022@\n\ngcs_source\030\004 \001(\0132*.go"
          + "ogle.cloud.aiplatform.v1beta1.GcsSourceH"
          + "\000\022J\n\017bigquery_source\030\005 \001(\0132/.google.clou"
          + "d.aiplatform.v1beta1.BigQuerySourceH\000\022\023\n"
          + "\013data_format\030\002 \001(\t\022\024\n\014target_field\030\006 \001(\t"
          + "\022T\n\031logging_sampling_strategy\030\007 \001(\01321.go"
          + "ogle.cloud.aiplatform.v1beta1.SamplingSt"
          + "rategyB\r\n\013data_source\032\326\004\n%TrainingPredic"
          + "tionSkewDetectionConfig\022\222\001\n\017skew_thresho"
          + "lds\030\001 \003(\0132y.google.cloud.aiplatform.v1be"
          + "ta1.ModelMonitoringObjectiveConfig.Train"
          + "ingPredictionSkewDetectionConfig.SkewThr"
          + "esholdsEntry\022\265\001\n!attribution_score_skew_"
          + "thresholds\030\002 \003(\0132\211\001.google.cloud.aiplatf"
          + "orm.v1beta1.ModelMonitoringObjectiveConf"
          + "ig.TrainingPredictionSkewDetectionConfig"
          + ".AttributionScoreSkewThresholdsEntry\032g\n\023"
          + "SkewThresholdsEntry\022\013\n\003key\030\001 \001(\t\022?\n\005valu"
          + "e\030\002 \001(\01320.google.cloud.aiplatform.v1beta"
          + "1.ThresholdConfig:\0028\001\032w\n#AttributionScor"
          + "eSkewThresholdsEntry\022\013\n\003key\030\001 \001(\t\022?\n\005val"
          + "ue\030\002 \001(\01320.google.cloud.aiplatform.v1bet"
          + "a1.ThresholdConfig:\0028\001\032\307\004\n\036PredictionDri"
          + "ftDetectionConfig\022\215\001\n\020drift_thresholds\030\001"
          + " \003(\0132s.google.cloud.aiplatform.v1beta1.M"
          + "odelMonitoringObjectiveConfig.Prediction"
          + "DriftDetectionConfig.DriftThresholdsEntr"
          + "y\022\260\001\n\"attribution_score_drift_thresholds"
          + "\030\002 \003(\0132\203\001.google.cloud.aiplatform.v1beta"
          + "1.ModelMonitoringObjectiveConfig.Predict"
          + "ionDriftDetectionConfig.AttributionScore"
          + "DriftThresholdsEntry\032h\n\024DriftThresholdsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320.googl"
          + "e.cloud.aiplatform.v1beta1.ThresholdConf"
          + "ig:\0028\001\032x\n$AttributionScoreDriftThreshold"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022?\n\005value\030\002 \001(\01320.goo"
          + "gle.cloud.aiplatform.v1beta1.ThresholdCo"
          + "nfig:\0028\001\032\321\004\n\021ExplanationConfig\022!\n\031enable"
          + "_feature_attributes\030\001 \001(\010\022\203\001\n\024explanatio"
          + "n_baseline\030\002 \001(\0132e.google.cloud.aiplatfo"
          + "rm.v1beta1.ModelMonitoringObjectiveConfi"
          + "g.ExplanationConfig.ExplanationBaseline\032"
          + "\222\003\n\023ExplanationBaseline\022>\n\003gcs\030\002 \001(\0132/.g"
          + "oogle.cloud.aiplatform.v1beta1.GcsDestin"
          + "ationH\000\022H\n\010bigquery\030\003 \001(\01324.google.cloud"
          + ".aiplatform.v1beta1.BigQueryDestinationH"
          + "\000\022\221\001\n\021prediction_format\030\001 \001(\0162v.google.c"
          + "loud.aiplatform.v1beta1.ModelMonitoringO"
          + "bjectiveConfig.ExplanationConfig.Explana"
          + "tionBaseline.PredictionFormat\"N\n\020Predict"
          + "ionFormat\022!\n\035PREDICTION_FORMAT_UNSPECIFI"
          + "ED\020\000\022\t\n\005JSONL\020\002\022\014\n\010BIGQUERY\020\003B\r\n\013destina"
          + "tion\"\322\001\n\032ModelMonitoringAlertConfig\022j\n\022e"
          + "mail_alert_config\030\001 \001(\0132L.google.cloud.a"
          + "iplatform.v1beta1.ModelMonitoringAlertCo"
          + "nfig.EmailAlertConfigH\000\022\026\n\016enable_loggin"
          + "g\030\002 \001(\010\032\'\n\020EmailAlertConfig\022\023\n\013user_emai"
          + "ls\030\001 \003(\tB\007\n\005alert\"/\n\017ThresholdConfig\022\017\n\005"
          + "value\030\001 \001(\001H\000B\013\n\tthreshold\"\241\001\n\020SamplingS"
          + "trategy\022b\n\024random_sample_config\030\001 \001(\0132D."
          + "google.cloud.aiplatform.v1beta1.Sampling"
          + "Strategy.RandomSampleConfig\032)\n\022RandomSam"
          + "pleConfig\022\023\n\013sample_rate\030\001 \001(\001B\361\001\n#com.g"
          + "oogle.cloud.aiplatform.v1beta1B\024ModelMon"
          + "itoringProtoP\001ZIgoogle.golang.org/genpro"
          + "to/googleapis/cloud/aiplatform/v1beta1;a"
          + "iplatform\252\002\037Google.Cloud.AIPlatform.V1Be"
          + "ta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\""
          + "Google::Cloud::AIPlatform::V1beta1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor,
            new java.lang.String[] {
              "TrainingDataset",
              "TrainingPredictionSkewDetectionConfig",
              "PredictionDriftDetectionConfig",
              "ExplanationConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingDataset_descriptor,
            new java.lang.String[] {
              "Dataset",
              "GcsSource",
              "BigquerySource",
              "DataFormat",
              "TargetField",
              "LoggingSamplingStrategy",
              "DataSource",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor,
            new java.lang.String[] {
              "SkewThresholds", "AttributionScoreSkewThresholds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_SkewThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_TrainingPredictionSkewDetectionConfig_AttributionScoreSkewThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor,
            new java.lang.String[] {
              "DriftThresholds", "AttributionScoreDriftThresholds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_DriftThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_PredictionDriftDetectionConfig_AttributionScoreDriftThresholdsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor,
            new java.lang.String[] {
              "EnableFeatureAttributes", "ExplanationBaseline",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringObjectiveConfig_ExplanationConfig_ExplanationBaseline_descriptor,
            new java.lang.String[] {
              "Gcs", "Bigquery", "PredictionFormat", "Destination",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor,
            new java.lang.String[] {
              "EmailAlertConfig", "EnableLogging", "Alert",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringAlertConfig_EmailAlertConfig_descriptor,
            new java.lang.String[] {
              "UserEmails",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ThresholdConfig_descriptor,
            new java.lang.String[] {
              "Value", "Threshold",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor,
            new java.lang.String[] {
              "RandomSampleConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SamplingStrategy_RandomSampleConfig_descriptor,
            new java.lang.String[] {
              "SampleRate",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
