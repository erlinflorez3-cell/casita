package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: PrimaryNavigationTabTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005-4\u0012\u000e\u0007nj?2Le^.ZS0\u001cs{J$c$wXCU0}*\tUOm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012_APpW3{qެ=f|Ȃ\u001d\"8%F}U\u0010(/`\u0010%|ŲO\u0012\u001aؓXr@X\u001bQU) \rV / ֔kT>ԟ\u0005_@71\u0007:Q\\0w0+OϘJZ/˙\u000fc$5N;\u0006$3^\u001b\u0007\u0001]ύ\u0007Eyܵ\u001dj-39MDfDe\u0018\u0014C-̠\u0011cz̦t\u0007Wn\u001a+{fqZh\u000eV\b¶zȞ˖\u0003\rΝ+P6-(y \u00109\u0006\u0001e\u0011_\u0010rZ\u007f)vي\u001b+\bđC;!|_x\f(\\O\u0014\u0005; ţ\u0005t)żl\u0010f.)XH`?kX=vP̆]CuՎ\td\bE\u00124\u0018\u000f=\u0018).E'ھ_?+ܩ\u0004\u0004NauzUovq\u0002RvḆr\u001c?ѧ!\u000e`cr\t<gbxD\u0011{,Ϻ\u0006âު\u0012\u001fϢ{D)%\u001eagjo\f[oZ<=\tOY\u001d{\u0085VުՍ24Ʉg\u0018iR\u0005'W>h(fx\u0013b\u001a~t(PWʮn\u0016\u007fӻ\\P\u00129@fB3BTI\u0019\u000b%ɶ\u0002ٜ\u05cc@{Ȥcbp\u0010\rgK&\t\u00132\u0007Y\u0018^\u0007\to\u0016\tΛ+ʉ̙!,ۮU=!&c5\u00016\u0003N\u0015\u0011D\u000fU\u0014dGznטy[\u0004\u008d.\u001c?~=Ac\u001e\rWJ\u0002[GʆvkY˧*)\u0001,\b\u0013\fw<\u0018 j\u001f.߯nPWܷ/$|\u0010\u0001'Xs\u000e,yF)IϭX\u0011cŬat\t\rJR\t\f\u0013S6%/qݕ\u0001;5ξ?\u001f\u001c-\"3epk \b.(dϪ*zmֽDe\u001c'pU.AIpaY-@ѐ(r\u000bܩ`l}AP\r\u0005\u001cA\u0003Yd\u001fXиQ\u00117̎~\t2H~Z,I!,\u00164\\\u001dͫwI\u0006жvE+O[\u0013܍mvS_\u0011Ή+8\n\u00041t1λA`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001X#2U?H\u007f\u001d\u001a&lc5\u0016g6We#D;X2\\[\u0001\u0013", "", "u(E", "\u000fbc6i,\u001f]\u0017\u000f\tB*\u0007\u0012\ro\u00072\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u000eV;Bd\u0019_\u0005\\<\u000bl-o\t\u0006\u0006G\u000b$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u000fbc6i,\u001f]\u0017\u000f\tE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "5dc\u000eV;Bd\u0019_\u0005\\<\u000bo+b\u007f/j@\u0014&tQv\u0018I", "\u000fbc6i,!]*~\bB*\u0007\u0012\ro\u00072\t", "5dc\u000eV;Bd\u0019a\u0005o,\nl-o\t\u0006\u0006G\u000b$", "\u000fbc6i,!]*~\bE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "5dc\u000eV;Bd\u0019a\u0005o,\no+b\u007f/j@\u0014&tQv\u0018I", "\u000fbc6i,\"Q#\bXh3\u0007\u0016", "5dc\u000eV;Bd\u0019bxh5Z\u00136o\r", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\ro\u00072\t", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u0006\u0006G\u000b$", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\u0012e\u0004*~O", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u000b{D\u0003\u001a&\u000fNa\u001c{t6A", "u(5", "\u0014", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\u001dh{3{", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001Z >VB;j\u0012(\"qaFtf(Yv|", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u0016~<\f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~g\u0001\u001cBm_\u001bWSDj4\u001drrnB\u0007p\u001aQr2G\"", "\u000fbc6i,%O\u0016~\u0002M,\u0010\u0018\ro\u00072\t", "5dc\u000eV;Bd\u0019ev[,\u0004w/x\u000f\u0006\u0006G\u000b$", "\u000fbc6i,)`\u0019\r\t^+`\u00079n]2\u0003J\u000e", "5dc\u000eV;Bd\u0019i\b^:\u000b\t.I}2\u0005\u001e\u000b\u001e!T", "\u000fbc6i,)`\u0019\r\t^+c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc\u000eV;Bd\u0019i\b^:\u000b\t.L{%{Go\u0017*VM\u0018C\u00012", "\u0011n]AT0GS&\\\u0005e6\n", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "\u0011n]AT0GS&^\u0002^=x\u00183o\t", "5dc\u0010b5MO\u001d\bzk\f\u0004\t@a\u000f,\u0006IHuj't]=^", "\u0011n]AT0GS&azb.\u007f\u0018", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000foZ\u0014`\u001cfHW", "\u0011n]AT0GS&l}Z7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u0017b^;45=:\u0015{ze\u001b|\u001c>C\n1\u000b<\u0005 \u0017TR\u000e@x(D", "5dc\u0016V6G/\"}aZ)|\u0010\u001ee\u00137YJ\n&\u0013Kx\u000eIY%9[\u0001/~Li\u000eR\u0013<S", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "\u0017mP0g0OSy\txn:`\u00079n]2\u0003J\u000e", "5dc\u0016a(<b\u001d\u0010z?6z\u0019=I}2\u0005\u001e\u000b\u001e!T", "\u0017mP0g0OSy\txn:c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc\u0016a(<b\u001d\u0010z?6z\u0019=L{%{Go\u0017*VM\u0018C\u00012", "\u0017mP0g0OS{\t\f^9`\u00079n]2\u0003J\u000e", "5dc\u0016a(<b\u001d\u0010zA6\u000e\t<I}2\u0005\u001e\u000b\u001e!T", "\u0017mP0g0OS{\t\f^9c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc\u0016a(<b\u001d\u0010zA6\u000e\t<L{%{Go\u0017*VM\u0018C\u00012", "\u0017mP0g0OS||\u0005g\n\u0007\u00109r", "5dc\u0016a(<b\u001d\u0010zB*\u0007\u0012\ro\u00072\t", "\u0017mP0g0OS\u007fzw^3k\tBt]2\u0003J\u000e", "5dc\u0016a(<b\u001d\u0010zE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "\u0017mP0g0OS\u0004\fzl:|\b\u0013c\n1YJ\b!$", "5dc\u0016a(<b\u001d\u0010zI9|\u0017=e~\fyJ\nt!Ny\u001b", "\u0017mP0g0OS\u0004\fzl:|\b\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc\u0016a(<b\u001d\u0010zI9|\u0017=e~\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "\u001a`Q2_\u001b>f(_\u0005g;", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0019T)>Z\b~\u000em\r\u0007\u0012>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PrimaryNavigationTabTokens {
    public static final int $stable = 0;
    private static final float ActiveIndicatorHeight;
    private static final RoundedCornerShape ActiveIndicatorShape;
    public static final PrimaryNavigationTabTokens INSTANCE = new PrimaryNavigationTabTokens();
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float ContainerHeight = Dp.m6638constructorimpl((float) 48.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerNone;
    private static final ColorSchemeKeyTokens ActiveFocusIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveHoverIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActivePressedIconColor = ColorSchemeKeyTokens.Primary;
    private static final float IconAndLabelTextContainerHeight = Dp.m6638constructorimpl((float) 64.0d);
    private static final float IconSize = Dp.m6638constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens InactiveFocusIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveHoverIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens InactivePressedIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.TitleSmall;

    private PrimaryNavigationTabTokens() {
    }

    static {
        float f2 = (float) 3.0d;
        ActiveIndicatorHeight = Dp.m6638constructorimpl(f2);
        ActiveIndicatorShape = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(f2));
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m3476getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final RoundedCornerShape getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3477getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3478getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    /* JADX INFO: renamed from: getIconAndLabelTextContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3479getIconAndLabelTextContainerHeightD9Ej5fM() {
        return IconAndLabelTextContainerHeight;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3480getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }
}
