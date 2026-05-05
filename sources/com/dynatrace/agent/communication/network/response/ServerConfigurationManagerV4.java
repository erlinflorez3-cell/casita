package com.dynatrace.agent.communication.network.response;

import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0019\u007fјnjG<LeN/ZS8\u0015sڔ<$q$yCAY Ԃ8ޛm`\u0018g\u001dI\u0013\nUO\u000bȀ|l2Icy&7\u001d4ZqU2{rm=nxN\u0005N7R<\b\u000b\u0019\u001aXO@z\tKc\f@7\u0007\u0081ĐV\rS\u000eb(\u0014H8\u0001Lg\u0018RDT\u0005]h<S\u0007wPf'\u000e=CMU\\b6%v\u0010)[DEA-%\u0002\u00107ViM\u001b? JKhoG9Y\fYLW.!E/]\u001eurTc5Un\u0018?+}p{T\u001c6\u0010z*\u001a\u0003\u0004أ\n:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018d'T]N9:\\{>\u0018\u0014j\u001bJ:\u0011\u000fb) w@9\u001f\u0015\u001d\u0018W", "", "\nh]6g\u0005", "u(E", ">`a@X\u0019>a$\t\u0004l,f\u0016\u0018u\u0007/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018a#TZN+IR\u0001H\u001e\u001bh\u000e$", "1ta?X5M@\u0019\u0010~l0\u0007\u0012", "", "/o_\u0016W", "", "8r^;", ">`a@X\u0019>a$\t\u0004l,f\u0016\u0018u\u0007/:>\u000b\u001f\u0011F\u0004\u00178\u000621W}\u001a3o\u00167\\=Hk;\u001e\u0011va", "1`[0h3:b\u0019fvq\t|\u0005-o\t\u0016\u007fU\u0001|\u001bD", "", "Bd].a;\u001c]\"\u007f~`", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "/o_\u0010b5?W\u001b", "1`[0h3:b\u0019fvq\f\u000e\t8tm,\u0011@f\u001b\u0014", "6`b\u000ec7(`\b~\u0004Z5\fv/t\u000f,\u0005B\u000f", "9dh", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerConfigurationManagerV4 {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_APP_CONFIG = "appConfig";
    private static final String KEY_APP_CONFIG_APP_ID = "applicationId";
    private static final String KEY_APP_CONFIG_CAPTURE = "capture";
    private static final String KEY_DYNAMIC_CONFIG = "dynamicConfig";
    private static final String KEY_DYNAMIC_CONFIG_STATE = "state";
    private static final String KEY_ENVIRONMENT_CONFIG = "environmentConfig";
    private static final String KEY_MAX_BEACON_SIZE_KIB = "maxBeaconSizeKib";
    private static final String KEY_MAX_EVENT_SIZE_KIB = "maxEventSizeKib";
    private static final String KEY_REVISION = "revision";
    private static final String KEY_STATUS = "status";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005*2ߝx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ղ(ޯa\u0012\u0017˰\u0013{M8eok<7ҝ\tӯ$2*\u0600J\u0011\u000f BH>yQŒ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015īSɉ`gVȤ\u0019xkBG#1l\u0019úyۢ4|Uε\u0017`5\u0016\u000faL.\u0017ʽ\bչ)S\u000bޗ#gM\rWqk\b?ѪyȅMs_̬)\f\" CO;`I̩/ԇU`\u0014ʬ{[qWh\u000eVzQԋ_ʀ\b\u000e\u000eΩχ2:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}+\u0015vlC\u0010q,\u0018d'T]N9:\\{>\u0018\u0014j\u001bJ:\u0011\u000fb) w@9\u001f\u0015\u001d\u0018@\u0019r\t\u0017\u0012\u00179ty\u0018", "", "\nh]6g\u0005", "u(E", "\u0019DH,F\u001b\u001aB\tl", "", "\u0019DH,E\f/7\u0007bdG", "\u0019DH,8\u0015/7\u0006hcF\few)Ci\u0011\\$b", "\u0019DH,4\u0017)Mvhc?\u0010^", "\u0019DH,7 '/\u0001bXX\nfq\u0010Ia", "\u0019DH,@\b1Mu^V<\u0016e\u0003\u001dIt\bu&ds", "\u0019DH,@\b1MxoZG\u001bvv\u0013Z_\"a$]", "\u0019DH,7 '/\u0001bXX\nfq\u0010Ia\"i/\\\u0006v", "\u0019DH,4\u0017)Mvhc?\u0010^\u0003\u000bPj\"_\u001f", "\u0019DH,4\u0017)Mvhc?\u0010^\u0003\rAj\u0017k-`", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final int calculateMaxBeaconSizeKib(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectHasAppOrTenantSettings = hasAppOrTenantSettings(KEY_MAX_BEACON_SIZE_KIB, jSONObject, jSONObject2);
        if (jSONObjectHasAppOrTenantSettings != null) {
            return ServerConfigurationManagerV4Kt.getIntOrClosest(jSONObjectHasAppOrTenantSettings, KEY_MAX_BEACON_SIZE_KIB, 256, 10240, 1024);
        }
        return 1024;
    }

    private final int calculateMaxEventSizeKib(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectHasAppOrTenantSettings = hasAppOrTenantSettings(KEY_MAX_EVENT_SIZE_KIB, jSONObject, jSONObject2);
        if (jSONObjectHasAppOrTenantSettings != null) {
            return ServerConfigurationManagerV4Kt.getIntOrClosest(jSONObjectHasAppOrTenantSettings, KEY_MAX_EVENT_SIZE_KIB, 128, 1024, 256);
        }
        return 256;
    }

    private final JSONObject hasAppOrTenantSettings(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2.has(str)) {
            return jSONObject2;
        }
        if (jSONObject.has(str)) {
            return jSONObject;
        }
        return null;
    }

    public final ParsedResponse parseResponseOrNull$com_dynatrace_agent_release(long j2, String appId, String json) {
        ArrayList arrayListEmptyList;
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Object objNextValue = new JSONTokener(json).nextValue();
            Intrinsics.checkNotNull(objNextValue, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) objNextValue;
            if (!ArraysKt.contains(ServerConfigurationManagerV4Kt.STATUS_VALUES, JsonExtensionKt.getStringOrNull(jSONObject, "status"))) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: unknown status value");
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_DYNAMIC_CONFIG);
            AgentState agentStateOrNull = jSONObjectOptJSONObject != null ? ServerConfigurationManagerV4Kt.getAgentStateOrNull(jSONObjectOptJSONObject, "state") : null;
            if (agentStateOrNull == null) {
                Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: unknown agent state");
                return null;
            }
            Long longOrNull = JsonExtensionKt.getLongOrNull(jSONObject, KEY_REVISION);
            if (longOrNull == null || longOrNull.longValue() <= j2) {
                return new ParsedResponse(agentStateOrNull, null);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(KEY_ENVIRONMENT_CONFIG);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(KEY_APP_CONFIG);
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null) {
                if (!Intrinsics.areEqual(appId, JsonExtensionKt.getStringOrNull(jSONObjectOptJSONObject3, KEY_APP_CONFIG_APP_ID))) {
                    Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: appId mismatch");
                    return null;
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("userInteractionCapture");
                if (jSONArrayOptJSONArray != null) {
                    IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList();
                    Iterator<Integer> it = intRangeUntil.iterator();
                    while (it.hasNext()) {
                        String strOptString = jSONArrayOptJSONArray.optString(((IntIterator) it).nextInt());
                        if (strOptString != null) {
                            arrayList.add(strOptString);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!StringsKt.isBlank((String) obj)) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayListEmptyList = arrayList2;
                } else {
                    arrayListEmptyList = CollectionsKt.emptyList();
                }
                return new ParsedResponse(agentStateOrNull, new ServerConfigurationV4(longOrNull.longValue(), calculateMaxBeaconSizeKib(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3), calculateMaxEventSizeKib(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3), jSONObjectOptJSONObject3.optBoolean(KEY_APP_CONFIG_CAPTURE, true), arrayListEmptyList));
            }
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: invalid config update");
            return null;
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "config parsing error: invalid JSON", e2);
            return null;
        }
    }
}
