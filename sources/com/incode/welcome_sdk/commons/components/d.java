package com.incode.welcome_sdk.commons.components;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.e.aa;
import com.incode.welcome_sdk.commons.e.ab;
import com.incode.welcome_sdk.commons.e.ac;
import com.incode.welcome_sdk.commons.e.ad;
import com.incode.welcome_sdk.commons.e.ae;
import com.incode.welcome_sdk.commons.e.af;
import com.incode.welcome_sdk.commons.e.ag;
import com.incode.welcome_sdk.commons.e.ah;
import com.incode.welcome_sdk.commons.e.ai;
import com.incode.welcome_sdk.commons.e.ak;
import com.incode.welcome_sdk.commons.e.g;
import com.incode.welcome_sdk.commons.e.k;
import com.incode.welcome_sdk.commons.e.m;
import com.incode.welcome_sdk.commons.e.n;
import com.incode.welcome_sdk.commons.e.o;
import com.incode.welcome_sdk.commons.e.w;
import com.incode.welcome_sdk.commons.e.x;
import com.incode.welcome_sdk.commons.e.y;
import com.incode.welcome_sdk.commons.e.z;
import com.incode.welcome_sdk.commons.httpinterceptors.h;
import com.incode.welcome_sdk.commons.httpinterceptors.i;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import com.incode.welcome_sdk.ui.name.NamePresenter;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.Random;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4741a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4742b = 0;

    public static C0214d e() {
        int i2 = 2 % 2;
        C0214d c0214d = new C0214d();
        int i3 = f4742b + 33;
        f4741a = i3 % 128;
        int i4 = i3 % 2;
        return c0214d;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.d$d, reason: collision with other inner class name */
    public static final class C0214d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f4768g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f4769j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private n f4770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private x f4771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ad f4772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.incode.welcome_sdk.commons.e.e f4773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private g f4774e;

        C0214d() {
        }

        public final C0214d b(com.incode.welcome_sdk.commons.e.e eVar) {
            int i2 = 2 % 2;
            int i3 = f4768g + 17;
            f4769j = i3 % 128;
            if (i3 % 2 != 0) {
                this.f4773d = (com.incode.welcome_sdk.commons.e.e) Preconditions.checkNotNull(eVar);
                int i4 = 5 / 0;
            } else {
                this.f4773d = (com.incode.welcome_sdk.commons.e.e) Preconditions.checkNotNull(eVar);
            }
            return this;
        }

        public final C0214d e(ad adVar) {
            int i2 = 2 % 2;
            int i3 = f4769j + 107;
            f4768g = i3 % 128;
            int i4 = i3 % 2;
            this.f4772c = (ad) Preconditions.checkNotNull(adVar);
            int i5 = f4768g + 5;
            f4769j = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final e d() {
            int i2 = 2 % 2;
            int i3 = f4768g + 35;
            f4769j = i3 % 128;
            int i4 = i3 % 2;
            Preconditions.checkBuilderRequirement(this.f4773d, com.incode.welcome_sdk.commons.e.e.class);
            Preconditions.checkBuilderRequirement(this.f4772c, ad.class);
            if (this.f4771b == null) {
                this.f4771b = new x();
                int i5 = f4769j + 117;
                f4768g = i5 % 128;
                int i6 = i5 % 2;
            }
            if (this.f4774e == null) {
                this.f4774e = new g();
            }
            if (this.f4770a == null) {
                this.f4770a = new n();
            }
            return new a(this.f4773d, this.f4772c, this.f4771b, this.f4774e, this.f4770a);
        }
    }

    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f4743a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f4744b = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static int f4745v = 0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static int f4746x = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f4747c = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g f4748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Provider<Application> f4749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider<WelcomeDatabase> f4750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Provider<Observable<RecogManager>> f4751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Provider<DelayedOnboardingDatabase> f4752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Provider<RecogManager> f4753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Provider<SharedPreferences> f4754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Provider<HttpLoggingInterceptor> f4755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Provider<BarcodeDetector> f4756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Provider<h> f4757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> f4758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Provider<PublishSubject<com.incode.welcome_sdk.data.remote.d>> f4759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> f4760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Provider<IncodeWelcome.SSLConfig> f4761q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> f4762r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Provider<OkHttpClient> f4763s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> f4764t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Provider<OkHttpClient> f4765u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Provider<Retrofit> f4766w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Provider<Retrofit> f4767y;

        public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
            int i8 = ~i7;
            int i9 = ~i4;
            int i10 = ~(i8 | i9);
            int i11 = (~(i8 | i3)) | i10 | (~(i9 | i3));
            int i12 = ~i3;
            int i13 = (~(i12 | i9 | i7)) | (~(i8 | i12 | i4));
            int i14 = i7 + i4 + i5 + ((-195996979) * i6) + ((-904719387) * i2);
            int i15 = i14 * i14;
            int i16 = (i7 * 1886715248) + 940376064 + (1886715248 * i4) + (i11 * (-42925423)) + (i10 * (-42925423)) + ((-42925423) * i13) + (1843789824 * i5) + ((-1389494272) * i6) + (1623064576 * i2) + (1510801408 * i15);
            int i17 = (i7 * 1590984816) + 1398186415 + (i4 * 1590984816) + (i11 * 737) + (i10 * 737) + (i13 * 737) + (i5 * 1590985553) + (i6 * (-1025631779)) + (i2 * 1121679989) + (i15 * 622657536);
            return i16 + ((i17 * i17) * (-1928134656)) != 1 ? b(objArr) : e(objArr);
        }

        a(com.incode.welcome_sdk.commons.e.e eVar, ad adVar, x xVar, g gVar, n nVar) {
            this.f4748d = gVar;
            b(eVar, adVar, xVar, nVar);
        }

        private void b(com.incode.welcome_sdk.commons.e.e eVar, ad adVar, x xVar, n nVar) {
            int i2 = 2 % 2;
            int i3 = f4746x + 101;
            f4745v = i3 % 128;
            int i4 = i3 % 2;
            Provider<Application> provider = DoubleCheck.provider(com.incode.welcome_sdk.commons.e.d.d(eVar));
            this.f4749e = provider;
            this.f4754j = DoubleCheck.provider(ab.e(xVar, provider));
            this.f4750f = DoubleCheck.provider(ac.b(xVar, this.f4749e));
            this.f4752h = DoubleCheck.provider(y.b(xVar, this.f4749e));
            Provider<RecogManager> provider2 = DoubleCheck.provider(o.a(nVar, this.f4749e, this.f4754j));
            this.f4753i = provider2;
            this.f4751g = DoubleCheck.provider(k.b(nVar, provider2));
            this.f4756l = DoubleCheck.provider(w.d(xVar, this.f4749e));
            Provider<PublishSubject<com.incode.welcome_sdk.data.remote.d>> provider3 = DoubleCheck.provider(z.a(adVar));
            this.f4759o = provider3;
            this.f4757m = DoubleCheck.provider(aa.a(adVar, provider3));
            this.f4758n = DoubleCheck.provider(i.d());
            this.f4755k = DoubleCheck.provider(af.b(adVar));
            this.f4762r = DoubleCheck.provider(com.incode.welcome_sdk.commons.httpinterceptors.d.b());
            this.f4760p = DoubleCheck.provider(com.incode.welcome_sdk.commons.httpinterceptors.a.d(this.f4749e));
            this.f4761q = DoubleCheck.provider(ak.e(adVar));
            Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> provider4 = DoubleCheck.provider(com.incode.welcome_sdk.commons.httpinterceptors.k.d());
            this.f4764t = provider4;
            Provider<OkHttpClient> provider5 = DoubleCheck.provider(ah.e(adVar, this.f4757m, this.f4758n, this.f4755k, this.f4762r, this.f4760p, this.f4761q, provider4));
            this.f4763s = provider5;
            this.f4767y = DoubleCheck.provider(ag.c(adVar, provider5));
            Provider<OkHttpClient> provider6 = DoubleCheck.provider(ai.a(adVar, this.f4757m, this.f4758n, this.f4755k, this.f4762r, this.f4760p, this.f4761q, this.f4764t));
            this.f4765u = provider6;
            this.f4766w = DoubleCheck.provider(ae.d(adVar, provider6));
            int i5 = f4746x + 85;
            f4745v = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final Application e() {
            int i2 = 2 % 2;
            int i3 = f4746x + 73;
            f4745v = i3 % 128;
            int i4 = i3 % 2;
            Application application = this.f4749e.get();
            int i5 = f4745v + 71;
            f4746x = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return application;
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            a aVar = (a) objArr[0];
            int i2 = 2 % 2;
            int i3 = f4746x + 13;
            f4745v = i3 % 128;
            int i4 = i3 % 2;
            SharedPreferences sharedPreferences = aVar.f4754j.get();
            if (i4 != 0) {
                int i5 = 14 / 0;
            }
            return sharedPreferences;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final WelcomeDatabase b() {
            int i2 = 2 % 2;
            int i3 = f4745v + 83;
            f4746x = i3 % 128;
            int i4 = i3 % 2;
            WelcomeDatabase welcomeDatabase = this.f4750f.get();
            int i5 = f4745v + 123;
            f4746x = i5 % 128;
            int i6 = i5 % 2;
            return welcomeDatabase;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final DelayedOnboardingDatabase c() {
            int i2 = 2 % 2;
            int i3 = f4745v + 31;
            f4746x = i3 % 128;
            int i4 = i3 % 2;
            DelayedOnboardingDatabase delayedOnboardingDatabase = this.f4752h.get();
            int i5 = f4745v + 45;
            f4746x = i5 % 128;
            if (i5 % 2 != 0) {
                return delayedOnboardingDatabase;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final com.incode.welcome_sdk.commons.c.c.b a() {
            int i2 = 2 % 2;
            int i3 = f4746x + 21;
            f4745v = i3 % 128;
            int i4 = i3 % 2;
            g gVar = this.f4748d;
            if (i4 == 0) {
                return m.c(gVar, this.f4753i.get());
            }
            m.c(gVar, this.f4753i.get());
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final RecogManager h() {
            int i2 = 2 % 2;
            int i3 = f4745v + 91;
            f4746x = i3 % 128;
            int i4 = i3 % 2;
            RecogManager recogManager = this.f4753i.get();
            int i5 = f4745v + 71;
            f4746x = i5 % 128;
            if (i5 % 2 != 0) {
                return recogManager;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final BarcodeDetector i() {
            int i2 = 2 % 2;
            int i3 = f4746x + 113;
            f4745v = i3 % 128;
            int i4 = i3 % 2;
            BarcodeDetector barcodeDetector = this.f4756l.get();
            int i5 = f4746x + 49;
            f4745v = i5 % 128;
            int i6 = i5 % 2;
            return barcodeDetector;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final Retrofit g() {
            int i2 = 2 % 2;
            int i3 = f4745v + 37;
            f4746x = i3 % 128;
            int i4 = i3 % 2;
            Retrofit retrofit = this.f4767y.get();
            int i5 = f4745v + 19;
            f4746x = i5 % 128;
            if (i5 % 2 != 0) {
                return retrofit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            a aVar = (a) objArr[0];
            int i2 = 2 % 2;
            int i3 = f4745v + 69;
            f4746x = i3 % 128;
            int i4 = i3 % 2;
            Retrofit retrofit = aVar.f4766w.get();
            int i5 = f4746x + 85;
            f4745v = i5 % 128;
            if (i5 % 2 == 0) {
                return retrofit;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final PublishSubject<com.incode.welcome_sdk.data.remote.d> j() {
            int i2 = 2 % 2;
            int i3 = f4746x + 87;
            f4745v = i3 % 128;
            int i4 = i3 % 2;
            PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubject = this.f4759o.get();
            if (i4 != 0) {
                int i5 = 16 / 0;
            }
            return publishSubject;
        }

        public static int o() {
            int i2 = f4744b;
            int i3 = i2 % 8458284;
            f4744b = i2 + 1;
            if (i3 != 0) {
                return f4743a;
            }
            int iNextInt = new Random().nextInt(1972406686);
            f4743a = iNextInt;
            return iNextInt;
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final Retrofit f() {
            int iA = NamePresenter.b.a();
            int iA2 = NamePresenter.b.a();
            int iA3 = NamePresenter.b.a();
            return (Retrofit) b(NamePresenter.b.a(), iA, 1918153746, new Object[]{this}, iA2, iA3, -1918153746);
        }

        @Override // com.incode.welcome_sdk.commons.components.e
        public final SharedPreferences d() {
            int iA = NamePresenter.b.a();
            int iA2 = NamePresenter.b.a();
            int iA3 = NamePresenter.b.a();
            return (SharedPreferences) b(NamePresenter.b.a(), iA, 1132487705, new Object[]{this}, iA2, iA3, -1132487704);
        }
    }
}
