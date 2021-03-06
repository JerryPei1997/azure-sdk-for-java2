/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update protected item input properties.
 */
public class UpdateReplicationProtectedItemInputProperties {
    /**
     * Target azure VM name given by the user.
     */
    @JsonProperty(value = "recoveryAzureVMName")
    private String recoveryAzureVMName;

    /**
     * Target Azure Vm size.
     */
    @JsonProperty(value = "recoveryAzureVMSize")
    private String recoveryAzureVMSize;

    /**
     * Target Azure Network Id.
     */
    @JsonProperty(value = "selectedRecoveryAzureNetworkId")
    private String selectedRecoveryAzureNetworkId;

    /**
     * The selected source nic Id which will be used as the primary nic during
     * failover.
     */
    @JsonProperty(value = "selectedSourceNicId")
    private String selectedSourceNicId;

    /**
     * The selected option to enable RDP\SSH on target vm after failover.
     * String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     */
    @JsonProperty(value = "enableRdpOnTargetOption")
    private String enableRdpOnTargetOption;

    /**
     * The list of vm nic details.
     */
    @JsonProperty(value = "vmNics")
    private List<VMNicInputDetails> vmNics;

    /**
     * License type. Possible values include: 'NotSpecified', 'NoLicenseType',
     * 'WindowsServer'.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /**
     * The target availability set id.
     */
    @JsonProperty(value = "recoveryAvailabilitySetId")
    private String recoveryAvailabilitySetId;

    /**
     * The provider specific input to update replication protected item.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private UpdateReplicationProtectedItemProviderInput providerSpecificDetails;

    /**
     * Get target azure VM name given by the user.
     *
     * @return the recoveryAzureVMName value
     */
    public String recoveryAzureVMName() {
        return this.recoveryAzureVMName;
    }

    /**
     * Set target azure VM name given by the user.
     *
     * @param recoveryAzureVMName the recoveryAzureVMName value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withRecoveryAzureVMName(String recoveryAzureVMName) {
        this.recoveryAzureVMName = recoveryAzureVMName;
        return this;
    }

    /**
     * Get target Azure Vm size.
     *
     * @return the recoveryAzureVMSize value
     */
    public String recoveryAzureVMSize() {
        return this.recoveryAzureVMSize;
    }

    /**
     * Set target Azure Vm size.
     *
     * @param recoveryAzureVMSize the recoveryAzureVMSize value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withRecoveryAzureVMSize(String recoveryAzureVMSize) {
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        return this;
    }

    /**
     * Get target Azure Network Id.
     *
     * @return the selectedRecoveryAzureNetworkId value
     */
    public String selectedRecoveryAzureNetworkId() {
        return this.selectedRecoveryAzureNetworkId;
    }

    /**
     * Set target Azure Network Id.
     *
     * @param selectedRecoveryAzureNetworkId the selectedRecoveryAzureNetworkId value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withSelectedRecoveryAzureNetworkId(String selectedRecoveryAzureNetworkId) {
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        return this;
    }

    /**
     * Get the selected source nic Id which will be used as the primary nic during failover.
     *
     * @return the selectedSourceNicId value
     */
    public String selectedSourceNicId() {
        return this.selectedSourceNicId;
    }

    /**
     * Set the selected source nic Id which will be used as the primary nic during failover.
     *
     * @param selectedSourceNicId the selectedSourceNicId value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withSelectedSourceNicId(String selectedSourceNicId) {
        this.selectedSourceNicId = selectedSourceNicId;
        return this;
    }

    /**
     * Get the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @return the enableRdpOnTargetOption value
     */
    public String enableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption;
    }

    /**
     * Set the selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     *
     * @param enableRdpOnTargetOption the enableRdpOnTargetOption value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withEnableRdpOnTargetOption(String enableRdpOnTargetOption) {
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        return this;
    }

    /**
     * Get the list of vm nic details.
     *
     * @return the vmNics value
     */
    public List<VMNicInputDetails> vmNics() {
        return this.vmNics;
    }

    /**
     * Set the list of vm nic details.
     *
     * @param vmNics the vmNics value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withVmNics(List<VMNicInputDetails> vmNics) {
        this.vmNics = vmNics;
        return this;
    }

    /**
     * Get license type. Possible values include: 'NotSpecified', 'NoLicenseType', 'WindowsServer'.
     *
     * @return the licenseType value
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set license type. Possible values include: 'NotSpecified', 'NoLicenseType', 'WindowsServer'.
     *
     * @param licenseType the licenseType value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the target availability set id.
     *
     * @return the recoveryAvailabilitySetId value
     */
    public String recoveryAvailabilitySetId() {
        return this.recoveryAvailabilitySetId;
    }

    /**
     * Set the target availability set id.
     *
     * @param recoveryAvailabilitySetId the recoveryAvailabilitySetId value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withRecoveryAvailabilitySetId(String recoveryAvailabilitySetId) {
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        return this;
    }

    /**
     * Get the provider specific input to update replication protected item.
     *
     * @return the providerSpecificDetails value
     */
    public UpdateReplicationProtectedItemProviderInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the provider specific input to update replication protected item.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the UpdateReplicationProtectedItemInputProperties object itself.
     */
    public UpdateReplicationProtectedItemInputProperties withProviderSpecificDetails(UpdateReplicationProtectedItemProviderInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}
