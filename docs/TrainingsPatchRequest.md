

# TrainingsPatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coordinatorPerson** | [**TrainingsPatchRequestCoordinatorPerson**](TrainingsPatchRequestCoordinatorPerson.md) |  |  [optional] |
|**completionDate** | **String** | The timestamp the [Training](https://developers.intellihr.io/docs/v1/) was completed. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**cost** | **String** | The cost of this [Training](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**currency** | **String** | The currency used for this [Training](https://developers.intellihr.io/docs/v1/). Will default to the tenant default currency when not provided. An international currency code. Typically AUD for Australian dollar, USD for American dollar etc. See [Official list of codes](https://www.iban.com/currency-codes). |  [optional] |
|**hours** | **String** | How many hours were spent on this [Training](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**job** | [**TrainingsPatchRequestJob**](TrainingsPatchRequestJob.md) |  |  [optional] |
|**name** | **String** | User friendly name given to this [Training](https://developers.intellihr.io/docs/v1/) to identify it in the system. |  [optional] |
|**person** | [**TrainingsPatchRequestPerson**](TrainingsPatchRequestPerson.md) |  |  [optional] |
|**provider** | [**TrainingsPatchRequestProvider**](TrainingsPatchRequestProvider.md) |  |  [optional] |
|**type** | [**TrainingsPatchRequestType**](TrainingsPatchRequestType.md) |  |  [optional] |
|**customFields** | [**Map&lt;String, BusinessEntitiesPatchRequestCustomFieldsValue&gt;**](BusinessEntitiesPatchRequestCustomFieldsValue.md) | The custom field values for this [Training](https://developers.intellihr.io/docs/v1/) |  [optional] |
|**status** | [**TrainingsPatchRequestStatus**](TrainingsPatchRequestStatus.md) |  |  [optional] |



