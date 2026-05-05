package com.incode.camera.commons.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Base64;
import com.incode.recogkitandroid.ImageProcessingKit;
import java.io.ByteArrayOutputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\n\u0010\u000b\u001a\u00020\f*\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/incode/camera/commons/utils/BitmapUtils;", "", "()V", "isTooDark", "", "Landroid/graphics/Bitmap;", "lightMinThreshold", "", "rotate", "degrees", "", "toBase64", "", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BitmapUtils {
    public static final BitmapUtils INSTANCE = new BitmapUtils();
    private static int IncodeCamera = 1;
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3630e1 = 1;
    private static int getAvailableCameraInternals = 0;

    private BitmapUtils() {
    }

    public final Bitmap rotate(Bitmap bitmap, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(i2);
        Unit unit = Unit.INSTANCE;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        int i4 = IncodeCamera + 21;
        getAvailableCameraInternals = i4 % 128;
        int i5 = i4 % 2;
        return bitmapCreateBitmap;
    }

    public final String toBase64(Bitmap bitmap) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        int i3 = IncodeCamera + 93;
        getAvailableCameraInternals = i3 % 128;
        if (i3 % 2 == 0) {
            return strEncodeToString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated(message = "Check com.incode.camera.analysis.document.stages.Brightness to see how to implement instead.", replaceWith = @ReplaceWith(expression = "com.incode.camera.analysis.face.stages.Brightness", imports = {}))
    public final boolean isTooDark(Bitmap bitmap, float f2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        if (ImageProcessingKit.getCenterBrightnessLevel(bitmap) >= f2) {
            return false;
        }
        int i3 = IncodeCamera;
        int i4 = i3 + 25;
        getAvailableCameraInternals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 111;
        getAvailableCameraInternals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static {
        int i2 = f3630e1 + 105;
        ProcessCameraProviderExtensionsKt = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
    }
}
