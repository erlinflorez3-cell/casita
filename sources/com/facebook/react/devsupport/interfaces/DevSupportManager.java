package com.facebook.react.devsupport.interfaces;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import java.io.File;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Яŋ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.H\u007f*,(w\u000ffp:8DsQ6RY-\u0017k\n@,[*tK;c \u0006\"\u000fPVgu}RZ!C\u0017\u0006\u001c{r,_U\u0001]\u0018\u0010:B\u0006?;MuBA`\u00036\r 8\"@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00128@\u0007:Z\rS\u0007\"\u0012\u001c>(\u0001$boNLHt]@/+\u0003\u007fBV'e0\u0005M#F\\'\u0013wi\u001eA@?5\u001b&[\u0003\u001dRc?\t?y=\u001bh/'1Q{WLX\b\u0014\u001b/W\rsr.\\\u000bRh\f5,WcQP\u0016(\u000ez\u0004\rB\t\u0014j=Ξ^-He@\u000e%g;mN{\u001a^p,+gDD=\u0002I*g*\u0017Woi1PMz3<dGI\u0001/\fl\u0010v\u0014I\u0006(W?\u0004X?^M8h\u0004\u0012L\u0003p5B\u0006FF.c,\u0017<L=9q8Q02&\u0011Tu-\u001d`\u0017\u007f\u001aXVw:p,6X:R~\r~\u0013$hVn+?\u0007LX\u00158 \u0013Nk(B/`(Peg\u0018$\u0014\u0002R+=#OY\u001d\u0018T{\u0002dAric>j\u0019\u001b\\EJ!\u001dX\u0015n\u001a0#b6aJH\u0019<> \r\\\u001aSJ? Hd0?Zt\u0015vEdf\n\u0013\u0017#rh>+\u000572G\u0002$#\u00181Tj2\bg'\u000fr!)0;\bi5GR\u0006&v{\u0015#5G:$\u0010uZ\u0011dlD\"\u0006\u007f.]29\u007fw\u00047W\u00057|\u001a-sx9\n\u001a\u0004 r\u0013\u0011\n\u0011Kh\\v\u0018r\u00012plZO\u00031P\u0010tqQT\u0015\u0018\b/^\u000fWed\u000b\nMYz\u0013_LPH|39L>\u0017nPI{Q\f7+d\u0010\u0014]A\u0012cw?F{x\u000eTE,(ty$AzQ\f^k<W,\u0017>P3\u001d\u0007P\n\u0003w6\u0016OXU9V\u0016|p\u0005d\u0014/w\u0014t\\D\r\u001f\u0003\f>!F\u00164\\nZwQU,^q4Wq\u001cu{Fc\\9v?\u000e\u0019UIn@%\u0004D\u001fepcH\u0006\"DfEI>\u001d<7-zP\u0005\u0018\u0019 li4<+\u0006T='\u0019HA\"\u001a\u001d2\u001d\u0007j6`\u0005\u000fq\u0011%8a\u0017\u000fa'?Yy\u000b{(l/\u0012^Gwe+)Mg~\u0015Q[Jb\u001d3*n\u007f9T\u000eIWfN\u0006](\u001cQ \u0010F~\u0015\u001dp-a]\u001a+m^H^9\u0002\u0015TrZ*hhMP8/\u0001\u000bvT\f%\nG99\u0014+CZ9\u00107qF1\u001bR\r\u001f\f+rv\u001f;qM-k618o\u0002eAS}6LfKLz/Ko\u000e\u00156$?\u0003\u001c\u007f\u0006z\u00027?\u0017DLPXe\u000b\n\\4fU\u0010\u0017\u001a\u0015tX\u001a\u0007QF5\u0010\u0005\bXJ\u0017^:gzJ\u0007U9\u0018-U'\f|-h\u001f\u001f&{/iͤ\\ϳ\u0015W8Z\u0017\u0002\"\u0018v1D\fz+&N\u0012mGֈQܣ\u0011/Gm0g?7#4\f'\u0012u23+Ӷ!ͪZWVf\u000ffzMw\u0010dv6qE\u001e7\"\u0015\u0001^]?\"\u000bпt۠h3O\u001b%k\u001bX1\u0019\u0012Wa(70\u0001Nqχ4цs,\u000f\u0013\tMp\u0006P:P\u001d\u000b\u007f\u0016A\u0004ĜVٗ\u001e+q&sz\u0011=\u001c]FZ 4!\u0010!/\tR6=\u000b3rՄSߥE\u001d)\u0003\u001bS\u0014\fW+C\biU;)/\fW´Aƺ5oRu=\u00111@_\u0002)v~=;4\u0014l}ګ\u0004ʩN\u0003ee\\0oN\u001aGSA\u0012WV~8Czڵ\bÑ'\u0004]3NOm\u0003\u0011h\u0002~\u001c(@5\u001dSyـnՐw\u000eDk\u001e\u001crl2FO$,\u001bZ=X<CزGޣl}#F\u0013o\"H̍\u0005ӽؗ\u0017\u0001\u0018Qw_YH\u0605Q#ܘa;"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!d\u0005HW}+Fq 70?Dj;\u001e\">", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dc\u0010h9KS\"\u000eV\\;\u0001\u001a3t\u0014", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "2de X;MW\"\u0001\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi;v%.ZD7i4,^GaJ\u0007j6Yv45L];`[tKi", "5dc\u0011X=,S(\u000e~g.\u000b", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u001f!F\u007f\u0015<\u0005n4Yz097\u001a7\\CHl0\u001c\u0015v+\u0018\u0007t,U\u00012GY<,kavF\u0016 0", "2de h7I]&\u000eZg(y\u0010/d", "", "5dc\u0011X=,c$\n\u0005k;\\\u0012+b\u0007(z", "u(I", "Adc\u0011X=,c$\n\u0005k;\\\u0012+b\u0007(z", "uY\u0018#", "2nf;_6:R\u0019}_L\t\r\u0012.l\u007f\t\u007fG\u0001", "", "5dc\u0011b>GZ#zy^+av\fu\t'\u0003@a\u001b\u001eG", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "8R1Ba+ES\tka?6\nu/m\n7{\u001f\u0001\u0014'Iq\u0012Ex", "5dc\u0017F\tN\\\u0018\u0006zN\u0019ci9rl(\u0004J\u0010\u0017uGl\u001e>x)>[", ":`bA89K]&\\\u0005h2\u0001\t", "", "5dc\u0019T:M3&\f\u0005k\n\u0007\u00135i\u007f", "u(8", ":`bA89K]&l\nZ*\u0003", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\"-\u0011fg\u001a\u0014_4NL", "5dc\u0019T:M3&\f\u0005k\u001a\f\u0005-k", "u(J\u0019V6F\u001d\u001azx^)\u0007\u00135/\r(w>\u0010`\u0016G\u0001\u001cL\u00020?f\ri;v%.ZD7i4,^Vp5\u0005i\r[r/G\"", ":`bA89K]&m~m3|", "5dc\u0019T:M3&\f\u0005k\u001b\u0001\u00186e", ":`bA89K]&m\u000fi,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0014+\"rn(\u001bn,$", "5dc\u0019T:M3&\f\u0005k\u001b\u0011\u0014/", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0016\u0017X}\u001eG\u0002/BhG$@|\u0016;N?9kBgtunC\u0014R@Yv|", "@dS\u000fb?!O\"}\u0002^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5!\u001e\u0014EkLi_5M}'T\"", "5dc\u001fX+\u001b],avg+\u0004\t<", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0016\u0017X}\u001eG\u0002/BhG$@|\u0016;N?9kBg\u0002h`\u0016\u0011v\u000fJ\u007f&NL[\u0002", "And?V,&O$n\be", "5dc b<KQ\u0019fvi\u001c\n\u0010", "And?V,.` ", "5dc b<KQ\u0019n\be", "/cS\u0010h:M]!]zo\u0016\b\u00183o\t", "", "=oc6b5'O!~", "=oc6b5!O\"}\u0002^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&RlH\u000bm51r0FSN92", "1qT.g,+]#\u000ekb,\u000f", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/o_\u0018X@", "1qT.g,,c&\u007fv\\,[\t6e\u0002$\u000b@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*\u000726U{ \u0016m\u001d.O?Jk\n", ";nSB_,'O!~", "2dbAe6R@#\t\nO0|\u001b", "@n^AI0>e", "2nf;_6:Ru\u000f\u0004]3|u/s\n8\t>\u0001w$Qw}I}\u0013Ib{", "\u001aiPCTuB]b_~e,R", "@db<h9<S\tka", "=tc=h;\u001fW ~", "6`]1_,+S \tv]\u0011j", "6`b\"c\u001bH2\u0015\u000ezC\u001aY\u00198d\u0007(_I^\u0013\u0015Jo", "6hS2C(Na\u0019}^g\u000b|\u0006?g\u0002(\t*\u0012\u0017$Nk\"", "6hS2E,=P#\u0012Yb(\u0004\u00131", "7r?.V2:U\u0019\fgn5\u0006\r8g", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u001f\u001a\u0013n];\u0007p\u001a]r6WZ,(cYo9\u0012\u00180", ":nP1F7EW([\u000bg+\u0004\t\u0010r\n0i@\u000e(\u0017T", "0t]1_,)O(\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&Vl@\u000br\t^\u007f&NL,(cYo9\u0012\u00180", "=m=2j\u0019>O\u0017\u000eXh5\f\tBt]5{<\u0010\u0017\u0016", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "=mA2T*M7\"\r\nZ5z\t\u000ee\u000e7\tJ\u0015\u0017\u0016", "=oT;7,;c\u001b\u0001zk", ">q^0X:L3&\f\u0005k\n\r\u0017>o\b,\u0011@\u000e%", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "3qa<e\u0010GT#", "@dV6f;>`x\f\bh9Z\u0019=t\n0\u007fU\u0001$", "3qa<e\nNa(\t\u0003bA|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0014+\"rn\u0017\u0017q;X~+\\L[\u0002", "@d[<T+#Ay\f\u0005f\u001a|\u0016@e\r", "0t]1_,.@\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0011.\u001egh9mm(MT#NSK(ZXH", "@d[<T+,S(\u000e~g.\u000b", "Adc\u000eW+Bb\u001d\t\u0004Z3f\u0014>i\n1\\J\u000e\u0002\u0013Eu\n>v2", "<`\\2", "D`[BX", "Adc\u0013c:\u001dS\u0016\u000f|>5x\u00066e~", "7r5=f\u000b>P)\u0001Zg(y\u0010/d", "Adc\u0015b;&]\u0018\u000f\u0002^\u0019|\u00146a}(\u0004@\n&vPk\u000bCv$", "7r7<g\u0014HR)\u0006zK,\b\u0010+c\u007f0{I\u0010v Cl\u0015<u", "Adc\u001dT*DO\u001b~\bE6z\u0005>i\n1YP\u000f&!Os#<\u0004", ">`R8T.>`\u007f\txZ;\u0001\u00138C\u00106\u000bJ\t\u001b,G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i\u0011]9\u0012\u0018V\u0010N8s\u000fW=3rN@|\u0018:X\fCl\u0016\f#c", "Adc\u001fX4Hb\u0019ch=,y\u00191E\t$xG\u0001\u0016", "7rA2`6MS}lY^)\r\u000b\u000fn{%\u0003@\u007f", "Ag^D7,O=$\u000e~h5\u000bg3a\u00072}", "Ag^DA,P8\u0007^\bk6\n", ";db@T.>", "2dc.\\3L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "3qa<e\nH]\u001f\u0003z", "Ag^DA,P8\u0015\u0010v>9\n\u0013<", ExifInterface.GPS_MEASUREMENT_3D, "", "Ag^DC(Na\u0019}^g\u000b|\u0006?g\u0002(\t*\u0012\u0017$Nk\"", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i\u0011]9$ Z\r24k\u0005VQ&pDD\t\u0019,V\t7|^\u0016\u001e\u00161so)Z\u001eVy\u001euN~", "AsP?g\u0010Ga$~xm6\n", "As^=<5L^\u0019|\nh9", "BnV4_,\u001eZ\u0019\u0007zg;`\u0012=p\u007f&\u000bJ\u000e", "CoS.g,#Ax\f\bh9", "\u001e`R8T.>`\u007f\txZ;\u0001\u00138C\u00106\u000bJ\t\u001b,G|", "\u001e`d@X+\"\\w~wn.~\t<O\u0011(\tG|+tQw\u00168\u007f$\u001c]\f/7v\u0016;", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface DevSupportManager extends JSExceptionHandler {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001bc8\u000f\u0004{b%\f*\u007fESW0|P\f\u0016r̭fñϽZ\u000fK\u0011\f5'i\u0082MYߍa\u0011"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i\u0011]9\u0012\u0018V\u0010N8s\u000fW=3rN@|\u0018:X\fCl\u0016\f#c", "", "@t]", "", "1`[9U(<Y", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface PackagerLocationCustomizer {
        void run(Runnable runnable);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004O\u00068é4'\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w\u05ec\u000eӆڗ4(c&wbiTۥ\u0002$ߜSM"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i\u0011]9$ Z\r24k\u0005VQ&pDD\t\u0019,V\t7|^\u0016\u001e\u00161so)Z\u001eVy\u001euN~", "", "=mA2f<FS", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface PausedInDebuggerOverlayCommandListener {
        void onResume();
    }

    void addCustomDevOption(String str, DevOptionHandler devOptionHandler);

    View createRootView(String str);

    SurfaceDelegate createSurfaceDelegate(String str);

    void destroyRootView(View view);

    File downloadBundleResourceFromUrlSync(String str, File file);

    Activity getCurrentActivity();

    DeveloperSettings getDevSettings();

    boolean getDevSupportEnabled();

    String getDownloadedJSBundleFile();

    String getJSBundleURLForRemoteDebugging();

    int getLastErrorCookie();

    StackFrame[] getLastErrorStack();

    String getLastErrorTitle();

    ErrorType getLastErrorType();

    RedBoxHandler getRedBoxHandler();

    String getSourceMapUrl();

    String getSourceUrl();

    void handleReloadJS();

    boolean hasUpToDateJSBundleInCache();

    void hidePausedInDebuggerOverlay();

    void hideRedboxDialog();

    void isPackagerRunning(PackagerStatusCallback packagerStatusCallback);

    void loadSplitBundleFromServer(String str, DevSplitBundleCallback devSplitBundleCallback);

    void onNewReactContextCreated(ReactContext reactContext);

    void onReactInstanceDestroyed(ReactContext reactContext);

    void openDebugger();

    Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair);

    void registerErrorCustomizer(ErrorCustomizer errorCustomizer);

    void reloadJSFromServer(String str, BundleLoadCallback bundleLoadCallback);

    void reloadSettings();

    void setAdditionalOptionForPackager(String str, String str2);

    void setDevSupportEnabled(boolean z2);

    void setFpsDebugEnabled(boolean z2);

    void setHotModuleReplacementEnabled(boolean z2);

    void setPackagerLocationCustomizer(PackagerLocationCustomizer packagerLocationCustomizer);

    void setRemoteJSDebugEnabled(boolean z2);

    void showDevOptionsDialog();

    void showNewJSError(String str, ReadableArray readableArray, int i2);

    void showNewJavaError(String str, Throwable th);

    void showPausedInDebuggerOverlay(String str, PausedInDebuggerOverlayCommandListener pausedInDebuggerOverlayCommandListener);

    void startInspector();

    void stopInspector();

    void toggleElementInspector();

    void updateJSError(String str, ReadableArray readableArray, int i2);
}
