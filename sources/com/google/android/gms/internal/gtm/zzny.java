package com.google.android.gms.internal.gtm;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzny implements zzjw {
    private final Context zza;

    public zzny(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52", (short) (C1607wl.Xd() ^ 2152), (short) (C1607wl.Xd() ^ 19028))).getMethod(Jg.Wd(")Hwf3V|\u000e7a`\u0014B^\u007f*9f", (short) (C1633zX.Xd() ^ (-25845)), (short) (C1633zX.Xd() ^ (-5902))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = Settings.Secure.getString((ContentResolver) method.invoke(context, objArr), ZO.xd("p\u001cEiD\u001a\u0010?\u0016I", (short) (C1580rY.Xd() ^ (-2252)), (short) (C1580rY.Xd() ^ (-7933))));
            if (string == null) {
                string = "";
            }
            return new zzrk(string);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
