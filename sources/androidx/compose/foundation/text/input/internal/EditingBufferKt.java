package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJf\r$OيH\u000b\\A/&:\u0012\u0010\u0007\u0015ii4Rf`.\u0001RpşԿzéż_&wEIXڿ}'\u0011RT˖\u0004\u001dIӂ\u000fG"}, d2 = {"CoS.g,+O\"\u0001z:-\f\t<D\u007f/{O\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "B`a4X;", "2d[2g,=", "CoS.g,+O\"\u0001z:-\f\t<D\u007f/{O\u0001^\"9N\"\u000eJ\r", "uI9u=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m1482updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int iM6119getLengthimpl;
        int iM6121getMinimpl = TextRange.m6121getMinimpl(j2);
        int iM6120getMaximpl = TextRange.m6120getMaximpl(j2);
        if (TextRange.m6125intersects5zctL8(j3, j2)) {
            if (TextRange.m6113contains5zctL8(j3, j2)) {
                iM6121getMinimpl = TextRange.m6121getMinimpl(j3);
                iM6120getMaximpl = iM6121getMinimpl;
            } else {
                if (TextRange.m6113contains5zctL8(j2, j3)) {
                    iM6119getLengthimpl = TextRange.m6119getLengthimpl(j3);
                } else if (TextRange.m6114containsimpl(j3, iM6121getMinimpl)) {
                    iM6121getMinimpl = TextRange.m6121getMinimpl(j3);
                    iM6119getLengthimpl = TextRange.m6119getLengthimpl(j3);
                } else {
                    iM6120getMaximpl = TextRange.m6121getMinimpl(j3);
                }
                iM6120getMaximpl -= iM6119getLengthimpl;
            }
        } else if (iM6120getMaximpl > TextRange.m6121getMinimpl(j3)) {
            iM6121getMinimpl -= TextRange.m6119getLengthimpl(j3);
            iM6119getLengthimpl = TextRange.m6119getLengthimpl(j3);
            iM6120getMaximpl -= iM6119getLengthimpl;
        }
        return TextRangeKt.TextRange(iM6121getMinimpl, iM6120getMaximpl);
    }
}
