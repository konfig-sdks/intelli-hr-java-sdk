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
import com.konfigthis.client.model.TrainingsPatchRequestCoordinatorPerson;
import com.konfigthis.client.model.TrainingsPatchRequestJob;
import com.konfigthis.client.model.TrainingsPatchRequestPerson;
import com.konfigthis.client.model.TrainingsPatchRequestProvider;
import com.konfigthis.client.model.TrainingsPatchRequestStatus;
import com.konfigthis.client.model.TrainingsPatchRequestType;
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
 * TrainingsPatchRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrainingsPatchRequest {
  public static final String SERIALIZED_NAME_COORDINATOR_PERSON = "coordinatorPerson";
  @SerializedName(SERIALIZED_NAME_COORDINATOR_PERSON)
  private TrainingsPatchRequestCoordinatorPerson coordinatorPerson;

  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  private String completionDate;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private String cost;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private String hours;

  public static final String SERIALIZED_NAME_JOB = "job";
  @SerializedName(SERIALIZED_NAME_JOB)
  private TrainingsPatchRequestJob job;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERSON = "person";
  @SerializedName(SERIALIZED_NAME_PERSON)
  private TrainingsPatchRequestPerson person;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private TrainingsPatchRequestProvider provider;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TrainingsPatchRequestType type;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TrainingsPatchRequestStatus status;

  public TrainingsPatchRequest() {
  }

  public TrainingsPatchRequest coordinatorPerson(TrainingsPatchRequestCoordinatorPerson coordinatorPerson) {
    
    
    
    
    this.coordinatorPerson = coordinatorPerson;
    return this;
  }

   /**
   * Get coordinatorPerson
   * @return coordinatorPerson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrainingsPatchRequestCoordinatorPerson getCoordinatorPerson() {
    return coordinatorPerson;
  }


  public void setCoordinatorPerson(TrainingsPatchRequestCoordinatorPerson coordinatorPerson) {
    
    
    
    this.coordinatorPerson = coordinatorPerson;
  }


  public TrainingsPatchRequest completionDate(String completionDate) {
    
    
    
    
    this.completionDate = completionDate;
    return this;
  }

   /**
   * The timestamp the [Training](https://developers.intellihr.io/docs/v1/) was completed. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
   * @return completionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-03-01T22:30:00+00:00", value = "The timestamp the [Training](https://developers.intellihr.io/docs/v1/) was completed. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.")

  public String getCompletionDate() {
    return completionDate;
  }


  public void setCompletionDate(String completionDate) {
    
    
    
    this.completionDate = completionDate;
  }


  public TrainingsPatchRequest cost(String cost) {
    
    
    
    
    this.cost = cost;
    return this;
  }

   /**
   * The cost of this [Training](https://developers.intellihr.io/docs/v1/).
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600", value = "The cost of this [Training](https://developers.intellihr.io/docs/v1/).")

  public String getCost() {
    return cost;
  }


  public void setCost(String cost) {
    
    
    
    this.cost = cost;
  }


  public TrainingsPatchRequest currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency used for this [Training](https://developers.intellihr.io/docs/v1/). Will default to the tenant default currency when not provided. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency used for this [Training](https://developers.intellihr.io/docs/v1/). Will default to the tenant default currency when not provided. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public TrainingsPatchRequest hours(String hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * How many hours were spent on this [Training](https://developers.intellihr.io/docs/v1/)
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "How many hours were spent on this [Training](https://developers.intellihr.io/docs/v1/)")

  public String getHours() {
    return hours;
  }


  public void setHours(String hours) {
    
    
    
    this.hours = hours;
  }


  public TrainingsPatchRequest job(TrainingsPatchRequestJob job) {
    
    
    
    
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrainingsPatchRequestJob getJob() {
    return job;
  }


  public void setJob(TrainingsPatchRequestJob job) {
    
    
    
    this.job = job;
  }


  public TrainingsPatchRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * User friendly name given to this [Training](https://developers.intellihr.io/docs/v1/) to identify it in the system.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Accounting Compliance 101", value = "User friendly name given to this [Training](https://developers.intellihr.io/docs/v1/) to identify it in the system.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public TrainingsPatchRequest person(TrainingsPatchRequestPerson person) {
    
    
    
    
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrainingsPatchRequestPerson getPerson() {
    return person;
  }


  public void setPerson(TrainingsPatchRequestPerson person) {
    
    
    
    this.person = person;
  }


  public TrainingsPatchRequest provider(TrainingsPatchRequestProvider provider) {
    
    
    
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrainingsPatchRequestProvider getProvider() {
    return provider;
  }


  public void setProvider(TrainingsPatchRequestProvider provider) {
    
    
    
    this.provider = provider;
  }


  public TrainingsPatchRequest type(TrainingsPatchRequestType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrainingsPatchRequestType getType() {
    return type;
  }


  public void setType(TrainingsPatchRequestType type) {
    
    
    
    this.type = type;
  }


  public TrainingsPatchRequest customFields(Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public TrainingsPatchRequest putCustomFieldsItem(String key, BusinessEntitiesPatchRequestCustomFieldsValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * The custom field values for this [Training](https://developers.intellihr.io/docs/v1/)
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}", value = "The custom field values for this [Training](https://developers.intellihr.io/docs/v1/)")

  public Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields) {
    
    
    
    this.customFields = customFields;
  }


  public TrainingsPatchRequest status(TrainingsPatchRequestStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrainingsPatchRequestStatus getStatus() {
    return status;
  }


  public void setStatus(TrainingsPatchRequestStatus status) {
    
    
    
    this.status = status;
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
   * @return the TrainingsPatchRequest instance itself
   */
  public TrainingsPatchRequest putAdditionalProperty(String key, Object value) {
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
    TrainingsPatchRequest trainingsPatchRequest = (TrainingsPatchRequest) o;
    return Objects.equals(this.coordinatorPerson, trainingsPatchRequest.coordinatorPerson) &&
        Objects.equals(this.completionDate, trainingsPatchRequest.completionDate) &&
        Objects.equals(this.cost, trainingsPatchRequest.cost) &&
        Objects.equals(this.currency, trainingsPatchRequest.currency) &&
        Objects.equals(this.hours, trainingsPatchRequest.hours) &&
        Objects.equals(this.job, trainingsPatchRequest.job) &&
        Objects.equals(this.name, trainingsPatchRequest.name) &&
        Objects.equals(this.person, trainingsPatchRequest.person) &&
        Objects.equals(this.provider, trainingsPatchRequest.provider) &&
        Objects.equals(this.type, trainingsPatchRequest.type) &&
        Objects.equals(this.customFields, trainingsPatchRequest.customFields) &&
        Objects.equals(this.status, trainingsPatchRequest.status)&&
        Objects.equals(this.additionalProperties, trainingsPatchRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinatorPerson, completionDate, cost, currency, hours, job, name, person, provider, type, customFields, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrainingsPatchRequest {\n");
    sb.append("    coordinatorPerson: ").append(toIndentedString(coordinatorPerson)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("coordinatorPerson");
    openapiFields.add("completionDate");
    openapiFields.add("cost");
    openapiFields.add("currency");
    openapiFields.add("hours");
    openapiFields.add("job");
    openapiFields.add("name");
    openapiFields.add("person");
    openapiFields.add("provider");
    openapiFields.add("type");
    openapiFields.add("customFields");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrainingsPatchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrainingsPatchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrainingsPatchRequest is not found in the empty JSON string", TrainingsPatchRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `coordinatorPerson`
      if (jsonObj.get("coordinatorPerson") != null && !jsonObj.get("coordinatorPerson").isJsonNull()) {
        TrainingsPatchRequestCoordinatorPerson.validateJsonObject(jsonObj.getAsJsonObject("coordinatorPerson"));
      }
      if ((jsonObj.get("completionDate") != null && !jsonObj.get("completionDate").isJsonNull()) && !jsonObj.get("completionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `completionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("completionDate").toString()));
      }
      if ((jsonObj.get("cost") != null && !jsonObj.get("cost").isJsonNull()) && !jsonObj.get("cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cost").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("hours") != null && !jsonObj.get("hours").isJsonNull()) && !jsonObj.get("hours").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hours` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hours").toString()));
      }
      // validate the optional field `job`
      if (jsonObj.get("job") != null && !jsonObj.get("job").isJsonNull()) {
        TrainingsPatchRequestJob.validateJsonObject(jsonObj.getAsJsonObject("job"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `person`
      if (jsonObj.get("person") != null && !jsonObj.get("person").isJsonNull()) {
        TrainingsPatchRequestPerson.validateJsonObject(jsonObj.getAsJsonObject("person"));
      }
      // validate the optional field `provider`
      if (jsonObj.get("provider") != null && !jsonObj.get("provider").isJsonNull()) {
        TrainingsPatchRequestProvider.validateJsonObject(jsonObj.getAsJsonObject("provider"));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TrainingsPatchRequestType.validateJsonObject(jsonObj.getAsJsonObject("type"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        TrainingsPatchRequestStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrainingsPatchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrainingsPatchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrainingsPatchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrainingsPatchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TrainingsPatchRequest>() {
           @Override
           public void write(JsonWriter out, TrainingsPatchRequest value) throws IOException {
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
           public TrainingsPatchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrainingsPatchRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrainingsPatchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrainingsPatchRequest
  * @throws IOException if the JSON string is invalid with respect to TrainingsPatchRequest
  */
  public static TrainingsPatchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrainingsPatchRequest.class);
  }

 /**
  * Convert an instance of TrainingsPatchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

