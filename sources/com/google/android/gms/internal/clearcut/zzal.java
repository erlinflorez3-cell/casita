package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
final class zzal<T> extends zzae<T> {
    private final Object lock;
    private String zzec;
    private T zzed;
    private final /* synthetic */ zzan zzee;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzao zzaoVar, String str, Object obj, zzan zzanVar) {
        super(zzaoVar, str, obj, null);
        this.zzee = zzanVar;
        this.lock = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final T zza(SharedPreferences sharedPreferences) {
        try {
            return zzb(sharedPreferences.getString(this.zzds, ""));
        } catch (ClassCastException e2) {
            String strValueOf = String.valueOf(this.zzds);
            if (strValueOf.length() != 0) {
                "Invalid byte[] value in SharedPreferences for ".concat(strValueOf);
            } else {
                new String("Invalid byte[] value in SharedPreferences for ");
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final T zzb(String str) {
        T t2;
        try {
            synchronized (this.lock) {
                if (!str.equals(this.zzec)) {
                    zzan zzanVar = this.zzee;
                    Object[] objArr = {str, 3};
                    Method declaredMethod = Class.forName(C1561oA.ud("S_Ta]VP\u0019_]QS\u0014'EVG\u0017\u0014", (short) (C1633zX.Xd() ^ (-11337)))).getDeclaredMethod(C1561oA.Yd("xzy\u0007|~", (short) (FB.Xd() ^ 23419)), Class.forName(C1561oA.yd("B8L6\nG;G7|!AF<@8", (short) (OY.Xd() ^ 26003))), Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        T t3 = (T) zzanVar.zzb((byte[]) declaredMethod.invoke(null, objArr));
                        this.zzec = str;
                        this.zzed = t3;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                t2 = this.zzed;
            }
            return t2;
        } catch (IOException | IllegalArgumentException unused) {
            short sXd = (short) (C1607wl.Xd() ^ 12810);
            short sXd2 = (short) (C1607wl.Xd() ^ 8708);
            int[] iArr = new int["\";9CEKQI?!H>E".length()];
            QB qb = new QB("\";9CEKQI?!H>E");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            new String(iArr, 0, i2);
            String str2 = this.zzds;
            StringBuilder sbAppend = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length()).append(Jg.Wd("\u0012T+\u0004\u001e\tR<\f\u0012Z:N^\u0010sM&\u001e\u001c\u0005\u001a\u00112-", (short) (FB.Xd() ^ 31507), (short) (FB.Xd() ^ 5270))).append(str2);
            short sXd3 = (short) (C1499aX.Xd() ^ (-16934));
            short sXd4 = (short) (C1499aX.Xd() ^ (-45));
            int[] iArr2 = new int[";a".length()];
            QB qb2 = new QB(";a");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            sbAppend.append(new String(iArr2, 0, i3)).append(str).toString();
            return null;
        }
    }
}
