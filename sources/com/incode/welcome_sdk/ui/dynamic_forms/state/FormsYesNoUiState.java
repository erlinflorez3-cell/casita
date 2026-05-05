package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.DynamicForms;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsYesNoUiState implements FormsInputUiState<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f13383b = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13384f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13385g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13386h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f13387j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13388a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f13389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DynamicForms.InputType f13391e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f13392i;

    public FormsYesNoUiState(String str, String str2, Boolean bool, DynamicForms.InputType inputType, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        this.f13388a = str;
        this.f13390d = str2;
        this.f13389c = bool;
        this.f13391e = inputType;
        this.f13392i = z2;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final /* synthetic */ Boolean getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13385g + 85;
        f13386h = i3 % 128;
        int i4 = i3 % 2;
        Boolean answer = getAnswer();
        int i5 = f13385g + 25;
        f13386h = i5 % 128;
        if (i5 % 2 == 0) {
            return answer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f13385g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13386h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13388a;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getQuestionText() {
        int i2 = 2 % 2;
        int i3 = f13385g;
        int i4 = i3 + 79;
        f13386h = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f13390d;
        int i5 = i3 + 105;
        f13386h = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final Boolean getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13386h;
        int i4 = i3 + 65;
        f13385g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.f13389c;
        int i5 = i3 + 33;
        f13385g = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public /* synthetic */ FormsYesNoUiState(String str, String str2, Boolean bool, DynamicForms.InputType inputType, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? DynamicForms.InputType.YESNO : inputType, (i2 & 16) != 0 ? true : z2);
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final DynamicForms.InputType getFormInputType() {
        int i2 = 2 % 2;
        int i3 = f13386h + 91;
        int i4 = i3 % 128;
        f13385g = i4;
        int i5 = i3 % 2;
        DynamicForms.InputType inputType = this.f13391e;
        int i6 = i4 + 51;
        f13386h = i6 % 128;
        if (i6 % 2 == 0) {
            return inputType;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f13386h;
        int i4 = i3 + 111;
        f13385g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f13392i;
        int i5 = i3 + 85;
        f13385g = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean hasAnswer() {
        int i2 = 2 % 2;
        if (getAnswer() == null) {
            int i3 = f13386h + 125;
            f13385g = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i4 = f13386h + 117;
        int i5 = i4 % 128;
        f13385g = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 125;
        f13386h = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 6 / 0;
        }
        return true;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13393d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13394e = 1;

        private Companion() {
        }

        public final FormsYesNoUiState previewData$onboard_release() {
            int i2 = 2 % 2;
            FormsYesNoUiState formsYesNoUiState = new FormsYesNoUiState("testId", "Are you ok?", Boolean.TRUE, null, false, 24, null);
            int i3 = f13393d + 61;
            f13394e = i3 % 128;
            if (i3 % 2 != 0) {
                return formsYesNoUiState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13384f + 85;
        f13387j = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f13386h + 51;
        int i4 = i3 % 128;
        f13385g = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormsYesNoUiState)) {
            int i6 = i4 + 91;
            f13386h = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        FormsYesNoUiState formsYesNoUiState = (FormsYesNoUiState) obj;
        if (!Intrinsics.areEqual(this.f13388a, formsYesNoUiState.f13388a)) {
            int i8 = f13385g + 1;
            f13386h = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f13390d, formsYesNoUiState.f13390d)) {
            return Intrinsics.areEqual(this.f13389c, formsYesNoUiState.f13389c) && this.f13391e == formsYesNoUiState.f13391e && this.f13392i == formsYesNoUiState.f13392i;
        }
        int i10 = f13386h + 31;
        f13385g = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f13386h + 117;
        f13385g = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((this.f13388a.hashCode() * 31) + this.f13390d.hashCode()) * 31;
        Boolean bool = this.f13389c;
        if (bool == null) {
            int i5 = f13386h + 57;
            f13385g = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        return ((((iHashCode2 + iHashCode) * 31) + this.f13391e.hashCode()) * 31) + Boolean.hashCode(this.f13392i);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13385g + 115;
        f13386h = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "FormsYesNoUiState(id=" + this.f13388a + ", questionText=" + this.f13390d + ", answer=" + this.f13389c + ", formInputType=" + this.f13391e + ", isValid=" + this.f13392i + ")";
            throw null;
        }
        String str2 = "FormsYesNoUiState(id=" + this.f13388a + ", questionText=" + this.f13390d + ", answer=" + this.f13389c + ", formInputType=" + this.f13391e + ", isValid=" + this.f13392i + ")";
        int i4 = f13386h + 59;
        f13385g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return str2;
    }

    public static /* synthetic */ FormsYesNoUiState copy$default(FormsYesNoUiState formsYesNoUiState, String str, String str2, Boolean bool, DynamicForms.InputType inputType, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f13385g;
        int i5 = i4 + 47;
        f13386h = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 107;
            f13386h = i7 % 128;
            int i8 = i7 % 2;
            str = formsYesNoUiState.f13388a;
            int i9 = i4 + 37;
            f13386h = i9 % 128;
            int i10 = i9 % 2;
        }
        if ((i2 & 2) != 0) {
            str2 = formsYesNoUiState.f13390d;
            int i11 = i4 + 9;
            f13386h = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i2 & 4) != 0) {
            bool = formsYesNoUiState.f13389c;
        }
        if ((i2 & 8) != 0) {
            inputType = formsYesNoUiState.f13391e;
        }
        if ((i2 & 16) != 0) {
            int i13 = f13386h + 115;
            f13385g = i13 % 128;
            int i14 = i13 % 2;
            z2 = formsYesNoUiState.f13392i;
        }
        FormsYesNoUiState formsYesNoUiStateCopy = formsYesNoUiState.copy(str, str2, bool, inputType, z2);
        int i15 = f13386h + 31;
        f13385g = i15 % 128;
        if (i15 % 2 != 0) {
            return formsYesNoUiStateCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final FormsYesNoUiState copy(String str, String str2, Boolean bool, DynamicForms.InputType inputType, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        FormsYesNoUiState formsYesNoUiState = new FormsYesNoUiState(str, str2, bool, inputType, z2);
        int i3 = f13386h + 31;
        f13385g = i3 % 128;
        int i4 = i3 % 2;
        return formsYesNoUiState;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f13386h;
        int i4 = i3 + 53;
        f13385g = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13392i;
        int i6 = i3 + 99;
        f13385g = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final DynamicForms.InputType component4() {
        int i2 = 2 % 2;
        int i3 = f13385g;
        int i4 = i3 + 97;
        f13386h = i4 % 128;
        int i5 = i4 % 2;
        DynamicForms.InputType inputType = this.f13391e;
        int i6 = i3 + 49;
        f13386h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
        }
        return inputType;
    }

    public final Boolean component3() {
        int i2 = 2 % 2;
        int i3 = f13386h;
        int i4 = i3 + 59;
        f13385g = i4 % 128;
        int i5 = i4 % 2;
        Boolean bool = this.f13389c;
        int i6 = i3 + 107;
        f13385g = i6 % 128;
        if (i6 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i2 = 2 % 2;
        int i3 = f13386h + 99;
        int i4 = i3 % 128;
        f13385g = i4;
        if (i3 % 2 == 0) {
            str = this.f13390d;
            int i5 = 29 / 0;
        } else {
            str = this.f13390d;
        }
        int i6 = i4 + 95;
        f13386h = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f13386h + 23;
        int i4 = i3 % 128;
        f13385g = i4;
        int i5 = i3 % 2;
        String str = this.f13388a;
        int i6 = i4 + 63;
        f13386h = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
