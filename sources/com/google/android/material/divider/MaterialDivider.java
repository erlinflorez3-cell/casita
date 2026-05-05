package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    private int color;
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i2) {
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialDivider, i2, i3, new int[0]);
        this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getDividerColor() {
        return this.color;
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
        int i3 = z2 ? this.insetEnd : this.insetStart;
        if (z2) {
            width = getWidth();
            i2 = this.insetStart;
        } else {
            width = getWidth();
            i2 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i3, 0, width - i2, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i4 = this.thickness;
            if (i4 > 0 && measuredHeight != i4) {
                measuredHeight = i4;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i2) {
        if (this.color != i2) {
            this.color = i2;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i2));
            invalidate();
        }
    }

    public void setDividerColorResource(int i2) {
        setDividerColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setDividerInsetEnd(int i2) {
        this.insetEnd = i2;
    }

    public void setDividerInsetEndResource(int i2) throws Throwable {
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("A2\u0005cr\fe\u0010<=\r\nY)\u000f\\{t\u0003=LC8", (short) (C1633zX.Xd() ^ (-6695)), (short) (C1633zX.Xd() ^ (-1588)))).getMethod(Ig.wd("+a!\u0019aB\u001cp\u000emsa", (short) (FB.Xd() ^ 14891)), new Class[0]);
        try {
            method.setAccessible(true);
            setDividerInsetEnd(((Resources) method.invoke(context, objArr)).getDimensionPixelOffset(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setDividerInsetStart(int i2) {
        this.insetStart = i2;
    }

    public void setDividerInsetStartResource(int i2) throws Throwable {
        Context context = getContext();
        Class<?> cls = Class.forName(EO.Od("f:@o&].y^\b\u0003-Ib\u0003_\u0012\u001ew\b7\u0011h", (short) (C1499aX.Xd() ^ (-13580))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 27691);
        int[] iArr = new int["a^lI[hchdTUb".length()];
        QB qb = new QB("a^lI[hchdTUb");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setDividerInsetStart(((Resources) method.invoke(context, objArr)).getDimensionPixelOffset(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setDividerThickness(int i2) {
        if (this.thickness != i2) {
            this.thickness = i2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i2) throws Throwable {
        Context context = getContext();
        Class<?> cls = Class.forName(C1593ug.zd("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f", (short) (C1580rY.Xd() ^ (-9702)), (short) (C1580rY.Xd() ^ (-10921))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 24173);
        int[] iArr = new int["(%3\u0010\"/*/+\u001b\u001c)".length()];
        QB qb = new QB("(%3\u0010\"/*/+\u001b\u001c)");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            setDividerThickness(((Resources) method.invoke(context, objArr)).getDimensionPixelSize(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
