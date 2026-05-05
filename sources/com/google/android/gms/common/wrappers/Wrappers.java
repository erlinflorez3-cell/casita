package com.google.android.gms.common.wrappers;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class Wrappers {
    private static final Wrappers zza = new Wrappers();
    private PackageManagerWrapper zzb = null;

    public static PackageManagerWrapper packageManager(Context context) {
        return zza.zza(context);
    }

    public final synchronized PackageManagerWrapper zza(Context context) {
        if (this.zzb == null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\u0017#\u0018%!\u001a\u0014\\\u0011\u001c\u001a\u001f\u000f\u0017\u001cTh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (C1633zX.Xd() ^ (-3354)), (short) (C1633zX.Xd() ^ (-7268)))).getMethod(C1561oA.ud("PM['UTOKDASGLJ\u001eIGL<NI", (short) (OY.Xd() ^ 9684)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((Context) method.invoke(context, objArr)) != null) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(C1561oA.yd("O]Tca\\X#IVV]OY`\u001bAnnug{x", (short) (C1633zX.Xd() ^ (-26333)))).getMethod(C1561oA.Yd("\u000f\u000e\u001ek\u001c\u001d\u001a\u0018\u0013\u0012&\u001c##x&&-\u001f30", (short) (C1580rY.Xd() ^ (-2512))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        context = (Context) method2.invoke(context, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.zzb = new PackageManagerWrapper(context);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return this.zzb;
    }
}
