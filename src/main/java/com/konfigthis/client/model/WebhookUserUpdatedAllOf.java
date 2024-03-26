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
 * WebhookUserUpdatedAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookUserUpdatedAllOf {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private Object event = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  /**
   * Gets or Sets updatedAttributes
   */
  @JsonAdapter(UpdatedAttributesEnum.Adapter.class)
 public enum UpdatedAttributesEnum {
    USERNAME("username"),
    
    PERSON_ID("person_id"),
    
    IS_ENABLED("is_enabled"),
    
    DISABLE_AT("disable_at"),
    
    SSO_ID("sso_id"),
    
    PASSWORD("password"),
    
    ROLES("roles"),
    
    HAS_ACCEPTED_TERMS("has_accepted_terms");

    private String value;

    UpdatedAttributesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdatedAttributesEnum fromValue(String value) {
      for (UpdatedAttributesEnum b : UpdatedAttributesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UpdatedAttributesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdatedAttributesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdatedAttributesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UpdatedAttributesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UPDATED_ATTRIBUTES = "updated_attributes";
  @SerializedName(SERIALIZED_NAME_UPDATED_ATTRIBUTES)
  private List<UpdatedAttributesEnum> updatedAttributes = null;

  public WebhookUserUpdatedAllOf() {
  }

  public WebhookUserUpdatedAllOf event(Object event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user.updated", value = "")

  public Object getEvent() {
    return event;
  }


  public void setEvent(Object event) {
    
    
    
    this.event = event;
  }


  public WebhookUserUpdatedAllOf links(Object links) {
    
    
    
    
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


  public WebhookUserUpdatedAllOf updatedAttributes(List<UpdatedAttributesEnum> updatedAttributes) {
    
    
    
    
    this.updatedAttributes = updatedAttributes;
    return this;
  }

  public WebhookUserUpdatedAllOf addUpdatedAttributesItem(UpdatedAttributesEnum updatedAttributesItem) {
    if (this.updatedAttributes == null) {
      this.updatedAttributes = new ArrayList<>();
    }
    this.updatedAttributes.add(updatedAttributesItem);
    return this;
  }

   /**
   * Get updatedAttributes
   * @return updatedAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UpdatedAttributesEnum> getUpdatedAttributes() {
    return updatedAttributes;
  }


  public void setUpdatedAttributes(List<UpdatedAttributesEnum> updatedAttributes) {
    
    
    
    this.updatedAttributes = updatedAttributes;
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
   * @return the WebhookUserUpdatedAllOf instance itself
   */
  public WebhookUserUpdatedAllOf putAdditionalProperty(String key, Object value) {
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
    WebhookUserUpdatedAllOf webhookUserUpdatedAllOf = (WebhookUserUpdatedAllOf) o;
    return Objects.equals(this.event, webhookUserUpdatedAllOf.event) &&
        Objects.equals(this.links, webhookUserUpdatedAllOf.links) &&
        Objects.equals(this.updatedAttributes, webhookUserUpdatedAllOf.updatedAttributes)&&
        Objects.equals(this.additionalProperties, webhookUserUpdatedAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, links, updatedAttributes, additionalProperties);
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
    sb.append("class WebhookUserUpdatedAllOf {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    updatedAttributes: ").append(toIndentedString(updatedAttributes)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("links");
    openapiFields.add("updated_attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookUserUpdatedAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookUserUpdatedAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookUserUpdatedAllOf is not found in the empty JSON string", WebhookUserUpdatedAllOf.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        Object.validateJsonObject(jsonObj.getAsJsonObject("links"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("updated_attributes") != null && !jsonObj.get("updated_attributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_attributes` to be an array in the JSON string but got `%s`", jsonObj.get("updated_attributes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookUserUpdatedAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookUserUpdatedAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookUserUpdatedAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookUserUpdatedAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookUserUpdatedAllOf>() {
           @Override
           public void write(JsonWriter out, WebhookUserUpdatedAllOf value) throws IOException {
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
           public WebhookUserUpdatedAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookUserUpdatedAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookUserUpdatedAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookUserUpdatedAllOf
  * @throws IOException if the JSON string is invalid with respect to WebhookUserUpdatedAllOf
  */
  public static WebhookUserUpdatedAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookUserUpdatedAllOf.class);
  }

 /**
  * Convert an instance of WebhookUserUpdatedAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

