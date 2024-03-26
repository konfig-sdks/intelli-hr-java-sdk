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
import com.konfigthis.client.model.CustomFieldDefinitionsListMetaPagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Contains miscellaneous meta information about the response.
 */
@ApiModel(description = "Contains miscellaneous meta information about the response.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomFieldDefinitionsListMeta {
  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private CustomFieldDefinitionsListMetaPagination pagination;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public CustomFieldDefinitionsListMeta() {
  }

  public CustomFieldDefinitionsListMeta pagination(CustomFieldDefinitionsListMetaPagination pagination) {
    
    
    
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CustomFieldDefinitionsListMetaPagination getPagination() {
    return pagination;
  }


  public void setPagination(CustomFieldDefinitionsListMetaPagination pagination) {
    
    
    
    this.pagination = pagination;
  }


  public CustomFieldDefinitionsListMeta requestId(String requestId) {
    
    
    if (requestId != null && requestId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for requestId. Length must be greater than or equal to 36.");
    }
    
    this.requestId = requestId;
    return this;
  }

   /**
   * The identifier string for the api request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "The identifier string for the api request.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    
    
    if (requestId != null && requestId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for requestId. Length must be greater than or equal to 36.");
    }
    this.requestId = requestId;
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
   * @return the CustomFieldDefinitionsListMeta instance itself
   */
  public CustomFieldDefinitionsListMeta putAdditionalProperty(String key, Object value) {
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
    CustomFieldDefinitionsListMeta customFieldDefinitionsListMeta = (CustomFieldDefinitionsListMeta) o;
    return Objects.equals(this.pagination, customFieldDefinitionsListMeta.pagination) &&
        Objects.equals(this.requestId, customFieldDefinitionsListMeta.requestId)&&
        Objects.equals(this.additionalProperties, customFieldDefinitionsListMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, requestId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldDefinitionsListMeta {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
    openapiFields.add("pagination");
    openapiFields.add("requestId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldDefinitionsListMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomFieldDefinitionsListMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldDefinitionsListMeta is not found in the empty JSON string", CustomFieldDefinitionsListMeta.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `pagination`
      if (jsonObj.get("pagination") != null && !jsonObj.get("pagination").isJsonNull()) {
        CustomFieldDefinitionsListMetaPagination.validateJsonObject(jsonObj.getAsJsonObject("pagination"));
      }
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldDefinitionsListMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldDefinitionsListMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldDefinitionsListMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldDefinitionsListMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldDefinitionsListMeta>() {
           @Override
           public void write(JsonWriter out, CustomFieldDefinitionsListMeta value) throws IOException {
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
           public CustomFieldDefinitionsListMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomFieldDefinitionsListMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomFieldDefinitionsListMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldDefinitionsListMeta
  * @throws IOException if the JSON string is invalid with respect to CustomFieldDefinitionsListMeta
  */
  public static CustomFieldDefinitionsListMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldDefinitionsListMeta.class);
  }

 /**
  * Convert an instance of CustomFieldDefinitionsListMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

