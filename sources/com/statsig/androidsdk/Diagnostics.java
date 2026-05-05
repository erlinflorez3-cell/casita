package com.statsig.androidsdk;

import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\rD4\u0012\u0006\u0013nj?0LeV4Zݷ2\u000f\u0002{<$a'yCQU\"}8\tWN}gvϺb\u000bQ2\u000e\u0016~n4Icxe\u0012\u00152JoU3UoC9htL\u0005(2(8\u0002\u0005\u0017\u001a2H\u0016x\u0001ŏaÈ0VpphQEL+Z3\u0016B.\u00016\\\u0016OFZz_R=3\u0005yB|+o4\rO#E\u0003&;yҐ\"+N<}/3i\u001b\u0007\u0001\\o\u0007M\tU\u0005\u00178W3OseNp\u0002*\u0014YXS];6j\u001ei`:A[WiK^)@y\u0011z;EL$\u0014C`4=\u001cv\b<D#\u0010\u0004HV\u0002l]\u0018|w5E.Hk9W3f\u007fbk\u001d\\V\u0014\u0005;>S\u0005|BsT<aE#Zw_SiBSG|-\nEs\u0004~\u0007\u001a,\u001a/u\u0011_\u0004\u0017.%=O]O\"OtJxR\r\u000f\u0005\u000fi\u0004m`gX\"\u001d6g2\u000f\fhf|\u0007\u0002O\u0003{\\\u0019S\u001cb+\u0016\n)\u001f\u000b\tl)+\u0010\\g\u0001k\u0001L\f\u0013u;t=qn\u001a\u0015.ޭjۋ9Qk߄2j\u0005\u001cW<\u0011\u000e/ٯNΐ\u0010fd̥:4Nt\u001e\u0003\u001cFT\u0018!?\u0010}*4D1G]kȀ\u000fٿFA\u0005ȁ0xv\u001e\u0017fC&\u0013iR}\u0019\t`b\u0001qwxw=+pP<\u0018ٞAԊ*U*ֻ\u0005\u00151\u0019\u0017\u007f\u0010IwLuU|\u0018\u0006U*'D-\u0010֚;ˮ\u0017\u000f\u0007ǻ\u0003\u001f;Gd\u0001uS]\u0012U~\r}\u001f=~-\u0016\u0007\u0019sݽdpR֢l\u0019(\u000bl\bץ\f\f"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eEC", "", "7r36f(;Z\u0019}", "", "AsPAf0@=$\u000e~h5\u000bo9g\u0002,\u0005B^!\"[", "", "", "uY;7T=:\u001d)\u000e~eud\u0005:;C\u0019", "2dU.h3M;\u0015\u0012bZ9\u0003\t<s", "", "2hP4a6Lb\u001d|\t<6\u0006\u0018/x\u000f", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u0017Kv8DH\u0012+7C", "5dc\u0011\\(@\\#\r\nb*\u000bf9n\u000f(\u000fO", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9kF\u007f45l\r\u000fKx\u0016\u0004", "Adc\u0011\\(@\\#\r\nb*\u000bf9n\u000f(\u000fO", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011M\u0018E\u0006%Hhl4Bmkq>", ";`a8X9L", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>hd$@s\u0016-9S;{4s", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2\u000b", ";`g\u001aT9DS&\r", "", "5dc g(Ma\u001d\u0001di;\u0001\u00138sf2}B\u0005 \u0019%y\u0019P", "u(;7T=:\u001d)\u000e~eud\u0005:;", "/cS\u001aT9DS&", ";`a8X9", "=uT?e0=Sv\t\u0004m,\u0010\u0018", "1kT.e\nH\\(~\u000em", "", "1n]AX?M", "5dc\u001aT9DS&\r", "\u001aiPCTuNb\u001d\u0006DJ<|\u0019/;", ";`a885=", "9dh", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`-o\"+\u000b05/", "AtR0X:L", "AsT=", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u000eGe9@YS", "/cS6g0H\\\u0015\u0006bZ9\u0003\t<", ";`a8F;:`(", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Diagnostics {
    public static final Companion Companion = new Companion(null);
    private int defaultMaxMarkers;
    private ContextType diagnosticsContext;
    private boolean isDisabled;
    private ConcurrentHashMap<ContextType, ConcurrentLinkedQueue<Marker>> markers;
    private Map<ContextType, Integer> maxMarkers;
    private final Map<String, Object> statsigOptionsLoggingCopy;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eE,s8UN7t8(\u001e>", "", "u(E", "4na:T;\u001fO\u001d\u0006z]\u0019|\u0017:o\t6{", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2s9\u000b-Az}.[Q7m4s", "4`X9E,L^#\b\t^", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr~\u0011lh9\u0006G5R\u0006+CSRA\\?rK\u001f\u001cc\u001cN\u0001", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Marker.ErrorMessage formatFailedResponse(InitializeResponse.FailedInitializeResponse failResponse) {
            String string;
            Intrinsics.checkNotNullParameter(failResponse, "failResponse");
            Exception exception = failResponse.getException();
            Class<?> cls = exception == null ? null : exception.getClass();
            String str = "unknown";
            if (cls != null && (string = cls.toString()) != null) {
                str = string;
            }
            StringBuilder sbAppend = new StringBuilder().append(failResponse.getReason()).append(" : ");
            Exception exception2 = failResponse.getException();
            return new Marker.ErrorMessage(sbAppend.append((Object) (exception2 != null ? exception2.getMessage() : null)).toString(), str, null, 4, null);
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextType.valuesCustom().length];
            iArr[ContextType.INITIALIZE.ordinal()] = 1;
            iArr[ContextType.UPDATE_USER.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Diagnostics(boolean z2, Map<String, ? extends Object> statsigOptionsLoggingCopy) {
        Intrinsics.checkNotNullParameter(statsigOptionsLoggingCopy, "statsigOptionsLoggingCopy");
        this.isDisabled = z2;
        this.statsigOptionsLoggingCopy = statsigOptionsLoggingCopy;
        this.diagnosticsContext = ContextType.INITIALIZE;
        this.defaultMaxMarkers = 30;
        this.maxMarkers = MapsKt.mutableMapOf(TuplesKt.to(ContextType.INITIALIZE, Integer.valueOf(this.defaultMaxMarkers)), TuplesKt.to(ContextType.UPDATE_USER, Integer.valueOf(this.defaultMaxMarkers)));
        this.markers = new ConcurrentHashMap<>();
    }

    private final boolean addMarker(Marker marker, ContextType contextType) {
        if (contextType == null) {
            contextType = this.diagnosticsContext;
        }
        int i2 = this.defaultMaxMarkers;
        ConcurrentLinkedQueue<Marker> concurrentLinkedQueue = this.markers.get(contextType);
        if (i2 <= (concurrentLinkedQueue == null ? 0 : concurrentLinkedQueue.size())) {
            return false;
        }
        if (this.markers.get(contextType) == null) {
            this.markers.put(contextType, new ConcurrentLinkedQueue<>());
        }
        ConcurrentLinkedQueue<Marker> concurrentLinkedQueue2 = this.markers.get(contextType);
        if (concurrentLinkedQueue2 != null) {
            concurrentLinkedQueue2.add(marker);
        }
        this.markers.values();
        return true;
    }

    static /* synthetic */ boolean addMarker$default(Diagnostics diagnostics, Marker marker, ContextType contextType, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            contextType = null;
        }
        return diagnostics.addMarker(marker, contextType);
    }

    public static /* synthetic */ void clearContext$default(Diagnostics diagnostics, ContextType contextType, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            contextType = null;
        }
        diagnostics.clearContext(contextType);
    }

    public static /* synthetic */ Queue getMarkers$default(Diagnostics diagnostics, ContextType contextType, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            contextType = null;
        }
        return diagnostics.getMarkers(contextType);
    }

    public static /* synthetic */ boolean markEnd$default(Diagnostics diagnostics, KeyType keyType, boolean z2, StepType stepType, Marker marker, ContextType contextType, int i2, Object obj) {
        Marker marker2 = marker;
        StepType stepType2 = stepType;
        if ((4 & i2) != 0) {
            stepType2 = null;
        }
        if ((8 & i2) != 0) {
            marker2 = null;
        }
        return diagnostics.markEnd(keyType, z2, stepType2, marker2, (i2 + 16) - (i2 | 16) == 0 ? contextType : null);
    }

    public static /* synthetic */ boolean markStart$default(Diagnostics diagnostics, KeyType keyType, StepType stepType, Marker marker, ContextType contextType, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            stepType = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            marker = null;
        }
        if ((i2 & 8) != 0) {
            contextType = null;
        }
        return diagnostics.markStart(keyType, stepType, marker, contextType);
    }

    public final void clearContext(ContextType contextType) {
        ConcurrentHashMap<ContextType, ConcurrentLinkedQueue<Marker>> concurrentHashMap = this.markers;
        if (contextType == null) {
            contextType = this.diagnosticsContext;
        }
        concurrentHashMap.put(contextType, new ConcurrentLinkedQueue<>());
    }

    public final ContextType getDiagnosticsContext() {
        return this.diagnosticsContext;
    }

    public final Queue<Marker> getMarkers(ContextType contextType) {
        ConcurrentHashMap<ContextType, ConcurrentLinkedQueue<Marker>> concurrentHashMap = this.markers;
        if (contextType == null) {
            contextType = this.diagnosticsContext;
        }
        ConcurrentLinkedQueue<Marker> concurrentLinkedQueue = concurrentHashMap.get(contextType);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        }
        return concurrentLinkedQueue;
    }

    public final Map<String, Object> getStatsigOptionsLoggingCopy() {
        return this.statsigOptionsLoggingCopy;
    }

    public final boolean markEnd(KeyType key, boolean z2, StepType stepType, Marker marker, ContextType contextType) {
        ContextType contextType2 = contextType;
        Intrinsics.checkNotNullParameter(key, "key");
        if (contextType2 == null) {
            contextType2 = this.diagnosticsContext;
        }
        int i2 = this.defaultMaxMarkers;
        ConcurrentLinkedQueue<Marker> concurrentLinkedQueue = this.markers.get(contextType2);
        if (i2 < (concurrentLinkedQueue == null ? 0 : concurrentLinkedQueue.size())) {
            return false;
        }
        Marker marker2 = new Marker(key, ActionType.END, Double.valueOf(System.nanoTime() / 1000000.0d), stepType, null, Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048528, null);
        int i3 = WhenMappings.$EnumSwitchMapping$0[contextType2.ordinal()];
        if (i3 == 1 || i3 == 2) {
            marker2.setEvaluationDetails(marker == null ? null : marker.getEvaluationDetails());
            marker2.setAttempt(marker == null ? null : marker.getAttempt());
            marker2.setSdkRegion(marker == null ? null : marker.getSdkRegion());
            marker2.setStatusCode(marker == null ? null : marker.getStatusCode());
            marker2.setError(marker == null ? null : marker.getError());
        }
        if (stepType == StepType.NETWORK_REQUEST) {
            marker2.setHasNetwork(marker != null ? marker.getHasNetwork() : null);
        }
        return addMarker(marker2, contextType2);
    }

    public final boolean markStart(KeyType key, StepType stepType, Marker marker, ContextType contextType) {
        ContextType contextType2 = contextType;
        Intrinsics.checkNotNullParameter(key, "key");
        if (contextType2 == null) {
            contextType2 = this.diagnosticsContext;
        }
        int i2 = this.defaultMaxMarkers;
        ConcurrentLinkedQueue<Marker> concurrentLinkedQueue = this.markers.get(contextType2);
        if (i2 < (concurrentLinkedQueue == null ? 0 : concurrentLinkedQueue.size())) {
            return false;
        }
        Marker marker2 = new Marker(key, ActionType.START, Double.valueOf(System.nanoTime() / 1000000.0d), stepType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048560, null);
        int i3 = WhenMappings.$EnumSwitchMapping$0[contextType2.ordinal()];
        if ((i3 == 1 || i3 == 2) && key == KeyType.INITIALIZE && stepType == StepType.NETWORK_REQUEST) {
            marker2.setAttempt(marker == null ? null : marker.getAttempt());
        }
        Diagnostics diagnostics = this;
        return diagnostics.addMarker(marker2, contextType2);
    }

    public final void setDiagnosticsContext(ContextType contextType) {
        Intrinsics.checkNotNullParameter(contextType, "<set-?>");
        this.diagnosticsContext = contextType;
    }
}
