package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;

/* JADX INFO: loaded from: classes8.dex */
public final class zznp implements zzjw {
    private final Context zza;

    public zznp(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) throws Throwable {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("Vd[j`[W\"`mmt^ho*(UU\\FZW", (short) (C1633zX.Xd() ^ (-6977)))).getMethod(C1561oA.Yd("\u001f\u001e.\u000b\u001d ) '&\u0010$1*", (short) (C1499aX.Xd() ^ (-6523))), new Class[0]);
        try {
            method.setAccessible(true);
            return new zzrk((String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
