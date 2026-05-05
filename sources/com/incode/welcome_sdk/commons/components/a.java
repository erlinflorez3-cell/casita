package com.incode.welcome_sdk.commons.components;

import android.app.Application;
import com.incode.welcome_sdk.commons.e.f;
import com.incode.welcome_sdk.commons.e.h;
import com.incode.welcome_sdk.commons.e.i;
import com.incode.welcome_sdk.commons.e.j;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4669b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4670c = 1;

    public static c e() {
        int i2 = 2 % 2;
        c cVar = new c();
        int i3 = f4669b + 81;
        f4670c = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4689c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f4690d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.incode.welcome_sdk.commons.e.a f4691b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f4692e;

        c() {
        }

        public final c e(com.incode.welcome_sdk.commons.e.a aVar) {
            int i2 = 2 % 2;
            int i3 = f4690d + 99;
            f4689c = i3 % 128;
            int i4 = i3 % 2;
            this.f4691b = (com.incode.welcome_sdk.commons.e.a) Preconditions.checkNotNull(aVar);
            int i5 = f4690d + 13;
            f4689c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final c b(e eVar) {
            int i2 = 2 % 2;
            int i3 = f4689c + 19;
            f4690d = i3 % 128;
            if (i3 % 2 == 0) {
                this.f4692e = (e) Preconditions.checkNotNull(eVar);
                return this;
            }
            this.f4692e = (e) Preconditions.checkNotNull(eVar);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.commons.components.c b() {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.commons.components.a.c.f4690d
                int r1 = r0 + 99
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.components.a.c.f4689c = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L37
                com.incode.welcome_sdk.commons.e.a r1 = r4.f4691b
                r0 = 40
                int r0 = r0 / 0
                if (r1 != 0) goto L1d
            L16:
                com.incode.welcome_sdk.commons.e.a r0 = new com.incode.welcome_sdk.commons.e.a
                r0.<init>()
                r4.f4691b = r0
            L1d:
                com.incode.welcome_sdk.commons.components.e r1 = r4.f4692e
                java.lang.Class<com.incode.welcome_sdk.commons.components.e> r0 = com.incode.welcome_sdk.commons.components.e.class
                dagger.internal.Preconditions.checkBuilderRequirement(r1, r0)
                com.incode.welcome_sdk.commons.components.a$a r2 = new com.incode.welcome_sdk.commons.components.a$a
                com.incode.welcome_sdk.commons.e.a r1 = r4.f4691b
                com.incode.welcome_sdk.commons.components.e r0 = r4.f4692e
                r2.<init>(r1, r0)
                int r0 = com.incode.welcome_sdk.commons.components.a.c.f4690d
                int r1 = r0 + 3
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.components.a.c.f4689c = r0
                int r1 = r1 % r3
                return r2
            L37:
                com.incode.welcome_sdk.commons.e.a r0 = r4.f4691b
                if (r0 != 0) goto L1d
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.components.a.c.b():com.incode.welcome_sdk.commons.components.c");
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.a$a, reason: collision with other inner class name */
    static final class C0211a implements com.incode.welcome_sdk.commons.components.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f4671k = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f4672n = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Provider<DelayedOnboardingDatabase> f4673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.a.e> f4674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Provider<Application> f4675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f4676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C0211a f4677e = this;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.a.d.c.e> f4678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.a.d.d.d> f4679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.a.d.b.c> f4680h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.a.d.f.c> f4681i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Provider<com.incode.welcome_sdk.data.local.a.d.e.c> f4682j;

        C0211a(com.incode.welcome_sdk.commons.e.a aVar, e eVar) {
            this.f4676d = eVar;
            e(aVar, eVar);
        }

        private void e(com.incode.welcome_sdk.commons.e.a aVar, e eVar) {
            int i2 = 2 % 2;
            this.f4673a = new c(eVar);
            d dVar = new d(eVar);
            this.f4675c = dVar;
            this.f4674b = DoubleCheck.provider(com.incode.welcome_sdk.commons.e.c.c(aVar, this.f4673a, dVar));
            this.f4681i = DoubleCheck.provider(f.c(aVar, this.f4673a));
            this.f4678f = DoubleCheck.provider(j.d(aVar, this.f4673a));
            this.f4680h = DoubleCheck.provider(h.e(aVar, this.f4673a));
            this.f4682j = DoubleCheck.provider(i.e(aVar, this.f4673a));
            this.f4679g = DoubleCheck.provider(com.incode.welcome_sdk.commons.e.b.c(aVar, this.f4673a));
            int i3 = f4671k + 47;
            f4672n = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.e a() {
            int i2 = 2 % 2;
            int i3 = f4671k + 19;
            f4672n = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.a.e eVar = this.f4674b.get();
            int i5 = f4672n + 11;
            f4671k = i5 % 128;
            int i6 = i5 % 2;
            return eVar;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.d.f.c e() {
            int i2 = 2 % 2;
            int i3 = f4672n + 65;
            f4671k = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.a.d.f.c cVar = this.f4681i.get();
            int i5 = f4672n + 31;
            f4671k = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.d.c.e d() {
            int i2 = 2 % 2;
            int i3 = f4671k + 63;
            f4672n = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.a.d.c.e eVar = this.f4678f.get();
            int i5 = f4672n + 81;
            f4671k = i5 % 128;
            if (i5 % 2 == 0) {
                return eVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.d.b.c c() {
            int i2 = 2 % 2;
            int i3 = f4672n + 105;
            f4671k = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.a.d.b.c cVar = this.f4680h.get();
            int i5 = f4671k + 101;
            f4672n = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.d.e.c b() {
            int i2 = 2 % 2;
            int i3 = f4672n + 79;
            f4671k = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.a.d.e.c cVar = this.f4682j.get();
            int i5 = f4672n + 1;
            f4671k = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.d.a.a i() {
            int i2 = 2 % 2;
            com.incode.welcome_sdk.data.local.a.d.a.a aVar = new com.incode.welcome_sdk.data.local.a.d.a.a((DelayedOnboardingDatabase) Preconditions.checkNotNullFromComponent(this.f4676d.c()));
            int i3 = f4671k + 97;
            f4672n = i3 % 128;
            if (i3 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.commons.components.c
        public final com.incode.welcome_sdk.data.local.a.d.d.d h() {
            int i2 = 2 % 2;
            int i3 = f4671k + 11;
            f4672n = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.data.local.a.d.d.d dVar = this.f4679g.get();
            int i5 = f4671k + 67;
            f4672n = i5 % 128;
            if (i5 % 2 != 0) {
                return dVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.a$a$c */
        static final class c implements Provider<DelayedOnboardingDatabase> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4683c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f4684e = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final e f4685d;

            @Override // javax.inject.Provider
            public final /* synthetic */ DelayedOnboardingDatabase get() {
                int i2 = 2 % 2;
                int i3 = f4684e + 39;
                f4683c = i3 % 128;
                if (i3 % 2 != 0) {
                    return a();
                }
                a();
                throw null;
            }

            c(e eVar) {
                this.f4685d = eVar;
            }

            private DelayedOnboardingDatabase a() {
                int i2 = 2 % 2;
                int i3 = f4683c + 39;
                f4684e = i3 % 128;
                int i4 = i3 % 2;
                DelayedOnboardingDatabase delayedOnboardingDatabase = (DelayedOnboardingDatabase) Preconditions.checkNotNullFromComponent(this.f4685d.c());
                int i5 = f4683c + 95;
                f4684e = i5 % 128;
                int i6 = i5 % 2;
                return delayedOnboardingDatabase;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.components.a$a$d */
        static final class d implements Provider<Application> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f4686b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f4687c = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final e f4688a;

            @Override // javax.inject.Provider
            public final /* synthetic */ Application get() {
                Application applicationB;
                int i2 = 2 % 2;
                int i3 = f4687c + 49;
                f4686b = i3 % 128;
                if (i3 % 2 != 0) {
                    applicationB = b();
                    int i4 = 19 / 0;
                } else {
                    applicationB = b();
                }
                int i5 = f4686b + 35;
                f4687c = i5 % 128;
                int i6 = i5 % 2;
                return applicationB;
            }

            d(e eVar) {
                this.f4688a = eVar;
            }

            private Application b() {
                int i2 = 2 % 2;
                int i3 = f4687c + 5;
                f4686b = i3 % 128;
                int i4 = i3 % 2;
                Application application = (Application) Preconditions.checkNotNullFromComponent(this.f4688a.e());
                int i5 = f4686b + 37;
                f4687c = i5 % 128;
                int i6 = i5 % 2;
                return application;
            }
        }
    }
}
