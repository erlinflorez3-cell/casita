package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class CalendarItemStyle {
    private final ColorStateList backgroundColor;
    private final Rect insets;
    private final ShapeAppearanceModel itemShape;
    private final ColorStateList strokeColor;
    private final int strokeWidth;
    private final ColorStateList textColor;

    private CalendarItemStyle(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, ShapeAppearanceModel shapeAppearanceModel, Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.insets = rect;
        this.textColor = colorStateList2;
        this.backgroundColor = colorStateList;
        this.strokeColor = colorStateList3;
        this.strokeWidth = i2;
        this.itemShape = shapeAppearanceModel;
    }

    static CalendarItemStyle create(Context context, int i2) throws Throwable {
        Preconditions.checkArgument(i2 != 0, Xg.qd("\f+9:<Bn3C74H:u8w\u001c;GAKB@R*VHQ8Z`TN\nbUaV\u000fQ\u0011egma[I]lC_\u001cld\u001f0", (short) (OY.Xd() ^ 19033), (short) (OY.Xd() ^ 20278)));
        int[] iArr = R.styleable.MaterialCalendarItem;
        Class<?> cls = Class.forName(Jg.Wd("HAoY\u000ft(*;wj)V?m\u001bhI0ZC\u0016>", (short) (Od.Xd() ^ (-3762)), (short) (Od.Xd() ^ (-27194))));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), iArr};
        Method method = cls.getMethod(ZO.xd("JpmLtGArTd<\u000f>\u001blPum\"Ri-", (short) (C1499aX.Xd() ^ (-11220)), (short) (C1499aX.Xd() ^ (-7027))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            Rect rect = new Rect(typedArray.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArray.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArray.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArray.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
            ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArray, R.styleable.MaterialCalendarItem_itemFillColor);
            ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArray, R.styleable.MaterialCalendarItem_itemTextColor);
            ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArray, R.styleable.MaterialCalendarItem_itemStrokeColor);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArray.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArray.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
            typedArray.recycle();
            return new CalendarItemStyle(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, shapeAppearanceModelBuild, rect);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    int getBottomInset() {
        return this.insets.bottom;
    }

    int getLeftInset() {
        return this.insets.left;
    }

    int getRightInset() {
        return this.insets.right;
    }

    int getTopInset() {
        return this.insets.top;
    }

    void styleItem(TextView textView) {
        styleItem(textView, null, null);
    }

    void styleItem(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.itemShape);
        materialShapeDrawable2.setShapeAppearanceModel(this.itemShape);
        if (colorStateList == null) {
            colorStateList = this.backgroundColor;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        if (colorStateList2 == null) {
            colorStateList2 = this.textColor;
        }
        textView.setTextColor(colorStateList2);
        ViewCompat.setBackground(textView, new InsetDrawable((Drawable) new RippleDrawable(this.textColor.withAlpha(30), materialShapeDrawable, materialShapeDrawable2), this.insets.left, this.insets.top, this.insets.right, this.insets.bottom));
    }
}
