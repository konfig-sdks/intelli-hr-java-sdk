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
import com.konfigthis.client.model.BusinessEntities;
import com.konfigthis.client.model.BusinessEntitiesCreateRequest;
import com.konfigthis.client.model.BusinessEntitiesCreateRequestCustomFieldsValue;
import com.konfigthis.client.model.BusinessEntitiesList;
import com.konfigthis.client.model.BusinessEntitiesPatchRequest;
import com.konfigthis.client.model.BusinessEntitiesPatchRequestCustomFieldsValue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusinessEntitiesApi
 */
@Disabled
public class BusinessEntitiesApiTest {

    private static BusinessEntitiesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BusinessEntitiesApi(apiClient);
    }

    /**
     * Create a new Business Entity
     *
     * Returns the created [Business Entity](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewEntityTest() throws ApiException {
        String name = null;
        String code = null;
        String legalName = null;
        String number = null;
        Boolean isEnabled = null;
        Map<String, BusinessEntitiesCreateRequestCustomFieldsValue> customFields = null;
        BusinessEntities response = api.createNewEntity(name)
                .code(code)
                .legalName(legalName)
                .number(number)
                .isEnabled(isEnabled)
                .customFields(customFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Business Entity by ID
     *
     * Deletes the [Business Entity](https://developers.intellihr.io/docs/v1/)&#39;s by the given ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        api.deleteById()
                .execute();
        // TODO: test validations
    }

    /**
     * Find a Business Entity by ID
     *
     * Returns a single [Business Entity](https://developers.intellihr.io/docs/v1/) by its identifier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByIdTest() throws ApiException {
        BusinessEntities response = api.findById()
                .execute();
        // TODO: test validations
    }

    /**
     * List all Business Entities
     *
     * Returns a list of all [Business Entities](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        BusinessEntitiesList response = api.listAll()
                .execute();
        // TODO: test validations
    }

    /**
     * Update a Business Entity by ID
     *
     * Returns the updated [Business Entity](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String name = null;
        String code = null;
        String legalName = null;
        String number = null;
        Boolean isEnabled = null;
        Map<String, BusinessEntitiesPatchRequestCustomFieldsValue> customFields = null;
        BusinessEntities response = api.updateById()
                .name(name)
                .code(code)
                .legalName(legalName)
                .number(number)
                .isEnabled(isEnabled)
                .customFields(customFields)
                .execute();
        // TODO: test validations
    }

}
