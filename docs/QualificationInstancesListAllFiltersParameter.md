

# QualificationInstancesListAllFiltersParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**personId** | **String** | The identifier string for the [Person](https://developers.intellihr.io/docs/v1/). This can be chained by &#x60;,&#x60; to search by multiple [People](https://developers.intellihr.io/docs/v1/).  Example filter: &#x60;filters[personId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**employeeNumber** | **String** | The employee number for the [Person](https://developers.intellihr.io/docs/v1/) to whom the [Job](https://developers.intellihr.io/docs/v1/) belongs. This can be chained by &#x60;,&#x60; to search by multiple employee numbers  Example filter: &#x60;filters[employeeNumber][eq]&#x3D;00001&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**qualificationLibraryItemId** | **String** | The identifier string for the [Qualification Library Item](https://developers.intellihr.io/docs/v1/). This can be chained by &#x60;,&#x60; to search by multiple [Qualification Library Items](https://developers.intellihr.io/docs/v1/).  Example filter: &#x60;filters[qualificationLibraryItemId][eq]&#x3D;dc996d73-a75e-499c-a96e-bd7d0df45f57,26d0ffc4-60f6-4672-a603-caaa4564af12&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |



