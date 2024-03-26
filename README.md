<div align="left">

[![Visit Intellihr](./header.png)](https://intellihr.com)

# [Intellihr](https://intellihr.com)

You can find developer's guide and more documentation on [https://developers.intellihr.io](https://developers.intellihr.io)

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=intelliHR&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>intelli-hr-java-sdk</artifactId>
  <version>V1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:intelli-hr-java-sdk:V1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/intelli-hr-java-sdk-V1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.intellihr.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BusinessEntitiesApi* | [**createNewEntity**](docs/BusinessEntitiesApi.md#createNewEntity) | **POST** /business-entities | Create a new Business Entity
*BusinessEntitiesApi* | [**deleteById**](docs/BusinessEntitiesApi.md#deleteById) | **DELETE** /business-entities/{id} | Delete a Business Entity by ID
*BusinessEntitiesApi* | [**findById**](docs/BusinessEntitiesApi.md#findById) | **GET** /business-entities/{id} | Find a Business Entity by ID
*BusinessEntitiesApi* | [**listAll**](docs/BusinessEntitiesApi.md#listAll) | **GET** /business-entities | List all Business Entities
*BusinessEntitiesApi* | [**updateById**](docs/BusinessEntitiesApi.md#updateById) | **PATCH** /business-entities/{id} | Update a Business Entity by ID
*BusinessUnitsApi* | [**createNewUnit**](docs/BusinessUnitsApi.md#createNewUnit) | **POST** /business-units | Create a new Business Unit
*BusinessUnitsApi* | [**deleteById**](docs/BusinessUnitsApi.md#deleteById) | **DELETE** /business-units/{id} | Delete a Business Unit by ID
*BusinessUnitsApi* | [**findById**](docs/BusinessUnitsApi.md#findById) | **GET** /business-units/{id} | Find a Business Unit by ID
*BusinessUnitsApi* | [**listAll**](docs/BusinessUnitsApi.md#listAll) | **GET** /business-units | List all Business Units
*BusinessUnitsApi* | [**updateById**](docs/BusinessUnitsApi.md#updateById) | **PATCH** /business-units/{id} | Update a Business Unit by ID
*CustomFieldDefinitionsApi* | [**createDefinition**](docs/CustomFieldDefinitionsApi.md#createDefinition) | **POST** /custom-field-definitions | Create a Custom Field Definition
*CustomFieldDefinitionsApi* | [**deleteById**](docs/CustomFieldDefinitionsApi.md#deleteById) | **DELETE** /custom-field-definitions/{id} | Delete a Custom Field Definition by ID
*CustomFieldDefinitionsApi* | [**findDefinitionById**](docs/CustomFieldDefinitionsApi.md#findDefinitionById) | **GET** /custom-field-definitions/{id} | Find a Custom Field Definition by ID
*CustomFieldDefinitionsApi* | [**listAll**](docs/CustomFieldDefinitionsApi.md#listAll) | **GET** /custom-field-definitions | List all Custom Field Definitions
*CustomFieldDefinitionsApi* | [**updateDefinitionById**](docs/CustomFieldDefinitionsApi.md#updateDefinitionById) | **PATCH** /custom-field-definitions/{id} | Update a Custom Field Definition
*DefaultRemunerationComponentsApi* | [**findById**](docs/DefaultRemunerationComponentsApi.md#findById) | **GET** /default-remuneration-components/{id} | Find a Default Remuneration Component by ID
*DefaultRemunerationComponentsApi* | [**listAll**](docs/DefaultRemunerationComponentsApi.md#listAll) | **GET** /default-remuneration-components | List all Default Remuneration Components
*EmploymentConditionsApi* | [**findById**](docs/EmploymentConditionsApi.md#findById) | **GET** /employment-conditions/{id} | Find an Employment Condition by ID
*EmploymentConditionsApi* | [**listAllEmploymentConditions**](docs/EmploymentConditionsApi.md#listAllEmploymentConditions) | **GET** /employment-conditions | List all employment conditions
*EndJobApi* | [**cancelEndDate**](docs/EndJobApi.md#cancelEndDate) | **DELETE** /job-end/{id} | Cancel job end date
*EndJobApi* | [**jobFinalize**](docs/EndJobApi.md#jobFinalize) | **PATCH** /job-end/{id} | End a job
*ExtendedLeaveApi* | [**createNew**](docs/ExtendedLeaveApi.md#createNew) | **POST** /extended-leave | Create Extended Leave
*ExtendedLeaveApi* | [**updateFinalise**](docs/ExtendedLeaveApi.md#updateFinalise) | **PATCH** /extended-leave/{id} | Update or Finalise Extended Leave
*ExtendedLeaveTypesApi* | [**findById**](docs/ExtendedLeaveTypesApi.md#findById) | **GET** /extended-leave-types/{id} | Find an Extended Leave Type by ID
*ExtendedLeaveTypesApi* | [**listAll**](docs/ExtendedLeaveTypesApi.md#listAll) | **GET** /extended-leave-types | List all Extended Leave Types
*FormsApi* | [**findById**](docs/FormsApi.md#findById) | **GET** /forms/{id} | Find a Form by ID
*JobChangeReasonsApi* | [**createNewReason**](docs/JobChangeReasonsApi.md#createNewReason) | **POST** /job-change-reasons | Create a new Job Change Reason
*JobChangeReasonsApi* | [**deleteById**](docs/JobChangeReasonsApi.md#deleteById) | **DELETE** /job-change-reasons/{id} | Delete a Job Change Reason by ID
*JobChangeReasonsApi* | [**findById**](docs/JobChangeReasonsApi.md#findById) | **GET** /job-change-reasons/{id} | Find a Job Change Reason by ID
*JobChangeReasonsApi* | [**listAll**](docs/JobChangeReasonsApi.md#listAll) | **GET** /job-change-reasons | List all Job Change Reasons
*JobChangeReasonsApi* | [**updateById**](docs/JobChangeReasonsApi.md#updateById) | **PATCH** /job-change-reasons/{id} | Update a Job Change Reason by ID
*JobRequirementGroupsApi* | [**createNewGroup**](docs/JobRequirementGroupsApi.md#createNewGroup) | **POST** /job-requirement-groups | Create a new Job Requirement Group
*JobRequirementGroupsApi* | [**deleteById**](docs/JobRequirementGroupsApi.md#deleteById) | **DELETE** /job-requirement-groups/{id} | Delete a Job Requirement Group by ID
*JobRequirementGroupsApi* | [**findById**](docs/JobRequirementGroupsApi.md#findById) | **GET** /job-requirement-groups/{id} | Find a Job Requirement Group by ID
*JobRequirementGroupsApi* | [**listAll**](docs/JobRequirementGroupsApi.md#listAll) | **GET** /job-requirement-groups | List all Job Requirement Groups
*JobRequirementGroupsApi* | [**updateAttributes**](docs/JobRequirementGroupsApi.md#updateAttributes) | **PATCH** /job-requirement-groups/{id} | Patch an existing Job Requirement Group
*JobTimelineApi* | [**getUpcomingChanges**](docs/JobTimelineApi.md#getUpcomingChanges) | **GET** /jobs/{jobId}/timeline | Get Job Timeline
*JobsApi* | [**createRecord**](docs/JobsApi.md#createRecord) | **POST** /jobs | Create a new Job
*JobsApi* | [**findById**](docs/JobsApi.md#findById) | **GET** /jobs/{id} | Find a Job by ID
*JobsApi* | [**getAll**](docs/JobsApi.md#getAll) | **GET** /jobs | List all Jobs
*JobsApi* | [**updateAttributes**](docs/JobsApi.md#updateAttributes) | **PATCH** /jobs/{id} | Patch an existing Job
*LocationsApi* | [**createNewLocation**](docs/LocationsApi.md#createNewLocation) | **POST** /locations | Create a new Location
*LocationsApi* | [**deleteById**](docs/LocationsApi.md#deleteById) | **DELETE** /locations/{id} | Delete a Location by ID
*LocationsApi* | [**findLocationById**](docs/LocationsApi.md#findLocationById) | **GET** /locations/{id} | Find a Location by ID
*LocationsApi* | [**listAll**](docs/LocationsApi.md#listAll) | **GET** /locations | List all locations
*LocationsApi* | [**updateById**](docs/LocationsApi.md#updateById) | **PATCH** /locations/{id} | Update a Location by ID
*PayGradesApi* | [**createRecord**](docs/PayGradesApi.md#createRecord) | **POST** /pay-grades | Create a new Pay Grade
*PayGradesApi* | [**deleteById**](docs/PayGradesApi.md#deleteById) | **DELETE** /pay-grades/{id} | Delete a Pay Grade by ID
*PayGradesApi* | [**findById**](docs/PayGradesApi.md#findById) | **GET** /pay-grades/{id} | Find a Pay Grade by ID
*PayGradesApi* | [**getAll**](docs/PayGradesApi.md#getAll) | **GET** /pay-grades | List all pay grades
*PayGradesApi* | [**updateRecord**](docs/PayGradesApi.md#updateRecord) | **PATCH** /pay-grades/{id} | Patch an existing Pay Grade
*PeopleApi* | [**createNewPerson**](docs/PeopleApi.md#createNewPerson) | **POST** /people | 
*PeopleApi* | [**findById**](docs/PeopleApi.md#findById) | **GET** /people/{id} | Find a Person by ID
*PeopleApi* | [**listAllPeople**](docs/PeopleApi.md#listAllPeople) | **GET** /people | List all people
*PeopleApi* | [**updatePersonById**](docs/PeopleApi.md#updatePersonById) | **PATCH** /people/{id} | 
*PeopleDocumentsApi* | [**createPresignedUploadUrl**](docs/PeopleDocumentsApi.md#createPresignedUploadUrl) | **POST** /people/{personId}/documents | 
*PeopleDocumentsApi* | [**list**](docs/PeopleDocumentsApi.md#list) | **GET** /people/{personId}/documents | List all Documents of a person
*PeopleDocumentsApi* | [**updateDocument**](docs/PeopleDocumentsApi.md#updateDocument) | **PATCH** /people/{personId}/documents/{id} | 
*PeopleImagesApi* | [**generateTemporaryImageUrl**](docs/PeopleImagesApi.md#generateTemporaryImageUrl) | **POST** /people/{personId}/images | Generate an temporary image upload URL for the provided Person.
*PeopleImagesApi* | [**getTemporaryImage**](docs/PeopleImagesApi.md#getTemporaryImage) | **GET** /people/{personId}/images | Get a temporary image
*PeopleImagesApi* | [**promoteImage**](docs/PeopleImagesApi.md#promoteImage) | **PATCH** /people/{personId}/images | Promote temporary image
*PeopleSkillsApi* | [**assignSkillToPerson**](docs/PeopleSkillsApi.md#assignSkillToPerson) | **POST** /people/{personId}/skills | Assign a Skill to a Person
*PeopleSkillsApi* | [**deleteAssignedSkillById**](docs/PeopleSkillsApi.md#deleteAssignedSkillById) | **DELETE** /people/{personId}/skills/{id} | Delete an Assigned Skill by ID
*PeopleSkillsApi* | [**findSkillById**](docs/PeopleSkillsApi.md#findSkillById) | **GET** /people/{personId}/skills/{id} | Find a Person&#39;s Skill by ID
*PeopleSkillsApi* | [**listPersonSkills**](docs/PeopleSkillsApi.md#listPersonSkills) | **GET** /people/{personId}/skills | List all Skills assigned to a Person
*PeopleSkillsApi* | [**updateAssignedSkill**](docs/PeopleSkillsApi.md#updateAssignedSkill) | **PATCH** /people/{personId}/skills/{id} | Update an Assigned Skill
*PermissionGroupsApi* | [**findGroupById**](docs/PermissionGroupsApi.md#findGroupById) | **GET** /permission-groups/{id} | Find a Permission Group by ID
*PermissionGroupsApi* | [**listAll**](docs/PermissionGroupsApi.md#listAll) | **GET** /permission-groups | List all Permission Groups
*PersonDocumentsDeprecatedApi* | [**createPresignedUploadUrl**](docs/PersonDocumentsDeprecatedApi.md#createPresignedUploadUrl) | **POST** /person-documents | 
*PersonDocumentsDeprecatedApi* | [**updateDocument**](docs/PersonDocumentsDeprecatedApi.md#updateDocument) | **PATCH** /person-documents/{id} | 
*PositionTitlesApi* | [**createNewRecord**](docs/PositionTitlesApi.md#createNewRecord) | **POST** /position-titles | Create a new Position Title
*PositionTitlesApi* | [**deleteById**](docs/PositionTitlesApi.md#deleteById) | **DELETE** /position-titles/{id} | Delete a Position Title by ID
*PositionTitlesApi* | [**listAll**](docs/PositionTitlesApi.md#listAll) | **GET** /position-titles | List all position titles
*PositionTitlesApi* | [**updateAttributes**](docs/PositionTitlesApi.md#updateAttributes) | **PATCH** /position-titles/{id} | Patch an existing Position Title
*QualificationInstancesApi* | [**createNewInstance**](docs/QualificationInstancesApi.md#createNewInstance) | **POST** /qualifications | Create a new Qualification Instance
*QualificationInstancesApi* | [**deleteById**](docs/QualificationInstancesApi.md#deleteById) | **DELETE** /qualifications/{id} | Delete a Qualification Instance by ID
*QualificationInstancesApi* | [**findById**](docs/QualificationInstancesApi.md#findById) | **GET** /qualifications/{id} | Find a Qualification Instance by ID
*QualificationInstancesApi* | [**listAll**](docs/QualificationInstancesApi.md#listAll) | **GET** /qualifications | List all Qualification Instances
*QualificationInstancesApi* | [**updateInstanceById**](docs/QualificationInstancesApi.md#updateInstanceById) | **PATCH** /qualifications/{id} | Update a Qualification Instance by ID
*QualificationLibraryItemsApi* | [**createNewRecord**](docs/QualificationLibraryItemsApi.md#createNewRecord) | **POST** /qualification-library-items | Create a new Qualification Library Item
*QualificationLibraryItemsApi* | [**deleteById**](docs/QualificationLibraryItemsApi.md#deleteById) | **DELETE** /qualification-library-items/{id} | Delete a Qualification Library Item by ID
*QualificationLibraryItemsApi* | [**findByID**](docs/QualificationLibraryItemsApi.md#findByID) | **GET** /qualification-library-items/{id} | Find a Qualification Library Item by ID
*QualificationLibraryItemsApi* | [**getAllQualifications**](docs/QualificationLibraryItemsApi.md#getAllQualifications) | **GET** /qualification-library-items | List all Qualification Library Items
*QualificationLibraryItemsApi* | [**updateRecord**](docs/QualificationLibraryItemsApi.md#updateRecord) | **PATCH** /qualification-library-items/{id} | Patch an existing Qualification Library Item
*QualificationStatusesApi* | [**findStatusById**](docs/QualificationStatusesApi.md#findStatusById) | **GET** /qualification-statuses/{id} | Find a Qualification Status by ID
*QualificationTypesApi* | [**findById**](docs/QualificationTypesApi.md#findById) | **GET** /qualification-types/{id} | Find a Qualification Type by ID
*QualificationTypesApi* | [**listAllQualificationTypes**](docs/QualificationTypesApi.md#listAllQualificationTypes) | **GET** /qualification-types | List all Qualification Types
*RecruitmentSourcesApi* | [**findById**](docs/RecruitmentSourcesApi.md#findById) | **GET** /recruitment-sources/{id} | Find a Recruitment Source by ID
*RecruitmentSourcesApi* | [**listAll**](docs/RecruitmentSourcesApi.md#listAll) | **GET** /recruitment-sources | List all recruitment sources
*RepresentativeTypesApi* | [**findById**](docs/RepresentativeTypesApi.md#findById) | **GET** /representative-types/{id} | Find a Representative Type by ID
*RepresentativeTypesApi* | [**listAll**](docs/RepresentativeTypesApi.md#listAll) | **GET** /representative-types | List all Representative Types
*SkillDisciplinesApi* | [**createNewDiscipline**](docs/SkillDisciplinesApi.md#createNewDiscipline) | **POST** /skill-disciplines | Create a Skill Discipline
*SkillDisciplinesApi* | [**findById**](docs/SkillDisciplinesApi.md#findById) | **GET** /skill-disciplines/{id} | Find a Skill Discipline by ID
*SkillDisciplinesApi* | [**listAll**](docs/SkillDisciplinesApi.md#listAll) | **GET** /skill-disciplines | List all Skill Disciplines
*SkillDisciplinesApi* | [**updateDisciplineById**](docs/SkillDisciplinesApi.md#updateDisciplineById) | **PATCH** /skill-disciplines/{id} | Patch a Skill Discipline
*SkillsApi* | [**createNewSkill**](docs/SkillsApi.md#createNewSkill) | **POST** /skills | 
*SkillsApi* | [**findSkillById**](docs/SkillsApi.md#findSkillById) | **GET** /skills/{id} | Find a Skill by ID
*SkillsApi* | [**getAll**](docs/SkillsApi.md#getAll) | **GET** /skills | List all Skills
*SkillsApi* | [**updateSkillById**](docs/SkillsApi.md#updateSkillById) | **PATCH** /skills/{id} | 
*TrainingProvidersApi* | [**findById**](docs/TrainingProvidersApi.md#findById) | **GET** /training-providers/{id} | Find a Training Provider by ID
*TrainingProvidersApi* | [**listAll**](docs/TrainingProvidersApi.md#listAll) | **GET** /training-providers | List all Training Providers
*TrainingStatusesApi* | [**listAll**](docs/TrainingStatusesApi.md#listAll) | **GET** /training-statuses | List all Training Statuses
*TrainingTypesApi* | [**findById**](docs/TrainingTypesApi.md#findById) | **GET** /training-types/{id} | Find a Training Type by ID
*TrainingTypesApi* | [**listAll**](docs/TrainingTypesApi.md#listAll) | **GET** /training-types | List all Training Types
*TrainingsApi* | [**createNewTraining**](docs/TrainingsApi.md#createNewTraining) | **POST** /trainings | 
*TrainingsApi* | [**deleteById**](docs/TrainingsApi.md#deleteById) | **DELETE** /trainings/{id} | Delete a Training by ID
*TrainingsApi* | [**findTrainingById**](docs/TrainingsApi.md#findTrainingById) | **GET** /trainings/{id} | Find a Training by ID
*TrainingsApi* | [**listAll**](docs/TrainingsApi.md#listAll) | **GET** /trainings | List all Trainings
*TrainingsApi* | [**updateTrainingById**](docs/TrainingsApi.md#updateTrainingById) | **PATCH** /trainings/{id} | 
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /users | Create a User
*UsersApi* | [**findUserById**](docs/UsersApi.md#findUserById) | **GET** /users/{id} | Find a User by ID
*UsersApi* | [**getAllUsers**](docs/UsersApi.md#getAllUsers) | **GET** /users | List all Users
*UsersApi* | [**updateById**](docs/UsersApi.md#updateById) | **PATCH** /users/{id} | Patch a User by ID
*WebhookEventsApi* | [**findEventById**](docs/WebhookEventsApi.md#findEventById) | **GET** /webhook-events/{id} | Find a Webhook Event by ID
*WebhookEventsApi* | [**listAllEvents**](docs/WebhookEventsApi.md#listAllEvents) | **GET** /webhook-events | List all Webhook Events
*WebhooksApi* | [**createWebhook**](docs/WebhooksApi.md#createWebhook) | **POST** /webhooks | Create a Webhook
*WebhooksApi* | [**deleteById**](docs/WebhooksApi.md#deleteById) | **DELETE** /webhooks/{id} | Delete a Webhook by ID
*WebhooksApi* | [**findById**](docs/WebhooksApi.md#findById) | **GET** /webhooks/{id} | Find a Webhook by ID
*WebhooksApi* | [**listAll**](docs/WebhooksApi.md#listAll) | **GET** /webhooks | List all Webhooks
*WebhooksApi* | [**updateWebhook**](docs/WebhooksApi.md#updateWebhook) | **PATCH** /webhooks/{id} | Patch a Webhook
*WorkClassesApi* | [**findById**](docs/WorkClassesApi.md#findById) | **GET** /work-classes/{id} | Find a Work Class by ID
*WorkClassesApi* | [**listAll**](docs/WorkClassesApi.md#listAll) | **GET** /work-classes | List all work classes
*WorkRightsApi* | [**findWorkRightById**](docs/WorkRightsApi.md#findWorkRightById) | **GET** /work-rights/{id} | Find a Work Right by ID
*WorkRightsApi* | [**listAll**](docs/WorkRightsApi.md#listAll) | **GET** /work-rights | List all Work Rights
*WorkTypesApi* | [**findById**](docs/WorkTypesApi.md#findById) | **GET** /work-types/{id} | Find a Work Type by ID
*WorkTypesApi* | [**listAll**](docs/WorkTypesApi.md#listAll) | **GET** /work-types | List all Work Types
*WorkflowEventsApi* | [**findById**](docs/WorkflowEventsApi.md#findById) | **GET** /workflow-events/{id} | Find a Workflow Event by ID
*WorkflowsApi* | [**triggerById**](docs/WorkflowsApi.md#triggerById) | **PATCH** /workflows/{id} | Trigger a Workflow by ID


## Documentation for Models

 - [AssignedImageProperty](docs/AssignedImageProperty.md)
 - [AssignedImageProperty1](docs/AssignedImageProperty1.md)
 - [AssignedImageProperty1Fields](docs/AssignedImageProperty1Fields.md)
 - [AssignedSkill](docs/AssignedSkill.md)
 - [AssignedSkillProperty](docs/AssignedSkillProperty.md)
 - [AssignedSkillPropertySkillDiscipline](docs/AssignedSkillPropertySkillDiscipline.md)
 - [AssignedSkillSkillDiscipline](docs/AssignedSkillSkillDiscipline.md)
 - [BusinessEntities](docs/BusinessEntities.md)
 - [BusinessEntitiesCreateRequest](docs/BusinessEntitiesCreateRequest.md)
 - [BusinessEntitiesCreateRequestCustomFieldsValue](docs/BusinessEntitiesCreateRequestCustomFieldsValue.md)
 - [BusinessEntitiesList](docs/BusinessEntitiesList.md)
 - [BusinessEntitiesListLinks](docs/BusinessEntitiesListLinks.md)
 - [BusinessEntitiesListMeta](docs/BusinessEntitiesListMeta.md)
 - [BusinessEntitiesListMetaPagination](docs/BusinessEntitiesListMetaPagination.md)
 - [BusinessEntitiesMeta](docs/BusinessEntitiesMeta.md)
 - [BusinessEntitiesPatchRequest](docs/BusinessEntitiesPatchRequest.md)
 - [BusinessEntitiesPatchRequestCustomFieldsValue](docs/BusinessEntitiesPatchRequestCustomFieldsValue.md)
 - [BusinessEntity](docs/BusinessEntity.md)
 - [BusinessEntityProperty](docs/BusinessEntityProperty.md)
 - [BusinessUnit](docs/BusinessUnit.md)
 - [BusinessUnitProperty](docs/BusinessUnitProperty.md)
 - [BusinessUnits](docs/BusinessUnits.md)
 - [BusinessUnitsCreateRequest](docs/BusinessUnitsCreateRequest.md)
 - [BusinessUnitsList](docs/BusinessUnitsList.md)
 - [BusinessUnitsListAllFiltersParameter](docs/BusinessUnitsListAllFiltersParameter.md)
 - [BusinessUnitsListLinks](docs/BusinessUnitsListLinks.md)
 - [BusinessUnitsListMeta](docs/BusinessUnitsListMeta.md)
 - [BusinessUnitsListMetaPagination](docs/BusinessUnitsListMetaPagination.md)
 - [BusinessUnitsMeta](docs/BusinessUnitsMeta.md)
 - [BusinessUnitsPatchRequest](docs/BusinessUnitsPatchRequest.md)
 - [CustomFieldDefinition](docs/CustomFieldDefinition.md)
 - [CustomFieldDefinitionCreateRequest](docs/CustomFieldDefinitionCreateRequest.md)
 - [CustomFieldDefinitionPatchRequest](docs/CustomFieldDefinitionPatchRequest.md)
 - [CustomFieldDefinitionProperty](docs/CustomFieldDefinitionProperty.md)
 - [CustomFieldDefinitions](docs/CustomFieldDefinitions.md)
 - [CustomFieldDefinitionsList](docs/CustomFieldDefinitionsList.md)
 - [CustomFieldDefinitionsListAllFiltersParameter](docs/CustomFieldDefinitionsListAllFiltersParameter.md)
 - [CustomFieldDefinitionsListLinks](docs/CustomFieldDefinitionsListLinks.md)
 - [CustomFieldDefinitionsListMeta](docs/CustomFieldDefinitionsListMeta.md)
 - [CustomFieldDefinitionsListMetaPagination](docs/CustomFieldDefinitionsListMetaPagination.md)
 - [CustomFieldDefinitionsMeta](docs/CustomFieldDefinitionsMeta.md)
 - [DataPropertyInner](docs/DataPropertyInner.md)
 - [DataPropertyInner1](docs/DataPropertyInner1.md)
 - [DataPropertyInner1WebhookEvent](docs/DataPropertyInner1WebhookEvent.md)
 - [DataPropertyInnerAddressesInner](docs/DataPropertyInnerAddressesInner.md)
 - [DataPropertyInnerEmailAddressesInner](docs/DataPropertyInnerEmailAddressesInner.md)
 - [DataPropertyInnerEmergencyContact](docs/DataPropertyInnerEmergencyContact.md)
 - [DataPropertyInnerJobsInner](docs/DataPropertyInnerJobsInner.md)
 - [DataPropertyInnerMedicalConditionsInner](docs/DataPropertyInnerMedicalConditionsInner.md)
 - [DataPropertyInnerPhoneNumbersInner](docs/DataPropertyInnerPhoneNumbersInner.md)
 - [DataPropertyInnerWorkRights](docs/DataPropertyInnerWorkRights.md)
 - [DefaultRemunerationComponent](docs/DefaultRemunerationComponent.md)
 - [DefaultRemunerationComponentProperty](docs/DefaultRemunerationComponentProperty.md)
 - [DefaultRemunerationComponents](docs/DefaultRemunerationComponents.md)
 - [DefaultRemunerationComponentsList](docs/DefaultRemunerationComponentsList.md)
 - [DefaultRemunerationComponentsListLinks](docs/DefaultRemunerationComponentsListLinks.md)
 - [DefaultRemunerationComponentsListMeta](docs/DefaultRemunerationComponentsListMeta.md)
 - [DefaultRemunerationComponentsListMetaPagination](docs/DefaultRemunerationComponentsListMetaPagination.md)
 - [DefaultRemunerationComponentsMeta](docs/DefaultRemunerationComponentsMeta.md)
 - [EmploymentCondition](docs/EmploymentCondition.md)
 - [EmploymentConditionProperty](docs/EmploymentConditionProperty.md)
 - [EmploymentConditions](docs/EmploymentConditions.md)
 - [EmploymentConditionsList](docs/EmploymentConditionsList.md)
 - [EmploymentConditionsListLinks](docs/EmploymentConditionsListLinks.md)
 - [EmploymentConditionsListMeta](docs/EmploymentConditionsListMeta.md)
 - [EmploymentConditionsListMetaPagination](docs/EmploymentConditionsListMetaPagination.md)
 - [EmploymentConditionsMeta](docs/EmploymentConditionsMeta.md)
 - [ExtendedLeaveProperty](docs/ExtendedLeaveProperty.md)
 - [ExtendedLeaveProperty1](docs/ExtendedLeaveProperty1.md)
 - [ExtendedLeaveProperty1Person](docs/ExtendedLeaveProperty1Person.md)
 - [ExtendedLeavePropertyPerson](docs/ExtendedLeavePropertyPerson.md)
 - [ExtendedLeaveType](docs/ExtendedLeaveType.md)
 - [ExtendedLeaveTypeProperty](docs/ExtendedLeaveTypeProperty.md)
 - [ExtendedLeaveTypeProperty1](docs/ExtendedLeaveTypeProperty1.md)
 - [ExtendedLeaveTypeProperty2](docs/ExtendedLeaveTypeProperty2.md)
 - [ExtendedLeaveTypes](docs/ExtendedLeaveTypes.md)
 - [ExtendedLeaveTypesList](docs/ExtendedLeaveTypesList.md)
 - [ExtendedLeaveTypesListLinks](docs/ExtendedLeaveTypesListLinks.md)
 - [ExtendedLeaveTypesListMeta](docs/ExtendedLeaveTypesListMeta.md)
 - [ExtendedLeaveTypesListMetaPagination](docs/ExtendedLeaveTypesListMetaPagination.md)
 - [ExtendedLeaveTypesMeta](docs/ExtendedLeaveTypesMeta.md)
 - [FormProperty](docs/FormProperty.md)
 - [FormPropertyDocumentUploadsInner](docs/FormPropertyDocumentUploadsInner.md)
 - [FormPropertyFormDesign](docs/FormPropertyFormDesign.md)
 - [FormPropertySubject](docs/FormPropertySubject.md)
 - [FormPropertySubjectJob](docs/FormPropertySubjectJob.md)
 - [FormPropertySubjectPerson](docs/FormPropertySubjectPerson.md)
 - [Forms](docs/Forms.md)
 - [FormsMeta](docs/FormsMeta.md)
 - [Job](docs/Job.md)
 - [JobBusinessEntity](docs/JobBusinessEntity.md)
 - [JobBusinessUnit](docs/JobBusinessUnit.md)
 - [JobChangeReason](docs/JobChangeReason.md)
 - [JobChangeReasonProperty](docs/JobChangeReasonProperty.md)
 - [JobChangeReasons](docs/JobChangeReasons.md)
 - [JobChangeReasonsCreateRequest](docs/JobChangeReasonsCreateRequest.md)
 - [JobChangeReasonsList](docs/JobChangeReasonsList.md)
 - [JobChangeReasonsListLinks](docs/JobChangeReasonsListLinks.md)
 - [JobChangeReasonsListMeta](docs/JobChangeReasonsListMeta.md)
 - [JobChangeReasonsListMetaPagination](docs/JobChangeReasonsListMetaPagination.md)
 - [JobChangeReasonsMeta](docs/JobChangeReasonsMeta.md)
 - [JobChangeReasonsPatchRequest](docs/JobChangeReasonsPatchRequest.md)
 - [JobCommentsInner](docs/JobCommentsInner.md)
 - [JobCommentsInnerJobChangeReason](docs/JobCommentsInnerJobChangeReason.md)
 - [JobCreateRequest](docs/JobCreateRequest.md)
 - [JobCreateRequestBusinessEntity](docs/JobCreateRequestBusinessEntity.md)
 - [JobCreateRequestBusinessUnit](docs/JobCreateRequestBusinessUnit.md)
 - [JobCreateRequestEmploymentCondition](docs/JobCreateRequestEmploymentCondition.md)
 - [JobCreateRequestEstablishment](docs/JobCreateRequestEstablishment.md)
 - [JobCreateRequestLocation](docs/JobCreateRequestLocation.md)
 - [JobCreateRequestPayGrade](docs/JobCreateRequestPayGrade.md)
 - [JobCreateRequestPerson](docs/JobCreateRequestPerson.md)
 - [JobCreateRequestRecruitment](docs/JobCreateRequestRecruitment.md)
 - [JobCreateRequestRecruitmentSource](docs/JobCreateRequestRecruitmentSource.md)
 - [JobCreateRequestRemunerationSchedule](docs/JobCreateRequestRemunerationSchedule.md)
 - [JobCreateRequestRemunerationScheduleAdditionsInner](docs/JobCreateRequestRemunerationScheduleAdditionsInner.md)
 - [JobCreateRequestRemunerationScheduleAdditionsInnerDefaultRemunerationComponent](docs/JobCreateRequestRemunerationScheduleAdditionsInnerDefaultRemunerationComponent.md)
 - [JobCreateRequestRemunerationScheduleAdditionsToTotalInner](docs/JobCreateRequestRemunerationScheduleAdditionsToTotalInner.md)
 - [JobCreateRequestRemunerationScheduleAdditionsToTotalInnerDefaultRemunerationComponent](docs/JobCreateRequestRemunerationScheduleAdditionsToTotalInnerDefaultRemunerationComponent.md)
 - [JobCreateRequestRemunerationScheduleBreakdownsInner](docs/JobCreateRequestRemunerationScheduleBreakdownsInner.md)
 - [JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent](docs/JobCreateRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent.md)
 - [JobCreateRequestRemunerationScheduleEmploymentCondition](docs/JobCreateRequestRemunerationScheduleEmploymentCondition.md)
 - [JobCreateRequestSupervisorJob](docs/JobCreateRequestSupervisorJob.md)
 - [JobCreateRequestSupervisorPerson](docs/JobCreateRequestSupervisorPerson.md)
 - [JobCreateRequestWorkClass](docs/JobCreateRequestWorkClass.md)
 - [JobCreateRequestWorkType](docs/JobCreateRequestWorkType.md)
 - [JobCreateResponse](docs/JobCreateResponse.md)
 - [JobCreateResponseMeta](docs/JobCreateResponseMeta.md)
 - [JobEndPatchRequest](docs/JobEndPatchRequest.md)
 - [JobEndPatchResponse](docs/JobEndPatchResponse.md)
 - [JobEndPatchResponseData](docs/JobEndPatchResponseData.md)
 - [JobEndPatchResponseDataJob](docs/JobEndPatchResponseDataJob.md)
 - [JobEndPatchResponseDataJobBusinessEntity](docs/JobEndPatchResponseDataJobBusinessEntity.md)
 - [JobEndPatchResponseDataJobBusinessUnit](docs/JobEndPatchResponseDataJobBusinessUnit.md)
 - [JobEndPatchResponseDataJobCommentsInner](docs/JobEndPatchResponseDataJobCommentsInner.md)
 - [JobEndPatchResponseDataJobCommentsInnerJobChangeReason](docs/JobEndPatchResponseDataJobCommentsInnerJobChangeReason.md)
 - [JobEndPatchResponseDataJobEstablishment](docs/JobEndPatchResponseDataJobEstablishment.md)
 - [JobEndPatchResponseDataJobLocation](docs/JobEndPatchResponseDataJobLocation.md)
 - [JobEndPatchResponseDataJobPayGrade](docs/JobEndPatchResponseDataJobPayGrade.md)
 - [JobEndPatchResponseDataJobPerson](docs/JobEndPatchResponseDataJobPerson.md)
 - [JobEndPatchResponseDataJobPositionTitle](docs/JobEndPatchResponseDataJobPositionTitle.md)
 - [JobEndPatchResponseDataJobRecruitment](docs/JobEndPatchResponseDataJobRecruitment.md)
 - [JobEndPatchResponseDataJobRemunerationSchedule](docs/JobEndPatchResponseDataJobRemunerationSchedule.md)
 - [JobEndPatchResponseDataJobRemunerationScheduleAdditionsInner](docs/JobEndPatchResponseDataJobRemunerationScheduleAdditionsInner.md)
 - [JobEndPatchResponseDataJobRemunerationScheduleAdditionsToTotalInner](docs/JobEndPatchResponseDataJobRemunerationScheduleAdditionsToTotalInner.md)
 - [JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner](docs/JobEndPatchResponseDataJobRemunerationScheduleBreakdownsInner.md)
 - [JobEndPatchResponseDataJobRemunerationScheduleDeductionsInner](docs/JobEndPatchResponseDataJobRemunerationScheduleDeductionsInner.md)
 - [JobEndPatchResponseDataJobRemunerationScheduleEmploymentCondition](docs/JobEndPatchResponseDataJobRemunerationScheduleEmploymentCondition.md)
 - [JobEndPatchResponseMeta](docs/JobEndPatchResponseMeta.md)
 - [JobEndRemoveResponse](docs/JobEndRemoveResponse.md)
 - [JobEndRemoveResponseData](docs/JobEndRemoveResponseData.md)
 - [JobEndRemoveResponseDataJob](docs/JobEndRemoveResponseDataJob.md)
 - [JobEndRemoveResponseDataJobBusinessEntity](docs/JobEndRemoveResponseDataJobBusinessEntity.md)
 - [JobEndRemoveResponseDataJobBusinessUnit](docs/JobEndRemoveResponseDataJobBusinessUnit.md)
 - [JobEndRemoveResponseDataJobCommentsInner](docs/JobEndRemoveResponseDataJobCommentsInner.md)
 - [JobEndRemoveResponseDataJobCommentsInnerJobChangeReason](docs/JobEndRemoveResponseDataJobCommentsInnerJobChangeReason.md)
 - [JobEndRemoveResponseDataJobEstablishment](docs/JobEndRemoveResponseDataJobEstablishment.md)
 - [JobEndRemoveResponseDataJobLocation](docs/JobEndRemoveResponseDataJobLocation.md)
 - [JobEndRemoveResponseDataJobPayGrade](docs/JobEndRemoveResponseDataJobPayGrade.md)
 - [JobEndRemoveResponseDataJobPerson](docs/JobEndRemoveResponseDataJobPerson.md)
 - [JobEndRemoveResponseDataJobPositionTitle](docs/JobEndRemoveResponseDataJobPositionTitle.md)
 - [JobEndRemoveResponseDataJobRecruitment](docs/JobEndRemoveResponseDataJobRecruitment.md)
 - [JobEndRemoveResponseDataJobRemunerationSchedule](docs/JobEndRemoveResponseDataJobRemunerationSchedule.md)
 - [JobEndRemoveResponseDataJobRemunerationScheduleAdditionsInner](docs/JobEndRemoveResponseDataJobRemunerationScheduleAdditionsInner.md)
 - [JobEndRemoveResponseDataJobRemunerationScheduleAdditionsToTotalInner](docs/JobEndRemoveResponseDataJobRemunerationScheduleAdditionsToTotalInner.md)
 - [JobEndRemoveResponseDataJobRemunerationScheduleBreakdownsInner](docs/JobEndRemoveResponseDataJobRemunerationScheduleBreakdownsInner.md)
 - [JobEndRemoveResponseDataJobRemunerationScheduleDeductionsInner](docs/JobEndRemoveResponseDataJobRemunerationScheduleDeductionsInner.md)
 - [JobEndRemoveResponseDataJobRemunerationScheduleEmploymentCondition](docs/JobEndRemoveResponseDataJobRemunerationScheduleEmploymentCondition.md)
 - [JobEstablishment](docs/JobEstablishment.md)
 - [JobIdTimelineGetResponse](docs/JobIdTimelineGetResponse.md)
 - [JobIdTimelineGetResponseMeta](docs/JobIdTimelineGetResponseMeta.md)
 - [JobLocation](docs/JobLocation.md)
 - [JobPatchRequest](docs/JobPatchRequest.md)
 - [JobPatchRequestBusinessEntity](docs/JobPatchRequestBusinessEntity.md)
 - [JobPatchRequestBusinessUnit](docs/JobPatchRequestBusinessUnit.md)
 - [JobPatchRequestEmploymentCondition](docs/JobPatchRequestEmploymentCondition.md)
 - [JobPatchRequestEstablishment](docs/JobPatchRequestEstablishment.md)
 - [JobPatchRequestJobChangeReason](docs/JobPatchRequestJobChangeReason.md)
 - [JobPatchRequestLocation](docs/JobPatchRequestLocation.md)
 - [JobPatchRequestPayGrade](docs/JobPatchRequestPayGrade.md)
 - [JobPatchRequestRemunerationSchedule](docs/JobPatchRequestRemunerationSchedule.md)
 - [JobPatchRequestRemunerationScheduleAdditionsInner](docs/JobPatchRequestRemunerationScheduleAdditionsInner.md)
 - [JobPatchRequestRemunerationScheduleAdditionsInnerDefaultRemunerationComponent](docs/JobPatchRequestRemunerationScheduleAdditionsInnerDefaultRemunerationComponent.md)
 - [JobPatchRequestRemunerationScheduleAdditionsToTotalInner](docs/JobPatchRequestRemunerationScheduleAdditionsToTotalInner.md)
 - [JobPatchRequestRemunerationScheduleAdditionsToTotalInnerDefaultRemunerationComponent](docs/JobPatchRequestRemunerationScheduleAdditionsToTotalInnerDefaultRemunerationComponent.md)
 - [JobPatchRequestRemunerationScheduleBreakdownsInner](docs/JobPatchRequestRemunerationScheduleBreakdownsInner.md)
 - [JobPatchRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent](docs/JobPatchRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent.md)
 - [JobPatchRequestRemunerationScheduleEmploymentCondition](docs/JobPatchRequestRemunerationScheduleEmploymentCondition.md)
 - [JobPatchRequestSupervisorJob](docs/JobPatchRequestSupervisorJob.md)
 - [JobPatchRequestSupervisorPerson](docs/JobPatchRequestSupervisorPerson.md)
 - [JobPatchRequestWorkClass](docs/JobPatchRequestWorkClass.md)
 - [JobPatchRequestWorkType](docs/JobPatchRequestWorkType.md)
 - [JobPatchResponse](docs/JobPatchResponse.md)
 - [JobPatchResponseMeta](docs/JobPatchResponseMeta.md)
 - [JobPayGrade](docs/JobPayGrade.md)
 - [JobPerson](docs/JobPerson.md)
 - [JobPositionTitle](docs/JobPositionTitle.md)
 - [JobProperty](docs/JobProperty.md)
 - [JobProperty1](docs/JobProperty1.md)
 - [JobProperty2](docs/JobProperty2.md)
 - [JobProperty2BusinessEntity](docs/JobProperty2BusinessEntity.md)
 - [JobProperty2BusinessUnit](docs/JobProperty2BusinessUnit.md)
 - [JobProperty2CommentsInner](docs/JobProperty2CommentsInner.md)
 - [JobProperty2CommentsInnerJobChangeReason](docs/JobProperty2CommentsInnerJobChangeReason.md)
 - [JobProperty2Establishment](docs/JobProperty2Establishment.md)
 - [JobProperty2Location](docs/JobProperty2Location.md)
 - [JobProperty2PayGrade](docs/JobProperty2PayGrade.md)
 - [JobProperty2Person](docs/JobProperty2Person.md)
 - [JobProperty2PositionTitle](docs/JobProperty2PositionTitle.md)
 - [JobProperty2Recruitment](docs/JobProperty2Recruitment.md)
 - [JobProperty2RemunerationSchedule](docs/JobProperty2RemunerationSchedule.md)
 - [JobProperty2RemunerationScheduleAdditionsInner](docs/JobProperty2RemunerationScheduleAdditionsInner.md)
 - [JobProperty2RemunerationScheduleAdditionsToTotalInner](docs/JobProperty2RemunerationScheduleAdditionsToTotalInner.md)
 - [JobProperty2RemunerationScheduleBreakdownsInner](docs/JobProperty2RemunerationScheduleBreakdownsInner.md)
 - [JobProperty2RemunerationScheduleDeductionsInner](docs/JobProperty2RemunerationScheduleDeductionsInner.md)
 - [JobProperty2RemunerationScheduleEmploymentCondition](docs/JobProperty2RemunerationScheduleEmploymentCondition.md)
 - [JobProperty3](docs/JobProperty3.md)
 - [JobProperty3BusinessEntity](docs/JobProperty3BusinessEntity.md)
 - [JobProperty3BusinessUnit](docs/JobProperty3BusinessUnit.md)
 - [JobProperty3Establishment](docs/JobProperty3Establishment.md)
 - [JobProperty3Location](docs/JobProperty3Location.md)
 - [JobProperty3PayGrade](docs/JobProperty3PayGrade.md)
 - [JobProperty3Person](docs/JobProperty3Person.md)
 - [JobProperty3PositionTitle](docs/JobProperty3PositionTitle.md)
 - [JobProperty3Recruitment](docs/JobProperty3Recruitment.md)
 - [JobProperty3RemunerationSchedule](docs/JobProperty3RemunerationSchedule.md)
 - [JobProperty3RemunerationScheduleAdditionsInner](docs/JobProperty3RemunerationScheduleAdditionsInner.md)
 - [JobProperty3RemunerationScheduleAdditionsToTotalInner](docs/JobProperty3RemunerationScheduleAdditionsToTotalInner.md)
 - [JobProperty3RemunerationScheduleBreakdownsInner](docs/JobProperty3RemunerationScheduleBreakdownsInner.md)
 - [JobProperty3RemunerationScheduleDeductionsInner](docs/JobProperty3RemunerationScheduleDeductionsInner.md)
 - [JobProperty3RemunerationScheduleEmploymentCondition](docs/JobProperty3RemunerationScheduleEmploymentCondition.md)
 - [JobProperty4](docs/JobProperty4.md)
 - [JobProperty4BusinessEntity](docs/JobProperty4BusinessEntity.md)
 - [JobProperty4BusinessUnit](docs/JobProperty4BusinessUnit.md)
 - [JobProperty4CommentsInner](docs/JobProperty4CommentsInner.md)
 - [JobProperty4CommentsInnerJobChangeReason](docs/JobProperty4CommentsInnerJobChangeReason.md)
 - [JobProperty4Establishment](docs/JobProperty4Establishment.md)
 - [JobProperty4Location](docs/JobProperty4Location.md)
 - [JobProperty4PayGrade](docs/JobProperty4PayGrade.md)
 - [JobProperty4Person](docs/JobProperty4Person.md)
 - [JobProperty4PositionTitle](docs/JobProperty4PositionTitle.md)
 - [JobProperty4Recruitment](docs/JobProperty4Recruitment.md)
 - [JobProperty4RemunerationSchedule](docs/JobProperty4RemunerationSchedule.md)
 - [JobProperty4RemunerationScheduleAdditionsInner](docs/JobProperty4RemunerationScheduleAdditionsInner.md)
 - [JobProperty4RemunerationScheduleAdditionsToTotalInner](docs/JobProperty4RemunerationScheduleAdditionsToTotalInner.md)
 - [JobProperty4RemunerationScheduleBreakdownsInner](docs/JobProperty4RemunerationScheduleBreakdownsInner.md)
 - [JobProperty4RemunerationScheduleDeductionsInner](docs/JobProperty4RemunerationScheduleDeductionsInner.md)
 - [JobProperty4RemunerationScheduleEmploymentCondition](docs/JobProperty4RemunerationScheduleEmploymentCondition.md)
 - [JobRecruitment](docs/JobRecruitment.md)
 - [JobRemunerationSchedule](docs/JobRemunerationSchedule.md)
 - [JobRemunerationScheduleAdditionsInner](docs/JobRemunerationScheduleAdditionsInner.md)
 - [JobRemunerationScheduleAdditionsToTotalInner](docs/JobRemunerationScheduleAdditionsToTotalInner.md)
 - [JobRemunerationScheduleBreakdownsInner](docs/JobRemunerationScheduleBreakdownsInner.md)
 - [JobRemunerationScheduleDeductionsInner](docs/JobRemunerationScheduleDeductionsInner.md)
 - [JobRemunerationScheduleEmploymentCondition](docs/JobRemunerationScheduleEmploymentCondition.md)
 - [JobRequirementGroup](docs/JobRequirementGroup.md)
 - [JobRequirementGroupLibraryItemsInner](docs/JobRequirementGroupLibraryItemsInner.md)
 - [JobRequirementGroupProperty](docs/JobRequirementGroupProperty.md)
 - [JobRequirementGroupPropertyLibraryItemsInner](docs/JobRequirementGroupPropertyLibraryItemsInner.md)
 - [JobRequirementGroups](docs/JobRequirementGroups.md)
 - [JobRequirementGroupsCreateRequest](docs/JobRequirementGroupsCreateRequest.md)
 - [JobRequirementGroupsList](docs/JobRequirementGroupsList.md)
 - [JobRequirementGroupsListLinks](docs/JobRequirementGroupsListLinks.md)
 - [JobRequirementGroupsListMeta](docs/JobRequirementGroupsListMeta.md)
 - [JobRequirementGroupsListMetaPagination](docs/JobRequirementGroupsListMetaPagination.md)
 - [JobRequirementGroupsMeta](docs/JobRequirementGroupsMeta.md)
 - [JobRequirementGroupsPatchRequest](docs/JobRequirementGroupsPatchRequest.md)
 - [JobTimelineEvent](docs/JobTimelineEvent.md)
 - [Jobs](docs/Jobs.md)
 - [JobsGetAllFiltersParameter](docs/JobsGetAllFiltersParameter.md)
 - [JobsList](docs/JobsList.md)
 - [JobsListLinks](docs/JobsListLinks.md)
 - [JobsListMeta](docs/JobsListMeta.md)
 - [JobsListMetaPagination](docs/JobsListMetaPagination.md)
 - [JobsMeta](docs/JobsMeta.md)
 - [LeaveCreateRequest](docs/LeaveCreateRequest.md)
 - [LeaveCreateRequestLeaveType](docs/LeaveCreateRequestLeaveType.md)
 - [LeaveCreateResponse](docs/LeaveCreateResponse.md)
 - [LeaveCreateResponseMeta](docs/LeaveCreateResponseMeta.md)
 - [LeaveUpdateRequest](docs/LeaveUpdateRequest.md)
 - [LeaveUpdateRequestLeaveType](docs/LeaveUpdateRequestLeaveType.md)
 - [LeaveUpdateResponse](docs/LeaveUpdateResponse.md)
 - [LeaveUpdateResponseMeta](docs/LeaveUpdateResponseMeta.md)
 - [Location](docs/Location.md)
 - [LocationProperty](docs/LocationProperty.md)
 - [LocationPropertyRepresentativesInner](docs/LocationPropertyRepresentativesInner.md)
 - [LocationPropertyRepresentativesInnerPerson](docs/LocationPropertyRepresentativesInnerPerson.md)
 - [LocationPropertyRepresentativesInnerRepresentativeType](docs/LocationPropertyRepresentativesInnerRepresentativeType.md)
 - [LocationRepresentativesInner](docs/LocationRepresentativesInner.md)
 - [LocationRepresentativesInnerPerson](docs/LocationRepresentativesInnerPerson.md)
 - [LocationRepresentativesInnerRepresentativeType](docs/LocationRepresentativesInnerRepresentativeType.md)
 - [Locations](docs/Locations.md)
 - [LocationsCreateRequest](docs/LocationsCreateRequest.md)
 - [LocationsList](docs/LocationsList.md)
 - [LocationsListLinks](docs/LocationsListLinks.md)
 - [LocationsListMeta](docs/LocationsListMeta.md)
 - [LocationsListMetaPagination](docs/LocationsListMetaPagination.md)
 - [LocationsMeta](docs/LocationsMeta.md)
 - [LocationsPatchRequest](docs/LocationsPatchRequest.md)
 - [OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty](docs/OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty.md)
 - [OptionsPropertyInner](docs/OptionsPropertyInner.md)
 - [OptionsPropertyInner1](docs/OptionsPropertyInner1.md)
 - [PayGrade](docs/PayGrade.md)
 - [PayGradeCreateRequest](docs/PayGradeCreateRequest.md)
 - [PayGradeCreateRequestEmploymentCondition](docs/PayGradeCreateRequestEmploymentCondition.md)
 - [PayGradeCreateRequestPayStepsInner](docs/PayGradeCreateRequestPayStepsInner.md)
 - [PayGradeProperty](docs/PayGradeProperty.md)
 - [PayGradeUpdateRequest](docs/PayGradeUpdateRequest.md)
 - [PayGradeUpdateRequestEmploymentCondition](docs/PayGradeUpdateRequestEmploymentCondition.md)
 - [PayGradeUpdateRequestPayStepsInner](docs/PayGradeUpdateRequestPayStepsInner.md)
 - [PayGrades](docs/PayGrades.md)
 - [PayGradesList](docs/PayGradesList.md)
 - [PayGradesListLinks](docs/PayGradesListLinks.md)
 - [PayGradesListMeta](docs/PayGradesListMeta.md)
 - [PayGradesListMetaPagination](docs/PayGradesListMetaPagination.md)
 - [PayGradesMeta](docs/PayGradesMeta.md)
 - [People](docs/People.md)
 - [PeopleCreateRequest](docs/PeopleCreateRequest.md)
 - [PeopleCreateRequestAddressesInner](docs/PeopleCreateRequestAddressesInner.md)
 - [PeopleCreateRequestEmailAddressesInner](docs/PeopleCreateRequestEmailAddressesInner.md)
 - [PeopleCreateRequestEmergencyContact](docs/PeopleCreateRequestEmergencyContact.md)
 - [PeopleCreateRequestMedicalConditionsInner](docs/PeopleCreateRequestMedicalConditionsInner.md)
 - [PeopleCreateRequestPhoneNumbersInner](docs/PeopleCreateRequestPhoneNumbersInner.md)
 - [PeopleCreateRequestWorkRight](docs/PeopleCreateRequestWorkRight.md)
 - [PeopleData](docs/PeopleData.md)
 - [PeopleDataAddressesInner](docs/PeopleDataAddressesInner.md)
 - [PeopleDataEmailAddressesInner](docs/PeopleDataEmailAddressesInner.md)
 - [PeopleDataJobsInner](docs/PeopleDataJobsInner.md)
 - [PeopleDataMedicalConditionsInner](docs/PeopleDataMedicalConditionsInner.md)
 - [PeopleDataPhoneNumbersInner](docs/PeopleDataPhoneNumbersInner.md)
 - [PeopleDataWorkRights](docs/PeopleDataWorkRights.md)
 - [PeopleDocumentsCreateRequest](docs/PeopleDocumentsCreateRequest.md)
 - [PeopleDocumentsCreateResponse](docs/PeopleDocumentsCreateResponse.md)
 - [PeopleDocumentsCreateResponseData](docs/PeopleDocumentsCreateResponseData.md)
 - [PeopleDocumentsCreateResponseMeta](docs/PeopleDocumentsCreateResponseMeta.md)
 - [PeopleDocumentsFindResponse](docs/PeopleDocumentsFindResponse.md)
 - [PeopleDocumentsFindResponseLinks](docs/PeopleDocumentsFindResponseLinks.md)
 - [PeopleDocumentsFindResponseMeta](docs/PeopleDocumentsFindResponseMeta.md)
 - [PeopleDocumentsFindResponseMetaPagination](docs/PeopleDocumentsFindResponseMetaPagination.md)
 - [PeopleDocumentsPatchRequest](docs/PeopleDocumentsPatchRequest.md)
 - [PeopleDocumentsPatchResponse](docs/PeopleDocumentsPatchResponse.md)
 - [PeopleDocumentsPatchResponseData](docs/PeopleDocumentsPatchResponseData.md)
 - [PeopleDocumentsPatchResponseMeta](docs/PeopleDocumentsPatchResponseMeta.md)
 - [PeopleList](docs/PeopleList.md)
 - [PeopleListAllPeopleFiltersParameter](docs/PeopleListAllPeopleFiltersParameter.md)
 - [PeopleListLinks](docs/PeopleListLinks.md)
 - [PeopleListMeta](docs/PeopleListMeta.md)
 - [PeopleListMetaPagination](docs/PeopleListMetaPagination.md)
 - [PeopleMeta](docs/PeopleMeta.md)
 - [PeopleUpdateRequest](docs/PeopleUpdateRequest.md)
 - [PeopleUpdateRequestAddressesInner](docs/PeopleUpdateRequestAddressesInner.md)
 - [PeopleUpdateRequestEmailAddressesInner](docs/PeopleUpdateRequestEmailAddressesInner.md)
 - [PeopleUpdateRequestEmergencyContact](docs/PeopleUpdateRequestEmergencyContact.md)
 - [PeopleUpdateRequestMedicalConditionsInner](docs/PeopleUpdateRequestMedicalConditionsInner.md)
 - [PeopleUpdateRequestPhoneNumbersInner](docs/PeopleUpdateRequestPhoneNumbersInner.md)
 - [PermissionGroup](docs/PermissionGroup.md)
 - [PermissionGroupProperty](docs/PermissionGroupProperty.md)
 - [PermissionGroups](docs/PermissionGroups.md)
 - [PermissionGroupsList](docs/PermissionGroupsList.md)
 - [PermissionGroupsListAllFiltersParameter](docs/PermissionGroupsListAllFiltersParameter.md)
 - [PermissionGroupsListLinks](docs/PermissionGroupsListLinks.md)
 - [PermissionGroupsListMeta](docs/PermissionGroupsListMeta.md)
 - [PermissionGroupsListMetaPagination](docs/PermissionGroupsListMetaPagination.md)
 - [PermissionGroupsMeta](docs/PermissionGroupsMeta.md)
 - [PersonDocumentsCreateRequest](docs/PersonDocumentsCreateRequest.md)
 - [PersonDocumentsCreateRequestPerson](docs/PersonDocumentsCreateRequestPerson.md)
 - [PersonDocumentsCreateResponse](docs/PersonDocumentsCreateResponse.md)
 - [PersonDocumentsCreateResponseData](docs/PersonDocumentsCreateResponseData.md)
 - [PersonDocumentsCreateResponseMeta](docs/PersonDocumentsCreateResponseMeta.md)
 - [PersonDocumentsPatchRequest](docs/PersonDocumentsPatchRequest.md)
 - [PersonDocumentsPatchResponse](docs/PersonDocumentsPatchResponse.md)
 - [PersonDocumentsPatchResponseData](docs/PersonDocumentsPatchResponseData.md)
 - [PersonDocumentsPatchResponseMeta](docs/PersonDocumentsPatchResponseMeta.md)
 - [PersonId](docs/PersonId.md)
 - [PersonIdCreateRequest](docs/PersonIdCreateRequest.md)
 - [PersonIdImageCreateRequest](docs/PersonIdImageCreateRequest.md)
 - [PersonIdImageCreateResponse](docs/PersonIdImageCreateResponse.md)
 - [PersonIdImageCreateResponseMeta](docs/PersonIdImageCreateResponseMeta.md)
 - [PersonIdImageFindResponse](docs/PersonIdImageFindResponse.md)
 - [PersonIdImageFindResponseMeta](docs/PersonIdImageFindResponseMeta.md)
 - [PersonIdImagePatchRequest](docs/PersonIdImagePatchRequest.md)
 - [PersonIdImagePatchRequestCoordinates](docs/PersonIdImagePatchRequestCoordinates.md)
 - [PersonIdImagePatchResponse](docs/PersonIdImagePatchResponse.md)
 - [PersonIdImagePatchResponseMeta](docs/PersonIdImagePatchResponseMeta.md)
 - [PersonIdList](docs/PersonIdList.md)
 - [PersonIdListMeta](docs/PersonIdListMeta.md)
 - [PersonIdMeta](docs/PersonIdMeta.md)
 - [PersonIdPatchRequest](docs/PersonIdPatchRequest.md)
 - [PersonSDocument](docs/PersonSDocument.md)
 - [PositionTitleSchema](docs/PositionTitleSchema.md)
 - [PositionTitleSchemaProperty](docs/PositionTitleSchemaProperty.md)
 - [PositionTitles](docs/PositionTitles.md)
 - [PositionTitlesCreateRequest](docs/PositionTitlesCreateRequest.md)
 - [PositionTitlesList](docs/PositionTitlesList.md)
 - [PositionTitlesListAllFiltersParameter](docs/PositionTitlesListAllFiltersParameter.md)
 - [PositionTitlesListLinks](docs/PositionTitlesListLinks.md)
 - [PositionTitlesListMeta](docs/PositionTitlesListMeta.md)
 - [PositionTitlesListMetaPagination](docs/PositionTitlesListMetaPagination.md)
 - [PositionTitlesMeta](docs/PositionTitlesMeta.md)
 - [PositionTitlesPatchRequest](docs/PositionTitlesPatchRequest.md)
 - [QualificationInstance](docs/QualificationInstance.md)
 - [QualificationInstanceLibraryItem](docs/QualificationInstanceLibraryItem.md)
 - [QualificationInstanceLibraryItemQualificationType](docs/QualificationInstanceLibraryItemQualificationType.md)
 - [QualificationInstancePerson](docs/QualificationInstancePerson.md)
 - [QualificationInstanceProperty](docs/QualificationInstanceProperty.md)
 - [QualificationInstancePropertyLibraryItem](docs/QualificationInstancePropertyLibraryItem.md)
 - [QualificationInstancePropertyLibraryItemQualificationType](docs/QualificationInstancePropertyLibraryItemQualificationType.md)
 - [QualificationInstancePropertyPerson](docs/QualificationInstancePropertyPerson.md)
 - [QualificationInstancePropertyQualificationStatus](docs/QualificationInstancePropertyQualificationStatus.md)
 - [QualificationInstanceQualificationStatus](docs/QualificationInstanceQualificationStatus.md)
 - [QualificationInstancesCreateRequest](docs/QualificationInstancesCreateRequest.md)
 - [QualificationInstancesListAllFiltersParameter](docs/QualificationInstancesListAllFiltersParameter.md)
 - [QualificationInstancesPatchRequest](docs/QualificationInstancesPatchRequest.md)
 - [QualificationLibraryItem](docs/QualificationLibraryItem.md)
 - [QualificationLibraryItemProperty](docs/QualificationLibraryItemProperty.md)
 - [QualificationLibraryItemPropertyQualificationType](docs/QualificationLibraryItemPropertyQualificationType.md)
 - [QualificationLibraryItemQualificationType](docs/QualificationLibraryItemQualificationType.md)
 - [QualificationLibraryItems](docs/QualificationLibraryItems.md)
 - [QualificationLibraryItemsCreateRequest](docs/QualificationLibraryItemsCreateRequest.md)
 - [QualificationLibraryItemsList](docs/QualificationLibraryItemsList.md)
 - [QualificationLibraryItemsListLinks](docs/QualificationLibraryItemsListLinks.md)
 - [QualificationLibraryItemsListMeta](docs/QualificationLibraryItemsListMeta.md)
 - [QualificationLibraryItemsListMetaPagination](docs/QualificationLibraryItemsListMetaPagination.md)
 - [QualificationLibraryItemsMeta](docs/QualificationLibraryItemsMeta.md)
 - [QualificationLibraryItemsPatchRequest](docs/QualificationLibraryItemsPatchRequest.md)
 - [QualificationStatusProperty](docs/QualificationStatusProperty.md)
 - [QualificationStatuses](docs/QualificationStatuses.md)
 - [QualificationStatusesMeta](docs/QualificationStatusesMeta.md)
 - [QualificationType](docs/QualificationType.md)
 - [QualificationTypeProperty](docs/QualificationTypeProperty.md)
 - [QualificationTypes](docs/QualificationTypes.md)
 - [QualificationTypesList](docs/QualificationTypesList.md)
 - [QualificationTypesListLinks](docs/QualificationTypesListLinks.md)
 - [QualificationTypesListMeta](docs/QualificationTypesListMeta.md)
 - [QualificationTypesListMetaPagination](docs/QualificationTypesListMetaPagination.md)
 - [QualificationTypesMeta](docs/QualificationTypesMeta.md)
 - [Qualifications](docs/Qualifications.md)
 - [QualificationsList](docs/QualificationsList.md)
 - [QualificationsListLinks](docs/QualificationsListLinks.md)
 - [QualificationsListMeta](docs/QualificationsListMeta.md)
 - [QualificationsListMetaPagination](docs/QualificationsListMetaPagination.md)
 - [QualificationsMeta](docs/QualificationsMeta.md)
 - [RecruitmentSource](docs/RecruitmentSource.md)
 - [RecruitmentSourceProperty](docs/RecruitmentSourceProperty.md)
 - [RecruitmentSources](docs/RecruitmentSources.md)
 - [RecruitmentSourcesList](docs/RecruitmentSourcesList.md)
 - [RecruitmentSourcesListLinks](docs/RecruitmentSourcesListLinks.md)
 - [RecruitmentSourcesListMeta](docs/RecruitmentSourcesListMeta.md)
 - [RecruitmentSourcesListMetaPagination](docs/RecruitmentSourcesListMetaPagination.md)
 - [RecruitmentSourcesMeta](docs/RecruitmentSourcesMeta.md)
 - [RepresentativeType](docs/RepresentativeType.md)
 - [RepresentativeTypeProperty](docs/RepresentativeTypeProperty.md)
 - [RepresentativeTypes](docs/RepresentativeTypes.md)
 - [RepresentativeTypesList](docs/RepresentativeTypesList.md)
 - [RepresentativeTypesListLinks](docs/RepresentativeTypesListLinks.md)
 - [RepresentativeTypesListMeta](docs/RepresentativeTypesListMeta.md)
 - [RepresentativeTypesListMetaPagination](docs/RepresentativeTypesListMetaPagination.md)
 - [RepresentativeTypesMeta](docs/RepresentativeTypesMeta.md)
 - [Skill](docs/Skill.md)
 - [SkillDisciplineSchema](docs/SkillDisciplineSchema.md)
 - [SkillDisciplineSchemaProperty](docs/SkillDisciplineSchemaProperty.md)
 - [SkillDisciplineSchemaPropertySkillsInner](docs/SkillDisciplineSchemaPropertySkillsInner.md)
 - [SkillDisciplineSchemaSkillsInner](docs/SkillDisciplineSchemaSkillsInner.md)
 - [SkillDisciplines](docs/SkillDisciplines.md)
 - [SkillDisciplinesCreate](docs/SkillDisciplinesCreate.md)
 - [SkillDisciplinesList](docs/SkillDisciplinesList.md)
 - [SkillDisciplinesListAllFiltersParameter](docs/SkillDisciplinesListAllFiltersParameter.md)
 - [SkillDisciplinesListLinks](docs/SkillDisciplinesListLinks.md)
 - [SkillDisciplinesListMeta](docs/SkillDisciplinesListMeta.md)
 - [SkillDisciplinesListMetaPagination](docs/SkillDisciplinesListMetaPagination.md)
 - [SkillDisciplinesMeta](docs/SkillDisciplinesMeta.md)
 - [SkillDisciplinesPatch](docs/SkillDisciplinesPatch.md)
 - [SkillProperty](docs/SkillProperty.md)
 - [SkillPropertySkillDiscipline](docs/SkillPropertySkillDiscipline.md)
 - [SkillSkillDiscipline](docs/SkillSkillDiscipline.md)
 - [Skills](docs/Skills.md)
 - [SkillsCreateRequest](docs/SkillsCreateRequest.md)
 - [SkillsGetAllFiltersParameter](docs/SkillsGetAllFiltersParameter.md)
 - [SkillsList](docs/SkillsList.md)
 - [SkillsListLinks](docs/SkillsListLinks.md)
 - [SkillsListMeta](docs/SkillsListMeta.md)
 - [SkillsListMetaPagination](docs/SkillsListMetaPagination.md)
 - [SkillsMeta](docs/SkillsMeta.md)
 - [SkillsPatchRequest](docs/SkillsPatchRequest.md)
 - [ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty](docs/ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty.md)
 - [ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty1](docs/ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty1.md)
 - [TheSelectDefinitionOfTheCustomFieldDefinitionProperty](docs/TheSelectDefinitionOfTheCustomFieldDefinitionProperty.md)
 - [TheSelectDefinitionOfTheCustomFieldDefinitionProperty1](docs/TheSelectDefinitionOfTheCustomFieldDefinitionProperty1.md)
 - [Training](docs/Training.md)
 - [TrainingJob](docs/TrainingJob.md)
 - [TrainingPerson](docs/TrainingPerson.md)
 - [TrainingProperty](docs/TrainingProperty.md)
 - [TrainingPropertyJob](docs/TrainingPropertyJob.md)
 - [TrainingPropertyPerson](docs/TrainingPropertyPerson.md)
 - [TrainingPropertyProvider](docs/TrainingPropertyProvider.md)
 - [TrainingPropertyStatus](docs/TrainingPropertyStatus.md)
 - [TrainingPropertyType](docs/TrainingPropertyType.md)
 - [TrainingProvider](docs/TrainingProvider.md)
 - [TrainingProviders](docs/TrainingProviders.md)
 - [TrainingProvidersList](docs/TrainingProvidersList.md)
 - [TrainingProvidersListLinks](docs/TrainingProvidersListLinks.md)
 - [TrainingProvidersListMeta](docs/TrainingProvidersListMeta.md)
 - [TrainingProvidersListMetaPagination](docs/TrainingProvidersListMetaPagination.md)
 - [TrainingProvidersMeta](docs/TrainingProvidersMeta.md)
 - [TrainingProvidersProperty](docs/TrainingProvidersProperty.md)
 - [TrainingStatus](docs/TrainingStatus.md)
 - [TrainingStatuses](docs/TrainingStatuses.md)
 - [TrainingStatusesList](docs/TrainingStatusesList.md)
 - [TrainingType](docs/TrainingType.md)
 - [TrainingTypes](docs/TrainingTypes.md)
 - [TrainingTypesList](docs/TrainingTypesList.md)
 - [TrainingTypesListLinks](docs/TrainingTypesListLinks.md)
 - [TrainingTypesListMeta](docs/TrainingTypesListMeta.md)
 - [TrainingTypesListMetaPagination](docs/TrainingTypesListMetaPagination.md)
 - [TrainingTypesMeta](docs/TrainingTypesMeta.md)
 - [TrainingTypesProperty](docs/TrainingTypesProperty.md)
 - [Trainings](docs/Trainings.md)
 - [TrainingsCreateRequest](docs/TrainingsCreateRequest.md)
 - [TrainingsCreateRequestCoordinatorPerson](docs/TrainingsCreateRequestCoordinatorPerson.md)
 - [TrainingsCreateRequestJob](docs/TrainingsCreateRequestJob.md)
 - [TrainingsCreateRequestPerson](docs/TrainingsCreateRequestPerson.md)
 - [TrainingsCreateRequestProvider](docs/TrainingsCreateRequestProvider.md)
 - [TrainingsCreateRequestStatus](docs/TrainingsCreateRequestStatus.md)
 - [TrainingsCreateRequestType](docs/TrainingsCreateRequestType.md)
 - [TrainingsList](docs/TrainingsList.md)
 - [TrainingsListAllFiltersParameter](docs/TrainingsListAllFiltersParameter.md)
 - [TrainingsListLinks](docs/TrainingsListLinks.md)
 - [TrainingsListMeta](docs/TrainingsListMeta.md)
 - [TrainingsListMetaPagination](docs/TrainingsListMetaPagination.md)
 - [TrainingsMeta](docs/TrainingsMeta.md)
 - [TrainingsPatchRequest](docs/TrainingsPatchRequest.md)
 - [TrainingsPatchRequestCoordinatorPerson](docs/TrainingsPatchRequestCoordinatorPerson.md)
 - [TrainingsPatchRequestJob](docs/TrainingsPatchRequestJob.md)
 - [TrainingsPatchRequestPerson](docs/TrainingsPatchRequestPerson.md)
 - [TrainingsPatchRequestProvider](docs/TrainingsPatchRequestProvider.md)
 - [TrainingsPatchRequestStatus](docs/TrainingsPatchRequestStatus.md)
 - [TrainingsPatchRequestType](docs/TrainingsPatchRequestType.md)
 - [Users](docs/Users.md)
 - [UsersCreate](docs/UsersCreate.md)
 - [UsersCreatePerson](docs/UsersCreatePerson.md)
 - [UsersData](docs/UsersData.md)
 - [UsersDataPerson](docs/UsersDataPerson.md)
 - [UsersDataUserPermissionGroupsInner](docs/UsersDataUserPermissionGroupsInner.md)
 - [UsersDataUserPermissionGroupsInnerPermissionGroup](docs/UsersDataUserPermissionGroupsInnerPermissionGroup.md)
 - [UsersList](docs/UsersList.md)
 - [UsersListDataInner](docs/UsersListDataInner.md)
 - [UsersListDataInnerPerson](docs/UsersListDataInnerPerson.md)
 - [UsersListDataInnerUserPermissionGroupsInner](docs/UsersListDataInnerUserPermissionGroupsInner.md)
 - [UsersListDataInnerUserPermissionGroupsInnerPermissionGroup](docs/UsersListDataInnerUserPermissionGroupsInnerPermissionGroup.md)
 - [UsersListLinks](docs/UsersListLinks.md)
 - [UsersListMeta](docs/UsersListMeta.md)
 - [UsersListMetaPagination](docs/UsersListMetaPagination.md)
 - [UsersMeta](docs/UsersMeta.md)
 - [UsersPatch](docs/UsersPatch.md)
 - [WebhookEvent](docs/WebhookEvent.md)
 - [WebhookEventBasic](docs/WebhookEventBasic.md)
 - [WebhookEventEffectiveDatesUpdate](docs/WebhookEventEffectiveDatesUpdate.md)
 - [WebhookEventFormCompleted](docs/WebhookEventFormCompleted.md)
 - [WebhookEventFormCompletedAllOf](docs/WebhookEventFormCompletedAllOf.md)
 - [WebhookEventJobRemUpdatedScheduled](docs/WebhookEventJobRemUpdatedScheduled.md)
 - [WebhookEventJobRemUpdatedScheduledAllOf](docs/WebhookEventJobRemUpdatedScheduledAllOf.md)
 - [WebhookEventJobUpdatedScheduled](docs/WebhookEventJobUpdatedScheduled.md)
 - [WebhookEventJobUpdatedScheduledAllOf](docs/WebhookEventJobUpdatedScheduledAllOf.md)
 - [WebhookEventLinks](docs/WebhookEventLinks.md)
 - [WebhookEventLinksLinks](docs/WebhookEventLinksLinks.md)
 - [WebhookEventPersonBirthdayUpcoming](docs/WebhookEventPersonBirthdayUpcoming.md)
 - [WebhookEventPersonBirthdayUpcomingAllOf](docs/WebhookEventPersonBirthdayUpcomingAllOf.md)
 - [WebhookEventPersonUpdated](docs/WebhookEventPersonUpdated.md)
 - [WebhookEventPersonUpdatedAllOf](docs/WebhookEventPersonUpdatedAllOf.md)
 - [WebhookEventScheduled](docs/WebhookEventScheduled.md)
 - [WebhookEventUpdateAttributes](docs/WebhookEventUpdateAttributes.md)
 - [WebhookEvents](docs/WebhookEvents.md)
 - [WebhookEventsData](docs/WebhookEventsData.md)
 - [WebhookEventsList](docs/WebhookEventsList.md)
 - [WebhookEventsListDataInner](docs/WebhookEventsListDataInner.md)
 - [WebhookEventsListLinks](docs/WebhookEventsListLinks.md)
 - [WebhookEventsListMeta](docs/WebhookEventsListMeta.md)
 - [WebhookEventsListMetaPagination](docs/WebhookEventsListMetaPagination.md)
 - [WebhookEventsMeta](docs/WebhookEventsMeta.md)
 - [WebhookFormCreated](docs/WebhookFormCreated.md)
 - [WebhookFormCreatedAllOf](docs/WebhookFormCreatedAllOf.md)
 - [WebhookJobCreated](docs/WebhookJobCreated.md)
 - [WebhookJobCreatedAllOf](docs/WebhookJobCreatedAllOf.md)
 - [WebhookJobDeleted](docs/WebhookJobDeleted.md)
 - [WebhookJobDeletedAllOf](docs/WebhookJobDeletedAllOf.md)
 - [WebhookJobEffectiveDatesUpdated](docs/WebhookJobEffectiveDatesUpdated.md)
 - [WebhookJobEffectiveDatesUpdatedAllOf](docs/WebhookJobEffectiveDatesUpdatedAllOf.md)
 - [WebhookJobEndDateAdjusted](docs/WebhookJobEndDateAdjusted.md)
 - [WebhookJobEndDateAdjustedAllOf](docs/WebhookJobEndDateAdjustedAllOf.md)
 - [WebhookJobEndDateCancelled](docs/WebhookJobEndDateCancelled.md)
 - [WebhookJobEndDateCancelledAllOf](docs/WebhookJobEndDateCancelledAllOf.md)
 - [WebhookJobEndDateFinalised](docs/WebhookJobEndDateFinalised.md)
 - [WebhookJobEndDateFinalisedAllOf](docs/WebhookJobEndDateFinalisedAllOf.md)
 - [WebhookJobEnded](docs/WebhookJobEnded.md)
 - [WebhookJobEndedAllOf](docs/WebhookJobEndedAllOf.md)
 - [WebhookJobStartDateUpcoming](docs/WebhookJobStartDateUpcoming.md)
 - [WebhookJobStartDateUpcomingAllOf](docs/WebhookJobStartDateUpcomingAllOf.md)
 - [WebhookJobTimelineUpdated](docs/WebhookJobTimelineUpdated.md)
 - [WebhookJobTimelineUpdatedAllOf](docs/WebhookJobTimelineUpdatedAllOf.md)
 - [WebhookPersonDeleted](docs/WebhookPersonDeleted.md)
 - [WebhookPersonDeletedAllOf](docs/WebhookPersonDeletedAllOf.md)
 - [WebhookQualificationCreated](docs/WebhookQualificationCreated.md)
 - [WebhookQualificationCreatedAllOf](docs/WebhookQualificationCreatedAllOf.md)
 - [WebhookQualificationUpdated](docs/WebhookQualificationUpdated.md)
 - [WebhookQualificationUpdatedAllOf](docs/WebhookQualificationUpdatedAllOf.md)
 - [WebhookTrainingCreated](docs/WebhookTrainingCreated.md)
 - [WebhookTrainingCreatedAllOf](docs/WebhookTrainingCreatedAllOf.md)
 - [WebhookTrainingDeleted](docs/WebhookTrainingDeleted.md)
 - [WebhookTrainingDeletedAllOf](docs/WebhookTrainingDeletedAllOf.md)
 - [WebhookTrainingUpdated](docs/WebhookTrainingUpdated.md)
 - [WebhookTrainingUpdatedAllOf](docs/WebhookTrainingUpdatedAllOf.md)
 - [WebhookUserCreated](docs/WebhookUserCreated.md)
 - [WebhookUserCreatedAllOf](docs/WebhookUserCreatedAllOf.md)
 - [WebhookUserDeleted](docs/WebhookUserDeleted.md)
 - [WebhookUserDeletedAllOf](docs/WebhookUserDeletedAllOf.md)
 - [WebhookUserDisabled](docs/WebhookUserDisabled.md)
 - [WebhookUserDisabledAllOf](docs/WebhookUserDisabledAllOf.md)
 - [WebhookUserDisabledUpcoming](docs/WebhookUserDisabledUpcoming.md)
 - [WebhookUserDisabledUpcomingAllOf](docs/WebhookUserDisabledUpcomingAllOf.md)
 - [WebhookUserUpdated](docs/WebhookUserUpdated.md)
 - [WebhookUserUpdatedAllOf](docs/WebhookUserUpdatedAllOf.md)
 - [Webhooks](docs/Webhooks.md)
 - [WebhooksCreate](docs/WebhooksCreate.md)
 - [WebhooksData](docs/WebhooksData.md)
 - [WebhooksDataWebhookEvent](docs/WebhooksDataWebhookEvent.md)
 - [WebhooksList](docs/WebhooksList.md)
 - [WebhooksListLinks](docs/WebhooksListLinks.md)
 - [WebhooksListMeta](docs/WebhooksListMeta.md)
 - [WebhooksListMetaPagination](docs/WebhooksListMetaPagination.md)
 - [WebhooksMeta](docs/WebhooksMeta.md)
 - [WebhooksPatch](docs/WebhooksPatch.md)
 - [WorkClasses](docs/WorkClasses.md)
 - [WorkClassesList](docs/WorkClassesList.md)
 - [WorkClassesListLinks](docs/WorkClassesListLinks.md)
 - [WorkClassesListMeta](docs/WorkClassesListMeta.md)
 - [WorkClassesListMetaPagination](docs/WorkClassesListMetaPagination.md)
 - [WorkClassesMeta](docs/WorkClassesMeta.md)
 - [WorkClassesSchema](docs/WorkClassesSchema.md)
 - [WorkClassesSchemaProperty](docs/WorkClassesSchemaProperty.md)
 - [WorkClassesSchemaPropertyWorkType](docs/WorkClassesSchemaPropertyWorkType.md)
 - [WorkClassesSchemaWorkType](docs/WorkClassesSchemaWorkType.md)
 - [WorkRight](docs/WorkRight.md)
 - [WorkRightProperty](docs/WorkRightProperty.md)
 - [WorkRights](docs/WorkRights.md)
 - [WorkRightsList](docs/WorkRightsList.md)
 - [WorkRightsListLinks](docs/WorkRightsListLinks.md)
 - [WorkRightsListMeta](docs/WorkRightsListMeta.md)
 - [WorkRightsListMetaPagination](docs/WorkRightsListMetaPagination.md)
 - [WorkRightsMeta](docs/WorkRightsMeta.md)
 - [WorkType](docs/WorkType.md)
 - [WorkTypeProperty](docs/WorkTypeProperty.md)
 - [WorkTypes](docs/WorkTypes.md)
 - [WorkTypesList](docs/WorkTypesList.md)
 - [WorkTypesListLinks](docs/WorkTypesListLinks.md)
 - [WorkTypesListMeta](docs/WorkTypesListMeta.md)
 - [WorkTypesListMetaPagination](docs/WorkTypesListMetaPagination.md)
 - [WorkTypesMeta](docs/WorkTypesMeta.md)
 - [WorkflowEventProperty](docs/WorkflowEventProperty.md)
 - [WorkflowEventPropertyWorkflowsInner](docs/WorkflowEventPropertyWorkflowsInner.md)
 - [WorkflowEventPropertyWorkflowsInnerWorkflowFormDesignsInner](docs/WorkflowEventPropertyWorkflowsInnerWorkflowFormDesignsInner.md)
 - [WorkflowEventPropertyWorkflowsInnerWorkflowFormDesignsInnerFormDesign](docs/WorkflowEventPropertyWorkflowsInnerWorkflowFormDesignsInnerFormDesign.md)
 - [WorkflowEvents](docs/WorkflowEvents.md)
 - [WorkflowEventsMeta](docs/WorkflowEventsMeta.md)
 - [WorkflowProperty](docs/WorkflowProperty.md)
 - [WorkflowSchedule](docs/WorkflowSchedule.md)
 - [WorkflowScheduleProperty](docs/WorkflowScheduleProperty.md)
 - [WorkflowsPatchRequest](docs/WorkflowsPatchRequest.md)
 - [WorkflowsPatchRequestWorkflowFormDesignsInner](docs/WorkflowsPatchRequestWorkflowFormDesignsInner.md)
 - [WorkflowsPatchResponse](docs/WorkflowsPatchResponse.md)
 - [WorkflowsPatchResponseMeta](docs/WorkflowsPatchResponseMeta.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
