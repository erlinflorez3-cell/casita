package com.google.android.material.carousel;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f2 = layoutParams.topMargin + layoutParams.bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f2 = layoutParams.leftMargin + layoutParams.rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f2;
        float fMax = Math.max(getSmallItemSizeMax() + f2, smallItemSizeMin);
        float f3 = containerHeight;
        float fMin = Math.min(measuredWidth + f2, f3);
        float fClamp = MathUtils.clamp((measuredWidth / 3.0f) + f2, smallItemSizeMin + f2, fMax + f2);
        float f4 = (fMin + fClamp) / 2.0f;
        int i2 = 0;
        int[] iArr = f3 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int iMax = (int) Math.max(1.0d, Math.floor((f3 - (CarouselStrategyHelper.maxValue(r1) * fMax)) / fMin));
        int iCeil = (((int) Math.ceil(f3 / fMin)) - iMax) + 1;
        int[] iArr2 = new int[iCeil];
        for (int i3 = 0; i3 < iCeil; i3++) {
            iArr2[i3] = iMax + i3;
        }
        int i4 = carousel.getCarouselAlignment() != 1 ? 0 : 1;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f3, fClamp, smallItemSizeMin, fMax, i4 != 0 ? doubleCounts(iArr) : iArr, f4, i4 != 0 ? doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, fMin, iArr2);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            f3 = f3;
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f3, fClamp, smallItemSizeMin, fMax, iArr, f4, MEDIUM_COUNTS, fMin, iArr2);
        } else {
            i2 = i4;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f2, f3, arrangementFindLowestCostArrangement, i2);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    boolean shouldRefreshKeylineState(Carousel carousel, int i2) {
        if (carousel.getCarouselAlignment() == 1) {
            if (i2 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) {
                return true;
            }
            if (i2 >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
        }
        return false;
    }
}
