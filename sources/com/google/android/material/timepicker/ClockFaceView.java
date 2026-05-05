package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final AccessibilityDelegateCompat valueAccessibilityDelegate;
    private String[] values;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$1 */
    class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
        AnonymousClass1() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$2 */
    class AnonymousClass2 extends AccessibilityDelegateCompat {
        AnonymousClass2() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (iIntValue > 0) {
                accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (i2 != 16) {
                return super.performAccessibilityAction(view, i2, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.textViewRect);
            float fCenterX = ClockFaceView.this.textViewRect.centerX();
            float fCenterY = ClockFaceView.this.textViewRect.centerY();
            ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        int[] iArr = R.styleable.ClockFaceView;
        int i3 = R.style.Widget_MaterialComponents_TimePicker_Clock;
        Class<?> cls = Class.forName(Qg.kd("lxmzvoi2fqotdlq*>igl\\ni", (short) (FB.Xd() ^ 30810), (short) (FB.Xd() ^ 2922)));
        Class<?>[] clsArr = new Class[4];
        short sXd = (short) (C1607wl.Xd() ^ 1889);
        short sXd2 = (short) (C1607wl.Xd() ^ 20393);
        int[] iArr2 = new int["O[P]YRL\u0015[YMO\u0010\"TSPF>PN>+<J".length()];
        QB qb = new QB("O[P]YRL\u0015[YMO\u0010\"TSPF>PN>+<J");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i4));
        clsArr[1] = int[].class;
        clsArr[2] = Integer.TYPE;
        clsArr[3] = Integer.TYPE;
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(C1561oA.ud("/!2\u001e%)\r-1#\u001b\u0019t'&#\u0019\u0011#!\u0011\u001e", (short) (ZN.Xd() ^ 19235)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            Resources resources = getResources();
            ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArray, R.styleable.ClockFaceView_clockNumberTextColor);
            this.textColor = colorStateList;
            LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
            ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
            this.clockHandView = clockHandView;
            this.clockHandPadding = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
            int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
            this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
            clockHandView.addOnRotateListener(this);
            int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
            ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArray, R.styleable.ClockFaceView_clockFaceBackgroundColor);
            setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
                AnonymousClass1() {
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    if (!ClockFaceView.this.isShown()) {
                        return true;
                    }
                    ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
                    return true;
                }
            });
            setFocusable(true);
            typedArray.recycle();
            this.valueAccessibilityDelegate = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
                AnonymousClass2() {
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                    if (iIntValue > 0) {
                        accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
                    }
                    accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                public boolean performAccessibilityAction(View view, int i22, Bundle bundle) {
                    if (i22 != 16) {
                        return super.performAccessibilityAction(view, i22, bundle);
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(ClockFaceView.this.textViewRect);
                    float fCenterX = ClockFaceView.this.textViewRect.centerX();
                    float fCenterY = ClockFaceView.this.textViewRect.centerY();
                    ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                    ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                    return true;
                }
            };
            String[] strArr = new String[12];
            Arrays.fill(strArr, "");
            setValues(strArr, 0);
            this.minimumHeight = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
            this.minimumWidth = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
            this.clockSize = resources.getDimensionPixelSize(R.dimen.material_clock_size);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            TextView textView = this.textViewPool.get(i2);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        this.scratch.inset(this.scratchLineBounds.left, this.scratchLineBounds.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView getSelectedTextView(RectF rectF) {
        float f2 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            TextView textView2 = this.textViewPool.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float fWidth = this.scratch.width() * this.scratch.height();
                if (fWidth < f2) {
                    textView = textView2;
                    f2 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float max3(float f2, float f3, float f4) {
        return Math.max(Math.max(f2, f3), f4);
    }

    private void updateTextViews(int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < Math.max(this.values.length, size); i3++) {
            TextView textView = this.textViewPool.get(i3);
            if (i3 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.values[i3]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i4));
                if (i4 > 1) {
                    z2 = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.values[i3]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z2);
    }

    int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.values.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        setMeasuredDimension(iMax3, iMax3);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f2, boolean z2) {
        if (Math.abs(this.currentHandRotation - f2) > EPSILON) {
            this.currentHandRotation = f2;
            findIntersectingTextView();
        }
    }

    void setCurrentLevel(int i2) {
        this.clockHandView.setCurrentLevel(i2);
    }

    public void setHandRotation(float f2) {
        this.clockHandView.setHandRotation(f2);
        findIntersectingTextView();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i2) {
        if (i2 != getRadius()) {
            super.setRadius(i2);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, int i2) {
        this.values = strArr;
        updateTextViews(i2);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    protected void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i2 = 0; i2 < this.textViewPool.size(); i2++) {
            this.textViewPool.get(i2).setVisibility(0);
        }
    }
}
