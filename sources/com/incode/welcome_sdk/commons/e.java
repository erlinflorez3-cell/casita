package com.incode.welcome_sdk.commons;

import androidx.lifecycle.Lifecycle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4806a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4807e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BehaviorSubject<Boolean> f4808b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Stack<Runnable> f4809d = new Stack<>();

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i5;
        int i9 = ~(i8 | i2);
        int i10 = (~(i8 | i4)) | i9 | (~(i2 | i4));
        int i11 = (~(i8 | (~i4))) | i9;
        int i12 = (~(i4 | i5)) | (~((~i2) | i5));
        int i13 = i5 + i2 + i3 + (929125522 * i6) + (1849324972 * i7);
        int i14 = i13 * i13;
        int i15 = (1419820811 * i5) + 1146290176 + ((-1462591364) * i2) + (i10 * 470851707) + (470851707 * i11) + ((-470851707) * i12) + ((-1933443072) * i3) + ((-291241984) * i6) + (1012400128 * i7) + ((-1810169856) * i14);
        int i16 = ((i5 * (-2058557531)) - 518432259) + (i2 * (-2058559676)) + (i10 * (-715)) + (i11 * (-715)) + (i12 * 715) + (i3 * (-2058558961)) + (i6 * 548722830) + (i7 * 1549712660) + (i14 * (-2087387136));
        return i15 + ((i16 * i16) * (-343605248)) != 1 ? c(objArr) : d(objArr);
    }

    public e() {
        BehaviorSubject<Boolean> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "");
        this.f4808b = behaviorSubjectCreateDefault;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f4806a + 53;
        f4807e = i3 % 128;
        int i4 = i3 % 2;
        eVar.a();
        if (i4 != 0) {
            return null;
        }
        int i5 = 95 / 0;
        return null;
    }

    public static final /* synthetic */ BehaviorSubject e(e eVar) {
        int i2 = 2 % 2;
        int i3 = f4807e + 123;
        f4806a = i3 % 128;
        int i4 = i3 % 2;
        BehaviorSubject<Boolean> behaviorSubject = eVar.f4808b;
        if (i4 != 0) {
            int i5 = 10 / 0;
        }
        return behaviorSubject;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends Lambda implements Function1<Boolean, ObservableSource<? extends T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4810b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4811d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ T f4812c;

        private ObservableSource<? extends T> b(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f4811d + 11;
            f4810b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bool, "");
            Observable observableJust = Observable.just(this.f4812c);
            int i5 = f4811d + 21;
            f4810b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 14 / 0;
            }
            return observableJust;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f4811d + 9;
            f4810b = i3 % 128;
            int i4 = i3 % 2;
            ObservableSource<? extends T> observableSourceB = b(bool);
            int i5 = f4810b + 75;
            f4811d = i5 % 128;
            if (i5 % 2 == 0) {
                return observableSourceB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t2) {
            super(1);
            this.f4812c = t2;
        }
    }

    static final class c extends Lambda implements Function1<Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4813a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f4814b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4815c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f4816d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f4817e = 1;

        private static Boolean e(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f4813a + 61;
            f4817e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bool, "");
            int i5 = f4817e + 97;
            f4813a = i5 % 128;
            if (i5 % 2 == 0) {
                return bool;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f4813a + 125;
            f4817e = i3 % 128;
            int i4 = i3 % 2;
            Boolean boolE = e(bool);
            int i5 = f4817e + 51;
            f4813a = i5 % 128;
            int i6 = i5 % 2;
            return boolE;
        }

        static {
            int i2 = f4815c + 15;
            f4814b = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        c() {
            super(1);
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f4807e + 63;
        f4806a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ObservableSource observableSource = (ObservableSource) function1.invoke(obj);
        int i5 = f4806a + 21;
        f4807e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return observableSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4806a + 39;
        f4807e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i5 = f4806a + 31;
        f4807e = i5 % 128;
        if (i5 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final <T> Observable<T> a(T t2) {
        int i2 = 2 % 2;
        Observable<Boolean> observableHide = this.f4808b.hide();
        final c cVar = c.f4816d;
        Observable<Boolean> observableFilter = observableHide.filter(new Predicate() { // from class: com.incode.welcome_sdk.commons.e$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return e.d(cVar, obj);
            }
        });
        final a aVar = new a(t2);
        Observable<T> observable = (Observable<T>) observableFilter.flatMap(new Function() { // from class: com.incode.welcome_sdk.commons.e$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.c(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observable, "");
        int i3 = f4806a + 41;
        f4807e = i3 % 128;
        int i4 = i3 % 2;
        return observable;
    }

    static final class d extends Lambda implements Function1<Lifecycle.Event, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f4818a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4819c = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Lifecycle.Event event) {
            int i2 = 2 % 2;
            int i3 = f4819c + 3;
            f4818a = i3 % 128;
            int i4 = i3 % 2;
            e(event);
            Unit unit = Unit.INSTANCE;
            int i5 = f4818a + 43;
            f4819c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Lifecycle.Event event) {
            int i2 = 2 % 2;
            int i3 = f4819c + 57;
            f4818a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = event == null ? -1 : a.f4823e[event.ordinal()];
                if (i4 == 1) {
                    Timber.Forest.d("BackgroundActionHelper -> app is in foreground.", new Object[0]);
                    e.e(e.this).onNext(Boolean.TRUE);
                    e.d(158519065, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -158519064, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), new Object[]{e.this});
                    return;
                }
                if (i4 == 2) {
                    Timber.Forest.d("BackgroundActionHelper -> app is in background.", new Object[0]);
                    e.e(e.this).onNext(Boolean.FALSE);
                    int i5 = f4818a + 65;
                    f4819c = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f4821a = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4822c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ int[] f4823e;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                    int i2 = f4821a + 13;
                    f4822c = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 5;
                    } else {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4823e = iArr;
                int i5 = f4822c + 97;
                f4821a = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e eVar) {
        int i2 = 2 % 2;
        int i3 = f4807e + 107;
        f4806a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eVar, "");
            eVar.f4809d.empty();
            throw null;
        }
        Intrinsics.checkNotNullParameter(eVar, "");
        eVar.f4809d.empty();
        int i4 = f4807e + 25;
        f4806a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f4807e + 51;
        f4806a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f4806a + 75;
        f4807e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Disposable d(Observable<Lifecycle.Event> observable) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(observable, "");
        Observable<Lifecycle.Event> observableDoOnDispose = observable.doOnDispose(new Action() { // from class: com.incode.welcome_sdk.commons.e$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Action
            public final void run() {
                e.c(this.f$0);
            }
        });
        final d dVar = new d();
        Disposable disposableSubscribe = observableDoOnDispose.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.commons.e$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                e.e(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
        int i3 = f4807e + 37;
        f4806a = i3 % 128;
        if (i3 % 2 == 0) {
            return disposableSubscribe;
        }
        throw null;
    }

    public final void a(Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f4807e + 53;
        f4806a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(runnable, "");
        Timber.Forest.d("BackgroundActionHelper -> Storing runnable for later execution.", new Object[0]);
        this.f4809d.push(runnable);
        int i5 = f4806a + 81;
        f4807e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        while (!this.f4809d.isEmpty()) {
            int i3 = f4807e;
            int i4 = i3 + 91;
            f4806a = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 121;
            f4806a = i6 % 128;
            int i7 = i6 % 2;
            this.f4809d.pop().run();
            Timber.Forest.d("BackgroundActionHelper -> Executing stored runnable.", new Object[0]);
        }
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f4807e + 13;
        f4806a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.areEqual(this.f4808b.getValue(), Boolean.FALSE);
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f4808b.getValue(), Boolean.FALSE);
        int i4 = f4806a + 101;
        f4807e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return zAreEqual;
    }

    public static final /* synthetic */ void d(e eVar) {
        int iC = com.incode.welcome_sdk.data.e.c.c();
        d(158519065, com.incode.welcome_sdk.data.e.c.c(), iC, -158519064, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), new Object[]{eVar});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ObservableSource c(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        return (ObservableSource) d(196112061, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), -196112061, com.incode.welcome_sdk.data.e.c.c(), com.incode.welcome_sdk.data.e.c.c(), objArr);
    }
}
