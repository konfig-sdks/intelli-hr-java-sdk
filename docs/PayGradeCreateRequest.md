

# PayGradeCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**name** | **String** | The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/). |  |
|**code** | **String** | Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**employmentCondition** | [**PayGradeCreateRequestEmploymentCondition**](PayGradeCreateRequestEmploymentCondition.md) |  |  [optional] |
|**payGradeType** | **String** | The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/). Enum: &#x60;FIXED&#x60; or &#x60;STEP&#x60;. |  [optional] |
|**isOverridable** | **Boolean** | Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten. |  [optional] |
|**permanentHourlyRate** | **Double** | Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values. |  [optional] |
|**permanentHourlyRateCurrency** | **String** | The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**casualHourlyRate** | **Double** | Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values. |  [optional] |
|**casualHourlyRateCurrency** | **String** | The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**annualSalary** | **Double** | Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values. |  [optional] |
|**annualSalaryCurrency** | **String** | The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**paySteps** | [**List&lt;PayGradeCreateRequestPayStepsInner&gt;**](PayGradeCreateRequestPayStepsInner.md) | An array of Paygrade Step Rates. This array is to be used when payGradeType of \&quot;Step\&quot; is used. |  [optional] |



