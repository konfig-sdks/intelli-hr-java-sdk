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
 * DataPropertyInnerJobsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DataPropertyInnerJobsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Object startDate = null;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Object endDate = null;

  public static final String SERIALIZED_NAME_JOB_STATUS = "jobStatus";
  @SerializedName(SERIALIZED_NAME_JOB_STATUS)
  private String jobStatus;

  public static final String SERIALIZED_NAME_IS_ON_EXTENDED_LEAVE = "isOnExtendedLeave";
  @SerializedName(SERIALIZED_NAME_IS_ON_EXTENDED_LEAVE)
  private Boolean isOnExtendedLeave;

  public static final String SERIALIZED_NAME_IS_PRIMARY_JOB = "isPrimaryJob";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_JOB)
  private Boolean isPrimaryJob;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public DataPropertyInnerJobsInner() {
  }

  public DataPropertyInnerJobsInner id(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * The identifier string for the [Job](https://developers.intellihr.io/docs/v1/).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "The identifier string for the [Job](https://developers.intellihr.io/docs/v1/).")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 36) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 36.");
    }
    this.id = id;
  }


  public DataPropertyInnerJobsInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name/position title of this [Job](https://developers.intellihr.io/docs/v1/).
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software Engineer", value = "The name/position title of this [Job](https://developers.intellihr.io/docs/v1/).")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DataPropertyInnerJobsInner startDate(Object startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStartDate() {
    return startDate;
  }


  public void setStartDate(Object startDate) {
    
    
    
    this.startDate = startDate;
  }


  public DataPropertyInnerJobsInner endDate(Object endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEndDate() {
    return endDate;
  }


  public void setEndDate(Object endDate) {
    
    
    
    this.endDate = endDate;
  }


  public DataPropertyInnerJobsInner jobStatus(String jobStatus) {
    
    
    
    
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * The current status of this [Job](https://developers.intellihr.io/docs/v1/) within this organisation. Enum: &#x60;Past Job&#x60;, &#x60;Future Job&#x60;, &#x60;Ending Job&#x60;, &#x60;Current Job&#x60;.
   * @return jobStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Current Job", value = "The current status of this [Job](https://developers.intellihr.io/docs/v1/) within this organisation. Enum: `Past Job`, `Future Job`, `Ending Job`, `Current Job`.")

  public String getJobStatus() {
    return jobStatus;
  }


  public void setJobStatus(String jobStatus) {
    
    
    
    this.jobStatus = jobStatus;
  }


  public DataPropertyInnerJobsInner isOnExtendedLeave(Boolean isOnExtendedLeave) {
    
    
    
    
    this.isOnExtendedLeave = isOnExtendedLeave;
    return this;
  }

   /**
   * The current leave status of this [Job](https://developers.intellihr.io/docs/v1/).
   * @return isOnExtendedLeave
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "The current leave status of this [Job](https://developers.intellihr.io/docs/v1/).")

  public Boolean getIsOnExtendedLeave() {
    return isOnExtendedLeave;
  }


  public void setIsOnExtendedLeave(Boolean isOnExtendedLeave) {
    
    
    
    this.isOnExtendedLeave = isOnExtendedLeave;
  }


  public DataPropertyInnerJobsInner isPrimaryJob(Boolean isPrimaryJob) {
    
    
    
    
    this.isPrimaryJob = isPrimaryJob;
    return this;
  }

   /**
   * Whether this job is the primary job
   * @return isPrimaryJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether this job is the primary job")

  public Boolean getIsPrimaryJob() {
    return isPrimaryJob;
  }


  public void setIsPrimaryJob(Boolean isPrimaryJob) {
    
    
    
    this.isPrimaryJob = isPrimaryJob;
  }


  public DataPropertyInnerJobsInner link(String link) {
    
    
    
    
    this.link = link;
    return this;
  }

   /**
   * Link on the public api to get more information on this piece of data.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.intellihr.io/v1/jobs/8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "Link on the public api to get more information on this piece of data.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    
    
    
    this.link = link;
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
   * @return the DataPropertyInnerJobsInner instance itself
   */
  public DataPropertyInnerJobsInner putAdditionalProperty(String key, Object value) {
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
    DataPropertyInnerJobsInner dataPropertyInnerJobsInner = (DataPropertyInnerJobsInner) o;
    return Objects.equals(this.id, dataPropertyInnerJobsInner.id) &&
        Objects.equals(this.name, dataPropertyInnerJobsInner.name) &&
        Objects.equals(this.startDate, dataPropertyInnerJobsInner.startDate) &&
        Objects.equals(this.endDate, dataPropertyInnerJobsInner.endDate) &&
        Objects.equals(this.jobStatus, dataPropertyInnerJobsInner.jobStatus) &&
        Objects.equals(this.isOnExtendedLeave, dataPropertyInnerJobsInner.isOnExtendedLeave) &&
        Objects.equals(this.isPrimaryJob, dataPropertyInnerJobsInner.isPrimaryJob) &&
        Objects.equals(this.link, dataPropertyInnerJobsInner.link)&&
        Objects.equals(this.additionalProperties, dataPropertyInnerJobsInner.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDate, endDate, jobStatus, isOnExtendedLeave, isPrimaryJob, link, additionalProperties);
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
    sb.append("class DataPropertyInnerJobsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    isOnExtendedLeave: ").append(toIndentedString(isOnExtendedLeave)).append("\n");
    sb.append("    isPrimaryJob: ").append(toIndentedString(isPrimaryJob)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("jobStatus");
    openapiFields.add("isOnExtendedLeave");
    openapiFields.add("isPrimaryJob");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DataPropertyInnerJobsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DataPropertyInnerJobsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataPropertyInnerJobsInner is not found in the empty JSON string", DataPropertyInnerJobsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("jobStatus") != null && !jsonObj.get("jobStatus").isJsonNull()) && !jsonObj.get("jobStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobStatus").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataPropertyInnerJobsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataPropertyInnerJobsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataPropertyInnerJobsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataPropertyInnerJobsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DataPropertyInnerJobsInner>() {
           @Override
           public void write(JsonWriter out, DataPropertyInnerJobsInner value) throws IOException {
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
           public DataPropertyInnerJobsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DataPropertyInnerJobsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DataPropertyInnerJobsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataPropertyInnerJobsInner
  * @throws IOException if the JSON string is invalid with respect to DataPropertyInnerJobsInner
  */
  public static DataPropertyInnerJobsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataPropertyInnerJobsInner.class);
  }

 /**
  * Convert an instance of DataPropertyInnerJobsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

