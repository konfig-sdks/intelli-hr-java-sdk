

# DefaultRemunerationComponent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**name** | **String** | Name given to this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). This name would normally be shown to users of the system. |  [optional] |
|**value** | **String** | The value of this remuneration component. For multipleOfBase this is the multiplier while for fixed amount this is the amount to directly add to the total. |  [optional] |
|**isInUse** | **Boolean** | Whether this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is used as any remuneration components. |  [optional] |
|**automaticallyAddToJobs** | **Boolean** | Whether this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is automatically added to newly created/updated jobs. |  [optional] |
|**isEnabled** | **Boolean** | If this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/) is enabled for use in the system. |  [optional] |
|**currency** | **Object** |  |  [optional] |
|**type** | **String** | The type of this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). Enum: &#x60;AdditionToBase&#x60;, &#x60;AdditionToTotal&#x60;, &#x60;DeductionToBase&#x60;, &#x60;Breakdown&#x60;. |  [optional] |
|**valueType** | **String** | The type of the value of this [Default Remuneration Component](https://developers.intellihr.io/docs/v1/). Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;. |  [optional] |



