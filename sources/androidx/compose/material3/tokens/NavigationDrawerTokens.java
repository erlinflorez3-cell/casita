package androidx.compose.material3.tokens;

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
/* JADX INFO: compiled from: NavigationDrawerTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005-4\u0012\u000e\u0007nj?2Le^.ZS0\u001as{B)c$wKCU0}*\tUom̨n`ҙ;C=\u0005V}p,֒Yxk\u0012_APpW3{qެ=f|Ȃ\u001d\"8%F}U\u0010(/`\u0010%|ŲO\u0012\u001aؓXr@X\u001bQU) \rV / ֔kT>ԟ\u0005_@71\u0007:Q\\0w0+OϘJZ/˙\u000fc$5N;\u0006$3^\u001b\u0007\u0001]ύ\u0007Eyܵ\u001dj-39MDfDe\u0018\u0014C-̠\u0011cz̦t\u0007Wn\u001a+{fqZh\u000eV\b¶zȞ˖\u0003\rΝ+P6-(y \u00109\u0006\u0001e\u0011_\u0010rZ\u007f)vي\u001b+\bđC;!|_x\f0\\O\u0014\u0005;.ƹ\u007f͙ƈZS\u05f8d\u001d#T\u0006dISFVV`ZhK\b\u001cp\u0011\u0004ò\b6OĉG}\u0017I%)\bjG?9k0Jזk|\r\u009b\u0001UooVDr}$UB\t:\\ֈh\u000bs¬lZ20[ %\u0016\f(+ \u000b\r˶%+\u0018ʚgjo\f[tZ7=\tOY\u001d\u000fdê{ӷ7;Yү(cX\u001b\"Q\rq\u0013}~B\u0002!Ⱥ`.*õ`l\u0016\u001e\n[\u001f#!YWqJDв0ǉě\u0014GҴ\"JI|\u0017rrj\u0016'bEt\u0012wM\r\t/Rʷtuoծa.\u0003\u000b01\u0012`CD>UPjط\u0001)\u000fѨ\f\u0002M\u0014ZK\u001d{$#m{ND׀=W7ˋ+\u0011\u0005X@2}\\Z$}Q{\"ٶy۠ʣ\u000e:ÿ2o\u0010j~?xlP\u0002b)r\u0006l&;\b\u0013\u0002\u05fbeL\u0003ò{V\u0011\u0010LMC\u0012gqf8+\u0007ȷ\"+\tǻ:~;cQ+m%\u0006KG\u0015\u0010_ɳs4\u0002ʬ'(z\u001e\u001204%}\u001ci]`=ΒM_\u0007Ж:&r=PL;\u0007\u0016}!4;5ȈEjxމPO\u0011k\fjW;\u001b.n[h\u0015̭\u0002:6ɾBuI<\"b\u00144\u001f\rkg\u001coљ`\u0011R\u05fa\"\r\u0002q|\u0016lL.\u0018ob72Ӓw\u001e>\u05cdSd\u000b~\u0017(\u0005;JK#C\u0003\u0018ѕ\u0014\u0001\bʋw\u0011\u001dvP$\fe\u001c\u001a\u0011\\\u0005JϖdKhԠB\u0003\u0005UA\"ID?L\u0006F\u0003]ҕ6\u0007[߹!\u001dp\u0018\r\u0017u:R\u001eQ\u001bVZ܁\u000fKeŝa\u0004<NU->\u0003}WP\u0018+-Ħ\u0017Ç˼P\u0010چz8f\u000bcwff|^td\u001f17L\u0013|<>\u009f\u0013\u0011!ۚ\u000bqh{ZRHNQi\u0019\u0017r9ކ\u000bűߦE\u001aұ\n=5=W},)\u0002(aMվ\b)(*\nȮ=\u000bV\u0016f\u0010|Β>g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001V\u0012?QE7z8(\u001eGn5\u0019c9=\u0001-GU\\\u0002", "", "u(E", "\u000fbc6i,\u001f]\u0017\u000f\tB*\u0007\u0012\ro\u00072\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u000eV;Bd\u0019_\u0005\\<\u000bl-o\t\u0006\u0006G\u000b$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u000fbc6i,\u001f]\u0017\u000f\tE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "5dc\u000eV;Bd\u0019_\u0005\\<\u000bo+b\u007f/j@\u0014&tQv\u0018I", "\u000fbc6i,!]*~\bB*\u0007\u0012\ro\u00072\t", "5dc\u000eV;Bd\u0019a\u0005o,\nl-o\t\u0006\u0006G\u000b$", "\u000fbc6i,!]*~\bE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "5dc\u000eV;Bd\u0019a\u0005o,\no+b\u007f/j@\u0014&tQv\u0018I", "\u000fbc6i,\"Q#\bXh3\u0007\u0016", "5dc\u000eV;Bd\u0019bxh5Z\u00136o\r", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\ro\u00072\t", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u0006\u0006G\u000b$", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\u0012e\u0004*~O", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u000b{D\u0003\u001a&\u000fNa\u001c{t6A", "u(5", "\u0014", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016\u001dh{3{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u0016~<\f\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u000fbc6i,\"\\\u0018\u0003xZ;\u0007\u0016!i~7~", "5dc\u000eV;Bd\u0019b\u0004]0z\u0005>o\r\u001a\u007f?\u0010\u001a^&CmAF&\u001d", "\u000fbc6i,%O\u0016~\u0002M,\u0010\u0018\ro\u00072\t", "5dc\u000eV;Bd\u0019ev[,\u0004w/x\u000f\u0006\u0006G\u000b$", "\u000fbc6i,)`\u0019\r\t^+`\u00079n]2\u0003J\u000e", "5dc\u000eV;Bd\u0019i\b^:\u000b\t.I}2\u0005\u001e\u000b\u001e!T", "\u000fbc6i,)`\u0019\r\t^+c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc\u000eV;Bd\u0019i\b^:\u000b\t.L{%{Go\u0017*VM\u0018C\u00012", "\u0010ncAb4\u001c]\"\u000evb5|\u0016\u001dh{3{", "5dc\u000fb;M]!\\\u0005g;x\r8e\r\u0016~<\f\u0017", "\u0011n]AT0GS&azb.\u007f\u0018\u001ae\r&{I\u0010", "", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000f\u0013{M~\u0017 V", "\u0011n]AT0GS&l}Z7|", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "\u0011n]AT0GS&p~];\u007f", "5dc\u0010b5MO\u001d\bzk\u001e\u0001\b>hG\u0007O \u0006f\u0018/", "\u0014nRBf\u0010GR\u001d|vm6\nf9l\n5", "5dc\u0013b*Na|\byb*x\u00189r]2\u0003J\u000e", "\u0016dP1_0GSv\t\u0002h9", "5dc\u0015X(=Z\u001d\bz<6\u0004\u0013<", "\u0016dP1_0GSy\t\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0015X(=Z\u001d\bz?6\u0006\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "\u0017mP0g0OSy\txn:`\u00079n]2\u0003J\u000e", "5dc\u0016a(<b\u001d\u0010z?6z\u0019=I}2\u0005\u001e\u000b\u001e!T", "\u0017mP0g0OSy\txn:c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc\u0016a(<b\u001d\u0010z?6z\u0019=L{%{Go\u0017*VM\u0018C\u00012", "\u0017mP0g0OS{\t\f^9`\u00079n]2\u0003J\u000e", "5dc\u0016a(<b\u001d\u0010zA6\u000e\t<I}2\u0005\u001e\u000b\u001e!T", "\u0017mP0g0OS{\t\f^9c\u0005,e\u0007\u0017{S\u0010t!Ny\u001b", "5dc\u0016a(<b\u001d\u0010zA6\u000e\t<L{%{Go\u0017*VM\u0018C\u00012", "\u0017mP0g0OS||\u0005g\n\u0007\u00109r", "5dc\u0016a(<b\u001d\u0010zB*\u0007\u0012\ro\u00072\t", "\u0017mP0g0OS\u007fzw^3k\tBt]2\u0003J\u000e", "5dc\u0016a(<b\u001d\u0010zE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "\u0017mP0g0OS\u0004\fzl:|\b\u0013c\n1YJ\b!$", "5dc\u0016a(<b\u001d\u0010zI9|\u0017=e~\fyJ\nt!Ny\u001b", "\u0017mP0g0OS\u0004\fzl:|\b\u0016a|(\u0003/\u0001*&%y\u0015F\u0004", "5dc\u0016a(<b\u001d\u0010zI9|\u0017=e~\u000fw=\u0001\u001e\u0006G\u0003\u001d\u001a\u0001,?f", "\u001a`Q2_\u001b>f(_\u0005g;", "5dc\u0019T)>Z\b~\u000em\r\u0007\u0012>", "\u001a`a4X\t:R\u001b~aZ)|\u0010\ro\u00072\t", "5dc\u0019T9@Suzy`,c\u0005,e\u0007\u0006\u0006G\u000b$", "\u001a`a4X\t:R\u001b~aZ)|\u0010\u0010o\t7", "5dc\u0019T9@Suzy`,c\u0005,e\u0007\t\u0006I\u0010", "\u001bnS._\nH\\(z~g,\nf9l\n5", "5dc\u001ab+:Zv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "\u001bnS._\nH\\(z~g,\nh6e\u0011$\u000bD\u000b ", "5dc\u001ab+:Zv\t\u0004m(\u0001\u0012/r_/{Q|&\u001bQxU\u001bJ\u0005:)~\b", "!sP;W(KRv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "5dc g(GR\u0015\fy<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "!sP;W(KRv\t\u0004m(\u0001\u0012/r_/{Q|&\u001bQx", "5dc g(GR\u0015\fy<6\u0006\u0018+i\t(\t \b\u0017(C~\u0012F\u007fl\u0014-]%\u0007n}", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationDrawerTokens {
    public static final int $stable = 0;
    public static final NavigationDrawerTokens INSTANCE = new NavigationDrawerTokens();
    private static final ColorSchemeKeyTokens ActiveFocusIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActiveFocusLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActiveHoverIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActiveHoverLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActiveIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
    private static final float ActiveIndicatorHeight = Dp.m6638constructorimpl((float) 56.0d);
    private static final ShapeKeyTokens ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
    private static final float ActiveIndicatorWidth = Dp.m6638constructorimpl((float) 336.0d);
    private static final ColorSchemeKeyTokens ActiveLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActivePressedIconColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ColorSchemeKeyTokens ActivePressedLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
    private static final ShapeKeyTokens BottomContainerShape = ShapeKeyTokens.CornerLargeTop;
    private static final float ContainerHeightPercent = 100.0f;
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerLargeEnd;
    private static final float ContainerWidth = Dp.m6638constructorimpl((float) 360.0d);
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    private static final ColorSchemeKeyTokens HeadlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final TypographyKeyTokens HeadlineFont = TypographyKeyTokens.TitleSmall;
    private static final float IconSize = Dp.m6638constructorimpl((float) 24.0d);
    private static final ColorSchemeKeyTokens InactiveFocusIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveFocusLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveHoverIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveHoverLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactiveIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens InactivePressedIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens InactivePressedLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelLarge;
    private static final ColorSchemeKeyTokens LargeBadgeLabelColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final TypographyKeyTokens LargeBadgeLabelFont = TypographyKeyTokens.LabelLarge;
    private static final ColorSchemeKeyTokens ModalContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
    private static final float ModalContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final ColorSchemeKeyTokens StandardContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float StandardContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();

    private NavigationDrawerTokens() {
    }

    public final ColorSchemeKeyTokens getActiveFocusIconColor() {
        return ActiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getActiveFocusLabelTextColor() {
        return ActiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverIconColor() {
        return ActiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getActiveHoverLabelTextColor() {
        return ActiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActiveIconColor() {
        return ActiveIconColor;
    }

    public final ColorSchemeKeyTokens getActiveIndicatorColor() {
        return ActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m3341getActiveIndicatorHeightD9Ej5fM() {
        return ActiveIndicatorHeight;
    }

    public final ShapeKeyTokens getActiveIndicatorShape() {
        return ActiveIndicatorShape;
    }

    /* JADX INFO: renamed from: getActiveIndicatorWidth-D9Ej5fM, reason: not valid java name */
    public final float m3342getActiveIndicatorWidthD9Ej5fM() {
        return ActiveIndicatorWidth;
    }

    public final ColorSchemeKeyTokens getActiveLabelTextColor() {
        return ActiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getActivePressedIconColor() {
        return ActivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getActivePressedLabelTextColor() {
        return ActivePressedLabelTextColor;
    }

    public final ShapeKeyTokens getBottomContainerShape() {
        return BottomContainerShape;
    }

    public final float getContainerHeightPercent() {
        return ContainerHeightPercent;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3343getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3344getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getInactiveFocusIconColor() {
        return InactiveFocusIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveFocusLabelTextColor() {
        return InactiveFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverIconColor() {
        return InactiveHoverIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveHoverLabelTextColor() {
        return InactiveHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactiveIconColor() {
        return InactiveIconColor;
    }

    public final ColorSchemeKeyTokens getInactiveLabelTextColor() {
        return InactiveLabelTextColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedIconColor() {
        return InactivePressedIconColor;
    }

    public final ColorSchemeKeyTokens getInactivePressedLabelTextColor() {
        return InactivePressedLabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    public final ColorSchemeKeyTokens getLargeBadgeLabelColor() {
        return LargeBadgeLabelColor;
    }

    public final TypographyKeyTokens getLargeBadgeLabelFont() {
        return LargeBadgeLabelFont;
    }

    public final ColorSchemeKeyTokens getModalContainerColor() {
        return ModalContainerColor;
    }

    /* JADX INFO: renamed from: getModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3345getModalContainerElevationD9Ej5fM() {
        return ModalContainerElevation;
    }

    public final ColorSchemeKeyTokens getStandardContainerColor() {
        return StandardContainerColor;
    }

    /* JADX INFO: renamed from: getStandardContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3346getStandardContainerElevationD9Ej5fM() {
        return StandardContainerElevation;
    }
}
