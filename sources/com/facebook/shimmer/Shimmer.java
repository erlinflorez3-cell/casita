package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class Shimmer {
    private static final int COMPONENT_COUNT = 4;
    long repeatDelay;
    final float[] positions = new float[4];
    final int[] colors = new int[4];
    final RectF bounds = new RectF();
    int direction = 0;
    int highlightColor = -1;
    int baseColor = 1291845631;
    int shape = 0;
    int fixedWidth = 0;
    int fixedHeight = 0;
    float widthRatio = 1.0f;
    float heightRatio = 1.0f;
    float intensity = 0.0f;
    float dropoff = 0.5f;
    float tilt = 20.0f;
    boolean clipToChildren = true;
    boolean autoStart = true;
    boolean alphaShimmer = true;
    int repeatCount = -1;
    int repeatMode = 1;
    long animationDuration = 1000;

    public static class AlphaHighlightBuilder extends Builder<AlphaHighlightBuilder> {
        public AlphaHighlightBuilder() {
            this.mShimmer.alphaShimmer = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.Shimmer.Builder
        public AlphaHighlightBuilder getThis() {
            return this;
        }
    }

    public static abstract class Builder<T extends Builder<T>> {
        final Shimmer mShimmer = new Shimmer();

        private static float clamp(float f2, float f3, float f4) {
            return Math.min(f3, Math.max(f2, f4));
        }

        public Shimmer build() {
            this.mShimmer.updateColors();
            this.mShimmer.updatePositions();
            return this.mShimmer;
        }

        public T consumeAttributes(Context context, AttributeSet attributeSet) throws Throwable {
            int[] iArr = R.styleable.ShimmerFrameLayout;
            short sXd = (short) (C1580rY.Xd() ^ (-24512));
            short sXd2 = (short) (C1580rY.Xd() ^ (-31326));
            int[] iArr2 = new int["\u001b\u001d<a\n;_@\u001dPH7Aq1\u0010N\u0012:9S}a".length()];
            QB qb = new QB("\u001b\u001d<a\n;_@\u001dPH7Aq1\u0010N\u0012:9S}a");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i2));
            Class<?>[] clsArr = {Class.forName(ZO.xd("\u0001obp*-V\b|^.l;P@Uq\u001f8*?<V~m", (short) (Od.Xd() ^ (-29814)), (short) (Od.Xd() ^ (-15685)))), int[].class, Integer.TYPE, Integer.TYPE};
            Object[] objArr = {attributeSet, iArr, 0, 0};
            short sXd3 = (short) (C1580rY.Xd() ^ (-28426));
            short sXd4 = (short) (C1580rY.Xd() ^ (-28341));
            int[] iArr3 = new int["Ql6^22\u0013(a\u001f\u0017vC\b\fz\u0019D^sGH".length()];
            QB qb2 = new QB("Ql6^22\u0013(a\u001f\u0017vC\b\fz\u0019D^sGH");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr3[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr3, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                return (T) consumeAttributes((TypedArray) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        T consumeAttributes(TypedArray typedArray) {
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_clip_to_children)) {
                setClipToChildren(typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_clip_to_children, this.mShimmer.clipToChildren));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_auto_start)) {
                setAutoStart(typedArray.getBoolean(R.styleable.ShimmerFrameLayout_shimmer_auto_start, this.mShimmer.autoStart));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_base_alpha)) {
                setBaseAlpha(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_base_alpha, 0.3f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha)) {
                setHighlightAlpha(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_highlight_alpha, 1.0f));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_duration)) {
                setDuration(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_duration, (int) this.mShimmer.animationDuration));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_count)) {
                setRepeatCount(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_count, this.mShimmer.repeatCount));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_delay)) {
                setRepeatDelay(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_delay, (int) this.mShimmer.repeatDelay));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_repeat_mode)) {
                setRepeatMode(typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_repeat_mode, this.mShimmer.repeatMode));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_direction)) {
                int i2 = typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_direction, this.mShimmer.direction);
                if (i2 == 1) {
                    setDirection(1);
                } else if (i2 == 2) {
                    setDirection(2);
                } else if (i2 != 3) {
                    setDirection(0);
                } else {
                    setDirection(3);
                }
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_shape)) {
                if (typedArray.getInt(R.styleable.ShimmerFrameLayout_shimmer_shape, this.mShimmer.shape) != 1) {
                    setShape(0);
                } else {
                    setShape(1);
                }
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_dropoff)) {
                setDropoff(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_dropoff, this.mShimmer.dropoff));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_fixed_width)) {
                setFixedWidth(typedArray.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_shimmer_fixed_width, this.mShimmer.fixedWidth));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_fixed_height)) {
                setFixedHeight(typedArray.getDimensionPixelSize(R.styleable.ShimmerFrameLayout_shimmer_fixed_height, this.mShimmer.fixedHeight));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_intensity)) {
                setIntensity(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_intensity, this.mShimmer.intensity));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_width_ratio)) {
                setWidthRatio(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_width_ratio, this.mShimmer.widthRatio));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_height_ratio)) {
                setHeightRatio(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_height_ratio, this.mShimmer.heightRatio));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_tilt)) {
                setTilt(typedArray.getFloat(R.styleable.ShimmerFrameLayout_shimmer_tilt, this.mShimmer.tilt));
            }
            return (T) getThis();
        }

        public T copyFrom(Shimmer shimmer) {
            setDirection(shimmer.direction);
            setShape(shimmer.shape);
            setFixedWidth(shimmer.fixedWidth);
            setFixedHeight(shimmer.fixedHeight);
            setWidthRatio(shimmer.widthRatio);
            setHeightRatio(shimmer.heightRatio);
            setIntensity(shimmer.intensity);
            setDropoff(shimmer.dropoff);
            setTilt(shimmer.tilt);
            setClipToChildren(shimmer.clipToChildren);
            setAutoStart(shimmer.autoStart);
            setRepeatCount(shimmer.repeatCount);
            setRepeatMode(shimmer.repeatMode);
            setRepeatDelay(shimmer.repeatDelay);
            setDuration(shimmer.animationDuration);
            this.mShimmer.baseColor = shimmer.baseColor;
            this.mShimmer.highlightColor = shimmer.highlightColor;
            return (T) getThis();
        }

        protected abstract T getThis();

        public T setAutoStart(boolean z2) {
            this.mShimmer.autoStart = z2;
            return (T) getThis();
        }

        public T setBaseAlpha(float f2) {
            int iClamp = (int) (clamp(0.0f, 1.0f, f2) * 255.0f);
            Shimmer shimmer = this.mShimmer;
            int i2 = iClamp << 24;
            int i3 = shimmer.baseColor & ViewCompat.MEASURED_SIZE_MASK;
            shimmer.baseColor = (i2 + i3) - (i2 & i3);
            return (T) getThis();
        }

        public T setClipToChildren(boolean z2) {
            this.mShimmer.clipToChildren = z2;
            return (T) getThis();
        }

        public T setDirection(int i2) {
            this.mShimmer.direction = i2;
            return (T) getThis();
        }

        public T setDropoff(float f2) {
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid dropoff value: " + f2);
            }
            this.mShimmer.dropoff = f2;
            return (T) getThis();
        }

        public T setDuration(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("Given a negative duration: " + j2);
            }
            this.mShimmer.animationDuration = j2;
            return (T) getThis();
        }

        public T setFixedHeight(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Given invalid height: " + i2);
            }
            this.mShimmer.fixedHeight = i2;
            return (T) getThis();
        }

        public T setFixedWidth(int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Given invalid width: " + i2);
            }
            this.mShimmer.fixedWidth = i2;
            return (T) getThis();
        }

        public T setHeightRatio(float f2) {
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid height ratio: " + f2);
            }
            this.mShimmer.heightRatio = f2;
            return (T) getThis();
        }

        public T setHighlightAlpha(float f2) {
            int iClamp = (int) (clamp(0.0f, 1.0f, f2) * 255.0f);
            Shimmer shimmer = this.mShimmer;
            int i2 = iClamp << 24;
            int i3 = shimmer.highlightColor & ViewCompat.MEASURED_SIZE_MASK;
            shimmer.highlightColor = (i2 + i3) - (i2 & i3);
            return (T) getThis();
        }

        public T setIntensity(float f2) {
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid intensity value: " + f2);
            }
            this.mShimmer.intensity = f2;
            return (T) getThis();
        }

        public T setRepeatCount(int i2) {
            this.mShimmer.repeatCount = i2;
            return (T) getThis();
        }

        public T setRepeatDelay(long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("Given a negative repeat delay: " + j2);
            }
            this.mShimmer.repeatDelay = j2;
            return (T) getThis();
        }

        public T setRepeatMode(int i2) {
            this.mShimmer.repeatMode = i2;
            return (T) getThis();
        }

        public T setShape(int i2) {
            this.mShimmer.shape = i2;
            return (T) getThis();
        }

        public T setTilt(float f2) {
            this.mShimmer.tilt = f2;
            return (T) getThis();
        }

        public T setWidthRatio(float f2) {
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Given invalid width ratio: " + f2);
            }
            this.mShimmer.widthRatio = f2;
            return (T) getThis();
        }
    }

    public static class ColorHighlightBuilder extends Builder<ColorHighlightBuilder> {
        public ColorHighlightBuilder() {
            this.mShimmer.alphaShimmer = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.Shimmer.Builder
        public ColorHighlightBuilder consumeAttributes(TypedArray typedArray) {
            super.consumeAttributes(typedArray);
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_base_color)) {
                setBaseColor(typedArray.getColor(R.styleable.ShimmerFrameLayout_shimmer_base_color, this.mShimmer.baseColor));
            }
            if (typedArray.hasValue(R.styleable.ShimmerFrameLayout_shimmer_highlight_color)) {
                setHighlightColor(typedArray.getColor(R.styleable.ShimmerFrameLayout_shimmer_highlight_color, this.mShimmer.highlightColor));
            }
            return getThis();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.shimmer.Shimmer.Builder
        public ColorHighlightBuilder getThis() {
            return this;
        }

        public ColorHighlightBuilder setBaseColor(int i2) {
            Shimmer shimmer = this.mShimmer;
            int i3 = (-1) - (((-1) - this.mShimmer.baseColor) | ((-1) - ViewCompat.MEASURED_STATE_MASK));
            int i4 = i2 & ViewCompat.MEASURED_SIZE_MASK;
            shimmer.baseColor = (i4 + i3) - (i4 & i3);
            return getThis();
        }

        public ColorHighlightBuilder setHighlightColor(int i2) {
            this.mShimmer.highlightColor = i2;
            return getThis();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Direction {
        public static final int BOTTOM_TO_TOP = 3;
        public static final int LEFT_TO_RIGHT = 0;
        public static final int RIGHT_TO_LEFT = 2;
        public static final int TOP_TO_BOTTOM = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Shape {
        public static final int LINEAR = 0;
        public static final int RADIAL = 1;
    }

    Shimmer() {
    }

    int height(int i2) {
        int i3 = this.fixedHeight;
        return i3 > 0 ? i3 : Math.round(this.heightRatio * i2);
    }

    void updateBounds(int i2, int i3) {
        double dMax = Math.max(i2, i3);
        float f2 = -(Math.round(((float) ((dMax / Math.sin(1.5707963267948966d - Math.toRadians(this.tilt % 90.0f))) - dMax)) / 2.0f) * 3);
        this.bounds.set(f2, f2, width(i2) + r4, height(i3) + r4);
    }

    void updateColors() {
        if (this.shape != 1) {
            int[] iArr = this.colors;
            int i2 = this.baseColor;
            iArr[0] = i2;
            int i3 = this.highlightColor;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
            return;
        }
        int[] iArr2 = this.colors;
        int i4 = this.highlightColor;
        iArr2[0] = i4;
        iArr2[1] = i4;
        int i5 = this.baseColor;
        iArr2[2] = i5;
        iArr2[3] = i5;
    }

    void updatePositions() {
        if (this.shape != 1) {
            this.positions[0] = Math.max(((1.0f - this.intensity) - this.dropoff) / 2.0f, 0.0f);
            this.positions[1] = Math.max(((1.0f - this.intensity) - 0.001f) / 2.0f, 0.0f);
            this.positions[2] = Math.min(((this.intensity + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.positions[3] = Math.min(((this.intensity + 1.0f) + this.dropoff) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.positions;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.intensity, 1.0f);
        this.positions[2] = Math.min(this.intensity + this.dropoff, 1.0f);
        this.positions[3] = 1.0f;
    }

    int width(int i2) {
        int i3 = this.fixedWidth;
        return i3 > 0 ? i3 : Math.round(this.widthRatio * i2);
    }
}
