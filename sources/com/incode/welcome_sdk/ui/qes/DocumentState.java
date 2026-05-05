package com.incode.welcome_sdk.ui.qes;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17020b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17021c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f17023e;

    public DocumentState(i iVar, boolean z2) {
        Intrinsics.checkNotNullParameter(iVar, "");
        this.f17023e = iVar;
        this.f17022d = z2;
    }

    public /* synthetic */ DocumentState(i iVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i2 & 2) != 0 ? false : z2);
    }

    public final i getDocument() {
        int i2 = 2 % 2;
        int i3 = f17021c + 75;
        f17020b = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17023e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getSigned() {
        int i2 = 2 % 2;
        int i3 = f17020b;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17021c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f17022d;
        int i6 = i3 + 57;
        f17021c = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f17021c;
        int i4 = i3 + 69;
        f17020b = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentState)) {
            int i6 = i3 + 111;
            f17020b = i6 % 128;
            return i6 % 2 != 0;
        }
        DocumentState documentState = (DocumentState) obj;
        if (!Intrinsics.areEqual(this.f17023e, documentState.f17023e) || this.f17022d != documentState.f17022d) {
            return false;
        }
        int i7 = f17021c + 57;
        f17020b = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f17021c + 25;
        f17020b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f17023e.hashCode() * 31) + Boolean.hashCode(this.f17022d);
        int i5 = f17020b + 35;
        f17021c = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f17020b + 29;
        f17021c = i3 % 128;
        int i4 = i3 % 2;
        String str = "DocumentState(document=" + this.f17023e + ", signed=" + this.f17022d + ")";
        int i5 = f17020b + 57;
        f17021c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ DocumentState copy$default(DocumentState documentState, i iVar, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f17020b + 103;
            f17021c = i4 % 128;
            int i5 = i4 % 2;
            iVar = documentState.f17023e;
        }
        if ((i2 & 2) != 0) {
            int i6 = f17020b + 117;
            f17021c = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z3 = documentState.f17022d;
                throw null;
            }
            z2 = documentState.f17022d;
        }
        DocumentState documentStateCopy = documentState.copy(iVar, z2);
        int i7 = f17021c + 1;
        f17020b = i7 % 128;
        int i8 = i7 % 2;
        return documentStateCopy;
    }

    public final DocumentState copy(i iVar, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(iVar, "");
        DocumentState documentState = new DocumentState(iVar, z2);
        int i3 = f17021c + 53;
        f17020b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return documentState;
    }

    public final boolean component2() {
        int i2 = 2 % 2;
        int i3 = f17020b;
        int i4 = i3 + 71;
        f17021c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f17022d;
        int i6 = i3 + 103;
        f17021c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final i component1() {
        int i2 = 2 % 2;
        int i3 = f17020b + 57;
        int i4 = i3 % 128;
        f17021c = i4;
        int i5 = i3 % 2;
        i iVar = this.f17023e;
        int i6 = i4 + 75;
        f17020b = i6 % 128;
        int i7 = i6 % 2;
        return iVar;
    }
}
