package com.statsig.androidsdk;

import java.net.URL;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d̉=!,p\bDJc|\u0004O\u00128\u000b4C\u0007\":\u001b\u007f\u0007llQ>Rf`0hRX\u0011\u001c\u007fB's$ ESY(\u0002:\t}P\u007f\u0006|Or\u000bq\u00156\u001c\u0007qDKkw\f\u0014?6PwW3{um=n}N\u0005N8BD\bڎ\u0019\u001aXGf͓MŲO\f\u001aؓ`|HR%M3\u0019hæ\u0011ŋ\u0005\u001edɡߗ:R"}, d2 = {"\u0011N>\u00197\u00160<\u0013m^F\fvp\u001d", "", "\u0012D5\u000eH\u0013-M\bmaX\u0014j", "3wc?T*M>\u0015\u000e}?9\u0007\u0011\u001fr\u0007", "", "Cq[ g9B\\\u001b", "5dc\u0013T3EP\u0015|\u0001B5}\u0013\u001dt\n5wB\u0001|\u0017[", "7r3<`(B\\yz~e<\n\t", "", "3qa<e\u0014LU", "Bh\\2W\u0016Nb", "6`b\u001bX;P]&\u0005", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class NetworkFallbackResolverKt {
    public static final long COOLDOWN_TIME_MS = 14400000;
    public static final long DEFAULT_TTL_MS = 604800000;

    public static final String extractPathFromUrl(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        try {
            return new URL(urlString).getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String getFallbackInfoStorageKey() {
        return "statsig.network_fallback";
    }

    public static final boolean isDomainFailure(String str, boolean z2, boolean z3) {
        if (z3) {
            return z2 || str != null;
        }
        return false;
    }
}
