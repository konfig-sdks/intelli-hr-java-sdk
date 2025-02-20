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
import com.konfigthis.client.model.ExtendedLeaveTypes;
import com.konfigthis.client.model.ExtendedLeaveTypesList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExtendedLeaveTypesApi
 */
@Disabled
public class ExtendedLeaveTypesApiTest {

    private static ExtendedLeaveTypesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ExtendedLeaveTypesApi(apiClient);
    }

    /**
     * Find an Extended Leave Type by ID
     *
     * Returns a single Extended Leave Type.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByIdTest() throws ApiException {
        ExtendedLeaveTypes response = api.findById()
                .execute();
        // TODO: test validations
    }

    /**
     * List all Extended Leave Types
     *
     * Returns a list of all Extended Leave Types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        ExtendedLeaveTypesList response = api.listAll()
                .execute();
        // TODO: test validations
    }

}
