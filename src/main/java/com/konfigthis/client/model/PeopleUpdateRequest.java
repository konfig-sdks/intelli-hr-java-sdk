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
import com.konfigthis.client.model.PeopleUpdateRequestAddressesInner;
import com.konfigthis.client.model.PeopleUpdateRequestEmailAddressesInner;
import com.konfigthis.client.model.PeopleUpdateRequestEmergencyContact;
import com.konfigthis.client.model.PeopleUpdateRequestMedicalConditionsInner;
import com.konfigthis.client.model.PeopleUpdateRequestPhoneNumbersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * PeopleUpdateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PeopleUpdateRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private Object title = null;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private Object firstName = null;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private Object middleName = null;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PREFERRED_NAME = "preferredName";
  @SerializedName(SERIALIZED_NAME_PREFERRED_NAME)
  private Object preferredName = null;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private Object dateOfBirth = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender = "Other";

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private Object employeeNumber = null;

  public static final String SERIALIZED_NAME_EMERGENCY_CONTACT = "emergencyContact";
  @SerializedName(SERIALIZED_NAME_EMERGENCY_CONTACT)
  private PeopleUpdateRequestEmergencyContact emergencyContact;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "emailAddresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  private List<PeopleUpdateRequestEmailAddressesInner> emailAddresses = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBERS = "phoneNumbers";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBERS)
  private List<PeopleUpdateRequestPhoneNumbersInner> phoneNumbers = null;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<PeopleUpdateRequestAddressesInner> addresses = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = null;

  public static final String SERIALIZED_NAME_MEDICAL_CONDITIONS = "medicalConditions";
  @SerializedName(SERIALIZED_NAME_MEDICAL_CONDITIONS)
  private List<PeopleUpdateRequestMedicalConditionsInner> medicalConditions = null;

  public static final String SERIALIZED_NAME_WORK_RIGHT = "workRight";
  @SerializedName(SERIALIZED_NAME_WORK_RIGHT)
  private Object workRight = null;

  public static final String SERIALIZED_NAME_WORK_RIGHT_EXPIRY_DATE = "workRightExpiryDate";
  @SerializedName(SERIALIZED_NAME_WORK_RIGHT_EXPIRY_DATE)
  private Object workRightExpiryDate = null;

  public PeopleUpdateRequest() {
  }

  public PeopleUpdateRequest title(Object title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTitle() {
    return title;
  }


  public void setTitle(Object title) {
    
    
    
    this.title = title;
  }


  public PeopleUpdateRequest firstName(Object firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFirstName() {
    return firstName;
  }


  public void setFirstName(Object firstName) {
    
    
    
    this.firstName = firstName;
  }


  public PeopleUpdateRequest middleName(Object middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMiddleName() {
    return middleName;
  }


  public void setMiddleName(Object middleName) {
    
    
    
    this.middleName = middleName;
  }


  public PeopleUpdateRequest lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The [Person&#39;s](https://developers.intellihr.io/docs/v1/) Last Name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wayne", value = "The [Person's](https://developers.intellihr.io/docs/v1/) Last Name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public PeopleUpdateRequest preferredName(Object preferredName) {
    
    
    
    
    this.preferredName = preferredName;
    return this;
  }

   /**
   * Get preferredName
   * @return preferredName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPreferredName() {
    return preferredName;
  }


  public void setPreferredName(Object preferredName) {
    
    
    
    this.preferredName = preferredName;
  }


  public PeopleUpdateRequest dateOfBirth(Object dateOfBirth) {
    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(Object dateOfBirth) {
    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public PeopleUpdateRequest gender(String gender) {
    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * Human readable string for the [Person&#39;s](https://developers.intellihr.io/docs/v1/) gender, e.g. &#x60;Male&#x60;. Searching is done case-insensitively and &#39;starts-with&#39; e.g. passing &#x60;male&#x60; will match with a [Gender](https://developers.intellihr.io/docs/v1/) called \&quot;Male\&quot; as will \&quot;m\&quot; or \&quot;M\&quot;. If multiple [Genders](https://developers.intellihr.io/docs/v1/) match the first will be chosen. The gender options available are: &#x60;Female&#x60;, &#x60;Male&#x60;, &#x60;Non-binary&#x60;, &#x60;Other&#x60;, &#x60;Undisclosed&#x60;.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Other", value = "Human readable string for the [Person's](https://developers.intellihr.io/docs/v1/) gender, e.g. `Male`. Searching is done case-insensitively and 'starts-with' e.g. passing `male` will match with a [Gender](https://developers.intellihr.io/docs/v1/) called \"Male\" as will \"m\" or \"M\". If multiple [Genders](https://developers.intellihr.io/docs/v1/) match the first will be chosen. The gender options available are: `Female`, `Male`, `Non-binary`, `Other`, `Undisclosed`.")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    
    
    
    this.gender = gender;
  }


  public PeopleUpdateRequest employeeNumber(Object employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Get employeeNumber
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(Object employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public PeopleUpdateRequest emergencyContact(PeopleUpdateRequestEmergencyContact emergencyContact) {
    
    
    
    
    this.emergencyContact = emergencyContact;
    return this;
  }

   /**
   * Get emergencyContact
   * @return emergencyContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PeopleUpdateRequestEmergencyContact getEmergencyContact() {
    return emergencyContact;
  }


  public void setEmergencyContact(PeopleUpdateRequestEmergencyContact emergencyContact) {
    
    
    
    this.emergencyContact = emergencyContact;
  }


  public PeopleUpdateRequest emailAddresses(List<PeopleUpdateRequestEmailAddressesInner> emailAddresses) {
    
    
    
    
    this.emailAddresses = emailAddresses;
    return this;
  }

  public PeopleUpdateRequest addEmailAddressesItem(PeopleUpdateRequestEmailAddressesInner emailAddressesItem) {
    if (this.emailAddresses == null) {
      this.emailAddresses = new ArrayList<>();
    }
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Information about this [Person&#39;s](https://developers.intellihr.io/docs/v1/) email addresses. This will replace all of their current emails. The provided email addresses will be converted to lowercase. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary email address.
   * @return emailAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"email\":\"bruce.wayne@batman.org\",\"isPersonal\":false,\"isPrimary\":true,\"customFields\":{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}}]", value = "Information about this [Person's](https://developers.intellihr.io/docs/v1/) email addresses. This will replace all of their current emails. The provided email addresses will be converted to lowercase. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary email address.")

  public List<PeopleUpdateRequestEmailAddressesInner> getEmailAddresses() {
    return emailAddresses;
  }


  public void setEmailAddresses(List<PeopleUpdateRequestEmailAddressesInner> emailAddresses) {
    
    
    
    this.emailAddresses = emailAddresses;
  }


  public PeopleUpdateRequest phoneNumbers(List<PeopleUpdateRequestPhoneNumbersInner> phoneNumbers) {
    
    
    
    
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PeopleUpdateRequest addPhoneNumbersItem(PeopleUpdateRequestPhoneNumbersInner phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Information about this [Person&#39;s](https://developers.intellihr.io/docs/v1/) phone numbers. This will replace all of their current phone numbers. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary phone number.
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"number\":\"0491 570 156\",\"isPersonal\":false,\"isPrimary\":true,\"customFields\":{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}}]", value = "Information about this [Person's](https://developers.intellihr.io/docs/v1/) phone numbers. This will replace all of their current phone numbers. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary phone number.")

  public List<PeopleUpdateRequestPhoneNumbersInner> getPhoneNumbers() {
    return phoneNumbers;
  }


  public void setPhoneNumbers(List<PeopleUpdateRequestPhoneNumbersInner> phoneNumbers) {
    
    
    
    this.phoneNumbers = phoneNumbers;
  }


  public PeopleUpdateRequest addresses(List<PeopleUpdateRequestAddressesInner> addresses) {
    
    
    
    
    this.addresses = addresses;
    return this;
  }

  public PeopleUpdateRequest addAddressesItem(PeopleUpdateRequestAddressesInner addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Information about this [Person&#39;s](https://developers.intellihr.io/docs/v1/) addresses. This will replace all of their current addresses.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"addressType\":\"Home\",\"fullAddress\":\"Queen Street, Brisbane QLD\",\"country\":\"Australia\",\"postcode\":\"4000\",\"state\":\"Queensland\",\"street\":\"Queen Street\",\"suburb\":\"Brisbane\",\"isPrimary\":true,\"customFields\":{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}}]", value = "Information about this [Person's](https://developers.intellihr.io/docs/v1/) addresses. This will replace all of their current addresses.")

  public List<PeopleUpdateRequestAddressesInner> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<PeopleUpdateRequestAddressesInner> addresses) {
    
    
    
    this.addresses = addresses;
  }


  public PeopleUpdateRequest customFields(Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

  public PeopleUpdateRequest putCustomFieldsItem(String key, BusinessEntitiesPatchRequestCustomFieldsValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * The custom field values for this [Person](https://developers.intellihr.io/docs/v1/)
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"text_field_api_name\":{\"value\":\"Some text value\"},\"numeric_field_api_name\":{\"value\":\"50\"},\"single_select_api_name\":{\"value\":{\"label\":\"Drama\"}},\"multi_select_api_name\":{\"value\":{\"labels\":[\"Bananas\",\"Apples\"]}},\"people_dropdown_api_name\":{\"value\":[{\"person\":{\"id\":\"8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9X\",\"name\":\"Bruce Wayne\",\"primaryEmailAddress\":\"bruce.wayne@example.com\",\"employeeNumber\":\"00001\",\"autoIncrementIntellihrId\":\"1000\"},\"job\":{\"id\":\"569904c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Maintenance worker\"}},{\"person\":{\"id\":\"313fde44-f24e-4ec9-9473-0d0f3527222dX\",\"name\":\"Batman\",\"primaryEmailAddress\":\"batman@example.com\",\"employeeNumber\":\"00002\",\"autoIncrementIntellihrId\":\"1001\"},\"job\":{\"id\":\"653304c8-5d36-4c2f-afb0-525eeb8da32dX\",\"name\":\"Janitor\"}}]}}", value = "The custom field values for this [Person](https://developers.intellihr.io/docs/v1/)")

  public Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields) {
    
    
    
    this.customFields = customFields;
  }


  public PeopleUpdateRequest medicalConditions(List<PeopleUpdateRequestMedicalConditionsInner> medicalConditions) {
    
    
    
    
    this.medicalConditions = medicalConditions;
    return this;
  }

  public PeopleUpdateRequest addMedicalConditionsItem(PeopleUpdateRequestMedicalConditionsInner medicalConditionsItem) {
    if (this.medicalConditions == null) {
      this.medicalConditions = new ArrayList<>();
    }
    this.medicalConditions.add(medicalConditionsItem);
    return this;
  }

   /**
   * The medical conditions that this person has
   * @return medicalConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The medical conditions that this person has")

  public List<PeopleUpdateRequestMedicalConditionsInner> getMedicalConditions() {
    return medicalConditions;
  }


  public void setMedicalConditions(List<PeopleUpdateRequestMedicalConditionsInner> medicalConditions) {
    
    
    
    this.medicalConditions = medicalConditions;
  }


  public PeopleUpdateRequest workRight(Object workRight) {
    
    
    
    
    this.workRight = workRight;
    return this;
  }

   /**
   * Get workRight
   * @return workRight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getWorkRight() {
    return workRight;
  }


  public void setWorkRight(Object workRight) {
    
    
    
    this.workRight = workRight;
  }


  public PeopleUpdateRequest workRightExpiryDate(Object workRightExpiryDate) {
    
    
    
    
    this.workRightExpiryDate = workRightExpiryDate;
    return this;
  }

   /**
   * Get workRightExpiryDate
   * @return workRightExpiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getWorkRightExpiryDate() {
    return workRightExpiryDate;
  }


  public void setWorkRightExpiryDate(Object workRightExpiryDate) {
    
    
    
    this.workRightExpiryDate = workRightExpiryDate;
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
   * @return the PeopleUpdateRequest instance itself
   */
  public PeopleUpdateRequest putAdditionalProperty(String key, Object value) {
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
    PeopleUpdateRequest peopleUpdateRequest = (PeopleUpdateRequest) o;
    return Objects.equals(this.title, peopleUpdateRequest.title) &&
        Objects.equals(this.firstName, peopleUpdateRequest.firstName) &&
        Objects.equals(this.middleName, peopleUpdateRequest.middleName) &&
        Objects.equals(this.lastName, peopleUpdateRequest.lastName) &&
        Objects.equals(this.preferredName, peopleUpdateRequest.preferredName) &&
        Objects.equals(this.dateOfBirth, peopleUpdateRequest.dateOfBirth) &&
        Objects.equals(this.gender, peopleUpdateRequest.gender) &&
        Objects.equals(this.employeeNumber, peopleUpdateRequest.employeeNumber) &&
        Objects.equals(this.emergencyContact, peopleUpdateRequest.emergencyContact) &&
        Objects.equals(this.emailAddresses, peopleUpdateRequest.emailAddresses) &&
        Objects.equals(this.phoneNumbers, peopleUpdateRequest.phoneNumbers) &&
        Objects.equals(this.addresses, peopleUpdateRequest.addresses) &&
        Objects.equals(this.customFields, peopleUpdateRequest.customFields) &&
        Objects.equals(this.medicalConditions, peopleUpdateRequest.medicalConditions) &&
        Objects.equals(this.workRight, peopleUpdateRequest.workRight) &&
        Objects.equals(this.workRightExpiryDate, peopleUpdateRequest.workRightExpiryDate)&&
        Objects.equals(this.additionalProperties, peopleUpdateRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, firstName, middleName, lastName, preferredName, dateOfBirth, gender, employeeNumber, emergencyContact, emailAddresses, phoneNumbers, addresses, customFields, medicalConditions, workRight, workRightExpiryDate, additionalProperties);
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
    sb.append("class PeopleUpdateRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    emergencyContact: ").append(toIndentedString(emergencyContact)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    medicalConditions: ").append(toIndentedString(medicalConditions)).append("\n");
    sb.append("    workRight: ").append(toIndentedString(workRight)).append("\n");
    sb.append("    workRightExpiryDate: ").append(toIndentedString(workRightExpiryDate)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("firstName");
    openapiFields.add("middleName");
    openapiFields.add("lastName");
    openapiFields.add("preferredName");
    openapiFields.add("dateOfBirth");
    openapiFields.add("gender");
    openapiFields.add("employeeNumber");
    openapiFields.add("emergencyContact");
    openapiFields.add("emailAddresses");
    openapiFields.add("phoneNumbers");
    openapiFields.add("addresses");
    openapiFields.add("customFields");
    openapiFields.add("medicalConditions");
    openapiFields.add("workRight");
    openapiFields.add("workRightExpiryDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeopleUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeopleUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleUpdateRequest is not found in the empty JSON string", PeopleUpdateRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      // validate the optional field `emergencyContact`
      if (jsonObj.get("emergencyContact") != null && !jsonObj.get("emergencyContact").isJsonNull()) {
        PeopleUpdateRequestEmergencyContact.validateJsonObject(jsonObj.getAsJsonObject("emergencyContact"));
      }
      if (jsonObj.get("emailAddresses") != null && !jsonObj.get("emailAddresses").isJsonNull()) {
        JsonArray jsonArrayemailAddresses = jsonObj.getAsJsonArray("emailAddresses");
        if (jsonArrayemailAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emailAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emailAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("emailAddresses").toString()));
          }

          // validate the optional field `emailAddresses` (array)
          for (int i = 0; i < jsonArrayemailAddresses.size(); i++) {
            PeopleUpdateRequestEmailAddressesInner.validateJsonObject(jsonArrayemailAddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("phoneNumbers") != null && !jsonObj.get("phoneNumbers").isJsonNull()) {
        JsonArray jsonArrayphoneNumbers = jsonObj.getAsJsonArray("phoneNumbers");
        if (jsonArrayphoneNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("phoneNumbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `phoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("phoneNumbers").toString()));
          }

          // validate the optional field `phoneNumbers` (array)
          for (int i = 0; i < jsonArrayphoneNumbers.size(); i++) {
            PeopleUpdateRequestPhoneNumbersInner.validateJsonObject(jsonArrayphoneNumbers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            PeopleUpdateRequestAddressesInner.validateJsonObject(jsonArrayaddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("medicalConditions") != null && !jsonObj.get("medicalConditions").isJsonNull()) {
        JsonArray jsonArraymedicalConditions = jsonObj.getAsJsonArray("medicalConditions");
        if (jsonArraymedicalConditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("medicalConditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `medicalConditions` to be an array in the JSON string but got `%s`", jsonObj.get("medicalConditions").toString()));
          }

          // validate the optional field `medicalConditions` (array)
          for (int i = 0; i < jsonArraymedicalConditions.size(); i++) {
            PeopleUpdateRequestMedicalConditionsInner.validateJsonObject(jsonArraymedicalConditions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleUpdateRequest>() {
           @Override
           public void write(JsonWriter out, PeopleUpdateRequest value) throws IOException {
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
           public PeopleUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeopleUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeopleUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeopleUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to PeopleUpdateRequest
  */
  public static PeopleUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleUpdateRequest.class);
  }

 /**
  * Convert an instance of PeopleUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

