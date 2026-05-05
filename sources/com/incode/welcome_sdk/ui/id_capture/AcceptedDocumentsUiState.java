package com.incode.welcome_sdk.ui.id_capture;

import com.incode.welcome_sdk.data.remote.beans.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcceptedDocumentsUiState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14492b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14493e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14494a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f14496d;

    /* JADX WARN: Multi-variable type inference failed */
    public AcceptedDocumentsUiState(String str, String str2, List<? extends c> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f14494a = str;
        this.f14495c = str2;
        this.f14496d = list;
    }

    public final List<c> getAcceptedDocuments() {
        int i2 = 2 % 2;
        int i3 = f14493e + 23;
        int i4 = i3 % 128;
        f14492b = i4;
        int i5 = i3 % 2;
        List<c> list = this.f14496d;
        int i6 = i4 + 19;
        f14493e = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final String getCountryName() {
        int i2 = 2 % 2;
        int i3 = f14492b + 49;
        int i4 = i3 % 128;
        f14493e = i4;
        int i5 = i3 % 2;
        String str = this.f14494a;
        int i6 = i4 + 17;
        f14492b = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getFlag() {
        int i2 = 2 % 2;
        int i3 = f14492b;
        int i4 = i3 + 17;
        f14493e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f14495c;
        int i6 = i3 + 17;
        f14493e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f14493e;
        int i4 = i3 + 75;
        f14492b = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptedDocumentsUiState)) {
            int i6 = i3 + 59;
            f14492b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        AcceptedDocumentsUiState acceptedDocumentsUiState = (AcceptedDocumentsUiState) obj;
        if (!Intrinsics.areEqual(this.f14494a, acceptedDocumentsUiState.f14494a)) {
            int i8 = f14493e + 107;
            f14492b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f14495c, acceptedDocumentsUiState.f14495c)) {
            int i10 = f14493e + 19;
            f14492b = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 80 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.f14496d, acceptedDocumentsUiState.f14496d)) {
            return true;
        }
        int i12 = f14493e + 115;
        f14492b = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        String str = this.f14494a;
        int iHashCode2 = 0;
        if (str == null) {
            int i3 = f14492b + 47;
            f14493e = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i5 = iHashCode * 31;
        String str2 = this.f14495c;
        if (str2 == null) {
            int i6 = f14493e + 117;
            f14492b = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return ((i5 + iHashCode2) * 31) + this.f14496d.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14493e + 103;
        f14492b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            String str = "AcceptedDocumentsUiState(countryName=" + this.f14494a + ", flag=" + this.f14495c + ", acceptedDocuments=" + this.f14496d + ")";
            throw null;
        }
        String str2 = "AcceptedDocumentsUiState(countryName=" + this.f14494a + ", flag=" + this.f14495c + ", acceptedDocuments=" + this.f14496d + ")";
        int i4 = f14493e + 27;
        f14492b = i4 % 128;
        if (i4 % 2 == 0) {
            return str2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcceptedDocumentsUiState copy$default(AcceptedDocumentsUiState acceptedDocumentsUiState, String str, String str2, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f14493e;
        int i5 = i4 + 1;
        f14492b = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            str = acceptedDocumentsUiState.f14494a;
        }
        if ((i2 & 2) != 0) {
            str2 = acceptedDocumentsUiState.f14495c;
            int i7 = i4 + 91;
            f14492b = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 4) != 0) {
            list = acceptedDocumentsUiState.f14496d;
        }
        return acceptedDocumentsUiState.copy(str, str2, list);
    }

    public final AcceptedDocumentsUiState copy(String str, String str2, List<? extends c> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        AcceptedDocumentsUiState acceptedDocumentsUiState = new AcceptedDocumentsUiState(str, str2, list);
        int i3 = f14492b + 81;
        f14493e = i3 % 128;
        int i4 = i3 % 2;
        return acceptedDocumentsUiState;
    }

    public final List<c> component3() {
        int i2 = 2 % 2;
        int i3 = f14493e;
        int i4 = i3 + 7;
        f14492b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<c> list = this.f14496d;
        int i5 = i3 + 11;
        f14492b = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f14493e;
        int i4 = i3 + 101;
        f14492b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f14495c;
        int i6 = i3 + 121;
        f14492b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 39 / 0;
        }
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f14493e;
        int i4 = i3 + 77;
        f14492b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f14494a;
        int i6 = i3 + 79;
        f14492b = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
