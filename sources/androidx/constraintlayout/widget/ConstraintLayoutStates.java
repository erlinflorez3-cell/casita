package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    ConstraintLayoutStates(Context context, ConstraintLayout layout, int resourceID) throws Throwable {
        this.mConstraintLayout = layout;
        load(context, resourceID);
    }

    public boolean needsToChange(int id, float width, float height) {
        int i2 = this.mCurrentStateId;
        if (i2 != id) {
            return true;
        }
        State stateValueAt = id == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i2);
        return (this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(width, height);
    }

    public void updateConstraints(int id, float width, float height) {
        ConstraintSet constraintSet;
        int i2;
        State stateValueAt;
        int iFindMatch;
        ConstraintSet constraintSet2;
        int i3 = this.mCurrentStateId;
        if (i3 == id) {
            if (id == -1) {
                stateValueAt = this.mStateList.valueAt(0);
            } else {
                stateValueAt = this.mStateList.get(i3);
            }
            if ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != (iFindMatch = stateValueAt.findMatch(width, height))) {
                if (iFindMatch == -1) {
                    constraintSet2 = this.mDefaultConstraintSet;
                } else {
                    constraintSet2 = stateValueAt.mVariants.get(iFindMatch).mConstraintSet;
                }
                int i4 = iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID;
                if (constraintSet2 == null) {
                    return;
                }
                this.mCurrentConstraintNumber = iFindMatch;
                ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i4);
                }
                constraintSet2.applyTo(this.mConstraintLayout);
                ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i4);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = id;
        State state = this.mStateList.get(id);
        int iFindMatch2 = state.findMatch(width, height);
        if (iFindMatch2 == -1) {
            constraintSet = state.mConstraintSet;
        } else {
            constraintSet = state.mVariants.get(iFindMatch2).mConstraintSet;
        }
        if (iFindMatch2 == -1) {
            i2 = state.mConstraintID;
        } else {
            i2 = state.mVariants.get(iFindMatch2).mConstraintID;
        }
        if (constraintSet == null) {
            String str = "NO Constraint set found ! id=" + id + ", dim =" + width + ", " + height;
            return;
        }
        this.mCurrentConstraintNumber = iFindMatch2;
        ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(id, i2);
        }
        constraintSet.applyTo(this.mConstraintLayout);
        ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(id, i2);
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    static class State {
        int mConstraintID;
        ConstraintSet mConstraintSet;
        int mId;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser parser) throws Throwable {
            this.mConstraintID = -1;
            Object[] objArr = {Xml.asAttributeSet(parser), R.styleable.State};
            Method method = Class.forName(Wg.Zd(")y2\"q.+7?-nWyE.)\u0011 \u0001i-\u0002`", (short) (ZN.Xd() ^ 2360), (short) (ZN.Xd() ^ 90))).getMethod(Wg.vd("\u0002s\ttw{c\u0004\u0014\u0006\u0002\u007fW\n\r\n\f\u0004\u001a\u0018\u0004\u0011", (short) (FB.Xd() ^ 22089)), Class.forName(C1561oA.Xd("*8/><73}FF<@\u0003\u0017KLKC=QQC2EU", (short) (C1499aX.Xd() ^ (-14133)))), int[].class);
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
                        Method method2 = Class.forName(Qg.kd("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (ZN.Xd() ^ 21192), (short) (ZN.Xd() ^ 11420))).getMethod(hg.Vd("mjxUgtotp`an", (short) (Od.Xd() ^ (-15870)), (short) (Od.Xd() ^ (-31078))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            String resourceTypeName = ((Resources) method2.invoke(context, objArr2)).getResourceTypeName(this.mConstraintID);
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(C1561oA.ud("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (C1633zX.Xd() ^ (-26656)))).getMethod(C1561oA.yd("\u0007\u0006\u0016t\t\u0018\u0015\u001c\u001a\f\u000f\u001e", (short) (Od.Xd() ^ (-27707))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                ((Resources) method3.invoke(context, objArr3)).getResourceName(this.mConstraintID);
                                if (C1561oA.Yd("\u000f\u0005\u001e\u0015\u001c\u001c", (short) (C1580rY.Xd() ^ (-17069))).equals(resourceTypeName)) {
                                    ConstraintSet constraintSet = new ConstraintSet();
                                    this.mConstraintSet = constraintSet;
                                    constraintSet.clone(context, this.mConstraintID);
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
        ConstraintSet mConstraintSet;
        int mId;
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
            Object[] objArr = {Xml.asAttributeSet(parser), R.styleable.Variant};
            Method method = Class.forName(Xg.qd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\r  '\u0019-*", (short) (FB.Xd() ^ 8564), (short) (FB.Xd() ^ 18247))).getMethod(ZO.xd("!q\u000b*d'uaC\u000eEL>}\u0004%\u0006<fFx]", (short) (C1633zX.Xd() ^ (-23692)), (short) (C1633zX.Xd() ^ (-21656))), Class.forName(Jg.Wd("= q\\5\u000ed\u000b.\u0003T5QBR0\nU*\u001cvD\u000e}i", (short) (OY.Xd() ^ 10608), (short) (OY.Xd() ^ 1320))), int[].class);
            try {
                method.setAccessible(true);
                TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                int indexCount = typedArray.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArray.getIndex(i2);
                    if (index == R.styleable.Variant_constraints) {
                        this.mConstraintID = typedArray.getResourceId(index, this.mConstraintID);
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1626yg.Ud("q!\ny+iUwp\u0001x\u001cVwaWE$]\n0hS", (short) (C1499aX.Xd() ^ (-18213)), (short) (C1499aX.Xd() ^ (-8417)))).getMethod(Ig.wd("\u0003K(y\u0004MY\u001fE*&y", (short) (Od.Xd() ^ (-29008))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            String resourceTypeName = ((Resources) method2.invoke(context, objArr2)).getResourceTypeName(this.mConstraintID);
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(EO.Od("C!%VS\"=\u001f\u001b\b\tl(71E7U\u001d^&m?", (short) (C1607wl.Xd() ^ 2948))).getMethod(C1561oA.Qd("85C 2?:?;+,9", (short) (Od.Xd() ^ (-5910))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                ((Resources) method3.invoke(context, objArr3)).getResourceName(this.mConstraintID);
                                if (C1593ug.zd("D:SJQQ", (short) (ZN.Xd() ^ 163), (short) (ZN.Xd() ^ 24245)).equals(resourceTypeName)) {
                                    ConstraintSet constraintSet = new ConstraintSet();
                                    this.mConstraintSet = constraintSet;
                                    constraintSet.clone(context, this.mConstraintID);
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
                        C1561oA.od("Epnrro]dhmDXodigEeQcS`", (short) (FB.Xd() ^ 8659));
                        short sXd = (short) (C1607wl.Xd() ^ 10711);
                        int[] iArr = new int["Ysquw\u0001x+\u0001nu".length()];
                        QB qb = new QB("Ysquw\u0001x+\u0001nu");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                            i3++;
                        }
                        new String(iArr, 0, i3);
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void load(android.content.Context r17, int r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.load(android.content.Context, int):void");
    }

    private void parseConstraintSet(Context context, XmlPullParser parser) throws Throwable {
        int identifier;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = parser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = parser.getAttributeName(i2);
            String attributeValue = parser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null) {
                String strYd = C1561oA.Yd("PL", (short) (C1499aX.Xd() ^ (-6456)));
                if (strYd.equals(attributeName)) {
                    if (attributeValue.contains(Xg.qd("[", (short) (C1607wl.Xd() ^ 29447), (short) (C1607wl.Xd() ^ 22077)))) {
                        String strSubstring = attributeValue.substring(attributeValue.indexOf(47) + 1);
                        Class<?> cls = Class.forName(Jg.Wd("1Q>\u0004o 2rWZ\u0012/\u000fOL<`\u0004:3X~u", (short) (OY.Xd() ^ 8213), (short) (OY.Xd() ^ 20113)));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd = (short) (C1633zX.Xd() ^ (-4405));
                        short sXd2 = (short) (C1633zX.Xd() ^ (-31060));
                        int[] iArr = new int["S=|!;KN]\u0001~BX".length()];
                        QB qb = new QB("S=|!;KN]\u0001~BX");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                            i3++;
                        }
                        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
                        try {
                            method.setAccessible(true);
                            Resources resources = (Resources) method.invoke(context, objArr);
                            Object[] objArr2 = new Object[0];
                            Method method2 = Class.forName(C1626yg.Ud("2\"O\u0005ZE\u0013bups\u0014\u0013M#\u0005e\u0004G\u0002\r\u0013\u0013", (short) (C1607wl.Xd() ^ 19198), (short) (C1607wl.Xd() ^ 23800))).getMethod(Ig.wd("\u000b2/~x&\u000es3T7p.$", (short) (C1607wl.Xd() ^ 8551)), new Class[0]);
                            try {
                                method2.setAccessible(true);
                                identifier = resources.getIdentifier(strSubstring, strYd, (String) method2.invoke(context, objArr2));
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } else {
                        identifier = -1;
                    }
                    if (identifier == -1) {
                        if (attributeValue.length() > 1) {
                            identifier = Integer.parseInt(attributeValue.substring(1));
                        } else {
                            EO.Od("gL;\u001a\u0014Wt}Z.\nz^LT/;t\u001bh\u0011T", (short) (Od.Xd() ^ (-7849)));
                            C1561oA.Qd("\u001b'&\"$P\u0019\u001dM\u001d\r\u001d\u001d\u0012\u0016\u000eE\u000e\b", (short) (C1607wl.Xd() ^ 15933));
                        }
                    }
                    constraintSet.load(context, parser);
                    this.mConstraintSetMap.put(identifier, constraintSet);
                    return;
                }
            }
        }
    }
}
