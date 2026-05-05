package com.biocatch.client.android.sdk.collection;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.session.SessionInfoService;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9L͜P.`Z2şs{B$c$wCA٥0ԂR\t}M(z~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0015Ƥ6B}C{Q}FQ`#@M$@-Py3\u0007j6V\u0012\u000fzqNb۸2Ϯt:Z҈\u001e\u0011(\u0017\u001e>N\u0007tմsߑ:Htҗ\u000b;1\n\u0002B|/6ܡ\t֔\u0011F\\܋]\u0003o\u001eC@e6kǯUΫ\u000bRcΪƊC}"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u000eJ\u0006'-LN7\\_H", "", "Adb@\\6G7\"\u007f\u0005L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2O9\u0015q0X\u007f\u000bPMX\u001a\\_\u0004A\u0012\u00120", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017Q;yB\"\u001fq+'\u0007q:R\u00010+UO6JR\u007fN\u0018\u0010Zc5)\u0017\r#>(xB3.\u0006/\u0013}Dg\u000e\u0016\u001a\r~hzJ^\u001aP\b\u0014{\u000b'rOZc{WNAq.n\u0015)zfC;(\u0016\u0002&\u0017wT8\u0013hS\u001c|`}vqT-P{\u0015", "7r<<g0H\\\u0003\bh^:\u000b\r9nm7wM\u0010", "", ";nc6b5)O\u0018}~g.f\u0012\u001de\u000e6\u007fJ\n\u0005&C|\u001d$d%3", "", "1n]3\\.N`\u0019", "", "7r>=X5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SensorGateKeeper {
    private final ConfigurationRepository configurationRepository;
    private boolean isMotionOnSessionStart;
    private long motionPaddingOnSessionStartMSec;
    private final SessionInfoService sessionInfoService;

    public SensorGateKeeper(SessionInfoService sessionInfoService, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(sessionInfoService, "sessionInfoService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.sessionInfoService = sessionInfoService;
        this.configurationRepository = configurationRepository;
        this.isMotionOnSessionStart = true;
        this.motionPaddingOnSessionStartMSec = 20000L;
    }

    public final void configure() {
        this.isMotionOnSessionStart = this.configurationRepository.getBoolean(ConfigurationFields.isMotionOnSessionStart, true);
        this.motionPaddingOnSessionStartMSec = this.configurationRepository.getLong(ConfigurationFields.motionPaddingOnSessionStartMSec, 20000L);
        if (this.isMotionOnSessionStart) {
            Log.Companion.getLogger().info("Motion on session start is enabled, collecting motion events for " + (this.motionPaddingOnSessionStartMSec / ((long) 1000)) + " seconds.");
        }
    }

    public final boolean isOpen() {
        return this.isMotionOnSessionStart && System.currentTimeMillis() - this.motionPaddingOnSessionStartMSec < this.sessionInfoService.getStartTime();
    }
}
