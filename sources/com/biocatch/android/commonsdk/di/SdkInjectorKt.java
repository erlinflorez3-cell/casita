package com.biocatch.android.commonsdk.di;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJj\u0015\u0013OيH\u000b\\A5f݈\u0016{\u001fhp9>E\u0006l<Tk,%j*3Z_bu\u001aЧa۟\u00024\u0011ѧ^imqX^#E\u0015\u000b$y\u000b.O[\u0007dܱ\u0013:"}, d2 = {"1n\\:b5\"\\\u001e~xm6\n", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#|$\u0001K 6UMDO=#\u0015fpC\u00149", "5dc\u0010b4F]\"b\u0004c,z\u00189r", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i6q_\fWKCu=\u0002\u001ema7\u0016m9$", "1n\\:b5\"\\\u001e~xm6\nl8s\u000f$\u0005>\u0001", "5dc\u0010b4F]\"b\u0004c,z\u00189rc1\nO| \u0015G.\nE\u007f/DU\r$Av$", "u(E", "5dc\u0010b4F]\"b\u0004c,z\u00189rc1\nO| \u0015G", "Adc\u0010b4F]\"b\u0004c,z\u00189rc1\nO| \u0015G", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001f;7s8UKEt\u0018'\u001ah_H\u0011p\u0002\u0012g", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SdkInjectorKt {
    private static CommonInjector commonInjectorInstance = null;

    public static final CommonInjector getCommonInjector() {
        CommonInjector commonInjector = commonInjectorInstance;
        if (commonInjector != null) {
            return commonInjector;
        }
        CommonInjectorImpl commonInjectorImpl = new CommonInjectorImpl();
        commonInjectorInstance = commonInjectorImpl;
        return commonInjectorImpl;
    }

    public static final CommonInjector getCommonInjectorInstance() {
        return commonInjectorInstance;
    }

    public static /* synthetic */ void getCommonInjectorInstance$annotations() {
    }

    public static final void setCommonInjectorInstance(CommonInjector commonInjector) {
        commonInjectorInstance = commonInjector;
    }
}
