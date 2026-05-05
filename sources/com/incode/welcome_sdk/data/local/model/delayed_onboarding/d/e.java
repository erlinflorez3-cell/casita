package com.incode.welcome_sdk.data.local.model.delayed_onboarding.d;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.MaxVideoLengthReachedException;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import com.incode.welcome_sdk.data.remote.beans.ResponseMedicalDoc;
import com.incode.welcome_sdk.data.remote.beans.ResponseOCRData;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bw;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<bw> {

    /* JADX INFO: renamed from: e */
    private static int f8799e = 0;

    /* JADX INFO: renamed from: j */
    private static int f8800j = 1;

    /* JADX INFO: renamed from: a */
    private final IncodeWelcomeRepository f8801a;

    /* JADX INFO: renamed from: b */
    private final boolean f8802b;

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d f8803c;

    /* JADX INFO: renamed from: d */
    private final com.incode.welcome_sdk.data.local.a.d.e.c f8804d;

    public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~i2;
        int i11 = (~(i8 | i9 | i10)) | (~(i7 | i2));
        int i12 = ~(i8 | i10);
        int i13 = i7 | i12;
        int i14 = (~(i2 | i5)) | i12 | (~(i9 | i5));
        int i15 = i5 + i7 + i4 + (296844165 * i3) + (1729652556 * i6);
        int i16 = i15 * i15;
        int i17 = ((i5 * 599922083) - 580124672) + (599922083 * i7) + (2088888926 * i11) + ((-117189444) * i13) + ((-2088888926) * i14) + ((-1606156288) * i4) + ((-279707648) * i3) + ((-265289728) * i6) + (2117271552 * i16);
        int i18 = (i5 * (-1181628991)) + 1322814002 + (i7 * (-1181628991)) + (i11 * (-118)) + (i13 * (-236)) + (i14 * 118) + (i4 * (-1181629109)) + (i3 * (-698251017)) + (i6 * 1773125444) + (i16 * 938541056);
        int i19 = i17 + (i18 * i18 * (-109772800));
        return i19 != 1 ? i19 != 2 ? d(objArr) : a(objArr) : c(objArr);
    }

    public e(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.data.local.a.d.e.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        Intrinsics.checkNotNullParameter(dVar, "");
        this.f8801a = incodeWelcomeRepository;
        this.f8804d = cVar;
        this.f8803c = dVar;
        int iD = IncodeWelcome.cm.d();
        int iD2 = IncodeWelcome.cm.d();
        this.f8802b = ((Boolean) com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.c(IncodeWelcome.cm.d(), iD2, new Object[]{dVar}, iD, -1648933131, IncodeWelcome.cm.d(), 1648933132)).booleanValue();
    }

    public static final /* synthetic */ Single a(e eVar, ResponseSuccess responseSuccess) {
        int i2 = 2 % 2;
        int i3 = f8799e + 69;
        f8800j = i3 % 128;
        int i4 = i3 % 2;
        Single<bw> singleB = eVar.b(responseSuccess);
        int i5 = f8800j + 19;
        f8799e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return singleB;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8800j + 7;
        f8799e = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = e.C0231e.c(eVar);
        int i5 = f8799e + 95;
        f8800j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return completableC;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8799e + 45;
        f8800j = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = eVar.f8801a;
        if (i4 != 0) {
            return incodeWelcomeRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Single e(e eVar, ResponseSuccess responseSuccess) {
        int i2 = 2 % 2;
        int i3 = f8799e + 77;
        f8800j = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar.a(responseSuccess);
        }
        eVar.a(responseSuccess);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final /* synthetic */ Completable b(bw bwVar) {
        int i2 = 2 % 2;
        int i3 = f8800j + 101;
        f8799e = i3 % 128;
        int i4 = i3 % 2;
        Completable completableD = d(bwVar);
        int i5 = f8799e + 125;
        f8800j = i5 % 128;
        int i6 = i5 % 2;
        return completableD;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8800j + 87;
        f8799e = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f8802b;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.reactivex.SingleSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e r11) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.f8800j
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.f8799e = r0
            int r1 = r1 % r4
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d r3 = r11.f8803c
            java.lang.String r2 = r3.b()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L2a
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.f8799e
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.f8800j = r0
            int r1 = r1 % r4
            int r0 = r2.length()
            if (r0 != 0) goto L3f
        L2a:
            com.incode.welcome_sdk.data.remote.beans.bw r3 = new com.incode.welcome_sdk.data.remote.beans.bw
            com.incode.welcome_sdk.commons.exceptions.MissingFileException r2 = new com.incode.welcome_sdk.commons.exceptions.MissingFileException
            r1 = 0
            r0 = 1
            r2.<init>(r1, r0, r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3.<init>(r1, r2, r0)
            io.reactivex.Single r2 = io.reactivex.Single.just(r3)
        L3c:
            io.reactivex.SingleSource r2 = (io.reactivex.SingleSource) r2
            return r2
        L3f:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r3.b()
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L4f
            goto L2a
        L4f:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r5 = r11.f8801a
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r6 = r3.d()
            java.io.File r7 = new java.io.File
            java.lang.String r0 = r3.b()
            r7.<init>(r0)
            java.lang.String r8 = r3.a()
            r9 = 0
            r10 = 0
            io.reactivex.Observable r0 = r5.sendDocumentScan(r6, r7, r8, r9, r10)
            io.reactivex.Single r2 = r0.singleOrError()
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$c r1 = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$c
            r1.<init>(r3, r11)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda5 r0 = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda5
            r0.<init>()
            io.reactivex.Single r2 = r2.flatMap(r0)
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$b r1 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.b.f8810c
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda6 r0 = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda6
            r0.<init>()
            io.reactivex.Single r2 = r2.onErrorResumeNext(r0)
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.f8799e
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.f8800j = r0
            int r1 = r1 % r4
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e.d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e):io.reactivex.SingleSource");
    }

    static final class c extends Lambda implements Function1<ResponseSuccess, SingleSource<? extends bw>> {

        /* JADX INFO: renamed from: a */
        private static int f8813a = 0;

        /* JADX INFO: renamed from: d */
        private static int f8814d = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d f8815b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ e f8816c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends bw> invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f8813a + 67;
            f8814d = i3 % 128;
            Object obj = null;
            ResponseSuccess responseSuccess2 = responseSuccess;
            if (i3 % 2 == 0) {
                c(responseSuccess2);
                obj.hashCode();
                throw null;
            }
            SingleSource<? extends bw> singleSourceC = c(responseSuccess2);
            int i4 = f8813a + 15;
            f8814d = i4 % 128;
            if (i4 % 2 != 0) {
                return singleSourceC;
            }
            throw null;
        }

        private SingleSource<? extends bw> c(ResponseSuccess responseSuccess) {
            Single singleA;
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (responseSuccess.isSuccess()) {
                DocumentType documentTypeD = this.f8815b.d();
                int i4 = documentTypeD == null ? -1 : a.f8819e[documentTypeD.ordinal()];
                if (i4 == 1) {
                    singleA = e.a(this.f8816c, responseSuccess);
                    i2 = f8813a + 43;
                    f8814d = i2 % 128;
                } else if (i4 != 2) {
                    singleA = Single.just(new bw(new Pair(responseSuccess, null), null, 2));
                    Intrinsics.checkNotNullExpressionValue(singleA, "");
                    i2 = f8814d + 73;
                    f8813a = i2 % 128;
                } else {
                    singleA = e.e(this.f8816c, responseSuccess);
                }
                int i5 = i2 % 2;
            } else {
                singleA = Single.just(new bw(new Pair(responseSuccess, null), null, 2));
                Intrinsics.checkNotNull(singleA);
            }
            return singleA;
        }

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: c */
            private static int f8817c = 0;

            /* JADX INFO: renamed from: d */
            private static int f8818d = 1;

            /* JADX INFO: renamed from: e */
            public static final /* synthetic */ int[] f8819e;

            static {
                int[] iArr = new int[DocumentType.values().length];
                try {
                    iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
                    int i2 = f8818d + 55;
                    f8817c = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DocumentType.MEDICAL_DOC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f8819e = iArr;
                int i5 = f8818d + 51;
                f8817c = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar, e eVar) {
            super(1);
            this.f8815b = dVar;
            this.f8816c = eVar;
        }
    }

    public static final SingleSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8800j + 75;
        f8799e = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (SingleSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<Throwable, SingleSource<? extends bw>> {

        /* JADX INFO: renamed from: a */
        private static int f8808a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8809b = 1;

        /* JADX INFO: renamed from: c */
        public static final b f8810c = new b();

        /* JADX INFO: renamed from: d */
        private static int f8811d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8812e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends bw> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f8811d + 91;
            f8808a = i3 % 128;
            Object obj = null;
            Throwable th2 = th;
            if (i3 % 2 == 0) {
                d(th2);
                obj.hashCode();
                throw null;
            }
            SingleSource<? extends bw> singleSourceD = d(th2);
            int i4 = f8811d + 91;
            f8808a = i4 % 128;
            if (i4 % 2 != 0) {
                return singleSourceD;
            }
            throw null;
        }

        private static SingleSource<? extends bw> d(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (!ThrowableExtensionsKt.isBadRequestError(th)) {
                n nVar = n.f6552a;
                if (!n.c(n.b(th))) {
                    Single singleError = Single.error(th);
                    int i3 = f8808a + 39;
                    f8811d = i3 % 128;
                    int i4 = i3 % 2;
                    return singleError;
                }
            }
            Single singleJust = Single.just(new bw(null, th, 1));
            int i5 = f8808a + 17;
            f8811d = i5 % 128;
            int i6 = i5 % 2;
            return singleJust;
        }

        static {
            int i2 = f8812e + 73;
            f8809b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
        }

        b() {
            super(1);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f8800j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8799e = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (SingleSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Single<? extends bw> e() {
        int i2 = 2 % 2;
        int i3 = f8800j + 65;
        f8799e = i3 % 128;
        int i4 = i3 % 2;
        Single<? extends bw> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.d(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDefer, "");
        int i5 = f8800j + 35;
        f8799e = i5 % 128;
        int i6 = i5 % 2;
        return singleDefer;
    }

    public static final CompletableSource a(e eVar, bw bwVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f8800j + 67;
        f8799e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(bwVar, "");
        Completable completableC = eVar.f8804d.c(eVar.f8803c.e(), eVar.f8803c.d(), bwVar);
        int i5 = f8800j + 77;
        f8799e = i5 % 128;
        int i6 = i5 % 2;
        return completableC;
    }

    private Completable d(final bw bwVar) {
        int i2 = 2 % 2;
        int i3 = f8799e + 11;
        f8800j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bwVar, "");
        Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.a(this.f$0, bwVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDefer, "");
        int i5 = f8799e + 9;
        f8800j = i5 % 128;
        if (i5 % 2 != 0) {
            return completableDefer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class a extends Lambda implements Function1<ResponseSuccess, SingleSource<? extends ResponseOCRData>> {

        /* JADX INFO: renamed from: a */
        private static int f8805a = 0;

        /* JADX INFO: renamed from: d */
        private static int f8806d = 1;

        private SingleSource<? extends ResponseOCRData> a(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f8805a + 109;
            f8806d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            Object[] objArr = {e.this};
            IncodeWelcomeRepository incodeWelcomeRepository = (IncodeWelcomeRepository) e.a(MaxVideoLengthReachedException.b(), MaxVideoLengthReachedException.b(), MaxVideoLengthReachedException.b(), 1723095211, MaxVideoLengthReachedException.b(), -1723095210, objArr);
            Object[] objArr2 = {e.this};
            Single<ResponseOCRData> singleSingleOrError = incodeWelcomeRepository.fetchOCRData(((IncodeWelcomeRepository) e.a(MaxVideoLengthReachedException.b(), MaxVideoLengthReachedException.b(), MaxVideoLengthReachedException.b(), 1723095211, MaxVideoLengthReachedException.b(), -1723095210, objArr2)).getToken()).singleOrError();
            int i5 = f8805a + 55;
            f8806d = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSingleOrError;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends ResponseOCRData> invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f8805a + 113;
            f8806d = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends ResponseOCRData> singleSourceA = a(responseSuccess);
            int i5 = f8805a + 113;
            f8806d = i5 % 128;
            int i6 = i5 % 2;
            return singleSourceA;
        }

        a() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<ResponseOCRData, bw> {

        /* JADX INFO: renamed from: b */
        private static int f8820b = 1;

        /* JADX INFO: renamed from: c */
        private static int f8821c = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ ResponseSuccess f8822a;

        private bw b(ResponseOCRData responseOCRData) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseOCRData, "");
            bw bwVar = new bw(new Pair(this.f8822a, responseOCRData), null, 2);
            int i3 = f8821c + 43;
            f8820b = i3 % 128;
            int i4 = i3 % 2;
            return bwVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ bw invoke(ResponseOCRData responseOCRData) {
            int i2 = 2 % 2;
            int i3 = f8821c + 29;
            f8820b = i3 % 128;
            ResponseOCRData responseOCRData2 = responseOCRData;
            if (i3 % 2 != 0) {
                return b(responseOCRData2);
            }
            b(responseOCRData2);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ResponseSuccess responseSuccess) {
            super(1);
            this.f8822a = responseSuccess;
        }
    }

    public static final SingleSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8799e + 33;
        f8800j = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (SingleSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final Single<bw> b(ResponseSuccess responseSuccess) {
        int i2 = 2 % 2;
        Single<ResponseSuccess> singleSingleOrError = this.f8801a.processAddressStatement().singleOrError();
        final a aVar = new a();
        Single<R> singleFlatMap = singleSingleOrError.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.b(aVar, obj);
            }
        });
        final d dVar = new d(responseSuccess);
        Single<bw> map = singleFlatMap.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.c(dVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        int i3 = f8800j + 55;
        f8799e = i3 % 128;
        if (i3 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final bw c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8799e + 11;
        f8800j = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (bw) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$e */
    static final class C0230e extends Lambda implements Function1<ResponseMedicalDoc, bw> {

        /* JADX INFO: renamed from: c */
        private static int f8823c = 1;

        /* JADX INFO: renamed from: e */
        private static int f8824e = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ ResponseSuccess f8825b;

        private bw d(ResponseMedicalDoc responseMedicalDoc) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseMedicalDoc, "");
            bw bwVar = new bw(new Pair(this.f8825b, responseMedicalDoc), null, 2);
            int i3 = f8824e + 29;
            f8823c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 69 / 0;
            }
            return bwVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ bw invoke(ResponseMedicalDoc responseMedicalDoc) {
            int i2 = 2 % 2;
            int i3 = f8823c + 101;
            f8824e = i3 % 128;
            int i4 = i3 % 2;
            bw bwVarD = d(responseMedicalDoc);
            int i5 = f8823c + 107;
            f8824e = i5 % 128;
            int i6 = i5 % 2;
            return bwVarD;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0230e(ResponseSuccess responseSuccess) {
            super(1);
            this.f8825b = responseSuccess;
        }
    }

    private final Single<bw> a(ResponseSuccess responseSuccess) {
        int i2 = 2 % 2;
        Single<ResponseMedicalDoc> singleSingleOrError = this.f8801a.processMedicalDoc().singleOrError();
        final C0230e c0230e = new C0230e(responseSuccess);
        Single map = singleSingleOrError.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return e.d(c0230e, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        int i3 = f8799e + 35;
        f8800j = i3 % 128;
        if (i3 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final bw d(Function1 function1, Object obj) {
        bw bwVar;
        int i2 = 2 % 2;
        int i3 = f8800j + 69;
        f8799e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            bwVar = (bw) function1.invoke(obj);
            int i4 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            bwVar = (bw) function1.invoke(obj);
        }
        int i5 = f8799e + 111;
        f8800j = i5 % 128;
        int i6 = i5 % 2;
        return bwVar;
    }

    public static final /* synthetic */ IncodeWelcomeRepository e(e eVar) {
        int iB = MaxVideoLengthReachedException.b();
        int iB2 = MaxVideoLengthReachedException.b();
        return (IncodeWelcomeRepository) a(iB, MaxVideoLengthReachedException.b(), iB2, 1723095211, MaxVideoLengthReachedException.b(), -1723095210, new Object[]{eVar});
    }

    public static final SingleSource a(Function1 function1, Object obj) {
        int iB = MaxVideoLengthReachedException.b();
        int iB2 = MaxVideoLengthReachedException.b();
        return (SingleSource) a(iB, MaxVideoLengthReachedException.b(), iB2, 423745749, MaxVideoLengthReachedException.b(), -423745749, new Object[]{function1, obj});
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Completable b() {
        int iB = MaxVideoLengthReachedException.b();
        int iB2 = MaxVideoLengthReachedException.b();
        return (Completable) a(iB, MaxVideoLengthReachedException.b(), iB2, 916508138, MaxVideoLengthReachedException.b(), -916508136, new Object[]{this});
    }
}
