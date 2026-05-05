package com.incode.welcome_sdk.data.local.model.delayed_onboarding.c;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.bz;
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
public final class b implements com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<bz> {

    /* JADX INFO: renamed from: a */
    private static int f8747a = 0;

    /* JADX INFO: renamed from: i */
    private static int f8748i = 1;

    /* JADX INFO: renamed from: b */
    private final boolean f8749b;

    /* JADX INFO: renamed from: c */
    private final com.incode.welcome_sdk.data.local.a.d.a.a f8750c;

    /* JADX INFO: renamed from: d */
    private final a f8751d;

    /* JADX INFO: renamed from: e */
    private final IncodeWelcomeRepository f8752e;

    public b(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.data.local.a.d.a.a aVar, a aVar2) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        Intrinsics.checkNotNullParameter(aVar2, "");
        this.f8752e = incodeWelcomeRepository;
        this.f8750c = aVar;
        this.f8751d = aVar2;
        this.f8749b = aVar2.b();
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Completable b() {
        int i2 = 2 % 2;
        int i3 = f8747a + 53;
        f8748i = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = e.C0231e.c(this);
        if (i4 == 0) {
            int i5 = 45 / 0;
        }
        return completableC;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final /* bridge */ /* synthetic */ Completable b(bz bzVar) {
        int i2 = 2 % 2;
        int i3 = f8747a + 35;
        f8748i = i3 % 128;
        int i4 = i3 % 2;
        Completable completableB2 = b2(bzVar);
        int i5 = f8748i + 57;
        f8747a = i5 % 128;
        int i6 = i5 % 2;
        return completableB2;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8748i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f8747a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8749b;
        int i6 = i4 + 13;
        f8748i = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    static final class e extends Lambda implements Function1<bf, bz> {

        /* JADX INFO: renamed from: a */
        private static int f8758a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8759b = 0;

        /* JADX INFO: renamed from: c */
        public static final e f8760c = new e();

        /* JADX INFO: renamed from: d */
        private static int f8761d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8762e = 1;

        private static bz a(bf bfVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(bfVar, "");
            bz bzVar = new bz(bfVar, null, 2);
            int i3 = f8758a + 59;
            f8759b = i3 % 128;
            int i4 = i3 % 2;
            return bzVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ bz invoke(bf bfVar) {
            int i2 = 2 % 2;
            int i3 = f8759b + 99;
            f8758a = i3 % 128;
            int i4 = i3 % 2;
            bz bzVarA = a(bfVar);
            int i5 = f8758a + 19;
            f8759b = i5 % 128;
            int i6 = i5 % 2;
            return bzVarA;
        }

        static {
            int i2 = f8761d + 37;
            f8762e = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(1);
        }
    }

    static final class d extends Lambda implements Function1<Throwable, SingleSource<? extends bz>> {

        /* JADX INFO: renamed from: a */
        private static int f8753a = 1;

        /* JADX INFO: renamed from: b */
        public static final d f8754b = new d();

        /* JADX INFO: renamed from: c */
        private static int f8755c = 0;

        /* JADX INFO: renamed from: d */
        private static int f8756d = 0;

        /* JADX INFO: renamed from: e */
        private static int f8757e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends bz> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f8753a + 93;
            f8755c = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends bz> singleSourceC = c(th);
            if (i4 != 0) {
                int i5 = 12 / 0;
            }
            int i6 = f8753a + 43;
            f8755c = i6 % 128;
            int i7 = i6 % 2;
            return singleSourceC;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x001b, code lost:
        
            if (com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r4) != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
        
            return io.reactivex.Single.just(new com.incode.welcome_sdk.data.remote.beans.bz(null, r4, 1));
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        
            if (com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r4) != false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
        
            r2 = io.reactivex.Single.error(r4);
            r1 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.f8753a + 33;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.f8755c = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
        
            if ((r1 % 2) == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        
            r0 = 5 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static io.reactivex.SingleSource<? extends com.incode.welcome_sdk.data.remote.beans.bz> c(java.lang.Throwable r4) {
            /*
                r3 = 2
                int r0 = r3 % r3
                int r1 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.f8755c
                r2 = 1
                int r1 = r1 + r2
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.f8753a = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 != 0) goto L2a
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r1 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r4)
                r0 = 8
                int r0 = r0 / 0
                if (r1 == 0) goto L34
            L1d:
                com.incode.welcome_sdk.data.remote.beans.bz r1 = new com.incode.welcome_sdk.data.remote.beans.bz
                r0 = 0
                r1.<init>(r0, r4, r2)
                io.reactivex.Single r0 = io.reactivex.Single.just(r1)
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0
                return r0
            L2a:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt.isBadRequestError(r4)
                if (r0 == 0) goto L34
                goto L1d
            L34:
                io.reactivex.Single r2 = io.reactivex.Single.error(r4)
                io.reactivex.SingleSource r2 = (io.reactivex.SingleSource) r2
                int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.f8753a
                int r1 = r0 + 33
                int r0 = r1 % 128
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.f8755c = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L48
                r0 = 5
                int r0 = r0 / 0
            L48:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b.d.c(java.lang.Throwable):io.reactivex.SingleSource");
        }

        static {
            int i2 = f8756d + 65;
            f8757e = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        d() {
            super(1);
        }
    }

    public static final bz b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8747a + 61;
        f8748i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        bz bzVar = (bz) function1.invoke(obj);
        int i5 = f8748i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8747a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return bzVar;
    }

    public static final SingleSource a(b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f8747a + 63;
        f8748i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        Single<bf> singleProcessFace = bVar.f8752e.processFace(bVar.f8751d.c(), false);
        final e eVar = e.f8760c;
        Single<R> map = singleProcessFace.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return b.b(eVar, obj);
            }
        });
        final d dVar = d.f8754b;
        Single singleOnErrorResumeNext = map.onErrorResumeNext((Function<? super Throwable, ? extends SingleSource<? extends R>>) new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return b.e(dVar, obj);
            }
        });
        int i5 = f8748i + 27;
        f8747a = i5 % 128;
        int i6 = i5 % 2;
        return singleOnErrorResumeNext;
    }

    public static final SingleSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8747a + 105;
        f8748i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f8748i + 7;
        f8747a = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Single<? extends bz> e() {
        int i2 = 2 % 2;
        int i3 = f8747a + 59;
        f8748i = i3 % 128;
        if (i3 % 2 != 0) {
            Single<? extends bz> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b$$ExternalSyntheticLambda3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.a(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDefer, "");
            int i4 = f8747a + 13;
            f8748i = i4 % 128;
            int i5 = i4 % 2;
            return singleDefer;
        }
        Intrinsics.checkNotNullExpressionValue(Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.a(this.f$0);
            }
        }), "");
        throw null;
    }

    public static final CompletableSource e(b bVar, bz bzVar) {
        int i2 = 2 % 2;
        int i3 = f8748i + 111;
        f8747a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(bzVar, "");
        Completable completableA = bVar.f8750c.a(bzVar, bVar.f8751d.a());
        int i5 = f8748i + 115;
        f8747a = i5 % 128;
        if (i5 % 2 == 0) {
            return completableA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    private Completable b2(final bz bzVar) {
        int i2 = 2 % 2;
        int i3 = f8748i + 75;
        f8747a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bzVar, "");
            Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.e(this.f$0, bzVar);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableDefer, "");
            return completableDefer;
        }
        Intrinsics.checkNotNullParameter(bzVar, "");
        Completable completableDefer2 = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.e(this.f$0, bzVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDefer2, "");
        int i4 = 75 / 0;
        return completableDefer2;
    }
}
