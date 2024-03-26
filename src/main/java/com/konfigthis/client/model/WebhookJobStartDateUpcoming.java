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
 * WebhookJobStartDateUpcoming
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookJobStartDateUpcoming {
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

  public static final String SERIALIZED_NAME_SCHEDULED_FOR = "scheduled_for";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_FOR)
  private String scheduledFor;

  public static final String SERIALIZED_NAME_SCHEDULED_OFFSET = "scheduled_offset";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_OFFSET)
  private String scheduledOffset;

  public WebhookJobStartDateUpcoming() {
  }

  public WebhookJobStartDateUpcoming id(String id) {
    
    
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


  public WebhookJobStartDateUpcoming event(Object event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "job.company_start_date_upcoming", value = "")

  public Object getEvent() {
    return event;
  }


  public void setEvent(Object event) {
    
    
    
    this.event = event;
  }


  public WebhookJobStartDateUpcoming timestamp(String timestamp) {
    
    
    
    
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


  public WebhookJobStartDateUpcoming links(Object links) {
    
    
    
    
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


  public WebhookJobStartDateUpcoming scheduledFor(String scheduledFor) {
    
    
    
    
    this.scheduledFor = scheduledFor;
    return this;
  }

   /**
   * Date this event was scheduled for.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).
   * @return scheduledFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-03-01T22:30:00+00:00", value = "Date this event was scheduled for.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).")

  public String getScheduledFor() {
    return scheduledFor;
  }


  public void setScheduledFor(String scheduledFor) {
    
    
    
    this.scheduledFor = scheduledFor;
  }


  public WebhookJobStartDateUpcoming scheduledOffset(String scheduledOffset) {
    
    
    
    
    this.scheduledOffset = scheduledOffset;
    return this;
  }

   /**
   * The current offset before the scheduled date. Enum: &#x60;-1 month&#x60;, &#x60;-14 days&#x60;, &#x60;-7 days&#x60;, &#x60;-3 days&#x60;, &#x60;-1 days&#x60;, &#x60;0 days&#x60;.
   * @return scheduledOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-7 days", value = "The current offset before the scheduled date. Enum: `-1 month`, `-14 days`, `-7 days`, `-3 days`, `-1 days`, `0 days`.")

  public String getScheduledOffset() {
    return scheduledOffset;
  }


  public void setScheduledOffset(String scheduledOffset) {
    
    
    
    this.scheduledOffset = scheduledOffset;
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
   * @return the WebhookJobStartDateUpcoming instance itself
   */
  public WebhookJobStartDateUpcoming putAdditionalProperty(String key, Object value) {
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
    WebhookJobStartDateUpcoming webhookJobStartDateUpcoming = (WebhookJobStartDateUpcoming) o;
    return Objects.equals(this.id, webhookJobStartDateUpcoming.id) &&
        Objects.equals(this.event, webhookJobStartDateUpcoming.event) &&
        Objects.equals(this.timestamp, webhookJobStartDateUpcoming.timestamp) &&
        Objects.equals(this.links, webhookJobStartDateUpcoming.links) &&
        Objects.equals(this.scheduledFor, webhookJobStartDateUpcoming.scheduledFor) &&
        Objects.equals(this.scheduledOffset, webhookJobStartDateUpcoming.scheduledOffset)&&
        Objects.equals(this.additionalProperties, webhookJobStartDateUpcoming.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, event, timestamp, links, scheduledFor, scheduledOffset, additionalProperties);
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
    sb.append("class WebhookJobStartDateUpcoming {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    scheduledFor: ").append(toIndentedString(scheduledFor)).append("\n");
    sb.append("    scheduledOffset: ").append(toIndentedString(scheduledOffset)).append("\n");
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
    openapiFields.add("scheduled_for");
    openapiFields.add("scheduled_offset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookJobStartDateUpcoming
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookJobStartDateUpcoming.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookJobStartDateUpcoming is not found in the empty JSON string", WebhookJobStartDateUpcoming.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("scheduled_for") != null && !jsonObj.get("scheduled_for").isJsonNull()) && !jsonObj.get("scheduled_for").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_for` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_for").toString()));
      }
      if ((jsonObj.get("scheduled_offset") != null && !jsonObj.get("scheduled_offset").isJsonNull()) && !jsonObj.get("scheduled_offset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduled_offset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduled_offset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookJobStartDateUpcoming.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookJobStartDateUpcoming' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookJobStartDateUpcoming> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookJobStartDateUpcoming.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookJobStartDateUpcoming>() {
           @Override
           public void write(JsonWriter out, WebhookJobStartDateUpcoming value) throws IOException {
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
           public WebhookJobStartDateUpcoming read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookJobStartDateUpcoming instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookJobStartDateUpcoming given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookJobStartDateUpcoming
  * @throws IOException if the JSON string is invalid with respect to WebhookJobStartDateUpcoming
  */
  public static WebhookJobStartDateUpcoming fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookJobStartDateUpcoming.class);
  }

 /**
  * Convert an instance of WebhookJobStartDateUpcoming to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

