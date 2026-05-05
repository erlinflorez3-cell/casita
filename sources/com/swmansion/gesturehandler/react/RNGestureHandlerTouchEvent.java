package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.core.GestureHandler;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebInteractionEvent;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00136Ȑ\u0007\"B\u0012\u007fјnjG9LeN/ZS8\u001bsڔ<$i$yّCU0}*\tUQ}˧\r\\\u000b\u0011S\u0011\u0016\u0016'̓ZH\u000ewoR\u00148BņC3[o\u0006?nyN\u0005N8hLB\u000b\u000f!BH>xAW\u0014\u0014 8XrPQ;QK,Z\fL)\u0019\u001e\u000bq\u0015J\u0011\u0010kEG#1ubZ-ڿ>\nu\u0013VV7\r=nL9p;C$=SI\u0014\u0019[ύ\u0007?\u007fMMn58CI\"c|lP #,g\r\ft|؛\u0011Ōd\f/˃ qYS&*\u000ey*\u0011\u0013ǌ\u001aΝ+H6Ʀըj\u001b"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[e1WJQ\fmR{Li", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "u(E", "1nP9X:<W\"\u0001`^@", "", "3wc?T\u000b:b\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "1`]\u0010b(ES'|z", "", "5dc\u0010b(ES'|~g.b\tC", "5dc\u0012i,Gbwz\nZ", "5dc\u0012i,Gb\u0002z\u0003^", "", "7mXA", "", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,K", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012g", "=m36f7Ha\u0019", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerTouchEvent extends Event<RNGestureHandlerTouchEvent> {
    public static final Companion Companion = new Companion(null);
    private static final Pools.SynchronizedPool<RNGestureHandlerTouchEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(7);
    public static final String EVENT_NAME = "onGestureHandlerEvent";
    public static final int EVENT_TOUCH_CANCELLED = 4;
    public static final int EVENT_TOUCH_DOWN = 1;
    public static final int EVENT_TOUCH_MOVE = 2;
    public static final int EVENT_TOUCH_UP = 3;
    public static final int EVENT_UNDETERMINED = 0;
    private static final int TOUCH_EVENTS_POOL_SIZE = 7;
    private short coalescingKey;
    private WritableMap extraData;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tvAӄLeV4ZS0\u0013s{J$cҕyCQU\"}(\fUȥh}ñzZ9BO\u000b\u001cx̶0Icx&3\u001d?ZomAm{Cʠn\u0004^\u000b0428@\u0014/*ZL\u001e\b\u0013C\u0012\u001bܘ4@~L\u001b.[\u00182\u00124A@\r$ձu]^N|_J/i\u0012\u0018R~+mA\u0015MSUù+\r\u0005un=N8M\u001b5U\u0013\u0007\u0001^m\u0005\u0016п?ݾl'/Ǣ\u001a\u007fe:p\u007fB\u001a\u0002̄_ǁv&dӤ\"l\u001a-CO\u0012R'ʲzÞ~{\u0015ɝT\u001a\u0014/`.[!=ڣ`\u07baxr[ó!\u000elK\u0018z\u0010=mӢRĴ/9#Ƙ\"mI#f7*\fc̛uъr!c٪^l#&lw\u007f8(̼\u0010˓R\naƝ>\u0010~n\u001a*27\u001eČ\u0002ɨ\u0015.\u001f¦ۄ_N"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[e1WJQ\fmR{LRod\u0016Y'\u0016\tcJy", "", "u(E", "\u0013U4\u001bG\u001a8>\u0003ha", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[e1WJQ\fmR{Li", "\u0013U4\u001bG&'/\u0001^", "", "\u0013U4\u001bG&-=\t\\]X\nXq\rEf\u000f[\u001f", "", "\u0013U4\u001bG&-=\t\\]X\u000bfz\u0018", "\u0013U4\u001bG&-=\t\\]X\u0014fy\u000f", "\u0013U4\u001bG&-=\t\\]X\u001cg", "\u0013U4\u001bG&.<w^i>\u0019dl\u0018E^", "\"ND\u0010;&\u001eDxgiL&gr\u0019Ly\u0016_5`", "1qT.g,\u001ed\u0019\b\n=(\f\u0005", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,K", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012]%QT\u0018-XPr:\u001e\u001c`W[+\t\u0003h\u000b!{H6!\bu;\u000f?w|\t\u001d\u000e\u001df{\u0018", "=ac.\\5", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0002\u0012]%QT\u0018:nZnF\"\u0016d\u0017\u0018-\r\u0013hQ1nG3(\u00073I\u000f\u0005u\u0001\b\u0014\u001d~WY$V\u001eV\n\"u$%qE`_\u00076KU`-D\u001d_&k\u0010", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends GestureHandler<T>> WritableMap createEventData(T handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("handlerTag", handler.getTag());
            writableMapCreateMap.putInt(SentryThread.JsonKeys.STATE, handler.getState());
            writableMapCreateMap.putInt("numberOfTouches", handler.getTrackedPointersCount());
            writableMapCreateMap.putInt("eventType", handler.getTouchEventType());
            writableMapCreateMap.putInt(RRWebInteractionEvent.JsonKeys.POINTER_TYPE, handler.getPointerType());
            WritableArray writableArrayConsumeChangedTouchesPayload = handler.consumeChangedTouchesPayload();
            if (writableArrayConsumeChangedTouchesPayload != null) {
                writableMapCreateMap.putArray("changedTouches", writableArrayConsumeChangedTouchesPayload);
            }
            WritableArray writableArrayConsumeAllTouchesPayload = handler.consumeAllTouchesPayload();
            if (writableArrayConsumeAllTouchesPayload != null) {
                writableMapCreateMap.putArray("allTouches", writableArrayConsumeAllTouchesPayload);
            }
            if (handler.isAwaiting() && handler.getState() == 4) {
                writableMapCreateMap.putInt(SentryThread.JsonKeys.STATE, 2);
            }
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final <T extends GestureHandler<T>> RNGestureHandlerTouchEvent obtain(T handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RNGestureHandlerTouchEvent rNGestureHandlerTouchEvent = (RNGestureHandlerTouchEvent) RNGestureHandlerTouchEvent.EVENTS_POOL.acquire();
            if (rNGestureHandlerTouchEvent == null) {
                rNGestureHandlerTouchEvent = new RNGestureHandlerTouchEvent(null);
            }
            rNGestureHandlerTouchEvent.init(handler);
            return rNGestureHandlerTouchEvent;
        }
    }

    private RNGestureHandlerTouchEvent() {
    }

    public /* synthetic */ RNGestureHandlerTouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void init(T t2) {
        View view = t2.getView();
        Intrinsics.checkNotNull(view);
        super.init(UIManagerHelper.getSurfaceId(view), view.getId());
        this.extraData = Companion.createEventData(t2);
        this.coalescingKey = t2.getEventCoalescingKey();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return this.extraData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.extraData = null;
        EVENTS_POOL.release(this);
    }
}
