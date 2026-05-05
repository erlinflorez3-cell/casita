package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007tpA0ZeP.hS2\u000f\u0002{<$q$yّCU(\u0005*\tUNog|hb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JoE3StSʠ~\tf\u0005N1Z7\u000eE\f*.V\u0010\u000fzqLë\u00160Nr\u0003n\u001bZ\u001d\"\"\bN /-rf|DxpkJG#1zrR5qH|{ \u0017\u001d5\u0010\u000f\u001e.-P7c\u001a5e\u0013\u0017b]O\u0003mxk\u000bQ-7-Ys\u0006=7\bB\u0019\u0014k\u001d_\u0003&\u000b\nar\u001c7;QsK~\u0015V}c\u0002\u001d>\u0014\u000e4.'6\f#=ڟ\u0010\u07baxr[ó!\u000elB\u0018z\u00107mӞ\u0002Ĵ/9#Ƙ\"mI#f7*\u0010c̗/ъr!c٪^l#'lw\u007f<(̸I˓R\naƝѐ\b\u0006"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u0010<\u00054Ef}.\u0001Z\u00169T?OM4,$xn9dm5_v4VL[\u0002", "", "2`c2C9Hd\u001d}zk", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\ndt'T|\u000eE\u0006\u00041h}\u000bDw'2LCHA", "uKX<\":>\\(\f\u000f(;\n\u00058s\u000b2\tOJztW|\u001b<\u007f4\u0014U\r \"z ?QB;x\na\u0006", "1ta?X5M>#\r~m0\u0007\u0012=", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCh\u0013\"\u001d", "", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ah^{f,Gb&\u0013Dk9\u000f\t,/l\u0015m@}z Vo\u001b8t49c\u0007\bA~\u0016\u000e^CDzr\t\u001fveH\u000bm5$", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u0005 \u001dGnp8\u0005(\u001dU\tu", ":`bA6(Ib)\fz]\u0014\u0007\u001a/E\u0011(\u0005O", "", "Bnd0[\u0014Hd\u0019[vl,\u0004\r8e", "1n]CX9M", "", "\u001ah^{f,Gb&\u0013Dk9\u000f\t,/l\u0015m@}z E|\u000eDv.DU\u0005\u000e@i!<PMJKE\u001e\u001ew7", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "@dR<e+>`v\t\u0004_0~", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "\u0011n\\=T5B]\"", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReplayGestureConverter {
    private static final int CAPTURE_MOVE_EVENT_THRESHOLD = 500;
    private static final int TOUCH_MOVE_DEBOUNCE_THRESHOLD = 50;
    private final LinkedHashMap<Integer, ArrayList<RRWebInteractionMoveEvent.Position>> currentPositions;
    private final ICurrentDateProvider dateProvider;
    private long lastCapturedMoveEvent;
    private long touchMoveBaseline;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈ƪ6F"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u0010<\u00054Ef}.\u0001Z\u00169T?OM4,$xn9dm5_v4VL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0011@?!H\u0019\u001eM\u0001hk>&\\y\u000fNn\"j#mv\u0005*Yt\u001b", "", "\"ND\u0010;&&=\n^t=\fYr\u001fN]\bu/c\u0004v5Rw#U", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReplayGestureConverter(ICurrentDateProvider dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.currentPositions = new LinkedHashMap<>(10);
    }

    public final List<RRWebIncrementalSnapshotEvent> convert(MotionEvent event, ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        int i2 = 10;
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
                    long j2 = this.lastCapturedMoveEvent;
                    if (j2 != 0 && j2 + ((long) 50) > currentTimeMillis) {
                        return null;
                    }
                    this.lastCapturedMoveEvent = currentTimeMillis;
                    Set<Integer> setKeySet = this.currentPositions.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "currentPositions.keys");
                    for (Integer pId : setKeySet) {
                        Intrinsics.checkNotNullExpressionValue(pId, "pId");
                        int iFindPointerIndex = event.findPointerIndex(pId.intValue());
                        if (iFindPointerIndex != -1) {
                            if (this.touchMoveBaseline == 0) {
                                this.touchMoveBaseline = currentTimeMillis;
                            }
                            ArrayList<RRWebInteractionMoveEvent.Position> arrayList = this.currentPositions.get(pId);
                            Intrinsics.checkNotNull(arrayList);
                            RRWebInteractionMoveEvent.Position position = new RRWebInteractionMoveEvent.Position();
                            position.setX(event.getX(iFindPointerIndex) * recorderConfig.getScaleFactorX());
                            position.setY(event.getY(iFindPointerIndex) * recorderConfig.getScaleFactorY());
                            position.setId(i3);
                            position.setTimeOffset(currentTimeMillis - this.touchMoveBaseline);
                            arrayList.add(position);
                        }
                        i3 = 0;
                    }
                    long j3 = currentTimeMillis - this.touchMoveBaseline;
                    if (j3 <= 500) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList(this.currentPositions.size());
                    for (Map.Entry<Integer, ArrayList<RRWebInteractionMoveEvent.Position>> entry : this.currentPositions.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        ArrayList<RRWebInteractionMoveEvent.Position> value = entry.getValue();
                        if (!value.isEmpty()) {
                            ArrayList arrayList3 = arrayList2;
                            RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
                            rRWebInteractionMoveEvent.setTimestamp(currentTimeMillis);
                            ArrayList<RRWebInteractionMoveEvent.Position> arrayList4 = value;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, i2));
                            for (RRWebInteractionMoveEvent.Position position2 : arrayList4) {
                                position2.setTimeOffset(position2.getTimeOffset() - j3);
                                arrayList5.add(position2);
                            }
                            rRWebInteractionMoveEvent.setPositions(arrayList5);
                            rRWebInteractionMoveEvent.setPointerId(iIntValue);
                            arrayList3.add(rRWebInteractionMoveEvent);
                            ArrayList<RRWebInteractionMoveEvent.Position> arrayList6 = this.currentPositions.get(Integer.valueOf(iIntValue));
                            Intrinsics.checkNotNull(arrayList6);
                            arrayList6.clear();
                            i2 = 10;
                        }
                    }
                    this.touchMoveBaseline = 0L;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    this.currentPositions.clear();
                    RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
                    rRWebInteractionEvent.setTimestamp(this.dateProvider.getCurrentTimeMillis());
                    rRWebInteractionEvent.setX(event.getX() * recorderConfig.getScaleFactorX());
                    rRWebInteractionEvent.setY(event.getY() * recorderConfig.getScaleFactorY());
                    rRWebInteractionEvent.setId(0);
                    rRWebInteractionEvent.setPointerId(0);
                    rRWebInteractionEvent.setInteractionType(RRWebInteractionEvent.InteractionType.TouchCancel);
                    return CollectionsKt.listOf(rRWebInteractionEvent);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int iFindPointerIndex2 = event.findPointerIndex(pointerId);
            if (iFindPointerIndex2 == -1) {
                return null;
            }
            this.currentPositions.remove(Integer.valueOf(pointerId));
            RRWebInteractionEvent rRWebInteractionEvent2 = new RRWebInteractionEvent();
            rRWebInteractionEvent2.setTimestamp(this.dateProvider.getCurrentTimeMillis());
            rRWebInteractionEvent2.setX(event.getX(iFindPointerIndex2) * recorderConfig.getScaleFactorX());
            rRWebInteractionEvent2.setY(event.getY(iFindPointerIndex2) * recorderConfig.getScaleFactorY());
            rRWebInteractionEvent2.setId(0);
            rRWebInteractionEvent2.setPointerId(pointerId);
            rRWebInteractionEvent2.setInteractionType(RRWebInteractionEvent.InteractionType.TouchEnd);
            return CollectionsKt.listOf(rRWebInteractionEvent2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int iFindPointerIndex3 = event.findPointerIndex(pointerId2);
        if (iFindPointerIndex3 == -1) {
            return null;
        }
        this.currentPositions.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        RRWebInteractionEvent rRWebInteractionEvent3 = new RRWebInteractionEvent();
        rRWebInteractionEvent3.setTimestamp(this.dateProvider.getCurrentTimeMillis());
        rRWebInteractionEvent3.setX(event.getX(iFindPointerIndex3) * recorderConfig.getScaleFactorX());
        rRWebInteractionEvent3.setY(event.getY(iFindPointerIndex3) * recorderConfig.getScaleFactorY());
        rRWebInteractionEvent3.setId(0);
        rRWebInteractionEvent3.setPointerId(pointerId2);
        rRWebInteractionEvent3.setInteractionType(RRWebInteractionEvent.InteractionType.TouchStart);
        return CollectionsKt.listOf(rRWebInteractionEvent3);
    }
}
