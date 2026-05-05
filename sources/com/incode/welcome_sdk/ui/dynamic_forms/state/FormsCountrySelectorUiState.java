package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.DynamicForms;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsCountrySelectorUiState implements FormsInputUiState<CountryUiState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f13309a = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f13310l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f13311m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f13312n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f13313o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountryUiState f13315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DynamicForms.InputType f13316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f13318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<CountryUiState> f13319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<CountryUiState> f13320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f13321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f13322j;

    public FormsCountrySelectorUiState(String str, String str2, CountryUiState countryUiState, DynamicForms.InputType inputType, boolean z2, String str3, List<CountryUiState> list, List<CountryUiState> list2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f13317e = str;
        this.f13314b = str2;
        this.f13315c = countryUiState;
        this.f13316d = inputType;
        this.f13318f = z2;
        this.f13322j = str3;
        this.f13319g = list;
        this.f13320h = list2;
        this.f13321i = z3;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final /* bridge */ /* synthetic */ CountryUiState getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13310l + 45;
        f13312n = i3 % 128;
        int i4 = i3 % 2;
        CountryUiState answer = getAnswer();
        int i5 = f13312n + 49;
        f13310l = i5 % 128;
        if (i5 % 2 != 0) {
            return answer;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f13310l + 67;
        f13312n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13317e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getQuestionText() {
        int i2 = 2 % 2;
        int i3 = f13310l + 123;
        int i4 = i3 % 128;
        f13312n = i4;
        int i5 = i3 % 2;
        String str = this.f13314b;
        int i6 = i4 + 55;
        f13310l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final CountryUiState getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13312n + 51;
        f13310l = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13315c;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final DynamicForms.InputType getFormInputType() {
        int i2 = 2 % 2;
        int i3 = f13312n + 87;
        f13310l = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13316d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f13310l + 95;
        f13312n = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f13318f;
        if (i4 != 0) {
            int i5 = 4 / 0;
        }
        return z2;
    }

    public /* synthetic */ FormsCountrySelectorUiState(String str, String str2, CountryUiState countryUiState, DynamicForms.InputType inputType, boolean z2, String str3, List list, List list2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : countryUiState, inputType, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? "" : str3, list, (i2 & 128) != 0 ? list : list2, (i2 & 256) != 0 ? false : z3);
    }

    public final String getSearchedText() {
        String str;
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 13;
        f13310l = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.f13322j;
            int i5 = 96 / 0;
        } else {
            str = this.f13322j;
        }
        int i6 = i3 + 45;
        f13310l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final List<CountryUiState> getAllOptions() {
        List<CountryUiState> list;
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 101;
        f13310l = i4 % 128;
        if (i4 % 2 == 0) {
            list = this.f13319g;
            int i5 = 74 / 0;
        } else {
            list = this.f13319g;
        }
        int i6 = i3 + 103;
        f13310l = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final List<CountryUiState> getFilteredOptions() {
        int i2 = 2 % 2;
        int i3 = f13310l + 77;
        int i4 = i3 % 128;
        f13312n = i4;
        int i5 = i3 % 2;
        List<CountryUiState> list = this.f13320h;
        int i6 = i4 + 3;
        f13310l = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final boolean getShowCountryPicker() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 51;
        f13310l = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.f13321i;
            int i5 = 84 / 0;
        } else {
            z2 = this.f13321i;
        }
        int i6 = i3 + 121;
        f13310l = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public static final class CountryUiState {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13325c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13326e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f13328b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f13329d;

        public CountryUiState(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.f13329d = str;
            this.f13327a = str2;
            this.f13328b = str3;
        }

        public final String getName() {
            int i2 = 2 % 2;
            int i3 = f13326e + 19;
            f13325c = i3 % 128;
            int i4 = i3 % 2;
            String str = this.f13329d;
            if (i4 != 0) {
                int i5 = 56 / 0;
            }
            return str;
        }

        public final String getFlagEmoji() {
            int i2 = 2 % 2;
            int i3 = f13325c;
            int i4 = i3 + 111;
            f13326e = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f13327a;
            int i6 = i3 + 91;
            f13326e = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String getCode() {
            int i2 = 2 % 2;
            int i3 = f13325c;
            int i4 = i3 + 27;
            f13326e = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.f13328b;
            int i5 = i3 + 105;
            f13326e = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountryUiState)) {
                int i3 = f13326e + 115;
                f13325c = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            CountryUiState countryUiState = (CountryUiState) obj;
            if (!Intrinsics.areEqual(this.f13329d, countryUiState.f13329d)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f13327a, countryUiState.f13327a)) {
                int i5 = f13326e + 43;
                f13325c = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.f13328b, countryUiState.f13328b)) {
                return true;
            }
            int i7 = f13325c + 99;
            f13326e = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public final int hashCode() {
            int i2 = 2 % 2;
            int i3 = f13326e + 111;
            f13325c = i3 % 128;
            int iHashCode = i3 % 2 != 0 ? (((this.f13329d.hashCode() + 75) << this.f13327a.hashCode()) >>> 47) - this.f13328b.hashCode() : (((this.f13329d.hashCode() * 31) + this.f13327a.hashCode()) * 31) + this.f13328b.hashCode();
            int i4 = f13325c + 3;
            f13326e = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f13325c + 57;
            f13326e = i3 % 128;
            if (i3 % 2 == 0) {
                String str = "CountryUiState(name=" + this.f13329d + ", flagEmoji=" + this.f13327a + ", code=" + this.f13328b + ")";
                throw null;
            }
            String str2 = "CountryUiState(name=" + this.f13329d + ", flagEmoji=" + this.f13327a + ", code=" + this.f13328b + ")";
            int i4 = f13325c + 17;
            f13326e = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            throw null;
        }

        public static /* synthetic */ CountryUiState copy$default(CountryUiState countryUiState, String str, String str2, String str3, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 1) != 0) {
                int i4 = f13326e + 73;
                f13325c = i4 % 128;
                int i5 = i4 % 2;
                str = countryUiState.f13329d;
            }
            if ((i2 & 2) != 0) {
                int i6 = f13325c + 63;
                f13326e = i6 % 128;
                if (i6 % 2 == 0) {
                    String str4 = countryUiState.f13327a;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = countryUiState.f13327a;
            }
            if ((i2 & 4) != 0) {
                int i7 = f13325c + 43;
                f13326e = i7 % 128;
                int i8 = i7 % 2;
                str3 = countryUiState.f13328b;
            }
            return countryUiState.copy(str, str2, str3);
        }

        public final CountryUiState copy(String str, String str2, String str3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            CountryUiState countryUiState = new CountryUiState(str, str2, str3);
            int i3 = f13325c + 3;
            f13326e = i3 % 128;
            if (i3 % 2 != 0) {
                return countryUiState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component3() {
            int i2 = 2 % 2;
            int i3 = f13326e;
            int i4 = i3 + 37;
            f13325c = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f13328b;
            int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13325c = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component2() {
            int i2 = 2 % 2;
            int i3 = f13325c + 95;
            f13326e = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f13327a;
            }
            throw null;
        }

        public final String component1() {
            int i2 = 2 % 2;
            int i3 = f13325c + 83;
            f13326e = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f13329d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean hasAnswer() {
        int i2 = 2 % 2;
        int i3 = f13312n + 7;
        f13310l = i3 % 128;
        int i4 = i3 % 2;
        if (getAnswer() == null) {
            return false;
        }
        int i5 = f13312n + 17;
        f13310l = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13323a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13324b = 1;

        private Companion() {
        }

        public static /* synthetic */ FormsCountrySelectorUiState previewData$onboard_release$default(Companion companion, boolean z2, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f13323a + 13;
            f13324b = i4 % 128;
            if (i4 % 2 != 0 && (i2 & 1) != 0) {
                z2 = false;
            }
            FormsCountrySelectorUiState formsCountrySelectorUiStatePreviewData$onboard_release = companion.previewData$onboard_release(z2);
            int i5 = f13323a + 31;
            f13324b = i5 % 128;
            int i6 = i5 % 2;
            return formsCountrySelectorUiStatePreviewData$onboard_release;
        }

        public final FormsCountrySelectorUiState previewData$onboard_release(boolean z2) {
            CountryUiState countryUiState;
            String name;
            int i2 = 2 % 2;
            if (!z2) {
                countryUiState = null;
                name = "";
            } else {
                countryUiState = new CountryUiState("Austria", "🇦🇹", "AT");
                name = countryUiState.getName();
                int i3 = f13324b + 13;
                f13323a = i3 % 128;
                int i4 = i3 % 2;
            }
            FormsCountrySelectorUiState formsCountrySelectorUiState = new FormsCountrySelectorUiState("testId", "What is your country of residence?", countryUiState, DynamicForms.InputType.COUNTRY, false, name, CollectionsKt.listOf((Object[]) new CountryUiState[]{new CountryUiState("Australia", "🇦🇺", "AU"), new CountryUiState("Austria", "🇦🇹", "AT"), new CountryUiState("Azerbaijan", "🇦🇿", "AZ"), new CountryUiState("Bahamas", "🇧🇸", "BS"), new CountryUiState("Bahrain", "🇧🇭", "BH"), new CountryUiState("Bangladesh", "🇧🇩", "BD"), new CountryUiState("Barbados", "🇧🇧", "BB")}), null, false, 400, null);
            int i5 = f13323a + 59;
            f13324b = i5 % 128;
            int i6 = i5 % 2;
            return formsCountrySelectorUiState;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13313o + 43;
        f13311m = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormsCountrySelectorUiState)) {
            return false;
        }
        FormsCountrySelectorUiState formsCountrySelectorUiState = (FormsCountrySelectorUiState) obj;
        if (!Intrinsics.areEqual(this.f13317e, formsCountrySelectorUiState.f13317e)) {
            int i3 = f13310l + 113;
            f13312n = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f13314b, formsCountrySelectorUiState.f13314b) || !Intrinsics.areEqual(this.f13315c, formsCountrySelectorUiState.f13315c) || this.f13316d != formsCountrySelectorUiState.f13316d) {
            return false;
        }
        if (this.f13318f != formsCountrySelectorUiState.f13318f) {
            int i5 = f13312n + 11;
            f13310l = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.f13322j, formsCountrySelectorUiState.f13322j)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f13319g, formsCountrySelectorUiState.f13319g)) {
            int i6 = f13312n + 21;
            f13310l = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.f13320h, formsCountrySelectorUiState.f13320h)) {
            int i7 = f13312n + 93;
            f13310l = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.f13321i == formsCountrySelectorUiState.f13321i) {
            return true;
        }
        int i9 = f13312n;
        int i10 = i9 + 19;
        f13310l = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 59;
        f13310l = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072 A[PHI: r3
  0x0072: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x006f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023 A[PHI: r3
  0x0023: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x006f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13312n
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13310l = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L5c
            java.lang.String r0 = r5.f13317e
            int r0 = r0.hashCode()
            int r1 = r0 << 16
            java.lang.String r0 = r5.f13314b
            int r0 = r0.hashCode()
            int r1 = r1 * r0
            int r3 = r1 << 3
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState r0 = r5.f13315c
            if (r0 != 0) goto L72
        L23:
            r2 = 0
        L24:
            int r3 = r3 + r2
            int r1 = r3 * 31
            com.incode.welcome_sdk.modules.DynamicForms$InputType r0 = r5.f13316d
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r5.f13318f
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r5.f13322j
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState> r0 = r5.f13319g
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState> r0 = r5.f13320h
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r5.f13321i
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        L5c:
            java.lang.String r0 = r5.f13317e
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r5.f13314b
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r3 = r1 * 31
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState r0 = r5.f13315c
            if (r0 != 0) goto L72
            goto L23
        L72:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState r0 = r5.f13315c
            int r2 = r0.hashCode()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13312n
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.f13310l = r0
            int r1 = r1 % r4
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13310l + 89;
        f13312n = i3 % 128;
        int i4 = i3 % 2;
        String str = "FormsCountrySelectorUiState(id=" + this.f13317e + ", questionText=" + this.f13314b + ", answer=" + this.f13315c + ", formInputType=" + this.f13316d + ", isValid=" + this.f13318f + ", searchedText=" + this.f13322j + ", allOptions=" + this.f13319g + ", filteredOptions=" + this.f13320h + ", showCountryPicker=" + this.f13321i + ")";
        int i5 = f13312n + 25;
        f13310l = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormsCountrySelectorUiState copy$default(FormsCountrySelectorUiState formsCountrySelectorUiState, String str, String str2, CountryUiState countryUiState, DynamicForms.InputType inputType, boolean z2, String str3, List list, List list2, boolean z3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f13312n + 25;
            f13310l = i4 % 128;
            if (i4 % 2 == 0) {
                String str4 = formsCountrySelectorUiState.f13317e;
                throw null;
            }
            str = formsCountrySelectorUiState.f13317e;
        }
        if ((i2 & 2) != 0) {
            str2 = formsCountrySelectorUiState.f13314b;
        }
        if ((i2 & 4) != 0) {
            countryUiState = formsCountrySelectorUiState.f13315c;
        }
        if ((i2 & 8) != 0) {
            int i5 = f13312n + 67;
            f13310l = i5 % 128;
            int i6 = i5 % 2;
            inputType = formsCountrySelectorUiState.f13316d;
        }
        if ((i2 & 16) != 0) {
            z2 = formsCountrySelectorUiState.f13318f;
        }
        if ((i2 & 32) != 0) {
            str3 = formsCountrySelectorUiState.f13322j;
        }
        if ((i2 & 64) != 0) {
            list = formsCountrySelectorUiState.f13319g;
            int i7 = f13312n + 55;
            f13310l = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 128) != 0) {
            list2 = formsCountrySelectorUiState.f13320h;
        }
        if ((i2 & 256) != 0) {
            int i9 = f13310l;
            int i10 = i9 + 57;
            f13312n = i10 % 128;
            int i11 = i10 % 2;
            z3 = formsCountrySelectorUiState.f13321i;
            int i12 = i9 + 9;
            f13312n = i12 % 128;
            int i13 = i12 % 2;
        }
        return formsCountrySelectorUiState.copy(str, str2, countryUiState, inputType, z2, str3, list, list2, z3);
    }

    public final FormsCountrySelectorUiState copy(String str, String str2, CountryUiState countryUiState, DynamicForms.InputType inputType, boolean z2, String str3, List<CountryUiState> list, List<CountryUiState> list2, boolean z3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        FormsCountrySelectorUiState formsCountrySelectorUiState = new FormsCountrySelectorUiState(str, str2, countryUiState, inputType, z2, str3, list, list2, z3);
        int i3 = f13312n + 97;
        f13310l = i3 % 128;
        int i4 = i3 % 2;
        return formsCountrySelectorUiState;
    }

    public final boolean component9() {
        int i2 = 2 % 2;
        int i3 = f13312n + 111;
        int i4 = i3 % 128;
        f13310l = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f13321i;
        int i6 = i4 + 39;
        f13312n = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final List<CountryUiState> component8() {
        int i2 = 2 % 2;
        int i3 = f13312n + 33;
        f13310l = i3 % 128;
        int i4 = i3 % 2;
        List<CountryUiState> list = this.f13320h;
        if (i4 == 0) {
            int i5 = 53 / 0;
        }
        return list;
    }

    public final List<CountryUiState> component7() {
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 111;
        f13310l = i4 % 128;
        int i5 = i4 % 2;
        List<CountryUiState> list = this.f13319g;
        int i6 = i3 + 61;
        f13310l = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component6() {
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 33;
        f13310l = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13322j;
        int i6 = i3 + 103;
        f13310l = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return str;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 105;
        f13310l = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f13318f;
        int i5 = i3 + 7;
        f13310l = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        obj.hashCode();
        throw null;
    }

    public final DynamicForms.InputType component4() {
        int i2 = 2 % 2;
        int i3 = f13312n + 91;
        f13310l = i3 % 128;
        int i4 = i3 % 2;
        DynamicForms.InputType inputType = this.f13316d;
        if (i4 == 0) {
            int i5 = 45 / 0;
        }
        return inputType;
    }

    public final CountryUiState component3() {
        int i2 = 2 % 2;
        int i3 = f13312n;
        int i4 = i3 + 73;
        f13310l = i4 % 128;
        int i5 = i4 % 2;
        CountryUiState countryUiState = this.f13315c;
        int i6 = i3 + 15;
        f13310l = i6 % 128;
        if (i6 % 2 != 0) {
            return countryUiState;
        }
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f13310l;
        int i4 = i3 + 75;
        f13312n = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13314b;
        int i6 = i3 + 37;
        f13312n = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f13312n + 51;
        int i4 = i3 % 128;
        f13310l = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f13317e;
        int i5 = i4 + 111;
        f13312n = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
