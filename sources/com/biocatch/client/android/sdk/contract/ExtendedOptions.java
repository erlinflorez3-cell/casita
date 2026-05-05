package com.biocatch.client.android.sdk.contract;

import com.biocatch.client.android.sdk.contract.http.ICustomHttpClientFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
public class ExtendedOptions {
    private BCAgentType agentType;
    private ICustomHttpClientFactory customHttpClientFactory;
    private List<BCCollectorID> disabledCollectors;
    private List<String> elementValuesDisableMaskingList;
    private List<String> elementValuesMaskingList;
    private boolean enableAutoContext;
    private boolean enableCoordinatesMasking;
    private boolean enableElementValuesMasking;
    private boolean enableGlobalTouchCollectionMode;
    private boolean enableHybridSolution;
    private boolean enableWupMessagesHashing;
    private List<BCConsentType> explicitRequiredConsents;
    private List<String> externalModulesList;
    private boolean isAppUsingRengwuxianLibraryCustomComponents;
    private BCProtocolType protocolType;
    private List<Integer> restrictedViewGroupList;

    public ExtendedOptions() {
        setEnableHybridSolution(false);
        setEnableCoordinatesMasking(false);
        setCustomHttpClientFactory(null);
        setEnableAutoContext(false);
        setEnableGlobalTouchCollectionMode(true);
        setEnableElementValuesMasking(false);
        setIsAppUsingRengwuxianLibraryCustomComponents(false);
        setEnableWupMessagesHashing(false);
        setAgentType(BCAgentType.PRIMARY);
        setProtocolType(BCProtocolType.V3);
        setExplicitRequiredConsents(new ArrayList());
    }

    public BCAgentType getAgentType() {
        return this.agentType;
    }

    public ICustomHttpClientFactory getCustomHttpClientFactory() {
        return this.customHttpClientFactory;
    }

    public List<BCCollectorID> getDisabledCollectors() {
        return this.disabledCollectors;
    }

    public List<String> getElementValuesDisableMaskingList() {
        return this.elementValuesDisableMaskingList;
    }

    public List<String> getElementValuesMaskingList() {
        return this.elementValuesMaskingList;
    }

    public boolean getEnableAutoContext() {
        return this.enableAutoContext;
    }

    public boolean getEnableCoordinatesMasking() {
        return this.enableCoordinatesMasking;
    }

    public boolean getEnableElementValuesMasking() {
        return this.enableElementValuesMasking;
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006'Ay&^Q9(m\\PwC\u0002Q\u0003LS[$\u0003@A\b\u001ftv+Y\n\u0015\u001d\t\u0014\u000bJ\u0011K:5==4[/\u001eb(z\u0001#\n+S\u001eek*\u0019\u0010\u0007")
    @InterfaceC1492Gx
    public boolean getEnableGlobalTouchCollectionMode() {
        return this.enableGlobalTouchCollectionMode;
    }

    public boolean getEnableHybridSolution() {
        return this.enableHybridSolution;
    }

    public boolean getEnableWupMessagesHashing() {
        return this.enableWupMessagesHashing;
    }

    public List<BCConsentType> getExplicitRequiredConsents() {
        return this.explicitRequiredConsents;
    }

    public List<String> getExternalModulesList() {
        return this.externalModulesList;
    }

    public boolean getIsAppUsingRengwuxianLibraryCustomComponents() {
        return this.isAppUsingRengwuxianLibraryCustomComponents;
    }

    public BCProtocolType getProtocolType() {
        return this.protocolType;
    }

    public List<Integer> getRestrictedViewGroupList() {
        return this.restrictedViewGroupList;
    }

    public void setAgentType(BCAgentType bCAgentType) {
        this.agentType = bCAgentType;
    }

    public void setCustomHttpClientFactory(ICustomHttpClientFactory iCustomHttpClientFactory) {
        this.customHttpClientFactory = iCustomHttpClientFactory;
    }

    public void setDisabledCollectors(List<BCCollectorID> list) {
        this.disabledCollectors = list;
    }

    public void setElementValuesDisableMaskingList(List<String> list) {
        this.elementValuesDisableMaskingList = list;
    }

    public void setElementValuesMaskingList(List<String> list) {
        this.elementValuesMaskingList = list;
    }

    public void setEnableAutoContext(boolean z2) {
        this.enableAutoContext = z2;
    }

    public void setEnableCoordinatesMasking(boolean z2) {
        this.enableCoordinatesMasking = z2;
    }

    public void setEnableElementValuesMasking(boolean z2) {
        this.enableElementValuesMasking = z2;
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006'Ay&^Q9(m\\PwC\u0002Q\u0003LS[$\u0003@A\b\u001ftv+Y\n\u0015\u001d\t\u0014\u000bJ\u0011K:5==4[/\u001eb(z\u0001#\n+S\u001eek*\u0019\u0010\u0007")
    @InterfaceC1492Gx
    public void setEnableGlobalTouchCollectionMode(boolean z2) {
        this.enableGlobalTouchCollectionMode = z2;
    }

    public void setEnableHybridSolution(boolean z2) {
        this.enableHybridSolution = z2;
    }

    public void setEnableWupMessagesHashing(boolean z2) {
        this.enableWupMessagesHashing = z2;
    }

    public void setExplicitRequiredConsents(List<BCConsentType> list) {
        this.explicitRequiredConsents = list;
    }

    public void setExternalModulesList(List<String> list) {
        this.externalModulesList = list;
    }

    public void setIsAppUsingRengwuxianLibraryCustomComponents(boolean z2) {
        this.isAppUsingRengwuxianLibraryCustomComponents = z2;
    }

    public void setProtocolType(BCProtocolType bCProtocolType) {
        this.protocolType = bCProtocolType;
    }

    public void setRestrictedViewGroupList(List<Integer> list) {
        this.restrictedViewGroupList = list;
    }
}
