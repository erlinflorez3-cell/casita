package com.incode.welcome_sdk.ui.aes;

import com.incode.welcome_sdk.data.remote.beans.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11035b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11036e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f11037a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11038d;

    public DocumentState(i iVar, boolean z2) {
        Intrinsics.checkNotNullParameter(iVar, "");
        this.f11037a = iVar;
        this.f11038d = z2;
    }

    public /* synthetic */ DocumentState(i iVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i2 & 2) != 0 ? false : z2);
    }

    public final i getDocument() {
        int i2 = 2 % 2;
        int i3 = f11036e + 97;
        int i4 = i3 % 128;
        f11035b = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        i iVar = this.f11037a;
        int i5 = i4 + 91;
        f11036e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return iVar;
    }

    public final boolean getSigned() {
        int i2 = 2 % 2;
        int i3 = f11035b;
        int i4 = i3 + 93;
        f11036e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.f11038d;
        int i5 = i3 + 89;
        f11036e = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentState)) {
            return false;
        }
        DocumentState documentState = (DocumentState) obj;
        if (!Intrinsics.areEqual(this.f11037a, documentState.f11037a)) {
            return false;
        }
        if (this.f11038d == documentState.f11038d) {
            return true;
        }
        int i3 = f11035b + 47;
        int i4 = i3 % 128;
        f11036e = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 49;
        f11035b = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f11035b + 33;
        f11036e = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f11037a.hashCode() * 31) + Boolean.hashCode(this.f11038d);
        int i5 = f11036e + 57;
        f11035b = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f11036e + 23;
        f11035b = i3 % 128;
        int i4 = i3 % 2;
        String str = "DocumentState(document=" + this.f11037a + ", signed=" + this.f11038d + ")";
        int i5 = f11035b + 97;
        f11036e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public static /* synthetic */ DocumentState copy$default(DocumentState documentState, i iVar, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f11035b + 7;
        int i5 = i4 % 128;
        f11036e = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 117;
            f11035b = i7 % 128;
            int i8 = i7 % 2;
            iVar = documentState.f11037a;
            int i9 = i5 + 17;
            f11035b = i9 % 128;
            int i10 = i9 % 2;
        }
        if ((i2 & 2) != 0) {
            z2 = documentState.f11038d;
        }
        return documentState.copy(iVar, z2);
    }

    public final DocumentState copy(i iVar, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iVar, "");
        DocumentState documentState = new DocumentState(iVar, z2);
        int i3 = f11036e + 23;
        f11035b = i3 % 128;
        int i4 = i3 % 2;
        return documentState;
    }

    public final boolean component2() {
        int i2 = 2 % 2;
        int i3 = f11035b + 79;
        f11036e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f11038d;
        }
        throw null;
    }

    public final i component1() {
        int i2 = 2 % 2;
        int i3 = f11035b;
        int i4 = i3 + 23;
        f11036e = i4 % 128;
        int i5 = i4 % 2;
        i iVar = this.f11037a;
        int i6 = i3 + 51;
        f11036e = i6 % 128;
        int i7 = i6 % 2;
        return iVar;
    }
}
