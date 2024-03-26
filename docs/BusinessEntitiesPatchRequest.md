

# BusinessEntitiesPatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name given to this [Business Entity](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system. |  [optional] |
|**code** | **String** | Code given to this [Business Entity](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**legalName** | **String** | Legal name can be different from the name presented to a user. Usually used for administrative tasks. |  [optional] |
|**number** | **String** | Legally registered [Business Entity](https://developers.intellihr.io/docs/v1/) number, e.g. in Australia this might be the ABN, or in America the RN. |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether users can select this [Business Entity](https://developers.intellihr.io/docs/v1/) in dropdowns. |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesPatchRequestCustomFieldsValue&gt;**](BusinessEntitiesPatchRequestCustomFieldsValue.md) | The custom field values for this [Business Entity](https://developers.intellihr.io/docs/v1/) |  [optional] |



