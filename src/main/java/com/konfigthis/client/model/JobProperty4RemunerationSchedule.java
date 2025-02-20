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
import com.konfigthis.client.model.CustomFieldsResponse;
import com.konfigthis.client.model.JobProperty4RemunerationScheduleAdditionsInner;
import com.konfigthis.client.model.JobProperty4RemunerationScheduleAdditionsToTotalInner;
import com.konfigthis.client.model.JobProperty4RemunerationScheduleBreakdownsInner;
import com.konfigthis.client.model.JobProperty4RemunerationScheduleDeductionsInner;
import com.konfigthis.client.model.JobProperty4RemunerationScheduleEmploymentCondition;
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
 * The current remuneration details for this [Job](https://developers.intellihr.io/docs/v1/), including information such as salary and hourly pay, all [Jobs](https://developers.intellihr.io/docs/v1/) have a remuneration schedule but for unpaid employees they will have a special &#x60;No Remuneration Schedule&#x60; schedule.
 */
@ApiModel(description = "The current remuneration details for this [Job](https://developers.intellihr.io/docs/v1/), including information such as salary and hourly pay, all [Jobs](https://developers.intellihr.io/docs/v1/) have a remuneration schedule but for unpaid employees they will have a special `No Remuneration Schedule` schedule.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobProperty4RemunerationSchedule {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BASE_ANNUAL_SALARY = "baseAnnualSalary";
  @SerializedName(SERIALIZED_NAME_BASE_ANNUAL_SALARY)
  private Double baseAnnualSalary;

  public static final String SERIALIZED_NAME_BASE_HOURLY_RATE = "baseHourlyRate";
  @SerializedName(SERIALIZED_NAME_BASE_HOURLY_RATE)
  private Double baseHourlyRate;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_HOURS_PER_CYCLE = "hoursPerCycle";
  @SerializedName(SERIALIZED_NAME_HOURS_PER_CYCLE)
  private Double hoursPerCycle;

  public static final String SERIALIZED_NAME_PAY_CYCLE = "payCycle";
  @SerializedName(SERIALIZED_NAME_PAY_CYCLE)
  private String payCycle;

  public static final String SERIALIZED_NAME_ANNUAL_PACKAGE = "annualPackage";
  @SerializedName(SERIALIZED_NAME_ANNUAL_PACKAGE)
  private Double annualPackage;

  public static final String SERIALIZED_NAME_HOURLY_PACKAGE = "hourlyPackage";
  @SerializedName(SERIALIZED_NAME_HOURLY_PACKAGE)
  private Double hourlyPackage;

  public static final String SERIALIZED_NAME_CURRENCY_CONVERSION_OCCURRED = "currencyConversionOccurred";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONVERSION_OCCURRED)
  private Boolean currencyConversionOccurred;

  public static final String SERIALIZED_NAME_EMPLOYMENT_CONDITION = "employmentCondition";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_CONDITION)
  private JobProperty4RemunerationScheduleEmploymentCondition employmentCondition;

  public static final String SERIALIZED_NAME_ADDITIONS = "additions";
  @SerializedName(SERIALIZED_NAME_ADDITIONS)
  private List<JobProperty4RemunerationScheduleAdditionsInner> additions = null;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private List<JobProperty4RemunerationScheduleDeductionsInner> deductions = null;

  public static final String SERIALIZED_NAME_ADDITIONS_TO_TOTAL = "additionsToTotal";
  @SerializedName(SERIALIZED_NAME_ADDITIONS_TO_TOTAL)
  private List<JobProperty4RemunerationScheduleAdditionsToTotalInner> additionsToTotal = null;

  public static final String SERIALIZED_NAME_BREAKDOWNS = "breakdowns";
  @SerializedName(SERIALIZED_NAME_BREAKDOWNS)
  private List<JobProperty4RemunerationScheduleBreakdownsInner> breakdowns = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private CustomFieldsResponse customFields = null;

  public JobProperty4RemunerationSchedule() {
  }

  public JobProperty4RemunerationSchedule type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The method in which this remuneration schedule is paid, if a person is unpaid then this will be &#x60;No Remuneration Schedule&#x60;. Enum: &#x60;Annual Salary&#x60;, &#x60;Hourly Rate&#x60;, &#x60;No Remuneration Schedule&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The method in which this remuneration schedule is paid, if a person is unpaid then this will be `No Remuneration Schedule`. Enum: `Annual Salary`, `Hourly Rate`, `No Remuneration Schedule`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public JobProperty4RemunerationSchedule baseAnnualSalary(Double baseAnnualSalary) {
    
    
    
    
    this.baseAnnualSalary = baseAnnualSalary;
    return this;
  }

  public JobProperty4RemunerationSchedule baseAnnualSalary(Integer baseAnnualSalary) {
    
    
    
    
    this.baseAnnualSalary = baseAnnualSalary.doubleValue();
    return this;
  }

   /**
   * The Base Salary paid yearly, this is an approximation if they are paid hourly. Note that if both baseAnnualSalary and baseHourlyRate are provided in a create or patch request, the baseHourlyRate will be ignored.
   * @return baseAnnualSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50000", value = "The Base Salary paid yearly, this is an approximation if they are paid hourly. Note that if both baseAnnualSalary and baseHourlyRate are provided in a create or patch request, the baseHourlyRate will be ignored.")

  public Double getBaseAnnualSalary() {
    return baseAnnualSalary;
  }


  public void setBaseAnnualSalary(Double baseAnnualSalary) {
    
    
    
    this.baseAnnualSalary = baseAnnualSalary;
  }


  public JobProperty4RemunerationSchedule baseHourlyRate(Double baseHourlyRate) {
    
    
    
    
    this.baseHourlyRate = baseHourlyRate;
    return this;
  }

  public JobProperty4RemunerationSchedule baseHourlyRate(Integer baseHourlyRate) {
    
    
    
    
    this.baseHourlyRate = baseHourlyRate.doubleValue();
    return this;
  }

   /**
   * The Base Rate paid hourly, this is an approximation if they are paid annually. Note that if both baseAnnualSalary and baseHourlyRate are provided in a create or patch request, the baseHourlyRate will be ignored.
   * @return baseHourlyRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "The Base Rate paid hourly, this is an approximation if they are paid annually. Note that if both baseAnnualSalary and baseHourlyRate are provided in a create or patch request, the baseHourlyRate will be ignored.")

  public Double getBaseHourlyRate() {
    return baseHourlyRate;
  }


  public void setBaseHourlyRate(Double baseHourlyRate) {
    
    
    
    this.baseHourlyRate = baseHourlyRate;
  }


  public JobProperty4RemunerationSchedule currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency that the base and total amounts that this job is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUD", value = "The currency that the base and total amounts that this job is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public JobProperty4RemunerationSchedule hoursPerCycle(Double hoursPerCycle) {
    
    
    
    
    this.hoursPerCycle = hoursPerCycle;
    return this;
  }

  public JobProperty4RemunerationSchedule hoursPerCycle(Integer hoursPerCycle) {
    
    
    
    
    this.hoursPerCycle = hoursPerCycle.doubleValue();
    return this;
  }

   /**
   * How many hours worked per payCycle.    0 (zero) signifies that the hours are variable per pay cycle
   * @return hoursPerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "80", value = "How many hours worked per payCycle.    0 (zero) signifies that the hours are variable per pay cycle")

  public Double getHoursPerCycle() {
    return hoursPerCycle;
  }


  public void setHoursPerCycle(Double hoursPerCycle) {
    
    
    
    this.hoursPerCycle = hoursPerCycle;
  }


  public JobProperty4RemunerationSchedule payCycle(String payCycle) {
    
    
    
    
    this.payCycle = payCycle;
    return this;
  }

   /**
   * The cycle that the job is paid on. Enum: &#x60;Weekly&#x60;, &#x60;Fortnightly&#x60;, &#x60;Monthly&#x60;, &#x60;Bi-Monthly&#x60;.
   * @return payCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fortnightly", value = "The cycle that the job is paid on. Enum: `Weekly`, `Fortnightly`, `Monthly`, `Bi-Monthly`.")

  public String getPayCycle() {
    return payCycle;
  }


  public void setPayCycle(String payCycle) {
    
    
    
    this.payCycle = payCycle;
  }


  public JobProperty4RemunerationSchedule annualPackage(Double annualPackage) {
    
    
    
    
    this.annualPackage = annualPackage;
    return this;
  }

  public JobProperty4RemunerationSchedule annualPackage(Integer annualPackage) {
    
    
    
    
    this.annualPackage = annualPackage.doubleValue();
    return this;
  }

   /**
   * The total package paid yearly including additions and deductions. This amount is calculated by adding the Base Annual Salary and additions minus the deductions.
   * @return annualPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60000", value = "The total package paid yearly including additions and deductions. This amount is calculated by adding the Base Annual Salary and additions minus the deductions.")

  public Double getAnnualPackage() {
    return annualPackage;
  }


  public void setAnnualPackage(Double annualPackage) {
    
    
    
    this.annualPackage = annualPackage;
  }


  public JobProperty4RemunerationSchedule hourlyPackage(Double hourlyPackage) {
    
    
    
    
    this.hourlyPackage = hourlyPackage;
    return this;
  }

  public JobProperty4RemunerationSchedule hourlyPackage(Integer hourlyPackage) {
    
    
    
    
    this.hourlyPackage = hourlyPackage.doubleValue();
    return this;
  }

   /**
   * The total package paid hourly including additions and deductions. This amount is calculated by dividing the Annual Package by the total number of hours per annum.
   * @return hourlyPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "28", value = "The total package paid hourly including additions and deductions. This amount is calculated by dividing the Annual Package by the total number of hours per annum.")

  public Double getHourlyPackage() {
    return hourlyPackage;
  }


  public void setHourlyPackage(Double hourlyPackage) {
    
    
    
    this.hourlyPackage = hourlyPackage;
  }


  public JobProperty4RemunerationSchedule currencyConversionOccurred(Boolean currencyConversionOccurred) {
    
    
    
    
    this.currencyConversionOccurred = currencyConversionOccurred;
    return this;
  }

   /**
   * If any conversion had to be performed between addition and deduction currencies when calculating the annual package.
   * @return currencyConversionOccurred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If any conversion had to be performed between addition and deduction currencies when calculating the annual package.")

  public Boolean getCurrencyConversionOccurred() {
    return currencyConversionOccurred;
  }


  public void setCurrencyConversionOccurred(Boolean currencyConversionOccurred) {
    
    
    
    this.currencyConversionOccurred = currencyConversionOccurred;
  }


  public JobProperty4RemunerationSchedule employmentCondition(JobProperty4RemunerationScheduleEmploymentCondition employmentCondition) {
    
    
    
    
    this.employmentCondition = employmentCondition;
    return this;
  }

   /**
   * Get employmentCondition
   * @return employmentCondition
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobProperty4RemunerationScheduleEmploymentCondition getEmploymentCondition() {
    return employmentCondition;
  }


  public void setEmploymentCondition(JobProperty4RemunerationScheduleEmploymentCondition employmentCondition) {
    
    
    
    this.employmentCondition = employmentCondition;
  }


  public JobProperty4RemunerationSchedule additions(List<JobProperty4RemunerationScheduleAdditionsInner> additions) {
    
    
    
    
    this.additions = additions;
    return this;
  }

  public JobProperty4RemunerationSchedule addAdditionsItem(JobProperty4RemunerationScheduleAdditionsInner additionsItem) {
    if (this.additions == null) {
      this.additions = new ArrayList<>();
    }
    this.additions.add(additionsItem);
    return this;
  }

   /**
   * An array of Additions for this Remuneration Schedule.
   * @return additions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Additions for this Remuneration Schedule.")

  public List<JobProperty4RemunerationScheduleAdditionsInner> getAdditions() {
    return additions;
  }


  public void setAdditions(List<JobProperty4RemunerationScheduleAdditionsInner> additions) {
    
    
    
    this.additions = additions;
  }


  public JobProperty4RemunerationSchedule deductions(List<JobProperty4RemunerationScheduleDeductionsInner> deductions) {
    
    
    
    
    this.deductions = deductions;
    return this;
  }

  public JobProperty4RemunerationSchedule addDeductionsItem(JobProperty4RemunerationScheduleDeductionsInner deductionsItem) {
    if (this.deductions == null) {
      this.deductions = new ArrayList<>();
    }
    this.deductions.add(deductionsItem);
    return this;
  }

   /**
   * An array of Deductions for this Remuneration Schedule. Note that this deductions value has been deprecated, you should now use &#x60;breakdowns&#x60;
   * @return deductions
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Deductions for this Remuneration Schedule. Note that this deductions value has been deprecated, you should now use `breakdowns`")

  public List<JobProperty4RemunerationScheduleDeductionsInner> getDeductions() {
    return deductions;
  }


  public void setDeductions(List<JobProperty4RemunerationScheduleDeductionsInner> deductions) {
    
    
    
    this.deductions = deductions;
  }


  public JobProperty4RemunerationSchedule additionsToTotal(List<JobProperty4RemunerationScheduleAdditionsToTotalInner> additionsToTotal) {
    
    
    
    
    this.additionsToTotal = additionsToTotal;
    return this;
  }

  public JobProperty4RemunerationSchedule addAdditionsToTotalItem(JobProperty4RemunerationScheduleAdditionsToTotalInner additionsToTotalItem) {
    if (this.additionsToTotal == null) {
      this.additionsToTotal = new ArrayList<>();
    }
    this.additionsToTotal.add(additionsToTotalItem);
    return this;
  }

   /**
   * An array of Additions applied to the package after all other components for this Remuneration Schedule.
   * @return additionsToTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Additions applied to the package after all other components for this Remuneration Schedule.")

  public List<JobProperty4RemunerationScheduleAdditionsToTotalInner> getAdditionsToTotal() {
    return additionsToTotal;
  }


  public void setAdditionsToTotal(List<JobProperty4RemunerationScheduleAdditionsToTotalInner> additionsToTotal) {
    
    
    
    this.additionsToTotal = additionsToTotal;
  }


  public JobProperty4RemunerationSchedule breakdowns(List<JobProperty4RemunerationScheduleBreakdownsInner> breakdowns) {
    
    
    
    
    this.breakdowns = breakdowns;
    return this;
  }

  public JobProperty4RemunerationSchedule addBreakdownsItem(JobProperty4RemunerationScheduleBreakdownsInner breakdownsItem) {
    if (this.breakdowns == null) {
      this.breakdowns = new ArrayList<>();
    }
    this.breakdowns.add(breakdownsItem);
    return this;
  }

   /**
   * An array of Breakdowns for this Remuneration Schedule. Breakdowns will not be used to calculate the total package.
   * @return breakdowns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Breakdowns for this Remuneration Schedule. Breakdowns will not be used to calculate the total package.")

  public List<JobProperty4RemunerationScheduleBreakdownsInner> getBreakdowns() {
    return breakdowns;
  }


  public void setBreakdowns(List<JobProperty4RemunerationScheduleBreakdownsInner> breakdowns) {
    
    
    
    this.breakdowns = breakdowns;
  }


  public JobProperty4RemunerationSchedule customFields(CustomFieldsResponse customFields) {
    
    
    
    
    this.customFields = customFields;
    return this;
  }

   /**
   * The custom field values for this Remuneration Schedule
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom field values for this Remuneration Schedule")

  public CustomFieldsResponse getCustomFields() {
    return customFields;
  }


  public void setCustomFields(CustomFieldsResponse customFields) {
    
    
    
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
   * @return the JobProperty4RemunerationSchedule instance itself
   */
  public JobProperty4RemunerationSchedule putAdditionalProperty(String key, Object value) {
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
    JobProperty4RemunerationSchedule jobProperty4RemunerationSchedule = (JobProperty4RemunerationSchedule) o;
    return Objects.equals(this.type, jobProperty4RemunerationSchedule.type) &&
        Objects.equals(this.baseAnnualSalary, jobProperty4RemunerationSchedule.baseAnnualSalary) &&
        Objects.equals(this.baseHourlyRate, jobProperty4RemunerationSchedule.baseHourlyRate) &&
        Objects.equals(this.currency, jobProperty4RemunerationSchedule.currency) &&
        Objects.equals(this.hoursPerCycle, jobProperty4RemunerationSchedule.hoursPerCycle) &&
        Objects.equals(this.payCycle, jobProperty4RemunerationSchedule.payCycle) &&
        Objects.equals(this.annualPackage, jobProperty4RemunerationSchedule.annualPackage) &&
        Objects.equals(this.hourlyPackage, jobProperty4RemunerationSchedule.hourlyPackage) &&
        Objects.equals(this.currencyConversionOccurred, jobProperty4RemunerationSchedule.currencyConversionOccurred) &&
        Objects.equals(this.employmentCondition, jobProperty4RemunerationSchedule.employmentCondition) &&
        Objects.equals(this.additions, jobProperty4RemunerationSchedule.additions) &&
        Objects.equals(this.deductions, jobProperty4RemunerationSchedule.deductions) &&
        Objects.equals(this.additionsToTotal, jobProperty4RemunerationSchedule.additionsToTotal) &&
        Objects.equals(this.breakdowns, jobProperty4RemunerationSchedule.breakdowns) &&
        Objects.equals(this.customFields, jobProperty4RemunerationSchedule.customFields)&&
        Objects.equals(this.additionalProperties, jobProperty4RemunerationSchedule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, baseAnnualSalary, baseHourlyRate, currency, hoursPerCycle, payCycle, annualPackage, hourlyPackage, currencyConversionOccurred, employmentCondition, additions, deductions, additionsToTotal, breakdowns, customFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProperty4RemunerationSchedule {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseAnnualSalary: ").append(toIndentedString(baseAnnualSalary)).append("\n");
    sb.append("    baseHourlyRate: ").append(toIndentedString(baseHourlyRate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    hoursPerCycle: ").append(toIndentedString(hoursPerCycle)).append("\n");
    sb.append("    payCycle: ").append(toIndentedString(payCycle)).append("\n");
    sb.append("    annualPackage: ").append(toIndentedString(annualPackage)).append("\n");
    sb.append("    hourlyPackage: ").append(toIndentedString(hourlyPackage)).append("\n");
    sb.append("    currencyConversionOccurred: ").append(toIndentedString(currencyConversionOccurred)).append("\n");
    sb.append("    employmentCondition: ").append(toIndentedString(employmentCondition)).append("\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    additionsToTotal: ").append(toIndentedString(additionsToTotal)).append("\n");
    sb.append("    breakdowns: ").append(toIndentedString(breakdowns)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("baseAnnualSalary");
    openapiFields.add("baseHourlyRate");
    openapiFields.add("currency");
    openapiFields.add("hoursPerCycle");
    openapiFields.add("payCycle");
    openapiFields.add("annualPackage");
    openapiFields.add("hourlyPackage");
    openapiFields.add("currencyConversionOccurred");
    openapiFields.add("employmentCondition");
    openapiFields.add("additions");
    openapiFields.add("deductions");
    openapiFields.add("additionsToTotal");
    openapiFields.add("breakdowns");
    openapiFields.add("customFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobProperty4RemunerationSchedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobProperty4RemunerationSchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobProperty4RemunerationSchedule is not found in the empty JSON string", JobProperty4RemunerationSchedule.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("payCycle") != null && !jsonObj.get("payCycle").isJsonNull()) && !jsonObj.get("payCycle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payCycle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payCycle").toString()));
      }
      // validate the optional field `employmentCondition`
      if (jsonObj.get("employmentCondition") != null && !jsonObj.get("employmentCondition").isJsonNull()) {
        JobProperty4RemunerationScheduleEmploymentCondition.validateJsonObject(jsonObj.getAsJsonObject("employmentCondition"));
      }
      if (jsonObj.get("additions") != null && !jsonObj.get("additions").isJsonNull()) {
        JsonArray jsonArrayadditions = jsonObj.getAsJsonArray("additions");
        if (jsonArrayadditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additions` to be an array in the JSON string but got `%s`", jsonObj.get("additions").toString()));
          }

          // validate the optional field `additions` (array)
          for (int i = 0; i < jsonArrayadditions.size(); i++) {
            JobProperty4RemunerationScheduleAdditionsInner.validateJsonObject(jsonArrayadditions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("deductions") != null && !jsonObj.get("deductions").isJsonNull()) {
        JsonArray jsonArraydeductions = jsonObj.getAsJsonArray("deductions");
        if (jsonArraydeductions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("deductions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `deductions` to be an array in the JSON string but got `%s`", jsonObj.get("deductions").toString()));
          }

          // validate the optional field `deductions` (array)
          for (int i = 0; i < jsonArraydeductions.size(); i++) {
            JobProperty4RemunerationScheduleDeductionsInner.validateJsonObject(jsonArraydeductions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("additionsToTotal") != null && !jsonObj.get("additionsToTotal").isJsonNull()) {
        JsonArray jsonArrayadditionsToTotal = jsonObj.getAsJsonArray("additionsToTotal");
        if (jsonArrayadditionsToTotal != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionsToTotal").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionsToTotal` to be an array in the JSON string but got `%s`", jsonObj.get("additionsToTotal").toString()));
          }

          // validate the optional field `additionsToTotal` (array)
          for (int i = 0; i < jsonArrayadditionsToTotal.size(); i++) {
            JobProperty4RemunerationScheduleAdditionsToTotalInner.validateJsonObject(jsonArrayadditionsToTotal.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("breakdowns") != null && !jsonObj.get("breakdowns").isJsonNull()) {
        JsonArray jsonArraybreakdowns = jsonObj.getAsJsonArray("breakdowns");
        if (jsonArraybreakdowns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("breakdowns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `breakdowns` to be an array in the JSON string but got `%s`", jsonObj.get("breakdowns").toString()));
          }

          // validate the optional field `breakdowns` (array)
          for (int i = 0; i < jsonArraybreakdowns.size(); i++) {
            JobProperty4RemunerationScheduleBreakdownsInner.validateJsonObject(jsonArraybreakdowns.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobProperty4RemunerationSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobProperty4RemunerationSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobProperty4RemunerationSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobProperty4RemunerationSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<JobProperty4RemunerationSchedule>() {
           @Override
           public void write(JsonWriter out, JobProperty4RemunerationSchedule value) throws IOException {
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
           public JobProperty4RemunerationSchedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobProperty4RemunerationSchedule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobProperty4RemunerationSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobProperty4RemunerationSchedule
  * @throws IOException if the JSON string is invalid with respect to JobProperty4RemunerationSchedule
  */
  public static JobProperty4RemunerationSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobProperty4RemunerationSchedule.class);
  }

 /**
  * Convert an instance of JobProperty4RemunerationSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

