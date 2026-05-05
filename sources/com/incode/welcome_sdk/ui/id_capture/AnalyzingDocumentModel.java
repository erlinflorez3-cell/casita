package com.incode.welcome_sdk.ui.id_capture;

/* JADX INFO: loaded from: classes5.dex */
public final class AnalyzingDocumentModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14497c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14498d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14500b;

    public AnalyzingDocumentModel(int i2, float f2) {
        this.f14500b = i2;
        this.f14499a = f2;
    }

    public final float getProgress() {
        int i2 = 2 % 2;
        int i3 = f14497c + 89;
        int i4 = i3 % 128;
        f14498d = i4;
        int i5 = i3 % 2;
        float f2 = this.f14499a;
        int i6 = i4 + 79;
        f14497c = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final int getTitleResId() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f14498d + 109;
        int i5 = i4 % 128;
        f14497c = i5;
        if (i4 % 2 != 0) {
            i2 = this.f14500b;
            int i6 = 7 / 0;
        } else {
            i2 = this.f14500b;
        }
        int i7 = i5 + 19;
        f14498d = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyzingDocumentModel)) {
            return false;
        }
        AnalyzingDocumentModel analyzingDocumentModel = (AnalyzingDocumentModel) obj;
        if (this.f14500b != analyzingDocumentModel.f14500b) {
            int i3 = f14497c + 23;
            f14498d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Float.compare(this.f14499a, analyzingDocumentModel.f14499a) == 0) {
            return true;
        }
        int i5 = f14497c + 43;
        f14498d = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f14497c + 75;
        f14498d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (Integer.hashCode(this.f14500b) * 31) + Float.hashCode(this.f14499a);
        int i5 = f14498d + 5;
        f14497c = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14497c + 43;
        f14498d = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "AnalyzingDocumentModel(titleResId=" + this.f14500b + ", progress=" + this.f14499a + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "AnalyzingDocumentModel(titleResId=" + this.f14500b + ", progress=" + this.f14499a + ")";
        int i4 = f14497c + 111;
        f14498d = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ AnalyzingDocumentModel copy$default(AnalyzingDocumentModel analyzingDocumentModel, int i2, float f2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = f14498d;
            int i6 = i5 + 109;
            f14497c = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = analyzingDocumentModel.f14500b;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i2 = analyzingDocumentModel.f14500b;
            int i8 = i5 + 99;
            f14497c = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i3 & 2) != 0) {
            int i10 = f14497c + 89;
            f14498d = i10 % 128;
            int i11 = i10 % 2;
            f2 = analyzingDocumentModel.f14499a;
        }
        return analyzingDocumentModel.copy(i2, f2);
    }

    public final AnalyzingDocumentModel copy(int i2, float f2) {
        int i3 = 2 % 2;
        AnalyzingDocumentModel analyzingDocumentModel = new AnalyzingDocumentModel(i2, f2);
        int i4 = f14498d + 99;
        f14497c = i4 % 128;
        int i5 = i4 % 2;
        return analyzingDocumentModel;
    }

    public final float component2() {
        int i2 = 2 % 2;
        int i3 = f14497c;
        int i4 = i3 + 53;
        f14498d = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.f14499a;
        int i6 = i3 + 77;
        f14498d = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = f14497c;
        int i4 = i3 + 1;
        f14498d = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.f14500b;
        int i6 = i3 + 43;
        f14498d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
