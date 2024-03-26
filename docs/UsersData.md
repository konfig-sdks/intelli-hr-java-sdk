

# UsersData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier string for the [User](https://developers.intellihr.io/docs/v1/). |  [optional] |
|**username** | **String** | The unique name of this user. |  [optional] |
|**isEnabled** | **Boolean** | Specifies whether this [User](https://developers.intellihr.io/docs/v1/) account is active. When disabled, you can no longer sign in using this account. |  [optional] |
|**createdAt** | **String** | When this record was created. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**updatedAt** | **String** | When this record was last updated. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**userPermissionGroups** | [**List&lt;UsersDataUserPermissionGroupsInner&gt;**](UsersDataUserPermissionGroupsInner.md) | The array of user permission groups containing the [Permission Group&#39;s](https://developers.intellihr.io/docs/v1/) assigned to this user. |  [optional] |
|**person** | [**UsersDataPerson**](UsersDataPerson.md) |  |  [optional] |



