# EndJobApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelEndDate**](EndJobApi.md#cancelEndDate) | **DELETE** /job-end/{id} | Cancel job end date |
| [**jobFinalize**](EndJobApi.md#jobFinalize) | **PATCH** /job-end/{id} | End a job |


<a name="cancelEndDate"></a>
# **cancelEndDate**
> JobEndRemoveResponse cancelEndDate().UNKNOWN_PARAMETER_NAME(UNKNOWN_PARAMETER_NAME).execute();

Cancel job end date

If a job end date has been finalised, this will cancel the finalisation

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndJobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
     UNKNOWN_PARAMETER_NAME = new null(); // Whether to cancel the disabling of the users account upon the job end date, if user doesn't exist the Boolean has no effect yet the request will still succeed.
    try {
      JobEndRemoveResponse result = client
              .endJob
              .cancelEndDate()
              .UNKNOWN_PARAMETER_NAME(UNKNOWN_PARAMETER_NAME)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndJobApi#cancelEndDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobEndRemoveResponse> response = client
              .endJob
              .cancelEndDate()
              .UNKNOWN_PARAMETER_NAME(UNKNOWN_PARAMETER_NAME)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndJobApi#cancelEndDate");
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
| **UNKNOWN_PARAMETER_NAME** | [****](.md)| Whether to cancel the disabling of the users account upon the job end date, if user doesn&#39;t exist the Boolean has no effect yet the request will still succeed. | [optional] |

### Return type

[**JobEndRemoveResponse**](JobEndRemoveResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

<a name="jobFinalize"></a>
# **jobFinalize**
> JobEndPatchResponse jobFinalize(jobEndPatchRequest).UNKNOWN_PARAMETER_NAME(UNKNOWN_PARAMETER_NAME).UNKNOWN_PARAMETER_NAME2(UNKNOWN_PARAMETER_NAME2).UNKNOWN_PARAMETER_NAME3(UNKNOWN_PARAMETER_NAME3).execute();

End a job

Set an end date, and finalise a job.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndJobApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String endDate = "endDate_example"; // The <b>exclusive</b> date this [Job](https://developers.intellihr.io/docs/v1/) ended or will end within the organisation. For example, if the person's last working date is on 2025-04-23, the `endDate` should be set as 2025-04-24 to reflect the exclusive date. Required if not finalising an end date, or the job does not have an end date. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String reassignDirectReportsTo = "reassignDirectReportsTo_example"; // The identifier string for the [Job](https://developers.intellihr.io/docs/v1/) of the person that the direct report will be reassigned to.
    String turnoverType = "turnoverType_example"; // The type of turnover this end of job would be classified as: `voluntary`, `involuntary` or `unknown`. Required if finalising an end date.
    String turnoverReason = "turnoverReason_example"; // The name of the turnover reason.
     UNKNOWN_PARAMETER_NAME = new null(); // If true, do not finalise the job.
     UNKNOWN_PARAMETER_NAME2 = new null(); // If true, keeps the user account when finalising the job.
     UNKNOWN_PARAMETER_NAME3 = new null(); // When true, no events will be fired from this action
    try {
      JobEndPatchResponse result = client
              .endJob
              .jobFinalize()
              .endDate(endDate)
              .reassignDirectReportsTo(reassignDirectReportsTo)
              .turnoverType(turnoverType)
              .turnoverReason(turnoverReason)
              .UNKNOWN_PARAMETER_NAME(UNKNOWN_PARAMETER_NAME)
              .UNKNOWN_PARAMETER_NAME2(UNKNOWN_PARAMETER_NAME2)
              .UNKNOWN_PARAMETER_NAME3(UNKNOWN_PARAMETER_NAME3)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndJobApi#jobFinalize");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobEndPatchResponse> response = client
              .endJob
              .jobFinalize()
              .endDate(endDate)
              .reassignDirectReportsTo(reassignDirectReportsTo)
              .turnoverType(turnoverType)
              .turnoverReason(turnoverReason)
              .UNKNOWN_PARAMETER_NAME(UNKNOWN_PARAMETER_NAME)
              .UNKNOWN_PARAMETER_NAME2(UNKNOWN_PARAMETER_NAME2)
              .UNKNOWN_PARAMETER_NAME3(UNKNOWN_PARAMETER_NAME3)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndJobApi#jobFinalize");
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
| **jobEndPatchRequest** | [**JobEndPatchRequest**](JobEndPatchRequest.md)|  | |
| **UNKNOWN_PARAMETER_NAME** | [****](.md)| If true, do not finalise the job. | [optional] |
| **UNKNOWN_PARAMETER_NAME2** | [****](.md)| If true, keeps the user account when finalising the job. | [optional] |
| **UNKNOWN_PARAMETER_NAME3** | [****](.md)| When true, no events will be fired from this action | [optional] |

### Return type

[**JobEndPatchResponse**](JobEndPatchResponse.md)

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

