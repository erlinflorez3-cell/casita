package com.google.android.material.divider;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    private int color;
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(Context context, int i2) {
        this(context, null, i2);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, R.attr.materialDividerStyle, i2);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        this.tempRect = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i2, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        int i4 = R.styleable.MaterialDivider_dividerThickness;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d", (short) (OY.Xd() ^ 13177))).getMethod(Wg.Zd("T,\u0005S@ D$qL \u0007", (short) (C1607wl.Xd() ^ 14820), (short) (C1607wl.Xd() ^ 20738)), new Class[0]);
        try {
            method.setAccessible(true);
            this.thickness = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.material_divider_thickness));
            this.insetStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
            this.insetEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
            this.lastItemDecorated = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
            typedArrayObtainStyledAttributes.recycle();
            this.dividerDrawable = new ShapeDrawable();
            setDividerColor(this.color);
            setOrientation(i3);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void drawForHorizontalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i2;
        int i3;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i4 = paddingTop + this.insetStart;
        int i5 = height - this.insetEnd;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = Math.round(childAt.getTranslationX());
                if (zIsLayoutRtl) {
                    i3 = this.tempRect.left + iRound;
                    i2 = this.thickness + i3;
                } else {
                    i2 = iRound + this.tempRect.right;
                    i3 = i2 - this.thickness;
                }
                this.dividerDrawable.setBounds(i3, i4, i2, i5);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int i2 = paddingLeft + (zIsLayoutRtl ? this.insetEnd : this.insetStart);
        int i3 = width - (zIsLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int iRound = this.tempRect.bottom + Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i2, iRound - this.thickness, i3, iRound);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean shouldDrawDivider(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z2 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z2 || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (RecyclerView.Adapter<?>) adapter);
        }
        return false;
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

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(int i2) {
        this.color = i2;
        Drawable drawableWrap = DrawableCompat.wrap(this.dividerDrawable);
        this.dividerDrawable = drawableWrap;
        DrawableCompat.setTint(drawableWrap, i2);
    }

    public void setDividerColorResource(Context context, int i2) {
        setDividerColor(ContextCompat.getColor(context, i2));
    }

    public void setDividerInsetEnd(int i2) {
        this.insetEnd = i2;
    }

    public void setDividerInsetEndResource(Context context, int i2) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-4223));
        int[] iArr = new int["JXO^\\WS\u001eTaahZdk&<iipbvs".length()];
        QB qb = new QB("JXO^\\WS\u001eTaahZdk&<iipbvs");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Wg.vd("jiyXl{x\u007f}or\u0002", (short) (ZN.Xd() ^ 26815)), new Class[0]);
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

    public void setDividerInsetStartResource(Context context, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (C1607wl.Xd() ^ 12515), (short) (C1607wl.Xd() ^ 9228))).getMethod(hg.Vd("%\"0\r\u001f,',(\u0018\u0019&", (short) (Od.Xd() ^ (-9556)), (short) (Od.Xd() ^ (-26767))), new Class[0]);
        try {
            method.setAccessible(true);
            setDividerInsetStart(((Resources) method.invoke(context, objArr)).getDimensionPixelOffset(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setDividerThickness(int i2) {
        this.thickness = i2;
    }

    public void setDividerThicknessResource(Context context, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("htivrke.bmkp`hm&:echXje", (short) (C1499aX.Xd() ^ (-3893)))).getMethod(C1561oA.yd("ML\\;O^[b`RUd", (short) (C1499aX.Xd() ^ (-26100))), new Class[0]);
        try {
            method.setAccessible(true);
            setDividerThickness(((Resources) method.invoke(context, objArr)).getDimensionPixelSize(i2));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setLastItemDecorated(boolean z2) {
        this.lastItemDecorated = z2;
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i2 + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.orientation = i2;
    }

    protected boolean shouldDrawDivider(int i2, RecyclerView.Adapter<?> adapter) {
        return true;
    }
}
