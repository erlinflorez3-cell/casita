package com.incode.welcome_sdk.ui.combined_consent;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckboxState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12853c = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f12854i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12856b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12858e;

    public CheckboxState(String str, boolean z2, String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f12857d = str;
        this.f12856b = z2;
        this.f12858e = str2;
        this.f12855a = z3;
    }

    public /* synthetic */ CheckboxState(String str, boolean z2, String str2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z3);
    }

    public final String getCheckboxId() {
        int i2 = 2 % 2;
        int i3 = f12853c;
        int i4 = i3 + 89;
        f12854i = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.f12857d;
        int i5 = i3 + 111;
        f12854i = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isChecked() {
        int i2 = 2 % 2;
        int i3 = f12854i + 87;
        f12853c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f12856b;
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        return z2;
    }

    public final void setChecked(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f12854i;
        int i4 = i3 + 63;
        f12853c = i4 % 128;
        int i5 = i4 % 2;
        this.f12856b = z2;
        int i6 = i3 + 11;
        f12853c = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getText() {
        int i2 = 2 % 2;
        int i3 = f12853c + 93;
        f12854i = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f12858e;
        if (i4 == 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public final boolean isOptional() {
        int i2 = 2 % 2;
        int i3 = f12854i + 85;
        int i4 = i3 % 128;
        f12853c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f12855a;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12854i = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public CheckboxState() {
        this(null, false, null, false, 15, null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f12853c + 67;
            f12854i = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof CheckboxState)) {
            int i5 = f12853c + 29;
            f12854i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 95 / 0;
            }
            return false;
        }
        CheckboxState checkboxState = (CheckboxState) obj;
        if (!Intrinsics.areEqual(this.f12857d, checkboxState.f12857d)) {
            return false;
        }
        if (this.f12856b == checkboxState.f12856b) {
            return Intrinsics.areEqual(this.f12858e, checkboxState.f12858e) && this.f12855a == checkboxState.f12855a;
        }
        int i7 = f12853c + 17;
        f12854i = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f12853c + 13;
        f12854i = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((this.f12857d.hashCode() * 31) + Boolean.hashCode(this.f12856b)) * 31) + this.f12858e.hashCode()) * 31) + Boolean.hashCode(this.f12855a);
        int i5 = f12854i + 67;
        f12853c = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f12853c + 111;
        f12854i = i3 % 128;
        int i4 = i3 % 2;
        String str = "CheckboxState(checkboxId=" + this.f12857d + ", isChecked=" + this.f12856b + ", text=" + this.f12858e + ", isOptional=" + this.f12855a + ")";
        int i5 = f12854i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12853c = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CheckboxState copy$default(CheckboxState checkboxState, String str, boolean z2, String str2, boolean z3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = checkboxState.f12857d;
        }
        if ((i2 & 2) != 0) {
            int i4 = f12854i + 15;
            int i5 = i4 % 128;
            f12853c = i5;
            if (i4 % 2 != 0) {
                z2 = checkboxState.f12856b;
                int i6 = 48 / 0;
            } else {
                z2 = checkboxState.f12856b;
            }
            int i7 = i5 + 121;
            f12854i = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 2;
            }
        }
        if ((i2 & 4) != 0) {
            str2 = checkboxState.f12858e;
        }
        if ((i2 & 8) != 0) {
            z3 = checkboxState.f12855a;
        }
        return checkboxState.copy(str, z2, str2, z3);
    }

    public final CheckboxState copy(String str, boolean z2, String str2, boolean z3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CheckboxState checkboxState = new CheckboxState(str, z2, str2, z3);
        int i3 = f12854i + 27;
        f12853c = i3 % 128;
        int i4 = i3 % 2;
        return checkboxState;
    }

    public final boolean component4() {
        int i2 = 2 % 2;
        int i3 = f12853c + 67;
        int i4 = i3 % 128;
        f12854i = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f12855a;
        int i6 = i4 + 69;
        f12853c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f12853c;
        int i4 = i3 + 25;
        f12854i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f12858e;
        int i6 = i3 + 79;
        f12854i = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean component2() {
        int i2 = 2 % 2;
        int i3 = f12853c;
        int i4 = i3 + 71;
        f12854i = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f12856b;
        int i5 = i3 + 75;
        f12854i = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f12854i;
        int i4 = i3 + 125;
        f12853c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f12857d;
        int i6 = i3 + 25;
        f12853c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
