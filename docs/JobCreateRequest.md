

# JobCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**person** | [**JobCreateRequestPerson**](JobCreateRequestPerson.md) |  |  |
|**companyStartDate** | **String** | The date this [Job](https://developers.intellihr.io/docs/v1/) started or will start within the organisation. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  |
|**companyEndDate** | **String** | The &lt;b&gt;exclusive&lt;/b&gt; date this [Job](https://developers.intellihr.io/docs/v1/) ended or will end within the organisation. For example, if the person&#39;s last working date is on 2025-04-23, the &#x60;companyEndDate&#x60; should be set as 2025-04-24 to reflect the exclusive date. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**startDate** | **String** | The date this [Job](https://developers.intellihr.io/docs/v1/) started or will start within the organisation. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**endDate** | **String** | The &lt;b&gt;exclusive&lt;/b&gt; date this [Job](https://developers.intellihr.io/docs/v1/) ended or will end within the organisation. For example, if the person&#39;s last working date is on 2025-04-23, the &#x60;endDate&#x60; should be set as 2025-04-24 to reflect the exclusive date. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**name** | **String** | The job name assigned to this [Job](https://developers.intellihr.io/docs/v1/). Will attempt to match to an existing [Position Title](https://developers.intellihr.io/docs/v1/), otherwise creates a new [Position Title](https://developers.intellihr.io/docs/v1/). |  |
|**businessEntity** | [**JobCreateRequestBusinessEntity**](JobCreateRequestBusinessEntity.md) |  |  |
|**businessUnit** | [**JobCreateRequestBusinessUnit**](JobCreateRequestBusinessUnit.md) |  |  |
|**establishment** | [**JobCreateRequestEstablishment**](JobCreateRequestEstablishment.md) |  |  [optional] |
|**supervisorPerson** | [**JobCreateRequestSupervisorPerson**](JobCreateRequestSupervisorPerson.md) |  |  [optional] |
|**supervisorJob** | [**JobCreateRequestSupervisorJob**](JobCreateRequestSupervisorJob.md) |  |  [optional] |
|**location** | [**JobCreateRequestLocation**](JobCreateRequestLocation.md) |  |  [optional] |
|**workClass** | [**JobCreateRequestWorkClass**](JobCreateRequestWorkClass.md) |  |  |
|**workType** | [**JobCreateRequestWorkType**](JobCreateRequestWorkType.md) |  |  [optional] |
|**fte** | **String** | The full time equivalent of this [Job](https://developers.intellihr.io/docs/v1/). Indicating the workload of an employee that can be comparable across different contexts. This is null for people without an FTE. |  [optional] |
|**payGrade** | [**JobCreateRequestPayGrade**](JobCreateRequestPayGrade.md) |  |  [optional] |
|**employmentCondition** | [**JobCreateRequestEmploymentCondition**](JobCreateRequestEmploymentCondition.md) |  |  [optional] |
|**remunerationSchedule** | [**JobCreateRequestRemunerationSchedule**](JobCreateRequestRemunerationSchedule.md) |  |  [optional] |
|**recruitment** | [**JobCreateRequestRecruitment**](JobCreateRequestRecruitment.md) |  |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesCreateRequestCustomFieldsValue&gt;**](BusinessEntitiesCreateRequestCustomFieldsValue.md) | The custom field values for this Job |  [optional] |



