# TrainingsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTraining**](TrainingsApi.md#createNewTraining) | **POST** /trainings |  |
| [**deleteById**](TrainingsApi.md#deleteById) | **DELETE** /trainings/{id} | Delete a Training by ID |
| [**findTrainingById**](TrainingsApi.md#findTrainingById) | **GET** /trainings/{id} | Find a Training by ID |
| [**listAll**](TrainingsApi.md#listAll) | **GET** /trainings | List all Trainings |
| [**updateTrainingById**](TrainingsApi.md#updateTrainingById) | **PATCH** /trainings/{id} |  |


<a name="createNewTraining"></a>
# **createNewTraining**
> Trainings createNewTraining(trainingsCreateRequest).execute();



Create a new Training

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // User friendly name given to this [Training](https://developers.intellihr.io/docs/v1/) to identify it in the system.
    TrainingsCreateRequestPerson person = new TrainingsCreateRequestPerson();
    TrainingsCreateRequestCoordinatorPerson coordinatorPerson = new TrainingsCreateRequestCoordinatorPerson();
    String completionDate = "completionDate_example"; // The timestamp the [Training](https://developers.intellihr.io/docs/v1/) was completed. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String cost = "cost_example"; // The cost of this [Training](https://developers.intellihr.io/docs/v1/).
    String currency = "currency_example"; // The currency used for this [Training](https://developers.intellihr.io/docs/v1/). Will default to the tenant default currency when not provided. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    String hours = "hours_example"; // How many hours were spent on this [Training](https://developers.intellihr.io/docs/v1/)
    TrainingsCreateRequestJob job = new TrainingsCreateRequestJob();
    TrainingsCreateRequestProvider provider = new TrainingsCreateRequestProvider();
    TrainingsCreateRequestType type = new TrainingsCreateRequestType();
    Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this [Training](https://developers.intellihr.io/docs/v1/)
    TrainingsCreateRequestStatus status = new TrainingsCreateRequestStatus();
    try {
      Trainings result = client
              .trainings
              .createNewTraining(name, person)
              .coordinatorPerson(coordinatorPerson)
              .completionDate(completionDate)
              .cost(cost)
              .currency(currency)
              .hours(hours)
              .job(job)
              .provider(provider)
              .type(type)
              .customFields(customFields)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#createNewTraining");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Trainings> response = client
              .trainings
              .createNewTraining(name, person)
              .coordinatorPerson(coordinatorPerson)
              .completionDate(completionDate)
              .cost(cost)
              .currency(currency)
              .hours(hours)
              .job(job)
              .provider(provider)
              .type(type)
              .customFields(customFields)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#createNewTraining");
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
| **trainingsCreateRequest** | [**TrainingsCreateRequest**](TrainingsCreateRequest.md)|  | |

### Return type

[**Trainings**](Trainings.md)

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

Delete a Training by ID

Deletes the provided [Training](https://developers.intellihr.io/docs/v1/) record.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
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
              .trainings
              .deleteById()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trainings
              .deleteById()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#deleteById");
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

<a name="findTrainingById"></a>
# **findTrainingById**
> Trainings findTrainingById().execute();

Find a Training by ID

Returns a single [Training](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
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
      Trainings result = client
              .trainings
              .findTrainingById()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#findTrainingById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Trainings> response = client
              .trainings
              .findTrainingById()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#findTrainingById");
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

[**Trainings**](Trainings.md)

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
> TrainingsList listAll().filters(filters).sort(sort).execute();

List all Trainings

Returns a list of all [Trainings](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    TrainingsListAllFiltersParameter filters = new HashMap(); // Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format `filters[<filter_name>][<operation_type>]=<filter_value>`.For example, a filter to get items matching a specific filter value would be `filters[name][eq]=Accounting%20Compliance%20101`  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality `[eq]`: Checks for an exact match with the given filter value  The list of supported filters is given below.
    String sort = "sort_example"; // Sorting can be applied in the query string to order the data returned from this endpoint. Sort can be prepended with a minus to return the data in descending (-) order. For example, a sort to get the most recent records first would be `-createdAt`.
    try {
      TrainingsList result = client
              .trainings
              .listAll()
              .filters(filters)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TrainingsList> response = client
              .trainings
              .listAll()
              .filters(filters)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#listAll");
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
| **filters** | [**TrainingsListAllFiltersParameter**](.md)| Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format &#x60;filters[&lt;filter_name&gt;][&lt;operation_type&gt;]&#x3D;&lt;filter_value&gt;&#x60;.For example, a filter to get items matching a specific filter value would be &#x60;filters[name][eq]&#x3D;Accounting%20Compliance%20101&#x60;  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality &#x60;[eq]&#x60;: Checks for an exact match with the given filter value  The list of supported filters is given below. | [optional] |
| **sort** | **String**| Sorting can be applied in the query string to order the data returned from this endpoint. Sort can be prepended with a minus to return the data in descending (-) order. For example, a sort to get the most recent records first would be &#x60;-createdAt&#x60;. | [optional] |

### Return type

[**TrainingsList**](TrainingsList.md)

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

<a name="updateTrainingById"></a>
# **updateTrainingById**
> Trainings updateTrainingById(trainingsPatchRequest).execute();



Update a Training

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrainingsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    TrainingsPatchRequestCoordinatorPerson coordinatorPerson = new TrainingsPatchRequestCoordinatorPerson();
    String completionDate = "completionDate_example"; // The timestamp the [Training](https://developers.intellihr.io/docs/v1/) was completed. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String cost = "cost_example"; // The cost of this [Training](https://developers.intellihr.io/docs/v1/).
    String currency = "currency_example"; // The currency used for this [Training](https://developers.intellihr.io/docs/v1/). Will default to the tenant default currency when not provided. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    String hours = "hours_example"; // How many hours were spent on this [Training](https://developers.intellihr.io/docs/v1/)
    TrainingsPatchRequestJob job = new TrainingsPatchRequestJob();
    String name = "name_example"; // User friendly name given to this [Training](https://developers.intellihr.io/docs/v1/) to identify it in the system.
    TrainingsPatchRequestPerson person = new TrainingsPatchRequestPerson();
    TrainingsPatchRequestProvider provider = new TrainingsPatchRequestProvider();
    TrainingsPatchRequestType type = new TrainingsPatchRequestType();
    Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this [Training](https://developers.intellihr.io/docs/v1/)
    TrainingsPatchRequestStatus status = new TrainingsPatchRequestStatus();
    try {
      Trainings result = client
              .trainings
              .updateTrainingById()
              .coordinatorPerson(coordinatorPerson)
              .completionDate(completionDate)
              .cost(cost)
              .currency(currency)
              .hours(hours)
              .job(job)
              .name(name)
              .person(person)
              .provider(provider)
              .type(type)
              .customFields(customFields)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#updateTrainingById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Trainings> response = client
              .trainings
              .updateTrainingById()
              .coordinatorPerson(coordinatorPerson)
              .completionDate(completionDate)
              .cost(cost)
              .currency(currency)
              .hours(hours)
              .job(job)
              .name(name)
              .person(person)
              .provider(provider)
              .type(type)
              .customFields(customFields)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TrainingsApi#updateTrainingById");
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
| **trainingsPatchRequest** | [**TrainingsPatchRequest**](TrainingsPatchRequest.md)|  | |

### Return type

[**Trainings**](Trainings.md)

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

