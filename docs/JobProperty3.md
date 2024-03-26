

# JobProperty3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Job](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**person** | [**JobProperty3Person**](JobProperty3Person.md) |  |  [optional] |
|**recruitment** | [**JobProperty3Recruitment**](JobProperty3Recruitment.md) |  |  [optional] |
|**extendedLeave** | **Object** |  |  [optional] |
|**location** | [**JobProperty3Location**](JobProperty3Location.md) |  |  [optional] |
|**payGrade** | [**JobProperty3PayGrade**](JobProperty3PayGrade.md) |  |  [optional] |
|**businessUnit** | [**JobProperty3BusinessUnit**](JobProperty3BusinessUnit.md) |  |  [optional] |
|**businessEntity** | [**JobProperty3BusinessEntity**](JobProperty3BusinessEntity.md) |  |  [optional] |
|**establishment** | [**JobProperty3Establishment**](JobProperty3Establishment.md) |  |  [optional] |
|**supervisorJob** | **Object** |  |  [optional] |
|**supervisorPerson** | **Object** |  |  [optional] |
|**employmentCondition** | **Object** |  |  [optional] |
|**remunerationSchedule** | [**JobProperty3RemunerationSchedule**](JobProperty3RemunerationSchedule.md) |  |  [optional] |
|**name** | **String** | The name of this [Job](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**positionTitle** | [**JobProperty3PositionTitle**](JobProperty3PositionTitle.md) |  |  [optional] |
|**fte** | **Object** |  |  [optional] |
|**comments** | **List&lt;Object&gt;** | An array of comment objects that annotate the reason for [Job](https://developers.intellihr.io/docs/v1/) changes. Will be an empty array when there has been no updates to the Job. |  [optional] |
|**lastestJobChangeComment** | **Object** |  |  [optional] |
|**workClass** | **String** | The [Work Class](https://developers.intellihr.io/docs/v1/) of this [Job](https://developers.intellihr.io/docs/v1/). This is extra details about the [Work Type](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**workType** | **String** | This is the [Work Classification](https://developers.intellihr.io/docs/v1/) for this [Job](https://developers.intellihr.io/docs/v1/), it is used to differentiate between full-time and part time employees vs unpaid volunteers. Enum: &#x60;Permanent&#x60;, &#x60;Fixed Contract&#x60;, &#x60;Unpaid&#x60;, &#x60;Temporary/Casual&#x60;, &#x60;Independent Contract&#x60;. |  [optional] |
|**isPrimaryJob** | **Boolean** | Whether this job is the primary job on the [Person](https://developers.intellihr.io/docs/v1/). Only one job on a [Person](https://developers.intellihr.io/docs/v1/) can be primary at a time. |  [optional] |
|**jobStatus** | **String** | The current status of this job within this organisation. Enum: &#x60;Past Job&#x60;, &#x60;Future Job&#x60;, &#x60;Ending Job&#x60;, &#x60;Current Job&#x60;. |  [optional] |
|**createdBy** | **Object** |  |  [optional] |
|**updatedBy** | **Object** |  |  [optional] |
|**positionStartDate** | **String** | The start date of the current position the person is in. The gap between the &#x60;companyStartDate&#x60; and &#x60;positionStartDate&#x60; will be filled with \&quot;Previous position title\&quot; historical records, to correctly depict the person as having no information recorded for old job positions. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**companyStartDate** | **String** | The date this [Job](https://developers.intellihr.io/docs/v1/) started or will start within the organisation. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**companyEndDate** | **Object** |  |  [optional] |
|**isEndDateConfirmed** | **Boolean** | Whether the end date has been finalised within the intelliHR application. |  [optional] |
|**turnoverType** | **Object** |  |  [optional] |
|**turnoverReason** | **Object** |  |  [optional] |
|**customFields** | **CustomFieldsResponse** | The custom field values for this Job |  [optional] |
|**createdAt** | **String** | When this record was created. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |



