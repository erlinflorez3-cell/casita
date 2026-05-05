package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.utils.i;
import com.incode.welcome_sdk.modules.DynamicForms;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsDateInputUiState implements FormsInputUiState<Date> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f13330d = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13331g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13332i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f13333l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f13334m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DynamicForms.InputType f13335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f13337c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f13339f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13340h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13341j;

    public FormsDateInputUiState(String str, String str2, Date date, DynamicForms.InputType inputType, boolean z2, boolean z3) {
        String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        this.f13338e = str;
        this.f13336b = str2;
        this.f13337c = date;
        this.f13335a = inputType;
        this.f13339f = z2;
        this.f13341j = z3;
        Date answer2 = getAnswer2();
        if (answer2 != null) {
            i iVar = i.f6507b;
            str3 = i.a("dd/MM/yyyy", "UTC").format(answer2);
        } else {
            str3 = null;
        }
        this.f13340h = str3 != null ? str3 : "";
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final /* bridge */ /* synthetic */ Date getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13332i + 83;
        f13331g = i3 % 128;
        if (i3 % 2 == 0) {
            getAnswer2();
            throw null;
        }
        Date answer2 = getAnswer2();
        int i4 = f13332i + 19;
        f13331g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return answer2;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f13332i + 5;
        int i4 = i3 % 128;
        f13331g = i4;
        int i5 = i3 % 2;
        String str = this.f13338e;
        int i6 = i4 + 71;
        f13332i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return str;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getQuestionText() {
        int i2 = 2 % 2;
        int i3 = f13332i + 75;
        f13331g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13336b;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    /* JADX INFO: renamed from: getAnswer, reason: avoid collision after fix types in other method */
    public final Date getAnswer2() {
        int i2 = 2 % 2;
        int i3 = f13331g;
        int i4 = i3 + 99;
        f13332i = i4 % 128;
        int i5 = i4 % 2;
        Date date = this.f13337c;
        int i6 = i3 + 45;
        f13332i = i6 % 128;
        int i7 = i6 % 2;
        return date;
    }

    public /* synthetic */ FormsDateInputUiState(String str, String str2, Date date, DynamicForms.InputType inputType, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : date, (i2 & 8) != 0 ? DynamicForms.InputType.DATE : inputType, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? false : z3);
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final DynamicForms.InputType getFormInputType() {
        int i2 = 2 % 2;
        int i3 = f13332i + 19;
        f13331g = i3 % 128;
        int i4 = i3 % 2;
        DynamicForms.InputType inputType = this.f13335a;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
        return inputType;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean isValid() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f13332i;
        int i4 = i3 + 11;
        f13331g = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.f13339f;
            int i5 = 36 / 0;
        } else {
            z2 = this.f13339f;
        }
        int i6 = i3 + 77;
        f13331g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
        return z2;
    }

    public final boolean getShowDatePicker() {
        int i2 = 2 % 2;
        int i3 = f13331g + 95;
        f13332i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13341j;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean hasAnswer() {
        int i2 = 2 % 2;
        if (getAnswer2() != null) {
            int i3 = f13332i + 39;
            f13331g = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = f13331g + 69;
        f13332i = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAnswerFormatted() {
        int i2 = 2 % 2;
        int i3 = f13332i;
        int i4 = i3 + 49;
        f13331g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13340h;
        int i6 = i3 + 51;
        f13331g = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13342b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13343e = 1;

        private Companion() {
        }

        public final FormsDateInputUiState previewData$onboard_release() {
            int i2 = 2 % 2;
            FormsDateInputUiState formsDateInputUiState = new FormsDateInputUiState("testId", "What is your date of birth?", new Date(), null, false, false, 56, null);
            int i3 = f13342b + 91;
            f13343e = i3 % 128;
            int i4 = i3 % 2;
            return formsDateInputUiState;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13333l + 21;
        f13334m = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f13331g + 63;
        int i4 = i3 % 128;
        f13332i = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 57;
            f13331g = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (obj instanceof FormsDateInputUiState) {
            FormsDateInputUiState formsDateInputUiState = (FormsDateInputUiState) obj;
            if (!Intrinsics.areEqual(this.f13338e, formsDateInputUiState.f13338e)) {
                int i8 = f13331g + 77;
                f13332i = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.f13336b, formsDateInputUiState.f13336b))) {
                if (Intrinsics.areEqual(this.f13337c, formsDateInputUiState.f13337c)) {
                    if (this.f13335a != formsDateInputUiState.f13335a) {
                        return false;
                    }
                    if (this.f13339f != formsDateInputUiState.f13339f) {
                        int i10 = f13332i + 59;
                        f13331g = i10 % 128;
                        return i10 % 2 == 0;
                    }
                    if (this.f13341j == formsDateInputUiState.f13341j) {
                        return true;
                    }
                    int i11 = f13331g + 93;
                    f13332i = i11 % 128;
                    return i11 % 2 != 0;
                }
                int i12 = f13332i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f13331g = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[PHI: r3
  0x0057: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x0054, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023 A[PHI: r3
  0x0023: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x0054, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.f13331g
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.f13332i = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L41
            java.lang.String r0 = r5.f13338e
            int r0 = r0.hashCode()
            int r1 = r0 % 116
            java.lang.String r0 = r5.f13336b
            int r0 = r0.hashCode()
            int r1 = r1 - r0
            int r3 = r1 + 89
            java.util.Date r0 = r5.f13337c
            if (r0 != 0) goto L57
        L23:
            r2 = 0
        L24:
            int r3 = r3 + r2
            int r1 = r3 * 31
            com.incode.welcome_sdk.modules.DynamicForms$InputType r0 = r5.f13335a
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r5.f13339f
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r5.f13341j
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        L41:
            java.lang.String r0 = r5.f13338e
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.lang.String r0 = r5.f13336b
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r3 = r1 * 31
            java.util.Date r0 = r5.f13337c
            if (r0 != 0) goto L57
            goto L23
        L57:
            java.util.Date r0 = r5.f13337c
            int r2 = r0.hashCode()
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.f13332i
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.f13331g = r0
            int r1 = r1 % r4
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13332i + 115;
        f13331g = i3 % 128;
        if (i3 % 2 != 0) {
            return "FormsDateInputUiState(id=" + this.f13338e + ", questionText=" + this.f13336b + ", answer=" + this.f13337c + ", formInputType=" + this.f13335a + ", isValid=" + this.f13339f + ", showDatePicker=" + this.f13341j + ")";
        }
        int i4 = 82 / 0;
        return "FormsDateInputUiState(id=" + this.f13338e + ", questionText=" + this.f13336b + ", answer=" + this.f13337c + ", formInputType=" + this.f13335a + ", isValid=" + this.f13339f + ", showDatePicker=" + this.f13341j + ")";
    }

    public static /* synthetic */ FormsDateInputUiState copy$default(FormsDateInputUiState formsDateInputUiState, String str, String str2, Date date, DynamicForms.InputType inputType, boolean z2, boolean z3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f13332i + 93;
        int i5 = i4 % 128;
        f13331g = i5;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            str = formsDateInputUiState.f13338e;
        }
        if ((i2 & 2) != 0) {
            str2 = formsDateInputUiState.f13336b;
            int i6 = i5 + 19;
            f13332i = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i2 & 4) != 0) {
            int i8 = f13332i + 33;
            f13331g = i8 % 128;
            if (i8 % 2 == 0) {
                Date date2 = formsDateInputUiState.f13337c;
                throw null;
            }
            date = formsDateInputUiState.f13337c;
        }
        if ((i2 & 8) != 0) {
            int i9 = f13332i + 91;
            f13331g = i9 % 128;
            int i10 = i9 % 2;
            inputType = formsDateInputUiState.f13335a;
            if (i10 == 0) {
                int i11 = 52 / 0;
            }
        }
        if ((i2 & 16) != 0) {
            z2 = formsDateInputUiState.f13339f;
        }
        if ((i2 & 32) != 0) {
            z3 = formsDateInputUiState.f13341j;
        }
        return formsDateInputUiState.copy(str, str2, date, inputType, z2, z3);
    }

    public final FormsDateInputUiState copy(String str, String str2, Date date, DynamicForms.InputType inputType, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        FormsDateInputUiState formsDateInputUiState = new FormsDateInputUiState(str, str2, date, inputType, z2, z3);
        int i3 = f13332i + 67;
        f13331g = i3 % 128;
        if (i3 % 2 != 0) {
            return formsDateInputUiState;
        }
        throw null;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = f13331g + 93;
        int i4 = i3 % 128;
        f13332i = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f13341j;
        int i6 = i4 + 7;
        f13331g = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f13331g;
        int i4 = i3 + 17;
        f13332i = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13339f;
        int i6 = i3 + 37;
        f13332i = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final DynamicForms.InputType component4() {
        int i2 = 2 % 2;
        int i3 = f13332i;
        int i4 = i3 + 117;
        f13331g = i4 % 128;
        int i5 = i4 % 2;
        DynamicForms.InputType inputType = this.f13335a;
        int i6 = i3 + 105;
        f13331g = i6 % 128;
        int i7 = i6 % 2;
        return inputType;
    }

    public final Date component3() {
        int i2 = 2 % 2;
        int i3 = f13332i + 87;
        f13331g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13337c;
        }
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f13331g;
        int i4 = i3 + 17;
        f13332i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.f13336b;
        int i5 = i3 + 65;
        f13332i = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f13332i;
        int i4 = i3 + 9;
        f13331g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13338e;
        int i6 = i3 + 25;
        f13331g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
