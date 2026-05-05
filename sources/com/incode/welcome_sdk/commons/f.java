package com.incode.welcome_sdk.commons;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5142e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f5143j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BehaviorSubject<Lifecycle.Event> f5145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lifecycle f5146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicInteger f5147d;

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (~(i2 | i3)) | i7;
        int i9 = (~((~i3) | i2)) | i7;
        int i10 = (~i7) | i2;
        int i11 = i7 + i2 + i4 + (440753341 * i6) + ((-634449194) * i5);
        int i12 = i11 * i11;
        int i13 = ((-907101825) * i7) + 1075183616 + ((-1421434046) * i2) + (i8 * (-1603099839)) + ((-1603099839) * i9) + (1603099839 * i10) + (181665792 * i4) + (780402688 * i6) + ((-180879360) * i5) + (353763328 * i12);
        int i14 = (i7 * 892202253) + 1676176333 + (i2 * 892200102) + (i8 * (-717)) + (i9 * (-717)) + (i10 * 717) + (i4 * 892200819) + (i6 * (-770690073)) + (i5 * 448958498) + (i12 * 1390542848);
        if (i13 + (i14 * i14 * (-1042677760)) != 1) {
            return b(objArr);
        }
        f fVar = (f) objArr[0];
        LifecycleOwner lifecycleOwner = (LifecycleOwner) objArr[1];
        int i15 = 2 % 2;
        int i16 = f5142e + 89;
        f5143j = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        fVar.f5145b.onNext(Lifecycle.Event.ON_CREATE);
        int i18 = f5143j + 53;
        f5142e = i18 % 128;
        int i19 = i18 % 2;
        return null;
    }

    public f(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.f5146c = lifecycle;
        BehaviorSubject<Lifecycle.Event> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "");
        this.f5145b = behaviorSubjectCreate;
        this.f5147d = new AtomicInteger(0);
    }

    public static final /* synthetic */ AtomicInteger d(f fVar) {
        int i2 = 2 % 2;
        int i3 = f5142e + 101;
        int i4 = i3 % 128;
        f5143j = i4;
        int i5 = i3 % 2;
        AtomicInteger atomicInteger = fVar.f5147d;
        int i6 = i4 + 59;
        f5142e = i6 % 128;
        int i7 = i6 % 2;
        return atomicInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.Observable<androidx.lifecycle.Lifecycle.Event> b() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.f.f5143j
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.f.f5142e = r0
            int r1 = r1 % r3
            r2 = 1
            if (r1 == 0) goto L44
            boolean r1 = r4.f5144a
            r0 = 82
            int r0 = r0 / 0
            if (r1 == 0) goto L4a
        L17:
            io.reactivex.subjects.BehaviorSubject<androidx.lifecycle.Lifecycle$Event> r0 = r4.f5145b
            io.reactivex.Observable r2 = r0.hide()
            com.incode.welcome_sdk.commons.f$e r1 = new com.incode.welcome_sdk.commons.f$e
            r1.<init>()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.incode.welcome_sdk.commons.f$$ExternalSyntheticLambda0 r0 = new com.incode.welcome_sdk.commons.f$$ExternalSyntheticLambda0
            r0.<init>()
            io.reactivex.Observable r1 = r2.doOnSubscribe(r0)
            com.incode.welcome_sdk.commons.f$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.commons.f$$ExternalSyntheticLambda1
            r0.<init>()
            io.reactivex.Observable r1 = r1.doOnDispose(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r1 = r1.unsubscribeOn(r0)
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L44:
            boolean r0 = r4.f5144a
            r0 = r0 ^ r2
            if (r0 == r2) goto L4a
            goto L17
        L4a:
            androidx.lifecycle.Lifecycle r1 = r4.f5146c
            r0 = r4
            androidx.lifecycle.LifecycleObserver r0 = (androidx.lifecycle.LifecycleObserver) r0
            r1.addObserver(r0)
            r4.f5144a = r2
            int r0 = com.incode.welcome_sdk.commons.f.f5142e
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.f.f5143j = r0
            int r1 = r1 % r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.f.b():io.reactivex.Observable");
    }

    static final class e extends Lambda implements Function1<Disposable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5148b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5149e = 0;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f5149e + 107;
            f5148b = i3 % 128;
            int i4 = i3 % 2;
            f.d(f.this).incrementAndGet();
            if (i4 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Disposable disposable) {
            int i2 = 2 % 2;
            int i3 = f5148b + 57;
            f5149e = i3 % 128;
            int i4 = i3 % 2;
            a();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 57 / 0;
            }
            int i6 = f5149e + 9;
            f5148b = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5142e + 111;
        f5143j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f5142e + 111;
        f5143j = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        f fVar = (f) objArr[0];
        int i2 = 2 % 2;
        int i3 = f5143j + 105;
        f5142e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(fVar, "");
        Object obj = null;
        if (fVar.f5147d.decrementAndGet() == 0) {
            int i5 = f5143j + 51;
            f5142e = i5 % 128;
            if (i5 % 2 != 0) {
                fVar.d();
                obj.hashCode();
                throw null;
            }
            fVar.d();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    private final void d() {
        ?? r1;
        int i2 = 2 % 2;
        int i3 = f5142e + 11;
        f5143j = i3 % 128;
        if (i3 % 2 == 0) {
            this.f5146c.removeObserver(this);
            r1 = 1;
        } else {
            this.f5146c.removeObserver(this);
            r1 = 0;
        }
        this.f5144a = r1;
        this.f5145b.onComplete();
        BehaviorSubject<Lifecycle.Event> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "");
        this.f5145b = behaviorSubjectCreate;
        this.f5147d.set(r1);
        int i4 = f5142e + 115;
        f5143j = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        int i2 = 2 % 2;
        int i3 = f5143j + 73;
        f5142e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.f5145b.onNext(Lifecycle.Event.ON_START);
        int i5 = f5143j + 65;
        f5142e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        int i2 = 2 % 2;
        int i3 = f5142e + 7;
        f5143j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.f5145b.onNext(Lifecycle.Event.ON_RESUME);
        int i5 = f5143j + 105;
        f5142e = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        int i2 = 2 % 2;
        int i3 = f5142e + 29;
        f5143j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            this.f5145b.onNext(Lifecycle.Event.ON_PAUSE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.f5145b.onNext(Lifecycle.Event.ON_PAUSE);
        int i4 = f5142e + 89;
        f5143j = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        int i2 = 2 % 2;
        int i3 = f5142e + 113;
        f5143j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.f5145b.onNext(Lifecycle.Event.ON_STOP);
        int i5 = f5142e + 17;
        f5143j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        int i2 = 2 % 2;
        int i3 = f5143j + 27;
        f5142e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.f5145b.onNext(Lifecycle.Event.ON_DESTROY);
        int i5 = f5143j + 121;
        f5142e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f fVar) {
        e(new Object[]{fVar}, -1268270651, com.incode.welcome_sdk.data.remote.e.d(), com.incode.welcome_sdk.data.remote.e.d(), com.incode.welcome_sdk.data.remote.e.d(), com.incode.welcome_sdk.data.remote.e.d(), 1268270651);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        e(new Object[]{this, lifecycleOwner}, -731400552, com.incode.welcome_sdk.data.remote.e.d(), com.incode.welcome_sdk.data.remote.e.d(), com.incode.welcome_sdk.data.remote.e.d(), com.incode.welcome_sdk.data.remote.e.d(), 731400553);
    }
}
