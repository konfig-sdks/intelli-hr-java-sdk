

# WebhooksPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | The [Webhook](https://developers.intellihr.io/docs/v1/) endpoint which the request will be sent to when the subscribed [Webhook Event](https://developers.intellihr.io/docs/v1/) is triggered. |  [optional] |
|**webhookEvent** | **String** | The slug of the [Webhook Event](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether users can select this [Webhook](https://developers.intellihr.io/docs/v1/). When disabled, this [Webhook](https://developers.intellihr.io/docs/v1/) will not be sent. |  [optional] |
|**source** | **String** | A customizable string which can be used to identify what system created this [Webhook](https://developers.intellihr.io/docs/v1/). [Webhooks](https://developers.intellihr.io/docs/v1/) created through the intelliHR application will have source: &#39;custom&#39;. |  [optional] |



