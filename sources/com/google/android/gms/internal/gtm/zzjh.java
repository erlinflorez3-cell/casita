package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
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

/* JADX INFO: loaded from: classes8.dex */
public final class zzjh {
    private static volatile zzjh zzb = null;
    private final Context zzd;
    private final com.google.android.gms.tagmanager.zzco zze;
    private final zzjq zzf;
    private final ExecutorService zzg;
    private final ScheduledExecutorService zzh;
    private final zzhv zzi;
    private final zzjc zzj;
    private String zzl;
    private String zzm;
    private static final Pattern zza = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);
    private static final zzjg zzc = new zzir();
    private final Object zzk = new Object();
    private int zzn = 1;
    private final Queue zzo = new LinkedList();
    private volatile boolean zzp = false;
    private volatile boolean zzq = false;

    zzjh(Context context, com.google.android.gms.tagmanager.zzco zzcoVar, com.google.android.gms.tagmanager.zzcf zzcfVar, zzjq zzjqVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, zzhv zzhvVar, zzjc zzjcVar) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(zzcoVar);
        this.zzd = context;
        this.zze = zzcoVar;
        this.zzf = zzjqVar;
        this.zzg = executorService;
        this.zzh = scheduledExecutorService;
        this.zzi = zzhvVar;
        this.zzj = zzjcVar;
    }

    public static zzjh zzf(Context context, com.google.android.gms.tagmanager.zzco zzcoVar, com.google.android.gms.tagmanager.zzcf zzcfVar) {
        Preconditions.checkNotNull(context);
        zzjh zzjhVar = zzb;
        if (zzjhVar == null) {
            synchronized (zzjh.class) {
                zzjhVar = zzb;
                if (zzjhVar == null) {
                    zzjhVar = new zzjh(context, zzcoVar, zzcfVar, new zzjq(context, ConnectionTracker.getInstance()), zzjn.zza(context), zzjp.zza, zzhv.zza(), new zzjc(context));
                    zzb = zzjhVar;
                }
            }
        }
        return zzjhVar;
    }

    public final Pair zzp(String[] strArr) {
        String str;
        zzho.zzd("Looking up container asset.");
        String str2 = this.zzl;
        if (str2 != null && (str = this.zzm) != null) {
            return Pair.create(str2, str);
        }
        try {
            String[] strArrZzb = this.zzj.zzb("containers");
            boolean z2 = false;
            for (int i2 = 0; i2 < strArrZzb.length; i2++) {
                Pattern pattern = zza;
                Matcher matcher = pattern.matcher(strArrZzb[i2]);
                if (matcher.matches()) {
                    if (z2) {
                        zzho.zze("Extra container asset found, will not be loaded: ".concat(String.valueOf(strArrZzb[i2])));
                    } else {
                        this.zzl = matcher.group(1);
                        this.zzm = "containers" + File.separator + strArrZzb[i2];
                        zzho.zzd("Asset found for container ".concat(String.valueOf(this.zzl)));
                    }
                    z2 = true;
                } else {
                    zzho.zze(String.format("Ignoring container asset %s (does not match %s)", strArrZzb[i2], pattern.pattern()));
                }
            }
            if (!z2) {
                zzho.zze("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] strArrZza = this.zzj.zza();
                    boolean z3 = false;
                    for (int i3 = 0; i3 < strArrZza.length; i3++) {
                        Matcher matcher2 = zza.matcher(strArrZza[i3]);
                        if (matcher2.matches()) {
                            if (z3) {
                                zzho.zze("Extra container asset found, will not be loaded: ".concat(String.valueOf(strArrZza[i3])));
                            } else {
                                String strGroup = matcher2.group(1);
                                this.zzl = strGroup;
                                this.zzm = strArrZza[i3];
                                zzho.zzd("Asset found for container ".concat(String.valueOf(strGroup)));
                                zzho.zze("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z3 = true;
                            }
                        }
                    }
                } catch (IOException e2) {
                    zzho.zzb("Failed to enumerate assets.", e2);
                    return Pair.create(null, null);
                }
            }
            return Pair.create(this.zzl, this.zzm);
        } catch (IOException e3) {
            zzho.zzb(String.format("Failed to enumerate assets in folder %s", "containers"), e3);
            return Pair.create(null, null);
        }
    }

    public final void zzm(String[] strArr) {
        Object[] objArr;
        Method method;
        String strOd = C1561oA.od("Km^`dh`\u0018ZechT[_Ua\u000e", (short) (C1499aX.Xd() ^ (-3833)));
        zzho.zzd(C1561oA.Kd("'MIUKDPN`PVP\n?MT\u000e<Q_SZYg$", (short) (FB.Xd() ^ 10578)));
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzk) {
            if (this.zzp) {
                return;
            }
            try {
                Context context = this.zzd;
                String strZd = Wg.Zd("\u0004^,w\u0001\u0014cf;\u007fWVr4Q\u001a#i\u0003G\u001d.8\nF\u0018-l\tG\\&BI?W-\u001e\u0002\u001a\\.;\u0014\u0004a}MO\u0015f", (short) (Od.Xd() ^ (-2997)), (short) (Od.Xd() ^ (-21605)));
                try {
                    objArr = new Object[0];
                    method = Class.forName(C1561oA.Xd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (C1633zX.Xd() ^ (-27131)))).getMethod(Wg.vd("ut\u0001]knsj}|av\u0001twvp", (short) (FB.Xd() ^ 3226)), new Class[0]);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Class<?> cls = Class.forName(Qg.kd("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (C1633zX.Xd() ^ (-26273)), (short) (C1633zX.Xd() ^ (-21118))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd = (short) (OY.Xd() ^ 13833);
                    short sXd2 = (short) (OY.Xd() ^ 3719);
                    int[] iArr = new int["\f\t\u0017q\u0002\u0003\n~\u0004\u0001hz\u0006|".length()];
                    QB qb = new QB("\f\t\u0017q\u0002\u0003\n~\u0004\u0001hz\u0006|");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        Object[] objArr3 = {new ComponentName((String) method2.invoke(context, objArr2), strZd), 0};
                        Method method3 = Class.forName(C1561oA.ud("myn{wpj3grpuemr+lh(IYZaV[X?R^PUR^", (short) (C1633zX.Xd() ^ (-16797)))).getMethod(C1561oA.Yd("32B\"5CH<7:\u001fE>H", (short) (C1607wl.Xd() ^ 9847)), Class.forName(C1561oA.yd(";G@MMFD\r5@BG;CL\u0005-XY[][U]V/EPK", (short) (FB.Xd() ^ 14490))), Integer.TYPE);
                        try {
                            method3.setAccessible(true);
                            ServiceInfo serviceInfo = (ServiceInfo) method3.invoke(packageManager, objArr3);
                            if (serviceInfo != null && serviceInfo.enabled) {
                                Pair pairZzp = zzp(null);
                                String str = (String) pairZzp.first;
                                String str2 = (String) pairZzp.second;
                                if (str == null || str2 == null) {
                                    short sXd3 = (short) (FB.Xd() ^ 25320);
                                    short sXd4 = (short) (FB.Xd() ^ 26947);
                                    int[] iArr2 = new int["HV]\u0017EZh\\cbp&s!gyisz'pjxoxr\u0001/gZ^_4cek8{\u007f;\u0006\f\u0012\u0014\u0002\u000e\u000f\t\tEN\u0016\u0018I\u000e\u001b\u001b\"\u0010\u0019\u001f\u0017%S!%\u0018\u001c\u001e\u001ec".length()];
                                    QB qb2 = new QB("HV]\u0017EZh\\cbp&s!gyisz'pjxoxr\u0001/gZ^_4cek8{\u007f;\u0006\f\u0012\u0014\u0002\u000e\u000f\t\tEN\u0016\u0018I\u000e\u001b\u001b\"\u0010\u0019\u001f\u0017%S!%\u0018\u001c\u001e\u001ec");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                                        i3++;
                                    }
                                    zzho.zze(new String(iArr2, 0, i3));
                                } else {
                                    zzho.zzc(strOd + str);
                                    this.zzg.execute(new zziw(this, str, str2, null));
                                    this.zzh.schedule(new zziy(this), 5000L, TimeUnit.MILLISECONDS);
                                    if (!this.zzq) {
                                        zzho.zzc(Xg.qd("Ekqsamnlrl&[ip*Xm{ovu\u00042x\u000bz\u0005\f8\u0002{\n\u0001\n\u0004\u0012N", (short) (C1633zX.Xd() ^ (-2033)), (short) (C1633zX.Xd() ^ (-25265))));
                                        this.zzq = true;
                                        try {
                                            this.zze.zze(new zzit(this));
                                        } catch (RemoteException e2) {
                                            zzgv.zzb(Jg.Wd("dHB96U\u0013\u0019\u0011\u0003\u00058-\u001a\u0012\u001f\u000e\u0005w*{_%\u0013D\u0004vlxlcPR|\u007f\u007f%gc[^Q\f(", (short) (Od.Xd() ^ (-30028)), (short) (Od.Xd() ^ (-27096))), e2, this.zzd);
                                        }
                                        try {
                                            this.zze.zzd(new zziv(this));
                                        } catch (RemoteException e3) {
                                            zzgv.zzb(ZO.xd("\u0004g!Xe\u000fg>5\u0013E@t:,%\u0001_\\\n\u000b\u0015;oU!9AWe\u001dWYV\\0_/Z`->\u001b.", (short) (C1499aX.Xd() ^ (-10160)), (short) (C1499aX.Xd() ^ (-12097))), e3, this.zzd);
                                        }
                                        Context context2 = this.zzd;
                                        Object[] objArr4 = {new zzja(this)};
                                        Method method4 = Class.forName(C1626yg.Ud("07_>4Ae\u007f3\f4\u001e#tOF9\u00176\u0019[?!", (short) (C1499aX.Xd() ^ (-2410)), (short) (C1499aX.Xd() ^ (-31924)))).getMethod(EO.Od("e\u00079\\H~MTL68W\u0002\t\u00126yX \u0005\u001ch;C\"\b", (short) (Od.Xd() ^ (-29629))), Class.forName(Ig.wd("\u0007i-\u0017\r*EF!\u001d\u001e\u0002$#!<-C\to4zOT0VR-vZ\r/]}", (short) (FB.Xd() ^ 4049))));
                                        try {
                                            method4.setAccessible(true);
                                            method4.invoke(context2, objArr4);
                                            zzho.zzc(C1561oA.Qd("\b\u0014\u0019P|\u0010\u001c\u000e\u0013\u0010\u001cH\r\u001d\u000b\u0013\u0018B\n\u0002\u000e\u0003\n\u0002\u000e:\u0003\u0007\u000b\u000bv\u0001\u007fwu>", (short) (C1607wl.Xd() ^ 4076)));
                                        } catch (InvocationTargetException e4) {
                                            throw e4.getCause();
                                        }
                                    }
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                short sXd5 = (short) (ZN.Xd() ^ 24076);
                                int[] iArr3 = new int["Uaf\u001eJ]i[`]i\u0016^b\\fZQ[WgM_SXV\u0007ZTSN\u0002".length()];
                                QB qb3 = new QB("Uaf\u001eJ]i[`]i\u0016^b\\fZQ[WgM_SXV\u0007ZTSN\u0002");
                                int i4 = 0;
                                while (qb3.YK()) {
                                    int iKK3 = qb3.KK();
                                    Xu xuXd3 = Xu.Xd(iKK3);
                                    iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                                    i4++;
                                }
                                zzho.zzc(new String(iArr3, 0, i4) + jCurrentTimeMillis2 + C1561oA.Kd("\u0016\u001d", (short) (C1580rY.Xd() ^ (-18422))));
                                return;
                            }
                            zzho.zze(Wg.Zd("#`\u0014yR\u0015Oq%Q\ndhQIy.F\t1\u0011H;a*\r2-WVl\u0015Jf!d68r\u0013\tt/;;6i\u001aAoWS\u00027\u0010\u00037X\u0007Pvc\u000b\u00024S\u00189c\n\u0015v3\u001cF1l[=", (short) (OY.Xd() ^ 17648), (short) (OY.Xd() ^ 25776)));
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            } finally {
                this.zzp = true;
            }
        }
    }

    final void zzn(Uri uri) {
        this.zzg.execute(new zzjb(this, uri));
    }
}
