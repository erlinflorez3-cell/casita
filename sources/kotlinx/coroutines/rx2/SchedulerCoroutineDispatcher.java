package kotlinx.coroutines.rx2;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0015\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<$q$yCAV\"}0\u0010WȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2I]xk\u001e\u0017˰JoM<UڎE9nҚ>ӌ(20>\u0002ڎ\u0017ɝZH>u+Cy\fR=PtHS%M3\u001cŪ\n@&\u0004,`0mDO\u0005]h7S\u0007wKf'\u000e:-U\u001bQl+;\u0004J\u001e\nL}Iչ)S\u0011\u0015\u001bwM\u0012Wqk\r\u0019+5;as\u0006G\t\n\"'CU\u001d_\u0003&\u000b\r\u007fsR;svq_h\u000eV\r+\u007f\u001bL\u001c\u000e48x6;%~\f<@]r2L\u0001\u0006lK\u0018z\u0010@]9ő7+G1/WoR1Ne\u0014K!f4\u000f\b9[\u0003(\u0011\u001b)o\u0010SGPnY\u000fݧ\n\"C{!\tb0HJD\u0018\u000f=|).E'ھ_?+ܩ\u0004\u0004NIu|ݼd\b"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`5m\u0011<u5<Y\u000b}Az >\\GDk\u0013\"#s]H\u0005f,[L", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u001e\u0013[E", "AbW2W<ES&", "\u001ah^{e,:Q(\u0003\f^?Fv-h\u007f'\fG\u0001$l", "\nh]6g\u0005", "uKX<\"9>O\u0017\u000e~o,\u0010R\u001dc\u0003(zP\b\u0017$\u001d3~", "5dc V/>R)\u0006zk", "u(;6buKS\u0015|\nb=|\u001cxS}+{?\u0011\u001e\u0017TE", "2hb=T;<V", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oM", "AbW2W<ES\u0006~\tn4|d0t\u007f5Z@\b\u0013+", "Bh\\2@0EZ\u001d\r", "", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "7me<^,(\\\b\u0003\u0003^6\r\u0018", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "uI;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>+\u001fxp=\u0010c\nX\u007f6G_]\u0002 9xG#\u0019^\u0017at\u000b\u000ffK4}H@\u001f\u0016u(\u0006Is\u000b\u001a\u0012\u000b<jS>_\u000fNyj", "BnBAe0GU", "", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class SchedulerCoroutineDispatcher extends CoroutineDispatcher implements Delay {
    private final Scheduler scheduler;

    public SchedulerCoroutineDispatcher(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public static final void scheduleResumeAfterDelay$lambda$1(CancellableContinuation cancellableContinuation, SchedulerCoroutineDispatcher schedulerCoroutineDispatcher) {
        cancellableContinuation.resumeUndispatched(schedulerCoroutineDispatcher, Unit.INSTANCE);
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0012Y)4]q`H9\nx\u0018SyK{o\\\tcg{\feP\revMK0A;\u001e\u0016Y~6`W?%L9(\u0011YSM)\u000b9\u0010v\u0011sv\"Z\u0010;m7\n\bQ\u0013~\u0010T3")
    @InterfaceC1492Gx
    public Object delay(long j2, Continuation<? super Unit> continuation) {
        return Delay.DefaultImpls.delay(this, j2, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.scheduler.scheduleDirect(runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SchedulerCoroutineDispatcher) && ((SchedulerCoroutineDispatcher) obj).scheduler == this.scheduler;
    }

    public final Scheduler getScheduler() {
        return this.scheduler;
    }

    public int hashCode() {
        return System.identityHashCode(this.scheduler);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        final Disposable disposableScheduleDirect = this.scheduler.scheduleDirect(runnable, j2, TimeUnit.MILLISECONDS);
        return new DisposableHandle() { // from class: kotlinx.coroutines.rx2.SchedulerCoroutineDispatcher$$ExternalSyntheticLambda0
            @Override // kotlinx.coroutines.DisposableHandle
            public final void dispose() {
                disposableScheduleDirect.dispose();
            }
        };
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10551scheduleResumeAfterDelay(long j2, final CancellableContinuation<? super Unit> cancellableContinuation) {
        RxAwaitKt.disposeOnCancellation(cancellableContinuation, this.scheduler.scheduleDirect(new Runnable() { // from class: kotlinx.coroutines.rx2.SchedulerCoroutineDispatcher$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SchedulerCoroutineDispatcher.scheduleResumeAfterDelay$lambda$1(cancellableContinuation, this);
            }
        }, j2, TimeUnit.MILLISECONDS));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.scheduler.toString();
    }
}
