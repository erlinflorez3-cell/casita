package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class bb {
    private static Resources B = null;
    private static HashMap<Integer, String> Z = null;

    bb() {
    }

    static void B(Activity activity) throws Throwable {
        if (B == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (ZN.Xd() ^ 1722))).getMethod(Wg.vd("96H\u0014>=<8=:PDEC\u001bFPUI[R", (short) (C1633zX.Xd() ^ (-11695))), new Class[0]);
            try {
                method.setAccessible(true);
                Context context = (Context) method.invoke(activity, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Qg.kd("\u0003\u000f\u0004\u0011\r\u0006\u007fH|\b\u0006\u000bz\u0003\b@T\u007f}\u0003r\u0005\u007f", (short) (C1607wl.Xd() ^ 11140), (short) (C1607wl.Xd() ^ 26589))).getMethod(yg.hg.Vd("-*8\u0015'4/40 !.", (short) (OY.Xd() ^ 15411), (short) (OY.Xd() ^ 3982)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    B = (Resources) method2.invoke(context, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    static void B(TextView textView, int i2) {
        if (textView == null) {
            return;
        }
        textView.setText(Z(i2));
    }

    static synchronized void I(Map<Integer, String> map) {
        Z = new HashMap<>(map);
    }

    static String Z(int i2) {
        if (i2 == 0) {
            return null;
        }
        HashMap<Integer, String> map = Z;
        String str = map != null ? map.get(Integer.valueOf(i2)) : null;
        return str != null ? str : B.getString(i2);
    }
}
