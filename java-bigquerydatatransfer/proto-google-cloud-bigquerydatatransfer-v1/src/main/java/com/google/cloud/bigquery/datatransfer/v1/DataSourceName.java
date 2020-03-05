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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.api.core.BetaApi;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.pathtemplate.ValidationException;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** AUTO-GENERATED DOCUMENTATION AND CLASS */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class DataSourceName implements ResourceName {

  @Deprecated
  protected DataSourceName() {}

  private static final PathTemplate PROJECT_DATA_SOURCE_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/dataSources/{data_source}");
  private static final PathTemplate PROJECT_LOCATION_DATA_SOURCE_PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/dataSources/{data_source}");

  private volatile Map<String, String> fieldValuesMap;
  private PathTemplate pathTemplate;
  private String fixedValue;

  private String project;
  private String dataSource;
  private String location;

  public String getProject() {
    return project;
  }

  public String getDataSource() {
    return dataSource;
  }

  public String getLocation() {
    return location;
  }

  private DataSourceName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    dataSource = Preconditions.checkNotNull(builder.getDataSource());
    pathTemplate = PROJECT_DATA_SOURCE_PATH_TEMPLATE;
  }

  private DataSourceName(ProjectLocationDataSourceBuilder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    dataSource = Preconditions.checkNotNull(builder.getDataSource());
    pathTemplate = PROJECT_LOCATION_DATA_SOURCE_PATH_TEMPLATE;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static Builder newProjectDataSourceBuilder() {
    return new Builder();
  }

  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static ProjectLocationDataSourceBuilder newProjectLocationDataSourceBuilder() {
    return new ProjectLocationDataSourceBuilder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DataSourceName of(String project, String dataSource) {
    return newProjectDataSourceBuilder().setProject(project).setDataSource(dataSource).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static DataSourceName ofProjectDataSourceName(String project, String dataSource) {
    return newProjectDataSourceBuilder().setProject(project).setDataSource(dataSource).build();
  }

  @BetaApi("The static create methods are not stable yet and may be changed in the future.")
  public static DataSourceName ofProjectLocationDataSourceName(
      String project, String location, String dataSource) {
    return newProjectLocationDataSourceBuilder()
        .setProject(project)
        .setLocation(location)
        .setDataSource(dataSource)
        .build();
  }

  public static String format(String project, String dataSource) {
    return newBuilder().setProject(project).setDataSource(dataSource).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectDataSourceName(String project, String dataSource) {
    return newBuilder().setProject(project).setDataSource(dataSource).build().toString();
  }

  @BetaApi("The static format methods are not stable yet and may be changed in the future.")
  public static String formatProjectLocationDataSourceName(
      String project, String location, String dataSource) {
    return newProjectLocationDataSourceBuilder()
        .setProject(project)
        .setLocation(location)
        .setDataSource(dataSource)
        .build()
        .toString();
  }

  public static DataSourceName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    if (PROJECT_DATA_SOURCE_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap = PROJECT_DATA_SOURCE_PATH_TEMPLATE.match(formattedString);
      return ofProjectDataSourceName(matchMap.get("project"), matchMap.get("data_source"));
    } else if (PROJECT_LOCATION_DATA_SOURCE_PATH_TEMPLATE.matches(formattedString)) {
      Map<String, String> matchMap =
          PROJECT_LOCATION_DATA_SOURCE_PATH_TEMPLATE.match(formattedString);
      return ofProjectLocationDataSourceName(
          matchMap.get("project"), matchMap.get("location"), matchMap.get("data_source"));
    }
    throw new ValidationException("JobName.parse: formattedString not in valid format");
  }

  @BetaApi("The method will be renamed to parseList after subclasses of this class are removed.")
  public static List<DataSourceName> parse(List<String> formattedStrings) {
    List<DataSourceName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  @BetaApi("The method will be renamed to toStringList after subclasses of this class are removed.")
  public static List<String> toStrings(List<DataSourceName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DataSourceName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_DATA_SOURCE_PATH_TEMPLATE.matches(formattedString)
        || PROJECT_LOCATION_DATA_SOURCE_PATH_TEMPLATE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (dataSource != null) {
            fieldMapBuilder.put("data_source", dataSource);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return fixedValue != null ? fixedValue : pathTemplate.instantiate(getFieldValuesMap());
  }

  /** Builder for projects/{project}/dataSources/{data_source}. */
  public static class Builder {

    private String project;
    private String dataSource;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getDataSource() {
      return dataSource;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setDataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    private Builder(DataSourceName dataSourceName) {
      Preconditions.checkArgument(
          dataSourceName.pathTemplate == PROJECT_DATA_SOURCE_PATH_TEMPLATE,
          "toBuilder is only supported when DataSourceName has the pattern of "
              + "projects/{project}/dataSources/{data_source}.");
      project = dataSourceName.project;
      dataSource = dataSourceName.dataSource;
    }

    public DataSourceName build() {
      return new DataSourceName(this);
    }
  }

  /** Builder for projects/{project}/locations/{location}/dataSources/{data_source}. */
  @BetaApi("The per-pattern Builders are not stable yet and may be changed in the future.")
  public static class ProjectLocationDataSourceBuilder {

    private String project;
    private String location;
    private String dataSource;

    private ProjectLocationDataSourceBuilder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getDataSource() {
      return dataSource;
    }

    public ProjectLocationDataSourceBuilder setProject(String project) {
      this.project = project;
      return this;
    }

    public ProjectLocationDataSourceBuilder setLocation(String location) {
      this.location = location;
      return this;
    }

    public ProjectLocationDataSourceBuilder setDataSource(String dataSource) {
      this.dataSource = dataSource;
      return this;
    }

    public DataSourceName build() {
      return new DataSourceName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      DataSourceName that = (DataSourceName) o;
      return (Objects.equals(this.project, that.project))
          && (Objects.equals(this.dataSource, that.dataSource))
          && (Objects.equals(this.location, that.location));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(fixedValue);
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(dataSource);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    return h;
  }
}
