

# WebhookUserDisabledUpcoming


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier that this event relates to. |  [optional] |
|**event** | **Object** |  |  [optional] |
|**timestamp** | **String** | When this event was fired, not necessarily the the time that the event occurred. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**links** | [**Object**](Object.md) |  |  [optional] |
|**scheduledFor** | **String** | Date this event was scheduled for.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**scheduledOffset** | **String** | The current offset before the scheduled date. Enum: &#x60;-1 month&#x60;, &#x60;-14 days&#x60;, &#x60;-7 days&#x60;, &#x60;-3 days&#x60;, &#x60;-1 days&#x60;, &#x60;0 days&#x60;. |  [optional] |



