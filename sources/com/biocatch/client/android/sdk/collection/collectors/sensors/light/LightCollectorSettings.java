package com.biocatch.client.android.sdk.collection.collectors.sensors.light;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.client.android.sdk.collection.collectors.sensors.SensorCollectorSettings;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0019\u007f\u0007lkA0RkP.XT0ş\u0002ڔd$\n#2NKY(}:\t}O˗knX\\[O\u001d\u0006.x\u0019- Ǆzٕ\u0016\u000f:ԏ@QAP\b=gd+\u000b[ڪ4ŕ<}\u001d\u0003 /V\u0016G\rQR$\u0012^H'\u000f)ҟOŋ\u001e\u0016\u001e@&\n,fʊRA"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019^\u0010Q:Vk]C'}\"A&\u000f,G\u0011Eun\f%\u001d9srP,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u007fZ\u0017\\5\u001abcH+nBF)\u0015\u001aI\u0011Jl\n\u000e$c", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/\u0005\u0015", "A`\\=_,)S&\u0003\u0005]", "", "5dc T4IZ\u0019izk0\u0007\b", "u(9", "Ad]@b9+S\u001b\u0003\tm9x\u00183o\t\u0007{G|+", "", "5dc X5L]&kz`0\u000b\u0018<a\u000f,\u0006I_\u0017\u001eC\u0004", "u(8", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LightCollectorSettings extends SensorCollectorSettings {
    private final ConfigurationRepository configurationRepository;

    public LightCollectorSettings(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.configurationRepository = configurationRepository;
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.sensors.SensorCollectorSettings
    public long getSamplePeriod() {
        return this.configurationRepository.getLong(ConfigurationFields.lightEventsSamplePeriod);
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.sensors.SensorCollectorSettings
    public int getSensorRegistrationDelay() {
        return this.configurationRepository.getInt(ConfigurationFields.lightEventsSensorRegistrationDelay);
    }
}
