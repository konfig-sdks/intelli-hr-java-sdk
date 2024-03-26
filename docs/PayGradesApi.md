# PayGradesApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRecord**](PayGradesApi.md#createRecord) | **POST** /pay-grades | Create a new Pay Grade |
| [**deleteById**](PayGradesApi.md#deleteById) | **DELETE** /pay-grades/{id} | Delete a Pay Grade by ID |
| [**findById**](PayGradesApi.md#findById) | **GET** /pay-grades/{id} | Find a Pay Grade by ID |
| [**getAll**](PayGradesApi.md#getAll) | **GET** /pay-grades | List all pay grades |
| [**updateRecord**](PayGradesApi.md#updateRecord) | **PATCH** /pay-grades/{id} | Patch an existing Pay Grade |


<a name="createRecord"></a>
# **createRecord**
> PayGrades createRecord(payGradeCreateRequest).execute();

Create a new Pay Grade

Create a new Pay Grade record with the provided data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayGradesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String name = "name_example"; // The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/).
    String description = "description_example"; // Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/).
    String code = "code_example"; // Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/).
    PayGradeCreateRequestEmploymentCondition employmentCondition = new PayGradeCreateRequestEmploymentCondition();
    String payGradeType = "FIXED"; // The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/). Enum: `FIXED` or `STEP`.
    Boolean isOverridable = false; // Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten.
    Double permanentHourlyRate = 3.4D; // Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
    String permanentHourlyRateCurrency = "permanentHourlyRateCurrency_example"; // The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    Double casualHourlyRate = 3.4D; // Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
    String casualHourlyRateCurrency = "casualHourlyRateCurrency_example"; // The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    Double annualSalary = 3.4D; // Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
    String annualSalaryCurrency = "annualSalaryCurrency_example"; // The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    List<PayGradeCreateRequestPayStepsInner> paySteps = Arrays.asList(); // An array of Paygrade Step Rates. This array is to be used when payGradeType of \\\"Step\\\" is used.
    try {
      PayGrades result = client
              .payGrades
              .createRecord(name)
              .description(description)
              .code(code)
              .employmentCondition(employmentCondition)
              .payGradeType(payGradeType)
              .isOverridable(isOverridable)
              .permanentHourlyRate(permanentHourlyRate)
              .permanentHourlyRateCurrency(permanentHourlyRateCurrency)
              .casualHourlyRate(casualHourlyRate)
              .casualHourlyRateCurrency(casualHourlyRateCurrency)
              .annualSalary(annualSalary)
              .annualSalaryCurrency(annualSalaryCurrency)
              .paySteps(paySteps)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#createRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayGrades> response = client
              .payGrades
              .createRecord(name)
              .description(description)
              .code(code)
              .employmentCondition(employmentCondition)
              .payGradeType(payGradeType)
              .isOverridable(isOverridable)
              .permanentHourlyRate(permanentHourlyRate)
              .permanentHourlyRateCurrency(permanentHourlyRateCurrency)
              .casualHourlyRate(casualHourlyRate)
              .casualHourlyRateCurrency(casualHourlyRateCurrency)
              .annualSalary(annualSalary)
              .annualSalaryCurrency(annualSalaryCurrency)
              .paySteps(paySteps)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#createRecord");
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
| **payGradeCreateRequest** | [**PayGradeCreateRequest**](PayGradeCreateRequest.md)|  | |

### Return type

[**PayGrades**](PayGrades.md)

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

Delete a Pay Grade by ID

Deletes the [Pay Grade](https://developers.intellihr.io/docs/v1/) by the given ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayGradesApi;
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
              .payGrades
              .deleteById()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payGrades
              .deleteById()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#deleteById");
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
> PayGrades findById().asAt(asAt).execute();

Find a Pay Grade by ID

Returns a single pay grade.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayGradesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String asAt = "2015-03-01T22:30:00+00:00"; // Used to configure what date to return this data, as a [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6) datetime.   All data returned from the endpoints represent the values of the attributes at a specific point in time.   By default, the current datetime is used, but this parameter can be used to configure a different datetime to see historical data.
    try {
      PayGrades result = client
              .payGrades
              .findById()
              .asAt(asAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#findById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayGrades> response = client
              .payGrades
              .findById()
              .asAt(asAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#findById");
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
| **asAt** | **String**| Used to configure what date to return this data, as a [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6) datetime.   All data returned from the endpoints represent the values of the attributes at a specific point in time.   By default, the current datetime is used, but this parameter can be used to configure a different datetime to see historical data. | [optional] |

### Return type

[**PayGrades**](PayGrades.md)

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

<a name="getAll"></a>
# **getAll**
> PayGradesList getAll().asAt(asAt).execute();

List all pay grades

Returns a list of all pay grades.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayGradesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String asAt = "2015-03-01T22:30:00+00:00"; // Used to configure what date to return this data, as a [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6) datetime.   All data returned from the endpoints represent the values of the attributes at a specific point in time.   By default, the current datetime is used, but this parameter can be used to configure a different datetime to see historical data.
    try {
      PayGradesList result = client
              .payGrades
              .getAll()
              .asAt(asAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayGradesList> response = client
              .payGrades
              .getAll()
              .asAt(asAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#getAll");
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
| **asAt** | **String**| Used to configure what date to return this data, as a [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6) datetime.   All data returned from the endpoints represent the values of the attributes at a specific point in time.   By default, the current datetime is used, but this parameter can be used to configure a different datetime to see historical data. | [optional] |

### Return type

[**PayGradesList**](PayGradesList.md)

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
> PayGrades updateRecord(payGradeUpdateRequest).execute();

Patch an existing Pay Grade

Patch attributes of an existing Pay Grade record with the provided data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayGradesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String effectiveFrom = "effectiveFrom_example"; // The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective from within the organisation. Note that this doesn't affect the availableFrom date of the overall Pay Grade itself.  Not providing an effectiveFrom will apply the changes from the beggining of time.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    String description = "description_example"; // Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/).
    String effectiveTo = "effectiveTo_example"; // The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective to within the organisation.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone.
    Boolean isEnabled = true; // Toggle the availability of the [Pay Grade](https://developers.intellihr.io/docs/v1/) on or off within the organisation.
    String name = "name_example"; // The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/).
    String code = "code_example"; // Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/).
    PayGradeUpdateRequestEmploymentCondition employmentCondition = new PayGradeUpdateRequestEmploymentCondition();
    String payGradeType = "payGradeType_example"; // The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/). Enum: `FIXED` or `STEP`.
    Boolean isOverridable = true; // Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten.
    Double permanentHourlyRate = 3.4D; // Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
    String permanentHourlyRateCurrency = "permanentHourlyRateCurrency_example"; // The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    Double casualHourlyRate = 3.4D; // Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
    String casualHourlyRateCurrency = "casualHourlyRateCurrency_example"; // The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    Double annualSalary = 3.4D; // Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values.
    String annualSalaryCurrency = "annualSalaryCurrency_example"; // The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes).
    List<PayGradeUpdateRequestPayStepsInner> paySteps = Arrays.asList(); // An array of Paygrade Step Rates. This will replace the current Pay Steps with a new list.  Providing an `id` for an existing Pay Step will update that record instead of createing a new Pay Step.
    try {
      PayGrades result = client
              .payGrades
              .updateRecord(effectiveFrom)
              .description(description)
              .effectiveTo(effectiveTo)
              .isEnabled(isEnabled)
              .name(name)
              .code(code)
              .employmentCondition(employmentCondition)
              .payGradeType(payGradeType)
              .isOverridable(isOverridable)
              .permanentHourlyRate(permanentHourlyRate)
              .permanentHourlyRateCurrency(permanentHourlyRateCurrency)
              .casualHourlyRate(casualHourlyRate)
              .casualHourlyRateCurrency(casualHourlyRateCurrency)
              .annualSalary(annualSalary)
              .annualSalaryCurrency(annualSalaryCurrency)
              .paySteps(paySteps)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#updateRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayGrades> response = client
              .payGrades
              .updateRecord(effectiveFrom)
              .description(description)
              .effectiveTo(effectiveTo)
              .isEnabled(isEnabled)
              .name(name)
              .code(code)
              .employmentCondition(employmentCondition)
              .payGradeType(payGradeType)
              .isOverridable(isOverridable)
              .permanentHourlyRate(permanentHourlyRate)
              .permanentHourlyRateCurrency(permanentHourlyRateCurrency)
              .casualHourlyRate(casualHourlyRate)
              .casualHourlyRateCurrency(casualHourlyRateCurrency)
              .annualSalary(annualSalary)
              .annualSalaryCurrency(annualSalaryCurrency)
              .paySteps(paySteps)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayGradesApi#updateRecord");
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
| **payGradeUpdateRequest** | [**PayGradeUpdateRequest**](PayGradeUpdateRequest.md)|  | |

### Return type

[**PayGrades**](PayGrades.md)

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

