package com.facebook.react.devsupport;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSplitBundleCallback;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яş\u0014D57\u001eq\u007fZDkt\nA\u000e0!.J~(-\u001aw\u001dfrˎ8D{H6RY+\u0017k\n=,[*uK;c&\u0006\"\u000fRVgutRZ\u0011D\u0017\u0006$\br,_U\u0001]\u0018\u0012:B\u0006?;Mu>A`\u000b6\r 8'@y\u0013\u0001\"*N\u0010~zYK\u0014۵8@\u0007:Z\rS\u0005\"\u0012\u001c>(\u0001$^oNLHt]@1+\u0003\u007fBV'u0\u0005M\u0013J\\'#vi\u001e1@?5+%[\u0003\rRc?\u0019?y=\u000bi/'AI{W<Y\b\u0014++W\rcr.\\\u001bQh\f-3WcaP\u0016(}~\u0004\rR\u0004\u0016\u0006-H6-(g\u0010\u000e9tzSVP\n^H\u0003\u0001uLЍU\u007fa*y\u001eƻUaI\u0019\u0017Q\n4%\u001eQ1\u001f'i\u0006&b+\u001a\u0003\u000b\u00027_rUJd\t\bp4\u00189t\u0010^\u001c2]~]1A4%[O]O\"O~H\\\ry\u0005<xjih\u0001\u0001p(|OO,\u001f\u000b\tW+\u00194`b\u0013D\u0011{L\u0005\r\fC+\"rvjVk$\u0017iv&\u0003Os\tSl\u0017;g-\u0004\u000e\u0006L\u000f9C\u0011{\u0012wQ%Q\u0006P+\u0017f'ZS:\u000b\r00s`n>:dD-OYF\bw*xD1G\r[\\K$P\u0007\u0015\t\u000ef/$GZAj\u001biR%O\u0015\u0019b~7\u007fxw\\Ctj;O\u001aM\u0019T\u0006RlBF;\u0007->F[0bU\u0018\u0005\u0016$\u0006,$$fQQ]PC\u0013\rrJ\u0002[\u0013\u0013\u0007._[`?z+*??v}\u007f\b\u0019Art3X]&/\"%\u000f#'\u00164\u0018y\u0010\u0017A[,Z\u0019.VI!3 P\u0017n\u000bX725\u0003\u007f\"+H=K7#&y$/C\u007f\f\u0007\u0006-(7?>\u0003;\u001c@s\u0018\u007fb\u007fpBCHOi\u0001N\"R\u000b1_^i&\\\t\u001d|\u001dA\u001fYd\u001f\u0007hS\u0019\u0007\u0016h\u001d+;I\u001do\u0003)}WL.\u000eZ$G\fnvCS$}Wu7\u0006K\u000bf\u0011#R\u0011\n\u000e\u0007\u0012Jmfj x\u0017\u000e\u001esFfq?pcT\tRG\\@\u0016j[T\u0018\u0019V\u000fHTmo/2p$kZ\u001c6\u0011\\\u0005TKt\u000en/\r\u0019~=cN|C\u0015\u001dmt`uwz\u0011a\u0002!\u001b\u0019\u007f/l3\u0011\\VO\u001aV?G\u001f\u000ekQ1\u001a62wYqyX$8F\tcV`!G;)_%`%\u001f\u001e\u0007\\O\u000f\u0012\u0015\u0003~(7j\u0013~$;8\";\u001f]_\bdCK|egG(o/DW R\u0011,`)\u001d\u001e5[myp\"\u0013\u0014Yi:,\u001bP&5E\r#rV<WPqcP$c.b09CT.oFJ#\u0006:2\u0016)g\u0002auYr\"q\u0006\u0016X'Y\u001dLV\u0014n\u0007\u007f{l\u0012\u001f\u001c\u001fKl?M\u0012n[\u0001c\u001doo<\u000bpZhA\u0004&f|\u0018\u0016+%MI8h7|ge~o\u001a=\f\u00119\u001e\u0004*\u0010Jvfn\u0012-z\u000e\u0006@SV\u0017q+$̕fԚ`pZY\u0014ax,5\u0001\u001a.,|-N5ƺ\u0015̭Jr&ҋ\u007fK'&s\u000f]_5\f{\u001e|Њ3ĿC\u001fO4\u0011x6\u0001a%Ho\r\u007fXN9v\u000erD-t`sne.zݽp݁*U]:H\u0016: .\u00135jF1\u000fp(.SSI@G$7i\u000fۤq߁\u001d9\u0003SY98\u0016M\u0015\u001bU\u00123\u00029\"J)w\u0006ހq\u0088[jS';|Z<\\\u0014sb\u0017M\u0012oeʿnޜ9K&\u0099mB\u0006$-?t \u0004?\u0018MAJ:_\u000b^lr\u0006!\\~\r˫FďKp\u0011u\u0010Kw8Dxi\u0003LC\u0011\u0013GWt~\u0004ă\tƘQl\u0012\rJ/S)\b#\u0014LK\u0019\u0013\u000f}\u0016v\u007f ׳OҰ`aT\u0015y)HX2J\bnX[@\u0005[:\u000b8Aݮǒc\u0014P\u0014\u00136\u0012\"\u0002fn+x\u001f.&y\n|\u000b3ܥOیf\u000fX\u0011*\u000b<W\\\u001f\u0014CFJ-\u0001,]\u0017iiлIضEK*X\u0002O+&ج)~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~F}'7i$.,CLYD) rnHn_5Jx'T\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "u(E", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dc\u0010h9KS\"\u000eV\\;\u0001\u001a3t\u0014", "u(;.a+K]\u001d}DZ7\bR\u000bc\u000f,\rD\u0010+l", "2dU.h3M8\u0007^\u000e\\,\b\u00183o\t\u000bwI\u007f\u001e\u0017T", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001bv&1i\u0005/\u001c[uAKCFz8(\u001eK]B\u0006j,[L", "2de X;MW\"\u0001\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006u%2i\u007fi;v%.ZD7i4,^GaJ\u0007j6Yv45L];`[tKi", "5dc\u0011X=,S(\u000e~g.\u000b", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u001f!F\u007f\u0015<\u0005n4Yz097\u001a7\\CHl0\u001c\u0015v+\u0018\u0007t,U\u00012GY<,kavF\u0016 0", "7r32i\u001aN^$\t\bm\f\u0006\u0005,l\u007f'", "", "2de h7I]&\u000eZg(y\u0010/d", "5dc\u0011X=,c$\n\u0005k;\\\u0012+b\u0007(z", "u(I", "Adc\u0011X=,c$\n\u0005k;\\\u0012+b\u0007(z", "uY\u0018#", "2nf;_6:R\u0019}_L\t\r\u0012.l\u007f\t\u007fG\u0001", "", "5dc\u0011b>GZ#zy^+av\fu\t'\u0003@a\u001b\u001eG", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "8R1Ba+ES\tka?6\nu/m\n7{\u001f\u0001\u0014'Iq\u0012Ex", "5dc\u0017F\tN\\\u0018\u0006zN\u0019ci9rl(\u0004J\u0010\u0017uGl\u001e>x)>[", ":`bA89K]&\\\u0005h2\u0001\t", "", "5dc\u0019T:M3&\f\u0005k\n\u0007\u00135i\u007f", "u(8", ":`bA89K]&l\nZ*\u0003", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\"-\u0011fg\u001a\u0014_4NL", "5dc\u0019T:M3&\f\u0005k\u001a\f\u0005-k", "u(J\u0019V6F\u001d\u001azx^)\u0007\u00135/\r(w>\u0010`\u0016G\u0001\u001cL\u00020?f\ri;v%.ZD7i4,^Vp5\u0005i\r[r/G\"", ":`bA89K]&m~m3|", "5dc\u0019T:M3&\f\u0005k\u001b\u0001\u00186e", ":`bA89K]&m\u000fi,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0014+\"rn(\u001bn,$", "5dc\u0019T:M3&\f\u0005k\u001b\u0011\u0014/", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0016\u0017X}\u001eG\u0002/BhG$@|\u0016;N?9kBgtunC\u0014R@Yv|", "@dS\u000fb?!O\"}\u0002^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5!\u001e\u0014EkLi_5M}'T\"", "5dc\u001fX+\u001b],avg+\u0004\t<", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0016\u0017X}\u001eG\u0002/BhG$@|\u0016;N?9kBg\u0002h`\u0016\u0011v\u000fJ\u007f&NL[\u0002", "And?V,&O$n\be", "5dc b<KQ\u0019fvi\u001c\n\u0010", "And?V,.` ", "5dc b<KQ\u0019n\be", "/cS\u0010h:M]!]zo\u0016\b\u00183o\t", "", "=oc6b5'O!~", "=oc6b5!O\"}\u0002^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&RlH\u000bm51r0FSN92", "1qT.g,+]#\u000ekb,\u000f", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/o_\u0018X@", "1qT.g,,c&\u007fv\\,[\t6e\u0002$\u000b@", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW*\u000726U{ \u0016m\u001d.O?Jk\n", ";nSB_,'O!~", "2dbAe6R@#\t\nO0|\u001b", "@n^AI0>e", "2nf;_6:Ru\u000f\u0004]3|u/s\n8\t>\u0001w$Qw}I}\u0013Ib{", "\u001aiPCTuB]b_~e,R", "@db<h9<S\tka", "=tc=h;\u001fW ~", "6`]1_,\u001ef\u0017~\u0006m0\u0007\u0012", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "6`]1_,+S \tv]\u0011j", "6`b\"c\u001bH2\u0015\u000ezC\u001aY\u00198d\u0007(_I^\u0013\u0015Jo", "6hS2C(Na\u0019}^g\u000b|\u0006?g\u0002(\t*\u0012\u0017$Nk\"", "6hS2E,=P#\u0012Yb(\u0004\u00131", "7r?.V2:U\u0019\fgn5\u0006\r8g", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u001f\u001a\u0013n];\u0007p\u001a]r6WZ,(cYo9\u0012\u00180", ":nP1F7EW([\u000bg+\u0004\t\u0010r\n0i@\u000e(\u0017T", "0t]1_,)O(\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&Vl@\u000br\t^\u007f&NL,(cYo9\u0012\u00180", "=m=2j\u0019>O\u0017\u000eXh5\f\tBt]5{<\u0010\u0017\u0016", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "=mA2T*M7\"\r\nZ5z\t\u000ee\u000e7\tJ\u0015\u0017\u0016", "=oT;7,;c\u001b\u0001zk", ">q^0X:L3&\f\u0005k\n\r\u0017>o\b,\u0011@\u000e%", "\u001a`]1e6BRb\u000f\nb3Fs+i\r}", "3qa<e\u0010GT#", "@dV6f;>`x\f\bh9Z\u0019=t\n0\u007fU\u0001$", "3qa<e\nNa(\t\u0003bA|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0014+\"rn\u0017\u0017q;X~+\\L[\u0002", "@d[<T+#Ay\f\u0005f\u001a|\u0016@e\r", "0t]1_,.@\u007f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0011.\u001egh9mm(MT#NSK(ZXH", "@d[<T+,S(\u000e~g.\u000b", "Adc\u000eW+Bb\u001d\t\u0004Z3f\u0014>i\n1\\J\u000e\u0002\u0013Eu\n>v2", "<`\\2", "D`[BX", "Adc\u0013c:\u001dS\u0016\u000f|>5x\u00066e~", "7r5=f\u000b>P)\u0001Zg(y\u0010/d", "Adc\u0015b;&]\u0018\u000f\u0002^\u0019|\u00146a}(\u0004@\n&vPk\u000bCv$", "7r7<g\u0014HR)\u0006zK,\b\u0010+c\u007f0{I\u0010v Cl\u0015<u", "Adc\u001dT*DO\u001b~\bE6z\u0005>i\n1YP\u000f&!Os#<\u0004", ">`R8T.>`\u007f\txZ;\u0001\u00138C\u00106\u000bJ\t\u001b,G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i\u0011]9\u0012\u0018V\u0010N8s\u000fW=3rN@|\u0018:X\fCl\u0016\f#c", "Adc\u001fX4Hb\u0019ch=,y\u00191E\t$xG\u0001\u0016", "7rA2`6MS}lY^)\r\u000b\u000fn{%\u0003@\u007f", "Ag^D7,O=$\u000e~h5\u000bg3a\u00072}", "Ag^DA,P8\u0007^\bk6\n", ";db@T.>", "2dc.\\3L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "3qa<e\nH]\u001f\u0003z", "Ag^DA,P8\u0015\u0010v>9\n\u0013<", "", "Ag^DC(Na\u0019}^g\u000b|\u0006?g\u0002(\t*\u0012\u0017$Nk\"", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i\u0011]9$ Z\r24k\u0005VQ&pDD\t\u0019,V\t7|^\u0016\u001e\u00161so)Z\u001eVy\u001euN~", "AsP?g\u0010Ga$~xm6\n", "As^=<5L^\u0019|\nh9", "BnV4_,\u001eZ\u0019\u0007zg;`\u0012=p\u007f&\u000bJ\u000e", "CoS.g,#Ax\f\bh9", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ReleaseDevSupportManager implements DevSupportManager {
    private final DefaultJSExceptionHandler defaultJSExceptionHandler = new DefaultJSExceptionHandler();
    private final int lastErrorCookie;

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public View createRootView(String str) {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public SurfaceDelegate createSurfaceDelegate(String str) {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(View view) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public File downloadBundleResourceFromUrlSync(String resourceURL, File file) {
        Intrinsics.checkNotNullParameter(resourceURL, "resourceURL");
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Activity getCurrentActivity() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public DeveloperSettings getDevSettings() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevSupportEnabled() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getJSBundleURLForRemoteDebugging() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public int getLastErrorCookie() {
        return this.lastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public StackFrame[] getLastErrorStack() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getLastErrorTitle() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public ErrorType getLastErrorType() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public RedBoxHandler getRedBoxHandler() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        return null;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        this.defaultJSExceptionHandler.handleException(e2);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hidePausedInDebuggerOverlay() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(PackagerStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onPackagerStatusFetched(false);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void loadSplitBundleFromServer(String bundlePath, DevSplitBundleCallback callback) {
        Intrinsics.checkNotNullParameter(bundlePath, "bundlePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void openDebugger() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair) {
        return pair;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String bundleURL, BundleLoadCallback callback) {
        Intrinsics.checkNotNullParameter(bundleURL, "bundleURL");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setAdditionalOptionForPackager(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevSupportEnabled(boolean z2) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(boolean z2) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(boolean z2) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setRemoteJSDebugEnabled(boolean z2) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String str, ReadableArray readableArray, int i2) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(String str, Throwable th) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showPausedInDebuggerOverlay(String message, DevSupportManager.PausedInDebuggerOverlayCommandListener listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void updateJSError(String str, ReadableArray readableArray, int i2) {
    }
}
