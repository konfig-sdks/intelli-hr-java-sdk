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
import com.konfigthis.client.model.BusinessEntitiesPatchRequestCustomFieldsValue;
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
 * PeopleUpdateRequestPhoneNumbersInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PeopleUpdateRequestPhoneNumbersInner {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_IS_PERSONAL = "isPersonal";
  @SerializedName(SERIALIZED_NAME_IS_PERSONAL)
  private Boolean isPersonal = false;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "isPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary = false;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = null;

  public PeopleUpdateRequestPhoneNumbersInner() {
  }

  public PeopleUpdateRequestPhoneNumbersInner number(String number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The phone number. This number can be prefixed with an area code. When this happens, the system will automatically try to determine the origin country for the phone number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number. This number can be prefixed with an area code. When this happens, the system will automatically try to determine the origin country for the phone number")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    
    
    
    this.number = number;
  }


  public PeopleUpdateRequestPhoneNumbersInner isPersonal(Boolean isPersonal) {
    
    
    
    
    this.isPersonal = isPersonal;
    return this;
  }

   /**
   * Denotes whether this phone is personal or a work phone number.
   * @return isPersonal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Denotes whether this phone is personal or a work phone number.")

  public Boolean getIsPersonal() {
    return isPersonal;
  }


  public void setIsPersonal(Boolean isPersonal) {
    
    
    
    this.isPersonal = isPersonal;
  }


  public PeopleUpdateRequestPhoneNumbersInner isPrimary(Boolean isPrimary) {
    
    
    
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Denotes whether this phone is the primary contact phone number.
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Denotes whether this phone is the primary contact phone number.")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    
    
    
    this.isPrimary = isPrimary;
  }


  public PeopleUpdateRequestPhoneNumbersInner customFields(Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public PeopleUpdateRequestPhoneNumbersInner putCustomFieldsItem(String key, BusinessEntitiesPatchRequestCustomFieldsValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * The custom field values for this phone number
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}", value = "The custom field values for this phone number")

  public Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields) {
    
    
    
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
   * @return the PeopleUpdateRequestPhoneNumbersInner instance itself
   */
  public PeopleUpdateRequestPhoneNumbersInner putAdditionalProperty(String key, Object value) {
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
    PeopleUpdateRequestPhoneNumbersInner peopleUpdateRequestPhoneNumbersInner = (PeopleUpdateRequestPhoneNumbersInner) o;
    return Objects.equals(this.number, peopleUpdateRequestPhoneNumbersInner.number) &&
        Objects.equals(this.isPersonal, peopleUpdateRequestPhoneNumbersInner.isPersonal) &&
        Objects.equals(this.isPrimary, peopleUpdateRequestPhoneNumbersInner.isPrimary) &&
        Objects.equals(this.customFields, peopleUpdateRequestPhoneNumbersInner.customFields)&&
        Objects.equals(this.additionalProperties, peopleUpdateRequestPhoneNumbersInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, isPersonal, isPrimary, customFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleUpdateRequestPhoneNumbersInner {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("number");
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
  * @throws IOException if the JSON Object is invalid with respect to PeopleUpdateRequestPhoneNumbersInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeopleUpdateRequestPhoneNumbersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleUpdateRequestPhoneNumbersInner is not found in the empty JSON string", PeopleUpdateRequestPhoneNumbersInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleUpdateRequestPhoneNumbersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleUpdateRequestPhoneNumbersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleUpdateRequestPhoneNumbersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleUpdateRequestPhoneNumbersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleUpdateRequestPhoneNumbersInner>() {
           @Override
           public void write(JsonWriter out, PeopleUpdateRequestPhoneNumbersInner value) throws IOException {
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
           public PeopleUpdateRequestPhoneNumbersInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeopleUpdateRequestPhoneNumbersInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeopleUpdateRequestPhoneNumbersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeopleUpdateRequestPhoneNumbersInner
  * @throws IOException if the JSON string is invalid with respect to PeopleUpdateRequestPhoneNumbersInner
  */
  public static PeopleUpdateRequestPhoneNumbersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleUpdateRequestPhoneNumbersInner.class);
  }

 /**
  * Convert an instance of PeopleUpdateRequestPhoneNumbersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

