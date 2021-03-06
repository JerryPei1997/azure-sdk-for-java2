/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import rx.Observable;

/**
 * Type representing Subscriptions.
 */
public interface Subscriptions {
    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SubscriptionQuotasListResult> listQuotasAsync(String location);

}
