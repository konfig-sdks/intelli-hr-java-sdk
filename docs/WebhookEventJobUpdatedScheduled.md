

# WebhookEventJobUpdatedScheduled


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier that this event relates to. |  [optional] |
|**event** | **Object** |  |  [optional] |
|**timestamp** | **String** | When this event was fired, not necessarily the the time that the event occurred. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**links** | [**Object**](Object.md) |  |  [optional] |
|**updateStartDate** | **Object** |  |  [optional] |
|**updateEndDate** | **Object** |  |  [optional] |
|**updatedAttributes** | [**List&lt;UpdatedAttributesEnum&gt;**](#List&lt;UpdatedAttributesEnum&gt;) |  |  [optional] |



## Enum: List&lt;UpdatedAttributesEnum&gt;

| Name | Value |
|---- | -----|
| BUSINESS_ENTITY_ID | &quot;business_entity_id&quot; |
| BUSINESS_UNIT_ID | &quot;business_unit_id&quot; |
| FTE | &quot;fte&quot; |
| LOCATION_ID | &quot;location_id&quot; |
| NAME | &quot;name&quot; |
| PAY_GRADE_ID | &quot;pay_grade_id&quot; |
| PAY_PACKAGE | &quot;pay_package&quot; |
| SUPERVISOR_JOB_ID | &quot;supervisor_job_id&quot; |
| WORK_CLASS_ID | &quot;work_class_id&quot; |
| WORK_TYPE_ID | &quot;work_type_id&quot; |



