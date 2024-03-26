

# PersonDocumentsCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**person** | [**PersonDocumentsCreateRequestPerson**](PersonDocumentsCreateRequestPerson.md) |  |  |
|**filename** | **String** | The filename of the document. This will be used for display name. Includes extension. |  |
|**mime** | **String** | The mime type of the document |  |
|**size** | **Integer** | The size in bytes. We use this to validate the upload was successful so must match the actual file size |  |
|**extension** | **String** | The extension of the document, not including the dot |  |



