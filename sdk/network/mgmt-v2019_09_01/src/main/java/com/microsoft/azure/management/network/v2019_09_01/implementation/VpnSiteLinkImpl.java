/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.management.network.v2019_09_01.VpnSiteLink;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_09_01.VpnLinkBgpSettings;
import com.microsoft.azure.management.network.v2019_09_01.VpnLinkProviderProperties;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;

class VpnSiteLinkImpl extends IndexableRefreshableWrapperImpl<VpnSiteLink, VpnSiteLinkInner> implements VpnSiteLink {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String vpnSiteName;
    private String vpnSiteLinkName;

    VpnSiteLinkImpl(VpnSiteLinkInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vpnSiteName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnSites");
        this.vpnSiteLinkName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnSiteLinks");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VpnSiteLinkInner> getInnerAsync() {
        VpnSiteLinksInner client = this.manager().inner().vpnSiteLinks();
        return client.getAsync(this.resourceGroupName, this.vpnSiteName, this.vpnSiteLinkName);
    }



    @Override
    public VpnLinkBgpSettings bgpProperties() {
        return this.inner().bgpProperties();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String ipAddress() {
        return this.inner().ipAddress();
    }

    @Override
    public VpnLinkProviderProperties linkProperties() {
        return this.inner().linkProperties();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
