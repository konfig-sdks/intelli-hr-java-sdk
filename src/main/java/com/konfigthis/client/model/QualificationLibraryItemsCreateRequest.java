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
 * QualificationLibraryItemsCreateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class QualificationLibraryItemsCreateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE_ID = "qualificationTypeId";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE_ID)
  private String qualificationTypeId;

  /**
   * The expiry type for this library item
   */
  @JsonAdapter(QualificationExpiryTypeEnum.Adapter.class)
 public enum QualificationExpiryTypeEnum {
    INAPPLICABLE("EXPIRY_INAPPLICABLE"),
    
    OPTIONAL("EXPIRY_OPTIONAL"),
    
    REQUIRED("EXPIRY_REQUIRED");

    private String value;

    QualificationExpiryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualificationExpiryTypeEnum fromValue(String value) {
      for (QualificationExpiryTypeEnum b : QualificationExpiryTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualificationExpiryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualificationExpiryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualificationExpiryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualificationExpiryTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALIFICATION_EXPIRY_TYPE = "qualificationExpiryType";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_EXPIRY_TYPE)
  private QualificationExpiryTypeEnum qualificationExpiryType;

  /**
   * The expiry type for this library item
   */
  @JsonAdapter(QualificationRegistrationNumberVisibilityTypeEnum.Adapter.class)
 public enum QualificationRegistrationNumberVisibilityTypeEnum {
    INAPPLICABLE("REGISTRATION_NUMBER_INAPPLICABLE"),
    
    OPTIONAL("REGISTRATION_NUMBER_OPTIONAL"),
    
    REQUIRED("REGISTRATION_NUMBER_REQUIRED");

    private String value;

    QualificationRegistrationNumberVisibilityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualificationRegistrationNumberVisibilityTypeEnum fromValue(String value) {
      for (QualificationRegistrationNumberVisibilityTypeEnum b : QualificationRegistrationNumberVisibilityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualificationRegistrationNumberVisibilityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualificationRegistrationNumberVisibilityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualificationRegistrationNumberVisibilityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualificationRegistrationNumberVisibilityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALIFICATION_REGISTRATION_NUMBER_VISIBILITY_TYPE = "qualificationRegistrationNumberVisibilityType";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_REGISTRATION_NUMBER_VISIBILITY_TYPE)
  private QualificationRegistrationNumberVisibilityTypeEnum qualificationRegistrationNumberVisibilityType;

  /**
   * If documents are required for this library item
   */
  @JsonAdapter(QualificationAttachmentRequirementTypeEnum.Adapter.class)
 public enum QualificationAttachmentRequirementTypeEnum {
    OPTIONAL("DOCUMENTS_OPTIONAL"),
    
    REQUIRED("DOCUMENTS_REQUIRED");

    private String value;

    QualificationAttachmentRequirementTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualificationAttachmentRequirementTypeEnum fromValue(String value) {
      for (QualificationAttachmentRequirementTypeEnum b : QualificationAttachmentRequirementTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualificationAttachmentRequirementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualificationAttachmentRequirementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualificationAttachmentRequirementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualificationAttachmentRequirementTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALIFICATION_ATTACHMENT_REQUIREMENT_TYPE = "qualificationAttachmentRequirementType";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ATTACHMENT_REQUIREMENT_TYPE)
  private QualificationAttachmentRequirementTypeEnum qualificationAttachmentRequirementType;

  public static final String SERIALIZED_NAME_EXPIRY_WARNING_PERIOD = "expiryWarningPeriod";
  @SerializedName(SERIALIZED_NAME_EXPIRY_WARNING_PERIOD)
  private Double expiryWarningPeriod;

  public static final String SERIALIZED_NAME_SEND_EXPIRY_WARNING = "sendExpiryWarning";
  @SerializedName(SERIALIZED_NAME_SEND_EXPIRY_WARNING)
  private Boolean sendExpiryWarning;

  public QualificationLibraryItemsCreateRequest() {
  }

  public QualificationLibraryItemsCreateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of this [Qualification Library Item](https://developers.intellihr.io/docs/v1/)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of this [Qualification Library Item](https://developers.intellihr.io/docs/v1/)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public QualificationLibraryItemsCreateRequest qualificationTypeId(String qualificationTypeId) {
    
    
    if (qualificationTypeId != null && qualificationTypeId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for qualificationTypeId. Length must be greater than or equal to 36.");
    }
    
    this.qualificationTypeId = qualificationTypeId;
    return this;
  }

   /**
   * The identifier string for the Qualification Type Id.
   * @return qualificationTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", required = true, value = "The identifier string for the Qualification Type Id.")

  public String getQualificationTypeId() {
    return qualificationTypeId;
  }


  public void setQualificationTypeId(String qualificationTypeId) {
    
    
    if (qualificationTypeId != null && qualificationTypeId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for qualificationTypeId. Length must be greater than or equal to 36.");
    }
    this.qualificationTypeId = qualificationTypeId;
  }


  public QualificationLibraryItemsCreateRequest qualificationExpiryType(QualificationExpiryTypeEnum qualificationExpiryType) {
    
    
    
    
    this.qualificationExpiryType = qualificationExpiryType;
    return this;
  }

   /**
   * The expiry type for this library item
   * @return qualificationExpiryType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The expiry type for this library item")

  public QualificationExpiryTypeEnum getQualificationExpiryType() {
    return qualificationExpiryType;
  }


  public void setQualificationExpiryType(QualificationExpiryTypeEnum qualificationExpiryType) {
    
    
    
    this.qualificationExpiryType = qualificationExpiryType;
  }


  public QualificationLibraryItemsCreateRequest qualificationRegistrationNumberVisibilityType(QualificationRegistrationNumberVisibilityTypeEnum qualificationRegistrationNumberVisibilityType) {
    
    
    
    
    this.qualificationRegistrationNumberVisibilityType = qualificationRegistrationNumberVisibilityType;
    return this;
  }

   /**
   * The expiry type for this library item
   * @return qualificationRegistrationNumberVisibilityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The expiry type for this library item")

  public QualificationRegistrationNumberVisibilityTypeEnum getQualificationRegistrationNumberVisibilityType() {
    return qualificationRegistrationNumberVisibilityType;
  }


  public void setQualificationRegistrationNumberVisibilityType(QualificationRegistrationNumberVisibilityTypeEnum qualificationRegistrationNumberVisibilityType) {
    
    
    
    this.qualificationRegistrationNumberVisibilityType = qualificationRegistrationNumberVisibilityType;
  }


  public QualificationLibraryItemsCreateRequest qualificationAttachmentRequirementType(QualificationAttachmentRequirementTypeEnum qualificationAttachmentRequirementType) {
    
    
    
    
    this.qualificationAttachmentRequirementType = qualificationAttachmentRequirementType;
    return this;
  }

   /**
   * If documents are required for this library item
   * @return qualificationAttachmentRequirementType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "If documents are required for this library item")

  public QualificationAttachmentRequirementTypeEnum getQualificationAttachmentRequirementType() {
    return qualificationAttachmentRequirementType;
  }


  public void setQualificationAttachmentRequirementType(QualificationAttachmentRequirementTypeEnum qualificationAttachmentRequirementType) {
    
    
    
    this.qualificationAttachmentRequirementType = qualificationAttachmentRequirementType;
  }


  public QualificationLibraryItemsCreateRequest expiryWarningPeriod(Double expiryWarningPeriod) {
    
    
    
    
    this.expiryWarningPeriod = expiryWarningPeriod;
    return this;
  }

  public QualificationLibraryItemsCreateRequest expiryWarningPeriod(Integer expiryWarningPeriod) {
    
    
    
    
    this.expiryWarningPeriod = expiryWarningPeriod.doubleValue();
    return this;
  }

   /**
   * Period in days, that there is a warning before the expiry of the qualification. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.
   * @return expiryWarningPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Period in days, that there is a warning before the expiry of the qualification. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.")

  public Double getExpiryWarningPeriod() {
    return expiryWarningPeriod;
  }


  public void setExpiryWarningPeriod(Double expiryWarningPeriod) {
    
    
    
    this.expiryWarningPeriod = expiryWarningPeriod;
  }


  public QualificationLibraryItemsCreateRequest sendExpiryWarning(Boolean sendExpiryWarning) {
    
    
    
    
    this.sendExpiryWarning = sendExpiryWarning;
    return this;
  }

   /**
   * If this [Qualification Library Item](https://developers.intellihr.io/docs/v1/) will send expiry warning/s using the periods defined. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.
   * @return sendExpiryWarning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this [Qualification Library Item](https://developers.intellihr.io/docs/v1/) will send expiry warning/s using the periods defined. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.")

  public Boolean getSendExpiryWarning() {
    return sendExpiryWarning;
  }


  public void setSendExpiryWarning(Boolean sendExpiryWarning) {
    
    
    
    this.sendExpiryWarning = sendExpiryWarning;
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
   * @return the QualificationLibraryItemsCreateRequest instance itself
   */
  public QualificationLibraryItemsCreateRequest putAdditionalProperty(String key, Object value) {
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
    QualificationLibraryItemsCreateRequest qualificationLibraryItemsCreateRequest = (QualificationLibraryItemsCreateRequest) o;
    return Objects.equals(this.name, qualificationLibraryItemsCreateRequest.name) &&
        Objects.equals(this.qualificationTypeId, qualificationLibraryItemsCreateRequest.qualificationTypeId) &&
        Objects.equals(this.qualificationExpiryType, qualificationLibraryItemsCreateRequest.qualificationExpiryType) &&
        Objects.equals(this.qualificationRegistrationNumberVisibilityType, qualificationLibraryItemsCreateRequest.qualificationRegistrationNumberVisibilityType) &&
        Objects.equals(this.qualificationAttachmentRequirementType, qualificationLibraryItemsCreateRequest.qualificationAttachmentRequirementType) &&
        Objects.equals(this.expiryWarningPeriod, qualificationLibraryItemsCreateRequest.expiryWarningPeriod) &&
        Objects.equals(this.sendExpiryWarning, qualificationLibraryItemsCreateRequest.sendExpiryWarning)&&
        Objects.equals(this.additionalProperties, qualificationLibraryItemsCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, qualificationTypeId, qualificationExpiryType, qualificationRegistrationNumberVisibilityType, qualificationAttachmentRequirementType, expiryWarningPeriod, sendExpiryWarning, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationLibraryItemsCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualificationTypeId: ").append(toIndentedString(qualificationTypeId)).append("\n");
    sb.append("    qualificationExpiryType: ").append(toIndentedString(qualificationExpiryType)).append("\n");
    sb.append("    qualificationRegistrationNumberVisibilityType: ").append(toIndentedString(qualificationRegistrationNumberVisibilityType)).append("\n");
    sb.append("    qualificationAttachmentRequirementType: ").append(toIndentedString(qualificationAttachmentRequirementType)).append("\n");
    sb.append("    expiryWarningPeriod: ").append(toIndentedString(expiryWarningPeriod)).append("\n");
    sb.append("    sendExpiryWarning: ").append(toIndentedString(sendExpiryWarning)).append("\n");
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
    openapiFields.add("qualificationTypeId");
    openapiFields.add("qualificationExpiryType");
    openapiFields.add("qualificationRegistrationNumberVisibilityType");
    openapiFields.add("qualificationAttachmentRequirementType");
    openapiFields.add("expiryWarningPeriod");
    openapiFields.add("sendExpiryWarning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("qualificationTypeId");
    openapiRequiredFields.add("qualificationExpiryType");
    openapiRequiredFields.add("qualificationRegistrationNumberVisibilityType");
    openapiRequiredFields.add("qualificationAttachmentRequirementType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QualificationLibraryItemsCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QualificationLibraryItemsCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QualificationLibraryItemsCreateRequest is not found in the empty JSON string", QualificationLibraryItemsCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QualificationLibraryItemsCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("qualificationTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualificationTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualificationTypeId").toString()));
      }
      if (!jsonObj.get("qualificationExpiryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualificationExpiryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualificationExpiryType").toString()));
      }
      if (!jsonObj.get("qualificationRegistrationNumberVisibilityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualificationRegistrationNumberVisibilityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualificationRegistrationNumberVisibilityType").toString()));
      }
      if (!jsonObj.get("qualificationAttachmentRequirementType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualificationAttachmentRequirementType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualificationAttachmentRequirementType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationLibraryItemsCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationLibraryItemsCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationLibraryItemsCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationLibraryItemsCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationLibraryItemsCreateRequest>() {
           @Override
           public void write(JsonWriter out, QualificationLibraryItemsCreateRequest value) throws IOException {
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
           public QualificationLibraryItemsCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QualificationLibraryItemsCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QualificationLibraryItemsCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationLibraryItemsCreateRequest
  * @throws IOException if the JSON string is invalid with respect to QualificationLibraryItemsCreateRequest
  */
  public static QualificationLibraryItemsCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationLibraryItemsCreateRequest.class);
  }

 /**
  * Convert an instance of QualificationLibraryItemsCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

