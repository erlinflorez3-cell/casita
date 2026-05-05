package io.cobrowse;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class WebViewTrackerManager {
    private final HashMap<Activity, Set<WebView>> activityWebViewMap = new HashMap<>();
    private final WeakHashMap<WebView, WebViewCustomClient> customClients = new WeakHashMap<>();
    private final boolean isWebViewRedactionEnabled;

    WebViewTrackerManager() {
        boolean zIsFeatureSupported = WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT");
        this.isWebViewRedactionEnabled = zIsFeatureSupported;
        if (zIsFeatureSupported) {
        }
    }

    private void ensureWebViewClient(WebView webView) {
        WebViewClient webViewClient = getWebViewClient(webView);
        if (webViewClient instanceof WebViewClientProxy) {
            return;
        }
        webView.setWebViewClient(wrapWebViewClient(webView, webViewClient));
    }

    private void findWebViewsRecursively(ViewGroup viewGroup, HashSet<WebView> hashSet) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof WebView) {
                hashSet.add((WebView) childAt);
            } else if (childAt instanceof ViewGroup) {
                findWebViewsRecursively((ViewGroup) childAt, hashSet);
            }
        }
    }

    private WebViewClient getWebViewClient(WebView webView) {
        if (WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT")) {
            return WebViewCompat.getWebViewClient(webView);
        }
        return null;
    }

    private Set<View> processViewsForWebView(WebView webView, boolean z2) {
        WebViewClient webViewClient = getWebViewClient(webView);
        if (webViewClient instanceof WebViewClientProxy) {
            return ((WebViewClientProxy) webViewClient).redactedViews();
        }
        ensureWebViewClient(webView);
        return z2 ? new HashSet() : processViewsForWebView(webView, true);
    }

    private void resetWebViewsForActivity(Activity activity) {
        HashSet<WebView> hashSet = new HashSet<>();
        findWebViewsRecursively((ViewGroup) activity.getWindow().getDecorView(), hashSet);
        if (this.activityWebViewMap.containsKey(activity)) {
            hashSet.addAll((Collection) Objects.requireNonNull(this.activityWebViewMap.get(activity)));
        }
        Iterator<WebView> it = hashSet.iterator();
        while (it.hasNext()) {
            untrackWebView(it.next());
        }
    }

    private void trackActivity(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        HashSet<WebView> hashSet = new HashSet<>();
        findWebViewsRecursively(viewGroup, hashSet);
        Iterator<WebView> it = hashSet.iterator();
        while (it.hasNext()) {
            ensureWebViewClient(it.next());
        }
        if (this.activityWebViewMap.containsKey(activity)) {
            for (WebView webView : (Set) Objects.requireNonNull(this.activityWebViewMap.get(activity))) {
                if (!hashSet.contains(webView)) {
                    if (webView.isShown()) {
                        hashSet.add(webView);
                    } else {
                        untrackWebView(webView);
                    }
                }
            }
            this.activityWebViewMap.remove(activity);
        }
        this.activityWebViewMap.put(activity, hashSet);
    }

    private void untrackWebView(WebView webView) {
        WebViewClient webViewClient = getWebViewClient(webView);
        if (webViewClient instanceof WebViewClientProxy) {
            WebViewClientProxy webViewClientProxy = (WebViewClientProxy) webViewClient;
            webViewClientProxy.destroy();
            webView.setWebViewClient(webViewClientProxy.userWebViewClient);
        }
        this.customClients.remove(webView);
    }

    private WebViewClient wrapWebViewClient(WebView webView, WebViewClient webViewClient) {
        WebViewCustomClient webViewCustomClient = new WebViewCustomClient(webView, CobrowseIO.instance().webviewRedactedViews());
        this.customClients.put(webView, webViewCustomClient);
        return new WebViewClientProxy(webViewCustomClient, webViewClient);
    }

    void destroy() {
        Iterator<Activity> it = this.activityWebViewMap.keySet().iterator();
        while (it.hasNext()) {
            resetWebViewsForActivity(it.next());
        }
        this.activityWebViewMap.clear();
    }

    Set<View> getRedactedViewsForActivity(Activity activity) {
        HashSet hashSet = new HashSet();
        trackActivity(activity);
        if (this.activityWebViewMap.containsKey(activity)) {
            for (WebView webView : (Set) Objects.requireNonNull(this.activityWebViewMap.get(activity))) {
                if (this.isWebViewRedactionEnabled) {
                    hashSet.addAll(processViewsForWebView(webView, false));
                } else {
                    hashSet.add(webView);
                }
            }
        }
        return hashSet;
    }

    boolean isSettled() {
        if (this.customClients.isEmpty()) {
            return true;
        }
        Iterator<WebViewCustomClient> it = this.customClients.values().iterator();
        while (it.hasNext()) {
            if (!it.next().isSettled()) {
                return false;
            }
        }
        return true;
    }

    void untrackActivity(Activity activity) {
        resetWebViewsForActivity(activity);
        this.activityWebViewMap.remove(activity);
    }
}
