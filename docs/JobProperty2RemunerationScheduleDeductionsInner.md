

# JobProperty2RemunerationScheduleDeductionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of this Deduction. |  [optional] |
|**type** | **String** | How this deduction is calculated and applied to the base amount, multipleOfBase is multiplied by baseAnnualSalary and then deducted from the total while fixed amount is deducted directly from the total. Enum: &#x60;MultipleOfBase&#x60;, &#x60;FixedAmount&#x60;. |  [optional] |
|**value** | **Double** | For multipleOfBase this is the multiplier while for fixed amount this is the amount to directly deduct from the total. |  [optional] |
|**currency** | **String** | The currency used for this Deduction. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |



