package com.incode.camera.analysis.document;

import android.graphics.Bitmap;
import com.incode.recogkitandroid.ImageProcessingKit;
import com.incode.recogkitandroid.ImageProcessingKitInvalidInputException;
import com.incode.recogkitandroid.ImageProcessingKitProcessException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/incode/camera/analysis/document/ImageKitWrapper;", "", "()V", "getCenterBrightnessLevel", "", "bitmap", "Landroid/graphics/Bitmap;", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageKitWrapper {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3597e1 = 1;
    private static int getAvailableCameraInternals = 0;

    public final float getCenterBrightnessLevel(Bitmap bitmap) throws ImageProcessingKitInvalidInputException, ImageProcessingKitProcessException {
        int i2 = 2 % 2;
        int i3 = f3597e1 + 69;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        float centerBrightnessLevel = ImageProcessingKit.getCenterBrightnessLevel(bitmap);
        int i5 = f3597e1 + 93;
        getAvailableCameraInternals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return centerBrightnessLevel;
    }
}
