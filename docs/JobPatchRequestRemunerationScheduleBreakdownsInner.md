

# JobPatchRequestRemunerationScheduleBreakdownsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of this Breakdowns. |  |
|**type** | **String** | How this breakdown is calculated and applied to the base amount, MultipleOfBase is multiplied by baseAnnualSalary and then added to the total while FixedAmount is added directly to the total. Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;. |  |
|**value** | **String** | For MultipleOfBase this is the multiplier (e.g. 9 &#x3D; 9%) while for fixed amount this is the amount to directly add to the total. Any number exceeding 8 decimal places will be rounded up. |  |
|**currency** | **String** | The currency used for this breakdown. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**defaultRemunerationComponent** | [**JobPatchRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent**](JobPatchRequestRemunerationScheduleBreakdownsInnerDefaultRemunerationComponent.md) |  |  [optional] |



