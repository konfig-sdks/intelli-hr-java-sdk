/*
 * intelliHR Public API
 * You can find developer's guide and more documentation on [https://developers.intellihr.io](https://developers.intellihr.io)
 *
 * The version of the OpenAPI document: V1
 * Contact: support@intellihr.co
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.WorkflowsPatchRequest;
import com.konfigthis.client.model.WorkflowsPatchRequestWorkflowFormDesignsInner;
import com.konfigthis.client.model.WorkflowsPatchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowsApi
 */
@Disabled
public class WorkflowsApiTest {

    private static WorkflowsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WorkflowsApi(apiClient);
    }

    /**
     * Trigger a Workflow by ID
     *
     * Trigger a Workflow and related Workflow Form Designs.   This endpoint supports Workflows that are linked to Job onboarding, offboarding, role change and extended leave.  Currently the recipient and email address type for the individual forms will be automatically set based on the Respondent Type on the Form Design.  Form Designs with a Respondent Type of &#x60;Supervisor&#x60; for a job with no supervisor currently are not supported as no default option can be selected.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerByIdTest() throws ApiException {
        String jobId = null;
        List<WorkflowsPatchRequestWorkflowFormDesignsInner> workflowFormDesigns = null;
        String id = null;
        WorkflowsPatchResponse response = api.triggerById(jobId, workflowFormDesigns, id)
                .execute();
        // TODO: test validations
    }

}
