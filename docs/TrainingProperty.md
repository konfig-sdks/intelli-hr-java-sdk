

# TrainingProperty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Training](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**name** | **String** | User friendly name given to this [Training](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**status** | [**TrainingPropertyStatus**](TrainingPropertyStatus.md) |  |  [optional] |
|**person** | [**TrainingPropertyPerson**](TrainingPropertyPerson.md) |  |  [optional] |
|**job** | [**TrainingPropertyJob**](TrainingPropertyJob.md) |  |  [optional] |
|**coordinator** | **Object** |  |  [optional] |
|**hours** | **Object** |  |  [optional] |
|**currency** | **String** | The currency used for this [Training](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**cost** | **Object** |  |  [optional] |
|**provider** | [**TrainingPropertyProvider**](TrainingPropertyProvider.md) |  |  [optional] |
|**type** | [**TrainingPropertyType**](TrainingPropertyType.md) |  |  [optional] |
|**completionDate** | **Object** |  |  [optional] |
|**createdAt** | **String** | When this record was created. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**updatedAt** | **String** | When this record was last updated. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**customFields** | **CustomFieldsResponse** | Custom Fields defined on this training with their values. |  [optional] |



