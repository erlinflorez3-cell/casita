package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: ActualParagraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0010nʑA0ZeP.XT2\u000fy\b<řc$\bCC٥\"}0'WN}gvJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoU3UoC:htD\n(݅*8\u0010\u0005\tɝBx\u001e͌\u0013Cy\u000bB4NpRR;N5\u001e \bV /!\rk\\:`l\f?_'\u0011oZNUfvŧת\fϿù+\u000f|i,4X(CՖ=S1\u0006\u0003_M\rWqk\u0010\u0019+57as\u0006C\t\u0010\"#C[\u001de\u0003,l\u0007a`:8Y_\u0012Z\u0001\u001e6\n\u0013\b\u001dD\u0014\u0014\u0016)X.[-\u0015\u0018<B%vaBh\u0002\rE0~o:/%.8[=)liai ~;\n\u0019%\u001eQ\u0016\u001f%ij&`C2\u001bȭϼ0҅͘AJT\"gV\u0006j~ç\u001a*2/w\u0004=\u0006).E0g_G/9k0Utw\u0005\u0013xtcqbNP$~\u0016e;7\u001c\tS\u0015\u0015ybld<\u0019]\"d\t\u000e\bA3\u000b\bj0U\u0014\\Q\u0001i\u0019P\u000e\u000e33~7\bs\u001c\u0012eSv3cl\u0014\u0014of\u000f\u0014mQ\u0013\tf\u0003ZS:w#'β2Mr\u0013}ԝ`|\u000bƷ6]"}, d2 = {"\u000fbcBT3)O&z|k(\b\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:C", ">`a.Z9:^\u001cb\u0004m9\u0001\u0012=i}6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001c#>", ";`g\u0019\\5>a", "", "3k[6c:Ba", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u000fbcBT3)O&z|k(\b\fv-\u0003\u0005kC\f\u0015", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W'r21[\u000b\u001cBpy7\\P?tB\"\u0013v7\u001d{Ho5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b3nWFhr(V}=u|\u0017\u0019c", "BdgA", "", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "\u000fbcBT3)O&z|k(\b\fvOM6O+\u000f)", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^WaL\u0016Q;b}'\u001d3S(mN<M#\u0016aW5/\u001b\u0014/()jU3h\u0018;M\t\u0005O\u0005\u001a%c\u0019_U)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUo&`I\u0004\u0003\u0014z'\u001fwd\u0004pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010Us\u001fKt:.\u0015|\u0002\u001bA\"U5}<d02:k\u0019\nT\u0018Lh\u007f&,i\u0017j\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~A\u001d/tc[\u001ePH\u0013h1cl|BU[", "EhSA[", "", "@db<h9<S\u007f\tv],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidParagraph_androidKt {
    @Deprecated(message = "\tU\nI?f\u001ajg\\:}U\u0001;O`Q\u001bf\u000e{KV{V\u0001oQu8kl\u0018$K[o|>G\"rJ\u0013i_9\bgVOK?A\u001b\u0018`a6 \nC\u000e\t\u0011\u0002", replaceWith = @ReplaceWith(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    @InterfaceC1492Gx
    public static final Paragraph ActualParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z2, float f2, Density density, Font.ResourceLoader resourceLoader) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density), i2, z2, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f2), 0, 0, 13, null), null);
    }

    /* JADX INFO: renamed from: ActualParagraph-O3s9Psw, reason: not valid java name */
    public static final Paragraph m6384ActualParagraphO3s9Psw(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i2, boolean z2, long j2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i2, z2, j2, null);
    }

    /* JADX INFO: renamed from: ActualParagraph--hBUhpc, reason: not valid java name */
    public static final Paragraph m6383ActualParagraphhBUhpc(ParagraphIntrinsics paragraphIntrinsics, int i2, boolean z2, long j2) {
        Intrinsics.checkNotNull(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i2, z2, j2, null);
    }
}
