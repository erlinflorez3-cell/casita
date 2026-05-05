package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
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
/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN1ZS@\u000fs{J$c$wDCU0}*\tUQog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Icxe\u0012\u00155JoU3UoC:f\u0019LӌP2P7:\u0018\u0011\u001e8H(v)D[\u0010 2XphUҫQ\u0005(\u0016NM.\u00156\\\u0016[|Ն+Ԑ9ǂݭ\u0007iPcon>\u0013e\rtkm˰5Ӧ\u001dѨË;5#:\u001c\r\u0015jsE\u0013A\u0002=3\u007fU@sM\u0002qNX./]B])urTw5Un)?+}z\u0012ֻLÂv\u07beԫ\u0011<\u0012,N>VME\u001a\u0015#>7\u0003\u0013k@~#%۔>Ҧ`اа)\u007fAM\u0002%ttyA)PG{3\u001aL<Q\t/`l\u000e\u000f\u001bQhNΛ3ҨDIPݐ\u001a[Ct\u0012xz\u00040\r>QPG\n\u001cF\u001d59k9Q.\u001a\u000e\u001fִiЛ\tfpׅ\u0002TNN0}fI8\u0019$Zru[ߙRԜ\\2\u0019۳4V\r\u0010\u0016&\u0601\\yD!+'˃S\r"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R\ro\r2\fO\u0005 \u00179y\u001bBv2\u000b", "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B/", "/o_\u0010b5MS,\u000e", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">`a.`:", "\u001a`]1e6BR,H\rh9\u0003R!o\r.{Mk\u0013$Cw\u000eKv2C/", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7(8ZI\u0005]>+\u001bhn$\u0003p(Vv6GY\\\u0002 C", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137:<\n !Vk\u001d@\u0001.C", "u(E", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.58\u0002.Bi%,PCHA", "4tcBe,", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EP\u0010\u001b\u001eU9\u000fL\u00065BY\fi%m%=I@Bk\u0015.$xn9\\", "\u001a`]1e6BR,H\rh9\u0003R\u0016i\u000e7{I|\u0014\u001eGa\u0018I|%B\u0018j E}\u001d=#", "5dc\u0013h;N`\u0019=\rh9\u0003\u0003<u\t7\u007fH\u0001\u0011\u001dV\u0003\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ'&Kv\u001c\u0006w5Di\u000b E7\u0004.\\R7h;\u001euxpI\u0014c\u0002", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,5>\b\u001d\r", "5dc\u0017b)|e#\f\u0001X9\r\u0012>i\b(uF\u0010*\u0011To\u0015<r35", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Oz\u0015<\u0006!2`}\u0005Ajk", "2nF<e2", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "5dc\u0013b9>U&\t\u000bg+`\u00120o", "\u001a`]1e6BR,H\rh9\u0003R\u0010o\r(}M\u000b' FS\u0017=\u0001z", "5dc\u0013b9>U&\t\u000bg+`\u00120o[6\u0010I~", "\u001ab^:\".H]\u001b\u0006z(*\u0007\u00117o\tq\fO\u0005\u001e`Ey\u0017:\u00072BY\u0007/\u0001T\u001a<\\CDg1%\u0015IqH\u0017p,$", "=mBAb7IS\u0018", "", "Adc\u0013b9>U&\t\u000bg+", "4na2Z9Hc\"}^g-\u0007", "uKP;W9HW\u0018\u0012Dp6\n\u000fxF\n5{B\u000e!'PnqEw/\u000b@\u0004*Ft\u001a7\u0017AEx>.$lj9\u0015-\nX\u007f6KU^(kV|FiUA\u0013J<\tN`=-p\u000e!\u001c\r,G\u0011\u0011", "Adc\u001de6@`\u0019\r\t", "2`c.", "\u001a`]1e6BR,H\rh9\u0003R\u000ea\u000f$Q", "uKP;W9HW\u0018\u0012Dp6\n\u000fxD{7w\u0016g\u001d!Vv\u0012E@#?f\b0Fq\u001f.[\r\u0019u=-\u0019qq5\u0016g6WLj.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017", "AsP?g\u001eH`\u001f", "Ena8 9N\\(\u0003\u0003^s\u0003\u0018B_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class CoroutineWorker extends ListenableWorker {
    private final CoroutineDispatcher coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final CompletableJob job;

    @Deprecated(message = "8Y\u0001t\t})_;V6\u000fU-@\u0016*\u001aVoDq\u001ae\u007fJs*R\u0004\u001buzW,\u000b\revLZ#4>_")
    @InterfaceC1492Gx
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public abstract Object doWork(Continuation<? super ListenableWorker.Result> continuation);

    public Object getForegroundInfo(Continuation<? super ForegroundInfo> continuation) {
        return getForegroundInfo$suspendImpl(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        Intrinsics.checkNotNullExpressionValue(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.CoroutineWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker._init_$lambda$0(this.f$0);
            }
        }, getTaskExecutor().getSerialTaskExecutor());
        this.coroutineContext = Dispatchers.getDefault();
    }

    public final CompletableJob getJob$work_runtime_ktx_release() {
        return this.job;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.future.isCancelled()) {
            Job.DefaultImpls.cancel$default((Job) this$0.job, (CancellationException) null, 1, (Object) null);
        }
    }

    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039\u0004|\u0001z>T\u0002\u0006\u0004\u000b\u000b\u0001\u0007~q\u000b\u000f\t\u0004\u0012D\u0015\u0017\u0005\u0017\u001a}\u0017\u001b\u0015N\\", f = "\u0010;=9><04*\u001b24,%1k(0", i = {}, l = {68}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C08311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C08311(Continuation<? super C08311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C08311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = CoroutineWorker.this.doWork(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().setException(th);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(this.job)), null, null, new C08311(null), 3, null);
        return this.future;
    }

    static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, Continuation<? super ForegroundInfo> continuation) {
        throw new IllegalStateException("Not implemented");
    }

    public final Object setProgress(Data data, Continuation<? super Unit> continuation) throws Throwable {
        ListenableFuture<Void> progressAsync = setProgressAsync(data);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            progressAsync.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl2, progressAsync), DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new ListenableFutureKt$await$2$2(progressAsync));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, Continuation<? super Unit> continuation) throws Throwable {
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause == null) {
                    throw e2;
                }
                throw cause;
            }
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(cancellableContinuationImpl2, foregroundAsync), DirectExecutor.INSTANCE);
            cancellableContinuationImpl2.invokeOnCancellation(new ListenableFutureKt$await$2$2(foregroundAsync));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return result;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(getCoroutineContext().plus(completableJobJob$default));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(completableJobJob$default, null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039\u0004|\u0001z>T\u0002\u0006\u0004\u000b\u000b\u0001\u0007~q\u000b\u000f\t\u0004\u0012D\t\b\u0018j\u0015\u0019\r\u0010\u001c\u001a!\u001b\u0012w\u001e\u0017!s'.$\u001a[i", f = "\u0010;=9><04*\u001b24,%1k(0", i = {}, l = {134}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$jobFuture, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JobListenableFuture jobListenableFuture;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                jobListenableFuture = this.$jobFuture;
                this.L$0 = jobListenableFuture;
                this.label = 1;
                obj = this.this$0.getForegroundInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = (JobListenableFuture) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            jobListenableFuture.complete(obj);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }
}
