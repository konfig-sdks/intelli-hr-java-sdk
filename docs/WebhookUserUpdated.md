

# WebhookUserUpdated


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier that this event relates to. |  [optional] |
|**event** | **Object** |  |  [optional] |
|**timestamp** | **String** | When this event was fired, not necessarily the the time that the event occurred. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**links** | [**Object**](Object.md) |  |  [optional] |
|**updatedAttributes** | [**List&lt;UpdatedAttributesEnum&gt;**](#List&lt;UpdatedAttributesEnum&gt;) |  |  [optional] |



## Enum: List&lt;UpdatedAttributesEnum&gt;

| Name | Value |
|---- | -----|
| USERNAME | &quot;username&quot; |
| PERSON_ID | &quot;person_id&quot; |
| IS_ENABLED | &quot;is_enabled&quot; |
| DISABLE_AT | &quot;disable_at&quot; |
| SSO_ID | &quot;sso_id&quot; |
| PASSWORD | &quot;password&quot; |
| ROLES | &quot;roles&quot; |
| HAS_ACCEPTED_TERMS | &quot;has_accepted_terms&quot; |



