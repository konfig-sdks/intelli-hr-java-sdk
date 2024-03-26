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
 * JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner() {
  }

  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of this Addition.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Superannuation", value = "The name of this Addition.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * How this addition is recorded, it is not used to compute the total package due unlike other remuneration components. Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How this addition is recorded, it is not used to compute the total package due unlike other remuneration components. Enum: `MultipleOfBase`, `FixedAmount`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner value(Double value) {
    
    
    
    
    this.value = value;
    return this;
  }

  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner value(Integer value) {
    
    
    
    
    this.value = value.doubleValue();
    return this;
  }

   /**
   * For multipleOfBase this is the multiplier (e.g. 9 &#x3D; 9%) while for fixed amount this is the amount to directly add to the total.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9.5", value = "For multipleOfBase this is the multiplier (e.g. 9 = 9%) while for fixed amount this is the amount to directly add to the total.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    
    
    
    this.value = value;
  }


  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for this Addition. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency used for this Addition. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
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
   * @return the JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner instance itself
   */
  public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner putAdditionalProperty(String key, Object value) {
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
    JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner jobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner = (JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner) o;
    return Objects.equals(this.name, jobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.name) &&
        Objects.equals(this.type, jobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.type) &&
        Objects.equals(this.value, jobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.value) &&
        Objects.equals(this.currency, jobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.currency)&&
        Objects.equals(this.additionalProperties, jobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, currency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner is not found in the empty JSON string", JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner>() {
           @Override
           public void write(JsonWriter out, JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner value) throws IOException {
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
           public JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner
  * @throws IOException if the JSON string is invalid with respect to JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner
  */
  public static JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.class);
  }

 /**
  * Convert an instance of JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

