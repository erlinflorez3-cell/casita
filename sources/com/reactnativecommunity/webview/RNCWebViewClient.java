package com.reactnativecommunity.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.SystemClock;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.util.Pair;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.reactnativecommunity.webview.RNCWebView;
import com.reactnativecommunity.webview.RNCWebViewModuleImpl;
import com.reactnativecommunity.webview.events.SubResourceErrorEvent;
import com.reactnativecommunity.webview.events.TopHttpErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingErrorEvent;
import com.reactnativecommunity.webview.events.TopLoadingFinishEvent;
import com.reactnativecommunity.webview.events.TopLoadingStartEvent;
import com.reactnativecommunity.webview.events.TopRenderProcessGoneEvent;
import com.reactnativecommunity.webview.events.TopShouldStartLoadWithRequestEvent;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class RNCWebViewClient extends WebViewClient {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
    private static String TAG = "RNCWebViewClient";
    protected boolean mLastLoadFailed = false;
    protected RNCWebView.ProgressChangedFilter progressChangedFilter = null;
    protected RNCBasicAuthCredential basicAuthCredential = null;

    protected WritableMap createWebViewEvent(WebView webView, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("target", RNCWebViewWrapper.getReactTagFromWebView(webView));
        writableMapCreateMap.putString("url", str);
        writableMapCreateMap.putBoolean("loading", (this.mLastLoadFailed || webView.getProgress() == 100) ? false : true);
        writableMapCreateMap.putString("title", webView.getTitle());
        writableMapCreateMap.putBoolean("canGoBack", webView.canGoBack());
        writableMapCreateMap.putBoolean("canGoForward", webView.canGoForward());
        return writableMapCreateMap;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        super.doUpdateVisitedHistory(webView, str, z2);
        ((RNCWebView) webView).dispatchEvent(webView, new TopLoadingStartEvent(RNCWebViewWrapper.getReactTagFromWebView(webView), createWebViewEvent(webView, str)));
    }

    protected void emitFinishEvent(WebView webView, String str) {
        int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new TopLoadingFinishEvent(reactTagFromWebView, createWebViewEvent(webView, str)));
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (CookieManager.getInstance().getCookie(str) != null) {
            CookieManager.getInstance().flush();
        }
        if (this.mLastLoadFailed) {
            return;
        }
        ((RNCWebView) webView).callInjectedJavaScript();
        emitFinishEvent(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.mLastLoadFailed = false;
        ((RNCWebView) webView).callInjectedJavaScriptBeforeContentLoaded();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        this.mLastLoadFailed = true;
        emitFinishEvent(webView, str2);
        WritableMap writableMapCreateWebViewEvent = createWebViewEvent(webView, str2);
        writableMapCreateWebViewEvent.putDouble("code", i2);
        writableMapCreateWebViewEvent.putString("description", str);
        int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new TopLoadingErrorEvent(reactTagFromWebView, writableMapCreateWebViewEvent));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        RNCBasicAuthCredential rNCBasicAuthCredential = this.basicAuthCredential;
        if (rNCBasicAuthCredential != null) {
            httpAuthHandler.proceed(rNCBasicAuthCredential.username, this.basicAuthCredential.password);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.isForMainFrame()) {
            WritableMap writableMapCreateWebViewEvent = createWebViewEvent(webView, webResourceRequest.getUrl().toString());
            writableMapCreateWebViewEvent.putInt("statusCode", webResourceResponse.getStatusCode());
            writableMapCreateWebViewEvent.putString("description", webResourceResponse.getReasonPhrase());
            int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
            UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new TopHttpErrorEvent(reactTagFromWebView, writableMapCreateWebViewEvent));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url = webView.getUrl();
        String url2 = sslError.getUrl();
        sslErrorHandler.cancel();
        int primaryError = sslError.getPrimaryError();
        String strConcat = "SSL error: ".concat(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid");
        if (url.equalsIgnoreCase(url2)) {
            onReceivedError(webView, primaryError, strConcat, url2);
            return;
        }
        String str = TAG;
        String str2 = "Resource blocked from loading due to SSL error. Blocked URL: " + url2;
        onReceivedSubResourceSslError(webView, primaryError, strConcat, url2);
    }

    public void onReceivedSubResourceSslError(WebView webView, int i2, String str, String str2) {
        WritableMap writableMapCreateWebViewEvent = createWebViewEvent(webView, str2);
        writableMapCreateWebViewEvent.putDouble("code", i2);
        writableMapCreateWebViewEvent.putString("description", str);
        int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new SubResourceErrorEvent(reactTagFromWebView, writableMapCreateWebViewEvent));
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (renderProcessGoneDetail.didCrash()) {
            String str = TAG;
        } else {
            String str2 = TAG;
        }
        if (webView == null) {
            return true;
        }
        WritableMap writableMapCreateWebViewEvent = createWebViewEvent(webView, webView.getUrl());
        writableMapCreateWebViewEvent.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
        int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
        UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new TopRenderProcessGoneEvent(reactTagFromWebView, writableMapCreateWebViewEvent));
        return true;
    }

    public void setBasicAuthCredential(RNCBasicAuthCredential rNCBasicAuthCredential) {
        this.basicAuthCredential = rNCBasicAuthCredential;
    }

    public void setProgressChangedFilter(RNCWebView.ProgressChangedFilter progressChangedFilter) {
        this.progressChangedFilter = progressChangedFilter;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        RNCWebView rNCWebView = (RNCWebView) webView;
        if (rNCWebView.getReactApplicationContext().getJavaScriptContextHolder().get() == 0 || rNCWebView.mMessagingJSModule == null) {
            FLog.w(TAG, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.progressChangedFilter.setWaitingForCommandLoadUrl(true);
            int reactTagFromWebView = RNCWebViewWrapper.getReactTagFromWebView(webView);
            UIManagerHelper.getEventDispatcherForReactTag((ReactContext) webView.getContext(), reactTagFromWebView).dispatchEvent(new TopShouldStartLoadWithRequestEvent(reactTagFromWebView, createWebViewEvent(webView, str)));
            return true;
        }
        Pair<Double, AtomicReference<RNCWebViewModuleImpl.ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState>> newLock = RNCWebViewModuleImpl.shouldOverrideUrlLoadingLock.getNewLock();
        double dDoubleValue = newLock.first.doubleValue();
        AtomicReference<RNCWebViewModuleImpl.ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState> atomicReference = newLock.second;
        WritableMap writableMapCreateWebViewEvent = createWebViewEvent(webView, str);
        writableMapCreateWebViewEvent.putDouble("lockIdentifier", dDoubleValue);
        rNCWebView.dispatchDirectShouldStartLoadWithRequest(writableMapCreateWebViewEvent);
        try {
            synchronized (atomicReference) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                while (atomicReference.get() == RNCWebViewModuleImpl.ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState.UNDECIDED) {
                    if (SystemClock.elapsedRealtime() - jElapsedRealtime > 250) {
                        FLog.w(TAG, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                        RNCWebViewModuleImpl.shouldOverrideUrlLoadingLock.removeLock(Double.valueOf(dDoubleValue));
                        return false;
                    }
                    atomicReference.wait(250L);
                }
                boolean z2 = atomicReference.get() == RNCWebViewModuleImpl.ShouldOverrideUrlLoadingLock.ShouldOverrideCallbackState.SHOULD_OVERRIDE;
                RNCWebViewModuleImpl.shouldOverrideUrlLoadingLock.removeLock(Double.valueOf(dDoubleValue));
                return z2;
            }
        } catch (InterruptedException e2) {
            FLog.e(TAG, "shouldOverrideUrlLoading was interrupted while waiting for result.", e2);
            RNCWebViewModuleImpl.shouldOverrideUrlLoadingLock.removeLock(Double.valueOf(dDoubleValue));
            return false;
        }
    }
}
