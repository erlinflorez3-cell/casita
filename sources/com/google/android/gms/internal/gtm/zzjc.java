package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjc {
    private final Context zza;

    public zzjc(Context context) {
        this.zza = context;
    }

    public final String[] zza() throws IOException {
        Context context = this.zza;
        short sXd = (short) (FB.Xd() ^ 23219);
        short sXd2 = (short) (FB.Xd() ^ 30732);
        int[] iArr = new int["\n\u007f\u0011R5K\u001f7\u001b85GTGb\u001c*m\u007f\u001csW$".length()];
        QB qb = new QB("\n\u007f\u0011R5K\u001f7\u001b85GTGb\u001c*m\u007f\u001csW$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("8\b#\u0012c\u0016e[+", (short) (ZN.Xd() ^ 24057)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((AssetManager) method.invoke(context, objArr)).list("");
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String[] zzb(String str) throws IOException {
        Context context = this.zza;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u001fQw'nF\u0017BG`[\u0006B[K(z7oO\u007fH`", (short) (C1499aX.Xd() ^ (-12036)))).getMethod(C1561oA.Qd("yv\u0005P\u0002\u0001q\u007f}", (short) (OY.Xd() ^ 29166)), new Class[0]);
        try {
            method.setAccessible(true);
            return ((AssetManager) method.invoke(context, objArr)).list(C1593ug.zd("O\\\\cQZ`Xfh", (short) (C1607wl.Xd() ^ 24476), (short) (C1607wl.Xd() ^ 32119)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
