package com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;

import androidx.core.util.Pair;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.a.d.b.c;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import com.incode.welcome_sdk.data.remote.beans.bb;
import com.incode.welcome_sdk.results.IdProcessResult;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<IdProcessResult> {

    /* JADX INFO: renamed from: a */
    private static int f8844a = 0;

    /* JADX INFO: renamed from: g */
    private static int f8845g = 1;

    /* JADX INFO: renamed from: b */
    private final IncodeWelcomeRepository f8846b;

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b f8847c;

    /* JADX INFO: renamed from: d */
    private final boolean f8848d;

    /* JADX INFO: renamed from: e */
    private final c f8849e;

    public e(IncodeWelcomeRepository incodeWelcomeRepository, c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        this.f8846b = incodeWelcomeRepository;
        this.f8849e = cVar;
        this.f8847c = bVar;
        this.f8848d = bVar.a();
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Completable b() {
        int i2 = 2 % 2;
        int i3 = f8844a + 47;
        f8845g = i3 % 128;
        if (i3 % 2 != 0) {
            return e.C0231e.c(this);
        }
        e.C0231e.c(this);
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final /* synthetic */ Completable b(IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f8844a + 25;
        f8845g = i3 % 128;
        IdProcessResult idProcessResult2 = idProcessResult;
        if (i3 % 2 == 0) {
            e(idProcessResult2);
            throw null;
        }
        Completable completableE = e(idProcessResult2);
        int i4 = f8844a + 19;
        f8845g = i4 % 128;
        if (i4 % 2 != 0) {
            return completableE;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8844a + 5;
        int i4 = i3 % 128;
        f8845g = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f8848d;
        int i5 = i4 + 105;
        f8844a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return z2;
    }

    static final class b extends Lambda implements Function1<Pair<IdProcessResult, bb>, IdProcessResult> {

        /* JADX INFO: renamed from: a */
        private static int f8850a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8851b = 0;

        /* JADX INFO: renamed from: c */
        private static int f8852c = 1;

        /* JADX INFO: renamed from: d */
        private static int f8853d = 0;

        /* JADX INFO: renamed from: e */
        public static final b f8854e = new b();

        private static IdProcessResult e(Pair<IdProcessResult, bb> pair) {
            int i2 = 2 % 2;
            int i3 = f8852c + 11;
            f8853d = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(pair, "");
                IdProcessResult idProcessResult = pair.first;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(pair, "");
            IdProcessResult idProcessResult2 = pair.first;
            int i4 = f8852c + 121;
            f8853d = i4 % 128;
            if (i4 % 2 == 0) {
                return idProcessResult2;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ IdProcessResult invoke(Pair<IdProcessResult, bb> pair) {
            int i2 = 2 % 2;
            int i3 = f8853d + 107;
            f8852c = i3 % 128;
            int i4 = i3 % 2;
            IdProcessResult idProcessResultE = e(pair);
            int i5 = f8852c + 43;
            f8853d = i5 % 128;
            if (i5 % 2 == 0) {
                return idProcessResultE;
            }
            throw null;
        }

        static {
            int i2 = f8851b + 43;
            f8850a = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(1);
        }
    }

    public static final IdProcessResult c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8845g + 95;
        f8844a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (IdProcessResult) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 1 / 0;
        return (IdProcessResult) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$e */
    static final class C0232e extends Lambda implements Function1<Throwable, SingleSource<? extends IdProcessResult>> {

        /* JADX INFO: renamed from: a */
        private static int f8855a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8856b = 0;

        /* JADX INFO: renamed from: c */
        private static int f8857c = 1;

        /* JADX INFO: renamed from: d */
        public static final C0232e f8858d = new C0232e();

        /* JADX INFO: renamed from: e */
        private static int f8859e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends IdProcessResult> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f8859e + 75;
            f8857c = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends IdProcessResult> singleSourceB = b(th);
            int i5 = f8859e + 17;
            f8857c = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSourceB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static io.reactivex.SingleSource<? extends com.incode.welcome_sdk.results.IdProcessResult> b(java.lang.Throwable r4) {
            /*
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e.C0232e.f8859e
                int r1 = r0 + 31
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e.C0232e.f8857c = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 != 0) goto L3b
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r1 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r4)
                r0 = 69
                int r0 = r0 / 0
                r0 = 1
                if (r1 == r0) goto L2a
            L1e:
                com.incode.welcome_sdk.commons.utils.n r0 = com.incode.welcome_sdk.commons.utils.n.f6552a
                int r0 = com.incode.welcome_sdk.commons.utils.n.b(r4)
                boolean r0 = com.incode.welcome_sdk.commons.utils.n.c(r0)
                if (r0 == 0) goto L45
            L2a:
                com.incode.welcome_sdk.results.IdProcessResult r2 = new com.incode.welcome_sdk.results.IdProcessResult
                com.incode.welcome_sdk.results.ResultCode r1 = com.incode.welcome_sdk.results.ResultCode.ERROR
                r0 = 0
                r2.<init>(r1, r0)
                r2.error = r4
                io.reactivex.Single r0 = io.reactivex.Single.just(r2)
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0
                return r0
            L3b:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r4)
                if (r0 != 0) goto L2a
                goto L1e
            L45:
                io.reactivex.Single r2 = io.reactivex.Single.error(r4)
                io.reactivex.SingleSource r2 = (io.reactivex.SingleSource) r2
                int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e.C0232e.f8859e
                int r1 = r0 + 7
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e.C0232e.f8857c = r0
                int r1 = r1 % r3
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e.C0232e.b(java.lang.Throwable):io.reactivex.SingleSource");
        }

        static {
            int i2 = f8855a + 17;
            f8856b = i2 % 128;
            int i3 = i2 % 2;
        }

        C0232e() {
            super(1);
        }
    }

    public static final SingleSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8845g + 17;
        f8844a = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i4 = f8844a + 51;
        f8845g = i4 % 128;
        if (i4 % 2 != 0) {
            return singleSource;
        }
        obj2.hashCode();
        throw null;
    }

    public static final SingleSource e(e eVar) {
        Single singleFirstOrError;
        Function function;
        int i2 = 2 % 2;
        int i3 = f8844a + 97;
        f8845g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(eVar, "");
            Observable<Pair<IdProcessResult, bb>> observableProcessId = eVar.f8846b.processId(false);
            final b bVar = b.f8854e;
            singleFirstOrError = observableProcessId.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.c(bVar, obj);
                }
            }).firstOrError();
            final C0232e c0232e = C0232e.f8858d;
            function = new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.a(c0232e, obj);
                }
            };
        } else {
            Intrinsics.checkNotNullParameter(eVar, "");
            Observable<Pair<IdProcessResult, bb>> observableProcessId2 = eVar.f8846b.processId(false);
            final b bVar2 = b.f8854e;
            singleFirstOrError = observableProcessId2.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.c(bVar2, obj);
                }
            }).firstOrError();
            final C0232e c0232e2 = C0232e.f8858d;
            function = new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return e.a(c0232e2, obj);
                }
            };
        }
        return singleFirstOrError.onErrorResumeNext(function);
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Single<? extends IdProcessResult> e() {
        int i2 = 2 % 2;
        int i3 = f8845g + 121;
        f8844a = i3 % 128;
        int i4 = i3 % 2;
        Single<? extends IdProcessResult> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.e(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDefer, "");
        int i5 = f8845g + 59;
        f8844a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return singleDefer;
    }

    public static final CompletableSource d(e eVar, IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f8845g + 67;
        f8844a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(eVar, "");
            Intrinsics.checkNotNullParameter(idProcessResult, "");
            return eVar.f8849e.c(idProcessResult, eVar.f8847c.e());
        }
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(idProcessResult, "");
        int i4 = 37 / 0;
        return eVar.f8849e.c(idProcessResult, eVar.f8847c.e());
    }

    private Completable e(final IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f8845g + 109;
        f8844a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idProcessResult, "");
        Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.d(this.f$0, idProcessResult);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDefer, "");
        int i5 = f8845g + 43;
        f8844a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return completableDefer;
    }
}
