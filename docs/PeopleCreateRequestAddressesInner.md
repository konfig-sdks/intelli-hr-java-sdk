

# PeopleCreateRequestAddressesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressType** | **String** | Enum: &#x60;Home&#x60;, &#x60;Postal&#x60;. The type of address. |  |
|**fullAddress** | **String** | The full readable address, minus the postcode and country.  This value will be resolved against Google maps api and will populate the state, suburb and street if a match is found.  You can override these results if you also pass the corresponding fields you wish to set. |  [optional] |
|**country** | **String** | The country the address is in. |  |
|**postcode** | **String** | The postcode of the address. |  [optional] |
|**state** | **String** | The state the address is in. This field is required if the fullAddress field is not provided. |  [optional] |
|**street** | **String** | The street the address is on. This field is required if the fullAddress field is not provided. |  [optional] |
|**suburb** | **String** | The suburb the address is in. This field is required if the fullAddress field is not provided. |  [optional] |
|**isPrimary** | **Boolean** | Denotes whether this address is the primary. By default, the first address in the array                will be set as the primary if all addresses are set with isPrimary: false. |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesCreateRequestCustomFieldsValue&gt;**](BusinessEntitiesCreateRequestCustomFieldsValue.md) | The custom field values for this address |  [optional] |



