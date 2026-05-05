package com.incode.welcome_sdk.commons.b;

import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsYesNoScreenKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
final class a<T> extends Observable<T> implements ObservableTransformer<T, T> {

    /* JADX INFO: renamed from: e */
    private static int f4628e = 0;

    /* JADX INFO: renamed from: j */
    private static int f4629j = 1;

    /* JADX INFO: renamed from: a */
    private boolean f4630a;

    /* JADX INFO: renamed from: b */
    private int f4631b;

    /* JADX INFO: renamed from: c */
    private ObservableSource<Boolean> f4632c;

    /* JADX INFO: renamed from: d */
    private Observable<? extends T> f4633d;

    @Override // io.reactivex.ObservableTransformer
    public final /* synthetic */ ObservableSource apply(Observable observable) {
        int i2 = 2 % 2;
        int i3 = f4629j + 75;
        f4628e = i3 % 128;
        if (i3 % 2 == 0) {
            return d(observable);
        }
        d(observable);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    a(Observable<? extends T> observable, ObservableSource<Boolean> observableSource, boolean z2, int i2) {
        this.f4633d = observable;
        this.f4632c = observableSource;
        this.f4630a = z2;
        this.f4631b = i2;
    }

    @Override // io.reactivex.Observable
    protected final void subscribeActual(Observer<? super T> observer) {
        int i2 = 2 % 2;
        b bVar = new b(observer, this.f4631b, this.f4630a);
        observer.onSubscribe(bVar);
        this.f4632c.subscribe(bVar.f4638c);
        this.f4633d.subscribe(bVar);
        int i3 = f4629j + 3;
        f4628e = i3 % 128;
        int i4 = i3 % 2;
    }

    private Observable<T> d(Observable<T> observable) {
        int i2 = 2 % 2;
        a aVar = new a(observable, this.f4632c, this.f4630a, this.f4631b);
        int i3 = f4629j + 59;
        f4628e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return aVar;
    }

    static final class b<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: g */
        private static int f4634g = 0;

        /* JADX INFO: renamed from: h */
        private static int f4635h = 1;

        /* JADX INFO: renamed from: b */
        private SimplePlainQueue<T> f4637b;

        /* JADX INFO: renamed from: e */
        private Observer<? super T> f4640e;

        /* JADX INFO: renamed from: f */
        private volatile boolean f4641f;

        /* JADX INFO: renamed from: i */
        private volatile boolean f4642i;

        /* JADX INFO: renamed from: j */
        private volatile boolean f4643j;

        /* JADX INFO: renamed from: c */
        final b<T>.C0210a f4638c = new C0210a();

        /* JADX INFO: renamed from: a */
        private AtomicThrowable f4636a = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        private AtomicReference<Disposable> f4639d = new AtomicReference<>();

        public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i4;
            int i9 = ~(i8 | i3 | i6);
            int i10 = (~((~i6) | i3)) | (~(i3 | i4));
            int i11 = i3 + i4 + i5 + (32217706 * i7) + (238734613 * i2);
            int i12 = i11 * i11;
            int i13 = (((-3446596) * i3) - 528416768) + (677943110 * i4) + (i9 * 1806788795) + ((-1806788795) * i8) + (1806788795 * i10) + ((-1810235392) * i5) + ((-154927104) * i7) + ((-131989504) * i2) + ((-1876361216) * i12);
            int i14 = ((i3 * 1127137324) - 440746823) + (i4 * 1127135646) + (i9 * 839) + (i8 * (-839)) + (i10 * 839) + (i5 * 1127136485) + (i7 * 976419026) + (i2 * 1106960329) + (i12 * 279773184);
            return i13 + ((i14 * i14) * (-1943076864)) != 1 ? c(objArr) : b(objArr);
        }

        b(Observer<? super T> observer, int i2, boolean z2) {
            this.f4640e = observer;
            this.f4637b = new SpscLinkedArrayQueue(i2);
            this.f4642i = z2;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            int i2 = 2 % 2;
            int i3 = f4634g + 87;
            f4635h = i3 % 128;
            int i4 = i3 % 2;
            DisposableHelper.setOnce(this.f4639d, disposable);
            int i5 = f4635h + 23;
            f4634g = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t2) {
            int i2 = 2 % 2;
            int i3 = f4635h + 99;
            f4634g = i3 % 128;
            if (i3 % 2 == 0) {
                this.f4637b.offer(t2);
                c();
                int i4 = f4634g + 5;
                f4635h = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
            this.f4637b.offer(t2);
            c();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f4634g + 29;
            f4635h = i3 % 128;
            int i4 = i3 % 2;
            if (!this.f4636a.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                int i5 = f4635h + 23;
                f4634g = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 80 / 0;
                    return;
                }
                return;
            }
            int i7 = f4634g + 31;
            f4635h = i7 % 128;
            int i8 = i7 % 2;
            c();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            int i2 = 2 % 2;
            int i3 = f4635h + 109;
            f4634g = i3 % 128;
            int i4 = i3 % 2;
            this.f4641f = true;
            c();
            int i5 = f4634g + 25;
            f4635h = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            int i2 = 2 % 2;
            int i3 = f4634g + 21;
            f4635h = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f4643j;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            int i2 = 2 % 2;
            int i3 = f4634g + 109;
            f4635h = i3 % 128;
            int i4 = i3 % 2;
            this.f4643j = true;
            DisposableHelper.dispose(this.f4639d);
            DisposableHelper.dispose(this.f4638c);
            int i5 = f4635h + 37;
            f4634g = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
        }

        private void c() {
            boolean z2;
            int i2 = 2 % 2;
            if (getAndIncrement() != 0) {
                return;
            }
            SimplePlainQueue<T> simplePlainQueue = this.f4637b;
            Observer<? super T> observer = this.f4640e;
            AtomicThrowable atomicThrowable = this.f4636a;
            int iAddAndGet = 1;
            while (!this.f4643j) {
                if (atomicThrowable.get() != null) {
                    int i3 = f4635h + 63;
                    f4634g = i3 % 128;
                    if (i3 % 2 == 0) {
                        Throwable thTerminate = atomicThrowable.terminate();
                        simplePlainQueue.clear();
                        DisposableHelper.dispose(this.f4639d);
                        DisposableHelper.dispose(this.f4638c);
                        observer.onError(thTerminate);
                        return;
                    }
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    simplePlainQueue.clear();
                    DisposableHelper.dispose(this.f4639d);
                    DisposableHelper.dispose(this.f4638c);
                    observer.onError(thTerminate2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (this.f4642i) {
                    boolean z3 = this.f4641f;
                    T tPoll = simplePlainQueue.poll();
                    if (tPoll == null) {
                        int i4 = f4634g + 89;
                        f4635h = i4 % 128;
                        int i5 = i4 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3) {
                        int i6 = f4634g + 83;
                        f4635h = i6 % 128;
                        int i7 = i6 % 2;
                        if (z2) {
                            DisposableHelper.dispose(this.f4638c);
                            observer.onComplete();
                            return;
                        }
                    }
                    if (!z2) {
                        int i8 = f4635h + 93;
                        f4634g = i8 % 128;
                        int i9 = i8 % 2;
                        observer.onNext(tPoll);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
        }

        final void b(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4634g + 53;
            f4635h = i3 % 128;
            int i4 = i3 % 2;
            this.f4642i = z2;
            if (z2) {
                int i5 = f4634g + 75;
                f4635h = i5 % 128;
                int i6 = i5 % 2;
                c();
                int i7 = f4634g + 5;
                f4635h = i7 % 128;
                int i8 = i7 % 2;
            }
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            b bVar = (b) objArr[0];
            Throwable th = (Throwable) objArr[1];
            int i2 = 2 % 2;
            int i3 = f4634g + 111;
            f4635h = i3 % 128;
            if (i3 % 2 != 0) {
                bVar.onError(th);
                return null;
            }
            bVar.onError(th);
            throw null;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            int i2 = 2 % 2;
            Object[] objArr2 = {(b) objArr[0], new IllegalStateException("The valve source completed unexpectedly.")};
            int iC = FormsYesNoScreenKt.h.c();
            c(objArr2, FormsYesNoScreenKt.h.c(), 965151488, -965151487, FormsYesNoScreenKt.h.c(), iC, FormsYesNoScreenKt.h.c());
            int i3 = f4634g + 63;
            f4635h = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 72 / 0;
            }
            return null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.b.a$b$a */
        final class C0210a extends AtomicReference<Disposable> implements Observer<Boolean> {

            /* JADX INFO: renamed from: a */
            private static int f4644a = 1;

            /* JADX INFO: renamed from: b */
            private static int f4645b = 0;

            C0210a() {
            }

            @Override // io.reactivex.Observer
            public final /* synthetic */ void onNext(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f4644a + 77;
                f4645b = i3 % 128;
                int i4 = i3 % 2;
                c(bool);
                int i5 = f4645b + 81;
                f4644a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(Disposable disposable) {
                int i2 = 2 % 2;
                int i3 = f4645b + 79;
                f4644a = i3 % 128;
                int i4 = i3 % 2;
                DisposableHelper.setOnce(this, disposable);
                int i5 = f4644a + 67;
                f4645b = i5 % 128;
                int i6 = i5 % 2;
            }

            private void c(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f4644a + 85;
                f4645b = i3 % 128;
                int i4 = i3 % 2;
                b.this.b(bool.booleanValue());
                int i5 = f4645b + 65;
                f4644a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f4645b + 41;
                f4644a = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {b.this, th};
                int iC = FormsYesNoScreenKt.h.c();
                b.c(objArr, FormsYesNoScreenKt.h.c(), 965151488, -965151487, FormsYesNoScreenKt.h.c(), iC, FormsYesNoScreenKt.h.c());
                int i5 = f4645b + 121;
                f4644a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                int i2 = 2 % 2;
                int i3 = f4644a + 53;
                f4645b = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = {b.this};
                    int iC = FormsYesNoScreenKt.h.c();
                    b.c(objArr, FormsYesNoScreenKt.h.c(), -1563601305, 1563601305, FormsYesNoScreenKt.h.c(), iC, FormsYesNoScreenKt.h.c());
                    int i4 = 39 / 0;
                    return;
                }
                Object[] objArr2 = {b.this};
                int iC2 = FormsYesNoScreenKt.h.c();
                b.c(objArr2, FormsYesNoScreenKt.h.c(), -1563601305, 1563601305, FormsYesNoScreenKt.h.c(), iC2, FormsYesNoScreenKt.h.c());
            }
        }

        final void b() {
            int iC = FormsYesNoScreenKt.h.c();
            c(new Object[]{this}, FormsYesNoScreenKt.h.c(), -1563601305, 1563601305, FormsYesNoScreenKt.h.c(), iC, FormsYesNoScreenKt.h.c());
        }

        final void b(Throwable th) {
            int iC = FormsYesNoScreenKt.h.c();
            c(new Object[]{this, th}, FormsYesNoScreenKt.h.c(), 965151488, -965151487, FormsYesNoScreenKt.h.c(), iC, FormsYesNoScreenKt.h.c());
        }
    }
}
