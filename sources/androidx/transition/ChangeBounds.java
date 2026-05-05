package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import com.facebook.react.uimanager.ViewProps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeBounds extends Transition {
    private boolean mResizeClip;
    private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
    private static final String PROPNAME_CLIP = "android:changeBounds:clip";
    private static final String PROPNAME_PARENT = "android:changeBounds:parent";
    private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
    private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
    private static final String[] sTransitionProperties = {PROPNAME_BOUNDS, PROPNAME_CLIP, PROPNAME_PARENT, PROPNAME_WINDOW_X, PROPNAME_WINDOW_Y};
    private static final Property<ViewBounds, PointF> TOP_LEFT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, "topLeft") { // from class: androidx.transition.ChangeBounds.1
        @Override // android.util.Property
        public PointF get(ViewBounds viewBounds) {
            return null;
        }

        AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(ViewBounds viewBounds, PointF pointF) {
            viewBounds.setTopLeft(pointF);
        }
    };
    private static final Property<ViewBounds, PointF> BOTTOM_RIGHT_PROPERTY = new Property<ViewBounds, PointF>(PointF.class, "bottomRight") { // from class: androidx.transition.ChangeBounds.2
        @Override // android.util.Property
        public PointF get(ViewBounds viewBounds) {
            return null;
        }

        AnonymousClass2(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(ViewBounds viewBounds, PointF pointF) {
            viewBounds.setBottomRight(pointF);
        }
    };
    private static final Property<View, PointF> BOTTOM_RIGHT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, "bottomRight") { // from class: androidx.transition.ChangeBounds.3
        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        AnonymousClass3(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<View, PointF> TOP_LEFT_ONLY_PROPERTY = new Property<View, PointF>(PointF.class, "topLeft") { // from class: androidx.transition.ChangeBounds.4
        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        AnonymousClass4(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final Property<View, PointF> POSITION_PROPERTY = new Property<View, PointF>(PointF.class, ViewProps.POSITION) { // from class: androidx.transition.ChangeBounds.5
        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        AnonymousClass5(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            ViewUtils.setLeftTopRightBottom(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    };
    private static final RectEvaluator sRectEvaluator = new RectEvaluator();

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$1 */
    class AnonymousClass1 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public PointF get(ViewBounds viewBounds) {
            return null;
        }

        AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(ViewBounds viewBounds, PointF pointF) {
            viewBounds.setTopLeft(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$2 */
    class AnonymousClass2 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public PointF get(ViewBounds viewBounds) {
            return null;
        }

        AnonymousClass2(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(ViewBounds viewBounds, PointF pointF) {
            viewBounds.setBottomRight(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$3 */
    class AnonymousClass3 extends Property<View, PointF> {
        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        AnonymousClass3(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$4 */
    class AnonymousClass4 extends Property<View, PointF> {
        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        AnonymousClass4(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            ViewUtils.setLeftTopRightBottom(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$5 */
    class AnonymousClass5 extends Property<View, PointF> {
        @Override // android.util.Property
        public PointF get(View view) {
            return null;
        }

        AnonymousClass5(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            ViewUtils.setLeftTopRightBottom(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public ChangeBounds() {
        this.mResizeClip = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        this.mResizeClip = false;
        int[] iArr = Styleable.CHANGE_BOUNDS;
        Class<?> cls = Class.forName(C1561oA.ud("dpernga*^igl\\di\"6a_dTfa", (short) (C1580rY.Xd() ^ (-3929))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (FB.Xd() ^ 30832);
        int[] iArr2 = new int["S_Tae^X!omac,>potjbtzjWh~".length()];
        QB qb = new QB("S_Tae^X!omac,>potjbtzjWh~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i2));
        clsArr[1] = int[].class;
        Object[] objArr = {attributeSet, iArr};
        Method method = cls.getMethod(C1561oA.Yd("pdwentZ|\u0003vppN\u0003\u0004\u0003zt\t\tz\n", (short) (ZN.Xd() ^ 18321)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, (XmlResourceParser) attributeSet, Xg.qd("\u0005x\b~\u0011|[\u0006\u0004\f", (short) (C1580rY.Xd() ^ (-12608)), (short) (C1580rY.Xd() ^ (-10093))), 0, false);
            typedArray.recycle();
            setResizeClip(namedBoolean);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public void setResizeClip(boolean z2) {
        this.mResizeClip = z2;
    }

    public boolean getResizeClip() {
        return this.mResizeClip;
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.values.put(PROPNAME_BOUNDS, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.values.put(PROPNAME_PARENT, transitionValues.view.getParent());
        if (this.mResizeClip) {
            transitionValues.values.put(PROPNAME_CLIP, view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        Rect rect;
        captureValues(transitionValues);
        if (!this.mResizeClip || (rect = (Rect) transitionValues.view.getTag(R.id.transition_clip)) == null) {
            return;
        }
        transitionValues.values.put(PROPNAME_CLIP, rect);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$6 */
    class AnonymousClass6 extends AnimatorListenerAdapter {
        private final ViewBounds mViewBounds;
        final /* synthetic */ ViewBounds val$viewBounds;

        AnonymousClass6(ViewBounds viewBounds) {
            this.val$viewBounds = viewBounds;
            this.mViewBounds = viewBounds;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i2;
        int i3;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorMergeAnimators;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.values;
        Map<String, Object> map2 = transitionValues2.values;
        ViewGroup viewGroup2 = (ViewGroup) map.get(PROPNAME_PARENT);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(PROPNAME_PARENT);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.view;
        Rect rect = (Rect) transitionValues.values.get(PROPNAME_BOUNDS);
        Rect rect2 = (Rect) transitionValues2.values.get(PROPNAME_BOUNDS);
        int i4 = rect.left;
        int i5 = rect2.left;
        int i6 = rect.top;
        int i7 = rect2.top;
        int i8 = rect.right;
        int i9 = rect2.right;
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect3 = (Rect) transitionValues.values.get(PROPNAME_CLIP);
        Rect rect4 = (Rect) transitionValues2.values.get(PROPNAME_CLIP);
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.mResizeClip) {
            ViewUtils.setLeftTopRightBottom(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            ObjectAnimator objectAnimatorOfPointF = (i4 == i5 && i6 == i7) ? null : ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i4, i6, i5, i7));
            boolean z2 = rect3 == null;
            if (z2) {
                i3 = 0;
                rect3 = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
            }
            boolean z3 = rect4 == null ? 1 : i3;
            if (z3 != 0) {
                rect4 = new Rect(i3, i3, i14, i15);
            }
            if (rect3.equals(rect4)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect3);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", sRectEvaluator, rect3, rect4);
                ClipListener clipListener = new ClipListener(view, rect3, z2, rect4, z3, i4, i6, i8, i10, i5, i7, i9, i11);
                objectAnimatorOfObject.addListener(clipListener);
                addListener(clipListener);
            }
            animatorMergeAnimators = TransitionUtils.mergeAnimators(objectAnimatorOfPointF, objectAnimatorOfObject);
        } else {
            ViewUtils.setLeftTopRightBottom(view, i4, i6, i8, i10);
            if (i2 != 2) {
                animatorMergeAnimators = (i4 == i5 && i6 == i7) ? ObjectAnimatorUtils.ofPointF(view, BOTTOM_RIGHT_ONLY_PROPERTY, getPathMotion().getPath(i8, i10, i9, i11)) : ObjectAnimatorUtils.ofPointF(view, TOP_LEFT_ONLY_PROPERTY, getPathMotion().getPath(i4, i6, i5, i7));
            } else if (i12 == i14 && i13 == i15) {
                animatorMergeAnimators = ObjectAnimatorUtils.ofPointF(view, POSITION_PROPERTY, getPathMotion().getPath(i4, i6, i5, i7));
            } else {
                ViewBounds viewBounds = new ViewBounds(view);
                ObjectAnimator objectAnimatorOfPointF2 = ObjectAnimatorUtils.ofPointF(viewBounds, TOP_LEFT_PROPERTY, getPathMotion().getPath(i4, i6, i5, i7));
                ObjectAnimator objectAnimatorOfPointF3 = ObjectAnimatorUtils.ofPointF(viewBounds, BOTTOM_RIGHT_PROPERTY, getPathMotion().getPath(i8, i10, i9, i11));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfPointF2, objectAnimatorOfPointF3);
                animatorSet.addListener(new AnimatorListenerAdapter(viewBounds) { // from class: androidx.transition.ChangeBounds.6
                    private final ViewBounds mViewBounds;
                    final /* synthetic */ ViewBounds val$viewBounds;

                    AnonymousClass6(ViewBounds viewBounds2) {
                        this.val$viewBounds = viewBounds2;
                        this.mViewBounds = viewBounds2;
                    }
                });
                animatorMergeAnimators = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.suppressLayout(viewGroup4, true);
            getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
        }
        return animatorMergeAnimators;
    }

    private static class ViewBounds {
        private int mBottom;
        private int mBottomRightCalls;
        private int mLeft;
        private int mRight;
        private int mTop;
        private int mTopLeftCalls;
        private final View mView;

        ViewBounds(View view) {
            this.mView = view;
        }

        void setTopLeft(PointF pointF) {
            this.mLeft = Math.round(pointF.x);
            this.mTop = Math.round(pointF.y);
            int i2 = this.mTopLeftCalls + 1;
            this.mTopLeftCalls = i2;
            if (i2 == this.mBottomRightCalls) {
                setLeftTopRightBottom();
            }
        }

        void setBottomRight(PointF pointF) {
            this.mRight = Math.round(pointF.x);
            this.mBottom = Math.round(pointF.y);
            int i2 = this.mBottomRightCalls + 1;
            this.mBottomRightCalls = i2;
            if (this.mTopLeftCalls == i2) {
                setLeftTopRightBottom();
            }
        }

        private void setLeftTopRightBottom() {
            ViewUtils.setLeftTopRightBottom(this.mView, this.mLeft, this.mTop, this.mRight, this.mBottom);
            this.mTopLeftCalls = 0;
            this.mBottomRightCalls = 0;
        }
    }

    private static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final int mEndBottom;
        private final Rect mEndClip;
        private final boolean mEndClipIsNull;
        private final int mEndLeft;
        private final int mEndRight;
        private final int mEndTop;
        private boolean mIsCanceled;
        private final int mStartBottom;
        private final Rect mStartClip;
        private final boolean mStartClipIsNull;
        private final int mStartLeft;
        private final int mStartRight;
        private final int mStartTop;
        private final View mView;

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        ClipListener(View view, Rect rect, boolean z2, Rect rect2, boolean z3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.mView = view;
            this.mStartClip = rect;
            this.mStartClipIsNull = z2;
            this.mEndClip = rect2;
            this.mEndClipIsNull = z3;
            this.mStartLeft = i2;
            this.mStartTop = i3;
            this.mStartRight = i4;
            this.mStartBottom = i5;
            this.mEndLeft = i6;
            this.mEndTop = i7;
            this.mEndRight = i8;
            this.mEndBottom = i9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z2) {
            int iMax = Math.max(this.mStartRight - this.mStartLeft, this.mEndRight - this.mEndLeft);
            int iMax2 = Math.max(this.mStartBottom - this.mStartTop, this.mEndBottom - this.mEndTop);
            int i2 = z2 ? this.mEndLeft : this.mStartLeft;
            int i3 = z2 ? this.mEndTop : this.mStartTop;
            ViewUtils.setLeftTopRightBottom(this.mView, i2, i3, iMax + i2, iMax2 + i3);
            this.mView.setClipBounds(z2 ? this.mEndClip : this.mStartClip);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z2) {
            if (this.mIsCanceled) {
                return;
            }
            Rect rect = null;
            if (z2) {
                if (!this.mStartClipIsNull) {
                    rect = this.mStartClip;
                }
            } else if (!this.mEndClipIsNull) {
                rect = this.mEndClip;
            }
            this.mView.setClipBounds(rect);
            if (z2) {
                ViewUtils.setLeftTopRightBottom(this.mView, this.mStartLeft, this.mStartTop, this.mStartRight, this.mStartBottom);
            } else {
                ViewUtils.setLeftTopRightBottom(this.mView, this.mEndLeft, this.mEndTop, this.mEndRight, this.mEndBottom);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.mIsCanceled = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.mView.setTag(R.id.transition_clip, this.mView.getClipBounds());
            this.mView.setClipBounds(this.mEndClipIsNull ? null : this.mEndClip);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            Rect rect = (Rect) this.mView.getTag(R.id.transition_clip);
            this.mView.setTag(R.id.transition_clip, null);
            this.mView.setClipBounds(rect);
        }
    }

    private static class SuppressLayoutListener extends TransitionListenerAdapter {
        boolean mCanceled = false;
        final ViewGroup mParent;

        SuppressLayoutListener(ViewGroup viewGroup) {
            this.mParent = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
            this.mCanceled = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            if (!this.mCanceled) {
                ViewGroupUtils.suppressLayout(this.mParent, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            ViewGroupUtils.suppressLayout(this.mParent, true);
        }
    }
}
