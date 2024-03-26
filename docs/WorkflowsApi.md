# WorkflowsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**triggerById**](WorkflowsApi.md#triggerById) | **PATCH** /workflows/{id} | Trigger a Workflow by ID |


<a name="triggerById"></a>
# **triggerById**
> WorkflowsPatchResponse triggerById(id, workflowsPatchRequest).execute();

Trigger a Workflow by ID

Trigger a Workflow and related Workflow Form Designs.   This endpoint supports Workflows that are linked to Job onboarding, offboarding, role change and extended leave.  Currently the recipient and email address type for the individual forms will be automatically set based on the Respondent Type on the Form Design.  Form Designs with a Respondent Type of &#x60;Supervisor&#x60; for a job with no supervisor currently are not supported as no default option can be selected.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkflowsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String jobId = "jobId_example"; // The identifier string for the [Job](https://developers.intellihr.io/docs/v1/) to trigger this Workflow for.
    List<WorkflowsPatchRequestWorkflowFormDesignsInner> workflowFormDesigns = Arrays.asList(); // Information about the Workflow Form Designs within this [Workflow](https://developers.intellihr.io/docs/v1/).
    String id = "8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9"; // The id of the Workflow to trigger.
    try {
      WorkflowsPatchResponse result = client
              .workflows
              .triggerById(jobId, workflowFormDesigns, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#triggerById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WorkflowsPatchResponse> response = client
              .workflows
              .triggerById(jobId, workflowFormDesigns, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#triggerById");
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
| **id** | **String**| The id of the Workflow to trigger. | |
| **workflowsPatchRequest** | [**WorkflowsPatchRequest**](WorkflowsPatchRequest.md)|  | |

### Return type

[**WorkflowsPatchResponse**](WorkflowsPatchResponse.md)

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

