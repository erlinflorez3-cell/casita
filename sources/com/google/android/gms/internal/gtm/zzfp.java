package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;
import com.npmdavi.davinotification.Constant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfp {
    private static Boolean zza = null;
    private final Handler zzb;
    private final Context zzc;

    public zzfp(Context context) {
        Preconditions.checkNotNull(context);
        this.zzc = context;
        this.zzb = new zzgc();
    }

    public static boolean zzh(Context context) {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        String strZd = C1593ug.zd("HUT\u0016PYZSYS\u001dQ_Vec^Z%_fm)]k_kyukfw3Guiu\u0004\u007fup\u0002bu\u0004\t|wz", (short) (C1580rY.Xd() ^ (-28165)), (short) (C1580rY.Xd() ^ (-24483)));
        boolean z2 = false;
        short sXd = (short) (FB.Xd() ^ 18272);
        int[] iArr = new int["\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVj\u0016\u0014\u0019\t\u001b\u0016".length()];
        QB qb = new QB("\u0019%\u001a'#\u001c\u0016^\u0013\u001e\u001c!\u0011\u0019\u001eVj\u0016\u0014\u0019\t\u001b\u0016");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (C1580rY.Xd() ^ (-1321));
            int[] iArr2 = new int["\u0019\u0018(\u0005\u0017\u001a#\u001a! \t\u001e, '&4".length()];
            QB qb2 = new QB("\u0019\u0018(\u0005\u0017\u001a#\u001a! \t\u001e, '&4");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                ComponentName componentName = new ComponentName(context, strZd);
                Class<?> cls2 = Class.forName(Wg.Zd("\u0016T|p LmI\u0011bs\f#^\u000f6+q@t\u0010`zv/^lr*k\u0004\f'", (short) (C1607wl.Xd() ^ 27148), (short) (C1607wl.Xd() ^ 16226)));
                Class<?>[] clsArr2 = new Class[2];
                short sXd3 = (short) (ZN.Xd() ^ 28128);
                int[] iArr3 = new int["\u0019'\u001e-+&\"l#007)3:t\u000b87;;;3=D\u001f3@9".length()];
                QB qb3 = new QB("\u0019'\u001e-+&\"l#007)3:t\u000b87;;;3=D\u001f3@9");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i4));
                    i4++;
                }
                clsArr2[0] = Class.forName(new String(iArr3, 0, i4));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {componentName, 0};
                short sXd4 = (short) (FB.Xd() ^ 2049);
                int[] iArr4 = new int["ebtR_krdYZAeX`".length()];
                QB qb4 = new QB("ebtR_krdYZAeX`");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((sXd4 ^ i5) + xuXd4.CK(iKK4));
                    i5++;
                }
                Method method2 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                try {
                    method2.setAccessible(true);
                    ServiceInfo serviceInfo = (ServiceInfo) method2.invoke(packageManager, objArr2);
                    if (serviceInfo != null && serviceInfo.enabled) {
                        z2 = true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z2);
        return z2;
    }

    public final int zza(Intent intent, int i2, final int i3) {
        try {
            synchronized (zzfk.zza) {
                WakeLock wakeLock = zzfk.zzb;
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
            }
        } catch (SecurityException unused) {
        }
        zzbx zzbxVarZzg = zzbx.zzg(this.zzc);
        final zzfd zzfdVarZzm = zzbxVarZzg.zzm();
        if (intent == null) {
            zzfdVarZzm.zzQ("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzbxVarZzg.zzj();
        zzfdVarZzm.zzP("Local AnalyticsService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(i3, zzfdVarZzm);
                }
            });
        }
        return 2;
    }

    final /* synthetic */ void zzc(int i2, zzfd zzfdVar) {
        if (((zzfo) this.zzc).callServiceStopSelfResult(i2)) {
            zzfdVar.zzN("Local AnalyticsService processed last dispatch request");
        }
    }

    final /* synthetic */ void zzd(zzfd zzfdVar, JobParameters jobParameters) {
        zzfdVar.zzN("AnalyticsJobService processed last dispatch request");
        ((zzfo) this.zzc).zza(jobParameters, false);
    }

    public final void zze() {
        zzbx zzbxVarZzg = zzbx.zzg(this.zzc);
        zzfd zzfdVarZzm = zzbxVarZzg.zzm();
        zzbxVarZzg.zzj();
        zzfdVarZzm.zzN("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbx zzbxVarZzg = zzbx.zzg(this.zzc);
        zzfd zzfdVarZzm = zzbxVarZzg.zzm();
        zzbxVarZzg.zzj();
        zzfdVarZzm.zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbx.zzg(this.zzc).zzf().zze(new zzfn(this, runnable));
    }

    public final boolean zzi(final JobParameters jobParameters) {
        zzbx zzbxVarZzg = zzbx.zzg(this.zzc);
        final zzfd zzfdVarZzm = zzbxVarZzg.zzm();
        String string = jobParameters.getExtras().getString(Constant.NOTIFICATION_DETAILS_ACTION);
        zzbxVarZzg.zzj();
        zzfdVarZzm.zzO("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzfdVarZzm, jobParameters);
            }
        });
        return true;
    }
}
