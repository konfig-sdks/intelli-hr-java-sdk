

# CustomFieldDefinitionCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **Object** |  |  [optional] |
|**name** | **String** | Name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system. |  |
|**apiName** | **String** | The api name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name is used to uniquely identify the custom field in the api and is used as the key when modifying the custom field on a record. |  |
|**modelType** | **String** | The model that this custom field relates to and can be attached to. Enum: &#x60;ADDRESS&#x60;, &#x60;BUSINESS_ENTITY&#x60;, &#x60;BUSINESS_UNIT&#x60;, &#x60;EMAIL_ADDRESS&#x60;, &#x60;JOB&#x60;, &#x60;LOCATION&#x60;, &#x60;PERSON&#x60;, &#x60;POSITION_TITLE&#x60;, &#x60;PHONE_NUMBER&#x60;, &#x60;REMUNERATION&#x60;, &#x60;TRAINING&#x60;. |  |
|**type** | **String** | The type of data this field records. Enum: &#x60;SINGLE_SELECT&#x60;, &#x60;MULTI_SELECT&#x60;, &#x60;TEXT&#x60;, &#x60;NUMBER&#x60;, &#x60;PEOPLE_DROPDOWN&#x60;. |  |
|**isSensitive** | **Boolean** | Whether or not this [Custom Field Definition](https://developers.intellihr.io/docs/v1/) is marked as sensitive information. |  [optional] |
|**selectDefinition** | [**TheSelectDefinitionOfTheCustomFieldDefinitionProperty**](TheSelectDefinitionOfTheCustomFieldDefinitionProperty.md) |  |  [optional] |
|**textDefinition** | [**OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty**](OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty.md) |  |  [optional] |
|**peopleDropdownDefinition** | [**ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty**](ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty.md) |  |  [optional] |



