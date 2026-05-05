package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zznt implements zzjw {
    private final Context zza;

    public zznt(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        String networkOperatorName;
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        Context context = this.zza;
        short sXd = (short) (C1607wl.Xd() ^ 29720);
        short sXd2 = (short) (C1607wl.Xd() ^ 20056);
        int[] iArr = new int["\u001f\u0016\u001c\u001a\u0010".length()];
        QB qb = new QB("\u001f\u0016\u001c\u001a\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (C1633zX.Xd() ^ (-20018));
        int[] iArr2 = new int["\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rEY\u0005\u0003\bw\n\u0005".length()];
        QB qb2 = new QB("\b\u0014\t\u0016\u0012\u000b\u0005M\u0002\r\u000b\u0010\u007f\b\rEY\u0005\u0003\bw\n\u0005");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {str};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Yd("\u000b\n\u001ay!\u001c\u001e\u0010\u0019\u007f\u0013!&\u001a\u0015\u0018", (short) (C1607wl.Xd() ^ 28384)), Class.forName(C1561oA.yd("G?Q=\u000fN@N<\u0004&HKCE?", (short) (C1580rY.Xd() ^ (-7509)))));
        try {
            method.setAccessible(true);
            TelephonyManager telephonyManager = (TelephonyManager) method.invoke(context, objArr);
            zzrd zzrdVar = zzrd.zze;
            return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? zzrdVar : new zzrk(networkOperatorName);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
