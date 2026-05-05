package com.incode.welcome_sdk.commons.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public class RotateTransformation extends BitmapTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5882a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5883e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f5884b;

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        int i4 = 2 % 2;
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f5884b);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        int i5 = f5883e + 85;
        f5882a = i5 % 128;
        if (i5 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        int i2 = 2 % 2;
        messageDigest.update(new StringBuilder("rotate").append(this.f5884b).toString().getBytes());
        int i3 = f5882a + 85;
        f5883e = i3 % 128;
        int i4 = i3 % 2;
    }
}
