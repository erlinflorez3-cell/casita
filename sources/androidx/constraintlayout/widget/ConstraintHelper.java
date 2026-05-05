package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConstraintHelper extends View {
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds;
    protected HashMap<Integer, String> mMap;
    protected String mReferenceIds;
    protected String mReferenceTags;
    protected boolean mUseViewMeasure;
    private View[] mViews;
    protected Context myContext;

    protected void applyLayoutFeaturesInConstraintSet(ConstraintLayout container) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void resolveRtl(ConstraintWidget widget, boolean isRtl) {
    }

    public void updatePostConstraints(ConstraintLayout container) {
    }

    public void updatePostLayout(ConstraintLayout container) {
    }

    public void updatePostMeasure(ConstraintLayout container) {
    }

    public void updatePreDraw(ConstraintLayout container) {
    }

    public ConstraintHelper(Context context) throws Throwable {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(null);
    }

    public ConstraintHelper(Context context, AttributeSet attrs) throws Throwable {
        super(context, attrs);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attrs);
    }

    public ConstraintHelper(Context context, AttributeSet attrs, int defStyleAttr) throws Throwable {
        super(context, attrs, defStyleAttr);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new HashMap<>();
        this.myContext = context;
        init(attrs);
    }

    protected void init(AttributeSet attrs) throws Throwable {
        if (attrs != null) {
            Context context = getContext();
            int[] iArr = R.styleable.ConstraintLayout_Layout;
            Class<?> cls = Class.forName(C1561oA.Xd("\u0003\u0011\b\u0017\u0015\u0010\fV\r\u001a\u001a!\u0013\u001d$^t\"\")\u001b/,", (short) (FB.Xd() ^ 23944)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1607wl.Xd() ^ 9507);
            int[] iArr2 = new int["y\bz\n\u0004~vA\u0016\u0016\b\fJ^\u000f\u0010\u001b\u0013\t\u001d\u0019\u000bu\t%".length()];
            QB qb = new QB("y\bz\n\u0004~vA\u0016\u0016\b\fJ^\u000f\u0010\u001b\u0013\t\u001d\u0019\u000bu\t%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i2));
            clsArr[1] = int[].class;
            Object[] objArr = {attrs, iArr};
            Method method = cls.getMethod(Qg.kd("#\u0015&\u0012\u0019\u001d\u0001!%\u0017\u000f\rh\u001b\u001a\u0017\r\u0005\u0017\u0015\u0005\u0012", (short) (Od.Xd() ^ (-17673)), (short) (Od.Xd() ^ (-2907))), clsArr);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                        String string = typedArray.getString(index);
                        this.mReferenceIds = string;
                        setIds(string);
                    } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                        String string2 = typedArray.getString(index);
                        this.mReferenceTags = string2;
                        setReferenceTags(string2);
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws Throwable {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void addView(View view) {
        if (view != this && view.getId() != -1 && view.getParent() != null) {
            this.mReferenceIds = null;
            addRscID(view.getId());
            requestLayout();
        }
    }

    public int removeView(View view) {
        int i2;
        int id = view.getId();
        int i3 = -1;
        if (id == -1) {
            return -1;
        }
        this.mReferenceIds = null;
        int i4 = 0;
        while (true) {
            if (i4 >= this.mCount) {
                break;
            }
            if (this.mIds[i4] == id) {
                int i5 = i4;
                while (true) {
                    i2 = this.mCount;
                    if (i5 >= i2 - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i6 = i5 + 1;
                    iArr[i5] = iArr[i6];
                    i5 = i6;
                }
                this.mIds[i2 - 1] = 0;
                this.mCount = i2 - 1;
                i3 = i4;
            } else {
                i4++;
            }
        }
        requestLayout();
        return i3;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public void setReferencedIds(int[] ids) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i2 : ids) {
            addRscID(i2);
        }
    }

    private void addRscID(int id) {
        if (id == getId()) {
            return;
        }
        int i2 = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i2 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i3 = this.mCount;
        iArr2[i3] = id;
        this.mCount = i3 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mUseViewMeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).widget = (ConstraintWidget) this.mHelperWidget;
        }
    }

    private void addID(String idString) throws Throwable {
        if (idString == null || idString.length() == 0 || this.myContext == null) {
            return;
        }
        String strTrim = idString.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iFindId = findId(strTrim);
        if (iFindId != 0) {
            this.mMap.put(Integer.valueOf(iFindId), strTrim);
            addRscID(iFindId);
        } else {
            String str = "Could not find id of \"" + strTrim + "\"";
        }
    }

    private void addTag(String tagString) {
        if (tagString == null || tagString.length() == 0 || this.myContext == null) {
            return;
        }
        String strTrim = tagString.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    String str = "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID";
                } else {
                    addRscID(childAt.getId());
                }
            }
        }
    }

    private int findId(String referenceId) throws Throwable {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iFindId = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, referenceId);
            if (designInformation instanceof Integer) {
                iFindId = ((Integer) designInformation).intValue();
            }
        }
        if (iFindId == 0 && constraintLayout != null) {
            iFindId = findId(constraintLayout, referenceId);
        }
        if (iFindId == 0) {
            try {
                iFindId = R.id.class.getField(referenceId).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iFindId != 0) {
            return iFindId;
        }
        Context context = this.myContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("WcXeaZT\u001dQ\\Z_OW\\\u0015)TRWGYT", (short) (C1633zX.Xd() ^ (-7640)))).getMethod(C1593ug.zd("KJZ9M\\Y`^PSb", (short) (OY.Xd() ^ 27913), (short) (OY.Xd() ^ 25396)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            Context context2 = this.myContext;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.od("\\h]jf_Y\"Va_dT\\a\u001a.YW\\L^Y", (short) (FB.Xd() ^ 15275))).getMethod(C1561oA.Kd("\u0006\u0005\u0015q\u0004\u0007\u0010\u0007\u000e\rv\u000b\u0018\u0011", (short) (ZN.Xd() ^ 14450)), new Class[0]);
            try {
                method2.setAccessible(true);
                return resources.getIdentifier(referenceId, Wg.Zd("\u0018M", (short) (Od.Xd() ^ (-212)), (short) (Od.Xd() ^ (-19154))), (String) method2.invoke(context2, objArr2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private int findId(ConstraintLayout container, String idString) throws Throwable {
        String resourceEntryName;
        if (idString != null && container != null) {
            Context context = this.myContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("\u000fMs'\u0003@%4;hk\u000eTMY.'k\u0010k\u001ejJ", (short) (C1580rY.Xd() ^ (-14927)))).getMethod(EO.Od("2\u0003\u0014\u001a\\?\u000fu5JBv", (short) (Od.Xd() ^ (-8006))), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                if (resources == null) {
                    return 0;
                }
                int childCount = container.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = container.getChildAt(i2);
                    if (childAt.getId() != -1) {
                        try {
                            resourceEntryName = resources.getResourceEntryName(childAt.getId());
                        } catch (Resources.NotFoundException unused) {
                            resourceEntryName = null;
                        }
                        if (idString.equals(resourceEntryName)) {
                            return childAt.getId();
                        }
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return 0;
    }

    protected void setIds(String idList) throws Throwable {
        this.mReferenceIds = idList;
        if (idList == null) {
            return;
        }
        int i2 = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i2);
            if (iIndexOf == -1) {
                addID(idList.substring(i2));
                return;
            } else {
                addID(idList.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String tagList) {
        this.mReferenceTags = tagList;
        if (tagList == null) {
            return;
        }
        int i2 = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = tagList.indexOf(44, i2);
            if (iIndexOf == -1) {
                addTag(tagList.substring(i2));
                return;
            } else {
                addTag(tagList.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    protected void applyLayoutFeatures(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            View viewById = container.getViewById(this.mIds[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((ConstraintLayout) parent);
    }

    public void updatePreLayout(ConstraintLayout container) throws Throwable {
        String str;
        int iFindId;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        Helper helper = this.mHelperWidget;
        if (helper == null) {
            return;
        }
        helper.removeAllIds();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            int i3 = this.mIds[i2];
            View viewById = container.getViewById(i3);
            if (viewById == null && (iFindId = findId(container, (str = this.mMap.get(Integer.valueOf(i3))))) != 0) {
                this.mIds[i2] = iFindId;
                this.mMap.put(Integer.valueOf(iFindId), str);
                viewById = container.getViewById(iFindId);
            }
            if (viewById != null) {
                this.mHelperWidget.add(container.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(container.mLayoutWidget);
    }

    public void updatePreLayout(ConstraintWidgetContainer container, Helper helper, SparseArray<ConstraintWidget> map) {
        helper.removeAllIds();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            helper.add(map.get(this.mIds[i2]));
        }
    }

    protected View[] getViews(ConstraintLayout layout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.mViews[i2] = layout.getViewById(this.mIds[i2]);
        }
        return this.mViews;
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget child, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> mapIdToWidget) {
        if (constraint.layout.mReferenceIds != null) {
            setReferencedIds(constraint.layout.mReferenceIds);
        } else if (constraint.layout.mReferenceIdString != null) {
            if (constraint.layout.mReferenceIdString.length() > 0) {
                constraint.layout.mReferenceIds = convertReferenceString(this, constraint.layout.mReferenceIdString);
            } else {
                constraint.layout.mReferenceIds = null;
            }
        }
        if (child != null) {
            child.removeAllIds();
            if (constraint.layout.mReferenceIds != null) {
                for (int i2 = 0; i2 < constraint.layout.mReferenceIds.length; i2++) {
                    ConstraintWidget constraintWidget = mapIdToWidget.get(constraint.layout.mReferenceIds[i2]);
                    if (constraintWidget != null) {
                        child.add(constraintWidget);
                    }
                }
            }
        }
    }

    private int[] convertReferenceString(View view, String referenceIdString) throws Throwable {
        String[] strArrSplit = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        for (String str : strArrSplit) {
            int iFindId = findId(str.trim());
            if (iFindId != 0) {
                iArr[i2] = iFindId;
                i2++;
            }
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.mReferenceIds == null) {
            addRscID(key);
        }
    }

    public boolean containsId(final int id) {
        for (int i2 : this.mIds) {
            if (i2 == id) {
                return true;
            }
        }
        return false;
    }

    public int indexFromId(final int id) {
        int i2 = -1;
        for (int i3 : this.mIds) {
            i2++;
            if (i3 == id) {
                return i2;
            }
        }
        return i2;
    }
}
