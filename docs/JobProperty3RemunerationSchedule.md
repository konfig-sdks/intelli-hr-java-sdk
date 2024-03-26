

# JobProperty3RemunerationSchedule

The current remuneration details for this [Job](https://developers.intellihr.io/docs/v1/), including information such as salary and hourly pay, all [Jobs](https://developers.intellihr.io/docs/v1/) have a remuneration schedule but for unpaid employees they will have a special `No Remuneration Schedule` schedule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The method in which this remuneration schedule is paid, if a person is unpaid then this will be &#x60;No Remuneration Schedule&#x60;. Enum: &#x60;Annual Salary&#x60;, &#x60;Hourly Rate&#x60;, &#x60;No Remuneration Schedule&#x60;. |  [optional] |
|**baseAnnualSalary** | **Double** | The Base Salary paid yearly, this is an approximation if they are paid hourly. Note that if both baseAnnualSalary and baseHourlyRate are provided in a create or patch request, the baseHourlyRate will be ignored. |  [optional] |
|**baseHourlyRate** | **Double** | The Base Rate paid hourly, this is an approximation if they are paid annually. Note that if both baseAnnualSalary and baseHourlyRate are provided in a create or patch request, the baseHourlyRate will be ignored. |  [optional] |
|**currency** | **String** | The currency that the base and total amounts that this job is being paid in. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**hoursPerCycle** | **Double** | How many hours worked per payCycle.    0 (zero) signifies that the hours are variable per pay cycle |  [optional] |
|**payCycle** | **String** | The cycle that the job is paid on. Enum: &#x60;Weekly&#x60;, &#x60;Fortnightly&#x60;, &#x60;Monthly&#x60;, &#x60;Bi-Monthly&#x60;. |  [optional] |
|**annualPackage** | **Double** | The total package paid yearly including additions and deductions. This amount is calculated by adding the Base Annual Salary and additions minus the deductions. |  [optional] |
|**hourlyPackage** | **Double** | The total package paid hourly including additions and deductions. This amount is calculated by dividing the Annual Package by the total number of hours per annum. |  [optional] |
|**currencyConversionOccurred** | **Boolean** | If any conversion had to be performed between addition and deduction currencies when calculating the annual package. |  [optional] |
|**employmentCondition** | [**JobProperty3RemunerationScheduleEmploymentCondition**](JobProperty3RemunerationScheduleEmploymentCondition.md) |  |  [optional] |
|**additions** | [**List&lt;JobProperty3RemunerationScheduleAdditionsInner&gt;**](JobProperty3RemunerationScheduleAdditionsInner.md) | An array of Additions for this Remuneration Schedule. |  [optional] |
|**deductions** | [**List&lt;JobProperty3RemunerationScheduleDeductionsInner&gt;**](JobProperty3RemunerationScheduleDeductionsInner.md) | An array of Deductions for this Remuneration Schedule. Note that this deductions value has been deprecated, you should now use &#x60;breakdowns&#x60; |  [optional] |
|**additionsToTotal** | [**List&lt;JobProperty3RemunerationScheduleAdditionsToTotalInner&gt;**](JobProperty3RemunerationScheduleAdditionsToTotalInner.md) | An array of Additions applied to the package after all other components for this Remuneration Schedule. |  [optional] |
|**breakdowns** | [**List&lt;JobProperty3RemunerationScheduleBreakdownsInner&gt;**](JobProperty3RemunerationScheduleBreakdownsInner.md) | An array of Breakdowns for this Remuneration Schedule. Breakdowns will not be used to calculate the total package. |  [optional] |
|**customFields** | **CustomFieldsResponse** | The custom field values for this Remuneration Schedule |  [optional] |



