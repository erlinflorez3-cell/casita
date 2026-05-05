package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1qSDK implements AFg1vSDK {
    private Map<String, String> getMonetizationNetwork = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFg1vSDK
    public final Map<String, String> getMediationNetwork(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getMonetizationNetwork.isEmpty()) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("$0%2.'!i\u001e)',\u001c$)au!\u001f$\u0014&!", (short) (FB.Xd() ^ 17524), (short) (FB.Xd() ^ 20142))).getMethod(hg.Vd("c`nK]jejfVWd", (short) (C1607wl.Xd() ^ 25811), (short) (C1607wl.Xd() ^ 1541)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                int i2 = resources.getConfiguration().screenLayout;
                int i3 = (i2 + 15) - (i2 | 15);
                this.getMonetizationNetwork.put(C1561oA.ud("\u001e\t\u0014", (short) (C1607wl.Xd() ^ 32549)), String.valueOf(displayMetrics.xdpi));
                Map<String, String> map = this.getMonetizationNetwork;
                String strValueOf = String.valueOf(displayMetrics.ydpi);
                short sXd = (short) (C1580rY.Xd() ^ (-20393));
                int[] iArr = new int["hT]".length()];
                QB qb = new QB("hT]");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i4));
                    i4++;
                }
                map.put(new String(iArr, 0, i4), strValueOf);
                this.getMonetizationNetwork.put(C1561oA.Yd("4\u001c.7", (short) (C1633zX.Xd() ^ (-65))), String.valueOf(displayMetrics.widthPixels));
                this.getMonetizationNetwork.put(Xg.qd("\u001e\u0005\u0017 ", (short) (Od.Xd() ^ (-25593)), (short) (Od.Xd() ^ (-30250))), String.valueOf(displayMetrics.heightPixels));
                this.getMonetizationNetwork.put(Jg.Wd("%\bvnQ", (short) (FB.Xd() ^ 12338), (short) (FB.Xd() ^ 2561)), String.valueOf(displayMetrics.densityDpi));
                this.getMonetizationNetwork.put(ZO.xd("t+;0", (short) (C1499aX.Xd() ^ (-22808)), (short) (C1499aX.Xd() ^ (-28756))), String.valueOf(i3));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.getMonetizationNetwork;
    }
}
