package com.cleafy.mobile.detection.agent.configuration;

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
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLc\u0003\u0010I\u00066&4ɘ~8ܥBw5e;K>E}H\\R\n.eӍNČ(_,sI<c\u001cN4\u0017Rfg\u0016n\u0001^aÃaو\u001a|r.OX\u0007_b!@F\b?aM&A\u0010ŢGȥ\t$:$>}\u0013\u0003j<V\u0015\u000fzqKB\u0016\u0007ϒCĐV\u0011U\u0007 \u0017\u0014@p\u0013,b\u007fNdH#a\u0011ǉuɨmFV)e6\u000bO]Xb.%v\u0010\u001eaD\u000eߕgȏW\u0007\u000fTaF\u0011ABO\u0013p?'YI*[\rݠRЏ\u0019/W\u000fcz4^Ucn\u0015?+}c\u0002TdߑJߡ\u007f\u0011D\u0006\u0014\u000f5J~?(p \u000eat)W\u0017ЗTެF\u0004\u0003c<!3\u0002\u0004=G&~Q\u0010;OR\u000eޭWڟ\"'\tp'fb\u00101')`\u0010Q_QvA\u001fݗ\\ՒAq\frh\u000e8\u0006\u0001Y\u000e<\u0014\u0011\\\u0017[;2ބu\u074co\u0006PFm\u0004\u0013b9ew``@PnL;\u0001¥^ʑHh\rmVbf.a_*c\u001f}6\u0013V`N˚sٚ\u0014RWjoy[_Z7=vOY\u001dkD[\u0010ӛ\u0006̳Ug\u0018cX\u0007\"A\rt\u0013i~B\u0002\f\u0011`~ζ\u0005ʮn\u0014\u007f}J_\u001a\u0015\u0003Q\u007f.L,_\u0019\u0013\u0019\u001fҘpնE\u0001\u0011a`z\u001e\u0001%E2\u0016\u0002$#\t7T3ʠBς|M4~f5;C\"G':m\"\u001743']ѯFõKkTIR\u0001$w&\u000e.+29\u007f/s\u0017eȶ{ɨ\u00061MNxz_Ob9\t\u0013\u0012\u000fihdk^υCݽdnRQZ-0x/\u00051\u001f|\u007f(a|~\u001eϑ'ߏ_BQt\tpJP\t\u000f\u001376%/oX\u0001\fԍ\u0016ے!\u001a\u007f\u00165-o_:\u0002<\u0013z\u000fTt\u001c\b\u0003Ϫh̔fUe4AQW[OP0>\u0005\u0003pH!{^Ⱦ[Ό\u00117PCj\u000bd:\u001e\u001d=\u0019~\u0007Z\r'Z2Ƭḙ\u000286a0\u000fQ\u007fdpQA)M\u0002g$q\"œ]Ί\u0013\u000e\u0013}7\u000b \u001eݤ$s"}, d2 = {"\u001ab^:\"*ES\u0015\u007f\u000f(4\u0007\u00063l\u007fqz@\u0010\u0017\u0015Vs\u0018E@!7Y\u0007/\u0001k 7NG={A\u001a$lkBPA3Nr([*X5]Vt\u001b\u001e\u001bh\u001dJ4\u001c\u0013/", "", "", "\u000fO8,8\u0015\u001d>\u0003bcM", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "\u000fO?\u0019<\n\u001aB|hcX\u000ffv\u001eN[\u0010[", "\u0017MC\u0012:\u0019\u001aB|hcX\u001bfn\u000fN", "\u0012D5\u000eH\u0013-MxgV;\u0013\\g", "\u000fTC\u001c@\b-7vxjI\u000bXw\u000f_[\u0011W't\u0005z5", "\u0013LD\u00194\u001b(@\u0013]ZM\fZw\u0013Oh\"W)\\}\u000b5S{", "\u0016SC\u001dR\u000b\u001eBx\\iH\u0019vh\u0018A\\\u000f[\u001f", "\u0011DA!<\r\"1tmZX\u000b\\w\u000fCn\u0012h:`\u007fr$Vm\u001b", "\u0011DA!<\r\"1tmZX\u000b\\w\u000fCn\u0012h:`\u007fu2Yq%e", "\u001e@2\u00184\u000e\u001eMtgVE jl\u001d__\u0011W\u001dgvu", "\u0013WC\u0012A\u000b\u001e2\u0013iV<\u0012Xj\u000f_c\u0011\\*m~r6Sw%", "\u000fCE\u000eA\n\u001e2\u0013\\ZK\u001b`i\u0013C[\u0017[:_v\u0006'M|&c\u001f\u0015BY|\u001eMt", "\u0011N;\u00198\n-M\u0007^cL\u0010kl Ey\fZ i\u0006z(Sm)d", "\u0016@B\u0015R\u001a\u001e<\u0007biB\u001d\\\u0003\u0013D_\u0011j$azv4]", "\"@B\u0018R\u0010'8x\\iB\u0016e\u0003\u000fN[\u0005b _", "\u001bN2\u0018R\u0013(1tm^H\u0015vh\u0018A\\\u000f[\u001f", "\u000fCE\u000eA\n\u001e2\u0013fd<\u0012vo\u0019C[\u0017_*i\u0011v0Kj#V\u0004", "$O=,7\f-3vmdK&\\q\u000bBf\bZ", "\u000fK;\u001cJ&.<\bkjL\u001b\\g)C_\u0015j$azt#^m*", " N>!R\u000b\u001eBx\\iH\u0019vh\u0018A\\\u000f[\u001f", "\u001bN=\u0016G\u0016+3wxVI\u0017vh\u0018A\\\u000f[\u001f", "\u000fBC\u0016I\u0010-G\u0013]ZM\fZw\u0019Ry\bd\u001c]}v&", "\u001dMN\u00104\u0013%Mw^i>\nkr\u001c__\u0011W\u001dgvu", "\u0016T<\u000eA&\u001d3\b^XM\u0016i\u0003\u000fN[\u0005b _", "\u001cE2,7\f-3vmdK&\\q\u000bBf\bZ", "\u0015OB,7\f-3vmdK&\\q\u000bBf\bZ", "\u0013WC\u0012A\u000b\u001e2\u0013hk>\u0019cd#_^\bj ^\u0006\u00014im%R\u0002\u001c9\\", "/fT;g&KS ~vl,"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CleafyConfigConstants {
    public static final String ACTIVITY_DETECTOR_ENABLED = "activity_detector_enabled";
    public static final String ADVANCED_CERTIFICATE_DETECTOR_ENABLED = "advanced_certificate_detector_enabled";
    public static final String ADVANCED_MOCK_LOCATION_ENABLED = "advanced_mock_location_enabled";
    public static final String ALLOW_UNTRUSTED_CERTIFICATES = "allow_untrusted_certificates";
    public static final String API_ENDPOINT = "api_endpoint";
    public static final String APPLICATION_HOSTNAME = "application_hostname";
    public static final String AUTOMATIC_UPDATE_ANALYSIS = "automatic_update_analysis";
    public static final String CERTIFICATE_DETECTOR_ENABLED = "certificate_detector_enabled";
    public static final String CERTIFICATE_DETECTOR_ENDPOINT = "certificate_detector_endpoint";
    public static final String COLLECT_SENSITIVE_IDENTIFIERS = "collect_sensitive_identifiers";
    public static final String DEFAULT_ENABLED = "default_enabled";
    public static final String EMULATOR_DETECTION_ANALYSIS = "emulator_detection_analysis";
    public static final String EXTENDED_OVERLAY_DETECTOR_ENABLED = "extended_overlay_detector_enabled";
    public static final String EXTENDED_PACKAGE_INFORMATION = "extended_package_information";
    public static final String GPS_DETECTOR_ENABLED = "gps_detector_enabled";
    public static final String HASH_SENSITIVE_IDENTIFIERS = "hash_sensitive_identifiers";
    public static final String HTTP_DETECTOR_ENABLED = "http_detector_enabled";
    public static final String HUMAN_DETECTOR_ENABLED = "human_detector_enabled";
    public static final CleafyConfigConstants INSTANCE = new CleafyConfigConstants();
    public static final String INTEGRATION_TOKEN = "integration_token";
    public static final String MOCK_LOCATION_ENABLED = "mock_location_enabled";
    public static final String MONITORED_APP_ENABLED = "monitored_app_enabled";
    public static final String NFC_DETECTOR_ENABLED = "nfc_detector_enabled";
    public static final String ON_CALL_DETECTOR_ENABLED = "on_call_detector_enabled";
    public static final String PACKAGE_ANALYSIS_ENABLED = "package_analysis_enabled";
    public static final String ROOT_DETECTOR_ENABLED = "root_detector_enabled";
    public static final String TASK_INJECTION_ENABLED = "task_injection_enabled";
    public static final String VPN_DETECTOR_ENABLED = "vpn_detector_enabled";
}
