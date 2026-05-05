package com.incode.welcome_sdk.commons.components;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.e.aj;
import com.incode.welcome_sdk.commons.e.al;
import com.incode.welcome_sdk.commons.e.am;
import com.incode.welcome_sdk.commons.e.an;
import com.incode.welcome_sdk.commons.e.aq;
import com.incode.welcome_sdk.commons.e.l;
import com.incode.welcome_sdk.commons.e.p;
import com.incode.welcome_sdk.commons.e.q;
import com.incode.welcome_sdk.commons.e.r;
import com.incode.welcome_sdk.commons.e.s;
import com.incode.welcome_sdk.commons.e.t;
import com.incode.welcome_sdk.commons.e.u;
import com.incode.welcome_sdk.commons.e.v;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.e.f;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import com.incode.welcome_sdk.data.local.m;
import com.incode.welcome_sdk.data.remote.h;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager_Factory;
import com.incode.welcome_sdk.ui.geolocation.GeolocationManager;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4693a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4694c = 0;

    public static d c() {
        int i2 = 2 % 2;
        d dVar = new d();
        int i3 = f4694c + 67;
        f4693a = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    public static final class d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f4733f = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f4734h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private al f4735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v f4736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.incode.welcome_sdk.data.e.e f4737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l f4738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p f4739e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private e f4740g;

        d() {
        }

        public final d e(v vVar) {
            int i2 = 2 % 2;
            int i3 = f4733f + 83;
            f4734h = i3 % 128;
            if (i3 % 2 == 0) {
                this.f4736b = (v) Preconditions.checkNotNull(vVar);
                int i4 = 2 / 0;
            } else {
                this.f4736b = (v) Preconditions.checkNotNull(vVar);
            }
            return this;
        }

        public final d b(e eVar) {
            int i2 = 2 % 2;
            int i3 = f4733f + 33;
            f4734h = i3 % 128;
            int i4 = i3 % 2;
            this.f4740g = (e) Preconditions.checkNotNull(eVar);
            int i5 = f4733f + 101;
            f4734h = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final IncodeWelcomeRepositoryComponent e() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f4736b, v.class);
            if (this.f4735a == null) {
                this.f4735a = new al();
            }
            if (this.f4739e == null) {
                this.f4739e = new p();
            }
            if (this.f4738d == null) {
                this.f4738d = new l();
                int i3 = f4734h + 89;
                f4733f = i3 % 128;
                int i4 = i3 % 2;
            }
            if (this.f4737c == null) {
                this.f4737c = new com.incode.welcome_sdk.data.e.e();
                int i5 = f4733f + 123;
                f4734h = i5 % 128;
                int i6 = i5 % 2;
            }
            Preconditions.checkBuilderRequirement(this.f4740g, e.class);
            return new C0212b(this.f4736b, this.f4735a, this.f4739e, this.f4738d, this.f4737c, this.f4740g);
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.b$b, reason: collision with other inner class name */
    static final class C0212b implements IncodeWelcomeRepositoryComponent {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static int f4695u = 1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static int f4696v = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Provider<Application> f4697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0212b f4698b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Provider<SharedPreferences> f4699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.incode.welcome_sdk.commons.components.e f4700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Provider<WelcomeDatabase> f4701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider<Retrofit> f4702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.remote.e.a> f4703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.l> f4704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.remote.e.c> f4705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Provider<Retrofit> f4706j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Provider<IncodeWelcomeRepository> f4707k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.remote.e.a> f4708l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.remote.e.c> f4709m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Provider<IdCaptureKitAndroid> f4710n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Provider<h> f4711o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Provider<GeolocationManager> f4712p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Provider<LocationFetcher> f4713q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Provider<Observable<IdCaptureKitAndroid>> f4714r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.e.b> f4715s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Provider<f> f4716t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Provider<VideoStreamingManager> f4717w;

        public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i3;
            int i9 = ~i5;
            int i10 = (~(i8 | i9)) | i7;
            int i11 = ~(i3 | i5);
            int i12 = i10 | i11;
            int i13 = ~i7;
            int i14 = (~(i13 | i5)) | (~(i13 | i3)) | i11;
            int i15 = (~(i8 | i5)) | (~(i9 | i3));
            int i16 = i3 + i5 + i2 + (1040777104 * i6) + ((-1861505373) * i4);
            int i17 = i16 * i16;
            int i18 = (i3 * (-1036928585)) + 527892480 + ((-1036928585) * i5) + ((-562525036) * i12) + (562525036 * i14) + ((-281262518) * i15) + ((-1318191104) * i2) + (1608515584 * i6) + ((-1123418112) * i4) + ((-2114519040) * i17);
            int i19 = (i3 * 1703033811) + 1712528133 + (i5 * 1703033811) + (i12 * 1508) + (i14 * (-1508)) + (i15 * 754) + (i2 * 1703034565) + (i6 * (-2114876976)) + (i4 * 1880022383) + (i17 * (-720175104));
            return i18 + ((i19 * i19) * (-739180544)) != 1 ? b(objArr) : c(objArr);
        }

        C0212b(v vVar, al alVar, p pVar, l lVar, com.incode.welcome_sdk.data.e.e eVar, com.incode.welcome_sdk.commons.components.e eVar2) {
            this.f4700d = eVar2;
            a(vVar, alVar, pVar, lVar, eVar, eVar2);
        }

        private void a(v vVar, al alVar, p pVar, l lVar, com.incode.welcome_sdk.data.e.e eVar, com.incode.welcome_sdk.commons.components.e eVar2) {
            int i2 = 2 % 2;
            this.f4697a = new C0213b(eVar2);
            this.f4699c = new e(eVar2);
            c cVar = new c(eVar2);
            this.f4701e = cVar;
            this.f4704h = DoubleCheck.provider(m.c(this.f4697a, this.f4699c, cVar));
            d dVar = new d(eVar2);
            this.f4702f = dVar;
            this.f4705i = DoubleCheck.provider(aj.c(alVar, dVar));
            this.f4703g = DoubleCheck.provider(am.d(alVar, this.f4702f));
            a aVar = new a(eVar2);
            this.f4706j = aVar;
            this.f4709m = DoubleCheck.provider(an.e(alVar, aVar));
            Provider<com.incode.welcome_sdk.data.remote.e.a> provider = DoubleCheck.provider(aq.b(alVar, this.f4706j));
            this.f4708l = provider;
            Provider<h> provider2 = DoubleCheck.provider(u.e(vVar, this.f4705i, this.f4703g, this.f4709m, provider));
            this.f4711o = provider2;
            this.f4707k = DoubleCheck.provider(com.incode.welcome_sdk.data.a.d(this.f4704h, provider2));
            Provider<IdCaptureKitAndroid> provider3 = DoubleCheck.provider(r.d(pVar, this.f4697a, this.f4699c));
            this.f4710n = provider3;
            this.f4714r = DoubleCheck.provider(q.d(pVar, provider3));
            Provider<LocationFetcher> provider4 = DoubleCheck.provider(t.c(lVar, this.f4697a));
            this.f4713q = provider4;
            this.f4712p = DoubleCheck.provider(s.c(lVar, this.f4697a, provider4));
            Provider<com.incode.welcome_sdk.data.e.b> provider5 = DoubleCheck.provider(com.incode.welcome_sdk.data.e.a.b(eVar));
            this.f4715s = provider5;
            this.f4716t = DoubleCheck.provider(com.incode.welcome_sdk.data.e.c.e(eVar, provider5));
            this.f4717w = DoubleCheck.provider(VideoStreamingManager_Factory.create(this.f4697a, this.f4707k));
            int i3 = f4696v + 87;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final Retrofit getRetrofitApi() {
            int i2 = 2 % 2;
            int i3 = f4695u + 41;
            f4696v = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Retrofit retrofit = (Retrofit) Preconditions.checkNotNullFromComponent(this.f4700d.g());
            int i4 = f4696v + 53;
            f4695u = i4 % 128;
            if (i4 % 2 != 0) {
                return retrofit;
            }
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final Retrofit getRetrofitApiUnsecure() {
            int i2 = 2 % 2;
            int i3 = f4696v + 37;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
            Retrofit retrofit = (Retrofit) Preconditions.checkNotNullFromComponent(this.f4700d.f());
            int i5 = f4696v + 103;
            f4695u = i5 % 128;
            if (i5 % 2 != 0) {
                return retrofit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final IncodeWelcomeRepository getIncodeRepository() {
            int i2 = 2 % 2;
            int i3 = f4695u + 39;
            f4696v = i3 % 128;
            if (i3 % 2 != 0) {
                this.f4707k.get();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IncodeWelcomeRepository incodeWelcomeRepository = this.f4707k.get();
            int i4 = f4696v + 11;
            f4695u = i4 % 128;
            int i5 = i4 % 2;
            return incodeWelcomeRepository;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final com.incode.welcome_sdk.commons.c.c.b getFaceDetector() {
            int i2 = 2 % 2;
            int i3 = f4696v + 65;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.commons.c.c.b bVar = (com.incode.welcome_sdk.commons.c.c.b) Preconditions.checkNotNullFromComponent(this.f4700d.a());
            int i5 = f4696v + 65;
            f4695u = i5 % 128;
            int i6 = i5 % 2;
            return bVar;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final RecogManager getRecogManager() {
            int i2 = 2 % 2;
            int i3 = f4695u + 69;
            f4696v = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            RecogManager recogManager = (RecogManager) Preconditions.checkNotNullFromComponent(this.f4700d.h());
            int i4 = f4695u + 99;
            f4696v = i4 % 128;
            int i5 = i4 % 2;
            return recogManager;
        }

        private static /* synthetic */ Object c(Object[] objArr) {
            C0212b c0212b = (C0212b) objArr[0];
            int i2 = 2 % 2;
            int i3 = f4696v + 95;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            BarcodeDetector barcodeDetector = (BarcodeDetector) Preconditions.checkNotNullFromComponent(c0212b.f4700d.i());
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f4695u + 121;
            f4696v = i5 % 128;
            if (i5 % 2 == 0) {
                return barcodeDetector;
            }
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final PublishSubject<com.incode.welcome_sdk.data.remote.d> getDownloadProgressBus() {
            int i2 = 2 % 2;
            int i3 = f4695u + 103;
            f4696v = i3 % 128;
            int i4 = i3 % 2;
            PublishSubject<com.incode.welcome_sdk.data.remote.d> publishSubject = (PublishSubject) Preconditions.checkNotNullFromComponent(this.f4700d.j());
            if (i4 == 0) {
                return publishSubject;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final IdCaptureKitAndroid getIdCaptureKitAndroid() {
            int i2 = 2 % 2;
            int i3 = f4696v + 113;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureKitAndroid idCaptureKitAndroid = this.f4710n.get();
            int i5 = f4695u + 35;
            f4696v = i5 % 128;
            int i6 = i5 % 2;
            return idCaptureKitAndroid;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final Observable<IdCaptureKitAndroid> getIdCaptureKitAndroidObservable() {
            int i2 = 2 % 2;
            int i3 = f4696v + 113;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
            Observable<IdCaptureKitAndroid> observable = this.f4714r.get();
            int i5 = f4695u + 9;
            f4696v = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 42 / 0;
            }
            return observable;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final GeolocationManager getGeolocationManager() {
            int i2 = 2 % 2;
            int i3 = f4696v + 79;
            f4695u = i3 % 128;
            int i4 = i3 % 2;
            GeolocationManager geolocationManager = this.f4712p.get();
            if (i4 == 0) {
                int i5 = 89 / 0;
            }
            return geolocationManager;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final LocationFetcher getILocationFetcher() {
            int i2 = 2 % 2;
            int i3 = f4695u + 59;
            f4696v = i3 % 128;
            int i4 = i3 % 2;
            LocationFetcher locationFetcher = this.f4713q.get();
            int i5 = f4696v + 101;
            f4695u = i5 % 128;
            if (i5 % 2 != 0) {
                return locationFetcher;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final f getFieldEncryptor() {
            int i2 = 2 % 2;
            int i3 = f4696v + 39;
            f4695u = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                this.f4716t.get();
                obj.hashCode();
                throw null;
            }
            f fVar = this.f4716t.get();
            int i4 = f4695u + 13;
            f4696v = i4 % 128;
            if (i4 % 2 == 0) {
                return fVar;
            }
            throw null;
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            C0212b c0212b = (C0212b) objArr[0];
            int i2 = 2 % 2;
            int i3 = f4695u + 71;
            f4696v = i3 % 128;
            int i4 = i3 % 2;
            VideoStreamingManager videoStreamingManager = c0212b.f4717w.get();
            if (i4 != 0) {
                throw null;
            }
            int i5 = f4695u + 81;
            f4696v = i5 % 128;
            int i6 = i5 % 2;
            return videoStreamingManager;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.b$b$b, reason: collision with other inner class name */
        static final class C0213b implements Provider<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f4721a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f4722b = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final com.incode.welcome_sdk.commons.components.e f4723e;

            @Override // javax.inject.Provider
            public final /* synthetic */ Application get() {
                int i2 = 2 % 2;
                int i3 = f4722b + 75;
                f4721a = i3 % 128;
                int i4 = i3 % 2;
                Application applicationB = b();
                int i5 = f4721a + 45;
                f4722b = i5 % 128;
                if (i5 % 2 != 0) {
                    return applicationB;
                }
                throw null;
            }

            C0213b(com.incode.welcome_sdk.commons.components.e eVar) {
                this.f4723e = eVar;
            }

            private Application b() {
                int i2 = 2 % 2;
                int i3 = f4721a + 93;
                f4722b = i3 % 128;
                int i4 = i3 % 2;
                Application application = (Application) Preconditions.checkNotNullFromComponent(this.f4723e.e());
                int i5 = f4722b + 61;
                f4721a = i5 % 128;
                int i6 = i5 % 2;
                return application;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.b$b$e */
        static final class e implements Provider<SharedPreferences> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f4730b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f4731d = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final com.incode.welcome_sdk.commons.components.e f4732c;

            @Override // javax.inject.Provider
            public final /* synthetic */ SharedPreferences get() {
                int i2 = 2 % 2;
                int i3 = f4731d + 73;
                f4730b = i3 % 128;
                if (i3 % 2 == 0) {
                    return e();
                }
                e();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            e(com.incode.welcome_sdk.commons.components.e eVar) {
                this.f4732c = eVar;
            }

            private SharedPreferences e() {
                int i2 = 2 % 2;
                int i3 = f4730b + 111;
                f4731d = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                SharedPreferences sharedPreferences = (SharedPreferences) Preconditions.checkNotNullFromComponent(this.f4732c.d());
                int i4 = f4731d + 79;
                f4730b = i4 % 128;
                int i5 = i4 % 2;
                return sharedPreferences;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.b$b$c */
        static final class c implements Provider<WelcomeDatabase> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4724c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f4725d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final com.incode.welcome_sdk.commons.components.e f4726e;

            @Override // javax.inject.Provider
            public final /* synthetic */ WelcomeDatabase get() {
                int i2 = 2 % 2;
                int i3 = f4725d + 49;
                f4724c = i3 % 128;
                int i4 = i3 % 2;
                WelcomeDatabase welcomeDatabaseB = b();
                if (i4 == 0) {
                    int i5 = 80 / 0;
                }
                return welcomeDatabaseB;
            }

            c(com.incode.welcome_sdk.commons.components.e eVar) {
                this.f4726e = eVar;
            }

            private WelcomeDatabase b() {
                WelcomeDatabase welcomeDatabase;
                int i2 = 2 % 2;
                int i3 = f4724c + 67;
                f4725d = i3 % 128;
                if (i3 % 2 != 0) {
                    welcomeDatabase = (WelcomeDatabase) Preconditions.checkNotNullFromComponent(this.f4726e.b());
                    int i4 = 45 / 0;
                } else {
                    welcomeDatabase = (WelcomeDatabase) Preconditions.checkNotNullFromComponent(this.f4726e.b());
                }
                int i5 = f4725d + 41;
                f4724c = i5 % 128;
                int i6 = i5 % 2;
                return welcomeDatabase;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.b$b$d */
        static final class d implements Provider<Retrofit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f4727a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4728c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final com.incode.welcome_sdk.commons.components.e f4729d;

            @Override // javax.inject.Provider
            public final /* synthetic */ Retrofit get() {
                int i2 = 2 % 2;
                int i3 = f4728c + 91;
                f4727a = i3 % 128;
                if (i3 % 2 != 0) {
                    b();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Retrofit retrofitB = b();
                int i4 = f4728c + 53;
                f4727a = i4 % 128;
                int i5 = i4 % 2;
                return retrofitB;
            }

            d(com.incode.welcome_sdk.commons.components.e eVar) {
                this.f4729d = eVar;
            }

            private Retrofit b() {
                int i2 = 2 % 2;
                int i3 = f4728c + 11;
                f4727a = i3 % 128;
                int i4 = i3 % 2;
                Retrofit retrofit = (Retrofit) Preconditions.checkNotNullFromComponent(this.f4729d.g());
                int i5 = f4728c + 107;
                f4727a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 55 / 0;
                }
                return retrofit;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.b$b$a */
        static final class a implements Provider<Retrofit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f4718b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4719c = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.incode.welcome_sdk.commons.components.e f4720a;

            @Override // javax.inject.Provider
            public final /* synthetic */ Retrofit get() {
                Retrofit retrofitD;
                int i2 = 2 % 2;
                int i3 = f4718b + 117;
                f4719c = i3 % 128;
                if (i3 % 2 != 0) {
                    retrofitD = d();
                    int i4 = 37 / 0;
                } else {
                    retrofitD = d();
                }
                int i5 = f4718b + 11;
                f4719c = i5 % 128;
                int i6 = i5 % 2;
                return retrofitD;
            }

            a(com.incode.welcome_sdk.commons.components.e eVar) {
                this.f4720a = eVar;
            }

            private Retrofit d() {
                int i2 = 2 % 2;
                int i3 = f4719c + 43;
                f4718b = i3 % 128;
                int i4 = i3 % 2;
                Retrofit retrofit = (Retrofit) Preconditions.checkNotNullFromComponent(this.f4720a.f());
                int i5 = f4718b + 107;
                f4719c = i5 % 128;
                if (i5 % 2 == 0) {
                    return retrofit;
                }
                throw null;
            }
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final VideoStreamingManager videoStreamingManager() {
            int iE = BaseView.DefaultImpls.e();
            return (VideoStreamingManager) d(BaseView.DefaultImpls.e(), new Object[]{this}, 998326169, BaseView.DefaultImpls.e(), -998326169, BaseView.DefaultImpls.e(), iE);
        }

        @Override // com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent
        public final BarcodeDetector getBarcodeDetector() {
            int iE = BaseView.DefaultImpls.e();
            return (BarcodeDetector) d(BaseView.DefaultImpls.e(), new Object[]{this}, 156412840, BaseView.DefaultImpls.e(), -156412839, BaseView.DefaultImpls.e(), iE);
        }
    }
}
