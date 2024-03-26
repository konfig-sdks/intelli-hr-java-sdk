

# CustomFieldDefinition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **Object** |  |  [optional] |
|**id** | **String** | The identifier string for the [Custom Field Definition](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**name** | **String** | Name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system. |  [optional] |
|**apiName** | **String** | The api name given to this [Custom Field Definition](https://developers.intellihr.io/docs/v1/). This name is used to uniquely identify the custom field in the api and is used as the key when modifying the custom field on a record. |  [optional] |
|**isEnabled** | **Boolean** | Whether or not this [Custom Field Definition](https://developers.intellihr.io/docs/v1/) is enabled to be used. |  [optional] |
|**isSensitive** | **Boolean** | Whether or not this [Custom Field Definition](https://developers.intellihr.io/docs/v1/) is marked as sensitive information. |  [optional] |
|**modelType** | **String** | The model that this custom field relates to and can be attached to. Enum: &#x60;ADDRESS&#x60;, &#x60;BUSINESS_ENTITY&#x60;, &#x60;BUSINESS_UNIT&#x60;, &#x60;EMAIL_ADDRESS&#x60;, &#x60;JOB&#x60;, &#x60;LOCATION&#x60;, &#x60;PERSON&#x60;, &#x60;POSITION_TITLE&#x60;, &#x60;PHONE_NUMBER&#x60;, &#x60;REMUNERATION&#x60;, &#x60;TRAINING&#x60;. |  [optional] |
|**type** | **String** | The type of data this field records. Enum: &#x60;SINGLE_SELECT&#x60;, &#x60;MULTI_SELECT&#x60;, &#x60;TEXT&#x60;, &#x60;NUMBER&#x60;, &#x60;PEOPLE_DROPDOWN&#x60;. |  [optional] |
|**definitions** | **Object** | This key&#39;s values change depending on the \&quot;type\&quot; key. It is used to store additional information pertinent to that key. For more information on custom field configurations, see our [knowledge base article on custom fields](https://intellihr.zendesk.com/hc/en-us/articles/4402637180303-Custom-Fields) |  [optional] |



