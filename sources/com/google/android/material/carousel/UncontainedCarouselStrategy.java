package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: loaded from: classes8.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f2, float f3, float f4) {
        float fMax = Math.max(1.5f * f4, f2);
        float f5 = 0.85f * f3;
        if (fMax > f5) {
            fMax = Math.max(f5, f4 * 1.2f);
        }
        return Math.min(f3, fMax);
    }

    private KeylineState createCenterAlignedKeylineState(float f2, float f3, float f4, int i2, float f5, float f6, float f7) {
        float fMin = Math.min(f6, f4);
        float childMaskPercentage = getChildMaskPercentage(fMin, f4, f3);
        float childMaskPercentage2 = getChildMaskPercentage(f5, f4, f3);
        float f8 = f5 / 2.0f;
        float f9 = (f7 + 0.0f) - f8;
        float f10 = f9 + f8;
        float f11 = fMin / 2.0f;
        float f12 = (i2 * f4) + f10;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f4, f2).addAnchorKeyline((f9 - f8) - f11, childMaskPercentage, fMin).addKeyline(f9, childMaskPercentage2, f5, false).addKeylineRange((f4 / 2.0f) + f10, 0.0f, f4, i2, true);
        builderAddKeylineRange.addKeyline(f8 + f12, childMaskPercentage2, f5, false);
        builderAddKeylineRange.addAnchorKeyline(f12 + f5 + f11, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f2, float f3, float f4, int i2, float f5, int i3, float f6) {
        float fMin = Math.min(f6, f4);
        float fMax = Math.max(fMin, 0.5f * f5);
        float childMaskPercentage = getChildMaskPercentage(fMax, f4, f2);
        float childMaskPercentage2 = getChildMaskPercentage(fMin, f4, f2);
        float childMaskPercentage3 = getChildMaskPercentage(f5, f4, f2);
        float f7 = (i2 * f4) + 0.0f;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f4, f3).addAnchorKeyline(0.0f - (fMax / 2.0f), childMaskPercentage, fMax).addKeylineRange(f4 / 2.0f, 0.0f, f4, i2, true);
        if (i3 > 0) {
            float f8 = (f5 / 2.0f) + f7;
            f7 += f5;
            builderAddKeylineRange.addKeyline(f8, childMaskPercentage3, f5, false);
        }
        builderAddKeylineRange.addAnchorKeyline(f7 + (CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    boolean isContained() {
        return false;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f2 = layoutParams.topMargin + layoutParams.bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f2 = layoutParams.leftMargin + layoutParams.rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f3 = measuredHeight + f2;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f2;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f2;
        int iMax = Math.max(1, (int) Math.floor(containerWidth / f3));
        float f4 = containerWidth - (iMax * f3);
        if (carousel.getCarouselAlignment() == 1) {
            float f5 = f4 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f2, f3, iMax, Math.max(Math.min(3.0f * f5, f3), getSmallItemSizeMin() + f2), extraSmallSize2, f5);
        }
        return createLeftAlignedKeylineState(view.getContext(), f2, containerWidth, f3, iMax, calculateMediumChildSize(extraSmallSize, f3, f4), f4 <= 0.0f ? 0 : 1, extraSmallSize2);
    }
}
