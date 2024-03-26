

# BusinessUnitsListAllFiltersParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identifier** | **String** | The customer identifier given to a [Business Unit](https://developers.intellihr.io/docs/v1/) in the system. This filter checks for an exact string match with any part of a [Business Units](https://developers.intellihr.io/docs/v1/) identifier. If multiple [Business Units](https://developers.intellihr.io/docs/v1/) match the &#x60;&lt;filter_value&gt;&#x60;, they will all be returned.  Example filter: &#x60;filters[identifier][eq]&#x3D;Engineering&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**name** | **String** | Name of a [Business Unit](https://developers.intellihr.io/docs/v1/) in the system. This filter checks for an exact string match with any part of a [Business Units](https://developers.intellihr.io/docs/v1/) name. If multiple [Business Units](https://developers.intellihr.io/docs/v1/) match the &#x60;&lt;filter_value&gt;&#x60;, they will all be returned.  Example filter: &#x60;filters[name][eq]&#x3D;Engineering&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |



