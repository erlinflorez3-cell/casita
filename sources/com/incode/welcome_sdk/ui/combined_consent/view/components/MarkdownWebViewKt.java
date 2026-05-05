package com.incode.welcome_sdk.ui.combined_consent.view.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public final class MarkdownWebViewKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12970b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12971c = 0;

    static final class e extends Lambda implements Function1<Context, WebView> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12986b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12987c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<Boolean, Unit> f12988a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Context f12989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f12990e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ WebView invoke(Context context) {
            int i2 = 2 % 2;
            int i3 = f12986b + 67;
            f12987c = i3 % 128;
            int i4 = i3 % 2;
            WebView webViewE = e(context);
            int i5 = f12986b + 93;
            f12987c = i5 % 128;
            if (i5 % 2 != 0) {
                return webViewE;
            }
            throw null;
        }

        private WebView e(Context context) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            WebView webView = new WebView(this.f12989d);
            String str = this.f12990e;
            final Function1<Boolean, Unit> function1 = this.f12988a;
            final Context context2 = this.f12989d;
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setBlockNetworkLoads(true);
            webView.addJavascriptInterface(new Object() { // from class: com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownWebViewKt$MarkdownWebView$1$1$1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f12972d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f12973e = 1;

                @JavascriptInterface
                public final void onContentLoaded() {
                    int i3 = 2 % 2;
                    int i4 = f12972d + 37;
                    f12973e = i4 % 128;
                    int i5 = i4 % 2;
                    function1.invoke(Boolean.TRUE);
                    int i6 = f12973e + 13;
                    f12972d = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 38 / 0;
                    }
                }
            }, EventMetricsAggregator.OS_NAME);
            webView.setClipToOutline(true);
            webView.setWebViewClient(new WebViewClient() { // from class: com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownWebViewKt$MarkdownWebView$1$1$2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f12975b = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f12976d = 1;

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) throws Exception {
                    Uri url;
                    int i3 = 2 % 2;
                    int i4 = f12976d + 125;
                    int i5 = i4 % 128;
                    f12975b = i5;
                    int i6 = i4 % 2;
                    if (webResourceRequest != null) {
                        int i7 = i5 + 111;
                        f12976d = i7 % 128;
                        if (i7 % 2 != 0) {
                            url = webResourceRequest.getUrl();
                        } else {
                            webResourceRequest.getUrl();
                            throw null;
                        }
                    } else {
                        url = null;
                    }
                    String strValueOf = String.valueOf(url);
                    if (!StringsKt.startsWith$default(strValueOf, "https://", false, 2, (Object) null)) {
                        return false;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strValueOf));
                    Context context3 = context2;
                    CX.ud();
                    context3.startActivity(intent);
                    return true;
                }
            });
            webView.loadDataWithBaseURL("file:///android_asset/", str, "text/html", "UTF-8", null);
            int i3 = f12986b + 27;
            f12987c = i3 % 128;
            if (i3 % 2 != 0) {
                return webView;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Context context, String str, Function1<? super Boolean, Unit> function1) {
            super(1);
            this.f12989d = context;
            this.f12990e = str;
            this.f12988a = function1;
        }
    }

    static final class a extends Lambda implements Function1<WebView, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12978c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12979d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f12980e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(WebView webView) {
            int i2 = 2 % 2;
            int i3 = f12978c + 117;
            f12979d = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            e(webView);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f12978c + 3;
            f12979d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        private void e(WebView webView) {
            int i2 = 2 % 2;
            int i3 = f12979d + 111;
            f12978c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(webView, "");
                webView.loadDataWithBaseURL("file:///android_asset/", this.f12980e, "text/html", "UTF-8", null);
                int i4 = 78 / 0;
            } else {
                Intrinsics.checkNotNullParameter(webView, "");
                webView.loadDataWithBaseURL("file:///android_asset/", this.f12980e, "text/html", "UTF-8", null);
            }
            int i5 = f12978c + 111;
            f12979d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f12980e = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MarkdownWebView(java.lang.String r14, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r15, androidx.compose.runtime.Composer r16, int r17) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownWebViewKt.MarkdownWebView(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12981a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12982d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f12983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<Boolean, Unit> f12984c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f12985e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f12981a + 67;
            f12982d = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 83 / 0;
            }
            return unit;
        }

        private void c(Composer composer) {
            String str;
            Function1<Boolean, Unit> function1;
            int i2;
            int i3 = 2 % 2;
            int i4 = f12981a + 67;
            f12982d = i4 % 128;
            if (i4 % 2 != 0) {
                str = this.f12983b;
                function1 = this.f12984c;
                i2 = this.f12985e;
            } else {
                str = this.f12983b;
                function1 = this.f12984c;
                i2 = this.f12985e | 1;
            }
            MarkdownWebViewKt.MarkdownWebView(str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2));
            int i5 = f12982d + 103;
            f12981a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, Function1<? super Boolean, Unit> function1, int i2) {
            super(2);
            this.f12983b = str;
            this.f12984c = function1;
            this.f12985e = i2;
        }
    }
}
