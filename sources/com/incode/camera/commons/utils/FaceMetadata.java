package com.incode.camera.commons.utils;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/incode/camera/commons/utils/FaceMetadata;", "", "landmarks", "Lcom/incode/camera/commons/utils/FaceLandmarks;", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/incode/camera/commons/utils/FaceLandmarks;Landroid/graphics/Bitmap;)V", "frameHeight", "", "getFrameHeight", "()I", "frameWidth", "getFrameWidth", "nfh", "", "getNfh", "()F", "nfw", "getNfw", "nfx", "getNfx", "nfy", "getNfy", "sizeRect", "Landroid/graphics/Rect;", "getSizeRect", "()Landroid/graphics/Rect;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceMetadata {
    private static int getConfig = 1;
    private static int getContext = 0;
    private final float CameraConstants;
    private final int IncodeCamera;
    private final float ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1 */
    private final float f3634e1;
    private final float getAvailableCameraInternals;
    private final Rect getFrameAnalyzerWrapper;
    private final int getPreviewView;

    public FaceMetadata(FaceLandmarks faceLandmarks, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(faceLandmarks, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        float f2 = faceLandmarks.getRightEye().x;
        float f3 = faceLandmarks.getRightEye().y;
        float f4 = f2 - faceLandmarks.getLeftEye().x;
        float f5 = f3 - faceLandmarks.getLeftEye().y;
        float fSqrt = ((float) Math.sqrt((f4 * f4) + (f5 * f5))) / 0.3849f;
        float f6 = 1.2f * fSqrt;
        this.CameraConstants = f6;
        this.ProcessCameraProviderExtensionsKt = f6;
        float f7 = (f2 - (0.3075f * fSqrt)) - ((f6 - fSqrt) / 2.0f);
        this.f3634e1 = f7;
        float f8 = (f3 - (0.397f * fSqrt)) - ((f6 - fSqrt) / 2.0f);
        this.getAvailableCameraInternals = f8;
        this.getFrameAnalyzerWrapper = new Rect((int) f7, (int) f8, (int) (f7 + f6), (int) (f8 + f6));
        this.IncodeCamera = bitmap.getWidth();
        this.getPreviewView = bitmap.getHeight();
    }

    public final float getNfw() {
        int i2 = 2 % 2;
        int i3 = getConfig + 123;
        int i4 = i3 % 128;
        getContext = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f2 = this.CameraConstants;
        int i5 = i4 + 29;
        getConfig = i5 % 128;
        if (i5 % 2 != 0) {
            return f2;
        }
        obj.hashCode();
        throw null;
    }

    public final float getNfh() {
        int i2 = 2 % 2;
        int i3 = getConfig;
        int i4 = i3 + 25;
        getContext = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.ProcessCameraProviderExtensionsKt;
        int i6 = i3 + 57;
        getContext = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final float getNfx() {
        int i2 = 2 % 2;
        int i3 = getConfig + 27;
        getContext = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f3634e1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getNfy() {
        int i2 = 2 % 2;
        int i3 = getConfig;
        int i4 = i3 + 53;
        getContext = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.getAvailableCameraInternals;
        int i6 = i3 + 91;
        getContext = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public final int getFrameWidth() {
        int i2 = 2 % 2;
        int i3 = getContext + 13;
        int i4 = i3 % 128;
        getConfig = i4;
        int i5 = i3 % 2;
        int i6 = this.IncodeCamera;
        int i7 = i4 + 23;
        getContext = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 16 / 0;
        }
        return i6;
    }

    public final int getFrameHeight() {
        int i2 = 2 % 2;
        int i3 = getContext + 97;
        int i4 = i3 % 128;
        getConfig = i4;
        int i5 = i3 % 2;
        int i6 = this.getPreviewView;
        int i7 = i4 + 1;
        getContext = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public final Rect getSizeRect() {
        int i2 = 2 % 2;
        int i3 = getContext;
        int i4 = i3 + 5;
        getConfig = i4 % 128;
        int i5 = i4 % 2;
        Rect rect = this.getFrameAnalyzerWrapper;
        int i6 = i3 + 59;
        getConfig = i6 % 128;
        int i7 = i6 % 2;
        return rect;
    }
}
