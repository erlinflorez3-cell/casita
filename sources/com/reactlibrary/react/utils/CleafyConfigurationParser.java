package com.reactlibrary.react.utils;

import com.cleafy.mobile.detection.agent.configuration.AutomaticUpdateAnalysis;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfigConstants;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.cleafy.mobile.detection.agent.configuration.CleafyDetectorsConfiguration;
import com.cleafy.mobile.detection.agent.configuration.EmulatorDebugAnalysis;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":4\u007f\u0007tvAӄLe^.ZS0\u0014s{B*c$wCAڦ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0007:Jmx\f\u0014?DPrWA]qM9\u000fyF\t0487(\u0004/\u001epHX\u0011\tIc\f@7p\u0003HU%[\u0015\u001c\"\u0006l%\u0011\"lid5vk\f>wT\u0011qZP=^v\u0006m\u0013LÖ5\u0016\u001faL*hEE\u00175S1\fb_O\u0005Upk\u0004\u0017+W/W}o6\u0007\u0005Z\u0015ۣS\rk}n\u0014\u0013Yx\fm4oiQִ\u001c1 z*\fd\u0012\u001e\b7H\\2*j\u0018\u0010Is!RnT2bP\n\u0013ad\u001cU\u0004A7Q\u001b-Z(;ϭR7\n\u0012UE1\u000f\u0007#qS<o=)dya1\u007fEML^\fo<\u001c\u0003\u001ff2.\u0012:_\u007f]\u0001W.ϲ)7iIأ%|"}, d2 = {"\u001ab^:\"9>O\u0017\u000e\u0002b)\n\u0005<yI5{<~&`W~\u0012C\u0005n\u0013`}\u001c8\u0002s8VD?mD+\u0011weC\u0010N([\u0005'T\"", "", "u(E", ">`a@X\nES\u0015\u007f\u000f=,\f\t-t\n5\n\u001e\u000b \u0018Kq\u001eIr49c\u0007", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([+N;\\P\u0002G! 8\u0018W,\u0011\u0007iN }HA(]", "1n]3\\.N`\u0015\u000e~h5d\u0005:", "", "", ">`a@X\rK]!fvi", "\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([*X5]VtM!\u000ei\u0012X4b", ">`a@X", "\"", "9dh", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "2dU.h3M", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fu\u001er\u0012?I\rBg= ^R^>\u0007a;$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", ">`a@X\u0010Gb", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fuzT\u001b*^?\u0005r0'\u00172EB\u0016c.N\u0004|", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyConfigurationParser {
    public static final CleafyConfigurationParser INSTANCE = new CleafyConfigurationParser();

    private CleafyConfigurationParser() {
    }

    private final <T> T parse(Map<String, ? extends Object> map, String str) {
        T t2 = (T) map.get(str);
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    private final <T> T parse(Map<String, ? extends Object> map, String str, T t2) {
        Object obj = map.get(str);
        if (obj == null) {
            obj = null;
        }
        return obj == null ? t2 : (T) obj;
    }

    private final CleafyDetectorsConfiguration parseCleafyDetectorsConfiguration(Map<String, ? extends Object> map) {
        CleafyConfigurationParser cleafyConfigurationParser = INSTANCE;
        return new CleafyDetectorsConfiguration(((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.HTTP_DETECTOR_ENABLED, false)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.CERTIFICATE_DETECTOR_ENABLED, false)).booleanValue(), (String) cleafyConfigurationParser.parse(map, CleafyConfigConstants.CERTIFICATE_DETECTOR_ENDPOINT, ""), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.MONITORED_APP_ENABLED, true)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.ACTIVITY_DETECTOR_ENABLED, false)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.ADVANCED_CERTIFICATE_DETECTOR_ENABLED, false)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.ROOT_DETECTOR_ENABLED, true)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.TASK_INJECTION_ENABLED, false)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.MOCK_LOCATION_ENABLED, true)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.ADVANCED_MOCK_LOCATION_ENABLED, false)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.ON_CALL_DETECTOR_ENABLED, false)).booleanValue(), ((Boolean) cleafyConfigurationParser.parse(map, CleafyConfigConstants.HUMAN_DETECTOR_ENABLED, false)).booleanValue(), false, false, false, 28672, null);
    }

    private final Integer parseInt(Map<String, ? extends Object> map, String str) {
        Object obj = map.get(str);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    public final CleafyConfiguration parseFromMap(Map<String, ? extends Object> configurationMap) {
        EmulatorDebugAnalysis emulatorDebugAnalysis;
        AutomaticUpdateAnalysis automaticUpdateAnalysis;
        Intrinsics.checkNotNullParameter(configurationMap, "configurationMap");
        CleafyConfigurationParser cleafyConfigurationParser = INSTANCE;
        String str = (String) cleafyConfigurationParser.parse(configurationMap, CleafyConfigConstants.API_ENDPOINT, "");
        String str2 = (String) cleafyConfigurationParser.parse(configurationMap, CleafyConfigConstants.APPLICATION_HOSTNAME, "");
        boolean zBooleanValue = ((Boolean) cleafyConfigurationParser.parse(configurationMap, CleafyConfigConstants.DEFAULT_ENABLED, true)).booleanValue();
        AutomaticUpdateAnalysis[] automaticUpdateAnalysisArrValues = AutomaticUpdateAnalysis.values();
        int length = automaticUpdateAnalysisArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            emulatorDebugAnalysis = null;
            if (i3 >= length) {
                automaticUpdateAnalysis = null;
                break;
            }
            automaticUpdateAnalysis = automaticUpdateAnalysisArrValues[i3];
            int iOrdinal = automaticUpdateAnalysis.ordinal();
            Integer num = INSTANCE.parseInt(configurationMap, CleafyConfigConstants.AUTOMATIC_UPDATE_ANALYSIS);
            if (num != null && iOrdinal == num.intValue()) {
                break;
            }
            i3++;
        }
        if (automaticUpdateAnalysis == null) {
            automaticUpdateAnalysis = AutomaticUpdateAnalysis.NONE;
        }
        EmulatorDebugAnalysis[] emulatorDebugAnalysisArrValues = EmulatorDebugAnalysis.values();
        int length2 = emulatorDebugAnalysisArrValues.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            EmulatorDebugAnalysis emulatorDebugAnalysis2 = emulatorDebugAnalysisArrValues[i2];
            int iOrdinal2 = emulatorDebugAnalysis2.ordinal();
            Integer num2 = INSTANCE.parseInt(configurationMap, CleafyConfigConstants.EMULATOR_DETECTION_ANALYSIS);
            if (num2 != null && iOrdinal2 == num2.intValue()) {
                emulatorDebugAnalysis = emulatorDebugAnalysis2;
                break;
            }
            i2++;
        }
        if (emulatorDebugAnalysis == null) {
            emulatorDebugAnalysis = EmulatorDebugAnalysis.NONE;
        }
        CleafyConfigurationParser cleafyConfigurationParser2 = INSTANCE;
        CleafyDetectorsConfiguration cleafyDetectorsConfiguration = cleafyConfigurationParser2.parseCleafyDetectorsConfiguration(configurationMap);
        return new CleafyConfiguration(str, str2, null, zBooleanValue, automaticUpdateAnalysis, emulatorDebugAnalysis, ((Boolean) cleafyConfigurationParser2.parse(configurationMap, CleafyConfigConstants.PACKAGE_ANALYSIS_ENABLED, true)).booleanValue(), ((Boolean) cleafyConfigurationParser2.parse(configurationMap, CleafyConfigConstants.EXTENDED_PACKAGE_INFORMATION, false)).booleanValue(), ((Boolean) cleafyConfigurationParser2.parse(configurationMap, CleafyConfigConstants.COLLECT_SENSITIVE_IDENTIFIERS, true)).booleanValue(), ((Boolean) cleafyConfigurationParser2.parse(configurationMap, CleafyConfigConstants.HASH_SENSITIVE_IDENTIFIERS, false)).booleanValue(), ((Boolean) cleafyConfigurationParser2.parse(configurationMap, CleafyConfigConstants.ALLOW_UNTRUSTED_CERTIFICATES, false)).booleanValue(), cleafyDetectorsConfiguration, 4, null);
    }
}
