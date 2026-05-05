package com.squareup.wire.internal;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,p\bDJi\r\u001aOيH\u000b\\A/&:\u0012\u0010\u0007\u0015ii4Rf`.\u0001Rpş\u0004\u0012B&s$ BkY(\u0001:\t}M\u0018k|Nr\u000bq\u000eLǝ\u0011\u0001:Nmx\f\u0011?6PrW3{nm=nxN\u0005N1h\u0600\u001a\u0011\u000f BH>uQŐ\u001eë\u00160H\u0081ĖV\u0014"}, d2 = {"/cS\u0012k(<b\u007f\t\u0004`", "", "F", "G", "4k^<e\u000bBd\u007f\t\u0004`", "2he6W,GR", "2he6f6K", "4k^<e\u0014HR\u007f\t\u0004`", "\u001c@=\u001cF&)3\u0006xh>\nfq\u000e", "Eha2 9N\\(\u0003\u0003^"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class MathMethodsKt {
    public static final long NANOS_PER_SECOND = 1000000000;

    public static final long addExactLong(long j2, long j3) {
        long j4 = j2 + j3;
        if ((-1) - (((-1) - ((j3 ^ j2) < 0 ? 1 : 0)) & ((-1) - ((j2 ^ j4) < 0 ? 0 : 1))) != 0) {
            return j4;
        }
        throw new ArithmeticException();
    }

    public static final long floorDivLong(long j2, long j3) {
        long j4 = j2 / j3;
        return (j2 - (j3 * j4) != 0 && (-1) - (((-1) - ((j2 ^ j3) >> 63)) & ((-1) - 1)) < 0) ? j4 - 1 : j4;
    }

    public static final long floorModLong(long j2, long j3) {
        long j4 = j2 % j3;
        if (j4 == 0) {
            return 0L;
        }
        return (((j2 ^ j3) >> 63) | 1) > 0 ? j4 : j4 + j3;
    }
}
