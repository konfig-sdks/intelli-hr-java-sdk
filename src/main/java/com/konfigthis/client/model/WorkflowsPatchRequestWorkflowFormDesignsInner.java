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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WorkflowsPatchRequestWorkflowFormDesignsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowsPatchRequestWorkflowFormDesignsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SEND_DATE = "sendDate";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private Object sendDate = null;

  public WorkflowsPatchRequestWorkflowFormDesignsInner() {
  }

  public WorkflowsPatchRequestWorkflowFormDesignsInner id(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * The identifier string for the Workflow Form Design.  Note that this is not the id of the Form Design.  The Form Design that you wish to send will be listed under a &#39;Workflow Form Design&#39; in the response from [Workflow Events](https://developers.intellihr.io/docs/v1/), it is the id of this Workflow Form Design that is required in this field, not the id of the Form Design itself.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", required = true, value = "The identifier string for the Workflow Form Design.  Note that this is not the id of the Form Design.  The Form Design that you wish to send will be listed under a 'Workflow Form Design' in the response from [Workflow Events](https://developers.intellihr.io/docs/v1/), it is the id of this Workflow Form Design that is required in this field, not the id of the Form Design itself.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    this.id = id;
  }


  public WorkflowsPatchRequestWorkflowFormDesignsInner sendDate(Object sendDate) {
    
    
    
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * Get sendDate
   * @return sendDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSendDate() {
    return sendDate;
  }


  public void setSendDate(Object sendDate) {
    
    
    
    this.sendDate = sendDate;
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
   * @return the WorkflowsPatchRequestWorkflowFormDesignsInner instance itself
   */
  public WorkflowsPatchRequestWorkflowFormDesignsInner putAdditionalProperty(String key, Object value) {
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
    WorkflowsPatchRequestWorkflowFormDesignsInner workflowsPatchRequestWorkflowFormDesignsInner = (WorkflowsPatchRequestWorkflowFormDesignsInner) o;
    return Objects.equals(this.id, workflowsPatchRequestWorkflowFormDesignsInner.id) &&
        Objects.equals(this.sendDate, workflowsPatchRequestWorkflowFormDesignsInner.sendDate)&&
        Objects.equals(this.additionalProperties, workflowsPatchRequestWorkflowFormDesignsInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sendDate, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowsPatchRequestWorkflowFormDesignsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("sendDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowsPatchRequestWorkflowFormDesignsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowsPatchRequestWorkflowFormDesignsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowsPatchRequestWorkflowFormDesignsInner is not found in the empty JSON string", WorkflowsPatchRequestWorkflowFormDesignsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowsPatchRequestWorkflowFormDesignsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowsPatchRequestWorkflowFormDesignsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowsPatchRequestWorkflowFormDesignsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowsPatchRequestWorkflowFormDesignsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowsPatchRequestWorkflowFormDesignsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowsPatchRequestWorkflowFormDesignsInner>() {
           @Override
           public void write(JsonWriter out, WorkflowsPatchRequestWorkflowFormDesignsInner value) throws IOException {
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
           public WorkflowsPatchRequestWorkflowFormDesignsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowsPatchRequestWorkflowFormDesignsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowsPatchRequestWorkflowFormDesignsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowsPatchRequestWorkflowFormDesignsInner
  * @throws IOException if the JSON string is invalid with respect to WorkflowsPatchRequestWorkflowFormDesignsInner
  */
  public static WorkflowsPatchRequestWorkflowFormDesignsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowsPatchRequestWorkflowFormDesignsInner.class);
  }

 /**
  * Convert an instance of WorkflowsPatchRequestWorkflowFormDesignsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

