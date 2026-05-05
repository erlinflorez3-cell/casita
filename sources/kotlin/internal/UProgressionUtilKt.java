package kotlin.internal;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bDJf|\u0004W\u00068\u000b4F\u0007\":\u0018\u007fјnjG7LeN.jx8ş\u0004{b#\f(\u007fCSUH|R\r]O\u007fg\u001dI\u000b\u000fQ\u0011\u001e\u0016'irIǤ|_\u0018\u0012@F\bdAݹ\b=ge%:\u0013 J\"f~5\u0005(+`\u0010%\u007fsO\u001a\u0014H@\u001f?\u0019\r̂\t\u001c\u0018\fL'\u0019Cjof6vk\u000e>=,\u001bipMWc>\u0007e\rtSW\u0011\u0005l6+nC{\u0014ȏW\u0005\r_iC\u001bd\u007fE\u001dhU,[M\u0002`NX.\u0019E/]\u0017urTa5Un\u0017?+}q\u0012Oˎ,y\u0001\u000b\u001bCǲ\u0012\u0016"}, d2 = {"2hU3X9>\\\u0017~bh+\r\u00109", "\u001aj^A_0G\u001d\tb\u0004m\u0002", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", "2hU3X9>\\\u0017~bh+\r\u00109-q\u001dO/q r", "uH8\u0016\u001c\u0010", "\u001aj^A_0G\u001d\te\u0005g.R", "2hU3X9>\\\u0017~bh+\r\u00109-\u000e$\u0004=~#v", "uI9\u0017\u001c\u0011", "5dc\u001de6@`\u0019\r\tb6\u0006o+s\u000f\b\u0003@\t\u0017 V", "AsP?g", "3mS", "AsT=", "", "5dc\u001de6@`\u0019\r\tb6\u0006o+s\u000f\b\u0003@\t\u0017 V7vByq\b7\f", "", "5dc\u001de6@`\u0019\r\tb6\u0006o+s\u000f\b\u0003@\t\u0017 V7_=\u0006\u0002($\u007f", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m10186differenceModuloWZ9TVnA(int i2, int i3, int i4) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i2, i4);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i3, i4);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iM9075constructorimpl = UInt.m9075constructorimpl(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iM9075constructorimpl : UInt.m9075constructorimpl(iM9075constructorimpl + i4);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m10187differenceModulosambcqE(long j2, long j3, long j4) {
        long jRemainderUnsigned = Long.remainderUnsigned(j2, j4);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j3, j4);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jM9154constructorimpl = ULong.m9154constructorimpl(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jM9154constructorimpl : ULong.m9154constructorimpl(jM9154constructorimpl + j4);
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m10188getProgressionLastElement7ftBX0g(long j2, long j3, long j4) {
        if (j4 > 0) {
            return Long.compareUnsigned(j2, j3) >= 0 ? j3 : ULong.m9154constructorimpl(j3 - m10187differenceModulosambcqE(j3, j2, ULong.m9154constructorimpl(j4)));
        }
        if (j4 < 0) {
            return Long.compareUnsigned(j2, j3) <= 0 ? j3 : ULong.m9154constructorimpl(j3 + m10187differenceModulosambcqE(j2, j3, ULong.m9154constructorimpl(-j4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m10189getProgressionLastElementNkh28Cs(int i2, int i3, int i4) {
        if (i4 > 0) {
            return Integer.compareUnsigned(i2, i3) >= 0 ? i3 : UInt.m9075constructorimpl(i3 - m10186differenceModuloWZ9TVnA(i3, i2, UInt.m9075constructorimpl(i4)));
        }
        if (i4 < 0) {
            return Integer.compareUnsigned(i2, i3) <= 0 ? i3 : UInt.m9075constructorimpl(i3 + m10186differenceModuloWZ9TVnA(i2, i3, UInt.m9075constructorimpl(-i4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
