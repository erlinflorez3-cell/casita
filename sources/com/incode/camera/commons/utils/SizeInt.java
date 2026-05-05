package com.incode.camera.commons.utils;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/incode/camera/commons/utils/SizeInt;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SizeInt {
    private static int CameraConstants = 0;
    private static int IncodeCamera = 1;
    private final int ProcessCameraProviderExtensionsKt;
    private final int getAvailableCameraInternals;

    public SizeInt(int i2, int i3) {
        this.ProcessCameraProviderExtensionsKt = i2;
        this.getAvailableCameraInternals = i3;
    }

    public final int getHeight() {
        int i2;
        int i3 = 2 % 2;
        int i4 = CameraConstants;
        int i5 = i4 + 73;
        IncodeCamera = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.getAvailableCameraInternals;
            int i6 = 63 / 0;
        } else {
            i2 = this.getAvailableCameraInternals;
        }
        int i7 = i4 + 53;
        IncodeCamera = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public final int getWidth() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 115;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.ProcessCameraProviderExtensionsKt;
        if (i4 == 0) {
            int i6 = 13 / 0;
        }
        return i5;
    }

    public final boolean equals(Object other) {
        int i2 = 2 % 2;
        if (this == other) {
            int i3 = CameraConstants + 1;
            int i4 = i3 % 128;
            IncodeCamera = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 29;
            CameraConstants = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof SizeInt)) {
            return false;
        }
        SizeInt sizeInt = (SizeInt) other;
        if (this.ProcessCameraProviderExtensionsKt != sizeInt.ProcessCameraProviderExtensionsKt) {
            return false;
        }
        if (this.getAvailableCameraInternals != sizeInt.getAvailableCameraInternals) {
            int i8 = CameraConstants + 109;
            IncodeCamera = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = CameraConstants + 105;
        IncodeCamera = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 73 / 0;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = IncodeCamera + 73;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (Integer.hashCode(this.ProcessCameraProviderExtensionsKt) * 31) + Integer.hashCode(this.getAvailableCameraInternals);
        int i5 = IncodeCamera + 107;
        CameraConstants = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 83;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        String str = "SizeInt(width=" + this.ProcessCameraProviderExtensionsKt + ", height=" + this.getAvailableCameraInternals + ")";
        int i5 = IncodeCamera + 21;
        CameraConstants = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SizeInt copy$default(SizeInt sizeInt, int i2, int i3, int i4, Object obj) {
        int i5 = 2 % 2;
        int i6 = IncodeCamera + 105;
        CameraConstants = i6 % 128;
        if (i6 % 2 == 0 && (i4 & 1) != 0) {
            i2 = sizeInt.ProcessCameraProviderExtensionsKt;
        }
        if ((i4 & 2) != 0) {
            i3 = sizeInt.getAvailableCameraInternals;
        }
        SizeInt sizeIntCopy = sizeInt.copy(i2, i3);
        int i7 = IncodeCamera + 21;
        CameraConstants = i7 % 128;
        int i8 = i7 % 2;
        return sizeIntCopy;
    }

    public final SizeInt copy(int width, int height) {
        int i2 = 2 % 2;
        SizeInt sizeInt = new SizeInt(width, height);
        int i3 = IncodeCamera + 9;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        return sizeInt;
    }

    public final int component2() {
        int i2;
        int i3 = 2 % 2;
        int i4 = IncodeCamera + 19;
        int i5 = i4 % 128;
        CameraConstants = i5;
        if (i4 % 2 != 0) {
            i2 = this.getAvailableCameraInternals;
            int i6 = 5 / 0;
        } else {
            i2 = this.getAvailableCameraInternals;
        }
        int i7 = i5 + 107;
        IncodeCamera = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
        return i2;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 49;
        IncodeCamera = i3 % 128;
        if (i3 % 2 != 0) {
            return this.ProcessCameraProviderExtensionsKt;
        }
        throw null;
    }
}
