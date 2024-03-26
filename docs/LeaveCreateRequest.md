

# LeaveCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jobId** | **String** | The identifier string for the [Job](https://developers.intellihr.io/docs/v1/) that this extended leave belongs to. |  |
|**startDate** | **String** | The date this [Extended Leave](https://developers.intellihr.io/docs/v1/) started or will start. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  |
|**endDate** | **String** | The date this [Extended Leave](https://developers.intellihr.io/docs/v1/) is expected to end. Leave is created without a finalised return date. In order to create more than one Extended Leave on a Job, the end date must be finalised on the most recent created Extended Leave. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  |
|**leaveType** | [**LeaveCreateRequestLeaveType**](LeaveCreateRequestLeaveType.md) |  |  |
|**fte** | **String** | The full time equivalent for this [Job](https://developers.intellihr.io/docs/v1/) if changing during this leave period. |  [optional] |



