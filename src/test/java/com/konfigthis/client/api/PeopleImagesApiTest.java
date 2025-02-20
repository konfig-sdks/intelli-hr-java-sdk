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
import com.konfigthis.client.model.PersonIdImageCreateRequest;
import com.konfigthis.client.model.PersonIdImageCreateResponse;
import com.konfigthis.client.model.PersonIdImageFindResponse;
import com.konfigthis.client.model.PersonIdImagePatchRequest;
import com.konfigthis.client.model.PersonIdImagePatchRequestCoordinates;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeopleImagesApi
 */
@Disabled
public class PeopleImagesApiTest {

    private static PeopleImagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PeopleImagesApi(apiClient);
    }

    /**
     * Generate an temporary image upload URL for the provided Person.
     *
     * Generates an upload url for an temporary image of the specified type to an existing [Person](https://developers.intellihr.io/docs/v1/)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateTemporaryImageUrlTest() throws ApiException {
        String personId = null;
        String imageType = null;
        String extension = null;
        PersonIdImageCreateResponse response = api.generateTemporaryImageUrl(personId)
                .imageType(imageType)
                .extension(extension)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a temporary image
     *
     * Returns the current temporary image of the specified type for the provided [Person](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTemporaryImageTest() throws ApiException {
        String personId = null;
        String imageType = null;
        PersonIdImageFindResponse response = api.getTemporaryImage(personId)
                .imageType(imageType)
                .execute();
        // TODO: test validations
    }

    /**
     * Promote temporary image
     *
     * Activates the temporary image as the active image on a [Person](https://developers.intellihr.io/docs/v1/), has some minor editing options.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void promoteImageTest() throws ApiException {
        String personId = null;
        String imageType = null;
        Integer rotation = null;
        PersonIdImagePatchRequestCoordinates coordinates = null;
        api.promoteImage(personId)
                .imageType(imageType)
                .rotation(rotation)
                .coordinates(coordinates)
                .execute();
        // TODO: test validations
    }

}
