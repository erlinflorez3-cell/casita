package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Qg;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcy(zzcz zzczVar, String str, Object obj, boolean z2, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    final Object zza(Object obj) {
        try {
            String str = (String) obj;
            Class<?> cls = Class.forName(Qg.kd("p|q~zsm6|znp1Dbsd41", (short) (C1633zX.Xd() ^ (-7276)), (short) (C1633zX.Xd() ^ (-1965))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(hg.Vd("KAU?\u000bH<H@\u0006*JG=A9", (short) (ZN.Xd() ^ 20345), (short) (ZN.Xd() ^ 17095)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 3};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("QQNYMM", (short) (C1607wl.Xd() ^ 26950)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                return zzhs.zzp((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = C1561oA.yd("Pt\u007fiwsq,awue^_%zXbn]\u001b`ln\u000f", (short) (C1633zX.Xd() ^ (-12910))) + this.zzc + C1561oA.Yd("fM", (short) (C1633zX.Xd() ^ (-26773))) + ((String) obj);
            Xg.qd("\u0003\u001c\u001a$&,2* \u0002)\u001f&", (short) (C1580rY.Xd() ^ (-5530)), (short) (C1580rY.Xd() ^ (-15902)));
            return null;
        }
    }
}
