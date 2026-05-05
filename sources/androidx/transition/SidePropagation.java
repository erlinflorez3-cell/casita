package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    public void setSide(int i2) {
        this.mSide = i2;
    }

    public void setPropagationSpeed(float f2) {
        if (f2 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.mPropagationSpeed = f2;
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int iCenterX;
        int iCenterY;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null || getViewVisibility(transitionValues3) == 0) {
            i2 = -1;
        } else {
            transitionValues3 = transitionValues2;
            i2 = 1;
        }
        int viewX = getViewX(transitionValues3);
        int viewY = getViewY(transitionValues3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fDistance = distance(viewGroup, viewX, viewY, iCenterX, iCenterY, iRound, iRound2, width, height) / getMaxDistance(viewGroup);
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i2)) / this.mPropagationSpeed) * fDistance);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int distance(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            int r4 = r5.mSide
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3 = 1
            r2 = 5
            r1 = 3
            if (r4 != r0) goto L3f
            int r0 = r6.getLayoutDirection()
            if (r0 != r3) goto L4a
        L10:
            r4 = r2
        L11:
            if (r4 == r1) goto L37
            if (r4 == r2) goto L2f
            r0 = 48
            if (r4 == r0) goto L27
            r0 = 80
            if (r4 == r0) goto L1f
            r0 = 0
        L1e:
            return r0
        L1f:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r0 = java.lang.Math.abs(r9)
            int r0 = r0 + r8
            goto L1e
        L27:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r0 = java.lang.Math.abs(r9)
            int r0 = r0 + r14
            goto L1e
        L2f:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r0 = java.lang.Math.abs(r10)
            int r0 = r0 + r7
            goto L1e
        L37:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r0 = java.lang.Math.abs(r10)
            int r0 = r0 + r13
            goto L1e
        L3f:
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r0) goto L11
            int r0 = r6.getLayoutDirection()
            if (r0 != r3) goto L10
        L4a:
            r4 = r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.SidePropagation.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i2 = this.mSide;
        if (i2 == 3 || i2 == 5 || i2 == 8388611 || i2 == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
