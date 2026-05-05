package com.incode.welcome_sdk.commons.httpinterceptors;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.lang.reflect.Type;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.GlobalScope;
import org.reactivestreams.Publisher;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes5.dex */
public final class c<R> implements CallAdapter<R, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5173a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5174d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CallAdapter<R, ?> f5175c;

    public c(CallAdapter<R, ?> callAdapter) {
        Intrinsics.checkNotNullParameter(callAdapter, "");
        this.f5175c = callAdapter;
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        Type typeResponseType;
        int i2 = 2 % 2;
        int i3 = f5174d + 95;
        f5173a = i3 % 128;
        if (i3 % 2 == 0) {
            typeResponseType = this.f5175c.responseType();
            Intrinsics.checkNotNullExpressionValue(typeResponseType, "");
            int i4 = 31 / 0;
        } else {
            typeResponseType = this.f5175c.responseType();
            Intrinsics.checkNotNullExpressionValue(typeResponseType, "");
        }
        int i5 = f5174d + 95;
        f5173a = i5 % 128;
        if (i5 % 2 != 0) {
            return typeResponseType;
        }
        throw null;
    }

    @Override // retrofit2.CallAdapter
    public final Object adapt(Call<R> call) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(call, "");
        Object objAdapt = this.f5175c.adapt(call);
        if (objAdapt instanceof Observable) {
            Intrinsics.checkNotNull(objAdapt, "");
            final d dVar = d.f5190a;
            objAdapt = ((Observable) objAdapt).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.commons.httpinterceptors.c$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.d(dVar, obj);
                }
            });
        } else if (objAdapt instanceof Single) {
            Intrinsics.checkNotNull(objAdapt, "");
            final e eVar = e.f5198d;
            objAdapt = ((Single) objAdapt).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.commons.httpinterceptors.c$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.b(eVar, obj);
                }
            });
            int i3 = f5173a + 77;
            f5174d = i3 % 128;
            int i4 = i3 % 2;
        } else if (objAdapt instanceof Maybe) {
            int i5 = f5174d + 5;
            f5173a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.checkNotNull(objAdapt, "");
            final C0216c c0216c = C0216c.f5188d;
            objAdapt = ((Maybe) objAdapt).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.commons.httpinterceptors.c$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.a(c0216c, obj);
                }
            });
        } else if (objAdapt instanceof Flowable) {
            Intrinsics.checkNotNull(objAdapt, "");
            final b bVar = b.f5184e;
            objAdapt = ((Flowable) objAdapt).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.commons.httpinterceptors.c$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.c(bVar, obj);
                }
            });
        } else if (objAdapt instanceof Deferred) {
            objAdapt = BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new a(objAdapt, null), 3, null);
        }
        Intrinsics.checkNotNull(objAdapt);
        int i7 = f5174d + 69;
        f5173a = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 73 / 0;
        }
        return objAdapt;
    }

    static final class d extends Lambda implements Function1<Throwable, ObservableSource<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f5190a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5191b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5192c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5193d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5194e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5191b + 81;
            f5194e = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource observableSourceE = e(th);
            int i5 = f5194e + 9;
            f5191b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            return observableSourceE;
        }

        private static ObservableSource<? extends R> e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5194e + 113;
            f5191b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Observable observableError = Observable.error(m.c(th));
            int i5 = f5194e + 43;
            f5191b = i5 % 128;
            int i6 = i5 % 2;
            return observableError;
        }

        static {
            int i2 = f5192c + 5;
            f5193d = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5174d + 99;
        f5173a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ObservableSource observableSource = (ObservableSource) function1.invoke(obj);
        int i5 = f5174d + 29;
        f5173a = i5 % 128;
        int i6 = i5 % 2;
        return observableSource;
    }

    static final class e extends Lambda implements Function1<Throwable, SingleSource<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5195a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5196b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5197c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f5198d = new e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5199e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5196b + 97;
            f5195a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource singleSourceE = e(th);
            int i5 = f5196b + 101;
            f5195a = i5 % 128;
            int i6 = i5 % 2;
            return singleSourceE;
        }

        private static SingleSource<? extends R> e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5195a + 33;
            f5196b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Single singleError = Single.error(m.c(th));
            int i5 = f5196b + 45;
            f5195a = i5 % 128;
            int i6 = i5 % 2;
            return singleError;
        }

        static {
            int i2 = f5197c + 75;
            f5199e = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5174d + 27;
        f5173a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f5173a + 73;
        f5174d = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.httpinterceptors.c$c, reason: collision with other inner class name */
    static final class C0216c extends Lambda implements Function1<Throwable, MaybeSource<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5185a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5186b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5187c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0216c f5188d = new C0216c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5189e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5187c + 109;
            f5186b = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource maybeSourceE = e(th);
            if (i4 == 0) {
                int i5 = 45 / 0;
            }
            return maybeSourceE;
        }

        private static MaybeSource<? extends R> e(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5187c + 121;
            f5186b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                Maybe.error(m.c(th));
                throw null;
            }
            Intrinsics.checkNotNullParameter(th, "");
            Maybe maybeError = Maybe.error(m.c(th));
            int i4 = f5186b + 17;
            f5187c = i4 % 128;
            if (i4 % 2 == 0) {
                return maybeError;
            }
            throw null;
        }

        static {
            int i2 = f5185a + 3;
            f5189e = i2 % 128;
            int i3 = i2 % 2;
        }

        C0216c() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5174d + 109;
        f5173a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i4 = f5173a + 31;
        f5174d = i4 % 128;
        if (i4 % 2 == 0) {
            return maybeSource;
        }
        throw null;
    }

    static final class b extends Lambda implements Function1<Throwable, Publisher<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5180a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5181b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5182c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5183d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f5184e = new b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f5183d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5182c = i3 % 128;
            Object obj = null;
            Throwable th2 = th;
            if (i3 % 2 == 0) {
                e(th2);
                obj.hashCode();
                throw null;
            }
            Publisher publisherE = e(th2);
            int i4 = f5182c + 43;
            f5183d = i4 % 128;
            if (i4 % 2 == 0) {
                return publisherE;
            }
            obj.hashCode();
            throw null;
        }

        private static Publisher<? extends R> e(Throwable th) {
            Flowable flowableError;
            int i2 = 2 % 2;
            int i3 = f5183d + 55;
            f5182c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th, "");
                flowableError = Flowable.error(m.c(th));
                int i4 = 19 / 0;
            } else {
                Intrinsics.checkNotNullParameter(th, "");
                flowableError = Flowable.error(m.c(th));
            }
            int i5 = f5183d + 117;
            f5182c = i5 % 128;
            int i6 = i5 % 2;
            return flowableError;
        }

        static {
            int i2 = f5180a + 95;
            f5181b = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5173a + 29;
        f5174d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (Publisher) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5176a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5177b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f5179e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f5176a + 27;
            f5177b = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f5178d;
            try {
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f5178d = 1;
                    obj = ((Deferred) this.f5179e).await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                int i6 = f5177b + 99;
                f5176a = i6 % 128;
                if (i6 % 2 == 0) {
                    return obj;
                }
                throw null;
            } catch (Throwable th) {
                throw m.c(th);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f5177b + 27;
            f5176a = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Object> continuation2 = continuation;
            if (i3 % 2 != 0) {
                e(coroutineScope2, continuation2);
                throw null;
            }
            Object objE = e(coroutineScope2, continuation2);
            int i4 = f5177b + 87;
            f5176a = i4 % 128;
            if (i4 % 2 == 0) {
                return objE;
            }
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<Object> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f5177b + 47;
            f5176a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f5176a + 33;
            f5177b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 37 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            a aVar = new a(this.f5179e, continuation);
            int i3 = f5177b + 15;
            f5176a = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5179e = obj;
        }
    }
}
