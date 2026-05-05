package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.Wg;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
final class zzbm<T> extends zzbi<T> {
    private final /* synthetic */ zzbp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbm(zzbo zzboVar, String str, Object obj, boolean z2, zzbp zzbpVar) {
        super(zzboVar, str, obj, true, null);
        this.zza = zzbpVar;
    }

    @Override // com.google.android.gms.internal.vision.zzbi
    final T zza(Object obj) {
        if (obj instanceof String) {
            try {
                zzbp zzbpVar = this.zza;
                String str = (String) obj;
                Class<?> cls = Class.forName(EO.Od(";!\u001bCY(x\u001d'D1\\l\u0005\u0012L\u0013_\u0018", (short) (C1580rY.Xd() ^ (-25906))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Qd("yo\u0004m9vjvn4Xxukog", (short) (Od.Xd() ^ (-21155))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {str, 3};
                Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("lnmzpr", (short) (FB.Xd() ^ 24610), (short) (FB.Xd() ^ 28523)), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    return (T) zzbpVar.zza((byte[]) declaredMethod.invoke(null, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        String strZzb = super.zzb();
        String strValueOf = String.valueOf(obj);
        new StringBuilder(String.valueOf(strZzb).length() + 27 + String.valueOf(strValueOf).length()).append(C1561oA.od("Uy\u0001jtpj%f|vf[\\\u001es]go^\u0018]eg\u0014", (short) (FB.Xd() ^ 7846))).append(strZzb).append(C1561oA.Kd("\to", (short) (C1633zX.Xd() ^ (-19071)))).append(strValueOf).toString();
        Wg.Zd("(b\u000b\u0018Dg@R{[0H\u001a", (short) (FB.Xd() ^ 14794), (short) (FB.Xd() ^ 7671));
        return null;
    }
}
