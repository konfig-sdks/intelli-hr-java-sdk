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
 * DefaultRemunerationComponent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DefaultRemunerationComponent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_IS_IN_USE = "isInUse";
  @SerializedName(SERIALIZED_NAME_IS_IN_USE)
  private Boolean isInUse;

  public static final String SERIALIZED_NAME_AUTOMATICALLY_ADD_TO_JOBS = "automaticallyAddToJobs";
  @SerializedName(SERIALIZED_NAME_AUTOMATICALLY_ADD_TO_JOBS)
  private Boolean automaticallyAddToJobs;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Object currency = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public DefaultRemunerationComponent() {
  }

  public DefaultRemunerationComponent id(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * The identifier string for the [Default Remuneration Component](https://developers.intellihr.io/docs/v1/).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "The identifier string for the [Default Remuneration Component](https://developers.intellihr.io/docs/v1/).")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    this.id = id;
  }


  public DefaultRemunerationComponent name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name given to this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Superannuation", value = "Name given to this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DefaultRemunerationComponent value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * The value of this remuneration component. For multipleOfBase this is the multiplier while for fixed amount this is the amount to directly add to the total.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.09", value = "The value of this remuneration component. For multipleOfBase this is the multiplier while for fixed amount this is the amount to directly add to the total.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public DefaultRemunerationComponent isInUse(Boolean isInUse) {
    
    
    
    
    this.isInUse = isInUse;
    return this;
  }

   /**
   * Whether this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is used as any remuneration components.
   * @return isInUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is used as any remuneration components.")

  public Boolean getIsInUse() {
    return isInUse;
  }


  public void setIsInUse(Boolean isInUse) {
    
    
    
    this.isInUse = isInUse;
  }


  public DefaultRemunerationComponent automaticallyAddToJobs(Boolean automaticallyAddToJobs) {
    
    
    
    
    this.automaticallyAddToJobs = automaticallyAddToJobs;
    return this;
  }

   /**
   * Whether this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is automatically added to newly created/updated jobs.
   * @return automaticallyAddToJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is automatically added to newly created/updated jobs.")

  public Boolean getAutomaticallyAddToJobs() {
    return automaticallyAddToJobs;
  }


  public void setAutomaticallyAddToJobs(Boolean automaticallyAddToJobs) {
    
    
    
    this.automaticallyAddToJobs = automaticallyAddToJobs;
  }


  public DefaultRemunerationComponent isEnabled(Boolean isEnabled) {
    
    
    
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * If this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is enabled for use in the system.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is enabled for use in the system.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    
    
    
    this.isEnabled = isEnabled;
  }


  public DefaultRemunerationComponent currency(Object currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCurrency() {
    return currency;
  }


  public void setCurrency(Object currency) {
    
    
    
    this.currency = currency;
  }


  public DefaultRemunerationComponent type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). Enum: &#x60;AdditionToBase&#x60;, &#x60;AdditionToTotal&#x60;, &#x60;DeductionToBase&#x60;, &#x60;Breakdown&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AdditionToTotal", value = "The type of this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). Enum: `AdditionToBase`, `AdditionToTotal`, `DeductionToBase`, `Breakdown`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public DefaultRemunerationComponent valueType(String valueType) {
    
    
    
    
    this.valueType = valueType;
    return this;
  }

   /**
   * The type of the value of this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;.
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MultipleOfBase", value = "The type of the value of this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). Enum: `MultipleOfBase`, `FixedAmount`.")

  public String getValueType() {
    return valueType;
  }


  public void setValueType(String valueType) {
    
    
    
    this.valueType = valueType;
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
   * @return the DefaultRemunerationComponent instance itself
   */
  public DefaultRemunerationComponent putAdditionalProperty(String key, Object value) {
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
    DefaultRemunerationComponent defaultRemunerationComponent = (DefaultRemunerationComponent) o;
    return Objects.equals(this.id, defaultRemunerationComponent.id) &&
        Objects.equals(this.name, defaultRemunerationComponent.name) &&
        Objects.equals(this.value, defaultRemunerationComponent.value) &&
        Objects.equals(this.isInUse, defaultRemunerationComponent.isInUse) &&
        Objects.equals(this.automaticallyAddToJobs, defaultRemunerationComponent.automaticallyAddToJobs) &&
        Objects.equals(this.isEnabled, defaultRemunerationComponent.isEnabled) &&
        Objects.equals(this.currency, defaultRemunerationComponent.currency) &&
        Objects.equals(this.type, defaultRemunerationComponent.type) &&
        Objects.equals(this.valueType, defaultRemunerationComponent.valueType)&&
        Objects.equals(this.additionalProperties, defaultRemunerationComponent.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value, isInUse, automaticallyAddToJobs, isEnabled, currency, type, valueType, additionalProperties);
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
    sb.append("class DefaultRemunerationComponent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isInUse: ").append(toIndentedString(isInUse)).append("\n");
    sb.append("    automaticallyAddToJobs: ").append(toIndentedString(automaticallyAddToJobs)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("value");
    openapiFields.add("isInUse");
    openapiFields.add("automaticallyAddToJobs");
    openapiFields.add("isEnabled");
    openapiFields.add("currency");
    openapiFields.add("type");
    openapiFields.add("valueType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DefaultRemunerationComponent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DefaultRemunerationComponent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultRemunerationComponent is not found in the empty JSON string", DefaultRemunerationComponent.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("valueType") != null && !jsonObj.get("valueType").isJsonNull()) && !jsonObj.get("valueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultRemunerationComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultRemunerationComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultRemunerationComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultRemunerationComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultRemunerationComponent>() {
           @Override
           public void write(JsonWriter out, DefaultRemunerationComponent value) throws IOException {
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
           public DefaultRemunerationComponent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DefaultRemunerationComponent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DefaultRemunerationComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DefaultRemunerationComponent
  * @throws IOException if the JSON string is invalid with respect to DefaultRemunerationComponent
  */
  public static DefaultRemunerationComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultRemunerationComponent.class);
  }

 /**
  * Convert an instance of DefaultRemunerationComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

