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
// source: google/devtools/source/v1/source_context.proto

package com.google.devtools.source.v1;

public interface ExtendedSourceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.source.v1.ExtendedSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Any source context.
   * </pre>
   *
   * <code>.google.devtools.source.v1.SourceContext context = 1;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Any source context.
   * </pre>
   *
   * <code>.google.devtools.source.v1.SourceContext context = 1;</code>
   *
   * @return The context.
   */
  com.google.devtools.source.v1.SourceContext getContext();
  /**
   *
   *
   * <pre>
   * Any source context.
   * </pre>
   *
   * <code>.google.devtools.source.v1.SourceContext context = 1;</code>
   */
  com.google.devtools.source.v1.SourceContextOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels with user defined metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}