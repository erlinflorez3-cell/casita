package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhs {
    private final Resources zza;
    private final String zzb;

    public zzhs(Context context, String str) throws Throwable {
        Preconditions.checkNotNull(context);
        Class<?> cls = Class.forName(C1593ug.zd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (Od.Xd() ^ (-946)), (short) (Od.Xd() ^ (-12416))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 13912);
        int[] iArr = new int[")&4\u0011#0+0,\u001c\u001d*".length()];
        QB qb = new QB(")&4\u0011#0+0,\u001c\u001d*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.zza = (Resources) method.invoke(context, objArr);
            if (TextUtils.isEmpty(str)) {
                this.zzb = zza(context);
            } else {
                this.zzb = str;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String zza(Context context) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("2@7FD?;\u0006<IIPBLS\u000e$QQXJ^[", (short) (C1580rY.Xd() ^ (-24867)))).getMethod(Wg.Zd("j!d\u001bb%a,q\bM$", (short) (C1607wl.Xd() ^ 29165), (short) (C1607wl.Xd() ^ 23942)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Resources) method.invoke(context, objArr)).getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Resources.NotFoundException unused) {
            short sXd = (short) (C1499aX.Xd() ^ (-24622));
            int[] iArr = new int[".<3B@;7\u00028EEL>HO\n MMTFZW".length()];
            QB qb = new QB(".<3B@;7\u00028EEL>HO\n MMTFZW");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("\u001a\u0017)\u0004\u0018\u0019$\u0019\"\u001f\u000b\u001d,#", (short) (OY.Xd() ^ 16310)), new Class[0]);
            try {
                method2.setAccessible(true);
                return (String) method2.invoke(context, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public final String zza(String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.zza.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
