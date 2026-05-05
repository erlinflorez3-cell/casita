package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    private static final String TAG = "Flow";
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.Flow mFlow;

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Flow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget widget, boolean isRtl) {
        this.mFlow.applyRtl(isRtl);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        onMeasure(this.mFlow, widthMeasureSpec, heightMeasureSpec);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout layout, int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (layout != null) {
            layout.measure(mode, size, mode2, size2);
            setMeasuredDimension(layout.getMeasuredWidth(), layout.getMeasuredHeight());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget child, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> mapIdToWidget) {
        super.loadParameters(constraint, child, layoutParams, mapIdToWidget);
        if (child instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) child;
            if (layoutParams.orientation != -1) {
                flow.setOrientation(layoutParams.orientation);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attrs) throws Throwable {
        super.init(attrs);
        this.mFlow = new androidx.constraintlayout.core.widgets.Flow();
        if (attrs != null) {
            Context context = getContext();
            int[] iArr = R.styleable.ConstraintLayout_Layout;
            Class<?> cls = Class.forName(ZO.xd("UJ0\tr]4\u001ejlJ\u0003sr9?\u00024YE\u0003\u0013d", (short) (OY.Xd() ^ 8395), (short) (OY.Xd() ^ 30779)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (OY.Xd() ^ 13577);
            short sXd2 = (short) (OY.Xd() ^ 25609);
            int[] iArr2 = new int["&\"M\u0003HX%0\u0006=/W\foo%;S\fr#\n{\u0012\u000e".length()];
            QB qb = new QB("&\"M\u0003HX%0\u0006=/W\foo%;S\fr#\n{\u0012\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i2));
            clsArr[1] = int[].class;
            Object[] objArr = {attrs, iArr};
            Method method = cls.getMethod(Ig.wd("\u0006L*\u0006\fKB\u001aG1\"h\u0016UO.{d>S|U", (short) (C1580rY.Xd() ^ (-11324))), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                        this.mFlow.setOrientation(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                        this.mFlow.setPadding(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                        this.mFlow.setPaddingStart(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                        this.mFlow.setPaddingEnd(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                        this.mFlow.setPaddingLeft(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                        this.mFlow.setPaddingTop(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                        this.mFlow.setPaddingRight(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                        this.mFlow.setPaddingBottom(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                        this.mFlow.setWrapMode(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                        this.mFlow.setHorizontalStyle(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                        this.mFlow.setVerticalStyle(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                        this.mFlow.setFirstHorizontalStyle(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                        this.mFlow.setLastHorizontalStyle(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                        this.mFlow.setFirstVerticalStyle(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                        this.mFlow.setLastVerticalStyle(typedArray.getInt(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                        this.mFlow.setHorizontalBias(typedArray.getFloat(index, 0.5f));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                        this.mFlow.setFirstHorizontalBias(typedArray.getFloat(index, 0.5f));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                        this.mFlow.setLastHorizontalBias(typedArray.getFloat(index, 0.5f));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                        this.mFlow.setFirstVerticalBias(typedArray.getFloat(index, 0.5f));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                        this.mFlow.setLastVerticalBias(typedArray.getFloat(index, 0.5f));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                        this.mFlow.setVerticalBias(typedArray.getFloat(index, 0.5f));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                        this.mFlow.setHorizontalAlign(typedArray.getInt(index, 2));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                        this.mFlow.setVerticalAlign(typedArray.getInt(index, 2));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                        this.mFlow.setHorizontalGap(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                        this.mFlow.setVerticalGap(typedArray.getDimensionPixelSize(index, 0));
                    } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                        this.mFlow.setMaxElementsWrap(typedArray.getInt(index, -1));
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.mHelperWidget = this.mFlow;
        validateParams();
    }

    public void setOrientation(int orientation) {
        this.mFlow.setOrientation(orientation);
        requestLayout();
    }

    public void setPadding(int padding) {
        this.mFlow.setPadding(padding);
        requestLayout();
    }

    public void setPaddingLeft(int paddingLeft) {
        this.mFlow.setPaddingLeft(paddingLeft);
        requestLayout();
    }

    public void setPaddingTop(int paddingTop) {
        this.mFlow.setPaddingTop(paddingTop);
        requestLayout();
    }

    public void setPaddingRight(int paddingRight) {
        this.mFlow.setPaddingRight(paddingRight);
        requestLayout();
    }

    public void setPaddingBottom(int paddingBottom) {
        this.mFlow.setPaddingBottom(paddingBottom);
        requestLayout();
    }

    public void setLastHorizontalStyle(int style) {
        this.mFlow.setLastHorizontalStyle(style);
        requestLayout();
    }

    public void setLastVerticalStyle(int style) {
        this.mFlow.setLastVerticalStyle(style);
        requestLayout();
    }

    public void setLastHorizontalBias(float bias) {
        this.mFlow.setLastHorizontalBias(bias);
        requestLayout();
    }

    public void setLastVerticalBias(float bias) {
        this.mFlow.setLastVerticalBias(bias);
        requestLayout();
    }

    public void setWrapMode(int mode) {
        this.mFlow.setWrapMode(mode);
        requestLayout();
    }

    public void setHorizontalStyle(int style) {
        this.mFlow.setHorizontalStyle(style);
        requestLayout();
    }

    public void setVerticalStyle(int style) {
        this.mFlow.setVerticalStyle(style);
        requestLayout();
    }

    public void setHorizontalBias(float bias) {
        this.mFlow.setHorizontalBias(bias);
        requestLayout();
    }

    public void setVerticalBias(float bias) {
        this.mFlow.setVerticalBias(bias);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int style) {
        this.mFlow.setFirstHorizontalStyle(style);
        requestLayout();
    }

    public void setFirstVerticalStyle(int style) {
        this.mFlow.setFirstVerticalStyle(style);
        requestLayout();
    }

    public void setFirstHorizontalBias(float bias) {
        this.mFlow.setFirstHorizontalBias(bias);
        requestLayout();
    }

    public void setFirstVerticalBias(float bias) {
        this.mFlow.setFirstVerticalBias(bias);
        requestLayout();
    }

    public void setHorizontalAlign(int align) {
        this.mFlow.setHorizontalAlign(align);
        requestLayout();
    }

    public void setVerticalAlign(int align) {
        this.mFlow.setVerticalAlign(align);
        requestLayout();
    }

    public void setHorizontalGap(int gap) {
        this.mFlow.setHorizontalGap(gap);
        requestLayout();
    }

    public void setVerticalGap(int gap) {
        this.mFlow.setVerticalGap(gap);
        requestLayout();
    }

    public void setMaxElementsWrap(int max) {
        this.mFlow.setMaxElementsWrap(max);
        requestLayout();
    }
}
