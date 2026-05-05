package com.google.android.gms.internal.gtm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.gms.tagmanager.impl.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhu {
    private final Context zza;
    private final Context zzb;
    private final Intent zzc;
    private final zzjh zzd;

    public zzhu(Intent intent, Context context, Context context2, zzjh zzjhVar) {
        this.zza = context;
        this.zzb = context2;
        this.zzc = intent;
        this.zzd = zzjhVar;
    }

    public final void zzb() throws Throwable {
        try {
            this.zzd.zzn(this.zzc.getData());
            Context context = this.zzb;
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("~|iQ\u000fwQ\u001dL|?d&ur\t-\u0002\u0007*DHc", (short) (FB.Xd() ^ 27043), (short) (FB.Xd() ^ 20855))).getMethod(C1626yg.Ud("\u001aoi\u0011 9\u0019\u0013\u001e$\u0013N", (short) (C1580rY.Xd() ^ (-26997)), (short) (C1580rY.Xd() ^ (-17843))), new Class[0]);
            try {
                method.setAccessible(true);
                String string = ((Resources) method.invoke(context, objArr)).getString(R.string.tagmanager_preview_dialog_title);
                Context context2 = this.zzb;
                short sXd = (short) (OY.Xd() ^ 27385);
                int[] iArr = new int["8v\u0019MY\u0016z\u001b\u001132X\u001a\u0017\u000f\u0011\\\u00116Bs1\u0011".length()];
                QB qb = new QB("8v\u0019MY\u0016z\u001b\u001132X\u001a\u0017\u000f\u0011\\\u00116Bs1\u0011");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u0006*ii\u0007aC\u001cWvt'", (short) (C1607wl.Xd() ^ 3566)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String string2 = ((Resources) method2.invoke(context2, objArr2)).getString(R.string.tagmanager_preview_dialog_message);
                    Context context3 = this.zzb;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Qd("5A6C?82z/:8=-5:r\u0007205%72", (short) (ZN.Xd() ^ 22038))).getMethod(C1593ug.zd("`_oNbqnusehw", (short) (C1633zX.Xd() ^ (-20849)), (short) (C1633zX.Xd() ^ (-13460))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        String string3 = ((Resources) method3.invoke(context3, objArr3)).getString(R.string.tagmanager_preview_dialog_button);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.zza).create();
                        alertDialogCreate.setTitle(string);
                        alertDialogCreate.setMessage(string2);
                        alertDialogCreate.setButton(-1, string3, new zzht(this));
                        alertDialogCreate.show();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception e5) {
            zzho.zza(C1561oA.od("Vs}|x|t,{|n~pk|$wjsev\u001e^j\u001b_q[\\fi]b`+\u0010", (short) (ZN.Xd() ^ 16455)).concat(String.valueOf(e5.getMessage())));
        }
    }
}
