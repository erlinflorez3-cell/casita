package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d̉=!4i\bDJv|\u0004O\u00068é6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XV2\u000f\u0002{<$a/yCQU\"Ԃ*\teNogtMb\u000bY\u000f\u000e\u0016~k4Ic~e\u0012%2JoE7UoS9ht<\u000f(20A\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001a0VpBR\u0013N\r\u001a(\u0006F \u0007'tʋMD\\\u0005]hDS\u0012wXf2o2\rM;[\u0003>˼za$Cp=;\u00153l\u001b\u0007\u0001uo\u0016EqK \u000147-Ys\u0006Kn~B,ۣS\rc\u000bVo\u000bQn(?8_e[P<=\u000ey*$ʀ\b\u000e\f?xA3\u001at%&@\u0005tc@~\u0017tA.\u0012ˋ:\u0017+\u0018c>?\u001btoyH)PG{3\"4\"/\u0006Ĳ_T\u0014xE!Zw_Pi@kh~\u0010_={%\tb0)46M\u007f=\u001e).E$}`߶\"ܩȠ\u0006JJ\u000b\u0005)x[a\u000fjHn7\u001f'EP!\u0019jFt\u0005\u001aejWZ(ܖ T\r\u00168$.\u0004\u0010I1' N}}\u007fi{tܦ)/lO\n}y6oDn5EQ\u0012%\u0010iλ\u0018?Bz5itkk\u0019j^8\"`]\u0001\u000f&\u0013ΌR\f\u0019Jo\u0003*^D>)^%H13X@+ ރ^h\u0016\u0017\u001b4ʗ\u0007i2 !4^\t\to\u0016\u000ey0\u000b\u000e:-o\u007fe\u001d4\u0005:hb-S\u0016\r%\u0018RwNWL\u001b+$lދ$\u0016 Q\u00180̈́\u0012Áɒ-4\b_S\u007f\u000b}_\u0002*'){*\u0013I\u001eFg6!7,Äi\u07baׅX\u0019(.l+;\\r9\u0012at5oc\u0003F\fBW/\u001bYj\th\u0001\u0013\\6%/*R\u0001Ck['KP(\u0018=Ty]\u0018*^}pO>t\u0014>\\g$%zQ\fhk<W\u000e\u0017>P^\u001d\u0007P\n\u0003w6\u0005O4ڸ2ǥыhr\\{[OGJtLD\r\u001f\u0011\u0004:A+.8<&Bsq8DbQl)M\u0002\"\u001eqY%#J=D;\u007f?8*\u001ckZ\u0007[pSH\u0006\"RfEI.\u001d<7^d0JI#C\u0003,L\u0010Ÿ~ʋݍ\u0013\u00198\u000f\u0002\tn bGtVvT\tE\u000fqZ\u0005\r`K\u001e'ow\u0005\u00063b\u0002{2/'E\tI?\u007f\u0003tzCD\u0003sK,fW#E\f}y\bD[_+\u0004j\u001edh\u001e\u000bvZ\u001a18\u007fi\u0010|>9#WzM\u0013OBl`*:+\u0015y+fl\u0010\u001dg1Q\tn\u0011\u0006|R\u0006\u0015[\u001a/ft-\u0015j\u0015ctU]\nC\rUI\u0019NW\u007fe4S}6Zf'\u001c\u0007/>o\u000e\u0015D\u0006\u001bhP\"\u001apd!\u0013~ZJ.j\u0011\u0001˖F\bdN8֯XՄ`̲o\u0006)@5/|\bHKvy\"ere|X+\u001ft6ny\u001d,\u0007ȿ_\u07b2Oܻ\u0017fb:\u001fW0Z\u0017\u0006\"\u0016>!<\u000fp,0kqp\tk}ZCċ\u0006ն,Հ5>Z\u001e\f#\nw\n3b)-=\\WLg)xzMo\u000e\ri^˯Kׅ+ِ\u0001\rP^\u001f\u0017DHx*r0O\u001b%h\u001bJ\u0001#\u0012Sa&O0\ẗq\u03a24цs6~\u0011\u0011>rv\u00069P\n\u000b\u0002m<;ItY(8q$\u001cc9\u0379\"ԙ:ܥ\f:\u0019\u000e\u001f3j:&Pj\u001b4=WFO\u001c։\u0001\u001a@\tu߀5ciܷW\t"}, d2 = {"\u001adP1\\5@1#\b\n^5\fh8dj$z?\u0005 \u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0019X(=W\"\u0001Xh5\f\t8t_1z+|\u0016\u0016Kx\u0010zr.>c\r\u001cFq 7[", "u(E", "5dc\u0019X(=W\"\u0001Xh5\f\t8t_1z+|\u0016\u0016Kx\u0010", "u(5", "\u0014", "\u001ahbA<;>[x\byI({\b3n\u0002", "5dc\u0019\\:M7(~\u0003>5{s+d~,\u0005B?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0019\\:M7(~\u0003>5{s+d~,\u0005B", "\u001ahbA<;>[\u0007\u000evk;g\u0005.d\u00041}", "5dc\u0019\\:M7(~\u0003L;x\u0016>P{'zD\n\u0019UCx\u0017F\u0006!D]\b)E", "5dc\u0019\\:M7(~\u0003L;x\u0016>P{'zD\n\u0019", "\u001ahbA<;>[\b\u0002\b^,c\r8ep(\tO\u0005\u0015\u0013NZ\n;u)>[", "5dc\u0019\\:M7(~\u0003M/\n\t/L\u00041{1\u0001$&Km\nCa!4X\u0002)9,\u00127VMJgC\"\u001fqo", "5dc\u0019\\:M7(~\u0003M/\n\t/L\u00041{1\u0001$&Km\nCa!4X\u0002)9", "\u001ahbA<;>[\n~\bm0z\u00056P{'zD\n\u0019", "5dc\u0019\\:M7(~\u0003O,\n\u00183c{/f<\u007f\u0016\u001bPqL8\u007f.?hy/;w\u001f<", "5dc\u0019\\:M7(~\u0003O,\n\u00183c{/f<\u007f\u0016\u001bPq", "\"qP6_0GUv\t\u0004m,\u0006\u0018\u001dt{5\u000b+|\u0016\u0016Kx\u0010", "5dc!e(BZ\u001d\b|<6\u0006\u0018/n\u000f\u0016\u000b<\u000e&\u0002Cn\r@\u007f'sU\u0007)A|\u0012=QMDy", "5dc!e(BZ\u001d\b|<6\u0006\u0018/n\u000f\u0016\u000b<\u000e&\u0002Cn\r@\u007f'", "\u001ahbA<;>[", "", "6dP1_0GSv\t\u0004m,\u0006\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "=uT?_0GSv\t\u0004m,\u0006\u0018", "At_=b9MW\"\u0001Xh5\f\t8t", ":dP1\\5@1#\b\n^5\f", "BqP6_0GUv\t\u0004m,\u0006\u0018", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7us8TMHy\n", "Bn]._\fES*z\nb6\u0006", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "\u001ahbA<;>[`amG\u000e`\b-", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(.]t^>0&oib[X\u0005g\u001ff?o_J?N\u0015>Vs\u0011.\u0014H)_\b$l\u0016$uCSJ%a\u000foQ%\t[\u001a\u0002\u0010p\u001c\u001bA_;c\u0017s4m7\u0017 \u0019qG\u0010\u0004Y\rrzP\u001bwYrh-S\byi", "\u001ahbA<;>[\u007fz\u000fh<\f", ":dP1\\5@", "BqP6_0GU", "6dP1_0GS", "=uT?_0GS", "At_=b9MW\"\u0001", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6P\n\u00112m\u0004Xq\u001c=qB\u00136dL146\u0006 OTryt>WF)i\u0013\u0018p5>nI)T", "\u001eq^C\\+>B\u0019\u0012\nL;\u0011\u0010/F\r2\u0004/\u000b\u001d\u0017P", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "BdgAG6DS\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "1n]AX5M", "\u001eq^C\\+>B\u0019\u0012\nL;\u0011\u0010/F\r2\u0004/\u000b\u001d\u0017P7[!>\u0016\u001f-e", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$\u0013b\\\u0002D\u0018\u001b$\u0013_3V\u0006iJ\"}HA(\u0016u*\u0012Df\u0010\u0010 \u0017\u0002@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fo:m\u001bc%\\\u0004\u0018.\u001c|#)h]\u0004m?D", "DdaA\\*:Z\u0004zy]0\u0006\u000b", ":hbA<;>[\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006])Cha/7u\u0005BXC\u0011", "DdaA\\*:Z\u0004zy]0\u0006\u000bvy\u0003{K#d\u0019", "uH\u0018\u0013", "1`[0h3:b\u0019azb.\u007f\u0018", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ":dP1\\5@6\u0019\u0003|a;", "BqP6_0GU{~~`/\f", "6dP1_0GS{~~`/\f", "=uT?_0GS{~~`/\f", "At_=b9MW\"\u0001]^0~\f>", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1`[0h3:b\u0019azb.\u007f\u0018vNN\r\u007f=N\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0015V_C\u0012c\u00022Z\u000b+02\u0010A\u0016V", "1`[0h3:b\u0019p~];\u007f", ":dP1\\5@E\u001d}\na", "BqP6_0GU\u000b\u0003ym/", "6dP1_0GS\u000b\u0003ym/", "=uT?_0GS\u000b\u0003ym/", "At_=b9MW\"\u0001lb+\f\f", "6na6m6Gb\u0015\u0006eZ+{\r8g", "1`[0h3:b\u0019p~];\u007fPCeb-a\u000et", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0015V_C\u0012c\u00022Z\u000b+02\u0011 6", "7rBBc7H`(\u0003\u0004`\u0014\r\u0010>i\u0007,\u0005@c\u0017'Ts\u001cKz#", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "3rc6`(MS\u0018l\u000bi7\u0007\u0016>i\t*^@\u0005\u0019\u001aV", ">kP0X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "EhSA[", "6dX4[;", ":dP1\\5@> zx^(y\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "BqP6_0GU\u0004\u0006v\\,x\u00066e", "6dP1_0GS\u0004\u0006v\\,x\u00066e", "=uT?_0GS\u0004\u0006v\\,x\u00066e", "At_=b9MW\"\u0001ee(z\t+b\u0007(", "7rC5e,>:\u001d\bz", "AsP?g\u0017:R\u0018\u0003\u0004`", "3mS\u001dT+=W\"\u0001", "Bn_\u001dT+=W\"\u0001", "AtQAe(<bv\t\u0004l;\n\u00053n\u000f\u0016wA\u0001\u001e+", "<", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ListItemKt {
    private static final float LeadingContentEndPadding;
    private static final float ListItemEndPadding;
    private static final float ListItemStartPadding;
    private static final float TrailingContentStartPadding;
    private static final float ListItemVerticalPadding = Dp.m6638constructorimpl(8);
    private static final float ListItemThreeLineVerticalPadding = Dp.m6638constructorimpl(12);

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int subtractConstraintSafely(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    /* JADX INFO: renamed from: ListItem-HXNGIdc, reason: not valid java name */
    public static final void m2213ListItemHXNGIdc(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, ListItemColors listItemColors, float f2, float f3, Composer composer, final int i2, final int i3) {
        int i4;
        float fM2212getElevationD9Ej5fM = f2;
        final ListItemColors listItemColorsM2211colorsJ08w3E = listItemColors;
        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function27 = function22;
        float fM2212getElevationD9Ej5fM2 = f3;
        final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        final Function2<? super Composer, ? super Integer, Unit> function29 = function23;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1647707763);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ListItem)P(1,3,4,6,2,8!1,7:c#ui.unit.Dp,5:c#ui.unit.Dp)100@4555L8,104@4735L176,157@6562L5,162@6761L288,155@6438L611:ListItem.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function27) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function29) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function28) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function26) ? 131072 : 65536;
            i4 = (i4 + i12) - (i4 & i12);
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= ((i3 + 64) - (i3 | 64) == 0 && composerStartRestartGroup.changed(listItemColorsM2211colorsJ08w3E)) ? 1048576 : 524288;
        }
        int i13 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i13 != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= composerStartRestartGroup.changed(fM2212getElevationD9Ej5fM) ? 8388608 : 4194304;
        }
        int i14 = (i3 + 256) - (i3 | 256);
        if (i14 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 100663296));
        } else if ((i2 & 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2212getElevationD9Ej5fM2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i4 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    function27 = null;
                }
                if (i8 != 0) {
                    function29 = null;
                }
                if (i9 != 0) {
                    function28 = null;
                }
                if (i11 != 0) {
                    function26 = null;
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    listItemColorsM2211colorsJ08w3E = ListItemDefaults.INSTANCE.m2211colorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, FrameMetricsAggregator.EVERY_DURATION);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
                if (i13 != 0) {
                    fM2212getElevationD9Ej5fM = ListItemDefaults.INSTANCE.m2212getElevationD9Ej5fM();
                }
                if (i14 != 0) {
                    fM2212getElevationD9Ej5fM2 = ListItemDefaults.INSTANCE.m2212getElevationD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1647707763, i4, -1, "androidx.compose.material3.ListItem (ListItem.kt:103)");
            }
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
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

                public final void invoke(Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C105@4745L160:ListItem.kt#uh7d8r");
                    if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-403249643, i15, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                        }
                        ListItemKt.m2214ProvideTextStyleFromToken3JVO9M(listItemColorsM2211colorsJ08w3E.m2206headlineColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemLabelTextFont(), function2, composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(1640970492);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*113@5021L204");
            ComposableLambda composableLambdaRememberComposableLambda2 = function29 == null ? null : ComposableLambdaKt.rememberComposableLambda(-1020860251, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
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

                public final void invoke(Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C114@5039L172:ListItem.kt#uh7d8r");
                    if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1020860251, i15, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:114)");
                        }
                        ListItemKt.m2214ProvideTextStyleFromToken3JVO9M(listItemColorsM2211colorsJ08w3E.m2209supportingColor0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemSupportingTextFont(), function29, composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1640980724);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*123@5341L196");
            ComposableLambda composableLambdaRememberComposableLambda3 = function27 == null ? null : ComposableLambdaKt.rememberComposableLambda(-764441232, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
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

                public final void invoke(Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C124@5359L164:ListItem.kt#uh7d8r");
                    if ((-1) - (((-1) - i15) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-764441232, i15, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:124)");
                        }
                        ListItemKt.m2214ProvideTextStyleFromToken3JVO9M(listItemColorsM2211colorsJ08w3E.m2208overlineColor0d7_KjU$material3_release(), ListTokens.INSTANCE.getListItemOverlineFont(), function27, composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1640990750);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*133@5651L302");
            ComposableLambda composableLambdaRememberComposableLambda4 = function28 == null ? null : ComposableLambdaKt.rememberComposableLambda(1400509200, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
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

                public final void invoke(Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C134@5669L270:ListItem.kt#uh7d8r");
                    if ((i15 + 3) - (3 | i15) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1400509200, i15, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:134)");
                    }
                    Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, ListItemKt.getLeadingContentEndPadding(), 0.0f, 11, null);
                    ListItemColors listItemColors2 = listItemColorsM2211colorsJ08w3E;
                    Function2<Composer, Integer, Unit> function210 = function28;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 690160162, "C135@5745L176:ListItem.kt#uh7d8r");
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(listItemColors2.m2207leadingIconColorvNxB06k$material3_release(true))), function210, composer2, ProvidedValue.$stable);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1641004177);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*144@6069L353");
            ComposableLambda composableLambdaRememberComposableLambda5 = function26 != null ? ComposableLambdaKt.rememberComposableLambda(1512306332, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
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

                public final void invoke(Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C145@6087L321:ListItem.kt#uh7d8r");
                    if ((i15 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1512306332, i15, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:145)");
                    }
                    Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, ListItemKt.getTrailingContentStartPadding(), 0.0f, 0.0f, 0.0f, 14, null);
                    ListItemColors listItemColors2 = listItemColorsM2211colorsJ08w3E;
                    Function2<Composer, Integer, Unit> function210 = function26;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 690581204, "C146@6168L222:ListItem.kt#uh7d8r");
                    ListItemKt.m2214ProvideTextStyleFromToken3JVO9M(listItemColors2.m2210trailingIconColorvNxB06k$material3_release(true), ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), function210, composer2, 48);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            final ComposableLambda composableLambda = composableLambdaRememberComposableLambda4;
            final ComposableLambda composableLambda2 = composableLambdaRememberComposableLambda5;
            final ComposableLambda composableLambda3 = composableLambdaRememberComposableLambda3;
            final ComposableLambda composableLambda4 = composableLambdaRememberComposableLambda2;
            int i15 = i4 >> 9;
            int i16 = 57344 & i15;
            int i17 = (i16 + 12582912) - (i16 & 12582912);
            int i18 = (-1) - (((-1) - i15) | ((-1) - 458752));
            SurfaceKt.m2561SurfaceT9BRK9s(SemanticsModifierKt.semantics(Modifier.Companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }
            }).then(companion), ListItemDefaults.INSTANCE.getShape(composerStartRestartGroup, 6), listItemColorsM2211colorsJ08w3E.m2196containerColor0d7_KjU$material3_release(), listItemColorsM2211colorsJ08w3E.m2206headlineColorvNxB06k$material3_release(true), fM2212getElevationD9Ej5fM, fM2212getElevationD9Ej5fM2, null, ComposableLambdaKt.rememberComposableLambda(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
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

                public final void invoke(Composer composer2, int i19) {
                    ComposerKt.sourceInformation(composer2, "C163@6771L272:ListItem.kt#uh7d8r");
                    if ((i19 + 3) - (3 | i19) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1502590376, i19, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                        }
                        ListItemKt.ListItemLayout(composableLambda, composableLambda2, composableLambdaRememberComposableLambda, composableLambda3, composableLambda4, composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i17 + i18) - (i17 & i18), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function213 = function26;
            final ListItemColors listItemColors2 = listItemColorsM2211colorsJ08w3E;
            final float f4 = fM2212getElevationD9Ej5fM;
            final float f5 = fM2212getElevationD9Ej5fM2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$3
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

                public final void invoke(Composer composer2, int i19) {
                    Function2<Composer, Integer, Unit> function214 = function2;
                    Modifier modifier3 = modifier2;
                    Function2<Composer, Integer, Unit> function215 = function210;
                    Function2<Composer, Integer, Unit> function216 = function211;
                    Function2<Composer, Integer, Unit> function217 = function212;
                    Function2<Composer, Integer, Unit> function218 = function213;
                    ListItemColors listItemColors3 = listItemColors2;
                    float f6 = f4;
                    float f7 = f5;
                    int i20 = i2;
                    ListItemKt.m2213ListItemHXNGIdc(function214, modifier3, function215, function216, function217, function218, listItemColors3, f6, f7, composer2, RecomposeScopeImplKt.updateChangedFlags((i20 + 1) - (i20 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2052297037);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ListItemLayout)P(1,4)181@7324L36,182@7365L261:ListItem.kt#uh7d8r");
        if ((i2 + 6) - (6 | i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((3072 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192)));
        }
        if ((i3 + 9363) - (9363 | i3) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2052297037, i3, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -748109790, "CC(remember):ListItem.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ListItemMeasurePolicy();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Function2[] function2Arr = new Function2[5];
            function2Arr[0] = function23;
            function2Arr[1] = function24 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1983getLambda1$material3_release() : function24;
            function2Arr[2] = function25 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1984getLambda2$material3_release() : function25;
            function2Arr[3] = function2 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1985getLambda3$material3_release() : function2;
            function2Arr[4] = function22 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1986getLambda4$material3_release() : function22;
            List listListOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.Companion;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -290761997, "CC(remember):Layout.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt.ListItemLayout.1
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

                public final void invoke(Composer composer2, int i7) {
                    ListItemKt.ListItemLayout(function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2220calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, long j2) {
        if (Constraints.m6587getHasBoundedWidthimpl(j2)) {
            return Constraints.m6591getMaxWidthimpl(j2);
        }
        return i7 + i2 + Math.max(i4, Math.max(i5, i6)) + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m2219calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        float fM3334getListItemTwoLineContainerHeightD9Ej5fM;
        if (ListItemType.m2226equalsimpl0(i7, ListItemType.Companion.m2231getOneLineAlXitO8())) {
            fM3334getListItemTwoLineContainerHeightD9Ej5fM = ListTokens.INSTANCE.m3329getListItemOneLineContainerHeightD9Ej5fM();
        } else {
            fM3334getListItemTwoLineContainerHeightD9Ej5fM = ListItemType.m2226equalsimpl0(i7, ListItemType.Companion.m2233getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m3334getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m3331getListItemThreeLineContainerHeightD9Ej5fM();
        }
        return RangesKt.coerceAtMost(Math.max(Math.max(Constraints.m6592getMinHeightimpl(j2), intrinsicMeasureScope.mo704roundToPx0680j_4(fM3334getListItemTwoLineContainerHeightD9Ej5fM)), i8 + Math.max(i2, Math.max(i4 + i5 + i6, i3))), Constraints.m6590getMaxHeightimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i2, final int i3, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z2, final int i4, final int i5, final int i6) {
        return MeasureScope.layout$default(measureScope, i2, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt.place.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                int iAlign;
                Placeable placeable6 = placeable;
                if (placeable6 != null) {
                    int i7 = i4;
                    boolean z3 = z2;
                    int iAlign2 = i6;
                    int i8 = i3;
                    if (!z3) {
                        iAlign2 = Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), i8);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, i7, iAlign2, 0.0f, 4, null);
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    int i9 = i2;
                    int i10 = i5;
                    boolean z4 = z2;
                    int iAlign3 = i6;
                    int i11 = i3;
                    int width = (i9 - i10) - placeable7.getWidth();
                    if (!z4) {
                        iAlign3 = Alignment.Companion.getCenterVertically().align(placeable7.getHeight(), i11);
                    }
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, width, iAlign3, 0.0f, 4, null);
                }
                int iWidthOrZero = i4 + TextFieldImplKt.widthOrZero(placeable);
                if (z2) {
                    iAlign = i6;
                } else {
                    iAlign = Alignment.Companion.getCenterVertically().align(TextFieldImplKt.heightOrZero(placeable3) + TextFieldImplKt.heightOrZero(placeable4) + TextFieldImplKt.heightOrZero(placeable5), i3);
                }
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, iWidthOrZero, iAlign, 0.0f, 4, null);
                }
                int iHeightOrZero = iAlign + TextFieldImplKt.heightOrZero(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, iWidthOrZero, iHeightOrZero, 0.0f, 4, null);
                }
                int iHeightOrZero2 = iHeightOrZero + TextFieldImplKt.heightOrZero(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, iWidthOrZero, iHeightOrZero2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m2214ProvideTextStyleFromToken3JVO9M(final long j2, final TypographyKeyTokens typographyKeyTokens, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1133967795);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProvideTextStyleFromToken)P(0:c#ui.graphics.Color,2)660@26959L5,658@26869L128:ListItem.kt#uh7d8r");
        if ((6 & i2) == 0) {
            int i4 = composerStartRestartGroup.changed(j2) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            int i5 = composerStartRestartGroup.changed(typographyKeyTokens) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((i3 + 147) - (147 | i3) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1133967795, i3, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:658)");
            }
            ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j2, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (-1) - (((-1) - (i3 >> 3)) | ((-1) - 14))), function2, composerStartRestartGroup, (i3 + 910) - (i3 | 910));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
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

                public final void invoke(Composer composer2, int i7) {
                    ListItemKt.m2214ProvideTextStyleFromToken3JVO9M(j2, typographyKeyTokens, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i2) {
        return i2 > density.mo703roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m2221verticalPaddingyh95HIg(int i2) {
        return ListItemType.m2226equalsimpl0(i2, ListItemType.Companion.m2232getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }

    static {
        float f2 = 16;
        ListItemStartPadding = Dp.m6638constructorimpl(f2);
        ListItemEndPadding = Dp.m6638constructorimpl(f2);
        LeadingContentEndPadding = Dp.m6638constructorimpl(f2);
        TrailingContentStartPadding = Dp.m6638constructorimpl(f2);
    }
}
