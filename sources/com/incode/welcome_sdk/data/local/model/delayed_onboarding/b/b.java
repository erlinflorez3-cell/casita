package com.incode.welcome_sdk.data.local.model.delayed_onboarding.b;

import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.commons.exceptions.MissingFileException;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b;
import com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;
import com.incode.welcome_sdk.data.remote.beans.bc;
import com.incode.welcome_sdk.data.remote.beans.bf;
import com.incode.welcome_sdk.data.remote.beans.bt;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.modules.IdScan;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements com.incode.welcome_sdk.data.local.model.delayed_onboarding.e<Pair<? extends bc, ? extends bc>> {

    /* JADX INFO: renamed from: a */
    private static int f8668a = 0;

    /* JADX INFO: renamed from: j */
    private static int f8669j = 1;

    /* JADX INFO: renamed from: b */
    private final com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c f8670b;

    /* JADX INFO: renamed from: c */
    private final IncodeWelcomeRepository f8671c;

    /* JADX INFO: renamed from: d */
    private final boolean f8672d;

    /* JADX INFO: renamed from: e */
    private final com.incode.welcome_sdk.data.local.a.d.c.e f8673e;

    public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~(i8 | i6);
        int i10 = (~(i8 | (~i6) | i4)) | (~(i4 | i5 | i6));
        int i11 = ~i4;
        int i12 = (~(i6 | i5)) | (~(i11 | i6)) | (~(i11 | i5));
        int i13 = i4 + i5 + i2 + (1698977638 * i7) + (1466394737 * i3);
        int i14 = i13 * i13;
        int i15 = (((-1250291696) * i4) - 490274816) + ((-1116082190) * i5) + (i9 * (-67104753)) + ((-67104753) * i10) + (67104753 * i12) + ((-1183186944) * i2) + (1553727488 * i7) + (1859780608 * i3) + (925827072 * i14);
        int i16 = ((i4 * (-1787956080)) - 1478154965) + (i5 * (-1787955198)) + (i9 * (-441)) + (i10 * (-441)) + (i12 * 441) + (i2 * (-1787955639)) + (i7 * 552005654) + (i3 * (-2013897159)) + (i14 * (-429457408));
        int i17 = i15 + (i16 * i16 * (-402587648));
        return i17 != 1 ? i17 != 2 ? e(objArr) : a(objArr) : d(objArr);
    }

    public b(IncodeWelcomeRepository incodeWelcomeRepository, com.incode.welcome_sdk.data.local.a.d.c.e eVar, com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(eVar, "");
        Intrinsics.checkNotNullParameter(cVar, "");
        this.f8671c = incodeWelcomeRepository;
        this.f8673e = eVar;
        this.f8670b = cVar;
        this.f8672d = cVar.g();
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8669j + 75;
        f8668a = i3 % 128;
        if (i3 % 2 == 0) {
            return e.C0231e.c(bVar);
        }
        e.C0231e.c(bVar);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.data.local.a.d.c.e b(b bVar) {
        int i2 = 2 % 2;
        int i3 = f8668a;
        int i4 = i3 + 41;
        f8669j = i4 % 128;
        int i5 = i4 % 2;
        com.incode.welcome_sdk.data.local.a.d.c.e eVar = bVar.f8673e;
        int i6 = i3 + 11;
        f8669j = i6 % 128;
        int i7 = i6 % 2;
        return eVar;
    }

    public static final /* synthetic */ Single c(b bVar) {
        int i2 = 2 % 2;
        int i3 = f8668a + 101;
        f8669j = i3 % 128;
        int i4 = i3 % 2;
        Single<bc> singleC = bVar.c();
        if (i4 == 0) {
            int i5 = 60 / 0;
        }
        int i6 = f8669j + 111;
        f8668a = i6 % 128;
        int i7 = i6 % 2;
        return singleC;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c e(b bVar) {
        int i2 = 2 % 2;
        int i3 = f8669j + 57;
        f8668a = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar = bVar.f8670b;
        if (i4 == 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final /* synthetic */ Completable b(Pair<? extends bc, ? extends bc> pair) {
        int i2 = 2 % 2;
        int i3 = f8668a + 41;
        f8669j = i3 % 128;
        int i4 = i3 % 2;
        Completable completableC = c((Pair<bc, bc>) pair);
        int i5 = f8668a + 1;
        f8669j = i5 % 128;
        if (i5 % 2 != 0) {
            return completableC;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8669j + 93;
        int i4 = i3 % 128;
        f8668a = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8672d;
        int i6 = i4 + 55;
        f8669j = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public static final SingleSource d(b bVar) {
        SingleSource singleSourceFlatMap;
        int i2 = 2 % 2;
        int i3 = f8669j + 55;
        f8668a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar = bVar.f8670b;
        int iE = bf.a.e();
        int iE2 = bf.a.e();
        if (!(!Intrinsics.areEqual((String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), iE, new Object[]{cVar}, -1961997734, 1961997734, iE2, bf.a.e()), "PASSPORT"))) {
            Single<bc> singleA = bVar.a();
            final c cVar2 = c.f8689e;
            singleSourceFlatMap = singleA.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return b.e(cVar2, obj);
                }
            });
            Intrinsics.checkNotNull(singleSourceFlatMap);
        } else {
            String str = (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), bf.a.e(), new Object[]{cVar}, 419065736, -419065735, bf.a.e(), bf.a.e());
            if (Intrinsics.areEqual(str, "FRONT")) {
                Single<bc> singleA2 = bVar.a();
                final d dVar = d.f8690a;
                singleSourceFlatMap = singleA2.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda2
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return b.d(dVar, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(singleSourceFlatMap, "");
            } else if (Intrinsics.areEqual(str, "BACK")) {
                int i5 = f8669j + 67;
                f8668a = i5 % 128;
                if (i5 % 2 != 0) {
                    Single<bc> singleC = bVar.c();
                    final h hVar = h.f8704e;
                    singleSourceFlatMap = singleC.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda3
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return b.b(hVar, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(singleSourceFlatMap, "");
                    int i6 = 45 / 0;
                } else {
                    Single<bc> singleC2 = bVar.c();
                    final h hVar2 = h.f8704e;
                    singleSourceFlatMap = singleC2.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda3
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            return b.b(hVar2, obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(singleSourceFlatMap, "");
                }
            } else {
                Single<bc> singleA3 = bVar.a();
                final j jVar = new j(cVar, bVar);
                singleSourceFlatMap = singleA3.flatMap(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda4
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return b.c(jVar, obj);
                    }
                });
                Intrinsics.checkNotNull(singleSourceFlatMap);
                int i7 = f8668a + 15;
                f8669j = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return singleSourceFlatMap;
    }

    static final class c extends Lambda implements Function1<bc, Pair> {

        /* JADX INFO: renamed from: a */
        private static int f8685a = 0;

        /* JADX INFO: renamed from: b */
        private static int f8686b = 0;

        /* JADX INFO: renamed from: c */
        private static int f8687c = 1;

        /* JADX INFO: renamed from: d */
        private static int f8688d = 1;

        /* JADX INFO: renamed from: e */
        public static final c f8689e = new c();

        private static Pair b(bc bcVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(bcVar, "");
            Pair pair = new Pair(bcVar, null);
            int i3 = f8686b + 89;
            f8687c = i3 % 128;
            int i4 = i3 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Pair invoke(bc bcVar) {
            int i2 = 2 % 2;
            int i3 = f8687c + 77;
            f8686b = i3 % 128;
            int i4 = i3 % 2;
            Pair pairB = b(bcVar);
            int i5 = f8687c + 79;
            f8686b = i5 % 128;
            int i6 = i5 % 2;
            return pairB;
        }

        static {
            int i2 = f8685a + 37;
            f8688d = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        c() {
            super(1);
        }
    }

    public static final Pair e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8668a + 5;
        f8669j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Pair pair = (Pair) function1.invoke(obj);
        int i5 = f8669j + 33;
        f8668a = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function1<bc, Pair> {

        /* JADX INFO: renamed from: a */
        public static final d f8690a = new d();

        /* JADX INFO: renamed from: b */
        private static int f8691b = 0;

        /* JADX INFO: renamed from: c */
        private static int f8692c = 1;

        /* JADX INFO: renamed from: d */
        private static int f8693d = 1;

        /* JADX INFO: renamed from: e */
        private static int f8694e = 0;

        private static Pair b(bc bcVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(bcVar, "");
            Pair pair = new Pair(bcVar, null);
            int i3 = f8693d + 111;
            f8691b = i3 % 128;
            if (i3 % 2 == 0) {
                return pair;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Pair invoke(bc bcVar) {
            int i2 = 2 % 2;
            int i3 = f8693d + 17;
            f8691b = i3 % 128;
            bc bcVar2 = bcVar;
            if (i3 % 2 == 0) {
                return b(bcVar2);
            }
            b(bcVar2);
            throw null;
        }

        static {
            int i2 = f8694e + 81;
            f8692c = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    static final class h extends Lambda implements Function1<bc, Pair> {

        /* JADX INFO: renamed from: a */
        private static int f8700a = 0;

        /* JADX INFO: renamed from: b */
        private static int f8701b = 1;

        /* JADX INFO: renamed from: c */
        private static int f8702c = 0;

        /* JADX INFO: renamed from: d */
        private static int f8703d = 1;

        /* JADX INFO: renamed from: e */
        public static final h f8704e = new h();

        private static Pair a(bc bcVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(bcVar, "");
            Object obj = null;
            Pair pair = new Pair(null, bcVar);
            int i3 = f8703d + 77;
            f8702c = i3 % 128;
            if (i3 % 2 == 0) {
                return pair;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Pair invoke(bc bcVar) {
            int i2 = 2 % 2;
            int i3 = f8702c + 125;
            f8703d = i3 % 128;
            int i4 = i3 % 2;
            Pair pairA = a(bcVar);
            int i5 = f8702c + 19;
            f8703d = i5 % 128;
            if (i5 % 2 != 0) {
                return pairA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f8700a + 5;
            f8701b = i2 % 128;
            int i3 = i2 % 2;
        }

        h() {
            super(1);
        }
    }

    public static final Pair d(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8669j + 33;
        f8668a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Pair pair = (Pair) function1.invoke(obj);
        int i4 = f8668a + 35;
        f8669j = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    public static final Pair b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8669j + 83;
        f8668a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (Pair) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    static final class j extends Lambda implements Function1<bc, SingleSource<? extends Pair<? extends bc, ? extends bc>>> {

        /* JADX INFO: renamed from: a */
        private static int f8705a = 0;

        /* JADX INFO: renamed from: e */
        private static int f8706e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c f8707b;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ b f8708d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends Pair<? extends bc, ? extends bc>> invoke(bc bcVar) {
            int i2 = 2 % 2;
            int i3 = f8705a + 73;
            f8706e = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends Pair<bc, bc>> singleSourceB = b(bcVar);
            if (i4 == 0) {
                int i5 = 80 / 0;
            }
            int i6 = f8705a + 45;
            f8706e = i6 % 128;
            int i7 = i6 % 2;
            return singleSourceB;
        }

        private SingleSource<? extends Pair<bc, bc>> b(bc bcVar) {
            Single singleJust;
            int i2 = 2 % 2;
            int i3 = f8705a + 15;
            f8706e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(bcVar, "");
            String strD = this.f8707b.d();
            if (strD == null || strD.length() == 0) {
                singleJust = Single.just(new Pair(bcVar, null));
                Intrinsics.checkNotNull(singleJust);
                int i5 = f8706e + 47;
                f8705a = i5 % 128;
                int i6 = i5 % 2;
            } else {
                Single singleC = b.c(this.f8708d);
                final AnonymousClass3 anonymousClass3 = new Function1<bc, Pair<? extends bc, ? extends bc>>() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b.j.3

                    /* JADX INFO: renamed from: a */
                    private static int f8709a = 0;

                    /* JADX INFO: renamed from: b */
                    private static int f8710b = 1;

                    private Pair<bc, bc> e(bc bcVar2) {
                        int i7 = 2 % 2;
                        Intrinsics.checkNotNullParameter(bcVar2, "");
                        Pair<bc, bc> pair = new Pair<>(bcVar, bcVar2);
                        int i8 = f8710b + 85;
                        f8709a = i8 % 128;
                        int i9 = i8 % 2;
                        return pair;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Pair<? extends bc, ? extends bc> invoke(bc bcVar2) {
                        int i7 = 2 % 2;
                        int i8 = f8709a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        f8710b = i8 % 128;
                        bc bcVar3 = bcVar2;
                        if (i8 % 2 == 0) {
                            e(bcVar3);
                            throw null;
                        }
                        Pair<bc, bc> pairE = e(bcVar3);
                        int i9 = f8709a + 49;
                        f8710b = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 32 / 0;
                        }
                        return pairE;
                    }

                    AnonymousClass3() {
                        super(1);
                    }
                };
                singleJust = singleC.map(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$j$$ExternalSyntheticLambda0
                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return b.j.c(anonymousClass3, obj);
                    }
                });
                Intrinsics.checkNotNull(singleJust);
            }
            return singleJust;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$j$3 */
        static final class AnonymousClass3 extends Lambda implements Function1<bc, Pair<? extends bc, ? extends bc>> {

            /* JADX INFO: renamed from: a */
            private static int f8709a = 0;

            /* JADX INFO: renamed from: b */
            private static int f8710b = 1;

            private Pair<bc, bc> e(bc bcVar2) {
                int i7 = 2 % 2;
                Intrinsics.checkNotNullParameter(bcVar2, "");
                Pair<bc, bc> pair = new Pair<>(bcVar, bcVar2);
                int i8 = f8710b + 85;
                f8709a = i8 % 128;
                int i9 = i8 % 2;
                return pair;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Pair<? extends bc, ? extends bc> invoke(bc bcVar2) {
                int i7 = 2 % 2;
                int i8 = f8709a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f8710b = i8 % 128;
                bc bcVar3 = bcVar2;
                if (i8 % 2 == 0) {
                    e(bcVar3);
                    throw null;
                }
                Pair<bc, bc> pairE = e(bcVar3);
                int i9 = f8709a + 49;
                f8710b = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 32 / 0;
                }
                return pairE;
            }

            AnonymousClass3() {
                super(1);
            }
        }

        public static final Pair c(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f8705a + 115;
            f8706e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            Pair pair = (Pair) function1.invoke(obj);
            int i5 = f8705a + 27;
            f8706e = i5 % 128;
            if (i5 % 2 != 0) {
                return pair;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c cVar, b bVar) {
            super(1);
            this.f8707b = cVar;
            this.f8708d = bVar;
        }
    }

    public static final SingleSource c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f8668a + 91;
        f8669j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        SingleSource singleSource = (SingleSource) function1.invoke(obj);
        int i5 = f8669j + 59;
        f8668a = i5 % 128;
        int i6 = i5 % 2;
        return singleSource;
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Single<? extends Pair<? extends bc, ? extends bc>> e() {
        int i2 = 2 % 2;
        int i3 = f8669j + 23;
        f8668a = i3 % 128;
        if (i3 % 2 != 0) {
            Single<? extends Pair<? extends bc, ? extends bc>> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.d(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDefer, "");
            int i4 = 98 / 0;
            return singleDefer;
        }
        Single<? extends Pair<? extends bc, ? extends bc>> singleDefer2 = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.d(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDefer2, "");
        return singleDefer2;
    }

    static final class a extends Lambda implements Function2<bc, IdScan.ScanStep, Completable> {

        /* JADX INFO: renamed from: a */
        private static int f8674a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8675b = 0;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Completable invoke(bc bcVar, IdScan.ScanStep scanStep) {
            int i2 = 2 % 2;
            int i3 = f8675b + 23;
            f8674a = i3 % 128;
            int i4 = i3 % 2;
            Completable completableA = a(bcVar, scanStep);
            if (i4 == 0) {
                int i5 = 78 / 0;
            }
            return completableA;
        }

        private Completable a(bc bcVar, IdScan.ScanStep scanStep) {
            int i2 = 2 % 2;
            int i3 = f8674a + 67;
            f8675b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(scanStep, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(scanStep, "");
            if (bcVar != null) {
                return b.b(b.this).a(bcVar, b.e(b.this).a(), scanStep);
            }
            Completable completableComplete = Completable.complete();
            Intrinsics.checkNotNull(completableComplete);
            int i4 = f8675b + 89;
            f8674a = i4 % 128;
            int i5 = i4 % 2;
            return completableComplete;
        }

        a() {
            super(2);
        }
    }

    public static final CompletableSource c(Pair pair, b bVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        a aVar = bVar.new a();
        Completable completableConcatArray = Completable.concatArray(aVar.invoke(pair.getFirst(), IdScan.ScanStep.FRONT), aVar.invoke(pair.getSecond(), IdScan.ScanStep.BACK));
        int i3 = f8669j + 17;
        f8668a = i3 % 128;
        int i4 = i3 % 2;
        return completableConcatArray;
    }

    private Completable c(final Pair<bc, bc> pair) {
        int i2 = 2 % 2;
        int i3 = f8668a + 9;
        f8669j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.c(pair, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDefer, "");
        int i5 = f8669j + 101;
        f8668a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return completableDefer;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$b */
    public static final class C0229b extends Lambda implements Function2<IncodeWelcomeRepository, bt, Single<bc>> {

        /* JADX INFO: renamed from: a */
        private static int f8677a = 0;

        /* JADX INFO: renamed from: d */
        private static int f8678d = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Single<bc> invoke(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f8678d + 57;
            f8677a = i3 % 128;
            IncodeWelcomeRepository incodeWelcomeRepository2 = incodeWelcomeRepository;
            bt btVar2 = btVar;
            if (i3 % 2 == 0) {
                return e(incodeWelcomeRepository2, btVar2);
            }
            e(incodeWelcomeRepository2, btVar2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$b$5 */
        public static final class AnonymousClass5 extends Lambda implements Function1<Throwable, SingleSource<? extends bc>> {

            /* JADX INFO: renamed from: b */
            public static int f8680b = 0;

            /* JADX INFO: renamed from: c */
            private static int f8681c = 1;

            /* JADX INFO: renamed from: d */
            public static int f8682d = 0;

            /* JADX INFO: renamed from: e */
            private static int f8683e = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ b f8684a;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ SingleSource<? extends bc> invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f8683e + 69;
                f8681c = i3 % 128;
                int i4 = i3 % 2;
                SingleSource<? extends bc> singleSourceE = e(th);
                int i5 = f8681c + 95;
                f8683e = i5 % 128;
                int i6 = i5 % 2;
                return singleSourceE;
            }

            private SingleSource<? extends bc> e(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f8683e + 61;
                f8681c = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                if (th instanceof com.incode.welcome_sdk.data.remote.b.b) {
                    Object[] objArr = {b.e(this.f8684a)};
                    return Single.just(new bc(th, (String) com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.c.d(bf.a.e(), bf.a.e(), objArr, -1961997734, 1961997734, bf.a.e(), bf.a.e())));
                }
                Single singleError = Single.error(th);
                int i5 = f8681c + 19;
                f8683e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 41 / 0;
                }
                return singleError;
            }

            public static int d() {
                int i2 = f8682d;
                int i3 = i2 % 8703921;
                f8682d = i2 + 1;
                if (i3 != 0) {
                    return f8680b;
                }
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                f8680b = iElapsedRealtime;
                return iElapsedRealtime;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(b bVar) {
                super(1);
                this.f8684a = bVar;
            }
        }

        public static final SingleSource b(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f8677a + 97;
            f8678d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(obj, "");
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            SingleSource singleSource = (SingleSource) function1.invoke(obj);
            int i4 = f8677a + 91;
            f8678d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
            return singleSource;
        }

        private Single<bc> e(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(btVar, "");
            Single<bc> singleFirstOrError = incodeWelcomeRepository.sendFrontIdScan(btVar).firstOrError();
            final AnonymousClass5 anonymousClass5 = new AnonymousClass5(b.this);
            Single<bc> singleOnErrorResumeNext = singleFirstOrError.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$b$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return b.C0229b.b(anonymousClass5, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "");
            int i3 = f8677a + 1;
            f8678d = i3 % 128;
            if (i3 % 2 != 0) {
                return singleOnErrorResumeNext;
            }
            throw null;
        }

        C0229b() {
            super(2);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bVar, "");
        Single<bc> singleA = bVar.a(bVar.f8670b.c(), bVar.new C0229b());
        int i3 = f8669j + 47;
        f8668a = i3 % 128;
        if (i3 % 2 == 0) {
            return singleA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Single<bc> a() {
        int i2 = 2 % 2;
        int i3 = f8668a + 35;
        f8669j = i3 % 128;
        int i4 = i3 % 2;
        Single<bc> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.a(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDefer, "");
        int i5 = f8668a + 111;
        f8669j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return singleDefer;
    }

    static final class e extends Lambda implements Function2<IncodeWelcomeRepository, bt, Single<bc>> {

        /* JADX INFO: renamed from: a */
        private static int f8695a = 1;

        /* JADX INFO: renamed from: b */
        private static int f8696b = 0;

        /* JADX INFO: renamed from: c */
        private static int f8697c = 0;

        /* JADX INFO: renamed from: d */
        private static int f8698d = 1;

        /* JADX INFO: renamed from: e */
        public static final e f8699e = new e();

        private static Single<bc> d(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f8696b + 97;
            f8698d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
                Intrinsics.checkNotNullParameter(btVar, "");
                Intrinsics.checkNotNullExpressionValue(incodeWelcomeRepository.sendBackIdScan(btVar).firstOrError(), "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
            Intrinsics.checkNotNullParameter(btVar, "");
            Single<bc> singleFirstOrError = incodeWelcomeRepository.sendBackIdScan(btVar).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "");
            return singleFirstOrError;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Single<bc> invoke(IncodeWelcomeRepository incodeWelcomeRepository, bt btVar) {
            int i2 = 2 % 2;
            int i3 = f8698d + 111;
            f8696b = i3 % 128;
            IncodeWelcomeRepository incodeWelcomeRepository2 = incodeWelcomeRepository;
            bt btVar2 = btVar;
            if (i3 % 2 == 0) {
                return d(incodeWelcomeRepository2, btVar2);
            }
            d(incodeWelcomeRepository2, btVar2);
            throw null;
        }

        static {
            int i2 = f8697c + 59;
            f8695a = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(2);
        }
    }

    private final Single<bc> c() {
        int i2 = 2 % 2;
        int i3 = f8669j + 13;
        f8668a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.g(this.f$0);
                }
            }), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Single<bc> singleDefer = Single.defer(new Callable() { // from class: com.incode.welcome_sdk.data.local.model.delayed_onboarding.b.b$$ExternalSyntheticLambda7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.g(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDefer, "");
        int i4 = f8668a + 9;
        f8669j = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return singleDefer;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        b bVar = (b) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8669j + 29;
        f8668a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bVar, "");
            return bVar.a(bVar.f8670b.d(), e.f8699e);
        }
        Intrinsics.checkNotNullParameter(bVar, "");
        bVar.a(bVar.f8670b.d(), e.f8699e);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Single<bc> a(String str, Function2<? super IncodeWelcomeRepository, ? super bt, ? extends Single<bc>> function2) {
        if (str == null || !new File(str).exists()) {
            Single<bc> singleError = Single.error(new MissingFileException(null, 1, null));
            Intrinsics.checkNotNullExpressionValue(singleError, "");
            return singleError;
        }
        return function2.invoke(this.f8671c, new bt(new File(str), this.f8670b.e() ? IdCategory.SECOND : IdCategory.FIRST, this.f8670b.f()));
    }

    public static final SingleSource g(b bVar) {
        Object[] objArr = {bVar};
        int iE = s.g.e();
        return (SingleSource) a(s.g.e(), s.g.e(), objArr, -1078268554, 1078268554, iE, s.g.e());
    }

    public static final SingleSource a(b bVar) {
        Object[] objArr = {bVar};
        int iE = s.g.e();
        return (SingleSource) a(s.g.e(), s.g.e(), objArr, 1331978404, -1331978403, iE, s.g.e());
    }

    @Override // com.incode.welcome_sdk.data.local.model.delayed_onboarding.e
    public final Completable b() {
        int iE = s.g.e();
        int iE2 = s.g.e();
        int iE3 = s.g.e();
        return (Completable) a(iE2, s.g.e(), new Object[]{this}, -861544102, 861544104, iE, iE3);
    }
}
