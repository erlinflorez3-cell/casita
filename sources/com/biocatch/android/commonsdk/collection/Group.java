package com.biocatch.android.commonsdk.collection;

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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005>2 w\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЮAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʷ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//|\u001aHriMݚ3ĈWiZ̲\u0011.|(O*7\u000e1լ7ʰoP\\А|\u001d[/l\u0007,\ni\u0605/ʟ@!-ī\u001f[v}\u0003M\f\f{Ë9Ơ]nsލ(ElHMQ\u0012\u00128׳I݀C<jڳ)rPi$Z\u000b*xü\u001bн\u0014w\u0004ͩ\u001f\u0018!IWqJ6\u0003ւkÅ\u0019H\u000bٜ\u0013M\u000b!wZ\u0017\u0012Uԥ\u0006ʗ\u0007i,ڏY\r^u\to\u0016z ؚO˃&-Iٛ\u0006%4o:hb~yțQ\u0381\u0004Goն\u0018Xz1\u000eU*\"l֤\fֺ3=\u001bÁO5@\u001eEEzt<ʿ ɟ+z\u0005Ȫ_GvK\u007f\b\u0019r\u0003ߓ=ߝST\u001fǱGj\u0001A d.{8ÆMĕgT\u0013ϵ\u000fU\u0001\"q<|:SąqǪ)\u0001wܲŅ9M"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u007f\"rqD\\", "", "u(E", "\u000fB2\u0012?\f+=\u0001^i>\u0019", "", "\u000fB2\u0012F\u001a\"0|e^M \\y\u000fNn\u0016", "\u000fO?\u0019<\n\u001aB|hc>\u001d\\q\u001eS", "\u000fT3\u0016B", "\u0010@C!8\u00192A\bZiN\u001a", "\u0011@;\u0019<\u0015\u001f=", "\u0011K8\u001d5\u0016\u001a@w^k>\u0015kv", "\u0011N=!8\u001f-1{Zc@\f", "\u0012DE\u00166\f\u001a>\u0004e^<\bkl\u0019Nm", "\u0012DE\u00166\f(@|^cM\bkl\u0019N", "\u0013K4\u001a8\u0015-3\n^cM\u001a", "\u0013K4\u001a8\u0015-A", "\u0013K4\u001a8\u0015-A{bZK\bif\u0012Y", "\u0014K8\u001b:\f/3\u0002mh", "\u0015XA\u001cF\n(>x", "\u0019DH ", "\u001aH6\u0015G\u0015\u001eDxgiL", "\u001aN2\u000eG\u0010(<xoZG\u001bj", "\u001aN=\u0014C\u0019\u001eA\u0007^k>\u0015kv", "\u001bND 8\u0019\u001eDxgiL", "\u001dQ8\u0012A\u001b\u001aB|hc", "\u001e@=\u0012I\f'B\u0007", "\u001eH=\u0010;\f/3\u0002mh", "\u001eQ>%<\u0014\"B\r^k>\u0015kv", "!H6\u001b<\r\"1tgiX\u0014fw\u0013Oh", "!S0!<\n", "\"@?\u0012I\f'B\u0007", "\"ND\u0010;", "$N8\u001d", "%H5\u0016<\u0015\u001f=", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Group {
    public static final String ACCELEROMETER = "accelerometer_events";
    public static final String ACCESSIBILITYEVENTS = "accessibility_events";
    public static final String APPLICATIONEVENTS = "application_events";
    public static final String AUDIO = "audio_info";
    public static final String BATTERYSTATUS = "battery_status";
    public static final String CALLINFO = "call_info";
    public static final String CLIPBOARDEVENTS = "clipboard_events";
    public static final String CONTEXTCHANGE = "contextChange";
    public static final String DEVICEAPPLICATIONS = "device_applications";
    public static final String DEVICEORIENTATION = "screen_orientation";
    public static final String ELEMENTEVENTS = "element_events";
    public static final String ELEMENTS = "elements";
    public static final String ELEMENTSHIERARCHY = "elements_hierarchy";
    public static final String FLINGEVENTS = "fling_events";
    public static final String GYROSCOPE = "gyro_events";
    public static final Group INSTANCE = new Group();
    public static final String KEYS = "key_events";
    public static final String LIGHTNEVENTS = "light_events";
    public static final String LOCATIONEVENTS = "location_events";
    public static final String LONGPRESSEVENTS = "longpress_events";
    public static final String MOUSEREVENTS = "mouse_events";
    public static final String ORIENTATION = "orientation_events";
    public static final String PANEVENTS = "pan_events";
    public static final String PINCHEVENTS = "pinch_events";
    public static final String PROXIMITYEVENTS = "proximity_events";
    public static final String SIGNIFICANT_MOTION = "significant_motion";
    public static final String STATIC = "static_fields";
    public static final String TAPEVENTS = "tap_events";
    public static final String TOUCH = "touch_events";
    public static final String VOIP = "voip";
    public static final String WIFIINFO = "wifi_info";

    private Group() {
    }
}
