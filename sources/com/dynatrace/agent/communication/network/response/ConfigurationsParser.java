package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.api.ServerDataUpdate;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationParser;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.json.JSONTokener;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0L͜P.`_2şs{J$cҕyCQU\"}(\tWN}gvJ`\fIƤ\u001cǝ)jZH\u0016\u000em\u0016\u001d2Zom4]sK;xtd\bڶ6$>}\u0013\u0006bOV\u0016\u000f|YJ:\u0019`D~Bj\r{\u000eJ\u0016\u0014H8\u0001Lg\u0018RDT\u0005]h<iɅݦFN-mx\u0015[\u001c^V=\f%qN/NHM\u0015Sc3\u000b`mW\u0003mz\u0004\u0005935+as\u00067/ß\u0016Ʀ/O\u0015ƞC2j\u0007i`:*\u0002ՕeׂT\u000e0»ߧ\u007f "}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018T1PMR.l_nL\u0018\u001cc\u001c9'\u001a\u0013YNy", "", "D2R<a-BU\u0004z\bl,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f\u0012CY\\,i(", "D3R<a-BU\u0004z\bl,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018d'T]N9:\\{>\u0018\u0014j\u001bJ:\u0011\u000fb) w@9\u001f\u0015\u001d\u0018W", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n3c\u0007!\u0001[\u0016;^CHI>'\u0016lcI\u0014_;R\u000102H[:\\_H$\u0012\u001cbWM?\u0016\u0001hN lD\u0001\u001b\n,R\u0011\u0005f\u000b\u0014\u001e\u001e>nn>e\u0014Q\u0003^~A8zPfeCTASm4m\u001a_fJ:G5\u0014~v%qQ2\f\f`\r\u0002V\u0004pOC\"v:$K^*\u001c\t`", ">`a@X", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "8r^;56=g", "", "AdaCX9\u001dO(z", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "3mS\u001db0Gb|\b{h", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", ">`a@Xj<]!xyr5x\u0018<a}(u<\u0003\u0017 Vi\u001b<}%1g}", "4q^:=\u001a(<", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "=kS X9OS&\\\u0005g-\u0001\u000b", "8r^;", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConfigurationsParser {
    private final ServerConfigurationParser v3configParser;
    private final ServerConfigurationManagerV4 v4configParser;

    public ConfigurationsParser(ServerConfigurationParser v3configParser, ServerConfigurationManagerV4 v4configParser) {
        Intrinsics.checkNotNullParameter(v3configParser, "v3configParser");
        Intrinsics.checkNotNullParameter(v4configParser, "v4configParser");
        this.v3configParser = v3configParser;
        this.v4configParser = v4configParser;
    }

    private final ServerConfiguration fromJSON(ServerConfiguration serverConfiguration, String str) throws Exception {
        ServerConfiguration.Builder builderNewBuilder;
        Object objNextValue = new JSONTokener(str).nextValue();
        Intrinsics.checkNotNull(objNextValue, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) objNextValue;
        JSONObject jSONObject2 = jSONObject.getJSONObject("dynamicConfig");
        if (!jSONObject2.has("bp3Config")) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config v3 parsing: BPv3 config missing");
            return null;
        }
        boolean z2 = jSONObject.has("revision") && jSONObject.has("appConfig") && jSONObject.has("environmentConfig");
        Long longOrNull = JsonExtensionKt.getLongOrNull(jSONObject, "revision");
        if (!z2 || longOrNull == null || longOrNull.longValue() <= serverConfiguration.getTimestamp()) {
            builderNewBuilder = serverConfiguration.newBuilder(true);
        } else {
            builderNewBuilder = ServerConfiguration.builder();
            builderNewBuilder.withTimestamp(longOrNull.longValue());
            ReplayConfiguration.Builder builder = ReplayConfiguration.builder();
            this.v3configParser.parseMobileAgentConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject("environmentConfig").getJSONObject("bp3Config"));
            this.v3configParser.parseAppConfigV3(builderNewBuilder, builder, jSONObject.getJSONObject("appConfig").getJSONObject("bp3Config"));
            builderNewBuilder.withReplayConfiguration(builder.build());
        }
        this.v3configParser.parseDynamicConfigV3(builderNewBuilder, jSONObject2.getJSONObject("bp3Config"));
        return builderNewBuilder.build();
    }

    public final ServerDataUpdate parse$com_dynatrace_agent_release(String jsonBody, LocalServerData serverData, EndPointInfo endPointInfo) {
        Intrinsics.checkNotNullParameter(jsonBody, "jsonBody");
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        Intrinsics.checkNotNullParameter(endPointInfo, "endPointInfo");
        ParsedResponse responseOrNull$com_dynatrace_agent_release = this.v4configParser.parseResponseOrNull$com_dynatrace_agent_release(serverData.getConfig().getRevision(), endPointInfo.getApplicationId(), jsonBody);
        ServerDataUpdate serverDataUpdate = null;
        if (responseOrNull$com_dynatrace_agent_release == null) {
            return null;
        }
        try {
            serverDataUpdate = new ServerDataUpdate(responseOrNull$com_dynatrace_agent_release.getState(), responseOrNull$com_dynatrace_agent_release.getConfiguration(), fromJSON(serverData.getConfigV3(), jsonBody));
            return serverDataUpdate;
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config v3 parsing: invalid JSON", e2);
            return serverDataUpdate;
        }
    }
}
