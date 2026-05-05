package com.incode.welcome_sdk.data.local.a.d.f;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.local.a.d.f.c;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.c.a.ac;
import com.incode.welcome_sdk.data.local.db.c.a.p;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.data.remote.beans.f;
import com.incode.welcome_sdk.data.remote.beans.v;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.ui.tutorial.TutorialPresenterModule;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: b */
    private static int f7866b = 1;

    /* JADX INFO: renamed from: d */
    private static int f7867d = 0;

    /* JADX INFO: renamed from: a */
    private final DelayedOnboardingDatabase f7868a;

    public static /* synthetic */ Object d(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~(i8 | i6)) | i10 | (~(i9 | i6));
        int i12 = ~i6;
        int i13 = (~(i12 | i9 | i3)) | (~(i8 | i12 | i2));
        int i14 = i3 + i2 + i5 + ((-195996979) * i4) + ((-904719387) * i7);
        int i15 = i14 * i14;
        int i16 = (i3 * 1886715248) + 940376064 + (1886715248 * i2) + (i11 * (-42925423)) + (i10 * (-42925423)) + ((-42925423) * i13) + (1843789824 * i5) + ((-1389494272) * i4) + (1623064576 * i7) + (1510801408 * i15);
        int i17 = (i3 * 1590984816) + 1398186415 + (i2 * 1590984816) + (i11 * 737) + (i10 * 737) + (i13 * 737) + (i5 * 1590985553) + (i4 * (-1025631779)) + (i7 * 1121679989) + (i15 * 622657536);
        int i18 = i16 + (i17 * i17 * (-1928134656));
        if (i18 == 1) {
            c cVar = (c) objArr[0];
            String str = (String) objArr[1];
            int i19 = 2 % 2;
            int i20 = f7866b + 99;
            f7867d = i20 % 128;
            int i21 = i20 % 2;
            Single<String> single = cVar.f7868a.c().e(str).toSingle();
            Intrinsics.checkNotNullExpressionValue(single, "");
            int i22 = f7866b + 53;
            f7867d = i22 % 128;
            int i23 = i22 % 2;
            return single;
        }
        if (i18 != 2) {
            return b(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i24 = 2 % 2;
        int i25 = f7867d + 91;
        f7866b = i25 % 128;
        int i26 = i25 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
        int i27 = f7867d + 87;
        f7866b = i27 % 128;
        int i28 = i27 % 2;
        return completableSource;
    }

    @Inject
    public c(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        this.f7868a = delayedOnboardingDatabase;
    }

    public static final /* synthetic */ DelayedOnboardingDatabase a(c cVar) {
        int i2 = 2 % 2;
        int i3 = f7866b;
        int i4 = i3 + 49;
        f7867d = i4 % 128;
        int i5 = i4 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = cVar.f7868a;
        int i6 = i3 + 81;
        f7867d = i6 % 128;
        if (i6 % 2 == 0) {
            return delayedOnboardingDatabase;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Completable a(c cVar, j jVar) {
        int i2 = 2 % 2;
        int i3 = f7866b + 27;
        f7867d = i3 % 128;
        if (i3 % 2 == 0) {
            return cVar.a(jVar);
        }
        cVar.a(jVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> d(long j2) {
        int i2 = 2 % 2;
        int i3 = f7867d + 5;
        f7866b = i3 % 128;
        if (i3 % 2 == 0) {
            this.f7868a.l().e(j2);
            throw null;
        }
        Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeE = this.f7868a.l().e(j2);
        int i4 = f7867d + 19;
        f7866b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return maybeE;
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements Function3<Long, String, Long, Triple<? extends Long, ? extends String, ? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7881a = 1;

        /* JADX INFO: renamed from: b */
        private static int f7882b = 1;

        /* JADX INFO: renamed from: c */
        private static int f7883c = 0;

        /* JADX INFO: renamed from: d */
        public static final d f7884d = new d();

        /* JADX INFO: renamed from: e */
        private static int f7885e = 0;

        private static Triple<Long, String, Long> d(long j2, String str, long j3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Triple<Long, String, Long> triple = new Triple<>(Long.valueOf(j2), str, Long.valueOf(j3));
            int i3 = f7881a + 79;
            f7885e = i3 % 128;
            int i4 = i3 % 2;
            return triple;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Triple<? extends Long, ? extends String, ? extends Long> invoke(Long l2, String str, Long l3) {
            int i2 = 2 % 2;
            int i3 = f7881a + 123;
            f7885e = i3 % 128;
            Long l4 = l2;
            if (i3 % 2 == 0) {
                return d(l4.longValue(), str, l3.longValue());
            }
            int i4 = 71 / 0;
            return d(l4.longValue(), str, l3.longValue());
        }

        static {
            int i2 = f7883c + 37;
            f7882b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        d() {
            super(3, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }
    }

    public static final Triple c(Function3 function3, Object obj, Object obj2, Object obj3) {
        int i2 = 2 % 2;
        int i3 = f7867d + 77;
        f7866b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Triple triple = (Triple) function3.invoke(obj, obj2, obj3);
        int i5 = f7867d + 33;
        f7866b = i5 % 128;
        int i6 = i5 % 2;
        return triple;
    }

    static final class b extends Lambda implements Function1<Triple<? extends Long, ? extends String, ? extends Long>, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f7874a = 1;

        /* JADX INFO: renamed from: e */
        private static int f7875e = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f7877c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Triple<? extends Long, ? extends String, ? extends Long> triple) {
            int i2 = 2 % 2;
            int i3 = f7874a + 27;
            f7875e = i3 % 128;
            Triple<? extends Long, ? extends String, ? extends Long> triple2 = triple;
            if (i3 % 2 == 0) {
                return a(triple2);
            }
            a(triple2);
            throw null;
        }

        private CompletableSource a(Triple<Long, String, Long> triple) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(triple, "");
            long jLongValue = triple.component1().longValue();
            String strComponent2 = triple.component2();
            Completable completableA = c.a(c.this, new j(0L, triple.component3().longValue(), strComponent2, jLongValue, this.f7877c));
            int i3 = f7874a + 97;
            f7875e = i3 % 128;
            int i4 = i3 % 2;
            return completableA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.f7877c = i2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        Single<Long> singleE = cVar.f7868a.l().e(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a(0L, null, null, f.AUTO, false, false));
        Object[] objArr2 = {cVar, k.f8924d.b()};
        int iB = TutorialPresenterModule.b();
        Single single = (Single) d(-1439131003, 1439131004, TutorialPresenterModule.b(), objArr2, TutorialPresenterModule.b(), iB, TutorialPresenterModule.b());
        Single<Long> singleC = cVar.f7868a.b().c(jLongValue);
        final d dVar = d.f7884d;
        Single singleZip = Single.zip(singleE, single, singleC, new io.reactivex.functions.Function3() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function3
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return c.c(dVar, obj, obj2, obj3);
            }
        });
        final b bVar = cVar.new b(iIntValue);
        Completable completableFlatMapCompletable = singleZip.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.d(bVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7867d + 45;
        f7866b = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    static final class e extends Lambda implements Function1<Long, MaybeSource<? extends Long>> {

        /* JADX INFO: renamed from: a */
        private static int f7886a = 0;

        /* JADX INFO: renamed from: e */
        private static int f7887e = 1;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ DelayedOnboardingDatabase f7888d;

        private MaybeSource<? extends Long> a(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7887e + 79;
            f7886a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<Long> maybeC = this.f7888d.d().c(l2.longValue(), k.f8924d.b());
            int i5 = f7887e + 61;
            f7886a = i5 % 128;
            if (i5 % 2 == 0) {
                return maybeC;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends Long> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7886a + 53;
            f7887e = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 == 0) {
                a(l3);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MaybeSource<? extends Long> maybeSourceA = a(l3);
            int i4 = f7887e + 117;
            f7886a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return maybeSourceA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7888d = delayedOnboardingDatabase;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.f.c$c */
    static final class C0227c extends Lambda implements Function1<Long, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a>> {

        /* JADX INFO: renamed from: b */
        private static int f7878b = 0;

        /* JADX INFO: renamed from: d */
        private static int f7879d = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ DelayedOnboardingDatabase f7880c;

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> d(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7879d + 103;
            f7878b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(l2, "");
                this.f7880c.l().e(l2.longValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeE = this.f7880c.l().e(l2.longValue());
            int i4 = f7879d + 9;
            f7878b = i4 % 128;
            int i5 = i4 % 2;
            return maybeE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7879d + 87;
            f7878b = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeSourceD = d(l2);
            int i5 = f7879d + 53;
            f7878b = i5 % 128;
            if (i5 % 2 == 0) {
                return maybeSourceD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0227c(DelayedOnboardingDatabase delayedOnboardingDatabase) {
            super(1);
            this.f7880c = delayedOnboardingDatabase;
        }
    }

    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7867d + 95;
        f7866b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (MaybeSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class a extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, CompletableSource> {

        /* JADX INFO: renamed from: d */
        private static int f7869d = 0;

        /* JADX INFO: renamed from: e */
        private static int f7870e = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ DelayedOnboardingDatabase f7871a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Map<String, Float> f7872b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ String f7873c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            int i2 = 2 % 2;
            int i3 = f7869d + 19;
            f7870e = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2 = aVar;
            if (i3 % 2 != 0) {
                return d(aVar2);
            }
            d(aVar2);
            throw null;
        }

        private CompletableSource d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            int i2 = 2 % 2;
            int i3 = f7870e + 23;
            f7869d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(aVar, "");
            Completable completableA = this.f7871a.l().a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.e(aVar, 0L, this.f7873c, this.f7872b, null, true, false, 41));
            int i5 = f7869d + 61;
            f7870e = i5 % 128;
            if (i5 % 2 != 0) {
                return completableA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DelayedOnboardingDatabase delayedOnboardingDatabase, String str, Map<String, Float> map) {
            super(1);
            this.f7871a = delayedOnboardingDatabase;
            this.f7873c = str;
            this.f7872b = map;
        }
    }

    public static final MaybeSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7866b + 79;
        f7867d = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i4 = f7867d + 107;
        f7866b = i4 % 128;
        if (i4 % 2 != 0) {
            return maybeSource;
        }
        throw null;
    }

    public static final CompletableSource c(Function1 function1, Object obj) {
        CompletableSource completableSource;
        int i2 = 2 % 2;
        int i3 = f7866b + 33;
        f7867d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            completableSource = (CompletableSource) function1.invoke(obj);
            int i4 = 97 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            completableSource = (CompletableSource) function1.invoke(obj);
        }
        int i5 = f7867d + 63;
        f7866b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return completableSource;
    }

    public final Completable b(long j2, String str, Map<String, Float> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        DelayedOnboardingDatabase delayedOnboardingDatabase = this.f7868a;
        Single<Long> singleC = delayedOnboardingDatabase.b().c(j2);
        final e eVar = new e(delayedOnboardingDatabase);
        Maybe<R> maybeFlatMapMaybe = singleC.flatMapMaybe(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.a(eVar, obj);
            }
        });
        final C0227c c0227c = new C0227c(delayedOnboardingDatabase);
        Maybe maybeFlatMap = maybeFlatMapMaybe.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.e(c0227c, obj);
            }
        });
        final a aVar = new a(delayedOnboardingDatabase, str, map);
        Completable completableFlatMapCompletable = maybeFlatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.c(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f7867d + 63;
        f7866b = i3 % 128;
        if (i3 % 2 != 0) {
            return completableFlatMapCompletable;
        }
        throw null;
    }

    public final Completable e(v vVar, long j2) {
        Intrinsics.checkNotNullParameter(vVar, "");
        Single<Long> singleD = this.f7868a.m().d(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d(j2, vVar.b() > 0.5d, vVar.e() ? "ERROR" : "SUCCESS", d(vVar)));
        final g gVar = new g(j2);
        Completable completableFlatMapCompletable = singleD.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return c.b(gVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        return completableFlatMapCompletable;
    }

    static final class g extends Lambda implements Function1<Long, CompletableSource> {

        /* JADX INFO: renamed from: b */
        private static int f7889b = 0;

        /* JADX INFO: renamed from: d */
        private static int f7890d = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ long f7891a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f7890d + 111;
            f7889b = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceE = e(l2);
            int i5 = f7889b + 19;
            f7890d = i5 % 128;
            if (i5 % 2 != 0) {
                return completableSourceE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.a.d.f.c$g$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, CompletableSource> {

            /* JADX INFO: renamed from: b */
            private static int f7893b = 1;

            /* JADX INFO: renamed from: d */
            private static int f7894d = 0;

            private CompletableSource b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
                ac acVarL;
                boolean z2;
                int i2;
                int i3 = 2 % 2;
                int i4 = f7893b + 123;
                f7894d = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(aVar, "");
                    acVarL = c.a(cVar).l();
                    z2 = true;
                    i2 = 94;
                } else {
                    Intrinsics.checkNotNullParameter(aVar, "");
                    acVarL = c.a(cVar).l();
                    z2 = true;
                    i2 = 31;
                }
                return acVarL.a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.e(aVar, 0L, null, null, null, false, z2, i2));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
                int i2 = 2 % 2;
                int i3 = f7893b + 113;
                f7894d = i3 % 128;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2 = aVar;
                if (i3 % 2 != 0) {
                    b(aVar2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CompletableSource completableSourceB = b(aVar2);
                int i4 = f7893b + 75;
                f7894d = i4 % 128;
                int i5 = i4 % 2;
                return completableSourceB;
            }

            AnonymousClass5() {
                super(1);
            }
        }

        public static final CompletableSource c(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f7889b + 53;
            f7890d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                return (CompletableSource) function1.invoke(obj);
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            int i4 = 3 / 0;
            return (CompletableSource) function1.invoke(obj);
        }

        private CompletableSource e(Long l2) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(l2, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeE = c.a(c.this).l().e(this.f7891a);
            final AnonymousClass5 anonymousClass5 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, CompletableSource>() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c.g.5

                /* JADX INFO: renamed from: b */
                private static int f7893b = 1;

                /* JADX INFO: renamed from: d */
                private static int f7894d = 0;

                private CompletableSource b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
                    ac acVarL;
                    boolean z2;
                    int i22;
                    int i3 = 2 % 2;
                    int i4 = f7893b + 123;
                    f7894d = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(aVar, "");
                        acVarL = c.a(cVar).l();
                        z2 = true;
                        i22 = 94;
                    } else {
                        Intrinsics.checkNotNullParameter(aVar, "");
                        acVarL = c.a(cVar).l();
                        z2 = true;
                        i22 = 31;
                    }
                    return acVarL.a(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.e(aVar, 0L, null, null, null, false, z2, i22));
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
                    int i22 = 2 % 2;
                    int i3 = f7893b + 113;
                    f7894d = i3 % 128;
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2 = aVar;
                    if (i3 % 2 != 0) {
                        b(aVar2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CompletableSource completableSourceB = b(aVar2);
                    int i4 = f7893b + 75;
                    f7894d = i4 % 128;
                    int i5 = i4 % 2;
                    return completableSourceB;
                }

                AnonymousClass5() {
                    super(1);
                }
            };
            Completable completableFlatMapCompletable = maybeE.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.data.local.a.d.f.c$g$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return c.g.c(anonymousClass5, obj);
                }
            });
            int i3 = f7889b + 107;
            f7890d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 21 / 0;
            }
            return completableFlatMapCompletable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j2) {
            super(1);
            this.f7891a = j2;
        }
    }

    public static final CompletableSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f7866b + 49;
        f7867d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (CompletableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private static String d(v vVar) {
        int i2 = 2 % 2;
        if (IncodeWelcome.Companion.getInstance().getInternalConfig().getBrightnessThreshold() > 0.0f) {
            int i3 = f7866b + 75;
            f7867d = i3 % 128;
            if (i3 % 2 != 0) {
                vVar.c();
                throw null;
            }
            if (!vVar.c()) {
                return "100";
            }
        }
        if (vVar.d()) {
            return "101";
        }
        if (vVar.h()) {
            int i4 = f7867d + 49;
            f7866b = i4 % 128;
            int i5 = i4 % 2;
            return "102";
        }
        if (vVar.g()) {
            return "103";
        }
        int iD = IdCaptureViewModel.l.d();
        int iD2 = IdCaptureViewModel.l.d();
        int iD3 = IdCaptureViewModel.l.d();
        if (!(!((Boolean) v.d(IdCaptureViewModel.l.d(), new Object[]{vVar}, 112187359, iD2, iD, iD3, -112187358)).booleanValue())) {
            return "104";
        }
        if (!vVar.e()) {
            return null;
        }
        int i6 = f7867d + 107;
        f7866b = i6 % 128;
        if (i6 % 2 != 0) {
            return String.valueOf(vVar.a());
        }
        int i7 = 6 / 0;
        return String.valueOf(vVar.a());
    }

    private final Completable a(j jVar) {
        int i2 = 2 % 2;
        int i3 = f7867d + 107;
        f7866b = i3 % 128;
        int i4 = i3 % 2;
        p pVarD = this.f7868a.d();
        if (i4 != 0) {
            return pVarD.c(jVar);
        }
        pVarD.c(jVar);
        throw null;
    }

    public static final CompletableSource d(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        int iB = TutorialPresenterModule.b();
        return (CompletableSource) d(-1239436743, 1239436745, TutorialPresenterModule.b(), objArr, TutorialPresenterModule.b(), iB, TutorialPresenterModule.b());
    }

    private final Single<String> c(String str) {
        int iB = TutorialPresenterModule.b();
        int iB2 = TutorialPresenterModule.b();
        return (Single) d(-1439131003, 1439131004, TutorialPresenterModule.b(), new Object[]{this, str}, iB2, iB, TutorialPresenterModule.b());
    }

    public final Completable d(long j2, int i2) {
        Object[] objArr = {this, Long.valueOf(j2), Integer.valueOf(i2)};
        int iB = TutorialPresenterModule.b();
        return (Completable) d(534415830, -534415830, TutorialPresenterModule.b(), objArr, TutorialPresenterModule.b(), iB, TutorialPresenterModule.b());
    }
}
