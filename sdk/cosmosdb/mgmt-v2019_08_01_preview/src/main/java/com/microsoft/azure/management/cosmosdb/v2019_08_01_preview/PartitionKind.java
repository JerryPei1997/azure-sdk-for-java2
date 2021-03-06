/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PartitionKind.
 */
public final class PartitionKind extends ExpandableStringEnum<PartitionKind> {
    /** Static value Hash for PartitionKind. */
    public static final PartitionKind HASH = fromString("Hash");

    /** Static value Range for PartitionKind. */
    public static final PartitionKind RANGE = fromString("Range");

    /**
     * Creates or finds a PartitionKind from its string representation.
     * @param name a name to look for
     * @return the corresponding PartitionKind
     */
    @JsonCreator
    public static PartitionKind fromString(String name) {
        return fromString(name, PartitionKind.class);
    }

    /**
     * @return known PartitionKind values
     */
    public static Collection<PartitionKind> values() {
        return values(PartitionKind.class);
    }
}
