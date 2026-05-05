package com.statsig.androidsdk;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import com.statsig.androidsdk.DebugView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0007WيN\f^B-!d\u0013x\ti+<ӧHeV.ʈW."}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010u", "", "u(E", "\u0011n\\=T5B]\"", "\u0012dQBZ\u001e>Pv\u0002\bh4|f6i\u007f1\u000b", "\u0012dQBZ\u001e>P\n\u0003zp\n\u0004\r/n\u000f", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class DebugView {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{B$cҕyCIa\"Ԃ*\t]po˧vJp\u000bK\u000f\u0014\u001f\u0001jBI]ތc\u070f\u0010Hԏ ?aL0B?`ҽ:\u0005.2jV\b\u0006\u0019\u001aXJ@z\tFc\f@4ptHW%M3 B\nL'\u0019\u001e\u000bo\u00156\u00113kCG#1srR5bH|{\u0011vX5\u0018\u000faL7pIC\"=a\u0013\tb[m\u000fOuM\u0007~&U*w\u0002\bNf\u000f,);Q\u001d]!7l\u0007a`:1AN\u0012[9\u0010>vY\u000eɇ@\u0017"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010^\u0015w\u001e9IL?u=s", "", "u(E", "5dc\u0010b5?W\u001b\u000f\b^+n\t,V\u0004(\u000e", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1kX2a;", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010^\u0016m\u0013>O5;h%\"\u0015z?@\u000bc5]L", "1ga<`,\u001cZ\u001d~\u0004m", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010^\u0016m\u0013>O5;h\u0012!\"ri9dj0N\u007f6\u001d", "Ag^D", "", "AcZ\u0018X@", "", "AsPAX", "", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010}3t\u001d+IAAA", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WebView getConfiguredWebView(Context context, DebugWebViewClient debugWebViewClient, DebugWebChromeClient debugWebChromeClient) {
            WebView webView = new WebView(context);
            webView.setWebViewClient(debugWebViewClient);
            webView.setWebChromeClient(debugWebChromeClient);
            webView.setSystemUiVisibility(2);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setJavaScriptEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            return webView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: show$lambda-0, reason: not valid java name */
        public static final boolean m8730show$lambda0(WebView webView, Dialog dialog, DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
            String str;
            Intrinsics.checkNotNullParameter(webView, "$webView");
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            if (i2 != 4 || keyEvent.getAction() != 1 || !webView.canGoBack()) {
                return false;
            }
            webView.goBack();
            String url = webView.getUrl();
            Boolean boolValueOf = null;
            List listSplit$default = url == null ? null : StringsKt.split$default((CharSequence) url, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null);
            if (listSplit$default != null && (str = (String) CollectionsKt.last(listSplit$default)) != null) {
                boolValueOf = Boolean.valueOf(StringsKt.startsWith$default(str, "client_sdk_debugger", false, 2, (Object) null));
            }
            if (Intrinsics.areEqual((Object) boolValueOf, (Object) true)) {
                dialog.dismiss();
            }
            return true;
        }

        public final void show(Context context, String sdkKey, Map<String, ? extends Object> state, Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
            Intrinsics.checkNotNullParameter(state, "state");
            final Dialog dialog = new Dialog(context, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
            String json = new Gson().toJson(state);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(state)");
            final WebView configuredWebView = getConfiguredWebView(context, new DebugWebViewClient(json), new DebugWebChromeClient(dialog, function1));
            dialog.requestWindowFeature(1);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.statsig.androidsdk.DebugView$Companion$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    return DebugView.Companion.m8730show$lambda0(configuredWebView, dialog, dialogInterface, i2, keyEvent);
                }
            });
            configuredWebView.loadUrl(Intrinsics.stringPlus("https://console.statsig.com/client_sdk_debugger_redirect?sdkKey=", sdkKey));
            dialog.setContentView(configuredWebView);
            dialog.show();
            Window window = dialog.getWindow();
            if (window == null) {
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\u0010njG0Le^.ZS0\u000fs{B0c$wDCU0}*ޛUN}˧\u001fJ\t\n\u00046\u0016\u001a\u0007jDI\u0004ym*\u001d4Z\u0004O5]ok=pvF\u0005N787(\bi\u001c@Gn|ټGK\u001a\u0019xP~Ej\r{\tJ\u0018\u0014J8\u00034[\u0016[|\\=}H1;\u0017yD^'\u000e4\rO\u001dF\u0003,#u\u0010!\u0014BM4s+*\u038b\tқ_?\u000bӊBI\u0013p?'YRJɑxݼ\u0004\u0014\u001dۀ \u0019kr>\\3R7ϲ)˦ScSִ^4\u0006\u0005\u0014\rj\rdͽiρ2-\"Ǒۅ\u0012A"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010^\u0016m\u0013>O5;h\u0012!\"ri9dj0N\u007f6\u001d", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%YC\u000e!\u001fGM\u0015@v.D/", "2hP9b.", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010}3t\u001d+IAAA", "uKP;W9HW\u0018Hvi7Fg3a\u00072}\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj8", "1k^@X\b<b\u001d\t\u0004", "", "@d[<T++S%\u000f~k,{", "=m2<a:HZ\u0019fzl:x\u000b/", "1n]@b3>;\u0019\r\tZ.|", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xC\n1\nJ\b\u0017~G}\u001c8x%\u000b", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    private static final class DebugWebChromeClient extends WebChromeClient {
        private final Function1<Boolean, Unit> callback;
        private final String closeAction;
        private final Dialog dialog;
        private final String reloadRequired;

        /* JADX WARN: Multi-variable type inference failed */
        public DebugWebChromeClient(Dialog dialog, Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.dialog = dialog;
            this.callback = function1;
            this.closeAction = "STATSIG_ANDROID_DEBUG_CLOSE_DIALOG";
            this.reloadRequired = "STATSIG_ANDROID_DEBUG_RELOAD_REQUIRED";
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String strMessage;
            Function1<Boolean, Unit> function1;
            if (consoleMessage != null && (strMessage = consoleMessage.message()) != null) {
                String str = strMessage;
                if (StringsKt.contentEquals(str, this.closeAction, true)) {
                    this.dialog.dismiss();
                }
                if (StringsKt.contentEquals(str, this.reloadRequired, true) && (function1 = this.callback) != null) {
                    function1.invoke(true);
                }
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\":\u0012\u007fјnjO0LeN.XS@ş\u001c{b#\u001c/\u0002GIU2}P\nҊRgup\u0013t\u0019F'\u0006D|\u001b2WZ\u0011_(\u000e`H EAT\b?O_#7K4\u0003.Fy\u001d\u0001H+\u001fƸxټGK\u0014۵ؼDx"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&o\u000bLx\u00169Y\u0010^\u0016m\u0013>O5;h%\"\u0015z?@\u000bc5]L", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)tNs\u000eE\u0006z", "8r^;", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "=m?.Z,\u001fW\"\u0003\ta,{", "", "DhTD", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "Cq[", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    private static final class DebugWebViewClient extends WebViewClient {
        private final String json;

        public DebugWebViewClient(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            this.json = json;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (webView != null) {
                webView.evaluateJavascript("window.__StatsigAndroidDebug=true;", null);
            }
            String str2 = "window.__StatsigClientState = " + this.json + ';';
            if (webView == null) {
                return;
            }
            webView.evaluateJavascript(str2, null);
        }
    }
}
