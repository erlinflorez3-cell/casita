package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u0007njO0LeN1ZS8\u0018s{:'c$\u007fbCU \u0001*\t]logtOb\u000bQ\u000f\u000e\u0016~l4Ic\u007fe\u0012\u00152JoU3UڎE9vt>\u0005&88\u0600*\u0005/\u0019bGA7\u0010Iŷ\u001c\u0016>@\t:\u0001\u000e]\t(\u0014\u001e>N\u0004ɉ`g\\:\u0011pkYG#1\n\u000bY5\u0001H|{\u0019\rÖܮ\u0011vg@svEX-%\u0002#7ViA\u001b? @5n-'9m\fWd}0\u001a\u001b+]3urTh5]f\u000e5Rgi[R\u001e(&\u001b*5\u0003ǐ\u0014ϳ&Ξv1(\u0010 \u000ea\u001f;\u007fN{\u001a^p +eD\u0019=\u007fa.i!lQo_1Ne!5\u0019$%\u000f\u00169ad\u0010p\u0015Iy&ywҌFعGݐRoK\u0019\u001cp\u0011\"Z\b>s\u0018/*\u0017^\u001d+7i];!\u001a'\u0011gu$\u001d`\u0017_\u001aVVl:nD=Z\r\u001a~\\d3\u0011\u0001XfZ)MJ`Mâݔ\u0017 b'\u0005%3*fO\u0017\n3Sk:=/\u0015: \u0003<(e>v5KP\u0012\u00168\u05ed\u0003݀CHjڳphHZ\u001ab|*(;Vt`\u0010\nOf\fA>\u0016ڥ(ٜ0=!¢-J\t+PO\u001d\u000beiv OlA5\u001bo4v\u0019\u0001~b\u001f\u0002>կKض\u0001f*ΊYS;,4irzB~;\u0007-vVùi֙KRtֵ\u000eW\u00025$0\nf=T+\u0015\u000f+B\u0002[Kz\u000b\u001c\u0016̊\u0016+\u0013~\u007f(I|~\u007f\u0016\u0005\t,\u000fv!֣`Ђ&\u0003fа;\nj\u001b\bof|M\u007fb\u001b,PWr\u001bYjO\u000fى\u0007ȷ\"+\tǻ:~;JQEݷ\u0016|\u001c2\u001b˯\u000e\u0018nЬ}\u0015"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.#", "", "B`b8E<G\\\u0019\f", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\rGv\u001f.Z\u0019", "<`\\2", "", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n\u0015'T|\u000eE\u0006n$U\f&$}\u001f7MP\u0011R9\u001a&d+@\u0003l.\u0018d6TPW.2\u0016c", "/bc6i,-O'\u0005", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "5dc\u000eV;Bd\u0019mvl2;\u00135h\u000f7\u0007", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b \u0015W|\u001b<\u007f4~Hy.=C", "Adc\u000eV;Bd\u0019mvl2;\u00135h\u000f7\u0007", "uK^8[;M^fH~g;|\u00168a\u0007qyJ\n\u0015'T|\u000eE\u0006n$U\f&\r1\u0007", "1`]0X3\u001aQ(\u0003\f^\u001bx\u00175", "", "5dc\u0010T5<S Zxm0\u000e\t\u001ea\u000e.:J\u0007\u001a&Vz", "u(I", "Adc\u0010T5<S Zxm0\u000e\t\u001ea\u000e.:J\u0007\u001a&Vz", "uY\u0018#", "4tcBe,-O'\u0005\t", "", "5dc\u0013h;N`\u0019mvl2\u000bG9k\u00037\u000bK", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u001bT4>\u0012#\u0005}m;\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "AbW2W<ES\u0018mvl2\u000b", "", "5dc V/>R)\u0006z]\u001bx\u00175s", "AgdAW6P\\", "5dc [<MR#\u0011\u0004\u001d6\u0003\f>t\u000b", "Adc [<MR#\u0011\u0004\u001d6\u0003\f>t\u000b", "5dc!T:D@)\b\u0004^9;\u00135h\u000f7\u0007", "u(;<^/Mb$LDb5\f\t<n{/E>\u000b \u0015W|\u001b<\u007f4~Hy.=Z&7VCHA", "1`]0X3\u001aZ ", "", "1`]0X3\u001aZ Z\u0004]\u000b|\u00073d\u007f", "1`]0X3\u001aZ Z\u0004]\u000b|\u00073d\u007ff\u0006F\u0004&&R", "3wT0h;>", "2d[.l\u0015:\\#\r", "", "1`]0X3:P ~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7c[2?(MQ\u001c", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Wx\u001d\u001b\u00017>@y/5pk", "AbW2W<ES", "B`b8", "AbW2W<ESt\by=,z\r.e", "@dRBe9>\\\u0017~", "AbW2W<ESt\by=,z\r.e>2\u0002C\u0010&\"", "BnBAe0GU", "\u000fvP6g\u0010=Z\u0019mvl2", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u000enʑ?0Z͜x.\u0001Rj\u0012ө\u007f42[lwQ@m\u001a,(Oc\u001fvuobZ9EǇ\n\u001c\u0001̓DK[{k\u0016ƪ6I"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.\f\u001fMg8-xgh9u_:TL", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "u(E", ":`c0[", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Wx\u001d\u001b\u00017>@y/5pk", "5dc\u0019T;<V", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`%y\u001eE\u0006\u0004?k\u0007\u00073|\u00141#", "@t]\u001ca*>", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(Util.okHttpName + " awaitIdle", false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u000bIيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"=jWAg7\f\u001d\u001d\b\n^9\u0006\u00056/}2\u0005>\u0011$$Gx\u001d\u0006e!C_i07}\u0016lMV;iD-\u0015'-", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "@t]\u001ca*>", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1 extends Task {
        final /* synthetic */ Function0<Unit> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z2, Function0<Unit> function0) {
            super(str, z2);
            this.$block = function0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u000bIيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"=jWAg7\f\u001d\u001d\b\n^9\u0006\u00056/}2\u0005>\u0011$$Gx\u001d\u0006e!C_i07}\u0016l[A>k3.\u001ch \u0006", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004u", "@t]\u001ca*>", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass2 extends Task {
        final /* synthetic */ Function0<Long> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Long> function0) {
            super(str, false, 2, null);
            this.$block = function0;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            return this.$block.invoke().longValue();
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String name, long j2, boolean z2, Function0 block, int i2, Object obj) {
        if ((2 & i2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        taskQueue.schedule(new AnonymousClass1(name, z2, block), j2);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String name, long j2, Function0 block, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = 0;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        taskQueue.schedule(new AnonymousClass2(name, block), j2);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            j2 = 0;
        }
        taskQueue.schedule(task, j2);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            Intrinsics.checkNotNull(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z2 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                Task task2 = this.futureTasks.get(size);
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    public final void execute(String name, long j2, boolean z2, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        schedule(new AnonymousClass1(name, z2, block), j2);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> list;
        synchronized (this.taskRunner) {
            list = CollectionsKt.toList(this.futureTasks);
        }
        return list;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task = this.activeTask;
            if (task instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) task).getLatch();
            }
            for (Task task2 : this.futureTasks) {
                if (task2 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task2).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(String name, long j2, Function0<Long> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        schedule(new AnonymousClass2(name, block), j2);
    }

    public final void schedule(Task task, long j2) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (scheduleAndDecide$okhttp(task, j2, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.getCancelable()) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j2, boolean z2) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j3 = jNanoTime + j2;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j3) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j3);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.log(task, this, z2 ? "run again after " + TaskLoggerKt.formatDuration(j3 - jNanoTime) : "scheduled after " + TaskLoggerKt.formatDuration(j3 - jNanoTime));
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - jNanoTime > j2) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z2) {
        this.cancelActiveTask = z2;
    }

    public final void setShutdown$okhttp(boolean z2) {
        this.shutdown = z2;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public String toString() {
        return this.name;
    }
}
