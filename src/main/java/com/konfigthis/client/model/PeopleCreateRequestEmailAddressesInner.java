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
import com.konfigthis.client.model.BusinessEntitiesCreateRequestCustomFieldsValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * PeopleCreateRequestEmailAddressesInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PeopleCreateRequestEmailAddressesInner {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_IS_PERSONAL = "isPersonal";
  @SerializedName(SERIALIZED_NAME_IS_PERSONAL)
  private Boolean isPersonal = false;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary = false;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields = null;

  public PeopleCreateRequestEmailAddressesInner() {
  }

  public PeopleCreateRequestEmailAddressesInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The email address associated with this person. This will be automatically converted to lowercase.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address associated with this person. This will be automatically converted to lowercase.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public PeopleCreateRequestEmailAddressesInner isPersonal(Boolean isPersonal) {
    
    
    
    
    this.isPersonal = isPersonal;
    return this;
  }

   /**
   * Denotes whether this email is personal or a work email.
   * @return isPersonal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Denotes whether this email is personal or a work email.")

  public Boolean getIsPersonal() {
    return isPersonal;
  }


  public void setIsPersonal(Boolean isPersonal) {
    
    
    
    this.isPersonal = isPersonal;
  }


  public PeopleCreateRequestEmailAddressesInner isPrimary(Boolean isPrimary) {
    
    
    
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Denotes whether this email is the primary contact email.
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Denotes whether this email is the primary contact email.")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    
    
    
    this.isPrimary = isPrimary;
  }


  public PeopleCreateRequestEmailAddressesInner customFields(Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public PeopleCreateRequestEmailAddressesInner putCustomFieldsItem(String key, BusinessEntitiesCreateRequestCustomFieldsValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * The custom field values for this email address
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}", value = "The custom field values for this email address")

  public Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields) {
    
    
    
    this.customFields = customFields;
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
   * @return the PeopleCreateRequestEmailAddressesInner instance itself
   */
  public PeopleCreateRequestEmailAddressesInner putAdditionalProperty(String key, Object value) {
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
    PeopleCreateRequestEmailAddressesInner peopleCreateRequestEmailAddressesInner = (PeopleCreateRequestEmailAddressesInner) o;
    return Objects.equals(this.email, peopleCreateRequestEmailAddressesInner.email) &&
        Objects.equals(this.isPersonal, peopleCreateRequestEmailAddressesInner.isPersonal) &&
        Objects.equals(this.isPrimary, peopleCreateRequestEmailAddressesInner.isPrimary) &&
        Objects.equals(this.customFields, peopleCreateRequestEmailAddressesInner.customFields)&&
        Objects.equals(this.additionalProperties, peopleCreateRequestEmailAddressesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isPersonal, isPrimary, customFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleCreateRequestEmailAddressesInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isPersonal: ").append(toIndentedString(isPersonal)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("isPersonal");
    openapiFields.add("isPrimary");
    openapiFields.add("customFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeopleCreateRequestEmailAddressesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeopleCreateRequestEmailAddressesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleCreateRequestEmailAddressesInner is not found in the empty JSON string", PeopleCreateRequestEmailAddressesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleCreateRequestEmailAddressesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleCreateRequestEmailAddressesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleCreateRequestEmailAddressesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleCreateRequestEmailAddressesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleCreateRequestEmailAddressesInner>() {
           @Override
           public void write(JsonWriter out, PeopleCreateRequestEmailAddressesInner value) throws IOException {
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
           public PeopleCreateRequestEmailAddressesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeopleCreateRequestEmailAddressesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeopleCreateRequestEmailAddressesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeopleCreateRequestEmailAddressesInner
  * @throws IOException if the JSON string is invalid with respect to PeopleCreateRequestEmailAddressesInner
  */
  public static PeopleCreateRequestEmailAddressesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleCreateRequestEmailAddressesInner.class);
  }

 /**
  * Convert an instance of PeopleCreateRequestEmailAddressesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

