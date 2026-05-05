package com.incode.welcome_sdk.ui.combined_consent;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CombinedConsentUiState {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12895g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12896j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<CheckboxState> f12898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12901e;

    public CombinedConsentUiState(String str, String str2, String str3, List<CheckboxState> list, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f12900d = str;
        this.f12901e = str2;
        this.f12899c = str3;
        this.f12898b = list;
        this.f12897a = z2;
    }

    public /* synthetic */ CombinedConsentUiState(String str, String str2, String str3, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? CollectionsKt.listOf(new CheckboxState(null, false, null, false, 15, null)) : list, (i2 & 16) != 0 ? false : z2);
    }

    public final String getLanguageConsentId() {
        int i2 = 2 % 2;
        int i3 = f12896j + 121;
        int i4 = i3 % 128;
        f12895g = i4;
        int i5 = i3 % 2;
        String str = this.f12900d;
        int i6 = i4 + 83;
        f12896j = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f12895g;
        int i4 = i3 + 109;
        f12896j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f12901e;
        int i6 = i3 + 45;
        f12896j = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTerms() {
        int i2 = 2 % 2;
        int i3 = f12895g + 113;
        f12896j = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12899c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<CheckboxState> getConsents() {
        int i2 = 2 % 2;
        int i3 = f12896j + 49;
        int i4 = i3 % 128;
        f12895g = i4;
        int i5 = i3 % 2;
        List<CheckboxState> list = this.f12898b;
        int i6 = i4 + 117;
        f12896j = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final boolean isPageLoaded() {
        int i2 = 2 % 2;
        int i3 = f12895g;
        int i4 = i3 + 39;
        f12896j = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f12897a;
        int i6 = i3 + 121;
        f12896j = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public CombinedConsentUiState() {
        this(null, null, null, null, false, 31, null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f12895g + 121;
        int i4 = i3 % 128;
        f12896j = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedConsentUiState)) {
            int i6 = i4 + 19;
            int i7 = i6 % 128;
            f12895g = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 99;
            f12896j = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        CombinedConsentUiState combinedConsentUiState = (CombinedConsentUiState) obj;
        if (!Intrinsics.areEqual(this.f12900d, combinedConsentUiState.f12900d)) {
            int i11 = f12896j + 107;
            f12895g = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f12901e, combinedConsentUiState.f12901e)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f12899c, combinedConsentUiState.f12899c)) {
            return Intrinsics.areEqual(this.f12898b, combinedConsentUiState.f12898b) && this.f12897a == combinedConsentUiState.f12897a;
        }
        int i13 = f12895g + 9;
        f12896j = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f12895g + 89;
        f12896j = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((this.f12900d.hashCode() * 31) + this.f12901e.hashCode()) * 31) + this.f12899c.hashCode()) * 31) + this.f12898b.hashCode()) * 31) + Boolean.hashCode(this.f12897a);
        int i5 = f12895g + 95;
        f12896j = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f12896j + 99;
        f12895g = i3 % 128;
        if (i3 % 2 != 0) {
            return "CombinedConsentUiState(languageConsentId=" + this.f12900d + ", title=" + this.f12901e + ", terms=" + this.f12899c + ", consents=" + this.f12898b + ", isPageLoaded=" + this.f12897a + ")";
        }
        String str = "CombinedConsentUiState(languageConsentId=" + this.f12900d + ", title=" + this.f12901e + ", terms=" + this.f12899c + ", consents=" + this.f12898b + ", isPageLoaded=" + this.f12897a + ")";
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CombinedConsentUiState copy$default(CombinedConsentUiState combinedConsentUiState, String str, String str2, String str3, List list, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f12895g;
        int i5 = i4 + 41;
        f12896j = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            str = combinedConsentUiState.f12900d;
        }
        if ((i2 & 2) != 0) {
            int i7 = i4 + 111;
            f12896j = i7 % 128;
            int i8 = i7 % 2;
            str2 = combinedConsentUiState.f12901e;
        }
        if ((i2 & 4) != 0) {
            str3 = combinedConsentUiState.f12899c;
        }
        if ((i2 & 8) != 0) {
            list = combinedConsentUiState.f12898b;
        }
        if ((i2 & 16) != 0) {
            z2 = combinedConsentUiState.f12897a;
            int i9 = f12896j + 35;
            f12895g = i9 % 128;
            int i10 = i9 % 2;
        }
        return combinedConsentUiState.copy(str, str2, str3, list, z2);
    }

    public final CombinedConsentUiState copy(String str, String str2, String str3, List<CheckboxState> list, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        CombinedConsentUiState combinedConsentUiState = new CombinedConsentUiState(str, str2, str3, list, z2);
        int i3 = f12896j + 21;
        f12895g = i3 % 128;
        if (i3 % 2 != 0) {
            return combinedConsentUiState;
        }
        throw null;
    }

    public final boolean component5() {
        int i2 = 2 % 2;
        int i3 = f12896j;
        int i4 = i3 + 29;
        f12895g = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f12897a;
        int i6 = i3 + 61;
        f12895g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return z2;
    }

    public final List<CheckboxState> component4() {
        int i2 = 2 % 2;
        int i3 = f12895g;
        int i4 = i3 + 97;
        f12896j = i4 % 128;
        int i5 = i4 % 2;
        List<CheckboxState> list = this.f12898b;
        int i6 = i3 + 1;
        f12896j = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f12896j;
        int i4 = i3 + 121;
        f12895g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f12899c;
        int i6 = i3 + 69;
        f12895g = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f12895g + 99;
        f12896j = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f12901e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f12895g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f12896j = i4;
        int i5 = i3 % 2;
        String str = this.f12900d;
        int i6 = i4 + 87;
        f12895g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
