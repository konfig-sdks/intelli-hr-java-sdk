

# QualificationInstance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Qualification Instance](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**expiryDate** | **Object** |  |  [optional] |
|**expiryNotificationQueuedAt** | **Object** |  |  [optional] |
|**issueDate** | **Object** |  |  [optional] |
|**issuingOrganisation** | **Object** |  |  [optional] |
|**notes** | **Object** |  |  [optional] |
|**person** | [**QualificationInstancePerson**](QualificationInstancePerson.md) |  |  [optional] |
|**qualificationStatus** | [**QualificationInstanceQualificationStatus**](QualificationInstanceQualificationStatus.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**libraryItem** | [**QualificationInstanceLibraryItem**](QualificationInstanceLibraryItem.md) |  |  [optional] |
|**registrationNumber** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| AWAITING_APPROVAL | &quot;AWAITING_APPROVAL&quot; |
| DECLINED | &quot;DECLINED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REVOKED | &quot;REVOKED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| EXPIRING_SOON | &quot;EXPIRING_SOON&quot; |
| CURRENT | &quot;CURRENT&quot; |
| FUTURE | &quot;FUTURE&quot; |
| RENEWING | &quot;RENEWING&quot; |
| NON_COMPLIANT | &quot;NON_COMPLIANT&quot; |



