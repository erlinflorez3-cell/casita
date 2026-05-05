package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005,4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:-c$\bCCU \u0003*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4Ic\u0002e܈\u00172XoG3[tEʠhtL\u0005(2(A\u007fۖ\u00010ݒx\u0010%y\u0004P\u0012\u0012ضDpHRUX\u00137*\u0006l3G#֔kNDf5 HL;\u0003\u0018U~-e0\u000bl%F\u0003G=|g\u001e9aO5CE\u0004\t\rRia\u001b? ]5n-'9l\fWdx0\u001a\u001b+]1urT|KVՙ\u000bʬ˦SeQu\u001cN@D\n4T\u0004<.WN4-(\u0010 \u000ea\u001f#_FP\u0010\nZ\u0006\u000bcF\u0017S-aWi)lQoi1VG}\u0015\rLS\u0017mO\u000b\u0005\u001cf\u0015)\u0006\u0010YASP=v~ Xk JuĊ\u0006*\u0012c\u0010I=0).EMga?#/\u0015\u001aHr\u0012'\u0011fha\u0015jNP$~\u0016eW78\u000bRj\u0005y~l`<\u0013]\u001c\u00037\u0014\u0007AO\r\u0006B!3AfWxkzM\f:;.\u0015i s«\u0012WG\u0012{@_\u0019(a\u0001\nZDםf\u0005f\u0005\u000b\u0016\u001a\u0010t(PExp\u0016w\ncf\fARow\"4:R1\\Ch3$HA\u000b+wZ\u00170/Z9$\u0011\r<t7!\u0001bvou\u001da,+\u0001h2݄PځԊ*W(\u001fB#k\u0012\r+\u0018G\u0016_\u000eQ̡\u001auc\u001ahX(pi/k&?\u0005/2\u0010L]L!\u0006\u0002S\u0018'\t\u001e\u0012\u000fi\t^m\u000ej~Nxjxo\u0005\u001d(vl\u0016;\b\u0013 *gLzU\bl\u000b\n^\u0010wľXߢҡ<~\u000bW,KI\u001506M-qOM\u001c}\u0014=>y]\u0018\u001a^\u0006h\u000f4 }\n<e&o\u0011~\f^\u0002=ա]~L\\lw\u0011}`j&\u001b\t\u000eΌ\u00113V_-3dse\u000b]\u0011\u0017\r2\r~us:A\u0010.:4_8\u0015[}B~s+\u0017Ma\n\u0006my|;P\u0015\n\u0019\u001fIn@<m&\\Wp-H\u0006\"8|FߞaŝØ\r&:hJ.[Zbj\u001e\u0010)\u0002̄^ʕƘ1AǠ?^\u0016T\u0007anJ\u000bcSdqA\u000f\u0005'3Lzî0܊\u0600ESвg:\tS+\u000e3lU\u0006t){[bA3(\u0007\u0003׃D؏ǖH\u0001\u0530\bO1myt$:\u001e\u0006+Fh2G[)_%2ϕ\nٝΝMcʝ\u0016nZN0.\u0017|\u0003\u0019J\u000e_\"'[\u000bo\u0011/ۄMߗ\u0378B\u0019ݨ\u001bL1\u0007\u001a\u0002{H!:\u00149}LWx,'*f\n\u0001֞\f$8)\n\u0005/m($t\u001cu\u001bh)\u001a\u0016\u0011\u0016?Q'܁\u0006̛Nx\u000b\f4\u001dDeRI\u0010*vY\u001a\u000bI@U?#D\u0019ůjǰ\u000eg\u0005etm\u0019\u00197Gd\u0013\u0007-~01'{BI\u00171ϑ\u0013\u05c9$\\)\u0002\u001a/45\u0007\u001epD(O\u0012{\u0019k}oCi\u0006յ,Հ54j \u0004;\b\få*]0\u0018Aܐilc\u0011\\raŉ\u0012\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\rMD7{;-#>", "", "u(E", "\u001a`a4X\bI^uz\b<6\u0004\u0010+p\u000e(z#\u0001\u001b\u0019J~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0019T9@St\n\u0006;(\nf9l\u0007$\u0007N\u0001\u0016yGs\u0010?\u0006l\u0014-]%\u0007n}", "u(5", "\u0014", "\u001a`a4X\bI^uz\b>?\b\u00058d\u007f'^@\u0005\u0019\u001aV", "5dc\u0019T9@St\n\u0006;(\nhBp{1z@\u007fy\u0017Kq\u0011K>\u0004\t9\u0003o8U", "\u001bdS6h4\u001a^$[vk\n\u0007\u00106a\u000b6{?c\u0017\u001bIr\u001d", "5dc\u001aX+Bc!Z\u0006i\tx\u0016\ro\u0007/wK\u000f\u0017\u0016*o\u0012>y4|8Q\u007f<=\u0017\u0016", "\u001bdS6h4\u001a^$[vk\f\u0010\u0014+n~(z#\u0001\u001b\u0019J~", "5dc\u001aX+Bc!Z\u0006i\tx\u0016\u000fx\u000b$\u0005?\u0001\u0016yGs\u0010?\u0006l\u0014-]%\u0007n}", "\"n_\u000ec7\u001bO&^\u000ei(\u0006\b/db(\u007fB\u0004&", "5dc!b7\u001a^$[vk\f\u0010\u0014+n~(z#\u0001\u001b\u0019J~U\u001bJ\u0005:)~\b", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "5dc$\\5=]+b\u0004l,\f\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u00182\t\u0019cQ386;(\u00076[eDv\u0001\u001b$c", "2dU.h3M1\u0019\b\n^9X\u00103g\t(z/\u000b\"rRzj8\u0004\u0003?`\b-E", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\fWJExBs", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "5dc\u0011X-:c \u000eX^5\f\t<A\u0007,}I\u0001\u0016\u0006QziG\u0002\u00021f[*>w#<\fK7z4+\u0019dh\u0007\u0001p,Uv#UL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0003?`\b-%k\u0019.UC\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001cz9#\u0012g\u0012J2ZNHK/JOB{\u00049'\fBr\u000e\u001ak", "2dU.h3M:\u0015\f|^\u001b\u0007\u0014\u000bp\u000b\u0005wM^!\u001eQ|\u001c", "5dc\u0011X-:c \u000eaZ9~\t\u001eo\u000b\u0004\u0007K]\u0013$%y\u0015F\u00043say/7z\u001a*T\u00115x4%\u0015do9", "2dU.h3M;\u0019}~n4k\u0013:A\u000b3X<\u000et!Ny\u001bJ", "5dc\u0011X-:c \u000eb^+\u0001\u00197T\n3WK\fs\u0013TM\u0018C\u00012C\u0018\u0006\u001cFm#2IJ\teA\u001e\u001ch]G\u0007", "2dU.h3MB#\nVi7Y\u0005<C\n/\u0006M\u000f", "5dc\u0011X-:c \u000eih7X\u0014:B{5YJ\b!$U.\u00168\u0006%B]y'\u0005g#.TC7y4", "1d]AX9\u001aZ\u001d\u0001\u0004^+k\u0013:A\u000b3X<\u000et!Ny\u001bJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(W=5\u0018`dL\u0001jQ\u0015)\u000f6V\u0010\u0011", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Aba<_3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "<`e6Z(MW#\b^\\6\u0006f9n\u000f(\u0005O^!\u001eQ|", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "/bc6b5\"Q#\bXh5\f\t8t]2\u0003J\u000e", "1d]AX9\u001aZ\u001d\u0001\u0004^+k\u0013:A\u000b3X<\u000et!Ny\u001bJ>::A\u0011~;U", "uI9\u0017=\u0011%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`T\u007f\u0017Kz-5#[*?x <MP\u0011O\u0018a{dj8\u0014m0M\npEVV7f`r\u0007\u001c\u000ei\u000e[/\t\f'\u000b\u0013xO\u0013*\u0013\tE\u000f\u0019r\b\u0016#\u001c\u000b", "3mc2e\bEe\u0015\u0013\tL*\n\u00136l\\(~<\u0012\u001b!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001cKPEr;z\u0015k]J\u000bm9$", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001c\\?Jk\n", "1`] V9HZ ", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "4kX;Z\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0014?dY+BJ\u0012;;R7z4s{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u000f\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011u\u001eyI%wJchCEKRbs@\u0015c%XI>.\u001d_$\u001bf&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%BNs]8\u0004+)TEu\u001c?X>\nt+\u007fH\u0006?h\rGv\u001cHgf ,Z\u0017\u000e\"?; IOb\t6<\u0018p*k\u0016\u000e,BA\"tikHXdg\u001ff?o_\u000e\r6i\u00020k\u001e&S\tFZ\r^\u0007\u0011,xoWCd\\|)pQ&[\u0018PLU\"'\n!H6\u000bu\u0018]DW\u001a\u0010E8\u000fwjG\u001f}\u001e", "3wXAH5MW \\\u0005e3x\u0014=e~\u0016yM\u000b\u001e\u001e$o\u00118\b)?f", ":`a4X\u001bH^t\n\u0006;(\nf9l\n5\n", ":`a4X\u001bH^t\n\u0006;(\nf9l\n5\n\b\u0016\u001c~ZN\u0012$", ";dS6h4-]$Z\u0006i\tx\u0016\ro\u00072\tN", ";dS6h4-]$Z\u0006i\tx\u0016\ro\u00072\tNH,\u001c/\u0003l@^", ">h];X+,Q&\t\u0002e\t|\f+v\u00042\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0014?dY+BJ\u0012;;R7z4s{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u000f\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\u0007%~P-pF#=\u0004OLOp*qaC\u0001 !6-\u0013~#\u001fgcw\b\u0006[\u001c|`y1oC(zE(:t)\u00104y`\u0018\u007f2{G\te\u0010?b{2Q-\u00070;:n\u0012!", "Bn_\u000ec7\u001bO&\\\u0005e6\n\u0017", "Bn_\u000ec7\u001bO&\\\u0005e6\n\u0017vz\u0005\u0010\u000f\u001f\u0005~", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();
    private static final float TopAppBarExpandedHeight = TopAppBarSmallTokens.INSTANCE.m3585getContainerHeightD9Ej5fM();
    private static final float MediumAppBarCollapsedHeight = TopAppBarSmallTokens.INSTANCE.m3585getContainerHeightD9Ej5fM();
    private static final float MediumAppBarExpandedHeight = TopAppBarMediumTokens.INSTANCE.m3575getContainerHeightD9Ej5fM();
    private static final float LargeAppBarCollapsedHeight = TopAppBarSmallTokens.INSTANCE.m3585getContainerHeightD9Ej5fM();
    private static final float LargeAppBarExpandedHeight = TopAppBarLargeTokens.INSTANCE.m3571getContainerHeightD9Ej5fM();

    private TopAppBarDefaults() {
    }

    public final TopAppBarColors topAppBarColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1388520854, "C(topAppBarColors)977@47193L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, i2, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        TopAppBarColors defaultTopAppBarColors$material3_release = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTopAppBarColors$material3_release;
    }

    /* JADX INFO: renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2882topAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j5;
        long jM4214getUnspecified0d7_KjU2 = j3;
        long jM4214getUnspecified0d7_KjU3 = j6;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j2;
        ComposerKt.sourceInformationMarkerStart(composer, 2142919275, "C(topAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)998@48245L11:AppBar.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i2, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
        }
        TopAppBarColors topAppBarColorsM2868copyt635Npw = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2868copyt635Npw(jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarColorsM2868copyt635Npw;
    }

    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultTopAppBarColorsCached$material3_release = colorScheme.getDefaultTopAppBarColorsCached$material3_release();
        if (defaultTopAppBarColorsCached$material3_release != null) {
            return defaultTopAppBarColorsCached$material3_release;
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getTrailingIconColor()), null);
        colorScheme.setDefaultTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2143182847, "C1025@49443L29:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i2, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        WindowInsets windowInsetsM1089onlybOOhFvg = WindowInsetsKt.m1089onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.m1101plusgK_yJZ4(WindowInsetsSides.Companion.m1111getHorizontalJoeWqyM(), WindowInsetsSides.Companion.m1115getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return windowInsetsM1089onlybOOhFvg;
    }

    public final TopAppBarColors centerAlignedTopAppBarColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 513940029, "C(centerAlignedTopAppBarColors)1035@49843L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, i2, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)");
        }
        TopAppBarColors defaultCenterAlignedTopAppBarColors$material3_release = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultCenterAlignedTopAppBarColors$material3_release;
    }

    /* JADX INFO: renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2874centerAlignedTopAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j2;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM4214getUnspecified0d7_KjU3 = j6;
        long jM4214getUnspecified0d7_KjU4 = j5;
        long jM4214getUnspecified0d7_KjU5 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, 1896017784, "C(centerAlignedTopAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)1056@50929L11:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 16) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i2, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1056)");
        }
        TopAppBarColors topAppBarColorsM2868copyt635Npw = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2868copyt635Npw(jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarColorsM2868copyt635Npw;
    }

    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultCenterAlignedTopAppBarColorsCached$material3_release = colorScheme.getDefaultCenterAlignedTopAppBarColorsCached$material3_release();
        if (defaultCenterAlignedTopAppBarColorsCached$material3_release != null) {
            return defaultCenterAlignedTopAppBarColorsCached$material3_release;
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallCenteredTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallCenteredTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallCenteredTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallCenteredTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallCenteredTokens.INSTANCE.getTrailingIconColor()), null);
        colorScheme.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors mediumTopAppBarColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1268886463, "C(mediumTopAppBarColors)1085@52373L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1268886463, i2, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1085)");
        }
        TopAppBarColors defaultMediumTopAppBarColors$material3_release = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultMediumTopAppBarColors$material3_release;
    }

    /* JADX INFO: renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2881mediumTopAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j6;
        long jM4214getUnspecified0d7_KjU2 = j5;
        long jM4214getUnspecified0d7_KjU3 = j2;
        long jM4214getUnspecified0d7_KjU4 = j4;
        long jM4214getUnspecified0d7_KjU5 = j3;
        ComposerKt.sourceInformationMarkerStart(composer, -582474442, "C(mediumTopAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)1107@53476L11:AppBar.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i2, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1107)");
        }
        TopAppBarColors topAppBarColorsM2868copyt635Npw = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2868copyt635Npw(jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU4, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarColorsM2868copyt635Npw;
    }

    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultMediumTopAppBarColorsCached$material3_release = colorScheme.getDefaultMediumTopAppBarColorsCached$material3_release();
        if (defaultMediumTopAppBarColorsCached$material3_release != null) {
            return defaultMediumTopAppBarColorsCached$material3_release;
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, TopAppBarMediumTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarMediumTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarMediumTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarMediumTokens.INSTANCE.getTrailingIconColor()), null);
        colorScheme.setDefaultMediumTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarColors largeTopAppBarColors(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1744932393, "C(largeTopAppBarColors)1135@54826L11:AppBar.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744932393, i2, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
        }
        TopAppBarColors defaultLargeTopAppBarColors$material3_release = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultLargeTopAppBarColors$material3_release;
    }

    /* JADX INFO: renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2880largeTopAppBarColorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long jM4214getUnspecified0d7_KjU = j2;
        long jM4214getUnspecified0d7_KjU2 = j4;
        long jM4214getUnspecified0d7_KjU3 = j3;
        long jM4214getUnspecified0d7_KjU4 = j6;
        long jM4214getUnspecified0d7_KjU5 = j5;
        ComposerKt.sourceInformationMarkerStart(composer, -1471507700, "C(largeTopAppBarColors)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color,0:c#ui.graphics.Color)1157@55926L11:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            jM4214getUnspecified0d7_KjU3 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            jM4214getUnspecified0d7_KjU2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            jM4214getUnspecified0d7_KjU5 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((i3 & 16) != 0) {
            jM4214getUnspecified0d7_KjU4 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i2, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1157)");
        }
        TopAppBarColors topAppBarColorsM2868copyt635Npw = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2868copyt635Npw(jM4214getUnspecified0d7_KjU, jM4214getUnspecified0d7_KjU3, jM4214getUnspecified0d7_KjU2, jM4214getUnspecified0d7_KjU5, jM4214getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarColorsM2868copyt635Npw;
    }

    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(ColorScheme colorScheme) {
        TopAppBarColors defaultLargeTopAppBarColorsCached$material3_release = colorScheme.getDefaultLargeTopAppBarColorsCached$material3_release();
        if (defaultLargeTopAppBarColorsCached$material3_release != null) {
            return defaultLargeTopAppBarColorsCached$material3_release;
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.fromToken(colorScheme, TopAppBarLargeTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarSmallTokens.INSTANCE.getOnScrollContainerColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarLargeTokens.INSTANCE.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarLargeTokens.INSTANCE.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, TopAppBarLargeTokens.INSTANCE.getTrailingIconColor()), null);
        colorScheme.setDefaultLargeTopAppBarColorsCached$material3_release(topAppBarColors);
        return topAppBarColors;
    }

    public final TopAppBarScrollBehavior pinnedScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 286497075, "C(pinnedScrollBehavior)P(1)1192@57597L24:AppBar.kt#uh7d8r");
        if ((1 & i3) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return true;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i2, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:1194)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return pinnedScrollBehavior;
    }

    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 959086674, "C(enterAlwaysScrollBehavior)P(3!1,2)1214@58881L24,1217@59107L26:AppBar.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return true;
                }
            };
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i2, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return enterAlwaysScrollBehavior;
    }

    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, Function0<Boolean> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1757023234, "C(exitUntilCollapsedScrollBehavior)P(3!1,2)1247@60644L24,1250@60870L26:AppBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return true;
                }
            };
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i3 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i2, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return exitUntilCollapsedScrollBehavior;
    }

    /* JADX INFO: renamed from: getTopAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2879getTopAppBarExpandedHeightD9Ej5fM() {
        return TopAppBarExpandedHeight;
    }

    /* JADX INFO: renamed from: getMediumAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2877getMediumAppBarCollapsedHeightD9Ej5fM() {
        return MediumAppBarCollapsedHeight;
    }

    /* JADX INFO: renamed from: getMediumAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2878getMediumAppBarExpandedHeightD9Ej5fM() {
        return MediumAppBarExpandedHeight;
    }

    /* JADX INFO: renamed from: getLargeAppBarCollapsedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2875getLargeAppBarCollapsedHeightD9Ej5fM() {
        return LargeAppBarCollapsedHeight;
    }

    /* JADX INFO: renamed from: getLargeAppBarExpandedHeight-D9Ej5fM, reason: not valid java name */
    public final float m2876getLargeAppBarExpandedHeightD9Ej5fM() {
        return LargeAppBarExpandedHeight;
    }
}
