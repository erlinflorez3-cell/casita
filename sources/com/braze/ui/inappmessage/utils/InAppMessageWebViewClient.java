package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewAssetLoader;
import androidx.webkit.WebViewClientCompat;
import com.braze.BrazeInternal;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
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
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV:ZS0\u000fs{J$cҕyCQU\"Ԃ*\t]Wo˧vJp\u000bKƤ\u000e\u0016\u0007p4կ]xs\u0012\u0017˰JoM3UڎE9vt>\u0005&6*8\u0010\u0005\t\u001a0I\u0018v\u0011CSÈ\u001a0VpBR\u0013N\u000b.(ß\\G1\u001e\u000bf\u00075o-\u0007J31\u0003\u0002B|(o4\u000bO%F\u0003*\u001d|o\"CBM4C*c\u000b\rRiE\u001bA\b<3oҊ++W{ Df\u0015,\u0015Ye=a\u0001=t\u0005\u007fxR's]qdh\u000eV\u0006+\u007f\u001bV\u001c\u000e4.\u000f.u t#&3#\t\u001a@\u0019\u0018l^\u0018z\u0010LG)\u000eJC9I~\u0002eI3f7*\fS2k\u0017|>sT<nE\u001fb\u000fi1\u007fXmL\\(q=\u001c#7vJ8\u0012P_\u007f]\u0012A4%FO]O\"O\u007fJdR\n\u000f\u0007vg\u0002\r\u0003NN9\u0007\u0018M)7$\u000bJr)\u0004RjWZ6\u00140\u001d#\f*+\"rvjDU\u0016\\f\u0001k\u0001L\f\"U5tQqp\u0002\r\u0006@%H}gq6yR%\"o@p\u001cpfpk<^jL:2v\u0010V\fDZ\\2+2m\u007fL8:H1\\C`3\"P[\u0015\t\u000ea/$O`A-\u001biR~_əRʷtooծ\u001a8\u000b`:-oR\fӪ(Ɓ&h<ês\u0013\r~\u0018G\u0016X\u001eƅnטyU\u0004\u008df&G^G=A\u001dUǾ>ī1ETǩ6][\u0014?z+|e\u0093j\u05cek\brѱ|nxNgV-!%cIֿ\nܐ\u0004yi¿KUqc#]TH!\u00130ߥZ̞\u0001\u0005'Ǉu\r}3\u00155[U}ݷ\u0018߳\u0018/\u001d˕.w}A\u0012d%%#yZϽo݁sbYϡя?`"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWL\u0006)<gG\u0004@I!95CIy0 \u0015Za6wg,`T.KLW;2", "\u001a`]1e6BR,H\r^)\u0003\r>/q(x1\u0005\u0017)%v\u0012<\u007f4\u0013c\u0006+3|k", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "7m0=c\u0014>a'z|^\u001e|\u0006 i\u007f:YG\u0005\u0017 VV\u0012J\u0006%>Y\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001eNs\u0018KL`\ncVrF#x^\u001c]+\u0016\u0005f\u0017", "/rb2g\u000bB`\u0019|\nh9\u0011x<l", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~V\u000b\u001cLm_6WB;rBg\u0019q]D\u0012k,\\\u0005#IL\u0018\u0010@[NH\u001fyZ\u001c\\'\u000f\u0005/(\"xL\u0001\u001c\u0015(^\u0002\u0005x\u0005U\u001a\u00171u{JV\u001eUu\u0017u\u000b0lTh_\u0003GNS,\u000eH\u0015;(g\":2\"m\u001b\u001bZP+z\u007fS#PY}gpV\u007f~F3>v[S\u001bVZ8\u0006#hRw\u0001\u0014{F\u00048x6\u0006\nm'", "/rb2g\u0013HO\u0018~\b", "\u001a`]1e6BR,H\r^)\u0003\r>/q(x1\u0005\u0017)#}\u001c<\u0006\f?U| DC", "6`b\u0010T3ES\u0018iv`,]\r8i\u000e+{?j }K}\u001d<\u007f%B", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "6`b\u001dT.>4\u001d\b~l/|\b\u0016o{'\u007fI\u0003", "", ";`a8C(@Sy\u0003\u0004b:\u007f\t.J\n%", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", ";`g\u001ca\u0017:U\u0019_~g0\u000b\f/dq$\u007fOo\u001b\u001fGW\u001c", "", "EdQ#\\,P1 \u0003zg;j\u0018+t\u007f\u000f\u007fN\u0010\u0017 G|", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u0012?C8\\8\u001e'Fh=\u0007l;<\u0006#VL50jarF\u0014\u001f0", "/o_2a+\u001b`\u001d}|^\u0011x\u001a+s}5\u007fK\u0010", "", "DhTD", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "6`]1_,.` h\f^9\n\r.e", "Cq[", ";`a8C(@Sy\u0003\u0004b:\u007f\t.", "=m?.Z,\u001fW\"\u0003\ta,{", "=mA2a+>`\u0004\f\u0005\\,\u000b\u0017\u0011o\t(", "2dc.\\3", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xR\u007f1z@\u000e\u0002$Qm\u000eJ\u0005\u0007?b}~7|\u00122T\u0019", "Adc$X)/W\u0019\u0011Xe0|\u0012>S\u000f$\u000b@g\u001b%Vo\u0017<\u0004", ":hbAX5>`", "Ag^B_+\"\\(~\b\\,\b\u0018\u001ce\f8{N\u0010", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%h@\u000f!'Tm\u000e)v3@c\u0007.7C", "@d`BX:M", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%h@\u000f!'Tm\u000e)v1EY\f/\r", "Ag^B_+(d\u0019\f\bb+|x<lf2w?\u0005 \u0019", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InAppMessageWebViewClient extends WebViewClientCompat {
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
    private static final String AUTHORITY_NAME_NEWSFEED = "feed";
    private static final String BRAZE_INAPP_MESSAGE_SCHEME = "appboy";
    private static final String BRIDGE_JS_FILE = "braze-html-in-app-message-bridge.js";
    public static final Companion Companion = new Companion(null);
    public static final String JAVASCRIPT_PREFIX = "javascript:";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private final WebViewAssetLoader assetLoader;
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private Job markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private IWebViewClientStateListener webViewClientStateListener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005)4\u0012\u000e\u0007nj?0JͣIDɟ\u0004*=j<9*[ҸuCIUb\f0\u0014gN\u0016s\u001fNh\u0018[\u000f4\u0018?o|Ucyu\u0012=4\u0019Ħ\u0012ݯQoEʠ1\u0001D\b82P:PڑSʀ.H\u0018͌KOY\u0010*0nr\u0011Ĩ_̂\t\u001a\u001aß\u000f,\u000f#tg|8\u001fǐ0Ơ3#\u000b݃\u0013Z5eH|{\u000f\u001dÙy˼za&Ѩ\u0011CC\u001c=S1\t)À\u0012ƄCqEݛ9353as\u00068/ãfƦ/O\u0015ƞC2j\u000ei`:)\u0002ՙ6ׂT\u000e0»K\b\u001bF\u001c\u000e4)\u001f͚\u007fբj\b\u0016ޗϨva"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWL\u0006)<gG\u0004@I!95CIy0 \u0015Za6wg,`T.KLW;\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "\u000fTC\u0015B\u0019\"B\rxc:\u0014\\\u0003\rLi\u0016[", "", "\u000fTC\u0015B\u0019\"B\rxc:\u0014\\\u0003\rUm\u0017e(zv\b'X|", "\u000fTC\u0015B\u0019\"B\rxc:\u0014\\\u0003\u0018Eq\u0016\\ `u", "\u0010Q0'8&\"<tieX\u0014\\v\u001dAa\bu.^yv/O", "\u0010Q8\u0011:\f88\u0007x[B\u0013\\", "\u0018@E\u000eF\n+7\u0004mtI\u0019\\i\u0013X", "\u001fT4\u001fL&'/\u0001^t;\u001ckw\u0019Ny\fZ", "\u001fT4\u001fL&'/\u0001^t=\f\\s\u0016Ih\u000e", "\u001fT4\u001fL&'/\u0001^t>\u001fkh\u001cN[\u000fu*kv\u007f", "5dc\u000fh5=Z\u0019_\bh4l\u00166", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "Cq[", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Bundle getBundleFromUrl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Bundle bundle = new Bundle();
            if (StringsKt.isBlank(url)) {
                return bundle;
            }
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(uri).entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "InAppMessageWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Uri uri) {
            super(0);
            uri = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Uri authority was null. Uri: " + uri;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<String> {
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Uri uri) {
            super(0);
            uri = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Uri scheme was null or not an appboy url. Uri: " + uri;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$onRenderProcessGone$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10851 extends Lambda implements Function0<String> {
        public static final C10851 INSTANCE = ;

        C10851() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "The webview rendering process crashed, returning true";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10861 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C01461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InAppMessageWebViewClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01461(InAppMessageWebViewClient inAppMessageWebViewClient, Continuation<? super C01461> continuation) {
                super(2, continuation);
                this.this$0 = inAppMessageWebViewClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01461(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.markPageFinished();
                return Unit.INSTANCE;
            }
        }

        C10861(Continuation<? super C10861> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return InAppMessageWebViewClient.this.new C10861(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10861) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain(), new C01461(InAppMessageWebViewClient.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str) throws Throwable {
        WebViewAssetLoader webViewAssetLoaderBuild;
        short sXd = (short) (C1499aX.Xd() ^ (-15946));
        int[] iArr = new int["U`^cSe`".length()];
        QB qb = new QB("U`^cSe`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(iInAppMessage, C1561oA.yd("OS%SR.ERQ>C@", (short) (Od.Xd() ^ (-22870))));
        this.context = context;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        short sXd2 = (short) (C1633zX.Xd() ^ (-4326));
        int[] iArr2 = new int["\u001f\u0018%\u001c\u001b\u001e$\"k!2\"<(".length()];
        QB qb2 = new QB("\u001f\u0018%\u001c\u001b\u001e$\"k!2\"<(");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        if (str != null) {
            webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().setDomain(str2).addPathHandler(Xg.qd("U", (short) (FB.Xd() ^ 29142), (short) (FB.Xd() ^ 784)), new WebViewAssetLoader.InternalStoragePathHandler(context, new File(str))).build();
        } else {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("x\u0002\u0014N\b.E\u000bl\u0015@\u0003\u0010EG-^Gr\u00152AY", (short) (ZN.Xd() ^ 13583), (short) (ZN.Xd() ^ 25450))).getMethod(ZO.xd("\u000f9Dvf\u0013\u001dii\u00077", (short) (FB.Xd() ^ 24888), (short) (FB.Xd() ^ 13183)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = new File((File) method.invoke(context, objArr), C1626yg.Ud("\f^\u001fd!PdQ\u00023.", (short) (C1633zX.Xd() ^ (-25449)), (short) (C1633zX.Xd() ^ (-15363))));
                webViewAssetLoaderBuild = new WebViewAssetLoader.Builder().setDomain(str2).addPathHandler(Ig.wd("\u0003na6[%HE#`sR[", (short) (OY.Xd() ^ 14599)), new WebViewAssetLoader.InternalStoragePathHandler(context, file)).build();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Intrinsics.checkNotNullExpressionValue(webViewAssetLoaderBuild, EO.Od("V&a\r6mU7yhdW\u0019\t\nk3 D\u000eJF1Q獉V9qO\"\npNil\u0017\u0005\\x\fl[\u0002obZ^\u0011?A", (short) (C1499aX.Xd() ^ (-4425))));
        this.assetLoader = webViewAssetLoaderBuild;
    }

    public /* synthetic */ InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iInAppMessage, iInAppMessageWebViewClientListener, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : str);
    }

    private final void appendBridgeJavascript(WebView webView) throws Throwable {
        try {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("jvkxtmg0domrbjo(<gejZlg", (short) (ZN.Xd() ^ 19941))).getMethod(C1593ug.zd("+*:\b;</??", (short) (C1607wl.Xd() ^ 28235), (short) (C1607wl.Xd() ^ 14468)), new Class[0]);
            try {
                method.setAccessible(true);
                AssetManager assetManager = (AssetManager) method.invoke(context, objArr);
                short sXd = (short) (Od.Xd() ^ (-18044));
                int[] iArr = new int["\t\u0014\u0012\u0017\u0007\u0019\u0014L~\u0010\u000f\u007f\u000e\f".length()];
                QB qb = new QB("\t\u0014\u0012\u0017\u0007\u0019\u0014L~\u0010\u000f\u007f\u000e\f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Intrinsics.checkNotNullExpressionValue(assetManager, new String(iArr, 0, i2));
                webView.loadUrl(Wg.Zd("?\u0017\u000bsfUB: \u0002H", (short) (OY.Xd() ^ 13784), (short) (OY.Xd() ^ 25855)) + BrazeFileUtils.getAssetFileStringContents(assetManager, C1561oA.Kd("BSC]I\u0012N[UU\u0017TZ\u001aO_`\u001e_XghW^]&\\meaed.ku", (short) (OY.Xd() ^ 28233))));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$appendBridgeJavascript$javascriptString$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to get HTML in-app message javascript additions";
                }
            }, 4, (Object) null);
        }
    }

    @JvmStatic
    public static final Bundle getBundleFromUrl(String str) {
        return Companion.getBundleFromUrl(str);
    }

    private final boolean handleUrlOverride(String str) {
        if (this.inAppMessageWebViewClientListener == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) AnonymousClass1.INSTANCE, 6, (Object) null);
            return true;
        }
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) AnonymousClass2.INSTANCE, 6, (Object) null);
            return true;
        }
        Uri uri = Uri.parse(str);
        Bundle bundleFromUrl = Companion.getBundleFromUrl(str);
        if (uri.getScheme() == null || !Intrinsics.areEqual(uri.getScheme(), BRAZE_INAPP_MESSAGE_SCHEME)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.handleUrlOverride.4
                final /* synthetic */ Uri $uri;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(Uri uri2) {
                    super(0);
                    uri = uri2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Uri scheme was null or not an appboy url. Uri: " + uri;
                }
            }, 7, (Object) null);
            this.inAppMessageWebViewClientListener.onOtherUrlAction(this.inAppMessage, str, bundleFromUrl);
            return true;
        }
        String authority = uri2.getAuthority();
        if (authority != null) {
            int iHashCode = authority.hashCode();
            if (iHashCode != -1801488983) {
                if (iHashCode != 3138974) {
                    if (iHashCode == 94756344 && authority.equals(AUTHORITY_NAME_CLOSE)) {
                        this.inAppMessageWebViewClientListener.onCloseAction(this.inAppMessage, str, bundleFromUrl);
                    }
                } else if (authority.equals(AUTHORITY_NAME_NEWSFEED)) {
                    this.inAppMessageWebViewClientListener.onNewsfeedAction(this.inAppMessage, str, bundleFromUrl);
                }
            } else if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                this.inAppMessageWebViewClientListener.onCustomEventAction(this.inAppMessage, str, bundleFromUrl);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.handleUrlOverride.3
                final /* synthetic */ Uri $uri;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(Uri uri2) {
                    super(0);
                    uri = uri2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Uri authority was null. Uri: " + uri;
                }
            }, 7, (Object) null);
        }
        return true;
    }

    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$markPageFinished$1$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
            }
        }, 6, (Object) null);
        iWebViewClientStateListener.onPageFinished();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$onPageFinished$1$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Page has finished loading. Calling onPageFinished on listener";
                }
            }, 6, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
        this.hasPageFinishedLoading = true;
        Job job = this.markPageFinishedJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) C10851.INSTANCE, 6, (Object) null);
        return true;
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener iWebViewClientStateListener) {
        if (iWebViewClientStateListener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            iWebViewClientStateListener.onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new C10861(null), 2, null);
        }
        this.webViewClientStateListener = iWebViewClientStateListener;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            return this.assetLoader.shouldInterceptRequest(webResourceRequest.getUrl());
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "\u0018Y\u0001t\u0005|$ldK\u0011\td\u001a>Qa\\\u001d\u0019\ny!W\nZ6aSv\u001aomc0\u0002Daj+K1BO$YQk'i]@xR|")
    @InterfaceC1492Gx
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.assetLoader.shouldInterceptRequest(Uri.parse(str));
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "request.url.toString()");
        return handleUrlOverride(string);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return handleUrlOverride(url);
    }
}
