package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zae implements View.OnClickListener {
    final /* synthetic */ Context zaa;
    final /* synthetic */ Intent zab;

    zae(Context context, Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            Context context = this.zaa;
            Intent intent = this.zab;
            Class<?> cls = Class.forName(hg.Vd("?K@MIB<\u00059DBG7?D|\u0011<:?/A<", (short) (OY.Xd() ^ 8192), (short) (OY.Xd() ^ 7891)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-492));
            int[] iArr = new int["JVKXTMG\u0010DOMRBJO\b\"FK;CH".length()];
            QB qb = new QB("JVKXTMG\u0010DOMRBJO\b\"FK;CH");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {intent};
            Method method = cls.getMethod(C1561oA.yd("hjXje3Vhfthtr", (short) (Od.Xd() ^ (-29679))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ActivityNotFoundException e3) {
            C1561oA.Yd("\u001a<>>LMAA*HFFE\\GQK/MUZP^", (short) (C1580rY.Xd() ^ (-5117)));
            Xg.qd("k\b\u0011\u0015\u000f\u000fK!\u001dN#%\u0013%(T(\u001c+(&00&--_*07)3:", (short) (C1499aX.Xd() ^ (-15956)), (short) (C1499aX.Xd() ^ (-22266)));
        } finally {
            Callback.onClick_exit();
        }
    }
}
