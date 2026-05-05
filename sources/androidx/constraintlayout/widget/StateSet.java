package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    ConstraintSet mDefaultConstraintSet;
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    public StateSet(Context context, XmlPullParser parser) throws Throwable {
        load(context, parser);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void load(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.StateSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public boolean needsToChange(int id, float width, float height) {
        int i2 = this.mCurrentStateId;
        if (i2 != id) {
            return true;
        }
        State stateValueAt = id == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i2);
        return (this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(width, height);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int id, int width, int height) {
        return updateConstraints(-1, id, width, height);
    }

    public int convertToConstraintSet(int currentConstrainSettId, int stateId, float width, float height) {
        State state = this.mStateList.get(stateId);
        if (state == null) {
            return stateId;
        }
        if (width == -1.0f || height == -1.0f) {
            if (state.mConstraintID == currentConstrainSettId) {
                return currentConstrainSettId;
            }
            Iterator<Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                if (currentConstrainSettId == it.next().mConstraintID) {
                    return currentConstrainSettId;
                }
            }
            return state.mConstraintID;
        }
        Variant variant = null;
        for (Variant variant2 : state.mVariants) {
            if (variant2.match(width, height)) {
                if (currentConstrainSettId == variant2.mConstraintID) {
                    return currentConstrainSettId;
                }
                variant = variant2;
            }
        }
        if (variant != null) {
            return variant.mConstraintID;
        }
        return state.mConstraintID;
    }

    public int updateConstraints(int currentId, int id, float width, float height) {
        int iFindMatch;
        if (currentId == id) {
            State stateValueAt = id == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(this.mCurrentStateId);
            if (stateValueAt == null) {
                return -1;
            }
            return ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(currentId).match(width, height)) && currentId != (iFindMatch = stateValueAt.findMatch(width, height))) ? iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID : currentId;
        }
        State state = this.mStateList.get(id);
        if (state == null) {
            return -1;
        }
        int iFindMatch2 = state.findMatch(width, height);
        return iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
    }

    static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser parser) throws Throwable {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            Object[] objArr = {Xml.asAttributeSet(parser), R.styleable.State};
            Method method = Class.forName(Jg.Wd("c1i8{4S_Y$i0C\rYQ+\u001a]\"Y-k", (short) (C1580rY.Xd() ^ (-21488)), (short) (C1580rY.Xd() ^ (-12946)))).getMethod(C1626yg.Ud("\u0013{\u0013\\S>'mY(L/\b\u007f\u0007'\u0010?,X9m", (short) (Od.Xd() ^ (-10176)), (short) (Od.Xd() ^ (-4841))), Class.forName(ZO.xd("z*@`W/\u001eGvJ\u000fBa\u0014/IP\u001f\u0011\u001fnt!?!", (short) (OY.Xd() ^ 2938), (short) (OY.Xd() ^ 20232))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.State_android_id) {
                        this.mId = typedArray.getResourceId(index, this.mId);
                    } else if (index == R.styleable.State_constraints) {
                        this.mConstraintID = typedArray.getResourceId(index, this.mConstraintID);
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(Ig.wd("]\u001e\u0004p4Q.]Hyt\u001f=FZ7s,`l#c\b", (short) (C1499aX.Xd() ^ (-18217)))).getMethod(EO.Od("O\u001e~9;\u0006\"H\u007faaQ", (short) (FB.Xd() ^ 32346)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            String resourceTypeName = ((Resources) method2.invoke(context, objArr2)).getResourceTypeName(this.mConstraintID);
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(C1561oA.Qd("4@5B>71y.97<,49q\u00061/4$61", (short) (C1633zX.Xd() ^ (-9275)))).getMethod(C1593ug.zd("54D#7FCJH:=L", (short) (OY.Xd() ^ 29143), (short) (OY.Xd() ^ 4366)), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                ((Resources) method3.invoke(context, objArr3)).getResourceName(this.mConstraintID);
                                if (C1561oA.od("k_vkpn", (short) (C1580rY.Xd() ^ (-26439))).equals(resourceTypeName)) {
                                    this.mIsLayout = true;
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } else {
                        continue;
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        void add(Variant size) {
            this.mVariants.add(size);
        }

        public int findMatch(float width, float height) {
            for (int i2 = 0; i2 < this.mVariants.size(); i2++) {
                if (this.mVariants.get(i2).match(width, height)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser parser) throws Throwable {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(parser);
            int[] iArr = R.styleable.Variant;
            short sXd = (short) (C1499aX.Xd() ^ (-7126));
            int[] iArr2 = new int["drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e".length()];
            QB qb = new QB("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr2[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            Object[] objArr = {attributeSetAsAttributeSet, iArr};
            Method method = Class.forName(new String(iArr2, 0, i2)).getMethod(C1561oA.Xd("\u0001t\bu~\u0005j\r\u0013\u0007\u0001\u0001^\u0013\u0014\u0013\u000b\u0005\u0019\u0019\u000b\u001a", (short) (Od.Xd() ^ (-17952))), Class.forName(Wg.Zd("8=*_FwiZ\b6*\u001d\u007f\u0002td\be\u0016#\t!\u0007FD", (short) (FB.Xd() ^ 32183), (short) (FB.Xd() ^ 30737))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = typedArray.getIndex(i3);
                    if (index == R.styleable.Variant_constraints) {
                        this.mConstraintID = typedArray.getResourceId(index, this.mConstraintID);
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(Wg.vd("DPIVVOM\u0016>IKPDLU\u000e6ach\\nm", (short) (C1633zX.Xd() ^ (-14019)))).getMethod(Qg.kd("khvSermrn^_l", (short) (OY.Xd() ^ 453), (short) (OY.Xd() ^ 27664)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            String resourceTypeName = ((Resources) method2.invoke(context, objArr2)).getResourceTypeName(this.mConstraintID);
                            short sXd2 = (short) (C1580rY.Xd() ^ (-27355));
                            short sXd3 = (short) (C1580rY.Xd() ^ (-7547));
                            int[] iArr3 = new int["'3(51*$l!,*/\u001f',dx$\"'\u0017)$".length()];
                            QB qb2 = new QB("'3(51*$l!,*/\u001f',dx$\"'\u0017)$");
                            int i4 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr3[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2) + sXd3);
                                i4++;
                            }
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.ud("B?M*<IDIE56C", (short) (C1499aX.Xd() ^ (-17232))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                ((Resources) method3.invoke(context, objArr3)).getResourceName(this.mConstraintID);
                                if (C1561oA.yd("\f\u0002\u001b\u0012\u0019\u0019", (short) (C1580rY.Xd() ^ (-10023))).equals(resourceTypeName)) {
                                    this.mIsLayout = true;
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } else if (index == R.styleable.Variant_region_heightLessThan) {
                        this.mMaxHeight = typedArray.getDimension(index, this.mMaxHeight);
                    } else if (index == R.styleable.Variant_region_heightMoreThan) {
                        this.mMinHeight = typedArray.getDimension(index, this.mMinHeight);
                    } else if (index == R.styleable.Variant_region_widthLessThan) {
                        this.mMaxWidth = typedArray.getDimension(index, this.mMaxWidth);
                    } else if (index == R.styleable.Variant_region_widthMoreThan) {
                        this.mMinWidth = typedArray.getDimension(index, this.mMinWidth);
                    } else {
                        C1561oA.Yd("5bbhjiYbhoH^wnuuUweykz", (short) (C1607wl.Xd() ^ 9657));
                        Xg.qd("\u001b5379B:lB07", (short) (C1607wl.Xd() ^ 31851), (short) (C1607wl.Xd() ^ 2752));
                    }
                }
                typedArray.recycle();
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        boolean match(float widthDp, float heightDp) {
            if (!Float.isNaN(this.mMinWidth) && widthDp < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && heightDp < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || widthDp <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || heightDp <= this.mMaxHeight;
            }
            return false;
        }
    }
}
