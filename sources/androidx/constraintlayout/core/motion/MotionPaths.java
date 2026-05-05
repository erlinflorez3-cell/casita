package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {ViewProps.POSITION, "x", "y", "width", "height", "pathRotate"};
    HashMap<String, CustomVariable> customAttributes;
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
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* JADX INFO: renamed from: x */
    float f123x;

    /* JADX INFO: renamed from: y */
    float f124y;

    private static final float xRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return (((f6 - f4) * f3) - ((f7 - f5) * f2)) + f4;
    }

    private static final float yRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return ((f6 - f4) * f2) + ((f7 - f5) * f3) + f5;
    }

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f2 : motionKeyPosition.mPercentWidth;
        float f4 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f2 : motionKeyPosition.mPercentHeight;
        float f5 = motionPaths2.width;
        float f6 = motionPaths.width;
        float f7 = f5 - f6;
        float f8 = motionPaths2.height;
        float f9 = motionPaths.height;
        float f10 = f8 - f9;
        this.position = this.time;
        float f11 = motionPaths.f123x;
        float f12 = motionPaths.f124y;
        float f13 = (motionPaths2.f123x + (f5 / 2.0f)) - ((f6 / 2.0f) + f11);
        float f14 = (motionPaths2.f124y + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f15 = (f7 * f3) / 2.0f;
        this.f123x = (int) ((f11 + (f13 * f2)) - f15);
        float f16 = (f10 * f4) / 2.0f;
        this.f124y = (int) ((f12 + (f14 * f2)) - f16);
        this.width = (int) (f6 + r18);
        this.height = (int) (f9 + r17);
        float f17 = Float.isNaN(motionKeyPosition.mPercentX) ? f2 : motionKeyPosition.mPercentX;
        float f18 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f2 = motionKeyPosition.mPercentY;
        }
        float f19 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.f123x = (int) (((motionPaths.f123x + (f17 * f13)) + (f19 * f14)) - f15);
        this.f124y = (int) (((motionPaths.f124y + (f13 * f18)) + (f14 * f2)) - f16);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public MotionPaths(int i2, int i3, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i2, i3, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i4 = motionKeyPosition.mPositionType;
        if (i4 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i4 == 2) {
            initScreen(i2, i3, motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    void initPolar(int i2, int i3, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float fMin;
        float f2;
        float f3 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f3;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        float f4 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f3 : motionKeyPosition.mPercentWidth;
        float f5 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f3 : motionKeyPosition.mPercentHeight;
        float f6 = motionPaths2.width;
        float f7 = motionPaths.width;
        float f8 = motionPaths2.height;
        float f9 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (f7 + ((f6 - f7) * f4));
        this.height = (int) (f9 + ((f8 - f9) * f5));
        int i4 = motionKeyPosition.mPositionType;
        if (i4 == 1) {
            float f10 = Float.isNaN(motionKeyPosition.mPercentX) ? f3 : motionKeyPosition.mPercentX;
            float f11 = motionPaths2.f123x;
            float f12 = motionPaths.f123x;
            this.f123x = (f10 * (f11 - f12)) + f12;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f3 = motionKeyPosition.mPercentY;
            }
            float f13 = motionPaths2.f124y;
            float f14 = motionPaths.f124y;
            this.f124y = (f3 * (f13 - f14)) + f14;
        } else if (i4 == 2) {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                float f15 = motionPaths2.f123x;
                float f16 = motionPaths.f123x;
                fMin = ((f15 - f16) * f3) + f16;
            } else {
                fMin = Math.min(f5, f4) * motionKeyPosition.mPercentX;
            }
            this.f123x = fMin;
            if (Float.isNaN(motionKeyPosition.mPercentY)) {
                float f17 = motionPaths2.f124y;
                float f18 = motionPaths.f124y;
                f2 = (f3 * (f17 - f18)) + f18;
            } else {
                f2 = motionKeyPosition.mPercentY;
            }
            this.f124y = f2;
        } else {
            float f19 = Float.isNaN(motionKeyPosition.mPercentX) ? f3 : motionKeyPosition.mPercentX;
            float f20 = motionPaths2.f123x;
            float f21 = motionPaths.f123x;
            this.f123x = (f19 * (f20 - f21)) + f21;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f3 = motionKeyPosition.mPercentY;
            }
            float f22 = motionPaths2.f124y;
            float f23 = motionPaths.f124y;
            this.f124y = (f3 * (f22 - f23)) + f23;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d2 = ((this.f123x + (this.width / 2.0f)) - motionPaths.f123x) - (motionPaths.width / 2.0f);
        double d3 = ((this.f124y + (this.height / 2.0f)) - motionPaths.f124y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f123x = (float) Math.hypot(d3, d2);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f124y = (float) (Math.atan2(d3, d2) + 1.5707963267948966d);
        } else {
            this.f124y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    void initScreen(int i2, int i3, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f2 : motionKeyPosition.mPercentWidth;
        float f4 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f2 : motionKeyPosition.mPercentHeight;
        float f5 = motionPaths2.width;
        float f6 = f5 - motionPaths.width;
        float f7 = motionPaths2.height;
        float f8 = motionPaths.height;
        this.position = this.time;
        float f9 = motionPaths.f123x;
        float f10 = motionPaths.f124y;
        float f11 = motionPaths2.f123x + (f5 / 2.0f);
        float f12 = (motionPaths2.f124y + (f7 / 2.0f)) - (f10 + (f8 / 2.0f));
        float f13 = f6 * f3;
        this.f123x = (int) ((f9 + ((f11 - ((r8 / 2.0f) + f9)) * f2)) - (f13 / 2.0f));
        float f14 = (f7 - f8) * f4;
        this.f124y = (int) ((f10 + (f12 * f2)) - (f14 / 2.0f));
        this.width = (int) (r8 + f13);
        this.height = (int) (f8 + f14);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f123x = (int) (motionKeyPosition.mPercentX * ((int) (i2 - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f124y = (int) (motionKeyPosition.mPercentY * ((int) (i3 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f3 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f2 : motionKeyPosition.mPercentWidth;
        float f4 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f2 : motionKeyPosition.mPercentHeight;
        float f5 = motionPaths2.width - motionPaths.width;
        float f6 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f2 = motionKeyPosition.mPercentX;
        }
        float f7 = motionPaths.f123x;
        float f8 = motionPaths.width;
        float f9 = motionPaths.f124y;
        float f10 = motionPaths.height;
        float f11 = (motionPaths2.f123x + (motionPaths2.width / 2.0f)) - ((f8 / 2.0f) + f7);
        float f12 = (motionPaths2.f124y + (motionPaths2.height / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = (f5 * f3) / 2.0f;
        this.f123x = (int) ((f7 + f13) - f14);
        float f15 = f2 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.f124y = (int) ((f9 + f15) - f16);
        this.width = (int) (f8 + r12);
        this.height = (int) (f10 + r10);
        float f17 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        float f18 = (-f12) * f17;
        float f19 = f11 * f17;
        this.mMode = 1;
        float f20 = (int) ((motionPaths.f123x + f13) - f14);
        this.f123x = f20;
        float f21 = (int) ((motionPaths.f124y + f15) - f16);
        this.f123x = f20 + f18;
        this.f124y = f21 + f19;
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    private boolean diff(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) != Float.isNaN(f3) : Math.abs(f2 - f3) > 1.0E-6f;
    }

    void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z2) {
        boolean zDiff = diff(this.f123x, motionPaths.f123x);
        boolean zDiff2 = diff(this.f124y, motionPaths.f124y);
        zArr[0] = (-1) - (((-1) - (zArr[0] ? 1 : 0)) & ((-1) - (diff(this.position, motionPaths.position) ? 1 : 0))) == 1;
        boolean z3 = zArr[1];
        int i2 = (-1) - (((-1) - ((zDiff ? 1 : 0) | (zDiff2 ? 1 : 0))) & ((-1) - (z2 ? 1 : 0))) != 1 ? 0 : 1;
        zArr[1] = (-1) - (((-1) - (z3 ? 1 : 0)) & ((-1) - i2)) == 1;
        zArr[2] = i2 | (zArr[2] ? 1 : 0);
        zArr[3] = (-1) - (((-1) - (zArr[3] ? 1 : 0)) & ((-1) - (diff(this.width, motionPaths.width) ? 1 : 0))) == 1;
        boolean z4 = zArr[4];
        boolean zDiff3 = diff(this.height, motionPaths.height);
        zArr[4] = ((zDiff3 ? 1 : 0) + (z4 ? 1 : 0)) - ((zDiff3 ? 1 : 0) & (z4 ? 1 : 0)) == 1;
    }

    void getCenter(double d2, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fSin = this.f123x;
        float fCos = this.f124y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fSin = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d2, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((((double) f5) + (Math.sin(d4) * d3)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d3 * Math.cos(d4))) - ((double) (f3 / 2.0f)));
        }
        fArr[i2] = fSin + (f2 / 2.0f) + 0.0f;
        fArr[i2 + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    void getCenter(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float fSin = this.f123x;
        float fCos = this.f124y;
        float f2 = this.width;
        float f3 = this.height;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f8 = (float) dArr[i2];
            float f9 = (float) dArr2[i2];
            int i3 = iArr[i2];
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
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d2, fArr3, fArr4);
            float f11 = fArr3[0];
            float f12 = fArr3[1];
            float f13 = fArr4[0];
            float f14 = fArr4[1];
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((((double) f11) + (Math.sin(d4) * d3)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f12) - (d3 * Math.cos(d4))) - ((double) (f3 / 2.0f)));
            double d5 = f4;
            double d6 = f6;
            fSin2 = (float) (((double) f13) + (Math.sin(d4) * d5) + (Math.cos(d4) * d6));
            fCos2 = (float) ((((double) f14) - (d5 * Math.cos(d4))) + (Math.sin(d4) * d6));
            f10 = 2.0f;
        }
        fArr[0] = fSin + (f2 / f10) + 0.0f;
        fArr[1] = fCos + (f3 / f10) + 0.0f;
        fArr2[0] = fSin2;
        fArr2[1] = fCos2;
    }

    void getCenterVelocity(double d2, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fSin = this.f123x;
        float fCos = this.f124y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fSin = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d2, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((((double) f5) + (Math.sin(d4) * d3)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d3 * Math.cos(d4))) - ((double) (f3 / 2.0f)));
        }
        fArr[i2] = fSin + (f2 / 2.0f) + 0.0f;
        fArr[i2 + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    void getBounds(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f2 = this.width;
        float f3 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        fArr[i2] = f2;
        fArr[i2 + 1] = f3;
    }

    void setView(float f2, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float fSin = this.f123x;
        float fCos = this.f124y;
        float f3 = this.width;
        float f4 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i2 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i2];
            this.mTempDelta = new double[i2];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.mTempValue;
            int i4 = iArr[i3];
            dArr4[i4] = dArr[i3];
            this.mTempDelta[i4] = dArr2[i3];
        }
        float f5 = Float.NaN;
        int i5 = 0;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i5 >= dArr5.length) {
                break;
            }
            if (!Double.isNaN(dArr5[i5]) || (dArr3 != null && dArr3[i5] != 0.0d)) {
                double d2 = dArr3 != null ? dArr3[i5] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i5])) {
                    d2 += this.mTempValue[i5];
                }
                float f10 = (float) d2;
                float f11 = (float) this.mTempDelta[i5];
                if (i5 == 1) {
                    f6 = f11;
                    fSin = f10;
                } else if (i5 == 2) {
                    f7 = f11;
                    fCos = f10;
                } else if (i5 == 3) {
                    f8 = f11;
                    f3 = f10;
                } else if (i5 == 4) {
                    f9 = f11;
                    f4 = f10;
                } else if (i5 == 5) {
                    f5 = f10;
                }
            }
            i5++;
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f2, fArr, fArr2);
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((((double) f12) + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) f13) - (Math.cos(d4) * d3)) - ((double) (f4 / 2.0f)));
            double d5 = f6;
            double dSin = ((double) f14) + (Math.sin(d4) * d5);
            double d6 = f7;
            float fCos2 = (float) (dSin + (Math.cos(d4) * d3 * d6));
            float fCos3 = (float) ((((double) f15) - (d5 * Math.cos(d4))) + (d3 * Math.sin(d4) * d6));
            if (dArr2.length >= 2) {
                dArr2[0] = fCos2;
                dArr2[1] = fCos3;
            }
            if (!Float.isNaN(f5)) {
                motionWidget.setRotationZ((float) (((double) f5) + Math.toDegrees(Math.atan2(fCos3, fCos2))));
            }
        } else if (!Float.isNaN(f5)) {
            motionWidget.setRotationZ((float) (((double) 0.0f) + ((double) f5) + Math.toDegrees(Math.atan2(f7 + (f9 / 2.0f), f6 + (f8 / 2.0f)))));
        }
        float f16 = fSin + 0.5f;
        float f17 = fCos + 0.5f;
        motionWidget.layout((int) f16, (int) f17, (int) (f16 + f3), (int) (f17 + f4));
    }

    void getRect(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fSin = this.f123x;
        float fCos = this.f124y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fSin = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
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
        fArr[i2] = fSin + 0.0f;
        fArr[i2 + 1] = fCos + 0.0f;
        fArr[i2 + 2] = f5 + 0.0f;
        fArr[i2 + 3] = fCos + 0.0f;
        fArr[i2 + 4] = f5 + 0.0f;
        fArr[i2 + 5] = f6 + 0.0f;
        fArr[i2 + 6] = fSin + 0.0f;
        fArr[i2 + 7] = f6 + 0.0f;
    }

    void setDpDt(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f8 = (float) dArr[i2];
            double d2 = dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f4 = f8;
            } else if (i3 == 2) {
                f6 = f8;
            } else if (i3 == 3) {
                f5 = f8;
            } else if (i3 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (f9 * (1.0f - f2)) + (((f5 * 1.0f) + f9) * f2) + 0.0f;
        fArr[1] = (f10 * (1.0f - f3)) + (((f7 * 1.0f) + f10) * f3) + 0.0f;
    }

    void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f123x, this.f124y, this.width, this.height, this.mPathRotate};
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < 6) {
                dArr[i2] = fArr[r0];
                i2++;
            }
        }
    }

    boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    int getCustomData(String str, double[] dArr, int i2) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i3 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i2] = customVariable.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
        while (i3 < iNumberOfInterpolatedValues) {
            dArr[i2] = r3[i3];
            i3++;
            i2++;
        }
        return iNumberOfInterpolatedValues;
    }

    void setBounds(float f2, float f3, float f4, float f5) {
        this.f123x = f2;
        this.f124y = f3;
        this.width = f4;
        this.height = f5;
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        this.mPathMotionArc = motionWidget.motion.mPathMotionArc;
        this.mAnimateRelativeTo = motionWidget.motion.mAnimateRelativeTo;
        this.mPathRotate = motionWidget.motion.mPathRotate;
        this.mDrawPath = motionWidget.motion.mDrawPath;
        this.mAnimateCircleAngleTo = motionWidget.motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }
}
