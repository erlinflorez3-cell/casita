package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfv extends zzbu {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzfv(zzbx zzbxVar) {
        super(zzbxVar);
    }

    public final String zza() {
        zzV();
        return this.zzb;
    }

    public final String zzb() {
        zzV();
        return this.zza;
    }

    public final boolean zzc() {
        zzV();
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() throws Throwable {
        ApplicationInfo applicationInfo;
        int i2;
        int i3;
        Context contextZzo = zzo();
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd(">LCRPKG\u0012HUU\\NX_\u001a0]]dVjg", (short) (C1633zX.Xd() ^ (-903)), (short) (C1633zX.Xd() ^ (-3963)))).getMethod(Jg.Wd("B[=eI(\u0003E\u001ex3\u0014sC\u001cfF", (short) (C1580rY.Xd() ^ (-15333)), (short) (C1580rY.Xd() ^ (-2929))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(contextZzo, objArr);
                Class<?> cls = Class.forName(ZO.xd("O$\u001f\u000b\u0014Aw\u001d\u001aVn?p=.g94>=7!\u0003", (short) (C1607wl.Xd() ^ 26328), (short) (C1607wl.Xd() ^ 32749)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-18804));
                short sXd2 = (short) (C1633zX.Xd() ^ (-20471));
                int[] iArr = new int["#S\u001cBA\nV\u000e_2=|a~".length()];
                QB qb = new QB("#S\u001cBA\nV\u000e_2=|a~");
                int i4 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i4 * sXd2))) + xuXd.CK(iKK));
                    i4++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i4), clsArr);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(contextZzo, objArr2);
                    Class<?> cls2 = Class.forName(Ig.wd("2\u001a KV\f`\u0018z,/Q\u0010!|QkdzrA!9-LL\u0010K\\\u001bzVM", (short) (C1633zX.Xd() ^ (-8308))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(EO.Od("?`$3\u00172~l4z\u001aa*/0K", (short) (Od.Xd() ^ (-23003))));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 128};
                    Method method3 = cls2.getMethod(C1561oA.Qd(" \u001d+v%$\u001f\u001b\u0014\u0011#\u0017\u001c\u001as\u0018\u000f\u0017", (short) (OY.Xd() ^ 11933)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        applicationInfo = (ApplicationInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            short sXd3 = (short) (C1499aX.Xd() ^ (-17519));
            short sXd4 = (short) (C1499aX.Xd() ^ (-20553));
            int[] iArr2 = new int["_qt}t{zcx\u0007z\u0002\u0001\u000f=\u0003\u000f\u0006\u0015\u0011J\u0019E\u0012\u0016\u0018!J\r\u000f\u001d$$P&\u001b\u0019T\u0017'(X*\u001c\u001f(\u001f&%".length()];
            QB qb2 = new QB("_qt}t{zcx\u0007z\u0002\u0001\u000f=\u0003\u000f\u0006\u0015\u0011J\u0019E\u0012\u0016\u0018!J\r\u000f\u001d$$P&\u001b\u0019T\u0017'(X*\u001c\u001f(\u001f&%");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i5)) - sXd4);
                i5++;
            }
            zzR(new String(iArr2, 0, i5), e5);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzQ(C1561oA.od(")TYOFO\u0007S}DAOy\u001aHGB>74F:?=\u0017;2:i=7f24%'a(,. \u001e(Z\u001d(&\u001d\u001f\u001c", (short) (OY.Xd() ^ 16656)));
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i2 = bundle.getInt(C1561oA.Kd("\b\u0015\u0014U\u0010\u0019\u001a\u0013\u0019\u0013\\\u0011\u001f\u0016%#\u001e\u001ad\u001f&-h\u001d+\u001f+95+&7r-37++7\u000f<<598$8GDKI;>", (short) (C1633zX.Xd() ^ (-15080))))) <= 0) {
            return;
        }
        zzbx zzbxVarZzt = zzt();
        zzey zzeyVar = (zzey) new zzcu(zzbxVarZzt, new zzex(zzbxVarZzt)).zza(i2);
        if (zzeyVar != null) {
            zzN(Wg.Zd("J\u0002j\u001b\u0017(9\u0005=UhO}}H\ry$p?cv^\u0015\u0003/6\u00157LTn", (short) (OY.Xd() ^ 4390), (short) (OY.Xd() ^ 14897)));
            String str2 = zzeyVar.zza;
            if (str2 != null) {
                this.zzb = str2;
                zzF(C1561oA.Xd("F<<\u0011Ubb[_^\u0018&\u001a\\lm\u001emang", (short) (C1633zX.Xd() ^ (-13433))), str2);
            }
            String str3 = zzeyVar.zzb;
            if (str3 != null) {
                this.zza = str3;
                zzF(Wg.vd("bXT)ivrk{z0>.p|}:\u0012}\f\n\u0001\u0004\u0004", (short) (C1607wl.Xd() ^ 32323)), str3);
            }
            String str4 = zzeyVar.zzc;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase(Locale.US);
                if (Qg.kd("@.:)58)", (short) (ZN.Xd() ^ 11766), (short) (ZN.Xd() ^ 29227)).equals(lowerCase)) {
                    i3 = 0;
                } else if (hg.Vd("CG>F", (short) (C1607wl.Xd() ^ 27702), (short) (C1607wl.Xd() ^ 10266)).equals(lowerCase)) {
                    i3 = 1;
                } else {
                    short sXd5 = (short) (C1633zX.Xd() ^ (-19649));
                    int[] iArr3 = new int["1\u001a*%\u001f#\u001b".length()];
                    QB qb3 = new QB("1\u001a*%\u001f#\u001b");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK(sXd5 + i6 + xuXd3.CK(iKK3));
                        i6++;
                    }
                    i3 = new String(iArr3, 0, i6).equals(lowerCase) ? 2 : C1561oA.yd("LX[WU", (short) (C1607wl.Xd() ^ 799)).equals(lowerCase) ? 3 : -1;
                }
                if (i3 >= 0) {
                    zzO(C1561oA.Yd("qgg<\u0001\u000e\u000e\u0007\u000b\nCQE\u0013\u0017\u0010I\u0017\u0011#\u0013\u001b", (short) (FB.Xd() ^ 4589)), Integer.valueOf(i3));
                }
            }
            int i7 = zzeyVar.zzd;
            if (i7 >= 0) {
                this.zzd = i7;
                this.zzc = true;
                zzF(Xg.qd("D::\u000fS``Y]\\\u0016$\u0018]cnl^rbh!rhvnuk(1}po6", (short) (OY.Xd() ^ 14288), (short) (OY.Xd() ^ 28180)), Integer.valueOf(i7));
            }
            int i8 = zzeyVar.zze;
            if (i8 != -1) {
                boolean z2 = 1 == i8;
                this.zzf = z2;
                this.zze = true;
                zzF(Jg.Wd("A\u0002w[>H\u000e-(5\bSN2?T\u0012,6N", (short) (FB.Xd() ^ 2735), (short) (FB.Xd() ^ 7593)), Boolean.valueOf(z2));
            }
        }
    }

    public final boolean zze() {
        zzV();
        return this.zze;
    }

    public final boolean zzf() {
        zzV();
        return false;
    }
}
