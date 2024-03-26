

# PeopleUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **Object** |  |  [optional] |
|**firstName** | **Object** |  |  [optional] |
|**middleName** | **Object** |  |  [optional] |
|**lastName** | **String** | The [Person&#39;s](https://developers.intellihr.io/docs/v1/) Last Name. |  [optional] |
|**preferredName** | **Object** |  |  [optional] |
|**dateOfBirth** | **Object** |  |  [optional] |
|**gender** | **String** | Human readable string for the [Person&#39;s](https://developers.intellihr.io/docs/v1/) gender, e.g. &#x60;Male&#x60;. Searching is done case-insensitively and &#39;starts-with&#39; e.g. passing &#x60;male&#x60; will match with a [Gender](https://developers.intellihr.io/docs/v1/) called \&quot;Male\&quot; as will \&quot;m\&quot; or \&quot;M\&quot;. If multiple [Genders](https://developers.intellihr.io/docs/v1/) match the first will be chosen. The gender options available are: &#x60;Female&#x60;, &#x60;Male&#x60;, &#x60;Non-binary&#x60;, &#x60;Other&#x60;, &#x60;Undisclosed&#x60;. |  [optional] |
|**employeeNumber** | **Object** |  |  [optional] |
|**emergencyContact** | [**PeopleUpdateRequestEmergencyContact**](PeopleUpdateRequestEmergencyContact.md) |  |  [optional] |
|**emailAddresses** | [**List&lt;PeopleUpdateRequestEmailAddressesInner&gt;**](PeopleUpdateRequestEmailAddressesInner.md) | Information about this [Person&#39;s](https://developers.intellihr.io/docs/v1/) email addresses. This will replace all of their current emails. The provided email addresses will be converted to lowercase. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary email address. |  [optional] |
|**phoneNumbers** | [**List&lt;PeopleUpdateRequestPhoneNumbersInner&gt;**](PeopleUpdateRequestPhoneNumbersInner.md) | Information about this [Person&#39;s](https://developers.intellihr.io/docs/v1/) phone numbers. This will replace all of their current phone numbers. Note that a [Person](https://developers.intellihr.io/docs/v1/) must have at least one primary phone number. |  [optional] |
|**addresses** | [**List&lt;PeopleUpdateRequestAddressesInner&gt;**](PeopleUpdateRequestAddressesInner.md) | Information about this [Person&#39;s](https://developers.intellihr.io/docs/v1/) addresses. This will replace all of their current addresses. |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesPatchRequestCustomFieldsValue&gt;**](BusinessEntitiesPatchRequestCustomFieldsValue.md) | The custom field values for this [Person](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**medicalConditions** | [**List&lt;PeopleUpdateRequestMedicalConditionsInner&gt;**](PeopleUpdateRequestMedicalConditionsInner.md) | The medical conditions that this person has |  [optional] |
|**workRight** | **Object** |  |  [optional] |
|**workRightExpiryDate** | **Object** |  |  [optional] |



