package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
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
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class MotionScene {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final String INCLUDE_TAG = "include";
    private static final String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final int MIN_DURATION = 8;
    private static final String MOTIONSCENE_TAG = "MotionScene";
    private static final String ONCLICK_TAG = "OnClick";
    private static final String ONSWIPE_TAG = "OnSwipe";
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String STATESET_TAG = "StateSet";
    private static final String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    private static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final String VIEW_TRANSITION = "ViewTransition";
    private MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private final MotionLayout mMotionLayout;
    private boolean mRtl;
    private MotionLayout.MotionTracker mVelocityTracker;
    final ViewTransitionController mViewTransitionController;
    StateSet mStateSet = null;
    Transition mCurrentTransition = null;
    private boolean mDisableAutoTransition = false;
    private ArrayList<Transition> mTransitionList = new ArrayList<>();
    private Transition mDefaultTransition = null;
    private ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    private SparseIntArray mDeriveMap = new SparseIntArray();
    private boolean DEBUG_DESKTOP = false;
    private int mDefaultDuration = 400;
    private int mLayoutDuringTransition = 0;
    private boolean mIgnoreTouch = false;
    private boolean mMotionOutsideRegion = false;

    public float getPathPercent(View view, int position) {
        return 0.0f;
    }

    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void setTransition(int r8, int r9) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.StateSet r0 = r7.mStateSet
            r6 = -1
            if (r0 == 0) goto L28
            int r5 = r0.stateGetConstraintID(r8, r6, r6)
            if (r5 == r6) goto L26
        Lb:
            androidx.constraintlayout.widget.StateSet r0 = r7.mStateSet
            int r4 = r0.stateGetConstraintID(r9, r6, r6)
            if (r4 == r6) goto L29
        L13:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mCurrentTransition
            if (r0 == 0) goto L2b
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r0)
            if (r0 != r9) goto L2b
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mCurrentTransition
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r0)
            if (r0 != r8) goto L2b
            return
        L26:
            r5 = r8
            goto Lb
        L28:
            r5 = r8
        L29:
            r4 = r9
            goto L13
        L2b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r7.mTransitionList
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r1)
            if (r0 != r4) goto L49
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r1)
            if (r0 == r5) goto L55
        L49:
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r1)
            if (r0 != r9) goto L31
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r1)
            if (r0 != r8) goto L31
        L55:
            r7.mCurrentTransition = r1
            if (r1 == 0) goto L6a
            androidx.constraintlayout.motion.widget.TouchResponse r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r1)
            if (r0 == 0) goto L6a
            androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r7.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r1 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r0)
            boolean r0 = r7.mRtl
            r1.setRTL(r0)
        L6a:
            return
        L6b:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r7.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r7.mAbstractTransitionList
            java.util.Iterator r2 = r0.iterator()
        L73:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r1 = r2.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r1
            int r0 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r1)
            if (r0 != r9) goto L73
            r3 = r1
            goto L73
        L87:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r1.<init>(r7, r3)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r1, r5)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r1, r4)
            if (r5 == r6) goto L99
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r0 = r7.mTransitionList
            r0.add(r1)
        L99:
            r7.mCurrentTransition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.setTransition(int, int):void");
    }

    public void addTransition(Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public void removeTransition(Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    private int getIndex(Transition transition) {
        int i2 = transition.mId;
        if (i2 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i3 = 0; i3 < this.mTransitionList.size(); i3++) {
            if (this.mTransitionList.get(i3).mId == i2) {
                return i3;
            }
        }
        return -1;
    }

    public boolean validateLayout(MotionLayout layout) {
        return layout == this.mMotionLayout && layout.mScene == this;
    }

    public void setTransition(Transition transition) {
        this.mCurrentTransition = transition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    private int getRealID(int stateId) {
        int iStateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        return (stateSet == null || (iStateGetConstraintID = stateSet.stateGetConstraintID(stateId, -1, -1)) == -1) ? stateId : iStateGetConstraintID;
    }

    public List<Transition> getTransitionsWithState(int stateId) {
        int realID = getRealID(stateId);
        ArrayList arrayList = new ArrayList();
        for (Transition transition : this.mTransitionList) {
            if (transition.mConstraintSetStart == realID || transition.mConstraintSetEnd == realID) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    public void addOnClickListeners(MotionLayout motionLayout, int currentState) {
        for (Transition transition : this.mTransitionList) {
            if (transition.mOnClicks.size() > 0) {
                Iterator it = transition.mOnClicks.iterator();
                while (it.hasNext()) {
                    ((Transition.TransitionOnClick) it.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        for (Transition transition2 : this.mAbstractTransitionList) {
            if (transition2.mOnClicks.size() > 0) {
                Iterator it2 = transition2.mOnClicks.iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        for (Transition transition3 : this.mTransitionList) {
            if (transition3.mOnClicks.size() > 0) {
                Iterator it3 = transition3.mOnClicks.iterator();
                while (it3.hasNext()) {
                    ((Transition.TransitionOnClick) it3.next()).addOnClickListeners(motionLayout, currentState, transition3);
                }
            }
        }
        for (Transition transition4 : this.mAbstractTransitionList) {
            if (transition4.mOnClicks.size() > 0) {
                Iterator it4 = transition4.mOnClicks.iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).addOnClickListeners(motionLayout, currentState, transition4);
                }
            }
        }
    }

    public Transition bestTransitionFor(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        if (currentState != -1) {
            List<Transition> transitionsWithState = getTransitionsWithState(currentState);
            RectF rectF = new RectF();
            float f2 = 0.0f;
            Transition transition = null;
            for (Transition transition2 : transitionsWithState) {
                if (!transition2.mDisable && transition2.mTouchResponse != null) {
                    transition2.mTouchResponse.setRTL(this.mRtl);
                    RectF touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion == null || lastTouchDown == null || touchRegion.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        RectF limitBoundsTo = transition2.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                        if (limitBoundsTo == null || lastTouchDown == null || limitBoundsTo.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                            float fDot = transition2.mTouchResponse.dot(dx, dy);
                            if (transition2.mTouchResponse.mIsRotateMode && lastTouchDown != null) {
                                fDot = ((float) (Math.atan2(dy + r9, dx + r10) - Math.atan2(lastTouchDown.getX() - transition2.mTouchResponse.mRotateCenterX, lastTouchDown.getY() - transition2.mTouchResponse.mRotateCenterY))) * 10.0f;
                            }
                            float f3 = fDot * (transition2.mConstraintSetEnd == currentState ? -1.0f : 1.1f);
                            if (f3 > f2) {
                                transition = transition2;
                                f2 = f3;
                            }
                        }
                    }
                }
            }
            return transition;
        }
        return this.mCurrentTransition;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public Transition getTransitionById(int id) {
        for (Transition transition : this.mTransitionList) {
            if (transition.mId == id) {
                return transition;
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.mConstraintSetMap.keyAt(i2);
        }
        return iArr;
    }

    boolean autoTransition(MotionLayout motionLayout, int currentState) {
        Transition transition;
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        for (Transition transition2 : this.mTransitionList) {
            if (transition2.mAutoTransition != 0 && ((transition = this.mCurrentTransition) != transition2 || !transition.isTransitionFlag(2))) {
                if (currentState == transition2.mConstraintSetStart && (transition2.mAutoTransition == 4 || transition2.mAutoTransition == 2)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
                if (currentState == transition2.mConstraintSetEnd && (transition2.mAutoTransition == 3 || transition2.mAutoTransition == 1)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    public void setRtl(boolean rtl) {
        this.mRtl = rtl;
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    public void viewTransition(int id, View... view) {
        this.mViewTransitionController.viewTransition(id, view);
    }

    public void enableViewTransition(int id, boolean enable) {
        this.mViewTransitionController.enableViewTransition(id, enable);
    }

    public boolean isViewTransitionEnabled(int id) {
        return this.mViewTransitionController.isViewTransitionEnabled(id);
    }

    public boolean applyViewTransition(int viewTransitionId, MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(viewTransitionId, motionController);
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private ArrayList<KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final MotionScene mMotionScene;
        private ArrayList<TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private TouchResponse mTouchResponse;
        private int mTransitionFlags;

        public void setOnSwipe(OnSwipe onSwipe) {
            this.mTouchResponse = onSwipe == null ? null : new TouchResponse(this.mMotionScene.mMotionLayout, onSwipe);
        }

        public void addOnClick(int id, int action) {
            for (TransitionOnClick transitionOnClick : this.mOnClicks) {
                if (transitionOnClick.mTargetId == id) {
                    transitionOnClick.mMode = action;
                    return;
                }
            }
            this.mOnClicks.add(new TransitionOnClick(this, id, action));
        }

        public void removeOnClick(int id) {
            TransitionOnClick next;
            Iterator<TransitionOnClick> it = this.mOnClicks.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.mTargetId == id) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                this.mOnClicks.remove(next);
            }
        }

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public void setLayoutDuringTransition(int mode) {
            this.mLayoutDuringTransition = mode;
        }

        public void addOnClick(Context context, XmlPullParser parser) {
            this.mOnClicks.add(new TransitionOnClick(context, this, parser));
        }

        public void setAutoTransition(int type) {
            this.mAutoTransition = type;
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getId() {
            return this.mId;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public void setDuration(int duration) {
            this.mDuration = Math.max(duration, 8);
        }

        public int getDuration() {
            return this.mDuration;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public void setStagger(float stagger) {
            this.mStagger = stagger;
        }

        public void setPathMotionArc(int arcMode) {
            this.mPathMotionArc = arcMode;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public void setEnable(boolean enable) {
            setEnabled(enable);
        }

        public void setEnabled(boolean enable) {
            this.mDisable = !enable;
        }

        public String debugString(Context context) throws Throwable {
            String resourceEntryName;
            if (this.mConstraintSetStart == -1) {
                resourceEntryName = C1561oA.Qd("\u000e\u0014\n\t", (short) (FB.Xd() ^ 1917));
            } else {
                short sXd = (short) (Od.Xd() ^ (-17209));
                short sXd2 = (short) (Od.Xd() ^ (-2574));
                int[] iArr = new int["1?6EC>:\u0005;HHOAKR\r#PPWI]Z".length()];
                QB qb = new QB("1?6EC>:\u0005;HHOAKR\r#PPWI]Z");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("TQ_<N[V[WGHU", (short) (ZN.Xd() ^ 4506)), new Class[0]);
                try {
                    method.setAccessible(true);
                    resourceEntryName = ((Resources) method.invoke(context, objArr)).getResourceEntryName(this.mConstraintSetStart);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            if (this.mConstraintSetEnd == -1) {
                return resourceEntryName + C1561oA.Kd("^l~a1912", (short) (C1607wl.Xd() ^ 11643));
            }
            StringBuilder sbAppend = new StringBuilder().append(resourceEntryName).append(Wg.Zd("]vdS", (short) (Od.Xd() ^ (-7546)), (short) (Od.Xd() ^ (-13597))));
            short sXd3 = (short) (Od.Xd() ^ (-12753));
            int[] iArr2 = new int["\u0012 \u0017&$\u001f\u001be\u001c))0\",3m\u0004118*>;".length()];
            QB qb2 = new QB("\u0012 \u0017&$\u001f\u001be\u001c))0\",3m\u0004118*>;");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.vd("ol~[ivuzrbgt", (short) (Od.Xd() ^ (-31097))), new Class[0]);
            try {
                method2.setAccessible(true);
                return sbAppend.append(((Resources) method2.invoke(context, objArr2)).getResourceEntryName(this.mConstraintSetEnd)).toString();
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        public boolean isTransitionFlag(int flag) {
            int i2 = this.mTransitionFlags;
            return (flag + i2) - (flag | i2) != 0;
        }

        public void setTransitionFlag(int flag) {
            this.mTransitionFlags = flag;
        }

        public void setOnTouchUp(int touchUpMode) {
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(touchUpMode);
            }
        }

        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser parser) throws Throwable {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(parser);
                int[] iArr = R.styleable.OnClick;
                Class<?> cls = Class.forName(C1561oA.Xd("IWN][VR\u001dS``gYcj%;hhoaur", (short) (ZN.Xd() ^ 2057)));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (C1499aX.Xd() ^ (-16394));
                int[] iArr2 = new int["x\u0005}\u000b\u0003{yB\u0015\u0013\u000b\rI[\u0012\u0011\u001a\u0010\f\u001e\u0018\bx\n$".length()];
                QB qb = new QB("x\u0005}\u000b\u0003{yB\u0015\u0013\u000b\rI[\u0012\u0011\u001a\u0010\f\u001e\u0018\bx\n$");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr2[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i2));
                clsArr[1] = int[].class;
                Object[] objArr = {attributeSetAsAttributeSet, iArr};
                Method method = cls.getMethod(Qg.kd("'\u0019*\u0016\u001d!\u0005%)\u001b\u0013\u0011l\u001f\u001e\u001b\u0011\t\u001b\u0019\t\u0016", (short) (C1607wl.Xd() ^ 31685), (short) (C1607wl.Xd() ^ 11507)), clsArr);
                try {
                    method.setAccessible(true);
                    TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                    int indexCount = typedArray.getIndexCount();
                    for (int i3 = 0; i3 < indexCount; i3++) {
                        int index = typedArray.getIndex(i3);
                        if (index == R.styleable.OnClick_targetId) {
                            this.mTargetId = typedArray.getResourceId(index, this.mTargetId);
                        } else if (index == R.styleable.OnClick_clickAction) {
                            this.mMode = typedArray.getInt(index, this.mMode);
                        }
                    }
                    typedArray.recycle();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            public TransitionOnClick(Transition transition, int id, int action) {
                this.mTransition = transition;
                this.mTargetId = id;
                this.mMode = action;
            }

            public void addOnClickListeners(MotionLayout motionLayout, int i2, Transition transition) {
                int i3 = this.mTargetId;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i3 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i3);
                }
                if (motionLayoutFindViewById != null) {
                    int i4 = transition.mConstraintSetStart;
                    int i5 = transition.mConstraintSetEnd;
                    if (i4 == -1) {
                        motionLayoutFindViewById.setOnClickListener(this);
                        return;
                    }
                    int i6 = this.mMode;
                    int i7 = 0;
                    int i8 = (((i6 + 1) - (1 | i6) == 0 || i2 != i4) ? 0 : 1) | (((i6 + 256) - (256 | i6) == 0 || i2 != i4) ? 0 : 1);
                    int i9 = ((1 & i6) == 0 || i2 != i4) ? 0 : 1;
                    int i10 = ((i9 + i8) - (i9 & i8)) | (((-1) - (((-1) - i6) | ((-1) - 16)) == 0 || i2 != i5) ? 0 : 1);
                    if ((i6 + 4096) - (i6 | 4096) != 0 && i2 == i5) {
                        i7 = 1;
                    }
                    if ((-1) - (((-1) - i10) & ((-1) - i7)) != 0) {
                        motionLayoutFindViewById.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                String str = "OnClick could not find id " + this.mTargetId;
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i2 = this.mTargetId;
                if (i2 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i2);
                if (viewFindViewById == null) {
                    String str = " (*)  could not find id " + this.mTargetId;
                } else {
                    viewFindViewById.setOnClickListener(null);
                }
            }

            boolean isTransitionViable(Transition current, MotionLayout tl) {
                Transition transition = this.mTransition;
                if (transition == current) {
                    return true;
                }
                int i2 = transition.mConstraintSetEnd;
                int i3 = this.mTransition.mConstraintSetStart;
                return i3 == -1 ? tl.mCurrentState != i2 : tl.mCurrentState == i3 || tl.mCurrentState == i2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                    if (motionLayout.isInteractionEnabled()) {
                        if (this.mTransition.mConstraintSetStart != -1) {
                            Transition transition = this.mTransition.mMotionScene.mCurrentTransition;
                            int i2 = this.mMode;
                            boolean z2 = false;
                            boolean z3 = ((1 & i2) == 0 && (i2 + 256) - (256 | i2) == 0) ? false : true;
                            boolean z4 = ((i2 + 16) - (16 | i2) == 0 && (i2 & 4096) == 0) ? false : true;
                            if (z3 && z4) {
                                Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                                Transition transition3 = this.mTransition;
                                if (transition2 != transition3) {
                                    motionLayout.setTransition(transition3);
                                }
                                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                                    z4 = false;
                                    z2 = z3;
                                }
                            } else {
                                z2 = z3;
                            }
                            if (isTransitionViable(transition, motionLayout)) {
                                if (z2 && (this.mMode & 1) != 0) {
                                    motionLayout.setTransition(this.mTransition);
                                    motionLayout.transitionToEnd();
                                } else if (z4 && (-1) - (((-1) - this.mMode) | ((-1) - 16)) != 0) {
                                    motionLayout.setTransition(this.mTransition);
                                    motionLayout.transitionToStart();
                                } else if (z2 && (-1) - (((-1) - this.mMode) | ((-1) - 256)) != 0) {
                                    motionLayout.setTransition(this.mTransition);
                                    motionLayout.setProgress(1.0f);
                                } else if (z4 && (-1) - (((-1) - this.mMode) | ((-1) - 4096)) != 0) {
                                    motionLayout.setTransition(this.mTransition);
                                    motionLayout.setProgress(0.0f);
                                }
                            }
                            Callback.onClick_exit();
                            return;
                        }
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.transitionToState(this.mTransition.mConstraintSetEnd);
                            return;
                        }
                        Transition transition4 = new Transition(this.mTransition.mMotionScene, this.mTransition);
                        transition4.mConstraintSetStart = currentState;
                        transition4.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                        motionLayout.setTransition(transition4);
                        motionLayout.transitionToEnd();
                    }
                } finally {
                    Callback.onClick_exit();
                }
            }
        }

        Transition(MotionScene motionScene, Transition global) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (global != null) {
                this.mPathMotionArc = global.mPathMotionArc;
                this.mDefaultInterpolator = global.mDefaultInterpolator;
                this.mDefaultInterpolatorString = global.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = global.mDefaultInterpolatorID;
                this.mDuration = global.mDuration;
                this.mKeyFramesList = global.mKeyFramesList;
                this.mStagger = global.mStagger;
                this.mLayoutDuringTransition = global.mLayoutDuringTransition;
            }
        }

        public Transition(int id, MotionScene motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = id;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = constraintSetStartId;
            this.mConstraintSetEnd = constraintSetEndId;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        Transition(MotionScene motionScene, Context context, XmlPullParser parser) throws Throwable {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = 400;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(parser));
        }

        public void setInterpolatorInfo(int interpolator, String interpolatorString, int interpolatorID) {
            this.mDefaultInterpolator = interpolator;
            this.mDefaultInterpolatorString = interpolatorString;
            this.mDefaultInterpolatorID = interpolatorID;
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attrs) throws Throwable {
            Object[] objArr = {attrs, R.styleable.Transition};
            Method method = Class.forName(C1626yg.Ud("l\u0015uah6d;Is$2Gd\bW\u0004G\f\u007fq\u0016<", (short) (ZN.Xd() ^ 31941), (short) (ZN.Xd() ^ 3386))).getMethod(EO.Od("\u0012Os\u0005\u0005F\u000b\u0015Tg^\u007f\u000bH}[\u0018xe*V2", (short) (C1499aX.Xd() ^ (-23915))), Class.forName(Ig.wd("-\u007fG9^$?\u00189\bz_v\u00043\u0019ZG\u0018^Ip\u000f#Z", (short) (FB.Xd() ^ 479))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                fill(motionScene, context, typedArray);
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private void fill(MotionScene motionScene, Context context, TypedArray a2) throws Throwable {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                int i3 = R.styleable.Transition_constraintSetEnd;
                String strVd = hg.Vd("nb`", (short) (C1633zX.Xd() ^ (-1828)), (short) (C1633zX.Xd() ^ (-12065)));
                String strUd = C1561oA.ud("\u0004w\u000f\u0004\t\u0007", (short) (C1499aX.Xd() ^ (-5393)));
                if (index == i3) {
                    this.mConstraintSetEnd = a2.getResourceId(index, -1);
                    short sXd = (short) (ZN.Xd() ^ 13614);
                    int[] iArr = new int["WeXga\\T\u001fQ^ZaOY\\\u0017)VRYG[T".length()];
                    QB qb = new QB("WeXga\\T\u001fQ^ZaOY\\\u0017)VRYG[T");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
                        i4++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i4));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd2 = (short) (C1607wl.Xd() ^ 15054);
                    int[] iArr2 = new int["\u001c\u001b+\n\u001e-*1/!$3".length()];
                    QB qb2 = new QB("\u001c\u001b+\n\u001e-*1/!$3");
                    int i5 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i5));
                        i5++;
                    }
                    Method method = cls.getMethod(new String(iArr2, 0, i5), clsArr);
                    try {
                        method.setAccessible(true);
                        String resourceTypeName = ((Resources) method.invoke(context, objArr)).getResourceTypeName(this.mConstraintSetEnd);
                        if (strUd.equals(resourceTypeName)) {
                            ConstraintSet constraintSet = new ConstraintSet();
                            constraintSet.load(context, this.mConstraintSetEnd);
                            motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                        } else if (strVd.equals(resourceTypeName)) {
                            this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = a2.getResourceId(index, this.mConstraintSetStart);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Xg.qd(",:1@>95\u007f6CCJ<FM\b\u001eKKRDXU", (short) (C1580rY.Xd() ^ (-2063)), (short) (C1580rY.Xd() ^ (-25861)))).getMethod(Jg.Wd("P*\f?-\u0012\u0002b6xQ;", (short) (OY.Xd() ^ 7763), (short) (OY.Xd() ^ 27008)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        String resourceTypeName2 = ((Resources) method2.invoke(context, objArr2)).getResourceTypeName(this.mConstraintSetStart);
                        if (strUd.equals(resourceTypeName2)) {
                            ConstraintSet constraintSet2 = new ConstraintSet();
                            constraintSet2.load(context, this.mConstraintSetStart);
                            motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                        } else if (strVd.equals(resourceTypeName2)) {
                            this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    TypedValue typedValuePeekValue = a2.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        int resourceId = a2.getResourceId(index, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (typedValuePeekValue.type != 3) {
                        this.mDefaultInterpolator = a2.getInteger(index, this.mDefaultInterpolator);
                    } else {
                        String string = a2.getString(index);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            short sXd3 = (short) (ZN.Xd() ^ 24955);
                            short sXd4 = (short) (ZN.Xd() ^ 1128);
                            int[] iArr3 = new int["z".length()];
                            QB qb3 = new QB("z");
                            int i6 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd4) + sXd3)));
                                i6++;
                            }
                            if (string.indexOf(new String(iArr3, 0, i6)) > 0) {
                                this.mDefaultInterpolatorID = a2.getResourceId(index, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i7 = a2.getInt(index, this.mDuration);
                    this.mDuration = i7;
                    if (i7 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.mStagger = a2.getFloat(index, this.mStagger);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = a2.getInteger(index, this.mAutoTransition);
                } else if (index == R.styleable.Transition_android_id) {
                    this.mId = a2.getResourceId(index, this.mId);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.mDisable = a2.getBoolean(index, this.mDisable);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = a2.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = a2.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = a2.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }
    }

    public MotionScene(MotionLayout layout) {
        this.mMotionLayout = layout;
        this.mViewTransitionController = new ViewTransitionController(layout);
    }

    MotionScene(Context context, MotionLayout layout, int resourceID) throws Throwable {
        this.mMotionLayout = layout;
        this.mViewTransitionController = new ViewTransitionController(layout);
        load(context, resourceID);
        this.mConstraintSetMap.put(R.id.motion_base, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0371, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void load(android.content.Context r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.load(android.content.Context, int):void");
    }

    private void parseMotionSceneTags(Context context, XmlPullParser parser) throws Throwable {
        Object[] objArr = {Xml.asAttributeSet(parser), R.styleable.MotionScene};
        Method method = Class.forName(Wg.Zd("\byP?\\K'\u0012(\u0015H/\u0001j\"@6\u0003b]oc@", (short) (OY.Xd() ^ 25832), (short) (OY.Xd() ^ 27659))).getMethod(Wg.vd("6(9%,0\u001448*\" {.-*@8JH8E", (short) (C1580rY.Xd() ^ (-8271))), Class.forName(C1561oA.Xd("\u0003\u0011\b\u0017\u0015\u0010\fV\u001f\u001f\u0015\u0019[o$%$\u001c\u0016**\u001c\u000b\u001e.", (short) (ZN.Xd() ^ 9497))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                if (index == R.styleable.MotionScene_defaultDuration) {
                    int i3 = typedArray.getInt(index, this.mDefaultDuration);
                    this.mDefaultDuration = i3;
                    if (i3 < 8) {
                        this.mDefaultDuration = 8;
                    }
                } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                    this.mLayoutDuringTransition = typedArray.getInteger(index, 0);
                }
            }
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private int getId(Context context, String idString) throws Throwable {
        int identifier;
        if (idString.contains(Qg.kd("\u0002", (short) (C1580rY.Xd() ^ (-648)), (short) (C1580rY.Xd() ^ (-14625))))) {
            String strSubstring = idString.substring(idString.indexOf(47) + 1);
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1633zX.Xd() ^ (-29159)), (short) (C1633zX.Xd() ^ (-15775)))).getMethod(C1561oA.ud("GDR/ANINJ:;H", (short) (FB.Xd() ^ 25141)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                short sXd = (short) (OY.Xd() ^ 20358);
                int[] iArr = new int["gc".length()];
                QB qb = new QB("gc");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                short sXd2 = (short) (FB.Xd() ^ 2986);
                int[] iArr2 = new int["\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96".length()];
                QB qb2 = new QB("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd3 = (short) (ZN.Xd() ^ 17392);
                short sXd4 = (short) (ZN.Xd() ^ 28545);
                int[] iArr3 = new int["NM]:LOXOVU?S`Y".length()];
                QB qb3 = new QB("NM]:LOXOVU?S`Y");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                    i4++;
                }
                Method method2 = cls.getMethod(new String(iArr3, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    identifier = resources.getIdentifier(strSubstring, str, (String) method2.invoke(context, objArr2));
                    if (this.DEBUG_DESKTOP) {
                        PrintStream printStream = System.out;
                        short sXd5 = (short) (C1499aX.Xd() ^ (-27428));
                        short sXd6 = (short) (C1499aX.Xd() ^ (-7462));
                        int[] iArr4 = new int["2XpD\u001f\u001boo;\u0017Fu08a!".length()];
                        QB qb4 = new QB("2XpD\u001f\u001boo;\u0017Fu08a!");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd6) ^ sXd5));
                            i5++;
                        }
                        printStream.println(new String(iArr4, 0, i5) + identifier);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (idString != null && idString.length() > 1) {
                return Integer.parseInt(idString.substring(1));
            }
            ZO.xd("\u007f\bk<,L3\u0002\u0003\u0003I", (short) (C1633zX.Xd() ^ (-18010)), (short) (C1633zX.Xd() ^ (-26245)));
            C1626yg.Ud("q}\u0012,Ic\u001d&8\u0013u gr6XW/y", (short) (C1499aX.Xd() ^ (-13277)), (short) (C1499aX.Xd() ^ (-28065)));
            return identifier;
        }
        return identifier;
    }

    private void parseInclude(Context context, XmlPullParser mainParser) throws Throwable {
        Object[] objArr = {Xml.asAttributeSet(mainParser), R.styleable.include};
        Method method = Class.forName(C1593ug.zd("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif", (short) (ZN.Xd() ^ 7364), (short) (ZN.Xd() ^ 27591))).getMethod(C1561oA.Kd("\\PcQZ`Fhnb\\\\:nonf`ttfu", (short) (ZN.Xd() ^ 20003)), Class.forName(C1561oA.od("AMBOKD>\u0007MK?A\u0002\u0014FEB80B@0\u001d.<", (short) (ZN.Xd() ^ 481))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                if (index == R.styleable.include_constraintSet) {
                    parseInclude(context, typedArray.getResourceId(index, -1));
                }
            }
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int parseInclude(Context context, int resourceId) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("~]%\u0010\u0015Ql>H\u0019\u0016};FXxTjBL\u0002d\u0007", (short) (C1607wl.Xd() ^ 11121))).getMethod(EO.Od("6\n)!_\u0012{d\u0018'-W", (short) (OY.Xd() ^ 2002)), new Class[0]);
        try {
            method.setAccessible(true);
            XmlResourceParser xml = ((Resources) method.invoke(context, objArr)).getXml(resourceId);
            try {
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    String name = xml.getName();
                    if (2 == eventType && C1561oA.Qd("R}{\u007f\u007f|jquzXiw", (short) (C1499aX.Xd() ^ (-30151))).equals(name)) {
                        return parseConstraintSet(context, xml);
                    }
                }
                return -1;
            } catch (IOException e2) {
                e2.printStackTrace();
                return -1;
            } catch (XmlPullParserException e3) {
                e3.printStackTrace();
                return -1;
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private int parseConstraintSet(Context context, XmlPullParser parser) throws Throwable {
        String attributeValue;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = parser.getAttributeCount();
        int id = -1;
        int id2 = -1;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = parser.getAttributeName(i2);
            attributeValue = parser.getAttributeValue(i2);
            if (this.DEBUG_DESKTOP) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    id2 = getId(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                constraintSet.mRotate = 4;
                                break;
                            case "left":
                                constraintSet.mRotate = 2;
                                break;
                            case "none":
                                constraintSet.mRotate = 0;
                                break;
                            case "right":
                                constraintSet.mRotate = 1;
                                break;
                            case "x_right":
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    id = getId(context, attributeValue);
                    this.mConstraintSetIdMap.put(stripID(attributeValue), Integer.valueOf(id));
                    constraintSet.mIdString = Debug.getName(context, id);
                    break;
            }
        }
        if (id != -1) {
            if (this.mMotionLayout.mDebugPath != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, parser);
            if (id2 != -1) {
                this.mDeriveMap.put(id, id2);
            }
            this.mConstraintSetMap.put(id, constraintSet);
        }
        return id;
    }

    public ConstraintSet getConstraintSet(Context context, String id) throws Throwable {
        if (this.DEBUG_DESKTOP) {
            System.out.println(Qg.kd("\b\u0002<", (short) (C1633zX.Xd() ^ (-20767)), (short) (C1633zX.Xd() ^ (-9350))) + id);
            PrintStream printStream = System.out;
            short sXd = (short) (C1499aX.Xd() ^ (-24830));
            short sXd2 = (short) (C1499aX.Xd() ^ (-5135));
            int[] iArr = new int["peu_\u0019".length()];
            QB qb = new QB("peu_\u0019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            printStream.println(new String(iArr, 0, i2) + this.mConstraintSetMap.size());
        }
        for (int i3 = 0; i3 < this.mConstraintSetMap.size(); i3++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i3);
            Class<?> cls = Class.forName(C1561oA.ud("codqmf`)]hfk[ch!5`^cSe`", (short) (C1607wl.Xd() ^ 10191)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (OY.Xd() ^ 22403);
            int[] iArr2 = new int["\u0013\u0010\u001ez\u0015\"\u001d\"\u0016\u0006\u0007\u0014".length()];
            QB qb2 = new QB("\u0013\u0010\u001ez\u0015\"\u001d\"\u0016\u0006\u0007\u0014");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                String resourceName = ((Resources) method.invoke(context, objArr)).getResourceName(iKeyAt);
                if (this.DEBUG_DESKTOP) {
                    PrintStream printStream2 = System.out;
                    short sXd4 = (short) (C1499aX.Xd() ^ (-22199));
                    int[] iArr3 = new int["d\u0001=\u0005\u000f\u0013A^".length()];
                    QB qb3 = new QB("d\u0001=\u0005\u000f\u0013A^");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i5));
                        i5++;
                    }
                    StringBuilder sbAppend = new StringBuilder(new String(iArr3, 0, i5)).append(i3).append(Xg.qd("B%oz(E", (short) (Od.Xd() ^ (-21593)), (short) (Od.Xd() ^ (-32495)))).append(resourceName).append(Jg.Wd("\u0016=G\u0010Az>\u0011+)=\f0jL", (short) (C1499aX.Xd() ^ (-21987)), (short) (C1499aX.Xd() ^ (-26200)))).append(id);
                    short sXd5 = (short) (ZN.Xd() ^ 15315);
                    short sXd6 = (short) (ZN.Xd() ^ 9526);
                    int[] iArr4 = new int["k".length()];
                    QB qb4 = new QB("k");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd6) + sXd5)));
                        i6++;
                    }
                    printStream2.println(sbAppend.append(new String(iArr4, 0, i6)).toString());
                }
                if (id.equals(resourceName)) {
                    return this.mConstraintSetMap.get(iKeyAt);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return null;
    }

    ConstraintSet getConstraintSet(int id) {
        return getConstraintSet(id, -1, -1);
    }

    ConstraintSet getConstraintSet(int id, int width, int height) {
        int iStateGetConstraintID;
        if (this.DEBUG_DESKTOP) {
            System.out.println("id " + id);
            System.out.println("size " + this.mConstraintSetMap.size());
        }
        StateSet stateSet = this.mStateSet;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(id, width, height)) != -1) {
            id = iStateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(id) == null) {
            String str = "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), id) + " In MotionScene";
            SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.mConstraintSetMap.get(id);
    }

    public void setConstraintSet(int id, ConstraintSet set) {
        this.mConstraintSetMap.put(id, set);
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            Iterator it = transition.mKeyFramesList.iterator();
            while (it.hasNext()) {
                ((KeyFrames) it.next()).addFrames(motionController);
            }
        } else {
            Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                Iterator it2 = transition2.mKeyFramesList.iterator();
                while (it2.hasNext()) {
                    ((KeyFrames) it2.next()).addFrames(motionController);
                }
            }
        }
    }

    Key getKeyFrame(Context context, int type, int target, int position) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        for (KeyFrames keyFrames : transition.mKeyFramesList) {
            for (Integer num : keyFrames.getKeys()) {
                if (target == num.intValue()) {
                    for (Key key : keyFrames.getKeyFramesForView(num.intValue())) {
                        if (key.mFramePosition == position && key.mType == type) {
                            return key;
                        }
                    }
                }
            }
        }
        return null;
    }

    int getTransitionDirection(int stateId) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mConstraintSetStart == stateId) {
                return 0;
            }
        }
        return 1;
    }

    boolean hasKeyFramePosition(View view, int position) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setKeyframe(View view, int position, String name, Object value) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().mFramePosition == position) {
                    if (value != null) {
                        ((Float) value).floatValue();
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    boolean supportTouch() {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mTouchResponse != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        return (transition == null || transition.mTouchResponse == null) ? false : true;
    }

    void processTouchEvent(MotionEvent event, int currentState, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z2 = false;
            if (action == 0) {
                this.mLastTouchX = event.getRawX();
                this.mLastTouchY = event.getRawY();
                this.mLastTouchDown = event;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion != null && !touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            this.mMotionOutsideRegion = true;
                        } else {
                            this.mMotionOutsideRegion = false;
                        }
                        this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                        return;
                    }
                    this.mLastTouchDown = null;
                    this.mIgnoreTouch = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.mIgnoreTouch) {
                float rawY = event.getRawY() - this.mLastTouchY;
                float rawX = event.getRawX() - this.mLastTouchX;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent = this.mLastTouchDown) == null) {
                    return;
                }
                Transition transitionBestTransitionFor = bestTransitionFor(currentState, rawX, rawY, motionEvent);
                if (transitionBestTransitionFor != null) {
                    motionLayout.setTransition(transitionBestTransitionFor);
                    RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        z2 = true;
                    }
                    this.mMotionOutsideRegion = z2;
                    this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                }
            }
        }
        if (this.mIgnoreTouch) {
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(event, this.mVelocityTracker, currentState, this);
        }
        this.mLastTouchX = event.getRawX();
        this.mLastTouchY = event.getRawY();
        if (event.getAction() != 1 || (motionTracker = this.mVelocityTracker) == null) {
            return;
        }
        motionTracker.recycle();
        this.mVelocityTracker = null;
        if (motionLayout.mCurrentState != -1) {
            autoTransition(motionLayout, motionLayout.mCurrentState);
        }
    }

    void processScrollMove(float dx, float dy) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollMove(dx, dy);
    }

    void processScrollUp(float dx, float dy) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollUp(dx, dy);
    }

    float getProgressDirection(float dx, float dy) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(dx, dy);
    }

    int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    int getEndId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public Interpolator getInterpolator() {
        int i2 = this.mCurrentTransition.mDefaultInterpolator;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i2 == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
            return new Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float v2) {
                    return (float) interpolator.get(v2);
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

    public int getDuration() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mDuration;
        }
        return this.mDefaultDuration;
    }

    public void setDuration(int duration) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(duration);
        } else {
            this.mDefaultDuration = duration;
        }
    }

    public int gatPathMotionArc() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    public float getStaggered() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    float getMaxAcceleration() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    float getMaxVelocity() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    float getSpringStiffiness() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStiffness();
    }

    float getSpringMass() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringMass();
    }

    float getSpringDamping() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringDamping();
    }

    float getSpringStopThreshold() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStopThreshold();
    }

    int getSpringBoundary() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringBoundary();
    }

    int getAutoCompleteMode() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getAutoCompleteMode();
    }

    void setupTouch() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setupTouch();
    }

    boolean getMoveWhenScrollAtTop() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    void readFallback(MotionLayout motionLayout) {
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i2);
            if (hasCycleDependency(iKeyAt)) {
                return;
            }
            readConstraintChain(iKeyAt, motionLayout);
        }
    }

    private boolean hasCycleDependency(int key) {
        int i2 = this.mDeriveMap.get(key);
        int size = this.mDeriveMap.size();
        while (i2 > 0) {
            if (i2 == key) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.mDeriveMap.get(i2);
            size = i3;
        }
        return false;
    }

    private void readConstraintChain(int key, MotionLayout motionLayout) {
        ConstraintSet constraintSet = this.mConstraintSetMap.get(key);
        constraintSet.derivedState = constraintSet.mIdString;
        int i2 = this.mDeriveMap.get(key);
        if (i2 > 0) {
            readConstraintChain(i2, motionLayout);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i2);
            if (constraintSet2 == null) {
                String str = "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i2);
                return;
            } else {
                constraintSet.derivedState += RemoteSettings.FORWARD_SLASH_STRING + constraintSet2.derivedState;
                constraintSet.readFallback(constraintSet2);
            }
        } else {
            constraintSet.derivedState += "  layout";
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static String stripID(String id) {
        if (id == null) {
            return "";
        }
        int iIndexOf = id.indexOf(47);
        return iIndexOf < 0 ? id : id.substring(iIndexOf + 1);
    }

    public int lookUpConstraintId(String id) {
        Integer num = this.mConstraintSetIdMap.get(id);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int id) {
        for (Map.Entry<String, Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void disableAutoTransition(boolean disable) {
        this.mDisableAutoTransition = disable;
    }

    static String getLine(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + Debug.getName(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }
}
