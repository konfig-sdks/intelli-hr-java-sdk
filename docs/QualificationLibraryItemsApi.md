# QualificationLibraryItemsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewRecord**](QualificationLibraryItemsApi.md#createNewRecord) | **POST** /qualification-library-items | Create a new Qualification Library Item |
| [**deleteById**](QualificationLibraryItemsApi.md#deleteById) | **DELETE** /qualification-library-items/{id} | Delete a Qualification Library Item by ID |
| [**findByID**](QualificationLibraryItemsApi.md#findByID) | **GET** /qualification-library-items/{id} | Find a Qualification Library Item by ID |
| [**getAllQualifications**](QualificationLibraryItemsApi.md#getAllQualifications) | **GET** /qualification-library-items | List all Qualification Library Items |
| [**updateRecord**](QualificationLibraryItemsApi.md#updateRecord) | **PATCH** /qualification-library-items/{id} | Patch an existing Qualification Library Item |


<a name="createNewRecord"></a>
# **createNewRecord**
> QualificationLibraryItems createNewRecord(qualificationLibraryItemsCreateRequest).execute();

Create a new Qualification Library Item

Create a new [Qualification Library Item](https://developers.intellihr.io/docs/v1/) record with the provided data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationLibraryItemsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // The name of this [Qualification Library Item](https://developers.intellihr.io/docs/v1/)
    String qualificationTypeId = "qualificationTypeId_example"; // The identifier string for the Qualification Type Id.
    String qualificationExpiryType = "EXPIRY_INAPPLICABLE"; // The expiry type for this library item
    String qualificationRegistrationNumberVisibilityType = "REGISTRATION_NUMBER_INAPPLICABLE"; // The expiry type for this library item
    String qualificationAttachmentRequirementType = "DOCUMENTS_OPTIONAL"; // If documents are required for this library item
    Double expiryWarningPeriod = 3.4D; // Period in days, that there is a warning before the expiry of the qualification. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.
    Boolean sendExpiryWarning = true; // If this [Qualification Library Item](https://developers.intellihr.io/docs/v1/) will send expiry warning/s using the periods defined. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.
    try {
      QualificationLibraryItems result = client
              .qualificationLibraryItems
              .createNewRecord(name, qualificationTypeId, qualificationExpiryType, qualificationRegistrationNumberVisibilityType, qualificationAttachmentRequirementType)
              .expiryWarningPeriod(expiryWarningPeriod)
              .sendExpiryWarning(sendExpiryWarning)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#createNewRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QualificationLibraryItems> response = client
              .qualificationLibraryItems
              .createNewRecord(name, qualificationTypeId, qualificationExpiryType, qualificationRegistrationNumberVisibilityType, qualificationAttachmentRequirementType)
              .expiryWarningPeriod(expiryWarningPeriod)
              .sendExpiryWarning(sendExpiryWarning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#createNewRecord");
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
| **qualificationLibraryItemsCreateRequest** | [**QualificationLibraryItemsCreateRequest**](QualificationLibraryItemsCreateRequest.md)|  | |

### Return type

[**QualificationLibraryItems**](QualificationLibraryItems.md)

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

<a name="deleteById"></a>
# **deleteById**
> deleteById().execute();

Delete a Qualification Library Item by ID

Deletes the [Qualification Library Items](https://developers.intellihr.io/docs/v1/) by the given ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationLibraryItemsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    try {
      client
              .qualificationLibraryItems
              .deleteById()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .qualificationLibraryItems
              .deleteById()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Success |  -  |
| **400** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |

<a name="findByID"></a>
# **findByID**
> QualificationLibraryItemsList findByID().execute();

Find a Qualification Library Item by ID

Returns a single [Qualification Library Item](https://developers.intellihr.io/docs/v1/) by its identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationLibraryItemsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    try {
      QualificationLibraryItemsList result = client
              .qualificationLibraryItems
              .findByID()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#findByID");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QualificationLibraryItemsList> response = client
              .qualificationLibraryItems
              .findByID()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#findByID");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QualificationLibraryItemsList**](QualificationLibraryItemsList.md)

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

<a name="getAllQualifications"></a>
# **getAllQualifications**
> QualificationLibraryItems getAllQualifications().execute();

List all Qualification Library Items



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationLibraryItemsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    try {
      QualificationLibraryItems result = client
              .qualificationLibraryItems
              .getAllQualifications()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#getAllQualifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QualificationLibraryItems> response = client
              .qualificationLibraryItems
              .getAllQualifications()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#getAllQualifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QualificationLibraryItems**](QualificationLibraryItems.md)

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

<a name="updateRecord"></a>
# **updateRecord**
> QualificationLibraryItems updateRecord(qualificationLibraryItemsPatchRequest).execute();

Patch an existing Qualification Library Item

Patch attributes of an existing [Qualification Library Items](https://developers.intellihr.io/docs/v1/) record with the provided data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationLibraryItemsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // The name of this [Qualification Library Item](https://developers.intellihr.io/docs/v1/)
    String qualificationTypeId = "qualificationTypeId_example"; // The identifier string for the Qualification Type Id.
    String qualificationExpiryType = "EXPIRY_INAPPLICABLE"; // The expiry type for this library item
    String qualificationRegistrationNumberVisibilityType = "REGISTRATION_NUMBER_INAPPLICABLE"; // The expiry type for this library item
    String qualificationAttachmentRequirementType = "DOCUMENTS_OPTIONAL"; // If documents are required for this library item
    Double expiryWarningPeriod = 3.4D; // Period in days, that there is a warning before the expiry of the qualification. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.
    Boolean sendExpiryWarning = true; // If this [Qualification Library Item](https://developers.intellihr.io/docs/v1/) will send expiry warning/s using the periods defined. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored.
    try {
      QualificationLibraryItems result = client
              .qualificationLibraryItems
              .updateRecord()
              .name(name)
              .qualificationTypeId(qualificationTypeId)
              .qualificationExpiryType(qualificationExpiryType)
              .qualificationRegistrationNumberVisibilityType(qualificationRegistrationNumberVisibilityType)
              .qualificationAttachmentRequirementType(qualificationAttachmentRequirementType)
              .expiryWarningPeriod(expiryWarningPeriod)
              .sendExpiryWarning(sendExpiryWarning)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#updateRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QualificationLibraryItems> response = client
              .qualificationLibraryItems
              .updateRecord()
              .name(name)
              .qualificationTypeId(qualificationTypeId)
              .qualificationExpiryType(qualificationExpiryType)
              .qualificationRegistrationNumberVisibilityType(qualificationRegistrationNumberVisibilityType)
              .qualificationAttachmentRequirementType(qualificationAttachmentRequirementType)
              .expiryWarningPeriod(expiryWarningPeriod)
              .sendExpiryWarning(sendExpiryWarning)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationLibraryItemsApi#updateRecord");
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
| **qualificationLibraryItemsPatchRequest** | [**QualificationLibraryItemsPatchRequest**](QualificationLibraryItemsPatchRequest.md)|  | |

### Return type

[**QualificationLibraryItems**](QualificationLibraryItems.md)

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

