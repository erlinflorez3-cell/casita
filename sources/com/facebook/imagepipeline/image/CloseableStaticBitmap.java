package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;

/* JADX INFO: loaded from: classes3.dex */
public interface CloseableStaticBitmap extends CloseableBitmap {
    static CloseableStaticBitmap of(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i2) {
        return of(bitmap, resourceReleaser, qualityInfo, i2, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i2, int i3) {
        return BaseCloseableStaticBitmap.shouldUseSimpleCloseableStaticBitmap() ? new BaseCloseableStaticBitmap(bitmap, resourceReleaser, qualityInfo, i2, i3) : new DefaultCloseableStaticBitmap(bitmap, resourceReleaser, qualityInfo, i2, i3);
    }

    static CloseableStaticBitmap of(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i2) {
        return of(closeableReference, qualityInfo, i2, 0);
    }

    static CloseableStaticBitmap of(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i2, int i3) {
        return BaseCloseableStaticBitmap.shouldUseSimpleCloseableStaticBitmap() ? new BaseCloseableStaticBitmap(closeableReference, qualityInfo, i2, i3) : new DefaultCloseableStaticBitmap(closeableReference, qualityInfo, i2, i3);
    }

    CloseableReference<Bitmap> cloneUnderlyingBitmapReference();

    CloseableReference<Bitmap> convertToBitmapReference();

    int getExifOrientation();

    int getRotationAngle();
}
