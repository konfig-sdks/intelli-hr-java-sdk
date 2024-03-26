

# DataPropertyInner1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Webhook](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**url** | **String** | The [Webhook](https://developers.intellihr.io/docs/v1/) endpoint which the request will be sent to when the subscribed [Webhook Event](https://developers.intellihr.io/docs/v1/) is triggered. |  [optional] |
|**webhookEvent** | [**DataPropertyInner1WebhookEvent**](DataPropertyInner1WebhookEvent.md) |  |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether users can select this [Webhook](https://developers.intellihr.io/docs/v1/). When disabled, this [Webhook](https://developers.intellihr.io/docs/v1/) will not be sent. |  [optional] |
|**source** | **String** | A customizable string which can be used to identify what system created this [Webhook](https://developers.intellihr.io/docs/v1/). [Webhooks](https://developers.intellihr.io/docs/v1/) created through the intelliHR application will have source: &#39;custom&#39;. |  [optional] |
|**createdAt** | **String** | When this record was created. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**updatedAt** | **String** | When this record was last updated. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |



