package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.incode.welcome_sdk.modules.DynamicForms;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsPhoneInputUiState implements FormsInputUiState<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f13344a = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13345g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13346i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f13347j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f13348k = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DynamicForms.InputType f13352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13353f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f13354h;

    public FormsPhoneInputUiState(String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        this.f13349b = str;
        this.f13350c = str2;
        this.f13351d = str3;
        this.f13352e = inputType;
        this.f13354h = z2;
        this.f13353f = str4;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final /* bridge */ /* synthetic */ String getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13345g + 3;
        f13347j = i3 % 128;
        int i4 = i3 % 2;
        String answer2 = getAnswer2();
        int i5 = f13345g + 53;
        f13347j = i5 % 128;
        if (i5 % 2 == 0) {
            return answer2;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f13345g + 47;
        f13347j = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13349b;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getQuestionText() {
        int i2 = 2 % 2;
        int i3 = f13345g + 103;
        f13347j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f13350c;
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        return str;
    }

    public /* synthetic */ FormsPhoneInputUiState(String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? DynamicForms.InputType.PHONE : inputType, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? null : str4);
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    /* JADX INFO: renamed from: getAnswer, reason: avoid collision after fix types in other method */
    public final String getAnswer2() {
        int i2 = 2 % 2;
        int i3 = f13345g;
        int i4 = i3 + 87;
        f13347j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13351d;
        int i6 = i3 + 69;
        f13347j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final DynamicForms.InputType getFormInputType() {
        int i2 = 2 % 2;
        int i3 = f13347j;
        int i4 = i3 + 25;
        f13345g = i4 % 128;
        int i5 = i4 % 2;
        DynamicForms.InputType inputType = this.f13352e;
        int i6 = i3 + 15;
        f13345g = i6 % 128;
        int i7 = i6 % 2;
        return inputType;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f13347j + 101;
        f13345g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13354h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFlagEmoji() {
        String str;
        int i2 = 2 % 2;
        int i3 = f13345g + 83;
        int i4 = i3 % 128;
        f13347j = i4;
        if (i3 % 2 != 0) {
            str = this.f13353f;
            int i5 = 21 / 0;
        } else {
            str = this.f13353f;
        }
        int i6 = i4 + 39;
        f13345g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean hasAnswer() {
        int i2 = 2 % 2;
        int i3 = f13347j + 47;
        f13345g = i3 % 128;
        if (i3 % 2 == 0) {
            StringsKt.isBlank(getAnswer2());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!StringsKt.isBlank(getAnswer2())) {
            return true;
        }
        int i4 = f13345g + 39;
        f13347j = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13355a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13356b = 0;

        private Companion() {
        }

        public final FormsPhoneInputUiState previewData$onboard_release() {
            int i2 = 2 % 2;
            FormsPhoneInputUiState formsPhoneInputUiState = new FormsPhoneInputUiState("testId", "What is your phone number?", "+1", null, false, null, 56, null);
            int i3 = f13355a + 51;
            f13356b = i3 % 128;
            int i4 = i3 % 2;
            return formsPhoneInputUiState;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13348k + 23;
        f13346i = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f13345g + 47;
        int i4 = i3 % 128;
        f13347j = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormsPhoneInputUiState)) {
            int i6 = i4 + 109;
            f13345g = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        FormsPhoneInputUiState formsPhoneInputUiState = (FormsPhoneInputUiState) obj;
        if (!Intrinsics.areEqual(this.f13349b, formsPhoneInputUiState.f13349b)) {
            int i8 = f13345g + 81;
            f13347j = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f13350c, formsPhoneInputUiState.f13350c) || (!Intrinsics.areEqual(this.f13351d, formsPhoneInputUiState.f13351d))) {
            return false;
        }
        if (this.f13352e != formsPhoneInputUiState.f13352e) {
            int i9 = f13345g + 21;
            f13347j = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.f13354h != formsPhoneInputUiState.f13354h) {
            return false;
        }
        if (Intrinsics.areEqual(this.f13353f, formsPhoneInputUiState.f13353f)) {
            return true;
        }
        int i11 = f13345g + 85;
        f13347j = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f13345g + 1;
        f13347j = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((((((((this.f13349b.hashCode() * 31) + this.f13350c.hashCode()) * 31) + this.f13351d.hashCode()) * 31) + this.f13352e.hashCode()) * 31) + Boolean.hashCode(this.f13354h)) * 31;
        String str = this.f13353f;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i5 = f13345g + 111;
            f13347j = i5 % 128;
            int i6 = i5 % 2;
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13345g + 81;
        f13347j = i3 % 128;
        int i4 = i3 % 2;
        String str = "FormsPhoneInputUiState(id=" + this.f13349b + ", questionText=" + this.f13350c + ", answer=" + this.f13351d + ", formInputType=" + this.f13352e + ", isValid=" + this.f13354h + ", flagEmoji=" + this.f13353f + ")";
        int i5 = f13345g + 33;
        f13347j = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public static /* synthetic */ FormsPhoneInputUiState copy$default(FormsPhoneInputUiState formsPhoneInputUiState, String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, String str4, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f13347j + 45;
        int i5 = i4 % 128;
        f13345g = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            str = formsPhoneInputUiState.f13349b;
        }
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 121;
            f13347j = i7 % 128;
            if (i7 % 2 != 0) {
                String str5 = formsPhoneInputUiState.f13350c;
                throw null;
            }
            str2 = formsPhoneInputUiState.f13350c;
        }
        if ((i2 & 4) != 0) {
            str3 = formsPhoneInputUiState.f13351d;
            int i8 = f13347j + 43;
            f13345g = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i2 & 8) != 0) {
            int i10 = f13347j + 47;
            f13345g = i10 % 128;
            if (i10 % 2 == 0) {
                DynamicForms.InputType inputType2 = formsPhoneInputUiState.f13352e;
                obj2.hashCode();
                throw null;
            }
            inputType = formsPhoneInputUiState.f13352e;
        }
        if ((i2 & 16) != 0) {
            z2 = formsPhoneInputUiState.f13354h;
        }
        if ((i2 & 32) != 0) {
            int i11 = f13345g + 51;
            f13347j = i11 % 128;
            int i12 = i11 % 2;
            str4 = formsPhoneInputUiState.f13353f;
        }
        return formsPhoneInputUiState.copy(str, str2, str3, inputType, z2, str4);
    }

    public final FormsPhoneInputUiState copy(String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, String str4) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        FormsPhoneInputUiState formsPhoneInputUiState = new FormsPhoneInputUiState(str, str2, str3, inputType, z2, str4);
        int i3 = f13345g + 17;
        f13347j = i3 % 128;
        int i4 = i3 % 2;
        return formsPhoneInputUiState;
    }

    public final String component6() {
        String str;
        int i2 = 2 % 2;
        int i3 = f13345g;
        int i4 = i3 + 5;
        f13347j = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f13353f;
            int i5 = 50 / 0;
        } else {
            str = this.f13353f;
        }
        int i6 = i3 + 59;
        f13347j = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f13345g + 123;
        int i4 = i3 % 128;
        f13347j = i4;
        if (i3 % 2 != 0) {
            z2 = this.f13354h;
            int i5 = 92 / 0;
        } else {
            z2 = this.f13354h;
        }
        int i6 = i4 + 33;
        f13345g = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final DynamicForms.InputType component4() {
        int i2 = 2 % 2;
        int i3 = f13345g + 25;
        int i4 = i3 % 128;
        f13347j = i4;
        int i5 = i3 % 2;
        DynamicForms.InputType inputType = this.f13352e;
        int i6 = i4 + 99;
        f13345g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return inputType;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f13345g;
        int i4 = i3 + 73;
        f13347j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13351d;
        int i6 = i3 + 23;
        f13347j = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f13345g;
        int i4 = i3 + 115;
        f13347j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13350c;
        int i6 = i3 + 41;
        f13347j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f13345g + 47;
        f13347j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f13349b;
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
        return str;
    }
}
