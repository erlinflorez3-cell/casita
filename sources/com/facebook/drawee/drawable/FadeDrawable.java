package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.Preconditions;
import com.facebook.fresco.ui.common.OnFadeListener;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class FadeDrawable extends ArrayDrawable {
    public static final int TRANSITION_NONE = 2;
    public static final int TRANSITION_RUNNING = 1;
    public static final int TRANSITION_STARTING = 0;
    private final int mActualImageLayer;
    int mAlpha;
    int[] mAlphas;
    private final int mDefaultLayerAlpha;
    private final boolean mDefaultLayerIsOn;
    int mDurationMs;
    private boolean mIsFadingActualImage;
    boolean[] mIsLayerOn;
    private final Drawable[] mLayers;
    private boolean mMutateDrawables;

    @Nullable
    private OnFadeListener mOnFadeListener;
    private boolean mOnFadeListenerShowImmediately;
    int mPreventInvalidateCount;
    int[] mStartAlphas;
    long mStartTimeMs;
    int mTransitionState;

    public FadeDrawable(Drawable[] drawableArr) {
        this(drawableArr, false, -1);
    }

    public FadeDrawable(Drawable[] drawableArr, boolean z2, int i2) {
        super(drawableArr);
        this.mMutateDrawables = true;
        Preconditions.checkState(drawableArr.length >= 1, "At least one layer required!");
        this.mLayers = drawableArr;
        this.mStartAlphas = new int[drawableArr.length];
        this.mAlphas = new int[drawableArr.length];
        this.mAlpha = 255;
        this.mIsLayerOn = new boolean[drawableArr.length];
        this.mPreventInvalidateCount = 0;
        this.mDefaultLayerIsOn = z2;
        this.mDefaultLayerAlpha = z2 ? 255 : 0;
        this.mActualImageLayer = i2;
        resetInternal();
    }

    private void drawDrawableWithAlpha(Canvas canvas, Drawable drawable, int i2) {
        if (drawable == null || i2 <= 0) {
            return;
        }
        this.mPreventInvalidateCount++;
        if (this.mMutateDrawables) {
            drawable.mutate();
        }
        drawable.setAlpha(i2);
        this.mPreventInvalidateCount--;
        drawable.draw(canvas);
    }

    private void maybeOnFadeFinished() {
        if (this.mIsFadingActualImage) {
            this.mIsFadingActualImage = false;
            OnFadeListener onFadeListener = this.mOnFadeListener;
            if (onFadeListener != null) {
                onFadeListener.onFadeFinished();
            }
        }
    }

    private void maybeOnFadeStarted() {
        int i2;
        if (!this.mIsFadingActualImage && (i2 = this.mActualImageLayer) >= 0) {
            boolean[] zArr = this.mIsLayerOn;
            if (i2 < zArr.length && zArr[i2]) {
                this.mIsFadingActualImage = true;
                OnFadeListener onFadeListener = this.mOnFadeListener;
                if (onFadeListener != null) {
                    onFadeListener.onFadeStarted();
                }
            }
        }
    }

    private void maybeOnImageShownImmediately() {
        if (this.mOnFadeListenerShowImmediately && this.mTransitionState == 2 && this.mIsLayerOn[this.mActualImageLayer]) {
            OnFadeListener onFadeListener = this.mOnFadeListener;
            if (onFadeListener != null) {
                onFadeListener.onShownImmediately();
            }
            this.mOnFadeListenerShowImmediately = false;
        }
    }

    private void resetInternal() {
        this.mTransitionState = 2;
        Arrays.fill(this.mStartAlphas, this.mDefaultLayerAlpha);
        this.mStartAlphas[0] = 255;
        Arrays.fill(this.mAlphas, this.mDefaultLayerAlpha);
        this.mAlphas[0] = 255;
        Arrays.fill(this.mIsLayerOn, this.mDefaultLayerIsOn);
        this.mIsLayerOn[0] = true;
    }

    private boolean updateAlphas(float f2) {
        boolean z2 = true;
        for (int i2 = 0; i2 < this.mLayers.length; i2++) {
            boolean z3 = this.mIsLayerOn[i2];
            int i3 = z3 ? 1 : -1;
            int[] iArr = this.mAlphas;
            int i4 = (int) (this.mStartAlphas[i2] + (i3 * 255 * f2));
            iArr[i2] = i4;
            if (i4 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z3 && iArr[i2] < 255) {
                z2 = false;
            }
            if (!z3 && iArr[i2] > 0) {
                z2 = false;
            }
        }
        return z2;
    }

    public void beginBatchMode() {
        this.mPreventInvalidateCount++;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[EDGE_INSN: B:29:0x0071->B:25:0x0071 BREAK  A[LOOP:0: B:5:0x0009->B:7:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e A[LOOP:0: B:5:0x0009->B:7:0x000e, LOOP_END] */
    @Override // com.facebook.drawee.drawable.ArrayDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.mTransitionState
            r4 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 == r5) goto L4f
        L9:
            android.graphics.drawable.Drawable[] r1 = r7.mLayers
            int r0 = r1.length
            if (r6 >= r0) goto L71
            r4 = r1[r6]
            int[] r0 = r7.mAlphas
            r1 = r0[r6]
            int r0 = r7.mAlpha
            int r1 = r1 * r0
            double r2 = (double) r1
            r0 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r2 = r2 / r0
            double r1 = java.lang.Math.ceil(r2)
            int r0 = (int) r1
            r7.drawDrawableWithAlpha(r8, r4, r0)
            int r6 = r6 + 1
            goto L9
        L29:
            int[] r2 = r7.mAlphas
            int[] r1 = r7.mStartAlphas
            android.graphics.drawable.Drawable[] r0 = r7.mLayers
            int r0 = r0.length
            java.lang.System.arraycopy(r2, r6, r1, r6, r0)
            long r0 = r7.getCurrentTimeMs()
            r7.mStartTimeMs = r0
            int r0 = r7.mDurationMs
            if (r0 != 0) goto L4d
            r0 = 1065353216(0x3f800000, float:1.0)
        L3f:
            boolean r0 = r7.updateAlphas(r0)
            r7.maybeOnFadeStarted()
            if (r0 == 0) goto L4b
        L48:
            r7.mTransitionState = r4
            goto L6b
        L4b:
            r4 = r5
            goto L48
        L4d:
            r0 = 0
            goto L3f
        L4f:
            int r0 = r7.mDurationMs
            if (r0 <= 0) goto L6f
            r0 = r5
        L54:
            com.facebook.common.internal.Preconditions.checkState(r0)
            long r2 = r7.getCurrentTimeMs()
            long r0 = r7.mStartTimeMs
            long r2 = r2 - r0
            float r1 = (float) r2
            int r0 = r7.mDurationMs
            float r0 = (float) r0
            float r1 = r1 / r0
            boolean r0 = r7.updateAlphas(r1)
            if (r0 == 0) goto L6d
        L69:
            r7.mTransitionState = r4
        L6b:
            r5 = r0
            goto L9
        L6d:
            r4 = r5
            goto L69
        L6f:
            r0 = r6
            goto L54
        L71:
            if (r5 == 0) goto L7a
            r7.maybeOnFadeFinished()
            r7.maybeOnImageShownImmediately()
        L79:
            return
        L7a:
            r7.invalidateSelf()
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.FadeDrawable.draw(android.graphics.Canvas):void");
    }

    public void endBatchMode() {
        this.mPreventInvalidateCount--;
        invalidateSelf();
    }

    public void fadeInAllLayers() {
        this.mTransitionState = 0;
        Arrays.fill(this.mIsLayerOn, true);
        invalidateSelf();
    }

    public void fadeInLayer(int i2) {
        this.mTransitionState = 0;
        this.mIsLayerOn[i2] = true;
        invalidateSelf();
    }

    public void fadeOutAllLayers() {
        this.mTransitionState = 0;
        Arrays.fill(this.mIsLayerOn, false);
        invalidateSelf();
    }

    public void fadeOutLayer(int i2) {
        this.mTransitionState = 0;
        this.mIsLayerOn[i2] = false;
        invalidateSelf();
    }

    public void fadeToLayer(int i2) {
        this.mTransitionState = 0;
        Arrays.fill(this.mIsLayerOn, false);
        this.mIsLayerOn[i2] = true;
        invalidateSelf();
    }

    public void fadeUpToLayer(int i2) {
        this.mTransitionState = 0;
        int i3 = i2 + 1;
        Arrays.fill(this.mIsLayerOn, 0, i3, true);
        Arrays.fill(this.mIsLayerOn, i3, this.mLayers.length, false);
        invalidateSelf();
    }

    public void finishTransitionImmediately() {
        this.mTransitionState = 2;
        for (int i2 = 0; i2 < this.mLayers.length; i2++) {
            this.mAlphas[i2] = this.mIsLayerOn[i2] ? 255 : 0;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    protected long getCurrentTimeMs() {
        return SystemClock.uptimeMillis();
    }

    public int getTransitionDuration() {
        return this.mDurationMs;
    }

    public int getTransitionState() {
        return this.mTransitionState;
    }

    public void hideLayerImmediately(int i2) {
        this.mIsLayerOn[i2] = false;
        this.mAlphas[i2] = 0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.mPreventInvalidateCount == 0) {
            super.invalidateSelf();
        }
    }

    public boolean isDefaultLayerIsOn() {
        return this.mDefaultLayerIsOn;
    }

    public boolean isLayerOn(int i2) {
        return this.mIsLayerOn[i2];
    }

    public void reset() {
        resetInternal();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.ArrayDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.mAlpha != i2) {
            this.mAlpha = i2;
            invalidateSelf();
        }
    }

    public void setMutateDrawables(boolean z2) {
        this.mMutateDrawables = z2;
    }

    public void setOnFadeListener(@Nullable OnFadeListener onFadeListener) {
        this.mOnFadeListener = onFadeListener;
    }

    public void setTransitionDuration(int i2) {
        this.mDurationMs = i2;
        if (this.mTransitionState == 1) {
            this.mTransitionState = 0;
        }
    }

    public void showLayerImmediately(int i2) {
        this.mIsLayerOn[i2] = true;
        this.mAlphas[i2] = 255;
        if (i2 == this.mActualImageLayer) {
            this.mOnFadeListenerShowImmediately = true;
        }
        invalidateSelf();
    }
}
