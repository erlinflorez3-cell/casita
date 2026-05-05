package com.facebook.react.uimanager.events;

import com.facebook.common.logging.FLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN/ZS@\u000fs{:%c$\u007fIC٥\"}8\tWN}gvJ`\u000eYƤ$+)jZH\u000ewrR\u00148BņC3[o\u0006GnuN\u0005N4R<\b\b\u0019\u001aXLV\u000bCQY\u0011*0nrjV\u001bP\u001d\u001a@\f\u00054I$jnf6vn$Nw5\u0011qZNUa`\u0005[\u0016^X7\r|bL5\u0007K}\u001b3^\u001b\u0007\u0001]\u0006\u0017\b\bK\u0011\u0001'U-yweCp\u007fB#[S\u001bl\u000b&\u000b\u0015\u0018tT=9[{K~\u0010X{\t\t%<2\u001c6+V=E\u001a\u0015\u0019TG=\u0001aRh\u0002\rD0~o9/%.7qMct_tS\u0019|9,\t\u001b!;\u0001\u001d'\"hVn#/lw\u007f3\u0002DKUf\n\bK4\u0018\u0378f\u0018"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000bT?9q\u0017(\u001chAJ\u0007l;-z5RH]*_R\u007f\u0013", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "u(E", "/cS\u000fT;<Vx\u0010zg;[\r=p{7yC\u0001\u0016}K}\u001d<\u007f%B", "", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000bIR9n\u0014/\u0015qp\u0018\u000bq7J\u0006%JLM\u0013``\u0002=\u001d\u0012gc", "/cS\u0019\\:MS\"~\b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[]+U[N5\\_H", "2hb=T;<Vt\u0006\u0002>=|\u0012>s", "2hb=T;<Vx\u0010zg;", "3uT;g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "=m2.g(Eg'\u000e^g:\f\u00058c\u007f\u0007{N\u0010$![o\r", "@dV6f;>`x\u0010zg;\\\u00113t\u000f(\t", "Ch<.a(@S&m\u000fi,", "", "3uT;g\fFW(\u000ezk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001b+2\u001b|4'$Hi=\u0016r,[L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u001b+2#u3\u001e\"qAJ\u0007l;.~+V[N92", "@d\\<i,\u001bO(|}>=|\u0012>D\u00046\u0007<\u0010\u0015\u001aGnt@\u000545b}-", "@d\\<i,%W'\u000ezg,\n", "Cma2Z0Lb\u0019\fZo,\u0006\u0018\u000fm\u00047\u000b@\u000e", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BlackHoleEventDispatcher implements EventDispatcher {
    public static final Companion Companion = new Companion(null);
    private static final EventDispatcher eventDispatcher = new BlackHoleEventDispatcher();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|*i'\nCiW`\u0003r\u0015]O\u007fg\u001dL1ŒEǇ\n\u0016\u0001̓\u0082MY"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000bT?9q\u0017(\u001chAJ\u0007l;-z5RH]*_R\u007f{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "5dc", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final EventDispatcher get() {
            return BlackHoleEventDispatcher.eventDispatcher;
        }
    }

    private BlackHoleEventDispatcher() {
    }

    @JvmStatic
    public static final EventDispatcher get() {
        return Companion.get();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(BatchEventDispatchedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(EventDispatcherListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event<?> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        FLog.d("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i2, RCTEventEmitter eventEmitter) {
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i2, RCTModernEventEmitter eventEmitter) {
        Intrinsics.checkNotNullParameter(eventEmitter, "eventEmitter");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(EventDispatcherListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void unregisterEventEmitter(int i2) {
    }
}
