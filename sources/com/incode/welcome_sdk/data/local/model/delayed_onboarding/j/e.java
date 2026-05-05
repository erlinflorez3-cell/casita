package com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;

import com.drew.metadata.iptc.IptcDirectory;
import com.incode.welcome_sdk.commons.exceptions.MissingFileException;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import com.incode.welcome_sdk.data.remote.beans.v;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<v> {

    /* JADX INFO: renamed from: b */
    private static int f8901b = 0;

    /* JADX INFO: renamed from: h */
    private static int f8902h = 1;

    /* JADX INFO: renamed from: a */
    private final a f8903a;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcomeRepository f8904c;

    /* JADX INFO: renamed from: d */
    private final com.incode.welcome_sdk.data.local.a.d.f.c f8905d;

    /* JADX INFO: renamed from: e */
    private final boolean f8906e;

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~(i8 | i2);
        int i10 = (~(i8 | i5)) | i9;
        int i11 = ~i2;
        int i12 = ~(i11 | i3);
        int i13 = i9 | i12 | (~(i11 | i5));
        int i14 = (~((~i5) | i11)) | i9 | i12;
        int i15 = i3 + i2 + i4 + ((-369695973) * i6) + (1794320298 * i7);
        int i16 = i15 * i15;
        int i17 = ((-1820121865) * i3) + 1478230016 + (776760710 * i2) + ((-1698084721) * i10) + ((-1731255050) * i13) + (865627525 * i14) + ((-88866816) * i4) + (217841664 * i6) + ((-410517504) * i7) + ((-175177728) * i16);
        int i18 = ((i3 * 1872133577) - 2052485254) + (i2 * 1872135674) + (i10 * 2097) + (i13 * (-1398)) + (i14 * IptcDirectory.TAG_UNIQUE_DOCUMENT_ID) + (i4 * 1872134975) + (i6 * (-1328892763)) + (i7 * (-1296121642)) + (i16 * (-1691287552));
        return i17 + ((i18 * i18) * (-1729036288)) != 1 ? d(objArr) : e(objArr);
    }

    public e(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.data.local.a.d.f.c cVar, a aVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        this.f8904c = incodeWelcomeRepository;
        this.f8905d = cVar;
        this.f8903a = aVar;
        int iC = ValidatingTaxIdPresenter.a.c();
        int iC2 = ValidatingTaxIdPresenter.a.c();
        this.f8906e = ((Boolean) a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC, -988071999, iC2, 988071999)).booleanValue();
    }

    public static final /* synthetic */ IncodeWelcomeRepository a(e eVar) {
        int i2 = 2 % 2;
        int i3 = f8901b + 75;
        f8902h = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = eVar.f8904c;
        if (i4 != 0) {
            return incodeWelcomeRepository;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Completable b() {
        int i2 = 2 % 2;
        int i3 = f8901b + 105;
        f8902h = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = e.C0231e.c(this);
        int i5 = f8902h + 107;
        f8901b = i5 % 128;
        int i6 = i5 % 2;
        return completableC;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final /* synthetic */ Completable b(v vVar) {
        int i2 = 2 % 2;
        int i3 = f8901b + 67;
        f8902h = i3 % 128;
        int i4 = i3 % 2;
        Completable completable = (Completable) e(new Object[]{this, vVar}, 1968492065, -1968492065, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
        int i5 = f8902h + 9;
        f8901b = i5 % 128;
        if (i5 % 2 == 0) {
            return completable;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8901b + 107;
        int i4 = i3 % 128;
        f8902h = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8906e;
        int i6 = i4 + 49;
        f8901b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 46 / 0;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.reactivex.SingleSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e r13) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e.d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e):io.reactivex.SingleSource");
    }

    static final class c extends Lambda implements Function1<Throwable, SingleSource<? extends String>> {

        /* JADX INFO: renamed from: a */
        public static final c f8907a = new c();

        /* JADX INFO: renamed from: b */
        private static int f8908b = 1;

        /* JADX INFO: renamed from: c */
        private static int f8909c = 0;

        /* JADX INFO: renamed from: d */
        private static int f8910d = 1;

        /* JADX INFO: renamed from: e */
        private static int f8911e = 0;

        private static SingleSource<? extends String> a(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Single singleError = Single.error(new MissingFileException(th));
            int i3 = f8908b + 65;
            f8911e = i3 % 128;
            int i4 = i3 % 2;
            return singleError;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends String> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f8908b + 3;
            f8911e = i3 % 128;
            Throwable th2 = th;
            if (i3 % 2 != 0) {
                a(th2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SingleSource<? extends String> singleSourceA = a(th2);
            int i4 = f8911e + 39;
            f8908b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return singleSourceA;
        }

        static {
            int i2 = f8910d + 55;
            f8909c = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aVar, "");
        String base64FromBitmap = BitmapUtils.getBase64FromBitmap(BitmapUtils.getBitmapFromFile(new File(aVar.e())));
        int i3 = f8902h + 75;
        f8901b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return base64FromBitmap;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e$e */
    static final class C0233e extends Lambda implements Function1<String, SingleSource<? extends v>> {

        /* JADX INFO: renamed from: a */
        private static int f8917a = 0;

        /* JADX INFO: renamed from: b */
        private static int f8918b = 1;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ a f8920e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends v> invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f8917a + 93;
            f8918b = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends v> singleSourceC = c(str);
            if (i4 == 0) {
                int i5 = 61 / 0;
            }
            return singleSourceC;
        }

        private SingleSource<? extends v> c(String str) {
            Single<v> singleFirstOrError;
            int i2 = 2 % 2;
            int i3 = f8917a + 55;
            f8918b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                singleFirstOrError = e.a(e.this).addFace(null, str, this.f8920e.c(), this.f8920e.b(), null).firstOrError();
                int i4 = 30 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                singleFirstOrError = e.a(e.this).addFace(null, str, this.f8920e.c(), this.f8920e.b(), null).firstOrError();
            }
            int i5 = f8918b + 95;
            f8917a = i5 % 128;
            int i6 = i5 % 2;
            return singleFirstOrError;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0233e(a aVar) {
            super(1);
            this.f8920e = aVar;
        }
    }

    public static final SingleSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8902h + 79;
        f8901b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f8902h + 57;
        f8901b = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    public static final SingleSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8901b + 25;
        f8902h = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i4 = f8902h + 87;
        f8901b = i4 % 128;
        int i5 = i4 % 2;
        return singleSource;
    }

    static final class d extends Lambda implements Function1<Throwable, SingleSource<? extends v>> {

        /* JADX INFO: renamed from: a */
        private static int f8912a = 0;

        /* JADX INFO: renamed from: b */
        private static int f8913b = 1;

        /* JADX INFO: renamed from: c */
        private static int f8914c = 1;

        /* JADX INFO: renamed from: d */
        private static int f8915d = 0;

        /* JADX INFO: renamed from: e */
        public static final d f8916e = new d();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends v> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f8912a + 29;
            f8913b = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends v> singleSourceE = e(th);
            if (i4 == 0) {
                int i5 = 39 / 0;
            }
            int i6 = f8912a + 91;
            f8913b = i6 % 128;
            int i7 = i6 % 2;
            return singleSourceE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
        
            if ((r3 instanceof com.incode.welcome_sdk.commons.exceptions.MissingFileException) != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
        
            if ((r3 instanceof com.incode.welcome_sdk.commons.exceptions.MissingFileException) != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
        
            return io.reactivex.Single.error(r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static io.reactivex.SingleSource<? extends com.incode.welcome_sdk.data.remote.beans.v> e(java.lang.Throwable r3) {
            /*
                r2 = 2
                int r0 = r2 % r2
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r3)
                if (r0 != 0) goto L37
                int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e.d.f8912a
                int r1 = r0 + 69
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e.d.f8913b = r0
                int r1 = r1 % r2
                com.incode.welcome_sdk.commons.utils.n r0 = com.incode.welcome_sdk.commons.utils.n.f6552a
                int r0 = com.incode.welcome_sdk.commons.utils.n.b(r3)
                boolean r1 = com.incode.welcome_sdk.commons.utils.n.c(r0)
                r0 = 1
                if (r1 == r0) goto L37
                int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e.d.f8912a
                int r1 = r0 + 17
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e.d.f8913b = r0
                int r1 = r1 % r2
                if (r1 != 0) goto L43
                boolean r1 = r3 instanceof com.incode.welcome_sdk.commons.exceptions.MissingFileException
                r0 = 85
                int r0 = r0 / 0
                if (r1 == 0) goto L48
            L37:
                com.incode.welcome_sdk.data.remote.beans.v r0 = new com.incode.welcome_sdk.data.remote.beans.v
                r0.<init>(r3)
                io.reactivex.Single r0 = io.reactivex.Single.just(r0)
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0
                return r0
            L43:
                boolean r0 = r3 instanceof com.incode.welcome_sdk.commons.exceptions.MissingFileException
                if (r0 == 0) goto L48
                goto L37
            L48:
                io.reactivex.Single r0 = io.reactivex.Single.error(r3)
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e.d.e(java.lang.Throwable):io.reactivex.SingleSource");
        }

        static {
            int i2 = f8914c + 21;
            f8915d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    public static final SingleSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8902h + 79;
        f8901b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f8902h + 97;
        f8901b = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Single<? extends v> e() {
        int i2 = 2 % 2;
        int i3 = f8902h + 1;
        f8901b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Single<? extends v> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.d(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDefer, "");
            int i4 = f8902h + 89;
            f8901b = i4 % 128;
            if (i4 % 2 == 0) {
                return singleDefer;
            }
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.d(this.f$0);
            }
        }), "");
        obj.hashCode();
        throw null;
    }

    public static final CompletableSource d(e eVar, v vVar) {
        int i2 = 2 % 2;
        int i3 = f8902h + 27;
        f8901b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(vVar, "");
        Completable completableE = eVar.f8905d.e(vVar, eVar.f8903a.d());
        int i5 = f8902h + 39;
        f8901b = i5 % 128;
        if (i5 % 2 == 0) {
            return completableE;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Completable completableDefer;
        final e eVar = (e) objArr[0];
        final v vVar = (v) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8902h + 11;
        f8901b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(vVar, "");
            completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.d(this.f$0, vVar);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableDefer, "");
            int i4 = 53 / 0;
        } else {
            Intrinsics.checkNotNullParameter(vVar, "");
            completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return e.d(this.f$0, vVar);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableDefer, "");
        }
        int i5 = f8901b + 13;
        f8902h = i5 % 128;
        int i6 = i5 % 2;
        return completableDefer;
    }

    public static final String e(a aVar) {
        return (String) e(new Object[]{aVar}, 1928429823, -1928429822, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
    }

    private Completable d(v vVar) {
        return (Completable) e(new Object[]{this, vVar}, 1968492065, -1968492065, BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e(), BaseView.DefaultImpls.e());
    }
}
