package com.incode.welcome_sdk.ui.dynamic_forms.state;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormsContainerUiState {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f13302g = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f13303i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<FormsInputUiState<?>> f13305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f13308e;

    /* JADX WARN: Multi-variable type inference failed */
    public FormsContainerUiState(List<? extends FormsInputUiState<?>> list, String str, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f13305b = list;
        this.f13306c = str;
        this.f13304a = z2;
        this.f13307d = z3;
        this.f13308e = z4;
    }

    public /* synthetic */ FormsContainerUiState(List list, String str, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) == 0 ? z4 : false);
    }

    public final List<FormsInputUiState<?>> getQuestions() {
        int i2 = 2 % 2;
        int i3 = f13303i + 29;
        f13302g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13305b;
        }
        throw null;
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f13303i + 125;
        int i4 = i3 % 128;
        f13302g = i4;
        int i5 = i3 % 2;
        String str = this.f13306c;
        int i6 = i4 + 65;
        f13303i = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLast() {
        int i2 = 2 % 2;
        int i3 = f13302g + 23;
        int i4 = i3 % 128;
        f13303i = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f13304a;
        int i6 = i4 + 45;
        f13302g = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i2 = 2 % 2;
        int i3 = f13303i;
        int i4 = i3 + 113;
        f13302g = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13307d;
        int i6 = i3 + 49;
        f13302g = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean isFormValid() {
        int i2 = 2 % 2;
        int i3 = f13302g + 65;
        int i4 = i3 % 128;
        f13303i = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f13308e;
        int i6 = i4 + 13;
        f13302g = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f13303i;
        int i4 = i3 + 7;
        f13302g = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            int i6 = i3 + 1;
            f13302g = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof FormsContainerUiState)) {
            return false;
        }
        FormsContainerUiState formsContainerUiState = (FormsContainerUiState) obj;
        if (!Intrinsics.areEqual(this.f13305b, formsContainerUiState.f13305b)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f13306c, formsContainerUiState.f13306c)) {
            int i8 = f13302g + 27;
            f13303i = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.f13304a != formsContainerUiState.f13304a) {
            return false;
        }
        if (this.f13307d == formsContainerUiState.f13307d) {
            return this.f13308e == formsContainerUiState.f13308e;
        }
        int i10 = f13302g + 17;
        f13303i = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f13303i + 51;
        f13302g = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = this.f13305b.hashCode() * 31;
        String str = this.f13306c;
        if (str == null) {
            int i5 = f13303i + 37;
            f13302g = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i6 = f13303i + 27;
            f13302g = i6 % 128;
            int i7 = i6 % 2;
        }
        return ((((((iHashCode2 + iHashCode) * 31) + Boolean.hashCode(this.f13304a)) * 31) + Boolean.hashCode(this.f13307d)) * 31) + Boolean.hashCode(this.f13308e);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f13303i + 63;
        f13302g = i3 % 128;
        if (i3 % 2 != 0) {
            return "FormsContainerUiState(questions=" + this.f13305b + ", title=" + this.f13306c + ", isLast=" + this.f13304a + ", isLoading=" + this.f13307d + ", isFormValid=" + this.f13308e + ")";
        }
        String str = "FormsContainerUiState(questions=" + this.f13305b + ", title=" + this.f13306c + ", isLast=" + this.f13304a + ", isLoading=" + this.f13307d + ", isFormValid=" + this.f13308e + ")";
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormsContainerUiState copy$default(FormsContainerUiState formsContainerUiState, List list, String str, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f13303i;
        int i5 = i4 + 121;
        f13302g = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            list = formsContainerUiState.f13305b;
            int i7 = i4 + 111;
            f13302g = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 2) != 0) {
            str = formsContainerUiState.f13306c;
        }
        if ((i2 & 4) != 0) {
            z2 = formsContainerUiState.f13304a;
        }
        if ((i2 & 8) != 0) {
            int i9 = f13302g + 19;
            f13303i = i9 % 128;
            int i10 = i9 % 2;
            z3 = formsContainerUiState.f13307d;
        }
        if ((i2 & 16) != 0) {
            z4 = formsContainerUiState.f13308e;
        }
        return formsContainerUiState.copy(list, str, z2, z3, z4);
    }

    public final FormsContainerUiState copy(List<? extends FormsInputUiState<?>> list, String str, boolean z2, boolean z3, boolean z4) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        FormsContainerUiState formsContainerUiState = new FormsContainerUiState(list, str, z2, z3, z4);
        int i3 = f13302g + 43;
        f13303i = i3 % 128;
        if (i3 % 2 == 0) {
            return formsContainerUiState;
        }
        throw null;
    }

    public final boolean component5() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f13303i + 25;
        int i4 = i3 % 128;
        f13302g = i4;
        if (i3 % 2 == 0) {
            z2 = this.f13308e;
            int i5 = 17 / 0;
        } else {
            z2 = this.f13308e;
        }
        int i6 = i4 + 91;
        f13303i = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component4() {
        int i2 = 2 % 2;
        int i3 = f13302g;
        int i4 = i3 + 27;
        f13303i = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f13307d;
        int i5 = i3 + 21;
        f13303i = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean component3() {
        int i2 = 2 % 2;
        int i3 = f13303i;
        int i4 = i3 + 75;
        f13302g = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f13304a;
        int i6 = i3 + 77;
        f13302g = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f13303i + 83;
        f13302g = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f13306c;
        }
        throw null;
    }

    public final List<FormsInputUiState<?>> component1() {
        int i2 = 2 % 2;
        int i3 = f13303i + 91;
        f13302g = i3 % 128;
        int i4 = i3 % 2;
        List<FormsInputUiState<?>> list = this.f13305b;
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        return list;
    }
}
