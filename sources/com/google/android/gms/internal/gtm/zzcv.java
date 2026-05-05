package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcv {
    private final zzbx zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set zzd;

    protected zzcv(zzbx zzbxVar) {
        Preconditions.checkNotNull(zzbxVar);
        this.zza = zzbxVar;
    }

    public static final long zzc() {
        return ((Long) zzew.zzG.zzb()).longValue();
    }

    public static final long zzd() {
        return ((Long) zzew.zzm.zzb()).longValue();
    }

    public static final long zze() {
        return ((Long) zzew.zzj.zzb()).longValue();
    }

    public static final int zzf() {
        return ((Integer) zzew.zzy.zzb()).intValue();
    }

    public static final int zzg() {
        return ((Integer) zzew.zzp.zzb()).intValue();
    }

    public static final int zzh() {
        return ((Integer) zzew.zzo.zzb()).intValue();
    }

    public static final String zzi() {
        return (String) zzew.zzr.zzb();
    }

    public static final String zzj() {
        return (String) zzew.zzs.zzb();
    }

    public static final String zzk() {
        return (String) zzew.zzq.zzb();
    }

    public static final boolean zzl() {
        return ((Boolean) zzew.zzb.zzb()).booleanValue();
    }

    public final Set zza() {
        String str;
        String str2 = (String) zzew.zzB.zzb();
        if (this.zzd == null || (str = this.zzc) == null || !str.equals(str2)) {
            String[] strArrSplit = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzc = str2;
            this.zzd = hashSet;
        }
        return this.zzd;
    }

    public final boolean zzb() {
        Object obj;
        if (this.zzb == null) {
            synchronized (this) {
                if (this.zzb == null) {
                    Context contextZza = this.zza.zza();
                    short sXd = (short) (ZN.Xd() ^ 27181);
                    int[] iArr = new int["Q]R_[TN\u0017KVTYIQV\u000f#NLQASN".length()];
                    QB qb = new QB("Q]R_[TN\u0017KVTYIQV\u000f#NLQASN");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("YXh6fgdb]\\pfmmIohr", (short) (ZN.Xd() ^ 4070)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(contextZza, objArr);
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String strZd = Wg.Zd("U*e;\u0006G\b\u0018\u001bn3\u0001?\u0011\\u\u000eRX+/v8tD\n[\u0018s:2\u001fk<", (short) (C1499aX.Xd() ^ (-20140)), (short) (C1499aX.Xd() ^ (-18330)));
                            String strXd = C1561oA.Xd("RUSHKZ[7KXQ", (short) (C1633zX.Xd() ^ (-5196)));
                            try {
                                Class<?> cls = Class.forName(strZd);
                                Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            String str = (String) obj;
                            boolean z2 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z2 = true;
                            }
                            this.zzb = Boolean.valueOf(z2);
                        }
                        if ((this.zzb == null || !this.zzb.booleanValue()) && Wg.vd("U`]\u001dU\\[Rf^&XdYfbke.fkp*\\xjt\u0001zngv", (short) (C1580rY.Xd() ^ (-32295))).equals(myProcessName)) {
                            this.zzb = Boolean.TRUE;
                        }
                        if (this.zzb == null) {
                            this.zzb = Boolean.TRUE;
                            this.zza.zzm().zzI(Qg.kd("\u0012=b23/\"#0/Z((,V\u001f#S'\u001a\u0016O\u001b\u0017  J\u0019\u000fG\u0019\u001b\u0013\u0012\f\u0010\b?\u000f\u0010\f~\u007f\r\f|\n", (short) (ZN.Xd() ^ 24685), (short) (ZN.Xd() ^ 14205)));
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        return this.zzb.booleanValue();
    }
}
