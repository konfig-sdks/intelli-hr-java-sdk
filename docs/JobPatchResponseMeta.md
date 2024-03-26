

# JobPatchResponseMeta

Contains miscellaneous meta information about the response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**asAt** | **String** | The point in time for which this response is for. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**workflowEvent** | **Object** |  |  [optional] |
|**workflowEventId** | **Object** |  |  [optional] |
|**workflowEventIds** | **List&lt;String&gt;** | List of string identifiers for [Workflow Events](https://developers.intellihr.io/docs/v1/). This will not be defined if there is no workflowEvents in the response |  [optional] |
|**requestId** | **String** | The identifier string for the api request. |  [optional] |



