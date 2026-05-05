package com.incode.welcome_sdk.ui.dynamic_forms.state;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.DynamicForms;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsSelectInputUiState implements FormsInputUiState<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f13357d = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f13358f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f13359h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13360i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f13361n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f13362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13364c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13365e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DynamicForms.InputType f13366g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f13367j;

    public FormsSelectInputUiState(List<String> list, String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        this.f13362a = list;
        this.f13364c = str;
        this.f13365e = str2;
        this.f13363b = str3;
        this.f13366g = inputType;
        this.f13367j = z2;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final /* bridge */ /* synthetic */ String getAnswer() {
        int i2 = 2 % 2;
        int i3 = f13360i + 65;
        f13358f = i3 % 128;
        int i4 = i3 % 2;
        String answer2 = getAnswer2();
        if (i4 == 0) {
            int i5 = 16 / 0;
        }
        return answer2;
    }

    public final List<String> getOptions() {
        int i2 = 2 % 2;
        int i3 = f13358f + 79;
        int i4 = i3 % 128;
        f13360i = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f13362a;
        int i5 = i4 + 109;
        f13358f = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f13360i + 123;
        int i4 = i3 % 128;
        f13358f = i4;
        int i5 = i3 % 2;
        String str = this.f13364c;
        int i6 = i4 + 23;
        f13360i = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final String getQuestionText() {
        int i2 = 2 % 2;
        int i3 = f13358f + 15;
        f13360i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13365e;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FormsSelectInputUiState(List list, String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = z2;
        DynamicForms.InputType inputType2 = inputType;
        String str4 = str3;
        if ((i2 & 8) != 0 && (str4 = (String) CollectionsKt.firstOrNull(list)) == null) {
            str4 = "";
        }
        this(list, str, str2, str4, (i2 & 16) != 0 ? DynamicForms.InputType.SELECT : inputType2, (i2 & 32) != 0 ? true : z3);
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    /* JADX INFO: renamed from: getAnswer, reason: avoid collision after fix types in other method */
    public final String getAnswer2() {
        int i2 = 2 % 2;
        int i3 = f13358f + 87;
        int i4 = i3 % 128;
        f13360i = i4;
        int i5 = i3 % 2;
        String str = this.f13363b;
        int i6 = i4 + 49;
        f13358f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final DynamicForms.InputType getFormInputType() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + 29;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        DynamicForms.InputType inputType = this.f13366g;
        int i6 = i3 + 79;
        f13360i = i6 % 128;
        int i7 = i6 % 2;
        return inputType;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean isValid() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + 73;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13367j;
        int i6 = i3 + 3;
        f13360i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 16 / 0;
        }
        return z2;
    }

    @Override // com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState
    public final boolean hasAnswer() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + 13;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 67;
        f13360i = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13368a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13369c = 0;

        private Companion() {
        }

        public final FormsSelectInputUiState previewData$onboard_release() {
            int i2 = 2 % 2;
            FormsSelectInputUiState formsSelectInputUiState = new FormsSelectInputUiState(CollectionsKt.listOf((Object[]) new String[]{"I am great", "I am fine"}), "testId", "How are you today?", "I feel good.", null, false, 48, null);
            int i3 = f13368a + 93;
            f13369c = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 8 / 0;
            }
            return formsSelectInputUiState;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f13361n + 81;
        f13359h = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormsSelectInputUiState)) {
            return false;
        }
        FormsSelectInputUiState formsSelectInputUiState = (FormsSelectInputUiState) obj;
        if (!Intrinsics.areEqual(this.f13362a, formsSelectInputUiState.f13362a)) {
            int i3 = f13358f + 93;
            f13360i = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f13364c, formsSelectInputUiState.f13364c) || !Intrinsics.areEqual(this.f13365e, formsSelectInputUiState.f13365e)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f13363b, formsSelectInputUiState.f13363b)) {
            return this.f13366g == formsSelectInputUiState.f13366g && this.f13367j == formsSelectInputUiState.f13367j;
        }
        int i5 = f13360i + 59;
        f13358f = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f13358f + 63;
        f13360i = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((this.f13362a.hashCode() * 31) + this.f13364c.hashCode()) * 31) + this.f13365e.hashCode()) * 31) + this.f13363b.hashCode()) * 31) + this.f13366g.hashCode()) * 31) + Boolean.hashCode(this.f13367j);
        int i5 = f13360i + 55;
        f13358f = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13360i + 81;
        f13358f = i3 % 128;
        int i4 = i3 % 2;
        String str = "FormsSelectInputUiState(options=" + this.f13362a + ", id=" + this.f13364c + ", questionText=" + this.f13365e + ", answer=" + this.f13363b + ", formInputType=" + this.f13366g + ", isValid=" + this.f13367j + ")";
        int i5 = f13358f + 53;
        f13360i = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormsSelectInputUiState copy$default(FormsSelectInputUiState formsSelectInputUiState, List list, String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f13358f + 53;
        int i5 = i4 % 128;
        f13360i = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            list = formsSelectInputUiState.f13362a;
        }
        if ((i2 & 2) != 0) {
            str = formsSelectInputUiState.f13364c;
        }
        if ((i2 & 4) != 0) {
            int i7 = i5 + 23;
            f13358f = i7 % 128;
            int i8 = i7 % 2;
            str2 = formsSelectInputUiState.f13365e;
        }
        if ((i2 & 8) != 0) {
            int i9 = f13358f + 21;
            f13360i = i9 % 128;
            if (i9 % 2 != 0) {
                String str4 = formsSelectInputUiState.f13363b;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = formsSelectInputUiState.f13363b;
        }
        if ((i2 & 16) != 0) {
            int i10 = f13360i + 113;
            f13358f = i10 % 128;
            int i11 = i10 % 2;
            inputType = formsSelectInputUiState.f13366g;
            if (i11 == 0) {
                int i12 = 13 / 0;
            }
        }
        if ((i2 & 32) != 0) {
            z2 = formsSelectInputUiState.f13367j;
        }
        return formsSelectInputUiState.copy(list, str, str2, str3, inputType, z2);
    }

    public final FormsSelectInputUiState copy(List<String> list, String str, String str2, String str3, DynamicForms.InputType inputType, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(inputType, "");
        FormsSelectInputUiState formsSelectInputUiState = new FormsSelectInputUiState(list, str, str2, str3, inputType, z2);
        int i3 = f13358f + 15;
        f13360i = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return formsSelectInputUiState;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + 79;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13367j;
        int i6 = i3 + 1;
        f13360i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
        return z2;
    }

    public final DynamicForms.InputType component5() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + 3;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        DynamicForms.InputType inputType = this.f13366g;
        int i6 = i3 + 123;
        f13360i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
        return inputType;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f13360i;
        int i4 = i3 + 79;
        f13358f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13363b;
        int i6 = i3 + 121;
        f13358f = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 69 / 0;
        }
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13365e;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13360i = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f13358f;
        int i4 = i3 + 35;
        f13360i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f13364c;
        int i6 = i3 + 73;
        f13360i = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<String> component1() {
        int i2 = 2 % 2;
        int i3 = f13358f + 19;
        f13360i = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13362a;
        }
        throw null;
    }
}
