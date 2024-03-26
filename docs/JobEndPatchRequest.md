

# JobEndPatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endDate** | **String** | The &lt;b&gt;exclusive&lt;/b&gt; date this [Job](https://developers.intellihr.io/docs/v1/) ended or will end within the organisation. For example, if the person&#39;s last working date is on 2025-04-23, the &#x60;endDate&#x60; should be set as 2025-04-24 to reflect the exclusive date. Required if not finalising an end date, or the job does not have an end date. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6).   YYYY-MM-DD date formatting is also supported, although by using this format the date will be stored as the start of day in UTC time, not the requesting tenants timezone. |  [optional] |
|**reassignDirectReportsTo** | **String** | The identifier string for the [Job](https://developers.intellihr.io/docs/v1/) of the person that the direct report will be reassigned to. |  [optional] |
|**turnoverType** | **String** | The type of turnover this end of job would be classified as: &#x60;voluntary&#x60;, &#x60;involuntary&#x60; or &#x60;unknown&#x60;. Required if finalising an end date. |  [optional] |
|**turnoverReason** | **String** | The name of the turnover reason. |  [optional] |



