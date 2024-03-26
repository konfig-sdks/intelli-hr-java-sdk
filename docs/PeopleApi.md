# PeopleApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPerson**](PeopleApi.md#createNewPerson) | **POST** /people |  |
| [**findById**](PeopleApi.md#findById) | **GET** /people/{id} | Find a Person by ID |
| [**listAllPeople**](PeopleApi.md#listAllPeople) | **GET** /people | List all people |
| [**updatePersonById**](PeopleApi.md#updatePersonById) | **PATCH** /people/{id} |  |


<a name="createNewPerson"></a>
# **createNewPerson**
> People createNewPerson(peopleCreateRequest).execute();



Create a person

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String lastName = "lastName_example"; // The [Person's](https://developers.intellihr.io/docs/v1/) Last Name.
    Object title = null;
    Object firstName = null;
    Object middleName = null;
    Object preferredName = null;
    Object dateOfBirth = null;
    String gender = "Other"; // Human readable string for the [Person's](https://developers.intellihr.io/docs/v1/) gender, e.g. `Male`. Searching is done case-insensitively and 'starts-with' e.g. passing `male` will match with a [Gender](https://developers.intellihr.io/docs/v1/) called \\\"Male\\\" as will \\\"m\\\" or \\\"M\\\". If multiple [Genders](https://developers.intellihr.io/docs/v1/) match the first will be chosen. The gender options available are: `Female`, `Male`, `Non-binary`, `Other`, `Undisclosed`.
    Object employeeNumber = null;
    PeopleCreateRequestEmergencyContact emergencyContact = new PeopleCreateRequestEmergencyContact();
    Object primaryEmailAddress = null;
    Object primaryPhoneNumber = null;
    List<PeopleCreateRequestEmailAddressesInner> emailAddresses = Arrays.asList(); // Information about this [Person's](https://developers.intellihr.io/docs/v1/) email addresses. This will replace all of their current emails. The provided email addresses will be converted to lowercase. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary email address.
    List<PeopleCreateRequestPhoneNumbersInner> phoneNumbers = Arrays.asList(); // Information about this [Person's](https://developers.intellihr.io/docs/v1/) phone numbers. This will replace all of their current phone numbers. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary phone number.
    List<PeopleCreateRequestAddressesInner> addresses = Arrays.asList(); // Information about this [Person's](https://developers.intellihr.io/docs/v1/) addresses. This will insert all of their current addresses.
    Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this [Person](https://developers.intellihr.io/docs/v1/)
    List<PeopleCreateRequestMedicalConditionsInner> medicalConditions = Arrays.asList(); // The medical conditions that this person has
    PeopleCreateRequestWorkRight workRight = new PeopleCreateRequestWorkRight();
    Object workRightExpiryDate = null;
    Object userAccount = null;
    try {
      People result = client
              .people
              .createNewPerson(lastName)
              .title(title)
              .firstName(firstName)
              .middleName(middleName)
              .preferredName(preferredName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .employeeNumber(employeeNumber)
              .emergencyContact(emergencyContact)
              .primaryEmailAddress(primaryEmailAddress)
              .primaryPhoneNumber(primaryPhoneNumber)
              .emailAddresses(emailAddresses)
              .phoneNumbers(phoneNumbers)
              .addresses(addresses)
              .customFields(customFields)
              .medicalConditions(medicalConditions)
              .workRight(workRight)
              .workRightExpiryDate(workRightExpiryDate)
              .userAccount(userAccount)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createNewPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<People> response = client
              .people
              .createNewPerson(lastName)
              .title(title)
              .firstName(firstName)
              .middleName(middleName)
              .preferredName(preferredName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .employeeNumber(employeeNumber)
              .emergencyContact(emergencyContact)
              .primaryEmailAddress(primaryEmailAddress)
              .primaryPhoneNumber(primaryPhoneNumber)
              .emailAddresses(emailAddresses)
              .phoneNumbers(phoneNumbers)
              .addresses(addresses)
              .customFields(customFields)
              .medicalConditions(medicalConditions)
              .workRight(workRight)
              .workRightExpiryDate(workRightExpiryDate)
              .userAccount(userAccount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#createNewPerson");
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
| **peopleCreateRequest** | [**PeopleCreateRequest**](PeopleCreateRequest.md)|  | |

### Return type

[**People**](People.md)

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

<a name="findById"></a>
# **findById**
> People findById().execute();

Find a Person by ID

Get a single Person record by UUIDv4 identifier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
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
      People result = client
              .people
              .findById()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#findById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<People> response = client
              .people
              .findById()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#findById");
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

[**People**](People.md)

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

<a name="listAllPeople"></a>
# **listAllPeople**
> PeopleList listAllPeople().filters(filters).sort(sort).execute();

List all people

Returns a list of all [People](https://developers.intellihr.io/docs/v1/) as at the current date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    PeopleListAllPeopleFiltersParameter filters = new HashMap(); // Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format `filters[<filter_name>][<operation_type>]=<filter_value>`.For example, a filter to get items matching a specific filter value would be `filters[jobId][eq]=dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12`  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality `[eq]`: Checks for an exact match with the given filter value  The list of supported filters is given below.
    String sort = "sort_example"; // Sorting can be applied in the query string to order the data returned from this endpoint. Sort can be prepended with a minus to return the data in descending (-) order. For example, a sort to get the most recent records first would be `-createdAt`.
    try {
      PeopleList result = client
              .people
              .listAllPeople()
              .filters(filters)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listAllPeople");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PeopleList> response = client
              .people
              .listAllPeople()
              .filters(filters)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#listAllPeople");
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
| **filters** | [**PeopleListAllPeopleFiltersParameter**](.md)| Filters can be applied in the query string to limit the data returned from this endpoint. Filters are provided in the format &#x60;filters[&lt;filter_name&gt;][&lt;operation_type&gt;]&#x3D;&lt;filter_value&gt;&#x60;.For example, a filter to get items matching a specific filter value would be &#x60;filters[jobId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  Below is a list of operation types available on filters, note that each filter may not support every type:  • Equality &#x60;[eq]&#x60;: Checks for an exact match with the given filter value  The list of supported filters is given below. | [optional] |
| **sort** | **String**| Sorting can be applied in the query string to order the data returned from this endpoint. Sort can be prepended with a minus to return the data in descending (-) order. For example, a sort to get the most recent records first would be &#x60;-createdAt&#x60;. | [optional] |

### Return type

[**PeopleList**](PeopleList.md)

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

<a name="updatePersonById"></a>
# **updatePersonById**
> People updatePersonById(peopleUpdateRequest).execute();



Update a person

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    Object title = null;
    Object firstName = null;
    Object middleName = null;
    String lastName = "lastName_example"; // The [Person's](https://developers.intellihr.io/docs/v1/) Last Name.
    Object preferredName = null;
    Object dateOfBirth = null;
    String gender = "Other"; // Human readable string for the [Person's](https://developers.intellihr.io/docs/v1/) gender, e.g. `Male`. Searching is done case-insensitively and 'starts-with' e.g. passing `male` will match with a [Gender](https://developers.intellihr.io/docs/v1/) called \\\"Male\\\" as will \\\"m\\\" or \\\"M\\\". If multiple [Genders](https://developers.intellihr.io/docs/v1/) match the first will be chosen. The gender options available are: `Female`, `Male`, `Non-binary`, `Other`, `Undisclosed`.
    Object employeeNumber = null;
    PeopleUpdateRequestEmergencyContact emergencyContact = new PeopleUpdateRequestEmergencyContact();
    List<PeopleUpdateRequestEmailAddressesInner> emailAddresses = Arrays.asList(); // Information about this [Person's](https://developers.intellihr.io/docs/v1/) email addresses. This will replace all of their current emails. The provided email addresses will be converted to lowercase. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary email address.
    List<PeopleUpdateRequestPhoneNumbersInner> phoneNumbers = Arrays.asList(); // Information about this [Person's](https://developers.intellihr.io/docs/v1/) phone numbers. This will replace all of their current phone numbers. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary phone number.
    List<PeopleUpdateRequestAddressesInner> addresses = Arrays.asList(); // Information about this [Person's](https://developers.intellihr.io/docs/v1/) addresses. This will replace all of their current addresses.
    Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = new HashMap(); // The custom field values for this [Person](https://developers.intellihr.io/docs/v1/)
    List<PeopleUpdateRequestMedicalConditionsInner> medicalConditions = Arrays.asList(); // The medical conditions that this person has
    Object workRight = null;
    Object workRightExpiryDate = null;
    try {
      People result = client
              .people
              .updatePersonById()
              .title(title)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .preferredName(preferredName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .employeeNumber(employeeNumber)
              .emergencyContact(emergencyContact)
              .emailAddresses(emailAddresses)
              .phoneNumbers(phoneNumbers)
              .addresses(addresses)
              .customFields(customFields)
              .medicalConditions(medicalConditions)
              .workRight(workRight)
              .workRightExpiryDate(workRightExpiryDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updatePersonById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<People> response = client
              .people
              .updatePersonById()
              .title(title)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .preferredName(preferredName)
              .dateOfBirth(dateOfBirth)
              .gender(gender)
              .employeeNumber(employeeNumber)
              .emergencyContact(emergencyContact)
              .emailAddresses(emailAddresses)
              .phoneNumbers(phoneNumbers)
              .addresses(addresses)
              .customFields(customFields)
              .medicalConditions(medicalConditions)
              .workRight(workRight)
              .workRightExpiryDate(workRightExpiryDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleApi#updatePersonById");
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
| **peopleUpdateRequest** | [**PeopleUpdateRequest**](PeopleUpdateRequest.md)|  | |

### Return type

[**People**](People.md)

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

