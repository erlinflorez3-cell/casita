package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Paragraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d̉=!,o\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV7ZS0\u0010s{B)cҕyCIa\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xk0\u00172XoG3coEʠhtL\u0005(2(9\u0002\u0005\u0017\u001a2H\u0016v\u0013uY\f*0nqjV\u001bO\u001d\u001a@\tn$\u000f\"tg|;xrc:=)\u001bipMWe6|[\u0014^TU\u0015ɱ`ӜҋD9;\u001e3]\u001b1`[W\u0003mrm\tv)?+wv\b<^\u007f\"\u001bCO;\\#,b\u0005_g$'YW\u0014O^\u0019@w)\bSA\u001c\u0005\u0014'`.[\u001b\u0017\f\u001c@\rr\u0002N\u0001\u0006lQ\u0018z\u0010FG)\u000e7C9Ik\u0002eI*f7*\u0017=\"1\u0014\u0007!\nh>r\u001b\u001bb\ri=aHMN^\fi=\u001c\u001c\u001fy0@4BM\u007f=\u0015):'-GaI%1k0br~%\u001b\u0011nYi`NX\"\u001d\u0015g0\u000f\fhK|\u0005\u001aXղW\u008cҭQ\u001eZ\"\f$+\u000fjwT!S\u0011~Svv\u0003M\f\u0018U3tFqn\u001a\u001e\b=l>MQ\u0012\u001c\u0012V\u0005%W<\u0011\u0017\tjPf$Z\u000b<RDNj\u001e\r\u0014P^\u0014#8Os,4ZIGsC^30HA\u000b\"wfx\u0018\u000fZC&\u0013iR\u000f7\u0018~r!umxW2\u0015`P,qW;\u00194\\:hb\u0005i\f\u0017b\u000eG\u007fLuM\u001d\u001a\u0004b\u0014 D(iU=L+\u000f-9b\u00143EZ\b}]]\u001a7\u0001\r{\u001f;\u0017F\u0016\u001f\u0019\u0007\\rpJ]m/.\u0007f\u0003)\u0018f\u0010y\u0010`)^\u0012j;aDI\u0001\tq<|7-\u000b%\u001e3\b\b\"+=]G5(.wB;Eekz\b.(t?*\u0003\u0003\u001c,\u001246gig@ZPI\b}f\"RxIܩhv\u0006٤Z\tb\f\nǦ\u0014яtV@ԇߕ/\u0003n\n2ޚ\r\u0005Zǎ\u0017\u0010"}, d2 = {"\u0012dU.h3M;\u0015\u0012ab5|\u0017", "", "\u001e`a.Z9:^\u001c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:C", ">`a.Z9:^\u001cb\u0004m9\u0001\u0012=i}6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001c#>", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";`g\u0019\\5>a", "3k[6c:Ba", "", "\u001e`a.Z9:^\u001cFt>2c\u0003vY", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W'r21[\u000b\u001cBpy7\\P?tB\"\u0013v7\u001ejXo5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhr(V}=u|\u0017\u0019c", "EhSA[", "", "BdgA", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "\u001e`a.Z9:^\u001cFj];m\u000b\u007fA", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d15(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\u00185M\u0011\u0005G\u0001\u0015$\u0012D~F)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUn\u001doI\u0004%\u001ez(dIZ7\u0019\\O\u0019vY\u000e&TG'\u0005?5>z1-Jkf8>7.O\u0003Ax6f\u0004\u0001[2\u007fE&\u007ft\u0014Ona%b\u0007$\u0002@6j\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~A\u001d/tc[\u001ePH\u0013h1cl|BU[", "@db<h9<S\u007f\tv],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "1dX9G6\"\\(", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i2, boolean z2, float f2, Density density, Font.ResourceLoader resourceLoader, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((8 & i3) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((16 & i3) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list, (List<AnnotatedString.Range<Placeholder>>) list2, i2, z2, f2, density, resourceLoader);
    }

    @Deprecated(message = "\tU\nI?f\u001ajg\\:}U\u0001;O`Q\u001bf\u000e{KV{V\u0001oQu8kl\u0018$K[o|>G\"rJ\u0013i_9\bgVOK?A\u001b\u0018`a6 \nC\u000e\t\u0011\u0002", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @InterfaceC1492Gx
    public static final Paragraph Paragraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z2, float f2, Density density, Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i2, z2, f2, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List list, List list2, int i2, boolean z2, int i3, Object obj) {
        if ((32 & i3) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((i3 + 128) - (128 | i3) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 + 256) - (i3 | 256) != 0) {
            z2 = false;
        }
        return Paragraph(str, textStyle, f2, density, resolver, (List<AnnotatedString.Range<SpanStyle>>) list, (List<AnnotatedString.Range<Placeholder>>) list2, i2, z2);
    }

    @Deprecated(message = "\u0013G\u000e6x\u0007\u0016g`\u0007<\u0003Q)kb]W\u000e:Du\rj\u007fS\u0004w\u000eu0rwciF\rsq=Z&rC%\u0016P~2jM>fR9\u0016W\u0007$E.\ns\u0005\u0002\u001a\u0003K.L\u0007\nq5G\u0005V#S\u007fB2u", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @InterfaceC1492Gx
    public static final Paragraph Paragraph(String str, TextStyle textStyle, float f2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6384ActualParagraphO3s9Psw(str, textStyle, list, list2, i2, z2, ConstraintsKt.Constraints$default(0, ceilToInt(f2), 0, 0, 13, null), density, resolver);
    }

    /* JADX INFO: renamed from: Paragraph-UdtVg6A$default */
    public static /* synthetic */ Paragraph m6006ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List list, List list2, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i3 + 64) - (64 | i3) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        if ((128 & i3) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
            z2 = false;
        }
        return m6005ParagraphUdtVg6A(str, textStyle, j2, density, resolver, list, list2, i2, z2);
    }

    /* JADX INFO: renamed from: Paragraph-UdtVg6A */
    public static final Paragraph m6005ParagraphUdtVg6A(String str, TextStyle textStyle, long j2, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6384ActualParagraphO3s9Psw(str, textStyle, list, list2, i2, z2, j2, density, resolver);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i2, boolean z2, float f2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return Paragraph(paragraphIntrinsics, i2, z2, f2);
    }

    @Deprecated(message = "\u0013G\u000e6x\u0007\u0016g`\u0007<\u0003Q)kb]W\u000e:Du\rj\u007fS\u0004w\u000eu0rwciF\rsq=Z&rC%\u0016P~2jM>fR9\u0016W\u0007$E.\ns\u0005\u0002\u001a\u0003K.L\u0007\nq5G\u0005V#S\u007fB2u", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    @InterfaceC1492Gx
    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics, int i2, boolean z2, float f2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6383ActualParagraphhBUhpc(paragraphIntrinsics, i2, z2, ConstraintsKt.Constraints$default(0, ceilToInt(f2), 0, 0, 13, null));
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y$default */
    public static /* synthetic */ Paragraph m6008Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, boolean z2, int i3, Object obj) {
        if ((i3 + 4) - (4 | i3) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        return m6007Paragraph_EkL_Y(paragraphIntrinsics, j2, i2, z2);
    }

    /* JADX INFO: renamed from: Paragraph-_EkL_-Y */
    public static final Paragraph m6007Paragraph_EkL_Y(ParagraphIntrinsics paragraphIntrinsics, long j2, int i2, boolean z2) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m6383ActualParagraphhBUhpc(paragraphIntrinsics, i2, z2, j2);
    }

    public static final int ceilToInt(float f2) {
        return (int) Math.ceil(f2);
    }
}
