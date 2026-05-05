package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class ViewUtils {
    private ViewUtils() {
    }

    public static String getXmlAttributeString(String str, String str2, Context context, AttributeSet attributeSet, boolean z2, boolean z3, String str3) throws Throwable {
        Object[] objArr;
        Method method;
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith(C1561oA.od("K}}zptl3", (short) (C1607wl.Xd() ^ 2524))) && z2) {
            String strSubstring = attributeValue.substring(8);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Kd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (Od.Xd() ^ (-27197)))).getMethod(Wg.Zd("FBA\u0004\btx]NG$\u001e)\u0010", (short) (FB.Xd() ^ 1013), (short) (FB.Xd() ^ 24476)), new Class[0]);
            try {
                method2.setAccessible(true);
                String str4 = (String) method2.invoke(context, objArr2);
                TypedValue typedValue = new TypedValue();
                try {
                    objArr = new Object[0];
                    method = Class.forName(C1561oA.Xd("+90?=84~5BBI;EL\u0007\u001dJJQCWT", (short) (OY.Xd() ^ 22244))).getMethod(Wg.vd("B?Q.<IHME5:G", (short) (C1607wl.Xd() ^ 29496)), new Class[0]);
                } catch (Resources.NotFoundException unused) {
                    String str5 = hg.Vd("*UZPG\u0002OOS}CEI>xJ<IDIE56o5=?k", (short) (FB.Xd() ^ 18081), (short) (FB.Xd() ^ 5644)) + str2 + C1561oA.ud("?$", (short) (C1499aX.Xd() ^ (-14768))) + attributeValue;
                }
                try {
                    method.setAccessible(true);
                    Resources resources = (Resources) method.invoke(context, objArr);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    short sXd = (short) (C1499aX.Xd() ^ (-19243));
                    short sXd2 = (short) (C1499aX.Xd() ^ (-27329));
                    int[] iArr = new int["\u0017OOLBF>\u0005".length()];
                    QB qb = new QB("\u0017OOLBF>\u0005");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                        i2++;
                    }
                    sb.append(new String(iArr, 0, i2));
                    sb.append(strSubstring);
                    resources.getValue(sb.toString(), typedValue, true);
                    if (typedValue.string != null) {
                        attributeValue = typedValue.string.toString();
                    } else {
                        String str6 = C1561oA.yd("\u0011#0+0,\u001c\u001dV", (short) (Od.Xd() ^ (-7526))) + str2 + C1561oA.Yd(".\u0007q\u00052\u0002\u0004\n6x8\r\u000f\u000e\u0006\f\u0006Y@", (short) (Od.Xd() ^ (-16510))) + typedValue.toString();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        if (z3 && attributeValue == null) {
            StringBuilder sb2 = new StringBuilder(Xg.qd("\f -2'1%%a\u001b\u0011\u0011e(<=<4.BB4or", (short) (OY.Xd() ^ 7296), (short) (OY.Xd() ^ 15873)));
            sb2.append(str2);
            short sXd3 = (short) (Od.Xd() ^ (-5075));
            short sXd4 = (short) (Od.Xd() ^ (-19491));
            int[] iArr2 = new int["\rQEg\u001cB^\u000e-".length()];
            QB qb2 = new QB("\rQEg\u001cB^\u000e-");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            sb2.append(new String(iArr2, 0, i3));
            sb2.toString();
        }
        return attributeValue;
    }
}
