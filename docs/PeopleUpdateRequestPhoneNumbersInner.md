

# PeopleUpdateRequestPhoneNumbersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | The phone number. This number can be prefixed with an area code. When this happens, the system will automatically try to determine the origin country for the phone number |  [optional] |
|**isPersonal** | **Boolean** | Denotes whether this phone is personal or a work phone number. |  [optional] |
|**isPrimary** | **Boolean** | Denotes whether this phone is the primary contact phone number. |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesPatchRequestCustomFieldsValue&gt;**](BusinessEntitiesPatchRequestCustomFieldsValue.md) | The custom field values for this phone number |  [optional] |



