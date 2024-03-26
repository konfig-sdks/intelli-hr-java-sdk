# JobsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRecord**](JobsApi.md#createRecord) | **POST** /jobs | Create a new Job |
| [**findById**](JobsApi.md#findById) | **GET** /jobs/{id} | Find a Job by ID |
| [**getAll**](JobsApi.md#getAll) | **GET** /jobs | List all Jobs |
| [**updateAttributes**](JobsApi.md#updateAttributes) | **PATCH** /jobs/{id} | Patch an existing Job |


<a name="createRecord"></a>
# **createRecord**
> JobCreateResponse createRecord(jobCreateRequest).execute();

Create a new Job

Create a new Job record with the provided data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    JobCreateRequestPerson person = new JobCreateRequestPerson();
    String companyStartDate = "companyStartDate_example"; // The date this [Job](https://developers.intellihr.io/docs/v1/) started or will start within the organisation. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String name = "name_example"; // The job name assigned to this [Job](https://developers.intellihr.io/docs/v1/). Will attempt to match to an existing [Position Title](https://developers.intellihr.io/docs/v1/), otherwise creates a new [Position Title](https://developers.intellihr.io/docs/v1/).
    JobCreateRequestBusinessEntity businessEntity = new JobCreateRequestBusinessEntity();
    JobCreateRequestBusinessUnit businessUnit = new JobCreateRequestBusinessUnit();
    JobCreateRequestWorkClass workClass = new JobCreateRequestWorkClass();
    String companyEndDate = "companyEndDate_example"; // The <b>exclusive</b> date this [Job](https://developers.intellihr.io/docs/v1/) ended or will end within the organisation. For example, if the person's last working date is on 2025-04-23, the `companyEndDate` should be set as 2025-04-24 to reflect the exclusive date. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String startDate = "startDate_example"; // The date this [Job](https://developers.intellihr.io/docs/v1/) started or will start within the organisation. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String endDate = "endDate_example"; // The <b>exclusive</b> date this [Job](https://developers.intellihr.io/docs/v1/) ended or will end within the organisation. For example, if the person's last working date is on 2025-04-23, the `endDate` should be set as 2025-04-24 to reflect the exclusive date. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    JobCreateRequestEstablishment establishment = new JobCreateRequestEstablishment();
    JobCreateRequestSupervisorPerson supervisorPerson = new JobCreateRequestSupervisorPerson();
    JobCreateRequestSupervisorJob supervisorJob = new JobCreateRequestSupervisorJob();
    JobCreateRequestLocation location = new JobCreateRequestLocation();
    JobCreateRequestWorkType workType = new JobCreateRequestWorkType();
    String fte = "fte_example"; // The full time equivalent of this [Job](https://developers.intellihr.io/docs/v1/). Indicating the workload of an employee that can be comparable across different contexts. This is null for people without an FTE.
    JobCreateRequestPayGrade payGrade = new JobCreateRequestPayGrade();
    JobCreateRequestEmploymentCondition employmentCondition = new JobCreateRequestEmploymentCondition();
    JobCreateRequestRemunerationSchedule remunerationSchedule = new JobCreateRequestRemunerationSchedule();
    JobCreateRequestRecruitment recruitment = new JobCreateRequestRecruitment();
    Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this Job
    try {
      JobCreateResponse result = client
              .jobs
              .createRecord(person, companyStartDate, name, businessEntity, businessUnit, workClass)
              .companyEndDate(companyEndDate)
              .startDate(startDate)
              .endDate(endDate)
              .establishment(establishment)
              .supervisorPerson(supervisorPerson)
              .supervisorJob(supervisorJob)
              .location(location)
              .workType(workType)
              .fte(fte)
              .payGrade(payGrade)
              .employmentCondition(employmentCondition)
              .remunerationSchedule(remunerationSchedule)
              .recruitment(recruitment)
              .customFields(customFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobCreateResponse> response = client
              .jobs
              .createRecord(person, companyStartDate, name, businessEntity, businessUnit, workClass)
              .companyEndDate(companyEndDate)
              .startDate(startDate)
              .endDate(endDate)
              .establishment(establishment)
              .supervisorPerson(supervisorPerson)
              .supervisorJob(supervisorJob)
              .location(location)
              .workType(workType)
              .fte(fte)
              .payGrade(payGrade)
              .employmentCondition(employmentCondition)
              .remunerationSchedule(remunerationSchedule)
              .recruitment(recruitment)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#createRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobCreateRequest** | [**JobCreateRequest**](JobCreateRequest.md)|  | |

### Return type

[**JobCreateResponse**](JobCreateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Successfully |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

<a name="findById"></a>
# **findById**
> Jobs findById().asAt(asAt).execute();

Find a Job by ID

Get a single Job record by UUIDv4 identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String asAt = "2015-03-01T22:30:00+00:00"; // Used to configure what date to return this job data for, as a [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6) datetime.   All data returned from the job endpoints represent the values of the Person's job attributes at a specific point in time.   By default, the current datetime is used, but this parameter can be used to configure a different datetime to see historical data.
    try {
      Jobs result = client
              .jobs
              .findById()
              .asAt(asAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#findById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Jobs> response = client
              .jobs
              .findById()
              .asAt(asAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#findById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **asAt** | **String**| Used to configure what date to return this job data for, as a [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6) datetime.   All data returned from the job endpoints represent the values of the Person&#39;s job attributes at a specific point in time.   By default, the current datetime is used, but this parameter can be used to configure a different datetime to see historical data. | [optional] |

### Return type

[**Jobs**](Jobs.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** |  |  -  |

<a name="getAll"></a>
# **getAll**
> JobsList getAll().filters(filters).sort(sort).execute();

List all Jobs

Returns a list of all [Job](https://developers.intellihr.io/docs/v1/) entity records as at the current date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    JobsGetAllFiltersParameter filters = new HashMap(); // Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format `filters[<filter_name>][<operation_type>]=<filter_value>`.For example, a filter to get items matching a specific filter value would be `filters[personId][eq]=dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12`  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality `[eq]`: Checks for an exact match with the given filter value  The list of supported filters is given below.
    String sort = "sort_example"; // Sorting can be applied in the query string to order the data returned from this endpoint. Sort can be prepended with a minus to return the data in descending (-) order. For example, a sort to get the most recent records first would be `-createdAt`.
    try {
      JobsList result = client
              .jobs
              .getAll()
              .filters(filters)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsList> response = client
              .jobs
              .getAll()
              .filters(filters)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filters** | [**JobsGetAllFiltersParameter**](.md)| Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format &#x60;filters[&lt;filter_name&gt;][&lt;operation_type&gt;]&#x3D;&lt;filter_value&gt;&#x60;.For example, a filter to get items matching a specific filter value would be &#x60;filters[personId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality &#x60;[eq]&#x60;: Checks for an exact match with the given filter value  The list of supported filters is given below. | [optional] |
| **sort** | **String**| Sorting can be applied in the query string to order the data returned from this endpoint. Sort can be prepended with a minus to return the data in descending (-) order. For example, a sort to get the most recent records first would be &#x60;-createdAt&#x60;. | [optional] |

### Return type

[**JobsList**](JobsList.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** |  |  -  |

<a name="updateAttributes"></a>
# **updateAttributes**
> JobPatchResponse updateAttributes(jobPatchRequest).execute();

Patch an existing Job

Patch attributes of an existing Job record with the provided data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    Object effectiveFrom = null;
    String effectiveTo = "effectiveTo_example"; // The date this [Job](https://developers.intellihr.io/docs/v1/) Update is effective to within the organisation. Note that this doesn't affect the end date of the overall job itself. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String name = "name_example"; // The job name to be updated. Will attempt to match to an existing [Position Title](https://developers.intellihr.io/docs/v1/), otherwise creates a new [Position Title](https://developers.intellihr.io/docs/v1/).
    JobPatchRequestBusinessEntity businessEntity = new JobPatchRequestBusinessEntity();
    JobPatchRequestBusinessUnit businessUnit = new JobPatchRequestBusinessUnit();
    JobPatchRequestEstablishment establishment = new JobPatchRequestEstablishment();
    JobPatchRequestJobChangeReason jobChangeReason = new JobPatchRequestJobChangeReason();
    JobPatchRequestSupervisorPerson supervisorPerson = new JobPatchRequestSupervisorPerson();
    JobPatchRequestSupervisorJob supervisorJob = new JobPatchRequestSupervisorJob();
    JobPatchRequestLocation location = new JobPatchRequestLocation();
    JobPatchRequestWorkClass workClass = new JobPatchRequestWorkClass();
    JobPatchRequestWorkType workType = new JobPatchRequestWorkType();
    String fte = "fte_example"; // The full time equivalent of this [Job](https://developers.intellihr.io/docs/v1/). Indicating the workload of an employee that can be comparable across different contexts. This is null for people without an FTE.
    JobPatchRequestPayGrade payGrade = new JobPatchRequestPayGrade();
    JobPatchRequestEmploymentCondition employmentCondition = new JobPatchRequestEmploymentCondition();
    JobPatchRequestRemunerationSchedule remunerationSchedule = new JobPatchRequestRemunerationSchedule();
    Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this Job
    try {
      JobPatchResponse result = client
              .jobs
              .updateAttributes(effectiveFrom)
              .effectiveTo(effectiveTo)
              .name(name)
              .businessEntity(businessEntity)
              .businessUnit(businessUnit)
              .establishment(establishment)
              .jobChangeReason(jobChangeReason)
              .supervisorPerson(supervisorPerson)
              .supervisorJob(supervisorJob)
              .location(location)
              .workClass(workClass)
              .workType(workType)
              .fte(fte)
              .payGrade(payGrade)
              .employmentCondition(employmentCondition)
              .remunerationSchedule(remunerationSchedule)
              .customFields(customFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#updateAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobPatchResponse> response = client
              .jobs
              .updateAttributes(effectiveFrom)
              .effectiveTo(effectiveTo)
              .name(name)
              .businessEntity(businessEntity)
              .businessUnit(businessUnit)
              .establishment(establishment)
              .jobChangeReason(jobChangeReason)
              .supervisorPerson(supervisorPerson)
              .supervisorJob(supervisorJob)
              .location(location)
              .workClass(workClass)
              .workType(workType)
              .fte(fte)
              .payGrade(payGrade)
              .employmentCondition(employmentCondition)
              .remunerationSchedule(remunerationSchedule)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#updateAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jobPatchRequest** | [**JobPatchRequest**](JobPatchRequest.md)|  | |

### Return type

[**JobPatchResponse**](JobPatchResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

