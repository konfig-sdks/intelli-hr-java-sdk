

# PayGradeUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**effectiveFrom** | **String** | The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective from within the organisation. Note that this doesn&#39;t affect the availableFrom date of the overall Pay Grade itself.  Not providing an effectiveFrom will apply the changes from the beggining of time.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  |
|**effectiveTo** | **String** | The date this [Pay Grade](https://developers.intellihr.io/docs/v1/) Update is effective to within the organisation.. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**isEnabled** | **Boolean** | Toggle the availability of the [Pay Grade](https://developers.intellihr.io/docs/v1/) on or off within the organisation. |  [optional] |
|**name** | **String** | The name assigned to this [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**code** | **String** | Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**employmentCondition** | [**PayGradeUpdateRequestEmploymentCondition**](PayGradeUpdateRequestEmploymentCondition.md) |  |  [optional] |
|**payGradeType** | **String** | The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/). Enum: &#x60;FIXED&#x60; or &#x60;STEP&#x60;. |  [optional] |
|**isOverridable** | **Boolean** | Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten. |  [optional] |
|**permanentHourlyRate** | **Double** | Stores the hourly rate for permanent [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values. |  [optional] |
|**permanentHourlyRateCurrency** | **String** | The currency that the permanentHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**casualHourlyRate** | **Double** | Stores the hourly rate for casual [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values. |  [optional] |
|**casualHourlyRateCurrency** | **String** | The currency that the casualHourlyRate is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**annualSalary** | **Double** | Stores the annual salary for [Jobs](https://developers.intellihr.io/docs/v1/). These inputs will be ignored if you also pass in pay Step values. |  [optional] |
|**annualSalaryCurrency** | **String** | The currency that the annualSalary is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**paySteps** | [**List&lt;PayGradeUpdateRequestPayStepsInner&gt;**](PayGradeUpdateRequestPayStepsInner.md) | An array of Paygrade Step Rates. This will replace the current Pay Steps with a new list.  Providing an &#x60;id&#x60; for an existing Pay Step will update that record instead of createing a new Pay Step. |  [optional] |



