

# JobRemunerationScheduleAdditionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of this Addition. |  [optional] |
|**type** | **String** | How this addition is calculated and applied to the base amount, multipleOfBase is multiplied by baseAnnualSalary and then added to the total while fixed amount is added directly to the total. Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;. |  [optional] |
|**value** | **Double** | For multipleOfBase this is the multiplier (e.g. 9 &#x3D; 9%) while for fixed amount this is the amount to directly add to the total. |  [optional] |
|**currency** | **String** | The currency used for this Addition. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |



