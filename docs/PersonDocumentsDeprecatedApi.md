# PersonDocumentsDeprecatedApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPresignedUploadUrl**](PersonDocumentsDeprecatedApi.md#createPresignedUploadUrl) | **POST** /person-documents |  |
| [**updateDocument**](PersonDocumentsDeprecatedApi.md#updateDocument) | **PATCH** /person-documents/{id} |  |


<a name="createPresignedUploadUrl"></a>
# **createPresignedUploadUrl**
> PersonDocumentsCreateResponse createPresignedUploadUrl(personDocumentsCreateRequest).execute();



Create a presigned upload URL

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonDocumentsDeprecatedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    PersonDocumentsCreateRequestPerson person = new PersonDocumentsCreateRequestPerson();
    String filename = "filename_example"; // The filename of the document. This will be used for display name. Includes extension.
    String mime = "mime_example"; // The mime type of the document
    Integer size = 56; // The size in bytes. We use this to validate the upload was successful so must match the actual file size
    String extension = "extension_example"; // The extension of the document, not including the dot
    try {
      PersonDocumentsCreateResponse result = client
              .personDocumentsDeprecated
              .createPresignedUploadUrl(person, filename, mime, size, extension)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDocumentsDeprecatedApi#createPresignedUploadUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonDocumentsCreateResponse> response = client
              .personDocumentsDeprecated
              .createPresignedUploadUrl(person, filename, mime, size, extension)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDocumentsDeprecatedApi#createPresignedUploadUrl");
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
| **personDocumentsCreateRequest** | [**PersonDocumentsCreateRequest**](PersonDocumentsCreateRequest.md)|  | |

### Return type

[**PersonDocumentsCreateResponse**](PersonDocumentsCreateResponse.md)

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

<a name="updateDocument"></a>
# **updateDocument**
> PersonDocumentsPatchResponse updateDocument(personDocumentsPatchRequest).execute();



Update a Document

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PersonDocumentsDeprecatedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String personId = "personId_example"; // The identifier string for the [Person](https://developers.intellihr.io/docs/v1/) to whom this [Document](https://developers.intellihr.io/docs/v1/) belongs.
    String filename = "filename_example"; // The filename of the document. This will be used for display name. Includes extension.
    Object uploadStatus = null; // The upload status of this [Document](https://developers.intellihr.io/docs/v1/). Enum: `SUCCESS`, `PENDING`, `FAILED`.
    try {
      PersonDocumentsPatchResponse result = client
              .personDocumentsDeprecated
              .updateDocument(personId)
              .filename(filename)
              .uploadStatus(uploadStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDocumentsDeprecatedApi#updateDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonDocumentsPatchResponse> response = client
              .personDocumentsDeprecated
              .updateDocument(personId)
              .filename(filename)
              .uploadStatus(uploadStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PersonDocumentsDeprecatedApi#updateDocument");
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
| **personDocumentsPatchRequest** | [**PersonDocumentsPatchRequest**](PersonDocumentsPatchRequest.md)|  | |

### Return type

[**PersonDocumentsPatchResponse**](PersonDocumentsPatchResponse.md)

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

