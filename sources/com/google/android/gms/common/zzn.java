package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzn {
    private static volatile zzag zze = null;
    private static Context zzg = null;
    static final zzl zza = new zzf(zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzl zzb = new zzg(zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzl zzc = new zzh(zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzl zzd = new zzi(zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzf = new Object();

    static zzw zza(String str, zzj zzjVar, boolean z2, boolean z3) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z2, z3);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static zzw zzb(String str, boolean z2, boolean z3, boolean z4) {
        return zzi(str, z2, false, false, true);
    }

    static zzw zzc(String str, boolean z2, boolean z3, boolean z4) {
        return zzi(str, z2, false, false, false);
    }

    static /* synthetic */ String zzd(boolean z2, String str, zzj zzjVar) throws Exception {
        String str2 = (z2 || !zzh(str, zzjVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigestZza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(messageDigestZza.digest(zzjVar.zzf())), Boolean.valueOf(z2), "12451000.false");
    }

    static synchronized void zze(Context context) {
        if (zzg != null) {
            C1561oA.Qd("Y\u0001\u007fvzrOp|}qmohewgt", (short) (Od.Xd() ^ (-11219)));
            C1593ug.zd("m\u0017\u0018\u0011\u0017\u0011o\u0013!$\u001a\u0018\u001c\u0017\u0016*\u001c+X\"\u001c/\\ $%/a,2.:0)53E11m0<C748N", (short) (C1607wl.Xd() ^ 4642), (short) (C1607wl.Xd() ^ 2850));
            return;
        }
        if (context != null) {
            Class<?> cls = Class.forName(Ig.wd("V\u001e@g:\bxgRLK5Wd\u0005\u001e^#W7m2\"", (short) (C1580rY.Xd() ^ (-6469))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-11824));
            int[] iArr = new int["\u0007ReS\u0016;\u001d\f9T@\u001dqdG\\ \nE\"`".length()];
            QB qb = new QB("\u0007ReS\u0016;\u001d\f9T@\u001dqdG\\ \nE\"`");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                zzg = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static boolean zzf() {
        boolean zZzg;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            zZzg = zze.zzg();
        } catch (RemoteException e2) {
            zZzg = false;
        } catch (DynamiteModule.LoadingException e3) {
            zZzg = false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zZzg;
    }

    static boolean zzg() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            zZzi = zze.zzi();
        } catch (RemoteException e2) {
            zZzi = false;
        } catch (DynamiteModule.LoadingException e3) {
            zZzi = false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zZzi;
    }

    private static zzw zzh(final String str, final zzj zzjVar, final boolean z2, boolean z3) throws Throwable {
        C1561oA.od("-GNPHF\u0001TN}DAOy GF=A9r56BC735.+=-:e+62/`2$+,0 ", (short) (ZN.Xd() ^ 7932));
        C1561oA.Kd(",UVOUO.Q_bXVZUThZi", (short) (C1580rY.Xd() ^ (-13809)));
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            zzs zzsVar = new zzs(str, zzjVar, z2, z3);
            try {
                zzag zzagVar = zze;
                Context context = zzg;
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.Zd("N3j\"<`\u001d<#h\u00165W\u001a}`7\t)Y\bt\"", (short) (C1499aX.Xd() ^ (-19504)), (short) (C1499aX.Xd() ^ (-23202)))).getMethod(C1561oA.Xd("HGW4FIRIPO8M[OVUc", (short) (C1633zX.Xd() ^ (-25058))), new Class[0]);
                try {
                    method.setAccessible(true);
                    return zzagVar.zzh(zzsVar, ObjectWrapper.wrap((PackageManager) method.invoke(context, objArr))) ? zzw.zzb() : new zzu(new Callable() { // from class: com.google.android.gms.common.zze
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzn.zzd(z2, str, zzjVar);
                        }
                    }, null);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (RemoteException e3) {
                short sXd = (short) (C1633zX.Xd() ^ (-8996));
                int[] iArr = new int["GJ@RJD\u007fD3?@".length()];
                QB qb = new QB("GJ@RJD\u007fD3?@");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                return zzw.zzd(new String(iArr, 0, i2), e3);
            }
        } catch (DynamiteModule.LoadingException e4) {
            return zzw.zzd(Qg.kd("cdXh^V\u0010X\\V`%\n", (short) (C1499aX.Xd() ^ (-21265)), (short) (C1499aX.Xd() ^ (-31930))).concat(String.valueOf(e4.getMessage())), e4);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    private static zzw zzi(String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        zzw zzwVarZzd;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzoVar = new zzo(str, z2, false, ObjectWrapper.wrap(zzg), false, true);
                try {
                    zzq zzqVarZze = z5 ? zze.zze(zzoVar) : zze.zzf(zzoVar);
                    if (zzqVarZze.zzb()) {
                        zzwVarZzd = zzw.zzf(zzqVarZze.zzc());
                    } else {
                        String strZza = zzqVarZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        zzwVarZzd = zzw.zzg(zzqVarZze.zzc(), zzqVarZze.zzd(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    zzwVarZzd = zzw.zzd("module call", e2);
                }
            } catch (DynamiteModule.LoadingException e3) {
                zzwVarZzd = zzw.zzd("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            return zzwVarZzd;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static void zzj() throws DynamiteModule.LoadingException {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = zzaf.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
