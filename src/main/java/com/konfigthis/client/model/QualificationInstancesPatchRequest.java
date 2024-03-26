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
 * QualificationInstancesPatchRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class QualificationInstancesPatchRequest {
  /**
   * The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    DRAFT("DRAFT"),
    
    AWAITING_APPROVAL("AWAITING_APPROVAL"),
    
    DECLINED("DECLINED"),
    
    APPROVED("APPROVED"),
    
    REVOKED("REVOKED"),
    
    EXPIRED("EXPIRED"),
    
    EXPIRING_SOON("EXPIRING_SOON"),
    
    CURRENT("CURRENT"),
    
    FUTURE("FUTURE"),
    
    RENEWING("RENEWING"),
    
    NON_COMPLIANT("NON_COMPLIANT");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ISSUING_ORGANISATION = "issuingOrganisation";
  @SerializedName(SERIALIZED_NAME_ISSUING_ORGANISATION)
  private Object issuingOrganisation = null;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registrationNumber";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private Object registrationNumber = null;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issueDate";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private Object issueDate = null;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private Object expiryDate = null;

  public static final String SERIALIZED_NAME_EXPIRY_NOTIFICATION_QUEUED_AT = "expiryNotificationQueuedAt";
  @SerializedName(SERIALIZED_NAME_EXPIRY_NOTIFICATION_QUEUED_AT)
  private Object expiryNotificationQueuedAt = null;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private Object notes = null;

  public QualificationInstancesPatchRequest() {
  }

  public QualificationInstancesPatchRequest status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public QualificationInstancesPatchRequest issuingOrganisation(Object issuingOrganisation) {
    
    
    
    
    this.issuingOrganisation = issuingOrganisation;
    return this;
  }

   /**
   * Get issuingOrganisation
   * @return issuingOrganisation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIssuingOrganisation() {
    return issuingOrganisation;
  }


  public void setIssuingOrganisation(Object issuingOrganisation) {
    
    
    
    this.issuingOrganisation = issuingOrganisation;
  }


  public QualificationInstancesPatchRequest registrationNumber(Object registrationNumber) {
    
    
    
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(Object registrationNumber) {
    
    
    
    this.registrationNumber = registrationNumber;
  }


  public QualificationInstancesPatchRequest issueDate(Object issueDate) {
    
    
    
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(Object issueDate) {
    
    
    
    this.issueDate = issueDate;
  }


  public QualificationInstancesPatchRequest expiryDate(Object expiryDate) {
    
    
    
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(Object expiryDate) {
    
    
    
    this.expiryDate = expiryDate;
  }


  public QualificationInstancesPatchRequest expiryNotificationQueuedAt(Object expiryNotificationQueuedAt) {
    
    
    
    
    this.expiryNotificationQueuedAt = expiryNotificationQueuedAt;
    return this;
  }

   /**
   * Get expiryNotificationQueuedAt
   * @return expiryNotificationQueuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExpiryNotificationQueuedAt() {
    return expiryNotificationQueuedAt;
  }


  public void setExpiryNotificationQueuedAt(Object expiryNotificationQueuedAt) {
    
    
    
    this.expiryNotificationQueuedAt = expiryNotificationQueuedAt;
  }


  public QualificationInstancesPatchRequest notes(Object notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getNotes() {
    return notes;
  }


  public void setNotes(Object notes) {
    
    
    
    this.notes = notes;
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
   * @return the QualificationInstancesPatchRequest instance itself
   */
  public QualificationInstancesPatchRequest putAdditionalProperty(String key, Object value) {
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
    QualificationInstancesPatchRequest qualificationInstancesPatchRequest = (QualificationInstancesPatchRequest) o;
    return Objects.equals(this.status, qualificationInstancesPatchRequest.status) &&
        Objects.equals(this.issuingOrganisation, qualificationInstancesPatchRequest.issuingOrganisation) &&
        Objects.equals(this.registrationNumber, qualificationInstancesPatchRequest.registrationNumber) &&
        Objects.equals(this.issueDate, qualificationInstancesPatchRequest.issueDate) &&
        Objects.equals(this.expiryDate, qualificationInstancesPatchRequest.expiryDate) &&
        Objects.equals(this.expiryNotificationQueuedAt, qualificationInstancesPatchRequest.expiryNotificationQueuedAt) &&
        Objects.equals(this.notes, qualificationInstancesPatchRequest.notes)&&
        Objects.equals(this.additionalProperties, qualificationInstancesPatchRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, issuingOrganisation, registrationNumber, issueDate, expiryDate, expiryNotificationQueuedAt, notes, additionalProperties);
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
    sb.append("class QualificationInstancesPatchRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    issuingOrganisation: ").append(toIndentedString(issuingOrganisation)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    expiryNotificationQueuedAt: ").append(toIndentedString(expiryNotificationQueuedAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("issuingOrganisation");
    openapiFields.add("registrationNumber");
    openapiFields.add("issueDate");
    openapiFields.add("expiryDate");
    openapiFields.add("expiryNotificationQueuedAt");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QualificationInstancesPatchRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QualificationInstancesPatchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QualificationInstancesPatchRequest is not found in the empty JSON string", QualificationInstancesPatchRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationInstancesPatchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationInstancesPatchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationInstancesPatchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationInstancesPatchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationInstancesPatchRequest>() {
           @Override
           public void write(JsonWriter out, QualificationInstancesPatchRequest value) throws IOException {
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
           public QualificationInstancesPatchRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QualificationInstancesPatchRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QualificationInstancesPatchRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationInstancesPatchRequest
  * @throws IOException if the JSON string is invalid with respect to QualificationInstancesPatchRequest
  */
  public static QualificationInstancesPatchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationInstancesPatchRequest.class);
  }

 /**
  * Convert an instance of QualificationInstancesPatchRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

