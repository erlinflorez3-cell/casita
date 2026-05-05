package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {ViewProps.POSITION, "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* JADX INFO: renamed from: x */
    float f131x;

    /* JADX INFO: renamed from: y */
    float f132y;

    private static final float xRotate(float sin, float cos, float cx, float cy, float x2, float y2) {
        return (((x2 - cx) * cos) - ((y2 - cy) * sin)) + cx;
    }

    private static final float yRotate(float sin, float cos, float cx, float cy, float x2, float y2) {
        return ((x2 - cx) * sin) + ((y2 - cy) * cos) + cy;
    }

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.mAnimateRelativeTo = Key.UNSET;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    void initCartesian(KeyPosition c2, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f2 = c2.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = c2.mDrawPath;
        float f3 = Float.isNaN(c2.mPercentWidth) ? f2 : c2.mPercentWidth;
        float f4 = Float.isNaN(c2.mPercentHeight) ? f2 : c2.mPercentHeight;
        float f5 = endTimePoint.width;
        float f6 = startTimePoint.width;
        float f7 = f5 - f6;
        float f8 = endTimePoint.height;
        float f9 = startTimePoint.height;
        float f10 = f8 - f9;
        this.position = this.time;
        float f11 = startTimePoint.f131x;
        float f12 = startTimePoint.f132y;
        float f13 = (endTimePoint.f131x + (f5 / 2.0f)) - ((f6 / 2.0f) + f11);
        float f14 = (endTimePoint.f132y + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f15 = (f7 * f3) / 2.0f;
        this.f131x = (int) ((f11 + (f13 * f2)) - f15);
        float f16 = (f10 * f4) / 2.0f;
        this.f132y = (int) ((f12 + (f14 * f2)) - f16);
        this.width = (int) (f6 + r18);
        this.height = (int) (f9 + r17);
        float f17 = Float.isNaN(c2.mPercentX) ? f2 : c2.mPercentX;
        float f18 = Float.isNaN(c2.mAltPercentY) ? 0.0f : c2.mAltPercentY;
        if (!Float.isNaN(c2.mPercentY)) {
            f2 = c2.mPercentY;
        }
        float f19 = Float.isNaN(c2.mAltPercentX) ? 0.0f : c2.mAltPercentX;
        this.mMode = 0;
        this.f131x = (int) (((startTimePoint.f131x + (f17 * f13)) + (f19 * f14)) - f15);
        this.f132y = (int) (((startTimePoint.f132y + (f13 * f18)) + (f14 * f2)) - f16);
        this.mKeyFrameEasing = Easing.getInterpolator(c2.mTransitionEasing);
        this.mPathMotionArc = c2.mPathMotionArc;
    }

    public MotionPaths(int parentWidth, int parentHeight, KeyPosition c2, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.mAnimateRelativeTo = Key.UNSET;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (startTimePoint.mAnimateRelativeTo != Key.UNSET) {
            initPolar(parentWidth, parentHeight, c2, startTimePoint, endTimePoint);
            return;
        }
        int i2 = c2.mPositionType;
        if (i2 == 1) {
            initPath(c2, startTimePoint, endTimePoint);
        } else if (i2 == 2) {
            initScreen(parentWidth, parentHeight, c2, startTimePoint, endTimePoint);
        } else {
            initCartesian(c2, startTimePoint, endTimePoint);
        }
    }

    void initPolar(int parentWidth, int parentHeight, KeyPosition c2, MotionPaths s2, MotionPaths e2) {
        float fMin;
        float f2;
        float f3 = c2.mFramePosition / 100.0f;
        this.time = f3;
        this.mDrawPath = c2.mDrawPath;
        this.mMode = c2.mPositionType;
        float f4 = Float.isNaN(c2.mPercentWidth) ? f3 : c2.mPercentWidth;
        float f5 = Float.isNaN(c2.mPercentHeight) ? f3 : c2.mPercentHeight;
        float f6 = e2.width;
        float f7 = s2.width;
        float f8 = e2.height;
        float f9 = s2.height;
        this.position = this.time;
        this.width = (int) (f7 + ((f6 - f7) * f4));
        this.height = (int) (f9 + ((f8 - f9) * f5));
        int i2 = c2.mPositionType;
        if (i2 == 1) {
            float f10 = Float.isNaN(c2.mPercentX) ? f3 : c2.mPercentX;
            float f11 = e2.f131x;
            float f12 = s2.f131x;
            this.f131x = (f10 * (f11 - f12)) + f12;
            if (!Float.isNaN(c2.mPercentY)) {
                f3 = c2.mPercentY;
            }
            float f13 = e2.f132y;
            float f14 = s2.f132y;
            this.f132y = (f3 * (f13 - f14)) + f14;
        } else if (i2 == 2) {
            if (Float.isNaN(c2.mPercentX)) {
                float f15 = e2.f131x;
                float f16 = s2.f131x;
                fMin = ((f15 - f16) * f3) + f16;
            } else {
                fMin = Math.min(f5, f4) * c2.mPercentX;
            }
            this.f131x = fMin;
            if (Float.isNaN(c2.mPercentY)) {
                float f17 = e2.f132y;
                float f18 = s2.f132y;
                f2 = (f3 * (f17 - f18)) + f18;
            } else {
                f2 = c2.mPercentY;
            }
            this.f132y = f2;
        } else {
            float f19 = Float.isNaN(c2.mPercentX) ? f3 : c2.mPercentX;
            float f20 = e2.f131x;
            float f21 = s2.f131x;
            this.f131x = (f19 * (f20 - f21)) + f21;
            if (!Float.isNaN(c2.mPercentY)) {
                f3 = c2.mPercentY;
            }
            float f22 = e2.f132y;
            float f23 = s2.f132y;
            this.f132y = (f3 * (f22 - f23)) + f23;
        }
        this.mAnimateRelativeTo = s2.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c2.mTransitionEasing);
        this.mPathMotionArc = c2.mPathMotionArc;
    }

    public void setupRelative(MotionController mc, MotionPaths relative) {
        double d2 = ((this.f131x + (this.width / 2.0f)) - relative.f131x) - (relative.width / 2.0f);
        double d3 = ((this.f132y + (this.height / 2.0f)) - relative.f132y) - (relative.height / 2.0f);
        this.mRelativeToController = mc;
        this.f131x = (float) Math.hypot(d3, d2);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f132y = (float) (Math.atan2(d3, d2) + 1.5707963267948966d);
        } else {
            this.f132y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    void initScreen(int parentWidth, int parentHeight, KeyPosition c2, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f2 = c2.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = c2.mDrawPath;
        float f3 = Float.isNaN(c2.mPercentWidth) ? f2 : c2.mPercentWidth;
        float f4 = Float.isNaN(c2.mPercentHeight) ? f2 : c2.mPercentHeight;
        float f5 = endTimePoint.width;
        float f6 = f5 - startTimePoint.width;
        float f7 = endTimePoint.height;
        float f8 = startTimePoint.height;
        this.position = this.time;
        float f9 = startTimePoint.f131x;
        float f10 = startTimePoint.f132y;
        float f11 = endTimePoint.f131x + (f5 / 2.0f);
        float f12 = (endTimePoint.f132y + (f7 / 2.0f)) - (f10 + (f8 / 2.0f));
        float f13 = f6 * f3;
        this.f131x = (int) ((f9 + ((f11 - ((r8 / 2.0f) + f9)) * f2)) - (f13 / 2.0f));
        float f14 = (f7 - f8) * f4;
        this.f132y = (int) ((f10 + (f12 * f2)) - (f14 / 2.0f));
        this.width = (int) (r8 + f13);
        this.height = (int) (f8 + f14);
        this.mMode = 2;
        if (!Float.isNaN(c2.mPercentX)) {
            this.f131x = (int) (c2.mPercentX * ((int) (parentWidth - this.width)));
        }
        if (!Float.isNaN(c2.mPercentY)) {
            this.f132y = (int) (c2.mPercentY * ((int) (parentHeight - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c2.mTransitionEasing);
        this.mPathMotionArc = c2.mPathMotionArc;
    }

    void initPath(KeyPosition c2, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f2 = c2.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = c2.mDrawPath;
        float f3 = Float.isNaN(c2.mPercentWidth) ? f2 : c2.mPercentWidth;
        float f4 = Float.isNaN(c2.mPercentHeight) ? f2 : c2.mPercentHeight;
        float f5 = endTimePoint.width - startTimePoint.width;
        float f6 = endTimePoint.height - startTimePoint.height;
        this.position = this.time;
        if (!Float.isNaN(c2.mPercentX)) {
            f2 = c2.mPercentX;
        }
        float f7 = startTimePoint.f131x;
        float f8 = startTimePoint.width;
        float f9 = startTimePoint.f132y;
        float f10 = startTimePoint.height;
        float f11 = (endTimePoint.f131x + (endTimePoint.width / 2.0f)) - ((f8 / 2.0f) + f7);
        float f12 = (endTimePoint.f132y + (endTimePoint.height / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = (f5 * f3) / 2.0f;
        this.f131x = (int) ((f7 + f13) - f14);
        float f15 = f2 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.f132y = (int) ((f9 + f15) - f16);
        this.width = (int) (f8 + r12);
        this.height = (int) (f10 + r10);
        float f17 = Float.isNaN(c2.mPercentY) ? 0.0f : c2.mPercentY;
        float f18 = (-f12) * f17;
        float f19 = f11 * f17;
        this.mMode = 1;
        float f20 = (int) ((startTimePoint.f131x + f13) - f14);
        this.f131x = f20;
        float f21 = (int) ((startTimePoint.f132y + f15) - f16);
        this.f131x = f20 + f18;
        this.f132y = f21 + f19;
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c2.mTransitionEasing);
        this.mPathMotionArc = c2.mPathMotionArc;
    }

    private boolean diff(float a2, float b2) {
        return (Float.isNaN(a2) || Float.isNaN(b2)) ? Float.isNaN(a2) != Float.isNaN(b2) : Math.abs(a2 - b2) > 1.0E-6f;
    }

    void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z2) {
        boolean zDiff = diff(this.f131x, motionPaths.f131x);
        boolean zDiff2 = diff(this.f132y, motionPaths.f132y);
        boolean z3 = zArr[0];
        boolean zDiff3 = diff(this.position, motionPaths.position);
        zArr[0] = ((z3 ? 1 : 0) + (zDiff3 ? 1 : 0)) - ((z3 ? 1 : 0) & (zDiff3 ? 1 : 0)) == 1;
        boolean z4 = zArr[1];
        int i2 = (-1) - (((-1) - ((-1) - (((-1) - (zDiff ? 1 : 0)) & ((-1) - (zDiff2 ? 1 : 0))) != 1 ? 0 : 1)) & ((-1) - (z2 ? 1 : 0))) != 1 ? 0 : 1;
        zArr[1] = (z4 ? 1 : 0) | i2;
        boolean z5 = zArr[2];
        zArr[2] = (i2 + (z5 ? 1 : 0)) - (i2 & (z5 ? 1 : 0)) == 1;
        zArr[3] = (zArr[3] ? 1 : 0) | (diff(this.width, motionPaths.width) ? 1 : 0);
        zArr[4] = (-1) - (((-1) - (diff(this.height, motionPaths.height) ? 1 : 0)) & ((-1) - (zArr[4] ? 1 : 0))) == 1;
    }

    void getCenter(double p2, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f131x;
        float fCos = this.f132y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                fSin = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            motionController.getCenter(p2, fArr, new float[2]);
            float f5 = fArr[0];
            float f6 = fArr[1];
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((((double) f5) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d2 * Math.cos(d3))) - ((double) (f3 / 2.0f)));
        }
        point[offset] = fSin + (f2 / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    void getCenter(double p2, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float fSin = this.f131x;
        float fCos = this.f132y;
        float f2 = this.width;
        float f3 = this.height;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f8 = (float) data[i2];
            float f9 = (float) vdata[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                fSin = f8;
                f4 = f9;
            } else if (i3 == 2) {
                fCos = f8;
                f6 = f9;
            } else if (i3 == 3) {
                f2 = f8;
                f5 = f9;
            } else if (i3 == 4) {
                f3 = f8;
                f7 = f9;
            }
        }
        float f10 = 2.0f;
        float fSin2 = (f5 / 2.0f) + f4;
        float fCos2 = (f7 / 2.0f) + f6;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(p2, fArr, fArr2);
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((((double) f11) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f12) - (d2 * Math.cos(d3))) - ((double) (f3 / 2.0f)));
            double d4 = f4;
            double d5 = f6;
            fSin2 = (float) (((double) f13) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            fCos2 = (float) ((((double) f14) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f10 = 2.0f;
        }
        point[0] = fSin + (f2 / f10) + 0.0f;
        point[1] = fCos + (f3 / f10) + 0.0f;
        velocity[0] = fSin2;
        velocity[1] = fCos2;
    }

    void getCenterVelocity(double p2, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f131x;
        float fCos = this.f132y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                fSin = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            motionController.getCenter(p2, fArr, new float[2]);
            float f5 = fArr[0];
            float f6 = fArr[1];
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((((double) f5) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d2 * Math.cos(d3))) - ((double) (f3 / 2.0f)));
        }
        point[offset] = fSin + (f2 / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    void getBounds(int[] toUse, double[] data, float[] point, int offset) {
        float f2 = this.width;
        float f3 = this.height;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        point[offset] = f2;
        point[offset + 1] = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setView(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float fSin = this.f131x;
        float fCos = this.f132y;
        float f2 = this.width;
        float f3 = this.height;
        if (toUse.length != 0 && this.mTempValue.length <= toUse[toUse.length - 1]) {
            int i2 = toUse[toUse.length - 1] + 1;
            this.mTempValue = new double[i2];
            this.mTempDelta = new double[i2];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i3 = 0; i3 < toUse.length; i3++) {
            double[] dArr = this.mTempValue;
            int i4 = toUse[i3];
            dArr[i4] = data[i3];
            this.mTempDelta[i4] = slope[i3];
        }
        float f4 = Float.NaN;
        int i5 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (true) {
            double[] dArr2 = this.mTempValue;
            if (i5 >= dArr2.length) {
                break;
            }
            if (!Double.isNaN(dArr2[i5]) || (cycle != null && cycle[i5] != 0.0d)) {
                double d2 = cycle != null ? cycle[i5] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i5])) {
                    d2 += this.mTempValue[i5];
                }
                float f9 = (float) d2;
                float f10 = (float) this.mTempDelta[i5];
                if (i5 == 1) {
                    f5 = f10;
                    fSin = f9;
                } else if (i5 == 2) {
                    f6 = f10;
                    fCos = f9;
                } else if (i5 == 3) {
                    f7 = f10;
                    f2 = f9;
                } else if (i5 == 4) {
                    f8 = f10;
                    f3 = f9;
                } else if (i5 == 5) {
                    f4 = f9;
                }
            }
            i5++;
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(position, fArr, fArr2);
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((((double) f11) + (Math.sin(d4) * d3)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f12) - (Math.cos(d4) * d3)) - ((double) (f3 / 2.0f)));
            double d5 = f5;
            double dSin = ((double) f13) + (Math.sin(d4) * d5);
            double d6 = f6;
            float fCos2 = (float) (dSin + (Math.cos(d4) * d3 * d6));
            float fCos3 = (float) ((((double) f14) - (d5 * Math.cos(d4))) + (d3 * Math.sin(d4) * d6));
            if (slope.length >= 2) {
                slope[0] = fCos2;
                slope[1] = fCos3;
            }
            if (!Float.isNaN(f4)) {
                view.setRotation((float) (((double) f4) + Math.toDegrees(Math.atan2(fCos3, fCos2))));
            }
        } else if (!Float.isNaN(f4)) {
            view.setRotation((float) (((double) 0.0f) + ((double) f4) + Math.toDegrees(Math.atan2(f6 + (f8 / 2.0f), f5 + (f7 / 2.0f)))));
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(fSin, fCos, f2 + fSin, fCos + f3);
            return;
        }
        float f15 = fSin + 0.5f;
        int i6 = (int) f15;
        float f16 = fCos + 0.5f;
        int i7 = (int) f16;
        int i8 = (int) (f15 + f2);
        int i9 = (int) (f16 + f3);
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        if (i10 != view.getMeasuredWidth() || i11 != view.getMeasuredHeight() || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        }
        view.layout(i6, i7, i8, i9);
    }

    void getRect(int[] toUse, double[] data, float[] path, int offset) {
        float fSin = this.f131x;
        float fCos = this.f132y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                fSin = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((((double) centerX) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) centerY) - (d2 * Math.cos(d3))) - ((double) (f3 / 2.0f)));
        }
        float f5 = f2 + fSin;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        path[offset] = fSin + 0.0f;
        path[offset + 1] = fCos + 0.0f;
        path[offset + 2] = f5 + 0.0f;
        path[offset + 3] = fCos + 0.0f;
        path[offset + 4] = f5 + 0.0f;
        path[offset + 5] = f6 + 0.0f;
        path[offset + 6] = fSin + 0.0f;
        path[offset + 7] = f6 + 0.0f;
    }

    void setDpDt(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f6 = (float) deltaData[i2];
            double d2 = data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f4 = f6;
            } else if (i3 == 3) {
                f3 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        float f7 = f2 - ((0.0f * f3) / 2.0f);
        float f8 = f4 - ((0.0f * f5) / 2.0f);
        mAnchorDpDt[0] = (f7 * (1.0f - locationX)) + (((f3 * 1.0f) + f7) * locationX) + 0.0f;
        mAnchorDpDt[1] = (f8 * (1.0f - locationY)) + (((f5 * 1.0f) + f8) * locationY) + 0.0f;
    }

    void fillStandard(double[] data, int[] toUse) {
        float[] fArr = {this.position, this.f131x, this.f132y, this.width, this.height, this.mPathRotate};
        int i2 = 0;
        for (int i3 : toUse) {
            if (i3 < 6) {
                data[i2] = fArr[r0];
                i2++;
            }
        }
    }

    boolean hasCustomData(String name) {
        return this.attributes.containsKey(name);
    }

    int getCustomDataCount(String name) {
        ConstraintAttribute constraintAttribute = this.attributes.get(name);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    int getCustomData(String name, double[] value, int offset) {
        ConstraintAttribute constraintAttribute = this.attributes.get(name);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            value[offset] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i2 < iNumberOfInterpolatedValues) {
            value[offset] = r3[i2];
            i2++;
            offset++;
        }
        return iNumberOfInterpolatedValues;
    }

    void setBounds(float x2, float y2, float w2, float h2) {
        this.f131x = x2;
        this.f132y = y2;
        this.width = w2;
        this.height = h2;
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths o2) {
        return Float.compare(this.position, o2.position);
    }

    public void applyParameters(ConstraintSet.Constraint c2) {
        this.mKeyFrameEasing = Easing.getInterpolator(c2.motion.mTransitionEasing);
        this.mPathMotionArc = c2.motion.mPathMotionArc;
        this.mAnimateRelativeTo = c2.motion.mAnimateRelativeTo;
        this.mPathRotate = c2.motion.mPathRotate;
        this.mDrawPath = c2.motion.mDrawPath;
        this.mAnimateCircleAngleTo = c2.motion.mAnimateCircleAngleTo;
        this.mProgress = c2.propertySet.mProgress;
        this.mRelativeAngle = c2.layout.circleAngle;
        for (String str : c2.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = c2.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController toOrbit) {
        toOrbit.getPos(this.mProgress);
    }
}
