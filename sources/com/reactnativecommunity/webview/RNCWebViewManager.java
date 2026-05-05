package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.scroll.ScrollEventType;
import com.reactnativecommunity.webview.events.SubResourceErrorEvent;
import com.reactnativecommunity.webview.events.TopCustomMenuSelectionEvent;
import com.reactnativecommunity.webview.events.TopHttpErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingFinishEvent;
import com.reactnativecommunity.webview.events.TopLoadingProgressEvent;
import com.reactnativecommunity.webview.events.TopLoadingStartEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import com.reactnativecommunity.webview.events.TopOpenWindowEvent;
import com.reactnativecommunity.webview.events.TopRenderProcessGoneEvent;
import com.reactnativecommunity.webview.events.TopShouldStartLoadWithRequestEvent;
import java.util.Map;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
public class RNCWebViewManager extends ViewGroupManager<RNCWebViewWrapper> {
    private final RNCWebViewManagerImpl mRNCWebViewManagerImpl = new RNCWebViewManagerImpl();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, RNCWebViewWrapper rNCWebViewWrapper) {
        rNCWebViewWrapper.getWebView().setWebViewClient(new RNCWebViewClient());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RNCWebViewWrapper createViewInstance(ThemedReactContext themedReactContext) {
        return this.mRNCWebViewManagerImpl.createViewInstance(themedReactContext);
    }

    public RNCWebViewWrapper createViewInstance(ThemedReactContext themedReactContext, RNCWebView rNCWebView) {
        return this.mRNCWebViewManagerImpl.createViewInstance(themedReactContext, rNCWebView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return this.mRNCWebViewManagerImpl.getCommandsMap();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put(TopLoadingStartEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put(TopLoadingFinishEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put(TopLoadingErrorEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put(SubResourceErrorEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoadingSubResourceError"));
        exportedCustomDirectEventTypeConstants.put(TopMessageEvent.EVENT_NAME, MapBuilder.of("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put(TopLoadingProgressEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put(TopShouldStartLoadWithRequestEvent.EVENT_NAME, MapBuilder.of("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.of("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put(TopHttpErrorEvent.EVENT_NAME, MapBuilder.of("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put(TopRenderProcessGoneEvent.EVENT_NAME, MapBuilder.of("registrationName", "onRenderProcessGone"));
        exportedCustomDirectEventTypeConstants.put(TopCustomMenuSelectionEvent.EVENT_NAME, MapBuilder.of("registrationName", "onCustomMenuSelection"));
        exportedCustomDirectEventTypeConstants.put(TopOpenWindowEvent.EVENT_NAME, MapBuilder.of("registrationName", "onOpenWindow"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNCWebViewManagerImpl.NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(RNCWebViewWrapper rNCWebViewWrapper) {
        super.onAfterUpdateTransaction(rNCWebViewWrapper);
        this.mRNCWebViewManagerImpl.onAfterUpdateTransaction(rNCWebViewWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(RNCWebViewWrapper rNCWebViewWrapper) {
        this.mRNCWebViewManagerImpl.onDropViewInstance(rNCWebViewWrapper);
        super.onDropViewInstance(rNCWebViewWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(RNCWebViewWrapper rNCWebViewWrapper, String str, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.receiveCommand(rNCWebViewWrapper, str, readableArray);
        super.receiveCommand(rNCWebViewWrapper, str, readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[k\t\u0013\u000e\u0017\u0005[\u00173\u0019frn")
    public void setAllowFileAccess(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setAllowFileAccess(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[k\t\u0013\u000e\u0017\u0005[\u00173\u0019frn#\u001d\u0014YmP'\u000eyV05")
    public void setAllowFileAccessFromFileURLs(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setAllowFileAccessFromFileURLs(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[k\t\u0013\u001d\u001c\u0002l;B)bk<@\u000e\n_\u001b--\u0018\u0012JM.\\F\u0011r}")
    public void setAllowUniversalAccessFromFileURLs(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setAllowUniversalAccessFromFileURLs(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[k\t\u0013;s\u000ebBC\u0019sd`K\u0001\u000eP\rV")
    public void setAllowsFullscreenVideo(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setAllowsFullscreenVideo(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002[k\t\u0013;}\u000beJ5\u0019ud_*\u0010\tU\t")
    public void setAllowsProtectedMedia(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setAllowsProtectedMedia(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002]c\f\u000b1\u0012dWO5(UxkB")
    public void setAndroidLayerType(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setAndroidLayerType(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002_o\u0006\u0005+\u000f\r_E>\u0004bl`#\u001a\u0017A\u001bL-i\fiR6")
    public void setApplicationNameForUserAgent(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setApplicationNameForUserAgent(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pr\u0003~\t#\r^\u0019B\u001bediQ\u0014\u0006X")
    public void setBasicAuthCredential(RNCWebViewWrapper rNCWebViewWrapper, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.setBasicAuthCredential(rNCWebViewWrapper, readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004Pb\u0002\u0001\r\u001cyXB5\u001a")
    public void setCacheEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setCacheEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0004Pb\u0002\u0001\u0015\u001d|[")
    public void setCacheMode(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setCacheMode(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005^ll\u00107 y];\u0015$bagB\u000f")
    public void setDomStorageEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setDomStorageEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0005^v\b\b7\u000f|_D7\u0003frn>\u0012\n")
    public void setDownloadingMessage(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setDownloadingMessage(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^q|\u0001\f\u000f\u000ba%>")
    public void setForceDarkOn(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setForceDarkOn(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\bTn\u0006\u000b+\u000f\r_E>zo`]I\u0010\t")
    public void setGeolocationEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setGeolocationEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tPrh\n\u0017\u001e}d-9$enr\"!\nZ\u001c")
    public void setHasOnOpenWindowEvent(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setHasOnOpenWindowEvent(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tPrh\n\u001b\u0011\u000beB<")
    public void setHasOnScroll(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setHasOnScroll(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]b\t\u00036\u0017\re")
    public void setIncognito(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setIncognito(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]i~~<\u0013|@7F\u0017TbmF\u001b\u0019")
    public void setInjectedJavaScript(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setInjectedJavaScript(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]i~~<\u0013|@7F\u0017TbmF\u001b\u0019.\rM*\u001b\nGS0kV-\u001bVY%#U<")
    public void setInjectedJavaScriptBeforeContentLoaded(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setInjectedJavaScriptBeforeContentLoaded(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]i~~<\u0013|@7F\u0017TbmF\u001b\u0019.\rM*\u001b\nGS0kV-\u001bVY%#U<\u0006,E(c7&s\u0010S\u001827>\u0002v")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]i~~<\u0013|@7F\u0017TbmF\u001b\u00192\u0017Y\b\n\u000er*4X^$uxV=")
    public void setInjectedJavaScriptForMainFrameOnly(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setInjectedJavaScriptForMainFrameOnly(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n]i~~<\u0013|@7F\u0017TbmF\u001b\u0019;\nQ \f\u0019")
    public void setInjectedJavaScriptObject(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setInjectedJavaScriptObject(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000bPuzn+ \u0002fJ\u0013\u0017oNkB\u0019{U\u0016K* \u0018EY6f^ \u001bsM%+\\Q")
    public void setJavaScriptCanOpenWindowsAutomatically(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setJavaScriptCanOpenWindowsAutomatically(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000bPuzn+ \u0002fJ\u0015$bagB\u000f")
    public void setJavaScriptEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setJavaScriptEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\rPb\u0005k- \u0006_IC\u001fpmOLn\u0014c\u0016S*\n\tQI5jR&\f")
    public void setLackPermissionToDownloadMessage(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setLackPermissionToDownloadMessage(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTc\u0003|\u0018\u001ayo81\u0019lQ`N \u000e^\rZ\u0010\u001c\nv%%kZ.\u0015")
    public void setMediaPlaybackRequiresUserAction(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setMediaPlaybackRequiresUserAction(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTm\u000fd<\u0013\u0006i")
    public void setMenuCustomItems(RNCWebViewWrapper rNCWebViewWrapper, ReadableArray readableArray) {
        this.mRNCWebViewManagerImpl.setMenuCustomItems(rNCWebViewWrapper, readableArray);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTr\r|/\u0017\u0007]\u001b>\u0017ck`A")
    public void setMessagingEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setMessagingEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eTr\r|/\u0017\u0007]#?\u001avk`+\f\u0012Q")
    public void setMessagingModuleName(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setMessagingModuleName(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXm\u0003\t=\u001b^eDD\tjy`")
    public void setMinimumFontSize(RNCWebViewWrapper rNCWebViewWrapper, int i2) {
        this.mRNCWebViewManagerImpl.setMinimumFontSize(rNCWebViewWrapper, i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000eXw~\u007f\u000b\u001d\u0007j;>*Nn_B")
    public void setMixedContentMode(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setMixedContentMode(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fTr\u000e\u0001,\u0001{hE<\"Fm\\?\u0017\nP")
    public void setNestedScrollEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setNestedScrollEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010ed\fn+ \bbB\u001d%ed")
    public void setOverScrollMode(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setOverScrollMode(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0011Px\u0007\u00016\"j[GE\u001bts@K\f\u0007X\rK")
    public void setPaymentRequestEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setPaymentRequestEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Pu~a7 \u0006:7D\u0017Ehn>\r\u0011Q\f")
    public void setSaveFormDataDisabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setSaveFormDataDisabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014R`\u0006\u0001;}y];$%Gho")
    public void setScalesPageToFit(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setScalesPageToFit(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Ts[\u00111\u001a\r?D*%pl>L\u0019\u0019^\u0017S.")
    public void setSetBuiltInZoomControls(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setSetBuiltInZoomControls(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Ts]\u0005;\u001e\u0005WO*%pl>L\u0019\u0019^\u0017S.")
    public void setSetDisplayZoomControls(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setSetDisplayZoomControls(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Tsl\u00118\u001e\bhJ\u001d+msdM\u0017\nC\u0011U\u001f\u0018\u001cw")
    public void setSetSupportMultipleWindows(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setSetSupportMultipleWindows(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wn\u0011\u000f\u0010\u001d\u000b_P?$u`g0\u000e\u0017[\u0014S\u0004\u0017\tmG#k`1")
    public void setShowsHorizontalScrollIndicator(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setShowsHorizontalScrollIndicator(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014Wn\u0011\u000f\u001e\u0013\u000bj?3\u0017mR^O\u001a\u0011XpU\u001f\u0012\beX1i")
    public void setShowsVerticalScrollIndicator(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setShowsVerticalScrollIndicator(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014^t\f~-")
    public void setSource(RNCWebViewWrapper rNCWebViewWrapper, ReadableMap readableMap) {
        this.mRNCWebViewManagerImpl.setSource(rNCWebViewWrapper, readableMap);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tw\u000eu7\u001d\u0006")
    public void setTextZoom(RNCWebViewWrapper rNCWebViewWrapper, int i2) {
        this.mRNCWebViewManagerImpl.setTextZoom(rNCWebViewWrapper, i2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Wh\f\u007f\u0018\u000f\u000bjO\u0013%pjdB\u001eiZ\tI'\u000e\t")
    public void setThirdPartyCookiesEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setThirdPartyCookiesEnabled(rNCWebViewWrapper, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0016bd\f\\/\u0013\u0007j")
    public void setUserAgent(RNCWebViewWrapper rNCWebViewWrapper, String str) {
        this.mRNCWebViewManagerImpl.setUserAgent(rNCWebViewWrapper, str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0018Ta\u0010\u0005-%\\[8E\u001dhhiDo\u0013M\nS \r")
    public void setWebviewDebuggingEnabled(RNCWebViewWrapper rNCWebViewWrapper, boolean z2) {
        this.mRNCWebViewManagerImpl.setWebviewDebuggingEnabled(rNCWebViewWrapper, z2);
    }
}
