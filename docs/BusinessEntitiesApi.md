# BusinessEntitiesApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEntity**](BusinessEntitiesApi.md#createNewEntity) | **POST** /business-entities | Create a new Business Entity |
| [**deleteById**](BusinessEntitiesApi.md#deleteById) | **DELETE** /business-entities/{id} | Delete a Business Entity by ID |
| [**findById**](BusinessEntitiesApi.md#findById) | **GET** /business-entities/{id} | Find a Business Entity by ID |
| [**listAll**](BusinessEntitiesApi.md#listAll) | **GET** /business-entities | List all Business Entities |
| [**updateById**](BusinessEntitiesApi.md#updateById) | **PATCH** /business-entities/{id} | Update a Business Entity by ID |


<a name="createNewEntity"></a>
# **createNewEntity**
> BusinessEntities createNewEntity(businessEntitiesCreateRequest).execute();

Create a new Business Entity

Returns the created [Business Entity](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessEntitiesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // Name given to this [Business Entity](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system.
    String code = "code_example"; // Code given to this [Business Entity](https://developers.intellihr.io/docs/v1/)
    String legalName = "legalName_example"; // Legal name can be different from the name presented to a user. Usually used for administrative tasks.
    String number = "number_example"; // Legally registered [Business Entity](https://developers.intellihr.io/docs/v1/) number, e.g. in Australia this might be the ABN, or in America the RN.
    Boolean isEnabled = true; // Specifies whether users can select this [Business Entity](https://developers.intellihr.io/docs/v1/) in dropdowns.
    Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this [Business Entity](https://developers.intellihr.io/docs/v1/)
    try {
      BusinessEntities result = client
              .businessEntities
              .createNewEntity(name)
              .code(code)
              .legalName(legalName)
              .number(number)
              .isEnabled(isEnabled)
              .customFields(customFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#createNewEntity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessEntities> response = client
              .businessEntities
              .createNewEntity(name)
              .code(code)
              .legalName(legalName)
              .number(number)
              .isEnabled(isEnabled)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#createNewEntity");
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
| **businessEntitiesCreateRequest** | [**BusinessEntitiesCreateRequest**](BusinessEntitiesCreateRequest.md)|  | |

### Return type

[**BusinessEntities**](BusinessEntities.md)

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

Delete a Business Entity by ID

Deletes the [Business Entity](https://developers.intellihr.io/docs/v1/)&#39;s by the given ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessEntitiesApi;
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
              .businessEntities
              .deleteById()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .businessEntities
              .deleteById()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#deleteById");
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
> BusinessEntities findById().execute();

Find a Business Entity by ID

Returns a single [Business Entity](https://developers.intellihr.io/docs/v1/) by its identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessEntitiesApi;
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
      BusinessEntities result = client
              .businessEntities
              .findById()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#findById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessEntities> response = client
              .businessEntities
              .findById()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#findById");
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

[**BusinessEntities**](BusinessEntities.md)

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
> BusinessEntitiesList listAll().execute();

List all Business Entities

Returns a list of all [Business Entities](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessEntitiesApi;
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
      BusinessEntitiesList result = client
              .businessEntities
              .listAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessEntitiesList> response = client
              .businessEntities
              .listAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#listAll");
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

[**BusinessEntitiesList**](BusinessEntitiesList.md)

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

<a name="updateById"></a>
# **updateById**
> BusinessEntities updateById(businessEntitiesPatchRequest).execute();

Update a Business Entity by ID

Returns the updated [Business Entity](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessEntitiesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // Name given to this [Business Entity](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system.
    String code = "code_example"; // Code given to this [Business Entity](https://developers.intellihr.io/docs/v1/)
    String legalName = "legalName_example"; // Legal name can be different from the name presented to a user. Usually used for administrative tasks.
    String number = "number_example"; // Legally registered [Business Entity](https://developers.intellihr.io/docs/v1/) number, e.g. in Australia this might be the ABN, or in America the RN.
    Boolean isEnabled = true; // Specifies whether users can select this [Business Entity](https://developers.intellihr.io/docs/v1/) in dropdowns.
    Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this [Business Entity](https://developers.intellihr.io/docs/v1/)
    try {
      BusinessEntities result = client
              .businessEntities
              .updateById()
              .name(name)
              .code(code)
              .legalName(legalName)
              .number(number)
              .isEnabled(isEnabled)
              .customFields(customFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessEntities> response = client
              .businessEntities
              .updateById()
              .name(name)
              .code(code)
              .legalName(legalName)
              .number(number)
              .isEnabled(isEnabled)
              .customFields(customFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessEntitiesApi#updateById");
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
| **businessEntitiesPatchRequest** | [**BusinessEntitiesPatchRequest**](BusinessEntitiesPatchRequest.md)|  | |

### Return type

[**BusinessEntities**](BusinessEntities.md)

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

