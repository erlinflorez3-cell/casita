package com.braze.ui.inappmessage;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import com.dynatrace.android.callback.Callback;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,[*rK;c8\u0006\"\u000f^Vg}nRZ\u0011F\u0017\u0006,xr,OZ\u0001](\u000f:BuE;M}FA`z<\r H\"@y\u0013\u0007\"*^\u0010~zIN\u0014\u0012>@x:X\u000fU\u0005(\u001e\u000e>&\u0002&\\}N>Hr^B/9\u0003qBT'g0\u0013M\u0015Ͽ\\'#vi\u001e1@?5+%[\u0003\rRc?\u0019?y=\u000bj-;Aɞ\u0012:fX.\u0013M*2M?x+l\t_`$'YPsO^\u0010@w)~\u001d@\u0012\u0012\u001e'v3=\u001et\u000e&3#ycF^\nvD\u0016y\u0010?'+\u000e=C;1e\u007fjK\u001f\\B\u0014\u0007#\u001dQ\u0002~/aT\u001cl-#dya1\u007fASG|\u0017iEs\u0004~p\u001a,\u001a/u\u0001\u009e\u007f\u0011<&m=i\u007f;!\u001aI\u000fX0\u001d\u0013)\u0001S\u0018\u001axD08.7X(<^Rf\u001dk~W\t0\u001fM4T5~8\u0017.`\u0010<O*Vb\u0018zw5e]8l_n=Y|7&YO]a\u0002\u0018wXg`D,?j*Kl/HaZr\\Vix\\3\u001e\u0006K\\N:cbC\u007fmL,_O#)\u0011\t,\u0015Y|7'!|X\u0005b\u0007<\u0003\u0018x;\u001dIVjF\bg'\u001er\u0011)(;\u0018i5G}\u001c61:\u000b{\u001f~\"Y\u000e{\u0015eZG.u\u0004CP\u001a(;i/k\u0016?\u000372\u001a-sM#i_Q*')\u0002@#\u0004x<C j\u001f\t\u0011pXQl\u00198u\rui\u001c-\u000e\b?^zu\u0003\u0005\u000fi\u001dar19\u0003b\u0001\u000b\u0013\u007f6%/7R\u0001C\f['Ku>(w#o?\u0002o\\A\u0013\u00134F}\u0004Z\u001a\\\u00043qk>S@Y[\u000f>P%\u0003\u0002pUA͂\u0014ɚ\r@\u0015Ή`Cj\u0001dIm\r5\u0010t\u001a|'~as<)n,5\u0005ʕ6ϵG\n\u001c٫['\u0017aa|\u000eoQr\u0019a_$\u0019\nIp(\u001bk!-͇nס4\u0012{̸NCAz\u0013Q)&:EJ\u001f[Wbs\u001e\u0012\u0011~theĶ4¡wA^ՕlzbpV 1Wn'B\u0001-\u0016\nͿz\u00985\u000buۮl1iN\u000fpm#)\tg\u0001|$Yc+ں'Ϝ\\\r\u0013ԵuEO\"D%g+s\u000e}/\t2\u000bAZ\u001a18\u007f66ے<Ϳ\u000fal̯|x\u0018\r`uB+\u0005#\u000b7\r\u001c\u001d\r1O!r9ιNϸ{=K\u05ce\u0019\u0019JS\u00157M{TGE\u0006cZ\u0014ƭl͂+\b_ėK\u007f\u000eN.V\u001cv'\re?7\u001ck\u001bR\u0016 \u00179ֆ\u000b\u07b3T&\f˸bvx<<\u001d\u0007a\u00107\u001a\u0013\r^Bփ#͛+1tݩZMn,\u0018\u0018={|\u000b#\u0003\u0015g-ӊz\u0094T)\u0011ްe0\u0019\u000ehq1U&\u0011\u001f9d)4'N\nx(>X:׃rքSa\u0015ċGm0\u001c?K#8\fZ\u0012w\u001a)\u0003)k͞b؉Bp\u0011Ϟ\u0005D]Jl\u007fHfzI7+M3V\u001d)/DH\u0003\u001e\u0013oG\u001b/[;\b\u000fFlQY(11\u0001\u007f+9B\u000b\u001ehURỴn߰\u00046Jռ\u000b\u0002mn;\nt? kgiޏhf"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u001bv&1i\u0005/\u001bvq9X+;yB\u001a\u0017hR=\u0007u\u001e[r2RL[\u0002", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW Z.\u0011d\t\b7{$*OC,o40\u0007u]D\u0012c9$", "7m0=c\u0014>a'z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "7m0=c\u0014>a'z|^\u001d\u0001\tAL\u0004){>\u0015\u0015\u001eGV\u0012J\u0006%>Y\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001dRv9.PO,ZfpD\u0014x^\u001c]+\u0016\u0005f\u0017", "1n]3\\.N`\u0015\u000e~h5g\u00169v\u0004'{M", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "=oT;\\5@/\"\u0003\u0003Z;\u0001\u00138", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", "1k^@\\5@/\"\u0003\u0003Z;\u0001\u00138", "1kX0^(;Z\u0019b\u0004:7\bp/s\u000e$}@q\u001b\u0017Y", "0tcAb5/W\u0019\u0011\t", "", "1k^@X\tNb(\t\u0004", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011l\u001b8\f%~a\b\u001f7t$wQL7v?&\u0015vo5\tcu2Z0#WY\u0014\\`\u00019\u0016\u00120tL5\u0015NVN \u0004D\u0001/\fuM\u000b7s\f\u0014\u0016\u001cCfrB \u0017K\b$uJ)uT#C]P\u001dPm\u0012d\u001am\u0019^:+(\u0014\u0004\u007f\u001fiP,\u001eyZ\u0011YV\bvgP\u0019\b\u000e\u000b<wc\u0010B|QQtp\u001dU\u0005x\u00164h\u0002'\u00041\u000e=s\u0013q\u0001`guHgy\u0019.lN#5:F\u001c*Xm\u0007p=\u000eutH\u0004\u0017aB;\u001dd/tL\u000f\u0019'\u0013d9i[\u0010;\\\u000f\b%x\u0019/B\u000eFe\u0003jo\u0003-lrSG\u001a\u001e\u0012\u001epVk[\u001a\u0007\u000bb' 8\u001f\u00075\u0018l2[FQ\u001d\u0012>\u001f\b\u0005XP\u001ftGY~Orm!`(6\u000bf0&/\\8@bRs\u0017_\u001b\u0005\u0019\u000erZeKxC\u001d)$\u0007j<brx{kS4n+)", "5dc\u000fh;M]\"o~^>\u000b", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u000fh;M]\"o~^>\u000b", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0010_0<Y\u0015{\u0002^\u0010\u0006d:pg(\nN|\u0019\u00178s\u000eN", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "Adc\u0010_0<Y\u0015{\u0002^\u0010\u0006d:pg(\nN|\u0019\u00178s\u000eN", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q\u0004q", "5dc\u0010_6LSu\u000f\nm6\u0006", "Adc\u0010_6LSu\u000f\nm6\u0006", "5dc\u0010_6LW\"\u0001Vg0\u0005\u0005>i\n1", "u(;.a+K]\u001d}Do0|\u001bxa\t,\u0004<\u0010\u001b!P9iEz-1h\u0002*@C", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "u(;0b4\bP&z\u0010^uz\u00138f\u0004*\fM|&\u001bQxW\u0019\u0004!JY[*@n\u001a0]P7z8(\u001eSnC\u0018g+N\u0004|", "1n]AX5MD\u001d~\r@9\u0007\u0019:P{5{I\u0010}\u0013[y\u001eK", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "5dc\u0010b5MS\"\u000ekb,\u000fj<o\u00103f<\u000e\u0017 VV\nP\u00015D", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\"\u000e!'RE", "Adc\u0010b5MS\"\u000ekb,\u000fj<o\u00103f<\u000e\u0017 VV\nP\u00015D", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3~", "2hb:\\:L@)\b\u0004Z)\u0004\t", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "5dc\u0011\\:FW'\rgn5\u0006\u0005,l\u007f", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "Adc\u0011\\:FW'\rgn5\u0006\u0005,l\u007f", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", "5dc\u0016a\bI^\u0001~\tl(~\t", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076ED\n\u0013\"Rw\u000eJ\u0005!7YG\u0004\u001bvq9X+;yB\u001a\u0017h7", "7m0=c\u0014>a'z|^\n\u0004\u0013=e\r", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M!BuB\u001e\">", "5dc\u0016a\bI^\u0001~\tl(~\t\rl\n6{M?\u0013 Py\u001d8\u0006)?b\f", "u(E", "5dc\u0016a\bI^\u0001~\tl(~\t\rl\n6{M", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@\t>5\t+\u001fm$<IE;I;(#hn\u000f", "5dc\u0016a\bI^\u0001~\tl(~\t i\u007f:", "5dc\u0016a\bI^\u0001~\tl(~\t i\u007f:bD\u0002\u0017\u0015[m\u0015<])Ch})7z", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@,9g\r @m#<\u0017'\u001ft\u0010) PaG\u0015_.Ng+G^50]RpQ\u0012\u0019ZtR9\u001c\u0005bA1D", "7r0;\\4:b\u001d\b|<3\u0007\u0017/", "", "u(I", "Adc\u000ea0FO(\u0003\u0004`\n\u0004\u0013=e", "uY\u0018#", "5dc\u001cc,GW\"\u0001Vg0\u0005\u0005>i\n1", ">qTC\\6Na \u0013[h*\r\u0017/dp,{R", "5dc\u001de,OW#\u000f\te@]\u0013-u\u000e(z1\u0005\u0017)", "Adc\u001de,OW#\u000f\te@]\u0013-u\u000e(z1\u0005\u0017)", "DhTD4*<S'\r~[0\u0004\r>y`/wBh\u0013\"", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc#\\,P/\u0017|zl:\u0001\u00063l\u00047\u0010!\b\u0013\u0019/k\u0019", "u(;7T=:\u001d)\u000e~eu_\u0005=hg$\u0007\u0016", "Adc#\\,P/\u0017|zl:\u0001\u00063l\u00047\u0010!\b\u0013\u0019/k\u0019", "uKY.i(\bc(\u0003\u0002(\u000fx\u00172M{3Q\u0004q", "/cS\u0011\\:FW'\rgn5\u0006\u0005,l\u007f", "", "/cS\u0016a\bI^\u0001~\tl(~\t i\u007f:jJq\u001b\u0017YQ\u001bF\u00070", ">`a2a;/W\u0019\u0011\\k6\r\u0014", "/m]<h5<Sy\t\b:*z\t=s\u0004%\u007fG\u0005&++pv<t%Cgy-K", "4`[9U(<Yt|x^:\u000b\r,i\u0007,\u000bTh\u0017%Uk\u0010<", "", "1k^@X", "1k^@X\u0010G/$\nb^:\u000b\u00051ep,{R", "1qT.g,\u001a\\\u001d\u0007vm0\u0007\u0012\u0016i\u000e7{I\u0001$", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007^\u0013v\u001a6IR?u=\u0005\u0019vp9\u0010c9$", "=oT;\\5@", "1qT.g,\u001bc(\u000e\u0005g\n\u0004\r-kf,\nO\u0001 \u0017T}", "1qT.g,\u001cZ\u001d|\u0001E0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "1qT.g,\u001cZ#\rzB5X\u0014:M\u007f6\n<\u0003\u0017tNs\fB])Ch})7z", "1qT.g,\u001dW'\u0007~l:Z\u00056l|$yF\u000f", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001c_GFk\u0013\"#peG\u0015R6^t*.P\\;\\[rJRp^\u001cV/\u001b\u00137=+uA3\u001d\u000e:\u001f", "1qT.g,-])|}:>x\u0016/L\u00046\u000b@\n\u0017$", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u001dWS9n\u00100\u0011ua'\u0019g7NU+UTR:jA|M\u0012\u0015A\u0012\\:\r\u000eYNbR3A/\u0006/0\u0006Iw\u0001\u0015\u0016\u001b\u000b", "4h]._0SS\n\u0003zp\t|\n9r\u007f\u0007\u007fN\f\u001e\u0013[", "5dc\u0019T@Hc(ivk(\u0005\u0017", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U.k\"F\u00074 U\u000b\u001c?{k", "5dc\u001dT9>\\(o~^>^\u00169u\u000b", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "=oT;", "Adc\u000ea+,b\u0015\f\n:5\u0001\u0011+t\u00042\u0005", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {
    public static final Companion Companion = new Companion(null);
    private List<? extends View> buttonViews;
    private View clickableInAppMessageView;
    private View closeButton;
    private final Animation closingAnimation;
    private final BrazeConfigurationProvider configurationProvider;
    private ViewGroup contentViewGroupParentLayout;
    private Runnable dismissRunnable;
    private final IInAppMessage inAppMessage;
    private final InAppMessageCloser inAppMessageCloser;
    private final View inAppMessageView;
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;
    private final Animation openingAnimation;
    private View previouslyFocusedView;
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjGRLeV4Zݷ2\u000fy\u001f<řaҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f1\u0014\u0017\u0011jZK\u0006~k\u0015'4Xnm7}\u007fK>x\u0001F\u000702P?\n\u0007\u0011\u001aXO>|CeY\u0014*0nrjX\u001bP\u001d\u001c(\u0005l$1.jlfBXnm:]*\u0013kRNUf^\u0006֚\u0011P"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u001bv&1i\u0005/\u001bvq9X+;yB\u001a\u0017hR=\u0007u\u001e[r2RL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "@db2g\bEZ\n\u0003zp\u000e\n\u0013?p]+\u007fG\u007f$\u0017P^\u0018'\u0004%F]\b0EI\u0014,MQIo1\"\u001clpMgj(P`4#\\]6", "", "DhTD:9Hc$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "DhTD4*<S'\r~[0\u0004\r>y`/wBh\u0013\"", "", "", "Adc\u000e_3/W\u0019\u0011\\k6\r\u0014\rh\u0004/zM\u0001 rUX\u0018ER#3Y\f.;j\u001a5QROO<)\u001fup5\u0010r", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            Intrinsics.checkNotNullParameter(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion$resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
                    }
                }, 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (viewAccessibilityFlagMap.containsKey(Integer.valueOf(id))) {
                        Integer num = viewAccessibilityFlagMap.get(Integer.valueOf(id));
                        if (num != null) {
                            ViewCompat.setImportantForAccessibility(childAt, num.intValue());
                        }
                    } else {
                        ViewCompat.setImportantForAccessibility(childAt, 0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> viewAccessibilityFlagMap) {
            Intrinsics.checkNotNullParameter(viewAccessibilityFlagMap, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$Companion$setAllViewGroupChildrenAsNonAccessibilityImportant$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
                    }
                }, 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    viewAccessibilityFlagMap.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnj?6ld߉4Ziճ?k*3l*2q[;\u0004\u001b.&\u0017Qfg\u0016qz^\u0019G'\u0006D}\u001b0W[\u0011]@\u0014bF}FKM\u001eBid\u0003>\u001d `'h}\u0013\n2*v\u0015'~QU$\u0012^E!>`\u0018e\u0005H\u00176B.\r6\\\u0016S|\\ǶaG"}, d2 = {"1n\\{U9:h\u0019H\u000bbu\u0001\u0012+p\u000b0{N\u000f\u0013\u0019G9l<w!E`\r\u0004@I!95CIy0 \u0015Ye9\u0019U9J\u00022GY\r6gR{{`", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIg\u0013+Q\u007f\u001d\u001ay!>[}\u0007;{%.VCHA", "=m;.l6Nbv\u0002vg.|", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ":dUA", "", "Bn_", "@hV5g", "0ncAb4", "=kS\u0019X-M", "=kS!b7", "=kS\u001f\\.Ab", "=kS\u000fb;M]!", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ViewOnLayoutChangeListenerC10172 implements View.OnLayoutChangeListener {
        final /* synthetic */ ViewGroup $parentViewGroup;
        final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

        ViewOnLayoutChangeListenerC10172(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
            this.$parentViewGroup = viewGroup;
            this.this$0 = defaultInAppMessageViewWrapper;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLayoutChange$lambda$0(DefaultInAppMessageViewWrapper this$0, ViewGroup parentViewGroup) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(parentViewGroup, "$parentViewGroup");
            this$0.addInAppMessageViewToViewGroup(parentViewGroup, this$0.getInAppMessage(), this$0.getInAppMessageView(), this$0.getInAppMessageViewLifecycleListener());
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, final int i3, int i4, final int i5, int i6, int i7, int i8, int i9) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.$parentViewGroup.removeOnLayoutChangeListener(this);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2$onLayoutChange$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Detected (bottom - top) of " + (i5 - i3) + " in OnLayoutChangeListener";
                }
            }, 7, (Object) null);
            this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
            final ViewGroup viewGroup = this.$parentViewGroup;
            final DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = this.this$0;
            viewGroup.post(new Runnable() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultInAppMessageViewWrapper.ViewOnLayoutChangeListenerC10172.onLayoutChange$lambda$0(defaultInAppMessageViewWrapper, viewGroup);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view) {
        this(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, null, null, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, null);
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list) {
        this(inAppMessageView, inAppMessage, inAppMessageViewLifecycleListener, configurationProvider, animation, animation2, view, list, null, 256, null);
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
    }

    public DefaultInAppMessageViewWrapper(View inAppMessageView, IInAppMessage inAppMessage, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener, BrazeConfigurationProvider configurationProvider, Animation animation, Animation animation2, View view, List<? extends View> list, View view2) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.inAppMessageView = inAppMessageView;
        this.inAppMessage = inAppMessage;
        this.inAppMessageViewLifecycleListener = inAppMessageViewLifecycleListener;
        this.configurationProvider = configurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view;
        this.buttonViews = list;
        this.closeButton = view2;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        if (getInAppMessage() instanceof InAppMessageSlideup) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks());
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        this.inAppMessageCloser = new InAppMessageCloser(this);
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        createButtonClickListeners();
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i2 & 128) != 0 ? null : list, (i2 & 256) == 0 ? view3 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDismissRunnable$lambda$8() {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addInAppMessageViewToViewGroup$lambda$1(View inAppMessageView, DefaultInAppMessageViewWrapper this$0, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "$inAppMessageView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (windowInsetsCompat == null) {
            return new WindowInsetsCompat(windowInsetsCompat);
        }
        IInAppMessageView iInAppMessageView = (IInAppMessageView) inAppMessageView;
        if (iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not reapplying window insets to in-app message view.";
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$addInAppMessageViewToViewGroup$2$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Calling applyWindowInsets on in-app message view.";
                }
            }, 6, (Object) null);
            iInAppMessageView.applyWindowInsets(windowInsetsCompat);
        }
        return windowInsetsCompat;
    }

    public static /* synthetic */ void announceForAccessibilityIfNecessary$default(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: announceForAccessibilityIfNecessary");
        }
        if ((i2 & 1) != 0) {
            str = "In app message displayed.";
        }
        defaultInAppMessageViewWrapper.announceForAccessibilityIfNecessary(str);
    }

    private static final void createButtonClickListeners$lambda$6$lambda$5$lambda$4$lambda$3(DefaultInAppMessageViewWrapper this$0, MessageButton button, IInAppMessageImmersive immersiveMessage, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(button, "$button");
        Intrinsics.checkNotNullParameter(immersiveMessage, "$immersiveMessage");
        this$0.getInAppMessageViewLifecycleListener().onButtonClicked(this$0.getInAppMessageCloser(), button, immersiveMessage);
    }

    private static final void createClickListener$lambda$2(DefaultInAppMessageViewWrapper this$0, View view) {
        List<MessageButton> messageButtons;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IInAppMessage inAppMessage = this$0.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (this$0.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        this$0.getInAppMessageViewLifecycleListener().onClicked(this$0.getInAppMessageCloser(), this$0.getInAppMessageView(), this$0.getInAppMessage());
    }

    private static final void createCloseInAppMessageClickListener$lambda$7(View view) {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static /* synthetic */ void getInAppMessageCloser$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createButtonClickListeners$--V, reason: not valid java name */
    public static /* synthetic */ void m7063instrumented$0$createButtonClickListeners$V(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive, View view) {
        Callback.onClick_enter(view);
        try {
            createButtonClickListeners$lambda$6$lambda$5$lambda$4$lambda$3(defaultInAppMessageViewWrapper, messageButton, iInAppMessageImmersive, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createClickListener$--Landroid-view-View$OnClickListener-, reason: not valid java name */
    public static /* synthetic */ void m7064xb87f69b(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        Callback.onClick_enter(view);
        try {
            createClickListener$lambda$2(defaultInAppMessageViewWrapper, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$createCloseInAppMessageClickListener$--Landroid-view-View$OnClickListener-, reason: not valid java name */
    public static /* synthetic */ void m7065x50f7b5f4(View view) {
        Callback.onClick_enter(view);
        try {
            createCloseInAppMessageClickListener$lambda$7(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new Runnable() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultInAppMessageViewWrapper.addDismissRunnable$lambda$8();
                }
            });
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    public void addInAppMessageViewToViewGroup(ViewGroup parentViewGroup, IInAppMessage inAppMessage, final View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Intrinsics.checkNotNullParameter(parentViewGroup, "parentViewGroup");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        inAppMessageViewLifecycleListener.beforeOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Adding In-app message view to parent view group.";
            }
        }, 7, (Object) null);
        parentViewGroup.addView(inAppMessageView, getLayoutParams(inAppMessage));
        if (inAppMessageView instanceof IInAppMessageView) {
            ViewGroup viewGroup = parentViewGroup;
            ViewCompat.requestApplyInsets(viewGroup);
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda2
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$1(inAppMessageView, this, view, windowInsetsCompat);
                }
            });
        }
        if (inAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup.3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message view will animate into the visible area.";
                }
            }, 7, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup.4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message view will be placed instantly into the visible area.";
                }
            }, 7, (Object) null);
            if (inAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(inAppMessage, inAppMessageView, inAppMessageViewLifecycleListener);
        }
    }

    public void announceForAccessibilityIfNecessary(String str) {
        if (!(getInAppMessageView() instanceof IInAppMessageImmersiveView)) {
            if (getInAppMessageView() instanceof InAppMessageHtmlBaseView) {
                getInAppMessageView().announceForAccessibility(str);
                return;
            }
            return;
        }
        String message = getInAppMessage().getMessage();
        if (!(getInAppMessage() instanceof IInAppMessageImmersive)) {
            getInAppMessageView().announceForAccessibility(message);
            return;
        }
        IInAppMessage inAppMessage = getInAppMessage();
        Intrinsics.checkNotNull(inAppMessage, "null cannot be cast to non-null type com.braze.models.inappmessage.IInAppMessageImmersive");
        getInAppMessageView().announceForAccessibility(((IInAppMessageImmersive) inAppMessage).getHeader() + " . " + message);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            Companion.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (!getInAppMessage().getAnimateOut()) {
            closeInAppMessageView();
        } else {
            setAnimatingClose(true);
            setAndStartAnimation(false);
        }
    }

    public void closeInAppMessageView() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.closeInAppMessageView.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Closing in-app message view";
            }
        }, 7, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.closeInAppMessageView.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Returning focus to view after closing message. View: " + DefaultInAppMessageViewWrapper.this.getPreviouslyFocusedView();
                }
            }, 7, (Object) null);
            try {
                View previouslyFocusedView = getPreviouslyFocusedView();
                if (previouslyFocusedView != null) {
                    previouslyFocusedView.requestFocus();
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.closeInAppMessageView.3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to request focus on previous view";
                    }
                }, 4, (Object) null);
            }
        }
        getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
    }

    public Animation.AnimationListener createAnimationListener(boolean z2) {
        return z2 ? new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createAnimationListener.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (DefaultInAppMessageViewWrapper.this.getInAppMessage().getDismissType() == DismissType.AUTO_DISMISS) {
                    DefaultInAppMessageViewWrapper.this.addDismissRunnable();
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1$onAnimationEnd$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "In-app message animated into view.";
                    }
                }, 7, (Object) null);
                DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
                defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.getInAppMessage(), DefaultInAppMessageViewWrapper.this.getInAppMessageView(), DefaultInAppMessageViewWrapper.this.getInAppMessageViewLifecycleListener());
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        } : new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createAnimationListener.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
    }

    public void createButtonClickListeners() {
        IInAppMessage inAppMessage = getInAppMessage();
        final IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if (iInAppMessageImmersive != null) {
            if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createButtonClickListeners$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Cannot create button click listener since this in-app message does not have message buttons.";
                    }
                }, 7, (Object) null);
                return;
            }
            List<View> buttonViews = getButtonViews();
            if (buttonViews != null) {
                int i2 = 0;
                for (Object obj : buttonViews) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    View view = (View) obj;
                    final MessageButton messageButton = (MessageButton) CollectionsKt.getOrNull(iInAppMessageImmersive.getMessageButtons(), i2);
                    if (messageButton != null) {
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda3
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                DefaultInAppMessageViewWrapper.m7063instrumented$0$createButtonClickListeners$V(this.f$0, messageButton, iInAppMessageImmersive, view2);
                            }
                        });
                    }
                    i2 = i3;
                }
            }
        }
    }

    public View.OnClickListener createClickListener() {
        return new View.OnClickListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.m7064xb87f69b(this.f$0, view);
            }
        };
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new View.OnClickListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppMessageViewWrapper.m7065x50f7b5f4(view);
            }
        };
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createDismissCallbacks.1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object obj) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object obj) {
                Intrinsics.checkNotNullParameter(view, "view");
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createTouchAwareListener.1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void finalizeViewBeforeDisplay(IInAppMessage inAppMessage, View inAppMessageView, IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessageViewLifecycleListener, "inAppMessageViewLifecycleListener");
        if (ViewUtils.isDeviceNotInTouchMode(inAppMessageView)) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(inAppMessageView);
        }
        announceForAccessibilityIfNecessary$default(this, null, 1, null);
        inAppMessageViewLifecycleListener.afterOpened(inAppMessageView, inAppMessage);
    }

    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    public View getCloseButton() {
        return this.closeButton;
    }

    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public InAppMessageCloser getInAppMessageCloser() {
        return this.inAppMessageCloser;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage iInAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (iInAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.window.decorVie…yId(android.R.id.content)");
        return (ViewGroup) viewFindViewById;
    }

    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public boolean isAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.open.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Opening in-app message view wrapper";
            }
        }, 6, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        final int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            Companion.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10172(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.open.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Detected root view height of " + height;
                }
            }, 7, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
        if (!BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, new OnBackInvokedCallback() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1
            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
                activity.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this);
            }
        });
    }

    public void setAndStartAnimation(boolean z2) {
        Animation openingAnimation = z2 ? getOpeningAnimation() : getClosingAnimation();
        if (openingAnimation != null) {
            openingAnimation.setAnimationListener(createAnimationListener(z2));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(openingAnimation);
        if (openingAnimation != null) {
            openingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public void setAnimatingClose(boolean z2) {
        this.isAnimatingClose = z2;
    }

    public void setButtonViews(List<? extends View> list) {
        this.buttonViews = list;
    }

    public void setClickableInAppMessageView(View view) {
        this.clickableInAppMessageView = view;
    }

    public void setCloseButton(View view) {
        this.closeButton = view;
    }

    public void setContentViewGroupParentLayout(ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setPreviouslyFocusedView(View view) {
        this.previouslyFocusedView = view;
    }

    public void setViewAccessibilityFlagMap(HashMap<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.viewAccessibilityFlagMap = map;
    }
}
