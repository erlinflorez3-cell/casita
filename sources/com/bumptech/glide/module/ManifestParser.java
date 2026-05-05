package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ManifestParser {
    private static final String GLIDE_MODULE_VALUE = "GlideModule";
    private static final String TAG = "ManifestParser";
    private final Context context;

    public ManifestParser(Context context) {
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    private static GlideModule parseModule(String str) {
        ?? r3;
        try {
            ?? cls = Class.forName(str);
            try {
                cls = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                r3 = cls;
            } catch (IllegalAccessException e2) {
                throwInstantiateGlideModuleException(cls, e2);
                r3 = 0;
            } catch (InstantiationException e3) {
                throwInstantiateGlideModuleException(cls, e3);
                r3 = 0;
            } catch (NoSuchMethodException e4) {
                throwInstantiateGlideModuleException(cls, e4);
                r3 = 0;
            } catch (InvocationTargetException e5) {
                throwInstantiateGlideModuleException(cls, e5);
                r3 = 0;
            }
            if (r3 instanceof GlideModule) {
                return (GlideModule) r3;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + r3);
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    private static void throwInstantiateGlideModuleException(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<GlideModule> parse() {
        String strZd = Wg.Zd("Y\u0004\u000b8Whj{\f\u0011-6&UO%296\tU2\u0018", (short) (FB.Xd() ^ 16803), (short) (FB.Xd() ^ 2934));
        String strXd = C1561oA.Xd("y\u000f\u001d\u0019\u0017\u0017&(\u0005\u0017)+\u001e,", (short) (C1633zX.Xd() ^ (-32205)));
        if (Log.isLoggable(strXd, 3)) {
            Wg.vd("$H;?EKE~'MKGI\u0005SV,>60?", (short) (ZN.Xd() ^ 4799));
        }
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.context;
            short sXd = (short) (OY.Xd() ^ 26761);
            short sXd2 = (short) (OY.Xd() ^ 3918);
            int[] iArr = new int["s\u007ft\u0002}vp9mxv{ksx1Epnscup".length()];
            QB qb = new QB("s\u007ft\u0002}vp9mxv{ksx1Epnscup");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(hg.Vd("=:H#34;052\u0019,8*/,8", (short) (OY.Xd() ^ 12689), (short) (OY.Xd() ^ 13355)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Context context2 = this.context;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.ud("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR", (short) (C1633zX.Xd() ^ (-1778)))).getMethod(C1561oA.yd("[XfAQRYNSP8JUL", (short) (ZN.Xd() ^ 13487)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context2, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.Yd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dW\u001b\u0019Z}\u0010\u0013\u001c\u0013\u001a\u0019\u0002\u0017%\u0019 \u001f-", (short) (Od.Xd() ^ (-629))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(Xg.qd("~v\rxF\u0006{\n\u0004Kq\u0014\u0013\u000b\u0011\u000b", (short) (Od.Xd() ^ (-5550)), (short) (Od.Xd() ^ (-7078))));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls2.getMethod(Jg.Wd("7}U\b\u007fS0lU%\u0003O\u001ct8\u001fwP", (short) (OY.Xd() ^ 10850), (short) (OY.Xd() ^ 2014)), clsArr);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                        if (applicationInfo.metaData == null) {
                            if (Log.isLoggable(strXd, 3)) {
                                ZO.xd("j*Ae\u0017a hw\u0018\u000e\u0010\u000f\u000b\u001bU)\u001b!\u00058Ty\u0017v\u000f", (short) (OY.Xd() ^ 28095), (short) (OY.Xd() ^ 30602));
                            }
                            return arrayList;
                        }
                        if (Log.isLoggable(strXd, 2)) {
                            String str2 = strZd + applicationInfo.metaData;
                        }
                        for (String str3 : applicationInfo.metaData.keySet()) {
                            short sXd3 = (short) (OY.Xd() ^ 2686);
                            short sXd4 = (short) (OY.Xd() ^ 26502);
                            int[] iArr2 = new int["\u00111,I\u0005s\u001acw/\u001a".length()];
                            QB qb2 = new QB("\u00111,I\u0005s\u001acw/\u001a");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                                i3++;
                            }
                            if (new String(iArr2, 0, i3).equals(applicationInfo.metaData.get(str3))) {
                                arrayList.add(parseModule(str3));
                                if (Log.isLoggable(strXd, 3)) {
                                    String str4 = Ig.wd("6)hL>_G'lZW:%hz:\"z<x\u001f", (short) (C1499aX.Xd() ^ (-1203))) + str3;
                                }
                            }
                        }
                        if (Log.isLoggable(strXd, 3)) {
                            short sXd5 = (short) (C1580rY.Xd() ^ (-30396));
                            int[] iArr3 = new int["n92\u0014\bIP\no/2\u007f12]7$S#F{+qEa\u00016yz=".length()];
                            QB qb3 = new QB("n92\u0014\bIP\no/2\u007f12]7$S#F{+qEa\u00016yz=");
                            int i4 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                                i4++;
                            }
                            new String(iArr3, 0, i4);
                        }
                        return arrayList;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            throw new RuntimeException(C1561oA.Qd("1I;;D<uICr8:>3m:1?+-);'d82a1!11\"[\u0002&\"\u001c\u001c\u0003$\u0018(\u001e\u0016#", (short) (Od.Xd() ^ (-32714))), e5);
        }
    }
}
