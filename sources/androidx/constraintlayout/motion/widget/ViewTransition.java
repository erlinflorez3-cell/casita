package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class ViewTransition {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static String TAG = "ViewTransition";
    private static final int UNSET = -1;
    static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";
    ConstraintSet.Constraint mConstraintDelta;
    Context mContext;
    private int mId;
    KeyFrames mKeyFrames;
    private int mTargetId;
    private String mTargetString;
    int mViewTransitionMode;
    ConstraintSet set;
    private int mOnStateTransition = -1;
    private boolean mDisabled = false;
    private int mPathMotionArc = 0;
    private int mDuration = -1;
    private int mUpDuration = -1;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mSetsTag = -1;
    private int mClearsTag = -1;
    private int mIfTagSet = -1;
    private int mIfTagNotSet = -1;
    private int mSharedValueTarget = -1;
    private int mSharedValueID = -1;
    private int mSharedValueCurrent = -1;

    public int getSharedValueCurrent() {
        return this.mSharedValueCurrent;
    }

    public void setSharedValueCurrent(int sharedValueCurrent) {
        this.mSharedValueCurrent = sharedValueCurrent;
    }

    public int getStateTransition() {
        return this.mOnStateTransition;
    }

    public void setStateTransition(int stateTransition) {
        this.mOnStateTransition = stateTransition;
    }

    public int getSharedValue() {
        return this.mSharedValueTarget;
    }

    public void setSharedValue(int sharedValue) {
        this.mSharedValueTarget = sharedValue;
    }

    public int getSharedValueID() {
        return this.mSharedValueID;
    }

    public void setSharedValueID(int sharedValueID) {
        this.mSharedValueID = sharedValueID;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.mContext, this.mId) + ")";
    }

    Interpolator getInterpolator(Context context) {
        int i2 = this.mDefaultInterpolator;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
        }
        if (i2 == -1) {
            return new Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                final /* synthetic */ Easing val$easing;

                AnonymousClass1(ViewTransition this, final Easing val$easing) {
                    val$easing = val$easing;
                }

                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float v2) {
                    return (float) val$easing.get(v2);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.ViewTransition$1 */
    class AnonymousClass1 implements Interpolator {
        final /* synthetic */ Easing val$easing;

        AnonymousClass1(ViewTransition this, final Easing val$easing) {
            val$easing = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v2) {
            return (float) val$easing.get(v2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    ViewTransition(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.ViewTransition.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private void parseViewTransitionTags(Context context, XmlPullParser parser) throws Throwable {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(parser);
        int[] iArr = R.styleable.ViewTransition;
        Class<?> cls = Class.forName(C1561oA.Qd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (C1607wl.Xd() ^ 31180)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (ZN.Xd() ^ 31502);
        short sXd2 = (short) (ZN.Xd() ^ 17965);
        int[] iArr2 = new int["=KBQOJF\u0011YYOS\u0016*^_^VPddVEXh".length()];
        QB qb = new QB("=KBQOJF\u0011YYOS\u0016*^_^VPddVEXh");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i2));
        clsArr[1] = int[].class;
        Object[] objArr = {attributeSetAsAttributeSet, iArr};
        short sXd3 = (short) (C1580rY.Xd() ^ (-22359));
        int[] iArr3 = new int["PBS?FJ.NRD<:\u0016HGD:2DB2?".length()];
        QB qb2 = new QB("PBS?FJ.NRD<:\u0016HGD:2DB2?");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr3[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                if (index == R.styleable.ViewTransition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == R.styleable.ViewTransition_motionTarget) {
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId = typedArray.getResourceId(index, this.mTargetId);
                        this.mTargetId = resourceId;
                        if (resourceId == -1) {
                            this.mTargetString = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        this.mTargetString = typedArray.getString(index);
                    } else {
                        this.mTargetId = typedArray.getResourceId(index, this.mTargetId);
                    }
                } else if (index == R.styleable.ViewTransition_onStateTransition) {
                    this.mOnStateTransition = typedArray.getInt(index, this.mOnStateTransition);
                } else if (index == R.styleable.ViewTransition_transitionDisable) {
                    this.mDisabled = typedArray.getBoolean(index, this.mDisabled);
                } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                    this.mPathMotionArc = typedArray.getInt(index, this.mPathMotionArc);
                } else if (index == R.styleable.ViewTransition_duration) {
                    this.mDuration = typedArray.getInt(index, this.mDuration);
                } else if (index == R.styleable.ViewTransition_upDuration) {
                    this.mUpDuration = typedArray.getInt(index, this.mUpDuration);
                } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                    this.mViewTransitionMode = typedArray.getInt(index, this.mViewTransitionMode);
                } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId2;
                        if (resourceId2 != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        String string = typedArray.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null && string.indexOf(C1561oA.Kd("P", (short) (FB.Xd() ^ 6743))) > 0) {
                            this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                            this.mDefaultInterpolator = -2;
                        } else {
                            this.mDefaultInterpolator = -1;
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == R.styleable.ViewTransition_setsTag) {
                    this.mSetsTag = typedArray.getResourceId(index, this.mSetsTag);
                } else if (index == R.styleable.ViewTransition_clearsTag) {
                    this.mClearsTag = typedArray.getResourceId(index, this.mClearsTag);
                } else if (index == R.styleable.ViewTransition_ifTagSet) {
                    this.mIfTagSet = typedArray.getResourceId(index, this.mIfTagSet);
                } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                    this.mIfTagNotSet = typedArray.getResourceId(index, this.mIfTagNotSet);
                } else if (index == R.styleable.ViewTransition_SharedValueId) {
                    this.mSharedValueID = typedArray.getResourceId(index, this.mSharedValueID);
                } else if (index == R.styleable.ViewTransition_SharedValue) {
                    this.mSharedValueTarget = typedArray.getInteger(index, this.mSharedValueTarget);
                }
            }
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void applyIndependentTransition(ViewTransitionController controller, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.mDuration, System.nanoTime());
        new Animate(controller, motionController, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    static class Animate {
        boolean hold_at_100;
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        Interpolator mInterpolator;
        long mLastRender;
        MotionController mMC;
        float mPosition;
        private final int mSetsTag;
        long mStart;
        int mUpDuration;
        ViewTransitionController mVtController;
        KeyCache mCache = new KeyCache();
        boolean reverse = false;
        Rect mTempRec = new Rect();

        Animate(ViewTransitionController controller, MotionController motionController, int duration, int upDuration, int mode, Interpolator interpolator, int setTag, int clearTag) {
            this.hold_at_100 = false;
            this.mVtController = controller;
            this.mMC = motionController;
            this.mDuration = duration;
            this.mUpDuration = upDuration;
            long jNanoTime = System.nanoTime();
            this.mStart = jNanoTime;
            this.mLastRender = jNanoTime;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = setTag;
            this.mClearsTag = clearTag;
            if (mode == 3) {
                this.hold_at_100 = true;
            }
            this.mDpositionDt = duration == 0 ? Float.MAX_VALUE : 1.0f / duration;
            mutate();
        }

        void reverse(boolean dir) {
            int i2;
            this.reverse = dir;
            if (dir && (i2 = this.mUpDuration) != -1) {
                this.mDpositionDt = i2 == 0 ? Float.MAX_VALUE : 1.0f / i2;
            }
            this.mVtController.invalidate();
            this.mLastRender = System.nanoTime();
        }

        void mutate() {
            if (this.reverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        void mutateReverse() {
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f2 = this.mPosition - (((float) (j2 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f2;
            if (f2 < 0.0f) {
                this.mPosition = 0.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, interpolation, jNanoTime, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition > 0.0f || zInterpolate) {
                this.mVtController.invalidate();
            }
        }

        void mutateForward() {
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f2 = this.mPosition + (((float) (j2 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f2;
            if (f2 >= 1.0f) {
                this.mPosition = 1.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, interpolation, jNanoTime, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                if (!this.hold_at_100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition < 1.0f || zInterpolate) {
                this.mVtController.invalidate();
            }
        }

        public void reactTo(int action, float x2, float y2) {
            if (action == 1) {
                if (this.reverse) {
                    return;
                }
                reverse(true);
            } else if (action == 2) {
                this.mMC.getView().getHitRect(this.mTempRec);
                if (this.mTempRec.contains((int) x2, (int) y2) || this.reverse) {
                    return;
                }
                reverse(true);
            }
        }
    }

    void applyTransition(ViewTransitionController controller, MotionLayout layout, int fromId, ConstraintSet current, final View... views) {
        if (this.mDisabled) {
            return;
        }
        int i2 = this.mViewTransitionMode;
        if (i2 == 2) {
            applyIndependentTransition(controller, layout, views[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : layout.getConstraintSetIds()) {
                if (i3 != fromId) {
                    ConstraintSet constraintSet = layout.getConstraintSet(i3);
                    for (View view : views) {
                        ConstraintSet.Constraint constraint = constraintSet.getConstraint(view.getId());
                        ConstraintSet.Constraint constraint2 = this.mConstraintDelta;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(current);
        for (View view2 : views) {
            ConstraintSet.Constraint constraint3 = constraintSet2.getConstraint(view2.getId());
            ConstraintSet.Constraint constraint4 = this.mConstraintDelta;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
            }
        }
        layout.updateState(fromId, constraintSet2);
        layout.updateState(R.id.view_transition, current);
        layout.setState(R.id.view_transition, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, layout.mScene, R.id.view_transition, fromId);
        for (View view3 : views) {
            updateTransition(transition, view3);
        }
        layout.setTransition(transition);
        layout.transitionToEnd(new Runnable() { // from class: androidx.constraintlayout.motion.widget.ViewTransition$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m6902x14d7500(views);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$applyTransition$0$androidx-constraintlayout-motion-widget-ViewTransition */
    /* synthetic */ void m6902x14d7500(View[] viewArr) {
        if (this.mSetsTag != -1) {
            for (View view : viewArr) {
                view.setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.mClearsTag != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.mClearsTag, null);
            }
        }
    }

    private void updateTransition(MotionScene.Transition transition, View view) {
        int i2 = this.mDuration;
        if (i2 != -1) {
            transition.setDuration(i2);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id = view.getId();
        KeyFrames keyFrames = this.mKeyFrames;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator<Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().mo6901clone().setViewId(id));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    int getId() {
        return this.mId;
    }

    void setId(int id) {
        this.mId = id;
    }

    boolean matchesView(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        return this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString);
    }

    boolean supports(int action) {
        int i2 = this.mOnStateTransition;
        return i2 == 1 ? action == 0 : i2 == 2 ? action == 1 : i2 == 3 && action == 0;
    }

    boolean isEnabled() {
        return !this.mDisabled;
    }

    void setEnabled(boolean enable) {
        this.mDisabled = !enable;
    }

    boolean checkTags(View view) {
        int i2 = this.mIfTagSet;
        boolean z2 = i2 == -1 || view.getTag(i2) != null;
        int i3 = this.mIfTagNotSet;
        return z2 && (i3 == -1 || view.getTag(i3) == null);
    }
}
