

# FormProperty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [Form](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**issueDate** | **String** | The date this [Form](https://developers.intellihr.io/docs/v1/) was issued to the recipient. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**dueDate** | **Object** |  |  [optional] |
|**reminderDate** | **Object** |  |  [optional] |
|**accessCode** | **String** | The authorization code required to access this form via a url. |  [optional] |
|**completedAt** | **Object** |  |  [optional] |
|**formDesign** | [**FormPropertyFormDesign**](FormPropertyFormDesign.md) |  |  [optional] |
|**subject** | [**FormPropertySubject**](FormPropertySubject.md) |  |  [optional] |
|**respondent** | **Object** |  |  [optional] |
|**submitter** | **Object** |  |  [optional] |
|**answers** | **Object** |  |  [optional] |
|**documentUploads** | [**List&lt;FormPropertyDocumentUploadsInner&gt;**](FormPropertyDocumentUploadsInner.md) | A list of documents uploaded in this form. |  [optional] |
|**job** | **Object** |  |  [optional] |
|**person** | **Object** |  |  [optional] |



