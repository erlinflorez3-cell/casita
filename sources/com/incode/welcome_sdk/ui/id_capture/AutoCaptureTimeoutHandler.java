package com.incode.welcome_sdk.ui.id_capture;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.camera.analysis.document.DocumentAnalysisEvent;
import com.incode.welcome_sdk.modules.IdScan;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoCaptureTimeoutHandler {

    /* JADX INFO: renamed from: f */
    private static int f14503f = 0;

    /* JADX INFO: renamed from: i */
    private static int f14504i = 1;

    /* JADX INFO: renamed from: a */
    private final IdScan f14505a;

    /* JADX INFO: renamed from: b */
    private final IdCaptureRepository f14506b;

    /* JADX INFO: renamed from: c */
    private final CoroutineDispatcher f14507c;

    /* JADX INFO: renamed from: d */
    private final String f14508d;

    /* JADX INFO: renamed from: e */
    private final IdCaptureAnalytics f14509e;

    /* JADX INFO: renamed from: g */
    private Job f14510g;

    /* JADX INFO: renamed from: h */
    private Job f14511h;

    /* JADX INFO: renamed from: j */
    private final String f14512j;

    public AutoCaptureTimeoutHandler(IdScan idScan, IdCaptureAnalytics idCaptureAnalytics, CoroutineDispatcher coroutineDispatcher, IdCaptureRepository idCaptureRepository) {
        Intrinsics.checkNotNullParameter(idScan, "");
        Intrinsics.checkNotNullParameter(idCaptureAnalytics, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(idCaptureRepository, "");
        this.f14505a = idScan;
        this.f14509e = idCaptureAnalytics;
        this.f14507c = coroutineDispatcher;
        this.f14506b = idCaptureRepository;
        this.f14508d = "Auto-capture-unclassified-id ->";
        this.f14512j = "Auto-capture-classified-id ->";
    }

    public static final /* synthetic */ IdCaptureAnalytics access$getAnalytics$p(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler) {
        int i2 = 2 % 2;
        int i3 = f14504i;
        int i4 = i3 + 101;
        f14503f = i4 % 128;
        int i5 = i4 % 2;
        IdCaptureAnalytics idCaptureAnalytics = autoCaptureTimeoutHandler.f14509e;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14503f = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 51 / 0;
        }
        return idCaptureAnalytics;
    }

    public static final /* synthetic */ String access$getAutoCaptureClassifiedIdPrefix$p(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler) {
        int i2 = 2 % 2;
        int i3 = f14503f + 59;
        int i4 = i3 % 128;
        f14504i = i4;
        int i5 = i3 % 2;
        String str = autoCaptureTimeoutHandler.f14512j;
        int i6 = i4 + 107;
        f14503f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ String access$getAutoCaptureUnclassifiedIdPrefix$p(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler) {
        int i2 = 2 % 2;
        int i3 = f14504i;
        int i4 = i3 + 7;
        f14503f = i4 % 128;
        int i5 = i4 % 2;
        String str = autoCaptureTimeoutHandler.f14508d;
        int i6 = i3 + 27;
        f14503f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ Job access$getAutoCaptureUnclassifiedTimerJob$p(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler) {
        int i2 = 2 % 2;
        int i3 = f14503f + 15;
        int i4 = i3 % 128;
        f14504i = i4;
        int i5 = i3 % 2;
        Object obj = null;
        Job job = autoCaptureTimeoutHandler.f14510g;
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 23;
        f14503f = i6 % 128;
        if (i6 % 2 == 0) {
            return job;
        }
        throw null;
    }

    public static final /* synthetic */ IdCaptureRepository access$getIdCaptureRepository$p(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler) {
        int i2 = 2 % 2;
        int i3 = f14503f + 65;
        int i4 = i3 % 128;
        f14504i = i4;
        int i5 = i3 % 2;
        IdCaptureRepository idCaptureRepository = autoCaptureTimeoutHandler.f14506b;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 79;
        f14503f = i6 % 128;
        int i7 = i6 % 2;
        return idCaptureRepository;
    }

    public static final /* synthetic */ IdScan access$getIdScan$p(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler) {
        int i2 = 2 % 2;
        int i3 = f14504i;
        int i4 = i3 + 5;
        f14503f = i4 % 128;
        int i5 = i4 % 2;
        IdScan idScan = autoCaptureTimeoutHandler.f14505a;
        int i6 = i3 + 69;
        f14503f = i6 % 128;
        int i7 = i6 % 2;
        return idScan;
    }

    public static final /* synthetic */ Flow access$idDetectedEvent(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, Flow flow) {
        int i2 = 2 % 2;
        int i3 = f14504i + 87;
        f14503f = i3 % 128;
        int i4 = i3 % 2;
        Flow<DocumentAnalysisEvent> flowA = a(flow);
        int i5 = f14504i + 107;
        f14503f = i5 % 128;
        if (i5 % 2 == 0) {
            return flowA;
        }
        throw null;
    }

    public /* synthetic */ AutoCaptureTimeoutHandler(IdScan idScan, IdCaptureAnalytics idCaptureAnalytics, CoroutineDispatcher coroutineDispatcher, IdCaptureRepository idCaptureRepository, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(idScan, idCaptureAnalytics, (i2 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher, idCaptureRepository);
    }

    public final void cancelAutoCaptureTimers() {
        int i2 = 2 % 2;
        int i3 = f14504i + 3;
        f14503f = i3 % 128;
        if (i3 % 2 == 0) {
            Job job = this.f14511h;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            Timber.Forest.d(this.f14512j + " Cancelled", new Object[0]);
            Job job2 = this.f14510g;
            if (job2 != null) {
                int i4 = f14503f + 31;
                f14504i = i4 % 128;
                int i5 = i4 % 2;
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            Timber.Forest.d(this.f14508d + " Cancelled", new Object[0]);
            return;
        }
        throw null;
    }

    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f */
        private static int f14513f = 1;

        /* JADX INFO: renamed from: h */
        private static int f14514h = 0;

        /* JADX INFO: renamed from: a */
        private int f14515a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f14517c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Flow<DocumentAnalysisEvent> f14518d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Function0<Unit> f14519e;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$b$1 */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a */
            private static int f14520a = 1;

            /* JADX INFO: renamed from: c */
            private static int f14521c = 0;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Function0<Unit> f14522b;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ AutoCaptureTimeoutHandler f14523d;

            /* JADX INFO: renamed from: e */
            private int f14524e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f14520a + 15;
                f14521c = i3 % 128;
                int i4 = i3 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.f14524e;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureUnclassifiedIdPrefix$p(this.f14523d) + " Start timer, duration: " + AutoCaptureTimeoutHandler.access$getIdScan$p(this.f14523d).getAutoCaptureNoIdTimeout() + "s.", new Object[0]);
                    this.f14524e = 1;
                    if (DelayKt.m10472delayVtjQ1oo(DurationKt.toDuration(AutoCaptureTimeoutHandler.access$getIdScan$p(this.f14523d).getAutoCaptureNoIdTimeout(), DurationUnit.SECONDS), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureUnclassifiedIdPrefix$p(this.f14523d) + " Expired, switching to manual capture.", new Object[0]);
                this.f14522b.invoke();
                Unit unit = Unit.INSTANCE;
                int i6 = f14521c + 67;
                f14520a = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14521c + 99;
                f14520a = i3 % 128;
                int i4 = i3 % 2;
                Object objD = d(coroutineScope, continuation);
                int i5 = f14521c + 67;
                f14520a = i5 % 128;
                int i6 = i5 % 2;
                return objD;
            }

            private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14521c + 81;
                f14520a = i3 % 128;
                int i4 = i3 % 2;
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return anonymousClass1.invokeSuspend(unit);
                }
                anonymousClass1.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14523d, this.f14522b, continuation);
                int i3 = f14521c + 11;
                f14520a = i3 % 128;
                if (i3 % 2 != 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.f14523d = autoCaptureTimeoutHandler;
                this.f14522b = function0;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$b$4 */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: c */
            private static int f14525c = 1;

            /* JADX INFO: renamed from: e */
            private static int f14526e = 0;

            /* JADX INFO: renamed from: a */
            private int f14527a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ AutoCaptureTimeoutHandler f14528b;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Flow<DocumentAnalysisEvent> f14529d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                int i3 = f14526e + 79;
                f14525c = i3 % 128;
                if (i3 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.f14527a;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f14527a = 1;
                    if (AutoCaptureTimeoutHandler.access$idDetectedEvent(this.f14528b, this.f14529d).collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.b.4.5

                        /* JADX INFO: renamed from: b */
                        private static int f14530b = 1;

                        /* JADX INFO: renamed from: e */
                        private static int f14531e = 0;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            int i5 = 2 % 2;
                            int i6 = f14530b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                            f14531e = i6 % 128;
                            if (i6 % 2 != 0) {
                                e();
                                throw null;
                            }
                            Object objE = e();
                            int i7 = f14530b + 73;
                            f14531e = i7 % 128;
                            int i8 = i7 % 2;
                            return objE;
                        }

                        private Object e() {
                            int i5 = 2 % 2;
                            int i6 = f14530b + 13;
                            f14531e = i6 % 128;
                            int i7 = i6 % 2;
                            Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureUnclassifiedIdPrefix$p(autoCaptureTimeoutHandler) + " Id detected, canceling.", new Object[0]);
                            Job jobAccess$getAutoCaptureUnclassifiedTimerJob$p = AutoCaptureTimeoutHandler.access$getAutoCaptureUnclassifiedTimerJob$p(autoCaptureTimeoutHandler);
                            if (jobAccess$getAutoCaptureUnclassifiedTimerJob$p != null) {
                                int i8 = f14530b + 103;
                                f14531e = i8 % 128;
                                if (i8 % 2 != 0) {
                                    Job.DefaultImpls.cancel$default(jobAccess$getAutoCaptureUnclassifiedTimerJob$p, (CancellationException) null, 0, (Object) null);
                                } else {
                                    Job.DefaultImpls.cancel$default(jobAccess$getAutoCaptureUnclassifiedTimerJob$p, (CancellationException) null, 1, (Object) null);
                                }
                            } else {
                                int i9 = f14531e + 73;
                                f14530b = i9 % 128;
                                int i10 = i9 % 2;
                            }
                            return Unit.INSTANCE;
                        }

                        AnonymousClass5() {
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = f14526e + 117;
                    f14525c = i5 % 128;
                    int i6 = i5 % 2;
                }
                Unit unit = Unit.INSTANCE;
                int i7 = f14526e + 19;
                f14525c = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$b$4$5 */
            static final class AnonymousClass5<T> implements FlowCollector {

                /* JADX INFO: renamed from: b */
                private static int f14530b = 1;

                /* JADX INFO: renamed from: e */
                private static int f14531e = 0;

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                    int i5 = 2 % 2;
                    int i6 = f14530b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f14531e = i6 % 128;
                    if (i6 % 2 != 0) {
                        e();
                        throw null;
                    }
                    Object objE = e();
                    int i7 = f14530b + 73;
                    f14531e = i7 % 128;
                    int i8 = i7 % 2;
                    return objE;
                }

                private Object e() {
                    int i5 = 2 % 2;
                    int i6 = f14530b + 13;
                    f14531e = i6 % 128;
                    int i7 = i6 % 2;
                    Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureUnclassifiedIdPrefix$p(autoCaptureTimeoutHandler) + " Id detected, canceling.", new Object[0]);
                    Job jobAccess$getAutoCaptureUnclassifiedTimerJob$p = AutoCaptureTimeoutHandler.access$getAutoCaptureUnclassifiedTimerJob$p(autoCaptureTimeoutHandler);
                    if (jobAccess$getAutoCaptureUnclassifiedTimerJob$p != null) {
                        int i8 = f14530b + 103;
                        f14531e = i8 % 128;
                        if (i8 % 2 != 0) {
                            Job.DefaultImpls.cancel$default(jobAccess$getAutoCaptureUnclassifiedTimerJob$p, (CancellationException) null, 0, (Object) null);
                        } else {
                            Job.DefaultImpls.cancel$default(jobAccess$getAutoCaptureUnclassifiedTimerJob$p, (CancellationException) null, 1, (Object) null);
                        }
                    } else {
                        int i9 = f14531e + 73;
                        f14530b = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    return Unit.INSTANCE;
                }

                AnonymousClass5() {
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14526e + 51;
                f14525c = i3 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 == 0) {
                    c(coroutineScope2, continuation2);
                    throw null;
                }
                Object objC = c(coroutineScope2, continuation2);
                int i4 = f14526e + 87;
                f14525c = i4 % 128;
                if (i4 % 2 != 0) {
                    return objC;
                }
                throw null;
            }

            private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14525c + 17;
                f14526e = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f14526e + 35;
                f14525c = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f14528b, this.f14529d, continuation);
                int i3 = f14525c + 23;
                f14526e = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass4;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, Flow<? extends DocumentAnalysisEvent> flow, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.f14528b = autoCaptureTimeoutHandler;
                this.f14529d = flow;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f14517c;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AutoCaptureTimeoutHandler.this, this.f14519e, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(AutoCaptureTimeoutHandler.this, this.f14518d, null), 3, null);
            Unit unit = Unit.INSTANCE;
            int i3 = f14514h + 107;
            f14513f = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14514h + 47;
            f14513f = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(coroutineScope, continuation);
            int i5 = f14514h + 81;
            f14513f = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14514h + 29;
            f14513f = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return bVar.invokeSuspend(unit);
            }
            bVar.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = AutoCaptureTimeoutHandler.this.new b(this.f14519e, this.f14518d, continuation);
            bVar.f14517c = obj;
            b bVar2 = bVar;
            int i3 = f14513f + 39;
            f14514h = i3 % 128;
            int i4 = i3 % 2;
            return bVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<Unit> function0, Flow<? extends DocumentAnalysisEvent> flow, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14519e = function0;
            this.f14518d = flow;
        }
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f */
        private static int f14533f = 1;

        /* JADX INFO: renamed from: i */
        private static int f14534i = 0;

        /* JADX INFO: renamed from: a */
        private int f14535a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Flow<DocumentAnalysisEvent> f14536b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function0<Unit> f14537c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Object f14539e;

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$c$4 */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: f */
            private static int f14540f = 1;

            /* JADX INFO: renamed from: i */
            private static int f14541i = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ Flow<DocumentAnalysisEvent> f14542a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f14543b;

            /* JADX INFO: renamed from: c */
            private int f14544c;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ Function0<Unit> f14545d;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ AutoCaptureTimeoutHandler f14546e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f14544c;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f14543b;
                    this.f14544c = 1;
                    if (AutoCaptureTimeoutHandler.access$idDetectedEvent(this.f14546e, this.f14542a).collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.4.4

                        /* JADX INFO: renamed from: a */
                        private static int f14547a = 0;

                        /* JADX INFO: renamed from: e */
                        private static int f14548e = 1;

                        /* JADX INFO: renamed from: b */
                        private /* synthetic */ Function0<Unit> f14549b;

                        /* JADX INFO: renamed from: d */
                        private /* synthetic */ CoroutineScope f14551d;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            int i4 = 2 % 2;
                            int i5 = f14548e + 29;
                            f14547a = i5 % 128;
                            DocumentAnalysisEvent documentAnalysisEvent = (DocumentAnalysisEvent) obj2;
                            if (i5 % 2 == 0) {
                                return b(documentAnalysisEvent);
                            }
                            b(documentAnalysisEvent);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$c$4$4$5 */
                        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                            /* JADX INFO: renamed from: a */
                            private static int f14552a = 0;

                            /* JADX INFO: renamed from: e */
                            private static int f14553e = 1;

                            /* JADX INFO: renamed from: b */
                            private /* synthetic */ AutoCaptureTimeoutHandler f14554b;

                            /* JADX INFO: renamed from: c */
                            private int f14555c;

                            /* JADX INFO: renamed from: d */
                            private /* synthetic */ Function0<Unit> f14556d;

                            /* JADX WARN: Code restructure failed: missing block: B:25:0x001b, code lost:
                            
                                if (r1 == 1) goto L26;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
                            
                                kotlin.ResultKt.throwOnFailure(r9);
                                r1 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14553e + 39;
                                com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14552a = r1 % 128;
                                r1 = r1 % 2;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
                            
                                if (r0 == 1) goto L26;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
                            
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                             */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[RETURN] */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                                /*
                                    r8 = this;
                                    r2 = 2
                                    int r0 = r2 % r2
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14552a
                                    int r1 = r0 + 41
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14553e = r0
                                    int r1 = r1 % r2
                                    r3 = 0
                                    r5 = 1
                                    if (r1 != 0) goto L51
                                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r1 = r8.f14555c
                                    r0 = 10
                                    int r0 = r0 / r3
                                    if (r1 == 0) goto L5c
                                    if (r1 != r5) goto Lac
                                L1d:
                                    kotlin.ResultKt.throwOnFailure(r9)
                                    int r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14553e
                                    int r1 = r0 + 39
                                    int r0 = r1 % 128
                                    com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14552a = r0
                                    int r1 = r1 % r2
                                L29:
                                    timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                                    com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler r0 = r8.f14554b
                                    java.lang.String r1 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(r0)
                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                    r0.<init>()
                                    java.lang.StringBuilder r1 = r0.append(r1)
                                    java.lang.String r0 = " Expired, switching to manual capture."
                                    java.lang.StringBuilder r0 = r1.append(r0)
                                    java.lang.String r1 = r0.toString()
                                    java.lang.Object[] r0 = new java.lang.Object[r3]
                                    r2.d(r1, r0)
                                    kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.f14556d
                                    r0.invoke()
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                L51:
                                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r0 = r8.f14555c
                                    if (r0 == 0) goto L5c
                                    if (r0 != r5) goto Lac
                                    goto L1d
                                L5c:
                                    kotlin.ResultKt.throwOnFailure(r9)
                                    com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler r0 = r8.f14554b
                                    com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.access$getIdCaptureRepository$p(r0)
                                    int r2 = r0.getAutoCaptureTimeoutSinceFirstClassificationInSeconds()
                                    timber.log.Timber$Forest r6 = timber.log.Timber.Forest
                                    com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler r0 = r8.f14554b
                                    java.lang.String r7 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(r0)
                                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                    java.lang.String r0 = "\n                                    |"
                                    r1.<init>(r0)
                                    java.lang.StringBuilder r1 = r1.append(r7)
                                    java.lang.String r0 = " Document detected.\n                                    |Start auto-capture timer, delay for "
                                    java.lang.StringBuilder r0 = r1.append(r0)
                                    java.lang.StringBuilder r1 = r0.append(r2)
                                    java.lang.String r0 = "s.\n                                "
                                    java.lang.StringBuilder r0 = r1.append(r0)
                                    java.lang.String r1 = r0.toString()
                                    r0 = 0
                                    java.lang.String r1 = kotlin.text.StringsKt.trimMargin$default(r1, r0, r5, r0)
                                    java.lang.Object[] r0 = new java.lang.Object[r3]
                                    r6.d(r1, r0)
                                    kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                                    long r1 = kotlin.time.DurationKt.toDuration(r2, r0)
                                    r0 = r8
                                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                    r8.f14555c = r5
                                    java.lang.Object r0 = kotlinx.coroutines.DelayKt.m10472delayVtjQ1oo(r1, r0)
                                    if (r0 != r4) goto L29
                                    return r4
                                Lac:
                                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r0)
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                int i2 = 2 % 2;
                                int i3 = f14553e + 25;
                                f14552a = i3 % 128;
                                int i4 = i3 % 2;
                                Object objC = c(coroutineScope, continuation);
                                int i5 = f14553e + 65;
                                f14552a = i5 % 128;
                                if (i5 % 2 == 0) {
                                    return objC;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }

                            private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                int i2 = 2 % 2;
                                int i3 = f14553e + 53;
                                f14552a = i3 % 128;
                                int i4 = i3 % 2;
                                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                int i5 = f14553e + 97;
                                f14552a = i5 % 128;
                                if (i5 % 2 == 0) {
                                    return objInvokeSuspend;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                int i2 = 2 % 2;
                                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f14554b, this.f14556d, continuation);
                                int i3 = f14553e + 83;
                                f14552a = i3 % 128;
                                if (i3 % 2 == 0) {
                                    return anonymousClass5;
                                }
                                throw null;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass5(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, Function0<Unit> function0, Continuation<? super AnonymousClass5> continuation) {
                                super(2, continuation);
                                this.f14554b = autoCaptureTimeoutHandler;
                                this.f14556d = function0;
                            }
                        }

                        private Object b(DocumentAnalysisEvent documentAnalysisEvent) {
                            int i4 = 2 % 2;
                            Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(autoCaptureTimeoutHandler) + " Event: " + documentAnalysisEvent, new Object[0]);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(autoCaptureTimeoutHandler, function0, null), 3, null);
                            Unit unit = Unit.INSTANCE;
                            int i5 = f14548e + 125;
                            f14547a = i5 % 128;
                            if (i5 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }

                        C02514(CoroutineScope coroutineScope2, Function0<Unit> function0) {
                            coroutineScope = coroutineScope2;
                            function0 = function0;
                        }
                    }, this) == coroutine_suspended) {
                        int i4 = f14540f + 17;
                        f14541i = i4 % 128;
                        if (i4 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i5 = f14541i + 25;
                    f14540f = i5 % 128;
                    int i6 = i5 % 2;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$c$4$4 */
            static final class C02514<T> implements FlowCollector {

                /* JADX INFO: renamed from: a */
                private static int f14547a = 0;

                /* JADX INFO: renamed from: e */
                private static int f14548e = 1;

                /* JADX INFO: renamed from: b */
                private /* synthetic */ Function0<Unit> f14549b;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ CoroutineScope f14551d;

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    int i4 = 2 % 2;
                    int i5 = f14548e + 29;
                    f14547a = i5 % 128;
                    DocumentAnalysisEvent documentAnalysisEvent = (DocumentAnalysisEvent) obj2;
                    if (i5 % 2 == 0) {
                        return b(documentAnalysisEvent);
                    }
                    b(documentAnalysisEvent);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$c$4$4$5 */
                static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a */
                    private static int f14552a = 0;

                    /* JADX INFO: renamed from: e */
                    private static int f14553e = 1;

                    /* JADX INFO: renamed from: b */
                    private /* synthetic */ AutoCaptureTimeoutHandler f14554b;

                    /* JADX INFO: renamed from: c */
                    private int f14555c;

                    /* JADX INFO: renamed from: d */
                    private /* synthetic */ Function0<Unit> f14556d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object v2) {
                        /*
                            this = this;
                            r2 = 2
                            int r0 = r2 % r2
                            int r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14552a
                            int r1 = r0 + 41
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14553e = r0
                            int r1 = r1 % r2
                            r3 = 0
                            r5 = 1
                            if (r1 != 0) goto L51
                            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r8.f14555c
                            r0 = 10
                            int r0 = r0 / r3
                            if (r1 == 0) goto L5c
                            if (r1 != r5) goto Lac
                        L1d:
                            kotlin.ResultKt.throwOnFailure(r9)
                            int r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14553e
                            int r1 = r0 + 39
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.f14552a = r0
                            int r1 = r1 % r2
                        L29:
                            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                            com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler r0 = r8.f14554b
                            java.lang.String r1 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(r0)
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.StringBuilder r1 = r0.append(r1)
                            java.lang.String r0 = " Expired, switching to manual capture."
                            java.lang.StringBuilder r0 = r1.append(r0)
                            java.lang.String r1 = r0.toString()
                            java.lang.Object[] r0 = new java.lang.Object[r3]
                            r2.d(r1, r0)
                            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.f14556d
                            r0.invoke()
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L51:
                            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r0 = r8.f14555c
                            if (r0 == 0) goto L5c
                            if (r0 != r5) goto Lac
                            goto L1d
                        L5c:
                            kotlin.ResultKt.throwOnFailure(r9)
                            com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler r0 = r8.f14554b
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureRepository r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.access$getIdCaptureRepository$p(r0)
                            int r2 = r0.getAutoCaptureTimeoutSinceFirstClassificationInSeconds()
                            timber.log.Timber$Forest r6 = timber.log.Timber.Forest
                            com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler r0 = r8.f14554b
                            java.lang.String r7 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(r0)
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r0 = "\n                                    |"
                            r1.<init>(r0)
                            java.lang.StringBuilder r1 = r1.append(r7)
                            java.lang.String r0 = " Document detected.\n                                    |Start auto-capture timer, delay for "
                            java.lang.StringBuilder r0 = r1.append(r0)
                            java.lang.StringBuilder r1 = r0.append(r2)
                            java.lang.String r0 = "s.\n                                "
                            java.lang.StringBuilder r0 = r1.append(r0)
                            java.lang.String r1 = r0.toString()
                            r0 = 0
                            java.lang.String r1 = kotlin.text.StringsKt.trimMargin$default(r1, r0, r5, r0)
                            java.lang.Object[] r0 = new java.lang.Object[r3]
                            r6.d(r1, r0)
                            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
                            long r1 = kotlin.time.DurationKt.toDuration(r2, r0)
                            r0 = r8
                            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                            r8.f14555c = r5
                            java.lang.Object r0 = kotlinx.coroutines.DelayKt.m10472delayVtjQ1oo(r1, r0)
                            if (r0 != r4) goto L29
                            return r4
                        Lac:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r0)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler.c.AnonymousClass4.C02514.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        int i2 = 2 % 2;
                        int i3 = f14553e + 25;
                        f14552a = i3 % 128;
                        int i4 = i3 % 2;
                        Object objC = c(coroutineScope, continuation);
                        int i5 = f14553e + 65;
                        f14552a = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objC;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        int i2 = 2 % 2;
                        int i3 = f14553e + 53;
                        f14552a = i3 % 128;
                        int i4 = i3 % 2;
                        Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        int i5 = f14553e + 97;
                        f14552a = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objInvokeSuspend;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        int i2 = 2 % 2;
                        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f14554b, this.f14556d, continuation);
                        int i3 = f14553e + 83;
                        f14552a = i3 % 128;
                        if (i3 % 2 == 0) {
                            return anonymousClass5;
                        }
                        throw null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass5(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, Function0<Unit> function0, Continuation<? super AnonymousClass5> continuation) {
                        super(2, continuation);
                        this.f14554b = autoCaptureTimeoutHandler;
                        this.f14556d = function0;
                    }
                }

                private Object b(DocumentAnalysisEvent documentAnalysisEvent) {
                    int i4 = 2 % 2;
                    Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(autoCaptureTimeoutHandler) + " Event: " + documentAnalysisEvent, new Object[0]);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(autoCaptureTimeoutHandler, function0, null), 3, null);
                    Unit unit = Unit.INSTANCE;
                    int i5 = f14548e + 125;
                    f14547a = i5 % 128;
                    if (i5 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                C02514(CoroutineScope coroutineScope2, Function0<Unit> function0) {
                    coroutineScope = coroutineScope2;
                    function0 = function0;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14540f + 97;
                f14541i = i3 % 128;
                int i4 = i3 % 2;
                Object objE = e(coroutineScope, continuation);
                if (i4 != 0) {
                    int i5 = 20 / 0;
                }
                return objE;
            }

            private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14540f + 9;
                f14541i = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f14540f + 11;
                f14541i = i5 % 128;
                if (i5 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f14546e, this.f14542a, this.f14545d, continuation);
                anonymousClass4.f14543b = obj;
                AnonymousClass4 anonymousClass42 = anonymousClass4;
                int i3 = f14540f + 47;
                f14541i = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass42;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(AutoCaptureTimeoutHandler autoCaptureTimeoutHandler, Flow<? extends DocumentAnalysisEvent> flow, Function0<Unit> function0, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.f14546e = autoCaptureTimeoutHandler;
                this.f14542a = flow;
                this.f14545d = function0;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f14539e;
            Timber.Forest.d(AutoCaptureTimeoutHandler.access$getAutoCaptureClassifiedIdPrefix$p(AutoCaptureTimeoutHandler.this) + " Listening for a good frame to start the timer.", new Object[0]);
            AutoCaptureTimeoutHandler.access$getAnalytics$p(AutoCaptureTimeoutHandler.this).clearEventValues();
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(AutoCaptureTimeoutHandler.this, this.f14536b, this.f14537c, null), 3, null);
            Unit unit = Unit.INSTANCE;
            int i3 = f14534i + 45;
            f14533f = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 28 / 0;
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14533f + 117;
            f14534i = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                return a(coroutineScope2, continuation2);
            }
            a(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14534i + 91;
            f14533f = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f14533f + 31;
            f14534i = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = AutoCaptureTimeoutHandler.this.new c(this.f14536b, this.f14537c, continuation);
            cVar.f14539e = obj;
            c cVar2 = cVar;
            int i3 = f14534i + 85;
            f14533f = i3 % 128;
            int i4 = i3 % 2;
            return cVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Flow<? extends DocumentAnalysisEvent> flow, Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f14536b = flow;
            this.f14537c = function0;
        }
    }

    public final void startAutoCaptureExpirationTimer(Flow<? extends DocumentAnalysisEvent> flow, CoroutineScope coroutineScope, Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function0, "");
        cancelAutoCaptureTimers();
        this.f14510g = BuildersKt__Builders_commonKt.launch$default(coroutineScope, this.f14507c, null, new b(function0, flow, null), 2, null);
        this.f14511h = BuildersKt__Builders_commonKt.launch$default(coroutineScope, this.f14507c, null, new c(flow, function0, null), 2, null);
        int i3 = f14504i + 93;
        f14503f = i3 % 128;
        int i4 = i3 % 2;
    }

    private static Flow<DocumentAnalysisEvent> a(final Flow<? extends DocumentAnalysisEvent> flow) {
        int i2 = 2 % 2;
        Flow<DocumentAnalysisEvent> flowTake = FlowKt.take(new Flow<DocumentAnalysisEvent>() { // from class: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f14557c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f14558d = 1;

            /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f14560a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f14561b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ FlowCollector f14562d;

                /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
                    /*
                        r8 = this;
                        r7 = 2
                        int r0 = r7 % r7
                        int r0 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.f14560a
                        int r1 = r0 + 125
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.f14561b = r0
                        int r1 = r1 % r7
                        boolean r0 = r10 instanceof com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L5f
                        r6 = r10
                        com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1$2$1 r6 = (com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r6
                        int r0 = r6.f14565b
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L5f
                        int r0 = r6.f14565b
                        int r0 = r0 - r1
                        r6.f14565b = r0
                    L1f:
                        java.lang.Object r1 = r6.f14567e
                        java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r6.f14565b
                        r4 = 1
                        if (r0 == 0) goto L32
                        if (r0 != r4) goto L65
                        kotlin.ResultKt.throwOnFailure(r1)
                    L2f:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L32:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r3 = r8.f14562d
                        r0 = r6
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        r1 = r9
                        com.incode.camera.analysis.document.DocumentAnalysisEvent r1 = (com.incode.camera.analysis.document.DocumentAnalysisEvent) r1
                        boolean r0 = r1 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.NotAligned
                        if (r0 != 0) goto L46
                        boolean r0 = r1 instanceof com.incode.camera.analysis.document.DocumentAnalysisEvent.BoundsDetected
                        r0 = r0 ^ r4
                        if (r0 == r4) goto L2f
                    L46:
                        int r2 = com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.f14560a
                        int r1 = r2 + 67
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.f14561b = r0
                        int r1 = r1 % r7
                        int r1 = r2 + 99
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.f14561b = r0
                        int r1 = r1 % r7
                        r6.f14565b = r4
                        java.lang.Object r0 = r3.emit(r9, r6)
                        if (r0 != r5) goto L2f
                        return r5
                    L5f:
                        com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1$2$1 r6 = new com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1$2$1
                        r6.<init>(r10)
                        goto L1f
                    L65:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.AutoCaptureTimeoutHandler$idDetectedEvent$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f14563a = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f14564d = 1;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f14565b;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    /* synthetic */ Object f14567e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = f14564d + 107;
                        f14563a = i3 % 128;
                        int i4 = i3 % 2;
                        this.f14567e = obj;
                        this.f14565b |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass2.this.emit(null, this);
                        int i5 = f14563a + 19;
                        f14564d = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 70 / 0;
                        }
                        return objEmit;
                    }

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f14562d = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super DocumentAnalysisEvent> flowCollector, Continuation continuation) {
                int i3 = 2 % 2;
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return Unit.INSTANCE;
                }
                int i4 = f14557c + 89;
                f14558d = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 76 / 0;
                }
                return objCollect;
            }
        }, 1);
        int i3 = f14504i + 89;
        f14503f = i3 % 128;
        int i4 = i3 % 2;
        return flowTake;
    }
}
