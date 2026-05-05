package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.util.concurrent.Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DebugKt;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00116B\u0005%4\u0012\u000e\u0007njO0L͜P.hS2şs{J$c$wGCU(\u0007*\tUNog|QbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u0015:JoM3UڎE9vt>\u0005&6(\u0600\u0010ڎ1\u001aXGP{ټGM\u0012\u0012>A9@`\u001ee\u00070\u00114Hh\u0019,n\u007fPLG\u001bgj31\u0016\u0002B|1\u00106\u0003M\u001bZl';\f*.9VO7+$\u0002\r7ViR\u001b? GKhoL9`\fWdp0\u001c#Dg\u0011\fu\u000f\\ck\u0011\u00185Fgk[T\u001e*\u000ey*\u0017j ؝\n'VKu3t&&5\u000bq\u0002J\u0001\nl[\u0018~\u00109\u007f%^Mq9ӸjQoZaTE\u001c\u001d\u000f4\"/xiab/x\u00171S&[yaN_`P Xkw4tp%B\u0004^\\F/D)<;=9q8Q+\u001c\u0006Vi\u007fv3c\u0019Wwu`@P\u0004\\7r\u0015\u001a\u0001\\d3\u0013\u0001XfT)MJ}O%\u0016=8\\&TQ-\u001eggl\u0018m6]h?_rEt\u0007s\u001e[I`I4\u007fm>}\u0019v݀C<p\"!tP~$Z\u000b=R6V\u0017(w*m\u0015\f[:M\u001f46B0Gf[HK*Po\u0015\t\u000e\u0002\u0011\u0012\u0015Sa.Iit\u0007\u0017\u0003h\\\u001fr\u001e9 ؖ~˃&1YS;\u001d4ZrzB\u0003;\u0007-v6\u0006>շIƥp\u001a\u000eW\u0002'$\u001f\ne=E+\u0017\u000f-B\u0004CDz|\u0014Z$ȿ)ϸ\u0001y\u0017\u00909=u\u0013\u0003x<dzLeSE,%jIֿ\n5\u0007\bn^zuq+ޯ]\u000fP\u0001\u0012q<|FSā!n,\u000f\u007f:|c;\u001aڲ\u001fɟ{C"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~K\b-=Y&.]C\u0011", "", "\nh]6g\u0005", "u(E", "0tU3X9,W.~", "", "5dc\u000fh-?S&l~s,", "u(8", "Ahi2", "5dc \\A>\u0012\u001f\t\ne0\u0006\u001c)c\n5\u0006P\u0010\u001b G}\b:\u000125", "0tU3X9", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001epun5\u001b9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~Hy.=C", ":`bAF*AS\u0018\u000f\u0002^+k\u0005=k", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", ">q^1h*>`|\by^?", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "1n]@h4>`|\by^?", "0k^0^0GU\bz\td:`\u0012\fu\u0001){M", ">n[9", "/cS", "B`b8", "4`X?", "", "/cS\u0019T:M", "Bqh g,:Z", "", "AsT._0GU\u0001\ty^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~G\r 3t\u001a7O+Ej4s", "As^9X5-O'\u0005g^-", "\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\nm\u0017\u0018\u0006Y\u000bAv#DF}!\r", "uH;8b;EW\"H\u007fo4F\r8t\u007f5\u0005<\b`\u0004GpL&s*5W\r\r7nkq2", "AsT._\u001eBb\u001c^\u000e\\3\r\u00173v\u007f\u0010\u0006?\u0001", "uH\u0018\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`%Er\u000e;\u0007,9b\u007fi&i$4#", ">n[953HQ\u001f\u0003\u0004`", ">n[967N", ">n[9J0MVx\u0012xe<\u000b\r@eg2z@", "=m[F53HQ\u001f\u0003\u0004`", "Bqh\u0012k;KO\u0017\u000e[k6\u0005w2eg,z?\b\u0017", "7mS2k", "=eU9b(=/ \u0006lh9\u0003w9", "", "5k^/T3*c\u0019\u000fz", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN~\u001a\u0017F\u007f\u0015@\u007f'~;\u0005*4i\u001d\u001a]CKk\n", "Bqh g,:Z\u007fz\tm\u001az\f/d\u0010/{?", ">n[9G6", "?tTBX", ">n[95<?T\u0019\f", "2dR?X4>\\(b{;3\u0007\u00075i\t*", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class WorkQueue {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private final AtomicReferenceArray<Task> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater lastScheduledTask$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater producerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumerIndex$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater blockingTasksInBuffer$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");

    public static /* synthetic */ Task add$default(WorkQueue workQueue, Task task, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return workQueue.add(task, z2);
    }

    private final Task addLast(Task task) {
        if (getBufferSize() == 127) {
            return task;
        }
        if (task.taskContext) {
            blockingTasksInBuffer$volatile$FU.incrementAndGet(this);
        }
        int i2 = (-1) - (((-1) - producerIndex$volatile$FU.get(this)) | ((-1) - 127));
        while (this.buffer.get(i2) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i2, task);
        producerIndex$volatile$FU.incrementAndGet(this);
        return null;
    }

    private final void decrementIfBlocking(Task task) {
        if (task == null || !task.taskContext) {
            return;
        }
        int iDecrementAndGet = blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
        if (DebugKt.getASSERTIONS_ENABLED() && iDecrementAndGet < 0) {
            throw new AssertionError();
        }
    }

    private final /* synthetic */ int getBlockingTasksInBuffer$volatile() {
        return this.blockingTasksInBuffer$volatile;
    }

    private final int getBufferSize() {
        return producerIndex$volatile$FU.get(this) - consumerIndex$volatile$FU.get(this);
    }

    private final /* synthetic */ int getConsumerIndex$volatile() {
        return this.consumerIndex$volatile;
    }

    private final /* synthetic */ Object getLastScheduledTask$volatile() {
        return this.lastScheduledTask$volatile;
    }

    private final /* synthetic */ int getProducerIndex$volatile() {
        return this.producerIndex$volatile;
    }

    private final Task pollBuffer() {
        Task andSet;
        while (true) {
            int i2 = consumerIndex$volatile$FU.get(this);
            if (i2 - producerIndex$volatile$FU.get(this) == 0) {
                return null;
            }
            int i3 = (-1) - (((-1) - i2) | ((-1) - 127));
            if (consumerIndex$volatile$FU.compareAndSet(this, i2, i2 + 1) && (andSet = this.buffer.getAndSet(i3, null)) != null) {
                decrementIfBlocking(andSet);
                return andSet;
            }
        }
    }

    private final boolean pollTo(GlobalQueue globalQueue) {
        Task taskPollBuffer = pollBuffer();
        if (taskPollBuffer == null) {
            return false;
        }
        globalQueue.addLast(taskPollBuffer);
        return true;
    }

    private final Task pollWithExclusiveMode(boolean z2) {
        Task task;
        do {
            task = (Task) lastScheduledTask$volatile$FU.get(this);
            if (task == null || task.taskContext != z2) {
                int i2 = consumerIndex$volatile$FU.get(this);
                int i3 = producerIndex$volatile$FU.get(this);
                while (i2 != i3) {
                    if (z2 && blockingTasksInBuffer$volatile$FU.get(this) == 0) {
                        return null;
                    }
                    i3--;
                    Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i3, z2);
                    if (taskTryExtractFromTheMiddle != null) {
                        return taskTryExtractFromTheMiddle;
                    }
                }
                return null;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(lastScheduledTask$volatile$FU, this, task, null));
        return task;
    }

    private final /* synthetic */ void setBlockingTasksInBuffer$volatile(int i2) {
        this.blockingTasksInBuffer$volatile = i2;
    }

    private final /* synthetic */ void setConsumerIndex$volatile(int i2) {
        this.consumerIndex$volatile = i2;
    }

    private final /* synthetic */ void setLastScheduledTask$volatile(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    private final /* synthetic */ void setProducerIndex$volatile(int i2) {
        this.producerIndex$volatile = i2;
    }

    private final Task stealWithExclusiveMode(int i2) {
        int i3 = consumerIndex$volatile$FU.get(this);
        int i4 = producerIndex$volatile$FU.get(this);
        boolean z2 = i2 == 1;
        while (i3 != i4) {
            if (z2 && blockingTasksInBuffer$volatile$FU.get(this) == 0) {
                return null;
            }
            int i5 = i3 + 1;
            Task taskTryExtractFromTheMiddle = tryExtractFromTheMiddle(i3, z2);
            if (taskTryExtractFromTheMiddle != null) {
                return taskTryExtractFromTheMiddle;
            }
            i3 = i5;
        }
        return null;
    }

    private final Task tryExtractFromTheMiddle(int i2, boolean z2) {
        int i3 = (i2 + 127) - (i2 | 127);
        Task task = this.buffer.get(i3);
        if (task == null || task.taskContext != z2 || !Striped$SmallLazyStriped$$ExternalSyntheticBackportWithForwarding0.m(this.buffer, i3, task, null)) {
            return null;
        }
        if (z2) {
            blockingTasksInBuffer$volatile$FU.decrementAndGet(this);
        }
        return task;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long tryStealLastScheduled(int i2, Ref.ObjectRef<Task> objectRef) {
        ?? r5;
        do {
            r5 = (Task) lastScheduledTask$volatile$FU.get(this);
            if (r5 == 0) {
                return -2L;
            }
            if (((r5.taskContext ? 1 : 2) & i2) == 0) {
                return -2L;
            }
            long jNanoTime = TasksKt.schedulerTimeSource.nanoTime() - r5.submissionTime;
            if (jNanoTime < TasksKt.WORK_STEALING_TIME_RESOLUTION_NS) {
                return TasksKt.WORK_STEALING_TIME_RESOLUTION_NS - jNanoTime;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(lastScheduledTask$volatile$FU, this, r5, null));
        objectRef.element = r5;
        return -1L;
    }

    public final Task add(Task task, boolean z2) {
        if (z2) {
            return addLast(task);
        }
        Task task2 = (Task) lastScheduledTask$volatile$FU.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return addLast(task2);
    }

    public final int getSize$kotlinx_coroutines_core() {
        return lastScheduledTask$volatile$FU.get(this) != null ? getBufferSize() + 1 : getBufferSize();
    }

    public final void offloadAllWorkTo(GlobalQueue globalQueue) {
        Task task = (Task) lastScheduledTask$volatile$FU.getAndSet(this, null);
        if (task != null) {
            globalQueue.addLast(task);
        }
        while (pollTo(globalQueue)) {
        }
    }

    public final Task poll() {
        Task task = (Task) lastScheduledTask$volatile$FU.getAndSet(this, null);
        return task == null ? pollBuffer() : task;
    }

    public final Task pollBlocking() {
        return pollWithExclusiveMode(true);
    }

    public final Task pollCpu() {
        return pollWithExclusiveMode(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long trySteal(int i2, Ref.ObjectRef<Task> objectRef) {
        T tPollBuffer = i2 == 3 ? pollBuffer() : stealWithExclusiveMode(i2);
        if (tPollBuffer == 0) {
            return tryStealLastScheduled(i2, objectRef);
        }
        objectRef.element = tPollBuffer;
        return -1L;
    }
}
