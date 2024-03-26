

# QualificationInstancesPatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | The status of this [Qualification Instance](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**issuingOrganisation** | **Object** |  |  [optional] |
|**registrationNumber** | **Object** |  |  [optional] |
|**issueDate** | **Object** |  |  [optional] |
|**expiryDate** | **Object** |  |  [optional] |
|**expiryNotificationQueuedAt** | **Object** |  |  [optional] |
|**notes** | **Object** |  |  [optional] |



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



