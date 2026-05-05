package com.incode.welcome_sdk.commons.ui.page_indicator_view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.core.text.TextUtilsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.controller.DrawController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.PositionSavedState;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.RtlMode;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.DensityUtils;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.IdUtils;
import com.incode.welcome_sdk.commons.utils.w;

/* JADX INFO: loaded from: classes5.dex */
public class PageIndicatorView extends View implements View.OnTouchListener, ViewPager.OnAdapterChangeListener, ViewPager.OnPageChangeListener, IndicatorManager.a {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5987a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5988b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5989c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5990e = 0;
    private Runnable idleRunnable;
    private boolean isInteractionEnabled;
    IndicatorManager manager;
    private DataSetObserver setObserver;
    private ViewPager viewPager;

    static {
        int i2 = f5988b + 85;
        f5987a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public PageIndicatorView(Context context) {
        super(context);
        this.idleRunnable = new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5991b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5992d = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = f5991b + 81;
                f5992d = i3 % 128;
                int i4 = i3 % 2;
                PageIndicatorView.this.manager.e().setIdle(true);
                PageIndicatorView.this.hideWithAnimation();
                int i5 = f5991b + 5;
                f5992d = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        init(null);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.idleRunnable = new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5991b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5992d = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = f5991b + 81;
                f5992d = i3 % 128;
                int i4 = i3 % 2;
                PageIndicatorView.this.manager.e().setIdle(true);
                PageIndicatorView.this.hideWithAnimation();
                int i5 = f5991b + 5;
                f5992d = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        init(attributeSet);
    }

    public PageIndicatorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.idleRunnable = new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f5991b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f5992d = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = 2 % 2;
                int i3 = f5991b + 81;
                f5992d = i3 % 128;
                int i4 = i3 % 2;
                PageIndicatorView.this.manager.e().setIdle(true);
                PageIndicatorView.this.hideWithAnimation();
                int i5 = f5991b + 5;
                f5992d = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        init(attributeSet);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        int i2 = 2 % 2;
        int i3 = f5990e + 19;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        super.onAttachedToWindow();
        findViewPager(getParent());
        int i5 = f5989c + 101;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i2 = 2 % 2;
        int i3 = f5990e + 1;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        unRegisterSetObserver();
        super.onDetachedFromWindow();
        int i5 = f5990e + 33;
        f5989c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        int i2 = 2 % 2;
        Indicator indicatorE = this.manager.e();
        PositionSavedState positionSavedState = new PositionSavedState(super.onSaveInstanceState());
        positionSavedState.setSelectedPosition(indicatorE.q());
        positionSavedState.setSelectingPosition(indicatorE.x());
        positionSavedState.setLastSelectedPosition(indicatorE.u());
        int i3 = f5990e + 53;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        return positionSavedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i2 = 2 % 2;
        int i3 = f5989c + 101;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        if (parcelable instanceof PositionSavedState) {
            Indicator indicatorE = this.manager.e();
            PositionSavedState positionSavedState = (PositionSavedState) parcelable;
            indicatorE.setSelectedPosition(positionSavedState.a());
            indicatorE.setSelectingPosition(positionSavedState.e());
            indicatorE.setLastSelectedPosition(positionSavedState.c());
            super.onRestoreInstanceState(positionSavedState.getSuperState());
            int i5 = f5990e + 59;
            f5989c = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5989c + 15;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
        Pair<Integer, Integer> pairD = this.manager.b().d(i2, i3);
        setMeasuredDimension(((Integer) pairD.first).intValue(), ((Integer) pairD.second).intValue());
        int i7 = f5989c + 33;
        f5990e = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5989c + 85;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        this.manager.b().d(canvas);
        int i5 = f5989c + 123;
        f5990e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2 = 2 % 2;
        int i3 = f5989c + 93;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        this.manager.b().a(motionEvent);
        int i5 = f5989c + 73;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r1 = r7.getAction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        startIdleRunnable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        stopIdleRunnable();
        r1 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c + 61;
        com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5.manager.e().s() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        r2 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e;
        r1 = r2 + 13;
        com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r1 % 128;
        r1 = r1 % 2;
        r1 = r2 + 97;
        com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5.manager.e().s() == false) goto L6;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 != 0) goto L2e
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r5.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            boolean r1 = r0.s()
            r0 = 1
            int r0 = r0 / r3
            if (r1 != 0) goto L3b
        L1d:
            int r2 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e
            int r1 = r2 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r0
            int r1 = r1 % r4
            int r1 = r2 + 97
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r0
            int r1 = r1 % r4
            return r3
        L2e:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r5.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            boolean r0 = r0.s()
            if (r0 != 0) goto L3b
            goto L1d
        L3b:
            int r1 = r7.getAction()
            if (r1 == 0) goto L49
            r0 = 1
            if (r1 == r0) goto L45
        L44:
            return r3
        L45:
            r5.startIdleRunnable()
            goto L44
        L49:
            r5.stopIdleRunnable()
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r0
            int r1 = r1 % r4
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager.a
    public void onIndicatorUpdated() {
        int i2 = 2 % 2;
        int i3 = f5989c + 47;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        invalidate();
        int i5 = f5989c + 87;
        f5990e = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5989c + 105;
        f5990e = i5 % 128;
        if (i5 % 2 == 0) {
            onPageScroll(i2, f2);
            int i6 = f5990e + 115;
            f5989c = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        onPageScroll(i2, f2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
        Callback.onPageSelected_enter(i2);
        try {
            int i3 = 2 % 2;
            int i4 = f5989c + 19;
            f5990e = i4 % 128;
            int i5 = i4 % 2;
            onPageSelect(i2);
            int i6 = f5989c + 107;
            f5990e = i6 % 128;
            int i7 = i6 % 2;
        } finally {
            Callback.onPageSelected_exit();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
        int i3 = 2 % 2;
        int i4 = f5990e;
        int i5 = i4 + 69;
        f5989c = i5 % 128;
        int i6 = i5 % 2;
        if (i2 == 0) {
            int i7 = i4 + 31;
            f5989c = i7 % 128;
            if (i7 % 2 == 0) {
                this.manager.e().setInteractiveAnimation(this.isInteractionEnabled);
                int i8 = 57 / 0;
            } else {
                this.manager.e().setInteractiveAnimation(this.isInteractionEnabled);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        DataSetObserver dataSetObserver;
        int i2 = 2 % 2;
        int i3 = f5990e + 37;
        f5989c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.manager.e().o()) {
                if (pagerAdapter != null && (dataSetObserver = this.setObserver) != null) {
                    pagerAdapter.unregisterDataSetObserver(dataSetObserver);
                    this.setObserver = null;
                }
                registerSetObserver();
            }
            updateState();
            int i4 = f5990e + 63;
            f5989c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
                return;
            }
            return;
        }
        this.manager.e().o();
        obj.hashCode();
        throw null;
    }

    public void setCount(int i2) {
        int i3 = 2 % 2;
        int i4 = f5989c + 7;
        f5990e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i2 < 0 || this.manager.e().r() == i2) {
            return;
        }
        this.manager.e().setCount(i2);
        updateVisibility();
        requestLayout();
        int i5 = f5989c + 39;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getCount() {
        int iR;
        int i2 = 2 % 2;
        int i3 = f5990e + 17;
        f5989c = i3 % 128;
        if (i3 % 2 == 0) {
            iR = this.manager.e().r();
            int i4 = 21 / 0;
        } else {
            iR = this.manager.e().r();
        }
        int i5 = f5989c + 13;
        f5990e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return iR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if ((!r5) != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        registerSetObserver();
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        unRegisterSetObserver();
        r1 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c + 67;
        com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        r1 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c + 85;
        com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        registerSetObserver();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDynamicCount(boolean r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L2d
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r4.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            r0.setDynamicCount(r5)
            r0 = 54
            int r0 = r0 / 0
            if (r5 == 0) goto L42
        L1e:
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L3b
            r4.registerSetObserver()
            return
        L2d:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r4.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            r0.setDynamicCount(r5)
            r0 = 1
            r5 = r5 ^ r0
            if (r5 == r0) goto L42
            goto L1e
        L3b:
            r4.registerSetObserver()
            r2.hashCode()
            throw r2
        L42:
            r4.unRegisterSetObserver()
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L51
            return
        L51:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.setDynamicCount(boolean):void");
    }

    public void setFadeOnIdle(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5989c + 109;
        f5990e = i3 % 128;
        if (i3 % 2 == 0) {
            this.manager.e().setFadeOnIdle(z2);
            if (z2) {
                startIdleRunnable();
                return;
            }
            stopIdleRunnable();
            int i4 = f5989c + 1;
            f5990e = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.manager.e().setFadeOnIdle(z2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRadius(int i2) {
        int i3 = 2 % 2;
        if (i2 < 0) {
            int i4 = f5990e + 87;
            f5989c = i4 % 128;
            int i5 = i4 % 2;
            i2 = 0;
        }
        this.manager.e().setRadius(DensityUtils.b(i2));
        invalidate();
        int i6 = f5989c + 105;
        f5990e = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setRadius(float f2) {
        int i2 = 2 % 2;
        int i3 = f5990e;
        int i4 = i3 + 27;
        f5989c = i4 % 128;
        int i5 = i4 % 2;
        if (f2 < 0.0f) {
            int i6 = i3 + 13;
            f5989c = i6 % 128;
            f2 = i6 % 2 == 0 ? 1.0f : 0.0f;
            int i7 = i3 + 21;
            f5989c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 3;
            }
        }
        this.manager.e().setRadius((int) f2);
        invalidate();
    }

    public int getRadius() {
        int i2 = 2 % 2;
        int i3 = f5990e + 103;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.manager.e()};
        int iC = w.c();
        int iC2 = w.c();
        int iC3 = w.c();
        int iC4 = w.c();
        if (i4 != 0) {
            return ((Integer) Indicator.d(1089547635, iC, iC3, objArr, -1089547635, iC4, iC2)).intValue();
        }
        ((Integer) Indicator.d(1089547635, iC, iC3, objArr, -1089547635, iC4, iC2)).intValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPadding(int i2) {
        int i3 = 2 % 2;
        int i4 = f5990e + 37;
        f5989c = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        this.manager.e().setPadding(DensityUtils.b(i2));
        invalidate();
        int i5 = f5990e + 79;
        f5989c = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setPadding(float f2) {
        int i2 = 2 % 2;
        int i3 = f5989c + 67;
        f5990e = i3 % 128;
        if (i3 % 2 == 0 ? f2 < 0.0f : f2 < 2.0f) {
            f2 = 0.0f;
        }
        this.manager.e().setPadding((int) f2);
        invalidate();
        int i4 = f5990e + 121;
        f5989c = i4 % 128;
        int i5 = i4 % 2;
    }

    public int getPadding() {
        int iA;
        int i2 = 2 % 2;
        int i3 = f5989c + 37;
        f5990e = i3 % 128;
        if (i3 % 2 != 0) {
            iA = this.manager.e().a();
            int i4 = 7 / 0;
        } else {
            iA = this.manager.e().a();
        }
        int i5 = f5989c + 1;
        f5990e = i5 % 128;
        if (i5 % 2 == 0) {
            return iA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setScaleFactor(float f2) {
        int i2 = 2 % 2;
        int i3 = f5989c + 51;
        int i4 = i3 % 128;
        f5990e = i4;
        if (i3 % 2 == 0 ? f2 > 1.0f : f2 > 2.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.3f) {
            int i5 = i4 + 11;
            f5989c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            f2 = 0.3f;
        }
        this.manager.e().setScaleFactor(f2);
    }

    public float getScaleFactor() {
        int i2 = 2 % 2;
        int i3 = f5990e + 19;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        Indicator indicatorE = this.manager.e();
        if (i4 != 0) {
            return indicatorE.g();
        }
        indicatorE.g();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[PHI: r1
  0x0084: PHI (r1v3 int) = (r1v2 int), (r1v9 int) binds: [B:10:0x0081, B:5:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStrokeWidth(float r12) {
        /*
            r11 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L55
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r11.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            int r5 = com.incode.welcome_sdk.commons.utils.w.c()
            int r10 = com.incode.welcome_sdk.commons.utils.w.c()
            int r6 = com.incode.welcome_sdk.commons.utils.w.c()
            int r9 = com.incode.welcome_sdk.commons.utils.w.c()
            r8 = -1089547635(0xffffffffbf0ed28d, float:-0.55790025)
            r4 = 1089547635(0x40f12d73, float:7.536798)
            java.lang.Object r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.d(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L84
        L3d:
            r12 = r2
        L3e:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r11.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r1 = r0.e()
            int r0 = (int) r12
            r1.setStroke(r0)
            r11.invalidate()
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r0
            int r1 = r1 % r3
            return
        L55:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r11.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            java.lang.Object[] r7 = new java.lang.Object[]{r0}
            int r5 = com.incode.welcome_sdk.commons.utils.w.c()
            int r10 = com.incode.welcome_sdk.commons.utils.w.c()
            int r6 = com.incode.welcome_sdk.commons.utils.w.c()
            int r9 = com.incode.welcome_sdk.commons.utils.w.c()
            r8 = -1089547635(0xffffffffbf0ed28d, float:-0.55790025)
            r4 = 1089547635(0x40f12d73, float:7.536798)
            java.lang.Object r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator.d(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L84
            goto L3d
        L84:
            float r2 = (float) r1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3e
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e
            int r1 = r0 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L98
            r0 = 49
            int r0 = r0 / 0
        L98:
            r12 = r2
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.setStrokeWidth(float):void");
    }

    public void setStrokeWidth(int i2) {
        int i3 = 2 % 2;
        int i4 = f5990e + 25;
        f5989c = i4 % 128;
        int i5 = i4 % 2;
        int iB = DensityUtils.b(i2);
        Object[] objArr = {this.manager.e()};
        int iIntValue = ((Integer) Indicator.d(1089547635, w.c(), w.c(), objArr, -1089547635, w.c(), w.c())).intValue();
        if (iB < 0) {
            iB = 0;
        } else if (iB > iIntValue) {
            int i6 = f5989c + 71;
            f5990e = i6 % 128;
            int i7 = i6 % 2;
            iB = iIntValue;
        }
        this.manager.e().setStroke(iB);
        invalidate();
        int i8 = f5989c + 67;
        f5990e = i8 % 128;
        int i9 = i8 % 2;
    }

    public int getStrokeWidth() {
        int i2 = 2 % 2;
        int i3 = f5990e + 25;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        int iJ = this.manager.e().j();
        int i5 = f5989c + 87;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
        return iJ;
    }

    public void setSelectedColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f5989c + 55;
        f5990e = i4 % 128;
        int i5 = i4 % 2;
        this.manager.e().setSelectedColor(i2);
        invalidate();
        int i6 = f5990e + 29;
        f5989c = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getSelectedColor() {
        int i2 = 2 % 2;
        int i3 = f5990e + 45;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.manager.e()};
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), objArr, -1903576323, w.c(), w.c())).intValue();
        int i5 = f5990e + 21;
        f5989c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return iIntValue;
    }

    public void setUnselectedColor(int i2) {
        int i3 = 2 % 2;
        int i4 = f5989c + 69;
        f5990e = i4 % 128;
        int i5 = i4 % 2;
        this.manager.e().setUnselectedColor(i2);
        invalidate();
        int i6 = f5989c + 61;
        f5990e = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getUnselectedColor() {
        int i2 = 2 % 2;
        int i3 = f5989c + 121;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        int iN = this.manager.e().n();
        int i5 = f5990e + 111;
        f5989c = i5 % 128;
        int i6 = i5 % 2;
        return iN;
    }

    public void setAutoVisibility(boolean z2) {
        int i2 = 2 % 2;
        if (!z2) {
            int i3 = f5989c + 107;
            f5990e = i3 % 128;
            int i4 = i3 % 2;
            setVisibility(0);
            int i5 = f5990e + 111;
            f5989c = i5 % 128;
            int i6 = i5 % 2;
        }
        this.manager.e().setAutoVisibility(z2);
        updateVisibility();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOrientation(com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation r4) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c
            int r1 = r0 + 1
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2c
            r0 = 93
            int r0 = r0 / 0
            if (r4 == 0) goto L20
        L14:
            com.incode.welcome_sdk.commons.ui.page_indicator_view.IndicatorManager r0 = r3.manager
            com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator r0 = r0.e()
            r0.setOrientation(r4)
            r3.requestLayout()
        L20:
            int r0 = com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5989c
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.f5990e = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L2f
            return
        L2c:
            if (r4 == 0) goto L20
            goto L14
        L2f:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.setOrientation(com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation):void");
    }

    public void setAnimationDuration(long j2) {
        int i2 = 2 % 2;
        int i3 = f5989c + 47;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        this.manager.e().setAnimationDuration(j2);
        int i5 = f5989c + 39;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setIdleDuration(long j2) {
        int i2 = 2 % 2;
        this.manager.e().setIdleDuration(j2);
        if (!this.manager.e().s()) {
            stopIdleRunnable();
            return;
        }
        int i3 = f5990e + 71;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        startIdleRunnable();
        int i5 = f5989c + 41;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
    }

    public long getAnimationDuration() {
        int i2 = 2 % 2;
        int i3 = f5989c + 51;
        f5990e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.manager.e().t();
            obj.hashCode();
            throw null;
        }
        long jT = this.manager.e().t();
        int i4 = f5989c + 31;
        f5990e = i4 % 128;
        if (i4 % 2 == 0) {
            return jT;
        }
        obj.hashCode();
        throw null;
    }

    public void setAnimationType(AnimationType animationType) {
        int i2 = 2 % 2;
        int i3 = f5990e + 71;
        f5989c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.manager.a(null);
            if (animationType == null) {
                this.manager.e().setAnimationType(AnimationType.NONE);
                int i4 = f5989c + 107;
                f5990e = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = f5989c + 89;
                f5990e = i6 % 128;
                if (i6 % 2 != 0) {
                    this.manager.e().setAnimationType(animationType);
                    obj.hashCode();
                    throw null;
                }
                this.manager.e().setAnimationType(animationType);
            }
            invalidate();
            return;
        }
        this.manager.a(null);
        throw null;
    }

    public void setInteractiveAnimation(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5989c + 63;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        this.manager.e().setInteractiveAnimation(z2);
        this.isInteractionEnabled = z2;
        int i5 = f5989c + 5;
        f5990e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        int i2 = 2 % 2;
        int i3 = f5990e + 79;
        f5989c = i3 % 128;
        if (i3 % 2 != 0) {
            releaseViewPager();
            if (viewPager == null) {
                return;
            }
            this.viewPager = viewPager;
            viewPager.addOnPageChangeListener(this);
            this.viewPager.addOnAdapterChangeListener(this);
            this.viewPager.setOnTouchListener(this);
            this.manager.e().setViewPagerId(this.viewPager.getId());
            setDynamicCount(this.manager.e().o());
            updateState();
            int i4 = f5989c + 101;
            f5990e = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        releaseViewPager();
        throw null;
    }

    public void releaseViewPager() {
        int i2 = 2 % 2;
        int i3 = f5990e + 65;
        f5989c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
            if (this.viewPager == null) {
                return;
            }
        } else if (this.viewPager == null) {
            return;
        }
        this.viewPager.removeOnPageChangeListener(this);
        this.viewPager.removeOnAdapterChangeListener(this);
        this.viewPager = null;
        int i5 = f5990e + 23;
        f5989c = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setRtlMode(RtlMode rtlMode) {
        int i2 = 2 % 2;
        Indicator indicatorE = this.manager.e();
        if (rtlMode == null) {
            indicatorE.setRtlMode(RtlMode.Off);
        } else {
            indicatorE.setRtlMode(rtlMode);
        }
        if (this.viewPager != null) {
            int iQ = indicatorE.q();
            if (!isRtl()) {
                ViewPager viewPager = this.viewPager;
                if (viewPager != null) {
                    iQ = viewPager.getCurrentItem();
                }
            } else {
                int i3 = f5990e + 1;
                f5989c = i3 % 128;
                int i4 = i3 % 2;
                iQ = (indicatorE.r() - 1) - iQ;
            }
            indicatorE.setLastSelectedPosition(iQ);
            indicatorE.setSelectingPosition(iQ);
            indicatorE.setSelectedPosition(iQ);
            invalidate();
            return;
        }
        int i5 = f5989c + 91;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getSelection() {
        int i2 = 2 % 2;
        int i3 = f5990e + 29;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        int iQ = this.manager.e().q();
        int i5 = f5990e + 13;
        f5989c = i5 % 128;
        int i6 = i5 % 2;
        return iQ;
    }

    public void setSelection(int i2) {
        int i3 = 2 % 2;
        Indicator indicatorE = this.manager.e();
        int iAdjustPosition = adjustPosition(i2);
        if (iAdjustPosition != indicatorE.q()) {
            int i4 = f5989c + 37;
            f5990e = i4 % 128;
            int i5 = i4 % 2;
            if (iAdjustPosition == indicatorE.x()) {
                return;
            }
            indicatorE.setInteractiveAnimation(false);
            indicatorE.setLastSelectedPosition(indicatorE.q());
            indicatorE.setSelectingPosition(iAdjustPosition);
            indicatorE.setSelectedPosition(iAdjustPosition);
            this.manager.d().d();
            int i6 = f5990e + 57;
            f5989c = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void setSelected(int i2) {
        int i3 = 2 % 2;
        int i4 = f5989c + 55;
        f5990e = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            Indicator indicatorE = this.manager.e();
            AnimationType animationTypeV = indicatorE.v();
            indicatorE.setAnimationType(AnimationType.NONE);
            setSelection(i2);
            indicatorE.setAnimationType(animationTypeV);
            int i5 = f5989c + 25;
            f5990e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        Indicator indicatorE2 = this.manager.e();
        AnimationType animationTypeV2 = indicatorE2.v();
        indicatorE2.setAnimationType(AnimationType.NONE);
        setSelection(i2);
        indicatorE2.setAnimationType(animationTypeV2);
        obj.hashCode();
        throw null;
    }

    public void clearSelection() {
        int i2 = 2 % 2;
        int i3 = f5990e + 77;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        Indicator indicatorE = this.manager.e();
        indicatorE.setInteractiveAnimation(false);
        indicatorE.setLastSelectedPosition(-1);
        indicatorE.setSelectingPosition(-1);
        indicatorE.setSelectedPosition(-1);
        this.manager.d().d();
        int i5 = f5990e + 55;
        f5989c = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setProgress(int i2, float f2) {
        int i3 = 2 % 2;
        Indicator indicatorE = this.manager.e();
        if (indicatorE.l()) {
            int iR = indicatorE.r();
            if (iR <= 0 || i2 < 0) {
                i2 = 0;
            } else {
                int i4 = iR - 1;
                if (i2 > i4) {
                    int i5 = f5989c + 83;
                    f5990e = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = i4;
                }
            }
            if (f2 < 0.0f) {
                int i7 = f5989c + 121;
                f5990e = i7 % 128;
                int i8 = i7 % 2;
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                int i9 = f5990e + 45;
                f5989c = i9 % 128;
                int i10 = i9 % 2;
                f2 = 1.0f;
            }
            if (f2 == 1.0f) {
                indicatorE.setLastSelectedPosition(indicatorE.q());
                indicatorE.setSelectedPosition(i2);
            }
            indicatorE.setSelectingPosition(i2);
            this.manager.d().e(f2);
            int i11 = f5989c + 57;
            f5990e = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    public void setClickListener(DrawController.ClickListener clickListener) {
        int i2 = 2 % 2;
        int i3 = f5990e + 117;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        this.manager.b().setClickListener(clickListener);
        int i5 = f5989c + 29;
        f5990e = i5 % 128;
        int i6 = i5 % 2;
    }

    private void init(AttributeSet attributeSet) {
        int i2 = 2 % 2;
        setupId();
        initIndicatorManager(attributeSet);
        Object obj = null;
        if (this.manager.e().s()) {
            int i3 = f5989c + 91;
            f5990e = i3 % 128;
            if (i3 % 2 != 0) {
                startIdleRunnable();
                throw null;
            }
            startIdleRunnable();
        }
        int i4 = f5990e + 23;
        f5989c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void setupId() {
        int i2 = 2 % 2;
        int i3 = f5989c + 115;
        f5990e = i3 % 128;
        int i4 = i3 % 2;
        if (getId() == -1) {
            int i5 = f5990e + 43;
            f5989c = i5 % 128;
            if (i5 % 2 != 0) {
                setId(IdUtils.a());
            } else {
                setId(IdUtils.a());
                throw null;
            }
        }
    }

    private void initIndicatorManager(AttributeSet attributeSet) {
        int i2 = 2 % 2;
        IndicatorManager indicatorManager = new IndicatorManager(this);
        this.manager = indicatorManager;
        indicatorManager.b().b(getContext(), attributeSet);
        Indicator indicatorE = this.manager.e();
        indicatorE.setPaddingLeft(getPaddingLeft());
        indicatorE.setPaddingTop(getPaddingTop());
        indicatorE.setPaddingRight(getPaddingRight());
        indicatorE.setPaddingBottom(getPaddingBottom());
        this.isInteractionEnabled = indicatorE.l();
        int i3 = f5990e + 11;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
    }

    private void registerSetObserver() {
        int i2 = 2 % 2;
        int i3 = f5990e + 51;
        int i4 = i3 % 128;
        f5989c = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (this.setObserver == null) {
            int i6 = i4 + 35;
            int i7 = i6 % 128;
            f5990e = i7;
            int i8 = i6 % 2;
            ViewPager viewPager = this.viewPager;
            if (viewPager != null) {
                int i9 = i7 + 5;
                f5989c = i9 % 128;
                if (i9 % 2 == 0) {
                    viewPager.getAdapter();
                    obj.hashCode();
                    throw null;
                }
                if (viewPager.getAdapter() != null) {
                    this.setObserver = new DataSetObserver() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView.5

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private static int f5997b = 0;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f5998e = 1;

                        @Override // android.database.DataSetObserver
                        public final void onChanged() {
                            int i10 = 2 % 2;
                            int i11 = f5997b + 61;
                            f5998e = i11 % 128;
                            int i12 = i11 % 2;
                            PageIndicatorView.this.updateState();
                            int i13 = f5998e + 11;
                            f5997b = i13 % 128;
                            int i14 = i13 % 2;
                        }
                    };
                    try {
                        this.viewPager.getAdapter().registerDataSetObserver(this.setObserver);
                        int i10 = f5989c + 5;
                        f5990e = i10 % 128;
                        int i11 = i10 % 2;
                        return;
                    } catch (IllegalStateException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
        }
        int i12 = f5990e + 69;
        f5989c = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void unRegisterSetObserver() {
        int i2 = 2 % 2;
        int i3 = f5989c + 95;
        int i4 = i3 % 128;
        f5990e = i4;
        int i5 = i3 % 2;
        if (this.setObserver == null) {
            return;
        }
        int i6 = i4 + 15;
        f5989c = i6 % 128;
        int i7 = i6 % 2;
        ViewPager viewPager = this.viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            try {
                this.viewPager.getAdapter().unregisterDataSetObserver(this.setObserver);
                this.setObserver = null;
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    void updateState() {
        int i2 = 2 % 2;
        int i3 = f5990e + 91;
        f5989c = i3 % 128;
        if (i3 % 2 != 0) {
            ViewPager viewPager = this.viewPager;
            if (viewPager == null || viewPager.getAdapter() == null) {
                int i4 = f5990e + 77;
                f5989c = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int count = this.viewPager.getAdapter().getCount();
            int currentItem = !isRtl() ? this.viewPager.getCurrentItem() : (count - 1) - this.viewPager.getCurrentItem();
            this.manager.e().setSelectedPosition(currentItem);
            this.manager.e().setSelectingPosition(currentItem);
            this.manager.e().setLastSelectedPosition(currentItem);
            this.manager.e().setCount(count);
            this.manager.d().e();
            updateVisibility();
            requestLayout();
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void updateVisibility() {
        int i2 = 2 % 2;
        if (this.manager.e().m()) {
            int iR = this.manager.e().r();
            int visibility = getVisibility();
            if (visibility != 0 && iR > 1) {
                int i3 = f5989c + 91;
                f5990e = i3 % 128;
                if (i3 % 2 != 0) {
                    setVisibility(1);
                    return;
                } else {
                    setVisibility(0);
                    return;
                }
            }
            if (visibility == 4 || iR > 1) {
                return;
            }
            setVisibility(4);
            int i4 = f5989c + 45;
            f5990e = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void onPageSelect(int i2) {
        int i3 = 2 % 2;
        Indicator indicatorE = this.manager.e();
        boolean zIsViewMeasured = isViewMeasured();
        int iR = indicatorE.r();
        if (zIsViewMeasured) {
            if (isRtl()) {
                int i4 = f5989c + 45;
                f5990e = i4 % 128;
                int i5 = i4 % 2;
                i2 = (iR - 1) - i2;
            }
            setSelection(i2);
            int i6 = f5989c + 83;
            f5990e = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private void onPageScroll(int i2, float f2) {
        int i3 = 2 % 2;
        Indicator indicatorE = this.manager.e();
        AnimationType animationTypeV = indicatorE.v();
        boolean zL = indicatorE.l();
        if (isViewMeasured()) {
            int i4 = f5990e + 39;
            f5989c = i4 % 128;
            int i5 = i4 % 2;
            if (zL && animationTypeV != AnimationType.NONE) {
                int i6 = f5990e + 63;
                f5989c = i6 % 128;
                int i7 = i6 % 2;
                Pair<Integer, Float> pairD = CoordinatesUtils.d(indicatorE, i2, f2, isRtl());
                setProgress(((Integer) pairD.first).intValue(), ((Float) pairD.second).floatValue());
                return;
            }
        }
        int i8 = f5989c + 17;
        f5990e = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.ui.page_indicator_view.PageIndicatorView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5995b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5996e = 1;

        static {
            int[] iArr = new int[RtlMode.valuesCustom().length];
            f5994a = iArr;
            try {
                iArr[RtlMode.On.ordinal()] = 1;
                int i2 = f5995b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f5996e = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5994a[RtlMode.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5994a[RtlMode.Auto.ordinal()] = 3;
                int i5 = f5996e + 29;
                f5995b = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private boolean isRtl() {
        int i2 = 2 % 2;
        int i3 = AnonymousClass4.f5994a[this.manager.e().A().ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            int i4 = f5990e + 77;
            f5989c = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return false;
        }
        if (i3 != 3 || TextUtilsCompat.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) != 1) {
            return false;
        }
        int i6 = f5990e + 35;
        f5989c = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private boolean isViewMeasured() {
        int i2 = 2 % 2;
        if (getMeasuredHeight() != 0) {
            return true;
        }
        int i3 = f5990e + 103;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        if (getMeasuredWidth() != 0) {
            return true;
        }
        int i5 = f5990e + 95;
        f5989c = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private void findViewPager(ViewParent viewParent) {
        int i2 = 2 % 2;
        while (viewParent != null && (viewParent instanceof ViewGroup)) {
            int i3 = f5989c + 115;
            f5990e = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                if (((ViewGroup) viewParent).getChildCount() <= 0) {
                    return;
                }
                Object[] objArr = {this.manager.e()};
                ViewPager viewPagerFindViewPager = findViewPager((ViewGroup) viewParent, ((Integer) Indicator.d(1501396327, w.c(), w.c(), objArr, -1501396326, w.c(), w.c())).intValue());
                if (viewPagerFindViewPager != null) {
                    int i4 = f5989c + 91;
                    f5990e = i4 % 128;
                    if (i4 % 2 == 0) {
                        setViewPager(viewPagerFindViewPager);
                        return;
                    } else {
                        setViewPager(viewPagerFindViewPager);
                        throw null;
                    }
                }
                viewParent = viewParent.getParent();
            } else {
                ((ViewGroup) viewParent).getChildCount();
                obj.hashCode();
                throw null;
            }
        }
    }

    private ViewPager findViewPager(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        if (viewGroup.getChildCount() > 0) {
            View viewFindViewById = viewGroup.findViewById(i2);
            if (viewFindViewById != null) {
                int i4 = f5990e + 107;
                int i5 = i4 % 128;
                f5989c = i5;
                if (i4 % 2 == 0) {
                    boolean z2 = viewFindViewById instanceof ViewPager;
                    throw null;
                }
                if (viewFindViewById instanceof ViewPager) {
                    int i6 = i5 + 43;
                    f5990e = i6 % 128;
                    if (i6 % 2 == 0) {
                        return (ViewPager) viewFindViewById;
                    }
                    throw null;
                }
            }
            return null;
        }
        int i7 = f5989c + 101;
        f5990e = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
        return null;
    }

    private int adjustPosition(int i2) {
        int i3 = 2 % 2;
        int iR = this.manager.e().r() - 1;
        if (i2 < 0) {
            int i4 = f5989c + 51;
            f5990e = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        if (i2 <= iR) {
            return i2;
        }
        int i6 = f5990e + 7;
        f5989c = i6 % 128;
        if (i6 % 2 != 0) {
            return iR;
        }
        throw null;
    }

    private void displayWithAnimation() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        float f2;
        int i2 = 2 % 2;
        int i3 = f5989c + 15;
        f5990e = i3 % 128;
        if (i3 % 2 != 0) {
            animate().cancel();
            viewPropertyAnimatorAnimate = animate();
            f2 = 2.0f;
        } else {
            animate().cancel();
            viewPropertyAnimatorAnimate = animate();
            f2 = 1.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f2).setDuration(250L);
    }

    void hideWithAnimation() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        float f2;
        int i2 = 2 % 2;
        int i3 = f5990e + 71;
        f5989c = i3 % 128;
        if (i3 % 2 == 0) {
            animate().cancel();
            viewPropertyAnimatorAnimate = animate();
            f2 = 2.0f;
        } else {
            animate().cancel();
            viewPropertyAnimatorAnimate = animate();
            f2 = 0.0f;
        }
        viewPropertyAnimatorAnimate.alpha(f2).setDuration(250L);
    }

    private void startIdleRunnable() {
        int i2 = 2 % 2;
        int i3 = f5990e + 87;
        f5989c = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = HANDLER;
        handler.removeCallbacks(this.idleRunnable);
        handler.postDelayed(this.idleRunnable, this.manager.e().p());
        int i5 = f5990e + 43;
        f5989c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
    }

    private void stopIdleRunnable() {
        int i2 = 2 % 2;
        int i3 = f5990e + 111;
        f5989c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            HANDLER.removeCallbacks(this.idleRunnable);
            displayWithAnimation();
            int i4 = f5989c + 11;
            f5990e = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        HANDLER.removeCallbacks(this.idleRunnable);
        displayWithAnimation();
        throw null;
    }
}
