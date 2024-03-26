# ExtendedLeaveApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](ExtendedLeaveApi.md#createNew) | **POST** /extended-leave | Create Extended Leave |
| [**updateFinalise**](ExtendedLeaveApi.md#updateFinalise) | **PATCH** /extended-leave/{id} | Update or Finalise Extended Leave |


<a name="createNew"></a>
# **createNew**
> LeaveCreateResponse createNew(leaveCreateRequest).execute();

Create Extended Leave

Create a new Extended Leave on an existing Job.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExtendedLeaveApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String jobId = "jobId_example"; // The identifier string for the [Job](https://developers.intellihr.io/docs/v1/) that this extended leave belongs to.
    String startDate = "startDate_example"; // The date this [Extended Leave](https://developers.intellihr.io/docs/v1/) started or will start. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String endDate = "endDate_example"; // The date this [Extended Leave](https://developers.intellihr.io/docs/v1/) is expected to end. Leave is created without a finalised return date. In order to create more than one Extended Leave on a Job, the end date must be finalised on the most recent created Extended Leave. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    LeaveCreateRequestLeaveType leaveType = new LeaveCreateRequestLeaveType();
    String fte = "fte_example"; // The full time equivalent for this [Job](https://developers.intellihr.io/docs/v1/) if changing during this leave period.
    try {
      LeaveCreateResponse result = client
              .extendedLeave
              .createNew(jobId, startDate, endDate, leaveType)
              .fte(fte)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtendedLeaveApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveCreateResponse> response = client
              .extendedLeave
              .createNew(jobId, startDate, endDate, leaveType)
              .fte(fte)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtendedLeaveApi#createNew");
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
| **leaveCreateRequest** | [**LeaveCreateRequest**](LeaveCreateRequest.md)|  | |

### Return type

[**LeaveCreateResponse**](LeaveCreateResponse.md)

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

<a name="updateFinalise"></a>
# **updateFinalise**
> LeaveUpdateResponse updateFinalise(leaveUpdateRequest).execute();

Update or Finalise Extended Leave

Update or Finalise an existing Extended Leave.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExtendedLeaveApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String jobId = "jobId_example"; // The identifier string for the [Job](https://developers.intellihr.io/docs/v1/) that this extended leave belongs to.
    String endDate = "endDate_example"; // The date this [Extended Leave](https://developers.intellihr.io/docs/v1/) is expected to end. Leave is created without a finalised return date. In order to create more than one Extended Leave on a Job, the end date must be finalised on the most recent created Extended Leave. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    Boolean shouldNotFinaliseEndDate = false; // Whether or not to finalise the end date for the [Extended Leave](https://developers.intellihr.io/docs/v1/). This boolean will change the input variables required if you are finalising an Extended Leave or just updating it. Finalising the end date prevents any further changes to this Extended Leave.
    String startDate = "startDate_example"; // The date this [Extended Leave](https://developers.intellihr.io/docs/v1/) started or will start. This field is only required if not finalising the Extended Leave end date, and will not be used if shouldNotFinaliseEndDate is not set or is set to false. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    LeaveUpdateRequestLeaveType leaveType = new LeaveUpdateRequestLeaveType();
    String fte = "fte_example"; // The full time equivalent for this [Job](https://developers.intellihr.io/docs/v1/) upon returning from Extended Leave. This field is only required when finalising the Extended Leave end date, and will not be used if shouldNotFinaliseEndDate is set to true.
    try {
      LeaveUpdateResponse result = client
              .extendedLeave
              .updateFinalise(jobId, endDate)
              .shouldNotFinaliseEndDate(shouldNotFinaliseEndDate)
              .startDate(startDate)
              .leaveType(leaveType)
              .fte(fte)
              .execute();
      System.out.println(result);
      System.out.println(result.getMeta());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtendedLeaveApi#updateFinalise");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LeaveUpdateResponse> response = client
              .extendedLeave
              .updateFinalise(jobId, endDate)
              .shouldNotFinaliseEndDate(shouldNotFinaliseEndDate)
              .startDate(startDate)
              .leaveType(leaveType)
              .fte(fte)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExtendedLeaveApi#updateFinalise");
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
| **leaveUpdateRequest** | [**LeaveUpdateRequest**](LeaveUpdateRequest.md)|  | |

### Return type

[**LeaveUpdateResponse**](LeaveUpdateResponse.md)

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

