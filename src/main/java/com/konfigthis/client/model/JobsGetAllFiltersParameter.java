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
 * JobsGetAllFiltersParameter
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobsGetAllFiltersParameter {
  public static final String SERIALIZED_NAME_PERSON_ID = "personId";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;

  public static final String SERIALIZED_NAME_PERSON_NAME = "personName";
  @SerializedName(SERIALIZED_NAME_PERSON_NAME)
  private String personName;

  public static final String SERIALIZED_NAME_PRIMARY_EMAIL = "primaryEmail";
  @SerializedName(SERIALIZED_NAME_PRIMARY_EMAIL)
  private String primaryEmail;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employeeNumber";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_AUTO_INCREMENT_INTELLIHR_ID = "autoIncrementIntellihrId";
  @SerializedName(SERIALIZED_NAME_AUTO_INCREMENT_INTELLIHR_ID)
  private Double autoIncrementIntellihrId;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_JOB_NAME_AS_AT = "jobNameAsAt";
  @SerializedName(SERIALIZED_NAME_JOB_NAME_AS_AT)
  private String jobNameAsAt;

  public static final String SERIALIZED_NAME_JOB_STATUS = "jobStatus";
  @SerializedName(SERIALIZED_NAME_JOB_STATUS)
  private String jobStatus;

  public static final String SERIALIZED_NAME_JOB_ENDING_WITHIN = "jobEndingWithin";
  @SerializedName(SERIALIZED_NAME_JOB_ENDING_WITHIN)
  private String jobEndingWithin;

  public static final String SERIALIZED_NAME_JOB_ENDED_WITHIN = "jobEndedWithin";
  @SerializedName(SERIALIZED_NAME_JOB_ENDED_WITHIN)
  private String jobEndedWithin;

  public static final String SERIALIZED_NAME_UPDATED_WITHIN = "updatedWithin";
  @SerializedName(SERIALIZED_NAME_UPDATED_WITHIN)
  private String updatedWithin;

  public static final String SERIALIZED_NAME_WORK_TYPE = "workType";
  @SerializedName(SERIALIZED_NAME_WORK_TYPE)
  private String workType;

  public static final String SERIALIZED_NAME_IS_PRIMARY_JOB = "isPrimaryJob";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_JOB)
  private String isPrimaryJob;

  public static final String SERIALIZED_NAME_EMPLOYMENT_CONDITION_ID = "employmentConditionId";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_CONDITION_ID)
  private String employmentConditionId;

  public JobsGetAllFiltersParameter() {
  }

  public JobsGetAllFiltersParameter personId(String personId) {
    
    
    if (personId != null && personId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for personId. Length must be greater than or equal to 36.");
    }
    
    this.personId = personId;
    return this;
  }

   /**
   * The identifier string for the [Person](https://developers.intellihr.io/docs/v1/). This can be chained by &#x60;,&#x60; to search for multiple jobs  Example filter: &#x60;filters[personId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12", value = "The identifier string for the [Person](https://developers.intellihr.io/docs/v1/). This can be chained by `,` to search for multiple jobs  Example filter: `filters[personId][eq]=dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12`  This filter supports the equality `[eq]` operation")

  public String getPersonId() {
    return personId;
  }


  public void setPersonId(String personId) {
    
    
    if (personId != null && personId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for personId. Length must be greater than or equal to 36.");
    }
    this.personId = personId;
  }


  public JobsGetAllFiltersParameter personName(String personName) {
    
    
    
    
    this.personName = personName;
    return this;
  }

   /**
   * The name for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[personName][eq]&#x3D;Batman&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return personName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Batman", value = "The name for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: `filters[personName][eq]=Batman`  This filter supports the equality `[eq]` operation")

  public String getPersonName() {
    return personName;
  }


  public void setPersonName(String personName) {
    
    
    
    this.personName = personName;
  }


  public JobsGetAllFiltersParameter primaryEmail(String primaryEmail) {
    
    
    
    
    this.primaryEmail = primaryEmail;
    return this;
  }

   /**
   * The email address flagged as primary for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[primaryEmail][eq]&#x3D;bruce.wayne@example.com&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return primaryEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bruce.wayne@example.com", value = "The email address flagged as primary for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: `filters[primaryEmail][eq]=bruce.wayne@example.com`  This filter supports the equality `[eq]` operation")

  public String getPrimaryEmail() {
    return primaryEmail;
  }


  public void setPrimaryEmail(String primaryEmail) {
    
    
    
    this.primaryEmail = primaryEmail;
  }


  public JobsGetAllFiltersParameter employeeNumber(String employeeNumber) {
    
    
    
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * The employee number for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[employeeNumber][eq]&#x3D;00001&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00001", value = "The employee number for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: `filters[employeeNumber][eq]=00001`  This filter supports the equality `[eq]` operation")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    
    
    
    this.employeeNumber = employeeNumber;
  }


  public JobsGetAllFiltersParameter autoIncrementIntellihrId(Double autoIncrementIntellihrId) {
    
    
    
    
    this.autoIncrementIntellihrId = autoIncrementIntellihrId;
    return this;
  }

  public JobsGetAllFiltersParameter autoIncrementIntellihrId(Integer autoIncrementIntellihrId) {
    
    
    
    
    this.autoIncrementIntellihrId = autoIncrementIntellihrId.doubleValue();
    return this;
  }

   /**
   * The autogenerated number that uniquely identifies [Person](https://developers.intellihr.io/docs/v1/) in intelliHR to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[autoIncrementIntellihrId][eq]&#x3D;1000&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return autoIncrementIntellihrId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "The autogenerated number that uniquely identifies [Person](https://developers.intellihr.io/docs/v1/) in intelliHR to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: `filters[autoIncrementIntellihrId][eq]=1000`  This filter supports the equality `[eq]` operation")

  public Double getAutoIncrementIntellihrId() {
    return autoIncrementIntellihrId;
  }


  public void setAutoIncrementIntellihrId(Double autoIncrementIntellihrId) {
    
    
    
    this.autoIncrementIntellihrId = autoIncrementIntellihrId;
  }


  public JobsGetAllFiltersParameter jobId(String jobId) {
    
    
    
    
    this.jobId = jobId;
    return this;
  }

   /**
   * The identifier string for the [Job](https://developers.intellihr.io/docs/v1/). This can be chained by &#x60;,&#x60; to search for multiple jobs  Example filter: &#x60;filters[jobId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12", value = "The identifier string for the [Job](https://developers.intellihr.io/docs/v1/). This can be chained by `,` to search for multiple jobs  Example filter: `filters[jobId][eq]=dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12`  This filter supports the equality `[eq]` operation")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    
    
    
    this.jobId = jobId;
  }


  public JobsGetAllFiltersParameter jobName(String jobName) {
    
    
    
    
    this.jobName = jobName;
    return this;
  }

   /**
   * The name/position title for the [Job](https://developers.intellihr.io/docs/v1/).  Example filter: &#x60;filters[jobName][eq]&#x3D;Food%20Scientist&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Food%20Scientist", value = "The name/position title for the [Job](https://developers.intellihr.io/docs/v1/).  Example filter: `filters[jobName][eq]=Food%20Scientist`  This filter supports the equality `[eq]` operation")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    
    
    
    this.jobName = jobName;
  }


  public JobsGetAllFiltersParameter jobNameAsAt(String jobNameAsAt) {
    
    
    
    
    this.jobNameAsAt = jobNameAsAt;
    return this;
  }

   /**
   * The date to filter jobName. This filter should be used in conjunction with jobName filter above. If not provided, it defaults to today.  Example filter: &#x60;filters[jobNameAsAt][eq]&#x3D;2020-10-08T22%3A30%3A00%2B00%3A00&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return jobNameAsAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-08T22%3A30%3A00%2B00%3A00", value = "The date to filter jobName. This filter should be used in conjunction with jobName filter above. If not provided, it defaults to today.  Example filter: `filters[jobNameAsAt][eq]=2020-10-08T22%3A30%3A00%2B00%3A00`  This filter supports the equality `[eq]` operation")

  public String getJobNameAsAt() {
    return jobNameAsAt;
  }


  public void setJobNameAsAt(String jobNameAsAt) {
    
    
    
    this.jobNameAsAt = jobNameAsAt;
  }


  public JobsGetAllFiltersParameter jobStatus(String jobStatus) {
    
    
    
    
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * The current status of this [Job](https://developers.intellihr.io/docs/v1/) within this organisation. Enum: &#x60;Past Job&#x60;, &#x60;Future Job&#x60;, &#x60;Ending Job&#x60;, &#x60;Current Job&#x60;.  Example filter: &#x60;filters[jobStatus][eq]&#x3D;Current%20Job&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return jobStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Current%20Job", value = "The current status of this [Job](https://developers.intellihr.io/docs/v1/) within this organisation. Enum: `Past Job`, `Future Job`, `Ending Job`, `Current Job`.  Example filter: `filters[jobStatus][eq]=Current%20Job`  This filter supports the equality `[eq]` operation")

  public String getJobStatus() {
    return jobStatus;
  }


  public void setJobStatus(String jobStatus) {
    
    
    
    this.jobStatus = jobStatus;
  }


  public JobsGetAllFiltersParameter jobEndingWithin(String jobEndingWithin) {
    
    
    
    
    this.jobEndingWithin = jobEndingWithin;
    return this;
  }

   /**
   * The amount of days including today to filter jobs with an upcoming end date.  Example filter: &#x60;filters[jobEndingWithin][eq]&#x3D;14&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return jobEndingWithin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "The amount of days including today to filter jobs with an upcoming end date.  Example filter: `filters[jobEndingWithin][eq]=14`  This filter supports the equality `[eq]` operation")

  public String getJobEndingWithin() {
    return jobEndingWithin;
  }


  public void setJobEndingWithin(String jobEndingWithin) {
    
    
    
    this.jobEndingWithin = jobEndingWithin;
  }


  public JobsGetAllFiltersParameter jobEndedWithin(String jobEndedWithin) {
    
    
    
    
    this.jobEndedWithin = jobEndedWithin;
    return this;
  }

   /**
   * The amount of days including today to filter jobs that have already ended.  Example filter: &#x60;filters[jobEndedWithin][eq]&#x3D;14&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return jobEndedWithin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "The amount of days including today to filter jobs that have already ended.  Example filter: `filters[jobEndedWithin][eq]=14`  This filter supports the equality `[eq]` operation")

  public String getJobEndedWithin() {
    return jobEndedWithin;
  }


  public void setJobEndedWithin(String jobEndedWithin) {
    
    
    
    this.jobEndedWithin = jobEndedWithin;
  }


  public JobsGetAllFiltersParameter updatedWithin(String updatedWithin) {
    
    
    
    
    this.updatedWithin = updatedWithin;
    return this;
  }

   /**
   * The amount of days including today to filter updated jobs.  Example filter: &#x60;filters[updatedWithin][eq]&#x3D;14&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return updatedWithin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14", value = "The amount of days including today to filter updated jobs.  Example filter: `filters[updatedWithin][eq]=14`  This filter supports the equality `[eq]` operation")

  public String getUpdatedWithin() {
    return updatedWithin;
  }


  public void setUpdatedWithin(String updatedWithin) {
    
    
    
    this.updatedWithin = updatedWithin;
  }


  public JobsGetAllFiltersParameter workType(String workType) {
    
    
    
    
    this.workType = workType;
    return this;
  }

   /**
   * The name of the current [Work Type](https://developers.intellihr.io/docs/v1/) for the job.  Example filter: &#x60;filters[workType][eq]&#x3D;Fixed%20Contract&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return workType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fixed%20Contract", value = "The name of the current [Work Type](https://developers.intellihr.io/docs/v1/) for the job.  Example filter: `filters[workType][eq]=Fixed%20Contract`  This filter supports the equality `[eq]` operation")

  public String getWorkType() {
    return workType;
  }


  public void setWorkType(String workType) {
    
    
    
    this.workType = workType;
  }


  public JobsGetAllFiltersParameter isPrimaryJob(String isPrimaryJob) {
    
    
    
    
    this.isPrimaryJob = isPrimaryJob;
    return this;
  }

   /**
   * Whether this job is the primary job on the [Person](https://developers.intellihr.io/docs/v1/). Parse &#39;true&#39; to filter primary job. Parse &#39;false&#39; for non-primary job  Example filter: &#x60;filters[isPrimaryJob][eq]&#x3D;true&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return isPrimaryJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether this job is the primary job on the [Person](https://developers.intellihr.io/docs/v1/). Parse 'true' to filter primary job. Parse 'false' for non-primary job  Example filter: `filters[isPrimaryJob][eq]=true`  This filter supports the equality `[eq]` operation")

  public String getIsPrimaryJob() {
    return isPrimaryJob;
  }


  public void setIsPrimaryJob(String isPrimaryJob) {
    
    
    
    this.isPrimaryJob = isPrimaryJob;
  }


  public JobsGetAllFiltersParameter employmentConditionId(String employmentConditionId) {
    
    
    if (employmentConditionId != null && employmentConditionId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for employmentConditionId. Length must be greater than or equal to 36.");
    }
    
    this.employmentConditionId = employmentConditionId;
    return this;
  }

   /**
   * The identifier string for the current [Employment Condition](https://developers.intellihr.io/docs/v1/) of the job.  Example filter: &#x60;filters[employmentConditionId][eq]&#x3D;8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation
   * @return employmentConditionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9", value = "The identifier string for the current [Employment Condition](https://developers.intellihr.io/docs/v1/) of the job.  Example filter: `filters[employmentConditionId][eq]=8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9`  This filter supports the equality `[eq]` operation")

  public String getEmploymentConditionId() {
    return employmentConditionId;
  }


  public void setEmploymentConditionId(String employmentConditionId) {
    
    
    if (employmentConditionId != null && employmentConditionId.length() < 36) {
      throw new IllegalArgumentException("Invalid value for employmentConditionId. Length must be greater than or equal to 36.");
    }
    this.employmentConditionId = employmentConditionId;
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
   * @return the JobsGetAllFiltersParameter instance itself
   */
  public JobsGetAllFiltersParameter putAdditionalProperty(String key, Object value) {
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
    JobsGetAllFiltersParameter jobsGetAllFiltersParameter = (JobsGetAllFiltersParameter) o;
    return Objects.equals(this.personId, jobsGetAllFiltersParameter.personId) &&
        Objects.equals(this.personName, jobsGetAllFiltersParameter.personName) &&
        Objects.equals(this.primaryEmail, jobsGetAllFiltersParameter.primaryEmail) &&
        Objects.equals(this.employeeNumber, jobsGetAllFiltersParameter.employeeNumber) &&
        Objects.equals(this.autoIncrementIntellihrId, jobsGetAllFiltersParameter.autoIncrementIntellihrId) &&
        Objects.equals(this.jobId, jobsGetAllFiltersParameter.jobId) &&
        Objects.equals(this.jobName, jobsGetAllFiltersParameter.jobName) &&
        Objects.equals(this.jobNameAsAt, jobsGetAllFiltersParameter.jobNameAsAt) &&
        Objects.equals(this.jobStatus, jobsGetAllFiltersParameter.jobStatus) &&
        Objects.equals(this.jobEndingWithin, jobsGetAllFiltersParameter.jobEndingWithin) &&
        Objects.equals(this.jobEndedWithin, jobsGetAllFiltersParameter.jobEndedWithin) &&
        Objects.equals(this.updatedWithin, jobsGetAllFiltersParameter.updatedWithin) &&
        Objects.equals(this.workType, jobsGetAllFiltersParameter.workType) &&
        Objects.equals(this.isPrimaryJob, jobsGetAllFiltersParameter.isPrimaryJob) &&
        Objects.equals(this.employmentConditionId, jobsGetAllFiltersParameter.employmentConditionId)&&
        Objects.equals(this.additionalProperties, jobsGetAllFiltersParameter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, personName, primaryEmail, employeeNumber, autoIncrementIntellihrId, jobId, jobName, jobNameAsAt, jobStatus, jobEndingWithin, jobEndedWithin, updatedWithin, workType, isPrimaryJob, employmentConditionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsGetAllFiltersParameter {\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    primaryEmail: ").append(toIndentedString(primaryEmail)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    autoIncrementIntellihrId: ").append(toIndentedString(autoIncrementIntellihrId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobNameAsAt: ").append(toIndentedString(jobNameAsAt)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    jobEndingWithin: ").append(toIndentedString(jobEndingWithin)).append("\n");
    sb.append("    jobEndedWithin: ").append(toIndentedString(jobEndedWithin)).append("\n");
    sb.append("    updatedWithin: ").append(toIndentedString(updatedWithin)).append("\n");
    sb.append("    workType: ").append(toIndentedString(workType)).append("\n");
    sb.append("    isPrimaryJob: ").append(toIndentedString(isPrimaryJob)).append("\n");
    sb.append("    employmentConditionId: ").append(toIndentedString(employmentConditionId)).append("\n");
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
    openapiFields.add("personId");
    openapiFields.add("personName");
    openapiFields.add("primaryEmail");
    openapiFields.add("employeeNumber");
    openapiFields.add("autoIncrementIntellihrId");
    openapiFields.add("jobId");
    openapiFields.add("jobName");
    openapiFields.add("jobNameAsAt");
    openapiFields.add("jobStatus");
    openapiFields.add("jobEndingWithin");
    openapiFields.add("jobEndedWithin");
    openapiFields.add("updatedWithin");
    openapiFields.add("workType");
    openapiFields.add("isPrimaryJob");
    openapiFields.add("employmentConditionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobsGetAllFiltersParameter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobsGetAllFiltersParameter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobsGetAllFiltersParameter is not found in the empty JSON string", JobsGetAllFiltersParameter.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("personId") != null && !jsonObj.get("personId").isJsonNull()) && !jsonObj.get("personId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personId").toString()));
      }
      if ((jsonObj.get("personName") != null && !jsonObj.get("personName").isJsonNull()) && !jsonObj.get("personName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personName").toString()));
      }
      if ((jsonObj.get("primaryEmail") != null && !jsonObj.get("primaryEmail").isJsonNull()) && !jsonObj.get("primaryEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryEmail").toString()));
      }
      if ((jsonObj.get("employeeNumber") != null && !jsonObj.get("employeeNumber").isJsonNull()) && !jsonObj.get("employeeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeNumber").toString()));
      }
      if ((jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if ((jsonObj.get("jobName") != null && !jsonObj.get("jobName").isJsonNull()) && !jsonObj.get("jobName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobName").toString()));
      }
      if ((jsonObj.get("jobNameAsAt") != null && !jsonObj.get("jobNameAsAt").isJsonNull()) && !jsonObj.get("jobNameAsAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobNameAsAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobNameAsAt").toString()));
      }
      if ((jsonObj.get("jobStatus") != null && !jsonObj.get("jobStatus").isJsonNull()) && !jsonObj.get("jobStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobStatus").toString()));
      }
      if ((jsonObj.get("jobEndingWithin") != null && !jsonObj.get("jobEndingWithin").isJsonNull()) && !jsonObj.get("jobEndingWithin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobEndingWithin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobEndingWithin").toString()));
      }
      if ((jsonObj.get("jobEndedWithin") != null && !jsonObj.get("jobEndedWithin").isJsonNull()) && !jsonObj.get("jobEndedWithin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobEndedWithin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobEndedWithin").toString()));
      }
      if ((jsonObj.get("updatedWithin") != null && !jsonObj.get("updatedWithin").isJsonNull()) && !jsonObj.get("updatedWithin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedWithin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedWithin").toString()));
      }
      if ((jsonObj.get("workType") != null && !jsonObj.get("workType").isJsonNull()) && !jsonObj.get("workType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workType").toString()));
      }
      if ((jsonObj.get("isPrimaryJob") != null && !jsonObj.get("isPrimaryJob").isJsonNull()) && !jsonObj.get("isPrimaryJob").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isPrimaryJob` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isPrimaryJob").toString()));
      }
      if ((jsonObj.get("employmentConditionId") != null && !jsonObj.get("employmentConditionId").isJsonNull()) && !jsonObj.get("employmentConditionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employmentConditionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employmentConditionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobsGetAllFiltersParameter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobsGetAllFiltersParameter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobsGetAllFiltersParameter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobsGetAllFiltersParameter.class));

       return (TypeAdapter<T>) new TypeAdapter<JobsGetAllFiltersParameter>() {
           @Override
           public void write(JsonWriter out, JobsGetAllFiltersParameter value) throws IOException {
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
           public JobsGetAllFiltersParameter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobsGetAllFiltersParameter instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobsGetAllFiltersParameter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobsGetAllFiltersParameter
  * @throws IOException if the JSON string is invalid with respect to JobsGetAllFiltersParameter
  */
  public static JobsGetAllFiltersParameter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobsGetAllFiltersParameter.class);
  }

 /**
  * Convert an instance of JobsGetAllFiltersParameter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

