package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class CircularFlow extends VirtualLayout {
    private static float DEFAULT_ANGLE = 0.0f;
    private static int DEFAULT_RADIUS = 0;
    private static final String TAG = "CircularFlow";
    private float[] mAngles;
    ConstraintLayout mContainer;
    private int mCountAngle;
    private int mCountRadius;
    private int[] mRadius;
    private String mReferenceAngles;
    private Float mReferenceDefaultAngle;
    private Integer mReferenceDefaultRadius;
    private String mReferenceRadius;
    int mViewCenter;

    public CircularFlow(Context context) {
        super(context);
    }

    public CircularFlow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularFlow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.mRadius, this.mCountRadius);
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.mAngles, this.mCountAngle);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void init(AttributeSet attrs) throws Throwable {
        super.init(attrs);
        if (attrs != null) {
            Context context = getContext();
            Object[] objArr = {attrs, R.styleable.ConstraintLayout_Layout};
            Method method = Class.forName(C1561oA.Kd("]kbqojf1gtt{mw~9O||\u0004u\n\u0007", (short) (Od.Xd() ^ (-10707)))).getMethod(C1561oA.Xd("*\u001e1\u001f(.\u00146<0**\b<=<4.BB4C", (short) (C1499aX.Xd() ^ (-1384))), Class.forName(Wg.Zd("&w KI)\u0002No\\\u001a3\":}+J\u0007]U^+q\u001a6", (short) (C1499aX.Xd() ^ (-21959)), (short) (C1499aX.Xd() ^ (-28217)))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                        this.mViewCenter = typedArray.getResourceId(index, 0);
                    } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                        String string = typedArray.getString(index);
                        this.mReferenceAngles = string;
                        setAngles(string);
                    } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                        String string2 = typedArray.getString(index);
                        this.mReferenceRadius = string2;
                        setRadius(string2);
                    } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                        Float fValueOf = Float.valueOf(typedArray.getFloat(index, DEFAULT_ANGLE));
                        this.mReferenceDefaultAngle = fValueOf;
                        setDefaultAngle(fValueOf.floatValue());
                    } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                        Integer numValueOf = Integer.valueOf(typedArray.getDimensionPixelSize(index, DEFAULT_RADIUS));
                        this.mReferenceDefaultRadius = numValueOf;
                        setDefaultRadius(numValueOf.intValue());
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws Throwable {
        super.onAttachedToWindow();
        String str = this.mReferenceAngles;
        if (str != null) {
            this.mAngles = new float[1];
            setAngles(str);
        }
        String str2 = this.mReferenceRadius;
        if (str2 != null) {
            this.mRadius = new int[1];
            setRadius(str2);
        }
        Float f2 = this.mReferenceDefaultAngle;
        if (f2 != null) {
            setDefaultAngle(f2.floatValue());
        }
        Integer num = this.mReferenceDefaultRadius;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        anchorReferences();
    }

    private void anchorReferences() {
        this.mContainer = (ConstraintLayout) getParent();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            View viewById = this.mContainer.getViewById(this.mIds[i2]);
            if (viewById != null) {
                int i3 = DEFAULT_RADIUS;
                float f2 = DEFAULT_ANGLE;
                int[] iArr = this.mRadius;
                if (iArr != null && i2 < iArr.length) {
                    i3 = iArr[i2];
                } else {
                    Integer num = this.mReferenceDefaultRadius;
                    if (num != null && num.intValue() != -1) {
                        this.mCountRadius++;
                        if (this.mRadius == null) {
                            this.mRadius = new int[1];
                        }
                        int[] radius = getRadius();
                        this.mRadius = radius;
                        radius[this.mCountRadius - 1] = i3;
                    } else {
                        String str = "Added radius to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId()));
                    }
                }
                float[] fArr = this.mAngles;
                if (fArr != null && i2 < fArr.length) {
                    f2 = fArr[i2];
                } else {
                    Float f3 = this.mReferenceDefaultAngle;
                    if (f3 != null && f3.floatValue() != -1.0f) {
                        this.mCountAngle++;
                        if (this.mAngles == null) {
                            this.mAngles = new float[1];
                        }
                        float[] angles = getAngles();
                        this.mAngles = angles;
                        angles[this.mCountAngle - 1] = f2;
                    } else {
                        String str2 = "Added angle to view with id: " + this.mMap.get(Integer.valueOf(viewById.getId()));
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f2;
                layoutParams.circleConstraint = this.mViewCenter;
                layoutParams.circleRadius = i3;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    public void addViewToCircularFlow(View view, int radius, float angle) throws Throwable {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.mCountAngle++;
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[this.mCountAngle - 1] = angle;
        this.mCountRadius++;
        int[] radius2 = getRadius();
        this.mRadius = radius2;
        int i2 = this.mCountRadius - 1;
        float f2 = radius;
        Context context = this.myContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (Od.Xd() ^ (-22525)), (short) (Od.Xd() ^ (-11810)))).getMethod(C1561oA.od("NKY6HUPUQABO", (short) (OY.Xd() ^ 29245)), new Class[0]);
        try {
            method.setAccessible(true);
            radius2[i2] = (int) (f2 * ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density);
            anchorReferences();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void updateRadius(View view, int radius) throws Throwable {
        if (!isUpdatable(view)) {
            String str = Wg.vd("{&T+\u0010!P\u001e\u001a\u001eL\u001c\u0016\u0019\u001c\u0011\u0005\u000e\nC\u0013\r@\u0015\u000b}}\u0010{5\u000bx7;JGnB@oA32Cf=2<+a.(x]", (short) (C1580rY.Xd() ^ (-24829))) + view.getId();
            Qg.kd("6[cSdZN^1VX_", (short) (C1633zX.Xd() ^ (-7697)), (short) (C1633zX.Xd() ^ (-15599)));
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.mRadius.length) {
            return;
        }
        int[] radius2 = getRadius();
        this.mRadius = radius2;
        float f2 = radius;
        Context context = this.myContext;
        Class<?> cls = Class.forName(hg.Vd("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fWk\u0017\u0015\u001a\n\u001c\u0017", (short) (OY.Xd() ^ 4852), (short) (OY.Xd() ^ 17714)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-12461));
        int[] iArr = new int["%\"0\r\u001f,',(\u0018\u0019&".length()];
        QB qb = new QB("%\"0\r\u001f,',(\u0018\u0019&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            radius2[iIndexFromId] = (int) (f2 * ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density);
            anchorReferences();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void updateAngle(View view, float angle) {
        if (!isUpdatable(view)) {
            String str = "It was not possible to update angle to view with id: " + view.getId();
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.mAngles.length) {
            return;
        }
        float[] angles = getAngles();
        this.mAngles = angles;
        angles[iIndexFromId] = angle;
        anchorReferences();
    }

    public void updateReference(View view, int radius, float angle) throws Throwable {
        if (!isUpdatable(view)) {
            short sXd = (short) (C1633zX.Xd() ^ (-12504));
            int[] iArr = new int["W\u0002,\u0003s\u00050}\u0006\n4\u0004\n\r\f\u0001\u0001\n\u0002;\u0017\u0011@\u0015\u0017\n\u0006\u0018\u0010I\u001b\tRVa^\u0012R^S\u0016VbZf^\u0018km\u001drdgx voyl#smB'".length()];
            QB qb = new QB("W\u0002,\u0003s\u00050}\u0006\n4\u0004\n\r\f\u0001\u0001\n\u0002;\u0017\u0011@\u0015\u0017\n\u0006\u0018\u0010I\u001b\tRVa^\u0012R^S\u0016VbZf^\u0018km\u001drdgx voyl#smB'");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            String str = new String(iArr, 0, i2) + view.getId();
            short sXd2 = (short) (OY.Xd() ^ 12367);
            int[] iArr2 = new int["\u000f6@2E=3E\u001aAEN".length()];
            QB qb2 = new QB("\u000f6@2E=3E\u001aAEN");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            new String(iArr2, 0, i3);
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (getAngles().length > iIndexFromId) {
            float[] angles = getAngles();
            this.mAngles = angles;
            angles[iIndexFromId] = angle;
        }
        if (getRadius().length > iIndexFromId) {
            int[] radius2 = getRadius();
            this.mRadius = radius2;
            float f2 = radius;
            Context context = this.myContext;
            Class<?> cls = Class.forName(Xg.qd("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f", (short) (ZN.Xd() ^ 18091), (short) (ZN.Xd() ^ 25082)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (FB.Xd() ^ 24181);
            short sXd4 = (short) (FB.Xd() ^ 15537);
            int[] iArr3 = new int["\u0011pe-8gI;.\u0001*\"".length()];
            QB qb3 = new QB("\u0011pe-8gI;.\u0001*\"");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd4) ^ sXd3));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                radius2[iIndexFromId] = (int) (f2 * ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        anchorReferences();
    }

    public void setDefaultAngle(float angle) {
        DEFAULT_ANGLE = angle;
    }

    public void setDefaultRadius(int radius) {
        DEFAULT_RADIUS = radius;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int iRemoveView = super.removeView(view);
        if (iRemoveView == -1) {
            return iRemoveView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.mContainer);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.mContainer);
        float[] fArr = this.mAngles;
        if (iRemoveView < fArr.length) {
            this.mAngles = removeAngle(fArr, iRemoveView);
            this.mCountAngle--;
        }
        int[] iArr = this.mRadius;
        if (iRemoveView < iArr.length) {
            this.mRadius = removeRadius(iArr, iRemoveView);
            this.mCountRadius--;
        }
        anchorReferences();
        return iRemoveView;
    }

    private float[] removeAngle(float[] angles, int index) {
        return (angles == null || index < 0 || index >= this.mCountAngle) ? angles : removeElementFromArray(angles, index);
    }

    private int[] removeRadius(int[] radius, int index) {
        return (radius == null || index < 0 || index >= this.mCountRadius) ? radius : removeElementFromArray(radius, index);
    }

    private void setAngles(String idList) {
        if (idList == null) {
            return;
        }
        int i2 = 0;
        this.mCountAngle = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i2);
            if (iIndexOf == -1) {
                addAngle(idList.substring(i2).trim());
                return;
            } else {
                addAngle(idList.substring(i2, iIndexOf).trim());
                i2 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String idList) throws Throwable {
        if (idList == null) {
            return;
        }
        int i2 = 0;
        this.mCountRadius = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i2);
            if (iIndexOf == -1) {
                addRadius(idList.substring(i2).trim());
                return;
            } else {
                addRadius(idList.substring(i2, iIndexOf).trim());
                i2 = iIndexOf + 1;
            }
        }
    }

    private void addAngle(String angleString) {
        float[] fArr;
        if (angleString == null || angleString.length() == 0 || this.myContext == null || (fArr = this.mAngles) == null) {
            return;
        }
        if (this.mCountAngle + 1 > fArr.length) {
            this.mAngles = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.mAngles[this.mCountAngle] = Integer.parseInt(angleString);
        this.mCountAngle++;
    }

    private void addRadius(String radiusString) throws Throwable {
        int[] iArr;
        if (radiusString == null || radiusString.length() == 0 || this.myContext == null || (iArr = this.mRadius) == null) {
            return;
        }
        if (this.mCountRadius + 1 > iArr.length) {
            this.mRadius = Arrays.copyOf(iArr, iArr.length + 1);
        }
        int[] iArr2 = this.mRadius;
        int i2 = this.mCountRadius;
        float f2 = Integer.parseInt(radiusString);
        Context context = this.myContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u007f[U\n\u00197\u0014P8f<(hcy\u0019s\nP\u001eR1\u0013", (short) (FB.Xd() ^ 30088))).getMethod(C1561oA.Qd("\u0015\u0012 |\u000f\u001c\u0017\u001c\u0018\b\t\u0016", (short) (C1580rY.Xd() ^ (-16859))), new Class[0]);
        try {
            method.setAccessible(true);
            iArr2[i2] = (int) (f2 * ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density);
            this.mCountRadius++;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int[] removeElementFromArray(int[] array, int index) {
        int[] iArr = new int[array.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < array.length; i3++) {
            if (i3 != index) {
                iArr[i2] = array[i3];
                i2++;
            }
        }
        return iArr;
    }

    public static float[] removeElementFromArray(float[] array, int index) {
        float[] fArr = new float[array.length - 1];
        int i2 = 0;
        for (int i3 = 0; i3 < array.length; i3++) {
            if (i3 != index) {
                fArr[i2] = array[i3];
                i2++;
            }
        }
        return fArr;
    }

    public boolean isUpdatable(View view) {
        return containsId(view.getId()) && indexFromId(view.getId()) != -1;
    }
}
