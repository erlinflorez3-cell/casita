package io.cobrowse;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
final class WebViewCustomClient extends WebViewClient {
    private ViewTreeObserver.OnDrawListener mDrawListener;
    private WeakReference<ViewGroup> mParentViewGroup;
    private ViewTreeObserver mRootViewTreeObserver;
    private final String mSelectorsString;
    private final WeakReference<WebView> mWebViewRef;
    private final int originalLayerType;
    private final int overScrollModeType;
    private final WebViewRedactionManager webViewRedactionManager;
    private final AtomicInteger frameCounter = new AtomicInteger(0);
    private final AtomicInteger resolvedFrameCounter = new AtomicInteger(-1);
    private final AtomicInteger resolvedScrollX = new AtomicInteger(0);
    private final AtomicInteger scrollVelocityX = new AtomicInteger(0);
    private final AtomicInteger resolvedScrollY = new AtomicInteger(0);
    private final AtomicInteger scrollVelocityY = new AtomicInteger(0);

    WebViewCustomClient(WebView webView, String[] strArr) {
        this.webViewRedactionManager = new WebViewRedactionManager(webView);
        this.mSelectorsString = String.join(", ", strArr);
        this.mWebViewRef = new WeakReference<>(webView);
        this.mParentViewGroup = new WeakReference<>((ViewGroup) webView.getParent());
        if (webView.getUrl() != null && isEnabled()) {
            injectJavaScript(webView, webView.getContext());
        }
        this.originalLayerType = webView.getLayerType();
        webView.setLayerType(0, null);
        this.overScrollModeType = webView.getOverScrollMode();
        if (isEnabled()) {
            webView.setOverScrollMode(2);
        }
    }

    private void injectJavaScript(final WebView webView, Context context) {
        String strLoadJavaScriptFromFile;
        if (isEnabled() && isJavaScriptEnabled(webView) && (strLoadJavaScriptFromFile = loadJavaScriptFromFile(context)) != null) {
            webView.evaluateJavascript(strLoadJavaScriptFromFile, new ValueCallback() { // from class: io.cobrowse.WebViewCustomClient$$ExternalSyntheticLambda3
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.f$0.m8852lambda$injectJavaScript$1$iocobrowseWebViewCustomClient(webView, (String) obj);
                }
            });
        }
    }

    private boolean isEnabled() {
        return !this.mSelectorsString.isEmpty();
    }

    private static boolean isJavaScriptEnabled(WebView webView) {
        return webView.getSettings().getJavaScriptEnabled();
    }

    private String loadJavaScriptFromFile(Context context) throws Throwable {
        InputStream inputStreamOpen;
        short sXd = (short) (OY.Xd() ^ 7441);
        int[] iArr = new int["k\b\u0011\u0015\u000f\u000fK!\u001dN\u0013\u001d!&\u0019T\u001f%(..Z/10$!.".length()];
        QB qb = new QB("k\b\u0011\u0015\u000f\u000fK!\u001dN\u0013\u001d!&\u0019T\u001f%(..Z/10$!.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        new String(iArr, 0, i2);
        short sXd2 = (short) (C1580rY.Xd() ^ (-8274));
        int[] iArr2 = new int["\u000b8,=;DA4\u0019 ".length()];
        QB qb2 = new QB("\u000b8,=;DA4\u0019 ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        new String(iArr2, 0, i3);
        try {
            Class<?> cls = Class.forName(Qg.kd("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (C1633zX.Xd() ^ (-29738)), (short) (C1633zX.Xd() ^ (-26437))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (C1607wl.Xd() ^ 16357);
            short sXd4 = (short) (C1607wl.Xd() ^ 23993);
            int[] iArr3 = new int["NKY%VUFTR".length()];
            QB qb3 = new QB("NKY%VUFTR");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3) + sXd4);
                i4++;
            }
            Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                inputStreamOpen = ((AssetManager) method.invoke(context, objArr)).open(C1561oA.ud("n[WJ\\WhBTRNO_SXV\u0015PX", (short) (C1633zX.Xd() ^ (-29035))));
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i5 = inputStreamOpen.read(bArr);
                        if (i5 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i5);
                    }
                    String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e2) {
                        }
                    }
                    return string;
                } catch (IOException e3) {
                    C1561oA.yd("Lhqugg$y}/|\u0001ko,Ww\u000eylu\u0006}\u0006\u0013?\u0007\u0014\n\t<\u0004OSM", (short) (OY.Xd() ^ 30924));
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e4) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw th;
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (IOException e7) {
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpen = null;
        }
    }

    private void queryDOM(WebView webView, int i2) {
        if (isEnabled() && isJavaScriptEnabled(webView)) {
            webView.evaluateJavascript("window.cobrowseIOgetRedactedElementsBounds('" + this.mSelectorsString + "', " + i2 + ");", new ValueCallback() { // from class: io.cobrowse.WebViewCustomClient$$ExternalSyntheticLambda1
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    this.f$0.m8854lambda$queryDOM$3$iocobrowseWebViewCustomClient((String) obj);
                }
            });
        }
    }

    private void registerViewTreeObserverListeners(final WebView webView) {
        if (this.mDrawListener == null && isEnabled()) {
            this.mRootViewTreeObserver = webView.getViewTreeObserver();
            this.mDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: io.cobrowse.WebViewCustomClient$$ExternalSyntheticLambda0
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    this.f$0.m8855x25d50ff5(webView);
                }
            };
            ((ViewTreeObserver) Objects.requireNonNull(this.mRootViewTreeObserver)).addOnDrawListener(this.mDrawListener);
        }
    }

    private void trackParentChanges() {
        WebView webView = this.mWebViewRef.get();
        if (webView == null) {
            reset();
        } else if (this.mParentViewGroup.get() != webView.getParent()) {
            reset();
            this.mParentViewGroup = new WeakReference<>((ViewGroup) webView.getParent());
            registerViewTreeObserverListeners(webView);
        }
    }

    void destroy() {
        reset();
        WebView webView = this.mWebViewRef.get();
        if (webView != null) {
            webView.setLayerType(this.originalLayerType, null);
            if (isEnabled()) {
                webView.setOverScrollMode(this.overScrollModeType);
            }
        }
    }

    Set<View> getFullRedaction() {
        return new HashSet<View>() { // from class: io.cobrowse.WebViewCustomClient.1
            {
                add((View) WebViewCustomClient.this.mWebViewRef.get());
            }
        };
    }

    public boolean isSettled() {
        if (this.mWebViewRef.get() == null || !this.mWebViewRef.get().isShown() || !isEnabled() || !isJavaScriptEnabled(this.mWebViewRef.get())) {
            return true;
        }
        if (this.webViewRedactionManager.getRedactedViews() == null) {
            return false;
        }
        return this.frameCounter.get() == this.resolvedFrameCounter.get() && this.resolvedScrollX.get() == this.mWebViewRef.get().getScrollX() && this.resolvedScrollY.get() == this.mWebViewRef.get().getScrollY();
    }

    /* JADX INFO: renamed from: lambda$injectJavaScript$1$io-cobrowse-WebViewCustomClient, reason: not valid java name */
    /* synthetic */ void m8852lambda$injectJavaScript$1$iocobrowseWebViewCustomClient(WebView webView, String str) {
        if (str != null) {
            registerViewTreeObserverListeners(webView);
        }
    }

    /* JADX INFO: renamed from: lambda$onPageFinished$0$io-cobrowse-WebViewCustomClient, reason: not valid java name */
    /* synthetic */ void m8853lambda$onPageFinished$0$iocobrowseWebViewCustomClient(WebView webView) {
        injectJavaScript(webView, webView.getContext());
    }

    /* JADX INFO: renamed from: lambda$queryDOM$3$io-cobrowse-WebViewCustomClient, reason: not valid java name */
    /* synthetic */ void m8854lambda$queryDOM$3$iocobrowseWebViewCustomClient(String str) {
        try {
            if (str.equals("null")) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("counter");
            String strOptString = jSONObject.optString("error", "");
            if (!strOptString.isEmpty()) {
                String str2 = "Error occurred while querying the DOM: " + strOptString;
            } else if (i2 == this.frameCounter.get()) {
                this.resolvedFrameCounter.set(i2);
                this.webViewRedactionManager.updateOverlay(jSONObject.getJSONArray("positions"), this.scrollVelocityX.get(), this.scrollVelocityY.get());
            }
        } catch (JSONException e2) {
            String str3 = "WebViewCustomClient: Failed to parse JSON response: " + str;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$registerViewTreeObserverListeners$2$io-cobrowse-WebViewCustomClient, reason: not valid java name */
    /* synthetic */ void m8855x25d50ff5(WebView webView) {
        int iIncrementAndGet = this.frameCounter.incrementAndGet();
        int scrollX = webView.getScrollX();
        int scrollY = webView.getScrollY();
        double d2 = scrollX - this.resolvedScrollX.get();
        double d3 = scrollY - this.resolvedScrollY.get();
        double d4 = (((double) this.scrollVelocityX.get()) * 0.2d) + (d2 * 0.8d);
        double d5 = (((double) this.scrollVelocityY.get()) * 0.2d) + (d3 * 0.8d);
        this.scrollVelocityX.set((int) d4);
        this.scrollVelocityY.set((int) d5);
        this.resolvedScrollX.set(scrollX);
        this.resolvedScrollY.set(scrollY);
        queryDOM(webView, iIncrementAndGet);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(final WebView webView, String str) {
        super.onPageFinished(webView, str);
        webView.post(new Runnable() { // from class: io.cobrowse.WebViewCustomClient$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8853lambda$onPageFinished$0$iocobrowseWebViewCustomClient(webView);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        reset();
        super.onPageStarted(webView, str, bitmap);
    }

    Set<View> redactedViews() {
        if (!isEnabled()) {
            return new HashSet();
        }
        if (!isJavaScriptEnabled(this.mWebViewRef.get())) {
            return getFullRedaction();
        }
        trackParentChanges();
        if (this.mWebViewRef.get() == null) {
            return new HashSet();
        }
        Set<View> redactedViews = this.webViewRedactionManager.getRedactedViews();
        return redactedViews == null ? getFullRedaction() : redactedViews;
    }

    void reset() {
        ViewTreeObserver.OnDrawListener onDrawListener;
        this.frameCounter.set(0);
        this.resolvedFrameCounter.set(-1);
        ViewTreeObserver viewTreeObserver = this.mRootViewTreeObserver;
        if (viewTreeObserver != null && (onDrawListener = this.mDrawListener) != null) {
            try {
                viewTreeObserver.removeOnDrawListener(onDrawListener);
                this.mDrawListener = null;
                this.mRootViewTreeObserver = null;
            } catch (Exception e2) {
            }
        }
        this.webViewRedactionManager.reset();
    }
}
