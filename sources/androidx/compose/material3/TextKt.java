package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яđ\u0014D߬)\u001e\u007f\u007fLDyt\fA\f1\u0013.P~*,\u0018w\u000ff\u000198D{H6RY+\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;Mu=A`\u000b6\rړ:\"Ny\r\u0001 *P\u0010\rzKŷ\u0014\u0012>IxíZ\r[\u000b\"\u0012\f>(\u0001,~oNDTt]P/+ɅqBd'g0\u0013M\u0015FZ.%\u001do!C@e9E)a\b\u001fR\n?3N\u007fC\u001ds7);I\"[d_ÿ\u0018\u00151WSbę*\\\u0013Zxі&9Y{K~\u0012X{\t\u0007%<2\u001a6-N.;'~\b<A%xY@^\u0011vB.\u000b\u0012<\u001d%\u000eDC9Ix\u0002iA\u0019\\J\u0014\u0007#\u001dQ\u0015\u001f)aT\u001cu-\u001djv\u007fG\u0002HCH\\!q?\u0004\u0003\u001fz20\n0U\u0019G{?@G-=[G=9m\u0018Gr\u0003'\rfha\u0006jJV!\u001d3g0\u000f\fhb|\u0005\u001ab\u0005^2\u0011[;l\u0007,(C&bwJB=\u0010|q\u0019opMk-=/\u0015[\ntq\u000ee^v3cu\u0014\"gR\u0005:WHr\u0007hfp{\u001c\\l(P[v\u0012@\n\u0002D\\6+>Os,4Z])^%H1\"pl-\u000feZv=\u0017Ta$In̾sէɹT^v\u001eu(aٰ{n,EA\u007f9I*c-\u00014+/7\u0005y\u007fUtdGzzF{[{.%29\u007f?m\u0019\u0015~7C\u001a-s^#mWM :\u0013~\u0010\u000ei|^o\u000ej~Axl`N\u0003-R~dr1\u001f|\u0002\u0010`t\u0013wiZ\u000biWar1klV>|\u001396'\u0017nP\u0018e5I'+2\u0010\u0016E\u0014\u0010z\u001au4yp->t\u0014\u0016\\i\u001coppu2iXy_\u0005>0E\u0005\u0003pj\u001b}\u000eB\u0017W%3ve\u0015\u0003\\8[1G\nv\t<\r\u001f~k<#o,]\\\u0007Z\u0006I}\"\t[1!Ocg\u001c\u001a[^\u001bJ=\u000e9'at\u0018\u001cKMnW\u0011\tv\u000b\u0605\u0017ܽװ?d\u000bl\u0017ULʽ;\u0016\u0015[T\u0018\n@~\u000eQw\u000fEZryAV\u001ca\u0011\\\u0005V5fK`/9\u0019~=CN~;1\u0013~^T]ub\tY\u001d\u0017.\u0003Q\u0015eS?t\\?\u001b6m\u0019\r[\\q_2>\nG7\u0005\u0004q\"7F\u0015MH\u001e\u001bGj)_%B\u000f\u0013[d\\~\u000f\u0014|Q|=Y\u0007\u0001|\u001cX\"\u0011!\u0018}\u0010 h3L\\\u0016OCH\u0013GJ/\u0007\u001a\u001c{FIM6;3=W\f,'*y\u0004A\u0004\b.C?\u0004#E\ri\u0014f\u0018\b3F&s&b05#R0\u0004\\N#\u001e:4\u000e6]/K\u0002A^ pץ ̸Ӳ/n\ftY\u001c\u0011ǐbzm\u0007U9\u0007\u00175d\u0005\u0007-~E9-S.!er:?aP^\u0017\u007f\"$>\u001fd\u0018\u0013/\u0016Oqy\tk}m=35k8tI2h\u001d,3*}\n*b=-=lLlz9drBe%vl>c#$Y\u001a\u0003~Vw)\u0013bX#&j/E37]#F\u000f\"4MO&/MjA16`( .|\u0011\u0011Xzt.<r\u000fx\u007fuKEF\u0003]J-_${\u0006\u001b&yghH\u000e,\u001f1)/\t\\PDb\u001a*`i3o=A\u0015\u001b8\u0014\u001a\u001f'ElaSSV\u0011~\u0011\rm}Gjh\u001fgx)/\u001d\u001d3W\u0015;k:؆Kھڧ\u0006gP/[\u0018v$oβa;U \nUn\u007f8\u001e\u009d(\f}߿\u0018G7I8aЊ@[{Z\nڱFdm\u07b8'|"}, d2 = {"\u001anR._\u001b>f(l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "5dc\u0019b*:Z\b~\u000em\u001a\f\u001d6e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "\u001eq^C\\+>B\u0019\u0012\nL;\u0011\u0010/", "", "D`[BX", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mk\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016WBzyQZ\u0018GCr\u007fI4rTYlO+\u00056", "\"dgA", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "4n]AF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", ":dcAX9,^\u0015|~g.", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "BdgA43BU\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", ":h]2;,BU\u001c\u000e", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "AnUAJ9:^", "", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "7m[6a,\u001c]\"\u000ezg;", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001bv\u001d2VC*kG-rrjH\u0007l;$", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "Ash9X", "\"dgA \u0010;9f\u0004{J", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[B\u0018M/\u000e\tYNyS)\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^\u0005A<w\u0010Zi\u0003V\u000b&l3syn1c:\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u00023>\u0001j\u0010Fy^K>\b)T\u000bi\u00126Zw:J\u0014\u007f=)Cn\tJza<h\u0001 6jAp6:\u0006\"?^r?mH\u0017whB\u0012\u0017q\u0016-!ilw\u001esmY ZBkc\u007fJ\u001c\u0004HQz\u001f5FHR_C$\t\u001a37sXW\"TJ\tpW1>\u0011\u0001\rs\u0014+2 F/ud3^DW\u0017\b{\u0002\n\u0006aN\u001f~HY}O<jW\u00033\u007f\u0007 ](3\u0015+veRK\u0017\u001a6\n`c\u0001hM&`;\u000f6!\u0007iGfgxrc^w\u007fmB+&1:KWQv(x7\u001e{\u001dl\u0007\u001ek\b\u0019\u0012<?Xn,E/!k8cQ\u001d6Q\u0014B*r Jf}CJ8\u001e\u0004M:x&+u\u0015uZ.U*Cm\fapk&.(\u000b\\M)\u0017\u0011xPS$\f[x\u0012 +Ul\u001dLJ\u0007MBYR\u0005\u001f@]a8iuI", "\"dgA s\r7zdt`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[B\u0018M/\u000e\tYNyS)\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^\u0005A<w\u0010Zi\u0003V\u000b&l3syn1c:\u0010\u000b\u0010z\u0018(rT-\u001dEQ\u001bz]\u0004ug\u0011)~\u00023>\u0001j\u0010Fy^K>\b)T\u000bi\u00126Zw:J\u0014\u007f=)Cn\tJza<h\u0001 6jAp6:\u0006\"?^r?mH\u0017whB\u0012\u0017q\u0016-!ilw\u001esmY ZBkc\u007fJ\u001c\u0004HQz\u001f5FHR_C$\t\u001a37sXW\"TJ\tpW1>\u0011\u0001\rs\u0014+2 F/ud3^DW\u0017\b{\u0002\n\u0006aN\u001f~HY}O<jW\u00033\u007f\u0007 ](3\u0015+veRK\u0017\u001a6\n`c\u0001hM)~2$!nMh<i*\u0017\u0007r)\t\u001fqG##6z\u0007cH8_\b0\u0013\r\u0012r\u0006#'\u001fH\u000b1PMt+\b92\u0001EY_\u001a0L(x^~\u001eMe\u00025\u0014~\u0012I\u0013+\f\"e\u001b&\tV\rv/6far\u0006x\u001c<%\u0005Wa_K\u001dvSR(}%<\u0015\u00191Jp\u0015\u0016^3KEXVv,\tka8I#", "\"dgA -%F$\u0006FB", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\H\u00115r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFh\t6R\u0011\u0005I\u000b\u0015%{D~wB,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfk:M3]r#$w\u001a\u000f\u0014\u0005b\u0003rV{jv\u001d\u007fvA#Kw_EX9SF|2)Y{A\"6\"\u0004+\b<M54?sN,q!M?t\u001d0cU|\u000b\u001d8\u001c>XmykQWf)i\u0013\u0018p5z)i/rH\"\u0016'%jIh_J&R\u0019M(o\u00131SzQ_\u0004\u001e^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030( w%=l\u001e28nKT\u0013RW8\u001f\u000b5J\u0019rQeR/g?>u.E\u007f\u0015Rj8\\D@SSx\u000e%8\u000b\u0014\rfTyKwE\u0017/.\t/\u001f^i.\u0018qW!,16&'8;\u0010R\n~bA6\u0015\u0011\u001d2k\u0015pM&\u0011GHI@\t8lJ\u0012F^Q#uK\u001f7k~$B%\u0001ES}\u0012\b\u0004tV\u001d$70\u0004G,=~\u0013JO|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\r#u3\"\u0016laF\\H\u00115r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFh\t6R\u0011\u0005I\u000b\u0015%{D~wB,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfk:M3]r#$w\u001a\u000f\u0014\u0005b\u0003rV{jv\u001d\u007fvA#Kw_EX9SF|2)Y{A\"6\"\u0004+\b<M54?sN,q!M?t\u001d0cU|\u000b\u001d8\u001c>XmykQWf)i\u0013\u0018p5z)i/rH\"\u0016'%jIh_J&R\u0019M(o\u00131SzQ_\u0004\u001e^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030( w%=l\u001e28nKT\u0013RW8\u001f\u000b5J\u0019rQeR/g?;V*@\b\u0018M*|PM~\u001cD\u007f\u0019\u0014C\u0005\u0015\b+=JR\u00034\")/F%\u000eI\\8\nt]&\u0018z\u0002\u001a)5<\f`@8n{p$}!wF\u0004]QGoBUPjw#_T\u0004IdV\u000f?\u0017\u00139h\u007f P[=BZw\u001d\u0004\f+Bp&41\u007fU\u001ftp\u0013JoOz", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TypographyTokensKt.getDefaultTextStyle();
        }
    });

    /* JADX INFO: renamed from: androidx.compose.material3.TextKt$ProvideTextStyle$1 */
    /* JADX INFO: compiled from: Text.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            function2 = function2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            TextStyle textStyle = textStyle;
            Function2<Composer, Integer, Unit> function2 = function2;
            int i3 = i;
            TextKt.ProvideTextStyle(textStyle, function2, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)));
        }
    }

    /* JADX INFO: renamed from: Text--4IGK_g */
    public static final void m2711Text4IGK_g(final String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        final int i10;
        final Function1<? super TextLayoutResult, Unit> function12;
        long jM6153getColor0d7_KjU;
        TextStyle textStyle2 = textStyle;
        int i11 = i3;
        boolean z3 = z2;
        TextDecoration textDecoration2 = textDecoration;
        long jM6842getUnspecifiedXSAIIZE = j4;
        FontFamily fontFamily2 = fontFamily;
        long jM6842getUnspecifiedXSAIIZE2 = j3;
        FontWeight fontWeight2 = fontWeight;
        int iM6576getClipgIe3tQ8 = i2;
        long jM6842getUnspecifiedXSAIIZE3 = j5;
        long jM4214getUnspecified0d7_KjU = j2;
        FontStyle fontStyle2 = fontStyle;
        TextAlign textAlign2 = textAlign;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2055108902);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)108@5620L7,113@5732L530:Text.kt#uh7d8r");
        if ((i7 + 1) - (i7 | 1) != 0) {
            i8 = (i5 + 6) - (i5 & 6);
        } else if ((i5 + 6) - (i5 | 6) == 0) {
            i8 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i12 = (-1) - (((-1) - i7) | ((-1) - 2));
        if (i12 != 0) {
            i8 |= 48;
        } else if ((i5 + 48) - (i5 | 48) == 0) {
            int i13 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i8 = (i8 + i13) - (i8 & i13);
        }
        int i14 = (-1) - (((-1) - i7) | ((-1) - 4));
        if (i14 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i8 |= composerStartRestartGroup.changed(jM4214getUnspecified0d7_KjU) ? 256 : 128;
        }
        int i15 = (i7 + 8) - (i7 | 8);
        if (i15 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 3072));
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE2) ? 2048 : 1024)));
        }
        int i16 = (i7 + 16) - (i7 | 16);
        if (i16 != 0) {
            i8 |= 24576;
        } else if ((i5 + 24576) - (i5 | 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
        }
        int i17 = (i7 + 32) - (i7 | 32);
        if (i17 != 0) {
            i8 = (i8 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536)));
        }
        int i18 = (-1) - (((-1) - i7) | ((-1) - 64));
        if (i18 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 1572864));
        } else if ((i5 + 1572864) - (i5 | 1572864) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288)));
        }
        int i19 = (i7 + 128) - (i7 | 128);
        if (i19 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 12582912));
        } else if ((i5 & 12582912) == 0) {
            int i20 = composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE) ? 8388608 : 4194304;
            i8 = (i8 + i20) - (i8 & i20);
        }
        int i21 = i7 & 256;
        if (i21 != 0) {
            i8 |= 100663296;
        } else if ((100663296 + i5) - (100663296 | i5) == 0) {
            int i22 = composerStartRestartGroup.changed(textDecoration2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i8 = (i8 + i22) - (i8 & i22);
        }
        int i23 = i7 & 512;
        if (i23 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 805306368));
        } else if ((i5 & 805306368) == 0) {
            int i24 = composerStartRestartGroup.changed(textAlign2) ? 536870912 : 268435456;
            i8 = (i8 + i24) - (i8 & i24);
        }
        int i25 = (i7 + 1024) - (i7 | 1024);
        if (i25 != 0) {
            i9 = i6 | 6;
        } else if ((-1) - (((-1) - i6) | ((-1) - 6)) == 0) {
            int i26 = composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE3) ? 4 : 2;
            i9 = (i6 + i26) - (i6 & i26);
        } else {
            i9 = i6;
        }
        int i27 = (-1) - (((-1) - i7) | ((-1) - 2048));
        if (i27 != 0) {
            i9 = (i9 + 48) - (i9 & 48);
        } else if ((-1) - (((-1) - i6) | ((-1) - 48)) == 0) {
            int i28 = composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 32 : 16;
            i9 = (i9 + i28) - (i9 & i28);
        }
        int i29 = (-1) - (((-1) - i7) | ((-1) - 4096));
        if (i29 != 0) {
            i9 = (i9 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i9 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i9 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        int i30 = (i7 + 8192) - (i7 | 8192);
        if (i30 != 0) {
            i9 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(i11) ? 2048 : 1024;
        }
        int i31 = (i7 + 16384) - (i7 | 16384);
        if (i31 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 24576));
        } else if ((i6 + 24576) - (i6 | 24576) == 0) {
            i9 |= composerStartRestartGroup.changed(i4) ? 16384 : 8192;
        }
        int i32 = i7 & 32768;
        if (i32 != 0) {
            i9 = (i9 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i33 = composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
            i9 = (i9 + i33) - (i9 & i33);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 1572864)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (((i7 & 65536) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i8) | ((-1) - 306783379)) == 306783378 && (599187 & i9) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            i10 = i4;
            function12 = function1;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i5 + 1) - (i5 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i12 != 0) {
                    companion = Modifier.Companion;
                }
                if (i14 != 0) {
                    jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
                }
                if (i15 != 0) {
                    jM6842getUnspecifiedXSAIIZE2 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i16 != 0) {
                    fontStyle2 = null;
                }
                if (i17 != 0) {
                    fontWeight2 = null;
                }
                if (i18 != 0) {
                    fontFamily2 = null;
                }
                if (i19 != 0) {
                    jM6842getUnspecifiedXSAIIZE = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i21 != 0) {
                    textDecoration2 = null;
                }
                if (i23 != 0) {
                    textAlign2 = null;
                }
                if (i25 != 0) {
                    jM6842getUnspecifiedXSAIIZE3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i27 != 0) {
                    iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
                }
                if (i29 != 0) {
                    z3 = true;
                }
                if (i30 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                i10 = i31 == 0 ? i4 : 1;
                function12 = i32 == 0 ? function1 : null;
                if ((i7 + 65536) - (i7 | 65536) != 0) {
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i9 &= -3670017;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i7) | ((-1) - 65536)) != 0) {
                    i9 &= -3670017;
                }
                i10 = i4;
                function12 = function1;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2055108902, i8, i9, "androidx.compose.material3.Text (Text.kt:109)");
            }
            composerStartRestartGroup.startReplaceGroup(-1827892941);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (jM4214getUnspecified0d7_KjU != 16) {
                jM6153getColor0d7_KjU = jM4214getUnspecified0d7_KjU;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1827892168);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*111@5715L7");
                jM6153getColor0d7_KjU = textStyle2.m6153getColor0d7_KjU();
                if (jM6153getColor0d7_KjU == 16) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    jM6153getColor0d7_KjU = ((Color) objConsume2).m4188unboximpl();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            fontWeight2 = fontWeight2;
            fontStyle2 = fontStyle2;
            fontFamily2 = fontFamily2;
            int i34 = (i8 + 126) - (i8 | 126);
            int i35 = i9 >> 6;
            int i36 = (i35 + 7168) - (i35 | 7168);
            int i37 = i9 << 9;
            BasicTextKt.m1314BasicTextVhcvRP8(str, companion, TextStyle.m6143mergedA7vx0o$default(textStyle2, jM6153getColor0d7_KjU, jM6842getUnspecifiedXSAIIZE2, fontWeight2, fontStyle2, null, fontFamily2, null, jM6842getUnspecifiedXSAIIZE, null, null, null, 0L, textDecoration2, null, null, textAlign2 != null ? textAlign2.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), 0, jM6842getUnspecifiedXSAIIZE3, null, null, 0, 0, null, null, 16609104, null), function12, iM6576getClipgIe3tQ8, z3, i11, i10, (ColorProducer) null, composerStartRestartGroup, ((-1) - (((-1) - ((((i34 + i36) - (i34 & i36)) | ((-1) - (((-1) - 57344) | ((-1) - i37)))) | ((-1) - (((-1) - 458752) | ((-1) - i37))))) & ((-1) - (3670016 & i37)))) | (i37 & 29360128), 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j6 = jM4214getUnspecified0d7_KjU;
            final long j7 = jM6842getUnspecifiedXSAIIZE2;
            final FontStyle fontStyle3 = fontStyle2;
            final FontWeight fontWeight3 = fontWeight2;
            final FontFamily fontFamily3 = fontFamily2;
            final long j8 = jM6842getUnspecifiedXSAIIZE;
            final TextDecoration textDecoration3 = textDecoration2;
            final TextAlign textAlign3 = textAlign2;
            final long j9 = jM6842getUnspecifiedXSAIIZE3;
            final int i38 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i39 = i11;
            final TextStyle textStyle3 = textStyle2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i40) {
                    String str2 = str;
                    Modifier modifier3 = modifier2;
                    long j10 = j6;
                    long j11 = j7;
                    FontStyle fontStyle4 = fontStyle3;
                    FontWeight fontWeight4 = fontWeight3;
                    FontFamily fontFamily4 = fontFamily3;
                    long j12 = j8;
                    TextDecoration textDecoration4 = textDecoration3;
                    TextAlign textAlign4 = textAlign3;
                    long j13 = j9;
                    int i41 = i38;
                    boolean z5 = z4;
                    int i42 = i39;
                    int i43 = i10;
                    Function1<TextLayoutResult, Unit> function13 = function12;
                    TextStyle textStyle4 = textStyle3;
                    int i44 = i5;
                    TextKt.m2711Text4IGK_g(str2, modifier3, j10, j11, fontStyle4, fontWeight4, fontFamily4, j12, textDecoration4, textAlign4, j13, i41, z5, i42, i43, function13, textStyle4, composer2, RecomposeScopeImplKt.updateChangedFlags((i44 + 1) - (i44 & 1)), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u000648L%_[\baoQOm}A\u001b\u001a3\u001dR \ns\u000b\u0001\u001f\u0004<\u001dO")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: Text-fLXpl1I */
    public static final /* synthetic */ void m2713TextfLXpl1I(final String str, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, Function1 function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        TextAlign textAlign2;
        TextStyle textStyle2 = textStyle;
        TextKt$Text$2 textKt$Text$2 = function1;
        int i9 = i3;
        boolean z3 = z2;
        TextDecoration textDecoration2 = textDecoration;
        long jM6842getUnspecifiedXSAIIZE = j4;
        FontFamily fontFamily2 = fontFamily;
        long jM6842getUnspecifiedXSAIIZE2 = j3;
        int iM6576getClipgIe3tQ8 = i2;
        FontWeight fontWeight2 = fontWeight;
        long jM6842getUnspecifiedXSAIIZE3 = j5;
        long jM4214getUnspecified0d7_KjU = j2;
        FontStyle fontStyle2 = fontStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)156@7042L7,158@7058L322:Text.kt#uh7d8r");
        if ((i6 + 1) - (i6 | 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 + 6) - (i4 | 6) == 0) {
            int i10 = composerStartRestartGroup.changed(str) ? 4 : 2;
            i7 = (i10 + i4) - (i10 & i4);
        } else {
            i7 = i4;
        }
        int i11 = i6 & 2;
        if (i11 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 48));
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            i7 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i12 = (i6 + 4) - (i6 | 4);
        if (i12 != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i13 = composerStartRestartGroup.changed(jM4214getUnspecified0d7_KjU) ? 256 : 128;
            i7 = (i7 + i13) - (i7 & i13);
        }
        int i14 = (-1) - (((-1) - i6) | ((-1) - 8));
        if (i14 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 3072));
        } else if ((i4 + 3072) - (i4 | 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE2) ? 2048 : 1024;
        }
        int i15 = i6 & 16;
        if (i15 != 0) {
            i7 = (i7 + 24576) - (i7 & 24576);
        } else if ((i4 + 24576) - (i4 | 24576) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192)));
        }
        int i16 = (i6 + 32) - (i6 | 32);
        int i17 = 65536;
        if (i16 != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i18 = composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
            i7 = (i7 + i18) - (i7 & i18);
        }
        int i19 = i6 & 64;
        if (i19 != 0) {
            i7 = (i7 + 1572864) - (i7 & 1572864);
        } else if ((i4 & 1572864) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288)));
        }
        int i20 = (i6 + 128) - (i6 | 128);
        if (i20 != 0) {
            i7 |= 12582912;
        } else if ((-1) - (((-1) - i4) | ((-1) - 12582912)) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE) ? 8388608 : 4194304)));
        }
        int i21 = i6 & 256;
        if (i21 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 100663296));
        } else if ((100663296 + i4) - (100663296 | i4) == 0) {
            i7 |= composerStartRestartGroup.changed(textDecoration2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i22 = (-1) - (((-1) - i6) | ((-1) - 512));
        if (i22 != 0) {
            i7 |= 805306368;
        } else if ((-1) - (((-1) - i4) | ((-1) - 805306368)) == 0) {
            i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
        }
        int i23 = i6 & 1024;
        if (i23 != 0) {
            i8 = (-1) - (((-1) - i5) & ((-1) - 6));
        } else if ((i5 & 6) == 0) {
            int i24 = composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE3) ? 4 : 2;
            i8 = (i5 + i24) - (i5 & i24);
        } else {
            i8 = i5;
        }
        int i25 = (-1) - (((-1) - i6) | ((-1) - 2048));
        if (i25 != 0) {
            i8 |= 48;
        } else if ((-1) - (((-1) - i5) | ((-1) - 48)) == 0) {
            iM6576getClipgIe3tQ8 = iM6576getClipgIe3tQ8;
            i8 |= composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 32 : 16;
        }
        int i26 = (-1) - (((-1) - i6) | ((-1) - 4096));
        if (i26 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i8 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        int i27 = (-1) - (((-1) - i6) | ((-1) - 8192));
        if (i27 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 3072));
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(i9) ? 2048 : 1024;
        }
        int i28 = i6 & 16384;
        if (i28 != 0) {
            i8 = (i8 + 24576) - (i8 & 24576);
        } else if ((i5 & 24576) == 0) {
            int i29 = composerStartRestartGroup.changedInstance(textKt$Text$2) ? 16384 : 8192;
            i8 = (i8 + i29) - (i8 & i29);
        }
        if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            if ((i6 & 32768) == 0 && composerStartRestartGroup.changed(textStyle2)) {
                i17 = 131072;
            }
            i8 = (-1) - (((-1) - i8) & ((-1) - i17));
        }
        if ((i7 & 306783379) == 306783378 && (-1) - (((-1) - 74899) | ((-1) - i8)) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textAlign2 = textAlign;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i11 != 0) {
                    companion = Modifier.Companion;
                }
                if (i12 != 0) {
                    jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
                }
                if (i14 != 0) {
                    jM6842getUnspecifiedXSAIIZE2 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i15 != 0) {
                    fontStyle2 = null;
                }
                if (i16 != 0) {
                    fontWeight2 = null;
                }
                if (i19 != 0) {
                    fontFamily2 = null;
                }
                if (i20 != 0) {
                    jM6842getUnspecifiedXSAIIZE = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i21 != 0) {
                    textDecoration2 = null;
                }
                textAlign2 = i22 == 0 ? textAlign : null;
                if (i23 != 0) {
                    jM6842getUnspecifiedXSAIIZE3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i25 != 0) {
                    iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
                }
                if (i26 != 0) {
                    z3 = true;
                }
                if (i27 != 0) {
                    i9 = Integer.MAX_VALUE;
                }
                if (i28 != 0) {
                    textKt$Text$2 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                }
                if ((-1) - (((-1) - i6) | ((-1) - 32768)) != 0) {
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i8 = (-1) - (((-1) - i8) | ((-1) - (-458753)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i6 & 32768) != 0) {
                    i8 &= -458753;
                }
                textAlign2 = textAlign;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1968784669, i7, i8, "androidx.compose.material3.Text (Text.kt:157)");
            }
            int i30 = ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - i8) | ((-1) - 14)))) & ((-1) - 24576)))) & ((-1) - (112 & i8)))) | (896 & i8);
            int i31 = (i8 + 7168) - (7168 | i8);
            int i32 = i8 << 3;
            fontStyle2 = fontStyle2;
            fontWeight2 = fontWeight2;
            fontFamily2 = fontFamily2;
            textDecoration2 = textDecoration2;
            m2711Text4IGK_g(str, companion, jM4214getUnspecified0d7_KjU, jM6842getUnspecifiedXSAIIZE2, fontStyle2, fontWeight2, fontFamily2, jM6842getUnspecifiedXSAIIZE, textDecoration2, textAlign2, jM6842getUnspecifiedXSAIIZE3, iM6576getClipgIe3tQ8, z3, i9, 1, (Function1<? super TextLayoutResult, Unit>) textKt$Text$2, textStyle2, composerStartRestartGroup, (-1) - (((-1) - i7) | ((-1) - 2147483646)), (-1) - (((-1) - (((i30 + i31) - (i30 & i31)) | ((-1) - (((-1) - 458752) | ((-1) - i32))))) & ((-1) - (i32 & 3670016))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j6 = jM4214getUnspecified0d7_KjU;
            final long j7 = jM6842getUnspecifiedXSAIIZE2;
            final FontStyle fontStyle3 = fontStyle2;
            final FontWeight fontWeight3 = fontWeight2;
            final FontFamily fontFamily3 = fontFamily2;
            final long j8 = jM6842getUnspecifiedXSAIIZE;
            final TextDecoration textDecoration3 = textDecoration2;
            final TextAlign textAlign3 = textAlign2;
            final long j9 = jM6842getUnspecifiedXSAIIZE3;
            final int i33 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i34 = i9;
            final Function1 function12 = textKt$Text$2;
            final TextStyle textStyle3 = textStyle2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i35) {
                    TextKt.m2713TextfLXpl1I(str, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration3, textAlign3, j9, i33, z4, i34, function12, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Text-IbK3jfQ */
    public static final void m2712TextIbK3jfQ(final AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, int i4, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        final TextAlign textAlign2;
        final int i10;
        long jM6153getColor0d7_KjU;
        TextStyle textStyle2 = textStyle;
        TextKt$Text$4 textKt$Text$4 = function1;
        Map<String, InlineTextContent> mapEmptyMap = map;
        int i11 = i3;
        boolean z3 = z2;
        TextDecoration textDecoration2 = textDecoration;
        long jM6842getUnspecifiedXSAIIZE = j4;
        FontFamily fontFamily2 = fontFamily;
        int iM6576getClipgIe3tQ8 = i2;
        long jM6842getUnspecifiedXSAIIZE2 = j3;
        FontWeight fontWeight2 = fontWeight;
        long jM6842getUnspecifiedXSAIIZE3 = j5;
        long jM4214getUnspecified0d7_KjU = j2;
        FontStyle fontStyle2 = fontStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(2027001676);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)254@11726L7,258@11837L706:Text.kt#uh7d8r");
        if ((i7 + 1) - (i7 | 1) != 0) {
            i8 = (i5 + 6) - (i5 & 6);
        } else if ((i5 + 6) - (i5 | 6) == 0) {
            int i12 = composerStartRestartGroup.changed(annotatedString) ? 4 : 2;
            i8 = (i12 + i5) - (i12 & i5);
        } else {
            i8 = i5;
        }
        int i13 = (i7 + 2) - (i7 | 2);
        if (i13 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i14 = (-1) - (((-1) - i7) | ((-1) - 4));
        if (i14 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(jM4214getUnspecified0d7_KjU) ? 256 : 128)));
        }
        int i15 = (i7 + 8) - (i7 | 8);
        if (i15 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 3072));
        } else if ((i5 & 3072) == 0) {
            int i16 = composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE2) ? 2048 : 1024;
            i8 = (i8 + i16) - (i8 & i16);
        }
        int i17 = (i7 + 16) - (i7 | 16);
        if (i17 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 24576));
        } else if ((i5 + 24576) - (i5 | 24576) == 0) {
            int i18 = composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
            i8 = (i8 + i18) - (i8 & i18);
        }
        int i19 = (-1) - (((-1) - i7) | ((-1) - 32));
        if (i19 != 0) {
            i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536)));
        }
        int i20 = (-1) - (((-1) - i7) | ((-1) - 64));
        if (i20 != 0) {
            i8 |= 1572864;
        } else if ((i5 + 1572864) - (i5 | 1572864) == 0) {
            int i21 = composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
            i8 = (i8 + i21) - (i8 & i21);
        }
        int i22 = (-1) - (((-1) - i7) | ((-1) - 128));
        if (i22 != 0) {
            i8 |= 12582912;
        } else if ((i5 & 12582912) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE) ? 8388608 : 4194304)));
        }
        int i23 = (i7 + 256) - (i7 | 256);
        if (i23 != 0) {
            i8 = (i8 + 100663296) - (i8 & 100663296);
        } else if ((i5 + 100663296) - (i5 | 100663296) == 0) {
            int i24 = composerStartRestartGroup.changed(textDecoration2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i8 = (i8 + i24) - (i8 & i24);
        }
        int i25 = (-1) - (((-1) - i7) | ((-1) - 512));
        if (i25 != 0) {
            i8 = (i8 + 805306368) - (i8 & 805306368);
        } else if ((-1) - (((-1) - i5) | ((-1) - 805306368)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456)));
        }
        int i26 = (-1) - (((-1) - i7) | ((-1) - 1024));
        if (i26 != 0) {
            i9 = (-1) - (((-1) - i6) & ((-1) - 6));
        } else if ((-1) - (((-1) - i6) | ((-1) - 6)) == 0) {
            i9 = i6 | (composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE3) ? 4 : 2);
        } else {
            i9 = i6;
        }
        int i27 = (-1) - (((-1) - i7) | ((-1) - 2048));
        if (i27 != 0) {
            i9 = (i9 + 48) - (i9 & 48);
        } else if ((-1) - (((-1) - i6) | ((-1) - 48)) == 0) {
            i9 |= composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 32 : 16;
        }
        int i28 = (-1) - (((-1) - i7) | ((-1) - 4096));
        if (i28 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i6) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i9 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        int i29 = (i7 + 8192) - (i7 | 8192);
        if (i29 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 3072));
        } else if ((i6 + 3072) - (i6 | 3072) == 0) {
            int i30 = composerStartRestartGroup.changed(i11) ? 2048 : 1024;
            i9 = (i9 + i30) - (i9 & i30);
        }
        int i31 = (i7 + 16384) - (i7 | 16384);
        if (i31 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i6) | ((-1) - 24576)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(i4) ? 16384 : 8192)));
        }
        int i32 = (i7 + 32768) - (i7 | 32768);
        if (i32 != 0) {
            i9 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i6 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i6 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 131072 : 65536;
        }
        int i33 = i7 & 65536;
        if (i33 != 0) {
            i9 |= 1572864;
        } else if ((-1) - (((-1) - i6) | ((-1) - 1572864)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changedInstance(textKt$Text$4) ? 1048576 : 524288)));
        }
        if ((i6 + 12582912) - (i6 | 12582912) == 0) {
            i9 |= ((i7 + 131072) - (i7 | 131072) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 8388608 : 4194304;
        }
        if ((i8 + 306783379) - (306783379 | i8) == 306783378 && (4793491 & i9) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textAlign2 = textAlign;
            i10 = i4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i5 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i13 != 0) {
                    companion = Modifier.Companion;
                }
                if (i14 != 0) {
                    jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
                }
                if (i15 != 0) {
                    jM6842getUnspecifiedXSAIIZE2 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i17 != 0) {
                    fontStyle2 = null;
                }
                if (i19 != 0) {
                    fontWeight2 = null;
                }
                if (i20 != 0) {
                    fontFamily2 = null;
                }
                if (i22 != 0) {
                    jM6842getUnspecifiedXSAIIZE = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i23 != 0) {
                    textDecoration2 = null;
                }
                textAlign2 = i25 == 0 ? textAlign : null;
                if (i26 != 0) {
                    jM6842getUnspecifiedXSAIIZE3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i27 != 0) {
                    iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
                }
                if (i28 != 0) {
                    z3 = true;
                }
                if (i29 != 0) {
                    i11 = Integer.MAX_VALUE;
                }
                i10 = i31 == 0 ? i4 : 1;
                if (i32 != 0) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                if (i33 != 0) {
                    textKt$Text$4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                }
                if ((i7 + 131072) - (i7 | 131072) != 0) {
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i9 = (i9 - 29360129) - (i9 | (-29360129));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i7) | ((-1) - 131072)) != 0) {
                    i9 = (i9 - 29360129) - (i9 | (-29360129));
                }
                textAlign2 = textAlign;
                i10 = i4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2027001676, i8, i9, "androidx.compose.material3.Text (Text.kt:255)");
            }
            composerStartRestartGroup.startReplaceGroup(-1827697581);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (jM4214getUnspecified0d7_KjU != 16) {
                jM6153getColor0d7_KjU = jM4214getUnspecified0d7_KjU;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1827696808);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*256@11820L7");
                jM6153getColor0d7_KjU = textStyle2.m6153getColor0d7_KjU();
                if (jM6153getColor0d7_KjU == 16) {
                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composerStartRestartGroup.consume(localContentColor);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    jM6153getColor0d7_KjU = ((Color) objConsume2).m4188unboximpl();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            textDecoration2 = textDecoration2;
            int i34 = i9 << 9;
            int i35 = (-1) - (((-1) - ((((-1) - (((-1) - ((-1) - (((-1) - i8) | ((-1) - 126)))) & ((-1) - ((i9 >> 9) & 7168)))) | ((57344 + i34) - (57344 | i34))) | (458752 & i34))) & ((-1) - ((3670016 + i34) - (3670016 | i34))));
            int i36 = 29360128 & i34;
            BasicTextKt.m1312BasicTextRWo7tUw(annotatedString, companion, TextStyle.m6143mergedA7vx0o$default(textStyle2, jM6153getColor0d7_KjU, jM6842getUnspecifiedXSAIIZE2, fontWeight2, fontStyle2, null, fontFamily2, null, jM6842getUnspecifiedXSAIIZE, null, null, null, 0L, textDecoration2, null, null, textAlign2 != null ? textAlign2.m6526unboximpl() : TextAlign.Companion.m6533getUnspecifiede0LSkKk(), 0, jM6842getUnspecifiedXSAIIZE3, null, null, 0, 0, null, null, 16609104, null), textKt$Text$4, iM6576getClipgIe3tQ8, z3, i11, i10, mapEmptyMap, null, composerStartRestartGroup, ((i35 + i36) - (i35 & i36)) | (i34 & 234881024), 512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j6 = jM4214getUnspecified0d7_KjU;
            final long j7 = jM6842getUnspecifiedXSAIIZE2;
            final FontStyle fontStyle3 = fontStyle2;
            final FontWeight fontWeight3 = fontWeight2;
            final FontFamily fontFamily3 = fontFamily2;
            final long j8 = jM6842getUnspecifiedXSAIIZE;
            final TextDecoration textDecoration3 = textDecoration2;
            final long j9 = jM6842getUnspecifiedXSAIIZE3;
            final int i37 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i38 = i11;
            final Map<String, InlineTextContent> map2 = mapEmptyMap;
            final Function1<? super TextLayoutResult, Unit> function12 = textKt$Text$4;
            final TextStyle textStyle3 = textStyle2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i39) {
                    TextKt.m2712TextIbK3jfQ(annotatedString, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration3, textAlign2, j9, i37, z4, i38, i10, map2, function12, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u000648L%_[\baoQOm}A\u001b\u001a3\u001dR \ns\u000b\u0001\u001f\u0004<\u001dO")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: Text--4IGK_g */
    public static final /* synthetic */ void m2710Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j2, long j3, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j4, TextDecoration textDecoration, TextAlign textAlign, long j5, int i2, boolean z2, int i3, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        TextAlign textAlign2;
        TextStyle textStyle2 = textStyle;
        TextKt$Text$6 textKt$Text$6 = function1;
        Map mapEmptyMap = map;
        int i9 = i3;
        boolean z3 = z2;
        TextDecoration textDecoration2 = textDecoration;
        int iM6576getClipgIe3tQ8 = i2;
        long jM6842getUnspecifiedXSAIIZE = j4;
        FontFamily fontFamily2 = fontFamily;
        long jM6842getUnspecifiedXSAIIZE2 = j3;
        FontWeight fontWeight2 = fontWeight;
        long jM6842getUnspecifiedXSAIIZE3 = j5;
        long jM4214getUnspecified0d7_KjU = j2;
        FontStyle fontStyle2 = fontStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)304@13393L7,306@13409L345:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = (i4 + 6) - (i4 & 6);
        } else if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i10 = (i6 + 2) - (i6 | 2);
        if (i10 != 0) {
            i7 |= 48;
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            i7 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i11 = (-1) - (((-1) - i6) | ((-1) - 4));
        if (i11 != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(jM4214getUnspecified0d7_KjU) ? 256 : 128)));
        }
        int i12 = i6 & 8;
        if (i12 != 0) {
            i7 = (i7 + 3072) - (i7 & 3072);
        } else if ((i4 & 3072) == 0) {
            int i13 = composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE2) ? 2048 : 1024;
            i7 = (i7 + i13) - (i7 & i13);
        }
        int i14 = (-1) - (((-1) - i6) | ((-1) - 16));
        if (i14 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 24576));
        } else if ((i4 + 24576) - (i4 | 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
        }
        int i15 = (i6 + 32) - (i6 | 32);
        if (i15 != 0) {
            i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536)));
        }
        int i16 = i6 & 64;
        if (i16 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 1572864));
        } else if ((i4 + 1572864) - (i4 | 1572864) == 0) {
            int i17 = composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
            i7 = (i7 + i17) - (i7 & i17);
        }
        int i18 = (-1) - (((-1) - i6) | ((-1) - 128));
        if (i18 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i4) | ((-1) - 12582912)) == 0) {
            i7 |= composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE) ? 8388608 : 4194304;
        }
        int i19 = (-1) - (((-1) - i6) | ((-1) - 256));
        if (i19 != 0) {
            i7 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            int i20 = composerStartRestartGroup.changed(textDecoration2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i7 = (i7 + i20) - (i7 & i20);
        }
        int i21 = (i6 + 512) - (i6 | 512);
        if (i21 != 0) {
            i7 = (i7 + 805306368) - (i7 & 805306368);
        } else if ((i4 & 805306368) == 0) {
            i7 |= composerStartRestartGroup.changed(textAlign) ? 536870912 : 268435456;
        }
        int i22 = (i6 + 1024) - (i6 | 1024);
        if (i22 != 0) {
            i8 = (i5 + 6) - (i5 & 6);
        } else if ((i5 + 6) - (i5 | 6) == 0) {
            i8 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(jM6842getUnspecifiedXSAIIZE3) ? 4 : 2)));
        } else {
            i8 = i5;
        }
        int i23 = i6 & 2048;
        if (i23 != 0) {
            i8 = (i8 + 48) - (i8 & 48);
        } else if ((i5 & 48) == 0) {
            iM6576getClipgIe3tQ8 = iM6576getClipgIe3tQ8;
            i8 |= composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 32 : 16;
        }
        int i24 = (-1) - (((-1) - i6) | ((-1) - 4096));
        if (i24 != 0) {
            i8 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(z3) ? 256 : 128)));
        }
        int i25 = i6 & 8192;
        if (i25 != 0) {
            i8 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(i9) ? 2048 : 1024;
        }
        int i26 = i6 & 16384;
        if (i26 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 24576));
        } else if ((i5 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 16384 : 8192;
        }
        int i27 = (i6 + 32768) - (i6 | 32768);
        if (i27 != 0) {
            i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(textKt$Text$6) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i5) | ((-1) - 1572864)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (((i6 & 65536) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 1048576 : 524288)));
        }
        if ((i7 + 306783379) - (306783379 | i7) == 306783378 && (-1) - (((-1) - 599187) | ((-1) - i8)) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textAlign2 = textAlign;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 + 1) - (i4 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if (i11 != 0) {
                    jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
                }
                if (i12 != 0) {
                    jM6842getUnspecifiedXSAIIZE2 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i14 != 0) {
                    fontStyle2 = null;
                }
                if (i15 != 0) {
                    fontWeight2 = null;
                }
                if (i16 != 0) {
                    fontFamily2 = null;
                }
                if (i18 != 0) {
                    jM6842getUnspecifiedXSAIIZE = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i19 != 0) {
                    textDecoration2 = null;
                }
                textAlign2 = i21 == 0 ? textAlign : null;
                if (i22 != 0) {
                    jM6842getUnspecifiedXSAIIZE3 = TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
                }
                if (i23 != 0) {
                    iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
                }
                if (i24 != 0) {
                    z3 = true;
                }
                if (i25 != 0) {
                    i9 = Integer.MAX_VALUE;
                }
                if (i26 != 0) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                if (i27 != 0) {
                    textKt$Text$6 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$6
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextLayoutResult textLayoutResult) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                            invoke2(textLayoutResult);
                            return Unit.INSTANCE;
                        }
                    };
                }
                if ((i6 + 65536) - (i6 | 65536) != 0) {
                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i8 = (-1) - (((-1) - i8) | ((-1) - (-3670017)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i6 + 65536) - (i6 | 65536) != 0) {
                    i8 &= -3670017;
                }
                textAlign2 = textAlign;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(224529679, i7, i8, "androidx.compose.material3.Text (Text.kt:305)");
            }
            int i28 = (-1) - (((-1) - i7) | ((-1) - 2147483646));
            int i29 = (-1) - (((-1) - (i8 & 14)) & ((-1) - 24576));
            int i30 = (i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i8);
            int i31 = ((-1) - (((-1) - ((i29 + i30) - (i29 & i30))) & ((-1) - ((-1) - (((-1) - i8) | ((-1) - 896)))))) | (7168 & i8);
            int i32 = i8 << 3;
            int i33 = i31 | ((458752 + i32) - (458752 | i32));
            int i34 = (3670016 + i32) - (3670016 | i32);
            int i35 = (i33 + i34) - (i33 & i34);
            int i36 = i32 & 29360128;
            fontStyle2 = fontStyle2;
            fontWeight2 = fontWeight2;
            fontFamily2 = fontFamily2;
            textDecoration2 = textDecoration2;
            m2712TextIbK3jfQ(annotatedString, companion, jM4214getUnspecified0d7_KjU, jM6842getUnspecifiedXSAIIZE2, fontStyle2, fontWeight2, fontFamily2, jM6842getUnspecifiedXSAIIZE, textDecoration2, textAlign2, jM6842getUnspecifiedXSAIIZE3, iM6576getClipgIe3tQ8, z3, i9, 1, mapEmptyMap, textKt$Text$6, textStyle2, composerStartRestartGroup, i28, (i35 + i36) - (i35 & i36), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j6 = jM4214getUnspecified0d7_KjU;
            final long j7 = jM6842getUnspecifiedXSAIIZE2;
            final FontStyle fontStyle3 = fontStyle2;
            final FontWeight fontWeight3 = fontWeight2;
            final FontFamily fontFamily3 = fontFamily2;
            final long j8 = jM6842getUnspecifiedXSAIIZE;
            final TextDecoration textDecoration3 = textDecoration2;
            final TextAlign textAlign3 = textAlign2;
            final long j9 = jM6842getUnspecifiedXSAIIZE3;
            final int i37 = iM6576getClipgIe3tQ8;
            final boolean z4 = z3;
            final int i38 = i9;
            final Map map2 = mapEmptyMap;
            final Function1 function12 = textKt$Text$6;
            final TextStyle textStyle3 = textStyle2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i39) {
                    TextKt.m2710Text4IGK_g(annotatedString, modifier2, j6, j7, fontStyle3, fontWeight3, fontFamily3, j8, textDecoration3, textAlign3, j9, i37, z4, i38, map2, function12, textStyle3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i4) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                }
            });
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProvideTextStyle)P(1)347@14710L7,348@14735L80:Text.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i3, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) objConsume).merge(textStyle)), function2, composerStartRestartGroup, ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt.ProvideTextStyle.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function22, int i22) {
                    super(2);
                    function2 = function22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    TextStyle textStyle2 = textStyle;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    int i32 = i;
                    TextKt.ProvideTextStyle(textStyle2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)));
                }
            });
        }
    }
}
