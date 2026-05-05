package com.dynatrace.agent.events.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4J\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>7\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-֒Yzc\u0015\u001d6\u000bvM;eok:'ӡ7M'@+Py3\u0002`ޙIX\u0012\tMc\f@ؓpv@R\u001bM\u001d\u001a@\u0007n&\u0007\u001ejif6vm$Ǆ.k\u0014wMf'\u000e<-S\u001bSl)#u\u0010\u001dqÿ8}\u001c3a\u001b\u0007\u0001j\u0006Ƹ>:D\u0013x?'YZ:ʥ5)\u000f\"\u0015CO;^ę*b\rĩx\u000e-0]i\u001c_\u001c*\u0010z*\u000eʀ\b\u0014\u000eΩ`03!t\u000eԭ7\u0007"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v2Bc\u000bi\u0017\u0001\u0014.XR?u=}&hjHdm5]v0V\"", "", "/fT;g\u0011L]\"", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "1tbAb4>`}\r\u0005g", "\nh]6g\u0005", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}!TqWA\u0005/>#b\u000e!V\u007f+RC9z\na\u0006", "5dc\u000eZ,Gb}\r\u0005g", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "5dc\u0010h:M]!~\bC:\u0007\u0012", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ExceptionEventContent {
    private final JSONObject agentJson;
    private final JSONObject customerJson;

    public ExceptionEventContent(JSONObject agentJson, JSONObject customerJson) {
        Intrinsics.checkNotNullParameter(agentJson, "agentJson");
        Intrinsics.checkNotNullParameter(customerJson, "customerJson");
        this.agentJson = agentJson;
        this.customerJson = customerJson;
    }

    public static /* synthetic */ ExceptionEventContent copy$default(ExceptionEventContent exceptionEventContent, JSONObject jSONObject, JSONObject jSONObject2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            jSONObject = exceptionEventContent.agentJson;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            jSONObject2 = exceptionEventContent.customerJson;
        }
        return exceptionEventContent.copy(jSONObject, jSONObject2);
    }

    public final JSONObject component1() {
        return this.agentJson;
    }

    public final JSONObject component2() {
        return this.customerJson;
    }

    public final ExceptionEventContent copy(JSONObject agentJson, JSONObject customerJson) {
        Intrinsics.checkNotNullParameter(agentJson, "agentJson");
        Intrinsics.checkNotNullParameter(customerJson, "customerJson");
        return new ExceptionEventContent(agentJson, customerJson);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionEventContent)) {
            return false;
        }
        ExceptionEventContent exceptionEventContent = (ExceptionEventContent) obj;
        return Intrinsics.areEqual(this.agentJson, exceptionEventContent.agentJson) && Intrinsics.areEqual(this.customerJson, exceptionEventContent.customerJson);
    }

    public final JSONObject getAgentJson() {
        return this.agentJson;
    }

    public final JSONObject getCustomerJson() {
        return this.customerJson;
    }

    public int hashCode() {
        return (this.agentJson.hashCode() * 31) + this.customerJson.hashCode();
    }

    public String toString() {
        return "ExceptionEventContent(agentJson=" + this.agentJson + ", customerJson=" + this.customerJson + ')';
    }
}
