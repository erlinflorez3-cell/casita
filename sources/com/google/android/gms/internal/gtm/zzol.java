package com.google.android.gms.internal.gtm;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzol implements zzjw {
    private final Context zza;

    public zzol(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u0016kbZ6n'EF\u0015h[JzuISu/\n\u007f-J", (short) (FB.Xd() ^ 28996), (short) (FB.Xd() ^ 25674))).getMethod(C1626yg.Ud("e`p#eTygw\u0011|9(@\u0014C\u001f\u0019", (short) (FB.Xd() ^ 272), (short) (FB.Xd() ^ 9647)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = Settings.Secure.getString((ContentResolver) method.invoke(context, objArr), Ig.wd(">\u0011%WM\u0002TH~*", (short) (C1499aX.Xd() ^ (-3478))));
            return string != null ? new zzrk(string) : zzrd.zze;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
