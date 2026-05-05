package com.incode.welcome_sdk.data.local.a.d.a;

import com.incode.welcome_sdk.data.local.a.d.a.a;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.bz;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks.VideoSelfieChecksActivity;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureScreenKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private static int f7705a = 0;

    /* JADX INFO: renamed from: b */
    private static int f7706b = 1;

    /* JADX INFO: renamed from: d */
    private final DelayedOnboardingDatabase f7707d;

    public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = ~((~i2) | i9);
        int i11 = i2 | i9;
        int i12 = i4 + i6 + i3 + ((-189913888) * i7) + ((-1809372279) * i5);
        int i13 = i12 * i12;
        int i14 = (((-554582804) * i4) - 1671495680) + (10634006 * i6) + (i8 * 282608405) + (282608405 * i10) + ((-282608405) * i11) + ((-271974400) * i3) + (952107008 * i7) + (1092222976 * i5) + ((-70844416) * i13);
        int i15 = (i4 * 986545540) + 223666697 + (i6 * 986543778) + (i8 * (-881)) + (i10 * (-881)) + (i11 * 881) + (i3 * 986544659) + (i7 * 1843362976) + (i5 * (-1872984789)) + (i13 * (-2050686976));
        return i14 + ((i15 * i15) * 1179713536) != 1 ? e(objArr) : b(objArr);
    }

    @Inject
    public a(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        this.f7707d = delayedOnboardingDatabase;
    }

    public static final /* synthetic */ Completable b(a aVar, j jVar) {
        int i2 = 2 % 2;
        int i3 = f7705a + 121;
        f7706b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableB = aVar.b(jVar);
        int i5 = f7705a + 17;
        f7706b = i5 % 128;
        int i6 = i5 % 2;
        return completableB;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        a aVar = (a) objArr[0];
        int i2 = 2 % 2;
        int i3 = f7705a + 63;
        f7706b = i3 % 128;
        int i4 = i3 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = aVar.f7707d;
        if (i4 == 0) {
            int i5 = 13 / 0;
        }
        return delayedOnboardingDatabase;
    }

    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> b(long j2) {
        int i2 = 2 % 2;
        int i3 = f7706b + 97;
        f7705a = i3 % 128;
        if (i3 % 2 != 0) {
            this.f7707d.n().d(j2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> maybeD = this.f7707d.n().d(j2);
        int i4 = f7705a + 91;
        f7706b = i4 % 128;
        int i5 = i4 % 2;
        return maybeD;
    }

    static final class d extends Lambda implements Function3<Long, String, Long, Triple<? extends Long, ? extends String, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7718a = 1;

        /* JADX INFO: renamed from: b */
        public static final d f7719b = new d();

        /* JADX INFO: renamed from: c */
        private static int f7720c = 0;

        /* JADX INFO: renamed from: d */
        private static int f7721d = 1;

        /* JADX INFO: renamed from: e */
        private static int f7722e = 0;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Triple<? extends Long, ? extends String, ? extends Long> invoke(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7722e + 15;
            f7718a = i3 % 128;
            int i4 = i3 % 2;
            Triple<Long, String, Long> tripleD = d(l2, str, l3);
            if (i4 == 0) {
                int i5 = 73 / 0;
            }
            return tripleD;
        }

        private static Triple<Long, String, Long> d(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(l3, "");
            Triple<Long, String, Long> triple = new Triple<>(l2, str, l3);
            int i3 = f7718a + 17;
            f7722e = i3 % 128;
            int i4 = i3 % 2;
            return triple;
        }

        static {
            int i2 = f7721d + 51;
            f7720c = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(3);
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        a aVar = (a) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Single<Long> singleB = aVar.f7707d.n().b(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a());
        Single<String> singleA = aVar.a(k.f8923c.b());
        Single<Long> singleC = aVar.f7707d.b().c(jLongValue);
        final d dVar = d.f7719b;
        Single singleZip = Single.zip(singleB, singleA, singleC, new io.reactivex.functions.Function3() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return a.e(dVar, obj, obj2, obj3);
            }
        });
        final C0222a c0222a = new C0222a(iIntValue, aVar);
        Completable completableFlatMapCompletable = singleZip.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return a.c(c0222a, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7705a + 73;
        f7706b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return completableFlatMapCompletable;
    }

    public static final Triple e(Function3 function3, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = f7705a + 121;
        f7706b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Triple triple = (Triple) function3.invoke(obj, obj2, obj3);
        int i5 = f7705a + 11;
        f7706b = i5 % 128;
        int i6 = i5 % 2;
        return triple;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.a.a$a */
    static final class C0222a extends Lambda implements Function1<Triple<? extends Long, ? extends String, ? extends Long>, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7708b = 1;

        /* JADX INFO: renamed from: d */
        private static int f7709d = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ a f7710a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f7711e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Triple<? extends Long, ? extends String, ? extends Long> triple) {
            int i2 = 2 % 2;
            int i3 = f7708b + 11;
            f7709d = i3 % 128;
            Triple<? extends Long, ? extends String, ? extends Long> triple2 = triple;
            if (i3 % 2 == 0) {
                return d(triple2);
            }
            d(triple2);
            throw null;
        }

        private CompletableSource d(Triple<Long, String, Long> triple) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(triple, "");
            Long first = triple.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            long jLongValue = first.longValue();
            String second = triple.getSecond();
            Intrinsics.checkNotNullExpressionValue(second, "");
            Long third = triple.getThird();
            Intrinsics.checkNotNullExpressionValue(third, "");
            Completable completableB = a.b(this.f7710a, new j(0L, third.longValue(), second, jLongValue, this.f7711e));
            int i3 = f7708b + 77;
            f7709d = i3 % 128;
            if (i3 % 2 == 0) {
                return completableB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0222a(int i2, a aVar) {
            super(1);
            this.f7711e = i2;
            this.f7710a = aVar;
        }
    }

    public static final CompletableSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7705a + 39;
        f7706b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7705a + 31;
        f7706b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return completableSource;
    }

    static final class c extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7715a = 0;

        /* JADX INFO: renamed from: c */
        private static int f7716c = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7716c + 111;
            f7715a = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends Long> maybeSourceA = a(l2);
            int i5 = f7716c + 39;
            f7715a = i5 % 128;
            int i6 = i5 % 2;
            return maybeSourceA;
        }

        private MaybeSource<? extends Long> a(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7715a + 77;
            f7716c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                Object[] objArr = {a.this};
                ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).d().c(l2.longValue(), k.f8923c.b());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(l2, "");
            Object[] objArr2 = {a.this};
            Maybe<Long> maybeC = ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr2, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).d().c(l2.longValue(), k.f8923c.b());
            int i4 = f7716c + 45;
            f7715a = i4 % 128;
            int i5 = i4 % 2;
            return maybeC;
        }

        c() {
            super(1);
        }
    }

    public final Completable c(long j2) {
        int i2 = 2 % 2;
        Single<Long> singleC = this.f7707d.b().c(j2);
        final c cVar = new c();
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return a.a(cVar, obj);
            }
        });
        final e eVar = new e();
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return a.b(eVar, obj);
            }
        });
        final b bVar = new b();
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return a.d(bVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7705a + 123;
        f7706b = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7706b + 57;
        f7705a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f7705a + 103;
        f7706b = i5 % 128;
        int i6 = i5 % 2;
        return maybeSource;
    }

    static final class e extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a>> {

        /* JADX INFO: renamed from: a */
        private static int f7723a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7724b = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7724b + 111;
            f7723a = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> maybeSourceB = b(l2);
            int i5 = f7723a + 95;
            f7724b = i5 % 128;
            int i6 = i5 % 2;
            return maybeSourceB;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> b(Long l2) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> maybeD;
            int i2 = 2 % 2;
            int i3 = f7723a + 85;
            f7724b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                Object[] objArr = {a.this};
                maybeD = ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(l2.longValue());
                int i4 = 62 / 0;
            } else {
                Intrinsics.checkNotNullParameter(l2, "");
                Object[] objArr2 = {a.this};
                maybeD = ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr2, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(l2.longValue());
            }
            int i5 = f7723a + 43;
            f7724b = i5 % 128;
            int i6 = i5 % 2;
            return maybeD;
        }

        e() {
            super(1);
        }
    }

    public static final MaybeSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7705a + 121;
        f7706b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i4 = f7706b + 73;
        f7705a = i4 % 128;
        int i5 = i4 % 2;
        return maybeSource;
    }

    static final class b extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a, CompletableSource> {

        /* JADX INFO: renamed from: c */
        private static int f7712c = 0;

        /* JADX INFO: renamed from: d */
        private static int f7713d = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
            int i2 = 2 % 2;
            int i3 = f7712c + 85;
            f7713d = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceB = b(aVar);
            int i5 = f7713d + 67;
            f7712c = i5 % 128;
            int i6 = i5 % 2;
            return completableSourceB;
        }

        private CompletableSource b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
            int i2 = 2 % 2;
            int i3 = f7713d + 85;
            f7712c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(aVar, "");
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a.d(1907417138, new Object[]{aVar}, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d(), -1907417137, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d());
                Object[] objArr = {a.this};
                return ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(aVar);
            }
            Intrinsics.checkNotNullParameter(aVar, "");
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a.d(1907417138, new Object[]{aVar}, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d(), -1907417137, IdCaptureScreenKt.bg.d(), IdCaptureScreenKt.bg.d());
            Object[] objArr2 = {a.this};
            ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr2, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(aVar);
            throw null;
        }

        b() {
            super(1);
        }
    }

    public static final CompletableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7705a + 47;
        f7706b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7705a + 41;
        f7706b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return completableSource;
    }

    public final Completable a(bz bzVar, long j2) {
        String message;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d dVar;
        String str;
        Intrinsics.checkNotNullParameter(bzVar, "");
        if (bzVar.e() != null) {
            bf bfVarE = bzVar.e();
            double dE = bfVarE.e();
            boolean z2 = bfVarE.e() >= 0.6000000238418579d;
            boolean zA = bfVarE.a();
            String strD = bfVarE.d();
            boolean zH = bfVarE.h();
            if (bfVarE.e() >= 0.6000000238418579d) {
                str = "SUCCESS";
            } else {
                str = "ERROR";
            }
            dVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d(0L, j2, dE, z2, zA, strD, zH, str, "");
        } else {
            Throwable thD = bzVar.d();
            if (thD == null || (message = thD.getMessage()) == null) {
                message = "";
            }
            dVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.d(j2, null, "ERROR", message, 124);
        }
        Single<Long> singleE = this.f7707d.o().e(dVar);
        final g gVar = new g(j2);
        Completable completableFlatMapCompletable = singleE.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return a.e(gVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        return completableFlatMapCompletable;
    }

    static final class g extends Lambda implements Function1<Long, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7726b = 1;

        /* JADX INFO: renamed from: d */
        private static int f7727d = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ long f7728a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7727d + 109;
            f7726b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceC = c(l2);
            int i5 = f7726b + 57;
            f7727d = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSourceC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.a.a$g$2 */
        static final class AnonymousClass2 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a, CompletableSource> {

            /* JADX INFO: renamed from: a */
            private static int f7730a = 0;

            /* JADX INFO: renamed from: d */
            private static int f7731d = 1;

            private CompletableSource a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
                int i2 = 2 % 2;
                int i3 = f7730a + 63;
                f7731d = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(aVar, "");
                    Object[] objArr = {aVar};
                    return ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a.e(aVar));
                }
                Intrinsics.checkNotNullParameter(aVar, "");
                Object[] objArr2 = {aVar};
                ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr2, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a.e(aVar));
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
                int i2 = 2 % 2;
                int i3 = f7730a + 61;
                f7731d = i3 % 128;
                int i4 = i3 % 2;
                CompletableSource completableSourceA = a(aVar);
                if (i4 == 0) {
                    int i5 = 52 / 0;
                }
                return completableSourceA;
            }

            AnonymousClass2() {
                super(1);
            }
        }

        private CompletableSource c(Long l2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Object[] objArr = {a.this};
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> maybeD = ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(this.f7728a);
            final AnonymousClass2 anonymousClass2 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a.g.2

                /* JADX INFO: renamed from: a */
                private static int f7730a = 0;

                /* JADX INFO: renamed from: d */
                private static int f7731d = 1;

                private CompletableSource a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
                    int i22 = 2 % 2;
                    int i3 = f7730a + 63;
                    f7731d = i3 % 128;
                    if (i3 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(aVar, "");
                        Object[] objArr2 = {aVar};
                        return ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr2, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a.e(aVar));
                    }
                    Intrinsics.checkNotNullParameter(aVar, "");
                    Object[] objArr22 = {aVar};
                    ((DelayedOnboardingDatabase) a.a(VideoSelfieChecksActivity.Companion.c(), objArr22, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c())).n().d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a.e(aVar));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
                    int i22 = 2 % 2;
                    int i3 = f7730a + 61;
                    f7731d = i3 % 128;
                    int i4 = i3 % 2;
                    CompletableSource completableSourceA = a(aVar);
                    if (i4 == 0) {
                        int i5 = 52 / 0;
                    }
                    return completableSourceA;
                }

                AnonymousClass2() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = maybeD.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.a.a$g$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return a.g.d(anonymousClass2, obj);
                }
            });
            int i3 = f7726b + 15;
            f7727d = i3 % 128;
            if (i3 % 2 == 0) {
                return completableFlatMapCompletable;
            }
            throw null;
        }

        public static final CompletableSource d(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7726b + 49;
            f7727d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f7726b + 121;
            f7727d = i5 % 128;
            int i6 = i5 % 2;
            return completableSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j2) {
            super(1);
            this.f7728a = j2;
        }
    }

    public static final CompletableSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7706b + 3;
        f7705a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7706b + 23;
        f7705a = i5 % 128;
        if (i5 % 2 == 0) {
            return completableSource;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private final Single<String> a(String str) {
        int i2 = 2 % 2;
        int i3 = f7706b + 37;
        f7705a = i3 % 128;
        int i4 = i3 % 2;
        Single<String> single = this.f7707d.c().e(str).toSingle();
        Intrinsics.checkNotNullExpressionValue(single, "");
        int i5 = f7705a + 1;
        f7706b = i5 % 128;
        int i6 = i5 % 2;
        return single;
    }

    private final Completable b(j jVar) {
        int i2 = 2 % 2;
        int i3 = f7705a + 115;
        f7706b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = this.f7707d.d().c(jVar);
        int i5 = f7706b + 43;
        f7705a = i5 % 128;
        if (i5 % 2 == 0) {
            return completableC;
        }
        throw null;
    }

    public static final /* synthetic */ DelayedOnboardingDatabase e(a aVar) {
        Object[] objArr = {aVar};
        return (DelayedOnboardingDatabase) a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), -351850208, VideoSelfieChecksActivity.Companion.c(), 351850208, VideoSelfieChecksActivity.Companion.c());
    }

    public final Completable a(long j2, int i2) {
        Object[] objArr = {this, Long.valueOf(j2), Integer.valueOf(i2)};
        return (Completable) a(VideoSelfieChecksActivity.Companion.c(), objArr, VideoSelfieChecksActivity.Companion.c(), 1468952298, VideoSelfieChecksActivity.Companion.c(), -1468952297, VideoSelfieChecksActivity.Companion.c());
    }
}
