package com.incode.welcome_sdk;

import android.os.Process;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.commons.exceptions.MissingFileException;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.k;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.n;
import com.incode.welcome_sdk.data.remote.beans.an;
import com.incode.welcome_sdk.i;
import com.incode.welcome_sdk.listeners.OnboardingSessionListener;
import com.incode.welcome_sdk.ui.camera.video_selfie.DaggerVideoSelfieComponent;
import com.incode.welcome_sdk.ui.ekyb.EKYBActivity;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import com.incode.welcome_sdk.ui.tax_id_validation.ValidatingTaxIdPresenter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10327h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f10328j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.incode.welcome_sdk.data.local.a.e f10329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.incode.welcome_sdk.commons.components.c f10330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeWelcome f10331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f10332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.incode.welcome_sdk.c f10333e;

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | (~(i8 | i4)) | (~(i6 | i4));
        int i10 = (~(i2 | i4)) | i6;
        int i11 = (~(i4 | i2 | i6)) | (~(i8 | (~i6) | (~i4)));
        int i12 = i2 + i6 + i5 + (862446602 * i7) + (395103901 * i3);
        int i13 = i12 * i12;
        int i14 = (((-1892237052) * i2) - 438566912) + ((-683246085) * i6) + (i9 * 402996989) + ((-805993978) * i10) + (402996989 * i11) + ((-1489240064) * i5) + ((-128450560) * i7) + ((-674496512) * i3) + ((-1108934656) * i13);
        int i15 = (i2 * 1384179468) + 550727958 + (i6 * 1384180977) + (i9 * 503) + (i10 * (-1006)) + (i11 * 503) + (i5 * 1384179971) + (i7 * 1640285726) + (i3 * 120803543) + (i13 * 2025127936);
        switch (i14 + (i15 * i15 * (-275709952))) {
            case 1:
                return a(objArr);
            case 2:
                return c(objArr);
            case 3:
                i iVar = (i) objArr[0];
                int i16 = 2 % 2;
                int i17 = f10328j + 103;
                int i18 = i17 % 128;
                f10327h = i18;
                int i19 = i17 % 2;
                com.incode.welcome_sdk.data.local.a.e eVar = iVar.f10329a;
                int i20 = i18 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10328j = i20 % 128;
                int i21 = i20 % 2;
                return eVar;
            case 4:
                return b(objArr);
            case 5:
                i iVar2 = (i) objArr[0];
                com.incode.welcome_sdk.commons.components.c cVar = (com.incode.welcome_sdk.commons.components.c) objArr[1];
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.j) objArr[2];
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b) objArr[3];
                int i22 = 2 % 2;
                Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeD = cVar.d().d(jVar.e());
                final g gVar = iVar2.new g(cVar, bVar);
                Object objFlatMap = maybeD.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda7
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return i.j(gVar, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(objFlatMap, "");
                int i23 = f10327h + 59;
                f10328j = i23 % 128;
                int i24 = i23 % 2;
                return objFlatMap;
            case 6:
                return e(objArr);
            default:
                return d(objArr);
        }
    }

    public i(IncodeWelcome incodeWelcome, com.incode.welcome_sdk.c cVar) {
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        this.f10331c = incodeWelcome;
        this.f10333e = cVar;
        com.incode.welcome_sdk.commons.components.c delayedOnboardingRepositoryComponent = incodeWelcome.getDelayedOnboardingRepositoryComponent();
        this.f10330b = delayedOnboardingRepositoryComponent;
        this.f10329a = delayedOnboardingRepositoryComponent.a();
        this.f10332d = incodeWelcome.getIncodeWelcomeRepositoryComponent().getIncodeRepository();
    }

    public static final /* synthetic */ com.incode.welcome_sdk.c a(i iVar) {
        int i2 = 2 % 2;
        int i3 = f10327h + 43;
        int i4 = i3 % 128;
        f10328j = i4;
        int i5 = i3 % 2;
        com.incode.welcome_sdk.c cVar = iVar.f10333e;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 43;
        f10327h = i6 % 128;
        int i7 = i6 % 2;
        return cVar;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        i iVar = (i) objArr[0];
        com.incode.welcome_sdk.commons.components.c cVar = (com.incode.welcome_sdk.commons.components.c) objArr[1];
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.j) objArr[2];
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b) objArr[3];
        int i2 = 2 % 2;
        int i3 = f10328j + 27;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        Maybe maybe = (Maybe) c(269922230, EKYBActivity.e.e(), iE, iE2, -269922225, iE3, new Object[]{iVar, cVar, jVar, bVar});
        int i5 = f10328j + 53;
        f10327h = i5 % 128;
        if (i5 % 2 != 0) {
            return maybe;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Completable b(i iVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int i2 = 2 % 2;
        int i3 = f10328j + 5;
        f10327h = i3 % 128;
        if (i3 % 2 != 0) {
            return iVar.d(dVar);
        }
        iVar.d(dVar);
        throw null;
    }

    public static final /* synthetic */ Maybe b(i iVar, long j2) {
        int i2 = 2 % 2;
        int i3 = f10327h + 103;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {iVar, Long.valueOf(j2)};
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        int iE4 = EKYBActivity.e.e();
        if (i4 != 0) {
            throw null;
        }
        Maybe maybe = (Maybe) c(1174785089, iE4, iE, iE2, -1174785087, iE3, objArr);
        int i5 = f10327h + 41;
        f10328j = i5 % 128;
        if (i5 % 2 == 0) {
            return maybe;
        }
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository c(i iVar) {
        int i2 = 2 % 2;
        int i3 = f10328j + 85;
        int i4 = i3 % 128;
        f10327h = i4;
        int i5 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = iVar.f10332d;
        if (i5 == 0) {
            int i6 = 53 / 0;
        }
        int i7 = i4 + 65;
        f10328j = i7 % 128;
        int i8 = i7 % 2;
        return incodeWelcomeRepository;
    }

    public static final /* synthetic */ Single c(i iVar, int i2) {
        int i3 = 2 % 2;
        int i4 = f10328j + 55;
        f10327h = i4 % 128;
        if (i4 % 2 == 0) {
            iVar.d(i2);
            throw null;
        }
        Single<Pair<Integer, Integer>> singleD = iVar.d(i2);
        int i5 = f10327h + 37;
        f10328j = i5 % 128;
        int i6 = i5 % 2;
        return singleD;
    }

    public static final /* synthetic */ Completable d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e eVar) {
        int i2 = 2 % 2;
        int i3 = f10327h + 23;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = c((com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object>) eVar);
        int i5 = f10327h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10328j = i5 % 128;
        if (i5 % 2 == 0) {
            return completableC;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Maybe d(i iVar, com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar2) {
        int i2 = 2 % 2;
        int i3 = f10327h + 125;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {iVar, cVar, aVar, aVar2};
            return (Maybe) c(552706945, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -552706945, EKYBActivity.e.e(), objArr);
        }
        Object[] objArr2 = {iVar, cVar, aVar, aVar2};
        throw null;
    }

    public static final /* synthetic */ Maybe d(i iVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int i2 = 2 % 2;
        int i3 = f10327h + 55;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {iVar, dVar};
            return (Maybe) c(-1816955755, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1816955761, EKYBActivity.e.e(), objArr);
        }
        Object[] objArr2 = {iVar, dVar};
        int i4 = 56 / 0;
        return (Maybe) c(-1816955755, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 1816955761, EKYBActivity.e.e(), objArr2);
    }

    public static final /* synthetic */ Maybe e(i iVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
        int i2 = 2 % 2;
        int i3 = f10327h + 47;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Maybe<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object>> maybeB = iVar.b(jVar);
        int i5 = f10328j + 95;
        f10327h = i5 % 128;
        int i6 = i5 % 2;
        return maybeB;
    }

    public static final /* synthetic */ Single e(i iVar, Pair pair) {
        int i2 = 2 % 2;
        int i3 = f10327h + 107;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Single<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> singleD = iVar.d((Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>) pair);
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        int i6 = f10328j + 1;
        f10327h = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 50 / 0;
        }
        return singleD;
    }

    public final Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> a() {
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> singleA;
        int i2 = 2 % 2;
        int i3 = f10327h + 19;
        f10328j = i3 % 128;
        if (i3 % 2 != 0) {
            singleA = this.f10329a.a();
            int i4 = 48 / 0;
        } else {
            singleA = this.f10329a.a();
        }
        int i5 = f10327h + 31;
        f10328j = i5 % 128;
        if (i5 % 2 == 0) {
            return singleA;
        }
        throw null;
    }

    static final class l extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>, SingleSource<? extends Pair<? extends Integer, ? extends Integer>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10385a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10386d = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends Pair<? extends Integer, ? extends Integer>> invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
            int i2 = 2 % 2;
            int i3 = f10386d + 87;
            f10385a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends Pair<Integer, Integer>> singleSourceE = e(list);
            int i5 = f10386d + 83;
            f10385a = i5 % 128;
            if (i5 % 2 != 0) {
                return singleSourceE;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.i$l$5, reason: invalid class name */
        static final class AnonymousClass5 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d, CompletableSource> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10392c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10393e = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ i f10394a;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
                int i2 = 2 % 2;
                int i3 = f10393e + 79;
                f10392c = i3 % 128;
                com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar2 = dVar;
                if (i3 % 2 != 0) {
                    return c(dVar2);
                }
                c(dVar2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final MaybeSource d(Function1 function1, Object obj) {
                int i2 = 2 % 2;
                int i3 = f10393e + 83;
                f10392c = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
                int i5 = f10392c + 51;
                f10393e = i5 % 128;
                int i6 = i5 % 2;
                return maybeSource;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.i$l$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c, CompletableSource> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f10395b = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f10396d = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ i f10397c;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar) {
                    int i2 = 2 % 2;
                    int i3 = f10395b + 47;
                    f10396d = i3 % 128;
                    int i4 = i3 % 2;
                    CompletableSource completableSourceC = c(cVar);
                    int i5 = f10395b + 87;
                    f10396d = i5 % 128;
                    int i6 = i5 % 2;
                    return completableSourceC;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.i$l$5$1$5, reason: invalid class name and collision with other inner class name */
                static final class C02445 extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>, CompletableSource> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f10398a = 1;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f10399d = 0;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private /* synthetic */ i f10400b;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CompletableSource invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j> list) {
                        int i2 = 2 % 2;
                        int i3 = f10398a + 53;
                        f10399d = i3 % 128;
                        int i4 = i3 % 2;
                        CompletableSource completableSourceC = c(list);
                        int i5 = f10399d + 89;
                        f10398a = i5 % 128;
                        if (i5 % 2 != 0) {
                            return completableSourceC;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.i$l$5$1$5$1, reason: invalid class name and collision with other inner class name */
                    static final class C02451 extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j, CompletableSource> {

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int f10401d = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f10402e = 0;

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private /* synthetic */ i f10403a;

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
                            int i2 = 2 % 2;
                            int i3 = f10402e + 77;
                            f10401d = i3 % 128;
                            int i4 = i3 % 2;
                            CompletableSource completableSourceC = c(jVar);
                            int i5 = f10402e + 87;
                            f10401d = i5 % 128;
                            if (i5 % 2 == 0) {
                                int i6 = 53 / 0;
                            }
                            return completableSourceC;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final CompletableSource b(Function1 function1, Object obj) {
                            int i2 = 2 % 2;
                            int i3 = f10401d + 25;
                            f10402e = i3 % 128;
                            if (i3 % 2 == 0) {
                                Intrinsics.checkNotNullParameter(function1, "");
                                Intrinsics.checkNotNullParameter(obj, "");
                                return (CompletableSource) function1.invoke(obj);
                            }
                            Intrinsics.checkNotNullParameter(function1, "");
                            Intrinsics.checkNotNullParameter(obj, "");
                            throw null;
                        }

                        private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
                            int i2 = 2 % 2;
                            Intrinsics.checkNotNullParameter(jVar, "");
                            Maybe maybeE = i.e(this.f10403a, jVar);
                            final i iVar = this.f10403a;
                            final Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object>, CompletableSource> function1 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object>, CompletableSource>() { // from class: com.incode.welcome_sdk.i.l.5.1.5.1.2

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                private static int f10404c = 1;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                private static int f10405d = 0;

                                private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object> eVar) {
                                    int i3 = 2 % 2;
                                    int i4 = f10405d + 89;
                                    f10404c = i4 % 128;
                                    int i5 = i4 % 2;
                                    Intrinsics.checkNotNullParameter(eVar, "");
                                    Completable completableD = i.d(eVar);
                                    int i6 = f10405d + 89;
                                    f10404c = i6 % 128;
                                    int i7 = i6 % 2;
                                    return completableD;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ CompletableSource invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object> eVar) {
                                    int i3 = 2 % 2;
                                    int i4 = f10405d + 41;
                                    f10404c = i4 % 128;
                                    int i5 = i4 % 2;
                                    CompletableSource completableSourceC = c(eVar);
                                    int i6 = f10405d + 3;
                                    f10404c = i6 % 128;
                                    if (i6 % 2 != 0) {
                                        return completableSourceC;
                                    }
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }

                                {
                                    super(1);
                                }
                            };
                            Completable completableFlatMapCompletable = maybeE.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.i$l$5$1$5$1$$ExternalSyntheticLambda0
                                @Override // io.reactivex.functions.Function
                                public final Object apply(Object obj) {
                                    return i.l.AnonymousClass5.AnonymousClass1.C02445.C02451.b(function1, obj);
                                }
                            });
                            int i3 = f10401d + 87;
                            f10402e = i3 % 128;
                            int i4 = i3 % 2;
                            return completableFlatMapCompletable;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02451(i iVar) {
                            super(1);
                            this.f10403a = iVar;
                        }
                    }

                    private CompletableSource c(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j> list) {
                        int i2 = 2 % 2;
                        Intrinsics.checkNotNullParameter(list, "");
                        Observable observableFromIterable = Observable.fromIterable(CollectionsKt.sortedWith(list, new d()));
                        final C02451 c02451 = new C02451(this.f10400b);
                        Completable completableConcatMapCompletable = observableFromIterable.concatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.i$l$5$1$5$$ExternalSyntheticLambda0
                            @Override // io.reactivex.functions.Function
                            public final Object apply(Object obj) {
                                return i.l.AnonymousClass5.AnonymousClass1.C02445.d(c02451, obj);
                            }
                        });
                        int i3 = f10399d + 83;
                        f10398a = i3 % 128;
                        int i4 = i3 % 2;
                        return completableConcatMapCompletable;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final CompletableSource d(Function1 function1, Object obj) {
                        int i2 = 2 % 2;
                        int i3 = f10399d + 27;
                        f10398a = i3 % 128;
                        if (i3 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(function1, "");
                            Intrinsics.checkNotNullParameter(obj, "");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(function1, "");
                        Intrinsics.checkNotNullParameter(obj, "");
                        CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
                        int i4 = f10398a + 125;
                        f10399d = i4 % 128;
                        int i5 = i4 % 2;
                        return completableSource;
                    }

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.i$l$5$1$5$d */
                    public static final class d<T> implements Comparator {

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static int f10407c = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f10408e = 0;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t3) {
                            int i2 = 2 % 2;
                            int i3 = f10407c + 17;
                            f10408e = i3 % 128;
                            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.j) t2;
                            if (i3 % 2 != 0) {
                                ComparisonsKt.compareValues(Integer.valueOf(jVar.b()), Integer.valueOf(((com.incode.welcome_sdk.data.local.model.delayed_onboarding.j) t3).b()));
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int iCompareValues = ComparisonsKt.compareValues(Integer.valueOf(jVar.b()), Integer.valueOf(((com.incode.welcome_sdk.data.local.model.delayed_onboarding.j) t3).b()));
                            int i4 = f10407c + 73;
                            f10408e = i4 % 128;
                            int i5 = i4 % 2;
                            return iCompareValues;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C02445(i iVar) {
                        super(1);
                        this.f10400b = iVar;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final CompletableSource a(Function1 function1, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = f10395b + 117;
                    f10396d = i3 % 128;
                    int i4 = i3 % 2;
                    Intrinsics.checkNotNullParameter(function1, "");
                    Intrinsics.checkNotNullParameter(obj, "");
                    CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
                    int i5 = f10396d + 95;
                    f10395b = i5 % 128;
                    int i6 = i5 % 2;
                    return completableSource;
                }

                private CompletableSource c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c cVar) {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(cVar, "");
                    Maybe maybeB = i.b(this.f10397c, cVar.d());
                    final C02445 c02445 = new C02445(this.f10397c);
                    Completable completableFlatMapCompletable = maybeB.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.i$l$5$1$$ExternalSyntheticLambda0
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return i.l.AnonymousClass5.AnonymousClass1.a(c02445, obj);
                        }
                    });
                    int i3 = f10396d + 69;
                    f10395b = i3 % 128;
                    int i4 = i3 % 2;
                    return completableFlatMapCompletable;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(i iVar) {
                    super(1);
                    this.f10397c = iVar;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CompletableSource c(Function1 function1, Object obj) {
                int i2 = 2 % 2;
                int i3 = f10392c + 69;
                f10393e = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
                int i5 = f10392c + 7;
                f10393e = i5 % 128;
                if (i5 % 2 == 0) {
                    return completableSource;
                }
                throw null;
            }

            private CompletableSource c(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(dVar, "");
                Maybe maybeD = i.d(this.f10394a, dVar);
                final i iVar = this.f10394a;
                final Function1<Pair<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, ? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c>> function1 = new Function1<Pair<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, ? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c>>() { // from class: com.incode.welcome_sdk.i.l.5.2

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f10409b = 1;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f10410d = 0;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> invoke(Pair<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, ? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> pair) {
                        int i3 = 2 % 2;
                        int i4 = f10410d + 81;
                        f10409b = i4 % 128;
                        int i5 = i4 % 2;
                        MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> maybeSourceE = e(pair);
                        int i6 = f10409b + 57;
                        f10410d = i6 % 128;
                        int i7 = i6 % 2;
                        return maybeSourceE;
                    }

                    private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> e(Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> pair) {
                        int i3 = 2 % 2;
                        int i4 = f10410d + 59;
                        f10409b = i4 % 128;
                        int i5 = i4 % 2;
                        Intrinsics.checkNotNullParameter(pair, "");
                        Maybe maybeObserveOn = i.e(iVar, pair).toMaybe().observeOn(Schedulers.io());
                        int i6 = f10409b + 19;
                        f10410d = i6 % 128;
                        int i7 = i6 % 2;
                        return maybeObserveOn;
                    }

                    {
                        super(1);
                    }
                };
                Maybe maybeConcatMap = maybeD.concatMap(new Function() { // from class: com.incode.welcome_sdk.i$l$5$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return i.l.AnonymousClass5.d(function1, obj);
                    }
                });
                final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10394a);
                Completable completableFlatMapCompletable = maybeConcatMap.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.i$l$5$$ExternalSyntheticLambda1
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return i.l.AnonymousClass5.c(anonymousClass1, obj);
                    }
                });
                final i iVar2 = this.f10394a;
                Completable completableAndThen = completableFlatMapCompletable.andThen(Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.i$l$5$$ExternalSyntheticLambda2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return i.l.AnonymousClass5.c(iVar2, dVar);
                    }
                }));
                int i3 = f10393e + 45;
                f10392c = i3 % 128;
                if (i3 % 2 != 0) {
                    return completableAndThen;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CompletableSource c(i iVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
                int i2 = 2 % 2;
                int i3 = f10392c + 21;
                f10393e = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(iVar, "");
                    Intrinsics.checkNotNullParameter(dVar, "");
                    return i.b(iVar, dVar);
                }
                Intrinsics.checkNotNullParameter(iVar, "");
                Intrinsics.checkNotNullParameter(dVar, "");
                i.b(iVar, dVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(i iVar) {
                super(1);
                this.f10394a = iVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CompletableSource b(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f10386d + 37;
            f10385a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f10386d + 81;
            f10385a = i5 % 128;
            if (i5 % 2 != 0) {
                return completableSource;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f10385a + 111;
            f10386d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
            int i5 = f10385a + 43;
            f10386d = i5 % 128;
            if (i5 % 2 == 0) {
                return zBooleanValue;
            }
            throw null;
        }

        private SingleSource<? extends Pair<Integer, Integer>> e(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            final int size = list.size();
            Observable observableFromIterable = Observable.fromIterable(list);
            final AnonymousClass5 anonymousClass5 = new AnonymousClass5(i.this);
            Completable completableConcatMapCompletable = observableFromIterable.concatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.i$l$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.l.b(anonymousClass5, obj);
                }
            });
            final i iVar = i.this;
            final Function1<Throwable, Boolean> function1 = new Function1<Throwable, Boolean>() { // from class: com.incode.welcome_sdk.i.l.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f10388a = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f10389c = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Boolean invoke(Throwable th) {
                    int i3 = 2 % 2;
                    int i4 = f10388a + 3;
                    f10389c = i4 % 128;
                    Throwable th2 = th;
                    if (i4 % 2 != 0) {
                        b(th2);
                        throw null;
                    }
                    Boolean boolB = b(th2);
                    int i5 = f10388a + 105;
                    f10389c = i5 % 128;
                    int i6 = i5 % 2;
                    return boolB;
                }

                private Boolean b(Throwable th) {
                    int i3 = 2 % 2;
                    int i4 = f10388a + 39;
                    f10389c = i4 % 128;
                    int i5 = i4 % 2;
                    Intrinsics.checkNotNullParameter(th, "");
                    boolean z2 = false;
                    Timber.Forest.e(th, "Error occurred while syncing.", new Object[0]);
                    if (size > iVar.a().blockingGet().size()) {
                        int i6 = f10389c;
                        int i7 = i6 + 19;
                        f10388a = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = i6 + 89;
                        f10388a = i9 % 128;
                        int i10 = i9 % 2;
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            Single singleAndThen = completableConcatMapCompletable.onErrorComplete(new Predicate() { // from class: com.incode.welcome_sdk.i$l$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return i.l.d(function1, obj);
                }
            }).andThen(i.a(i.this).g()).andThen(i.c(i.this, size));
            int i3 = f10386d + 113;
            f10385a = i3 % 128;
            int i4 = i3 % 2;
            return singleAndThen;
        }

        l() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(List list) {
        int i2 = 2 % 2;
        int i3 = f10328j + 47;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        int i5 = f10328j + 87;
        f10327h = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10328j + 123;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f10327h + 103;
        f10328j = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    public final Single<Pair<Integer, Integer>> a(final List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Single singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.d(list);
            }
        });
        final l lVar = new l();
        Single<Pair<Integer, Integer>> singleFlatMap = singleFromCallable.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return i.e(lVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "");
        int i3 = f10327h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        return singleFlatMap;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        i iVar = (i) objArr[0];
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.d) objArr[1];
        int i2 = 2 % 2;
        int i3 = f10328j + 103;
        f10327h = i3 % 128;
        if (i3 % 2 != 0) {
            return iVar.f10329a.a(((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.a(-977628280, 977628281, IdCaptureViewModel.ai.d(), new Object[]{dVar}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d())).longValue(), dVar.a());
        }
        Maybe<Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>> maybeA = iVar.f10329a.a(((Long) com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.a(-977628280, 977628281, IdCaptureViewModel.ai.d(), new Object[]{dVar}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d())).longValue(), dVar.a());
        int i4 = 8 / 0;
        return maybeA;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        i iVar = (i) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i2 = 2 % 2;
        int i3 = f10328j + 3;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.e eVar = iVar.f10329a;
        if (i4 != 0) {
            return eVar.d(jLongValue);
        }
        eVar.d(jLongValue);
        throw null;
    }

    public static final class b extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f10339b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f10340c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10341e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f10342g = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10344d;

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b> c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(cVar, "");
            IncodeWelcomeRepository incodeWelcomeRepositoryC = i.c(i.this);
            Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepositoryC, "");
            Maybe maybeJust = Maybe.just(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b(incodeWelcomeRepositoryC, this.f10344d.d(), cVar));
            int i3 = f10342g + 17;
            f10341e = i3 % 128;
            if (i3 % 2 == 0) {
                return maybeJust;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            int i3 = f10341e + 13;
            f10342g = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b> maybeSourceC = c(cVar);
            if (i4 == 0) {
                int i5 = 3 / 0;
            }
            int i6 = f10342g + 109;
            f10341e = i6 % 128;
            if (i6 % 2 == 0) {
                return maybeSourceC;
            }
            throw null;
        }

        public static int b() {
            int i2 = f10340c;
            int i3 = i2 % 7696679;
            f10340c = i2 + 1;
            if (i3 != 0) {
                return f10339b;
            }
            int iMyTid = Process.myTid();
            f10339b = iMyTid;
            return iMyTid;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.incode.welcome_sdk.commons.components.c cVar) {
            super(1);
            this.f10344d = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 59;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f10327h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10328j = i5 % 128;
        if (i5 % 2 == 0) {
            return maybeSource;
        }
        throw null;
    }

    static final class a extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10334a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10335d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.j f10336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10337c;

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e> b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
            int i2 = 2 % 2;
            int i3 = f10334a + 45;
            f10335d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bVar, "");
            Maybe maybeD = i.d(i.this, this.f10337c, this.f10336b, bVar);
            int i5 = f10335d + 59;
            f10334a = i5 % 128;
            int i6 = i5 % 2;
            return maybeD;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
            int i2 = 2 % 2;
            int i3 = f10335d + 33;
            f10334a = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar2 = bVar;
            if (i3 % 2 == 0) {
                b(bVar2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e> maybeSourceB = b(bVar2);
            int i4 = f10335d + 47;
            f10334a = i4 % 128;
            int i5 = i4 % 2;
            return maybeSourceB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
            super(1);
            this.f10337c = cVar;
            this.f10336b = jVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 39;
        f10328j = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i4 = f10327h + 89;
        f10328j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return maybeSource;
    }

    static final class e extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10353a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10354b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10356e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
            int i2 = 2 % 2;
            int i3 = f10354b + 101;
            f10353a = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e> maybeSourceC = c(dVar);
            int i5 = f10354b + 63;
            f10353a = i5 % 128;
            int i6 = i5 % 2;
            return maybeSourceC;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e> c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d dVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(dVar, "");
            IncodeWelcomeRepository incodeWelcomeRepositoryC = i.c(i.this);
            Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepositoryC, "");
            Maybe maybeJust = Maybe.just(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.e(incodeWelcomeRepositoryC, this.f10356e.b(), dVar));
            int i3 = f10353a + 61;
            f10354b = i3 % 128;
            int i4 = i3 % 2;
            return maybeJust;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.incode.welcome_sdk.commons.components.c cVar) {
            super(1);
            this.f10356e = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 53;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (MaybeSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class d extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10349b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10350d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10352e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            int i2 = 2 % 2;
            int i3 = f10350d + 87;
            f10349b = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2 = aVar;
            if (i3 % 2 != 0) {
                return d(aVar2);
            }
            d(aVar2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e> d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(aVar, "");
            IncodeWelcomeRepository incodeWelcomeRepositoryC = i.c(i.this);
            Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepositoryC, "");
            Maybe maybeJust = Maybe.just(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.e(incodeWelcomeRepositoryC, this.f10352e.e(), aVar));
            int i3 = f10350d + 81;
            f10349b = i3 % 128;
            int i4 = i3 % 2;
            return maybeJust;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(com.incode.welcome_sdk.commons.components.c cVar) {
            super(1);
            this.f10352e = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 99;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (MaybeSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 74 / 0;
        return (MaybeSource) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.i$i, reason: collision with other inner class name */
    static final class C0243i extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10369c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10370e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.j f10371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ i f10372b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10373d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
            int i2 = 2 % 2;
            int i3 = f10369c + 79;
            f10370e = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> maybeSourceD = d(aVar);
            int i5 = f10369c + 23;
            f10370e = i5 % 128;
            int i6 = i5 % 2;
            return maybeSourceD;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MaybeSource a(Function1 function1, Object obj) {
            MaybeSource maybeSource;
            int i2 = 2 % 2;
            int i3 = f10370e + 121;
            f10369c = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                maybeSource = (MaybeSource) function1.invoke(obj);
                int i4 = 38 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                maybeSource = (MaybeSource) function1.invoke(obj);
            }
            int i5 = f10369c + 3;
            f10370e = i5 % 128;
            int i6 = i5 % 2;
            return maybeSource;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> d(final com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(aVar, "");
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeD = this.f10373d.e().d(this.f10371a.e());
            final i iVar = this.f10372b;
            final com.incode.welcome_sdk.commons.components.c cVar = this.f10373d;
            final Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b>> function1 = new Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b>>() { // from class: com.incode.welcome_sdk.i.i.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f10374b = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f10375d = 1;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2) {
                    int i3 = 2 % 2;
                    int i4 = f10374b + 99;
                    f10375d = i4 % 128;
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar3 = aVar2;
                    if (i4 % 2 == 0) {
                        e(aVar3);
                        throw null;
                    }
                    MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> maybeSourceE = e(aVar3);
                    int i5 = f10375d + 77;
                    f10374b = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 30 / 0;
                    }
                    return maybeSourceE;
                }

                private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar2) {
                    int i3 = 2 % 2;
                    int i4 = f10375d + 89;
                    f10374b = i4 % 128;
                    if (i4 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(aVar2, "");
                        i iVar2 = iVar;
                        com.incode.welcome_sdk.commons.components.c cVar2 = cVar;
                        com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar3 = aVar;
                        Intrinsics.checkNotNullExpressionValue(aVar3, "");
                        return i.d(iVar2, cVar2, aVar2, aVar3);
                    }
                    Intrinsics.checkNotNullParameter(aVar2, "");
                    i iVar3 = iVar;
                    com.incode.welcome_sdk.commons.components.c cVar3 = cVar;
                    com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar4 = aVar;
                    Intrinsics.checkNotNullExpressionValue(aVar4, "");
                    i.d(iVar3, cVar3, aVar2, aVar4);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            };
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> maybeSourceFlatMap = maybeD.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$i$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.C0243i.a(function1, obj);
                }
            });
            int i3 = f10369c + 83;
            f10370e = i3 % 128;
            if (i3 % 2 != 0) {
                return maybeSourceFlatMap;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0243i(com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar, i iVar) {
            super(1);
            this.f10373d = cVar;
            this.f10371a = jVar;
            this.f10372b = iVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource g(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 123;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (MaybeSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class h extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10365a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10366e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10368d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            int i2 = 2 % 2;
            int i3 = f10366e + 113;
            f10365a = i3 % 128;
            int i4 = i3 % 2;
            MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e> maybeSourceD = d(cVar);
            int i5 = f10366e + 45;
            f10365a = i5 % 128;
            if (i5 % 2 == 0) {
                return maybeSourceD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e> d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(cVar, "");
            IncodeWelcomeRepository incodeWelcomeRepositoryC = i.c(i.this);
            Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepositoryC, "");
            Maybe maybeJust = Maybe.just(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.e(incodeWelcomeRepositoryC, this.f10368d.h(), cVar));
            int i3 = f10365a + 1;
            f10366e = i3 % 128;
            int i4 = i3 % 2;
            return maybeJust;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(com.incode.welcome_sdk.commons.components.c cVar) {
            super(1);
            this.f10368d = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource f(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10328j + 75;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f10327h + 97;
        f10328j = i5 % 128;
        int i6 = i5 % 2;
        return maybeSource;
    }

    private final Maybe<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object>> b(com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar) {
        int i2 = 2 % 2;
        int i3 = f10328j + 99;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.commons.components.c cVar = this.f10330b;
        String strA = jVar.a();
        if (Intrinsics.areEqual(strA, k.f8922b.b())) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c> maybeD = cVar.d().d(jVar.e());
            final b bVar = new b(cVar);
            return maybeD.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda10
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.b(bVar, obj);
                }
            });
        }
        if (Intrinsics.areEqual(strA, k.f8925e.b())) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b> maybeD2 = cVar.c().d(jVar.e());
            final a aVar = new a(cVar, jVar);
            Maybe maybeFlatMap = maybeD2.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda11
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.d(aVar, obj);
                }
            });
            int i5 = f10327h + 55;
            f10328j = i5 % 128;
            int i6 = i5 % 2;
            return maybeFlatMap;
        }
        if (Intrinsics.areEqual(strA, k.f8921a.b())) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d> maybeC = cVar.b().c(jVar.e());
            final e eVar = new e(cVar);
            return maybeC.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda12
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.c(eVar, obj);
                }
            });
        }
        if (Intrinsics.areEqual(strA, k.f8924d.b())) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a> maybeD3 = cVar.e().d(jVar.e());
            final d dVar = new d(cVar);
            return maybeD3.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.a(dVar, obj);
                }
            });
        }
        if (Intrinsics.areEqual(strA, k.f8923c.b())) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a> maybeB = cVar.i().b(jVar.e());
            final C0243i c0243i = new C0243i(cVar, jVar, this);
            return maybeB.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.g(c0243i, obj);
                }
            });
        }
        if (Intrinsics.areEqual(strA, k.f8926f.b())) {
            Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c> maybeC2 = cVar.h().c(jVar.e());
            final h hVar = new h(cVar);
            return maybeC2.flatMap(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return i.f(hVar, obj);
                }
            });
        }
        return Maybe.empty();
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        i iVar = (i) objArr[0];
        com.incode.welcome_sdk.commons.components.c cVar = (com.incode.welcome_sdk.commons.components.c) objArr[1];
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a) objArr[2];
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar2 = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a) objArr[3];
        int i2 = 2 % 2;
        int i3 = f10328j + 75;
        f10327h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int iC = ValidatingTaxIdPresenter.a.c();
            int iC2 = ValidatingTaxIdPresenter.a.c();
            ((Boolean) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC, -988071999, iC2, 988071999)).booleanValue();
            throw null;
        }
        int iC3 = ValidatingTaxIdPresenter.a.c();
        int iC4 = ValidatingTaxIdPresenter.a.c();
        if (((Boolean) com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a.d(new Object[]{aVar}, ValidatingTaxIdPresenter.a.c(), ValidatingTaxIdPresenter.a.c(), iC3, -988071999, iC4, 988071999)).booleanValue()) {
            IncodeWelcomeRepository incodeWelcomeRepository = iVar.f10332d;
            Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepository, "");
            Maybe maybeJust = Maybe.just(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b(incodeWelcomeRepository, cVar.i(), aVar2));
            int i4 = f10327h + 13;
            f10328j = i4 % 128;
            int i5 = i4 % 2;
            return maybeJust;
        }
        Maybe maybeEmpty = Maybe.empty();
        int i6 = f10328j + 125;
        f10327h = i6 % 128;
        if (i6 % 2 != 0) {
            return maybeEmpty;
        }
        obj.hashCode();
        throw null;
    }

    static final class g extends Lambda implements Function1<com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c, MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10360b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10361d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b f10362a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.components.c f10364e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e> invoke(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            int i2 = 2 % 2;
            int i3 = f10361d + 83;
            f10360b = i3 % 128;
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar2 = cVar;
            if (i3 % 2 != 0) {
                return d(cVar2);
            }
            d(cVar2);
            throw null;
        }

        private MaybeSource<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e> d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
            Maybe maybeEmpty;
            int i2 = 2 % 2;
            int i3 = f10361d + 111;
            f10360b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(cVar, "");
            if (cVar.g()) {
                IncodeWelcomeRepository incodeWelcomeRepositoryC = i.c(i.this);
                Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepositoryC, "");
                maybeEmpty = Maybe.just(new com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e(incodeWelcomeRepositoryC, this.f10364e.c(), this.f10362a));
            } else {
                maybeEmpty = Maybe.empty();
            }
            Maybe maybe = maybeEmpty;
            int i5 = f10360b + 1;
            f10361d = i5 % 128;
            int i6 = i5 % 2;
            return maybe;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
            super(1);
            this.f10364e = cVar;
            this.f10362a = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaybeSource j(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10328j + 49;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        MaybeSource maybeSource = (MaybeSource) function1.invoke(obj);
        int i5 = f10328j + 91;
        f10327h = i5 % 128;
        if (i5 % 2 != 0) {
            return maybeSource;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class m extends Lambda implements Function1<Throwable, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10412a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f10413b = new m();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10414c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10415d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10416e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f10414c + 19;
            f10415d = i3 % 128;
            Throwable th2 = th;
            if (i3 % 2 != 0) {
                return a(th2);
            }
            a(th2);
            throw null;
        }

        private static Boolean a(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            boolean z2 = true;
            if (!ThrowableExtensionsKt.isBadRequestError(th)) {
                int i3 = f10415d + 89;
                f10414c = i3 % 128;
                int i4 = i3 % 2;
                if (!(th instanceof MissingFileException)) {
                    z2 = false;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i5 = f10415d + 47;
            f10414c = i5 % 128;
            if (i5 % 2 == 0) {
                return boolValueOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f10416e + 105;
            f10412a = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 0 / 0;
            }
        }

        m() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 53;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i5 = f10328j + 99;
        f10327h = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static Completable c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<? extends Object> eVar) {
        int i2 = 2 % 2;
        int i3 = f10327h + 21;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Completable completableB = eVar.b();
        final m mVar = m.f10413b;
        Completable completableOnErrorComplete = completableB.onErrorComplete(new Predicate() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return i.h(mVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorComplete, "");
        int i5 = f10327h + 55;
        f10328j = i5 % 128;
        int i6 = i5 % 2;
        return completableOnErrorComplete;
    }

    public static final class j implements OnboardingSessionListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10379d = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f10380i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ n f10381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> f10382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ SingleEmitter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> f10383c;

        j(n nVar, SingleEmitter<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> singleEmitter, Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> pair) {
            this.f10381a = nVar;
            this.f10383c = singleEmitter;
            this.f10382b = pair;
        }

        @Override // com.incode.welcome_sdk.listeners.OnboardingSessionListener
        public final void onOnboardingSessionCreated(String str, String str2, String str3) {
            int i2 = 2 % 2;
            Timber.Forest.d("Onboarding session created", new Object[0]);
            if (str2 != null) {
                int i3 = f10379d + 83;
                f10380i = i3 % 128;
                if (i3 % 2 != 0) {
                    i.a(i.this).a(str2, this.f10381a);
                } else {
                    i.a(i.this).a(str2, this.f10381a);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            this.f10383c.onSuccess(this.f10382b.getFirst().a());
            int i4 = f10379d + 105;
            f10380i = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
        }

        @Override // com.incode.welcome_sdk.listeners.ErrorListener
        public final void onError(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f10379d + 81;
            f10380i = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Timber.Forest.e(th, "An error occurred while creation on boarding session", new Object[0]);
            this.f10383c.onError(th);
            int i5 = f10379d + 39;
            f10380i = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // com.incode.welcome_sdk.listeners.UserCancelledListener
        public final void onUserCancelled() {
            int i2 = 2 % 2;
            this.f10383c.onError(new IllegalStateException("onUserCancelled probably called by mistake."));
            int i3 = f10379d + 63;
            f10380i = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pair pair, i iVar, SingleEmitter singleEmitter) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(iVar, "");
        Intrinsics.checkNotNullParameter(singleEmitter, "");
        Timber.Forest.d("Setting up onboarding session", new Object[0]);
        n nVarD = ((com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c) pair.getSecond()).d();
        iVar.f10331c.internalSetupOnboardingSession$onboard_release(a(nVarD), iVar.new j(nVarD, singleEmitter, pair));
        int i3 = f10328j + 99;
        f10327h = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final Single<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> d(final Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c> pair) {
        int i2 = 2 % 2;
        int i3 = f10327h + 61;
        f10328j = i3 % 128;
        int i4 = i3 % 2;
        Single<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda6
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                i.a(pair, this, singleEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "");
        int i5 = f10328j + 81;
        f10327h = i5 % 128;
        int i6 = i5 % 2;
        return singleCreate;
    }

    private static SessionConfig a(n nVar) {
        int i2 = 2 % 2;
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.setInterviewId$onboard_release(nVar.c());
        builder.setConfigurationId$onboard_release(nVar.e());
        builder.setValidationModuleList$onboard_release(nVar.a());
        builder.setQueueName$onboard_release(nVar.h());
        builder.setExternalId$onboard_release(nVar.g());
        int iB = DaggerVideoSelfieComponent.b.b();
        int iB2 = DaggerVideoSelfieComponent.b.b();
        int iB3 = DaggerVideoSelfieComponent.b.b();
        builder.setExternalCustomerId$onboard_release((String) n.b(-1522893158, iB2, DaggerVideoSelfieComponent.b.b(), iB, iB3, 1522893158, new Object[]{nVar}));
        builder.setExternalToken$onboard_release(nVar.f());
        SessionConfig sessionConfigBuild = builder.build();
        int i3 = f10327h + 109;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            return sessionConfigBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function1<an, CompletableSource> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10345d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10346e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.d f10347a;

        private CompletableSource d(an anVar) {
            int i2 = 2 % 2;
            int i3 = f10346e + 77;
            f10345d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(anVar, "");
                return i.b(i.this).c(this.f10347a);
            }
            Intrinsics.checkNotNullParameter(anVar, "");
            i.b(i.this).c(this.f10347a);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(an anVar) {
            int i2 = 2 % 2;
            int i3 = f10346e + 47;
            f10345d = i3 % 128;
            an anVar2 = anVar;
            if (i3 % 2 == 0) {
                d(anVar2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CompletableSource completableSourceD = d(anVar2);
            int i4 = f10346e + 65;
            f10345d = i4 % 128;
            int i5 = i4 % 2;
            return completableSourceD;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
            super(1);
            this.f10347a = dVar;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i2 = 2 % 2;
        int i3 = f10327h + 33;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (CompletableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    private final Completable d(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int i2 = 2 % 2;
        Single<an> singleFirstOrError = this.f10332d.finishOnboarding().firstOrError();
        final c cVar = new c(dVar);
        Completable completableFlatMapCompletable = singleFirstOrError.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return i.i(cVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "");
        int i3 = f10328j + 47;
        f10327h = i3 % 128;
        int i4 = i3 % 2;
        return completableFlatMapCompletable;
    }

    static final class f extends Lambda implements Function1<List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>, Pair<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10357a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10358c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ int f10359b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(List<? extends com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
            int i2 = 2 % 2;
            int i3 = f10357a + 17;
            f10358c = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, Integer> pairD = d(list);
            int i5 = f10357a + 125;
            f10358c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 42 / 0;
            }
            return pairD;
        }

        private Pair<Integer, Integer> d(List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d> list) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(this.f10359b - size), Integer.valueOf(size));
            int i3 = f10358c + 41;
            f10357a = i3 % 128;
            if (i3 % 2 != 0) {
                return pair;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(1);
            this.f10359b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair k(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10327h + 117;
        f10328j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (Pair) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        int i4 = 27 / 0;
        return (Pair) function1.invoke(obj);
    }

    private final Single<Pair<Integer, Integer>> d(int i2) {
        int i3 = 2 % 2;
        Single<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.d>> singleA = a();
        final f fVar = new f(i2);
        Single map = singleA.map(new Function() { // from class: com.incode.welcome_sdk.i$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return i.k(fVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        int i4 = f10328j + 75;
        f10327h = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public static final /* synthetic */ Maybe d(i iVar, com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
        Object[] objArr = {iVar, cVar, jVar, bVar};
        return (Maybe) c(-805352012, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), 805352013, EKYBActivity.e.e(), objArr);
    }

    public static final /* synthetic */ com.incode.welcome_sdk.data.local.a.e b(i iVar) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        return (com.incode.welcome_sdk.data.local.a.e) c(761267352, EKYBActivity.e.e(), iE, iE2, -761267349, iE3, new Object[]{iVar});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompletableSource i(Function1 function1, Object obj) {
        Object[] objArr = {function1, obj};
        return (CompletableSource) c(412466431, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -412466427, EKYBActivity.e.e(), objArr);
    }

    private final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.e> c(com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j jVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.e.b bVar) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        return (Maybe) c(269922230, EKYBActivity.e.e(), iE, iE2, -269922225, iE3, new Object[]{this, cVar, jVar, bVar});
    }

    private final Maybe<com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.b> e(com.incode.welcome_sdk.commons.components.c cVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.a aVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.c.a aVar2) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        return (Maybe) c(552706945, EKYBActivity.e.e(), iE, iE2, -552706945, iE3, new Object[]{this, cVar, aVar, aVar2});
    }

    private final Maybe<List<com.incode.welcome_sdk.data.local.model.delayed_onboarding.j>> b(long j2) {
        Object[] objArr = {this, Long.valueOf(j2)};
        return (Maybe) c(1174785089, EKYBActivity.e.e(), EKYBActivity.e.e(), EKYBActivity.e.e(), -1174785087, EKYBActivity.e.e(), objArr);
    }

    private final Maybe<Pair<com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.e, com.incode.welcome_sdk.data.local.model.delayed_onboarding.h.c>> e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.d dVar) {
        int iE = EKYBActivity.e.e();
        int iE2 = EKYBActivity.e.e();
        int iE3 = EKYBActivity.e.e();
        return (Maybe) c(-1816955755, EKYBActivity.e.e(), iE, iE2, 1816955761, iE3, new Object[]{this, dVar});
    }
}
