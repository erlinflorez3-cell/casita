package kotlinx.coroutines.rx2;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DisposableHandle;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007njO0LeV.ZS8şsڔ<$q$yCQU\"Ԃ*\teNog\u0005JbŏK\u000f\u0014\u001d\u0001j2Jm\u0001k܈'2png3{oUHnuN\u0005N4J8(\u0005G\u001fݵL\u0010|ٙ[S\u001a\u0015H@\u001f:z\r{\u00042}\u0014G8\u0001Lf\u0010NdS\u001deH;;\u0007\u0018P7'>=-Q\u001bUl';\u0007\u0012b9QOu%Wc3\rQkG\u0013E\u0002?\u0015hU.YO\u0004[FZ\u0016\u0013C3}\u0012F\t,[\u0015Yp\u00127-_cyW<.\b~\f\u000fR\u0003<\u000eUM>3*j6\u001c\u001ctQ`nUH^۰\u0004zoH?[\u000639=;|W`K!^=\f\u0007\u001d\u001eQ\b\u001d'kX\u001eb+\u001a\u0003\u007f\u007f6\u0002VCG^\u0012iC}\u0006\u0001b0126W\u0004?}'-E-e`ަ'4"}, d2 = {"/r2<e6Nb\u001d\bz=0\u000b\u0014+t}+{M", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\u001ah^{e,:Q(\u0003\f^?Fv-h\u007f'\fG\u0001$l", "/r2<e6Nb\u001d\bz=0\u000b\u0014+t}+{MK", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EM\u0014c`5m\u0011<u5<Y\u000b}Az >\\GDk\u0013\"#s]H\u0005f,[L", "/rB0[,=c ~\b", "\"`b8", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "AbW2W<ES\bz\td", "\u001ah^{e,:Q(\u0003\f^?F\b3s\u000b2\n<}\u001e\u0017U9l@\u00050?gy\u001d>mk", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2d[.l\u0014BZ \u0003\t", "", "/cP=g\rH`\u0007|}^+\r\u00103n\u0002", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|3IT75;\u001a\u001ej+&\u0017l5Js.G\"3\u0013b\\\u0002D\u0018\u001b$\u0013_3V\u0006iJ\"}HA(\u0016u*\u0012Df\u0010\u0010 \u0017\u0001@4)Z\u001a\u0011\u0007\u0015q?8lWYrCFESm4r\b\\$\\H\u0004\u0003\u0018\u007f$%vL+\u0011{)", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RxSchedulerKt {
    public static final CoroutineDispatcher asCoroutineDispatcher(Scheduler scheduler) {
        return scheduler instanceof DispatcherScheduler ? ((DispatcherScheduler) scheduler).dispatcher : new SchedulerCoroutineDispatcher(scheduler);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%,\u0015yF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(>G0?C\u0017h\f\u0010'j[DtLG")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: asCoroutineDispatcher, reason: collision with other method in class */
    public static final /* synthetic */ SchedulerCoroutineDispatcher m10576asCoroutineDispatcher(Scheduler scheduler) {
        return new SchedulerCoroutineDispatcher(scheduler);
    }

    public static final Scheduler asScheduler(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher instanceof SchedulerCoroutineDispatcher ? ((SchedulerCoroutineDispatcher) coroutineDispatcher).getScheduler() : new DispatcherScheduler(coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlinx.coroutines.DisposableHandle] */
    public static final Disposable scheduleTask(CoroutineScope coroutineScope, Runnable runnable, long j2, Function1<? super Function1<? super Continuation<? super Unit>, ? extends Object>, ? extends Runnable> function1) {
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Disposable disposableFromRunnable = Disposables.fromRunnable(new Runnable() { // from class: kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RxSchedulerKt.scheduleTask$lambda$0(objectRef);
            }
        });
        Runnable runnableInvoke = function1.invoke(new RxSchedulerKt$scheduleTask$toSchedule$1(disposableFromRunnable, coroutineContext, RxJavaPlugins.onSchedule(runnable)));
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            return Disposables.disposed();
        }
        if (j2 <= 0) {
            runnableInvoke.run();
        } else {
            objectRef.element = DelayKt.getDelay(coroutineContext).invokeOnTimeout(j2, runnableInvoke, coroutineContext);
        }
        return disposableFromRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleTask$lambda$0(Ref.ObjectRef objectRef) {
        DisposableHandle disposableHandle = (DisposableHandle) objectRef.element;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object scheduleTask$task(io.reactivex.disposables.Disposable r5, kotlin.coroutines.CoroutineContext r6, final java.lang.Runnable r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            if (r0 == 0) goto L25
            r4 = r8
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r4 = (kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L37
            if (r0 != r2) goto L2f
            java.lang.Object r6 = r4.L$0
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
            goto L2b
        L25:
            kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1 r4 = new kotlinx.coroutines.rx2.RxSchedulerKt$scheduleTask$task$1
            r4.<init>(r8)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L54
            goto L58
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            boolean r0 = r5.isDisposed()
            if (r0 == 0) goto L43
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L43:
            kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda1 r1 = new kotlinx.coroutines.rx2.RxSchedulerKt$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            r4.L$0 = r6     // Catch: java.lang.Throwable -> L54
            r4.label = r2     // Catch: java.lang.Throwable -> L54
            r0 = 0
            java.lang.Object r0 = kotlinx.coroutines.InterruptibleKt.runInterruptible$default(r0, r1, r4, r2, r0)     // Catch: java.lang.Throwable -> L54
            if (r0 != r3) goto L58
            return r3
        L54:
            r0 = move-exception
            kotlinx.coroutines.rx2.RxCancellableKt.handleUndeliverableException(r0, r6)
        L58:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxSchedulerKt.scheduleTask$task(io.reactivex.disposables.Disposable, kotlin.coroutines.CoroutineContext, java.lang.Runnable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit scheduleTask$task$lambda$1(Runnable runnable) {
        runnable.run();
        return Unit.INSTANCE;
    }
}
