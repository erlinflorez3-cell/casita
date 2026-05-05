package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00126Ȑ\u0007\":\u001b\u007fјnjO0Le^.ZS0\u0016s{B$c$wKCU(\u0004*ޛWNusvJ`\u000bI-\u001cǝ)jZH\u0016}ٕ\u0016\u00118B}@{S}FQ`#9K4z&F\t\u001d\u0001H/\u0011\u0016\u0005\u000b[K:\u0017vT9J`\u001ee\u0005H$6F.\u00146`wN<I\u001be\u0003=1\u001a\u0002B|*\u00104\u000be%F\u0003,Sv*,9YO5C7\u0004\t\rRiW\u001b? BMv5ACI\"if^\u0006\u0014#Cg\r\fwnr\u0013lx\fU*\u007fgYl&(&\u0018,\u0013J\"&\b=G\\Lbl\u0016.Kt!e\u0007dRjP\u0002\u0013ad\u001a{ı?ڢ=\u001bnϟ2G'RO{3\u0012tŃ\rͼ%[\\ו1-)Z\u0010]AWPAXN\u0010Zku\u001ao\u0011\t\u0001ʹ<Ͻ\u0004/\u0004߾~)3As9Q&\"T\u001f\u05c8iЛ\td\u0001Uo\\VKr\u0001$CB\t:]z7[߭RԜ\\0)O\"a\u0015\fX\".p\u0010<O*F\u0013ћlm\u0003Oc\u001e3:7Fg\u0004\u0004\u000e\u0006>\u0015w̳Ug(cX\f\"J\rq\u0013n~B\u0002\u0011\u0011!͈&6`l\u0016\u000e\nO±\u00104"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002z", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\nh]6g\u0005", "u(E", "CrT\u0010b<Gb", "", "AgP?X+", "", "CmR<a-B\\\u0019}fn,\r\t", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"C~\f?v$$U\f&\r", ">q^0X:L<\u0019\u0012\n>=|\u0012>", "7r4:c;R", "u(I", "<dgAG0FS", "5dc\u001bX?MB\u001d\u0007z", "u(9", ">q^0X:LC\"|\u0005g-\u0001\u0012/d_9{I\u0010", "Ag^B_+\u001bS\u0004\f\u0005\\,\u000b\u0017/d`5\u0006H^! Vo!K", "2hb=T;<V\t\bxh5}\r8e~", "", "B`b8", "7r00g0OS", "7rD;V6GT\u001d\bz]\u0013\u0007\u0013:A}7\u007fQ\u0001", "7rD;V6GT\u001d\bz]\u0018\r\t?e_0\u0007O\u0015", "2d[AT", "CmR<a-B\\\u0019}", "7mR?X4>\\(n\t^\n\u0007\u00198t", "2dR?X4>\\(n\t^\n\u0007\u00198t", ":h\\6g,=>\u0015\fve3|\u00103s\b", ">`a._3>Z\u001d\r\u0003", "", "<`\\2", "", "AgdAW6P\\", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private ArrayDeque<DispatchedTask<?>> unconfinedQueue;
    private long useCount;

    public static /* synthetic */ void decrementUseCount$default(EventLoop eventLoop, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = false;
        }
        eventLoop.decrementUseCount(z2);
    }

    private final long delta(boolean z2) {
        return z2 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(EventLoop eventLoop, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = false;
        }
        eventLoop.incrementUseCount(z2);
    }

    public final void decrementUseCount(boolean z2) {
        long jDelta = this.useCount - delta(z2);
        this.useCount = jDelta;
        if (jDelta > 0) {
            return;
        }
        if (DebugKt.getASSERTIONS_ENABLED() && this.useCount != 0) {
            throw new AssertionError();
        }
        if (this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(DispatchedTask<?> dispatchedTask) {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.unconfinedQueue = arrayDeque;
        }
        arrayDeque.addLast(dispatchedTask);
    }

    protected long getNextTime() {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void incrementUseCount(boolean z2) {
        this.useCount += delta(z2);
        if (z2) {
            return;
        }
        this.shared = true;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    protected boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public final boolean isUnconfinedLoopActive() {
        return this.useCount >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i2, String str) {
        LimitedDispatcherKt.checkParallelism(i2);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        DispatchedTask<?> dispatchedTaskRemoveFirstOrNull;
        ArrayDeque<DispatchedTask<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (dispatchedTaskRemoveFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        dispatchedTaskRemoveFirstOrNull.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
