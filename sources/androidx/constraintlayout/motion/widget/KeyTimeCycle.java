package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import yg.C1561oA;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes4.dex */
public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    static final String NAME = "KeyTimeCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final String TAG = "KeyTimeCycle";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_SHAPE = "waveShape";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;
    private int mWaveShape = 0;
    private String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;

    public KeyTimeCycle() {
        this.mType = 3;
        this.mCustomConstraints = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attrs) throws Throwable {
        Object[] objArr = {attrs, R.styleable.KeyTimeCycle};
        Method method = Class.forName(C1561oA.Xd("ftkzxso:p}}\u0005v\u0001\bBX\u0006\u0006\r~\u0013\u0010", (short) (Od.Xd() ^ (-30695)))).getMethod(Qg.kd("\u0011\u0003\u0014\u007f\u0007\u000bn\u000f\u0013\u0005|zV\t\b\u0005zr\u0005\u0003r\u007f", (short) (OY.Xd() ^ 7763), (short) (OY.Xd() ^ 6051)), Class.forName(Wg.vd("JXO^TOK\u0016ff\\`\u001b/cdkc]qi[J]u", (short) (C1633zX.Xd() ^ (-2320)))), int[].class);
        try {
            method.setAccessible(true);
            Loader.read(this, (TypedArray) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> attributes) {
        if (!Float.isNaN(this.mAlpha)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            attributes.add("rotation");
        }
        if (!Float.isNaN(this.mRotationX)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            attributes.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator<String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> interpolation) {
        if (this.mCurveFit == -1) {
            return;
        }
        if (!Float.isNaN(this.mAlpha)) {
            interpolation.put("alpha", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mElevation)) {
            interpolation.put("elevation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotation)) {
            interpolation.put("rotation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationX)) {
            interpolation.put("rotationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationY)) {
            interpolation.put("rotationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationX)) {
            interpolation.put("translationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationY)) {
            interpolation.put("translationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            interpolation.put("translationZ", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleX)) {
            interpolation.put("scaleX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleX)) {
            interpolation.put("scaleY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mProgress)) {
            interpolation.put("progress", Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator<String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                interpolation.put("CUSTOM," + it.next(), Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addTimeValues(HashMap<String, ViewTimeCycle> splines) {
        for (String str : splines.keySet()) {
            ViewTimeCycle viewTimeCycle = splines.get(str);
            if (viewTimeCycle != null) {
                byte b2 = 1;
                if (str.startsWith("CUSTOM")) {
                    ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring("CUSTOM".length() + 1));
                    if (constraintAttribute != null) {
                        ((ViewTimeCycle.CustomSet) viewTimeCycle).setPoint(this.mFramePosition, constraintAttribute, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                    }
                } else {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1249320806:
                            b2 = str.equals("rotationX") ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            if (!str.equals("rotationY")) {
                                b2 = -1;
                            }
                            break;
                        case -1225497657:
                            b2 = str.equals("translationX") ? (byte) 2 : (byte) -1;
                            break;
                        case -1225497656:
                            b2 = str.equals("translationY") ? (byte) 3 : (byte) -1;
                            break;
                        case -1225497655:
                            b2 = str.equals("translationZ") ? (byte) 4 : (byte) -1;
                            break;
                        case -1001078227:
                            b2 = str.equals("progress") ? (byte) 5 : (byte) -1;
                            break;
                        case -908189618:
                            b2 = str.equals("scaleX") ? (byte) 6 : (byte) -1;
                            break;
                        case -908189617:
                            b2 = str.equals("scaleY") ? (byte) 7 : (byte) -1;
                            break;
                        case -40300674:
                            b2 = str.equals("rotation") ? (byte) 8 : (byte) -1;
                            break;
                        case -4379043:
                            b2 = str.equals("elevation") ? (byte) 9 : (byte) -1;
                            break;
                        case 37232917:
                            b2 = str.equals("transitionPathRotate") ? (byte) 10 : (byte) -1;
                            break;
                        case 92909918:
                            b2 = str.equals("alpha") ? Ascii.VT : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            if (!Float.isNaN(this.mRotationX)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.mRotationY)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.mTranslationX)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.mTranslationY)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.mTranslationZ)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTranslationZ, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.mProgress)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mProgress, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.mScaleX)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mScaleX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.mScaleY)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mScaleY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.mRotation)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mRotation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.mElevation)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mElevation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.mTransitionPathRotate)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mTransitionPathRotate, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.mAlpha)) {
                                viewTimeCycle.setPoint(this.mFramePosition, this.mAlpha, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            }
                            break;
                        default:
                            String str2 = "UNKNOWN addValues \"" + str + "\"";
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String tag, Object value) {
        tag.hashCode();
        byte b2 = -1;
        switch (tag.hashCode()) {
            case -1913008125:
                if (tag.equals(Key.MOTIONPROGRESS)) {
                    b2 = 0;
                }
                break;
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    b2 = 1;
                }
                break;
            case -1249320806:
                if (tag.equals("rotationX")) {
                    b2 = 2;
                }
                break;
            case -1249320805:
                if (tag.equals("rotationY")) {
                    b2 = 3;
                }
                break;
            case -1225497657:
                if (tag.equals("translationX")) {
                    b2 = 4;
                }
                break;
            case -1225497656:
                if (tag.equals("translationY")) {
                    b2 = 5;
                }
                break;
            case -1225497655:
                if (tag.equals("translationZ")) {
                    b2 = 6;
                }
                break;
            case -908189618:
                if (tag.equals("scaleX")) {
                    b2 = 7;
                }
                break;
            case -908189617:
                if (tag.equals("scaleY")) {
                    b2 = 8;
                }
                break;
            case -40300674:
                if (tag.equals("rotation")) {
                    b2 = 9;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    b2 = 10;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    b2 = Ascii.VT;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    b2 = Ascii.FF;
                }
                break;
            case 156108012:
                if (tag.equals("waveOffset")) {
                    b2 = Ascii.CR;
                }
                break;
            case 184161818:
                if (tag.equals("wavePeriod")) {
                    b2 = Ascii.SO;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    b2 = Ascii.SI;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    b2 = 16;
                }
                break;
        }
        switch (b2) {
            case 0:
                this.mProgress = toFloat(value);
                break;
            case 1:
                this.mTransitionEasing = value.toString();
                break;
            case 2:
                this.mRotationX = toFloat(value);
                break;
            case 3:
                this.mRotationY = toFloat(value);
                break;
            case 4:
                this.mTranslationX = toFloat(value);
                break;
            case 5:
                this.mTranslationY = toFloat(value);
                break;
            case 6:
                this.mTranslationZ = toFloat(value);
                break;
            case 7:
                this.mScaleX = toFloat(value);
                break;
            case 8:
                this.mScaleY = toFloat(value);
                break;
            case 9:
                this.mRotation = toFloat(value);
                break;
            case 10:
                this.mElevation = toFloat(value);
                break;
            case 11:
                this.mTransitionPathRotate = toFloat(value);
                break;
            case 12:
                this.mAlpha = toFloat(value);
                break;
            case 13:
                this.mWaveOffset = toFloat(value);
                break;
            case 14:
                this.mWavePeriod = toFloat(value);
                break;
            case 15:
                this.mCurveFit = toInt(value);
                break;
            case 16:
                if (value instanceof Integer) {
                    this.mWaveShape = toInt(value);
                } else {
                    this.mWaveShape = 7;
                    this.mCustomWaveShape = value.toString();
                }
                break;
        }
    }

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static SparseIntArray mAttrMap = null;

        private Loader() {
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            mAttrMap.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            mAttrMap.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            mAttrMap.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            mAttrMap.append(R.styleable.KeyTimeCycle_framePosition, 12);
            mAttrMap.append(R.styleable.KeyTimeCycle_curveFit, 13);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            mAttrMap.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            mAttrMap.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            mAttrMap.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            mAttrMap.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            mAttrMap.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void read(KeyTimeCycle c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (mAttrMap.get(index)) {
                    case 1:
                        c2.mAlpha = a2.getFloat(index, c2.mAlpha);
                        break;
                    case 2:
                        c2.mElevation = a2.getDimension(index, c2.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        String str = "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index);
                        break;
                    case 4:
                        c2.mRotation = a2.getFloat(index, c2.mRotation);
                        break;
                    case 5:
                        c2.mRotationX = a2.getFloat(index, c2.mRotationX);
                        break;
                    case 6:
                        c2.mRotationY = a2.getFloat(index, c2.mRotationY);
                        break;
                    case 7:
                        c2.mScaleX = a2.getFloat(index, c2.mScaleX);
                        break;
                    case 8:
                        c2.mTransitionPathRotate = a2.getFloat(index, c2.mTransitionPathRotate);
                        break;
                    case 9:
                        c2.mTransitionEasing = a2.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            c2.mTargetId = a2.getResourceId(index, c2.mTargetId);
                            if (c2.mTargetId == -1) {
                                c2.mTargetString = a2.getString(index);
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c2.mTargetString = a2.getString(index);
                        } else {
                            c2.mTargetId = a2.getResourceId(index, c2.mTargetId);
                        }
                        break;
                    case 12:
                        c2.mFramePosition = a2.getInt(index, c2.mFramePosition);
                        break;
                    case 13:
                        c2.mCurveFit = a2.getInteger(index, c2.mCurveFit);
                        break;
                    case 14:
                        c2.mScaleY = a2.getFloat(index, c2.mScaleY);
                        break;
                    case 15:
                        c2.mTranslationX = a2.getDimension(index, c2.mTranslationX);
                        break;
                    case 16:
                        c2.mTranslationY = a2.getDimension(index, c2.mTranslationY);
                        break;
                    case 17:
                        c2.mTranslationZ = a2.getDimension(index, c2.mTranslationZ);
                        break;
                    case 18:
                        c2.mProgress = a2.getFloat(index, c2.mProgress);
                        break;
                    case 19:
                        if (a2.peekValue(index).type == 3) {
                            c2.mCustomWaveShape = a2.getString(index);
                            c2.mWaveShape = 7;
                        } else {
                            c2.mWaveShape = a2.getInt(index, c2.mWaveShape);
                        }
                        break;
                    case 20:
                        c2.mWavePeriod = a2.getFloat(index, c2.mWavePeriod);
                        break;
                    case 21:
                        if (a2.peekValue(index).type == 5) {
                            c2.mWaveOffset = a2.getDimension(index, c2.mWaveOffset);
                        } else {
                            c2.mWaveOffset = a2.getFloat(index, c2.mWaveOffset);
                        }
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key src) {
        super.copy(src);
        KeyTimeCycle keyTimeCycle = (KeyTimeCycle) src;
        this.mTransitionEasing = keyTimeCycle.mTransitionEasing;
        this.mCurveFit = keyTimeCycle.mCurveFit;
        this.mWaveShape = keyTimeCycle.mWaveShape;
        this.mWavePeriod = keyTimeCycle.mWavePeriod;
        this.mWaveOffset = keyTimeCycle.mWaveOffset;
        this.mProgress = keyTimeCycle.mProgress;
        this.mAlpha = keyTimeCycle.mAlpha;
        this.mElevation = keyTimeCycle.mElevation;
        this.mRotation = keyTimeCycle.mRotation;
        this.mTransitionPathRotate = keyTimeCycle.mTransitionPathRotate;
        this.mRotationX = keyTimeCycle.mRotationX;
        this.mRotationY = keyTimeCycle.mRotationY;
        this.mScaleX = keyTimeCycle.mScaleX;
        this.mScaleY = keyTimeCycle.mScaleY;
        this.mTranslationX = keyTimeCycle.mTranslationX;
        this.mTranslationY = keyTimeCycle.mTranslationY;
        this.mTranslationZ = keyTimeCycle.mTranslationZ;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo6901clone() {
        return new KeyTimeCycle().copy(this);
    }
}
