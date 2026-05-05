package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.support.ViewUtils;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000fy\u0005<$a'yCQU\"}(\tWN}gvJ`\u000fK\u000f\u0014\u0016\u0001̓4Ikxe\u0012\u00152JoU3UoC9htD\u000b(2(:\u0002\u0005\u0017\u001a2H\u0016w\u0003CY\u0018\u001a0Fr@v#˟#GB\u0006l\u001f1\u001e\u000bg\u00075u-tJ51\u0004\u0002Dd&\u000e2\rS\u001bIl)#u\u0010\"ҋD7C\u001ama\u0011\u001fj[m\u001couK\u001f\u0001'UF\u0010\b Df\u001c,\u0015YX=a\u0001Ct\u0005\u007f~R;sUqjh\u000eV\u0011A\u0010UB\u0012.\u001e'vOs>/\u001e\u001cU\rr\u0002I\u0001\u0006le\u0018z\u0010WG)\u000ePC9I\u0005\u0018u\u0004)\\[\u0014\u0005;7S\u0007|FsV$_CA\u001b\f\u001a?_gUH|#\nA{\u0012\tb09JD\u0010\u001c=$).E>gaGL9m\u0018Gr\u0012'\rfha\u0015jJV!\u001d@}?Q\u0010hp|\u0005\u001ai%f:\u0017e\u001ej\u0006,\u000fi\u0601hʟ@!-ī\u001fgvq\u0003M\f\u0013{ÛrƠ]zsލo;d=C\\\u0004\u0012g^\u0005!\u0010Jp\u0013phXR:i3̨.ĘLj\u0018ǮLP\\\u001c+2mzrؼ8֞\u001d\\\u001dǽS2PR\u0015\u000buY\u0017\"5)\nʋ\u0005Ȑ(x!\u0003Vo~\u00048\rWA\u0015b8,oXkn|ŵ$מ8\u0001;\t\u0005\n\u000e^ѮPu"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015KpA\u000e@(\\v\u0018KL`\u0002", "\u001a`]1e6BRb\u0011~].|\u0018xR\u007f/wO\u0005(\u0017.k\"F\u00074\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hR=\u0007u\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "1n]3\\.N`\u0019}b^:\u000b\u00051eq(x1\u0005\u0017)", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "6`b\u000ec7EW\u0019}lb5{\u0013AI\t6{O\u000f", "", "5dc\u0015T:\u001a^$\u0006~^+n\r8d\n:_I\u000f\u0017&U", "u(I", "Adc\u0015T:\u001a^$\u0006~^+n\r8d\n:_I\u000f\u0017&U", "uY\u0018#", "7m0=c\u0014>a'z|^\u001e|\u0006 i\u007f:YG\u0005\u0017 V", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWL\u0006)<gG\u0004@I!95CIy0 \u0015Za6wg,`T.KLW;2", "7r56a0LV\u0019}", ";db@T.>1 \u0003xd(y\u0010/V\u0004(\u000e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u001aX:LO\u001b~Xe0z\u000f+b\u0007(lD\u0001)", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", ";db@T.>E\u0019{kb,\u000f", "5dc\u001aX:LO\u001b~l^)m\r/w", "u(;.a+K]\u001d}Dp,y\u000f3tI\u001a{=q\u001b\u0017YE", "/o_9l\u001eB\\\u0018\t\rB5\u000b\t>s", "", "7mb2g:", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "2hb=T;<V~~\u000f>=|\u0012>", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "4h]6f/0S\u0016o~^>[\r=p\u0007$\u0010", "5dc$X)/W\u0019\u0011kb,\u000fl.", "", "=m:2l\u000bHe\"", "9dh\u0010b+>", "Adc\u0015g4E>\u0015\u0001z?0\u0006\r=h\u007f'bD\u000f&\u0017Po\u001b", ":hbAX5>`", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u0012?C8\\8\u001e'Fh=\u0007l;<\u0006#VL50jarF\u0014\u001f0", "Adc\u0016a\bI^\u0001~\tl(~\t!e|\u0019\u007f@\u0013t\u001eKo\u0017K", "Adc$X)/W\u0019\u0011Xh5\f\t8t", "6s\\956=g", "", "/rb2g\u000bB`\u0019|\nh9\u0011x<l", "AdcBc\u000bB`\u0019|\nb6\u0006\u00056N{9\u007fB|&\u001bQx", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    public static final String BRAZE_BRIDGE_PREFIX = "brazeInternalBridge";
    public static final Companion Companion = new Companion(null);
    private static final String FINISHED_WEBVIEW_URL = "about:blank";
    private static final String HTML_ENCODING = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓϴt@"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015KpA\u000e@(\\v\u0018KL`j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0010Q0'8&\u001b@|]\\>&gu\u000fFc\u001b", "", "\u0014H=\u0016F\u000f\u001e2\u0013pZ;\u001d`h!_o\u0015b", "\u0016S<\u0019R\f'1\u0003]^G\u000e", "\u0016S<\u0019R\u0014\";xxiR\u0017\\", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewContent");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            str2 = null;
        }
        inAppMessageHtmlBaseView.setWebViewContent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDirectionalNavigation$lambda$1(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        webView.requestFocus();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        if (new BrazeConfigurationProvider(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isInTouchMode() || event.getKeyCode() != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void finishWebViewDisplay() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView.finishWebViewDisplay.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Finishing WebView display";
            }
        }, 7, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl(FINISHED_WEBVIEW_URL);
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    public WebView getMessageWebView() {
        if (this.isFinished) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot return the WebView for an already finished message";
                }
            }, 6, (Object) null);
            return null;
        }
        final int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot find WebView. getWebViewViewId() returned 0.";
                }
            }, 7, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "findViewById for " + webViewViewId + " returned null. Returning null for WebView.";
                }
            }, 7, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        try {
            if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                if (ViewUtils.isDeviceInNightMode(context)) {
                    WebSettingsCompat.setForceDark(settings, 2);
                }
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                WebSettingsCompat.setForceDarkStrategy(settings, 1);
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to set dark mode WebView settings";
                }
            }, 4, (Object) null);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "this.context");
        final boolean zIsHtmlInAppMessageHtmlLinkTargetEnabled = new BrazeConfigurationProvider(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (zIsHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HtmlInAppMessageHtmlLinkTarget enabled";
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HtmlInAppMessageHtmlLinkTarget not enabled";
                }
            }, 6, (Object) null);
        }
        webView2.setWebChromeClient(new WebChromeClient() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
                return bitmapCreateBitmap;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(final ConsoleMessage cm) {
                Intrinsics.checkNotNullParameter(cm, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onConsoleMessage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Braze HTML In-app Message log. Line: " + cm.lineNumber() + ". SourceId: " + cm.sourceId() + ". Log Level: " + cm.messageLevel() + ". Message: " + cm.message();
                    }
                }, 7, (Object) null);
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9, types: [android.webkit.WebView$HitTestResult, java.lang.Object] */
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView3, boolean z2, boolean z3, Message message) throws Exception {
                String strUd = C1626yg.Ud("r'-#\\\u0012\u0017", (short) (C1499aX.Xd() ^ (-26766)), (short) (C1499aX.Xd() ^ (-9978)));
                String strWd = Ig.wd("\u007fK\u001eI", (short) (Od.Xd() ^ (-16332)));
                if (!zIsHtmlInAppMessageHtmlLinkTargetEnabled) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
                        }
                    }, 6, (Object) null);
                    return super.onCreateWindow(webView3, z2, z3, message);
                }
                if (webView3 == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "onCreateWindow webView is null, not opening link";
                        }
                    }, 6, (Object) null);
                    return false;
                }
                final WebView.HitTestResult hitTestResult = webView3.getHitTestResult();
                Intrinsics.checkNotNullExpressionValue(hitTestResult, EO.Od(" `l\u0018A)\u0010\u0005C#-\u0012:ME,o_", (short) (C1633zX.Xd() ^ (-9001))));
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "onCreateWindow HitTestResult is " + hitTestResult;
                    }
                }, 6, (Object) null);
                try {
                    int type = hitTestResult.getType();
                    short sXd = (short) (C1607wl.Xd() ^ 25927);
                    int[] iArr = new int["=I>KG@:\u0003=AF6>C{./?386t\u001c\u000e\t\u001a".length()];
                    QB qb = new QB("=I>KG@:\u0003=AF6>C{./?386t\u001c\u000e\t\u001a");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    if (type == 2) {
                        Intent intent = new Intent(str, Uri.parse(strWd + hitTestResult.getExtra()));
                        Context context3 = this.this$0.getContext();
                        CX.ud();
                        short sXd2 = (short) (ZN.Xd() ^ 12998);
                        short sXd3 = (short) (ZN.Xd() ^ 13883);
                        int[] iArr2 = new int["o{p}yrl5itrwgot-Aljo_ql".length()];
                        QB qb2 = new QB("o{p}yrl5itrwgot-Aljo_ql");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                            i3++;
                        }
                        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(hg.Vd(">J?LHA;\u00048CAF6>C{\u0016:?/7<", (short) (C1580rY.Xd() ^ (-25127)), (short) (C1580rY.Xd() ^ (-23491))));
                        Object[] objArr = {intent};
                        Method method = cls.getMethod(C1561oA.ud("nnZjk7Xh\\hZdh", (short) (Od.Xd() ^ (-30840))), clsArr);
                        try {
                            method.setAccessible(true);
                            hitTestResult = method.invoke(context3, objArr);
                            return false;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    if (type == 4) {
                        Intent intent2 = new Intent(str, Uri.parse(strUd + hitTestResult.getExtra()));
                        Context context4 = this.this$0.getContext();
                        CX.ud();
                        Class<?> cls2 = Class.forName(Wg.Zd("\u0001%\u0016{s%9:\u000bNH&\u0010Pqb\u0013V\u000b(T~6", (short) (OY.Xd() ^ CasioType2MakernoteDirectory.TAG_TIME_ZONE), (short) (OY.Xd() ^ 999)));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[0] = Class.forName(C1561oA.Xd("?MDSQLH\u0013IVV]OY`\u001b7]dV`g", (short) (ZN.Xd() ^ 7917)));
                        Object[] objArr2 = {intent2};
                        Method method2 = cls2.getMethod(Wg.vd(";;+;@\f1A)5+5=", (short) (FB.Xd() ^ 16293)), clsArr2);
                        try {
                            method2.setAccessible(true);
                            hitTestResult = method2.invoke(context4, objArr2);
                            return false;
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    if (type != 7) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "onCreateWindow: hitTestResult type was " + hitTestResult.getType() + ". Not doing anything.";
                            }
                        }, 6, (Object) null);
                        return false;
                    }
                    Intent intent3 = new Intent(str, Uri.parse(hitTestResult.getExtra()));
                    Context context5 = this.this$0.getContext();
                    CX.ud();
                    Class<?> cls3 = Class.forName(C1593ug.zd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (C1607wl.Xd() ^ 29077), (short) (C1607wl.Xd() ^ PhotoshopDirectory.TAG_COUNT_INFORMATION)));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(C1561oA.od("\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVp\u0015\u001a\n\u0012\u0017", (short) (OY.Xd() ^ 11443)));
                    Object[] objArr3 = {intent3};
                    Method method3 = cls3.getMethod(C1561oA.Kd("qsasvDgyo}q}\u0004", (short) (FB.Xd() ^ 8659)), clsArr3);
                    try {
                        method3.setAccessible(true);
                        hitTestResult = method3.invoke(context5, objArr3);
                        return false;
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Failed to open link in new window. " + hitTestResult;
                        }
                    }, 4, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to open link in new window. " + hitTestResult;
                    }
                }, 4, (Object) null);
                return false;
            }
        });
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i2 == 4 && BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(i2, event);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z2) {
        this.hasAppliedWindowInsets = z2;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener iWebViewClientStateListener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(iWebViewClientStateListener);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        Intrinsics.checkNotNullParameter(inAppMessageWebViewClient, "inAppMessageWebViewClient");
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }

    public void setWebViewContent(String str, String str2) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView.setWebViewContent.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot load WebView. htmlBody was null.";
                }
            }, 7, (Object) null);
            return;
        }
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.loadDataWithBaseURL("https://iamcache.braze/", str, HTML_MIME_TYPE, HTML_ENCODING, null);
        }
    }

    public final void setupDirectionalNavigation() {
        final WebView messageWebView = getMessageWebView();
        if (messageWebView == null) {
            return;
        }
        messageWebView.setNextFocusDownId(messageWebView.getId());
        messageWebView.setNextFocusLeftId(messageWebView.getId());
        messageWebView.setNextFocusRightId(messageWebView.getId());
        messageWebView.setNextFocusUpId(messageWebView.getId());
        messageWebView.requestFocus();
        messageWebView.setFocusedByDefault(true);
        messageWebView.post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InAppMessageHtmlBaseView.setupDirectionalNavigation$lambda$1(messageWebView);
            }
        });
    }
}
