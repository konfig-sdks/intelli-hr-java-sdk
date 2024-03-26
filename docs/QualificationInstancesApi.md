# QualificationInstancesApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewInstance**](QualificationInstancesApi.md#createNewInstance) | **POST** /qualifications | Create a new Qualification Instance |
| [**deleteById**](QualificationInstancesApi.md#deleteById) | **DELETE** /qualifications/{id} | Delete a Qualification Instance by ID |
| [**findById**](QualificationInstancesApi.md#findById) | **GET** /qualifications/{id} | Find a Qualification Instance by ID |
| [**listAll**](QualificationInstancesApi.md#listAll) | **GET** /qualifications | List all Qualification Instances |
| [**updateInstanceById**](QualificationInstancesApi.md#updateInstanceById) | **PATCH** /qualifications/{id} | Update a Qualification Instance by ID |


<a name="createNewInstance"></a>
# **createNewInstance**
> Qualifications createNewInstance(qualificationInstancesCreateRequest).execute();

Create a new Qualification Instance

Returns the created [Qualification Instance](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationInstancesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String personId = "personId_example"; // The identifier string for the Person Id.
    String qualificationLibraryItemId = "qualificationLibraryItemId_example"; // The identifier string for the Qualification Library Item Id.
    String status = "DRAFT"; // The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/)
    Object issuingOrganisation = null;
    Object registrationNumber = null;
    Object issueDate = null;
    Object expiryDate = null;
    Object expiryNotificationQueuedAt = null;
    Object notes = null;
    try {
      Qualifications result = client
              .qualificationInstances
              .createNewInstance(personId, qualificationLibraryItemId, status)
              .issuingOrganisation(issuingOrganisation)
              .registrationNumber(registrationNumber)
              .issueDate(issueDate)
              .expiryDate(expiryDate)
              .expiryNotificationQueuedAt(expiryNotificationQueuedAt)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#createNewInstance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Qualifications> response = client
              .qualificationInstances
              .createNewInstance(personId, qualificationLibraryItemId, status)
              .issuingOrganisation(issuingOrganisation)
              .registrationNumber(registrationNumber)
              .issueDate(issueDate)
              .expiryDate(expiryDate)
              .expiryNotificationQueuedAt(expiryNotificationQueuedAt)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#createNewInstance");
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
| **qualificationInstancesCreateRequest** | [**QualificationInstancesCreateRequest**](QualificationInstancesCreateRequest.md)|  | |

### Return type

[**Qualifications**](Qualifications.md)

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

Delete a Qualification Instance by ID

Deletes the [Qualification Instance](https://developers.intellihr.io/docs/v1/) by the given ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationInstancesApi;
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
              .qualificationInstances
              .deleteById()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .qualificationInstances
              .deleteById()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#deleteById");
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

<a name="findById"></a>
# **findById**
> Qualifications findById().execute();

Find a Qualification Instance by ID

Returns a single [Qualification Instance](https://developers.intellihr.io/docs/v1/) by its identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationInstancesApi;
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
      Qualifications result = client
              .qualificationInstances
              .findById()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#findById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Qualifications> response = client
              .qualificationInstances
              .findById()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#findById");
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

[**Qualifications**](Qualifications.md)

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

<a name="listAll"></a>
# **listAll**
> QualificationsList listAll().filters(filters).execute();

List all Qualification Instances



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationInstancesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    QualificationInstancesListAllFiltersParameter filters = new HashMap(); // Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format `filters[<filter_name>][<operation_type>]=<filter_value>`.For example, a filter to get items matching a specific filter value would be `filters[personId][eq]=dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12`  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality `[eq]`: Checks for an exact match with the given filter value  The list of supported filters is given below.
    try {
      QualificationsList result = client
              .qualificationInstances
              .listAll()
              .filters(filters)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QualificationsList> response = client
              .qualificationInstances
              .listAll()
              .filters(filters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#listAll");
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
| **filters** | [**QualificationInstancesListAllFiltersParameter**](.md)| Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format &#x60;filters[&lt;filter_name&gt;][&lt;operation_type&gt;]&#x3D;&lt;filter_value&gt;&#x60;.For example, a filter to get items matching a specific filter value would be &#x60;filters[personId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality &#x60;[eq]&#x60;: Checks for an exact match with the given filter value  The list of supported filters is given below. | [optional] |

### Return type

[**QualificationsList**](QualificationsList.md)

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

<a name="updateInstanceById"></a>
# **updateInstanceById**
> Qualifications updateInstanceById(qualificationInstancesPatchRequest).execute();

Update a Qualification Instance by ID

Returns the updated [Qualification Instance](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QualificationInstancesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String status = "DRAFT"; // The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/)
    Object issuingOrganisation = null;
    Object registrationNumber = null;
    Object issueDate = null;
    Object expiryDate = null;
    Object expiryNotificationQueuedAt = null;
    Object notes = null;
    try {
      Qualifications result = client
              .qualificationInstances
              .updateInstanceById()
              .status(status)
              .issuingOrganisation(issuingOrganisation)
              .registrationNumber(registrationNumber)
              .issueDate(issueDate)
              .expiryDate(expiryDate)
              .expiryNotificationQueuedAt(expiryNotificationQueuedAt)
              .notes(notes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#updateInstanceById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Qualifications> response = client
              .qualificationInstances
              .updateInstanceById()
              .status(status)
              .issuingOrganisation(issuingOrganisation)
              .registrationNumber(registrationNumber)
              .issueDate(issueDate)
              .expiryDate(expiryDate)
              .expiryNotificationQueuedAt(expiryNotificationQueuedAt)
              .notes(notes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationInstancesApi#updateInstanceById");
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
| **qualificationInstancesPatchRequest** | [**QualificationInstancesPatchRequest**](QualificationInstancesPatchRequest.md)|  | |

### Return type

[**Qualifications**](Qualifications.md)

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

