package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class MockView extends View {
    private int mDiagonalsColor;
    private boolean mDrawDiagonals;
    private boolean mDrawLabel;
    private int mMargin;
    private Paint mPaintDiagonals;
    private Paint mPaintText;
    private Paint mPaintTextBackground;
    protected String mText;
    private int mTextBackgroundColor;
    private Rect mTextBounds;
    private int mTextColor;

    public MockView(Context context) throws Throwable {
        super(context);
        this.mPaintDiagonals = new Paint();
        this.mPaintText = new Paint();
        this.mPaintTextBackground = new Paint();
        this.mDrawDiagonals = true;
        this.mDrawLabel = true;
        this.mText = null;
        this.mTextBounds = new Rect();
        this.mDiagonalsColor = Color.argb(255, 0, 0, 0);
        this.mTextColor = Color.argb(255, 200, 200, 200);
        this.mTextBackgroundColor = Color.argb(255, 50, 50, 50);
        this.mMargin = 4;
        init(context, null);
    }

    public MockView(Context context, AttributeSet attrs) throws Throwable {
        super(context, attrs);
        this.mPaintDiagonals = new Paint();
        this.mPaintText = new Paint();
        this.mPaintTextBackground = new Paint();
        this.mDrawDiagonals = true;
        this.mDrawLabel = true;
        this.mText = null;
        this.mTextBounds = new Rect();
        this.mDiagonalsColor = Color.argb(255, 0, 0, 0);
        this.mTextColor = Color.argb(255, 200, 200, 200);
        this.mTextBackgroundColor = Color.argb(255, 50, 50, 50);
        this.mMargin = 4;
        init(context, attrs);
    }

    public MockView(Context context, AttributeSet attrs, int defStyleAttr) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.mPaintDiagonals = new Paint();
        this.mPaintText = new Paint();
        this.mPaintTextBackground = new Paint();
        this.mDrawDiagonals = true;
        this.mDrawLabel = true;
        this.mText = null;
        this.mTextBounds = new Rect();
        this.mDiagonalsColor = Color.argb(255, 0, 0, 0);
        this.mTextColor = Color.argb(255, 200, 200, 200);
        this.mTextBackgroundColor = Color.argb(255, 50, 50, 50);
        this.mMargin = 4;
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) throws Throwable {
        if (attrs != null) {
            int[] iArr = R.styleable.MockView;
            Class<?> cls = Class.forName(C1561oA.yd("\u0012\u001e\u0017$\u001c\u0015\u0013[\f\u0017\u0019\u001e\n\u0012\u001bS\u0004/16\"43", (short) (C1607wl.Xd() ^ 8855)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Yd("\\japnie0xxnr5I}~}uo\u0004\u0004udw\b", (short) (Od.Xd() ^ (-26385)))), int[].class};
            Object[] objArr = {attrs, iArr};
            short sXd = (short) (C1499aX.Xd() ^ (-869));
            short sXd2 = (short) (C1499aX.Xd() ^ (-22972));
            int[] iArr2 = new int["\u000b~\u0012\u007f\t\u000ft\u0017\u001d\u0011\u000b\u000bh\u001d\u001e\u001d\u0015\u000f##\u0015$".length()];
            QB qb = new QB("\u000b~\u0012\u007f\t\u000ft\u0017\u001d\u0011\u000b\u000bh\u001d\u001e\u001d\u0015\u000f##\u0015$");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.MockView_mock_label) {
                        this.mText = typedArray.getString(index);
                    } else if (index == R.styleable.MockView_mock_showDiagonals) {
                        this.mDrawDiagonals = typedArray.getBoolean(index, this.mDrawDiagonals);
                    } else if (index == R.styleable.MockView_mock_diagonalsColor) {
                        this.mDiagonalsColor = typedArray.getColor(index, this.mDiagonalsColor);
                    } else if (index == R.styleable.MockView_mock_labelBackgroundColor) {
                        this.mTextBackgroundColor = typedArray.getColor(index, this.mTextBackgroundColor);
                    } else if (index == R.styleable.MockView_mock_labelColor) {
                        this.mTextColor = typedArray.getColor(index, this.mTextColor);
                    } else if (index == R.styleable.MockView_mock_showLabel) {
                        this.mDrawLabel = typedArray.getBoolean(index, this.mDrawLabel);
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (this.mText == null) {
            try {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Jg.Wd("!~F\"rB\u000f(/qd\u0018z;3\u001a#\u007fT.lQ%", (short) (OY.Xd() ^ 12708), (short) (OY.Xd() ^ 23696))).getMethod(ZO.xd("Tog\t\u0012XRd\u001c-@\u0018", (short) (FB.Xd() ^ 7992), (short) (FB.Xd() ^ 16376)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    this.mText = ((Resources) method2.invoke(context, objArr2)).getResourceEntryName(getId());
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception unused) {
            }
        }
        this.mPaintDiagonals.setColor(this.mDiagonalsColor);
        this.mPaintDiagonals.setAntiAlias(true);
        this.mPaintText.setColor(this.mTextColor);
        this.mPaintText.setAntiAlias(true);
        this.mPaintTextBackground.setColor(this.mTextBackgroundColor);
        this.mMargin = Math.round(this.mMargin * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.mDrawDiagonals) {
            width--;
            height--;
            float f2 = width;
            float f3 = height;
            canvas.drawLine(0.0f, 0.0f, f2, f3, this.mPaintDiagonals);
            canvas.drawLine(0.0f, f3, f2, 0.0f, this.mPaintDiagonals);
            canvas.drawLine(0.0f, 0.0f, f2, 0.0f, this.mPaintDiagonals);
            canvas.drawLine(f2, 0.0f, f2, f3, this.mPaintDiagonals);
            canvas.drawLine(f2, f3, 0.0f, f3, this.mPaintDiagonals);
            canvas.drawLine(0.0f, f3, 0.0f, 0.0f, this.mPaintDiagonals);
        }
        String str = this.mText;
        if (str == null || !this.mDrawLabel) {
            return;
        }
        this.mPaintText.getTextBounds(str, 0, str.length(), this.mTextBounds);
        float fWidth = (width - this.mTextBounds.width()) / 2.0f;
        float fHeight = ((height - this.mTextBounds.height()) / 2.0f) + this.mTextBounds.height();
        this.mTextBounds.offset((int) fWidth, (int) fHeight);
        Rect rect = this.mTextBounds;
        rect.set(rect.left - this.mMargin, this.mTextBounds.top - this.mMargin, this.mTextBounds.right + this.mMargin, this.mTextBounds.bottom + this.mMargin);
        canvas.drawRect(this.mTextBounds, this.mPaintTextBackground);
        canvas.drawText(this.mText, fWidth, fHeight, this.mPaintText);
    }
}
