

# JobTimelineEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**groupTime** | **String** | The timestamp of the group of timeline events. This date will follow the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**businessUnits** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**businessEntities** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**ftes** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**locations** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**positionTitles** | **List&lt;Object&gt;** |  |  [optional] |
|**payGrades** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**renamedPayGrades** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**remunerationSchedules** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**supervisors** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**workClasses** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**workTypes** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**directReportsRemoved** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**directReportsAssigned** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |
|**extendedLeaveStarted** | **Object** |  |  [optional] |
|**extendedLeaveEnded** | **Object** |  |  [optional] |
|**isFirstChange** | **Boolean** | If this event group contains the first change of job attributes (e.g. when a job starts) |  [optional] |
|**comments** | **Object** |  |  [optional] |
|**isStartOfJob** | **Boolean** | If this event group is the start of the given job |  [optional] |
|**isEndOfProbation** | **Boolean** | If this event group is the end of the jobs probation period |  [optional] |
|**isEndOfJob** | **Boolean** | If this event group is the end of the given job |  [optional] |
|**turnoverType** | **Object** |  |  [optional] |
|**turnoverReason** | **Object** |  |  [optional] |
|**customFields** | **List&lt;Object&gt;** | The array is in the following format: [From, To, From, To] every even index is the From record, odd the To record. |  [optional] |



