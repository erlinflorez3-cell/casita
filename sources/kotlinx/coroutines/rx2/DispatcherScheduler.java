package kotlinx.coroutines.rx2;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.rx2.DispatcherScheduler;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}8\tWȞog|QbŏK\u000f\u001c\u0016\u0001j2I]xs\u0012\u0017˰JoM3UڎE9n\u0001>\u0005&2(8\u0010ڎ1\u001aXGHu\u0015\u0004X\u001c\u0016>@\t:\u0001\u000ê\t\u001c\u0018\bL#IEjqf6vw\u000eB=/\u001bmp\\\u0010_\u000f\n}\u0011Tc?\r%qN/NHM\u0015SeI\u001bқ_?\u0011R:C\u0013|?'Y^:k~^\u000e*-+}$$\u0007nb\u0013ix\fUD\u0016w\u001c^\u001c(\u0010z*\u000er\bd\u0382)ρ2-\"ǑX\u001aAx\u000bSnUXތDȸ~a>Ѝu\fA1Q\u001b\u0015X8ݥ\u001b\u05ee;{\rټn*\u000fv9[\u0003\u00177ڀ\u001dǁ{l"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`&s\u001cGr43\\}-%k\u0019.LSBkAs", "\u001ah^{e,:Q(\u0003\f^?Fv-h\u007f'\fG\u0001$l", "2hb=T;<V\u0019\f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0014]\f+3|\u00141MP\u0011/%", "AbW2W<ES&c\u0005[", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,5>\b\u001d\r", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Ena8X9\u001c])\b\n^9", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015.y\u0017>L", "AbW2W<ESw\u0003\b^*\f", "\u001ah^{e,:Q(\u0003\f^?F\b3s\u000b2\n<}\u001e\u0017U9l@\u00050?gy\u001d>mk", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2d[.l", "", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016e}\u001cC\u0001\n\u0006\u000749`G\u001eAv\u0014>ZP;tCg\u0004li9vl0]Lj.PXuiRn;#\u0016k\u000eat\f\tgL.|@4&\b:\u0013`?v\f\u0016$\n2qp\u0018", "1qT.g,0]&\u0005zk", "\u001ah^{e,:Q(\u0003\f^?Fv-h\u007f'\fG\u0001$U9y\u001bBv2\u000b", "AgdAW6P\\", "", "BnBAe0GU", "", "\u0012hb=T;<V\u0019\flh9\u0003\t<", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class DispatcherScheduler extends Scheduler {
    private static final /* synthetic */ AtomicLongFieldUpdater workerCounter$volatile$FU = AtomicLongFieldUpdater.newUpdater(DispatcherScheduler.class, "workerCounter$volatile");
    public final CoroutineDispatcher dispatcher;
    private final CompletableJob schedulerJob;
    private final CoroutineScope scope;
    private volatile /* synthetic */ long workerCounter$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.hS2şs{J$cҕyCQU\"}8\tWN}gvJh\u000bK\u000f\u0014ǝ\u0001̓4Ikxe܈\u00172XoG3coE9ft>\u000562*8\u007f\u0005\t\u001a8Q\u0018v\u0001CS\f <H\u0081@R#˟5\u001a@\u0005~=\u0011\"jgf6vmm>=%\u001bipQ7c>\u0001e\rtYܮ\u0011xg$9G\u007f\\#7k\u00035e\fG\u0011S\nA3~\u0010'\n^$[Do\u0018\u0014C,\u007f\u0011k\u000b>\\3j' ˏ/Oqe\u0019\u00146\u0013\u0013{;XJ\"N-VKE\u001a\u0015\u0018TG=xa^h\u0002\raF\u000f2B%%\u00183Y:qƛSň?\u0019VљL\u0011\u001b ;\u0001\u001d$2٭\u0010\u05ce\u0019\u001b\\ȭ\"=_HUH|\u00130Ơoձtb\nÏT<U\nG{?9m©9٦=#)ǽRpRs\u000f!p\u0001c\u007fXGP*~\u001cG,\u0019\f\tT\u0013\u0014{TdZB\u0010{-\u0003\u0015,\u0015i\u0601^ʟ@!-ī˃S\t"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`&s\u001cGr43\\}-%k\u0019.LSBkA\\sloD\u0003r*Qv49V[2\\_H", "\u001ah^{e,:Q(\u0003\f^?Fv-h\u007f'\fG\u0001$U9y\u001bBv2\u000b", "1nd;g,K", "", "2hb=T;<V\u0019\f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", ">`a2a;#]\u0016", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\nh]6g\u0005", "uI;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.58\u0002.Bi%,PCHA\u001b$\u001fwh=\u0010vuL\u00014Q\\]0eR\u0001\u0007x\u001cWc\u0012\u001c", "Ena8X9#]\u0016", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,5>\b\u001d\r", "Ena8X9,Q#\nz", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "0k^0^\nAO\"\bze", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "AbW2W<ES", "\u001ah^{e,:Q(\u0003\f^?F\b3s\u000b2\n<}\u001e\u0017U9l@\u00050?gy\u001d>mk", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2d[.l", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016e}\u001cC\u0001\n\u0006\u000749`G\u001eAv\u0014>ZP;tCg\u0004li9vl0]Lj.PXuiRn;#\u0016k\u000eat\f\tgL.|@4&\b:\u0013`?v\f\u0016$\n2qp\u0018", "7r36f7Ha\u0019}", "", "2hb=b:>", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class DispatcherWorker extends Scheduler.Worker {
        private final Channel<Function1<Continuation<? super Unit>, Object>> blockChannel;
        private final long counter;
        private final CoroutineDispatcher dispatcher;
        private final CompletableJob workerJob;
        private final CoroutineScope workerScope;

        /* JADX INFO: renamed from: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1, reason: invalid class name */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return DispatcherWorker.this.new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:7:0x0017, B:13:0x003b, B:18:0x004c, B:20:0x0054, B:26:0x006a, B:17:0x0049, B:12:0x0037), top: B:34:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:7:0x0017, B:13:0x003b, B:18:0x004c, B:20:0x0054, B:26:0x006a, B:17:0x0049, B:12:0x0037), top: B:34:0x0009 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r7.label
                    r5 = 2
                    r4 = 1
                    r3 = 0
                    if (r0 == 0) goto L2c
                    if (r0 == r4) goto L23
                    if (r0 != r5) goto L1b
                    java.lang.Object r1 = r7.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r2 = r7.L$0
                    kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L72
                    goto L67
                L1b:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                L23:
                    java.lang.Object r1 = r7.L$1
                    kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                    java.lang.Object r2 = r7.L$0
                    kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
                    goto L49
                L2c:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker r0 = kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.this
                    kotlinx.coroutines.channels.Channel r2 = kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.access$getBlockChannel$p(r0)
                    kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
                    kotlinx.coroutines.channels.ChannelIterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L72
                L3b:
                    r7.L$0 = r2     // Catch: java.lang.Throwable -> L72
                    r7.L$1 = r1     // Catch: java.lang.Throwable -> L72
                    r7.label = r4     // Catch: java.lang.Throwable -> L72
                    java.lang.Object r8 = r1.hasNext(r7)     // Catch: java.lang.Throwable -> L72
                    if (r8 != r6) goto L48
                    goto L68
                L48:
                    goto L4c
                L49:
                    kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L72
                L4c:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L72
                    boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L72
                    if (r0 == 0) goto L6a
                    java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L72
                    kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L72
                    r7.L$0 = r2     // Catch: java.lang.Throwable -> L72
                    r7.L$1 = r1     // Catch: java.lang.Throwable -> L72
                    r7.label = r5     // Catch: java.lang.Throwable -> L72
                    java.lang.Object r0 = r0.invoke(r7)     // Catch: java.lang.Throwable -> L72
                    if (r0 != r6) goto L67
                    goto L69
                L67:
                    goto L3b
                L68:
                    return r6
                L69:
                    return r6
                L6a:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L72
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r3)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L72:
                    r1 = move-exception
                    throw r1     // Catch: java.lang.Throwable -> L74
                L74:
                    r0 = move-exception
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r2, r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.DispatcherScheduler.DispatcherWorker.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public DispatcherWorker(long j2, CoroutineDispatcher coroutineDispatcher, Job job) {
            this.counter = j2;
            this.dispatcher = coroutineDispatcher;
            CompletableJob completableJobSupervisorJob = SupervisorKt.SupervisorJob(job);
            this.workerJob = completableJobSupervisorJob;
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob.plus(coroutineDispatcher));
            this.workerScope = CoroutineScope;
            this.blockChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Runnable schedule$lambda$1(final DispatcherWorker dispatcherWorker, final Function1 function1) {
            return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$schedule$lambda$1$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.blockChannel.mo10484trySendJP2dKIU(function1);
                }
            };
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SendChannel.DefaultImpls.close$default(this.blockChannel, null, 1, null);
            Job.DefaultImpls.cancel$default((Job) this.workerJob, (CancellationException) null, 1, (Object) null);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return !CoroutineScopeKt.isActive(this.workerScope);
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            return RxSchedulerKt.scheduleTask(this.workerScope, runnable, timeUnit.toMillis(j2), new Function1() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DispatcherScheduler.DispatcherWorker.schedule$lambda$1(this.f$0, (Function1) obj);
                }
            });
        }

        public String toString() {
            return this.dispatcher + " (worker " + this.counter + ", " + (isDisposed() ? "disposed" : "active") + ')';
        }
    }

    public DispatcherScheduler(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
        CompletableJob completableJobSupervisorJob$default = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.schedulerJob = completableJobSupervisorJob$default;
        this.scope = CoroutineScopeKt.CoroutineScope(completableJobSupervisorJob$default.plus(coroutineDispatcher));
        this.workerCounter$volatile = 1L;
    }

    private final /* synthetic */ long getWorkerCounter$volatile() {
        return this.workerCounter$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable scheduleDirect$lambda$1(final DispatcherScheduler dispatcherScheduler, final Function1 function1) {
        return new Runnable() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$scheduleDirect$lambda$1$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                BuildersKt__Builders_commonKt.launch$default(this.this$0.scope, null, null, new DispatcherScheduler$scheduleDirect$1$1$1(function1, null), 3, null);
            }
        };
    }

    private final /* synthetic */ void setWorkerCounter$volatile(long j2) {
        this.workerCounter$volatile = j2;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new DispatcherWorker(workerCounter$volatile$FU.getAndIncrement(this), this.dispatcher, this.schedulerJob);
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j2, TimeUnit timeUnit) {
        return RxSchedulerKt.scheduleTask(this.scope, runnable, timeUnit.toMillis(j2), new Function1() { // from class: kotlinx.coroutines.rx2.DispatcherScheduler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DispatcherScheduler.scheduleDirect$lambda$1(this.f$0, (Function1) obj);
            }
        });
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        Job.DefaultImpls.cancel$default((Job) this.schedulerJob, (CancellationException) null, 1, (Object) null);
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
