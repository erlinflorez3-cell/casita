package com.incode.welcome_sdk.ui.selfie_result;

import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.commons.m;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1;
import com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceMatchPresenter extends BaseModulePresenter implements FaceMatchContract.Presenter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f17367q = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f17368s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IncodeWelcomeRepository f17370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FaceMatchContract.View f17373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Scheduler f17374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Subject<FaceMatchResult> f17375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FaceMatch f17376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FaceMatchViewStateGenerator f17377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f17378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f17379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f17380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CompositeDisposable f17382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Scheduler f17383o;

    public static /* synthetic */ Object c(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~(i8 | i3);
        int i10 = ~(i6 | i3);
        int i11 = ~i6;
        int i12 = ~i3;
        int i13 = i9 | i10 | (~(i11 | i12 | i4));
        int i14 = i9 | (~(i8 | i6)) | i10;
        int i15 = (~(i3 | i4)) | (~(i11 | i3)) | (~(i8 | i12 | i6));
        int i16 = i4 + i6 + i2 + (1880080305 * i5) + (458392769 * i7);
        int i17 = i16 * i16;
        int i18 = ((766573918 * i4) - Integer.MIN_VALUE) + (1582236324 * i6) + (i13 * (-407831203)) + (815662406 * i14) + ((-407831203) * i15) + (1174405120 * i2) + (1711276032 * i5) + ((-973078528) * i7) + (68288512 * i17);
        int i19 = ((i4 * 319678698) - 2002258816) + (i6 * 319678284) + (i13 * 207) + (i14 * (-414)) + (i15 * 207) + (i2 * 319678491) + (i5 * (-161570901)) + (i7 * (-1160779685)) + (i17 * (-1109000192));
        int i20 = i18 + (i19 * i19 * (-1432485888));
        if (i20 == 1) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i21 = 2 % 2;
            int i22 = f17367q + 55;
            f17368s = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i24 = f17367q + 97;
            f17368s = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        if (i20 == 2) {
            return d(objArr);
        }
        Function1 function12 = (Function1) objArr[0];
        Object obj2 = objArr[1];
        int i26 = 2 % 2;
        int i27 = f17367q + 55;
        f17368s = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        SingleSource singleSource = (SingleSource) function12.invoke(obj2);
        int i29 = f17367q + 7;
        f17368s = i29 % 128;
        int i30 = i29 % 2;
        return singleSource;
    }

    public static final /* synthetic */ FaceMatch access$getFaceMatch$p(FaceMatchPresenter faceMatchPresenter) {
        int i2 = 2 % 2;
        int i3 = f17368s + 63;
        f17367q = i3 % 128;
        int i4 = i3 % 2;
        FaceMatch faceMatch = faceMatchPresenter.f17376h;
        if (i4 == 0) {
            int i5 = 50 / 0;
        }
        return faceMatch;
    }

    public static final /* synthetic */ FaceMatchContract.View access$getView$p(FaceMatchPresenter faceMatchPresenter) {
        int i2 = 2 % 2;
        int i3 = f17367q + 43;
        f17368s = i3 % 128;
        int i4 = i3 % 2;
        FaceMatchContract.View view = faceMatchPresenter.f17373e;
        if (i4 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean access$isAgeAssuranceUXEnabled$p(FaceMatchPresenter faceMatchPresenter) {
        int i2 = 2 % 2;
        int i3 = f17367q + 71;
        int i4 = i3 % 128;
        f17368s = i4;
        int i5 = i3 % 2;
        boolean z2 = faceMatchPresenter.f17378j;
        int i6 = i4 + 11;
        f17367q = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 60 / 0;
        }
        return z2;
    }

    public static final /* synthetic */ Completable access$proceedWithResults(FaceMatchPresenter faceMatchPresenter, FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        int i3 = f17368s + 31;
        f17367q = i3 % 128;
        if (i3 % 2 != 0) {
            return faceMatchPresenter.b(faceMatchResult);
        }
        faceMatchPresenter.b(faceMatchResult);
        throw null;
    }

    public static final /* synthetic */ void access$publishResultOrDefaultToTestModeIfEnabled(FaceMatchPresenter faceMatchPresenter, FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        int i3 = f17368s + 83;
        f17367q = i3 % 128;
        int i4 = i3 % 2;
        faceMatchPresenter.a(faceMatchResult);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f17368s + 27;
        f17367q = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FaceMatchPresenter(FaceMatchContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, boolean z2, boolean z3, boolean z4, boolean z5, Subject subject, FaceMatch faceMatch, FaceMatchViewStateGenerator faceMatchViewStateGenerator, Scheduler scheduler, Scheduler scheduler2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Scheduler schedulerIo = scheduler2;
        Scheduler schedulerMainThread = scheduler;
        FaceMatchViewStateGenerator faceMatchViewStateGenerator2 = (i2 & 256) != 0 ? new FaceMatchViewStateGenerator(incodeWelcomeRepository) : faceMatchViewStateGenerator;
        if ((i2 & 512) != 0) {
            schedulerMainThread = AndroidSchedulers.mainThread();
            Intrinsics.checkNotNullExpressionValue(schedulerMainThread, "");
        }
        if ((i2 & 1024) != 0) {
            schedulerIo = Schedulers.io();
            Intrinsics.checkNotNullExpressionValue(schedulerIo, "");
        }
        this(view, incodeWelcomeRepository, z2, z3, z4, z5, subject, faceMatch, faceMatchViewStateGenerator2, schedulerMainThread, schedulerIo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceMatchPresenter(FaceMatchContract.View view, IncodeWelcomeRepository incodeWelcomeRepository, boolean z2, boolean z3, boolean z4, boolean z5, Subject<FaceMatchResult> subject, FaceMatch faceMatch, FaceMatchViewStateGenerator faceMatchViewStateGenerator, Scheduler scheduler, Scheduler scheduler2) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(subject, "");
        Intrinsics.checkNotNullParameter(faceMatch, "");
        Intrinsics.checkNotNullParameter(faceMatchViewStateGenerator, "");
        Intrinsics.checkNotNullParameter(scheduler, "");
        Intrinsics.checkNotNullParameter(scheduler2, "");
        this.f17373e = view;
        this.f17370b = incodeWelcomeRepository;
        this.f17369a = z2;
        this.f17371c = z3;
        this.f17372d = z4;
        this.f17378j = z5;
        this.f17375g = subject;
        this.f17376h = faceMatch;
        this.f17377i = faceMatchViewStateGenerator;
        this.f17374f = scheduler;
        this.f17383o = scheduler2;
        this.f17382n = new CompositeDisposable();
        this.f17379k = LazyKt.lazy(new j());
        this.f17380l = z3 || z5 || !faceMatch.f10540b;
    }

    public final CompositeDisposable getDisposables() {
        int i2 = 2 % 2;
        int i3 = f17368s + 67;
        f17367q = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f17382n;
        }
        throw null;
    }

    static final class j extends Lambda implements Function0<FaceMatchResult> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17407d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17408e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ FaceMatchResult invoke() {
            FaceMatchResult faceMatchResultB;
            int i2 = 2 % 2;
            int i3 = f17407d + 27;
            f17408e = i3 % 128;
            if (i3 % 2 != 0) {
                faceMatchResultB = b();
                int i4 = 7 / 0;
            } else {
                faceMatchResultB = b();
            }
            int i5 = f17407d + 93;
            f17408e = i5 % 128;
            int i6 = i5 % 2;
            return faceMatchResultB;
        }

        private FaceMatchResult b() {
            int i2 = 2 % 2;
            FaceMatchResult faceMatchResult = new FaceMatchResult(ResultCode.EMULATOR_DETECTED, null, -1.0d, -1.0d, -1.0d, -1.0d, false, FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10541c, false, null, false, 1858, null);
            int i3 = f17407d + 51;
            f17408e = i3 % 128;
            if (i3 % 2 == 0) {
                return faceMatchResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        j() {
            super(0);
        }
    }

    private final FaceMatchResult a() {
        int i2 = 2 % 2;
        int i3 = f17367q + 33;
        f17368s = i3 % 128;
        int i4 = i3 % 2;
        FaceMatchResult faceMatchResult = (FaceMatchResult) this.f17379k.getValue();
        int i5 = f17367q + 33;
        f17368s = i5 % 128;
        int i6 = i5 % 2;
        return faceMatchResult;
    }

    static final class b extends Lambda implements Function1<Throwable, SingleSource<? extends FaceMatchResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17387a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f17388b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17389c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17390d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17391e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends FaceMatchResult> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17391e + 45;
            f17387a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends FaceMatchResult> singleSourceC = c(th);
            int i5 = f17387a + 47;
            f17391e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return singleSourceC;
        }

        private static SingleSource<? extends FaceMatchResult> c(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "Error while processing face.", new Object[0]);
            Single singleJust = Single.just(new FaceMatchResult(ResultCode.ERROR, th, 0.0d, 0.0d, 0.0d, 0.0d, false, null, false, null, false, 2044, null));
            int i3 = f17387a + 109;
            f17391e = i3 % 128;
            int i4 = i3 % 2;
            return singleJust;
        }

        static {
            int i2 = f17389c + 101;
            f17390d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        b() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource a(Function1 function1, Object obj) {
        SingleSource singleSource;
        int i2 = 2 % 2;
        int i3 = f17368s + 97;
        f17367q = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            singleSource = (SingleSource) function1.invoke(obj);
            int i4 = 95 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            singleSource = (SingleSource) function1.invoke(obj);
        }
        int i5 = f17368s + 111;
        f17367q = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return singleSource;
    }

    static final class h extends Lambda implements Function1<FaceMatchResult, SingleSource<? extends FaceMatchResult>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17402d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17403e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends FaceMatchResult> invoke(FaceMatchResult faceMatchResult) {
            int i2 = 2 % 2;
            int i3 = f17403e + 9;
            f17402d = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends FaceMatchResult> singleSourceA = a(faceMatchResult);
            int i5 = f17403e + 111;
            f17402d = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSourceA;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private io.reactivex.SingleSource<? extends com.incode.welcome_sdk.results.FaceMatchResult> a(com.incode.welcome_sdk.results.FaceMatchResult r5) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.this
                boolean r1 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.access$isAgeAssuranceUXEnabled$p(r0)
                r0 = 1
                r1 = r1 ^ r0
                if (r1 == r0) goto L30
            L12:
                r1 = 1
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                io.reactivex.Completable r2 = io.reactivex.Completable.timer(r1, r0)
                int r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.f17402d
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.f17403e = r0
                int r1 = r1 % r3
            L23:
                io.reactivex.Single r0 = io.reactivex.Single.just(r5)
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0
                io.reactivex.Single r0 = r2.andThen(r0)
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0
                return r0
            L30:
                int r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.f17403e
                int r1 = r0 + 19
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.f17402d = r0
                int r1 = r1 % r3
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.this
                com.incode.welcome_sdk.modules.FaceMatch r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.access$getFaceMatch$p(r0)
                boolean r0 = r0.f10540b
                if (r0 != 0) goto L44
                goto L12
            L44:
                int r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.f17403e
                int r1 = r0 + 87
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.f17402d = r0
                int r1 = r1 % r3
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.this
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract$View r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.access$getView$p(r0)
                io.reactivex.Completable r1 = r0.startAnimation()
                com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.this
                io.reactivex.Completable r0 = com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.access$proceedWithResults(r0, r5)
                io.reactivex.CompletableSource r0 = (io.reactivex.CompletableSource) r0
                io.reactivex.Completable r2 = r1.andThen(r0)
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter.h.a(com.incode.welcome_sdk.results.FaceMatchResult):io.reactivex.SingleSource");
        }

        h() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17368s + 103;
        f17367q = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f17368s + 125;
        f17367q = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<FaceMatchResult, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17400b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17401e = 1;

        private void d(FaceMatchResult faceMatchResult) {
            int i2 = 2 % 2;
            int i3 = f17401e + 73;
            f17400b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(faceMatchResult, "");
                FaceMatchPresenter.access$publishResultOrDefaultToTestModeIfEnabled((FaceMatchPresenter) this.receiver, faceMatchResult);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(faceMatchResult, "");
            FaceMatchPresenter.access$publishResultOrDefaultToTestModeIfEnabled((FaceMatchPresenter) this.receiver, faceMatchResult);
            int i4 = f17400b + 75;
            f17401e = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(FaceMatchResult faceMatchResult) {
            int i2 = 2 % 2;
            int i3 = f17401e + 109;
            f17400b = i3 % 128;
            int i4 = i3 % 2;
            d(faceMatchResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f17400b + 91;
            f17401e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        g(Object obj) {
            super(1, obj, FaceMatchPresenter.class, "publishResultOrDefaultToTestModeIfEnabled", "publishResultOrDefaultToTestModeIfEnabled(Lcom/incode/welcome_sdk/results/FaceMatchResult;)V", 0);
        }
    }

    /* synthetic */ class i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17405d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17406e = 1;

        private void a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17406e + 43;
            f17405d = i3 % 128;
            int i4 = i3 % 2;
            ((Timber.Forest) this.receiver).e(th);
            int i5 = f17405d + 31;
            f17406e = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f17405d + 45;
            f17406e = i3 % 128;
            int i4 = i3 % 2;
            a(th);
            Unit unit = Unit.INSTANCE;
            int i5 = f17405d + 125;
            f17406e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        i(Object obj) {
            super(1, obj, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17367q + 33;
        f17368s = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public final void startProcessing() {
        int i2 = 2 % 2;
        CompositeDisposable compositeDisposable = this.f17382n;
        Completable completableD = d();
        m mVar = m.f5301d;
        Single singleAndThen = completableD.andThen(m.e(CollectionsKt.listOf(com.incode.welcome_sdk.modules.g.f10685e))).andThen(c().subscribeOn(this.f17383o));
        final b bVar = b.f17388b;
        Single singleObserveOn = singleAndThen.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FaceMatchPresenter.a(bVar, obj);
            }
        }).observeOn(this.f17374f);
        final h hVar = new h();
        Single singleFlatMap = singleObserveOn.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FaceMatchPresenter.d(hVar, obj);
            }
        });
        final g gVar = new g(this);
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceMatchPresenter.c(gVar, obj);
            }
        };
        final i iVar = new i(Timber.Forest);
        compositeDisposable.add(singleFlatMap.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceMatchPresenter.e(iVar, obj);
            }
        }));
        int i3 = f17367q + 35;
        f17368s = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(FaceMatchPresenter faceMatchPresenter) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f17367q + 15;
        f17368s = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceMatchPresenter, "");
            boolean z3 = faceMatchPresenter.f17378j;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceMatchPresenter, "");
        if (faceMatchPresenter.f17378j || !faceMatchPresenter.f17376h.f10540b) {
            int i4 = f17368s + 71;
            f17367q = i4 % 128;
            int i5 = i4 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        faceMatchPresenter.f17373e.showProgressWithoutAnimation(z2);
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<FaceMatchContract.ViewState, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17392b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17393e = 1;

        private void b(FaceMatchContract.ViewState viewState) {
            int i2 = 2 % 2;
            int i3 = f17392b + 61;
            f17393e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(viewState, "");
            ((FaceMatchContract.View) this.receiver).updateViews(viewState);
            int i5 = f17393e + 81;
            f17392b = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(FaceMatchContract.ViewState viewState) {
            int i2 = 2 % 2;
            int i3 = f17393e + 47;
            f17392b = i3 % 128;
            int i4 = i3 % 2;
            b(viewState);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 34 / 0;
            }
            return unit;
        }

        c(Object obj) {
            super(1, obj, FaceMatchContract.View.class, "updateViews", "updateViews(Lcom/incode/welcome_sdk/ui/selfie_result/FaceMatchContract$ViewState;)V", 0);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f17368s + 121;
        f17367q = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            return null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        obj2.hashCode();
        throw null;
    }

    private final Completable d() {
        int i2 = 2 % 2;
        int i3 = f17368s + 19;
        f17367q = i3 % 128;
        int i4 = i3 % 2;
        if (this.f17380l) {
            Completable completableSubscribeOn = Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda10
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FaceMatchPresenter.c(this.f$0);
                }
            }).subscribeOn(this.f17374f);
            Intrinsics.checkNotNull(completableSubscribeOn);
            return completableSubscribeOn;
        }
        Single<FaceMatchContract.ViewState> singleObserveOn = this.f17377i.generate(this.f17376h).observeOn(this.f17374f);
        final c cVar = new c(this.f17373e);
        Completable completableIgnoreElement = singleObserveOn.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceMatchPresenter.b(cVar, obj);
            }
        }).ignoreElement();
        Intrinsics.checkNotNull(completableIgnoreElement);
        int i5 = f17367q + 103;
        f17368s = i5 % 128;
        int i6 = i5 % 2;
        return completableIgnoreElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(FaceMatchPresenter faceMatchPresenter, FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        int i3 = f17367q + 77;
        f17368s = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(faceMatchPresenter, "");
        Intrinsics.checkNotNullParameter(faceMatchResult, "");
        if (!(!faceMatchPresenter.f17371c)) {
            faceMatchPresenter.f17373e.showResultSubmitOnlyMode(faceMatchResult);
            return;
        }
        faceMatchPresenter.f17373e.showResultAnimationMode(faceMatchResult);
        int i5 = f17367q + 99;
        f17368s = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(FaceMatchPresenter faceMatchPresenter) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f17368s + 113;
        f17367q = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(faceMatchPresenter, "");
            boolean z3 = faceMatchPresenter.f17381m;
            FaceMatchContract.View view = faceMatchPresenter.f17373e;
            boolean z4 = faceMatchPresenter.f17369a;
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceMatchPresenter, "");
        boolean z5 = faceMatchPresenter.f17381m;
        FaceMatchContract.View view2 = faceMatchPresenter.f17373e;
        if (faceMatchPresenter.f17369a) {
            int i4 = f17368s + 31;
            f17367q = i4 % 128;
            int i5 = i4 % 2;
            z2 = false;
        } else {
            z2 = true;
        }
        view2.showLivenessCheckResult(z2);
        int i6 = f17368s + 121;
        f17367q = i6 % 128;
        int i7 = i6 % 2;
    }

    private final Completable b(final FaceMatchResult faceMatchResult) {
        Completable completableDelay;
        Action action;
        int i2 = 2 % 2;
        int i3 = f17367q + 103;
        f17368s = i3 % 128;
        if (i3 % 2 != 0) {
            completableDelay = Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FaceMatchPresenter.a(this.f$0, faceMatchResult);
                }
            }).delay(1L, TimeUnit.SECONDS, this.f17374f);
            action = new Action() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FaceMatchPresenter.d(this.f$0);
                }
            };
        } else {
            completableDelay = Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda8
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FaceMatchPresenter.a(this.f$0, faceMatchResult);
                }
            }).delay(1L, TimeUnit.SECONDS, this.f17374f);
            action = new Action() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda9
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FaceMatchPresenter.d(this.f$0);
                }
            };
        }
        return completableDelay.doOnComplete(action).delay(b(), TimeUnit.SECONDS, this.f17374f);
    }

    private final void a(FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        if (this.f17372d) {
            int i3 = f17367q + 11;
            f17368s = i3 % 128;
            int i4 = i3 % 2;
            faceMatchResult = a();
        }
        d(faceMatchResult);
        int i5 = f17367q + 63;
        f17368s = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
    }

    private final long b() {
        int i2 = 2 % 2;
        int i3 = f17367q;
        int i4 = i3 + 37;
        f17368s = i4 % 128;
        int i5 = i4 % 2;
        if (!this.f17371c) {
            return 1L;
        }
        int i6 = i3 + 89;
        f17368s = i6 % 128;
        int i7 = i6 % 2;
        return 3L;
    }

    static final class a extends Lambda implements Function2<bf, bf, FaceMatchResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17384a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17385c = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ FaceMatchResult invoke(bf bfVar, bf bfVar2) {
            int i2 = 2 % 2;
            int i3 = f17384a + 117;
            f17385c = i3 % 128;
            int i4 = i3 % 2;
            FaceMatchResult faceMatchResultA = a(bfVar, bfVar2);
            int i5 = f17385c + 31;
            f17384a = i5 % 128;
            if (i5 % 2 == 0) {
                return faceMatchResultA;
            }
            throw null;
        }

        private FaceMatchResult a(bf bfVar, bf bfVar2) {
            int i2 = 2 % 2;
            int i3 = f17384a + 15;
            f17385c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bfVar, "");
            Intrinsics.checkNotNullParameter(bfVar2, "");
            FaceMatchResult faceMatchResultB = bfVar.b(FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10541c, FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10542e, Double.valueOf(bfVar2.e()));
            int i5 = f17385c + 115;
            f17384a = i5 % 128;
            int i6 = i5 % 2;
            return faceMatchResultB;
        }

        a() {
            super(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceMatchResult c(Function2 function2, Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = f17368s + 93;
        f17367q = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        FaceMatchResult faceMatchResult = (FaceMatchResult) function2.invoke(obj, obj2);
        int i4 = f17367q + 113;
        f17368s = i4 % 128;
        int i5 = i4 % 2;
        return faceMatchResult;
    }

    static final class d extends Lambda implements Function1<bf, SingleSource<? extends FaceMatchResult>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17394b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17395e = 0;

        private SingleSource<? extends FaceMatchResult> d(bf bfVar) {
            int i2 = 2 % 2;
            int i3 = f17394b + 55;
            f17395e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bfVar, "");
            Single singleJust = Single.just(bf.a(bfVar, FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10541c, FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10542e));
            int i5 = f17395e + 37;
            f17394b = i5 % 128;
            int i6 = i5 % 2;
            return singleJust;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends FaceMatchResult> invoke(bf bfVar) {
            int i2 = 2 % 2;
            int i3 = f17395e + 83;
            f17394b = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends FaceMatchResult> singleSourceD = d(bfVar);
            int i5 = f17394b + 7;
            f17395e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 87 / 0;
            }
            return singleSourceD;
        }

        d() {
            super(1);
        }
    }

    static final class e extends Lambda implements Function1<bf, SingleSource<? extends FaceMatchResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17397a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17398b = 1;

        private SingleSource<? extends FaceMatchResult> e(bf bfVar) {
            int i2 = 2 % 2;
            int i3 = f17397a + 69;
            f17398b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bfVar, "");
                return Single.just(bfVar.b(FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10541c, FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10542e, Double.valueOf(bfVar.e())));
            }
            Intrinsics.checkNotNullParameter(bfVar, "");
            Single.just(bfVar.b(FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10541c, FaceMatchPresenter.access$getFaceMatch$p(FaceMatchPresenter.this).f10542e, Double.valueOf(bfVar.e())));
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends FaceMatchResult> invoke(bf bfVar) {
            int i2 = 2 % 2;
            int i3 = f17398b + 69;
            f17397a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends FaceMatchResult> singleSourceE = e(bfVar);
            int i5 = f17398b + 57;
            f17397a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
            }
            return singleSourceE;
        }

        e() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f17367q + 57;
        f17368s = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i4 = f17368s + 75;
        f17367q = i4 % 128;
        if (i4 % 2 != 0) {
            return singleSource;
        }
        throw null;
    }

    private final Single<FaceMatchResult> c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f17367q + 33;
        f17368s = i3 % 128;
        if (i3 % 2 == 0 ? this.f17376h.f10541c.size() > 1 : this.f17376h.f10541c.size() > 1) {
            Single<bf> singleProcessFace = this.f17370b.processFace(this.f17376h.f10542e, false);
            Single<bf> singleProcessFace2 = this.f17370b.processFace(this.f17376h.f10542e, true);
            final a aVar = new a();
            return singleProcessFace.zipWith(singleProcessFace2, new BiFunction() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return FaceMatchPresenter.c(aVar, obj, obj2);
                }
            });
        }
        if (this.f17376h.f10541c.contains(IdCategory.FIRST)) {
            Single<bf> singleProcessFace3 = this.f17370b.processFace(this.f17376h.f10542e, false);
            final d dVar = new d();
            Single singleFlatMap = singleProcessFace3.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return FaceMatchPresenter.f(dVar, obj);
                }
            });
            int i4 = f17368s + 9;
            f17367q = i4 % 128;
            if (i4 % 2 != 0) {
                return singleFlatMap;
            }
            throw null;
        }
        Single<bf> singleProcessFace4 = this.f17370b.processFace(this.f17376h.f10542e, true);
        final e eVar = new e();
        return singleProcessFace4.flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FaceMatchPresenter.g(eVar, obj);
            }
        });
    }

    public final void handleUserCancelled() {
        int i2 = 2 % 2;
        publishResult(this.f17375g, new FaceMatchResult(ResultCode.USER_CANCELLED, null, 0.0d, 0.0d, 0.0d, 0.0d, false, this.f17376h.f10541c, false, null, false, 1918, null));
        int i3 = f17367q + 67;
        f17368s = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void d(FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        int i3 = f17367q + 33;
        f17368s = i3 % 128;
        int i4 = i3 % 2;
        publishResult(this.f17375g, faceMatchResult);
        int i5 = f17368s + 33;
        f17367q = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f17367q + 81;
        f17368s = i3 % 128;
        int i4 = i3 % 2;
        this.f17382n.clear();
        int i5 = f17368s + 13;
        f17367q = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource f(Function1 function1, Object obj) {
        int iA = IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a();
        return (SingleSource) c(IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), iA, 579941499, new Object[]{function1, obj}, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), -579941499, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function1 function1, Object obj) {
        int iA = IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a();
        c(IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), iA, -1177915731, new Object[]{function1, obj}, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 1177915733, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function1 function1, Object obj) {
        int iA = IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a();
        c(IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), iA, -997279135, new Object[]{function1, obj}, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a(), 997279136, IdCaptureViewModel$handleAutoCaptureObtained$betterCaptureJob$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1.a());
    }

    public static /* synthetic */ void getDisposables$annotations() {
        int i2 = 2 % 2;
        int i3 = f17367q + 107;
        f17368s = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
