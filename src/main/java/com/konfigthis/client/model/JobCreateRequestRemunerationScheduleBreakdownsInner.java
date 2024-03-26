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
import com.konfigthis.client.model.JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent;
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
 * JobCreateRequestRemunerationScheduleBreakdownsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobCreateRequestRemunerationScheduleBreakdownsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DEFAULT_REMUNERATION_COMPONENT = "defaultRemunerationComponent";
  @SerializedName(SERIALIZED_NAME_DEFAULT_REMUNERATION_COMPONENT)
  private JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent defaultRemunerationComponent;

  public JobCreateRequestRemunerationScheduleBreakdownsInner() {
  }

  public JobCreateRequestRemunerationScheduleBreakdownsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of this Breakdowns.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of this Breakdowns.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JobCreateRequestRemunerationScheduleBreakdownsInner type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * How this breakdown is calculated and applied to the base amount, MultipleOfBase is multiplied by baseAnnualSalary and then added to the total while FixedAmount is added directly to the total. Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "How this breakdown is calculated and applied to the base amount, MultipleOfBase is multiplied by baseAnnualSalary and then added to the total while FixedAmount is added directly to the total. Enum: `MultipleOfBase`, `FixedAmount`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public JobCreateRequestRemunerationScheduleBreakdownsInner value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * For MultipleOfBase this is the multiplier (e.g. 9 &#x3D; 9%) while for fixed amount this is the amount to directly add to the total.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "For MultipleOfBase this is the multiplier (e.g. 9 = 9%) while for fixed amount this is the amount to directly add to the total.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public JobCreateRequestRemunerationScheduleBreakdownsInner currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for this breakdown. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency used for this breakdown. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public JobCreateRequestRemunerationScheduleBreakdownsInner defaultRemunerationComponent(JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent defaultRemunerationComponent) {
    
    
    
    
    this.defaultRemunerationComponent = defaultRemunerationComponent;
    return this;
  }

   /**
   * Get defaultRemunerationComponent
   * @return defaultRemunerationComponent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent getDefaultRemunerationComponent() {
    return defaultRemunerationComponent;
  }


  public void setDefaultRemunerationComponent(JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent defaultRemunerationComponent) {
    
    
    
    this.defaultRemunerationComponent = defaultRemunerationComponent;
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
   * @return the JobCreateRequestRemunerationScheduleBreakdownsInner instance itself
   */
  public JobCreateRequestRemunerationScheduleBreakdownsInner putAdditionalProperty(String key, Object value) {
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
    JobCreateRequestRemunerationScheduleBreakdownsInner jobCreateRequestRemunerationScheduleBreakdownsInner = (JobCreateRequestRemunerationScheduleBreakdownsInner) o;
    return Objects.equals(this.name, jobCreateRequestRemunerationScheduleBreakdownsInner.name) &&
        Objects.equals(this.type, jobCreateRequestRemunerationScheduleBreakdownsInner.type) &&
        Objects.equals(this.value, jobCreateRequestRemunerationScheduleBreakdownsInner.value) &&
        Objects.equals(this.currency, jobCreateRequestRemunerationScheduleBreakdownsInner.currency) &&
        Objects.equals(this.defaultRemunerationComponent, jobCreateRequestRemunerationScheduleBreakdownsInner.defaultRemunerationComponent)&&
        Objects.equals(this.additionalProperties, jobCreateRequestRemunerationScheduleBreakdownsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, currency, defaultRemunerationComponent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCreateRequestRemunerationScheduleBreakdownsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    defaultRemunerationComponent: ").append(toIndentedString(defaultRemunerationComponent)).append("\n");
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
    openapiFields.add("defaultRemunerationComponent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("value");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobCreateRequestRemunerationScheduleBreakdownsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobCreateRequestRemunerationScheduleBreakdownsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobCreateRequestRemunerationScheduleBreakdownsInner is not found in the empty JSON string", JobCreateRequestRemunerationScheduleBreakdownsInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JobCreateRequestRemunerationScheduleBreakdownsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the optional field `defaultRemunerationComponent`
      if (jsonObj.get("defaultRemunerationComponent") != null && !jsonObj.get("defaultRemunerationComponent").isJsonNull()) {
        JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent.validateJsonObject(jsonObj.getAsJsonObject("defaultRemunerationComponent"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobCreateRequestRemunerationScheduleBreakdownsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobCreateRequestRemunerationScheduleBreakdownsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobCreateRequestRemunerationScheduleBreakdownsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobCreateRequestRemunerationScheduleBreakdownsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobCreateRequestRemunerationScheduleBreakdownsInner>() {
           @Override
           public void write(JsonWriter out, JobCreateRequestRemunerationScheduleBreakdownsInner value) throws IOException {
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
           public JobCreateRequestRemunerationScheduleBreakdownsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobCreateRequestRemunerationScheduleBreakdownsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobCreateRequestRemunerationScheduleBreakdownsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobCreateRequestRemunerationScheduleBreakdownsInner
  * @throws IOException if the JSON string is invalid with respect to JobCreateRequestRemunerationScheduleBreakdownsInner
  */
  public static JobCreateRequestRemunerationScheduleBreakdownsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobCreateRequestRemunerationScheduleBreakdownsInner.class);
  }

 /**
  * Convert an instance of JobCreateRequestRemunerationScheduleBreakdownsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

