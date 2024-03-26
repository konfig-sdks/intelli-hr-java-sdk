# CustomFieldDefinitionsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDefinition**](CustomFieldDefinitionsApi.md#createDefinition) | **POST** /custom-field-definitions | Create a Custom Field Definition |
| [**deleteById**](CustomFieldDefinitionsApi.md#deleteById) | **DELETE** /custom-field-definitions/{id} | Delete a Custom Field Definition by ID |
| [**findDefinitionById**](CustomFieldDefinitionsApi.md#findDefinitionById) | **GET** /custom-field-definitions/{id} | Find a Custom Field Definition by ID |
| [**listAll**](CustomFieldDefinitionsApi.md#listAll) | **GET** /custom-field-definitions | List all Custom Field Definitions |
| [**updateDefinitionById**](CustomFieldDefinitionsApi.md#updateDefinitionById) | **PATCH** /custom-field-definitions/{id} | Update a Custom Field Definition |


<a name="createDefinition"></a>
# **createDefinition**
> CustomFieldDefinitions createDefinition(customFieldDefinitionCreateRequest).execute();

Create a Custom Field Definition

Returns the created [Custom Field Definition](https://developers.intellihr.io/docs/v1/)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldDefinitionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // Name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system.
    String apiName = "apiName_example"; // The api name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name is used to uniquely identify the custom field in the api and is used as the key when modifying the custom field on a record.
    String modelType = "modelType_example"; // The model that this custom field relates to and can be attached to. Enum: `ADDRESS`, `BUSINESS_ENTITY`, `BUSINESS_UNIT`, `EMAIL_ADDRESS`, `JOB`, `LOCATION`, `PERSON`, `POSITION_TITLE`, `PHONE_NUMBER`, `REMUNERATION`, `TRAINING`.
    String type = "type_example"; // The type of data this field records. Enum: `SINGLE_SELECT`, `MULTI_SELECT`, `TEXT`, `NUMBER`, `PEOPLE_DROPDOWN`.
    Object description = null;
    Boolean isSensitive = true; // Whether or not this [Custom Field Definition](https://developers.intellihr.io/docs/v1/) is marked as sensitive information.
    TheSelectDefinitionOfTheCustomFieldDefinitionProperty selectDefinition = new TheSelectDefinitionOfTheCustomFieldDefinitionProperty();
    OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty textDefinition = new OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty();
    ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty peopleDropdownDefinition = new ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty();
    try {
      CustomFieldDefinitions result = client
              .customFieldDefinitions
              .createDefinition(name, apiName, modelType, type)
              .description(description)
              .isSensitive(isSensitive)
              .selectDefinition(selectDefinition)
              .textDefinition(textDefinition)
              .peopleDropdownDefinition(peopleDropdownDefinition)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#createDefinition");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldDefinitions> response = client
              .customFieldDefinitions
              .createDefinition(name, apiName, modelType, type)
              .description(description)
              .isSensitive(isSensitive)
              .selectDefinition(selectDefinition)
              .textDefinition(textDefinition)
              .peopleDropdownDefinition(peopleDropdownDefinition)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#createDefinition");
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
| **customFieldDefinitionCreateRequest** | [**CustomFieldDefinitionCreateRequest**](CustomFieldDefinitionCreateRequest.md)|  | |

### Return type

[**CustomFieldDefinitions**](CustomFieldDefinitions.md)

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

Delete a Custom Field Definition by ID

Deletes the [Custom Field Definition](https://developers.intellihr.io/docs/v1/) by the given ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldDefinitionsApi;
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
              .customFieldDefinitions
              .deleteById()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .customFieldDefinitions
              .deleteById()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#deleteById");
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

<a name="findDefinitionById"></a>
# **findDefinitionById**
> CustomFieldDefinitions findDefinitionById().execute();

Find a Custom Field Definition by ID

Returns a single Custom Field Definition.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldDefinitionsApi;
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
      CustomFieldDefinitions result = client
              .customFieldDefinitions
              .findDefinitionById()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#findDefinitionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldDefinitions> response = client
              .customFieldDefinitions
              .findDefinitionById()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#findDefinitionById");
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

[**CustomFieldDefinitions**](CustomFieldDefinitions.md)

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
> CustomFieldDefinitionsList listAll().filters(filters).execute();

List all Custom Field Definitions

Returns a list of all Custom Field Definitions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldDefinitionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    CustomFieldDefinitionsListAllFiltersParameter filters = new HashMap(); // Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format `filters[<filter_name>][<operation_type>]=<filter_value>`.For example, a filter to get items matching a specific filter value would be `filters[modelType][eq]=TRAINING`  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality `[eq]`: Checks for an exact match with the given filter value  The list of supported filters is given below.
    try {
      CustomFieldDefinitionsList result = client
              .customFieldDefinitions
              .listAll()
              .filters(filters)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldDefinitionsList> response = client
              .customFieldDefinitions
              .listAll()
              .filters(filters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#listAll");
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
| **filters** | [**CustomFieldDefinitionsListAllFiltersParameter**](.md)| Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format &#x60;filters[&lt;filter_name&gt;][&lt;operation_type&gt;]&#x3D;&lt;filter_value&gt;&#x60;.For example, a filter to get items matching a specific filter value would be &#x60;filters[modelType][eq]&#x3D;TRAINING&#x60;  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality &#x60;[eq]&#x60;: Checks for an exact match with the given filter value  The list of supported filters is given below. | [optional] |

### Return type

[**CustomFieldDefinitionsList**](CustomFieldDefinitionsList.md)

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

<a name="updateDefinitionById"></a>
# **updateDefinitionById**
> CustomFieldDefinitions updateDefinitionById(customFieldDefinitionPatchRequest).execute();

Update a Custom Field Definition

Returns the updated [Custom Field Definition](https://developers.intellihr.io/docs/v1/)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomFieldDefinitionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    Object description = null;
    String name = "name_example"; // Name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system.
    Boolean isEnabled = true; // Whether or not this [Custom Field Definition](https://developers.intellihr.io/docs/v1/) is enabled to be used.
    Boolean isSensitive = true; // Whether or not this [Custom Field Definition](https://developers.intellihr.io/docs/v1/) is marked as sensitive information.
    TheSelectDefinitionOfTheCustomFieldDefinitionProperty1 selectDefinition = new TheSelectDefinitionOfTheCustomFieldDefinitionProperty1();
    ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty1 peopleDropdownDefinition = new ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty1();
    try {
      CustomFieldDefinitions result = client
              .customFieldDefinitions
              .updateDefinitionById()
              .description(description)
              .name(name)
              .isEnabled(isEnabled)
              .isSensitive(isSensitive)
              .selectDefinition(selectDefinition)
              .peopleDropdownDefinition(peopleDropdownDefinition)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#updateDefinitionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomFieldDefinitions> response = client
              .customFieldDefinitions
              .updateDefinitionById()
              .description(description)
              .name(name)
              .isEnabled(isEnabled)
              .isSensitive(isSensitive)
              .selectDefinition(selectDefinition)
              .peopleDropdownDefinition(peopleDropdownDefinition)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomFieldDefinitionsApi#updateDefinitionById");
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
| **customFieldDefinitionPatchRequest** | [**CustomFieldDefinitionPatchRequest**](CustomFieldDefinitionPatchRequest.md)|  | |

### Return type

[**CustomFieldDefinitions**](CustomFieldDefinitions.md)

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

