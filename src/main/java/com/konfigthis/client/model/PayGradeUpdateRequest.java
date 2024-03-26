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
import com.konfigthis.client.model.PayGradeUpdateRequestEmploymentCondition;
import com.konfigthis.client.model.PayGradeUpdateRequestPayStepsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PayGradeUpdateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayGradeUpdateRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EFFECTIVE_FROM = "effectiveFrom";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FROM)
  private String effectiveFrom;

  public static final String SERIALIZED_NAME_EFFECTIVE_TO = "effectiveTo";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_TO)
  private String effectiveTo;

  public static final String SERIALIZED_NAME_IS_ENABLED = "isEnabled";
  @SerializedName(SERIALIZED_NAME_IS_ENABLED)
  private Boolean isEnabled;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_EMPLOYMENT_CONDITION = "employmentCondition";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_CONDITION)
  private PayGradeUpdateRequestEmploymentCondition employmentCondition;

  public static final String SERIALIZED_NAME_PAY_GRADE_TYPE = "payGradeType";
  @SerializedName(SERIALIZED_NAME_PAY_GRADE_TYPE)
  private String payGradeType;

  public static final String SERIALIZED_NAME_IS_OVERRIDABLE = "isOverridable";
  @SerializedName(SERIALIZED_NAME_IS_OVERRIDABLE)
  private Boolean isOverridable;

  public static final String SERIALIZED_NAME_PERMANENT_HOURLY_RATE = "permanentHourlyRate";
  @SerializedName(SERIALIZED_NAME_PERMANENT_HOURLY_RATE)
  private Double permanentHourlyRate;

  public static final String SERIALIZED_NAME_PERMANENT_HOURLY_RATE_CURRENCY = "permanentHourlyRateCurrency";
  @SerializedName(SERIALIZED_NAME_PERMANENT_HOURLY_RATE_CURRENCY)
  private String permanentHourlyRateCurrency;

  public static final String SERIALIZED_NAME_CASUAL_HOURLY_RATE = "casualHourlyRate";
  @SerializedName(SERIALIZED_NAME_CASUAL_HOURLY_RATE)
  private Double casualHourlyRate;

  public static final String SERIALIZED_NAME_CASUAL_HOURLY_RATE_CURRENCY = "casualHourlyRateCurrency";
  @SerializedName(SERIALIZED_NAME_CASUAL_HOURLY_RATE_CURRENCY)
  private String casualHourlyRateCurrency;

  public static final String SERIALIZED_NAME_ANNUAL_SALARY = "annualSalary";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALARY)
  private Double annualSalary;

  public static final String SERIALIZED_NAME_ANNUAL_SALARY_CURRENCY = "annualSalaryCurrency";
  @SerializedName(SERIALIZED_NAME_ANNUAL_SALARY_CURRENCY)
  private String annualSalaryCurrency;

  public static final String SERIALIZED_NAME_PAY_STEPS = "paySteps";
  @SerializedName(SERIALIZED_NAME_PAY_STEPS)
  private List<PayGradeUpdateRequestPayStepsInner> paySteps = null;

  public PayGradeUpdateRequest() {
  }

  public PayGradeUpdateRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/).
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The founder pay grade", value = "Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/).")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PayGradeUpdateRequest effectiveFrom(String effectiveFrom) {
    
    
    
    
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective from within the organisation. Note that this doesn&#39;t affect the availableFrom date of the overall Pay Grade itself.  Not providing an effectiveFrom will apply the changes from the beggining of time.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
   * @return effectiveFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2015-03-01T22:30:00+00:00", required = true, value = "The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective from within the organisation. Note that this doesn't affect the availableFrom date of the overall Pay Grade itself.  Not providing an effectiveFrom will apply the changes from the beggining of time.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.")

  public String getEffectiveFrom() {
    return effectiveFrom;
  }


  public void setEffectiveFrom(String effectiveFrom) {
    
    
    
    this.effectiveFrom = effectiveFrom;
  }


  public PayGradeUpdateRequest effectiveTo(String effectiveTo) {
    
    
    
    
    this.effectiveTo = effectiveTo;
    return this;
  }

   /**
   * The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective to within the organisation.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
   * @return effectiveTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-03-01T22:30:00+00:00", value = "The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective to within the organisation.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.")

  public String getEffectiveTo() {
    return effectiveTo;
  }


  public void setEffectiveTo(String effectiveTo) {
    
    
    
    this.effectiveTo = effectiveTo;
  }


  public PayGradeUpdateRequest isEnabled(Boolean isEnabled) {
    
    
    
    
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Toggle the availability of the [Pay Grade](https://developers.intellihr.io/docs/v1/) on or off within the organisation.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Toggle the availability of the [Pay Grade](https://developers.intellihr.io/docs/v1/) on or off within the organisation.")

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    
    
    
    this.isEnabled = isEnabled;
  }


  public PayGradeUpdateRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/).
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Founder", value = "The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/).")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public PayGradeUpdateRequest code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/).
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "L0", value = "Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/).")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public PayGradeUpdateRequest employmentCondition(PayGradeUpdateRequestEmploymentCondition employmentCondition) {
    
    
    
    
    this.employmentCondition = employmentCondition;
    return this;
  }

   /**
   * Get employmentCondition
   * @return employmentCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayGradeUpdateRequestEmploymentCondition getEmploymentCondition() {
    return employmentCondition;
  }


  public void setEmploymentCondition(PayGradeUpdateRequestEmploymentCondition employmentCondition) {
    
    
    
    this.employmentCondition = employmentCondition;
  }


  public PayGradeUpdateRequest payGradeType(String payGradeType) {
    
    
    
    
    this.payGradeType = payGradeType;
    return this;
  }

   /**
   * The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/). Enum: &#x60;FIXED&#x60; or &#x60;STEP&#x60;.
   * @return payGradeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIXED", value = "The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/). Enum: `FIXED` or `STEP`.")

  public String getPayGradeType() {
    return payGradeType;
  }


  public void setPayGradeType(String payGradeType) {
    
    
    
    this.payGradeType = payGradeType;
  }


  public PayGradeUpdateRequest isOverridable(Boolean isOverridable) {
    
    
    
    
    this.isOverridable = isOverridable;
    return this;
  }

   /**
   * Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten.
   * @return isOverridable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten.")

  public Boolean getIsOverridable() {
    return isOverridable;
  }


  public void setIsOverridable(Boolean isOverridable) {
    
    
    
    this.isOverridable = isOverridable;
  }


  public PayGradeUpdateRequest permanentHourlyRate(Double permanentHourlyRate) {
    
    
    
    
    this.permanentHourlyRate = permanentHourlyRate;
    return this;
  }

  public PayGradeUpdateRequest permanentHourlyRate(Integer permanentHourlyRate) {
    
    
    
    
    this.permanentHourlyRate = permanentHourlyRate.doubleValue();
    return this;
  }

   /**
   * Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
   * @return permanentHourlyRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25.5", value = "Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.")

  public Double getPermanentHourlyRate() {
    return permanentHourlyRate;
  }


  public void setPermanentHourlyRate(Double permanentHourlyRate) {
    
    
    
    this.permanentHourlyRate = permanentHourlyRate;
  }


  public PayGradeUpdateRequest permanentHourlyRateCurrency(String permanentHourlyRateCurrency) {
    
    
    
    
    this.permanentHourlyRateCurrency = permanentHourlyRateCurrency;
    return this;
  }

   /**
   * The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return permanentHourlyRateCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getPermanentHourlyRateCurrency() {
    return permanentHourlyRateCurrency;
  }


  public void setPermanentHourlyRateCurrency(String permanentHourlyRateCurrency) {
    
    
    
    this.permanentHourlyRateCurrency = permanentHourlyRateCurrency;
  }


  public PayGradeUpdateRequest casualHourlyRate(Double casualHourlyRate) {
    
    
    
    
    this.casualHourlyRate = casualHourlyRate;
    return this;
  }

  public PayGradeUpdateRequest casualHourlyRate(Integer casualHourlyRate) {
    
    
    
    
    this.casualHourlyRate = casualHourlyRate.doubleValue();
    return this;
  }

   /**
   * Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
   * @return casualHourlyRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25.5", value = "Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.")

  public Double getCasualHourlyRate() {
    return casualHourlyRate;
  }


  public void setCasualHourlyRate(Double casualHourlyRate) {
    
    
    
    this.casualHourlyRate = casualHourlyRate;
  }


  public PayGradeUpdateRequest casualHourlyRateCurrency(String casualHourlyRateCurrency) {
    
    
    
    
    this.casualHourlyRateCurrency = casualHourlyRateCurrency;
    return this;
  }

   /**
   * The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return casualHourlyRateCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getCasualHourlyRateCurrency() {
    return casualHourlyRateCurrency;
  }


  public void setCasualHourlyRateCurrency(String casualHourlyRateCurrency) {
    
    
    
    this.casualHourlyRateCurrency = casualHourlyRateCurrency;
  }


  public PayGradeUpdateRequest annualSalary(Double annualSalary) {
    
    
    
    
    this.annualSalary = annualSalary;
    return this;
  }

  public PayGradeUpdateRequest annualSalary(Integer annualSalary) {
    
    
    
    
    this.annualSalary = annualSalary.doubleValue();
    return this;
  }

   /**
   * Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
   * @return annualSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25.5", value = "Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.")

  public Double getAnnualSalary() {
    return annualSalary;
  }


  public void setAnnualSalary(Double annualSalary) {
    
    
    
    this.annualSalary = annualSalary;
  }


  public PayGradeUpdateRequest annualSalaryCurrency(String annualSalaryCurrency) {
    
    
    
    
    this.annualSalaryCurrency = annualSalaryCurrency;
    return this;
  }

   /**
   * The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return annualSalaryCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getAnnualSalaryCurrency() {
    return annualSalaryCurrency;
  }


  public void setAnnualSalaryCurrency(String annualSalaryCurrency) {
    
    
    
    this.annualSalaryCurrency = annualSalaryCurrency;
  }


  public PayGradeUpdateRequest paySteps(List<PayGradeUpdateRequestPayStepsInner> paySteps) {
    
    
    
    
    this.paySteps = paySteps;
    return this;
  }

  public PayGradeUpdateRequest addPayStepsItem(PayGradeUpdateRequestPayStepsInner payStepsItem) {
    if (this.paySteps == null) {
      this.paySteps = new ArrayList<>();
    }
    this.paySteps.add(payStepsItem);
    return this;
  }

   /**
   * An array of Paygrade Step Rates. This will replace the current Pay Steps with a new list.  Providing an &#x60;id&#x60; for an existing Pay Step will update that record instead of createing a new Pay Step.
   * @return paySteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Paygrade Step Rates. This will replace the current Pay Steps with a new list.  Providing an `id` for an existing Pay Step will update that record instead of createing a new Pay Step.")

  public List<PayGradeUpdateRequestPayStepsInner> getPaySteps() {
    return paySteps;
  }


  public void setPaySteps(List<PayGradeUpdateRequestPayStepsInner> paySteps) {
    
    
    
    this.paySteps = paySteps;
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
   * @return the PayGradeUpdateRequest instance itself
   */
  public PayGradeUpdateRequest putAdditionalProperty(String key, Object value) {
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
    PayGradeUpdateRequest payGradeUpdateRequest = (PayGradeUpdateRequest) o;
    return Objects.equals(this.description, payGradeUpdateRequest.description) &&
        Objects.equals(this.effectiveFrom, payGradeUpdateRequest.effectiveFrom) &&
        Objects.equals(this.effectiveTo, payGradeUpdateRequest.effectiveTo) &&
        Objects.equals(this.isEnabled, payGradeUpdateRequest.isEnabled) &&
        Objects.equals(this.name, payGradeUpdateRequest.name) &&
        Objects.equals(this.code, payGradeUpdateRequest.code) &&
        Objects.equals(this.employmentCondition, payGradeUpdateRequest.employmentCondition) &&
        Objects.equals(this.payGradeType, payGradeUpdateRequest.payGradeType) &&
        Objects.equals(this.isOverridable, payGradeUpdateRequest.isOverridable) &&
        Objects.equals(this.permanentHourlyRate, payGradeUpdateRequest.permanentHourlyRate) &&
        Objects.equals(this.permanentHourlyRateCurrency, payGradeUpdateRequest.permanentHourlyRateCurrency) &&
        Objects.equals(this.casualHourlyRate, payGradeUpdateRequest.casualHourlyRate) &&
        Objects.equals(this.casualHourlyRateCurrency, payGradeUpdateRequest.casualHourlyRateCurrency) &&
        Objects.equals(this.annualSalary, payGradeUpdateRequest.annualSalary) &&
        Objects.equals(this.annualSalaryCurrency, payGradeUpdateRequest.annualSalaryCurrency) &&
        Objects.equals(this.paySteps, payGradeUpdateRequest.paySteps)&&
        Objects.equals(this.additionalProperties, payGradeUpdateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, effectiveFrom, effectiveTo, isEnabled, name, code, employmentCondition, payGradeType, isOverridable, permanentHourlyRate, permanentHourlyRateCurrency, casualHourlyRate, casualHourlyRateCurrency, annualSalary, annualSalaryCurrency, paySteps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayGradeUpdateRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    employmentCondition: ").append(toIndentedString(employmentCondition)).append("\n");
    sb.append("    payGradeType: ").append(toIndentedString(payGradeType)).append("\n");
    sb.append("    isOverridable: ").append(toIndentedString(isOverridable)).append("\n");
    sb.append("    permanentHourlyRate: ").append(toIndentedString(permanentHourlyRate)).append("\n");
    sb.append("    permanentHourlyRateCurrency: ").append(toIndentedString(permanentHourlyRateCurrency)).append("\n");
    sb.append("    casualHourlyRate: ").append(toIndentedString(casualHourlyRate)).append("\n");
    sb.append("    casualHourlyRateCurrency: ").append(toIndentedString(casualHourlyRateCurrency)).append("\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("    annualSalaryCurrency: ").append(toIndentedString(annualSalaryCurrency)).append("\n");
    sb.append("    paySteps: ").append(toIndentedString(paySteps)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("effectiveFrom");
    openapiFields.add("effectiveTo");
    openapiFields.add("isEnabled");
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("employmentCondition");
    openapiFields.add("payGradeType");
    openapiFields.add("isOverridable");
    openapiFields.add("permanentHourlyRate");
    openapiFields.add("permanentHourlyRateCurrency");
    openapiFields.add("casualHourlyRate");
    openapiFields.add("casualHourlyRateCurrency");
    openapiFields.add("annualSalary");
    openapiFields.add("annualSalaryCurrency");
    openapiFields.add("paySteps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("effectiveFrom");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayGradeUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayGradeUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayGradeUpdateRequest is not found in the empty JSON string", PayGradeUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayGradeUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("effectiveFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveFrom").toString()));
      }
      if ((jsonObj.get("effectiveTo") != null && !jsonObj.get("effectiveTo").isJsonNull()) && !jsonObj.get("effectiveTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectiveTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectiveTo").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field `employmentCondition`
      if (jsonObj.get("employmentCondition") != null && !jsonObj.get("employmentCondition").isJsonNull()) {
        PayGradeUpdateRequestEmploymentCondition.validateJsonObject(jsonObj.getAsJsonObject("employmentCondition"));
      }
      if ((jsonObj.get("payGradeType") != null && !jsonObj.get("payGradeType").isJsonNull()) && !jsonObj.get("payGradeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payGradeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payGradeType").toString()));
      }
      if ((jsonObj.get("permanentHourlyRateCurrency") != null && !jsonObj.get("permanentHourlyRateCurrency").isJsonNull()) && !jsonObj.get("permanentHourlyRateCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permanentHourlyRateCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permanentHourlyRateCurrency").toString()));
      }
      if ((jsonObj.get("casualHourlyRateCurrency") != null && !jsonObj.get("casualHourlyRateCurrency").isJsonNull()) && !jsonObj.get("casualHourlyRateCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `casualHourlyRateCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("casualHourlyRateCurrency").toString()));
      }
      if ((jsonObj.get("annualSalaryCurrency") != null && !jsonObj.get("annualSalaryCurrency").isJsonNull()) && !jsonObj.get("annualSalaryCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annualSalaryCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annualSalaryCurrency").toString()));
      }
      if (jsonObj.get("paySteps") != null && !jsonObj.get("paySteps").isJsonNull()) {
        JsonArray jsonArraypaySteps = jsonObj.getAsJsonArray("paySteps");
        if (jsonArraypaySteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("paySteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `paySteps` to be an array in the JSON string but got `%s`", jsonObj.get("paySteps").toString()));
          }

          // validate the optional field `paySteps` (array)
          for (int i = 0; i < jsonArraypaySteps.size(); i++) {
            PayGradeUpdateRequestPayStepsInner.validateJsonObject(jsonArraypaySteps.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayGradeUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayGradeUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayGradeUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayGradeUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayGradeUpdateRequest>() {
           @Override
           public void write(JsonWriter out, PayGradeUpdateRequest value) throws IOException {
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
           public PayGradeUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayGradeUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayGradeUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayGradeUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to PayGradeUpdateRequest
  */
  public static PayGradeUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayGradeUpdateRequest.class);
  }

 /**
  * Convert an instance of PayGradeUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

