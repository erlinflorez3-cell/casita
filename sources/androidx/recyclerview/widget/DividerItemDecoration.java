package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.FB;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int[] ATTRS = {R.attr.listDivider};
    public static final int HORIZONTAL = 0;
    private static final String TAG = "DividerItem";
    public static final int VERTICAL = 1;
    private final Rect mBounds = new Rect();
    private Drawable mDivider;
    private int mOrientation;

    public DividerItemDecoration(Context context, int i2) throws Throwable {
        Object[] objArr = {ATTRS};
        Method method = Class.forName(C1561oA.Qd("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (C1580rY.Xd() ^ (-17094)))).getMethod(C1593ug.zd("\u0011\u0005\u0018\u0006\u000f\u0015z\u001d#\u0017\u0011\u0011n#$#\u001b\u0015))\u001b*", (short) (ZN.Xd() ^ 23628), (short) (ZN.Xd() ^ 21559)), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            Drawable drawable = typedArray.getDrawable(0);
            this.mDivider = drawable;
            if (drawable == null) {
                C1561oA.od("f\u000b\u0017\t\u0003\u0003\u000fd\u000f~\u0006", (short) (FB.Xd() ^ 29058));
                C1561oA.Kd(".P^Udb]Y0Xlml*hfqsDjxlhjx'\u007fj}+z|\u0003/\u0004v\u00073}\u00046\f\u0001~:\u0010\u0005\u0003\f\u0005@\u0017\u0016\t\tE\r\u0017\u001bI\u001f\u0014\u0016!Ns\u001a(\u001c\u0018\u001a(\u007f,\u001e'~! -1!5+22re\u00174.+>1lA4DpF;5Iu8LMLD>RRD\u007fBNO\u0004HGST\t]P`1`PgRT_Y\u001d\u001f", (short) (OY.Xd() ^ 5713));
            }
            typedArray.recycle();
            setOrientation(i2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.mOrientation = i2;
    }

    public void setDrawable(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.mDivider = drawable;
    }

    public Drawable getDrawable() {
        return this.mDivider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getLayoutManager() != null && this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }
    }

    private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
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
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.mBounds);
            int iRound = this.mBounds.bottom + Math.round(childAt.getTranslationY());
            this.mDivider.setBounds(paddingLeft, iRound - this.mDivider.getIntrinsicHeight(), width, iRound);
            this.mDivider.draw(canvas);
        }
        canvas.restore();
    }

    private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.mBounds);
            int iRound = this.mBounds.right + Math.round(childAt.getTranslationX());
            this.mDivider.setBounds(iRound - this.mDivider.getIntrinsicWidth(), paddingTop, iRound, height);
            this.mDivider.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Drawable drawable = this.mDivider;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.mOrientation == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
