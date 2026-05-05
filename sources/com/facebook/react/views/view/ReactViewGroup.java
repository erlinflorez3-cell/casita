package com.facebook.react.views.view;

import android.app.FragmentBreadCrumbs;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingProhibitedView;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ReactZIndexedViewGroup;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.drawable.CSSBackgroundDrawable;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ReactViewGroup extends ViewGroup implements ReactInterceptingViewGroup, ReactClippingViewGroup, ReactPointerEventsView, ReactHitSlopView, ReactZIndexedViewGroup, ReactOverflowViewWithInset {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private CSSBackgroundDrawable mCSSBackgroundDrawable;
    private ChildrenLayoutChangeListener mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private ViewGroupDrawingOrderHelper mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;
    private OnInterceptTouchEventListener mOnInterceptTouchEventListener;
    private Overflow mOverflow;
    private final Rect mOverflowInset;
    private Path mPath;
    private PointerEvents mPointerEvents;
    private boolean mRemoveClippedSubviews;

    /* JADX INFO: renamed from: com.facebook.react.views.view.ReactViewGroup$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ View val$child;

        AnonymousClass1(View view) {
            view = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (view.isShown()) {
                return;
            }
            ReactSoftExceptionLogger.logSoftException(ReactConstants.TAG, new ReactNoCrashSoftException("Child view has been added to Parent view in which it is clipped and not visible. This is not legal for this particular child view. Child: [" + view.getId() + "] " + view.toString() + " Parent: [" + ReactViewGroup.this.getId() + "] " + toString()));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.view.ReactViewGroup$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$Overflow;

        static {
            int[] iArr = new int[Overflow.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$Overflow = iArr;
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class ChildrenLayoutChangeListener implements View.OnLayoutChangeListener {
        private final ReactViewGroup mParent;

        private ChildrenLayoutChangeListener(ReactViewGroup reactViewGroup) {
            this.mParent = reactViewGroup;
        }

        /* synthetic */ ChildrenLayoutChangeListener(ReactViewGroup reactViewGroup, ChildrenLayoutChangeListenerIA childrenLayoutChangeListenerIA) {
            this(reactViewGroup);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (this.mParent.getRemoveClippedSubviews()) {
                this.mParent.updateSubviewClipStatus(view);
            }
        }
    }

    public ReactViewGroup(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        initView();
    }

    private void addInArray(View view, int i2) {
        View[] viewArr = (View[]) Assertions.assertNotNull(this.mAllChildren);
        int i3 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i2 == i3) {
            if (length == i3) {
                View[] viewArr2 = new View[length + 12];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i4 = this.mAllChildrenCount;
            this.mAllChildrenCount = i4 + 1;
            viewArr[i4] = view;
            return;
        }
        if (i2 >= i3) {
            throw new IndexOutOfBoundsException("index=" + i2 + " count=" + i3);
        }
        if (length == i3) {
            View[] viewArr3 = new View[length + 12];
            this.mAllChildren = viewArr3;
            System.arraycopy(viewArr, 0, viewArr3, 0, i2);
            System.arraycopy(viewArr, i2, this.mAllChildren, i2 + 1, i3 - i2);
            viewArr = this.mAllChildren;
        } else {
            System.arraycopy(viewArr, i2, viewArr, i2 + 1, i3 - i2);
        }
        viewArr[i2] = view;
        this.mAllChildrenCount++;
    }

    private boolean customDrawOrderDisabled() {
        return getId() != -1 && ViewUtil.getUIManagerType(getId()) == 2;
    }

    private void dispatchOverflowDraw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        Path path;
        Overflow overflow = this.mOverflow;
        if (getTag(R.id.filter) != null) {
            overflow = Overflow.HIDDEN;
        }
        int i2 = AnonymousClass2.$SwitchMap$com$facebook$react$uimanager$style$Overflow[overflow.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 && (path = this.mPath) != null) {
                path.rewind();
                return;
            }
            return;
        }
        float width = getWidth();
        float height = getHeight();
        CSSBackgroundDrawable cSSBackgroundDrawable = this.mCSSBackgroundDrawable;
        float f4 = 0.0f;
        if (cSSBackgroundDrawable != null) {
            RectF directionAwareBorderInsets = cSSBackgroundDrawable.getDirectionAwareBorderInsets();
            if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.right > 0.0f) {
                f3 = directionAwareBorderInsets.left + 0.0f;
                f2 = directionAwareBorderInsets.top + 0.0f;
                width -= directionAwareBorderInsets.right;
                height -= directionAwareBorderInsets.bottom;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
            }
            ComputedBorderRadius computedBorderRadius = this.mCSSBackgroundDrawable.getComputedBorderRadius();
            if (computedBorderRadius.hasRoundedBorders()) {
                if (this.mPath == null) {
                    this.mPath = new Path();
                }
                CornerRadii pixelFromDIP = computedBorderRadius.getTopLeft().toPixelFromDIP();
                CornerRadii pixelFromDIP2 = computedBorderRadius.getTopRight().toPixelFromDIP();
                CornerRadii pixelFromDIP3 = computedBorderRadius.getBottomLeft().toPixelFromDIP();
                CornerRadii pixelFromDIP4 = computedBorderRadius.getBottomRight().toPixelFromDIP();
                this.mPath.rewind();
                z2 = true;
                this.mPath.addRoundRect(new RectF(f3, f2, width, height), new float[]{Math.max(pixelFromDIP.getHorizontal() - directionAwareBorderInsets.left, 0.0f), Math.max(pixelFromDIP.getVertical() - directionAwareBorderInsets.top, 0.0f), Math.max(pixelFromDIP2.getHorizontal() - directionAwareBorderInsets.right, 0.0f), Math.max(pixelFromDIP2.getVertical() - directionAwareBorderInsets.top, 0.0f), Math.max(pixelFromDIP4.getHorizontal() - directionAwareBorderInsets.right, 0.0f), Math.max(pixelFromDIP4.getVertical() - directionAwareBorderInsets.bottom, 0.0f), Math.max(pixelFromDIP3.getHorizontal() - directionAwareBorderInsets.left, 0.0f), Math.max(pixelFromDIP3.getVertical() - directionAwareBorderInsets.bottom, 0.0f)}, Path.Direction.CW);
                canvas.clipPath(this.mPath);
            } else {
                z2 = false;
            }
            f4 = f3;
        } else {
            z2 = false;
            f2 = 0.0f;
        }
        if (z2) {
            return;
        }
        canvas.clipRect(new RectF(f4, f2, width, height));
    }

    private ViewGroupDrawingOrderHelper getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new ViewGroupDrawingOrderHelper(this);
        }
        return this.mDrawingOrderHelper;
    }

    private void handleAddView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().handleAddView(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        }
    }

    private void handleRemoveView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            if (indexOfChild(view) == -1) {
                return;
            }
            getDrawingOrderHelper().handleRemoveView(view);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        }
    }

    private void handleRemoveViews(int i2, int i3) {
        int i4 = i3 + i2;
        while (i2 < i4) {
            if (i2 < getChildCount()) {
                handleRemoveView(getChildAt(i2));
            }
            i2++;
        }
    }

    private int indexOfChildInAllChildren(View view) {
        int i2 = this.mAllChildrenCount;
        View[] viewArr = (View[]) Assertions.assertNotNull(this.mAllChildren);
        for (int i3 = 0; i3 < i2; i3++) {
            if (viewArr[i3] == view) {
                return i3;
            }
        }
        return -1;
    }

    private void initView() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = Overflow.VISIBLE;
        this.mPointerEvents = PointerEvents.AUTO;
        this.mChildrenLayoutChangeListener = null;
        this.mCSSBackgroundDrawable = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mPath = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = ViewProps.VISIBLE;
    }

    private boolean needsIsolatedLayer() {
        if (!ReactNativeFeatureFlags.enableAndroidMixBlendModeProp()) {
            return false;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2).getTag(R.id.mix_blend_mode) != null) {
                return true;
            }
        }
        return false;
    }

    private void removeFromArray(int i2) {
        View[] viewArr = (View[]) Assertions.assertNotNull(this.mAllChildren);
        int i3 = this.mAllChildrenCount;
        if (i2 == i3 - 1) {
            int i4 = i3 - 1;
            this.mAllChildrenCount = i4;
            viewArr[i4] = null;
        } else {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i2 + 1, viewArr, i2, (i3 - i2) - 1);
            int i5 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i5;
            viewArr[i5] = null;
        }
    }

    private void updateClippingToRect(Rect rect) {
        Assertions.assertNotNull(this.mAllChildren);
        int i2 = 0;
        for (int i3 = 0; i3 < this.mAllChildrenCount; i3++) {
            updateSubviewClipStatus(rect, i3, i2);
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateSubviewClipStatus(Rect rect, int i2, int i3) {
        UiThreadUtil.assertOnUiThread();
        FragmentBreadCrumbs fragmentBreadCrumbs = ((View[]) Assertions.assertNotNull(this.mAllChildren))[i2];
        Rect rect2 = sHelperRect;
        rect2.set(fragmentBreadCrumbs.getLeft(), fragmentBreadCrumbs.getTop(), fragmentBreadCrumbs.getRight(), fragmentBreadCrumbs.getBottom());
        boolean zIntersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = fragmentBreadCrumbs.getAnimation();
        boolean z2 = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && fragmentBreadCrumbs.getParent() != null && !z2) {
            removeViewInLayout(fragmentBreadCrumbs);
        } else if (zIntersects && fragmentBreadCrumbs.getParent() == null) {
            addViewInLayout(fragmentBreadCrumbs, i2 - i3, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (fragmentBreadCrumbs instanceof ReactClippingViewGroup) {
            ReactClippingViewGroup reactClippingViewGroup = (ReactClippingViewGroup) fragmentBreadCrumbs;
            if (reactClippingViewGroup.getRemoveClippedSubviews()) {
                reactClippingViewGroup.updateClippingRect();
            }
        }
    }

    public void updateSubviewClipStatus(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        Assertions.assertNotNull(this.mClippingRect);
        Assertions.assertNotNull(this.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.mAllChildrenCount; i3++) {
                View view2 = this.mAllChildren[i3];
                if (view2 == view) {
                    updateSubviewClipStatus(this.mClippingRect, i3, i2);
                    return;
                } else {
                    if (view2.getParent() == null) {
                        i2++;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        handleAddView(view);
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        handleAddView(view);
        return super.addViewInLayout(view, i2, layoutParams, z2);
    }

    void addViewWithSubviewClippingEnabled(View view, int i2) {
        addViewWithSubviewClippingEnabled(view, i2, sDefaultLayoutParam);
    }

    void addViewWithSubviewClippingEnabled(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Assertions.assertCondition(this.mRemoveClippedSubviews);
        Assertions.assertNotNull(this.mClippingRect);
        Assertions.assertNotNull(this.mAllChildren);
        addInArray(view, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.mAllChildren[i4].getParent() == null) {
                i3++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i2, i3);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        if (view instanceof ReactClippingProhibitedView) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.view.ReactViewGroup.1
                final /* synthetic */ View val$child;

                AnonymousClass1(View view2) {
                    view = view2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (view.isShown()) {
                        return;
                    }
                    ReactSoftExceptionLogger.logSoftException(ReactConstants.TAG, new ReactNoCrashSoftException("Child view has been added to Parent view in which it is clipped and not visible. This is not legal for this particular child view. Child: [" + view.getId() + "] " + view.toString() + " Parent: [" + ReactViewGroup.this.getId() + "] " + toString()));
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            if (this.mOverflow != Overflow.VISIBLE || getTag(R.id.filter) != null) {
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            super.dispatchDraw(canvas);
            return;
        }
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e2) {
            RootView rootView = RootViewUtil.getRootView(this);
            if (rootView != null) {
                rootView.handleException(e2);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e2;
                }
                ((ReactContext) getContext()).handleException(new IllegalViewOperationException("StackOverflowException", this, e2));
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e2) {
            FLog.e(ReactConstants.TAG, "NullPointerException when executing dispatchProvideStructure", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z2) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT < 29 || ViewUtil.getUIManagerType(this) != 2 || !needsIsolatedLayer()) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        BlendMode blendMode;
        boolean z2 = view.getElevation() > 0.0f;
        if (z2) {
            CanvasUtil.enableZ(canvas, true);
        }
        if (Build.VERSION.SDK_INT < 29 || !needsIsolatedLayer()) {
            blendMode = null;
        } else {
            blendMode = (BlendMode) view.getTag(R.id.mix_blend_mode);
            if (blendMode != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendMode);
                Rect overflowInset = getOverflowInset();
                canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), paint);
            }
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        if (blendMode != null) {
            canvas.restore();
        }
        if (z2) {
            CanvasUtil.enableZ(canvas, false);
        }
        return zDrawChild;
    }

    int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    @VisibleForTesting
    public int getBackgroundColor() {
        if (!ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            if (getBackground() != null) {
                return ((CSSBackgroundDrawable) getBackground()).getColor();
            }
            return 0;
        }
        Integer backgroundColor = BackgroundStyleApplicator.getBackgroundColor(this);
        if (backgroundColor == null) {
            return 0;
        }
        return backgroundColor.intValue();
    }

    View getChildAtWithSubviewClippingEnabled(int i2) {
        if (i2 < 0 || i2 >= this.mAllChildrenCount) {
            return null;
        }
        return ((View[]) Assertions.assertNotNull(this.mAllChildren))[i2];
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        UiThreadUtil.assertOnUiThread();
        return !customDrawOrderDisabled() ? getDrawingOrderHelper().getChildDrawingOrder(i2, i3) : i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // com.facebook.react.touch.ReactHitSlopView
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    CSSBackgroundDrawable getOrCreateReactViewBackground() {
        if (this.mCSSBackgroundDrawable == null) {
            this.mCSSBackgroundDrawable = new CSSBackgroundDrawable(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mCSSBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, background}));
            }
            if (!ReactNativeFeatureFlags.setAndroidLayoutDirection()) {
                this.mCSSBackgroundDrawable.setLayoutDirectionOverride(I18nUtil.getInstance().isRTL(getContext()) ? 1 : 0);
            }
        }
        return this.mCSSBackgroundDrawable;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    public String getOverflow() {
        int i2 = AnonymousClass2.$SwitchMap$com$facebook$react$uimanager$style$Overflow[this.mOverflow.ordinal()];
        if (i2 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i2 == 2) {
            return ViewProps.SCROLL;
        }
        if (i2 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public int getZIndexMappedChildIndex(int i2) {
        UiThreadUtil.assertOnUiThread();
        return (customDrawOrderDisabled() || !getDrawingOrderHelper().shouldEnableCustomDrawingOrder()) ? i2 : getDrawingOrderHelper().getChildDrawingOrder(getChildCount(), i2);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.mOnInterceptTouchEventListener;
        if ((onInterceptTouchEventListener == null || !onInterceptTouchEventListener.onInterceptTouchEvent(this, motionEvent)) && PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i2, i3);
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return PointerEvents.canBeTouchTarget(this.mPointerEvents);
    }

    void recycleView() {
        if (this.mAllChildren != null && this.mChildrenLayoutChangeListener != null) {
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
        }
        initView();
        this.mOverflowInset.setEmpty();
        sHelperRect.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    void removeAllViewsWithSubviewClippingEnabled() {
        Assertions.assertCondition(this.mRemoveClippedSubviews);
        Assertions.assertNotNull(this.mAllChildren);
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        handleRemoveView(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        handleRemoveView(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        handleRemoveView(view);
        super.removeViewInLayout(view);
    }

    void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        Assertions.assertCondition(this.mRemoveClippedSubviews);
        Assertions.assertNotNull(this.mClippingRect);
        Assertions.assertNotNull(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[iIndexOfChildInAllChildren].getParent() != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < iIndexOfChildInAllChildren; i3++) {
                if (this.mAllChildren[i3].getParent() == null) {
                    i2++;
                }
            }
            removeViewsInLayout(iIndexOfChildInAllChildren - i2, 1);
            invalidate();
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        handleRemoveViews(i2, i3);
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        handleRemoveViews(i2, i3);
        super.removeViewsInLayout(i2, i3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    void resetPointerEvents() {
        this.mPointerEvents = PointerEvents.AUTO;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals(ViewProps.VISIBLE)) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.mBackfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i2));
        } else {
            if (i2 == 0 && this.mCSSBackgroundDrawable == null) {
                return;
            }
            getOrCreateReactViewBackground().setColor(i2);
        }
    }

    @UnstableReactNativeAPI
    void setBackgroundImage(List<BackgroundImageLayer> list) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBackgroundImage(this, list);
        } else {
            getOrCreateReactViewBackground().setBackgroundImage(list);
        }
    }

    public void setBorderColor(int i2, Integer num) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i2], num);
        } else {
            getOrCreateReactViewBackground().setBorderColor(i2, num);
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f2) {
        setBorderRadius(f2, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setBorderRadius(float f2, int i2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i2], Float.isNaN(f2) ? null : new LengthPercentage(f2, LengthPercentageType.POINT));
        } else {
            getOrCreateReactViewBackground().setRadius(f2, i2);
        }
    }

    public void setBorderRadius(BorderRadiusProp borderRadiusProp, LengthPercentage lengthPercentage) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderRadius(this, borderRadiusProp, lengthPercentage);
        } else {
            getOrCreateReactViewBackground().setBorderRadius(borderRadiusProp, lengthPercentage);
        }
    }

    public void setBorderStyle(String str) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
        } else {
            getOrCreateReactViewBackground().setBorderStyle(str);
        }
    }

    public void setBorderWidth(int i2, float f2) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i2], Float.valueOf(PixelUtil.toDIPFromPixel(f2)));
        } else {
            getOrCreateReactViewBackground().setBorderWidth(i2, f2);
        }
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z2) {
        this.mNeedsOffscreenAlphaCompositing = z2;
    }

    @Override // com.facebook.react.touch.ReactInterceptingViewGroup
    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.mOnInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setOpacityIfPossible(float f2) {
        this.mBackfaceOpacity = f2;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int i2, int i3, int i4, int i5) {
        if (needsIsolatedLayer() && (this.mOverflowInset.left != i2 || this.mOverflowInset.top != i3 || this.mOverflowInset.right != i4 || this.mOverflowInset.bottom != i5)) {
            invalidate();
        }
        this.mOverflowInset.set(i2, i3, i4, i5);
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setRemoveClippedSubviews(boolean z2) {
        if (z2 == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z2;
        if (z2) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(12, childCount)];
            this.mChildrenLayoutChangeListener = new ChildrenLayoutChangeListener();
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                View childAt = getChildAt(i2);
                this.mAllChildren[i2] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        Assertions.assertNotNull(this.mClippingRect);
        Assertions.assertNotNull(this.mAllChildren);
        Assertions.assertNotNull(this.mChildrenLayoutChangeListener);
        for (int i3 = 0; i3 < this.mAllChildrenCount; i3++) {
            this.mAllChildren[i3].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        updateClippingToRect(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    @Deprecated(forRemoval = true, since = "0.76.0")
    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        if (ReactNativeFeatureFlags.enableBackgroundStyleApplicator()) {
            BackgroundStyleApplicator.setFeedbackUnderlay(this, drawable);
            return;
        }
        updateBackgroundDrawable(null);
        if (this.mCSSBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            Assertions.assertNotNull(this.mClippingRect);
            Assertions.assertNotNull(this.mAllChildren);
            ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().update();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        invalidate();
    }
}
