package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final int REMOVE_STATUS_IN_REMOVE = 1;
    private static final int REMOVE_STATUS_IN_REMOVE_IF_HIDDEN = 2;
    private static final int REMOVE_STATUS_NONE = 0;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    private View mViewInRemoveView;
    private int mRemoveStatus = 0;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    interface Callback {
        void addView(View view, int i2);

        void attachViewToParent(View view, int i2, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i2);

        View getChildAt(int i2);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i2);
    }

    ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    void addView(View view, boolean z2) {
        addView(view, -1, z2);
    }

    void addView(View view, int i2, boolean z2) {
        int offset;
        if (i2 < 0) {
            offset = this.mCallback.getChildCount();
        } else {
            offset = getOffset(i2);
        }
        this.mBucket.insert(offset, z2);
        if (z2) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, offset);
    }

    private int getOffset(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            int iCountOnesBefore = i2 - (i3 - this.mBucket.countOnesBefore(i3));
            if (iCountOnesBefore == 0) {
                while (this.mBucket.get(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iCountOnesBefore;
        }
        return -1;
    }

    void removeView(View view) {
        int i2 = this.mRemoveStatus;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.mRemoveStatus = 1;
            this.mViewInRemoveView = view;
            int iIndexOfChild = this.mCallback.indexOfChild(view);
            if (iIndexOfChild < 0) {
                return;
            }
            if (this.mBucket.remove(iIndexOfChild)) {
                unhideViewInternal(view);
            }
            this.mCallback.removeViewAt(iIndexOfChild);
        } finally {
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
        }
    }

    void removeViewAt(int i2) {
        int i3 = this.mRemoveStatus;
        if (i3 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i3 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int offset = getOffset(i2);
            View childAt = this.mCallback.getChildAt(offset);
            if (childAt == null) {
                return;
            }
            this.mRemoveStatus = 1;
            this.mViewInRemoveView = childAt;
            if (this.mBucket.remove(offset)) {
                unhideViewInternal(childAt);
            }
            this.mCallback.removeViewAt(offset);
        } finally {
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
        }
    }

    View getChildAt(int i2) {
        return this.mCallback.getChildAt(getOffset(i2));
    }

    void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    View findHiddenNonRemovedView(int i2) {
        int size = this.mHiddenViews.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mHiddenViews.get(i3);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i2 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    void attachViewToParent(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int offset;
        if (i2 < 0) {
            offset = this.mCallback.getChildCount();
        } else {
            offset = getOffset(i2);
        }
        this.mBucket.insert(offset, z2);
        if (z2) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, offset, layoutParams);
    }

    int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    View getUnfilteredChildAt(int i2) {
        return this.mCallback.getChildAt(i2);
    }

    void detachViewFromParent(int i2) {
        int offset = getOffset(i2);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    int indexOfChild(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild == -1 || this.mBucket.get(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.mBucket.countOnesBefore(iIndexOfChild);
    }

    boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    void hide(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.mBucket.set(iIndexOfChild);
        hideViewInternal(view);
    }

    void unhide(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (!this.mBucket.get(iIndexOfChild)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        this.mBucket.clear(iIndexOfChild);
        unhideViewInternal(view);
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    boolean removeViewIfHidden(View view) {
        int i2 = this.mRemoveStatus;
        if (i2 == 1) {
            if (this.mViewInRemoveView == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.mRemoveStatus = 2;
            int iIndexOfChild = this.mCallback.indexOfChild(view);
            if (iIndexOfChild == -1) {
                unhideViewInternal(view);
                return true;
            }
            if (!this.mBucket.get(iIndexOfChild)) {
                return false;
            }
            this.mBucket.remove(iIndexOfChild);
            unhideViewInternal(view);
            this.mCallback.removeViewAt(iIndexOfChild);
            return true;
        } finally {
            this.mRemoveStatus = 0;
        }
    }

    static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        Bucket() {
        }

        void set(int i2) {
            if (i2 >= 64) {
                ensureNext();
                this.mNext.set(i2 - 64);
            } else {
                this.mData |= 1 << i2;
            }
        }

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        void clear(int i2) {
            if (i2 >= 64) {
                Bucket bucket = this.mNext;
                if (bucket != null) {
                    bucket.clear(i2 - 64);
                    return;
                }
                return;
            }
            long j2 = this.mData;
            long j3 = ~(1 << i2);
            this.mData = (j2 + j3) - (j2 | j3);
        }

        boolean get(int i2) {
            if (i2 < 64) {
                return (-1) - (((-1) - this.mData) | ((-1) - (1 << i2))) != 0;
            }
            ensureNext();
            return this.mNext.get(i2 - 64);
        }

        void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        void insert(int i2, boolean z2) {
            if (i2 >= 64) {
                ensureNext();
                this.mNext.insert(i2 - 64, z2);
                return;
            }
            long j2 = this.mData;
            boolean z3 = (Long.MIN_VALUE + j2) - (Long.MIN_VALUE | j2) != 0;
            long j3 = (1 << i2) - 1;
            this.mData = (((-1) - (((-1) - j2) | ((-1) - (~j3)))) << 1) | (j2 & j3);
            if (z2) {
                set(i2);
            } else {
                clear(i2);
            }
            if (z3 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z3);
            }
        }

        boolean remove(int i2) {
            if (i2 >= 64) {
                ensureNext();
                return this.mNext.remove(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.mData;
            boolean z2 = (-1) - (((-1) - j3) | ((-1) - j2)) != 0;
            long j4 = ~j2;
            long j5 = (j3 + j4) - (j3 | j4);
            this.mData = j5;
            long j6 = j2 - 1;
            this.mData = (-1) - (((-1) - ((j5 + j6) - (j5 | j6))) & ((-1) - Long.rotateRight((-1) - (((-1) - (~j6)) | ((-1) - j5)), 1)));
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z2;
        }

        int countOnesBefore(int i2) {
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i2 >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << i2) - 1));
            }
            if (i2 < 64) {
                return Long.bitCount(this.mData & ((1 << i2) - 1));
            }
            return bucket.countOnesBefore(i2 - 64) + Long.bitCount(this.mData);
        }

        public String toString() {
            return this.mNext == null ? Long.toBinaryString(this.mData) : this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }
}
