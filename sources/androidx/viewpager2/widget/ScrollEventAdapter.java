package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    private final LinearLayoutManager mLayoutManager;
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private ScrollEventValues mScrollValues;
    private int mTarget;
    private final ViewPager2 mViewPager;

    ScrollEventAdapter(ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.mScrollValues = new ScrollEventValues();
        resetState();
    }

    private void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        if ((this.mAdapterState != 1 || this.mScrollState != 1) && i2 == 1) {
            startDrag(false);
            return;
        }
        if (isInAnyDraggingState() && i2 == 2) {
            if (this.mScrollHappened) {
                dispatchStateChanged(2);
                this.mDispatchSelected = true;
                return;
            }
            return;
        }
        if (isInAnyDraggingState() && i2 == 0) {
            updateScrollEventValues();
            if (!this.mScrollHappened) {
                if (this.mScrollValues.mPosition != -1) {
                    dispatchScrolled(this.mScrollValues.mPosition, 0.0f, 0);
                }
            } else if (this.mScrollValues.mOffsetPx == 0) {
                if (this.mDragStartPosition != this.mScrollValues.mPosition) {
                    dispatchSelected(this.mScrollValues.mPosition);
                }
            }
            dispatchStateChanged(0);
            resetState();
        }
        if (this.mAdapterState == 2 && i2 == 0 && this.mDataSetChangeHappened) {
            updateScrollEventValues();
            if (this.mScrollValues.mOffsetPx == 0) {
                if (this.mTarget != this.mScrollValues.mPosition) {
                    dispatchSelected(this.mScrollValues.mPosition == -1 ? 0 : this.mScrollValues.mPosition);
                }
                dispatchStateChanged(0);
                resetState();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002e  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
        /*
            r6 = this;
            r3 = 1
            r6.mScrollHappened = r3
            r6.updateScrollEventValues()
            boolean r0 = r6.mDispatchSelected
            r5 = -1
            r2 = 0
            if (r0 == 0) goto L6a
            r6.mDispatchSelected = r2
            if (r9 > 0) goto L1d
            if (r9 != 0) goto L65
            if (r8 >= 0) goto L63
            r1 = r3
        L15:
            androidx.viewpager2.widget.ViewPager2 r0 = r6.mViewPager
            boolean r0 = r0.isRtl()
            if (r1 != r0) goto L65
        L1d:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r0 = r0.mOffsetPx
            if (r0 == 0) goto L65
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r1 = r0.mPosition
            int r1 = r1 + r3
        L28:
            r6.mTarget = r1
            int r0 = r6.mDragStartPosition
            if (r0 == r1) goto L31
            r6.dispatchSelected(r1)
        L31:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r0 = r0.mPosition
            if (r0 != r5) goto L5e
            r4 = r2
        L38:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            float r1 = r0.mOffset
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r0 = r0.mOffsetPx
            r6.dispatchScrolled(r4, r1, r0)
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r1 = r0.mPosition
            int r0 = r6.mTarget
            if (r1 == r0) goto L4d
            if (r0 != r5) goto L5d
        L4d:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r0 = r0.mOffsetPx
            if (r0 != 0) goto L5d
            int r0 = r6.mScrollState
            if (r0 == r3) goto L5d
            r6.dispatchStateChanged(r2)
            r6.resetState()
        L5d:
            return
        L5e:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r4 = r0.mPosition
            goto L38
        L63:
            r1 = r2
            goto L15
        L65:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r1 = r0.mPosition
            goto L28
        L6a:
            int r0 = r6.mAdapterState
            if (r0 != 0) goto L31
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r0 = r6.mScrollValues
            int r0 = r0.mPosition
            if (r0 != r5) goto L75
            r0 = r2
        L75:
            r6.dispatchSelected(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    private void updateScrollEventValues() {
        int top;
        ScrollEventValues scrollEventValues = this.mScrollValues;
        scrollEventValues.mPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        if (scrollEventValues.mPosition == -1) {
            scrollEventValues.reset();
            return;
        }
        View viewFindViewByPosition = this.mLayoutManager.findViewByPosition(scrollEventValues.mPosition);
        if (viewFindViewByPosition == null) {
            scrollEventValues.reset();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        scrollEventValues.mOffsetPx = -top;
        if (scrollEventValues.mOffsetPx < 0) {
            if (new AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(scrollEventValues.mOffsetPx)));
        }
        scrollEventValues.mOffset = height == 0 ? 0.0f : scrollEventValues.mOffsetPx / height;
    }

    private void startDrag(boolean z2) {
        this.mFakeDragging = z2;
        this.mAdapterState = z2 ? 4 : 1;
        int i2 = this.mTarget;
        if (i2 != -1) {
            this.mDragStartPosition = i2;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    void notifyProgrammaticScroll(int i2, boolean z2) {
        this.mAdapterState = z2 ? 2 : 3;
        this.mFakeDragging = false;
        boolean z3 = this.mTarget != i2;
        this.mTarget = i2;
        dispatchStateChanged(2);
        if (z3) {
            dispatchSelected(i2);
        }
    }

    void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    void notifyEndFakeDrag() {
        if (!isDragging() || this.mFakeDragging) {
            this.mFakeDragging = false;
            updateScrollEventValues();
            if (this.mScrollValues.mOffsetPx == 0) {
                if (this.mScrollValues.mPosition != this.mDragStartPosition) {
                    dispatchSelected(this.mScrollValues.mPosition);
                }
                dispatchStateChanged(0);
                resetState();
                return;
            }
            dispatchStateChanged(2);
        }
    }

    void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallback = onPageChangeCallback;
    }

    int getScrollState() {
        return this.mScrollState;
    }

    boolean isIdle() {
        return this.mScrollState == 0;
    }

    boolean isDragging() {
        return this.mScrollState == 1;
    }

    boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private boolean isInAnyDraggingState() {
        int i2 = this.mAdapterState;
        return i2 == 1 || i2 == 4;
    }

    double getRelativeScrollPosition() {
        updateScrollEventValues();
        return ((double) this.mScrollValues.mPosition) + ((double) this.mScrollValues.mOffset);
    }

    private void dispatchStateChanged(int i2) {
        if ((this.mAdapterState == 3 && this.mScrollState == 0) || this.mScrollState == i2) {
            return;
        }
        this.mScrollState = i2;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i2);
        }
    }

    private void dispatchSelected(int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i2);
        }
    }

    private void dispatchScrolled(int i2, float f2, int i3) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.mCallback;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrolled(i2, f2, i3);
        }
    }

    private int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    private static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        ScrollEventValues() {
        }

        void reset() {
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }
}
