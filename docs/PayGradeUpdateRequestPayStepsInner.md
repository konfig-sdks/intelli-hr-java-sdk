

# PayGradeUpdateRequestPayStepsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the Pay Grade Step.  Providing an &#x60;id&#x60; will update an existing step.  Not providing an &#x60;id&#x60; will create a new step under the Pay Grade.. |  [optional] |
|**name** | **String** | The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/) Step. |  [optional] |
|**permanentHourlyRate** | **Double** | Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/) for this Step. |  [optional] |
|**permanentHourlyRateCurrency** | **String** | The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**casualHourlyRate** | **Double** | Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/) for this Step. |  [optional] |
|**casualHourlyRateCurrency** | **String** | The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**annualSalary** | **Double** | Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/) for this Step. |  [optional] |
|**annualSalaryCurrency** | **String** | The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |



