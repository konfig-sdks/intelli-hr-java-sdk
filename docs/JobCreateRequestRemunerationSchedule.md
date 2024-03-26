

# JobCreateRequestRemunerationSchedule

remuneration schedule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The method in which this remuneration schedule is paid. Enum: &#x60;Annual Salary&#x60;, &#x60;Hourly Rate&#x60;, &#x60;No Remuneration Schedule&#x60;. |  [optional] |
|**payCycle** | **String** | The cycle that the job is paid on. Enum: &#x60;Weekly&#x60;, &#x60;Fortnightly&#x60;, &#x60;Monthly&#x60;, &#x60;Bi-Monthly&#x60;. |  |
|**currency** | **String** | The currency that the base and total amounts that this job is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**employmentCondition** | [**JobCreateRequestRemunerationScheduleEmploymentCondition**](JobCreateRequestRemunerationScheduleEmploymentCondition.md) |  |  [optional] |
|**hoursPerCycle** | **Double** | How many hours worked per payCycle.    Setting hours to 0 (zero) signifies that the hours are variable per pay cycle |  |
|**baseAnnualSalary** | **Double** | The Base Salary paid yearly, this is only required if the Remuneration Schedule Type is \&quot;Annual Salary\&quot;. Any number exceeding 8 decimal places will be rounded up. |  [optional] |
|**baseHourlyRate** | **Double** | The Base Rate paid hourly, this is only required if the Remuneration Schedule Type is \&quot;Hourly Rate\&quot;. Any number exceeding 8 decimal places will be rounded up. |  [optional] |
|**additions** | [**List&lt;JobCreateRequestRemunerationScheduleAdditionsInner&gt;**](JobCreateRequestRemunerationScheduleAdditionsInner.md) | An array of Additions for the base salary. |  [optional] |
|**additionsToTotal** | [**List&lt;JobCreateRequestRemunerationScheduleAdditionsToTotalInner&gt;**](JobCreateRequestRemunerationScheduleAdditionsToTotalInner.md) | an array of Additions for the total salary. |  [optional] |
|**breakdowns** | [**List&lt;JobCreateRequestRemunerationScheduleBreakdownsInner&gt;**](JobCreateRequestRemunerationScheduleBreakdownsInner.md) | an array of Breakdowns. |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesCreateRequestCustomFieldsValue&gt;**](BusinessEntitiesCreateRequestCustomFieldsValue.md) | The custom field values for this Remuneration Schedule |  [optional] |



