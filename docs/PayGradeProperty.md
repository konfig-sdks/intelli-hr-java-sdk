

# PayGradeProperty

PayGrade Model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**id** | **String** | The identifier string for the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**code** | **String** | Administrative, short code associated to the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**name** | **String** | User friendly name given to the [Pay Grade](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**startDate** | **Object** |  |  [optional] |
|**endDate** | **Object** |  |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether users can select this [Pay Grade](https://developers.intellihr.io/docs/v1/) in dropdowns. |  [optional] |
|**activeJobs** | **Integer** | Number of [Jobs](https://developers.intellihr.io/docs/v1/) that have been assigned this [Pay Grade](https://developers.intellihr.io/docs/v1/) in dropdowns. |  [optional] |
|**isOverridable** | **Boolean** | Allow this [Pay Grade](https://developers.intellihr.io/docs/v1/) value to be overwritten. |  [optional] |
|**permanentHourlyRate** | **Object** |  |  [optional] |
|**permanentHourlyRateCurrency** | **Object** |  |  [optional] |
|**casualHourlyRate** | **Object** |  |  [optional] |
|**casualHourlyRateCurrency** | **Object** |  |  [optional] |
|**annualSalary** | **Object** |  |  [optional] |
|**annualSalaryCurrency** | **Object** |  |  [optional] |
|**payGradeType** | [**PayGradeTypeEnum**](#PayGradeTypeEnum) | The type of this [Pay Grade](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**payGradeValues** | **Object** |  |  [optional] |
|**changeUser** | **Object** |  |  [optional] |
|**employmentCondition** | **Object** |  |  [optional] |



## Enum: PayGradeTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;FIXED&quot; |
| STEP | &quot;STEP&quot; |



