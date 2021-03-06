/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.SchemaContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;

/**
 * Type representing SchemaContract.
 */
public interface SchemaContract extends HasInner<SchemaContractInner>, Indexable, Refreshable<SchemaContract>, Updatable<SchemaContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the contentType value.
     */
    String contentType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the value value.
     */
    String value();

    /**
     * The entirety of the SchemaContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApi, DefinitionStages.WithIfMatch, DefinitionStages.WithContentType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SchemaContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SchemaContract definition.
         */
        interface Blank extends WithApi {
        }

        /**
         * The stage of the schemacontract definition allowing to specify Api.
         */
        interface WithApi {
           /**
            * Specifies resourceGroupName, serviceName, apiId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number
            * @return the next definition stage
            */
            WithIfMatch withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the schemacontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithContentType withIfMatch(String ifMatch);
        }

        /**
         * The stage of the schemacontract definition allowing to specify ContentType.
         */
        interface WithContentType {
           /**
            * Specifies contentType.
            * @param contentType Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml)
            * @return the next definition stage
            */
            WithCreate withContentType(String contentType);
        }

        /**
         * The stage of the schemacontract definition allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             * @param value Json escaped string defining the document representing the Schema
             * @return the next definition stage
             */
            WithCreate withValue(String value);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SchemaContract>, DefinitionStages.WithValue {
        }
    }
    /**
     * The template for a SchemaContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SchemaContract>, UpdateStages.WithIfMatch, UpdateStages.WithValue {
    }

    /**
     * Grouping of SchemaContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the schemacontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the schemacontract update allowing to specify Value.
         */
        interface WithValue {
            /**
             * Specifies value.
             * @param value Json escaped string defining the document representing the Schema
             * @return the next update stage
             */
            Update withValue(String value);
        }

    }
}
