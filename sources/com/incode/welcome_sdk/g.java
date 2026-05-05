package com.incode.welcome_sdk;

import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.ScaleDrawer;
import com.incode.welcome_sdk.commons.utils.n;
import com.incode.welcome_sdk.data.FaceLoginAttemptSyncErrorWrapper;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.g;
import com.incode.welcome_sdk.listeners.SyncFaceLoginAttemptsListener;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.geolocation.GeolocationActivity_MembersInjector;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c */
    private static int f10250c = 1;

    /* JADX INFO: renamed from: e */
    private static int f10251e = 0;

    /* JADX INFO: renamed from: b */
    private final IncodeWelcomeRepository f10252b;

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = ~(i8 | i9);
        int i11 = (~((~i3) | i8)) | i10;
        int i12 = (~(i3 | i8)) | i10;
        int i13 = ~(i9 | i6);
        int i14 = i6 + i2 + i4 + (104229478 * i5) + ((-1414784667) * i7);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-393484327)) - 513802240) + ((-393484327) * i2) + (i11 * 23337000) + (i12 * 23337000) + (23337000 * i13) + ((-370147328) * i4) + ((-1784676352) * i5) + ((-1146093568) * i7) + ((-1043988480) * i15);
        int i17 = ((i6 * 256725217) - 1927268364) + (i2 * 256725217) + (i11 * 872) + (i12 * 872) + (i13 * 872) + (i4 * 256726089) + (i5 * (-1692676330)) + (i7 * (-87465523)) + (i15 * 964034560);
        int i18 = i16 + (i17 * i17 * (-1055260672));
        if (i18 != 1) {
            return i18 != 2 ? a(objArr) : d(objArr);
        }
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener = (SyncFaceLoginAttemptsListener) objArr[2];
        int i19 = 2 % 2;
        int i20 = f10251e + 17;
        f10250c = i20 % 128;
        int i21 = i20 % 2;
        syncFaceLoginAttemptsListener.onSyncProgressUpdate((iIntValue * 100) / iIntValue2);
        int i22 = f10250c + 69;
        f10251e = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    public g(IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f10252b = incodeWelcomeRepository;
    }

    public static final /* synthetic */ Completable a(g gVar, a aVar, com.incode.welcome_sdk.data.local.d dVar) {
        Completable completable;
        int i2 = 2 % 2;
        int i3 = f10250c + 79;
        f10251e = i3 % 128;
        if (i3 % 2 != 0) {
            completable = (Completable) a(1631687706, ScaleDrawer.b(), ScaleDrawer.b(), new Object[]{gVar, aVar, dVar}, ScaleDrawer.b(), -1631687704, ScaleDrawer.b());
            int i4 = 87 / 0;
        } else {
            completable = (Completable) a(1631687706, ScaleDrawer.b(), ScaleDrawer.b(), new Object[]{gVar, aVar, dVar}, ScaleDrawer.b(), -1631687704, ScaleDrawer.b());
        }
        int i5 = f10250c + 19;
        f10251e = i5 % 128;
        int i6 = i5 % 2;
        return completable;
    }

    public static final /* synthetic */ Single a(g gVar, com.incode.welcome_sdk.data.local.d dVar) {
        int i2 = 2 % 2;
        int i3 = f10251e + 75;
        f10250c = i3 % 128;
        if (i3 % 2 != 0) {
            return gVar.e(dVar);
        }
        gVar.e(dVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void b(int i2, int i3, SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
        int i4 = 2 % 2;
        int i5 = f10251e + 13;
        f10250c = i5 % 128;
        int i6 = i5 % 2;
        a(-428187685, ScaleDrawer.b(), ScaleDrawer.b(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), syncFaceLoginAttemptsListener}, ScaleDrawer.b(), 428187686, ScaleDrawer.b());
        int i7 = f10250c + 63;
        f10251e = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Single c(g gVar, List list) {
        int i2 = 2 % 2;
        int i3 = f10251e + 89;
        f10250c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            gVar.b(list);
            throw null;
        }
        Single<Triple<Integer, Integer, Integer>> singleB = gVar.b(list);
        int i4 = f10251e + 47;
        f10250c = i4 % 128;
        if (i4 % 2 != 0) {
            return singleB;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Single c(g gVar, List list, List list2) {
        int i2 = 2 % 2;
        int i3 = f10250c + 65;
        f10251e = i3 % 128;
        int i4 = i3 % 2;
        Single<List<com.incode.welcome_sdk.data.local.d>> singleC = gVar.c((List<? extends com.incode.welcome_sdk.data.local.h>) list, (List<Long>) list2);
        int i5 = f10251e + 47;
        f10250c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return singleC;
    }

    private final Single<List<com.incode.welcome_sdk.data.local.d>> d() {
        int i2 = 2 % 2;
        int i3 = f10250c + 75;
        f10251e = i3 % 128;
        int i4 = i3 % 2;
        Single<List<com.incode.welcome_sdk.data.local.d>> faceLoginAttemptsByStatus = this.f10252b.getFaceLoginAttemptsByStatus(CollectionsKt.listOf((Object[]) new com.incode.welcome_sdk.data.local.h[]{com.incode.welcome_sdk.data.local.h.f8588b, com.incode.welcome_sdk.data.local.h.f8590d}));
        Intrinsics.checkNotNullExpressionValue(faceLoginAttemptsByStatus, "");
        int i5 = f10251e + 97;
        f10250c = i5 % 128;
        int i6 = i5 % 2;
        return faceLoginAttemptsByStatus;
    }

    private final Single<List<com.incode.welcome_sdk.data.local.d>> c(List<? extends com.incode.welcome_sdk.data.local.h> list, List<Long> list2) {
        int i2 = 2 % 2;
        int i3 = f10251e + 5;
        f10250c = i3 % 128;
        int i4 = i3 % 2;
        Single<List<com.incode.welcome_sdk.data.local.d>> faceLoginAttemptsByStatusFromCurrentSyncSession = this.f10252b.getFaceLoginAttemptsByStatusFromCurrentSyncSession(list, list2);
        int i5 = f10251e + 41;
        f10250c = i5 % 128;
        int i6 = i5 % 2;
        return faceLoginAttemptsByStatusFromCurrentSyncSession;
    }

    static final class d extends Lambda implements Function1<List<com.incode.welcome_sdk.data.local.d>, SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>>> {

        /* JADX INFO: renamed from: a */
        private static int f10267a = 0;

        /* JADX INFO: renamed from: c */
        private static int f10268c = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ SyncFaceLoginAttemptsListener f10269b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>> invoke(List<com.incode.welcome_sdk.data.local.d> list) {
            int i2 = 2 % 2;
            int i3 = f10268c + 75;
            f10267a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends Triple<Integer, Integer, Integer>> singleSourceD = d(list);
            int i5 = f10268c + 77;
            f10267a = i5 % 128;
            if (i5 % 2 == 0) {
                return singleSourceD;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.g$d$2 */
        static final class AnonymousClass2 extends Lambda implements Function1<Disposable, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f10276a = 1;

            /* JADX INFO: renamed from: b */
            private static int f10277b = 1;

            /* JADX INFO: renamed from: c */
            private static int f10278c = 0;

            /* JADX INFO: renamed from: d */
            public static final AnonymousClass2 f10279d = ;

            /* JADX INFO: renamed from: e */
            private static int f10280e = 0;

            private static void b() {
                int i2 = 2 % 2;
                int i3 = f10278c + 55;
                f10277b = i3 % 128;
                if (i3 % 2 == 0) {
                    Timber.Forest.d("Local face attempts sync started.", new Object[0]);
                } else {
                    Timber.Forest.d("Local face attempts sync started.", new Object[0]);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Disposable disposable) {
                int i2 = 2 % 2;
                int i3 = f10277b + 43;
                f10278c = i3 % 128;
                int i4 = i3 % 2;
                b();
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    return unit;
                }
                throw null;
            }

            static {
                int i2 = f10280e + 65;
                f10276a = i2 % 128;
                int i3 = i2 % 2;
            }

            AnonymousClass2() {
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.g$d$1 */
        static final class AnonymousClass1 extends Lambda implements Function2<com.incode.welcome_sdk.data.local.d, Integer, Pair<? extends com.incode.welcome_sdk.data.local.d, ? extends Integer>> {

            /* JADX INFO: renamed from: a */
            private static int f10271a = 1;

            /* JADX INFO: renamed from: b */
            private static int f10272b = 0;

            /* JADX INFO: renamed from: c */
            private static int f10273c = 0;

            /* JADX INFO: renamed from: d */
            public static final AnonymousClass1 f10274d = ;

            /* JADX INFO: renamed from: e */
            private static int f10275e = 1;

            private static Pair<com.incode.welcome_sdk.data.local.d, Integer> a(com.incode.welcome_sdk.data.local.d dVar, Integer num) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(dVar, "");
                Intrinsics.checkNotNullParameter(num, "");
                Pair<com.incode.welcome_sdk.data.local.d, Integer> pair = new Pair<>(dVar, num);
                int i3 = f10271a + 67;
                f10273c = i3 % 128;
                if (i3 % 2 == 0) {
                    return pair;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Pair<? extends com.incode.welcome_sdk.data.local.d, ? extends Integer> invoke(com.incode.welcome_sdk.data.local.d dVar, Integer num) {
                int i2 = 2 % 2;
                int i3 = f10273c + 109;
                f10271a = i3 % 128;
                com.incode.welcome_sdk.data.local.d dVar2 = dVar;
                Integer num2 = num;
                if (i3 % 2 != 0) {
                    return a(dVar2, num2);
                }
                a(dVar2, num2);
                throw null;
            }

            static {
                int i2 = f10272b + 3;
                f10275e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 30 / 0;
                }
            }

            AnonymousClass1() {
            }
        }

        public static final void a(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f10268c + 17;
            f10267a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
            } else {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke(obj);
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.g$d$5 */
        static final class AnonymousClass5 extends Lambda implements Function1<Pair<? extends com.incode.welcome_sdk.data.local.d, ? extends Integer>, CompletableSource> {

            /* JADX INFO: renamed from: c */
            private static int f10288c = 1;

            /* JADX INFO: renamed from: d */
            private static int f10289d = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ SyncFaceLoginAttemptsListener f10290a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ g f10291b;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ int f10292e;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CompletableSource invoke(Pair<? extends com.incode.welcome_sdk.data.local.d, ? extends Integer> pair) {
                int i2 = 2 % 2;
                int i3 = f10289d + 17;
                f10288c = i3 % 128;
                Pair<? extends com.incode.welcome_sdk.data.local.d, ? extends Integer> pair2 = pair;
                if (i3 % 2 != 0) {
                    return e(pair2);
                }
                e(pair2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.g$d$5$3 */
            static final class AnonymousClass3 extends Lambda implements Function1<a, CompletableSource> {

                /* JADX INFO: renamed from: d */
                private static int f10293d = 1;

                /* JADX INFO: renamed from: e */
                private static int f10294e = 0;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ com.incode.welcome_sdk.data.local.d f10295a;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ CompletableSource invoke(a aVar) {
                    int i2 = 2 % 2;
                    int i3 = f10293d + 123;
                    f10294e = i3 % 128;
                    a aVar2 = aVar;
                    if (i3 % 2 == 0) {
                        return e(aVar2);
                    }
                    e(aVar2);
                    throw null;
                }

                private CompletableSource e(a aVar) {
                    int i2 = 2 % 2;
                    int i3 = f10294e + 125;
                    f10293d = i3 % 128;
                    if (i3 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(aVar, "");
                        g gVar = gVar;
                        com.incode.welcome_sdk.data.local.d dVar = dVar;
                        Intrinsics.checkNotNullExpressionValue(dVar, "");
                        return g.a(gVar, aVar, dVar);
                    }
                    Intrinsics.checkNotNullParameter(aVar, "");
                    g gVar2 = gVar;
                    com.incode.welcome_sdk.data.local.d dVar2 = dVar;
                    Intrinsics.checkNotNullExpressionValue(dVar2, "");
                    g.a(gVar2, aVar, dVar2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(com.incode.welcome_sdk.data.local.d dVar) {
                    super(1);
                    dVar = dVar;
                }
            }

            public static final CompletableSource e(Function1 function1, Object obj) {
                int i2 = 2 % 2;
                int i3 = f10289d + 79;
                f10288c = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(function1, "");
                    Intrinsics.checkNotNullParameter(obj, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
                int i4 = f10288c + 43;
                f10289d = i4 % 128;
                if (i4 % 2 == 0) {
                    return completableSource;
                }
                obj2.hashCode();
                throw null;
            }

            public static final void a(g gVar, Integer num, int i2, SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
                int i3 = 2 % 2;
                int i4 = f10288c + 87;
                f10289d = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(gVar, "");
                    Intrinsics.checkNotNullParameter(num, "");
                    Intrinsics.checkNotNullParameter(syncFaceLoginAttemptsListener, "");
                    g.b(num.intValue(), i2, syncFaceLoginAttemptsListener);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(gVar, "");
                Intrinsics.checkNotNullParameter(num, "");
                Intrinsics.checkNotNullParameter(syncFaceLoginAttemptsListener, "");
                g.b(num.intValue(), i2, syncFaceLoginAttemptsListener);
                int i5 = f10288c + 57;
                f10289d = i5 % 128;
                int i6 = i5 % 2;
            }

            private CompletableSource e(Pair<com.incode.welcome_sdk.data.local.d, Integer> pair) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(pair, "");
                com.incode.welcome_sdk.data.local.d dVarComponent1 = pair.component1();
                final Integer numComponent2 = pair.component2();
                g gVar = this.f10291b;
                Intrinsics.checkNotNull(dVarComponent1);
                Single singleA = g.a(gVar, dVarComponent1);
                final AnonymousClass3 anonymousClass3 = new Function1<a, CompletableSource>() { // from class: com.incode.welcome_sdk.g.d.5.3

                    /* JADX INFO: renamed from: d */
                    private static int f10293d = 1;

                    /* JADX INFO: renamed from: e */
                    private static int f10294e = 0;

                    /* JADX INFO: renamed from: a */
                    private /* synthetic */ com.incode.welcome_sdk.data.local.d f10295a;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ CompletableSource invoke(a aVar) {
                        int i22 = 2 % 2;
                        int i3 = f10293d + 123;
                        f10294e = i3 % 128;
                        a aVar2 = aVar;
                        if (i3 % 2 == 0) {
                            return e(aVar2);
                        }
                        e(aVar2);
                        throw null;
                    }

                    private CompletableSource e(a aVar) {
                        int i22 = 2 % 2;
                        int i3 = f10294e + 125;
                        f10293d = i3 % 128;
                        if (i3 % 2 != 0) {
                            Intrinsics.checkNotNullParameter(aVar, "");
                            g gVar2 = gVar;
                            com.incode.welcome_sdk.data.local.d dVar = dVar;
                            Intrinsics.checkNotNullExpressionValue(dVar, "");
                            return g.a(gVar2, aVar, dVar);
                        }
                        Intrinsics.checkNotNullParameter(aVar, "");
                        g gVar22 = gVar;
                        com.incode.welcome_sdk.data.local.d dVar2 = dVar;
                        Intrinsics.checkNotNullExpressionValue(dVar2, "");
                        g.a(gVar22, aVar, dVar2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(com.incode.welcome_sdk.data.local.d dVarComponent12) {
                        super(1);
                        dVar = dVarComponent12;
                    }
                };
                Completable completableObserveOn = singleA.flatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.g$d$5$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return g.d.AnonymousClass5.e(anonymousClass3, obj);
                    }
                }).observeOn(AndroidSchedulers.mainThread());
                final g gVar2 = this.f10291b;
                final int i3 = this.f10292e;
                final SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener = this.f10290a;
                Completable completableObserveOn2 = completableObserveOn.doOnComplete(new Action() { // from class: com.incode.welcome_sdk.g$d$5$$ExternalSyntheticLambda1
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        g.d.AnonymousClass5.a(gVar2, numComponent2, i3, syncFaceLoginAttemptsListener);
                    }
                }).observeOn(Schedulers.io());
                int i4 = f10289d + 77;
                f10288c = i4 % 128;
                if (i4 % 2 != 0) {
                    return completableObserveOn2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(g gVar, int i2, SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
                super(1);
                this.f10291b = gVar;
                this.f10292e = i2;
                this.f10290a = syncFaceLoginAttemptsListener;
            }
        }

        public static final Pair e(Function2 function2, Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = f10267a + 55;
            f10268c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function2, "");
                Intrinsics.checkNotNullParameter(obj, "");
                Intrinsics.checkNotNullParameter(obj2, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(function2, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            Pair pair = (Pair) function2.invoke(obj, obj2);
            int i4 = f10268c + 65;
            f10267a = i4 % 128;
            int i5 = i4 % 2;
            return pair;
        }

        public static final CompletableSource c(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f10267a + 95;
            f10268c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            CompletableSource completableSource = (CompletableSource) function1.invoke(obj);
            int i5 = f10268c + 103;
            f10267a = i5 % 128;
            if (i5 % 2 == 0) {
                return completableSource;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.g$d$4 */
        static final class AnonymousClass4 extends Lambda implements Function1<Throwable, SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>>> {

            /* JADX INFO: renamed from: b */
            private static int f10281b = 0;

            /* JADX INFO: renamed from: e */
            private static int f10282e = 1;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ g f10283a;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ List<Long> f10284d;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>> invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f10281b + 83;
                f10282e = i3 % 128;
                int i4 = i3 % 2;
                SingleSource<? extends Triple<Integer, Integer, Integer>> singleSourceD = d(th);
                int i5 = f10282e + 99;
                f10281b = i5 % 128;
                if (i5 % 2 == 0) {
                    return singleSourceD;
                }
                throw null;
            }

            /* JADX INFO: renamed from: com.incode.welcome_sdk.g$d$4$1 */
            static final class AnonymousClass1 extends Lambda implements Function1<List<com.incode.welcome_sdk.data.local.d>, SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>>> {

                /* JADX INFO: renamed from: a */
                private static int f10285a = 1;

                /* JADX INFO: renamed from: b */
                private static int f10286b = 0;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ Throwable f10287d;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>> invoke(List<com.incode.welcome_sdk.data.local.d> list) {
                    int i2 = 2 % 2;
                    int i3 = f10285a + 39;
                    f10286b = i3 % 128;
                    int i4 = i3 % 2;
                    SingleSource<? extends Triple<Integer, Integer, Integer>> singleSourceB = b(list);
                    int i5 = f10286b + 57;
                    f10285a = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 55 / 0;
                    }
                    return singleSourceB;
                }

                private SingleSource<? extends Triple<Integer, Integer, Integer>> b(List<com.incode.welcome_sdk.data.local.d> list) {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(list, "");
                    Throwable th = th;
                    Intrinsics.checkNotNullExpressionValue(th, "");
                    Single singleError = Single.error(new FaceLoginAttemptSyncErrorWrapper(th, list.size()));
                    int i3 = f10286b + 45;
                    f10285a = i3 % 128;
                    if (i3 % 2 != 0) {
                        return singleError;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Throwable th) {
                    super(1);
                    th = th;
                }
            }

            public static final SingleSource a(Function1 function1, Object obj) {
                SingleSource singleSource;
                int i2 = 2 % 2;
                int i3 = f10282e + 91;
                f10281b = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(function1, "");
                    Intrinsics.checkNotNullParameter(obj, "");
                    singleSource = (SingleSource) function1.invoke(obj);
                    int i4 = 2 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(function1, "");
                    Intrinsics.checkNotNullParameter(obj, "");
                    singleSource = (SingleSource) function1.invoke(obj);
                }
                int i5 = f10281b + 125;
                f10282e = i5 % 128;
                int i6 = i5 % 2;
                return singleSource;
            }

            private SingleSource<? extends Triple<Integer, Integer, Integer>> d(Throwable th) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                Single singleC = g.c(this.f10283a, CollectionsKt.listOf((Object[]) new com.incode.welcome_sdk.data.local.h[]{com.incode.welcome_sdk.data.local.h.f8588b, com.incode.welcome_sdk.data.local.h.f8591e, com.incode.welcome_sdk.data.local.h.f8590d}), this.f10284d);
                final AnonymousClass1 anonymousClass1 = new Function1<List<com.incode.welcome_sdk.data.local.d>, SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>>>() { // from class: com.incode.welcome_sdk.g.d.4.1

                    /* JADX INFO: renamed from: a */
                    private static int f10285a = 1;

                    /* JADX INFO: renamed from: b */
                    private static int f10286b = 0;

                    /* JADX INFO: renamed from: d */
                    private /* synthetic */ Throwable f10287d;

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ SingleSource<? extends Triple<? extends Integer, ? extends Integer, ? extends Integer>> invoke(List<com.incode.welcome_sdk.data.local.d> list) {
                        int i22 = 2 % 2;
                        int i3 = f10285a + 39;
                        f10286b = i3 % 128;
                        int i4 = i3 % 2;
                        SingleSource<? extends Triple<Integer, Integer, Integer>> singleSourceB = b(list);
                        int i5 = f10286b + 57;
                        f10285a = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 55 / 0;
                        }
                        return singleSourceB;
                    }

                    private SingleSource<? extends Triple<Integer, Integer, Integer>> b(List<com.incode.welcome_sdk.data.local.d> list) {
                        int i22 = 2 % 2;
                        Intrinsics.checkNotNullParameter(list, "");
                        Throwable th2 = th;
                        Intrinsics.checkNotNullExpressionValue(th2, "");
                        Single singleError = Single.error(new FaceLoginAttemptSyncErrorWrapper(th2, list.size()));
                        int i3 = f10286b + 45;
                        f10285a = i3 % 128;
                        if (i3 % 2 != 0) {
                            return singleError;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Throwable th2) {
                        super(1);
                        th = th2;
                    }
                };
                Single singleFlatMap = singleC.flatMap(new Function() { // from class: com.incode.welcome_sdk.g$d$4$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return g.d.AnonymousClass4.a(anonymousClass1, obj);
                    }
                });
                int i3 = f10282e + 21;
                f10281b = i3 % 128;
                if (i3 % 2 == 0) {
                    return singleFlatMap;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(g gVar, List<Long> list) {
                super(1);
                this.f10283a = gVar;
                this.f10284d = list;
            }
        }

        public static final void b() {
            int i2 = 2 % 2;
            int i3 = f10268c + 61;
            f10267a = i3 % 128;
            if (i3 % 2 != 0) {
                Timber.Forest.d("Local face attempts sync finished.", new Object[0]);
            } else {
                Timber.Forest.d("Local face attempts sync finished.", new Object[0]);
            }
            int i4 = f10267a + 45;
            f10268c = i4 % 128;
            int i5 = i4 % 2;
        }

        public static final SingleSource b(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f10268c + 55;
            f10267a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            SingleSource singleSource = (SingleSource) function1.invoke(obj);
            int i5 = f10267a + 59;
            f10268c = i5 % 128;
            int i6 = i5 % 2;
            return singleSource;
        }

        private SingleSource<? extends Triple<Integer, Integer, Integer>> d(List<com.incode.welcome_sdk.data.local.d> list) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            List<com.incode.welcome_sdk.data.local.d> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            int i3 = f10268c + 27;
            f10267a = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                int i5 = f10267a + 97;
                f10268c = i5 % 128;
                if (i5 % 2 == 0) {
                    arrayList.add(Long.valueOf(((com.incode.welcome_sdk.data.local.d) it.next()).b()));
                    int i6 = 60 / 0;
                } else {
                    arrayList.add(Long.valueOf(((com.incode.welcome_sdk.data.local.d) it.next()).b()));
                }
            }
            ArrayList arrayList2 = arrayList;
            Observable observableFromIterable = Observable.fromIterable(list2);
            final AnonymousClass2 anonymousClass2 = AnonymousClass2.f10279d;
            Observable observableDoOnSubscribe = observableFromIterable.doOnSubscribe(new Consumer() { // from class: com.incode.welcome_sdk.g$d$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    g.d.a(anonymousClass2, obj);
                }
            });
            Observable<Integer> observableRange = Observable.range(1, size);
            final AnonymousClass1 anonymousClass1 = AnonymousClass1.f10274d;
            Observable observableZipWith = observableDoOnSubscribe.zipWith(observableRange, new BiFunction() { // from class: com.incode.welcome_sdk.g$d$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return g.d.e(anonymousClass1, obj, obj2);
                }
            });
            final AnonymousClass5 anonymousClass5 = new AnonymousClass5(g.this, size, this.f10269b);
            Single singleDoFinally = observableZipWith.concatMapCompletable(new Function() { // from class: com.incode.welcome_sdk.g$d$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return g.d.c(anonymousClass5, obj);
                }
            }).andThen(g.c(g.this, arrayList2)).doFinally(new Action() { // from class: com.incode.welcome_sdk.g$d$$ExternalSyntheticLambda3
                @Override // io.reactivex.functions.Action
                public final void run() {
                    g.d.b();
                }
            });
            final AnonymousClass4 anonymousClass4 = new AnonymousClass4(g.this, arrayList2);
            return singleDoFinally.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.g$d$$ExternalSyntheticLambda4
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return g.d.b(anonymousClass4, obj);
                }
            });
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
            super(1);
            this.f10269b = syncFaceLoginAttemptsListener;
        }
    }

    public static final SingleSource d(g gVar, SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(gVar, "");
        Intrinsics.checkNotNullParameter(syncFaceLoginAttemptsListener, "");
        Single<List<com.incode.welcome_sdk.data.local.d>> singleD = gVar.d();
        final d dVar = gVar.new d(syncFaceLoginAttemptsListener);
        SingleSource singleSourceFlatMap = singleD.flatMap(new Function() { // from class: com.incode.welcome_sdk.g$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return g.d(dVar, obj);
            }
        });
        int i3 = f10251e + 89;
        f10250c = i3 % 128;
        if (i3 % 2 != 0) {
            return singleSourceFlatMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final SingleSource d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10250c + 61;
        f10251e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f10250c + 23;
        f10251e = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        final g gVar = (g) objArr[0];
        final SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener = (SyncFaceLoginAttemptsListener) objArr[1];
        int i2 = 2 % 2;
        int i3 = f10251e + 45;
        f10250c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(syncFaceLoginAttemptsListener, "");
        Single singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.g$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.d(this.f$0, syncFaceLoginAttemptsListener);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDefer, "");
        int i5 = f10251e + 121;
        f10250c = i5 % 128;
        if (i5 % 2 != 0) {
            return singleDefer;
        }
        throw null;
    }

    static final class b extends Lambda implements Function1<ResponseSuccess, SingleSource<? extends a>> {

        /* JADX INFO: renamed from: a */
        private static int f10257a = 0;

        /* JADX INFO: renamed from: b */
        private static int f10258b = 1;

        /* JADX INFO: renamed from: c */
        private static int f10259c = 1;

        /* JADX INFO: renamed from: d */
        public static final b f10260d = new b();

        /* JADX INFO: renamed from: e */
        private static int f10261e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends a> invoke(ResponseSuccess responseSuccess) {
            int i2 = 2 % 2;
            int i3 = f10261e + 109;
            f10259c = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends a> singleSourceD = d(responseSuccess);
            int i5 = f10261e + 65;
            f10259c = i5 % 128;
            int i6 = i5 % 2;
            return singleSourceD;
        }

        private static SingleSource<? extends a> d(ResponseSuccess responseSuccess) {
            Single singleJust;
            int i2 = 2 % 2;
            int i3 = f10259c + 77;
            f10261e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseSuccess, "");
            if (responseSuccess.isSuccess()) {
                singleJust = Single.just(new a(ResultCode.SUCCESS, null));
            } else {
                singleJust = Single.just(new a(ResultCode.ERROR, new IncodeGenericError("Exception occurred while sending liveness stat.")));
                int i5 = f10261e + 33;
                f10259c = i5 % 128;
                int i6 = i5 % 2;
            }
            return singleJust;
        }

        static {
            int i2 = f10258b + 47;
            f10257a = i2 % 128;
            int i3 = i2 % 2;
        }

        b() {
            super(1);
        }
    }

    public static final SingleSource e(Function1 function1, Object obj) {
        SingleSource singleSource;
        int i2 = 2 % 2;
        int i3 = f10251e + 85;
        f10250c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            singleSource = (SingleSource) function1.invoke(obj);
            int i4 = 86 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            singleSource = (SingleSource) function1.invoke(obj);
        }
        int i5 = f10250c + 17;
        f10251e = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    static final class c extends Lambda implements Function1<Throwable, SingleSource<? extends a>> {

        /* JADX INFO: renamed from: a */
        public static final c f10262a = new c();

        /* JADX INFO: renamed from: b */
        private static int f10263b = 0;

        /* JADX INFO: renamed from: c */
        private static int f10264c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10265d = 0;

        /* JADX INFO: renamed from: e */
        private static int f10266e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends a> invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f10264c + 7;
            f10265d = i3 % 128;
            Throwable th2 = th;
            if (i3 % 2 != 0) {
                a(th2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SingleSource<? extends a> singleSourceA = a(th2);
            int i4 = f10265d + 59;
            f10264c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return singleSourceA;
        }

        private static SingleSource<? extends a> a(Throwable th) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            Single singleJust = Single.just(new a(ResultCode.ERROR, th));
            int i3 = f10265d + 1;
            f10264c = i3 % 128;
            int i4 = i3 % 2;
            return singleJust;
        }

        static {
            int i2 = f10266e + 73;
            f10263b = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(1);
        }
    }

    public static final SingleSource b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10250c + 109;
        f10251e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f10250c + 15;
        f10251e = i5 % 128;
        if (i5 % 2 == 0) {
            return singleSource;
        }
        throw null;
    }

    private final Single<a> e(com.incode.welcome_sdk.data.local.d dVar) {
        int i2 = 2 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f10252b;
        String strC = dVar.c();
        Map map = (Map) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -581205358, 581205359, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a());
        com.incode.welcome_sdk.data.remote.a aVar = new com.incode.welcome_sdk.data.remote.a(((Integer) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -1333266828, 1333266828, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).intValue(), dVar.d());
        float f2 = dVar.f();
        float fG = dVar.g();
        float fH = dVar.h();
        float fI = dVar.i();
        float fFloatValue = ((Float) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, -608352159, 608352162, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue();
        float fFloatValue2 = ((Float) com.incode.welcome_sdk.data.local.d.d(new Object[]{dVar}, 938647139, -938647137, GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a(), GeolocationActivity_MembersInjector.a())).floatValue();
        String strK = dVar.k();
        String strM = dVar.m();
        String lowerCase = dVar.n().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        Single<ResponseSuccess> singleInsertLivenessStat = incodeWelcomeRepository.insertLivenessStat(new com.incode.welcome_sdk.data.remote.f(strC, map, aVar, f2, fG, fH, fI, fFloatValue, fFloatValue2, strK, strM, lowerCase));
        final b bVar = b.f10260d;
        Single<R> singleFlatMap = singleInsertLivenessStat.flatMap(new Function() { // from class: com.incode.welcome_sdk.g$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return g.e(bVar, obj);
            }
        });
        final c cVar = c.f10262a;
        Single<a> singleOnErrorResumeNext = singleFlatMap.onErrorResumeNext((Function<? super Throwable, ? extends SingleSource<? extends R>>) new Function() { // from class: com.incode.welcome_sdk.g$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return g.b(cVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "");
        int i3 = f10251e + 11;
        f10250c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        return singleOnErrorResumeNext;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object d(java.lang.Object[] r8) {
        /*
            r7 = 0
            r6 = r8[r7]
            com.incode.welcome_sdk.g r6 = (com.incode.welcome_sdk.g) r6
            r0 = 1
            r5 = r8[r0]
            com.incode.welcome_sdk.g$a r5 = (com.incode.welcome_sdk.g.a) r5
            r2 = 2
            r4 = r8[r2]
            com.incode.welcome_sdk.data.local.d r4 = (com.incode.welcome_sdk.data.local.d) r4
            int r0 = r2 % r2
            com.incode.welcome_sdk.results.ResultCode r1 = r5.e()
            com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            r3 = 0
            if (r1 != r0) goto L43
            com.incode.welcome_sdk.data.local.h r7 = com.incode.welcome_sdk.data.local.h.f8587a
        L1c:
            com.incode.welcome_sdk.results.ResultCode r1 = r5.e()
            com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            if (r1 != r0) goto L40
            com.incode.welcome_sdk.data.local.f r2 = com.incode.welcome_sdk.data.local.f.f8581b
        L26:
            com.incode.welcome_sdk.data.IncodeWelcomeRepository r1 = r6.f10252b
            java.lang.Throwable r0 = r5.b()
            if (r0 == 0) goto L32
            java.lang.String r3 = r0.toString()
        L32:
            com.incode.welcome_sdk.data.local.d r0 = com.incode.welcome_sdk.data.local.d.e(r4, r7, r2, r3)
            io.reactivex.Completable r1 = r1.updateFaceLoginAttempt(r0)
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L40:
            com.incode.welcome_sdk.data.local.f r2 = com.incode.welcome_sdk.data.local.f.f8584e
            goto L26
        L43:
            java.lang.Throwable r0 = r5.b()
            if (r0 == 0) goto L61
            int r0 = com.incode.welcome_sdk.g.f10251e
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.incode.welcome_sdk.g.f10250c = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L90
            java.lang.Throwable r0 = r5.b()
            boolean r0 = a(r0)
            if (r0 == 0) goto L61
            com.incode.welcome_sdk.data.local.h r7 = com.incode.welcome_sdk.data.local.h.f8590d
            goto L1c
        L61:
            java.lang.Throwable r0 = r5.b()
            if (r0 == 0) goto L8d
            int r0 = com.incode.welcome_sdk.g.f10250c
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.g.f10251e = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L82
            java.lang.Throwable r0 = r5.b()
            boolean r1 = a(r0)
            r0 = 62
            int r0 = r0 / r7
            if (r1 != 0) goto L8d
        L7f:
            com.incode.welcome_sdk.data.local.h r7 = com.incode.welcome_sdk.data.local.h.f8591e
            goto L1c
        L82:
            java.lang.Throwable r0 = r5.b()
            boolean r0 = a(r0)
            if (r0 != 0) goto L8d
            goto L7f
        L8d:
            com.incode.welcome_sdk.data.local.h r7 = com.incode.welcome_sdk.data.local.h.f8588b
            goto L1c
        L90:
            java.lang.Throwable r0 = r5.b()
            a(r0)
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.g.d(java.lang.Object[]):java.lang.Object");
    }

    private static boolean a(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f10251e + 29;
        f10250c = i3 % 128;
        int i4 = i3 % 2;
        if (ThrowableExtensionsKt.isNoConnectivityException(th)) {
            return true;
        }
        int i5 = f10250c + 111;
        f10251e = i5 % 128;
        int i6 = i5 % 2;
        n nVar = n.f6552a;
        if (n.c(n.b(th)) || ThrowableExtensionsKt.isSocketOrDnsError(th)) {
            return true;
        }
        int i7 = f10251e + 97;
        f10250c = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    static final class e extends Lambda implements Function1<List<com.incode.welcome_sdk.data.local.d>, Triple<? extends Integer, ? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: a */
        private static int f10297a = 0;

        /* JADX INFO: renamed from: b */
        public static final e f10298b = new e();

        /* JADX INFO: renamed from: c */
        private static int f10299c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10300d = 0;

        /* JADX INFO: renamed from: e */
        private static int f10301e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Triple<? extends Integer, ? extends Integer, ? extends Integer> invoke(List<com.incode.welcome_sdk.data.local.d> list) {
            int i2 = 2 % 2;
            int i3 = f10299c + 69;
            f10297a = i3 % 128;
            int i4 = i3 % 2;
            Triple<Integer, Integer, Integer> tripleD = d(list);
            int i5 = f10299c + 53;
            f10297a = i5 % 128;
            if (i5 % 2 == 0) {
                return tripleD;
            }
            throw null;
        }

        private static Triple<Integer, Integer, Integer> d(List<com.incode.welcome_sdk.data.local.d> list) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            List<com.incode.welcome_sdk.data.local.d> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((com.incode.welcome_sdk.data.local.d) obj).o() == com.incode.welcome_sdk.data.local.h.f8587a) {
                    int i3 = f10297a + 81;
                    f10299c = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    int size2 = arrayList2.size();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it2 = list2.iterator();
                    int i5 = f10299c + 51;
                    f10297a = i5 % 128;
                    int i6 = i5 % 2;
                    while (it2.hasNext()) {
                        int i7 = f10297a + 61;
                        f10299c = i7 % 128;
                        if (i7 % 2 == 0) {
                            ((com.incode.welcome_sdk.data.local.d) it2.next()).o();
                            com.incode.welcome_sdk.data.local.h hVar = com.incode.welcome_sdk.data.local.h.f8590d;
                            throw null;
                        }
                        Object next = it2.next();
                        if (((com.incode.welcome_sdk.data.local.d) next).o() == com.incode.welcome_sdk.data.local.h.f8590d) {
                            int i8 = f10297a + 41;
                            f10299c = i8 % 128;
                            if (i8 % 2 == 0) {
                                arrayList3.add(next);
                                obj2.hashCode();
                                throw null;
                            }
                            arrayList3.add(next);
                        }
                    }
                    int size3 = arrayList3.size();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((com.incode.welcome_sdk.data.local.d) obj3).o() == com.incode.welcome_sdk.data.local.h.f8588b) {
                            int i9 = f10299c + 47;
                            f10297a = i9 % 128;
                            int i10 = i9 % 2;
                            arrayList4.add(obj3);
                        }
                    }
                    return new Triple<>(Integer.valueOf(size), Integer.valueOf(size3 + arrayList4.size()), Integer.valueOf(size2));
                }
                Object next2 = it.next();
                if (((com.incode.welcome_sdk.data.local.d) next2).o() == com.incode.welcome_sdk.data.local.h.f8591e) {
                    int i11 = f10297a + 109;
                    f10299c = i11 % 128;
                    if (i11 % 2 == 0) {
                        arrayList2.add(next2);
                        obj2.hashCode();
                        throw null;
                    }
                    arrayList2.add(next2);
                }
            }
        }

        static {
            int i2 = f10301e + 9;
            f10300d = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(1);
        }
    }

    public static final Triple c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10251e + 73;
        f10250c = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Triple triple = (Triple) function1.invoke(obj);
        int i4 = f10250c + 21;
        f10251e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return triple;
    }

    private final Single<Triple<Integer, Integer, Integer>> b(List<Long> list) {
        int i2 = 2 % 2;
        int i3 = f10251e + 93;
        f10250c = i3 % 128;
        int i4 = i3 % 2;
        Single<List<com.incode.welcome_sdk.data.local.d>> singleC = c(CollectionsKt.listOf((Object[]) new com.incode.welcome_sdk.data.local.h[]{com.incode.welcome_sdk.data.local.h.f8587a, com.incode.welcome_sdk.data.local.h.f8588b, com.incode.welcome_sdk.data.local.h.f8591e, com.incode.welcome_sdk.data.local.h.f8590d}), list);
        final e eVar = e.f10298b;
        Single map = singleC.map(new Function() { // from class: com.incode.welcome_sdk.g$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return g.c(eVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        int i5 = f10251e + 125;
        f10250c = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public static final class a {

        /* JADX INFO: renamed from: a */
        private static int f10253a = 1;

        /* JADX INFO: renamed from: d */
        private static int f10254d = 0;

        /* JADX INFO: renamed from: b */
        private final Throwable f10255b;

        /* JADX INFO: renamed from: c */
        private final ResultCode f10256c;

        public a(ResultCode resultCode, Throwable th) {
            Intrinsics.checkNotNullParameter(resultCode, "");
            this.f10256c = resultCode;
            this.f10255b = th;
        }

        public final ResultCode e() {
            int i2 = 2 % 2;
            int i3 = f10253a + 61;
            f10254d = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f10256c;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Throwable b() {
            int i2 = 2 % 2;
            int i3 = f10253a;
            int i4 = i3 + 69;
            f10254d = i4 % 128;
            int i5 = i4 % 2;
            Throwable th = this.f10255b;
            int i6 = i3 + 111;
            f10254d = i6 % 128;
            if (i6 % 2 == 0) {
                return th;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                int i3 = f10253a + 123;
                f10254d = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 79 / 0;
                }
                return false;
            }
            a aVar = (a) obj;
            if (this.f10256c != aVar.f10256c) {
                return false;
            }
            if (Intrinsics.areEqual(this.f10255b, aVar.f10255b)) {
                return true;
            }
            int i5 = f10254d + 35;
            f10253a = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x001a A[PHI: r2
  0x001a: PHI (r2v4 int) = (r2v0 int), (r2v5 int) binds: [B:23:0x0030, B:18:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0033 A[PHI: r2
  0x0033: PHI (r2v1 int) = (r2v0 int), (r2v5 int) binds: [B:23:0x0030, B:18:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int hashCode() {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.g.a.f10254d
                int r1 = r0 + 45
                int r0 = r1 % 128
                com.incode.welcome_sdk.g.a.f10253a = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L26
                com.incode.welcome_sdk.results.ResultCode r0 = r4.f10256c
                int r0 = r0.hashCode()
                int r2 = r0 << 103
                java.lang.Throwable r0 = r4.f10255b
                if (r0 != 0) goto L33
            L1a:
                int r0 = com.incode.welcome_sdk.g.a.f10253a
                int r1 = r0 + 3
                int r0 = r1 % 128
                com.incode.welcome_sdk.g.a.f10254d = r0
                int r1 = r1 % r3
                r0 = 0
            L24:
                int r2 = r2 + r0
                return r2
            L26:
                com.incode.welcome_sdk.results.ResultCode r0 = r4.f10256c
                int r0 = r0.hashCode()
                int r2 = r0 * 31
                java.lang.Throwable r0 = r4.f10255b
                if (r0 != 0) goto L33
                goto L1a
            L33:
                java.lang.Throwable r0 = r4.f10255b
                int r0 = r0.hashCode()
                goto L24
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.g.a.hashCode():int");
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10253a + 75;
            f10254d = i3 % 128;
            if (i3 % 2 == 0) {
                return "WrappedLivenessStatResult(resultCode=" + this.f10256c + ", error=" + this.f10255b + ")";
            }
            String str = "WrappedLivenessStatResult(resultCode=" + this.f10256c + ", error=" + this.f10255b + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void e(int i2, int i3, SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
        a(-428187685, ScaleDrawer.b(), ScaleDrawer.b(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), syncFaceLoginAttemptsListener}, ScaleDrawer.b(), 428187686, ScaleDrawer.b());
    }

    private final Completable a(a aVar, com.incode.welcome_sdk.data.local.d dVar) {
        return (Completable) a(1631687706, ScaleDrawer.b(), ScaleDrawer.b(), new Object[]{this, aVar, dVar}, ScaleDrawer.b(), -1631687704, ScaleDrawer.b());
    }

    public final Single<Triple<Integer, Integer, Integer>> e(SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
        return (Single) a(1108802722, ScaleDrawer.b(), ScaleDrawer.b(), new Object[]{this, syncFaceLoginAttemptsListener}, ScaleDrawer.b(), -1108802722, ScaleDrawer.b());
    }
}
