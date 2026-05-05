package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: LayoutUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDJc|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007toA0JfP.`Y2\u000fq\u0001LTiҕ\nCiTJ\u00020\tgN\u0016f\u001fNh\f[\u000f4\u0018)n:Lmx\f\u0016?6PtW3{u\u0004ʠǔsȂӯ$4(?\b\r\u0019B8Q(v)M{\u0010 1XphT=Q\u0013\u001d*\u0006l$1\"jrf6vv$ŽȻ\"ɅݦFP-k>\ne=Tb?\r%kN/N7M\u0015SR3\u000b`\\W\u0003msm\tv*?+ww\b:f\u0005,\u0015YUSƞů%ؘԇUb\u001269_ҭKU\u0016+}ߠ\u0018;;ǲ\u0012\u0017"}, d2 = {"4h]._\nH\\'\u000e\bZ0\u0006\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1n]@g9:W\"\u000e\t", "AnUAJ9:^", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "", "4h]._\nH\\'\u000e\bZ0\u0006\u0018=-\u000f)\\#~v\u000b", "uII\u00169o#", "4h]._\u0014:f\u007f\u0003\u0004^:", "", ";`g\u0019\\5>a|\b", "4h]._\u0014:f\u007f\u0003\u0004^:D\u001c.lk\fH\u000f", "uY8\u0016\u001c\u0010", "4h]._\u0014:f\u000b\u0003ym/", "4h]._\u0014:f\u000b\u0003ym/D\u00180Fb&[4", "uII\u00169o\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LayoutUtilsKt {
    /* JADX INFO: renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1637finalConstraintstfFHcEY(long j2, boolean z2, int i2, float f2) {
        return Constraints.Companion.m6600fitPrioritizingWidthZbe2FdA(0, m1639finalMaxWidthtfFHcEY(j2, z2, i2, f2), 0, Constraints.m6590getMaxHeightimpl(j2));
    }

    /* JADX INFO: renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1639finalMaxWidthtfFHcEY(long j2, boolean z2, int i2, float f2) {
        int iM6591getMaxWidthimpl = ((z2 || TextOverflow.m6569equalsimpl0(i2, TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) && Constraints.m6587getHasBoundedWidthimpl(j2)) ? Constraints.m6591getMaxWidthimpl(j2) : Integer.MAX_VALUE;
        return Constraints.m6593getMinWidthimpl(j2) == iM6591getMaxWidthimpl ? iM6591getMaxWidthimpl : RangesKt.coerceIn(TextDelegateKt.ceilToIntPx(f2), Constraints.m6593getMinWidthimpl(j2), iM6591getMaxWidthimpl);
    }

    /* JADX INFO: renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1638finalMaxLinesxdlQI24(boolean z2, int i2, int i3) {
        if (z2 || !TextOverflow.m6569equalsimpl0(i2, TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) {
            return RangesKt.coerceAtLeast(i3, 1);
        }
        return 1;
    }
}
