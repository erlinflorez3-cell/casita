package com.dynatrace.agent.events;

import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.events.enrichment.EventKeys;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\bnjO0L͜P.hS2\u000fq|<$q$yCI\\\"Ԃ*\teNogtJb\u000bQ-\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoMTUڎE9n}>\u0005&2*8\u0010\u0005\tɝ2H\u001ev\u0003CQ\u000f\u001a0VpBR\u0013P\r\u001a \u0012F \u0007\u001fbɡdȤxl\f9g#/\u0017\u0003\f-d@\u0001[\r^TU\u000e\u0007e,-X7c\u00185Y\t\u0007`_W\u0003mtM\u000bn'50as\u00069h\u0006\u001a\u00159U%]!-l\t_h$'YXӍOR\u00142\u0006\u0006D\u0019J\u001d&\u0006Ub^1(\u0002 \u000eaw;_Ni\u001a^p\u001a+eD3=\u007faH\u0002)toy;Gmg\u007f\u0013(6#/qg[\u001d\u001cn53T&kaUN^`N8m\u0004mL\u0018p$B\u0004^f(5\f\u0013>\u0017SE\nFS%y%`D\u0016\u00055dvw\u0002Rvehnގ;,\u000f2hk-\u001dyxlXZ%u\"d\t\u000e\bA4\u000b\u000bl%3+fO\u0017l1M&\"3X~7\b\u0003\u0014\u0014g;n3ce\u0012#\u0012V\u00050W<\u0011\"\u001ff\u000bc\u001a\u0005t(P]pp y\fD| AE\u0006ql@:11\\CIYٟD˩\u0001\tgʳ9\u001c\rVK$1lzڒ\u000bɹT\\xב8\u0005W0\u0015`P0\u0018ٞ7Ԋ*U*ֻ\u0005\t1\f\u0017s.J>չIƥp\u0016}ɝL,$ QQ]DiÄ\u0001Ȟ6\u00025զ\u001d~sYe\u0012U\u0004Sȭ\u0011³l.oō;\u0003:l\u0003P_V'\"%l!0^۰\u0002\u05fbeF\u0003ò4`\u0019jVI!\u00130ߥP̞\u0001\u0005'Ǉu\r}3\u00155[F}ݷ\"߳\u0018/\u001d˕.{}@\u0012h\u001f(\u0005e2@\u0012)F̨SЄ6;@Ծ*\u000bL7<l1X\u001f۶yڇF\t<ؿ\u0004ZO{\t\\HO\u001b/,i5DcߡXݍ>\u0013wϘӗ2\u000e"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;x\n", "", "Bh\\2C9Hd\u001d}zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006\u0006)=YG\u000f;u\u0016\u0019ZMLo3\u001e\">", ";`g\u0012i,Gb'izk\u001e\u0001\u0012.o\u0012", "", "Eh]1b>,W.~h^*\u0007\u0012.s", "At\\:T9R7\"\u000ezk=x\u0010", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "At\\:T9R@\u0019|zb=|\u0016", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr\f%pi5\u0014w\u0019Nt'K]N92", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u0018E@49a}i&q\u001e.8PE|8\u001d\u0015u7\u001djG\u0013T\u00016NPW?&P|J\u001e\"i\u0012W+\u001bN7K1xTF#\u0011,7\u007fEs\u0001a|\f?r:Aj\u0019C\t\"q?)2B[_\u0003V\u000bEs*m\u001bmf<K:-#`\u001c(r_=\u0011{`O`b\u0002ocT-g8\">qlFRE\u0019-", "3uT;g\u001eB\\\u0018\t\r", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/df,\nOV", "", ":nR8", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "2q^=66N\\(~\b", "3uT;g\tNQ\u001f~\nl", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "7me._0=3*~\u0004m\u001b\u007f\u00169t\u000f/{Mo+\"G", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u000f\u0016\u0016UH(m\u001a", "7me._0=3*~\u0004m:", "", "/bR2c;\u001ed\u0019\b\n", "", ">q^Ab*HZ|}", "8r^;8=>\\(", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", ">q^0X:L7\"\u0010ve0{h@e\t7", "", ">q^0X:L3*~\u0004m\u0010}s9s\u000e,xG\u0001", "Bx_2", ";ne2J0GR#\u0011", "<nf", "Ahi2", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", ";ne2J0GR#\u0011BL?XW-E[", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u00125e~\u000f\u007fN\u0010l{,3~", "4h]15@)`#\u000e\u0005\\6\u0004l.", "4h]15@\u001cV\u0015\fv\\;|\u00163s\u000f,yN", "5d]2e(MS\u0001~\tl(~\t", "", "\u0013uT;g\u001bA`#\u000e\ne,\nwCp\u007f", "!t\\:T9R@\u0019|zb=|\u0016", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventThrottler {
    private final CoroutineScope coroutineScope;
    private volatile int dropCounter;
    private final List<EventThrottlerType> eventBuckets;
    private final LinkedList<Long> eventWindow;
    private final EventThrottlerType.EventInvalid invalidEventThrottlerType;
    private final Set<Integer> invalidEvents;
    private final ReentrantLock lock;
    private final int maxEventsPerWindow;
    private final int summaryInterval;
    private final SummaryReceiver summaryReceiver;
    private final TimeProvider timeProvider;
    private final int windowSizeSeconds;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u001e\u007f\u0007lyA0ZeP.hS2\u000f\u0002{<$q$yCQU\"}8\tWN}gvϺ`;YƤ6\u0016'idNd\tn$\"FW0b9O\u007fC?`\u00036\u001d `#H\u007f\u000b\u0001(,`\u0010%{SO\u001a\u0015H@\u001f>ň\u0011O\u000b\u001f \f\u000f8\u000f\u001etg|7\u001fǔiƠ3/\u000b݃ZP-f>\u0005m\u000fL]5\u0017Gy,-X7c\u0016{ٌ\u000f\u07baVgGšWsC\u0010v/G-O\u007fe@)\u000f\"\u0018CO;aę*b\rĩx\u000e-8]q֢O\u0013>\u000f\u0013\u0015'W أ\nD"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "", "Ad]18=>\\(", "", "2q^=c,=3*~\u0004m", "Bx_2", "", "\nh]6g\u0005", "uH8\u0019](OOb\u0006vg.Fv>r\u00041}\u0016D\b", "5dc X5=3*~\u0004m", "u(8", "Adc X5=3*~\u0004m", "uH\u0018#", "5dc\u0011e6I^\u0019}Zo,\u0006\u0018", "Adc\u0011e6I^\u0019}Zo,\u0006\u0018", "5dc!l7>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0013uT;g\bIW", "\u0013uT;g\u001eK_", "\u0013uT;g\fK`", "\u0013uT;g\u0016MV", "\u0013uT;g\tBh", "\u0013uT;g\u001a?[", "\u0013uT;g\u0010Gd\u0015\u0006~]", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u0007\u0018\t/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\b\u0011\u001a/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u000b\u001a\u0012/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u000f\u0016\u0016UH(m\u001a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u0015\u001c\b/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u0019\u000e\r/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u001d\u001a\u0011/", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static abstract class EventThrottlerType {
        private int droppedEvent;
        private int sendEvent;
        private final String type;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u0007\u0018\t/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventApi extends EventThrottlerType {
            public EventApi() {
                super(0, 0, "API", 3, null);
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\b\u0011\u001a/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventBiz extends EventThrottlerType {
            public EventBiz() {
                super(0, 0, "BIZ", 3, null);
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u000b\u001a\u0012/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventErr extends EventThrottlerType {
            public EventErr() {
                super(0, 0, "ERR", 3, null);
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u000f\u0016\u0016UH(m\u001a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventInvalid extends EventThrottlerType {
            public EventInvalid() {
                super(0, 0, "INVALID", 3, null);
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u0015\u001c\b/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventOth extends EventThrottlerType {
            public EventOth() {
                super(0, 0, "OTH", 3, null);
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u0019\u000e\r/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventSfm extends EventThrottlerType {
            public EventSfm() {
                super(0, 0, "SFM", 3, null);
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0005Wي`\u000b\\A?'݈\u0016y\rfx:ӭHg"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r{s#Z\u0017]\u001d\u001a\u0011/", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr}&hjHuf9X\u00066NL[\u001bp]r\u0013", "\nh]6g\u0005", "u(E", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class EventWrq extends EventThrottlerType {
            public EventWrq() {
                super(0, 0, "WRQ", 3, null);
            }
        }

        private EventThrottlerType(int i2, int i3, String str) {
            this.sendEvent = i2;
            this.droppedEvent = i3;
            this.type = str;
        }

        public /* synthetic */ EventThrottlerType(int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 + 1) - (1 | i4) != 0 ? 0 : i2, (-1) - (((-1) - i4) | ((-1) - 2)) != 0 ? 0 : i3, str, null);
        }

        public /* synthetic */ EventThrottlerType(int i2, int i3, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, i3, str);
        }

        public final int getDroppedEvent() {
            return this.droppedEvent;
        }

        public final int getSendEvent() {
            return this.sendEvent;
        }

        public final String getType() {
            return this.type;
        }

        public final void setDroppedEvent(int i2) {
            this.droppedEvent = i2;
        }

        public final void setSendEvent(int i2) {
            this.sendEvent = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4\u0012}\u0007lOOӄtev-\u001ba8\u000f\u0004{b%\f(\u007fESUH\u0001h\u001d\u0018\\uk\u0007J\t\fs\u0013\u0014\u0018\u0011jZL\u001c\u001dٛ\u0016\u0014"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006V65b\r\u000f:z =\\J;xr\f%pi5\u0014w\u0019Nt'K]N92", "", "=m8;i(EW\u0018^\f^5\fv?m\b$\tT", "", "At\\:T9R", "", "=m3?b7IS\u0018^\f^5\fv?m\b$\tT", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public interface SummaryReceiver {

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            public static void onInvalidEventSummary(SummaryReceiver summaryReceiver, String summary) {
                Intrinsics.checkNotNullParameter(summary, "summary");
            }
        }

        void onDroppedEventSummary(String str);

        void onInvalidEventSummary(String str);
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.events.EventThrottler$processEventIfPossible$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventThrottler.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.Companion;
                this.label = 1;
                if (DelayKt.m10472delayVtjQ1oo(DurationKt.toDuration(EventThrottler.this.summaryInterval, DurationUnit.SECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ReentrantLock reentrantLock = EventThrottler.this.lock;
            EventThrottler eventThrottler = EventThrottler.this;
            reentrantLock.lock();
            try {
                String strGenerateMessage = eventThrottler.generateMessage(eventThrottler.eventBuckets);
                eventThrottler.dropCounter = 0;
                for (EventThrottlerType eventThrottlerType : eventThrottler.eventBuckets) {
                    eventThrottlerType.setDroppedEvent(0);
                    eventThrottlerType.setSendEvent(0);
                }
                eventThrottler.summaryReceiver.onDroppedEventSummary(strGenerateMessage);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.events.EventThrottler$processInvalidEvent$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11221(Continuation<? super C11221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventThrottler.this.new C11221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.Companion;
                this.label = 1;
                if (DelayKt.m10472delayVtjQ1oo(DurationKt.toDuration(EventThrottler.this.summaryInterval, DurationUnit.SECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ReentrantLock reentrantLock = EventThrottler.this.lock;
            EventThrottler eventThrottler = EventThrottler.this;
            reentrantLock.lock();
            try {
                String str = "Detected invalid event(s) with ids [" + CollectionsKt.joinToString$default(CollectionsKt.sorted(eventThrottler.invalidEvents), ",", null, null, 0, null, null, 62, null) + AbstractJsonLexerKt.END_LIST;
                eventThrottler.invalidEvents.clear();
                eventThrottler.summaryReceiver.onInvalidEventSummary(str);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventThrottler(TimeProvider timeProvider, int i2, int i3, int i4, SummaryReceiver summaryReceiver) {
        this(timeProvider, i2, i3, i4, null, summaryReceiver, 16, null);
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(summaryReceiver, "summaryReceiver");
    }

    public EventThrottler(TimeProvider timeProvider, int i2, int i3, int i4, CoroutineScope coroutineScope, SummaryReceiver summaryReceiver) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(summaryReceiver, "summaryReceiver");
        this.timeProvider = timeProvider;
        this.maxEventsPerWindow = i2;
        this.windowSizeSeconds = i3;
        this.summaryInterval = i4;
        this.coroutineScope = coroutineScope;
        this.summaryReceiver = summaryReceiver;
        this.eventWindow = new LinkedList<>();
        this.lock = new ReentrantLock();
        this.eventBuckets = CollectionsKt.listOf((Object[]) new EventThrottlerType[]{new EventThrottlerType.EventApi(), new EventThrottlerType.EventWrq(), new EventThrottlerType.EventErr(), new EventThrottlerType.EventOth(), new EventThrottlerType.EventBiz(), new EventThrottlerType.EventSfm()});
        this.invalidEventThrottlerType = new EventThrottlerType.EventInvalid();
        this.invalidEvents = new LinkedHashSet();
    }

    public /* synthetic */ EventThrottler(TimeProvider timeProvider, int i2, int i3, int i4, CoroutineScope coroutineScope, SummaryReceiver summaryReceiver, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, i2, (i5 + 4) - (4 | i5) != 0 ? 60 : i3, (8 & i5) == 0 ? i4 : 60, (-1) - (((-1) - i5) | ((-1) - 16)) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope, summaryReceiver);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventThrottler(TimeProvider timeProvider, int i2, int i3, SummaryReceiver summaryReceiver) {
        this(timeProvider, i2, i3, 0, null, summaryReceiver, 24, null);
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(summaryReceiver, "summaryReceiver");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventThrottler(TimeProvider timeProvider, int i2, SummaryReceiver summaryReceiver) {
        this(timeProvider, i2, 0, 0, null, summaryReceiver, 28, null);
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(summaryReceiver, "summaryReceiver");
    }

    private final EventThrottlerType findByCharacteristics(List<? extends EventThrottlerType> list, JSONObject jSONObject) {
        if (jSONObject.optBoolean(EventKeys.Characteristics.IS_SELF_MONITORING)) {
            for (EventThrottlerType eventThrottlerType : list) {
                if (eventThrottlerType instanceof EventThrottlerType.EventSfm) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (jSONObject.optBoolean(EventKeys.Characteristics.HAS_REQUEST)) {
            for (EventThrottlerType eventThrottlerType2 : list) {
                if (eventThrottlerType2 instanceof EventThrottlerType.EventWrq) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (jSONObject.optBoolean(EventKeys.Characteristics.HAS_ERROR)) {
            for (EventThrottlerType eventThrottlerType22 : list) {
                if (eventThrottlerType22 instanceof EventThrottlerType.EventErr) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (jSONObject.optBoolean(EventKeys.Characteristics.IS_API_REPORTED)) {
            for (EventThrottlerType eventThrottlerType222 : list) {
                if (eventThrottlerType222 instanceof EventThrottlerType.EventApi) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        for (EventThrottlerType eventThrottlerType2222 : list) {
            if (eventThrottlerType2222 instanceof EventThrottlerType.EventOth) {
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
        return eventThrottlerType2222;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.dynatrace.agent.events.EventThrottler.EventThrottlerType findByProtocolId(java.util.List<? extends com.dynatrace.agent.events.EventThrottler.EventThrottlerType> r5, int r6) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.events.EventThrottler.findByProtocolId(java.util.List, int):com.dynatrace.agent.events.EventThrottler$EventThrottlerType");
    }

    public final String generateMessage(List<? extends EventThrottlerType> list) {
        List<? extends EventThrottlerType> list2 = list;
        return "Dropped " + this.dropCounter + " events, current limit: " + this.maxEventsPerWindow + " - type sent: [" + CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, new Function1() { // from class: com.dynatrace.agent.events.EventThrottler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventThrottler.generateMessage$lambda$13((EventThrottler.EventThrottlerType) obj);
            }
        }, 30, null) + "], dropped: [" + CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, new Function1() { // from class: com.dynatrace.agent.events.EventThrottler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventThrottler.generateMessage$lambda$14((EventThrottler.EventThrottlerType) obj);
            }
        }, 30, null) + AbstractJsonLexerKt.END_LIST;
    }

    public static final CharSequence generateMessage$lambda$13(EventThrottlerType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType() + AbstractJsonLexerKt.COLON + it.getSendEvent();
    }

    public static final CharSequence generateMessage$lambda$14(EventThrottlerType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType() + AbstractJsonLexerKt.COLON + it.getDroppedEvent();
    }

    /* JADX INFO: renamed from: moveWindow-SxA4cEA */
    private final void m7116moveWindowSxA4cEA(LinkedList<Long> linkedList, long j2, long j3) {
        long jM10324getInWholeMillisecondsimpl = j2 - Duration.m10324getInWholeMillisecondsimpl(j3);
        while (!linkedList.isEmpty()) {
            Long lPeek = linkedList.peek();
            Intrinsics.checkNotNull(lPeek);
            if (lPeek.longValue() > jM10324getInWholeMillisecondsimpl) {
                return;
            } else {
                linkedList.poll();
            }
        }
    }

    private final boolean processEventIfPossible(EventThrottlerType eventThrottlerType) {
        long jMillisSinceEpoch = this.timeProvider.millisSinceEpoch();
        LinkedList<Long> linkedList = this.eventWindow;
        Duration.Companion companion = Duration.Companion;
        m7116moveWindowSxA4cEA(linkedList, jMillisSinceEpoch, DurationKt.toDuration(this.windowSizeSeconds, DurationUnit.SECONDS));
        if (this.eventWindow.size() < this.maxEventsPerWindow) {
            this.eventWindow.add(Long.valueOf(jMillisSinceEpoch));
            eventThrottlerType.setSendEvent(eventThrottlerType.getSendEvent() + 1);
            return true;
        }
        this.dropCounter++;
        eventThrottlerType.setDroppedEvent(eventThrottlerType.getDroppedEvent() + 1);
        if (this.dropCounter == 1) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        }
        return false;
    }

    private final void processInvalidEvent(int i2) {
        if (this.invalidEvents.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C11221(null), 3, null);
        }
        this.invalidEvents.add(Integer.valueOf(i2));
    }

    public final boolean acceptEvent(int i2) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            EventThrottlerType eventThrottlerTypeFindByProtocolId = findByProtocolId(this.eventBuckets, i2);
            if (eventThrottlerTypeFindByProtocolId instanceof EventThrottlerType.EventInvalid) {
                processInvalidEvent(i2);
            }
            return processEventIfPossible(eventThrottlerTypeFindByProtocolId);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean acceptEvent(JSONObject jsonEvent) {
        Intrinsics.checkNotNullParameter(jsonEvent, "jsonEvent");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return processEventIfPossible(findByCharacteristics(this.eventBuckets, jsonEvent));
        } finally {
            reentrantLock.unlock();
        }
    }
}
