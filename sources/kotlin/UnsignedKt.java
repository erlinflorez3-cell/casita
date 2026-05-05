package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
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
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u0003\bI\u00066\u000b6B\u0015\"4\u0012}\u0007njG6LeN5ZS8\u0016s{:)c$\u007fOCU }:\u001c]Ȟ\u007fg\u001dI\u000b\u000fQ\u000f\u001e\u0016'krHǤ|] \u0011JU}BKM\u001eAid\u00036\u001d `#~xڱ\u0005\u001a8M(\r\tIc\f@7ptHZ%M3!B\nL)\u0019\u001e\u000bn\u00155`\nkDG#1hrR5gH|{\fvX5\u0016\u000faL*\u00076߱\u0019'Y\u000e\u0015^s\\\u0011L\n=3gW+9Q\fWdW0\u0018#4g\r\fql[ԇUb\u001259[{Y^\u001d@w)|=@\u0012\u000e\u001e'v5s\u0019~\u001e\u001cC\rr\u0002G\u0001\u0006lJ\u0018z\u0010GG)\u000e<C9Iw\u0018`S6\\I\u0014\u0005;\"S\u0005|)sT<dE\u001fb\u0001i1\u007fD\u0004Gݳ\u000e[C\u0001\u0012\u0005z\u001f8\u0019HG.3,\u0015<\u001f=7\n=S%y\u000b`D\u0016zK_ĈWkX^N6\u0007$EA!\f\tE\u0015\tyPlXZ\"\u0014\u001bl\u0015\f + \u000b\u0011l%3\u0010fO\u0017z1ܔu 3G~7\b\b\u001c\u0012e9v3cb\u0014\u0014ol\u000f\u0014mC)ڳ׃j]"}, d2 = {"2nd/_,-]\tb\u0004m", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "D", "", "uC\u0018\u0016", "2nd/_,-]\te\u0005g.", "\u001aj^A_0G\u001d\te\u0005g.R", "uC\u0018\u0017", "Ch]A66F^\u0015\fz", "", "D0", "D1", "Ch]A70OW\u0018~", "Ch]A70OW\u0018~BCwdhzBo", "uH8u<", "Ch]AE,FO\u001d\by^9", "Ch]AE,FO\u001d\by^9DmzM_sX0", "Ch]AG6\u001d]){\u0002^", "Ck^;Z\nH[$z\b^", "", "Ck^;Z\u000bBd\u001d}z", "Ck^;Z\u000bBd\u001d}z&,yV\u000eH_\f", "uI9u=", "Ck^;Z\u0019>[\u0015\u0003\u0004],\n", "Ck^;Z\u0019>[\u0015\u0003\u0004],\nP/bM\u0007^ d", "Ck^;Z\u001bH2#\u000fwe,", "Ck^;Z\u001bHA(\f~g.", "", "0`b2", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class UnsignedKt {
    public static final int doubleToUInt(double d2) {
        if (Double.isNaN(d2) || d2 <= uintToDouble(0)) {
            return 0;
        }
        if (d2 >= uintToDouble(-1)) {
            return -1;
        }
        return d2 <= 2.147483647E9d ? UInt.m9075constructorimpl((int) d2) : UInt.m9075constructorimpl(UInt.m9075constructorimpl((int) (d2 - ((double) Integer.MAX_VALUE))) + UInt.m9075constructorimpl(Integer.MAX_VALUE));
    }

    public static final long doubleToULong(double d2) {
        if (Double.isNaN(d2) || d2 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d2 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d2 < 9.223372036854776E18d ? ULong.m9154constructorimpl((long) d2) : ULong.m9154constructorimpl(ULong.m9154constructorimpl((long) (d2 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final int uintCompare(int i2, int i3) {
        return Intrinsics.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m9331uintDivideJ1ME1BU(int i2, int i3) {
        long j2 = i3;
        return UInt.m9075constructorimpl((int) (((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))) / ((j2 + 4294967295L) - (j2 | 4294967295L))));
    }

    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m9332uintRemainderJ1ME1BU(int i2, int i3) {
        return UInt.m9075constructorimpl((int) (((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))) % (((long) i3) & 4294967295L)));
    }

    public static final double uintToDouble(int i2) {
        return ((double) ((-1) - (((-1) - Integer.MAX_VALUE) | ((-1) - i2)))) + (((double) ((i2 >>> 31) << 30)) * ((double) 2));
    }

    public static final int ulongCompare(long j2, long j3) {
        return Intrinsics.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m9333ulongDivideeb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return Long.compareUnsigned(j2, j3) < 0 ? ULong.m9154constructorimpl(0L) : ULong.m9154constructorimpl(1L);
        }
        if (j2 >= 0) {
            return ULong.m9154constructorimpl(j2 / j3);
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return ULong.m9154constructorimpl(j4 + ((long) (Long.compareUnsigned(ULong.m9154constructorimpl(j2 - (j4 * j3)), ULong.m9154constructorimpl(j3)) < 0 ? 0 : 1)));
    }

    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m9334ulongRemaindereb3DHEI(long j2, long j3) {
        if (j3 < 0) {
            return Long.compareUnsigned(j2, j3) < 0 ? j2 : ULong.m9154constructorimpl(j2 - j3);
        }
        if (j2 >= 0) {
            return ULong.m9154constructorimpl(j2 % j3);
        }
        long j4 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
        if (Long.compareUnsigned(ULong.m9154constructorimpl(j4), ULong.m9154constructorimpl(j3)) < 0) {
            j3 = 0;
        }
        return ULong.m9154constructorimpl(j4 - j3);
    }

    public static final double ulongToDouble(long j2) {
        return ((j2 >>> 11) * ((double) 2048)) + (j2 & 2047);
    }

    public static final String ulongToString(long j2) {
        return ulongToString(j2, 10);
    }

    public static final String ulongToString(long j2, int i2) {
        if (j2 >= 0) {
            String string = Long.toString(j2, CharsKt.checkRadix(i2));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j3 = i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j4, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        StringBuilder sbAppend = sb.append(string2);
        String string3 = Long.toString(j5, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return sbAppend.append(string3).toString();
    }
}
