package com.reactnativecommunity.webview;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.google.firebase.messaging.Constants;
import com.reactnativecommunity.webview.events.TopCustomMenuSelectionEvent;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class RNCWebView extends WebView implements LifecycleEventListener {
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected WebViewCompat.WebMessageListener bridgeListener;
    protected RNCWebViewBridge fallbackBridge;
    protected boolean hasScrollEvent;
    protected String injectedJS;
    protected String injectedJSBeforeContentLoaded;
    protected boolean injectedJavaScriptBeforeContentLoadedForMainFrameOnly;
    protected boolean injectedJavaScriptForMainFrameOnly;
    protected String injectedJavaScriptObject;
    protected RNCWebViewMessagingModule mMessagingJSModule;
    private OnScrollDispatchHelper mOnScrollDispatchHelper;
    protected RNCWebViewClient mRNCWebViewClient;
    WebChromeClient mWebChromeClient;
    protected List<Map<String, String>> menuCustomItems;
    protected boolean messagingEnabled;
    protected String messagingModuleName;
    protected boolean nestedScrollEnabled;
    protected ProgressChangedFilter progressChangedFilter;
    protected boolean sendContentSizeChangeEvents;

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$1 */
    class AnonymousClass1 extends ActionMode.Callback2 {
        final /* synthetic */ ActionMode.Callback val$callback;

        /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$1$1 */
        class C02591 implements ValueCallback<String> {
            final /* synthetic */ MenuItem val$item;
            final /* synthetic */ ActionMode val$mode;
            final /* synthetic */ WritableMap val$wMap;

            C02591(MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
                menuItem = menuItem;
                writableMap = writableMap;
                actionMode = actionMode;
            }

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                String string;
                Map<String, String> map = RNCWebView.this.menuCustomItems.get(menuItem.getItemId());
                writableMap.putString(Constants.ScionAnalytics.PARAM_LABEL, map.get(Constants.ScionAnalytics.PARAM_LABEL));
                writableMap.putString("key", map.get("key"));
                try {
                    string = new JSONObject(str).getString("selection");
                } catch (JSONException unused) {
                    string = "";
                }
                writableMap.putString("selectedText", string);
                RNCWebView.this.dispatchEvent(RNCWebView.this, new TopCustomMenuSelectionEvent(RNCWebViewWrapper.getReactTagFromWebView(RNCWebView.this), writableMap));
                actionMode.finish();
            }
        }

        AnonymousClass1(ActionMode.Callback callback) {
            callback = callback;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            RNCWebView.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new ValueCallback<String>() { // from class: com.reactnativecommunity.webview.RNCWebView.1.1
                final /* synthetic */ MenuItem val$item;
                final /* synthetic */ ActionMode val$mode;
                final /* synthetic */ WritableMap val$wMap;

                C02591(MenuItem menuItem2, WritableMap writableMap, ActionMode actionMode2) {
                    menuItem = menuItem2;
                    writableMap = writableMap;
                    actionMode = actionMode2;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    String string;
                    Map<String, String> map = RNCWebView.this.menuCustomItems.get(menuItem.getItemId());
                    writableMap.putString(Constants.ScionAnalytics.PARAM_LABEL, map.get(Constants.ScionAnalytics.PARAM_LABEL));
                    writableMap.putString("key", map.get("key"));
                    try {
                        string = new JSONObject(str).getString("selection");
                    } catch (JSONException unused) {
                        string = "";
                    }
                    writableMap.putString("selectedText", string);
                    RNCWebView.this.dispatchEvent(RNCWebView.this, new TopCustomMenuSelectionEvent(RNCWebViewWrapper.getReactTagFromWebView(RNCWebView.this), writableMap));
                    actionMode.finish();
                }
            });
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            for (int i2 = 0; i2 < RNCWebView.this.menuCustomItems.size(); i2++) {
                menu.add(0, i2, i2, RNCWebView.this.menuCustomItems.get(i2).get(Constants.ScionAnalytics.PARAM_LABEL));
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback2
        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            ActionMode.Callback callback = callback;
            if (callback instanceof ActionMode.Callback2) {
                ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
            } else {
                super.onGetContentRect(actionMode, view, rect);
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$2 */
    class AnonymousClass2 implements WebViewCompat.WebMessageListener {
        AnonymousClass2() {
        }

        @Override // androidx.webkit.WebViewCompat.WebMessageListener
        public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) {
            RNCWebView.this.onMessage(webMessageCompat.getData(), uri.toString());
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$3 */
    class AnonymousClass3 implements Runnable {
        final /* synthetic */ String val$message;
        final /* synthetic */ String val$sourceUrl;
        final /* synthetic */ WebView val$webView;

        AnonymousClass3(WebView webView, String str, String str2) {
            webView = webView;
            str = str;
            str = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RNCWebView.this.mRNCWebViewClient == null) {
                return;
            }
            WritableMap writableMapCreateWebViewEvent = RNCWebView.this.mRNCWebViewClient.createWebViewEvent(webView, str);
            writableMapCreateWebViewEvent.putString("data", str);
            if (RNCWebView.this.mMessagingJSModule != null) {
                RNCWebView.this.dispatchDirectMessage(writableMapCreateWebViewEvent);
            } else {
                RNCWebView.this.dispatchEvent(webView, new TopMessageEvent(RNCWebViewWrapper.getReactTagFromWebView(webView), writableMapCreateWebViewEvent));
            }
        }
    }

    protected static class ProgressChangedFilter {
        private boolean waitingForCommandLoadUrl = false;

        protected ProgressChangedFilter() {
        }

        public boolean isWaitingForCommandLoadUrl() {
            return this.waitingForCommandLoadUrl;
        }

        public void setWaitingForCommandLoadUrl(boolean z2) {
            this.waitingForCommandLoadUrl = z2;
        }
    }

    protected class RNCWebViewBridge {
        private String TAG = "RNCWebViewBridge";
        RNCWebView mWebView;

        RNCWebViewBridge(RNCWebView rNCWebView) {
            this.mWebView = rNCWebView;
        }

        public /* synthetic */ void lambda$postMessage$0(String str) {
            RNCWebView rNCWebView = this.mWebView;
            rNCWebView.onMessage(str, rNCWebView.getUrl());
        }

        @JavascriptInterface
        public void postMessage(final String str) {
            if (this.mWebView.getMessagingEnabled()) {
                this.mWebView.post(new Runnable() { // from class: com.reactnativecommunity.webview.RNCWebView$RNCWebViewBridge$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$postMessage$0(str);
                    }
                });
            } else {
                FLog.w(this.TAG, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView.");
            }
        }
    }

    public RNCWebView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.bridgeListener = null;
        this.injectedJavaScriptForMainFrameOnly = true;
        this.injectedJavaScriptBeforeContentLoadedForMainFrameOnly = true;
        this.messagingEnabled = false;
        this.sendContentSizeChangeEvents = false;
        this.hasScrollEvent = false;
        this.nestedScrollEnabled = false;
        this.injectedJavaScriptObject = null;
        this.mMessagingJSModule = (RNCWebViewMessagingModule) ((ThemedReactContext) getContext()).getReactApplicationContext().getJSModule(RNCWebViewMessagingModule.class);
        this.progressChangedFilter = new ProgressChangedFilter();
    }

    private void injectJavascriptObject() {
        if (getSettings().getJavaScriptEnabled()) {
            evaluateJavascriptWithFallback("(function(){\n    window.ReactNativeWebView = window.ReactNativeWebView || {};\n    window.ReactNativeWebView.injectedObjectJson = function () { return " + (this.injectedJavaScriptObject == null ? null : "`" + this.injectedJavaScriptObject + "`") + "; };\n})();");
        }
    }

    public void callInjectedJavaScript() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.injectedJS) == null || TextUtils.isEmpty(str)) {
            return;
        }
        evaluateJavascriptWithFallback("(function() {\n" + this.injectedJS + ";\n})();");
        injectJavascriptObject();
    }

    public void callInjectedJavaScriptBeforeContentLoaded() {
        String str;
        if (!getSettings().getJavaScriptEnabled() || (str = this.injectedJSBeforeContentLoaded) == null || TextUtils.isEmpty(str)) {
            return;
        }
        evaluateJavascriptWithFallback("(function() {\n" + this.injectedJSBeforeContentLoaded + ";\n})();");
        injectJavascriptObject();
    }

    protected void cleanupCallbacksAndDestroy() {
        setWebViewClient(null);
        destroy();
    }

    protected void createRNCWebViewBridge(RNCWebView rNCWebView) {
        if (WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            if (this.bridgeListener == null) {
                this.bridgeListener = new WebViewCompat.WebMessageListener() { // from class: com.reactnativecommunity.webview.RNCWebView.2
                    AnonymousClass2() {
                    }

                    @Override // androidx.webkit.WebViewCompat.WebMessageListener
                    public void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) {
                        RNCWebView.this.onMessage(webMessageCompat.getData(), uri.toString());
                    }
                };
                WebViewCompat.addWebMessageListener(rNCWebView, JAVASCRIPT_INTERFACE, RNCWebView$$ExternalSyntheticBackport0.m(new Object[]{ProxyConfig.MATCH_ALL_SCHEMES}), this.bridgeListener);
            }
        } else if (this.fallbackBridge == null) {
            RNCWebViewBridge rNCWebViewBridge = new RNCWebViewBridge(rNCWebView);
            this.fallbackBridge = rNCWebViewBridge;
            addJavascriptInterface(rNCWebViewBridge, JAVASCRIPT_INTERFACE);
        }
        injectJavascriptObject();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebChromeClient webChromeClient = this.mWebChromeClient;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
        super.destroy();
    }

    protected void dispatchDirectMessage(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.messagingModuleName);
        this.mMessagingJSModule.onMessage(writableNativeMap);
    }

    protected boolean dispatchDirectShouldStartLoadWithRequest(WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("nativeEvent", writableMap);
        writableNativeMap.putString("messagingModuleName", this.messagingModuleName);
        this.mMessagingJSModule.onShouldStartLoadWithRequest(writableNativeMap);
        return true;
    }

    protected void dispatchEvent(WebView webView, Event event) {
        UIManagerHelper.getEventDispatcherForReactTag(getThemedReactContext(), RNCWebViewWrapper.getReactTagFromWebView(webView)).dispatchEvent(event);
    }

    protected void evaluateJavascriptWithFallback(String str) {
        evaluateJavascript(str, null);
    }

    public boolean getMessagingEnabled() {
        return this.messagingEnabled;
    }

    public RNCWebViewClient getRNCWebViewClient() {
        return this.mRNCWebViewClient;
    }

    public ReactApplicationContext getReactApplicationContext() {
        return getThemedReactContext().getReactApplicationContext();
    }

    public ThemedReactContext getThemedReactContext() {
        return (ThemedReactContext) getContext();
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.mWebChromeClient;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        cleanupCallbacksAndDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public void onMessage(String str, String str2) {
        getThemedReactContext();
        if (this.mRNCWebViewClient != null) {
            post(new Runnable() { // from class: com.reactnativecommunity.webview.RNCWebView.3
                final /* synthetic */ String val$message;
                final /* synthetic */ String val$sourceUrl;
                final /* synthetic */ WebView val$webView;

                AnonymousClass3(WebView this, String str22, String str3) {
                    webView = this;
                    str = str22;
                    str = str3;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RNCWebView.this.mRNCWebViewClient == null) {
                        return;
                    }
                    WritableMap writableMapCreateWebViewEvent = RNCWebView.this.mRNCWebViewClient.createWebViewEvent(webView, str);
                    writableMapCreateWebViewEvent.putString("data", str);
                    if (RNCWebView.this.mMessagingJSModule != null) {
                        RNCWebView.this.dispatchDirectMessage(writableMapCreateWebViewEvent);
                    } else {
                        RNCWebView.this.dispatchEvent(webView, new TopMessageEvent(RNCWebViewWrapper.getReactTagFromWebView(webView), writableMapCreateWebViewEvent));
                    }
                }
            });
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("data", str3);
        if (this.mMessagingJSModule != null) {
            dispatchDirectMessage(writableMapCreateMap);
        } else {
            dispatchEvent(this, new TopMessageEvent(RNCWebViewWrapper.getReactTagFromWebView(this), writableMapCreateMap));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (this.hasScrollEvent) {
            if (this.mOnScrollDispatchHelper == null) {
                this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
            }
            if (this.mOnScrollDispatchHelper.onScrollChanged(i2, i3)) {
                dispatchEvent(this, ScrollEvent.obtain(RNCWebViewWrapper.getReactTagFromWebView(this), ScrollEventType.SCROLL, i2, i3, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.sendContentSizeChangeEvents) {
            dispatchEvent(this, new ContentSizeChangeEvent(RNCWebViewWrapper.getReactTagFromWebView(this), i2, i3));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.nestedScrollEnabled) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasicAuthCredential(RNCBasicAuthCredential rNCBasicAuthCredential) {
        this.mRNCWebViewClient.setBasicAuthCredential(rNCBasicAuthCredential);
    }

    public void setHasScrollEvent(boolean z2) {
        this.hasScrollEvent = z2;
    }

    public void setInjectedJavaScriptObject(String str) {
        this.injectedJavaScriptObject = str;
        injectJavascriptObject();
    }

    public void setMenuCustomItems(List<Map<String, String>> list) {
        this.menuCustomItems = list;
    }

    public void setMessagingEnabled(boolean z2) {
        if (this.messagingEnabled == z2) {
            return;
        }
        this.messagingEnabled = z2;
        if (z2) {
            createRNCWebViewBridge(this);
        }
    }

    public void setNestedScrollEnabled(boolean z2) {
        this.nestedScrollEnabled = z2;
    }

    public void setSendContentSizeChangeEvents(boolean z2) {
        this.sendContentSizeChangeEvents = z2;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.mWebChromeClient = webChromeClient;
        super.setWebChromeClient(webChromeClient);
        if (webChromeClient instanceof RNCWebChromeClient) {
            ((RNCWebChromeClient) webChromeClient).setProgressChangedFilter(this.progressChangedFilter);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof RNCWebViewClient) {
            RNCWebViewClient rNCWebViewClient = (RNCWebViewClient) webViewClient;
            this.mRNCWebViewClient = rNCWebViewClient;
            rNCWebViewClient.setProgressChangedFilter(this.progressChangedFilter);
        }
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i2) {
        return this.menuCustomItems == null ? super.startActionMode(callback, i2) : super.startActionMode(new ActionMode.Callback2() { // from class: com.reactnativecommunity.webview.RNCWebView.1
            final /* synthetic */ ActionMode.Callback val$callback;

            /* JADX INFO: renamed from: com.reactnativecommunity.webview.RNCWebView$1$1 */
            class C02591 implements ValueCallback<String> {
                final /* synthetic */ MenuItem val$item;
                final /* synthetic */ ActionMode val$mode;
                final /* synthetic */ WritableMap val$wMap;

                C02591(MenuItem menuItem2, WritableMap writableMap, ActionMode actionMode2) {
                    menuItem = menuItem2;
                    writableMap = writableMap;
                    actionMode = actionMode2;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    String string;
                    Map<String, String> map = RNCWebView.this.menuCustomItems.get(menuItem.getItemId());
                    writableMap.putString(Constants.ScionAnalytics.PARAM_LABEL, map.get(Constants.ScionAnalytics.PARAM_LABEL));
                    writableMap.putString("key", map.get("key"));
                    try {
                        string = new JSONObject(str).getString("selection");
                    } catch (JSONException unused) {
                        string = "";
                    }
                    writableMap.putString("selectedText", string);
                    RNCWebView.this.dispatchEvent(RNCWebView.this, new TopCustomMenuSelectionEvent(RNCWebViewWrapper.getReactTagFromWebView(RNCWebView.this), writableMap));
                    actionMode.finish();
                }
            }

            AnonymousClass1(ActionMode.Callback callback2) {
                callback = callback2;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode2, MenuItem menuItem2) {
                RNCWebView.this.evaluateJavascript("(function(){return {selection: window.getSelection().toString()} })()", new ValueCallback<String>() { // from class: com.reactnativecommunity.webview.RNCWebView.1.1
                    final /* synthetic */ MenuItem val$item;
                    final /* synthetic */ ActionMode val$mode;
                    final /* synthetic */ WritableMap val$wMap;

                    C02591(MenuItem menuItem22, WritableMap writableMap, ActionMode actionMode22) {
                        menuItem = menuItem22;
                        writableMap = writableMap;
                        actionMode = actionMode22;
                    }

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str) {
                        String string;
                        Map<String, String> map = RNCWebView.this.menuCustomItems.get(menuItem.getItemId());
                        writableMap.putString(Constants.ScionAnalytics.PARAM_LABEL, map.get(Constants.ScionAnalytics.PARAM_LABEL));
                        writableMap.putString("key", map.get("key"));
                        try {
                            string = new JSONObject(str).getString("selection");
                        } catch (JSONException unused) {
                            string = "";
                        }
                        writableMap.putString("selectedText", string);
                        RNCWebView.this.dispatchEvent(RNCWebView.this, new TopCustomMenuSelectionEvent(RNCWebViewWrapper.getReactTagFromWebView(RNCWebView.this), writableMap));
                        actionMode.finish();
                    }
                });
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                for (int i22 = 0; i22 < RNCWebView.this.menuCustomItems.size(); i22++) {
                    menu.add(0, i22, i22, RNCWebView.this.menuCustomItems.get(i22).get(Constants.ScionAnalytics.PARAM_LABEL));
                }
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback2
            public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
                ActionMode.Callback callback2 = callback;
                if (callback2 instanceof ActionMode.Callback2) {
                    ((ActionMode.Callback2) callback2).onGetContentRect(actionMode, view, rect);
                } else {
                    super.onGetContentRect(actionMode, view, rect);
                }
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        }, i2);
    }
}
