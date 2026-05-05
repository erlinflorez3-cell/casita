package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.ChoreographerProvider;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":!\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<$a%yCI^\"Ԃ*\t]To˧vJh\u000bK\u000f\f\u0016\u0001jBI]xc\u0016%˰`\to3{nu9x\u000ev\u0012&22<\b\u0005\u0019\u001aXIǘzzQMT\u0018>P\t:\u0001\u001e\u0014\u0005b&\u0014P8\u0001Lm\u0018RD[\u0005]hCS\u0007wWf'\u000e6ES\u001b\\l';\b(\u001esVEL-%\u0002\u00147ViR\u001b? Q5n52CK\nVd^P.#.g\u0019mz6b\u0015Sp\fU1}hyTdߍyߡ\u007f\u000fD\u0004\u001c\rwX<52h\u001e\ra}IԢLг\u0006`J\u007f\u0001k\u0007#3\u000bK+g!=Ϣcޅ\u001dN?ަU\u001d,/\u0019nOh\u000b\u000e\u001f\u0015qƜ\u0004Φ5QH׀\u0019Z\u0018gUm2\u007f9̦6˙4G\b\u07fcɮ\u0015H"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\r7i\u0014=+FEx4(\u0017u]D\nc9$", "", "1g^?X6@`\u0015\n}^9g\u00169v\u0004'{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u00038c\u000b Ao#*XF;x\u001f+\u001fye8\u0007p\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0005 &G|\u00178}n\u0013\\\b-7w\u0018;IN>kA\t\"rr=\u0006c9$:\u0018", "1`[9U(<Y\u0005\u000fzn,\u000b", "", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CD\u007f4\f@V", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", ")KY.i(\bc(\u0003\u0002(\b\n\u0016+y^(\bP\u0001l", "1g^?X6@`\u0015\n}^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u00038c\u000b Ao#*XF;x\u001f+\u001fye8\u0007pj,y1TLX.iN}@\u0014\u001f0", "1g^?X6@`\u0015\n}^9;T", "4qP:X\n:Z {v\\2", "6`b\u001db:MS\u0018\\ve3y\u0005-k", "", "Bnc._\n:Z {v\\2\u000b", "", ";`h/X\u0019>[#\u0010z?9x\u0011/C{/\u0003=|\u0015\u001d", "", ">nbA99:[\u0019\\ve3y\u0005-k", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\r7i\u0014=+FEx4(\u0017u]D\nc9\rT#NSK(ZXaQ\u001f\u00120", "1`[9U(<Y", ">nbA99:[\u0019\\ve3y\u0005-ki1YC\u000b$\u0017Qq\u001b8\u0002(5f", "@d\\<i,\u001f`\u0015\u0007z<(\u0004\u0010,a}.", "\u0011`[9U(<Y\b\u0013\u0006^", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactChoreographer {
    public static final Companion Companion = new Companion(null);
    private static ReactChoreographer choreographer = null;
    private final ArrayDeque<Choreographer.FrameCallback>[] callbackQueues;
    private ChoreographerProvider.Choreographer choreographer$1;
    private final Choreographer.FrameCallback frameCallback;
    private boolean hasPostedCallback;
    private int totalCallbacks;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eRLш|\u0004O\f8\u000b4I\u0005ӳܧ\u0012\u000eј\u0017pI2Tev\u008c\u0001Rj\u001cq{D(i$\nCiV۟\u0002\"\u0017Q\u001fyunbZ9Deئ\u0018ѱn2Qǁ\u0011_\u0018\u0012@FX?9RX=?f]6\u000b'\u001b\">\u0002m\u0001 3У\u0014\u0001"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\r7i\u0014=+FEx4(\u0017u]D\nc9\rT#NSK(ZXaQ\u001f\u00120", "", "=qS2e", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_$D\b", "5dc\u001ce+>`WkzZ*\fd8d\r2\u007f?z$\u0017No\nJv", "u(8", "\u001eDA\u0013R\u0014\u001a@~^gL", "\u0012HB\u001d4\u001b\u001c6\u0013n^", "\u001c@C\u0016I\f8/\u0002bb:\u001b\\g)Mi\u0007k'`", "\"H<\u0012E\u001a83\n^cM\u001a", "\u0017C;\u0012R\f/3\u0002m", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class CallbackType extends Enum<CallbackType> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallbackType[] $VALUES;
        private final int order;
        public static final CallbackType PERF_MARKERS = new CallbackType("PERF_MARKERS", 0, 0);
        public static final CallbackType DISPATCH_UI = new CallbackType("DISPATCH_UI", 1, 1);
        public static final CallbackType NATIVE_ANIMATED_MODULE = new CallbackType("NATIVE_ANIMATED_MODULE", 2, 2);
        public static final CallbackType TIMERS_EVENTS = new CallbackType("TIMERS_EVENTS", 3, 3);
        public static final CallbackType IDLE_EVENT = new CallbackType("IDLE_EVENT", 4, 4);

        private static final /* synthetic */ CallbackType[] $values() {
            return new CallbackType[]{PERF_MARKERS, DISPATCH_UI, NATIVE_ANIMATED_MODULE, TIMERS_EVENTS, IDLE_EVENT};
        }

        static {
            CallbackType[] callbackTypeArr$values = $values();
            $VALUES = callbackTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(callbackTypeArr$values);
        }

        private CallbackType(String str, int i2, int i3) {
            super(str, i2);
            this.order = i3;
        }

        public static EnumEntries<CallbackType> getEntries() {
            return $ENTRIES;
        }

        public static CallbackType valueOf(String str) {
            return (CallbackType) Enum.valueOf(CallbackType.class, str);
        }

        public static CallbackType[] values() {
            return (CallbackType[]) $VALUES.clone();
        }

        public final int getOrder$ReactAndroid_release() {
            return this.order;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XU0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0m|Mr\u000bq\u0011L\u001bAx:Mmx\f\u0017?6PuW3{v\u0004>)\fD\r8487(\u00071 8Q(x\u0011By\u000eX/Ϯt:X\u0017\u001e\u0013(\u0013\u001e@6\u007fL^>ޱBՂp]Bǂݳ\u0007t"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\r7i\u0014=+FEx4(\u0017u]D\nc9\rT1OWJ5`\\{\u0013", "", "u(E", "1g^?X6@`\u0015\n}^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\r7i\u0014=+FEx4(\u0017u]D\nc9$", "5dc\u0016a:MO\"|z", "7mXA\\(EW.~", "", "1g^?X6@`\u0015\n}^9g\u00169v\u0004'{M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tx\nC@\u00038c\u000b Ao#*XF;x\u001f+\u001fye8\u0007p\u0002", "=uT?e0=S|\b\tm(\u0006\u0007/F\n5j@\u000f&", "7mbAT5<S", "=uT?e0=S|\b\tm(\u0006\u0007/F\n5j@\u000f&U4o\n:\u0006\u0001>X\u000b*;l\u0010;MJ;gB\u001e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ReactChoreographer getInstance() {
            ReactChoreographer reactChoreographer = ReactChoreographer.choreographer;
            if (reactChoreographer != null) {
                return reactChoreographer;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.".toString());
        }

        @JvmStatic
        public final void initialize(ChoreographerProvider choreographerProvider) {
            Intrinsics.checkNotNullParameter(choreographerProvider, "choreographerProvider");
            if (ReactChoreographer.choreographer == null) {
                ReactChoreographer.choreographer = new ReactChoreographer(choreographerProvider, null);
            }
        }

        @VisibleForTesting
        public final ReactChoreographer overrideInstanceForTest$ReactAndroid_release(ReactChoreographer reactChoreographer) {
            ReactChoreographer reactChoreographer2 = ReactChoreographer.choreographer;
            Companion companion = ReactChoreographer.Companion;
            ReactChoreographer.choreographer = reactChoreographer;
            return reactChoreographer2;
        }
    }

    private ReactChoreographer(final ChoreographerProvider choreographerProvider) {
        int size = CallbackType.getEntries().size();
        ArrayDeque<Choreographer.FrameCallback>[] arrayDequeArr = new ArrayDeque[size];
        for (int i2 = 0; i2 < size; i2++) {
            arrayDequeArr[i2] = new ArrayDeque<>();
        }
        this.callbackQueues = arrayDequeArr;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: com.facebook.react.modules.core.ReactChoreographer$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                ReactChoreographer.frameCallback$lambda$1(this.f$0, j2);
            }
        };
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.ReactChoreographer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ReactChoreographer._init_$lambda$2(this.f$0, choreographerProvider);
            }
        });
    }

    public /* synthetic */ ReactChoreographer(ChoreographerProvider choreographerProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographerProvider);
    }

    public static final void _init_$lambda$2(ReactChoreographer this$0, ChoreographerProvider choreographerProvider) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(choreographerProvider, "$choreographerProvider");
        this$0.choreographer$1 = choreographerProvider.getChoreographer();
    }

    public static final void frameCallback$lambda$1(ReactChoreographer this$0, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.callbackQueues) {
            this$0.hasPostedCallback = false;
            int length = this$0.callbackQueues.length;
            for (int i2 = 0; i2 < length; i2++) {
                ArrayDeque<Choreographer.FrameCallback> arrayDeque = this$0.callbackQueues[i2];
                int size = arrayDeque.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Choreographer.FrameCallback frameCallbackPollFirst = arrayDeque.pollFirst();
                    if (frameCallbackPollFirst != null) {
                        frameCallbackPollFirst.doFrame(j2);
                        this$0.totalCallbacks--;
                    } else {
                        FLog.e(ReactConstants.TAG, "Tried to execute non-existent frame callback");
                    }
                }
            }
            this$0.maybeRemoveFrameCallback();
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final ReactChoreographer getInstance() {
        return Companion.getInstance();
    }

    @JvmStatic
    public static final void initialize(ChoreographerProvider choreographerProvider) {
        Companion.initialize(choreographerProvider);
    }

    private final void maybeRemoveFrameCallback() {
        Assertions.assertCondition(this.totalCallbacks >= 0);
        if (this.totalCallbacks == 0 && this.hasPostedCallback) {
            ChoreographerProvider.Choreographer choreographer2 = this.choreographer$1;
            if (choreographer2 != null) {
                choreographer2.removeFrameCallback(this.frameCallback);
            }
            this.hasPostedCallback = false;
        }
    }

    private final void postFrameCallbackOnChoreographer() {
        if (this.hasPostedCallback) {
            return;
        }
        ChoreographerProvider.Choreographer choreographer2 = this.choreographer$1;
        if (choreographer2 == null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.ReactChoreographer$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    ReactChoreographer.postFrameCallbackOnChoreographer$lambda$6(this.f$0);
                }
            });
        } else {
            choreographer2.postFrameCallback(this.frameCallback);
            this.hasPostedCallback = true;
        }
    }

    public static final void postFrameCallbackOnChoreographer$lambda$6(ReactChoreographer this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.callbackQueues) {
            this$0.postFrameCallbackOnChoreographer();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void postFrameCallback(CallbackType type, Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.callbackQueues) {
            this.callbackQueues[type.getOrder$ReactAndroid_release()].addLast(callback);
            boolean z2 = true;
            int i2 = this.totalCallbacks + 1;
            this.totalCallbacks = i2;
            if (i2 <= 0) {
                z2 = false;
            }
            Assertions.assertCondition(z2);
            postFrameCallbackOnChoreographer();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeFrameCallback(CallbackType type, Choreographer.FrameCallback frameCallback) {
        Intrinsics.checkNotNullParameter(type, "type");
        synchronized (this.callbackQueues) {
            if (this.callbackQueues[type.getOrder$ReactAndroid_release()].removeFirstOccurrence(frameCallback)) {
                this.totalCallbacks--;
                maybeRemoveFrameCallback();
            } else {
                FLog.e(ReactConstants.TAG, "Tried to remove non-existent frame callback");
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
