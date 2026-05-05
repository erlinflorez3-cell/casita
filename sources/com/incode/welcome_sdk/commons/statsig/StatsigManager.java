package com.incode.welcome_sdk.commons.statsig;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.c.a.i;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.commons.statsig.StatsigFeature;
import com.statsig.androidsdk.IStatsigCallback;
import com.statsig.androidsdk.InitializationDetails;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Statsig;
import com.statsig.androidsdk.StatsigOptions;
import com.statsig.androidsdk.StatsigUser;
import com.statsig.androidsdk.Tier;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class StatsigManager {
    public static final int $stable;
    private static final MutableStateFlow<Boolean> _statsigInitialized;

    /* JADX INFO: renamed from: a */
    private static int f5382a = 0;

    /* JADX INFO: renamed from: b */
    private static int f5383b = 0;
    private static String clientExperimentId = null;

    /* JADX INFO: renamed from: d */
    private static int f5384d = 1;

    /* JADX INFO: renamed from: e */
    private static int f5385e = 1;
    private static final IStatsigCallback initCallback;
    private static Job initJob = null;
    private static boolean initializeOffline = false;
    private static final StateFlow<Boolean> statsigInitialized;
    public static final StatsigManager INSTANCE = new StatsigManager();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());

    private StatsigManager() {
    }

    public static final /* synthetic */ String access$getClientExperimentId$p() {
        int i2 = 2 % 2;
        int i3 = f5384d;
        int i4 = i3 + 29;
        f5383b = i4 % 128;
        int i5 = i4 % 2;
        String str = clientExperimentId;
        int i6 = i3 + 17;
        f5383b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final /* synthetic */ IStatsigCallback access$getInitCallback$p() {
        int i2 = 2 % 2;
        int i3 = f5383b + 17;
        f5384d = i3 % 128;
        if (i3 % 2 != 0) {
            return initCallback;
        }
        throw null;
    }

    public static final /* synthetic */ Job access$getInitJob$p() {
        int i2 = 2 % 2;
        int i3 = f5384d + 21;
        f5383b = i3 % 128;
        if (i3 % 2 == 0) {
            return initJob;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access$getInitializeOffline$p() {
        int i2 = 2 % 2;
        int i3 = f5384d + 115;
        f5383b = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = initializeOffline;
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        return z2;
    }

    public static final /* synthetic */ StateFlow access$getStatsigInitialized$p() {
        int i2 = 2 % 2;
        int i3 = f5383b;
        int i4 = i3 + 105;
        f5384d = i4 % 128;
        int i5 = i4 % 2;
        StateFlow<Boolean> stateFlow = statsigInitialized;
        int i6 = i3 + 97;
        f5384d = i6 % 128;
        int i7 = i6 % 2;
        return stateFlow;
    }

    public static final /* synthetic */ MutableStateFlow access$get_statsigInitialized$p() {
        int i2 = 2 % 2;
        int i3 = f5383b + 97;
        f5384d = i3 % 128;
        if (i3 % 2 != 0) {
            return _statsigInitialized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        _statsigInitialized = MutableStateFlow;
        statsigInitialized = MutableStateFlow;
        initializeOffline = true;
        initCallback = new e();
        $stable = 8;
        int i2 = f5382a + 93;
        f5385e = i2 % 128;
        int i3 = i2 % 2;
    }

    public static final class e implements IStatsigCallback {

        /* JADX INFO: renamed from: b */
        private static int f5423b = 0;

        /* JADX INFO: renamed from: c */
        private static int f5424c = 1;

        e() {
        }

        @Override // com.statsig.androidsdk.IStatsigCallback
        public final void onStatsigInitialize() {
            int i2 = 2 % 2;
            int i3 = f5424c + 115;
            f5423b = i3 % 128;
            int i4 = i3 % 2;
            IStatsigCallback.DefaultImpls.onStatsigInitialize(this);
            if (i4 != 0) {
                throw null;
            }
        }

        @Override // com.statsig.androidsdk.IStatsigCallback
        public final void onStatsigInitialize(InitializationDetails initializationDetails) {
            Object value;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(initializationDetails, "");
            MutableStateFlow mutableStateFlowAccess$get_statsigInitialized$p = StatsigManager.access$get_statsigInitialized$p();
            int i3 = f5423b + 25;
            f5424c = i3 % 128;
            int i4 = i3 % 2;
            do {
                value = mutableStateFlowAccess$get_statsigInitialized$p.getValue();
            } while (!mutableStateFlowAccess$get_statsigInitialized$p.compareAndSet(value, Boolean.valueOf(initializationDetails.getSuccess())));
            InitializeResponse.FailedInitializeResponse failureDetails = initializationDetails.getFailureDetails();
            if (failureDetails != null) {
                int i5 = f5424c + 61;
                f5423b = i5 % 128;
                int i6 = i5 % 2;
                Timber.Forest.e(failureDetails.getException(), "Error while initialising Statsig. Status code: " + failureDetails.getStatusCode(), new Object[0]);
            }
            Timber.Forest.d("Statsig initialised successfully: " + initializationDetails.getSuccess(), new Object[0]);
            Timber.Forest.d(StatsigFeature.c.f5373a.dumpState(), new Object[0]);
            Timber.Forest.d(StatsigFeature.d.f5377c.dumpState(), new Object[0]);
        }

        @Override // com.statsig.androidsdk.IStatsigCallback
        public final void onStatsigUpdateUser() {
            int i2 = 2 % 2;
            int i3 = f5423b + 51;
            f5424c = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.d("Statsig User updated.", new Object[0]);
            int i5 = f5424c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5423b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 67 / 0;
            }
        }
    }

    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f5386b = 0;

        /* JADX INFO: renamed from: c */
        private static int f5387c = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ CompletableEmitter f5388a;

        /* JADX INFO: renamed from: d */
        private int f5389d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Object f5390e;

        static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a */
            private static int f5391a = 0;

            /* JADX INFO: renamed from: b */
            private static int f5392b = 1;

            /* JADX INFO: renamed from: c */
            private int f5393c;

            /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a */
            static final class C0217a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

                /* JADX INFO: renamed from: a */
                private static int f5394a = 1;

                /* JADX INFO: renamed from: e */
                private static int f5395e = 0;

                /* JADX INFO: renamed from: d */
                private int f5396d;

                /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a$e */
                public static final class C0218e implements Flow<Boolean> {

                    /* JADX INFO: renamed from: a */
                    private static int f5397a = 0;

                    /* JADX INFO: renamed from: e */
                    private static int f5398e = 1;

                    /* JADX INFO: renamed from: b */
                    private /* synthetic */ Flow f5399b;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a$e$4 */
                    public static final class AnonymousClass4<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a */
                        private static int f5400a = 0;

                        /* JADX INFO: renamed from: e */
                        private static int f5401e = 1;

                        /* JADX INFO: renamed from: d */
                        private /* synthetic */ FlowCollector f5402d;

                        /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
                        
                            if (r2.emit(r8, r4) == r3) goto L46;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:46:0x0053, code lost:
                        
                            return r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x005a, code lost:
                        
                            if (r2.emit(r8, r4) == r3) goto L46;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:33:0x0008  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                            /*
                                r7 = this;
                                r6 = 2
                                int r0 = r6 % r6
                                boolean r0 = r9 instanceof com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.AnonymousClass5
                                r5 = 1
                                if (r0 == r5) goto L5d
                            L8:
                                com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a$e$4$5 r4 = new com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a$e$4$5
                                r4.<init>(r9)
                            Ld:
                                java.lang.Object r1 = r4.f5405b
                                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r4.f5406c
                                if (r0 == 0) goto L28
                                if (r0 != r5) goto L7e
                                kotlin.ResultKt.throwOnFailure(r1)
                            L1c:
                                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                int r0 = com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5401e
                                int r1 = r0 + 13
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5400a = r0
                                int r1 = r1 % r6
                                return r2
                            L28:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r2 = r7.f5402d
                                r0 = r4
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r0 = r8
                                java.lang.Boolean r0 = (java.lang.Boolean) r0
                                boolean r0 = r0.booleanValue()
                                if (r0 == 0) goto L1c
                                int r0 = com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5400a
                                int r1 = r0 + 19
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5401e = r0
                                int r1 = r1 % r6
                                int r1 = r0 + 35
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5400a = r0
                                int r1 = r1 % r6
                                if (r1 == 0) goto L54
                                r4.f5406c = r5
                                java.lang.Object r0 = r2.emit(r8, r4)
                                if (r0 != r3) goto L1c
                            L53:
                                return r3
                            L54:
                                r4.f5406c = r5
                                java.lang.Object r0 = r2.emit(r8, r4)
                                if (r0 != r3) goto L1c
                                goto L53
                            L5d:
                                r4 = r9
                                com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a$e$4$5 r4 = (com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.AnonymousClass5) r4
                                int r0 = r4.f5406c
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r2
                                if (r0 == 0) goto L8
                                int r0 = com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5401e
                                int r1 = r0 + 53
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.f5400a = r0
                                int r1 = r1 % r6
                                if (r1 == 0) goto L78
                                int r0 = r4.f5406c
                                int r0 = r0 >> r2
                                r4.f5406c = r0
                                goto Ld
                            L78:
                                int r0 = r4.f5406c
                                int r0 = r0 - r2
                                r4.f5406c = r0
                                goto Ld
                            L7e:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.statsig.StatsigManager.a.e.C0217a.C0218e.AnonymousClass4.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.statsig.StatsigManager$a$e$a$e$4$5 */
                        public static final class AnonymousClass5 extends ContinuationImpl {

                            /* JADX INFO: renamed from: a */
                            private static int f5403a = 1;

                            /* JADX INFO: renamed from: d */
                            private static int f5404d = 0;

                            /* JADX INFO: renamed from: b */
                            /* synthetic */ Object f5405b;

                            /* JADX INFO: renamed from: c */
                            int f5406c;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f5404d + 7;
                                f5403a = i3 % 128;
                                int i4 = i3 % 2;
                                this.f5405b = obj;
                                this.f5406c |= Integer.MIN_VALUE;
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                if (i4 == 0) {
                                    anonymousClass4.emit(null, this);
                                    throw null;
                                }
                                Object objEmit = anonymousClass4.emit(null, this);
                                int i5 = f5404d + 83;
                                f5403a = i5 % 128;
                                int i6 = i5 % 2;
                                return objEmit;
                            }

                            public AnonymousClass5(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass4(FlowCollector flowCollector) {
                            this.f5402d = flowCollector;
                        }
                    }

                    public C0218e(Flow flow) {
                        this.f5399b = flow;
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        int i2 = 2 % 2;
                        Object objCollect = this.f5399b.collect(new AnonymousClass4(flowCollector), continuation);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return Unit.INSTANCE;
                        }
                        int i3 = f5397a + 5;
                        f5398e = i3 % 128;
                        if (i3 % 2 != 0) {
                            return objCollect;
                        }
                        throw null;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int i2 = 2 % 2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = this.f5396d;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f5396d = 1;
                        obj = FlowKt.first(new C0218e(StatsigManager.access$getStatsigInitialized$p()), this);
                        if (obj == coroutine_suspended) {
                            int i4 = f5395e + 25;
                            int i5 = i4 % 128;
                            f5394a = i5;
                            int i6 = i4 % 2;
                            int i7 = i5 + 73;
                            f5395e = i7 % 128;
                            int i8 = i7 % 2;
                            return coroutine_suspended;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    int i2 = 2 % 2;
                    int i3 = f5395e + 33;
                    f5394a = i3 % 128;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Continuation<? super Boolean> continuation2 = continuation;
                    if (i3 % 2 == 0) {
                        c(coroutineScope2, continuation2);
                        throw null;
                    }
                    Object objC = c(coroutineScope2, continuation2);
                    int i4 = f5394a + 59;
                    f5395e = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objC;
                    }
                    throw null;
                }

                private Object c(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    int i2 = 2 % 2;
                    int i3 = f5394a + 41;
                    f5395e = i3 % 128;
                    int i4 = i3 % 2;
                    C0217a c0217a = (C0217a) create(coroutineScope, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i4 != 0) {
                        c0217a.invokeSuspend(unit);
                        throw null;
                    }
                    Object objInvokeSuspend = c0217a.invokeSuspend(unit);
                    int i5 = f5394a + 47;
                    f5395e = i5 % 128;
                    int i6 = i5 % 2;
                    return objInvokeSuspend;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i2 = 2 % 2;
                    C0217a c0217a = new C0217a(continuation);
                    int i3 = f5394a + 93;
                    f5395e = i3 % 128;
                    int i4 = i3 % 2;
                    return c0217a;
                }

                C0217a(Continuation<? super C0217a> continuation) {
                    super(2, continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i2 = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f5393c;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f5393c = 1;
                    obj = TimeoutKt.withTimeoutOrNull(2500L, new C0217a(null), this);
                    if (obj == coroutine_suspended) {
                        int i4 = f5391a + 19;
                        f5392b = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 64 / 0;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    Timber.Forest.w("Statsig not initialized after timeout.", new Object[0]);
                }
                if ((bool == null || StatsigManager.access$getInitializeOffline$p()) && Intrinsics.areEqual("experimentV2", StatsigManager.access$getClientExperimentId$p())) {
                    int i6 = f5391a + 41;
                    f5392b = i6 % 128;
                    if (i6 % 2 == 0) {
                        Statsig.overrideGate(StatsigFeature.c.f5373a.getFeatureName(), false);
                    } else {
                        Statsig.overrideGate(StatsigFeature.c.f5373a.getFeatureName(), true);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f5391a + 21;
                f5392b = i3 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 == 0) {
                    e(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objE = e(coroutineScope2, continuation2);
                int i4 = f5391a + 97;
                f5392b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 9 / 0;
                }
                return objE;
            }

            private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f5392b + 103;
                f5391a = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i4 != 0) {
                    int i5 = 47 / 0;
                }
                int i6 = f5392b + 41;
                f5391a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 70 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                e eVar = new e(continuation);
                int i3 = f5392b + 77;
                f5391a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 43 / 0;
                }
                return eVar;
            }

            e(Continuation<? super e> continuation) {
                super(2, continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i2 = 2 % 2;
            int i3 = f5386b + 1;
            f5387c = i3 % 128;
            if (i3 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f5389d;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f5390e;
                MutableStateFlow mutableStateFlowAccess$get_statsigInitialized$p = StatsigManager.access$get_statsigInitialized$p();
                do {
                    value = mutableStateFlowAccess$get_statsigInitialized$p.getValue();
                } while (!mutableStateFlowAccess$get_statsigInitialized$p.compareAndSet(value, Boxing.boxBoolean(Statsig.isInitialized())));
                this.f5389d = 1;
                if (BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new e(null), 3, null).await(this) == coroutine_suspended) {
                    int i5 = f5386b + 37;
                    f5387c = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = f5387c + 71;
                f5386b = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 5;
                }
            }
            this.f5388a.onComplete();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f5386b + 53;
            f5387c = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                e(coroutineScope2, continuation2);
                throw null;
            }
            Object objE = e(coroutineScope2, continuation2);
            int i4 = f5387c + 125;
            f5386b = i4 % 128;
            if (i4 % 2 == 0) {
                return objE;
            }
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f5387c + 93;
            f5386b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f5386b + 45;
            f5387c = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            a aVar = new a(this.f5388a, continuation);
            aVar.f5390e = obj;
            a aVar2 = aVar;
            int i3 = f5387c + 63;
            f5386b = i3 % 128;
            int i4 = i3 % 2;
            return aVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CompletableEmitter completableEmitter, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5388a = completableEmitter;
        }
    }

    public static /* synthetic */ void initOrRestartIfNeeded$default(Application application, boolean z2, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f5383b;
        int i5 = i4 + 23;
        f5384d = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
            int i6 = i4 + 97;
            f5384d = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i4 + 113;
            f5384d = i8 % 128;
            int i9 = i8 % 2;
            str = null;
        }
        initOrRestartIfNeeded(application, z2, str);
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b */
        private static int f5418b = 0;

        /* JADX INFO: renamed from: e */
        private static int f5419e = 1;

        /* JADX INFO: renamed from: a */
        private int f5420a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ boolean f5421c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Application f5422d;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
        
            if (r2.join(r6) == r4) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x004f, code lost:
        
            if (r2.join(r6) == r4) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r6.f5420a
                r3 = 1
                if (r0 == 0) goto L26
                if (r0 != r3) goto L52
                kotlin.ResultKt.throwOnFailure(r7)
            L11:
                int r0 = com.incode.welcome_sdk.commons.statsig.StatsigManager.c.f5419e
                int r1 = r0 + 29
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.statsig.StatsigManager.c.f5418b = r0
                int r1 = r1 % r5
            L1a:
                android.app.Application r3 = r6.f5422d
                boolean r2 = r6.f5421c
                r1 = 4
                r0 = 0
                com.incode.welcome_sdk.commons.statsig.StatsigManager.initOrRestartIfNeeded$default(r3, r2, r0, r1, r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L26:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.Job r2 = com.incode.welcome_sdk.commons.statsig.StatsigManager.access$getInitJob$p()
                if (r2 == 0) goto L1a
                int r0 = com.incode.welcome_sdk.commons.statsig.StatsigManager.c.f5419e
                int r1 = r0 + 113
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.statsig.StatsigManager.c.f5418b = r0
                int r1 = r1 % r5
                if (r1 == 0) goto L46
                r0 = r6
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r6.f5420a = r3
                java.lang.Object r0 = r2.join(r0)
                if (r0 != r4) goto L11
            L45:
                return r4
            L46:
                r0 = r6
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r6.f5420a = r3
                java.lang.Object r0 = r2.join(r0)
                if (r0 != r4) goto L11
                goto L45
            L52:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.statsig.StatsigManager.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f5418b + 57;
            f5419e = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            int i5 = f5418b + 105;
            f5419e = i5 % 128;
            int i6 = i5 % 2;
            return objC;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f5418b + 83;
            f5419e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f5418b + 17;
            f5419e = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = new c(this.f5422d, this.f5421c, continuation);
            int i3 = f5418b + 75;
            f5419e = i3 % 128;
            if (i3 % 2 != 0) {
                return cVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Application application, boolean z2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f5422d = application;
            this.f5421c = z2;
        }
    }

    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f5408d = null;

        /* JADX INFO: renamed from: f */
        private static int f5409f = 0;

        /* JADX INFO: renamed from: g */
        private static int f5410g = 0;

        /* JADX INFO: renamed from: h */
        private static boolean f5411h = false;

        /* JADX INFO: renamed from: i */
        private static boolean f5412i = false;

        /* JADX INFO: renamed from: j */
        private static int f5413j = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ StatsigUser f5414a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ StatsigOptions f5415b;

        /* JADX INFO: renamed from: c */
        private int f5416c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Application f5417e;

        private static String $$c(int i2, short s2, byte b2) {
            int i3 = s2 * 3;
            int i4 = (i2 * 50) + 72;
            byte[] bArr = $$a;
            int i5 = 4 - (b2 * 2);
            byte[] bArr2 = new byte[i3 + 1];
            int i6 = -1;
            if (bArr == null) {
                i5++;
                i4 = i3 + (-i5);
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i3) {
                    return new String(bArr2, 0);
                }
                byte b3 = bArr[i5];
                i5++;
                i4 += -b3;
            }
        }

        static void init$0() {
            $$a = new byte[]{Ascii.GS, Ascii.VT, Ascii.VT, -116};
            $$b = 71;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f5416c;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Statsig.isInitialized()) {
                    int i4 = f5409f + 77;
                    f5413j = i4 % 128;
                    int i5 = i4 % 2;
                    this.f5416c = 1;
                    if (Statsig.INSTANCE.shutdownSuspend(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i6 = f5413j + 7;
                f5409f = i6 % 128;
                int i7 = i6 % 2;
            }
            Application application = this.f5417e;
            Object[] objArr = new Object[1];
            k("\u0081¥¤£\u009c¢\u009c\u0089\u008c\u008f¡\u0097 \u008a\u009f\u0098\u009e\u009d\u0092\u009c\u009b\u0086\u009a\u0099\u0098\u0097\u0096\u0095\u0094\u0093\u0092\u0091\u0090\u008f\u008e\u008e\u008d\u0083\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            Statsig.initializeAsync(application, ((String) objArr[0]).intern(), this.f5414a, StatsigManager.access$getInitCallback$p(), this.f5415b);
            Timber.Forest.d("Statsig init called.", new Object[0]);
            return Unit.INSTANCE;
        }

        private static void k(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2 % 2;
            Object charArray = str4;
            if (str4 != null) {
                int i4 = $11 + 87;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    str4.toCharArray();
                    throw null;
                }
                charArray = str4.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            i iVar = new i();
            char[] cArr2 = f5408d;
            char c2 = '0';
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objC = com.c.a.e.e.c(936178174);
                        if (objC == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int iIndexOf = 19 - TextUtils.indexOf("", c2);
                            int mirror = AndroidCharacter.getMirror(c2) + 798;
                            byte b2 = (byte) ($$b & 1);
                            byte b3 = (byte) (b2 - 1);
                            objC = com.c.a.e.e.e(keyRepeatDelay, iIndexOf, mirror, 928445319, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                        i5++;
                        c2 = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(f5410g)};
            Object objC2 = com.c.a.e.e.c(-1774242729);
            if (objC2 == null) {
                objC2 = com.c.a.e.e.e((char) (35038 - (ViewConfiguration.getTouchSlop() >> 8)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, 1362 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1767557586, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
            long j2 = 0;
            if (f5412i) {
                iVar.f2754b = bArr.length;
                char[] cArr4 = new char[iVar.f2754b];
                iVar.f2755c = 0;
                while (iVar.f2755c < iVar.f2754b) {
                    int i6 = $10 + 91;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr4[iVar.f2755c] = (char) (cArr2[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                    Object[] objArr4 = {iVar, iVar};
                    Object objC3 = com.c.a.e.e.c(-1471606930);
                    if (objC3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC3 = com.c.a.e.e.e((char) (49814 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1))), 'D' - AndroidCharacter.getMirror('0'), 1342 - TextUtils.indexOf("", "", 0, 0), -1462563561, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC3).invoke(null, objArr4);
                    j2 = 0;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (f5411h) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                iVar.f2754b = cArr.length;
                char[] cArr5 = new char[iVar.f2754b];
                iVar.f2755c = 0;
                while (iVar.f2755c < iVar.f2754b) {
                    int i10 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr5[iVar.f2755c] = (char) (cArr2[cArr[(iVar.f2754b - 1) + iVar.f2755c] << i2] + iIntValue);
                        Object[] objArr5 = {iVar, iVar};
                        Object objC4 = com.c.a.e.e.c(-1471606930);
                        if (objC4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objC4 = com.c.a.e.e.e((char) (View.combineMeasuredStates(0, 0) + 49813), 20 - (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1341, -1462563561, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objC4).invoke(null, objArr5);
                    } else {
                        cArr5[iVar.f2755c] = (char) (cArr2[cArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                        Object[] objArr6 = {iVar, iVar};
                        Object objC5 = com.c.a.e.e.c(-1471606930);
                        if (objC5 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objC5 = com.c.a.e.e.e((char) (Color.green(0) + 49813), 'D' - AndroidCharacter.getMirror('0'), 1343 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1462563561, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objC5).invoke(null, objArr6);
                    }
                    int i11 = $10 + 101;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i13 = 0;
            iVar.f2754b = iArr.length;
            char[] cArr6 = new char[iVar.f2754b];
            while (true) {
                iVar.f2755c = i13;
                if (iVar.f2755c >= iVar.f2754b) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[iVar.f2755c] = (char) (cArr2[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                    i13 = iVar.f2755c + 1;
                }
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f5413j = 0;
            f5409f = 1;
            f5408d = new char[]{64040, 64049, 64050, 64054, 64063, 64057, 64510, 64020, 64011, 64025, 64067, 64056, 64019, 64002, 64059, 64071, 64066, 64035, 64026, 64041, 64031, 64037, 64009, 64023, 64048, 64055, 64069, 64504, 64060, 64030, 64506, 64022, 64507, 64062, 64018, 64038, 64058};
            f5410g = -1867973683;
            f5411h = true;
            f5412i = true;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f5409f + 91;
            f5413j = i3 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                e(coroutineScope2, continuation2);
                obj.hashCode();
                throw null;
            }
            Object objE = e(coroutineScope2, continuation2);
            int i4 = f5413j + 71;
            f5409f = i4 % 128;
            if (i4 % 2 != 0) {
                return objE;
            }
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f5409f + 103;
            f5413j = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return bVar.invokeSuspend(unit);
            }
            bVar.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = new b(this.f5417e, this.f5414a, this.f5415b, continuation);
            int i3 = f5413j + 11;
            f5409f = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 66 / 0;
            }
            return bVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Application application, StatsigUser statsigUser, StatsigOptions statsigOptions, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5417e = application;
            this.f5414a = statsigUser;
            this.f5415b = statsigOptions;
        }
    }

    @JvmStatic
    public static final void initOrRestartIfNeeded(Application application, boolean z2, String str) {
        StatsigOptions statsigOptions;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Job job = initJob;
        if (job != null) {
            int i3 = f5383b + 57;
            f5384d = i3 % 128;
            if (i3 % 2 != 0 ? job.isActive() : !job.isActive()) {
                if (initializeOffline != z2) {
                    BuildersKt__Builders_commonKt.launch$default(scope, null, null, new c(application, z2, null), 3, null);
                    Timber.Forest.d("Statsig will be re-initialised in new mode, workOffline=" + z2 + ".", new Object[0]);
                    return;
                }
                int i4 = f5384d + 65;
                f5383b = i4 % 128;
                if (i4 % 2 != 0) {
                    Timber.Forest.d("Statsig is initializing.", new Object[1]);
                } else {
                    Timber.Forest.d("Statsig is initializing.", new Object[0]);
                }
                int i5 = f5383b + 19;
                f5384d = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        if (Statsig.isInitialized() && initializeOffline == z2) {
            int i6 = f5383b + 103;
            f5384d = i6 % 128;
            int i7 = i6 % 2;
            Timber.Forest.d("Statsig already initialized; Skipping.", new Object[0]);
            return;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("client_api_key", com.incode.welcome_sdk.commons.c.f4652d));
        String str2 = clientExperimentId;
        if (str2 != null) {
            mapMutableMapOf.put("client_experiment_id", str2);
        }
        if (str != null) {
            mapMutableMapOf.put("hashed_onboarding_id", str);
        }
        Map<String, String> map = MapsKt.toMap(mapMutableMapOf);
        StatsigUser statsigUser = new StatsigUser(null, 1, null);
        statsigUser.setCustomIDs(map);
        statsigUser.setAppVersion("5.40.3");
        try {
            statsigOptions = (StatsigOptions) StatsigOptions.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            Timber.Forest.e(e2, "Error while initializing Statsig", new Object[0]);
            statsigOptions = null;
        }
        if (statsigOptions != null) {
            statsigOptions.setInitializeOffline(z2);
            statsigOptions.setInitTimeoutMs(2500L);
            statsigOptions.setTier(Tier.PRODUCTION);
        } else {
            statsigOptions = null;
        }
        initializeOffline = z2;
        if (statsigOptions != null) {
            initJob = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new b(application, statsigUser, statsigOptions, null), 3, null);
        }
    }

    @JvmStatic
    public static final void logEvent(com.incode.welcome_sdk.commons.statsig.c cVar) {
        String strD;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(cVar, "");
        if (Statsig.isInitialized()) {
            int i4 = f5384d + 29;
            f5383b = i4 % 128;
            if (i4 % 2 != 0) {
                strD = cVar.d();
                i2 = 41;
            } else {
                strD = cVar.d();
                i2 = 6;
            }
            Statsig.logEvent$default(strD, (Double) null, (Map) null, i2, (Object) null);
            int i5 = f5383b + 49;
            f5384d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final Unit initAndAwait$lambda$5(Application application, String str) {
        int i2 = 2 % 2;
        int i3 = f5383b + 81;
        f5384d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Statsig.isInitialized()) {
            try {
                Statsig.shutdown();
                int i5 = f5384d + 87;
                f5383b = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e2) {
                Timber.Forest.e(e2, "Error while shutting down Statsig before re-initialization.", new Object[0]);
            }
        }
        initOrRestartIfNeeded(application, false, str);
        return Unit.INSTANCE;
    }

    public final Completable initAndAwait(final Application application, final String str) {
        Completable completableAndThen;
        int i2 = 2 % 2;
        int i3 = f5384d + 45;
        f5383b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(str, "");
            completableAndThen = Completable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.commons.statsig.StatsigManager$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return StatsigManager.initAndAwait$lambda$5(application, str);
                }
            }).andThen(awaitStatsigInit());
            Intrinsics.checkNotNull(completableAndThen);
            int i4 = 25 / 0;
        } else {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(str, "");
            completableAndThen = Completable.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.commons.statsig.StatsigManager$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return StatsigManager.initAndAwait$lambda$5(application, str);
                }
            }).andThen(awaitStatsigInit());
            Intrinsics.checkNotNull(completableAndThen);
        }
        int i5 = f5384d + 5;
        f5383b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return completableAndThen;
    }

    @JvmStatic
    public static final Completable awaitStatsigInit() {
        int i2 = 2 % 2;
        int i3 = f5384d + 31;
        f5383b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableCreate = Completable.create(new CompletableOnSubscribe() { // from class: com.incode.welcome_sdk.commons.statsig.StatsigManager$$ExternalSyntheticLambda1
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                StatsigManager.awaitStatsigInit$lambda$6(completableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableCreate, "");
        int i5 = f5384d + 27;
        f5383b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return completableCreate;
    }

    public static final void awaitStatsigInit$lambda$6(CompletableEmitter completableEmitter) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(completableEmitter, "");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(completableEmitter, null), 3, null);
        int i3 = f5384d + 75;
        f5383b = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setClientExperimentId(String str) {
        int i2 = 2 % 2;
        int i3 = f5383b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5384d = i3 % 128;
        if (i3 % 2 != 0) {
            clientExperimentId = str;
            return;
        }
        clientExperimentId = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
