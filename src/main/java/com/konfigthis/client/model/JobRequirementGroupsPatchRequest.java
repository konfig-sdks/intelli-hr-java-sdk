/*
 * intelliHR Public API
 * You can find developer's guide and more documentation on [https://developers.intellihr.io](https://developers.intellihr.io)
 *
 * The version of the OpenAPI document: V1
 * Contact: support@intellihr.co
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * JobRequirementGroupsPatchRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobRequirementGroupsPatchRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LIBRARY_ITEM_IDS = "libraryItemIds";
  @SerializedName(SERIALIZED_NAME_LIBRARY_ITEM_IDS)
  private List<String> libraryItemIds = new ArrayList<>();

  public JobRequirementGroupsPatchRequest() {
  }

  public JobRequirementGroupsPatchRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The issue date of the [Job Requirement Group](https://developers.intellihr.io/docs/v1/)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ABCDE12345", required = true, value = "The issue date of the [Job Requirement Group](https://developers.intellihr.io/docs/v1/)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JobRequirementGroupsPatchRequest libraryItemIds(List<String> libraryItemIds) {
    
    
    
    
    this.libraryItemIds = libraryItemIds;
    return this;
  }

  public JobRequirementGroupsPatchRequest addLibraryItemIdsItem(String libraryItemIdsItem) {
    this.libraryItemIds.add(libraryItemIdsItem);
    return this;
  }

   /**
   * The [Qualification Library Item](https://developers.intellihr.io/docs/v1/) ids assigned to this [Job Requirement Group](https://developers.intellihr.io/docs/v1/).
   * @return libraryItemIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [Qualification Library Item](https://developers.intellihr.io/docs/v1/) ids assigned to this [Job Requirement Group](https://developers.intellihr.io/docs/v1/).")

  public List<String> getLibraryItemIds() {
    return libraryItemIds;
  }


  public void setLibraryItemIds(List<String> libraryItemIds) {
    
    
    
    this.libraryItemIds = libraryItemIds;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the JobRequirementGroupsPatchRequest instance itself
   */
  public JobRequirementGroupsPatchRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRequirementGroupsPatchRequest jobRequirementGroupsPatchRequest = (JobRequirementGroupsPatchRequest) o;
    return Objects.equals(this.name, jobRequirementGroupsPatchRequest.name) &&
        Objects.equals(this.libraryItemIds, jobRequirementGroupsPatchRequest.libraryItemIds)&&
        Objects.equals(this.additionalProperties, jobRequirementGroupsPatchRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, libraryItemIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRequirementGroupsPatchRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    libraryItemIds: ").append(toIndentedString(libraryItemIds)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("libraryItemIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("libraryItemIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobRequirementGroupsPatchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobRequirementGroupsPatchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobRequirementGroupsPatchRequest is not found in the empty JSON string", JobRequirementGroupsPatchRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JobRequirementGroupsPatchRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("libraryItemIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("libraryItemIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `libraryItemIds` to be an array in the JSON string but got `%s`", jsonObj.get("libraryItemIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobRequirementGroupsPatchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobRequirementGroupsPatchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobRequirementGroupsPatchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobRequirementGroupsPatchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<JobRequirementGroupsPatchRequest>() {
           @Override
           public void write(JsonWriter out, JobRequirementGroupsPatchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public JobRequirementGroupsPatchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobRequirementGroupsPatchRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JobRequirementGroupsPatchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobRequirementGroupsPatchRequest
  * @throws IOException if the JSON string is invalid with respect to JobRequirementGroupsPatchRequest
  */
  public static JobRequirementGroupsPatchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobRequirementGroupsPatchRequest.class);
  }

 /**
  * Convert an instance of JobRequirementGroupsPatchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

