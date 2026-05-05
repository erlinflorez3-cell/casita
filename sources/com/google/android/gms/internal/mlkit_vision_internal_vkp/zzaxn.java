package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaxn {
    public static final zzaxf zza;

    static {
        String strWd = Jg.Wd("<mzpt\u0016^3FHc<o\u0004\u0019 \u0018M\u0001b\rE<C\u0002T*[\"\u001bm\u0006,`[\u001c\u001134", (short) (C1633zX.Xd() ^ (-2388)), (short) (C1633zX.Xd() ^ (-26266)));
        short sXd = (short) (C1607wl.Xd() ^ 5067);
        short sXd2 = (short) (C1607wl.Xd() ^ 20793);
        int[] iArr = new int["r\u0011(E\u00058su\u0015a8(F\u007f3\f8GV".length()];
        QB qb = new QB("r\u0011(E\u00058su\u0015a8(F\u007f3\f8GV");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {strWd, 3};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Ig.wd("+[\n3V3", (short) (OY.Xd() ^ 28860)), Class.forName(C1626yg.Ud("\u0002U*c@\t[\r)\u0003F\u0010BpIk", (short) (C1499aX.Xd() ^ (-30339)), (short) (C1499aX.Xd() ^ (-32697)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            short sXd3 = (short) (ZN.Xd() ^ 19355);
            int[] iArr2 = new int["IuE$UD88HrN=\u0003\"\u0001Dw\n=k(\f\u0016./CDY*FM\u000150>:.s!".length()];
            QB qb2 = new QB("IuE$UD88HrN=\u0003\"\u0001Dw\n=k(\f\u0016./CDY*FM\u000150>:.s!");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = {new String(iArr2, 0, i3), 3};
            Method declaredMethod2 = Class.forName(C1561oA.Qd("(4)62+%m42&(h{\u001a+\u001ckh", (short) (Od.Xd() ^ (-17696)))).getDeclaredMethod(C1561oA.od("\u007f\u007f|\b{{", (short) (C1633zX.Xd() ^ (-17240))), Class.forName(C1593ug.zd(";3I5\u0003B8F@\b.POGMG", (short) (C1580rY.Xd() ^ (-30228)), (short) (C1580rY.Xd() ^ (-31795)))), Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                byte[] bArr2 = (byte[]) declaredMethod2.invoke(null, objArr2);
                byte[] bArr3 = new byte[bArr.length];
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
                }
                Object[] objArr3 = {bArr3, 3};
                Method declaredMethod3 = Class.forName(C1561oA.Kd("\u001c*!0.)%o88.2t\n*=0\u0002\u0001", (short) (C1580rY.Xd() ^ (-29266)))).getDeclaredMethod(Wg.Zd("\u0002wUxVpN\u0003O\u0018~\u0019z\u001d", (short) (OY.Xd() ^ 30095), (short) (OY.Xd() ^ 25287)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    zza = new zzaxf(Wg.vd("\"\u001e\u001f#\u001c\u0018\u001e\u001e()'/", (short) (ZN.Xd() ^ 29323)), (String) declaredMethod3.invoke(null, objArr3), C1561oA.Xd(",'Y-*+*0b-ce0fc<:;6?iA", (short) (ZN.Xd() ^ 11193)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
