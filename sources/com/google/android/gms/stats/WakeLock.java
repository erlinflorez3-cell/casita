package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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
public class WakeLock {
    private static final long zzb = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService zzc = null;
    private static final Object zzd = new Object();
    private static volatile zzd zze = new zzb();
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;
    private final PowerManager.WakeLock zzg;
    private int zzh;
    private Future<?> zzi;
    private long zzj;
    private final Set<zze> zzk;
    private boolean zzl;
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;
    private final Map<String, zzc> zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    public WakeLock(Context context, int i2, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u001c\u0010n|\u0013N3\u0019aB:uw\u0017Z\u0016l\\>5\t\u0002+", (short) (C1633zX.Xd() ^ (-30497)), (short) (C1633zX.Xd() ^ (-28764)))).getMethod(C1626yg.Ud("E\u001b\u0016@\u007f'pZ\bq\u00132!{", (short) (FB.Xd() ^ 27450), (short) (FB.Xd() ^ 17221)), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            this.zzf = new Object();
            this.zzh = 0;
            this.zzk = new HashSet();
            this.zzl = true;
            this.zzn = DefaultClock.getInstance();
            this.zzs = new HashMap();
            this.zzt = new AtomicInteger(0);
            Preconditions.checkNotNull(context, Ig.wd("X<Vm\u0004R0\u0016\"-t\u001dIGN| WjX\u0014b.z\u0005,r|\u0014yr\u0017([", (short) (C1633zX.Xd() ^ (-1036))));
            Preconditions.checkNotEmpty(str, EO.Od("2njE++;Cl\u0017l4\r\u0011oq\n$?\u001ba\u0006\u001egZ< o0\u0004\u0015^9^\u0019-Gn\u007fn", (short) (C1580rY.Xd() ^ (-25600))));
            short sXd = (short) (Od.Xd() ^ (-22472));
            int[] iArr = new int["-9.;70*r'205%-2j~*(-\u001d/*".length()];
            QB qb = new QB("-9.;70*r'205%-2j~*(-\u001d/*");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i3)).getMethod(C1593ug.zd("~}\u000e[\f\r\n\b\u0003\u0002\u0016\f\u0013\u0013h\u0016\u0016\u001d\u000f# ", (short) (C1499aX.Xd() ^ (-15090)), (short) (C1499aX.Xd() ^ (-22277))), new Class[0]);
            try {
                method2.setAccessible(true);
                this.zzr = (Context) method2.invoke(context, objArr2);
                this.zzq = str;
                this.zza = null;
                String strOd = C1561oA.od("0;8w076-1)p#/$1-& h!&+", (short) (ZN.Xd() ^ 29646));
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Kd("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")cy''. 41", (short) (Od.Xd() ^ (-31451)))).getMethod(Wg.Zd("\u000f\u0004\u0018<R\u000e\u001b\u001ad[\b$5c", (short) (C1499aX.Xd() ^ (-18539)), (short) (C1499aX.Xd() ^ (-24934))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    if (strOd.equals((String) method3.invoke(context, objArr3))) {
                        this.zzp = str;
                    } else {
                        String strValueOf = String.valueOf(str);
                        short sXd2 = (short) (FB.Xd() ^ 5802);
                        int[] iArr2 = new int["8vs\u0001\u0005x>O".length()];
                        QB qb2 = new QB("8vs\u0001\u0005x>O");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i4));
                            i4++;
                        }
                        String str3 = new String(iArr2, 0, i4);
                        this.zzp = strValueOf.length() != 0 ? str3.concat(strValueOf) : new String(str3);
                    }
                    String strVd = Wg.vd(" \u001e%\u0012&", (short) (C1580rY.Xd() ^ (-11715)));
                    Class<?> cls = Class.forName(Qg.kd("\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015Ma\r\u000b\u0010\u007f\u0012\r", (short) (ZN.Xd() ^ 7422), (short) (ZN.Xd() ^ 13952)));
                    Class<?>[] clsArr = {Class.forName(hg.Vd("\u0015\u000b\u001f\tT\u0012\u0006\u0012\nOs\u0014\u0011\u0007\u000b\u0003", (short) (C1580rY.Xd() ^ (-4254)), (short) (C1580rY.Xd() ^ (-27222))))};
                    Object[] objArr4 = {strVd};
                    short sXd3 = (short) (OY.Xd() ^ 2445);
                    int[] iArr3 = new int["\u007f|\u000bh\u000e\u0007\u0007v}bs\u007f\u0003tmn".length()];
                    QB qb3 = new QB("\u007f|\u000bh\u000e\u0007\u0007v}bs\u007f\u0003tmn");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(sXd3 + i5 + xuXd3.CK(iKK3));
                        i5++;
                    }
                    Method method4 = cls.getMethod(new String(iArr3, 0, i5), clsArr);
                    try {
                        method4.setAccessible(true);
                        PowerManager powerManager = (PowerManager) method4.invoke(context, objArr4);
                        if (powerManager == null) {
                            StringBuilder sb = new StringBuilder(29);
                            sb.append((CharSequence) Xg.qd("\u0015)\"\u0018\u0017)\u001b\u001bW\u001aY)++j-5-.b6*,,:.8.1", (short) (C1633zX.Xd() ^ (-30086)), (short) (C1633zX.Xd() ^ (-16751))), 0, 29);
                            throw new zzi(sb.toString());
                        }
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i2, str);
                        this.zzg = wakeLockNewWakeLock;
                        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
                            if (Strings.isEmptyOrWhitespace(str2)) {
                                short sXd4 = (short) (OY.Xd() ^ 24342);
                                int[] iArr4 = new int["\u0011\u001f\u0012!\u001b\u0016\u000eX\u000b\u0018\u0014\u001b\t\u0013\u0016Pb\u0010\f\u0013\u0001\u0015\u000e".length()];
                                QB qb4 = new QB("\u0011\u001f\u0012!\u001b\u0016\u000eX\u000b\u0018\u0014\u001b\t\u0013\u0016Pb\u0010\f\u0013\u0001\u0015\u000e");
                                int i6 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd4 ^ i6));
                                    i6++;
                                }
                                Object[] objArr5 = new Object[0];
                                Method method5 = Class.forName(new String(iArr4, 0, i6)).getMethod(C1561oA.Yd("SRb?QT]T[ZDXe^", (short) (C1607wl.Xd() ^ 24168)), new Class[0]);
                                try {
                                    method5.setAccessible(true);
                                    str2 = (String) method5.invoke(context, objArr5);
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, str2);
                            this.zzo = workSourceFromPackage;
                            if (workSourceFromPackage != null) {
                                zze(wakeLockNewWakeLock, workSourceFromPackage);
                            }
                        }
                        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = zzc;
                        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                            synchronized (zzd) {
                                scheduledExecutorServiceUnconfigurableScheduledExecutorService = zzc;
                                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                                    zzh.zza();
                                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                                    zzc = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                                }
                            }
                        }
                        this.zzu = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (InvocationTargetException e6) {
            throw e6.getCause();
        }
    }

    public static /* synthetic */ void zza(WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            if (wakeLock.isHeld()) {
                String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                wakeLock.zzc();
                if (wakeLock.isHeld()) {
                    wakeLock.zzh = 1;
                    wakeLock.zzd(0);
                }
            }
        }
    }

    private final String zzb(String str) {
        if (this.zzl) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    private final void zzd(int i2) {
        synchronized (this.zzf) {
            if (isHeld()) {
                if (this.zzl) {
                    int i3 = this.zzh - 1;
                    this.zzh = i3;
                    if (i3 > 0) {
                        return;
                    }
                } else {
                    this.zzh = 0;
                }
                zzc();
                Iterator<zzc> it = this.zzs.values().iterator();
                while (it.hasNext()) {
                    it.next().zza = 0;
                }
                this.zzs.clear();
                Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                    this.zzi = null;
                    this.zzj = 0L;
                }
                this.zzm = 0;
                if (this.zzg.isHeld()) {
                    try {
                        try {
                            this.zzg.release();
                            if (this.zza != null) {
                                this.zza = null;
                            }
                        } catch (Throwable th) {
                            if (this.zza != null) {
                                this.zza = null;
                            }
                            throw th;
                        }
                    } catch (RuntimeException e2) {
                        if (!e2.getClass().equals(RuntimeException.class)) {
                            throw e2;
                        }
                        String.valueOf(this.zzp).concat(" failed to release!");
                        if (this.zza != null) {
                            this.zza = null;
                        }
                    }
                } else {
                    String.valueOf(this.zzp).concat(" should be held!");
                }
            }
        }
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            e2.toString();
        }
    }

    public void acquire(long j2) {
        this.zzt.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, zzb), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.zzf) {
            if (!isHeld()) {
                this.zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                this.zzg.acquire();
                this.zzn.elapsedRealtime();
            }
            this.zzh++;
            this.zzm++;
            zzb(null);
            zzc zzcVar = this.zzs.get(null);
            if (zzcVar == null) {
                zzcVar = new zzc(null);
                this.zzs.put(null, zzcVar);
            }
            zzcVar.zza++;
            long jElapsedRealtime = this.zzn.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.zzj) {
                this.zzj = j3;
                Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzi = this.zzu.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        WakeLock.zza(this.zza);
                    }
                }, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean isHeld() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzh > 0;
        }
        return z2;
    }

    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            String.valueOf(this.zzp).concat(" release without a matched acquire!");
        }
        synchronized (this.zzf) {
            zzb(null);
            if (this.zzs.containsKey(null)) {
                zzc zzcVar = this.zzs.get(null);
                if (zzcVar != null) {
                    int i2 = zzcVar.zza - 1;
                    zzcVar.zza = i2;
                    if (i2 == 0) {
                        this.zzs.remove(null);
                    }
                }
            } else {
                String.valueOf(this.zzp).concat(" counter does not exist");
            }
            zzd(0);
        }
    }

    public void setReferenceCounted(boolean z2) {
        synchronized (this.zzf) {
            this.zzl = z2;
        }
    }
}
