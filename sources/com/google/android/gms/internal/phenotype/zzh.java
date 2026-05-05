package com.google.android.gms.internal.phenotype;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzh<T> {
    private static final Object zzak = new Object();
    private static Context zzal = null;
    private static boolean zzam = false;
    private static volatile Boolean zzan = null;
    private static volatile Boolean zzbq = null;

    public static void init(Context context) {
        synchronized (zzak) {
            short sXd = (short) (ZN.Xd() ^ 19225);
            short sXd2 = (short) (ZN.Xd() ^ 13129);
            int[] iArr = new int["_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\".length()];
            QB qb = new QB("_k`mib\\%YdbgW_d\u001d1\\Z_Oa\\");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("\u001c%t\u0015%\u0017\u0010\u0011z\u001c\u0018\u001c\f\t\u0019\t\u0007t\u0015\u000f\u0011~\u0004\u0001", (short) (FB.Xd() ^ 19627), (short) (FB.Xd() ^ 15344)), new Class[0]);
            try {
                method.setAccessible(true);
                if (!((Boolean) method.invoke(context, objArr)).booleanValue()) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.ud("GSHUQJD\rALJO?GL\u0005\u0019DBG7ID", (short) (C1607wl.Xd() ^ 2995))).getMethod(C1561oA.yd("$#/|12+)\u0018\u0017'\u001d((y';B0DE", (short) (C1499aX.Xd() ^ (-32282))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        Context context2 = (Context) method2.invoke(context, objArr2);
                        if (context2 != null) {
                            context = context2;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (zzal != context) {
                    zzan = null;
                }
                zzal = context;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        zzam = false;
    }

    public static void maybeInit(Context context) {
        if (zzal == null) {
            init(context);
        }
    }
}
