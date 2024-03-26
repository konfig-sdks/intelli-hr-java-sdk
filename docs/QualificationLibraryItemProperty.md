

# QualificationLibraryItemProperty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Qualification Library Item](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**name** | **String** | The name of this [Qualification Library Item](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**qualificationType** | [**QualificationLibraryItemPropertyQualificationType**](QualificationLibraryItemPropertyQualificationType.md) |  |  [optional] |
|**qualificationExpiryType** | [**QualificationExpiryTypeEnum**](#QualificationExpiryTypeEnum) | The expiry type for this library item |  [optional] |
|**qualificationRegistrationNumberVisibilityType** | [**QualificationRegistrationNumberVisibilityTypeEnum**](#QualificationRegistrationNumberVisibilityTypeEnum) | The expiry type for this library item |  [optional] |
|**qualificationAttachmentRequirementType** | [**QualificationAttachmentRequirementTypeEnum**](#QualificationAttachmentRequirementTypeEnum) | If documents are required for this library item |  [optional] |
|**expiryWarningPeriod** | **Double** | Period in days, that there is a warning before the expiry of the qualification. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored. |  [optional] |
|**expiryPeriods** | **Object** |  |  [optional] |
|**sendExpiryWarning** | **Boolean** | If this [Qualification Library Item](https://developers.intellihr.io/docs/v1/) will send expiry warning/s using the periods defined. If qualificationExpiryType is set to EXPIRY_INAPPLICABLE, this value will be ignored. |  [optional] |
|**qualificationInstanceUsageCount** | **Double** | Number of qualification instances currently being used with this qualification library item |  [optional] |
|**jobRequirementGroupUsageCount** | **Double** | Number of job requirement groups currently being used with this qualification library item |  [optional] |
|**jobRequirementUsageCount** | **Double** | Number of job requirements currently being used with this qualification library item |  [optional] |



## Enum: QualificationExpiryTypeEnum

| Name | Value |
|---- | -----|
| INAPPLICABLE | &quot;EXPIRY_INAPPLICABLE&quot; |
| OPTIONAL | &quot;EXPIRY_OPTIONAL&quot; |
| REQUIRED | &quot;EXPIRY_REQUIRED&quot; |



## Enum: QualificationRegistrationNumberVisibilityTypeEnum

| Name | Value |
|---- | -----|
| INAPPLICABLE | &quot;REGISTRATION_NUMBER_INAPPLICABLE&quot; |
| OPTIONAL | &quot;REGISTRATION_NUMBER_OPTIONAL&quot; |
| REQUIRED | &quot;REGISTRATION_NUMBER_REQUIRED&quot; |



## Enum: QualificationAttachmentRequirementTypeEnum

| Name | Value |
|---- | -----|
| OPTIONAL | &quot;DOCUMENTS_OPTIONAL&quot; |
| REQUIRED | &quot;DOCUMENTS_REQUIRED&quot; |



