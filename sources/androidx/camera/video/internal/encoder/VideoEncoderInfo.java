package androidx.camera.video.internal.encoder;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public interface VideoEncoderInfo extends EncoderInfo {
    boolean canSwapWidthHeight();

    int getHeightAlignment();

    Range<Integer> getSupportedBitrateRange();

    Range<Integer> getSupportedHeights();

    Range<Integer> getSupportedHeightsFor(int i2);

    Range<Integer> getSupportedWidths();

    Range<Integer> getSupportedWidthsFor(int i2);

    int getWidthAlignment();

    boolean isSizeSupported(int i2, int i3);

    default boolean isSizeSupportedAllowSwapping(int i2, int i3) {
        return isSizeSupported(i2, i3) || (canSwapWidthHeight() && isSizeSupported(i3, i2));
    }
}
