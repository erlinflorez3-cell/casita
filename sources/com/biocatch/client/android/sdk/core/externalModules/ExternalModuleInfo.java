package com.biocatch.client.android.sdk.core.externalModules;

import com.biocatch.android.commonsdk.IBCFeature;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0016\u007f\u0007tsA0JeP.`Y2şs{B0cҕw٘Akڼ.\"7N\u000fzwzXZ#K\u001f\n\u001cwz,wW'^ܫ\u00132Pr\bB[uUApx<\u000402P:(\u0006Gʤ+\u0011)\u0005\u0002[K:۵`Nv:`\re\r*\u0016\f=0\u0001L^\u0016O|զk&K=+\u001bipWWe>\u0007e\u000f\\SU\f=ӄ\u001fsGE@-%\u0002\u000fMӏZ\b\nM~U\u0005\u00175mȹHDnDX\u0018\u001c%/U\fmrT^3Rԃ\u0010-3Ւ{MV\u00126|ߧ\u007f\u001c"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+p\u000eZKy", "", ";nSB_,\u001cZ\u0015\r\t", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#a|\u0015N\u0016*\\SHk\n", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sUkl", "5dc\u001ab+NZ\u0019\\\u0002Z:\u000b", "u(;7T=:\u001d z\u0004`uZ\u0010+s\u000e}", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExternalModuleInfo {
    private final Class<? extends IBCFeature> moduleClass;

    public ExternalModuleInfo(Class<? extends IBCFeature> moduleClass) {
        Intrinsics.checkNotNullParameter(moduleClass, "moduleClass");
        this.moduleClass = moduleClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExternalModuleInfo copy$default(ExternalModuleInfo externalModuleInfo, Class cls, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            cls = externalModuleInfo.moduleClass;
        }
        return externalModuleInfo.copy(cls);
    }

    public final Class<? extends IBCFeature> component1() {
        return this.moduleClass;
    }

    public final ExternalModuleInfo copy(Class<? extends IBCFeature> moduleClass) {
        Intrinsics.checkNotNullParameter(moduleClass, "moduleClass");
        return new ExternalModuleInfo(moduleClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExternalModuleInfo) && Intrinsics.areEqual(this.moduleClass, ((ExternalModuleInfo) obj).moduleClass);
    }

    public final Class<? extends IBCFeature> getModuleClass() {
        return this.moduleClass;
    }

    public int hashCode() {
        return this.moduleClass.hashCode();
    }

    public String toString() {
        return "ExternalModuleInfo(moduleClass=" + this.moduleClass + ')';
    }
}
