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
/* JADX INFO: compiled from: ElevatedButtonTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?4Le^.ZS0\u0014s{B)c$w_CU0}*\tUUm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012_APpW3{qެ=f|Ȃ\u001d\"8%F}U\u0018(/`\u0010%\u0001ǈJÈݮ/?¤>Z\u0015M\u0013#*\bD'\u000f&-~\\@`l\f@Ȼ\"Ʌ\u07bcAMϮc8\u0005M\u001bOl)\u0013\u0002o&{OEA-%\u0002\u0010\u07baVaGšWsC\u0013v6w:W\u0004o6\u0007\u0002Џ\u00191WՕut,m\u0013U1#5=gcyV̤'»¶z\fʀ\b\u0016\u000e'V7E\u001cl\u001b\u001c;E\u0005aTh\u0002\rWVд$ي\u001b+\bđC;!|_i\f(\\N\u0014\u0005; ţ\u0005t)żl\u0010f-)XHc?jX=vc`Զ\u007fъ\bvj̣B\u00066a\u000e7L <2=7\n;؝%q\n҆\\i|!nl${`eX\"\u001d+\u000eѮKɔ^Jlʍ\u0004RZv:\u0019\u001e3b&\u0016\bA&иv˓Ȓ$\u000fʽSpqj[f\"'5\u0007Ea?z\u001cxQ^a7Ʉg\u0016i\u05ec\u000f\u0016E^p\t)uPv$Z\u000b*ϒ6Nrݘ\u0010}Jr\u001a\u0017\u0003N\u007fAL,_\u001bÅ\u0019N\u000bٜZC\u0003/m^9'\r{K$1o̾sէˏO[ʼso\u0001I:\u0006x$3i_=i5cK\u00014+%ȷ\u0003y\bø\u007fNMvz\u001aFd\nK.\u001agSȠA\u0019\u0017ȯA4\bYSPCt_z*')~ɍ\u0013Ap֫\u007f\np\u001f:d;a]\u0004/\"%dҩ\"Ψݦ~xӶJ\u0003Ocb\u0014s@O#\u0011a\r]F.\u001d\u001fL'˽s(\u0005ކEE-O${d>#\u0015ui\u001ebԃf\u0015.۩}\u00062\u0019$&3hkiS8w_͓=Эڳk\u0002\u074cLr\u007f\bP\u0012L\u000f9\u0001OlAeF\u0007#/,h¡0\u0013x£s<\u0019*\f8~n8/[}B`ǜ)\u0017Uω\u007fos\bj\u000fͪ\u000f\u0013\u0013~7ߍ.J<(V]\u0002ק4C"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001M\u001d.^?Jk3z%wpC\u0010R6Tv0U\"", "", "u(E", "\u0011n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u0011n]AT0GS&^\u0002^=x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010b5MO\u001d\bzk\f\u0004\t@a\u000f,\u0006IHuj't]=^", "u(5", "\u0014", "\u0011n]AT0GS&azb.\u007f\u0018", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000foZ\u0014`\u001cfHW", "\u0011n]AT0GS&l}Z7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u0012hb.U3>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "\u0012hb.U3>Rv\t\u0004m(\u0001\u0012/r_/{Q|&\u001bQx", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t \b\u0017(C~\u0012F\u007fl\u0014-]%\u0007n}", "\u0012hb.U3>Rv\t\u0004m(\u0001\u0012/ri3w>\u0005&+", "", "5dc\u0011\\::P ~y<6\u0006\u0018+i\t(\t*\f\u0013\u0015K~\"", "\u0012hb.U3>R||\u0005g\n\u0007\u00109r", "5dc\u0011\\::P ~yB*\u0007\u0012\ro\u00072\t", "\u0012hb.U3>R||\u0005g\u0016\b\u0005-i\u000f<", "5dc\u0011\\::P ~yB*\u0007\u0012\u0019p{&\u007fO\u0015", "\u0012hb.U3>R\u007fzw^3k\tBt]2\u0003J\u000e", "5dc\u0011\\::P ~yE(y\t6T\u007f;\u000b\u001e\u000b\u001e!T", "\u0012hb.U3>R\u007fzw^3k\tBti3w>\u0005&+", "5dc\u0011\\::P ~yE(y\t6T\u007f;\u000b*\f\u0013\u0015K~\"", "\u0014nRBf\nH\\(z~g,\nh6e\u0011$\u000bD\u000b ", "5dc\u0013b*Nav\t\u0004m(\u0001\u0012/r_/{Q|&\u001bQxU\u001bJ\u0005:)~\b", "\u0014nRBf\u0010<]\"\\\u0005e6\n", "5dc\u0013b*Na||\u0005g\n\u0007\u00109r", "\u0014nRBf\u0010GR\u001d|vm6\nf9l\n5", "5dc\u0013b*Na|\byb*x\u00189r]2\u0003J\u000e", "\u0014nRBf\u0013:P\u0019\u0006i^?\ff9l\n5", "5dc\u0013b*Na\u007fzw^3k\tBt]2\u0003J\u000e", "\u0016ne2e\nH\\(z~g,\nh6e\u0011$\u000bD\u000b ", "5dc\u0015b=>`v\t\u0004m(\u0001\u0012/r_/{Q|&\u001bQxU\u001bJ\u0005:)~\b", "\u0016ne2e\u0010<]\"\\\u0005e6\n", "5dc\u0015b=>`||\u0005g\n\u0007\u00109r", "\u0016ne2e\u0013:P\u0019\u0006i^?\ff9l\n5", "5dc\u0015b=>`\u007fzw^3k\tBt]2\u0003J\u000e", "\u0017b^;66E]&", "5dc\u0016V6G1#\u0006\u0005k", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "\u001a`Q2_\u001b>f(\\\u0005e6\n", "5dc\u0019T)>Z\b~\u000em\n\u0007\u00109r", "\u001a`Q2_\u001b>f(_\u0005g;", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0019T)>Z\b~\u000em\r\u0007\u0012>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", "\u001eqT@f,=1#\b\nZ0\u0006\t<E\u0007(\r<\u0010\u001b!P", "5dc\u001de,La\u0019}Xh5\f\u00053n\u007f5[G\u0001(\u0013Vs\u0018E>\u0004\t9\u0003o8U", "\u001eqT@f,=7\u0017\t\u0004<6\u0004\u0013<", "5dc\u001de,La\u0019}^\\6\u0006f9l\n5", "\u001eqT@f,=:\u0015{ze\u001b|\u001c>C\n/\u0006M", "5dc\u001de,La\u0019}aZ)|\u0010\u001ee\u00137YJ\b!$", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ElevatedButtonTokens {
    public static final int $stable = 0;
    public static final ElevatedButtonTokens INSTANCE = new ElevatedButtonTokens();
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final float ContainerHeight = Dp.m6638constructorimpl((float) 40.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerFull;
    private static final ColorSchemeKeyTokens DisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledContainerElevation = ElevationTokens.INSTANCE.m3191getLevel0D9Ej5fM();
    private static final float DisabledContainerOpacity = 0.12f;
    private static final ColorSchemeKeyTokens DisabledLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledLabelTextOpacity = 0.38f;
    private static final float FocusContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    private static final ColorSchemeKeyTokens FocusLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final float HoverContainerElevation = ElevationTokens.INSTANCE.m3193getLevel2D9Ej5fM();
    private static final ColorSchemeKeyTokens HoverLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens LabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final TypographyKeyTokens LabelTextFont = TypographyKeyTokens.LabelLarge;
    private static final float PressedContainerElevation = ElevationTokens.INSTANCE.m3192getLevel1D9Ej5fM();
    private static final ColorSchemeKeyTokens PressedLabelTextColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens DisabledIconColor = ColorSchemeKeyTokens.OnSurface;
    private static final float DisabledIconOpacity = 0.38f;
    private static final ColorSchemeKeyTokens FocusIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens HoverIconColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens IconColor = ColorSchemeKeyTokens.Primary;
    private static final float IconSize = Dp.m6638constructorimpl((float) 18.0d);
    private static final ColorSchemeKeyTokens PressedIconColor = ColorSchemeKeyTokens.Primary;

    private ElevatedButtonTokens() {
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3177getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3178getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getDisabledContainerColor() {
        return DisabledContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3179getDisabledContainerElevationD9Ej5fM() {
        return DisabledContainerElevation;
    }

    public final float getDisabledContainerOpacity() {
        return DisabledContainerOpacity;
    }

    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    public final float getDisabledLabelTextOpacity() {
        return DisabledLabelTextOpacity;
    }

    /* JADX INFO: renamed from: getFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3180getFocusContainerElevationD9Ej5fM() {
        return FocusContainerElevation;
    }

    public final ColorSchemeKeyTokens getFocusIndicatorColor() {
        return FocusIndicatorColor;
    }

    public final ColorSchemeKeyTokens getFocusLabelTextColor() {
        return FocusLabelTextColor;
    }

    /* JADX INFO: renamed from: getHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3181getHoverContainerElevationD9Ej5fM() {
        return HoverContainerElevation;
    }

    public final ColorSchemeKeyTokens getHoverLabelTextColor() {
        return HoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* JADX INFO: renamed from: getPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3183getPressedContainerElevationD9Ej5fM() {
        return PressedContainerElevation;
    }

    public final ColorSchemeKeyTokens getPressedLabelTextColor() {
        return PressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getDisabledIconColor() {
        return DisabledIconColor;
    }

    public final float getDisabledIconOpacity() {
        return DisabledIconOpacity;
    }

    public final ColorSchemeKeyTokens getFocusIconColor() {
        return FocusIconColor;
    }

    public final ColorSchemeKeyTokens getHoverIconColor() {
        return HoverIconColor;
    }

    public final ColorSchemeKeyTokens getIconColor() {
        return IconColor;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3182getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getPressedIconColor() {
        return PressedIconColor;
    }
}
