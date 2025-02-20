

# JobsGetAllFiltersParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**personId** | **String** | The identifier string for the [Person](https://developers.intellihr.io/docs/v1/). This can be chained by &#x60;,&#x60; to search for multiple jobs  Example filter: &#x60;filters[personId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**personName** | **String** | The name for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[personName][eq]&#x3D;Batman&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**primaryEmail** | **String** | The email address flagged as primary for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[primaryEmail][eq]&#x3D;bruce.wayne@example.com&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**employeeNumber** | **String** | The employee number for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[employeeNumber][eq]&#x3D;00001&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**autoIncrementIntellihrId** | **Double** | The autogenerated number that uniquely identifies [Person](https://developers.intellihr.io/docs/v1/) in intelliHR to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs.  Example filter: &#x60;filters[autoIncrementIntellihrId][eq]&#x3D;1000&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**jobId** | **String** | The identifier string for the [Job](https://developers.intellihr.io/docs/v1/). This can be chained by &#x60;,&#x60; to search for multiple jobs  Example filter: &#x60;filters[jobId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**jobName** | **String** | The name/position title for the [Job](https://developers.intellihr.io/docs/v1/).  Example filter: &#x60;filters[jobName][eq]&#x3D;Food%20Scientist&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**jobNameAsAt** | **String** | The date to filter jobName. This filter should be used in conjunction with jobName filter above. If not provided, it defaults to today.  Example filter: &#x60;filters[jobNameAsAt][eq]&#x3D;2020-10-08T22%3A30%3A00%2B00%3A00&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**jobStatus** | **String** | The current status of this [Job](https://developers.intellihr.io/docs/v1/) within this organisation. Enum: &#x60;Past Job&#x60;, &#x60;Future Job&#x60;, &#x60;Ending Job&#x60;, &#x60;Current Job&#x60;.  Example filter: &#x60;filters[jobStatus][eq]&#x3D;Current%20Job&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**jobEndingWithin** | **String** | The amount of days including today to filter jobs with an upcoming end date.  Example filter: &#x60;filters[jobEndingWithin][eq]&#x3D;14&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**jobEndedWithin** | **String** | The amount of days including today to filter jobs that have already ended.  Example filter: &#x60;filters[jobEndedWithin][eq]&#x3D;14&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**updatedWithin** | **String** | The amount of days including today to filter updated jobs.  Example filter: &#x60;filters[updatedWithin][eq]&#x3D;14&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**workType** | **String** | The name of the current [Work Type](https://developers.intellihr.io/docs/v1/) for the job.  Example filter: &#x60;filters[workType][eq]&#x3D;Fixed%20Contract&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**isPrimaryJob** | **String** | Whether this job is the primary job on the [Person](https://developers.intellihr.io/docs/v1/). Parse &#39;true&#39; to filter primary job. Parse &#39;false&#39; for non-primary job  Example filter: &#x60;filters[isPrimaryJob][eq]&#x3D;true&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**employmentConditionId** | **String** | The identifier string for the current [Employment Condition](https://developers.intellihr.io/docs/v1/) of the job.  Example filter: &#x60;filters[employmentConditionId][eq]&#x3D;8a5f3ea6-ea6b-4425-8a87-3c256bb7b6f9&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |



