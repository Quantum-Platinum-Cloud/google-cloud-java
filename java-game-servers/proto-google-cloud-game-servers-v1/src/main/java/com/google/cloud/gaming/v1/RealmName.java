/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gaming.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class RealmName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_REALM =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/realms/{realm}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String realm;

  @Deprecated
  protected RealmName() {
    project = null;
    location = null;
    realm = null;
  }

  private RealmName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    realm = Preconditions.checkNotNull(builder.getRealm());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getRealm() {
    return realm;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static RealmName of(String project, String location, String realm) {
    return newBuilder().setProject(project).setLocation(location).setRealm(realm).build();
  }

  public static String format(String project, String location, String realm) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setRealm(realm)
        .build()
        .toString();
  }

  public static RealmName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_REALM.validatedMatch(
            formattedString, "RealmName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("location"), matchMap.get("realm"));
  }

  public static List<RealmName> parseList(List<String> formattedStrings) {
    List<RealmName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RealmName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (RealmName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_REALM.matches(formattedString);
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
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (realm != null) {
            fieldMapBuilder.put("realm", realm);
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
    return PROJECT_LOCATION_REALM.instantiate(
        "project", project, "location", location, "realm", realm);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      RealmName that = ((RealmName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.realm, that.realm);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(realm);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/realms/{realm}. */
  public static class Builder {
    private String project;
    private String location;
    private String realm;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getRealm() {
      return realm;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setRealm(String realm) {
      this.realm = realm;
      return this;
    }

    private Builder(RealmName realmName) {
      this.project = realmName.project;
      this.location = realmName.location;
      this.realm = realmName.realm;
    }

    public RealmName build() {
      return new RealmName(this);
    }
  }
}