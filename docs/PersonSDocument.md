

# PersonSDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [People Document](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**filename** | **String** | The filename of the document. This will be used for display name. Includes extension. |  [optional] |
|**downloadUrlAbsolute** | **String** | A downloadable Url of the document. |  [optional] |
|**extension** | **String** | The extension of the document, not including the dot |  [optional] |
|**size** | **Integer** | The size in bytes. We use this to validate the upload was successful so must match the actual file size |  [optional] |
|**humanReadableSize** | **String** | The size in bytes. We use this to validate the upload was successful so must match the actual file size |  [optional] |
|**uploadStatus** | **Object** | The upload status of this [Document](https://developers.intellihr.io/docs/v1/). Enum: &#x60;SUCCESS&#x60;, &#x60;PENDING&#x60;, &#x60;FAILED&#x60;. |  [optional] |



