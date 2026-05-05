package com.dynatrace.agent.events.enrichment;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005;2\u009aw\u001d߿\u001b9^C\u001eX:_a9\u001f|\u000eG8p:\t[To5\u001a?IVTg̊rL`\u000bQ\u0010V\"\u0007lDI\u0004{4\u070fa̓FoG\u074c\u001e{K=xtd\bv\u074ctأ}\u0005\tɝzT\u001e{\u0013Cy\u000fhؚ\u0013¤>R\u0015˟U& \fV /!3ɨ!ɇLleŽ\u007f/\u0011pZNUb\u0007Ů ϘJT/˙Gm,3X7c\u0018{ٌU\u07baV[Gš\u0010}K\u000e\u0001'U. ֜*͏\\\u007f\u001cƃ{[\u001bg\u000b&\u000b\b(ӧ^ˏ/Ok֟!\u001a6\u0003\u0013{;?Z\u0601XόL.5ԿǺ\f,"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuG\\", "", "\nh]6g\u0005", "u(E", "!S0\u001fG&-7\u0001^", "", "\u0012TA\u000eG\u0010(<", "\"Q0\u00108&\"2", "!O0\u001bR\u0010\u001d", "\u0013M3,G\u0010&3", "\u0011K8\u0012A\u001b", "\u0010Q>$F\f+", "\u001eDA\u0013B\u0019&/\u0002\\Z", "\"H<\u0012R\n(@\u0006^XM\u0010fq", "\u0012S", "\u001dR", "\u0015D>", "\u0012DE\u00166\f", "\u000fO?", "$H4$", "\u001cDC$B\u0019$", "\u0016SC\u001d", " D@\"8\u001a-", "%D1 B\n$3\b", "\u0013QA\u001cE", "\u0013W2\u0012C\u001b\"=\u0002", "#Q;", "\u000fO? G\b+B", "$HB\u00165\u0010%7\br", "!DB <\u0016'M\u0004kdI\fiw\u0013Em", "\u0013U4\u001bG&)@\u0003iZK\u001b`h\u001d", "\u0011gP?T*MS&\u0003\tm0z\u0017", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventKeys {
    public static final String BROWSER = "browser";
    public static final String CLIENT = "client";
    public static final String DURATION = "duration";
    public static final String END_TIME = "end_time";
    public static final EventKeys INSTANCE = new EventKeys();
    public static final String PERFORMANCE = "performance";
    public static final String SPAN_ID = "span.id";
    public static final String START_TIME = "start_time";
    public static final String TIME_CORRECTION = "time_correction";
    public static final String TRACE_ID = "trace.id";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005$2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081ĖV\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGE?\u00179L", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "$DA <\u0016'", "!G>\u001fG&/3\u0006l^H\u0015", "\u0010T=\u0011?\f", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class APP {
        public static final String BUNDLE = "app.bundle";
        public static final APP INSTANCE = new APP();
        public static final String NAMESPACE = "app.";
        public static final String SHORT_VERSION = "app.short_version";
        public static final String VERSION = "app.version";

        private APP() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005\"2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGE?\u00179d\u0016#9=\u0002", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\"X?\u0012", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class APPSTART {
        public static final APPSTART INSTANCE = new APPSTART();
        public static final String NAMESPACE = "app_start.";
        public static final String TYPE = "app_start.type";

        private APPSTART() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u000512 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤ\u0019xkBG#1l\u0019þyۢ4|Uε\u0017`5\u0016\u000faL.\u0017ˁ\bչ)S\u000bޗ#gM\rWqk\b?ѮyȅMs_̬)\f\" CO;`I̭/ԇU`\u0014ʬ{[qWh\u000eVzQԏ_ʀ\b\u000e\u000eΩ\u0019:;'~\b<6KɈ&ĖT\u0002fۍP\u0007oD/%.6\u0002ݔmƻUaCϊ\u001fC\n\u0014%\u001eQ\u0004EĖ.ڍ\u0012`\u001dÑ%\u0004_Ai@kK%˪,ǀq\u0004xçR6\u0012A_\u007f]~gыiÉ;[A\u05faqw\u0010Z\\g%\b7ì&ׂVHH̎?\"E=!\f\tG;ʔ>ÏXX4Ҋܜ h"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEA/J\u0004#E[N9``\u0002A\u0012 0", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u0016@B,8\u0019+=\u0006", "\u0016@B,4\u0015+", "\u0016@B,6\u0019\u001aA{", "\u0016@B,8\u001f\u001c3\u0004m^H\u0015", "\u0016@B,9\b\":x]tK\fhx\u000fSn", "\u0016@B,E\f*Cxli", "\u0016@B,A\b/7zZiB\u0016e", "\u0016@B,H\u001a\u001e@\u0013bcM\fid\rTc\u0012d", "\u0016@B,8\u001d\u001e<\bxeK\u0016gh\u001cTc\bi", "\u0016@B,F\f,A|hcX\u0017ir\u001aEl\u0017_ n", "\u0016@B,I\u0010,7ubaB\u001bp\u0003\rH[\u0011] ", "\u0016@B,4\u0017)M\u0007mVK\u001b", "\u0016@B,I\u0010\u001eE\u0013ljF\u0014Xu#", "\u0017RN\u000eC\u00108@xidK\u001b\\g", "\u0017RN 8\u0013\u001fM\u0001hcB\u001bfu\u0013Na", "\u0017RN\u0016A\u001b\u001e@\u0002Za", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Characteristics {
        public static final String HAS_ANR = "characteristics.has_anr";
        public static final String HAS_APP_START = "characteristics.has_app_start";
        public static final String HAS_CRASH = "characteristics.has_crash";
        public static final String HAS_ERROR = "characteristics.has_error";
        public static final String HAS_EVENT_PROPERTIES = "characteristics.has_event_properties";
        public static final String HAS_EXCEPTION = "characteristics.has_exception";
        public static final String HAS_FAILED_REQUEST = "characteristics.has_failed_request";
        public static final String HAS_NAVIGATION = "characteristics.has_navigation";
        public static final String HAS_REQUEST = "characteristics.has_request";
        public static final String HAS_SESSION_PROPERTIES = "characteristics.has_session_properties";
        public static final String HAS_USER_INTERACTION = "characteristics.has_user_interaction";
        public static final String HAS_VIEW_SUMMARY = "characteristics.has_view_summary";
        public static final String HAS_VISIBILITY_CHANGE = "characteristics.has_visibility_change";
        public static final Characteristics INSTANCE = new Characteristics();
        public static final String IS_API_REPORTED = "characteristics.is_api_reported";
        public static final String IS_INTERNAL = "characteristics.is_internal";
        public static final String IS_SELF_MONITORING = "characteristics.is_self_monitoring";
        public static final String NAMESPACE = "characteristics.";

        private Characteristics() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005(2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤ\u0019xkBG#1l\u0019þyۢ4|Uε\u0017`5\u0016\u000faL.\u0017ˁ\bչ)S\u000bޗ#gM\rWqk\b?ѮyȅMs_̬ނ\u0004\u001f"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEB\f?Z\u0005'\"", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "!BA\u00128\u00158E|]iA", "!BA\u00128\u001586xb\\A\u001b", "\u001b@=\"9\b\u001cB\tkZK", "\u001bN3\u0012?&\"2xgiB\r`h\u001c", "\u0017RN\u001fB\u0016-3w", "\u001dQ8\u0012A\u001b\u001aB|hc", "\u0010@C!8\u00192M\u007f^k>\u0013", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DEVICE {
        public static final String BATTERY_LEVEL = "device.battery.level";
        public static final DEVICE INSTANCE = new DEVICE();
        public static final String IS_ROOTED = "device.is_rooted";
        public static final String MANUFACTURER = "device.manufacturer";
        public static final String MODEL_IDENTIFIER = "device.model.identifier";
        public static final String NAMESPACE = "device.";
        public static final String ORIENTATION = "device.orientation";
        public static final String SCREEN_HEIGHT = "device.screen.height";
        public static final String SCREEN_WIDTH = "device.screen.width";

        private DEVICE() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005#2 w\u001d߿\u001b9^C\u001eH2W\u00141\u0015kڷ8&a$\u007fD\fa(\u007f:\t}Q>ˮAН^\u000bKƤَ\u001a~"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEB\u001b$", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", " T<", "!T?\u001dB\u0019-", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DT {
        public static final DT INSTANCE = new DT();
        public static final String NAMESPACE = "dt.";

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005)2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤ\u0019xkBG#1l\u0019þyۢ4|Uε\u0017`5\u0016\u000faL.\u0017ˁ\bչ)S\u000bޗ#gM\rWqk\b?ѮyȅMs_̬)\f\" CO;`I̭/ԇU`\u0014ʬˬSo"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEB\u001b\rc\u0017/\"", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "!B7\u0012@\b8DxkhB\u0016e", "\u000fO?\u0019<\n\u001aB|hcX\u0010[", "\u0017MB!4\u0015\u001c3\u0013bY", "!H3", "\u000fF4\u001bG&/3\u0006l^H\u0015", "\u000fF4\u001bG&-G\u0004^", "\u0013U4\u001bG&,=\tkX>&k|\u001aE", "#R4\u001fR\u001b\u001a5", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class RUM {
            public static final String AGENT_TYPE = "dt.rum.agent.type";
            public static final String AGENT_VERSION = "dt.rum.agent.version";
            public static final String APPLICATION_ID = "dt.rum.application.id";
            public static final String EVENT_SOURCE_TYPE = "dt.rum.event.source.type";
            public static final RUM INSTANCE = new RUM();
            public static final String INSTANCE_ID = "dt.rum.instance.id";
            public static final String NAMESPACE = "dt.rum.";
            public static final String SCHEMA_VERSION = "dt.rum.schema_version";
            public static final String SID = "dt.rum.sid";
            public static final String USER_TAG = "dt.rum.user_tag";

            private RUM() {
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005&2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤ\u0019xkBG#1l\u0019þyۢ4|UεШX0"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEB\u001b\rd\u0017278\u0019K(", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u000fO8,;\b,MxggB\n_\u0003\u000fX]\bf/d\u0001\u007f", "\u000fO8,;\b,MwkdI\u0017\\g)Co\u0016j*h\u0011\u00024Yx\u001cc\u0014\u00199k", "\u000fO8,B\u001d\u001e@\u0006bY=\fe\u0003\u0010I_\u000fZ.", "\u0016@B,A\r'M\nZaN\fj", "\u001aD6\u000e6 8/\u0004btK\fgr\u001cT_\u0007", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class SUPPORT {
            public static final String API_HAS_DROPPED_CUSTOM_PROPERTIES = "dt.support.api.has_dropped_custom_properties";
            public static final String API_HAS_ENRICH_EXCEPTION = "dt.support.api.has_enrich_exception";
            public static final String API_OVERRIDDEN_FIELDS = "dt.support.api.overridden_fields";
            public static final String HAS_NFN_VALUES = "dt.support.has_nfn_values";
            public static final SUPPORT INSTANCE = new SUPPORT();
            public static final String LEGACY_API_REPORTED = "dt.support.is_legacy_api_reported";
            public static final String NAMESPACE = "dt.support.";

            private SUPPORT() {
            }
        }

        private DT() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005%2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤՈpe"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEC\u0019;`\u0014\u001d", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u001c@<\u0012", "\u0016@B,6\u001c,B\u0003ftG\bdh", "\u0017RN\u00134\u001b\u001a:", "\u0011N3\u0012", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class ERROR {
        public static final String CODE = "error.code";
        public static final String HAS_CUSTOM_NAME = "error.has_custom_name";
        public static final ERROR INSTANCE = new ERROR();
        public static final String IS_FATAL = "error.is_fatal";
        public static final String NAME = "error.name";
        private static final String NAMESPACE = "error.";

        private ERROR() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005Գ,(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԉt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEC\u001d._\u0016A7;\u0016G2_,wqHc", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class EVENT_PROPERTIES {
        public static final EVENT_PROPERTIES INSTANCE = new EVENT_PROPERTIES();
        public static final String NAMESPACE = "event_properties.";

        private EVENT_PROPERTIES() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005%2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤՈpe"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEC\u001f,V\u0012608\u00152", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u001bDB 4\u000e\u001e", "!S0\u0010>&-@t\\Z", "\"X?\u0012", "\u0011Q0 ;&,7zgVE", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class EXCEPTION {
        public static final String CRASH_SIGNAL = "exception.crash_signal_name";
        public static final EXCEPTION INSTANCE = new EXCEPTION();
        public static final String MESSAGE = "exception.message";
        private static final String NAMESPACE = "exception.";
        public static final String STACK_TRACE = "exception.stack_trace";
        public static final String TYPE = "exception.type";

        private EXCEPTION() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005#2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600ѯ\t\u0007"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEE\f8L", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u001aN2\u000eG\u0010(<\u0013eVM", "\u001aN2\u000eG\u0010(<\u0013edG", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class GEO {
        public static final GEO INSTANCE = new GEO();
        public static final String LOCATION_LAT = "geo.location.latitude";
        public static final String LOCATION_LON = "geo.location.longitude";
        public static final String NAMESPACE = "geo.";

        private GEO() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005&2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\t\u0015įSɉ`gVȤ\u0019xkBG#1l\u0019þyۢ4|UεШX0"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEF\u001b=a|", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", " DB\u001dB\u0015,3\u0013li:\u001blv)Ci\u0007[", " DB\u001dB\u0015,3\u0013kZ:\u001afq)Pb\u0015W.`", " DB\u001dB\u0015,3\u0013aZ:\u000b\\u", " D@\"8\u001a-M\u0001^iA\u0016[", " D@\"8\u001a-M{^V=\fi", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class HTTP {
        public static final HTTP INSTANCE = new HTTP();
        private static final String NAMESPACE = "http.";
        public static final String REQUEST_HEADER = "http.request.header";
        public static final String REQUEST_METHOD = "http.request.method";
        public static final String RESPONSE_HEADER = "http.response.header";
        public static final String RESPONSE_REASON_PHRASE = "http.response.reason_phrase";
        public static final String RESPONSE_STATUS_CODE = "http.response.status_code";

        private HTTP() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005#2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600ѯ\t\u0007"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEL\f=h\u001142$", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u0011N=\u001b8\n-7\u0003gtM gh", "\u001eQ>!B\n(:\u0013gVF\f", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class NETWORK {
        public static final String CONNECTION_TYPE = "network.connection.type";
        public static final NETWORK INSTANCE = new NETWORK();
        public static final String NAMESPACE = "network.";
        public static final String PROTOCOL_NAME = "network.protocol.name";

        private NETWORK() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005#2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600ѯ\t\u0007"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEM\u001a$", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u001c@<\u0012", "$DA <\u0016'", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class OS {
        public static final OS INSTANCE = new OS();
        public static final String NAME = "os.name";
        public static final String NAMESPACE = "os.";
        public static final String VERSION = "os.version";

        private OS() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005$2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081ĖV\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEP\f:f\u00075;$", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u0010XC\u0012F&,3\u0002m", "\u0010XC\u0012F&+3v^^O\f[", "\"Q0\u00108&\u001c=\u0002mZQ\u001bvk\u0013Nn", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class REQUEST {
        public static final String BYTES_RECEIVED = "request.bytes_received";
        public static final String BYTES_SENT = "request.bytes_sent";
        public static final REQUEST INSTANCE = new REQUEST();
        private static final String NAMESPACE = "request.";
        public static final String TRACE_CONTEXT_HINT = "request.trace_context_hint";

        private REQUEST() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005Գ,(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԉt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEQ\f<d\u000b15H\u0017I<]\u001d\u0001\u0001>m<\u0001", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class SESSION_PROPERTIES {
        public static final SESSION_PROPERTIES INSTANCE = new SESSION_PROPERTIES();
        public static final String NAMESPACE = "session_properties.";

        private SESSION_PROPERTIES() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005\"2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGES\u00195L", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u0014T;\u0019", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class URL {
        public static final String FULL = "url.full";
        public static final URL INSTANCE = new URL();
        private static final String NAMESPACE = "url.";

        private URL() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005$2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޢ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰\u0013{M8eok<7ҡ\tӯ$2*\u0600J\u0011\u000f BH>yQŖ\u001eë\u00160H\u0081ĖV\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGET\u0010.h|", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u0017C", "\u001c@<\u0012", "\u0012DC\u00126\u001b\u001e2\u0013gVF\f", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class VIEW {
        public static final String DETECTED_NAME = "view.detected_name";
        public static final String ID = "view.instance_id";
        public static final VIEW INSTANCE = new VIEW();
        public static final String NAME = "view.name";
        public static final String NAMESPACE = "view.";

        private VIEW() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005\"2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGET\u0010<Z\u0004+32\u001bP(", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "!S0!8", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class VISIBILITY {
        public static final VISIBILITY INSTANCE = new VISIBILITY();
        private static final String NAMESPACE = "visibility.";
        public static final String STATE = "visibility.state";

        private VISIBILITY() {
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005\"2 w\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,0\u007fESUH\u0001xޞ\"ɁkgvϺ+\u0017Q\u0013\u001e\u0016'm\u0003ն(ޯa\u0012\u0017˰ԸsD"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017#Lk=-zhuGEU\f+d\u0011%2.\u001b2", "", "\nh]6g\u0005", "u(E", "\u001c@<\u0012F\u0017\u001a1x", "", "\u0011N=\u001b8\n-7\u0003gtL\u001bXw\u001fSy\u0006e\u001f`", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class WEBSOCKET {
        public static final String CONNECTION_STATUS_CODE = "websocket.connection.status_code";
        public static final WEBSOCKET INSTANCE = new WEBSOCKET();
        private static final String NAMESPACE = "websocket.";

        private WEBSOCKET() {
        }
    }

    private EventKeys() {
    }
}
