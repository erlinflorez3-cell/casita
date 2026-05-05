package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!4i\bӵLc\u0003\nIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.ZS0\u0010s{J$c$wDCU0}*ޛgzu˧\u0007J\t\ns\u0013\u0014\u0016\u0011jZJ\u0006~c\u0012\u001d4Zom6}uC9nxN\u0005N7h=ҿ\u0004Џʀ.J\u0016|\tJcB ؓXphQ=Q\u0013\u001a*\u0006l!1$bg\\8`l\f=_)\tiPR?_^\u0002}\u0013LT5\u0015\u000faL4\u0007<Æ\u0014Ǭ٨\u0007\tXeM\u000eW2Kݛ\u0001'U*ywe6p\u007fB\u0016[U\u0013]\u0001(t\u0005\u007fc<-1OqOh\u000eV|+\u0002\u0013<\u0012\u0016\u001e'v7] l\b\u001c?\rr\u0002M\u0017\u0007\u0081Aȕѐe8\u001d3\u000eBCC)viai*v7*\u0004S#Ń\u0001s)^Z\u05f7|C\u001aǁ{c"}, d2 = {"\u0014n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "@db\u0016W", "", "EdX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "\u0014n]A \u0019>b\u0003\u0003^`", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCsx,H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018:\r\u0018h\u000b%xMFhh6R\u0011\u0011", ":nP1\\5@A(\fvm,~\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FT *LGDm\"-\"dp9\tw\u0002", "\u0014n]A  IB ea)", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCsxL% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u001c\u0005lPmoN@.Q\rS\u000bJ>", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "\u0014n]A \r\f\\\u007fQ\u0001d", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCsxLH5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018:\r\u0018h\u000b%xMFhh6R\u0011,d\u000e\u0010\u0012\u001d9ty\u0001D\u0010V\t\u0019~C7>\n@[\u0003FNOf)wU]'dED2\u0014;)\u001f2_.\u001d\u000b\u001d\u0012|[\t1HQ\"\n\u000e", "Bn5<a;\u001fO!\u0003\u0002r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontKt {
    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m6214FontRetOiIg$default(int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        return m6213FontRetOiIg(i2, fontWeight, i3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0002bj|BR]\u0016I\u001ff[\r'\u0018\u0019\t8\f", replaceWith = @ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m6213FontRetOiIg(int i2, FontWeight fontWeight, int i3) {
        return new ResourceFont(i2, fontWeight, i3, null, FontLoadingStrategy.Companion.m6225getBlockingPKNRLFQ(), 8, null);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m6216FontYpTlLL0$default(int i2, FontWeight fontWeight, int i3, int i4, int i5, Object obj) {
        if ((2 & i5) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((4 & i5) != 0) {
            i3 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i4 = FontLoadingStrategy.Companion.m6225getBlockingPKNRLFQ();
        }
        return m6215FontYpTlLL0(i2, fontWeight, i3, i4);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m6215FontYpTlLL0(int i2, FontWeight fontWeight, int i3, int i4) {
        return new ResourceFont(i2, fontWeight, i3, new FontVariation.Settings(new FontVariation.Setting[0]), i4, null);
    }

    /* JADX INFO: renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m6212FontF3nL8kk$default(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((4 & i5) != 0) {
            i3 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 8)) != 0) {
            i4 = FontLoadingStrategy.Companion.m6225getBlockingPKNRLFQ();
        }
        if ((-1) - (((-1) - i5) | ((-1) - 16)) != 0) {
            settings = FontVariation.INSTANCE.m6255Settings6EWAqTQ(fontWeight, i3, new FontVariation.Setting[0]);
        }
        return m6211FontF3nL8kk(i2, fontWeight, i3, i4, settings);
    }

    /* JADX INFO: renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m6211FontF3nL8kk(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings) {
        return new ResourceFont(i2, fontWeight, i3, settings, i4, null);
    }

    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
