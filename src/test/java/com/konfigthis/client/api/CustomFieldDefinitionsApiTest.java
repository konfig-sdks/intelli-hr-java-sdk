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
import com.konfigthis.client.model.CustomFieldDefinitionCreateRequest;
import com.konfigthis.client.model.CustomFieldDefinitionPatchRequest;
import com.konfigthis.client.model.CustomFieldDefinitions;
import com.konfigthis.client.model.CustomFieldDefinitionsList;
import com.konfigthis.client.model.CustomFieldDefinitionsListAllFiltersParameter;
import com.konfigthis.client.model.OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty;
import com.konfigthis.client.model.ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty;
import com.konfigthis.client.model.ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty1;
import com.konfigthis.client.model.TheSelectDefinitionOfTheCustomFieldDefinitionProperty;
import com.konfigthis.client.model.TheSelectDefinitionOfTheCustomFieldDefinitionProperty1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldDefinitionsApi
 */
@Disabled
public class CustomFieldDefinitionsApiTest {

    private static CustomFieldDefinitionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomFieldDefinitionsApi(apiClient);
    }

    /**
     * Create a Custom Field Definition
     *
     * Returns the created [Custom Field Definition](https://developers.intellihr.io/docs/v1/)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDefinitionTest() throws ApiException {
        String name = null;
        String apiName = null;
        String modelType = null;
        String type = null;
        Object description = null;
        Boolean isSensitive = null;
        TheSelectDefinitionOfTheCustomFieldDefinitionProperty selectDefinition = null;
        OptionallyAddTextValidationOfTheCustomFieldDefinitionProperty textDefinition = null;
        ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty peopleDropdownDefinition = null;
        CustomFieldDefinitions response = api.createDefinition(name, apiName, modelType, type)
                .description(description)
                .isSensitive(isSensitive)
                .selectDefinition(selectDefinition)
                .textDefinition(textDefinition)
                .peopleDropdownDefinition(peopleDropdownDefinition)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Custom Field Definition by ID
     *
     * Deletes the [Custom Field Definition](https://developers.intellihr.io/docs/v1/) by the given ID.
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
     * Find a Custom Field Definition by ID
     *
     * Returns a single Custom Field Definition.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findDefinitionByIdTest() throws ApiException {
        CustomFieldDefinitions response = api.findDefinitionById()
                .execute();
        // TODO: test validations
    }

    /**
     * List all Custom Field Definitions
     *
     * Returns a list of all Custom Field Definitions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        CustomFieldDefinitionsListAllFiltersParameter filters = null;
        CustomFieldDefinitionsList response = api.listAll()
                .filters(filters)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a Custom Field Definition
     *
     * Returns the updated [Custom Field Definition](https://developers.intellihr.io/docs/v1/)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDefinitionByIdTest() throws ApiException {
        Object description = null;
        String name = null;
        Boolean isEnabled = null;
        Boolean isSensitive = null;
        TheSelectDefinitionOfTheCustomFieldDefinitionProperty1 selectDefinition = null;
        ThePeopleDropdownDefinitionOfTheCustomFieldDefinitionProperty1 peopleDropdownDefinition = null;
        CustomFieldDefinitions response = api.updateDefinitionById()
                .description(description)
                .name(name)
                .isEnabled(isEnabled)
                .isSensitive(isSensitive)
                .selectDefinition(selectDefinition)
                .peopleDropdownDefinition(peopleDropdownDefinition)
                .execute();
        // TODO: test validations
    }

}
