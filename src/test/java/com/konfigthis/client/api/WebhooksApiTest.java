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
import com.konfigthis.client.model.Webhooks;
import com.konfigthis.client.model.WebhooksCreate;
import com.konfigthis.client.model.WebhooksList;
import com.konfigthis.client.model.WebhooksPatch;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private static WebhooksApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebhooksApi(apiClient);
    }

    /**
     * Create a Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWebhookTest() throws ApiException {
        String url = null;
        String webhookEvent = null;
        Boolean isEnabled = null;
        String source = null;
        Webhooks response = api.createWebhook(url, webhookEvent)
                .isEnabled(isEnabled)
                .source(source)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Webhook by ID
     *
     * Deletes the provided webhook.
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
     * Find a Webhook by ID
     *
     * Returns a single webhook.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findByIdTest() throws ApiException {
        Webhooks response = api.findById()
                .execute();
        // TODO: test validations
    }

    /**
     * List all Webhooks
     *
     * Returns a list of all webhooks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        WebhooksList response = api.listAll()
                .execute();
        // TODO: test validations
    }

    /**
     * Patch a Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookTest() throws ApiException {
        String url = null;
        String webhookEvent = null;
        Boolean isEnabled = null;
        String source = null;
        Webhooks response = api.updateWebhook()
                .url(url)
                .webhookEvent(webhookEvent)
                .isEnabled(isEnabled)
                .source(source)
                .execute();
        // TODO: test validations
    }

}
