package androidx.transition;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class TransitionInflater {
    private final Context mContext;
    private static final Class<?>[] CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class};
    private static final ArrayMap<String, Constructor<?>> CONSTRUCTORS = new ArrayMap<>();

    private TransitionInflater(Context context) {
        this.mContext = context;
    }

    public static TransitionInflater from(Context context) {
        return new TransitionInflater(context);
    }

    public Transition inflateTransition(int i2) throws Throwable {
        Context context = this.mContext;
        Class<?> cls = Class.forName(Wg.vd("\u0013\u001f\u0018%\u001d\u0016\u0014\\\u001d(*/\u001b#,dd\u0010\u0012\u0017\u0003\u0015\u0014", (short) (ZN.Xd() ^ 24442)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 3440);
        short sXd2 = (short) (FB.Xd() ^ 29608);
        int[] iArr = new int["30>\u001b-:5:6&'4".length()];
        QB qb = new QB("30>\u001b-:5:6&'4");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            XmlResourceParser xml = ((Resources) method.invoke(context, objArr)).getXml(i2);
            try {
                try {
                    try {
                        return createTransitionFromXml(xml, Xml.asAttributeSet(xml), null);
                    } catch (IOException e2) {
                        throw new InflateException(xml.getPositionDescription() + hg.Vd("\u0003g", (short) (OY.Xd() ^ 20505), (short) (OY.Xd() ^ 16078)) + e2.getMessage(), e2);
                    }
                } catch (XmlPullParserException e3) {
                    throw new InflateException(e3.getMessage(), e3);
                }
            } finally {
                xml.close();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public TransitionManager inflateTransitionManager(int i2, ViewGroup viewGroup) throws Throwable {
        Context context = this.mContext;
        short sXd = (short) (C1580rY.Xd() ^ (-20264));
        int[] iArr = new int["p|q~zsm6jusxhpu.Bmkp`rm".length()];
        QB qb = new QB("p|q~zsm6jusxhpu.Bmkp`rm");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-19533));
        int[] iArr2 = new int["kjvUm|u|~po~".length()];
        QB qb2 = new QB("kjvUm|u|~po~");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i4));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            XmlResourceParser xml = ((Resources) method.invoke(context, objArr)).getXml(i2);
            try {
                try {
                    try {
                        return createTransitionManagerFromXml(xml, Xml.asAttributeSet(xml), viewGroup);
                    } catch (IOException e2) {
                        StringBuilder sbAppend = new StringBuilder().append(xml.getPositionDescription());
                        short sXd3 = (short) (C1633zX.Xd() ^ (-8535));
                        int[] iArr3 = new int["\u0004j".length()];
                        QB qb3 = new QB("\u0004j");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i5));
                            i5++;
                        }
                        InflateException inflateException = new InflateException(sbAppend.append(new String(iArr3, 0, i5)).append(e2.getMessage()).toString());
                        inflateException.initCause(e2);
                        throw inflateException;
                    }
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } finally {
                xml.close();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.transition.Transition createTransitionFromXml(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.Transition r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionInflater.createTransitionFromXml(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.Transition):androidx.transition.Transition");
    }

    private Object createCustom(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        String attributeValue = attributeSet.getAttributeValue(null, EO.Od("fHM}6", (short) (C1580rY.Xd() ^ (-11169))));
        if (attributeValue == null) {
            StringBuilder sbAppend = new StringBuilder().append(str);
            short sXd = (short) (C1580rY.Xd() ^ (-16454));
            short sXd2 = (short) (C1580rY.Xd() ^ (-26864));
            int[] iArr = new int["\u001bxJ\u0016+-y\u001d+\r:9+N\u000et\u007f{^l~T\t!g\u000eW\u001c73`X%;".length()];
            QB qb = new QB("\u001bxJ\u0016+-y\u001d+\r:9+N\u000et\u007f{^l~T\t!g\u000eW\u001c73`X%;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            throw new InflateException(sbAppend.append(new String(iArr, 0, i2)).toString());
        }
        try {
            ArrayMap<String, Constructor<?>> arrayMap = CONSTRUCTORS;
            synchronized (arrayMap) {
                Constructor<?> constructor = arrayMap.get(attributeValue);
                if (constructor == null) {
                    Context context = this.mContext;
                    Class<?> cls2 = Class.forName(C1561oA.Qd("@LANJC=\u0006:ECH8@E}\u0012=;@0B=", (short) (Od.Xd() ^ (-5947))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd3 = (short) (C1633zX.Xd() ^ (-30690));
                    short sXd4 = (short) (C1633zX.Xd() ^ (-26420));
                    int[] iArr2 = new int["qp\u0001Pzp\u0004\u0005^\u0003uy{\n".length()];
                    QB qb2 = new QB("qp\u0001Pzp\u0004\u0005^\u0003uy{\n");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                        i3++;
                    }
                    Method method = cls2.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method.setAccessible(true);
                        Class<? extends U> clsAsSubclass = Class.forName(attributeValue, false, (ClassLoader) method.invoke(context, objArr)).asSubclass(cls);
                        if (clsAsSubclass != 0) {
                            constructor = clsAsSubclass.getConstructor(CONSTRUCTOR_SIGNATURE);
                            constructor.setAccessible(true);
                            arrayMap.put(attributeValue, constructor);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                objNewInstance = constructor.newInstance(this.mContext, attributeSet);
            }
            return objNewInstance;
        } catch (Exception e3) {
            throw new InflateException(C1561oA.od("\u001aEJ@7q??Cm6:>>*6;/&8(a", (short) (C1607wl.Xd() ^ 1276)) + cls + C1561oA.Kd("M\u0012\u001c\u0012%&S", (short) (OY.Xd() ^ 13493)) + attributeValue, e3);
        }
    }

    private void getTargetIds(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws Throwable {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals(C1561oA.Xd("`N`VUe", (short) (ZN.Xd() ^ 29217)))) {
                    short sXd = (short) (C1499aX.Xd() ^ (-3500));
                    int[] iArr = new int["d+\u001a\u0002#}\rVKZb\u00062naq1/;\u0005".length()];
                    QB qb = new QB("d+\u001a\u0002#}\rVKZb\u00062naq1/;\u0005");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                        i2++;
                    }
                    throw new RuntimeException(new String(iArr, 0, i2) + xmlPullParser.getName());
                }
                Context context = this.mContext;
                int[] iArr2 = Styleable.TRANSITION_TARGET;
                Class<?> cls = Class.forName(Wg.vd("Xf]lb]Y$boov`jq,Jww~h|y", (short) (C1607wl.Xd() ^ 5409)));
                Class<?>[] clsArr = {Class.forName(Qg.kd("(4)62+%m42&(hz-,)\u001f\u0017)'\u0017\u0004\u0015#", (short) (OY.Xd() ^ 30792), (short) (OY.Xd() ^ 7369))), int[].class};
                Object[] objArr = {attributeSet, iArr2};
                short sXd2 = (short) (ZN.Xd() ^ 25671);
                short sXd3 = (short) (ZN.Xd() ^ 26211);
                int[] iArr3 = new int["<.?+26\u001a:>0(&\u0002430&\u001e0.\u001e+".length()];
                QB qb2 = new QB("<.?+26\u001a:>0(&\u0002430&\u001e0.\u001e+");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr3[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr3, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                    int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArray, xmlPullParser, C1561oA.ud("#\u000f\u001f\u0013\u0010\u001eq\f", (short) (C1607wl.Xd() ^ 26880)), 1, 0);
                    if (namedResourceId == 0) {
                        int namedResourceId2 = TypedArrayUtils.getNamedResourceId(typedArray, xmlPullParser, C1561oA.yd("\u000b\u001d\u0007\u000f\u001f\r\ro\u0002", (short) (Od.Xd() ^ (-14274))), 2, 0);
                        if (namedResourceId2 == 0) {
                            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, C1561oA.Yd("Q?QGFV1ERK", (short) (Od.Xd() ^ (-27491))), 4);
                            if (namedString != null) {
                                transition.addTarget(namedString);
                            } else {
                                short sXd4 = (short) (OY.Xd() ^ 30712);
                                short sXd5 = (short) (OY.Xd() ^ 15540);
                                int[] iArr4 = new int["0D0:D46 4A:".length()];
                                QB qb3 = new QB("0D0:D46 4A:");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr4[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                                    i4++;
                                }
                                String namedString2 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, new String(iArr4, 0, i4), 5);
                                if (namedString2 != null) {
                                    transition.excludeTarget(namedString2, true);
                                } else {
                                    short sXd6 = (short) (C1607wl.Xd() ^ 30623);
                                    short sXd7 = (short) (C1607wl.Xd() ^ 25778);
                                    int[] iArr5 = new int["tL\u0010rU\u001du<?\u000exP".length()];
                                    QB qb4 = new QB("tL\u0010rU\u001du<?\u000exP");
                                    int i5 = 0;
                                    while (qb4.YK()) {
                                        int iKK4 = qb4.KK();
                                        Xu xuXd4 = Xu.Xd(iKK4);
                                        iArr5[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((i5 * sXd7) ^ sXd6));
                                        i5++;
                                    }
                                    String namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, new String(iArr5, 0, i5), 3);
                                    if (namedString3 != null) {
                                        transition.excludeTarget(Class.forName(namedString3), true);
                                    } else {
                                        short sXd8 = (short) (Od.Xd() ^ (-18441));
                                        short sXd9 = (short) (Od.Xd() ^ (-21681));
                                        int[] iArr6 = new int["^\u000bn#[{\u0001$F]w".length()];
                                        QB qb5 = new QB("^\u000bn#[{\u0001$F]w");
                                        int i6 = 0;
                                        while (qb5.YK()) {
                                            int iKK5 = qb5.KK();
                                            Xu xuXd5 = Xu.Xd(iKK5);
                                            iArr6[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd9) + sXd8)));
                                            i6++;
                                        }
                                        try {
                                            namedString3 = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, new String(iArr6, 0, i6), 0);
                                            if (namedString3 != null) {
                                                transition.addTarget(Class.forName(namedString3));
                                            }
                                        } catch (ClassNotFoundException e2) {
                                            typedArray.recycle();
                                            throw new RuntimeException(C1626yg.Ud("~\u0016-?\u0014LGr\u001a\u0018F.\"jjOK", (short) (OY.Xd() ^ 30029), (short) (OY.Xd() ^ 24724)) + namedString3, e2);
                                        }
                                    }
                                }
                            }
                        } else {
                            transition.excludeTarget(namedResourceId2, true);
                        }
                    } else {
                        transition.addTarget(namedResourceId);
                    }
                    typedArray.recycle();
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private androidx.transition.TransitionManager createTransitionManagerFromXml(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws java.lang.Throwable {
        /*
            r4 = this;
            int r3 = r5.getDepth()
            r2 = 0
        L5:
            int r1 = r5.next()
            r0 = 3
            if (r1 != r0) goto L12
            int r0 = r5.getDepth()
            if (r0 <= r3) goto L54
        L12:
            r0 = 1
            if (r1 == r0) goto L54
            r0 = 2
            if (r1 == r0) goto L19
            goto L5
        L19:
            java.lang.String r1 = r5.getName()
            java.lang.String r0 = "transitionManager"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            androidx.transition.TransitionManager r2 = new androidx.transition.TransitionManager
            r2.<init>()
            goto L5
        L2c:
            java.lang.String r0 = "transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3b
            if (r2 == 0) goto L3b
            r4.loadTransition(r6, r5, r7, r2)
            goto L5
        L3b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown scene name: "
            r1.<init>(r0)
            java.lang.String r0 = r5.getName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionInflater.createTransitionManagerFromXml(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.TransitionManager");
    }

    private void loadTransition(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, TransitionManager transitionManager) throws Throwable {
        Transition transitionInflateTransition;
        Context context = this.mContext;
        Object[] objArr = {attributeSet, Styleable.TRANSITION_MANAGER};
        Method method = Class.forName(EO.Od("0\rTB_\u0017.\u0017\bwtXx\f*\u0001[yP~+\n$", (short) (C1633zX.Xd() ^ (-25598)))).getMethod(C1593ug.zd("RFYGPV<^dXRR0ded\\Vjj\\k", (short) (Od.Xd() ^ (-12728)), (short) (Od.Xd() ^ (-7690))), Class.forName(C1561oA.Qd("\u0019%\u001a'#\u001c\u0016^%#\u0017\u0019Yk\u001e\u001d\u001a\u0010\b\u001a\u0018\bt\u0006\u0014", (short) (FB.Xd() ^ 18292))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            short sXd = (short) (ZN.Xd() ^ 19455);
            int[] iArr = new int["~{iuynxlqo".length()];
            QB qb = new QB("~{iuynxlqo");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArray, xmlPullParser, new String(iArr, 0, i2), 2, -1);
            int namedResourceId2 = TypedArrayUtils.getNamedResourceId(typedArray, xmlPullParser, C1561oA.Kd("3@>=$58B:", (short) (Od.Xd() ^ (-16343))), 0, -1);
            Scene sceneForLayout = namedResourceId2 < 0 ? null : Scene.getSceneForLayout(viewGroup, namedResourceId2, this.mContext);
            int namedResourceId3 = TypedArrayUtils.getNamedResourceId(typedArray, xmlPullParser, Wg.Zd("S@\u0012O?*^", (short) (FB.Xd() ^ 27688), (short) (FB.Xd() ^ 760)), 1, -1);
            Scene sceneForLayout2 = namedResourceId3 >= 0 ? Scene.getSceneForLayout(viewGroup, namedResourceId3, this.mContext) : null;
            if (namedResourceId >= 0 && (transitionInflateTransition = inflateTransition(namedResourceId)) != null) {
                if (sceneForLayout2 == null) {
                    throw new RuntimeException(C1561oA.Xd("\u001fArHD):=G?zBLP~TSCQWNZPWW\n40\r", (short) (FB.Xd() ^ 4029)) + namedResourceId);
                }
                if (sceneForLayout == null) {
                    transitionManager.setTransition(sceneForLayout2, transitionInflateTransition);
                } else {
                    transitionManager.setTransition(sceneForLayout, sceneForLayout2, transitionInflateTransition);
                }
            }
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
