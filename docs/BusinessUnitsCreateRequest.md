

# BusinessUnitsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | Optional identifier that can be used for administrative tasks. |  [optional] |
|**name** | **String** | Name given to this [Business Unit](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system. |  |
|**code** | **String** | Code given to this [Business Unit](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**notes** | **String** | Notes attached to a [Business Unit](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**parentId** | **Object** |  |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether users can select this [Business Unit](https://developers.intellihr.io/docs/v1/) in dropdowns. |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesPatchRequestCustomFieldsValue&gt;**](BusinessEntitiesPatchRequestCustomFieldsValue.md) | The custom field values for this Business Unit |  [optional] |



