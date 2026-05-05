package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogTitle(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) throws Throwable {
        int lineCount;
        super.onMeasure(i2, i3);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        Context context = getContext();
        int[] iArr = R.styleable.TextAppearance;
        short sXd = (short) (C1580rY.Xd() ^ (-31253));
        short sXd2 = (short) (C1580rY.Xd() ^ (-4592));
        int[] iArr2 = new int["v\u0003w\u0005\u0001ys<p{y~nv{4Hsqvfxs".length()];
        QB qb = new QB("v\u0003w\u0005\u0001ys<p{y~nv{4Hsqvfxs");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i4));
        Class<?>[] clsArr = {Class.forName(hg.Vd("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u001d\u001b\u000f\u0011Qc\u0016\u0015\u0012\b\u007f\u0012\u0010\u007fl}\f", (short) (ZN.Xd() ^ 18326), (short) (ZN.Xd() ^ 32388))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {null, iArr, Integer.valueOf(android.R.attr.textAppearanceMedium), Integer.valueOf(android.R.style.TextAppearance.Medium)};
        Method method = cls.getMethod(C1561oA.ud("\u0003t\u0006qx|`\u0001\u0005vnlHzyvldvtdq", (short) (ZN.Xd() ^ 12605)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            typedArray.recycle();
            super.onMeasure(i2, i3);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
