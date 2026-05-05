package com.incode.welcome_sdk.ui.selfie_result;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract;
import io.reactivex.Single;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceMatchViewStateGenerator {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17410f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f17411h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f17412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f17413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f17414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f17415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f17416e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f17417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f17418j;

    public FaceMatchViewStateGenerator(IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f17415d = incodeWelcomeRepository;
        this.f17412a = LazyKt.lazy(new g());
        this.f17414c = LazyKt.lazy(new b());
        this.f17413b = LazyKt.lazy(new d());
        this.f17416e = LazyKt.lazy(new c());
        this.f17418j = LazyKt.lazy(new a());
        this.f17417i = LazyKt.lazy(new j());
    }

    public final IncodeWelcomeRepository getRepo() {
        int i2 = 2 % 2;
        int i3 = f17410f + 5;
        int i4 = i3 % 128;
        f17411h = i4;
        int i5 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f17415d;
        int i6 = i4 + 111;
        f17410f = i6 % 128;
        if (i6 % 2 != 0) {
            return incodeWelcomeRepository;
        }
        throw null;
    }

    static final class g extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17442b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17443e = 1;

        private Pair<Integer, String> a() {
            int i2 = 2 % 2;
            int i3 = f17442b + 23;
            f17443e = i3 % 128;
            int i4 = i3 % 2;
            Integer numValueOf = Integer.valueOf(R.string.onboard_sdk_recognition_result_selfie);
            if (i4 != 0) {
                return TuplesKt.to(numValueOf, FaceMatchViewStateGenerator.this.getRepo().getCroppedSelfiePath());
            }
            TuplesKt.to(numValueOf, FaceMatchViewStateGenerator.this.getRepo().getCroppedSelfiePath());
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends String> invoke() {
            int i2 = 2 % 2;
            int i3 = f17443e + 67;
            f17442b = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pairA = a();
            int i5 = f17443e + 117;
            f17442b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            return pairA;
        }

        g() {
            super(0);
        }
    }

    static final class b extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17425d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17426e = 0;

        private Pair<Integer, String> a() {
            int i2 = 2 % 2;
            int i3 = f17425d + 97;
            f17426e = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pair = TuplesKt.to(Integer.valueOf(R.string.onboard_sdk_recognition_result_nfc), FaceMatchViewStateGenerator.this.getRepo().getNfcSelfiePath());
            int i5 = f17426e + 49;
            f17425d = i5 % 128;
            if (i5 % 2 != 0) {
                return pair;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends String> invoke() {
            Pair<Integer, String> pairA;
            int i2 = 2 % 2;
            int i3 = f17425d + 37;
            f17426e = i3 % 128;
            if (i3 % 2 != 0) {
                pairA = a();
                int i4 = 42 / 0;
            } else {
                pairA = a();
            }
            int i5 = f17426e + 5;
            f17425d = i5 % 128;
            int i6 = i5 % 2;
            return pairA;
        }

        b() {
            super(0);
        }
    }

    private final Pair<Integer, String> c() {
        int i2 = 2 % 2;
        int i3 = f17411h + 53;
        f17410f = i3 % 128;
        int i4 = i3 % 2;
        Pair<Integer, String> pair = (Pair) this.f17412a.getValue();
        int i5 = f17411h + 33;
        f17410f = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Pair<Integer, String> e() {
        int i2 = 2 % 2;
        int i3 = f17410f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17411h = i3 % 128;
        int i4 = i3 % 2;
        Pair<Integer, String> pair = (Pair) this.f17414c.getValue();
        int i5 = f17410f + 37;
        f17411h = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17431a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17432d = 1;

        private Pair<Integer, String> c() {
            int i2 = 2 % 2;
            int i3 = f17432d + 93;
            f17431a = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pair = TuplesKt.to(Integer.valueOf(R.string.onboard_sdk_recognition_result_id), FaceMatchViewStateGenerator.this.getRepo().getFrontIdFaceCropPath());
            int i5 = f17432d + 83;
            f17431a = i5 % 128;
            if (i5 % 2 == 0) {
                return pair;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends String> invoke() {
            int i2 = 2 % 2;
            int i3 = f17431a + 57;
            f17432d = i3 % 128;
            if (i3 % 2 == 0) {
                c();
                throw null;
            }
            Pair<Integer, String> pairC = c();
            int i4 = f17432d + 71;
            f17431a = i4 % 128;
            if (i4 % 2 == 0) {
                return pairC;
            }
            throw null;
        }

        d() {
            super(0);
        }
    }

    static final class c extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17428a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17429b = 1;

        private Pair<Integer, String> c() {
            int i2 = 2 % 2;
            int i3 = f17429b + 125;
            f17428a = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pair = TuplesKt.to(Integer.valueOf(R.string.onboard_sdk_recognition_result_first_id), FaceMatchViewStateGenerator.this.getRepo().getFrontIdFaceCropPath());
            int i5 = f17429b + 63;
            f17428a = i5 % 128;
            int i6 = i5 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends String> invoke() {
            int i2 = 2 % 2;
            int i3 = f17429b + 49;
            f17428a = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pairC = c();
            int i5 = f17429b + 57;
            f17428a = i5 % 128;
            int i6 = i5 % 2;
            return pairC;
        }

        c() {
            super(0);
        }
    }

    private final Pair<Integer, String> b() {
        int i2 = 2 % 2;
        int i3 = f17411h + 91;
        f17410f = i3 % 128;
        int i4 = i3 % 2;
        Pair<Integer, String> pair = (Pair) this.f17413b.getValue();
        if (i4 != 0) {
            return pair;
        }
        throw null;
    }

    private final Pair<Integer, String> a() {
        int i2 = 2 % 2;
        int i3 = f17410f + 25;
        f17411h = i3 % 128;
        int i4 = i3 % 2;
        Pair<Integer, String> pair = (Pair) this.f17416e.getValue();
        int i5 = f17410f + 29;
        f17411h = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    static final class a extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17422b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17423e = 0;

        private Pair<Integer, String> e() {
            int i2 = 2 % 2;
            int i3 = f17422b + 13;
            f17423e = i3 % 128;
            if (i3 % 2 != 0) {
                TuplesKt.to(Integer.valueOf(R.string.onboard_sdk_recognition_result_id), FaceMatchViewStateGenerator.this.getRepo().getFrontSecondIdFaceCropPath());
                throw null;
            }
            Pair<Integer, String> pair = TuplesKt.to(Integer.valueOf(R.string.onboard_sdk_recognition_result_id), FaceMatchViewStateGenerator.this.getRepo().getFrontSecondIdFaceCropPath());
            int i4 = f17422b + 109;
            f17423e = i4 % 128;
            int i5 = i4 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends String> invoke() {
            int i2 = 2 % 2;
            int i3 = f17422b + 85;
            f17423e = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pairE = e();
            int i5 = f17423e + 73;
            f17422b = i5 % 128;
            int i6 = i5 % 2;
            return pairE;
        }

        a() {
            super(0);
        }
    }

    static final class j extends Lambda implements Function0<Pair<? extends Integer, ? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17445a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17446e = 1;

        private Pair<Integer, String> e() {
            int i2 = 2 % 2;
            int i3 = f17446e + 13;
            f17445a = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pair = TuplesKt.to(Integer.valueOf(R.string.onboard_sdk_recognition_result_second_id), FaceMatchViewStateGenerator.this.getRepo().getFrontSecondIdFaceCropPath());
            int i5 = f17445a + 13;
            f17446e = i5 % 128;
            int i6 = i5 % 2;
            return pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends Integer, ? extends String> invoke() {
            int i2 = 2 % 2;
            int i3 = f17445a + 109;
            f17446e = i3 % 128;
            int i4 = i3 % 2;
            Pair<Integer, String> pairE = e();
            int i5 = f17446e + 105;
            f17445a = i5 % 128;
            int i6 = i5 % 2;
            return pairE;
        }

        j() {
            super(0);
        }
    }

    private final Pair<Integer, String> d() {
        int i2 = 2 % 2;
        int i3 = f17410f + 27;
        f17411h = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Pair<Integer, String> pair = (Pair) this.f17418j.getValue();
        int i4 = f17410f + 109;
        f17411h = i4 % 128;
        if (i4 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    private final Pair<Integer, String> f() {
        int i2 = 2 % 2;
        int i3 = f17411h + 21;
        f17410f = i3 % 128;
        int i4 = i3 % 2;
        Pair<Integer, String> pair = (Pair) this.f17417i.getValue();
        int i5 = f17410f + 81;
        f17411h = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ e[] f17434a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17436c = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f17439f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f17440g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f17441j = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f17438e = new e("LEFT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f17435b = new e("RIGHT", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f17437d = new e("BOTTOM", 2);

        private e(String str, int i2) {
        }

        static {
            e[] eVarArrE = e();
            f17434a = eVarArrE;
            EnumEntriesKt.enumEntries(eVarArrE);
            int i2 = f17441j + 115;
            f17440g = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ e[] e() {
            int i2 = 2 % 2;
            int i3 = f17436c + 33;
            int i4 = i3 % 128;
            f17439f = i4;
            int i5 = i3 % 2;
            e[] eVarArr = {f17438e, f17435b, f17437d};
            int i6 = i4 + 103;
            f17436c = i6 % 128;
            int i7 = i6 % 2;
            return eVarArr;
        }

        public static e valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f17439f + 41;
            f17436c = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            e eVar = (e) Enum.valueOf(e.class, str);
            if (i4 != 0) {
                throw null;
            }
            int i5 = f17436c + 105;
            f17439f = i5 % 128;
            if (i5 % 2 != 0) {
                return eVar;
            }
            obj.hashCode();
            throw null;
        }

        public static e[] values() {
            int i2 = 2 % 2;
            int i3 = f17436c + 49;
            f17439f = i3 % 128;
            int i4 = i3 % 2;
            e[] eVarArr = (e[]) f17434a.clone();
            int i5 = f17439f + 87;
            f17436c = i5 % 128;
            int i6 = i5 % 2;
            return eVarArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceMatchContract.ViewState b(FaceMatchViewStateGenerator faceMatchViewStateGenerator, FaceMatch faceMatch) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(faceMatchViewStateGenerator, "");
        Intrinsics.checkNotNullParameter(faceMatch, "");
        FaceMatchContract.State stateD = faceMatchViewStateGenerator.d(faceMatch, e.f17438e);
        Intrinsics.checkNotNull(stateD);
        FaceMatchContract.State stateD2 = faceMatchViewStateGenerator.d(faceMatch, e.f17435b);
        Intrinsics.checkNotNull(stateD2);
        FaceMatchContract.ViewState viewState = new FaceMatchContract.ViewState(stateD, stateD2, faceMatchViewStateGenerator.d(faceMatch, e.f17437d));
        int i3 = f17411h + 47;
        f17410f = i3 % 128;
        int i4 = i3 % 2;
        return viewState;
    }

    public final Single<FaceMatchContract.ViewState> generate(final FaceMatch faceMatch) {
        int i2 = 2 % 2;
        int i3 = f17410f + 3;
        f17411h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceMatch, "");
            Intrinsics.checkNotNullExpressionValue(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchViewStateGenerator$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return FaceMatchViewStateGenerator.b(this.f$0, faceMatch);
                }
            }), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceMatch, "");
        Single<FaceMatchContract.ViewState> singleFromCallable = Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.ui.selfie_result.FaceMatchViewStateGenerator$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FaceMatchViewStateGenerator.b(this.f$0, faceMatch);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFromCallable, "");
        int i4 = f17411h + 51;
        f17410f = i4 % 128;
        int i5 = i4 % 2;
        return singleFromCallable;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract.State d(com.incode.welcome_sdk.modules.FaceMatch r9, com.incode.welcome_sdk.ui.selfie_result.FaceMatchViewStateGenerator.e r10) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.selfie_result.FaceMatchViewStateGenerator.d(com.incode.welcome_sdk.modules.FaceMatch, com.incode.welcome_sdk.ui.selfie_result.FaceMatchViewStateGenerator$e):com.incode.welcome_sdk.ui.selfie_result.FaceMatchContract$State");
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17419c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f17420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17421e = 0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f17438e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f17435b.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f17437d.ordinal()] = 3;
                int i3 = f17419c + 113;
                f17421e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            f17420d = iArr;
            int i6 = f17419c + 67;
            f17421e = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
