package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
abstract class CarouselOrientationHelper {
    final int orientation;

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselOrientationHelper$1 */
    class AnonymousClass1 extends CarouselOrientationHelper {
        final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2, CarouselLayoutManager carouselLayoutManager) {
            super(i2);
            carouselLayoutManager = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.top < rectF3.top && rectF2.bottom > rectF3.top) {
                float f2 = rectF3.top - rectF2.top;
                rectF.top += f2;
                rectF3.top += f2;
            }
            if (rectF2.bottom <= rectF3.bottom || rectF2.top >= rectF3.bottom) {
                return;
            }
            float f3 = rectF2.bottom - rectF3.bottom;
            rectF.bottom = Math.max(rectF.bottom - f3, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f3, rectF2.top);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getDecoratedCrossAxisMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return carouselLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
            return layoutParams.topMargin + layoutParams.bottomMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public RectF getMaskRect(float f2, float f3, float f4, float f5) {
            return new RectF(0.0f, f4, f3, f2 - f4);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentBottom() {
            return carouselLayoutManager.getHeight();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentEnd() {
            return getParentBottom();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentLeft() {
            return carouselLayoutManager.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentRight() {
            return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentStart() {
            return getParentTop();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentTop() {
            return 0;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void layoutDecoratedWithMargins(View view, int i2, int i3) {
            int parentLeft = getParentLeft();
            carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i2, parentLeft + getDecoratedCrossAxisMeasurement(view), i3);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.top = Math.min(rectF.top, rectF.bottom);
            }
            if (rectF2.top >= rectF3.bottom) {
                rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.bottom = Math.max(rectF.top, rectF.bottom);
            }
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void offsetChild(View view, Rect rect, float f2, float f3) {
            view.offsetTopAndBottom((int) (f3 - (rect.top + f2)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselOrientationHelper$2 */
    class AnonymousClass2 extends CarouselOrientationHelper {
        final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i2, CarouselLayoutManager carouselLayoutManager) {
            super(i2);
            carouselLayoutManager = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.left < rectF3.left && rectF2.right > rectF3.left) {
                float f2 = rectF3.left - rectF2.left;
                rectF.left += f2;
                rectF2.left += f2;
            }
            if (rectF2.right <= rectF3.right || rectF2.left >= rectF3.right) {
                return;
            }
            float f3 = rectF2.right - rectF3.right;
            rectF.right = Math.max(rectF.right - f3, rectF.left);
            rectF2.right = Math.max(rectF2.right - f3, rectF2.left);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getDecoratedCrossAxisMeasurement(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return carouselLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
            return layoutParams.rightMargin + layoutParams.leftMargin;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public RectF getMaskRect(float f2, float f3, float f4, float f5) {
            return new RectF(f5, 0.0f, f3 - f5, f2);
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentBottom() {
            return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentEnd() {
            return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentLeft() {
            return 0;
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentRight() {
            return carouselLayoutManager.getWidth();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentStart() {
            return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        int getParentTop() {
            return carouselLayoutManager.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void layoutDecoratedWithMargins(View view, int i2, int i3) {
            int parentTop = getParentTop();
            carouselLayoutManager.layoutDecoratedWithMargins(view, i2, parentTop, i3, parentTop + getDecoratedCrossAxisMeasurement(view));
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.left = Math.min(rectF.left, rectF.right);
            }
            if (rectF2.left >= rectF3.right) {
                rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.right = Math.max(rectF.left, rectF.right);
            }
        }

        @Override // com.google.android.material.carousel.CarouselOrientationHelper
        public void offsetChild(View view, Rect rect, float f2, float f3) {
            view.offsetLeftAndRight((int) (f3 - (rect.left + f2)));
        }
    }

    private CarouselOrientationHelper(int i2) {
        this.orientation = i2;
    }

    /* synthetic */ CarouselOrientationHelper(int i2, AnonymousClass1 anonymousClass1) {
        this(i2);
    }

    private static CarouselOrientationHelper createHorizontalHelper(CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(0) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.2
            final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(int i2, CarouselLayoutManager carouselLayoutManager2) {
                super(i2);
                carouselLayoutManager = carouselLayoutManager2;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.left < rectF3.left && rectF2.right > rectF3.left) {
                    float f2 = rectF3.left - rectF2.left;
                    rectF.left += f2;
                    rectF2.left += f2;
                }
                if (rectF2.right <= rectF3.right || rectF2.left >= rectF3.right) {
                    return;
                }
                float f3 = rectF2.right - rectF3.right;
                rectF.right = Math.max(rectF.right - f3, rectF.left);
                rectF2.right = Math.max(rectF2.right - f3, rectF2.left);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return layoutParams.rightMargin + layoutParams.leftMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f2, float f3, float f4, float f5) {
                return new RectF(f5, 0.0f, f3 - f5, f2);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return carouselLayoutManager.isLayoutRtl() ? getParentLeft() : getParentRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return carouselLayoutManager.isLayoutRtl() ? getParentRight() : getParentLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return carouselLayoutManager.getPaddingTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i2, int i3) {
                int parentTop = getParentTop();
                carouselLayoutManager.layoutDecoratedWithMargins(view, i2, parentTop, i3, parentTop + getDecoratedCrossAxisMeasurement(view));
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.right <= rectF3.left) {
                    rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
                    rectF.left = Math.min(rectF.left, rectF.right);
                }
                if (rectF2.left >= rectF3.right) {
                    rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
                    rectF.right = Math.max(rectF.left, rectF.right);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f2, float f3) {
                view.offsetLeftAndRight((int) (f3 - (rect.left + f2)));
            }
        };
    }

    static CarouselOrientationHelper createOrientationHelper(CarouselLayoutManager carouselLayoutManager, int i2) {
        if (i2 == 0) {
            return createHorizontalHelper(carouselLayoutManager);
        }
        if (i2 == 1) {
            return createVerticalHelper(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static CarouselOrientationHelper createVerticalHelper(CarouselLayoutManager carouselLayoutManager) {
        return new CarouselOrientationHelper(1) { // from class: com.google.android.material.carousel.CarouselOrientationHelper.1
            final /* synthetic */ CarouselLayoutManager val$carouselLayoutManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i2, CarouselLayoutManager carouselLayoutManager2) {
                super(i2);
                carouselLayoutManager = carouselLayoutManager2;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.top < rectF3.top && rectF2.bottom > rectF3.top) {
                    float f2 = rectF3.top - rectF2.top;
                    rectF.top += f2;
                    rectF3.top += f2;
                }
                if (rectF2.bottom <= rectF3.bottom || rectF2.top >= rectF3.bottom) {
                    return;
                }
                float f3 = rectF2.bottom - rectF3.bottom;
                rectF.bottom = Math.max(rectF.bottom - f3, rectF.top);
                rectF2.bottom = Math.max(rectF2.bottom - f3, rectF2.top);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getDecoratedCrossAxisMeasurement(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return carouselLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public float getMaskMargins(RecyclerView.LayoutParams layoutParams) {
                return layoutParams.topMargin + layoutParams.bottomMargin;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public RectF getMaskRect(float f2, float f3, float f4, float f5) {
                return new RectF(0.0f, f4, f3, f2 - f4);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentBottom() {
                return carouselLayoutManager.getHeight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentEnd() {
                return getParentBottom();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentLeft() {
                return carouselLayoutManager.getPaddingLeft();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentRight() {
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentStart() {
                return getParentTop();
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            int getParentTop() {
                return 0;
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void layoutDecoratedWithMargins(View view, int i2, int i3) {
                int parentLeft = getParentLeft();
                carouselLayoutManager.layoutDecoratedWithMargins(view, parentLeft, i2, parentLeft + getDecoratedCrossAxisMeasurement(view), i3);
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3) {
                if (rectF2.bottom <= rectF3.top) {
                    rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
                    rectF.top = Math.min(rectF.top, rectF.bottom);
                }
                if (rectF2.top >= rectF3.bottom) {
                    rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
                    rectF.bottom = Math.max(rectF.top, rectF.bottom);
                }
            }

            @Override // com.google.android.material.carousel.CarouselOrientationHelper
            public void offsetChild(View view, Rect rect, float f2, float f3) {
                view.offsetTopAndBottom((int) (f3 - (rect.top + f2)));
            }
        };
    }

    abstract void containMaskWithinBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract int getDecoratedCrossAxisMeasurement(View view);

    abstract float getMaskMargins(RecyclerView.LayoutParams layoutParams);

    abstract RectF getMaskRect(float f2, float f3, float f4, float f5);

    abstract int getParentBottom();

    abstract int getParentEnd();

    abstract int getParentLeft();

    abstract int getParentRight();

    abstract int getParentStart();

    abstract int getParentTop();

    abstract void layoutDecoratedWithMargins(View view, int i2, int i3);

    abstract void moveMaskOnEdgeOutsideBounds(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void offsetChild(View view, Rect rect, float f2, float f3);
}
