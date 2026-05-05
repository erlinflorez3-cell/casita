package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntSize;
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
/* JADX INFO: compiled from: TextSelectionDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0010nj?1LeV3ZݷB:yڔL$\n#\"GIU2}P\n\u007fRui\u0007J\t\u000es\u0013\u0014\u001a\u0011jZN\u0006|k\u0018'2pt\u0006\u074cޜs=Gg\rX\u0013(J\"f\u0003-\u0001H+x\u0014\u0005|[K:\u0015`D~>j\r{\nJ\u0016\u0014D8\u0001La.ޮɍLv"}, d2 = {"5dc X3>Q(\u0003\u0005g\u000fx\u0012.l\u007f\u0006\u0006J\u000e\u0016\u001bPk\u001d<\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "BdgA?(R])\u000eg^:\r\u0010>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "=eU@X;", "", "7rBAT9M", "", "/qT\u0015T5=Z\u0019\rXk6\u000b\u0017/d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCsx]V|k", "5dc\u0015b9Bh#\b\nZ3g\u0013=i\u000f,\u0006I", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextSelectionDelegateKt {
    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        int lineForOffset = textLayoutResult.getLineForOffset(i2);
        return lineForOffset >= textLayoutResult.getLineCount() ? Offset.Companion.m3952getUnspecifiedF1C5BW0() : OffsetKt.Offset(RangesKt.coerceIn(getHorizontalPosition(textLayoutResult, i2, z2, z3), 0.0f, IntSize.m6808getWidthimpl(textLayoutResult.m6096getSizeYbymL2g())), RangesKt.coerceIn(textLayoutResult.getLineBottom(lineForOffset), 0.0f, IntSize.m6807getHeightimpl(textLayoutResult.m6096getSizeYbymL2g())));
    }

    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i2, boolean z2, boolean z3) {
        return textLayoutResult.getHorizontalPosition(i2, textLayoutResult.getBidiRunDirection(((!z2 || z3) && (z2 || !z3)) ? Math.max(i2 + (-1), 0) : i2) == textLayoutResult.getParagraphDirection(i2));
    }
}
