

# JobPatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveFrom** | **Object** |  |  |
|**effectiveTo** | **String** | The date this [Job](https://developers.intellihr.io/docs/v1/) Update is effective to within the organisation. Note that this doesn&#39;t affect the end date of the overall job itself. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**name** | **String** | The job name to be updated. Will attempt to match to an existing [Position Title](https://developers.intellihr.io/docs/v1/), otherwise creates a new [Position Title](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**businessEntity** | [**JobPatchRequestBusinessEntity**](JobPatchRequestBusinessEntity.md) |  |  [optional] |
|**businessUnit** | [**JobPatchRequestBusinessUnit**](JobPatchRequestBusinessUnit.md) |  |  [optional] |
|**establishment** | [**JobPatchRequestEstablishment**](JobPatchRequestEstablishment.md) |  |  [optional] |
|**jobChangeReason** | [**JobPatchRequestJobChangeReason**](JobPatchRequestJobChangeReason.md) |  |  [optional] |
|**supervisorPerson** | [**JobPatchRequestSupervisorPerson**](JobPatchRequestSupervisorPerson.md) |  |  [optional] |
|**supervisorJob** | [**JobPatchRequestSupervisorJob**](JobPatchRequestSupervisorJob.md) |  |  [optional] |
|**location** | [**JobPatchRequestLocation**](JobPatchRequestLocation.md) |  |  [optional] |
|**workClass** | [**JobPatchRequestWorkClass**](JobPatchRequestWorkClass.md) |  |  [optional] |
|**workType** | [**JobPatchRequestWorkType**](JobPatchRequestWorkType.md) |  |  [optional] |
|**fte** | **String** | The full time equivalent of this [Job](https://developers.intellihr.io/docs/v1/). Indicating the workload of an employee that can be comparable across different contexts. This is null for people without an FTE. |  [optional] |
|**payGrade** | [**JobPatchRequestPayGrade**](JobPatchRequestPayGrade.md) |  |  [optional] |
|**employmentCondition** | [**JobPatchRequestEmploymentCondition**](JobPatchRequestEmploymentCondition.md) |  |  [optional] |
|**remunerationSchedule** | [**JobPatchRequestRemunerationSchedule**](JobPatchRequestRemunerationSchedule.md) |  |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesPatchRequestCustomFieldsValue&gt;**](BusinessEntitiesPatchRequestCustomFieldsValue.md) | The custom field values for this Job |  [optional] |



