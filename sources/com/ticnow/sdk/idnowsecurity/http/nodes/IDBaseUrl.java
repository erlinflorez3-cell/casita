package com.ticnow.sdk.idnowsecurity.http.nodes;

import com.dynatrace.android.agent.Global;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4R\u0015Ӭ\\\u0012&\u0006'uI4Re`.\u0001T֖\u0013k\n6l_2\u0004[;\u0004\u001bN<\u0017Rfi}mx[aÃ\u001bو\u001a\u0005rߚaW~a \u0014RDuEAO@WGg\r8\u001b\u001f`#\u000fэ\u0011в\u001e6PƵ\u000f|IS\u001a\u0017PBvC`\u000f\u001e\u001d(\u0012\u001e>N\u0002tոsߑ:TtҗR1)\rwGn)e;\u000bO]`b3%xw\u001dYA\u000eߕ!ȏW\u000f\u000fѸsA\tL\u007fB%j-59KDqDg\u0018\u0016+*}\u000e4ý2ػ\t]hϯ?-UsYU.*}\f\n\u000fʆ\b!"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013z\u0011va)\u0014j\u0002", "", "3mc?l\u0017HW\"\u000e", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0`b2H9E", "5dc\u000fT:>C&\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT:>C&\u0006", "2mb", "5dc\u0011a:", "Adc\u0011a:", "5dc\u0012a;Kg\u0004\t~g;", "Adc\u0012a;Kg\u0004\t~g;", "7o", "5dc\u0016c", "Adc\u0016c", ">naA", "5dc\u001db9M", "Adc\u001db9M", "5dc\u000fT:>7wn\be", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDBaseUrl {
    private String baseUrl;
    private String dns;
    private String entryPoint;
    private String ip;
    private String port;

    public IDBaseUrl(String entryPoint) {
        Intrinsics.checkParameterIsNotNull(entryPoint, "entryPoint");
        this.entryPoint = entryPoint;
    }

    public final String getBaseIDUrl() {
        String str;
        String str2 = this.ip;
        if (str2 != null && str2.length() != 0 && (str = this.port) != null && str.length() != 0) {
            return "https://" + this.ip + Global.COLON + this.port + this.entryPoint;
        }
        String str3 = this.dns;
        if (str3 != null && str3.length() != 0) {
            return Intrinsics.stringPlus(this.dns, this.entryPoint);
        }
        String str4 = this.baseUrl;
        if (str4 == null || str4.length() == 0) {
            return "EMPTY_HOST";
        }
        String str5 = this.baseUrl;
        if (str5 != null) {
            return str5;
        }
        Intrinsics.throwNpe();
        return str5;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getDns() {
        return this.dns;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getPort() {
        return this.port;
    }

    public final void setBaseUrl(String str) {
        this.baseUrl = str;
    }

    public final void setDns(String str) {
        this.dns = str;
    }

    public final void setEntryPoint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.entryPoint = str;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setPort(String str) {
        this.port = str;
    }
}
