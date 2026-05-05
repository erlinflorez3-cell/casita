package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.react.eventbuilders.GestureHandlerEventDataBuilder;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00136Ȑ\u0007\"B\u0012\u007fјnjG9LeN/ZS@\u000fsڔ<$i0yّCU(}*ޛWN}gvJ`\u000fYƤ$+)p<Kex\f܈=1znTsRu=˃dtD\u0005h80?\u0012\u0005/ p\\X|\tKc\f@2\u0007\u0005\u0003X\u001bV\u001d\u001a@\u0010\u00052I$jrf6vx$Nw\\\u0011vZNUmP\tSεTcO\u0013\u0007c.+\u0007Fc%UW\u0011\u0018j[\u0006\u0012o{K\b\u0001-7-Ys\u001eE\u0007\u0004D\u00199a%]!,#\u0005Ōd\f5>\u0018iYd&(&\tB!\r\u0010\u001c\u0007?H\\/pǔ\u0014ԧ7tzԟ\u0011b\u0010aZ\u0006\u000ba<\u0018;~a/\u0010ӘrЂe;!\u05cb\b\b\u0013\u00126#/twſ`\u05f8d\u0015#ƘɖUG"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[V8GU]\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "u(E", "1nP9X:<W\"\u0001`^@", "", "2`c.5<BZ\u0018~\b", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000eN\u00056WYN\u000fX[qD\u0014\u001f:\u001fN4\u001ccUP KT;&\u0007,VW", "CrT!b7)`\u0019\u007f~q,{q+m\u007f", "", "1`]\u0010b(ES'|z", "5dc\u0010b(ES'|~g.b\tC", "5dc\u0012i,Gbwz\nZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "5dc\u0012i,Gb\u0002z\u0003^", "", "7mXA", "", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,K", "CrT\u001bT;Bd\u0019Z\u0004b4x\u0018/dh$\u0004@", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00025t1O\u0016\\>dN{K\u0018\u001ccWP+\u001b\u0014iN$q@@\u001e\u000f,VKHh|\n%W5{pKe\rW}\u001ctA6v\u0010;_\bVQRb\r`\u0015^$\\G\u001a5\u0014z(yd_*f\fW\u0018qR\u0007=\\\u000b\n", "=m36f7Ha\u0019", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNGestureHandlerEvent extends Event<RNGestureHandlerEvent> {
    public static final Companion Companion = new Companion(null);
    private static final Pools.SynchronizedPool<RNGestureHandlerEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(7);
    public static final String EVENT_NAME = "onGestureHandlerEvent";
    public static final String NATIVE_ANIMATED_EVENT_NAME = "topGestureHandlerEvent";
    private static final int TOUCH_EVENTS_POOL_SIZE = 7;
    private short coalescingKey;
    private GestureHandlerEventDataBuilder<?> dataBuilder;
    private boolean useTopPrefixedName;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tvA0JeP.`Y2şs{J$cҕyCQU\"}(\tWN}gvJ`\u000bK\u000f\u0014\u001f\u0001j2I[ޓ^(ƁbB\u001e>sRu=˃dtD\u0005hB0A\u0012\u0005/$ZP\u001e\u0002\u0013G[\f\u00181n|\u0003\f\u001bZ\u001d\u001a@\t^,\u0007Ȧjuv<Xnm:u11xrR5oH|\u0014\u001bv^5\u0018\u000fg.-P7{#S_3\rX[M\u0014Wqk\u0017ص+'9\\DiDY\u0018\u001a%-_\r\fuT^[ĬbВ++WҪ\u001c\\\u001c,\u0010z*\u0012\u0013ǐ`Ν+H6Ʀjr\u0016\u0014Kt!X\u0017ЗTެF\u007f\u0003ʨ\u0007#3\u0007K+g#=Ϣ4ޅ\u001dN?ަ̅\u00112"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[V8GU]j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0013U4\u001bG\u001a8>\u0003ha", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[V8GU]\u0002", "\u0013U4\u001bG&'/\u0001^", "", "\u001c@C\u0016I\f8/\u0002bb:\u001b\\g)Ep\bd/z\u007fr/O", "\"ND\u0010;&\u001eDxgiL&gr\u0019Ly\u0016_5`", "", "1qT.g,\u001ed\u0019\b\n=(\f\u0005", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "2`c.5<BZ\u0018~\b", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000eN\u00056WYN\u000fX[qD\u0014\u001f:\u001fN4\u001ccUP KT;&\u0007,VW", "=ac.\\5", "\"", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "6`]1_,K", "CrT!b7)`\u0019\u007f~q,{q+m\u007f", "", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00025t1O\u0016\\>dN{K\u0018\u001ccWP+\u001b\u0014iN$q@@\u001e\u000f,VKHh|\n%W5{pKe\rW}\u001ctA6v\u0010;_\bVQRb\r`\u0015^$\\G\u001a5\u0014z(yd_*f\fW\u0018qR\u0007=\\\u000b\u007fxB,\b{mNAxc@~0hM{\u0006!Bet.p6\u0003;*C.\u0012Kc\u0016M(e}\u000e\\O66C<u;Tb|lKmy\u001fj\u0017c", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RNGestureHandlerEvent obtain$default(Companion companion, GestureHandler gestureHandler, GestureHandlerEventDataBuilder gestureHandlerEventDataBuilder, boolean z2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return companion.obtain(gestureHandler, gestureHandlerEventDataBuilder, z2);
        }

        public final WritableMap createEventData(GestureHandlerEventDataBuilder<?> dataBuilder) {
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNull(writableMapCreateMap);
            dataBuilder.buildEventData(writableMapCreateMap);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }

        public final <T extends GestureHandler<T>> RNGestureHandlerEvent obtain(T handler, GestureHandlerEventDataBuilder<T> dataBuilder, boolean z2) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(dataBuilder, "dataBuilder");
            RNGestureHandlerEvent rNGestureHandlerEvent = (RNGestureHandlerEvent) RNGestureHandlerEvent.EVENTS_POOL.acquire();
            if (rNGestureHandlerEvent == null) {
                rNGestureHandlerEvent = new RNGestureHandlerEvent(null);
            }
            rNGestureHandlerEvent.init(handler, dataBuilder, z2);
            return rNGestureHandlerEvent;
        }
    }

    private RNGestureHandlerEvent() {
    }

    public /* synthetic */ RNGestureHandlerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends GestureHandler<T>> void init(T t2, GestureHandlerEventDataBuilder<T> gestureHandlerEventDataBuilder, boolean z2) {
        View view = t2.getView();
        Intrinsics.checkNotNull(view);
        super.init(UIManagerHelper.getSurfaceId(view), view.getId());
        this.dataBuilder = gestureHandlerEventDataBuilder;
        this.useTopPrefixedName = z2;
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
        Companion companion = Companion;
        GestureHandlerEventDataBuilder<?> gestureHandlerEventDataBuilder = this.dataBuilder;
        Intrinsics.checkNotNull(gestureHandlerEventDataBuilder);
        return companion.createEventData(gestureHandlerEventDataBuilder);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.useTopPrefixedName ? NATIVE_ANIMATED_EVENT_NAME : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.dataBuilder = null;
        EVENTS_POOL.release(this);
    }
}
