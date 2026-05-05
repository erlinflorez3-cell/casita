package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import yg.C1499aX;
import yg.C1561oA;
import yg.Xg;

/* JADX INFO: loaded from: classes4.dex */
public class MotionController {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, ViewSpline> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    View mView;
    Rect mTempRect = new Rect();
    boolean mForceMeasure = false;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private int mPathMotionArc = Key.UNSET;
    private int mTransformPivotTarget = Key.UNSET;
    private View mTransformPivotView = null;
    private int mQuantizeMotionSteps = Key.UNSET;
    private float mQuantizeMotionPhase = Float.NaN;
    private Interpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public void setTransformPivotTarget(int transformPivotTarget) {
        this.mTransformPivotTarget = transformPivotTarget;
        this.mTransformPivotView = null;
    }

    MotionPaths getKeyFrame(int i2) {
        return this.mMotionPaths.get(i2);
    }

    MotionController(View view) {
        setView(view);
    }

    public float getStartX() {
        return this.mStartMotionPath.f131x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f132y;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f131x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f132y;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getCenter(double p2, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(p2, dArr);
        this.mSpline[0].getSlope(p2, dArr2);
        Arrays.fill(vel, 0.0f);
        this.mStartMotionPath.getCenter(p2, this.mInterpolateVariables, dArr, pos, dArr2, vel);
    }

    public void remeasure() {
        this.mForceMeasure = true;
    }

    void buildPath(float[] points, int pointCount) {
        float f2 = 1.0f;
        float f3 = 1.0f / (pointCount - 1);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewOscillator> map3 = this.mCycleMap;
        ViewOscillator viewOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < pointCount) {
            float fMin = i2 * f3;
            float f4 = this.mStaggerScale;
            float f5 = 0.0f;
            if (f4 != f2) {
                float f6 = this.mStaggerOffset;
                if (fMin < f6) {
                    fMin = 0.0f;
                }
                if (fMin > f6 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f6) * f4, f2);
                }
            }
            double d2 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f7 = Float.NaN;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < fMin) {
                        easing = motionPaths.mKeyFrameEasing;
                        f5 = motionPaths.time;
                    } else if (Float.isNaN(f7)) {
                        f7 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d2 = (((float) easing.get((fMin - f5) / r11)) * (f7 - f5)) + f5;
            }
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            int i3 = i2 * 2;
            this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, points, i3);
            if (viewOscillator != null) {
                points[i3] = points[i3] + viewOscillator.get(fMin);
            } else if (viewSpline != null) {
                points[i3] = points[i3] + viewSpline.get(fMin);
            }
            if (viewOscillator2 != null) {
                int i4 = i3 + 1;
                points[i4] = points[i4] + viewOscillator2.get(fMin);
            } else if (viewSpline2 != null) {
                int i5 = i3 + 1;
                points[i5] = points[i5] + viewSpline2.get(fMin);
            }
            i2++;
            f2 = 1.0f;
        }
    }

    double[] getPos(double position) {
        this.mSpline[0].getPos(position, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(position, dArr);
            }
        }
        return this.mInterpolateData;
    }

    void buildBounds(float[] bounds, int pointCount) {
        float f2 = 1.0f / (pointCount - 1);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, ViewOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i2 = 0; i2 < pointCount; i2++) {
            float fMin = i2 * f2;
            float f3 = this.mStaggerScale;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.mStaggerOffset;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, 1.0f);
                }
            }
            double d2 = fMin;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < fMin) {
                        easing = motionPaths.mKeyFrameEasing;
                        f4 = motionPaths.time;
                    } else if (Float.isNaN(f6)) {
                        f6 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                d2 = (((float) easing.get((fMin - f4) / r10)) * (f6 - f4)) + f4;
            }
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d2, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, bounds, i2 * 2);
        }
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d2 = 0.0d;
        double d3 = 0.0d;
        float fHypot = 0.0f;
        for (int i2 = 0; i2 < 100; i2++) {
            float f3 = i2 * f2;
            double d4 = f3;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f4 = Float.NaN;
            float f5 = 0.0f;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < f3) {
                        easing = motionPaths.mKeyFrameEasing;
                        f5 = motionPaths.time;
                    } else if (Float.isNaN(f4)) {
                        f4 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d4 = (((float) easing.get((f3 - f5) / r6)) * (f4 - f5)) + f5;
            }
            this.mSpline[0].getPos(d4, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d4, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i2 > 0) {
                fHypot = (float) (((double) fHypot) + Math.hypot(d3 - ((double) fArr[1]), d2 - ((double) fArr[0])));
            }
            d2 = fArr[0];
            d3 = fArr[1];
        }
        return fHypot;
    }

    KeyPositionBase getPositionKeyframe(int layoutWidth, int layoutHeight, float x2, float y2) {
        RectF rectF = new RectF();
        rectF.left = this.mStartMotionPath.f131x;
        rectF.top = this.mStartMotionPath.f132y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        RectF rectF2 = new RectF();
        rectF2.left = this.mEndMotionPath.f131x;
        rectF2.top = this.mEndMotionPath.f132y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        for (Key key : this.mKeyList) {
            if (key instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) key;
                if (keyPositionBase.intersects(layoutWidth, layoutHeight, rectF, rectF2, x2, y2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    int buildKeyFrames(float[] keyFrames, int[] mode) {
        if (keyFrames == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (mode != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                mode[i2] = it.next().mMode;
                i2++;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < timePoints.length; i4++) {
            this.mSpline[0].getPos(timePoints[i4], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i4], this.mInterpolateVariables, this.mInterpolateData, keyFrames, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    int buildKeyBounds(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (mode != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                mode[i2] = it.next().mMode;
                i2++;
            }
        }
        int i3 = 0;
        for (double d2 : timePoints) {
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, keyBounds, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    int getAttributeValues(String attributeType, float[] points, int pointCount) {
        ViewSpline viewSpline = this.mAttributesMap.get(attributeType);
        if (viewSpline == null) {
            return -1;
        }
        for (int i2 = 0; i2 < points.length; i2++) {
            points[i2] = viewSpline.get(i2 / (points.length - 1));
        }
        return points.length;
    }

    void buildRect(float p2, float[] path, int offset) {
        this.mSpline[0].getPos(getAdjustedPosition(p2, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, path, offset);
    }

    void buildRectangles(float[] path, int pointCount) {
        float f2 = 1.0f / (pointCount - 1);
        for (int i2 = 0; i2 < pointCount; i2++) {
            this.mSpline[0].getPos(getAdjustedPosition(i2 * f2, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, path, i2 * 8);
        }
    }

    float getKeyFrameParameter(int type, float x2, float y2) {
        float f2 = this.mEndMotionPath.f131x - this.mStartMotionPath.f131x;
        float f3 = this.mEndMotionPath.f132y - this.mStartMotionPath.f132y;
        float f4 = this.mStartMotionPath.f131x + (this.mStartMotionPath.width / 2.0f);
        float f5 = this.mStartMotionPath.f132y + (this.mStartMotionPath.height / 2.0f);
        float fHypot = (float) Math.hypot(f2, f3);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f6 = x2 - f4;
        float f7 = y2 - f5;
        if (((float) Math.hypot(f6, f7)) == 0.0f) {
            return 0.0f;
        }
        float f8 = (f6 * f2) + (f7 * f3);
        if (type == 0) {
            return f8 / fHypot;
        }
        if (type == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f8 * f8));
        }
        if (type == 2) {
            return f6 / f2;
        }
        if (type == 3) {
            return f7 / f2;
        }
        if (type == 4) {
            return f6 / f3;
        }
        if (type != 5) {
            return 0.0f;
        }
        return f7 / f3;
    }

    private void insertKey(MotionPaths point) {
        if (Collections.binarySearch(this.mMotionPaths, point) == 0) {
            String str = " KeyPath position \"" + point.position + "\" outside of range";
        }
        this.mMotionPaths.add((-r2) - 1, point);
    }

    void addKeys(ArrayList<Key> list) {
        this.mKeyList.addAll(list);
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void setPathMotionArc(int arc) {
        this.mPathMotionArc = arc;
    }

    public void setup(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle viewTimeCycleMakeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        ViewSpline viewSplineMakeSpline;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        if (this.mPathMotionArc != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = this.mPathMotionArc;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            arrayList = null;
            for (Key key : arrayList2) {
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    insertKey(new MotionPaths(parentWidth, parentHeight, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    if (keyPosition.mCurveFit != Key.UNSET) {
                        this.mCurveFitType = keyPosition.mCurveFit;
                    }
                } else if (key instanceof KeyCycle) {
                    key.getAttributeNames(hashSet3);
                } else if (key instanceof KeyTimeCycle) {
                    key.getAttributeNames(hashSet);
                } else if (key instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key);
                } else {
                    key.setInterpolation(map);
                    key.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (Key key2 : this.mKeyList) {
                        if (key2.mCustomConstraints != null && (constraintAttribute3 = key2.mCustomConstraints.get(str2)) != null) {
                            sparseArray.append(key2.mFramePosition, constraintAttribute3);
                        }
                    }
                    viewSplineMakeSpline = ViewSpline.makeCustomSpline(str, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    viewSplineMakeSpline = ViewSpline.makeSpline(str);
                }
                if (viewSplineMakeSpline != null) {
                    viewSplineMakeSpline.setType(str);
                    this.mAttributesMap.put(str, viewSplineMakeSpline);
                }
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                for (Key key3 : arrayList3) {
                    if (key3 instanceof KeyAttributes) {
                        key3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str3 : this.mAttributesMap.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                ViewSpline viewSpline = this.mAttributesMap.get(str3);
                if (viewSpline != null) {
                    viewSpline.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.mTimeCycleAttributesMap.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (Key key4 : this.mKeyList) {
                            if (key4.mCustomConstraints != null && (constraintAttribute2 = key4.mCustomConstraints.get(str5)) != null) {
                                sparseArray2.append(key4.mFramePosition, constraintAttribute2);
                            }
                        }
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeCustomSpline(str4, sparseArray2);
                    } else {
                        viewTimeCycleMakeSpline = ViewTimeCycle.makeSpline(str4, currentTime);
                    }
                    if (viewTimeCycleMakeSpline != null) {
                        viewTimeCycleMakeSpline.setType(str4);
                        this.mTimeCycleAttributesMap.put(str4, viewTimeCycleMakeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                for (Key key5 : arrayList4) {
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str6 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size();
        int i2 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i2];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            motionPathsArr[i3] = it.next();
            i3++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str7) && !hashSet2.contains("CUSTOM," + str7)) {
                hashSet4.add(str7);
            }
        }
        String[] strArr = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr;
        this.mAttributeInterpolatorCount = new int[strArr.length];
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.mAttributeNames;
            if (i4 >= strArr2.length) {
                break;
            }
            String str8 = strArr2[i4];
            this.mAttributeInterpolatorCount[i4] = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    break;
                }
                if (motionPathsArr[i5].attributes.containsKey(str8) && (constraintAttribute = motionPathsArr[i5].attributes.get(str8)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i4] = iArr[i4] + constraintAttribute.numberOfInterpolatedValues();
                    break;
                }
                i5++;
            }
            i4++;
        }
        boolean z2 = motionPathsArr[0].mPathMotionArc != Key.UNSET;
        int length = 18 + this.mAttributeNames.length;
        boolean[] zArr = new boolean[length];
        for (int i6 = 1; i6 < i2; i6++) {
            motionPathsArr[i6].different(motionPathsArr[i6 - 1], zArr, this.mAttributeNames, z2);
        }
        int i7 = 0;
        for (int i8 = 1; i8 < length; i8++) {
            if (zArr[i8]) {
                i7++;
            }
        }
        this.mInterpolateVariables = new int[i7];
        int i9 = 2;
        int iMax = Math.max(2, i7);
        this.mInterpolateData = new double[iMax];
        this.mInterpolateVelocity = new double[iMax];
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                this.mInterpolateVariables[i10] = i11;
                i10++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, this.mInterpolateVariables.length);
        double[] dArr2 = new double[i2];
        for (int i12 = 0; i12 < i2; i12++) {
            motionPathsArr[i12].fillStandard(dArr[i12], this.mInterpolateVariables);
            dArr2[i12] = motionPathsArr[i12].time;
        }
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i13 >= iArr2.length) {
                break;
            }
            if (iArr2[i13] < MotionPaths.names.length) {
                String str9 = MotionPaths.names[this.mInterpolateVariables[i13]] + " [";
                for (int i14 = 0; i14 < i2; i14++) {
                    str9 = str9 + dArr[i14][i13];
                }
            }
            i13++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i15 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i15 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i15];
            int i16 = 0;
            int i17 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i16 < i2) {
                if (motionPathsArr[i16].hasCustomData(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i2];
                        int[] iArr3 = new int[i9];
                        iArr3[1] = motionPathsArr[i16].getCustomDataCount(str10);
                        iArr3[0] = i2;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    dArr3[i17] = motionPathsArr[i16].time;
                    motionPathsArr[i16].getCustomData(str10, dArr4[i17], 0);
                    i17++;
                }
                i16++;
                i9 = 2;
            }
            i15++;
            this.mSpline[i15] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i17), (double[][]) Arrays.copyOf(dArr4, i17));
            i9 = 2;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr4 = new int[i2];
            double[] dArr5 = new double[i2];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i2, 2);
            for (int i18 = 0; i18 < i2; i18++) {
                iArr4[i18] = motionPathsArr[i18].mPathMotionArc;
                dArr5[i18] = motionPathsArr[i18].time;
                dArr6[i18][0] = motionPathsArr[i18].f131x;
                dArr6[i18][1] = motionPathsArr[i18].f132y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            float preCycleDistance = Float.NaN;
            for (String str11 : hashSet3) {
                ViewOscillator viewOscillatorMakeSpline = ViewOscillator.makeSpline(str11);
                if (viewOscillatorMakeSpline != null) {
                    if (viewOscillatorMakeSpline.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    viewOscillatorMakeSpline.setType(str11);
                    this.mCycleMap.put(str11, viewOscillatorMakeSpline);
                }
            }
            for (Key key6 : this.mKeyList) {
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it2 = this.mCycleMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f131x + " y: " + this.mStartMotionPath.f132y + " end: x: " + this.mEndMotionPath.f131x + " y: " + this.mEndMotionPath.f132y;
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public View getView() {
        return this.mView;
    }

    void setStartCurrentState(View v2) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mStartMotionPath.setBounds(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.mStartPoint.setState(v2);
    }

    public void setStartState(ViewState rect, View v2, int rotation, int preWidth, int preHeight) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i2 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = preWidth - ((i2 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (rotation == 2) {
            int i3 = rect.left + rect.right;
            rect2.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i3 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
        this.mStartMotionPath.setBounds(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.mStartPoint.setState(rect2, v2, rotation, rect.rotation);
    }

    void rotate(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i2 = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((i2 + rect.height()) / 2);
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation == 2) {
            int i3 = rect.left + rect.right;
            out.left = preHeight - (((rect.top + rect.bottom) + rect.width()) / 2);
            out.top = (i3 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        if (rotation != 3) {
            if (rotation != 4) {
                return;
            }
            int i4 = rect.left + rect.right;
            out.left = preHeight - (((rect.bottom + rect.top) + rect.width()) / 2);
            out.top = (i4 - rect.height()) / 2;
            out.right = out.left + rect.width();
            out.bottom = out.top + rect.height();
            return;
        }
        int i5 = rect.left + rect.right;
        int i6 = rect.top;
        int i7 = rect.bottom;
        out.left = ((rect.height() / 2) + rect.top) - (i5 / 2);
        out.top = preWidth - ((i5 + rect.height()) / 2);
        out.right = out.left + rect.width();
        out.bottom = out.top + rect.height();
    }

    void setStartState(Rect cw, ConstraintSet constraintSet, int parentWidth, int parentHeight) {
        int i2 = constraintSet.mRotate;
        if (i2 != 0) {
            rotate(cw, this.mTempRect, i2, parentWidth, parentHeight);
        }
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        readView(this.mStartMotionPath);
        this.mStartMotionPath.setBounds(cw.left, cw.top, cw.width(), cw.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(cw, constraintSet, i2, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        this.mQuantizeMotionSteps = parameters.motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = parameters.motion.mQuantizeMotionPhase;
        this.mQuantizeMotionInterpolator = getInterpolator(this.mView.getContext(), parameters.motion.mQuantizeInterpolatorType, parameters.motion.mQuantizeInterpolatorString, parameters.motion.mQuantizeInterpolatorID);
    }

    private static Interpolator getInterpolator(Context context, int type, String interpolatorString, int id) {
        if (type == -2) {
            return AnimationUtils.loadInterpolator(context, id);
        }
        if (type == -1) {
            final Easing interpolator = Easing.getInterpolator(interpolatorString);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float v2) {
                    return (float) interpolator.get(v2);
                }
            };
        }
        if (type == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (type == 1) {
            return new AccelerateInterpolator();
        }
        if (type == 2) {
            return new DecelerateInterpolator();
        }
        if (type == 4) {
            return new BounceInterpolator();
        }
        if (type != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    void setEndState(Rect cw, ConstraintSet constraintSet, int parentWidth, int parentHeight) {
        Rect rect = cw;
        int i2 = constraintSet.mRotate;
        if (i2 != 0) {
            rotate(rect, this.mTempRect, i2, parentWidth, parentHeight);
            rect = this.mTempRect;
        }
        this.mEndMotionPath.time = 1.0f;
        this.mEndMotionPath.position = 1.0f;
        readView(this.mEndMotionPath);
        this.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i2, this.mId);
    }

    void setBothStates(View v2) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mNoMovement = true;
        this.mStartMotionPath.setBounds(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.mEndMotionPath.setBounds(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.mStartPoint.setState(v2);
        this.mEndPoint.setState(v2);
    }

    private float getAdjustedPosition(float position, float[] velocity) {
        float f2 = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f3 = this.mStaggerScale;
            if (f3 != 1.0d) {
                float f4 = this.mStaggerOffset;
                if (position < f4) {
                    position = 0.0f;
                }
                if (position > f4 && position < 1.0d) {
                    position = Math.min((position - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f5 = Float.NaN;
        for (MotionPaths motionPaths : this.mMotionPaths) {
            if (motionPaths.mKeyFrameEasing != null) {
                if (motionPaths.time < position) {
                    easing = motionPaths.mKeyFrameEasing;
                    f2 = motionPaths.time;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.time;
                }
            }
        }
        if (easing != null) {
            float f6 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d2 = (position - f2) / f6;
            position = (((float) easing.get(d2)) * f6) + f2;
            if (velocity != null) {
                velocity[0] = (float) easing.getDiff(d2);
            }
        }
        return position;
    }

    void endTrigger(boolean start) {
        if (!"button".equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i2 >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i2].conditionallyFire(start ? -100.0f : 100.0f, this.mView);
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean interpolate(View view, float f2, long j2, KeyCache keyCache) {
        boolean z2;
        float interpolation;
        ViewTimeCycle.PathRotate pathRotate = null;
        float adjustedPosition = getAdjustedPosition(f2, null);
        if (this.mQuantizeMotionSteps != Key.UNSET) {
            float f3 = 1.0f / this.mQuantizeMotionSteps;
            float fFloor = ((float) Math.floor(adjustedPosition / f3)) * f3;
            float f4 = (adjustedPosition % f3) / f3;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f4 = (f4 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f4);
            } else {
                interpolation = ((double) f4) > 0.5d ? 1.0f : 0.0f;
            }
            adjustedPosition = (interpolation * f3) + fFloor;
        }
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        if (map != null) {
            Iterator<ViewSpline> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view, adjustedPosition);
            }
        }
        HashMap<String, ViewTimeCycle> map2 = this.mTimeCycleAttributesMap;
        if (map2 != null) {
            z2 = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    adjustedPosition = adjustedPosition;
                    z2 = (z2 ? 1 : 0) | (viewTimeCycle.setProperty(view, adjustedPosition, j2, keyCache) ? 1 : 0);
                }
            }
        } else {
            z2 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            CurveFit curveFit = curveFitArr[0];
            double d2 = adjustedPosition;
            curveFit.getPos(d2, this.mInterpolateData);
            this.mSpline[0].getSlope(d2, this.mInterpolateVelocity);
            CurveFit curveFit2 = this.mArcSpline;
            if (curveFit2 != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit2.getPos(d2, dArr);
                    this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(adjustedPosition, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r8.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> map3 = this.mAttributesMap;
            if (map3 != null) {
                for (ViewSpline viewSpline : map3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view, adjustedPosition, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                int i2 = (-1) - (((-1) - (z2 ? 1 : 0)) & ((-1) - (pathRotate.setPathRotate(view, keyCache, adjustedPosition, j2, dArr3[0], dArr3[1]) ? 1 : 0)));
                z2 = true;
                if (i2 != 1) {
                    z2 = false;
                }
            }
            int i3 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i3 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i3].getPos(d2, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.attributes.get(this.mAttributeNames[i3 - 1]), view, this.mValuesBuff);
                i3++;
            }
            if (this.mStartPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= 0.0f) {
                    view.setVisibility(this.mStartPoint.visibility);
                } else if (adjustedPosition >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != this.mStartPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i4 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i4 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i4].conditionallyFire(adjustedPosition, view);
                    i4++;
                }
            }
        } else {
            float f5 = this.mStartMotionPath.f131x + ((this.mEndMotionPath.f131x - this.mStartMotionPath.f131x) * adjustedPosition) + 0.5f;
            int i5 = (int) f5;
            float f6 = this.mStartMotionPath.f132y + ((this.mEndMotionPath.f132y - this.mStartMotionPath.f132y) * adjustedPosition) + 0.5f;
            int i6 = (int) f6;
            int i7 = (int) (f5 + this.mStartMotionPath.width + ((this.mEndMotionPath.width - this.mStartMotionPath.width) * adjustedPosition));
            int i8 = (int) (f6 + this.mStartMotionPath.height + ((this.mEndMotionPath.height - this.mStartMotionPath.height) * adjustedPosition));
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (this.mEndMotionPath.width != this.mStartMotionPath.width || this.mEndMotionPath.height != this.mStartMotionPath.height || this.mForceMeasure) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.mForceMeasure = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, ViewOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    viewOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return z2;
    }

    void getDpDt(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(position, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i2 = 0;
        if (curveFitArr != null) {
            CurveFit curveFit = curveFitArr[0];
            double d2 = adjustedPosition;
            curveFit.getSlope(d2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            float f2 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f2);
                i2++;
            }
            CurveFit curveFit2 = this.mArcSpline;
            if (curveFit2 != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit2.getPos(d2, dArr2);
                    this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        float f3 = this.mEndMotionPath.f131x - this.mStartMotionPath.f131x;
        float f4 = this.mEndMotionPath.f132y - this.mStartMotionPath.f132y;
        float f5 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f3;
        float f6 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f4;
        mAnchorDpDt[0] = (f3 * (1.0f - locationX)) + (f5 * locationX);
        mAnchorDpDt[1] = (f4 * (1.0f - locationY)) + (f6 * locationY);
    }

    void getPostLayoutDvDp(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float adjustedPosition = getAdjustedPosition(position, this.mVelocity);
        HashMap<String, ViewSpline> map = this.mAttributesMap;
        ViewSpline viewSpline = map == null ? null : map.get("translationX");
        HashMap<String, ViewSpline> map2 = this.mAttributesMap;
        ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, ViewSpline> map3 = this.mAttributesMap;
        ViewSpline viewSpline3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, ViewSpline> map4 = this.mAttributesMap;
        ViewSpline viewSpline4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, ViewSpline> map5 = this.mAttributesMap;
        ViewSpline viewSpline5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, ViewOscillator> map6 = this.mCycleMap;
        ViewOscillator viewOscillator = map6 == null ? null : map6.get("translationX");
        HashMap<String, ViewOscillator> map7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, ViewOscillator> map8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, ViewOscillator> map9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, ViewOscillator> map10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = map10 != null ? map10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d2 = adjustedPosition;
                curveFit.getPos(d2, dArr);
                this.mArcSpline.getSlope(d2, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i2 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f2 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i2 < dArr2.length) {
                    dArr2[i2] = dArr2[i2] * ((double) f2);
                    i2++;
                } else {
                    this.mStartMotionPath.setDpDt(locationX, locationY, mAnchorDpDt, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
                    return;
                }
            }
        } else {
            float f3 = this.mEndMotionPath.f131x - this.mStartMotionPath.f131x;
            float f4 = this.mEndMotionPath.f132y - this.mStartMotionPath.f132y;
            float f5 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f3;
            float f6 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f4;
            mAnchorDpDt[0] = (f3 * (1.0f - locationX)) + (f5 * locationX);
            mAnchorDpDt[1] = (f4 * (1.0f - locationY)) + (f6 * locationY);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
            velocityMatrix.applyTransform(locationX, locationY, width, height, mAnchorDpDt);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mDrawPath);
        }
        return Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public void setDrawPath(int debugMode) {
        this.mStartMotionPath.mDrawPath = debugMode;
    }

    String name() throws Throwable {
        Context context = this.mView.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f", (short) (C1499aX.Xd() ^ (-15116)))).getMethod(Xg.qd("vu\u0006dx\b\u0005\f\n{~\u000e", (short) (C1499aX.Xd() ^ (-28963)), (short) (C1499aX.Xd() ^ (-27946))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getResourceEntryName(this.mView.getId());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void positionKeyframe(View view, KeyPositionBase key, float x2, float y2, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        rectF.left = this.mStartMotionPath.f131x;
        rectF.top = this.mStartMotionPath.f132y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        RectF rectF2 = new RectF();
        rectF2.left = this.mEndMotionPath.f131x;
        rectF2.top = this.mEndMotionPath.f132y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        key.positionAttributes(view, rectF, rectF2, x2, y2, attribute, value);
    }

    public int getKeyFramePositions(int[] type, float[] pos) {
        int i2 = 0;
        int i3 = 0;
        for (Key key : this.mKeyList) {
            type[i2] = key.mFramePosition + (key.mType * 1000);
            double d2 = key.mFramePosition / 100.0f;
            this.mSpline[0].getPos(d2, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, pos, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }

    public int getKeyFrameInfo(int type, int[] info) {
        float[] fArr = new float[2];
        int i2 = 0;
        int i3 = 0;
        for (Key key : this.mKeyList) {
            if (key.mType == type || type != -1) {
                info[i3] = 0;
                info[i3 + 1] = key.mType;
                info[i3 + 2] = key.mFramePosition;
                double d2 = key.mFramePosition / 100.0f;
                this.mSpline[0].getPos(d2, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d2, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                info[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i4 = i3 + 4;
                info[i4] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    info[i3 + 5] = keyPosition.mPositionType;
                    info[i3 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i4 = i3 + 7;
                    info[i4] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i5 = i4 + 1;
                info[i3] = i5 - i3;
                i2++;
                i3 = i5;
            }
        }
        return i2;
    }
}
