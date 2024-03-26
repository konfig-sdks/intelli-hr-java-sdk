

# WebhookEventPersonUpdated


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier that this event relates to. |  [optional] |
|**event** | **Object** |  |  [optional] |
|**timestamp** | **String** | When this event was fired, not necessarily the the time that the event occurred. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**links** | [**WebhookEventLinksLinks**](WebhookEventLinksLinks.md) |  |  [optional] |
|**updatedAttributes** | [**List&lt;UpdatedAttributesEnum&gt;**](#List&lt;UpdatedAttributesEnum&gt;) |  |  [optional] |



## Enum: List&lt;UpdatedAttributesEnum&gt;

| Name | Value |
|---- | -----|
| FIRST_NAME | &quot;first_name&quot; |
| MIDDLE_NAME | &quot;middle_name&quot; |
| LAST_NAME | &quot;last_name&quot; |
| PREFERRED_NAME | &quot;preferred_name&quot; |
| DOB | &quot;dob&quot; |
| GENDER_ID | &quot;gender_id&quot; |
| EMPLOYEE_NUMBER | &quot;employee_number&quot; |
| TITLE_ID | &quot;title_id&quot; |
| EMERGENCY_CONTACT_NAME | &quot;emergency_contact_name&quot; |
| EMERGENCY_CONTACT_RELATIONSHIP | &quot;emergency_contact_relationship&quot; |
| EMERGENCY_CONTACT_PHONE | &quot;emergency_contact_phone&quot; |
| EMERGENCY_CONTACT_EMAIL | &quot;emergency_contact_email&quot; |
| EMAIL_ADDRESSES | &quot;email_addresses&quot; |
| PHONE_NUMBERS | &quot;phone_numbers&quot; |
| ADDRESSES | &quot;addresses&quot; |
| CUSTOM_FIELD_VALUES | &quot;custom_field_values&quot; |
| WORK_RIGHT_ID | &quot;work_right_id&quot; |
| WORK_RIGHT_EXPIRY_DATE | &quot;work_right_expiry_date&quot; |



