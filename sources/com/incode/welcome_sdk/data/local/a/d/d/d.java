package com.incode.welcome_sdk.data.local.a.d.d;

import com.incode.welcome_sdk.data.local.a.d.d.d;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.results.CombinedConsentResult;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private static int f7802a = 0;

    /* JADX INFO: renamed from: b */
    private static int f7803b = 1;

    /* JADX INFO: renamed from: c */
    private final DelayedOnboardingDatabase f7804c;

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i3;
        int i9 = ~(i8 | i5);
        int i10 = ~i6;
        int i11 = ~i5;
        int i12 = (~(i11 | i8)) | i10;
        int i13 = (~(i3 | i5)) | (~(i8 | i10 | i11));
        int i14 = i6 + i5 + i7 + ((-1136091917) * i2) + (376669458 * i4);
        int i15 = i14 * i14;
        int i16 = ((-905468225) * i6) + 1718550528 + ((-1748215485) * i5) + (i9 * (-421373630)) + (421373630 * i12) + ((-421373630) * i13) + ((-1326841856) * i7) + ((-2044854272) * i2) + (41156608 * i4) + (1721171968 * i15);
        int i17 = ((i6 * (-924404593)) - 1636593565) + (i5 * (-924403757)) + (i9 * 418) + (i12 * (-418)) + (i13 * 418) + (i7 * (-924404175)) + (i2 * (-2083730301)) + (i4 * 182666354) + (i15 * (-51970048));
        if (i16 + (i17 * i17 * (-653721600)) != 1) {
            return c(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i18 = 2 % 2;
        int i19 = f7802a + 113;
        f7803b = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i21 = f7802a + 61;
        f7803b = i21 % 128;
        int i22 = i21 % 2;
        return maybeSource;
    }

    @Inject
    public d(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        this.f7804c = delayedOnboardingDatabase;
    }

    public static final /* synthetic */ Completable c(d dVar, j jVar) {
        int i2 = 2 % 2;
        int i3 = f7803b + 65;
        f7802a = i3 % 128;
        if (i3 % 2 == 0) {
            return dVar.e(jVar);
        }
        dVar.e(jVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DelayedOnboardingDatabase a() {
        int i2 = 2 % 2;
        int i3 = f7802a + 31;
        int i4 = i3 % 128;
        f7803b = i4;
        int i5 = i3 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = this.f7804c;
        int i6 = i4 + 7;
        f7802a = i6 % 128;
        if (i6 % 2 == 0) {
            return delayedOnboardingDatabase;
        }
        throw null;
    }

    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> c(long j2) {
        int i2 = 2 % 2;
        int i3 = f7803b + 13;
        f7802a = i3 % 128;
        int i4 = i3 % 2;
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> maybeA = this.f7804c.r().a(j2);
        int i5 = f7802a + 19;
        f7803b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return maybeA;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.d.d$d */
    static final class C0225d extends Lambda implements Function3<Long, String, Long, Triple<? extends Long, ? extends String, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7815a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7816b = 1;

        /* JADX INFO: renamed from: c */
        public static final C0225d f7817c = new C0225d();

        /* JADX INFO: renamed from: d */
        private static int f7818d = 0;

        /* JADX INFO: renamed from: e */
        private static int f7819e = 0;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Triple<? extends Long, ? extends String, ? extends Long> invoke(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7819e + 71;
            f7816b = i3 % 128;
            int i4 = i3 % 2;
            Triple<Long, String, Long> tripleA = a(l2, str, l3);
            if (i4 == 0) {
                int i5 = 37 / 0;
            }
            int i6 = f7816b + 55;
            f7819e = i6 % 128;
            int i7 = i6 % 2;
            return tripleA;
        }

        private static Triple<Long, String, Long> a(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(l3, "");
            Triple<Long, String, Long> triple = new Triple<>(l2, str, l3);
            int i3 = f7816b + 67;
            f7819e = i3 % 128;
            if (i3 % 2 == 0) {
                return triple;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f7818d + 69;
            f7815a = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        C0225d() {
            super(3);
        }
    }

    public final Completable a(long j2, int i2) {
        int i3 = 2 % 2;
        Single<Long> singleA = this.f7804c.r().a(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c(null, null, 31));
        Single<String> singleC = c(k.f8926f.b());
        Single<Long> singleC2 = this.f7804c.b().c(j2);
        final C0225d c0225d = C0225d.f7817c;
        Single singleZip = Single.zip(singleA, singleC, singleC2, new io.reactivex.functions.Function3() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return d.a(c0225d, obj, obj2, obj3);
            }
        });
        final e eVar = new e(i2, this);
        Completable completableFlatMapCompletable = singleZip.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return d.d(eVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i4 = f7802a + 3;
        f7803b = i4 % 128;
        int i5 = i4 % 2;
        return completableFlatMapCompletable;
    }

    public static final Triple a(Function3 function3, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = f7803b + 25;
        f7802a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Triple triple = (Triple) function3.invoke(obj, obj2, obj3);
        int i5 = f7803b + 1;
        f7802a = i5 % 128;
        int i6 = i5 % 2;
        return triple;
    }

    static final class e extends Lambda implements Function1<Triple<? extends Long, ? extends String, ? extends Long>, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7820b = 1;

        /* JADX INFO: renamed from: d */
        private static int f7821d = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ d f7822a;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ int f7823e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Triple<? extends Long, ? extends String, ? extends Long> triple) {
            int i2 = 2 % 2;
            int i3 = f7821d + 15;
            f7820b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceB = b(triple);
            int i5 = f7821d + 31;
            f7820b = i5 % 128;
            int i6 = i5 % 2;
            return completableSourceB;
        }

        private CompletableSource b(Triple<Long, String, Long> triple) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(triple, "");
            Long first = triple.getFirst();
            Intrinsics.checkNotNullExpressionValue(first, "");
            long jLongValue = first.longValue();
            String second = triple.getSecond();
            Intrinsics.checkNotNullExpressionValue(second, "");
            Long third = triple.getThird();
            Intrinsics.checkNotNullExpressionValue(third, "");
            Completable completableC = d.c(this.f7822a, new j(0L, third.longValue(), second, jLongValue, this.f7823e));
            int i3 = f7820b + 109;
            f7821d = i3 % 128;
            int i4 = i3 % 2;
            return completableC;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i2, d dVar) {
            super(1);
            this.f7823e = i2;
            this.f7822a = dVar;
        }
    }

    public static final CompletableSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7803b + 95;
        f7802a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7803b + 43;
        f7802a = i5 % 128;
        int i6 = i5 % 2;
        return completableSource;
    }

    static final class c extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: b */
        private static int f7812b = 0;

        /* JADX INFO: renamed from: e */
        private static int f7813e = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ DelayedOnboardingDatabase f7814c;

        private MaybeSource<? extends Long> e(Long l2) {
            Maybe<Long> maybeC;
            int i2 = 2 % 2;
            int i3 = f7812b + 91;
            f7813e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                maybeC = this.f7814c.d().c(l2.longValue(), k.f8926f.b());
                int i4 = 89 / 0;
            } else {
                Intrinsics.checkNotNullParameter(l2, "");
                maybeC = this.f7814c.d().c(l2.longValue(), k.f8926f.b());
            }
            int i5 = f7813e + 85;
            f7812b = i5 % 128;
            int i6 = i5 % 2;
            return maybeC;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7813e + 47;
            f7812b = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 != 0) {
                e(l3);
                throw null;
            }
            MaybeSource<? extends Long> maybeSourceE = e(l3);
            int i4 = f7812b + 103;
            f7813e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return maybeSourceE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7814c = delayedOnboardingDatabase;
        }
    }

    static final class b extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c>> {

        /* JADX INFO: renamed from: a */
        private static int f7809a = 1;

        /* JADX INFO: renamed from: c */
        private static int f7810c = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ DelayedOnboardingDatabase f7811b;

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> a(Long l2) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> maybeA;
            int i2 = 2 % 2;
            int i3 = f7810c + 13;
            f7809a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                maybeA = this.f7811b.r().a(l2.longValue());
                int i4 = 48 / 0;
            } else {
                Intrinsics.checkNotNullParameter(l2, "");
                maybeA = this.f7811b.r().a(l2.longValue());
            }
            int i5 = f7810c + 65;
            f7809a = i5 % 128;
            if (i5 % 2 != 0) {
                return maybeA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7810c + 103;
            f7809a = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 != 0) {
                return a(l3);
            }
            a(l3);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7811b = delayedOnboardingDatabase;
        }
    }

    static final class a extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7805a = 1;

        /* JADX INFO: renamed from: e */
        private static int f7806e = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ DelayedOnboardingDatabase f7807c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c f7808d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            int i2 = 2 % 2;
            int i3 = f7805a + 45;
            f7806e = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceE = e(cVar);
            if (i4 != 0) {
                int i5 = 4 / 0;
            }
            int i6 = f7806e + 83;
            f7805a = i6 % 128;
            if (i6 % 2 != 0) {
                return completableSourceE;
            }
            throw null;
        }

        private CompletableSource e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            com.incode.welcome_sdk.data.local.db.c.a.e eVarR;
            String strC;
            Map<String, Boolean> mapA;
            boolean z2;
            int i2;
            long j2;
            int i3 = 2 % 2;
            int i4 = f7805a + 39;
            f7806e = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.checkNotNullParameter(cVar, "");
                eVarR = this.f7807c.r();
                strC = this.f7808d.c();
                mapA = this.f7808d.a();
                z2 = true;
                i2 = 21;
                j2 = 1;
            } else {
                Intrinsics.checkNotNullParameter(cVar, "");
                eVarR = this.f7807c.r();
                strC = this.f7808d.c();
                mapA = this.f7808d.a();
                z2 = false;
                i2 = 17;
                j2 = 0;
            }
            return eVarR.b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.e(cVar, j2, strC, mapA, true, z2, i2));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DelayedOnboardingDatabase delayedOnboardingDatabase, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            super(1);
            this.f7807c = delayedOnboardingDatabase;
            this.f7808d = cVar;
        }
    }

    public static final MaybeSource c(Function1 function1, Object obj) {
        MaybeSource maybeSource;
        int i2 = 2 % 2;
        int i3 = f7803b + 15;
        f7802a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            maybeSource = (MaybeSource) function1.invoke(obj);
            int i4 = 64 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            maybeSource = (MaybeSource) function1.invoke(obj);
        }
        int i5 = f7802a + 41;
        f7803b = i5 % 128;
        int i6 = i5 % 2;
        return maybeSource;
    }

    public static final CompletableSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7803b + 87;
        f7802a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i5 = f7802a + 89;
        f7803b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return completableSource;
    }

    public final Completable b(long j2, com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cVar, "");
        DelayedOnboardingDatabase delayedOnboardingDatabase = this.f7804c;
        Single<Long> singleC = delayedOnboardingDatabase.b().c(j2);
        final c cVar2 = new c(delayedOnboardingDatabase);
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return d.e(cVar2, obj);
            }
        });
        final b bVar = new b(delayedOnboardingDatabase);
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return d.c(bVar, obj);
            }
        });
        final a aVar = new a(delayedOnboardingDatabase, cVar);
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return d.b(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7802a + 67;
        f7803b = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    static final class f extends Lambda implements Function1<Long, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7824b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7825c = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ long f7826a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7825c + 69;
            f7824b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceC = c(l2);
            if (i4 == 0) {
                int i5 = 74 / 0;
            }
            int i6 = f7824b + 45;
            f7825c = i6 % 128;
            if (i6 % 2 == 0) {
                return completableSourceC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.d.d$f$1 */
        static final class AnonymousClass1 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c, CompletableSource> {

            /* JADX INFO: renamed from: c */
            private static int f7828c = 1;

            /* JADX INFO: renamed from: e */
            private static int f7829e = 0;

            private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
                com.incode.welcome_sdk.data.local.db.c.a.e eVarR;
                boolean z2;
                int i2;
                long j2;
                String str;
                Map map;
                boolean z3;
                int i3 = 2 % 2;
                int i4 = f7829e + 25;
                f7828c = i4 % 128;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(cVar, "");
                    eVarR = dVar.a().r();
                    z2 = true;
                    i2 = 73;
                    j2 = 1;
                    str = null;
                    map = null;
                    z3 = true;
                } else {
                    Intrinsics.checkNotNullParameter(cVar, "");
                    eVarR = dVar.a().r();
                    z2 = true;
                    i2 = 15;
                    j2 = 0;
                    str = null;
                    map = null;
                    z3 = false;
                }
                return eVarR.b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.e(cVar, j2, str, map, z3, z2, i2));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
                int i2 = 2 % 2;
                int i3 = f7829e + 1;
                f7828c = i3 % 128;
                int i4 = i3 % 2;
                CompletableSource completableSourceD = d(cVar);
                int i5 = f7828c + 43;
                f7829e = i5 % 128;
                int i6 = i5 % 2;
                return completableSourceD;
            }

            AnonymousClass1() {
                super(1);
            }
        }

        private CompletableSource c(Long l2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> maybeA = d.this.a().r().a(this.f7826a);
            final AnonymousClass1 anonymousClass1 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d.f.1

                /* JADX INFO: renamed from: c */
                private static int f7828c = 1;

                /* JADX INFO: renamed from: e */
                private static int f7829e = 0;

                private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
                    com.incode.welcome_sdk.data.local.db.c.a.e eVarR;
                    boolean z2;
                    int i22;
                    long j2;
                    String str;
                    Map map;
                    boolean z3;
                    int i3 = 2 % 2;
                    int i4 = f7829e + 25;
                    f7828c = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(cVar, "");
                        eVarR = dVar.a().r();
                        z2 = true;
                        i22 = 73;
                        j2 = 1;
                        str = null;
                        map = null;
                        z3 = true;
                    } else {
                        Intrinsics.checkNotNullParameter(cVar, "");
                        eVarR = dVar.a().r();
                        z2 = true;
                        i22 = 15;
                        j2 = 0;
                        str = null;
                        map = null;
                        z3 = false;
                    }
                    return eVarR.b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c.e(cVar, j2, str, map, z3, z2, i22));
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
                    int i22 = 2 % 2;
                    int i3 = f7829e + 1;
                    f7828c = i3 % 128;
                    int i4 = i3 % 2;
                    CompletableSource completableSourceD = d(cVar);
                    int i5 = f7828c + 43;
                    f7829e = i5 % 128;
                    int i6 = i5 % 2;
                    return completableSourceD;
                }

                AnonymousClass1() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = maybeA.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$f$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return d.f.c(anonymousClass1, obj);
                }
            });
            int i3 = f7825c + 103;
            f7824b = i3 % 128;
            if (i3 % 2 != 0) {
                return completableFlatMapCompletable;
            }
            throw null;
        }

        public static final CompletableSource c(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7825c + 45;
            f7824b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f7824b + 91;
            f7825c = i5 % 128;
            int i6 = i5 % 2;
            return completableSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j2) {
            super(1);
            this.f7826a = j2;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        d dVar = (d) objArr[0];
        CombinedConsentResult combinedConsentResult = (CombinedConsentResult) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(combinedConsentResult, "");
        Single<Long> singleB = dVar.f7804c.t().b(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.d(combinedConsentResult.resultCode.name(), String.valueOf(combinedConsentResult.error)));
        final f fVar = dVar.new f(jLongValue);
        Completable completableFlatMapCompletable = singleB.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.d.d$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return d.a(fVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7802a + 103;
        f7803b = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    public static final CompletableSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7802a + 71;
        f7803b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i4 = f7803b + 13;
        f7802a = i4 % 128;
        int i5 = i4 % 2;
        return completableSource;
    }

    private final Single<String> c(String str) {
        int i2 = 2 % 2;
        int i3 = f7802a + 13;
        f7803b = i3 % 128;
        if (i3 % 2 != 0) {
            Single<String> single = this.f7804c.c().e(str).toSingle();
            Intrinsics.checkNotNullExpressionValue(single, "");
            return single;
        }
        Intrinsics.checkNotNullExpressionValue(this.f7804c.c().e(str).toSingle(), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Completable e(j jVar) {
        int i2 = 2 % 2;
        int i3 = f7802a + 75;
        f7803b = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = this.f7804c.d().c(jVar);
        int i5 = f7803b + 21;
        f7802a = i5 % 128;
        if (i5 % 2 == 0) {
            return completableC;
        }
        throw null;
    }

    public static final MaybeSource e(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        return (MaybeSource) e(bf.a.e(), bf.a.e(), bf.a.e(), 329223978, -329223977, bf.a.e(), objArr);
    }

    public final Completable b(CombinedConsentResult combinedConsentResult, long j2) {
        Object[] objArr = {this, combinedConsentResult, Long.valueOf(j2)};
        return (Completable) e(bf.a.e(), bf.a.e(), bf.a.e(), -1740025122, 1740025122, bf.a.e(), objArr);
    }
}
