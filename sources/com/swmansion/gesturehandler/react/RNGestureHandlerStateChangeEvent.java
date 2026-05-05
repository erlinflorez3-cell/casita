package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.react.eventbuilders.GestureHandlerEventDataBuilder;
import io.sentry.protocol.SentryThread;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007f\u0007ljA0RnP\u008cZS8\u0017sڔ<$q$yّCU(\n*ޛWNugvϺb\u000bY\u000f\u000e\u0016~mBկs\u000e\u000e\u0018\u001f4Rom\u074c{nu8u5;\u000b ݨ&8\b\u0005I 8N(v)J\u0012 Z6NxRR;VK.Z\fL*\u0019\u001e\u000br\u0015H\u0011rkFG#1v\tbo!>\u000be\rtcG\u0019|ѭ,;h=E\u00175SI\u0017\u0001lo\u0007M\u0004U\u0005/7W/Wvo6\u0007\u0004D\u00199T%]!*\r\u000f_a$-;QsK\u0017\u001eVyA{Ɂ@\u0004\u001c\u0019oN<A2f6\u001dy\tCeNQ\u001adR\u007f\u0001bL\u0016S\u0002\nڂEӸjQiݢiZE~\u001d\rL'W͜-ƟX\u000ehٽk`\u0006VIQnA\u001fݓ\u0016ՒAm\f͏Đ\u0006@"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[d6C[N\n_N{?\u0014qk\u000eW:b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "u(E", "2`c.5<BZ\u0018~\b", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000eN\u00056WYN\u000fX[qD\u0014\u001f:\u001fN4\u001ccUP KT;&\u0007,VW", "<df g(MS", "", "=kS g(MS", "1`]\u0010b(ES'|z", "", "5dc\u0010b(ES'|~g.b\tC", "", "5dc\u0012i,Gbwz\nZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "5dc\u0012i,Gb\u0002z\u0003^", "", "7mXA", "", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,K", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00022Z\u000eEVVujdz9\u001d ^\u0018Wt\u000f\u0005gP4{D:\u001b\u0011+P\u0002H2\u000e\f\u0012\fD4pSV\u0019Vv%yH(hSg)[GOTr7dn[&[A:1s\u0003\u0019$w/*\u0019w0!vYxgt\u001d\\k", "=m36f7Ha\u0019", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerStateChangeEvent extends Event<RNGestureHandlerStateChangeEvent> {
    public static final Companion Companion = new Companion(null);
    private static final Pools.SynchronizedPool<RNGestureHandlerStateChangeEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(7);
    public static final String EVENT_NAME = "onGestureHandlerStateChange";
    private static final int TOUCH_EVENTS_POOL_SIZE = 7;
    private GestureHandlerEventDataBuilder<?> dataBuilder;
    private int newState;
    private int oldState;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tvAӄLeV4Zݷ2\u000f\u0002{<řc$\bCCU \u007f*\teNogtK`ŖD%إFx\u0019+\nZ~]ܫ\u00132Po\bS[wU9\u000f}f\r.<:<\n\u0005\u0007\u001bXS@z\tOc\f@7ptH_%M3!ZEL.\u0019\u001e\u000bjnBNǍkIW)\u0013kRNmn^\r}\u0011Te?\r=pN/NCM\u0015SZ3\u000b`hW\u0003mxm\u000fv1?1Yug6\u001f\u000fB ۣS\rk\u0005vn\u0013Rx\u00127-_cyS<*N߁}Ɂ@\u0004\u0016ͺwT<12f6\u0013\nφEՂDP\nމ\u0013\f\tgN\u0017S\u0007\nڂ\fӸjQiݢϳRJ"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[d6C[N\n_N{?\u0014qk\u000eW:KbcI/jM;)\u0011\u0002", "", "u(E", "\u0013U4\u001bG\u001a8>\u0003ha", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[d6C[N\n_N{?\u0014qk\u000eW:b", "\u0013U4\u001bG&'/\u0001^", "", "\"ND\u0010;&\u001eDxgiL&gr\u0019Ly\u0016_5`", "", "1qT.g,\u001ed\u0019\b\n=(\f\u0005", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "2`c.5<BZ\u0018~\b", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000eN\u00056WYN\u000fX[qD\u0014\u001f:\u001fN4\u001ccUP KT;&\u0007,VW", "<df g(MS", "=kS g(MS", "=ac.\\5", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,K", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00022Z\u000eEVVujdz9\u001d ^\u0018Wt\u000f\u0005gP4{D:\u001b\u0011+P\u0002H2\u000e\f\u0012\fD4pSV\u0019Vv%yH(hSg)[GOTr7dn[&[A:1s\u0003\u0019$w/*\u0019w0!vYxgt\u001d\\a6.F7iXMk^Jx1(\u0015}w Ah\u0002+w)\r316qNXg\u0014<mB\u0002\u0015>A55FI\u0013\"Glts>\u001bV.]\u0017\u000e@8-\"geCY\u000f\u0010ll", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WritableMap createEventData(GestureHandlerEventDataBuilder<?> dataBuilder, int i2, int i3) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNull(writableMapCreateMap);
            dataBuilder.buildEventData(writableMapCreateMap);
            writableMapCreateMap.putInt(SentryThread.JsonKeys.STATE, i2);
            writableMapCreateMap.putInt("oldState", i3);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final <T extends GestureHandler<T>> RNGestureHandlerStateChangeEvent obtain(T handler, int i2, int i3, GestureHandlerEventDataBuilder<T> dataBuilder) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            RNGestureHandlerStateChangeEvent rNGestureHandlerStateChangeEvent = (RNGestureHandlerStateChangeEvent) RNGestureHandlerStateChangeEvent.EVENTS_POOL.acquire();
            if (rNGestureHandlerStateChangeEvent == null) {
                rNGestureHandlerStateChangeEvent = new RNGestureHandlerStateChangeEvent(null);
            }
            rNGestureHandlerStateChangeEvent.init(handler, i2, i3, dataBuilder);
            return rNGestureHandlerStateChangeEvent;
        }
    }

    private RNGestureHandlerStateChangeEvent() {
    }

    public /* synthetic */ RNGestureHandlerStateChangeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends GestureHandler<T>> void init(T t2, int i2, int i3, GestureHandlerEventDataBuilder<T> gestureHandlerEventDataBuilder) {
        View view = t2.getView();
        Intrinsics.checkNotNull(view);
        super.init(UIManagerHelper.getSurfaceId(view), view.getId());
        this.dataBuilder = gestureHandlerEventDataBuilder;
        this.newState = i2;
        this.oldState = i3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        Companion companion = Companion;
        GestureHandlerEventDataBuilder<?> gestureHandlerEventDataBuilder = this.dataBuilder;
        Intrinsics.checkNotNull(gestureHandlerEventDataBuilder);
        return companion.createEventData(gestureHandlerEventDataBuilder, this.newState, this.oldState);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.dataBuilder = null;
        this.newState = 0;
        this.oldState = 0;
        EVENTS_POOL.release(this);
    }
}
