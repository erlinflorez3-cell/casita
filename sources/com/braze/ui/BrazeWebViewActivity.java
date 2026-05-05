package com.braze.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.braze.BrazeInternal;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG0L͜P.hS2şq\u0011Jř\f$ B{X۟\u0002\"\u0017O\u0017muobZ9EU\u001a^~x/aU'aX#zR}DKM\u001eCif\u0003=\u001d\"H!f\u0002K\u0015ʆ.Q"}, d2 = {"\u001ab^:\")KO.~Dn0Fe<a\u0015(m@}\b\u001bG\u0002i:\u0006)F]\r4\r", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "u(E", "1qT.g,0S\u0016\\}k6\u0005\t\rl\u0004(\u0005O", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%YC\u000e!\u001fGM\u0015@v.D/", "1qT.g,0S\u0016o~^>Z\u00103e\t7", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)tNs\u000eE\u0006z", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeWebViewActivity extends FragmentActivity {

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001f\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007nʑa/ǏkPDɟ\u0004*=jD:2[<qq<\u001c.F0\u0017Qfg\u0016qz^\u0019G'\u0006D}1@֘Y~"}, d2 = {"1n\\{U9:h\u0019H\u000bbuY\u0016+z\u007f\u001a{=q\u001b\u0017YK\fKz69h\u0012^5z\u0016*\\C-k1{\u0018ukA\u0007A3Rv0V\u000b\u001a", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%YC\u000e!\u001fGM\u0015@v.D/", "5dc\u0011X-:c \u000ekb+|\u0013\u001ao\u000e7{M", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "=m2<a:HZ\u0019fzl:x\u000b/", "", "1l", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xC\n1\nJ\b\u0017~G}\u001c8x%\u000b", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends WebChromeClient {
        AnonymousClass1() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
            return bitmapCreateBitmap;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(final ConsoleMessage cm) {
            Intrinsics.checkNotNullParameter(cm, "cm");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Braze WebView Activity log. Line: " + cm.lineNumber() + ". SourceId: " + cm.sourceId() + ". Log Level: " + cm.messageLevel() + ". Message: " + cm.message();
                }
            }, 7, (Object) null);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я5\u001d̉=!4i\bӵLc\u0003\rIي8\u000bDB\u0007Ӭ4\u0012\u0006\u0013nj?1Le^.Zݷ2\u000f\u0002{<$a$yCQU\"ԂJ\bѧTo}ñzZ9BW#$x\u0003._T'^B\u0013@D\b?aP AGd\r63%x\"أ}\u0005\u000f r^\u001e}\u0013Cy\rB4NxRR;V5\u001e \u0010V /)#{\u0017LVxu:]$3mPV?_^\u0006}\u0011Ta?\r%od?\tMC!=S1\b\u0003_M\u000bWqk\u000e\u0019+5/as\u0006;\u001f\u0015Е\u0019:"}, d2 = {"1n\\{U9:h\u0019H\u000bbuY\u0016+z\u007f\u001a{=q\u001b\u0017YK\fKz69h\u0012^5z\u0016*\\C-k1\u000f\u0019hs\u0017\u000eg,W\u0006e\u0013", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)tNs\u000eE\u0006z", "6`]1_,.` h\f^9\n\r.e", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Cq[", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6sXOf5\u0018_uUr0I\u0016+6fYr9\u001dg", "=mA2a+>`\u0004\f\u0005\\,\u000b\u0017\u0011o\t(", "DhTD", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "2dc.\\3", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xR\u007f1z@\u000e\u0002$Qm\u000eJ\u0005\u0007?b}~7|\u00122T\u0019", "Ag^B_+(d\u0019\f\bb+|x<lf2w?\u0005 \u0019", "@d`BX:M", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%h@\u000f!'Tm\u000e)v1EY\f/\r", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C09591 extends WebViewClient {
        C09591() {
        }

        private final Boolean handleUrlOverride(Context context, final String str) {
            try {
                if (CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(str).getScheme())) {
                    return null;
                }
                UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(str, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                if (uriActionCreateUriActionFromUrlString == null) {
                    return false;
                }
                uriActionCreateUriActionFromUrlString.execute(context);
                BrazeWebViewActivity.this.finish();
                return true;
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Unexpected exception while processing url " + str + ". Passing url back to WebView.";
                    }
                }, 4, (Object) null);
                return null;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(detail, "detail");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$onRenderProcessGone$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The webview rendering process crashed, returning true";
                }
            }, 6, (Object) null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            String string = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
            Boolean boolHandleUrlOverride = handleUrlOverride(context, string);
            return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, request);
        }

        @Override // android.webkit.WebViewClient
        @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
        @InterfaceC1492Gx
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            Boolean boolHandleUrlOverride = handleUrlOverride(context, url);
            return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, url);
        }
    }

    public WebChromeClient createWebChromeClient() {
        return new WebChromeClient() { // from class: com.braze.ui.BrazeWebViewActivity.createWebChromeClient.1
            AnonymousClass1() {
            }

            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
                return bitmapCreateBitmap;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(final ConsoleMessage cm) {
                Intrinsics.checkNotNullParameter(cm, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Braze WebView Activity log. Line: " + cm.lineNumber() + ". SourceId: " + cm.sourceId() + ". Log Level: " + cm.messageLevel() + ". Message: " + cm.message();
                    }
                }, 7, (Object) null);
                return true;
            }
        };
    }

    public WebViewClient createWebViewClient() {
        return new WebViewClient() { // from class: com.braze.ui.BrazeWebViewActivity.createWebViewClient.1
            C09591() {
            }

            private final Boolean handleUrlOverride(Context context, final String str) {
                try {
                    if (CollectionsKt.contains(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(str).getScheme())) {
                        return null;
                    }
                    UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(str, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                    if (uriActionCreateUriActionFromUrlString == null) {
                        return false;
                    }
                    uriActionCreateUriActionFromUrlString.execute(context);
                    BrazeWebViewActivity.this.finish();
                    return true;
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Unexpected exception while processing url " + str + ". Passing url back to WebView.";
                        }
                    }, 4, (Object) null);
                    return null;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(detail, "detail");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$onRenderProcessGone$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "The webview rendering process crashed, returning true";
                    }
                }, 6, (Object) null);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                String string = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
                Boolean boolHandleUrlOverride = handleUrlOverride(context, string);
                return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, request);
            }

            @Override // android.webkit.WebViewClient
            @Deprecated(message = "\u0007K\fGvw\u0016k]Kg\u0004^T\u0016OrM")
            @InterfaceC1492Gx
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                Boolean boolHandleUrlOverride = handleUrlOverride(context, url);
                return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, url);
            }
        };
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strOd = C1561oA.od("\u0011}C\u0001d", (short) (C1580rY.Xd() ^ (1047979532 ^ (-1047980400))));
            String strKd = C1561oA.Kd("3\"", (short) (ZN.Xd() ^ ((216148103 ^ 1905593752) ^ 2104975815)));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strZd = Wg.Zd("q+\u001d\u0007'", (short) (OY.Xd() ^ (1975391262 ^ 1975393038)), (short) (OY.Xd() ^ ((1469428189 ^ 864714897) ^ 1679759030)));
                String strXd = C1561oA.Xd("xf", (short) (Od.Xd() ^ (10694110 ^ (-10705842))));
                try {
                    Class<?> cls2 = Class.forName(strZd);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strVd = Wg.vd("kX\"_?", (short) (OY.Xd() ^ ((2070105888 ^ 2049454130) ^ 21710416)));
                    String strKd2 = Qg.kd("\u000f\u0003", (short) (OY.Xd() ^ ((844312282 ^ 308055889) ^ 537902964)), (short) (OY.Xd() ^ (1513980274 ^ 1514001976)));
                    try {
                        Class<?> cls3 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls3.getField(strKd2) : cls3.getDeclaredField(strKd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        short sXd = (short) (OY.Xd() ^ ((186815415 ^ 1269164191) ^ 1082606628));
                        short sXd2 = (short) (OY.Xd() ^ ((793867875 ^ 706366058) ^ 88812467));
                        int[] iArr = new int["\u0014\u0001F\u0010o".length()];
                        QB qb = new QB("\u0014\u0001F\u0010o");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                            i2++;
                        }
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.ud("Q\\", (short) (C1580rY.Xd() ^ (1111868389 ^ (-1111862390)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1561oA.yd("WJLCS\\", (short) (OY.Xd() ^ (950197788 ^ 950174926)))};
                                Method method = Class.forName(C1561oA.Yd("Q_Vec^Z%[hhoakr-Cppwi}z", (short) (C1499aX.Xd() ^ ((1494196226 ^ 1116682023) ^ (-461413629))))).getMethod(Jg.Wd("\u007f\u001c\u000e\u000b\u0014,\u0010\u001f\n.\u0003N\u0015F\u0003C", (short) (FB.Xd() ^ (926362316 ^ 926351856)), (short) (FB.Xd() ^ (1726087720 ^ 1726097698))), Class.forName(Xg.qd("iawc1pftn6\\~}u{u", (short) (C1607wl.Xd() ^ (124848157 ^ 124852791)), (short) (C1607wl.Xd() ^ (1078131152 ^ 1078104180)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strXd2 = ZO.xd("\u0002\u001c?[9", (short) (FB.Xd() ^ ((680950260 ^ 1251301115) ^ 1644381244)), (short) (FB.Xd() ^ (395105235 ^ 395095091)));
                                    String strUd = C1626yg.Ud("T\u001e", (short) (ZN.Xd() ^ ((476474835 ^ 659154628) ^ 993001042)), (short) (ZN.Xd() ^ ((1838129979 ^ 797298600) ^ 1107961828)));
                                    try {
                                        Class<?> cls4 = Class.forName(strXd2);
                                        Field field4 = 0 != 0 ? cls4.getField(strUd) : cls4.getDeclaredField(strUd);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    short sXd3 = (short) (Od.Xd() ^ ((6924243 ^ 1019744773) ^ (-1017235161)));
                    int[] iArr2 = new int["O\u000e&A5".length()];
                    QB qb2 = new QB("O\u000e&A5");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    String strOd2 = EO.Od("p\u0013", (short) (FB.Xd() ^ ((282344364 ^ 1694065598) ^ 1949118996)));
                    try {
                        Class<?> cls5 = Class.forName(str);
                        Field field5 = 0 != 0 ? cls5.getField(strOd2) : cls5.getDeclaredField(strOd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strQd = C1561oA.Qd("\u000bw=z^", (short) (FB.Xd() ^ ((1184917358 ^ 262417094) ^ 1225024729)));
                        String strZd2 = C1593ug.zd("H>", (short) (C1580rY.Xd() ^ (933854517 ^ (-933842968))), (short) (C1580rY.Xd() ^ ((838923621 ^ 137435735) ^ (-976351546))));
                        try {
                            Class<?> cls6 = Class.forName(strQd);
                            Field field6 = 0 != 0 ? cls6.getField(strZd2) : cls6.getDeclaredField(strZd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i4 = 326444821 ^ 326444894;
                        if (x2 > i4 && x2 < displayMetrics.widthPixels - i4 && y2 > i4 && y2 < displayMetrics.heightPixels - i4) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(R.layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(R.id.com_braze_webview_activity_webview);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        if (ViewUtils.isDeviceInNightMode(applicationContext)) {
            if (Build.VERSION.SDK_INT >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (Build.VERSION.SDK_INT >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("url")) == null) {
            return;
        }
        webView.loadUrl(string);
    }
}
