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
 * WebhookEventFormCompleted
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookEventFormCompleted {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Object event = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_FORM_DESIGN_ID = "formDesignId";
  @SerializedName(SERIALIZED_NAME_FORM_DESIGN_ID)
  private String formDesignId;

  public WebhookEventFormCompleted() {
  }

  public WebhookEventFormCompleted id(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * The identifier that this event relates to.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "The identifier that this event relates to.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    this.id = id;
  }


  public WebhookEventFormCompleted event(Object event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "form.completed", value = "")

  public Object getEvent() {
    return event;
  }


  public void setEvent(Object event) {
    
    
    
    this.event = event;
  }


  public WebhookEventFormCompleted timestamp(String timestamp) {
    
    
    
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * When this event was fired, not necessarily the the time that the event occurred. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-03-01T22:30:00+00:00", value = "When this event was fired, not necessarily the the time that the event occurred. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    
    
    
    this.timestamp = timestamp;
  }


  public WebhookEventFormCompleted links(Object links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLinks() {
    return links;
  }


  public void setLinks(Object links) {
    
    
    
    this.links = links;
  }


  public WebhookEventFormCompleted formDesignId(String formDesignId) {
    
    
    if (formDesignId != null && formDesignId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for formDesignId. Length must be greater than or equal to 36.");
    }
    
    this.formDesignId = formDesignId;
    return this;
  }

   /**
   * The identifier string for the Form id.
   * @return formDesignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "The identifier string for the Form id.")

  public String getFormDesignId() {
    return formDesignId;
  }


  public void setFormDesignId(String formDesignId) {
    
    
    if (formDesignId != null && formDesignId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for formDesignId. Length must be greater than or equal to 36.");
    }
    this.formDesignId = formDesignId;
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
   * @return the WebhookEventFormCompleted instance itself
   */
  public WebhookEventFormCompleted putAdditionalProperty(String key, Object value) {
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
    WebhookEventFormCompleted webhookEventFormCompleted = (WebhookEventFormCompleted) o;
    return Objects.equals(this.id, webhookEventFormCompleted.id) &&
        Objects.equals(this.event, webhookEventFormCompleted.event) &&
        Objects.equals(this.timestamp, webhookEventFormCompleted.timestamp) &&
        Objects.equals(this.links, webhookEventFormCompleted.links) &&
        Objects.equals(this.formDesignId, webhookEventFormCompleted.formDesignId)&&
        Objects.equals(this.additionalProperties, webhookEventFormCompleted.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, event, timestamp, links, formDesignId, additionalProperties);
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
    sb.append("class WebhookEventFormCompleted {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    formDesignId: ").append(toIndentedString(formDesignId)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("timestamp");
    openapiFields.add("links");
    openapiFields.add("formDesignId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookEventFormCompleted
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookEventFormCompleted.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookEventFormCompleted is not found in the empty JSON string", WebhookEventFormCompleted.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        Object.validateJsonObject(jsonObj.getAsJsonObject("links"));
      }
      if ((jsonObj.get("formDesignId") != null && !jsonObj.get("formDesignId").isJsonNull()) && !jsonObj.get("formDesignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formDesignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formDesignId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookEventFormCompleted.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookEventFormCompleted' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookEventFormCompleted> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookEventFormCompleted.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookEventFormCompleted>() {
           @Override
           public void write(JsonWriter out, WebhookEventFormCompleted value) throws IOException {
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
           public WebhookEventFormCompleted read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookEventFormCompleted instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookEventFormCompleted given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookEventFormCompleted
  * @throws IOException if the JSON string is invalid with respect to WebhookEventFormCompleted
  */
  public static WebhookEventFormCompleted fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookEventFormCompleted.class);
  }

 /**
  * Convert an instance of WebhookEventFormCompleted to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

