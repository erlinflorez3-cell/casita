package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzfu;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr {
    private static volatile zzr zza = null;
    private final Context zzb;
    private final List zzc;
    private final zzg zzd;
    private final zzn zze;
    private volatile zzax zzf;
    private Thread.UncaughtExceptionHandler zzg;

    zzr(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("s\u007ft\u0002}vp9mxv{ksx1Epnscup", (short) (C1607wl.Xd() ^ 22481), (short) (C1607wl.Xd() ^ 104))).getMethod(C1561oA.ud("ift@nmhd]Zl`ec7b`eUgb", (short) (FB.Xd() ^ 11333)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Preconditions.checkNotNull(context2);
            this.zzb = context2;
            this.zze = new zzn(this);
            this.zzc = new CopyOnWriteArrayList();
            this.zzd = new zzg();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static zzr zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (zza == null) {
            synchronized (zzr.class) {
                if (zza == null) {
                    zza = new zzr(context);
                }
            }
        }
        return zza;
    }

    public static void zzh() {
        if (!(Thread.currentThread() instanceof zzq)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzax zzc() {
        short sXd = (short) (C1607wl.Xd() ^ 744);
        int[] iArr = new int["\u001aHECKyI=QPDAWKMGd6$'4+.-l792@\fn1%&\u0001\u0015&\u001fV+\"2Z00a".length()];
        QB qb = new QB("\u001aHECKyI=QPDAWKMGd6$'4+.-l792@\fn1%&\u0001\u0015&\u001fV+\"2Z00a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    zzax zzaxVar = new zzax();
                    Context context = this.zzb;
                    Class<?> cls = Class.forName(C1561oA.Yd("9G>MKFB\rCPPWISZ\u0015+XX_Qeb", (short) (C1633zX.Xd() ^ (-6295))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd2 = (short) (OY.Xd() ^ 1550);
                    short sXd3 = (short) (OY.Xd() ^ 28365);
                    int[] iArr2 = new int["xw\bdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014".length()];
                    QB qb2 = new QB("xw\bdvy\u0003y\u0001\u007fh}\f\u007f\u0007\u0006\u0014");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                        i3++;
                    }
                    Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method.setAccessible(true);
                        PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                        Context context2 = this.zzb;
                        short sXd4 = (short) (C1633zX.Xd() ^ (-5999));
                        short sXd5 = (short) (C1633zX.Xd() ^ (-30949));
                        int[] iArr3 = new int["$Yug\n}a\u0011k_\u0015CYHv&!5^Hn(L".length()];
                        QB qb3 = new QB("$Yug\n}a\u0011k_\u0015CYHv&!5^Hn(L");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                            i4++;
                        }
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(ZO.xd("j>/t\t'sr\u001b\u000485\u001aw", (short) (FB.Xd() ^ 11082), (short) (FB.Xd() ^ 14054)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            String string = (String) method2.invoke(context2, objArr2);
                            zzaxVar.zzi(string);
                            Class<?> cls2 = Class.forName(C1626yg.Ud("\u001a\u000e*P\u000bv\u0019$m? \u001aP8\ngbxGT dD\u000eH:h{R8Wr\u001b", (short) (ZN.Xd() ^ 4214), (short) (ZN.Xd() ^ 7052)));
                            Class<?>[] clsArr2 = {Class.forName(Ig.wd("p\u0018\u001fea{\u0001%g}!$:9\\y", (short) (OY.Xd() ^ 28)))};
                            Object[] objArr3 = {string};
                            short sXd6 = (short) (C1580rY.Xd() ^ (-26878));
                            int[] iArr4 = new int["*ZK\tm7\\Y7\f\u001b\u000e\u001a\u001d\u001f\u000e(HnO%mK".length()];
                            QB qb4 = new QB("*ZK\tm7\\Y7\f\u001b\u000e\u001a\u001d\u001f\u000e(HnO%mK");
                            int i5 = 0;
                            while (qb4.YK()) {
                                int iKK4 = qb4.KK();
                                Xu xuXd4 = Xu.Xd(iKK4);
                                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i5)) + xuXd4.CK(iKK4));
                                i5++;
                            }
                            Method method3 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                            try {
                                method3.setAccessible(true);
                                zzaxVar.zzj((String) method3.invoke(packageManager, objArr3));
                                String str2 = null;
                                try {
                                    Context context3 = this.zzb;
                                    Object[] objArr4 = new Object[0];
                                    Method method4 = Class.forName(C1561oA.Qd(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (OY.Xd() ^ 31162))).getMethod(C1593ug.zd("/.>\u001b-09076 4A:", (short) (OY.Xd() ^ 3405), (short) (OY.Xd() ^ 1682)), new Class[0]);
                                    try {
                                        method4.setAccessible(true);
                                        Object[] objArr5 = {(String) method4.invoke(context3, objArr4), 0};
                                        Method method5 = Class.forName(C1561oA.od("7C8EA:4|1<:?/7<t62q\u0013#$+ %\"\t\u001c(\u001a\u001f\u001c(", (short) (C1580rY.Xd() ^ (-2631)))).getMethod(Wg.Zd("J~Z+iPF`c67a5T", (short) (Od.Xd() ^ (-20479)), (short) (Od.Xd() ^ (-3613))), Class.forName(C1561oA.Kd("B:P<\nI?MG\u000f5WVNTN", (short) (Od.Xd() ^ (-25203)))), Integer.TYPE);
                                        try {
                                            method5.setAccessible(true);
                                            PackageInfo packageInfo = (PackageInfo) method5.invoke(packageManager, objArr5);
                                            if (packageInfo != null) {
                                                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                                                short sXd7 = (short) (C1499aX.Xd() ^ (-14332));
                                                int[] iArr5 = new int["lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH\f\nKn\u0001\u0004\r\u0004\u000b\nr\b\u0016\n\u0011\u0010\u001e".length()];
                                                QB qb5 = new QB("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH\f\nKn\u0001\u0004\r\u0004\u000b\nr\b\u0016\n\u0011\u0010\u001e");
                                                int i6 = 0;
                                                while (qb5.YK()) {
                                                    int iKK5 = qb5.KK();
                                                    Xu xuXd5 = Xu.Xd(iKK5);
                                                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd7 + i6));
                                                    i6++;
                                                }
                                                Object[] objArr6 = {applicationInfo};
                                                Method method6 = Class.forName(new String(iArr5, 0, i6)).getMethod(Qg.kd("\u0005\u0002\u0010[\n\t\u0004\u007fxu\b{\u0001~[ooqw", (short) (C1580rY.Xd() ^ (-1585)), (short) (C1580rY.Xd() ^ (-16473))), Class.forName(Wg.vd("\\japfa](fsszdnu0[Y\u001b/WXUSVUi_^^:`AK", (short) (Od.Xd() ^ (-22306)))));
                                                try {
                                                    method6.setAccessible(true);
                                                    CharSequence charSequence = (CharSequence) method6.invoke(packageManager, objArr6);
                                                    if (!TextUtils.isEmpty(charSequence)) {
                                                        string = charSequence.toString();
                                                    }
                                                    str2 = packageInfo.versionName;
                                                } catch (InvocationTargetException e2) {
                                                    throw e2.getCause();
                                                }
                                            }
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                    short sXd8 = (short) (C1633zX.Xd() ^ (-23303));
                                    short sXd9 = (short) (C1633zX.Xd() ^ (-4607));
                                    int[] iArr6 = new int["^W\fH".length()];
                                    QB qb6 = new QB("^W\fH");
                                    int i7 = 0;
                                    while (qb6.YK()) {
                                        int iKK6 = qb6.KK();
                                        Xu xuXd6 = Xu.Xd(iKK6);
                                        iArr6[i7] = xuXd6.fK(sXd8 + i7 + xuXd6.CK(iKK6) + sXd9);
                                        i7++;
                                    }
                                    new String(iArr6, 0, i7);
                                    String str3 = str + string;
                                }
                                zzaxVar.zzk(string);
                                zzaxVar.zzl(str2);
                                this.zzf = zzaxVar;
                            } catch (InvocationTargetException e5) {
                                throw e5.getCause();
                            }
                        } catch (InvocationTargetException e6) {
                            throw e6.getCause();
                        }
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                }
            }
        }
        return this.zzf;
    }

    public final zzbc zzd() throws Throwable {
        Context context = this.zzb;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (FB.Xd() ^ 21515))).getMethod(C1561oA.yd("EDT3?NKRXJM\\", (short) (FB.Xd() ^ 23367)), new Class[0]);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
            zzbc zzbcVar = new zzbc();
            zzbcVar.zze(zzfu.zzd(Locale.getDefault()));
            zzbcVar.zza = displayMetrics.widthPixels;
            zzbcVar.zzb = displayMetrics.heightPixels;
            return zzbcVar;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Future zzg(Callable callable) {
        Preconditions.checkNotNull(callable);
        if (!(Thread.currentThread() instanceof zzq)) {
            return this.zze.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void zzi(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.zze.submit(runnable);
    }

    public final void zzj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzg = uncaughtExceptionHandler;
    }

    final void zzk(zzh zzhVar) {
        if (zzhVar.zzl()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzhVar.zzm()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        zzh zzhVar2 = new zzh(zzhVar);
        zzhVar2.zzi();
        this.zze.execute(new zzl(this, zzhVar2));
    }
}
