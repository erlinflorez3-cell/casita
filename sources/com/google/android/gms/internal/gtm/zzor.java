package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzor implements zzjw {
    private final Context zza;
    private final DisplayMetrics zzb = new DisplayMetrics();

    public zzor(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        Context context = this.zza;
        short sXd = (short) (C1499aX.Xd() ^ (-11878));
        int[] iArr = new int["c\r@RF\u0003".length()];
        QB qb = new QB("c\r@RF\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(C1561oA.Qd("(4)62+%m\"-+0 (-ey%#(\u0018*%", (short) (C1580rY.Xd() ^ (-32161)))).getMethod(C1561oA.od("GDR0UNN>E*;GJ<56", (short) (Od.Xd() ^ (-13414))), Class.forName(C1593ug.zd(">6L8\u0006E;IC\u000b1SRJPJ", (short) (C1607wl.Xd() ^ 11315), (short) (C1607wl.Xd() ^ 5765))));
        try {
            method.setAccessible(true);
            ((WindowManager) method.invoke(context, objArr)).getDefaultDisplay().getMetrics(this.zzb);
            return new zzrk(this.zzb.widthPixels + C1561oA.Kd("&", (short) (ZN.Xd() ^ 7910)) + this.zzb.heightPixels);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
