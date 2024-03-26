# PeopleImagesApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateTemporaryImageUrl**](PeopleImagesApi.md#generateTemporaryImageUrl) | **POST** /people/{personId}/images | Generate an temporary image upload URL for the provided Person. |
| [**getTemporaryImage**](PeopleImagesApi.md#getTemporaryImage) | **GET** /people/{personId}/images | Get a temporary image |
| [**promoteImage**](PeopleImagesApi.md#promoteImage) | **PATCH** /people/{personId}/images | Promote temporary image |


<a name="generateTemporaryImageUrl"></a>
# **generateTemporaryImageUrl**
> PersonIdImageCreateResponse generateTemporaryImageUrl(personId, personIdImageCreateRequest).execute();

Generate an temporary image upload URL for the provided Person.

Generates an upload url for an temporary image of the specified type to an existing [Person](https://developers.intellihr.io/docs/v1/)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleImagesApi;
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
    String imageType = "PERSON_PROFILE"; // The Image Type. Enum: `PERSON_PROFILE`, `PROFILE_COVER`.
    String extension = "extension_example"; // The extension of the image, not including the dot
    try {
      PersonIdImageCreateResponse result = client
              .peopleImages
              .generateTemporaryImageUrl(personId)
              .imageType(imageType)
              .extension(extension)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleImagesApi#generateTemporaryImageUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonIdImageCreateResponse> response = client
              .peopleImages
              .generateTemporaryImageUrl(personId)
              .imageType(imageType)
              .extension(extension)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleImagesApi#generateTemporaryImageUrl");
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
| **personIdImageCreateRequest** | [**PersonIdImageCreateRequest**](PersonIdImageCreateRequest.md)|  | |

### Return type

[**PersonIdImageCreateResponse**](PersonIdImageCreateResponse.md)

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

<a name="getTemporaryImage"></a>
# **getTemporaryImage**
> PersonIdImageFindResponse getTemporaryImage(personId).imageType(imageType).execute();

Get a temporary image

Returns the current temporary image of the specified type for the provided [Person](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleImagesApi;
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
    String imageType = "PERSON_PROFILE"; // The Image Type. Enum: `PERSON_PROFILE`, `PROFILE_COVER`.
    try {
      PersonIdImageFindResponse result = client
              .peopleImages
              .getTemporaryImage(personId)
              .imageType(imageType)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleImagesApi#getTemporaryImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonIdImageFindResponse> response = client
              .peopleImages
              .getTemporaryImage(personId)
              .imageType(imageType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleImagesApi#getTemporaryImage");
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
| **imageType** | **String**| The Image Type. Enum: &#x60;PERSON_PROFILE&#x60;, &#x60;PROFILE_COVER&#x60;. | [optional] |

### Return type

[**PersonIdImageFindResponse**](PersonIdImageFindResponse.md)

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

<a name="promoteImage"></a>
# **promoteImage**
> promoteImage(personId, personIdImagePatchRequest).execute();

Promote temporary image

Activates the temporary image as the active image on a [Person](https://developers.intellihr.io/docs/v1/), has some minor editing options.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleImagesApi;
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
    String imageType = "PERSON_PROFILE"; // The Image Type. Enum: `PERSON_PROFILE`, `PROFILE_COVER`.
    Integer rotation = 0; // the degree to rotate the image from 0-359
    PersonIdImagePatchRequestCoordinates coordinates = new PersonIdImagePatchRequestCoordinates();
    try {
      client
              .peopleImages
              .promoteImage(personId)
              .imageType(imageType)
              .rotation(rotation)
              .coordinates(coordinates)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleImagesApi#promoteImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .peopleImages
              .promoteImage(personId)
              .imageType(imageType)
              .rotation(rotation)
              .coordinates(coordinates)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleImagesApi#promoteImage");
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
| **personIdImagePatchRequest** | [**PersonIdImagePatchRequest**](PersonIdImagePatchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

