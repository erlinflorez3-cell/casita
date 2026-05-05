package com.biocatch.client.android.sdk.collection.collectors.sensors.location;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0017\u007f\u0007lkA0RlP.X[0ş\u0002ڔd$\n#2NKY(}:\t}O˗knX\\SI\u001d\u0017.x\u00194\u0010UIi \u000fJB\u001e@\nݼqެ=`|ȂU/@%Py3\u0005PnН\u0014z\u0013EQ\u0011 6\u0011\u007fHY%M3\"HJ̧$\u00056^mWDR=lH:;\u0003\u0018J\u0005kۢ4\u0001e\u000fL`5\u0017Gp,8X7c\u001d[\u0018Ϋ\u000bVsA\tM\u007fGUw56CI\"_l\u001dÿ\u0018\u0019CQ\u0013m\u00010ف\tc"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]\u0019d\fJ:\u0011\u000fb\u000b\u000bxB3.\f6R_Eo\b\f\u0014\u001d?w^Be\u001fK\u0003\u0017\u0004\u0017", "", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/\u0005\u0015", ":nR.g0H\\\u0006~{k,\u000b\f\u000ei\u000e7wI~\u0017", "", "5dc\u0019b*:b\u001d\t\u0004K,}\u0016/s\u0003\u0007\u007fN\u0010\u0013 Eo", "u(5", ":nR.g0H\\\u0006~{k,\u000b\f\u001ei\b(", "", "5dc\u0019b*:b\u001d\t\u0004K,}\u0016/s\u0003\u0017\u007fH\u0001", "u(9", "@d`BX:M2\u0019\u0006vr", "5dc\u001fX8NS'\u000eY^3x\u001d", "@d`BX:MB\u001d\u0007zh<\f", "5dc\u001fX8NS'\u000eib4|\u0013?t", "Bh\\2b<M", "5dc!\\4>])\u000e", "D`[6W(MS\u0006~\u0007n,\u000b\u0018\u000ee\u0007$\u0010", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LocationCollectorSettings {
    private final ConfigurationRepository configurationRepository;

    public LocationCollectorSettings(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.configurationRepository = configurationRepository;
    }

    private final long validateRequestDelay() {
        long j2 = this.configurationRepository.getLong(ConfigurationFields.locationEventsRequestDelaySec);
        if (1 > j2 || j2 >= 6000) {
            return 6000L;
        }
        return j2;
    }

    public final float getLocationRefreshDistance() {
        return this.configurationRepository.getLong(ConfigurationFields.locationRefreshDistance);
    }

    public final long getLocationRefreshTime() {
        return this.configurationRepository.getLong(ConfigurationFields.locationRefreshTime);
    }

    public final long getRequestDelay() {
        return validateRequestDelay() * ((long) 1000);
    }

    public final long getRequestTimeout() {
        return 6000000L;
    }

    public final long getTimeout() {
        return this.configurationRepository.getLong(ConfigurationFields.locationEventsTimeoutMsec);
    }
}
