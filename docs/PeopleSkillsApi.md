# PeopleSkillsApi

All URIs are relative to *https://api.intellihr.io/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignSkillToPerson**](PeopleSkillsApi.md#assignSkillToPerson) | **POST** /people/{personId}/skills | Assign a Skill to a Person |
| [**deleteAssignedSkillById**](PeopleSkillsApi.md#deleteAssignedSkillById) | **DELETE** /people/{personId}/skills/{id} | Delete an Assigned Skill by ID |
| [**findSkillById**](PeopleSkillsApi.md#findSkillById) | **GET** /people/{personId}/skills/{id} | Find a Person&#39;s Skill by ID |
| [**listPersonSkills**](PeopleSkillsApi.md#listPersonSkills) | **GET** /people/{personId}/skills | List all Skills assigned to a Person |
| [**updateAssignedSkill**](PeopleSkillsApi.md#updateAssignedSkill) | **PATCH** /people/{personId}/skills/{id} | Update an Assigned Skill |


<a name="assignSkillToPerson"></a>
# **assignSkillToPerson**
> PersonId assignSkillToPerson(personId, personIdCreateRequest).execute();

Assign a Skill to a Person

Assigns a [Skill](https://developers.intellihr.io/docs/v1/) to an existing [Person](https://developers.intellihr.io/docs/v1/)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleSkillsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.intellihr.io/v1";
    
    configuration.apiKey  = "YOUR API KEY";
    IntelliHr client = new IntelliHr(configuration);
    String skillId = "skillId_example"; // The identifier string for the [Skill](https://developers.intellihr.io/docs/v1/).
    String skillLevel = "skillLevel_example"; // The Skill Level you wish to apply to this Skill. Enum: `Expert`, `Proficient`, `Interested`, `Basic`.
    String personId = "personId_example"; // Id string param for relevant [Person](https://developers.intellihr.io/docs/v1/)
    try {
      PersonId result = client
              .peopleSkills
              .assignSkillToPerson(skillId, skillLevel, personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#assignSkillToPerson");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonId> response = client
              .peopleSkills
              .assignSkillToPerson(skillId, skillLevel, personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#assignSkillToPerson");
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
| **personIdCreateRequest** | [**PersonIdCreateRequest**](PersonIdCreateRequest.md)|  | |

### Return type

[**PersonId**](PersonId.md)

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

<a name="deleteAssignedSkillById"></a>
# **deleteAssignedSkillById**
> deleteAssignedSkillById(personId).execute();

Delete an Assigned Skill by ID

Deletes the assigned [Skill](https://developers.intellihr.io/docs/v1/) from a [Person](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleSkillsApi;
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
    try {
      client
              .peopleSkills
              .deleteAssignedSkillById(personId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#deleteAssignedSkillById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .peopleSkills
              .deleteAssignedSkillById(personId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#deleteAssignedSkillById");
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

<a name="findSkillById"></a>
# **findSkillById**
> PersonId findSkillById(personId).execute();

Find a Person&#39;s Skill by ID

Returns a single [Skill](https://developers.intellihr.io/docs/v1/) for the provided [Person](https://developers.intellihr.io/docs/v1/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleSkillsApi;
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
    try {
      PersonId result = client
              .peopleSkills
              .findSkillById(personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#findSkillById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonId> response = client
              .peopleSkills
              .findSkillById(personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#findSkillById");
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

### Return type

[**PersonId**](PersonId.md)

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

<a name="listPersonSkills"></a>
# **listPersonSkills**
> PersonIdList listPersonSkills(personId).execute();

List all Skills assigned to a Person

Returns a list of all [Skills](https://developers.intellihr.io/docs/v1/) for the provided [Person](https://developers.intellihr.io/docs/v1/).  Note that this endpoint is not Paginated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleSkillsApi;
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
    try {
      PersonIdList result = client
              .peopleSkills
              .listPersonSkills(personId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#listPersonSkills");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonIdList> response = client
              .peopleSkills
              .listPersonSkills(personId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#listPersonSkills");
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

### Return type

[**PersonIdList**](PersonIdList.md)

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

<a name="updateAssignedSkill"></a>
# **updateAssignedSkill**
> PersonId updateAssignedSkill(personId, personIdPatchRequest).execute();

Update an Assigned Skill

Update an assigned [Skill](https://developers.intellihr.io/docs/v1/) on a [Person](https://developers.intellihr.io/docs/v1/)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.IntelliHr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PeopleSkillsApi;
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
    String skillLevel = "skillLevel_example"; // The Skill Level you wish to apply to this Skill. Enum: `Expert`, `Proficient`, `Interested`, `Basic`.
    try {
      PersonId result = client
              .peopleSkills
              .updateAssignedSkill(personId)
              .skillLevel(skillLevel)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#updateAssignedSkill");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PersonId> response = client
              .peopleSkills
              .updateAssignedSkill(personId)
              .skillLevel(skillLevel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PeopleSkillsApi#updateAssignedSkill");
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
| **personIdPatchRequest** | [**PersonIdPatchRequest**](PersonIdPatchRequest.md)|  | |

### Return type

[**PersonId**](PersonId.md)

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

