package androidx.webkit;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForP;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewProviderFactory;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewCompat {
    private static final Uri WILDCARD_URI = Uri.parse(ProxyConfig.MATCH_ALL_SCHEMES);
    private static final Uri EMPTY_URI = Uri.parse("");
    private static boolean sShouldCacheProvider = true;
    private static final WeakHashMap<WebView, WebViewProviderAdapter> sProviderAdapterCache = new WeakHashMap<>();

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalAsyncStartUp {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalCacheProvider {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalSaveState {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrerender {
    }

    public interface VisualStateCallback {
        void onComplete(long j2);
    }

    public interface WebMessageListener {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    public interface WebViewStartUpCallback {
        void onSuccess(WebViewStartUpResult webViewStartUpResult);
    }

    private WebViewCompat() {
    }

    public static void postVisualStateCallback(WebView webView, long j2, VisualStateCallback visualStateCallback) throws Throwable {
        ApiFeature.M m2 = WebViewFeatureInternal.VISUAL_STATE_CALLBACK;
        if (m2.isSupportedByFramework()) {
            ApiHelperForM.postVisualStateCallback(webView, j2, visualStateCallback);
        } else {
            if (m2.isSupportedByWebView()) {
                checkThread(webView);
                getProvider(webView).insertVisualStateCallback(j2, visualStateCallback);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Deprecated
    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.START_SAFE_BROWSING;
        if (o_mr1.isSupportedByFramework()) {
            ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getFactory().getStatics().initSafeBrowsing(context, valueCallback);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setSafeBrowsingAllowlist(Set<String> set, ValueCallback<Boolean> valueCallback) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        ApiFeature.O_MR1 o_mr12 = WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            getFactory().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (o_mr12.isSupportedByFramework()) {
            ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (o_mr12.isSupportedByWebView()) {
                getFactory().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new HashSet(list), valueCallback);
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (o_mr1.isSupportedByFramework()) {
            return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (o_mr1.isSupportedByWebView()) {
            return getFactory().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static PackageInfo getCurrentWebViewPackage(Context context) {
        PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        return currentLoadedWebViewPackage != null ? currentLoadedWebViewPackage : getNotYetLoadedWebViewPackageInfo(context);
    }

    public static PackageInfo getCurrentLoadedWebViewPackage() {
        return ApiHelperForO.getCurrentWebViewPackage();
    }

    private static PackageInfo getLoadedWebViewPackageInfo() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    private static PackageInfo getNotYetLoadedWebViewPackageInfo(Context context) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 16398);
        short sXd2 = (short) (OY.Xd() ^ 30182);
        int[] iArr = new int["Z!P\u0014#JvMc\u001e\u0002U+7zum[\"t\u0005r\u007f\u007fO\u007f-\u0001I2{/\tpU".length()];
        QB qb = new QB("Z!P\u0014#JvMc\u001e\u0002U+7zum[\"t\u0005r\u007f\u007fO\u007f-\u0001I2{/\tpU");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        try {
            String str = (String) Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("'cF`\u001dv^\u0016e.\rK*\"'zi\u0010\u0005\u0003p\b\u0002\u0002aPG{", (short) (OY.Xd() ^ 5134), (short) (OY.Xd() ^ 19053)), new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("=#)PS\u0001Y\u0011\b\u0011\u0014:\u0001\n\u0016jSk@\u0010B\u001b/", (short) (C1607wl.Xd() ^ 23186))).getMethod(EO.Od("e\u0014WP#\u0003d\u001c}|d\u0015qpl\n<", (short) (OY.Xd() ^ 16249)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls = Class.forName(C1561oA.Qd("bncple_(\\gejZbg a]\u001d>NOVKPM4GSEJGS", (short) (ZN.Xd() ^ 6672)));
                Class<?>[] clsArr = new Class[2];
                short sXd3 = (short) (C1580rY.Xd() ^ (-27045));
                short sXd4 = (short) (C1580rY.Xd() ^ (-1742));
                int[] iArr2 = new int["\u001b\u0013)\u0015b\"\u0018& g\u000e0/'-'".length()];
                QB qb2 = new QB("\u001b\u0013)\u0015b\"\u0018& g\u000e0/'-'");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                Method method2 = cls.getMethod(C1561oA.od(":7E 018-2/\u00126-5", (short) (C1499aX.Xd() ^ (-27305))), clsArr);
                try {
                    method2.setAccessible(true);
                    return (PackageInfo) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static WebViewProviderAdapter getProvider(WebView webView) {
        if (WebViewFeatureInternal.CACHE_PROVIDER.isSupportedByWebView() && sShouldCacheProvider) {
            WeakHashMap<WebView, WebViewProviderAdapter> weakHashMap = sProviderAdapterCache;
            WebViewProviderAdapter webViewProviderAdapter = weakHashMap.get(webView);
            if (webViewProviderAdapter != null) {
                return webViewProviderAdapter;
            }
            WebViewProviderAdapter webViewProviderAdapter2 = new WebViewProviderAdapter(createProvider(webView));
            weakHashMap.put(webView, webViewProviderAdapter2);
            return webViewProviderAdapter2;
        }
        return new WebViewProviderAdapter(createProvider(webView));
    }

    public static WebMessagePortCompat[] createWebMessageChannel(WebView webView) throws Throwable {
        ApiFeature.M m2 = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (m2.isSupportedByFramework()) {
            return WebMessagePortImpl.portsToCompat(ApiHelperForM.createWebMessageChannel(webView));
        }
        if (m2.isSupportedByWebView()) {
            checkThread(webView);
            return getProvider(webView).createWebMessageChannel();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void postWebMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri) throws Throwable {
        if (WILDCARD_URI.equals(uri)) {
            uri = EMPTY_URI;
        }
        ApiFeature.M m2 = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (m2.isSupportedByFramework() && webMessageCompat.getType() == 0) {
            ApiHelperForM.postWebMessage(webView, WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else {
            if (m2.isSupportedByWebView() && WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                checkThread(webView);
                getProvider(webView).postWebMessage(webMessageCompat, uri);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void addWebMessageListener(WebView webView, String str, Set<String> set, WebMessageListener webMessageListener) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), webMessageListener);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void removeWebMessageListener(WebView webView, String str) {
        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getProvider(webView).removeWebMessageListener(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static ScriptHandler addDocumentStartJavaScript(WebView webView, String str, Set<String> set) {
        if (WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return getProvider(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]));
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewClient getWebViewClient(WebView webView) throws Throwable {
        ApiFeature.O o2 = WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (o2.isSupportedByFramework()) {
            return ApiHelperForO.getWebViewClient(webView);
        }
        if (o2.isSupportedByWebView()) {
            checkThread(webView);
            return getProvider(webView).getWebViewClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebChromeClient getWebChromeClient(WebView webView) throws Throwable {
        ApiFeature.O o2 = WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (o2.isSupportedByFramework()) {
            return ApiHelperForO.getWebChromeClient(webView);
        }
        if (o2.isSupportedByWebView()) {
            checkThread(webView);
            return getProvider(webView).getWebChromeClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebViewRenderProcess getWebViewRenderProcess(WebView webView) throws Throwable {
        ApiFeature.Q q2 = WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (q2.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcess = ApiHelperForQ.getWebViewRenderProcess(webView);
            if (webViewRenderProcess != null) {
                return WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
            }
            return null;
        }
        if (q2.isSupportedByWebView()) {
            checkThread(webView);
            return getProvider(webView).getWebViewRenderProcess();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewRenderProcessClient(WebView webView, Executor executor, WebViewRenderProcessClient webViewRenderProcessClient) throws Throwable {
        ApiFeature.Q q2 = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q2.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
        } else {
            if (q2.isSupportedByWebView()) {
                checkThread(webView);
                getProvider(webView).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setWebViewRenderProcessClient(WebView webView, WebViewRenderProcessClient webViewRenderProcessClient) throws Throwable {
        ApiFeature.Q q2 = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q2.isSupportedByFramework()) {
            ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
        } else {
            if (q2.isSupportedByWebView()) {
                checkThread(webView);
                getProvider(webView).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
                return;
            }
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static WebViewRenderProcessClient getWebViewRenderProcessClient(WebView webView) throws Throwable {
        ApiFeature.Q q2 = WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q2.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = ApiHelperForQ.getWebViewRenderProcessClient(webView);
            if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof WebViewRenderProcessClientFrameworkAdapter)) {
                return null;
            }
            return ((WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
        }
        if (q2.isSupportedByWebView()) {
            checkThread(webView);
            return getProvider(webView).getWebViewRenderProcessClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return getFactory().getStatics().isMultiProcessEnabled();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static String getVariationsHeader() {
        if (WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return getFactory().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setProfile(WebView webView, String str) {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            getProvider(webView).setProfileWithName(str);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static Profile getProfile(WebView webView) {
        if (WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return getProvider(webView).getProfile();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAudioMuted(WebView webView) {
        if (WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            return getProvider(webView).isAudioMuted();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAudioMuted(WebView webView, boolean z2) {
        if (WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            getProvider(webView).setAudioMuted(z2);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void startUpWebView(final Context context, final WebViewStartUpConfig webViewStartUpConfig, final WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                WebViewCompat.lambda$startUpWebView$3(webViewStartUpConfig, webViewStartUpCallback, context);
            }
        });
    }

    static /* synthetic */ void lambda$startUpWebView$3(WebViewStartUpConfig webViewStartUpConfig, final WebViewStartUpCallback webViewStartUpCallback, Context context) throws Throwable {
        WebViewGlueCommunicator.getWebViewClassLoader();
        if (WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP.isSupportedByWebView()) {
            getFactory().startUpWebView(webViewStartUpConfig, new WebViewStartUpCallback() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda2
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final void onSuccess(WebViewStartUpResult webViewStartUpResult) throws Throwable {
                    WebViewCompat.lambda$startUpWebView$1(webViewStartUpCallback, webViewStartUpResult);
                }
            });
            return;
        }
        if (webViewStartUpConfig.shouldRunUiThreadStartUpTasks()) {
            Class<?> cls = Class.forName(hg.Vd("EQFSOHB\u000b?JHM=EJ\u0003\u0017B@E5GB", (short) (ZN.Xd() ^ 12812), (short) (ZN.Xd() ^ 890)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-14847));
            int[] iArr = new int["`]k7ed_[TQcW\\Z.YW\\L^Y".length()];
            QB qb = new QB("`]k7ed_[TQcW\\Z.YW\\L^Y");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                WebSettings.getDefaultUserAgent((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd2 = (short) (C1607wl.Xd() ^ 16076);
        int[] iArr2 = new int["R`Sb\\WO\u001ahm%DdecYS".length()];
        QB qb2 = new QB("R`Sb\\WO\u001ahm%DdecYS");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr2 = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd3 = (short) (Od.Xd() ^ (-8540));
        int[] iArr3 = new int["\u007f~\u000fh}\u0007\rk\u0010\u0011\u0013\t\u0017".length()];
        QB qb3 = new QB("\u007f~\u000fh}\u0007\rk\u0010\u0011\u0013\t\u0017");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
            i4++;
        }
        Method declaredMethod = cls2.getDeclaredMethod(new String(iArr3, 0, i4), clsArr2);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr2));
            Runnable runnable = new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    webViewStartUpCallback.onSuccess(new WebViewCompat.NullReturningWebViewStartUpResult());
                }
            };
            Class<?> cls3 = Class.forName(Xg.qd("N\\Sb`[W\"di%@Zh_hbp", (short) (OY.Xd() ^ 6358), (short) (OY.Xd() ^ 23204)));
            Class<?>[] clsArr3 = new Class[1];
            short sXd4 = (short) (ZN.Xd() ^ 18066);
            short sXd5 = (short) (ZN.Xd() ^ 18451);
            int[] iArr4 = new int["?\u007fHjjV~C\u0010\u0004[u\"QuJ\b0".length()];
            QB qb4 = new QB("?\u007fHjjV~C\u0010\u0004[u\"QuJ\b0");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd5) ^ sXd4));
                i5++;
            }
            clsArr3[0] = Class.forName(new String(iArr4, 0, i5));
            Object[] objArr3 = {runnable};
            short sXd6 = (short) (Od.Xd() ^ (-15180));
            short sXd7 = (short) (Od.Xd() ^ (-16639));
            int[] iArr5 = new int["tM0w".length()];
            QB qb5 = new QB("tM0w");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd7) + sXd6)));
                i6++;
            }
            Method method2 = cls3.getMethod(new String(iArr5, 0, i6), clsArr3);
            try {
                method2.setAccessible(true);
                method2.invoke(handler, objArr3);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    static /* synthetic */ void lambda$startUpWebView$1(final WebViewStartUpCallback webViewStartUpCallback, final WebViewStartUpResult webViewStartUpResult) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("kyp\u007f}xt?\u0002\u0007Ba\u0006\u0007\t~\r", (short) (FB.Xd() ^ 7214))).getDeclaredMethod(Wg.Zd("\fP.(\u000bRg,^\u001fk~]", (short) (FB.Xd() ^ 3748), (short) (FB.Xd() ^ 25247)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    webViewStartUpCallback.onSuccess(webViewStartUpResult);
                }
            };
            Class<?> cls = Class.forName(C1561oA.Xd("o}t\u0004\u0002|xC\u0006\u000bFa{\n\u0001\n\u0004\u0012", (short) (Od.Xd() ^ (-17820))));
            Class<?>[] clsArr = {Class.forName(Wg.vd("h^v`0meq]#Jlhg]]ZR", (short) (C1499aX.Xd() ^ (-23190))))};
            Object[] objArr2 = {runnable};
            short sXd = (short) (Od.Xd() ^ (-24680));
            short sXd2 = (short) (Od.Xd() ^ (-32698));
            int[] iArr = new int["GEHH".length()];
            QB qb = new QB("GEHH");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void setDefaultTrafficStatsTag(int i2) {
        if (WebViewFeatureInternal.DEFAULT_TRAFFICSTATS_TAGGING.isSupportedByWebView()) {
            getFactory().getStatics().setDefaultTrafficStatsTag(i2);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    static class NullReturningWebViewStartUpResult implements WebViewStartUpResult {
        @Override // androidx.webkit.WebViewStartUpResult
        public List<BlockingStartUpLocation> getBlockingStartUpLocations() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public Long getMaxTimePerTaskInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public Long getTotalTimeInUiThreadMillis() {
            return null;
        }

        private NullReturningWebViewStartUpResult() {
        }

        /* synthetic */ NullReturningWebViewStartUpResult(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, PrerenderOperationCallback prerenderOperationCallback) {
        if (WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            getProvider(webView).prerenderUrlAsync(str, cancellationSignal, executor, prerenderOperationCallback);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void prerenderUrlAsync(WebView webView, String str, CancellationSignal cancellationSignal, Executor executor, SpeculativeLoadingParameters speculativeLoadingParameters, PrerenderOperationCallback prerenderOperationCallback) {
        if (WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            getProvider(webView).prerenderUrlAsync(str, cancellationSignal, executor, speculativeLoadingParameters, prerenderOperationCallback);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void saveState(WebView webView, Bundle bundle, int i2, boolean z2) {
        if (WebViewFeatureInternal.SAVE_STATE.isSupportedByWebView()) {
            getProvider(webView).saveState(bundle, i2, z2);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setShouldCacheProvider(boolean z2) {
        if (WebViewFeatureInternal.CACHE_PROVIDER.isSupportedByWebView()) {
            sShouldCacheProvider = z2;
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebNavigationClient(WebView webView, WebNavigationClient webNavigationClient) {
        if (WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC.isSupportedByWebView()) {
            getProvider(webView).setWebNavigationClient(webNavigationClient);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static WebNavigationClient getWebNavigationClient(WebView webView) {
        if (WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC.isSupportedByWebView()) {
            return getProvider(webView).getWebNavigationClient();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static WebViewProviderFactory getFactory() {
        return WebViewGlueCommunicator.getFactory();
    }

    private static WebViewProviderBoundaryInterface createProvider(WebView webView) {
        return getFactory().createWebView(webView);
    }

    private static void checkThread(WebView webView) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = ApiHelperForP.getWebViewLooper(webView);
            if (webViewLooper != Looper.myLooper()) {
                StringBuilder sbAppend = new StringBuilder(Wg.vd("}[\u0016##\u0016,',S$\u001b- *\u001elC0Ap34>1)+e86j>END?E\u007f\n", (short) (ZN.Xd() ^ 23302))).append(Thread.currentThread().getName()).append(Qg.kd("bhYy$#U\f\u0019\u0015\b\u001a\u0015&M\u001a\u0011\u001f\u0012\u0018\f\u001aE\u0012\u0019\u0016\u0016@\u0002\u0004=\u007f|\u0007\u0006}{6\u0005\u00033\u0007yu/\u0002nyp*}pykfh1\")Ewnb_o_]\u0018CeddXd\u0011", (short) (ZN.Xd() ^ 20015), (short) (ZN.Xd() ^ 20845))).append(webViewLooper).append(hg.Vd("#eblkca\u001cjh\u0019", (short) (OY.Xd() ^ 284), (short) (OY.Xd() ^ 28621))).append(Looper.myLooper()).append(C1561oA.ud("E8]o^4\u0001sz~/Z|{{o{(py%", (short) (C1499aX.Xd() ^ (-16517))));
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.yd("NZS``YW TW\u00152XW[Oo", (short) (C1633zX.Xd() ^ (-9566)))).getDeclaredMethod(C1561oA.Yd("KJZ4IRX7[\\^Tb", (short) (C1607wl.Xd() ^ 29573)), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    throw new RuntimeException(sbAppend.append((Looper) declaredMethod.invoke(null, objArr)).append(Xg.qd("\u0019", (short) (C1580rY.Xd() ^ (-29025)), (short) (C1580rY.Xd() ^ (-16028)))).toString());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        short sXd = (short) (ZN.Xd() ^ 28882);
        short sXd2 = (short) (ZN.Xd() ^ 6190);
        int[] iArr = new int["#8\u000b\u0012scOd/y\u000f".length()];
        QB qb = new QB("#8\u000b\u0012scOd/y\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        try {
            Method declaredMethod2 = WebView.class.getDeclaredMethod(new String(iArr, 0, i2), new Class[0]);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(webView, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    static WeakHashMap<WebView, WebViewProviderAdapter> getProviderAdapterCacheForTesting() {
        return sProviderAdapterCache;
    }
}
