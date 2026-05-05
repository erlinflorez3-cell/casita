package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class ScaleGestureDetector {
    private static final int ANCHORED_SCALE_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_SCALE_MODE_NONE = 0;
    private static final int ANCHORED_SCALE_MODE_STYLUS = 2;
    private static final float SCALE_FACTOR = 0.5f;
    private static final String TAG = "ScaleGestureDetector";
    private static final long TOUCH_STABILIZE_TIME = 128;
    private int mAnchoredScaleMode;
    private float mAnchoredScaleStartX;
    private float mAnchoredScaleStartY;
    private final Context mContext;
    private float mCurrSpan;
    private float mCurrSpanX;
    private float mCurrSpanY;
    private long mCurrTime;
    private boolean mEventBeforeOrAboveStartingGestureEvent;
    private float mFocusX;
    private float mFocusY;
    private GestureDetector mGestureDetector;
    private final Handler mHandler;
    private boolean mInProgress;
    private float mInitialSpan;
    private final OnScaleGestureListener mListener;
    private int mMinSpan;
    private float mPrevSpan;
    private float mPrevSpanX;
    private float mPrevSpanY;
    private long mPrevTime;
    private boolean mQuickScaleEnabled;
    private int mSpanSlop;
    private boolean mStylusScaleEnabled;

    public interface OnScaleGestureListener {
        boolean onScale(ScaleGestureDetector scaleGestureDetector);

        boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector);

        void onScaleEnd(ScaleGestureDetector scaleGestureDetector);
    }

    public static class SimpleOnScaleGestureListener implements OnScaleGestureListener {
        @Override // com.swmansion.gesturehandler.core.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return false;
        }

        @Override // com.swmansion.gesturehandler.core.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public ScaleGestureDetector(Context context, OnScaleGestureListener onScaleGestureListener) {
        this(context, onScaleGestureListener, null);
    }

    public ScaleGestureDetector(Context context, OnScaleGestureListener onScaleGestureListener, Handler handler) throws Throwable {
        Object obj;
        this.mAnchoredScaleMode = 0;
        this.mContext = context;
        this.mListener = onScaleGestureListener;
        this.mSpanSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.mMinSpan = 0;
        this.mHandler = handler;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("\u001a!tkH;\u0014FcHE3\u0005cj\u0014\n\fkyJ4\u0018", (short) (ZN.Xd() ^ 6282), (short) (ZN.Xd() ^ 20662))).getMethod(C1561oA.Xd("=<L\u001aJKHFA@TJQQ-SLV", (short) (ZN.Xd() ^ 1454)), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strVd = Wg.vd("\u001d)\u001e+' \u001ab'205%-2j\u001c\u0018Wi\u0018\u0017\u0012\u000e\u0017\u0014&\u001a\u001f\u001dv\u001b\u0002\n", (short) (ZN.Xd() ^ 25464));
            String strKd = Qg.kd("!\r\u001d\u0011\u000e\u001cy\n\u0010y\b\u0014\u0014\t\u000e\f", (short) (OY.Xd() ^ 26305), (short) (OY.Xd() ^ 13139));
            try {
                Class<?> cls = Class.forName(strVd);
                Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            if (iIntValue > 18) {
                setQuickScaleEnabled(true);
            }
            if (iIntValue > 22) {
                setStylusScaleEnabled(true);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean inAnchoredScaleMode() {
        return this.mAnchoredScaleMode != 0;
    }

    public float getCurrentSpan() {
        return this.mCurrSpan;
    }

    public float getCurrentSpanX() {
        return this.mCurrSpanX;
    }

    public float getCurrentSpanY() {
        return this.mCurrSpanY;
    }

    public long getEventTime() {
        return this.mCurrTime;
    }

    public float getFocusX() {
        return this.mFocusX;
    }

    public float getFocusY() {
        return this.mFocusY;
    }

    public float getPreviousSpan() {
        return this.mPrevSpan;
    }

    public float getPreviousSpanX() {
        return this.mPrevSpanX;
    }

    public float getPreviousSpanY() {
        return this.mPrevSpanY;
    }

    public float getScaleFactor() {
        if (!inAnchoredScaleMode()) {
            float f2 = this.mPrevSpan;
            if (f2 > 0.0f) {
                return this.mCurrSpan / f2;
            }
            return 1.0f;
        }
        boolean z2 = this.mEventBeforeOrAboveStartingGestureEvent;
        boolean z3 = (z2 && this.mCurrSpan < this.mPrevSpan) || (!z2 && this.mCurrSpan > this.mPrevSpan);
        float fAbs = Math.abs(1.0f - (this.mCurrSpan / this.mPrevSpan)) * 0.5f;
        if (this.mPrevSpan <= this.mSpanSlop) {
            return 1.0f;
        }
        return z3 ? 1.0f + fAbs : 1.0f - fAbs;
    }

    public long getTimeDelta() {
        return this.mCurrTime - this.mPrevTime;
    }

    public double getTimeDeltaSeconds() {
        return getTimeDelta() / 1000.0d;
    }

    public boolean isInProgress() {
        return this.mInProgress;
    }

    public boolean isQuickScaleEnabled() {
        return this.mQuickScaleEnabled;
    }

    public boolean isStylusScaleEnabled() {
        return this.mStylusScaleEnabled;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        this.mCurrTime = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mQuickScaleEnabled) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z2 = (-1) - (((-1) - motionEvent.getButtonState()) | ((-1) - 32)) != 0;
        boolean z3 = this.mAnchoredScaleMode == 2 && !z2;
        boolean z4 = actionMasked == 1 || actionMasked == 3 || z3;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z4) {
            if (this.mInProgress) {
                this.mListener.onScaleEnd(this);
                this.mInProgress = false;
                this.mInitialSpan = 0.0f;
                this.mAnchoredScaleMode = 0;
            } else if (inAnchoredScaleMode() && z4) {
                this.mInProgress = false;
                this.mInitialSpan = 0.0f;
                this.mAnchoredScaleMode = 0;
            }
            if (z4) {
                return true;
            }
        }
        if (!this.mInProgress && this.mStylusScaleEnabled && !inAnchoredScaleMode() && !z4 && z2) {
            this.mAnchoredScaleStartX = motionEvent.getX();
            this.mAnchoredScaleStartY = motionEvent.getY();
            this.mAnchoredScaleMode = 2;
            this.mInitialSpan = 0.0f;
        }
        boolean z5 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z3;
        boolean z6 = actionMasked == 6;
        int actionIndex = z6 ? motionEvent.getActionIndex() : -1;
        int i2 = z6 ? pointerCount - 1 : pointerCount;
        if (inAnchoredScaleMode()) {
            f2 = this.mAnchoredScaleStartX;
            f3 = this.mAnchoredScaleStartY;
            if (motionEvent.getY() < f3) {
                this.mEventBeforeOrAboveStartingGestureEvent = true;
            } else {
                this.mEventBeforeOrAboveStartingGestureEvent = false;
            }
        } else {
            float x2 = 0.0f;
            float y2 = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x2 += motionEvent.getX(i3);
                    y2 += motionEvent.getY(i3);
                }
            }
            float f4 = i2;
            f2 = x2 / f4;
            f3 = y2 / f4;
        }
        float fAbs2 = 0.0f;
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (actionIndex != i4) {
                fAbs += Math.abs(motionEvent.getX(i4) - f2);
                fAbs2 += Math.abs(motionEvent.getY(i4) - f3);
            }
        }
        float f5 = i2;
        float f6 = (fAbs / f5) * 2.0f;
        float f7 = (fAbs2 / f5) * 2.0f;
        float fHypot = inAnchoredScaleMode() ? f7 : (float) Math.hypot(f6, f7);
        boolean z7 = this.mInProgress;
        this.mFocusX = f2;
        this.mFocusY = f3;
        if (!inAnchoredScaleMode() && this.mInProgress && (fHypot < this.mMinSpan || z5)) {
            this.mListener.onScaleEnd(this);
            this.mInProgress = false;
            this.mInitialSpan = fHypot;
        }
        if (z5) {
            this.mCurrSpanX = f6;
            this.mPrevSpanX = f6;
            this.mCurrSpanY = f7;
            this.mPrevSpanY = f7;
            this.mCurrSpan = fHypot;
            this.mPrevSpan = fHypot;
            this.mInitialSpan = fHypot;
        }
        int i5 = inAnchoredScaleMode() ? this.mSpanSlop : this.mMinSpan;
        if (!this.mInProgress && fHypot >= i5 && (z7 || Math.abs(fHypot - this.mInitialSpan) > this.mSpanSlop)) {
            this.mCurrSpanX = f6;
            this.mPrevSpanX = f6;
            this.mCurrSpanY = f7;
            this.mPrevSpanY = f7;
            this.mCurrSpan = fHypot;
            this.mPrevSpan = fHypot;
            this.mPrevTime = this.mCurrTime;
            this.mInProgress = this.mListener.onScaleBegin(this);
        }
        if (actionMasked == 2) {
            this.mCurrSpanX = f6;
            this.mCurrSpanY = f7;
            this.mCurrSpan = fHypot;
            if (this.mInProgress ? this.mListener.onScale(this) : true) {
                this.mPrevSpanX = this.mCurrSpanX;
                this.mPrevSpanY = this.mCurrSpanY;
                this.mPrevSpan = this.mCurrSpan;
                this.mPrevTime = this.mCurrTime;
            }
        }
        return true;
    }

    public void setQuickScaleEnabled(boolean z2) {
        this.mQuickScaleEnabled = z2;
        if (z2 && this.mGestureDetector == null) {
            this.mGestureDetector = new GestureDetector(this.mContext, new GestureDetector.SimpleOnGestureListener() { // from class: com.swmansion.gesturehandler.core.ScaleGestureDetector.1
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    ScaleGestureDetector.this.mAnchoredScaleStartX = motionEvent.getX();
                    ScaleGestureDetector.this.mAnchoredScaleStartY = motionEvent.getY();
                    ScaleGestureDetector.this.mAnchoredScaleMode = 1;
                    return true;
                }
            }, this.mHandler);
        }
    }

    public void setStylusScaleEnabled(boolean z2) {
        this.mStylusScaleEnabled = z2;
    }
}
