package com.biocatch.client.android.sdk.backend.communication;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000512ߚ\u000eј\u0017jg/\u0005h߬2Ra*_\u0006\n5<]:pq=,ۃ\ǹ\r[Vʴ\u007fpP]\u0019G/\b\u001c}x2\u001ao\u0007d*\u0011HA\u001eA\nހ{ެ=l|Ȃ\u001d\"8*F}%\u0003 3V\u0016G\u0015QU$\u0014F?\u001f<)ҏYŋ\u001e\u001e\u000ē8\u0003$guRVJriH5s\u001dwOf)u/+OcІ`ܮ\u0011\u0003iӜCB=C#)s\u0005\raiESY\u007fM\u001dj=&YKJɕBݼ\u0004 \u001dۀg\u000fc\u00044`%Sf\u001e51ջg^"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011:N9mR\u007f+\u0014 h\u0012X4b", "", "u(E", "/fT;g\u0010=", "", "5dc\u000eZ,Gb|}", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eZ,Gb|}", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "=sc", "5dc\u001cg;", "Adc\u001cg;", "AhS", "5dc \\+", "Adc \\+", "AsS", "5dc g+", "Adc g+", "Asb", "5dc g:", "Adc g:", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ServerSession {
    private String agentId;
    private String ott;
    private String sid;
    private String std;
    private String sts;

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getOtt() {
        return this.ott;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getStd() {
        return this.std;
    }

    public final String getSts() {
        return this.sts;
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setOtt(String str) {
        this.ott = str;
    }

    public final void setSid(String str) {
        this.sid = str;
    }

    public final void setStd(String str) {
        this.std = str;
    }

    public final void setSts(String str) {
        this.sts = str;
    }
}
