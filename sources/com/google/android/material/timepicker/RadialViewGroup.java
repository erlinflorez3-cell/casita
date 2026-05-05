package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(Context context) {
        this(context, null);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ViewCompat.setBackground(this, createBackground());
        int[] iArr = R.styleable.RadialViewGroup;
        Class<?> cls = Class.forName(C1593ug.zd("6D;JHC?\n@MMTFPW\u0012(UU\\Nb_", (short) (ZN.Xd() ^ 26468), (short) (ZN.Xd() ^ 26669)));
        Class<?>[] clsArr = {Class.forName(C1561oA.od("o{p}yrl5{ymo0Btspf^pn^K\\j", (short) (C1633zX.Xd() ^ (-19858)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        Method method = cls.getMethod(C1561oA.Kd("\\PcQZ`Fhnb\\\\:nonf`ttfu", (short) (C1633zX.Xd() ^ (-21602))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            this.radius = typedArray.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
            this.updateLayoutParametersRunnable = new Runnable() { // from class: com.google.android.material.timepicker.RadialViewGroup$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.updateLayoutParams();
                }
            };
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void addConstraints(List<View> list, ConstraintSet constraintSet, int i2) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(it.next().getId(), R.id.circle_center, i2, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view) {
        return SKIP_TAG.equals(view.getTag());
    }

    private void updateLayoutParamsAsync() throws Throwable {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            Object[] objArr = {this.updateLayoutParametersRunnable};
            Method method = Class.forName(Wg.Zd("G\tj4%I$].,\u0019#\u0014V8|\u0002B", (short) (C1499aX.Xd() ^ (-12926)), (short) (C1499aX.Xd() ^ (-24178)))).getMethod(Wg.vd("\u0015\u0015\u001a\u001c", (short) (Od.Xd() ^ (-10362))), Class.forName(C1561oA.Xd("UMcO\u001d\\R`Z\"GkefZ\\ga", (short) (FB.Xd() ^ 13312))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) throws Throwable {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    int getLeveledRadius(int i2) {
        return i2 == 2 ? Math.round(this.radius * LEVEL_RADIUS_RATIO) : this.radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) throws Throwable {
        super.onViewRemoved(view);
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.background.setFillColor(ColorStateList.valueOf(i2));
    }

    public void setRadius(int i2) {
        this.radius = i2;
        updateLayoutParams();
    }

    protected void updateLayoutParams() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !shouldSkipView(childAt)) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), constraintSet, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }
}
