package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class InstanceIDListenerService extends zze {
    static void zzd(Context context, zzak zzakVar) {
        zzakVar.zzz();
        Intent intent = new Intent(C1561oA.ud("\u0006\u0011\u000eM\u0006\r\f\u0003\u0007~Fx\u0005y\u0007\u0003{u>v{\u0001:tsm6PtxxdpdeHB", (short) (FB.Xd() ^ 15494)));
        intent.putExtra(C1561oA.yd("%.$", (short) (C1580rY.Xd() ^ (-4426))), C1561oA.Yd("\u001f!#", (short) (C1633zX.Xd() ^ (-15632))));
        short sXd = (short) (OY.Xd() ^ 29756);
        short sXd2 = (short) (OY.Xd() ^ 12528);
        int[] iArr = new int["*76w2;<5;5~3A8GE@<\u0007AHO\u000bEBM\u000f)FQ7KJMR`P^".length()];
        QB qb = new QB("*76w2;<5;5~3A8GE@<\u0007AHO\u000bEBM\u000f)FQ7KJMR`P^");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        intent.setClassName(context, new String(iArr, 0, i2));
        Class<?> cls = Class.forName(Jg.Wd(">oukd\u0007\u0012C\u0015IXB3dz\u0018\rAlzKf\u000f", (short) (FB.Xd() ^ 6360), (short) (FB.Xd() ^ 13169)));
        Class<?>[] clsArr = {Class.forName(ZO.xd("U{z=(;G%a*)[GzG`\u00124Lbrr", (short) (C1499aX.Xd() ^ (-26695)), (short) (C1499aX.Xd() ^ (-8007))))};
        Object[] objArr = {intent};
        short sXd3 = (short) (C1499aX.Xd() ^ (-15089));
        short sXd4 = (short) (C1499aX.Xd() ^ (-31743));
        int[] iArr2 = new int["3H6.[\b\u001coW_s'\u000e".length()];
        QB qb2 = new QB("3H6.[\b\u001coW_s'\u000e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        Bundle bundle;
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString("subtype", stringExtra);
            } else {
                bundle = null;
            }
            InstanceID instanceID = InstanceID.getInstance(this, bundle);
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(String.valueOf(stringExtra).length() + 34 + String.valueOf(stringExtra2).length()).append("Service command. subtype:").append(stringExtra).append(" command:").append(stringExtra2).toString();
            }
            if ("RST".equals(stringExtra2)) {
                instanceID.zzo();
                onTokenRefresh();
                return;
            }
            if ("RST_FULL".equals(stringExtra2)) {
                if (InstanceID.zzp().isEmpty()) {
                    return;
                }
                InstanceID.zzp().zzz();
                onTokenRefresh();
                return;
            }
            if ("SYNC".equals(stringExtra2)) {
                zzak zzakVarZzp = InstanceID.zzp();
                String strValueOf = String.valueOf(stringExtra);
                String strValueOf2 = String.valueOf("|T|");
                zzakVarZzp.zzi(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
                String strValueOf3 = String.valueOf(stringExtra);
                String strValueOf4 = String.valueOf("|T-timestamp|");
                zzakVarZzp.zzi(strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3));
                onTokenRefresh();
            }
        }
    }

    public void onTokenRefresh() {
    }
}
