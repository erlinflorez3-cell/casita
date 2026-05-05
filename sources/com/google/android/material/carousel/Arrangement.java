package com.google.android.material.carousel;

import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: classes8.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    Arrangement(int i2, float f2, float f3, float f4, int i3, float f5, int i4, float f6, int i5, float f7) {
        this.priority = i2;
        this.smallSize = MathUtils.clamp(f2, f3, f4);
        this.smallCount = i3;
        this.mediumSize = f5;
        this.mediumCount = i4;
        this.largeSize = f6;
        this.largeCount = i5;
        fit(f7, f3, f4, f6);
        this.cost = cost(f6);
    }

    private float calculateLargeSize(float f2, int i2, float f3, int i3, int i4) {
        if (i2 <= 0) {
            f3 = 0.0f;
        }
        float f4 = i3 / 2.0f;
        return (f2 - ((i2 + f4) * f3)) / (i4 + f4);
    }

    private float cost(float f2) {
        if (isValid()) {
            return Math.abs(f2 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    static Arrangement findLowestCostArrangement(float f2, float f3, float f4, float f5, int[] iArr, float f6, int[] iArr2, float f7, int[] iArr3) {
        Arrangement arrangement = null;
        int i2 = 1;
        for (int i3 : iArr3) {
            for (int i4 : iArr2) {
                for (int i5 : iArr) {
                    Arrangement arrangement2 = new Arrangement(i2, f3, f4, f5, i5, f6, i4, f7, i3, f2);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    i2++;
                }
            }
        }
        return arrangement;
    }

    private void fit(float f2, float f3, float f4, float f5) {
        float space = f2 - getSpace();
        int i2 = this.smallCount;
        if (i2 > 0 && space > 0.0f) {
            float f6 = this.smallSize;
            this.smallSize = f6 + Math.min(space / i2, f4 - f6);
        } else if (i2 > 0 && space < 0.0f) {
            float f7 = this.smallSize;
            this.smallSize = f7 + Math.max(space / i2, f3 - f7);
        }
        int i3 = this.smallCount;
        float f8 = i3 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f8;
        float fCalculateLargeSize = calculateLargeSize(f2, i3, f8, this.mediumCount, this.largeCount);
        this.largeSize = fCalculateLargeSize;
        float f9 = (this.smallSize + fCalculateLargeSize) / 2.0f;
        this.mediumSize = f9;
        int i4 = this.mediumCount;
        if (i4 <= 0 || fCalculateLargeSize == f5) {
            return;
        }
        float f10 = (f5 - fCalculateLargeSize) * this.largeCount;
        float fMin = Math.min(Math.abs(f10), f9 * 0.1f * i4);
        if (f10 > 0.0f) {
            this.mediumSize -= fMin / this.mediumCount;
            this.largeSize += fMin / this.largeCount;
        } else {
            this.mediumSize += fMin / this.mediumCount;
            this.largeSize -= fMin / this.largeCount;
        }
    }

    private float getSpace() {
        return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
    }

    private boolean isValid() {
        int i2 = this.largeCount;
        if (i2 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i2 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f2 = this.largeSize;
        float f3 = this.mediumSize;
        return f2 > f3 && f3 > this.smallSize;
    }

    int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }
}
