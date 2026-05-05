package com.incode.camera.commons.utils;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/incode/camera/commons/utils/SizeFloat;", "", "width", "", "height", "(FF)V", "getHeight", "()F", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SizeFloat {
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3639e1 = 1;
    private final float IncodeCamera;
    private final float getAvailableCameraInternals;

    public SizeFloat(float f2, float f3) {
        this.IncodeCamera = f2;
        this.getAvailableCameraInternals = f3;
    }

    public final float getHeight() {
        int i2 = 2 % 2;
        int i3 = f3639e1;
        int i4 = i3 + 101;
        ProcessCameraProviderExtensionsKt = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.getAvailableCameraInternals;
        int i6 = i3 + 9;
        ProcessCameraProviderExtensionsKt = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        throw null;
    }

    public final float getWidth() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt;
        int i4 = i3 + 27;
        f3639e1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        float f2 = this.IncodeCamera;
        int i5 = i3 + 59;
        f3639e1 = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public final boolean equals(Object other) {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt;
        int i4 = i3 + 95;
        f3639e1 = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeFloat)) {
            int i5 = i3 + 43;
            f3639e1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 29;
            f3639e1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        SizeFloat sizeFloat = (SizeFloat) other;
        if (Float.compare(this.IncodeCamera, sizeFloat.IncodeCamera) != 0 || Float.compare(this.getAvailableCameraInternals, sizeFloat.getAvailableCameraInternals) != 0) {
            return false;
        }
        int i9 = ProcessCameraProviderExtensionsKt + 49;
        f3639e1 = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f3639e1 + 69;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (Float.hashCode(this.IncodeCamera) >>> 66) - Float.hashCode(this.getAvailableCameraInternals) : (Float.hashCode(this.IncodeCamera) * 31) + Float.hashCode(this.getAvailableCameraInternals);
        int i4 = f3639e1 + 105;
        ProcessCameraProviderExtensionsKt = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 15;
        f3639e1 = i3 % 128;
        if (i3 % 2 != 0) {
            return "SizeFloat(width=" + this.IncodeCamera + ", height=" + this.getAvailableCameraInternals + ")";
        }
        String str = "SizeFloat(width=" + this.IncodeCamera + ", height=" + this.getAvailableCameraInternals + ")";
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SizeFloat copy$default(SizeFloat sizeFloat, float f2, float f3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f3639e1;
        int i5 = i4 + 27;
        ProcessCameraProviderExtensionsKt = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            f2 = sizeFloat.IncodeCamera;
            int i7 = i4 + 79;
            ProcessCameraProviderExtensionsKt = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 2) != 0) {
            f3 = sizeFloat.getAvailableCameraInternals;
        }
        return sizeFloat.copy(f2, f3);
    }

    public final SizeFloat copy(float width, float height) {
        int i2 = 2 % 2;
        SizeFloat sizeFloat = new SizeFloat(width, height);
        int i3 = f3639e1 + 35;
        ProcessCameraProviderExtensionsKt = i3 % 128;
        if (i3 % 2 == 0) {
            return sizeFloat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component2() {
        int i2 = 2 % 2;
        int i3 = ProcessCameraProviderExtensionsKt + 47;
        f3639e1 = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.getAvailableCameraInternals;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        return f2;
    }

    public final float component1() {
        int i2 = 2 % 2;
        int i3 = f3639e1 + 121;
        int i4 = i3 % 128;
        ProcessCameraProviderExtensionsKt = i4;
        int i5 = i3 % 2;
        float f2 = this.IncodeCamera;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f3639e1 = i6 % 128;
        if (i6 % 2 != 0) {
            return f2;
        }
        throw null;
    }
}
