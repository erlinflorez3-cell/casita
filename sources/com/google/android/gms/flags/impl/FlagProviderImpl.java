package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public class FlagProviderImpl extends com.google.android.gms.flags.zzd {
    private boolean zzu = false;
    private SharedPreferences zzv;

    @Override // com.google.android.gms.flags.zzc
    public boolean getBooleanFlagValue(String str, boolean z2, int i2) {
        return !this.zzu ? z2 : zzb.zza(this.zzv, str, Boolean.valueOf(z2)).booleanValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public int getIntFlagValue(String str, int i2, int i3) {
        return !this.zzu ? i2 : zzd.zza(this.zzv, str, Integer.valueOf(i2)).intValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public long getLongFlagValue(String str, long j2, int i2) {
        return !this.zzu ? j2 : zzf.zza(this.zzv, str, Long.valueOf(j2)).longValue();
    }

    @Override // com.google.android.gms.flags.zzc
    public String getStringFlagValue(String str, String str2, int i2) {
        return !this.zzu ? str2 : zzh.zza(this.zzv, str, str2);
    }

    @Override // com.google.android.gms.flags.zzc
    public void init(IObjectWrapper iObjectWrapper) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (this.zzu) {
            return;
        }
        String strKd = C1561oA.Kd("=JI\u000bENOHNH\u0012FTKZXSO\u001aT[b", (short) (C1607wl.Xd() ^ 918));
        short sXd = (short) (C1607wl.Xd() ^ 21995);
        short sXd2 = (short) (C1607wl.Xd() ^ 20916);
        int[] iArr = new int["#\u0007nrB:'FnP)&\t\bg\u0018\u001f\u0001rv9B1".length()];
        QB qb = new QB("#\u0007nrB:'FnP)&\t\bg\u0018\u001f\u0001rv9B1");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Xd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSy\u001c\u001b\u0013\u0019\u0013", (short) (OY.Xd() ^ 13007)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strKd, 0};
            Method method = cls.getMethod(Wg.vd("x\u0007|w\u0006ucs\u0001\b\u0001\u0006~[\u000b\tyi\u007fz", (short) (Od.Xd() ^ (-21569))), clsArr);
            try {
                method.setAccessible(true);
                this.zzv = zzj.zza((Context) method.invoke(context, objArr));
                this.zzu = true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e3) {
            String strValueOf = String.valueOf(e3.getMessage());
            int length = strValueOf.length();
            String strKd2 = Qg.kd("\u000616,#]++/Y+\u001d+(\u001e\u0019)\u0017P#\u0013\u0019L\u0012\u0017\u000b\u0010\u001bRE\b\u0013\u0011\u0016\n\u000e\u0014\u0007\u000b\u0003:\u0011\u0002\f~5xxxr\u0006{\u0003\u0001F+", (short) (C1580rY.Xd() ^ (-27760)), (short) (C1580rY.Xd() ^ (-5308)));
            if (length != 0) {
                strKd2.concat(strValueOf);
            } else {
                new String(strKd2);
            }
            short sXd3 = (short) (OY.Xd() ^ 30686);
            short sXd4 = (short) (OY.Xd() ^ 16447);
            int[] iArr2 = new int["&K?D,MIOA;;G\u001d@B=".length()];
            QB qb2 = new QB("&K?D,MIOA;;G\u001d@B=");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                i3++;
            }
            new String(iArr2, 0, i3);
        }
    }
}
