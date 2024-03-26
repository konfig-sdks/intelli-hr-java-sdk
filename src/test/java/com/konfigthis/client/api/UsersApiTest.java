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
import com.konfigthis.client.model.Users;
import com.konfigthis.client.model.UsersCreate;
import com.konfigthis.client.model.UsersCreatePerson;
import com.konfigthis.client.model.UsersList;
import com.konfigthis.client.model.UsersPatch;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private static UsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersApi(apiClient);
    }

    /**
     * Create a User
     *
     * Create a User for a [Person](https://developers.intellihr.io/docs/v1/) that does not already have a User.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        String username = null;
        UsersCreatePerson person = null;
        Boolean isEnabled = null;
        Object permissionGroups = null;
        Users response = api.createUser(username, person)
                .isEnabled(isEnabled)
                .permissionGroups(permissionGroups)
                .execute();
        // TODO: test validations
    }

    /**
     * Find a User by ID
     *
     * Returns a single [User](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findUserByIdTest() throws ApiException {
        Users response = api.findUserById()
                .execute();
        // TODO: test validations
    }

    /**
     * List all Users
     *
     * Returns a list of all [Users](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllUsersTest() throws ApiException {
        UsersList response = api.getAllUsers()
                .execute();
        // TODO: test validations
    }

    /**
     * Patch a User by ID
     *
     * Returns the updated [User](https://developers.intellihr.io/docs/v1/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        Boolean isEnabled = null;
        String username = null;
        Users response = api.updateById()
                .isEnabled(isEnabled)
                .username(username)
                .execute();
        // TODO: test validations
    }

}
