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
/* JADX INFO: compiled from: TopAppBarLargeTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?4Le^.ZS0\u0014s{J$c$wLAڦ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016Iy:Jmx\f\u0014Ƥ6HwЀKOu@GdEM\u0013%J\"f\u007f܇\u007fɝߋG\u000fͯ~KS\f 9Xr@Y\u001bUU1 \u0010V /$תfޮʝGkҺ>7+\u0003wKf)e;\u000bU]Ub3%v\u0010+ҋD==Ֆ=U\t\u0015`j\u0010\u0012M\u0002U\u0005\u0017)ݳ/O{ɎNZ\u0006%#/ \u001ck\u0005>\\3Sԃ\u0010-3Ւ{MV!6{K\u000b\u001bP\u001c\u000e4<ρ23\"Ǒ \u00109\u000b\u0001j\u0011_\u0010vZ\u007f)cي\u001b+\bđC;!\u007f_e\f0\\Q\u0014\u0005;$ƹ\u007f͙ƈZS\u05f8d\u001d#T\u0006ZISFXVVZhK\n\u001cp\u0011\u0004ò\b6OĉG}\u0017K%)\brGA9k0Nجfϸߌ_gרmZP@0w.90(\u001abըd\u000esSZвH?L$T\r\u001dݚ\u0017@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\ 9)NFH0+{dn;\u0007R6Tv0U\"", "", "u(E", "\u0011n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u0011n]AT0GS&^\u0002^=x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010b5MO\u001d\bzk\f\u0004\t@a\u000f,\u0006IHuj't]=^", "u(5", "\u0014", "\u0011n]AT0GS&azb.\u007f\u0018", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000foZ\u0014`\u001cfHW", "\u0011n]AT0GS&l}Z7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u0011n]AT0GS&l\u000bk-x\u0007/T\u00041\u000b'|+\u0017TM\u0018C\u00012", "5dc\u0010b5MO\u001d\bzk\u001a\r\u00160a}(jD\n&}C\u0004\u000eIT/<c\u000b", "\u0016dP1_0GSv\t\u0002h9", "5dc\u0015X(=Z\u001d\bz<6\u0004\u0013<", "\u0016dP1_0GSy\t\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0015X(=Z\u001d\bz?6\u0006\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", "\u001adP1\\5@7\u0017\t\u0004<6\u0004\u0013<", "5dc\u0019X(=W\"\u0001^\\6\u0006f9l\n5", "\u001adP1\\5@7\u0017\t\u0004L0\u0012\t", "5dc\u0019X(=W\"\u0001^\\6\u0006v3z\u007foZ\u0014`\u001cfHW", "\"qP6_0GU||\u0005g\n\u0007\u00109r", "5dc!e(BZ\u001d\b|B*\u0007\u0012\ro\u00072\t", "\"qP6_0GU||\u0005g\u001a\u0001\u001e/", "5dc!e(BZ\u001d\b|B*\u0007\u0012\u001di\u0015(C\u001fTv\u001c\u0017pu", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TopAppBarLargeTokens {
    public static final int $stable = 0;
    private static final float LeadingIconSize;
    private static final float TrailingIconSize;
    public static final TopAppBarLargeTokens INSTANCE = new TopAppBarLargeTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float ContainerHeight = Dp.m6638constructorimpl((float) 152.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerNone;
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
    private static final ColorSchemeKeyTokens HeadlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final TypographyKeyTokens HeadlineFont = TypographyKeyTokens.HeadlineMedium;
    private static final ColorSchemeKeyTokens LeadingIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens TrailingIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;

    private TopAppBarLargeTokens() {
    }

    static {
        float f2 = (float) 24.0d;
        LeadingIconSize = Dp.m6638constructorimpl(f2);
        TrailingIconSize = Dp.m6638constructorimpl(f2);
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3570getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3571getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3572getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* JADX INFO: renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3573getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
