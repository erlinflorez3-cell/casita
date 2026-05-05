package com.incode.welcome_sdk.data.remote;

import android.os.Process;
import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.remote.beans.ae;
import com.incode.welcome_sdk.data.remote.beans.ag;
import com.incode.welcome_sdk.data.remote.beans.bd;
import com.incode.welcome_sdk.data.remote.beans.bh;
import com.incode.welcome_sdk.data.remote.beans.bm;
import com.incode.welcome_sdk.data.remote.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8975a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.incode.welcome_sdk.data.remote.e.b f8976b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f8977c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8978d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8979e = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8980j = 1;

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~(i8 | i5);
        int i10 = ~(i6 | i5);
        int i11 = i8 | (~i5);
        int i12 = i10 | (~(i11 | i3));
        int i13 = (~i3) | i11;
        int i14 = i6 + i5 + i4 + (770105990 * i2) + ((-157043368) * i7);
        int i15 = i14 * i14;
        int i16 = ((315592168 * i6) - 1432092672) + ((-1000312294) * i5) + ((-1315904462) * i9) + ((-657952231) * i12) + (657952231 * i13) + ((-342360064) * i4) + ((-2121269248) * i2) + (1950351360 * i7) + ((-66846720) * i15);
        int i17 = (i6 * 105828664) + 1394048361 + (i5 * 105827886) + (i9 * (-778)) + (i12 * (-389)) + (i13 * 389) + (i4 * 105828275) + (i2 * (-227623502)) + (i7 * 619312264) + (i15 * 1925971968);
        if (i16 + (i17 * i17 * 261881856) != 1) {
            return a(objArr);
        }
        int i18 = 2 % 2;
        Object objD = d((String) objArr[0], new e((RequestBody) objArr[1], null));
        int i19 = f8979e + 65;
        f8975a = i19 % 128;
        int i20 = i19 % 2;
        return objD;
    }

    private b() {
    }

    public static final /* synthetic */ com.incode.welcome_sdk.data.remote.e.b a() {
        int i2 = 2 % 2;
        int i3 = f8975a;
        int i4 = i3 + 71;
        f8979e = i4 % 128;
        int i5 = i4 % 2;
        com.incode.welcome_sdk.data.remote.e.b bVar = f8976b;
        int i6 = i3 + 69;
        f8979e = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        RequestBody requestBody = (RequestBody) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8979e + 57;
        f8975a = i3 % 128;
        int i4 = i3 % 2;
        Object objA = a(requestBody);
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = f8975a + 53;
        f8979e = i6 % 128;
        int i7 = i6 % 2;
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8981a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8982b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f8983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8984e;

        public static final class e extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f8985a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f8986c = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f8987f = 1;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f8988j = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f8989b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ bd f8990d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f8991e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private /* synthetic */ String f8992h;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                FlowCollector flowCollector;
                int i2 = 2 % 2;
                int i3 = f8987f + 115;
                f8988j = i3 % 128;
                int i4 = i3 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = this.f8989b;
                Object obj3 = null;
                try {
                } catch (Exception e2) {
                    Timber.Forest.e(e2);
                    obj2 = (com.incode.welcome_sdk.data.remote.c) new c.a(e2);
                }
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.f8991e;
                    e eVar = this;
                    com.incode.welcome_sdk.data.remote.e.b bVarA = b.a();
                    if (bVarA == null) {
                        int i6 = f8987f + 51;
                        f8988j = i6 % 128;
                        if (i6 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            obj3.hashCode();
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bVarA = null;
                    }
                    String str = this.f8992h;
                    this.f8991e = flowCollector;
                    this.f8989b = 1;
                    obj = bVarA.c(str, this);
                    if (obj == coroutine_suspended) {
                        int i7 = f8987f + 25;
                        f8988j = i7 % 128;
                        int i8 = i7 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    flowCollector = (FlowCollector) this.f8991e;
                    ResultKt.throwOnFailure(obj);
                }
                Object objA = this.f8990d.a((ResponseBody) obj);
                Timber.Forest.d("Parsed response: %s", objA);
                obj2 = (com.incode.welcome_sdk.data.remote.c) new c.e(objA);
                int i9 = f8987f + 99;
                f8988j = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 4;
                }
                this.f8991e = null;
                this.f8989b = 2;
                if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }

            public static int d() {
                int i2 = f8986c;
                int i3 = i2 % 7340959;
                f8986c = i2 + 1;
                if (i3 != 0) {
                    return f8985a;
                }
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                f8985a = elapsedCpuTime;
                return elapsedCpuTime;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f8987f + 57;
                f8988j = i3 % 128;
                FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>> flowCollector2 = flowCollector;
                Continuation<? super Unit> continuation2 = continuation;
                if (i3 % 2 != 0) {
                    b(flowCollector2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objB = b(flowCollector2, continuation2);
                int i4 = f8988j + 57;
                f8987f = i4 % 128;
                int i5 = i4 % 2;
                return objB;
            }

            private Object b(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f8988j + 7;
                f8987f = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f8988j + 21;
                f8987f = i5 % 128;
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
                e eVar = new e(this.f8990d, continuation, this.f8992h);
                eVar.f8991e = obj;
                e eVar2 = eVar;
                int i3 = f8988j + 107;
                f8987f = i3 % 128;
                int i4 = i3 % 2;
                return eVar2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(bd bdVar, Continuation continuation, String str) {
                super(2, continuation);
                this.f8990d = bdVar;
                this.f8992h = str;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f8983d;
            b bVar = b.f8977c;
            Flow flow = FlowKt.flow(new e(ae.f9225d, null, str));
            int i3 = f8981a + 81;
            f8982b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return flow;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f8981a + 113;
            f8982b = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(str, continuation);
            int i5 = f8981a + 33;
            f8982b = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f8981a + 109;
            f8982b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((a) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f8982b + 37;
            f8981a = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            a aVar = new a(continuation);
            aVar.f8983d = obj;
            a aVar2 = aVar;
            int i3 = f8981a + 105;
            f8982b = i3 % 128;
            int i4 = i3 % 2;
            return aVar2;
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }
    }

    static final class c extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8999a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9000c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f9001d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9002e;

        public static final class e extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f9003a = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f9004i = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ bd f9005b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f9006c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ String f9007d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f9008e;

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
            
                if (r0 == 2) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
            
                if (r1 == 2) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
            
                kotlin.ResultKt.throwOnFailure(r10);
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 204
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.b.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9003a + 89;
                f9004i = i3 % 128;
                int i4 = i3 % 2;
                Object objE = e(flowCollector, continuation);
                int i5 = f9004i + 45;
                f9003a = i5 % 128;
                int i6 = i5 % 2;
                return objE;
            }

            private Object e(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ae>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9003a + 107;
                f9004i = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f9004i + 13;
                f9003a = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                e eVar = new e(this.f9005b, continuation, this.f9007d);
                eVar.f9006c = obj;
                e eVar2 = eVar;
                int i3 = f9003a + 37;
                f9004i = i3 % 128;
                int i4 = i3 % 2;
                return eVar2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(bd bdVar, Continuation continuation, String str) {
                super(2, continuation);
                this.f9005b = bdVar;
                this.f9007d = str;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f9001d;
            b bVar = b.f8977c;
            Flow flow = FlowKt.flow(new e(ae.f9225d, null, str));
            int i3 = f8999a + 23;
            f9000c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 35 / 0;
            }
            return flow;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f8999a + 125;
            f9000c = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(str, continuation);
            int i5 = f8999a + 115;
            f9000c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return objA;
        }

        private Object a(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f8999a + 55;
            f9000c = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) create(str, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                cVar.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = cVar.invokeSuspend(unit);
            int i5 = f9000c + 11;
            f8999a = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = new c(continuation);
            cVar.f9001d = obj;
            c cVar2 = cVar;
            int i3 = f9000c + 87;
            f8999a = i3 % 128;
            int i4 = i3 % 2;
            return cVar2;
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class d extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ag>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9009a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9010e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9012c;

        public static final class e extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ag>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f9013b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static int f9014d = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f9015i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f9016j = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f9017a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f9018c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ bd f9019e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private /* synthetic */ String f9020h;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                FlowCollector flowCollector;
                int i2 = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f9017a;
                try {
                } catch (Exception e2) {
                    Timber.Forest.e(e2);
                    obj2 = (com.incode.welcome_sdk.data.remote.c) new c.a(e2);
                }
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.f9018c;
                    e eVar = this;
                    com.incode.welcome_sdk.data.remote.e.b bVarA = b.a();
                    if (bVarA == null) {
                        int i4 = f9016j + 15;
                        f9015i = i4 % 128;
                        int i5 = i4 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i6 = f9015i + 81;
                        f9016j = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 4 % 5;
                        }
                        bVarA = null;
                    }
                    String str = this.f9020h;
                    this.f9018c = flowCollector;
                    this.f9017a = 1;
                    obj = bVarA.e(str, this);
                    if (obj == coroutine_suspended) {
                        int i8 = f9015i + 65;
                        f9016j = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 24 / 0;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        int i10 = f9016j + 117;
                        f9015i = i10 % 128;
                        int i11 = i10 % 2;
                        return unit;
                    }
                    flowCollector = (FlowCollector) this.f9018c;
                    ResultKt.throwOnFailure(obj);
                }
                Object objA = this.f9019e.a((ResponseBody) obj);
                Timber.Forest.d("Parsed response: %s", objA);
                obj2 = (com.incode.welcome_sdk.data.remote.c) new c.e(objA);
                this.f9018c = null;
                this.f9017a = 2;
                if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                    int i12 = f9016j + 113;
                    f9015i = i12 % 128;
                    int i13 = i12 % 2;
                    return coroutine_suspended;
                }
                Unit unit2 = Unit.INSTANCE;
                int i102 = f9016j + 117;
                f9015i = i102 % 128;
                int i112 = i102 % 2;
                return unit2;
            }

            public static int c() {
                int i2 = f9014d;
                int i3 = i2 % 6696043;
                f9014d = i2 + 1;
                if (i3 != 0) {
                    return f9013b;
                }
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                f9013b = iUptimeMillis;
                return iUptimeMillis;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ag>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9015i + 71;
                f9016j = i3 % 128;
                int i4 = i3 % 2;
                Object objA = a(flowCollector, continuation);
                int i5 = f9015i + 39;
                f9016j = i5 % 128;
                if (i5 % 2 != 0) {
                    return objA;
                }
                throw null;
            }

            private Object a(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends ag>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9015i + 29;
                f9016j = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                if (i4 == 0) {
                    int i5 = 64 / 0;
                }
                int i6 = f9015i + 77;
                f9016j = i6 % 128;
                int i7 = i6 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                e eVar = new e(this.f9019e, continuation, this.f9020h);
                eVar.f9018c = obj;
                e eVar2 = eVar;
                int i3 = f9016j + 79;
                f9015i = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 77 / 0;
                }
                return eVar2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(bd bdVar, Continuation continuation, String str) {
                super(2, continuation);
                this.f9019e = bdVar;
                this.f9020h = str;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f9011b;
            b bVar = b.f8977c;
            Object obj2 = null;
            Flow flow = FlowKt.flow(new e(ag.f9238d, null, str));
            int i3 = f9010e + 39;
            f9009a = i3 % 128;
            if (i3 % 2 != 0) {
                return flow;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ag>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f9009a + 41;
            f9010e = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(str, continuation);
            if (i4 != 0) {
                int i5 = 4 / 0;
            }
            int i6 = f9009a + 69;
            f9010e = i6 % 128;
            int i7 = i6 % 2;
            return objA;
        }

        private Object a(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ag>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f9009a + 109;
            f9010e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((d) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f9010e + 55;
            f9009a = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = new d(continuation);
            dVar.f9011b = obj;
            d dVar2 = dVar;
            int i3 = f9009a + 113;
            f9010e = i3 % 128;
            int i4 = i3 % 2;
            return dVar2;
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class e extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9021c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9022e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ RequestBody f9023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f9024b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9025d;

        public static final class d extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bm>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f9026h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f9027i = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ RequestBody f9028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ String f9029b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f9030c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f9031d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ bd f9032e;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                FlowCollector flowCollector;
                int i2 = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.f9031d;
                try {
                } catch (Exception e2) {
                    Timber.Forest.e(e2);
                    obj2 = (com.incode.welcome_sdk.data.remote.c) new c.a(e2);
                }
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.f9030c;
                    d dVar = this;
                    com.incode.welcome_sdk.data.remote.e.b bVarA = b.a();
                    if (bVarA == null) {
                        int i4 = f9026h + 101;
                        f9027i = i4 % 128;
                        int i5 = i4 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bVarA = null;
                    }
                    String str = this.f9029b;
                    RequestBody requestBody = this.f9028a;
                    this.f9030c = flowCollector;
                    this.f9031d = 1;
                    obj = bVarA.c(str, requestBody, this);
                    if (obj == coroutine_suspended) {
                        int i6 = f9027i + 57;
                        f9026h = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 44 / 0;
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                        int i8 = f9027i + 27;
                        f9026h = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }
                    flowCollector = (FlowCollector) this.f9030c;
                    ResultKt.throwOnFailure(obj);
                }
                Object objA = this.f9032e.a((ResponseBody) obj);
                Timber.Forest.d("Parsed response: %s", objA);
                obj2 = (com.incode.welcome_sdk.data.remote.c) new c.e(objA);
                this.f9030c = null;
                this.f9031d = 2;
                if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                    int i10 = f9027i + 87;
                    f9026h = i10 % 128;
                    int i11 = i10 % 2;
                    return coroutine_suspended;
                }
                Unit unit2 = Unit.INSTANCE;
                int i82 = f9027i + 27;
                f9026h = i82 % 128;
                int i92 = i82 % 2;
                return unit2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bm>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9026h + 5;
                f9027i = i3 % 128;
                int i4 = i3 % 2;
                Object objB = b(flowCollector, continuation);
                int i5 = f9026h + 53;
                f9027i = i5 % 128;
                if (i5 % 2 != 0) {
                    return objB;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private Object b(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bm>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9026h + 49;
                f9027i = i3 % 128;
                int i4 = i3 % 2;
                d dVar = (d) create(flowCollector, continuation);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return dVar.invokeSuspend(unit);
                }
                dVar.invokeSuspend(unit);
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                d dVar = new d(this.f9032e, continuation, this.f9029b, this.f9028a);
                dVar.f9030c = obj;
                d dVar2 = dVar;
                int i3 = f9026h + 121;
                f9027i = i3 % 128;
                if (i3 % 2 != 0) {
                    return dVar2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(bd bdVar, Continuation continuation, String str, RequestBody requestBody) {
                super(2, continuation);
                this.f9032e = bdVar;
                this.f9029b = str;
                this.f9028a = requestBody;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f9024b;
            b bVar = b.f8977c;
            Object obj2 = null;
            Flow flow = FlowKt.flow(new d(bm.f9515c, null, str, this.f9023a));
            int i3 = f9021c + 85;
            f9022e = i3 % 128;
            if (i3 % 2 != 0) {
                return flow;
            }
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f9022e + 57;
            f9021c = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(str, continuation);
            int i5 = f9022e + 41;
            f9021c = i5 % 128;
            if (i5 % 2 == 0) {
                return objE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object e(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<bm>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f9021c + 47;
            f9022e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((e) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f9021c + 59;
            f9022e = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            e eVar = new e(this.f9023a, continuation);
            eVar.f9024b = obj;
            e eVar2 = eVar;
            int i3 = f9021c + 35;
            f9022e = i3 % 128;
            if (i3 % 2 != 0) {
                return eVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(RequestBody requestBody, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f9023a = requestBody;
        }
    }

    static final class f extends SuspendLambda implements Function2<String, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9033a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9034c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ RequestBody f9035b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f9037e;

        public static final class c extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bm>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f9038h = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f9039j = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ String f9040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f9041b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ RequestBody f9042c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f9043d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ bd f9044e;

            /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    r3 = 2
                    int r0 = r3 % r3
                    int r0 = com.incode.welcome_sdk.data.remote.b.f.c.f9039j
                    int r1 = r0 + 49
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.remote.b.f.c.f9038h = r0
                    int r1 = r1 % r3
                    java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r8.f9043d
                    r6 = 1
                    r4 = 0
                    if (r0 == 0) goto L30
                    if (r0 == r6) goto L2b
                    if (r0 != r3) goto L9e
                    kotlin.ResultKt.throwOnFailure(r9)
                L1d:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    int r0 = com.incode.welcome_sdk.data.remote.b.f.c.f9038h
                    int r1 = r0 + 59
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.remote.b.f.c.f9039j = r0
                    int r1 = r1 % r3
                    if (r1 == 0) goto L9a
                    return r2
                L2b:
                    java.lang.Object r7 = r8.f9041b
                    kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                    goto L55
                L30:
                    kotlin.ResultKt.throwOnFailure(r9)
                    java.lang.Object r7 = r8.f9041b
                    kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                    r0 = r8
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0     // Catch: java.lang.Exception -> L73
                    com.incode.welcome_sdk.data.remote.e.b r2 = com.incode.welcome_sdk.data.remote.b.a()     // Catch: java.lang.Exception -> L73
                    if (r2 != 0) goto L46
                    java.lang.String r0 = ""
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Exception -> L73
                    r2 = r4
                L46:
                    java.lang.String r1 = r8.f9040a     // Catch: java.lang.Exception -> L73
                    okhttp3.RequestBody r0 = r8.f9042c     // Catch: java.lang.Exception -> L73
                    r8.f9041b = r7     // Catch: java.lang.Exception -> L73
                    r8.f9043d = r6     // Catch: java.lang.Exception -> L73
                    java.lang.Object r9 = r2.b(r1, r0, r8)     // Catch: java.lang.Exception -> L73
                    if (r9 != r5) goto L58
                    goto La6
                L55:
                    kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L73
                L58:
                    okhttp3.ResponseBody r9 = (okhttp3.ResponseBody) r9     // Catch: java.lang.Exception -> L73
                    com.incode.welcome_sdk.data.remote.beans.bd r0 = r8.f9044e     // Catch: java.lang.Exception -> L73
                    java.lang.Object r6 = r0.a(r9)     // Catch: java.lang.Exception -> L73
                    timber.log.Timber$Forest r2 = timber.log.Timber.Forest     // Catch: java.lang.Exception -> L73
                    java.lang.String r1 = "Parsed response: %s"
                    java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L73
                    r2.d(r1, r0)     // Catch: java.lang.Exception -> L73
                    com.incode.welcome_sdk.data.remote.c$e r1 = new com.incode.welcome_sdk.data.remote.c$e     // Catch: java.lang.Exception -> L73
                    r1.<init>(r6)     // Catch: java.lang.Exception -> L73
                    com.incode.welcome_sdk.data.remote.c r1 = (com.incode.welcome_sdk.data.remote.c) r1     // Catch: java.lang.Exception -> L73
                    goto L83
                L73:
                    r2 = move-exception
                    timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                    r0 = r2
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    r1.e(r0)
                    com.incode.welcome_sdk.data.remote.c$a r1 = new com.incode.welcome_sdk.data.remote.c$a
                    r1.<init>(r2)
                    com.incode.welcome_sdk.data.remote.c r1 = (com.incode.welcome_sdk.data.remote.c) r1
                L83:
                    r0 = r8
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r8.f9041b = r4
                    r8.f9043d = r3
                    java.lang.Object r0 = r7.emit(r1, r0)
                    if (r0 != r5) goto L1d
                    int r0 = com.incode.welcome_sdk.data.remote.b.f.c.f9038h
                    int r1 = r0 + 57
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.data.remote.b.f.c.f9039j = r0
                    int r1 = r1 % r3
                    return r5
                L9a:
                    r4.hashCode()
                    throw r4
                L9e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                La6:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.b.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bm>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9038h + 73;
                f9039j = i3 % 128;
                int i4 = i3 % 2;
                Object objA = a(flowCollector, continuation);
                if (i4 == 0) {
                    int i5 = 56 / 0;
                }
                int i6 = f9039j + 75;
                f9038h = i6 % 128;
                int i7 = i6 % 2;
                return objA;
            }

            private Object a(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bm>> flowCollector, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f9038h + 81;
                f9039j = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f9038h + 43;
                f9039j = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                c cVar = new c(this.f9044e, continuation, this.f9040a, this.f9042c);
                cVar.f9041b = obj;
                c cVar2 = cVar;
                int i3 = f9038h + 93;
                f9039j = i3 % 128;
                int i4 = i3 % 2;
                return cVar2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(bd bdVar, Continuation continuation, String str, RequestBody requestBody) {
                super(2, continuation);
                this.f9044e = bdVar;
                this.f9040a = str;
                this.f9042c = requestBody;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f9037e;
            b bVar = b.f8977c;
            Flow flow = FlowKt.flow(new c(bm.f9515c, null, str, this.f9035b));
            int i3 = f9034c + 5;
            f9033a = i3 % 128;
            int i4 = i3 % 2;
            return flow;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f9034c + 53;
            f9033a = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(str, continuation);
            int i5 = f9033a + 43;
            f9034c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 44 / 0;
            }
            return objE;
        }

        private Object e(String str, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<bm>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f9034c + 63;
            f9033a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((f) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f9033a + 15;
            f9034c = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            f fVar = new f(this.f9035b, continuation);
            fVar.f9037e = obj;
            f fVar2 = fVar;
            int i3 = f9034c + 15;
            f9033a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 78 / 0;
            }
            return fVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(RequestBody requestBody, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f9035b = requestBody;
        }
    }

    public static void e(com.incode.welcome_sdk.data.remote.e.b bVar) {
        int i2 = 2 % 2;
        int i3 = f8975a + 35;
        f8979e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bVar, "");
            f8976b = bVar;
        } else {
            Intrinsics.checkNotNullParameter(bVar, "");
            f8976b = bVar;
            int i4 = 52 / 0;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.remote.b$b, reason: collision with other inner class name */
    public static final class C0234b extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bh>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8993a = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f8994j = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ RequestBody f8995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ bd f8998e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            FlowCollector flowCollector;
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f8997d;
            try {
            } catch (Exception e2) {
                Timber.Forest.e(e2);
                obj2 = (com.incode.welcome_sdk.data.remote.c) new c.a(e2);
            }
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.f8996c;
                C0234b c0234b = this;
                com.incode.welcome_sdk.data.remote.e.b bVarA = b.a();
                if (bVarA == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    bVarA = null;
                }
                RequestBody requestBody = this.f8995b;
                this.f8996c = flowCollector;
                this.f8997d = 1;
                obj = bVarA.c(requestBody, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = f8994j + 61;
                    f8993a = i4 % 128;
                    int i5 = i4 % 2;
                    return Unit.INSTANCE;
                }
                flowCollector = (FlowCollector) this.f8996c;
                ResultKt.throwOnFailure(obj);
                int i6 = f8994j + 25;
                f8993a = i6 % 128;
                int i7 = i6 % 2;
            }
            Object objA = this.f8998e.a((ResponseBody) obj);
            Timber.Forest.d("Parsed response: %s", objA);
            obj2 = (com.incode.welcome_sdk.data.remote.c) new c.e(objA);
            this.f8996c = null;
            this.f8997d = 2;
            if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                int i8 = f8993a + 23;
                f8994j = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 97 / 0;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bh>> flowCollector, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f8994j + 121;
            f8993a = i3 % 128;
            FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bh>> flowCollector2 = flowCollector;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                return d(flowCollector2, continuation2);
            }
            d(flowCollector2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object d(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends bh>> flowCollector, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f8994j + 41;
            f8993a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((C0234b) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f8993a + 113;
            f8994j = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 36 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            C0234b c0234b = new C0234b(this.f8998e, continuation, this.f8995b);
            c0234b.f8996c = obj;
            C0234b c0234b2 = c0234b;
            int i3 = f8994j + 53;
            f8993a = i3 % 128;
            int i4 = i3 % 2;
            return c0234b2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0234b(bd bdVar, Continuation continuation, RequestBody requestBody) {
            super(2, continuation);
            this.f8998e = bdVar;
            this.f8995b = requestBody;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class g<T> extends SuspendLambda implements Function2<FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends T>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9045d = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f9046i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ String f9047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9049c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function2<String, Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, Object> f9050e;

        /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01e9 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f9046i + 3;
            f9045d = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d((FlowCollector) obj, continuation);
            int i5 = f9046i + 75;
            f9045d = i5 % 128;
            int i6 = i5 % 2;
            return objD;
        }

        private Object d(FlowCollector<? super com.incode.welcome_sdk.data.remote.c<? extends T>> flowCollector, Continuation<? super Unit> continuation) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f9046i + 95;
            f9045d = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((g) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f9046i + 49;
            f9045d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            g gVar = new g(this.f9047a, this.f9050e, continuation);
            gVar.f9049c = obj;
            g gVar2 = gVar;
            int i3 = f9045d + 69;
            f9046i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 29 / 0;
            }
            return gVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, Function2<? super String, ? super Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, ? extends Object> function2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f9047a = str;
            this.f9050e = function2;
        }
    }

    private static <T> Object d(String str, Function2<? super String, ? super Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, ? extends Object> function2) {
        int i2 = 2 % 2;
        Flow flow = FlowKt.flow(new g(str, function2, null));
        int i3 = f8979e + 19;
        f8975a = i3 % 128;
        int i4 = i3 % 2;
        return flow;
    }

    private static Object a(RequestBody requestBody) {
        int i2 = 2 % 2;
        Flow flow = FlowKt.flow(new C0234b(bh.f9466a, null, requestBody));
        int i3 = f8979e + 41;
        f8975a = i3 % 128;
        int i4 = i3 % 2;
        return flow;
    }

    public static Object c(String str) {
        int i2 = 2 % 2;
        Object objD = d(str, new c(null));
        int i3 = f8979e + 125;
        f8975a = i3 % 128;
        int i4 = i3 % 2;
        return objD;
    }

    public static Object a(String str, RequestBody requestBody) {
        int i2 = 2 % 2;
        Object obj = null;
        Object objD = d(str, new f(requestBody, null));
        int i3 = f8975a + 69;
        f8979e = i3 % 128;
        if (i3 % 2 != 0) {
            return objD;
        }
        obj.hashCode();
        throw null;
    }

    public static Object d(String str) {
        int i2 = 2 % 2;
        Object objD = d(str, new a(null));
        int i3 = f8979e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8975a = i3 % 128;
        int i4 = i3 % 2;
        return objD;
    }

    public static Object a(String str) {
        int i2 = 2 % 2;
        Object objD = d(str, new d(null));
        int i3 = f8975a + 77;
        f8979e = i3 % 128;
        int i4 = i3 % 2;
        return objD;
    }

    static {
        int i2 = f8978d + 73;
        f8980j = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Object e(String str, RequestBody requestBody) {
        return d(new Object[]{str, requestBody}, IncodeWelcome.bm.e(), IncodeWelcome.bm.e(), IncodeWelcome.bm.e(), 1963422871, -1963422870, IncodeWelcome.bm.e());
    }
}
