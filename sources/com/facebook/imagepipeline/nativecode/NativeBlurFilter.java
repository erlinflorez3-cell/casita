package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class NativeBlurFilter {
    static {
        NativeFiltersLoader.load();
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i2, int i3) {
        Preconditions.checkNotNull(bitmap);
        Preconditions.checkArgument(Boolean.valueOf(i2 > 0));
        Preconditions.checkArgument(Boolean.valueOf(i3 > 0));
        nativeIterativeBoxBlur(bitmap, i2, i3);
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i2, int i3);
}
