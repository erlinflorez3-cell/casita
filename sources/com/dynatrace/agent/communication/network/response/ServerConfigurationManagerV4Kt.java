package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.api.AgentState;
import kotlin.Metadata;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!,x\bDRo|\u0004G\b8\u000b<H\u0007\"B\u0012\u007f\u0007lmA0ZeP\u008cj}8\u0013\u0004{b)\u0004$ IkY(\u0005:\t}N\u0018k|Rr\u000bq\u00146\u001a\u0007sDI\u0004}\u000e\u0016\u001d<Zom8\u0014oUMn\u007fN\u000761PD\"\u0005/ ZL\u001e}\u0013Cy\fX0`\u000bHĥ%S\u0015\u001c\"\u0006l /\u001d3ɤPɇLte:=&\u0013kHO5a݇\u0001Z"}, d2 = {"!S0!H\u001a8Dtej>\u001a", "", "", "5dc G\b-C\u0007xk:\u0013lh\u001d${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "5dc\u0016a;(`v\u0006\u0005l,\u000b\u0018", "", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "<`\\2", ":nf2e\tH`\u0018~\b", "Co_2e\tH`\u0018~\b", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u000eZ,Gb\u0007\u000evm,f\u0016\u0018u\u0007/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerConfigurationManagerV4Kt {
    private static final String[] STATUS_VALUES = {"OK", "ERROR"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final AgentState getAgentStateOrNull(JSONObject jSONObject, String str) {
        String stringOrNull = JsonExtensionKt.getStringOrNull(jSONObject, str);
        if (stringOrNull != null) {
            int iHashCode = stringOrNull.hashCode();
            if (iHashCode != -1609594047) {
                if (iHashCode != 270940796) {
                    if (iHashCode == 809657403 && stringOrNull.equals("priority=high")) {
                        return new AgentState.Enabled(true);
                    }
                } else if (stringOrNull.equals("disabled")) {
                    return AgentState.Disabled.INSTANCE;
                }
            } else if (stringOrNull.equals("enabled")) {
                return new AgentState.Enabled(false);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIntOrClosest(JSONObject jSONObject, String str, int i2, int i3, int i4) {
        Integer intOrNull = JsonExtensionKt.getIntOrNull(jSONObject, str);
        return intOrNull != null ? Math.max(Math.min(intOrNull.intValue(), i3), i2) : i4;
    }

    private static /* synthetic */ void getSTATUS_VALUES$annotations() {
    }
}
