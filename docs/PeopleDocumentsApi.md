# PeopleDocumentsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPresignedUploadUrl**](PeopleDocumentsApi.md#createPresignedUploadUrl) | **POST** /people/{personId}/documents |  |
| [**list**](PeopleDocumentsApi.md#list) | **GET** /people/{personId}/documents | List all Documents of a person |
| [**updateDocument**](PeopleDocumentsApi.md#updateDocument) | **PATCH** /people/{personId}/documents/{id} |  |


<a name="createPresignedUploadUrl"></a>
# **createPresignedUploadUrl**
> PeopleDocumentsCreateResponse createPresignedUploadUrl(personId, peopleDocumentsCreateRequest).execute();



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
import com.konfigthis.client.api.PeopleDocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String filename = "filename_example"; // The filename of the document. This will be used for display name. Includes extension.
    String mime = "mime_example"; // The mime type of the document
    Integer size = 56; // The size in bytes. We use this to validate the upload was successful so must match the actual file size
    String extension = "extension_example"; // The extension of the document, not including the dot
    String personId = "personId_example"; // personId parameter
    try {
      PeopleDocumentsCreateResponse result = client
              .peopleDocuments
              .createPresignedUploadUrl(filename, mime, size, extension, personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleDocumentsApi#createPresignedUploadUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleDocumentsCreateResponse> response = client
              .peopleDocuments
              .createPresignedUploadUrl(filename, mime, size, extension, personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleDocumentsApi#createPresignedUploadUrl");
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
| **personId** | **String**| personId parameter | |
| **peopleDocumentsCreateRequest** | [**PeopleDocumentsCreateRequest**](PeopleDocumentsCreateRequest.md)|  | |

### Return type

[**PeopleDocumentsCreateResponse**](PeopleDocumentsCreateResponse.md)

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

<a name="list"></a>
# **list**
> PeopleDocumentsFindResponse list(personId).limit(limit).page(page).execute();

List all Documents of a person

Returns a list of all [Documents](https://developers.intellihr.io/docs/v1/) of a given [person]((https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleDocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String personId = "personId_example"; // Id string param for relevant [Person](https://developers.intellihr.io/docs/v1/)
    Integer limit = 56; // The number of items per page
    Integer page = 56; // The page number
    try {
      PeopleDocumentsFindResponse result = client
              .peopleDocuments
              .list(personId)
              .limit(limit)
              .page(page)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleDocumentsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleDocumentsFindResponse> response = client
              .peopleDocuments
              .list(personId)
              .limit(limit)
              .page(page)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleDocumentsApi#list");
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
| **personId** | **String**| Id string param for relevant [Person](https://developers.intellihr.io/docs/v1/) | |
| **limit** | **Integer**| The number of items per page | [optional] |
| **page** | **Integer**| The page number | [optional] |

### Return type

[**PeopleDocumentsFindResponse**](PeopleDocumentsFindResponse.md)

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

<a name="updateDocument"></a>
# **updateDocument**
> PeopleDocumentsPatchResponse updateDocument(personId, peopleDocumentsPatchRequest).execute();



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
import com.konfigthis.client.api.PeopleDocumentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String personId = "personId_example"; // personId parameter
    String filename = "filename_example"; // The filename of the document. This will be used for display name. Includes extension.
    Object uploadStatus = null; // The upload status of this [Document](https://developers.intellihr.io/docs/v1/). Enum: `SUCCESS`, `PENDING`, `FAILED`.
    try {
      PeopleDocumentsPatchResponse result = client
              .peopleDocuments
              .updateDocument(personId)
              .filename(filename)
              .uploadStatus(uploadStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleDocumentsApi#updateDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleDocumentsPatchResponse> response = client
              .peopleDocuments
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
      System.err.println("Exception when calling PeopleDocumentsApi#updateDocument");
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
| **personId** | **String**| personId parameter | |
| **peopleDocumentsPatchRequest** | [**PeopleDocumentsPatchRequest**](PeopleDocumentsPatchRequest.md)|  | |

### Return type

[**PeopleDocumentsPatchResponse**](PeopleDocumentsPatchResponse.md)

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

