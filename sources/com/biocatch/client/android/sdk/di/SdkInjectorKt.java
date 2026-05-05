package com.biocatch.client.android.sdk.di;

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
@Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJj\u0015\u0013OيH\u000b\\A5f݈\u0016{\u001fhp9>E\u0006l<Tk,%j*3Z_bu\u001aЧa۟\u00024\u0011ѧ^imqX^#E\u0015\u000b$y\u000b.O[\u0007dܱ\u0013:"}, d2 = {"AcZ\u0016a1>Q(\t\b", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001f;7\u0004-S'Dp4\u001c$rn\u000f", "5dc W2\"\\\u001e~xm6\n", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001l\u001aw;BAO=#\u0015fpC\u00149", "AcZ\u0016a1>Q(\t\bB5\u000b\u0018+n}(", "5dc W2\"\\\u001e~xm6\nl8s\u000f$\u0005>\u0001U\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc W2\"\\\u001e~xm6\nl8s\u000f$\u0005>\u0001", "Adc W2\"\\\u001e~xm6\nl8s\u000f$\u0005>\u0001", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i6q_\u001cLI\u001ft9\u001e\u0013wkF\\'\u001d", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 2, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SdkInjectorKt {
    private static SdkInjector sdkInjectorInstance = null;

    public static final SdkInjector getSdkInjector() {
        SdkInjector sdkInjector = sdkInjectorInstance;
        if (sdkInjector != null) {
            return sdkInjector;
        }
        SdkInjector sdkInjector2 = new SdkInjector();
        sdkInjectorInstance = sdkInjector2;
        return sdkInjector2;
    }

    public static final SdkInjector getSdkInjectorInstance() {
        return sdkInjectorInstance;
    }

    public static /* synthetic */ void getSdkInjectorInstance$annotations() {
    }

    public static final void setSdkInjectorInstance(SdkInjector sdkInjector) {
        sdkInjectorInstance = sdkInjector;
    }
}
