package com.incode.welcome_sdk.data.local.model.delayed_onboarding.a;

import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.bn;
import com.incode.welcome_sdk.results.CombinedConsentResult;
import com.incode.welcome_sdk.results.ResultCode;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<CombinedConsentResult> {

    /* JADX INFO: renamed from: b */
    private static int f8655b = 0;

    /* JADX INFO: renamed from: j */
    private static int f8656j = 1;

    /* JADX INFO: renamed from: a */
    private final boolean f8657a;

    /* JADX INFO: renamed from: c */
    private final c f8658c;

    /* JADX INFO: renamed from: d */
    private final com.incode.welcome_sdk.data.local.a.d.d.d f8659d;

    /* JADX INFO: renamed from: e */
    private final IncodeWelcomeRepository f8660e;

    public e(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.data.local.a.d.d.d dVar, c cVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        this.f8660e = incodeWelcomeRepository;
        this.f8659d = dVar;
        this.f8658c = cVar;
        this.f8657a = cVar.d();
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Completable b() {
        int i2 = 2 % 2;
        int i3 = f8656j + 19;
        f8655b = i3 % 128;
        if (i3 % 2 == 0) {
            return e.C0231e.c(this);
        }
        e.C0231e.c(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final /* synthetic */ Completable b(CombinedConsentResult combinedConsentResult) {
        int i2 = 2 % 2;
        int i3 = f8656j + 11;
        f8655b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableA = a(combinedConsentResult);
        int i5 = f8656j + 33;
        f8655b = i5 % 128;
        if (i5 % 2 == 0) {
            return completableA;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8656j + 69;
        int i4 = i3 % 128;
        f8655b = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f8657a;
        int i5 = i4 + 29;
        f8656j = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    static final class d extends Lambda implements Function1<ResponseSuccess, SingleSource<? extends CombinedConsentResult>> {

        /* JADX INFO: renamed from: a */
        private static int f8661a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8662b = 1;

        /* JADX INFO: renamed from: c */
        public static final d f8663c = new d();

        /* JADX INFO: renamed from: d */
        private static int f8664d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8665e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends CombinedConsentResult> invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f8665e + 41;
            f8662b = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends CombinedConsentResult> singleSourceD = d(responseSuccess);
            int i5 = f8665e + 63;
            f8662b = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSourceD;
            }
            throw null;
        }

        private static SingleSource<? extends CombinedConsentResult> d(ResponseSuccess responseSuccess) {
            Single singleJust;
            int i2;
            int i3 = 2 % 2;
            int i4 = f8662b + 31;
            f8665e = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(responseSuccess, "");
                responseSuccess.isSuccess();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (responseSuccess.isSuccess()) {
                singleJust = Single.just(new CombinedConsentResult(ResultCode.SUCCESS, null, true));
                i2 = f8665e + 109;
            } else {
                singleJust = Single.just(new CombinedConsentResult(ResultCode.ERROR, new IncodeGenericError("Exception occurred while signing consents"), false, 4, null));
                i2 = f8665e + 53;
            }
            f8662b = i2 % 128;
            int i5 = i2 % 2;
            return singleJust;
        }

        static {
            int i2 = f8664d + 83;
            f8661a = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Single<? extends CombinedConsentResult> e() {
        int i2 = 2 % 2;
        Single<ResponseSuccess> singleSignCombinedConsent = this.f8660e.signCombinedConsent(new bn(this.f8658c.c(), this.f8658c.a()));
        final d dVar = d.f8663c;
        Single<? extends CombinedConsentResult> singleOnErrorReturn = singleSignCombinedConsent.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.d(dVar, obj);
            }
        }).onErrorReturn(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.b((Throwable) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "");
        int i3 = f8655b + 95;
        f8656j = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return singleOnErrorReturn;
    }

    public static final SingleSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8656j + 17;
        f8655b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f8655b + 125;
        f8656j = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    public static final CombinedConsentResult b(Throwable th) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        CombinedConsentResult combinedConsentResult = new CombinedConsentResult(ResultCode.ERROR, th, false, 4, null);
        int i3 = f8656j + 3;
        f8655b = i3 % 128;
        int i4 = i3 % 2;
        return combinedConsentResult;
    }

    public static final CompletableSource c(e eVar, CombinedConsentResult combinedConsentResult) {
        int i2 = 2 % 2;
        int i3 = f8655b + 83;
        f8656j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(eVar, "");
            Intrinsics.checkNotNullParameter(combinedConsentResult, "");
            com.incode.welcome_sdk.data.local.a.d.d.d dVar = eVar.f8659d;
            Object[] objArr = {eVar.f8658c};
            int iE = bf.a.e();
            Object[] objArr2 = {dVar, combinedConsentResult, Long.valueOf(((Long) c.c(bf.a.e(), bf.a.e(), bf.a.e(), 340780288, objArr, iE, -340780287)).longValue())};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(combinedConsentResult, "");
        com.incode.welcome_sdk.data.local.a.d.d.d dVar2 = eVar.f8659d;
        Object[] objArr3 = {eVar.f8658c};
        int iE2 = bf.a.e();
        Object[] objArr4 = {dVar2, combinedConsentResult, Long.valueOf(((Long) c.c(bf.a.e(), bf.a.e(), bf.a.e(), 340780288, objArr3, iE2, -340780287)).longValue())};
        Completable completable = (Completable) com.incode.welcome_sdk.data.local.a.d.d.d.e(bf.a.e(), bf.a.e(), bf.a.e(), -1740025122, 1740025122, bf.a.e(), objArr4);
        int i4 = f8656j + 65;
        f8655b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return completable;
    }

    private Completable a(final CombinedConsentResult combinedConsentResult) {
        int i2 = 2 % 2;
        int i3 = f8655b + 101;
        f8656j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(combinedConsentResult, "");
        Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.c(this.f$0, combinedConsentResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDefer, "");
        int i5 = f8655b + 107;
        f8656j = i5 % 128;
        int i6 = i5 % 2;
        return completableDefer;
    }
}
