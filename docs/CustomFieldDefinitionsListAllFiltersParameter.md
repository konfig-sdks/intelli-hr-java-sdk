

# CustomFieldDefinitionsListAllFiltersParameter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelType** | **String** | The model that this custom field relates to and can be attached to. Enum: &#x60;ADDRESS&#x60;, &#x60;BUSINESS_ENTITY&#x60;, &#x60;BUSINESS_UNIT&#x60;, &#x60;EMAIL_ADDRESS&#x60;, &#x60;JOB&#x60;, &#x60;LOCATION&#x60;, &#x60;PERSON&#x60;, &#x60;POSITION_TITLE&#x60;, &#x60;PHONE_NUMBER&#x60;, &#x60;REMUNERATION&#x60;, &#x60;TRAINING&#x60;.  Example filter: &#x60;filters[modelType][eq]&#x3D;TRAINING&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |
|**isEnabled** | **Boolean** | If the custom field is disabled in the intelliHR platform or not  Example filter: &#x60;filters[isEnabled][eq]&#x3D;true&#x60;  This filter supports the equality &#x60;[eq]&#x60; operation |  [optional] |



