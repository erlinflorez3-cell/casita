package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.incode.welcome_sdk.modules.DynamicForms;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsTextInputUiState implements FormsInputUiState<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f13370a = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13371g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13372h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13373i = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f13374n = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DynamicForms.InputType f13376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextInputType f13379f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13380j;

    public FormsTextInputUiState(String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, TextInputType textInputType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        Intrinsics.checkNotNullParameter(textInputType, "");
        this.f13375b = str;
        this.f13378e = str2;
        this.f13377d = str3;
        this.f13376c = inputType;
        this.f13380j = z2;
        this.f13379f = textInputType;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final /* bridge */ /* synthetic */ String getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13373i + 111;
        f13372h = i3 % 128;
        if (i3 % 2 == 0) {
            return getAnswer2();
        }
        getAnswer2();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f13373i;
        int i4 = i3 + 21;
        f13372h = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13375b;
        int i6 = i3 + 1;
        f13372h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
        return str;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getQuestionText() {
        int i2 = 2 % 2;
        int i3 = f13372h;
        int i4 = i3 + 79;
        f13373i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f13378e;
        int i5 = i3 + 13;
        f13373i = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ FormsTextInputUiState(String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, TextInputType textInputType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, inputType, (i2 & 16) != 0 ? true : z2, textInputType);
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    /* JADX INFO: renamed from: getAnswer, reason: avoid collision after fix types in other method */
    public final String getAnswer2() {
        int i2 = 2 % 2;
        int i3 = f13373i + 5;
        f13372h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13377d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final DynamicForms.InputType getFormInputType() {
        int i2 = 2 % 2;
        int i3 = f13372h + 111;
        int i4 = i3 % 128;
        f13373i = i4;
        int i5 = i3 % 2;
        DynamicForms.InputType inputType = this.f13376c;
        int i6 = i4 + 95;
        f13372h = i6 % 128;
        int i7 = i6 % 2;
        return inputType;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f13373i;
        int i4 = i3 + 13;
        f13372h = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13380j;
        int i6 = i3 + 61;
        f13372h = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final TextInputType getTextInputType() {
        int i2 = 2 % 2;
        int i3 = f13372h;
        int i4 = i3 + 19;
        f13373i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        TextInputType textInputType = this.f13379f;
        int i5 = i3 + 61;
        f13373i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return textInputType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (kotlin.text.StringsKt.isBlank(getAnswer2()) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (kotlin.text.StringsKt.isBlank(getAnswer2()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13372h + 3;
        com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13373i = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasAnswer() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13372h
            int r1 = r0 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13373i = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L1f
            java.lang.String r0 = r4.getAnswer2()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = kotlin.text.StringsKt.isBlank(r0)
            r0 = 56
            int r0 = r0 / r2
            if (r1 == 0) goto L2b
        L1e:
            return r2
        L1f:
            java.lang.String r0 = r4.getAnswer2()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L1e
        L2b:
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13372h
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.f13373i = r0
            int r1 = r1 % r3
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState.hasAnswer():boolean");
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13381b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13382c = 1;

        private Companion() {
        }

        public final FormsTextInputUiState previewTextData$onboard_release() {
            int i2 = 2 % 2;
            FormsTextInputUiState formsTextInputUiState = new FormsTextInputUiState("testId", "What is your name?", null, DynamicForms.InputType.TEXT, false, TextInputType.f13397c, 20, null);
            int i3 = f13382c + 109;
            f13381b = i3 % 128;
            if (i3 % 2 == 0) {
                return formsTextInputUiState;
            }
            throw null;
        }

        public final FormsTextInputUiState previewEmailData$onboard_release() {
            int i2 = 2 % 2;
            FormsTextInputUiState formsTextInputUiState = new FormsTextInputUiState("testId", "What is your email?", null, DynamicForms.InputType.EMAIL, false, TextInputType.f13399e, 20, null);
            int i3 = f13381b + 33;
            f13382c = i3 % 128;
            int i4 = i3 % 2;
            return formsTextInputUiState;
        }

        public final FormsTextInputUiState previewCpfData$onboard_release() {
            int i2 = 2 % 2;
            FormsTextInputUiState formsTextInputUiState = new FormsTextInputUiState("testId", "What is your CPF?", null, DynamicForms.InputType.CPF, false, TextInputType.f13398d, 20, null);
            int i3 = f13381b + 69;
            f13382c = i3 % 128;
            int i4 = i3 % 2;
            return formsTextInputUiState;
        }

        public final FormsTextInputUiState previewIdNumberData$onboard_release() {
            int i2 = 2 % 2;
            FormsTextInputUiState formsTextInputUiState = new FormsTextInputUiState("testId", "What is your ID?", null, DynamicForms.InputType.NUMBER, false, TextInputType.f13395a, 20, null);
            int i3 = f13382c + 61;
            f13381b = i3 % 128;
            int i4 = i3 % 2;
            return formsTextInputUiState;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13374n + 55;
        f13371g = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormsTextInputUiState)) {
            return false;
        }
        FormsTextInputUiState formsTextInputUiState = (FormsTextInputUiState) obj;
        if (!Intrinsics.areEqual(this.f13375b, formsTextInputUiState.f13375b)) {
            int i3 = f13373i + 75;
            f13372h = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f13378e, formsTextInputUiState.f13378e) || !Intrinsics.areEqual(this.f13377d, formsTextInputUiState.f13377d)) {
            return false;
        }
        if (this.f13376c == formsTextInputUiState.f13376c) {
            if (this.f13380j == formsTextInputUiState.f13380j) {
                return this.f13379f == formsTextInputUiState.f13379f;
            }
            int i5 = f13373i + 71;
            f13372h = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = f13373i;
        int i8 = i7 + 65;
        f13372h = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 13;
        f13372h = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f13373i + 99;
        f13372h = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((this.f13375b.hashCode() * 31) + this.f13378e.hashCode()) * 31) + this.f13377d.hashCode()) * 31) + this.f13376c.hashCode()) * 31) + Boolean.hashCode(this.f13380j)) * 31) + this.f13379f.hashCode();
        int i5 = f13372h + 13;
        f13373i = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13372h + 33;
        f13373i = i3 % 128;
        int i4 = i3 % 2;
        String str = "FormsTextInputUiState(id=" + this.f13375b + ", questionText=" + this.f13378e + ", answer=" + this.f13377d + ", formInputType=" + this.f13376c + ", isValid=" + this.f13380j + ", textInputType=" + this.f13379f + ")";
        int i5 = f13373i + 59;
        f13372h = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ FormsTextInputUiState copy$default(FormsTextInputUiState formsTextInputUiState, String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, TextInputType textInputType, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f13372h + 77;
            f13373i = i4 % 128;
            int i5 = i4 % 2;
            str = formsTextInputUiState.f13375b;
        }
        if ((i2 & 2) != 0) {
            str2 = formsTextInputUiState.f13378e;
        }
        if ((i2 & 4) != 0) {
            str3 = formsTextInputUiState.f13377d;
        }
        if ((i2 & 8) != 0) {
            int i6 = f13372h + 91;
            f13373i = i6 % 128;
            if (i6 % 2 == 0) {
                DynamicForms.InputType inputType2 = formsTextInputUiState.f13376c;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            inputType = formsTextInputUiState.f13376c;
        }
        if ((i2 & 16) != 0) {
            z2 = formsTextInputUiState.f13380j;
        }
        if ((i2 & 32) != 0) {
            textInputType = formsTextInputUiState.f13379f;
        }
        return formsTextInputUiState.copy(str, str2, str3, inputType, z2, textInputType);
    }

    public final FormsTextInputUiState copy(String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, TextInputType textInputType) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        Intrinsics.checkNotNullParameter(textInputType, "");
        FormsTextInputUiState formsTextInputUiState = new FormsTextInputUiState(str, str2, str3, inputType, z2, textInputType);
        int i3 = f13373i + 71;
        f13372h = i3 % 128;
        int i4 = i3 % 2;
        return formsTextInputUiState;
    }

    public final TextInputType component6() {
        int i2 = 2 % 2;
        int i3 = f13373i + 21;
        f13372h = i3 % 128;
        int i4 = i3 % 2;
        TextInputType textInputType = this.f13379f;
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        return textInputType;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f13372h + 99;
        f13373i = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13380j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DynamicForms.InputType component4() {
        int i2 = 2 % 2;
        int i3 = f13373i;
        int i4 = i3 + 71;
        f13372h = i4 % 128;
        int i5 = i4 % 2;
        DynamicForms.InputType inputType = this.f13376c;
        int i6 = i3 + 7;
        f13372h = i6 % 128;
        if (i6 % 2 == 0) {
            return inputType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        String str;
        int i2 = 2 % 2;
        int i3 = f13372h;
        int i4 = i3 + 51;
        f13373i = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.f13377d;
            int i5 = 70 / 0;
        } else {
            str = this.f13377d;
        }
        int i6 = i3 + 5;
        f13373i = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f13372h;
        int i4 = i3 + 11;
        f13373i = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f13378e;
        int i5 = i3 + 61;
        f13373i = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f13372h + 1;
        f13373i = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f13375b;
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        return str;
    }
}
