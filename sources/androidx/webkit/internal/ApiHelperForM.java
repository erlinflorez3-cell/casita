package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForM {
    private ApiHelperForM() {
    }

    public static void postMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void close(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$1 */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {
        AnonymousClass1() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            webMessageCallbackCompat.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
        }
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.1
            AnonymousClass1() {
            }

            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                webMessageCallbackCompat.onMessage(new WebMessagePortImpl(webMessagePort2), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        });
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$2 */
    class AnonymousClass2 extends WebMessagePort.WebMessageCallback {
        AnonymousClass2() {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            webMessageCallbackCompat.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
        }
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat, Handler handler) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.2
            AnonymousClass2() {
            }

            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                webMessageCallbackCompat.onMessage(new WebMessagePortImpl(webMessagePort2), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        }, handler);
    }

    public static WebMessage createWebMessage(WebMessageCompat webMessageCompat) {
        return new WebMessage(webMessageCompat.getData(), WebMessagePortImpl.compatToPorts(webMessageCompat.getPorts()));
    }

    public static WebMessageCompat createWebMessageCompat(WebMessage webMessage) {
        return new WebMessageCompat(webMessage.getData(), WebMessagePortImpl.portsToCompat(webMessage.getPorts()));
    }

    public static int getErrorCode(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static CharSequence getDescription(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static void setOffscreenPreRaster(WebSettings webSettings, boolean z2) {
        webSettings.setOffscreenPreRaster(z2);
    }

    public static boolean getOffscreenPreRaster(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$3 */
    class AnonymousClass3 extends WebView.VisualStateCallback {
        AnonymousClass3() {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j2) {
            visualStateCallback.onComplete(j2);
        }
    }

    public static void postVisualStateCallback(WebView webView, long j2, WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j2, new WebView.VisualStateCallback() { // from class: androidx.webkit.internal.ApiHelperForM.3
            AnonymousClass3() {
            }

            @Override // android.webkit.WebView.VisualStateCallback
            public void onComplete(long j22) {
                visualStateCallback.onComplete(j22);
            }
        });
    }

    public static void postWebMessage(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static WebMessagePort[] createWebMessageChannel(WebView webView) {
        return webView.createWebMessageChannel();
    }
}
