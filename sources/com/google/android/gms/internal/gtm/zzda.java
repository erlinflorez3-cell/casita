package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.npmdavi.davinotification.Constant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzda extends zzbu {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc;
    private Integer zzd;

    protected zzda(zzbx zzbxVar) throws Throwable {
        super(zzbxVar);
        Context contextZzo = zzo();
        String strYd = C1561oA.yd("\u0016 \u0018(&", (short) (ZN.Xd() ^ 22033));
        short sXd = (short) (C1607wl.Xd() ^ 23166);
        int[] iArr = new int["\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74".length()];
        QB qb = new QB("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = {strYd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\bV3]Q6\u0005A\u0017)\ta3\u0011X&", (short) (OY.Xd() ^ 15962), (short) (OY.Xd() ^ 10520)), Class.forName(Xg.qd("}u\fwE\u0005z\t\u0003Jp\u0013\u0012\n\u0010\n", (short) (C1633zX.Xd() ^ (-28655)), (short) (C1633zX.Xd() ^ (-13584)))));
        try {
            method.setAccessible(true);
            this.zzc = (AlarmManager) method.invoke(contextZzo, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final int zzf() throws Throwable {
        if (this.zzd == null) {
            Context contextZzo = zzo();
            Class<?> cls = Class.forName(ZO.xd("_b)~\u0002 G1d,\u0007R>!de\r\u0003\\H\u0016uO", (short) (C1499aX.Xd() ^ (-24218)), (short) (C1499aX.Xd() ^ (-29329))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 29397);
            short sXd2 = (short) (ZN.Xd() ^ 3951);
            int[] iArr = new int["j\u0010\u0010Q\u001d{\u001d'\u007f\u000fH\"_]".length()];
            QB qb = new QB("j\u0010\u0010Q\u001d{\u001d'\u007f\u000fH\"_]");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                this.zzd = Integer.valueOf(Ig.wd("dL\rs8Vs\u001dN", (short) (FB.Xd() ^ 32722)).concat(String.valueOf((String) method.invoke(contextZzo, objArr))).hashCode());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.zzd.intValue();
    }

    private final PendingIntent zzg() {
        Context contextZzo = zzo();
        return PendingIntent.getBroadcast(contextZzo, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfw.zza);
    }

    public final void zza() throws Throwable {
        this.zzb = false;
        try {
            this.zzc.cancel(zzg());
        } catch (NullPointerException unused) {
        }
        Context contextZzo = zzo();
        Object[] objArr = {EO.Od("6s\u0017B[\u0015oa\u0019NKt", (short) (FB.Xd() ^ 7685))};
        Method method = Class.forName(C1561oA.Qd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (FB.Xd() ^ 13902))).getMethod(C1561oA.od(".+9\u0017<55%,\u0011\".1#\u001c\u001d", (short) (C1499aX.Xd() ^ (-29734))), Class.forName(C1593ug.zd("WOeQ\u001f^Tb\\$Jlkcic", (short) (FB.Xd() ^ 9558), (short) (FB.Xd() ^ 23092))));
        try {
            method.setAccessible(true);
            JobScheduler jobScheduler = (JobScheduler) method.invoke(contextZzo, objArr);
            int iZzf = zzf();
            zzO(C1561oA.Kd("\"AOEHPQOUO\tTZN\u001b\u000e9_S;7", (short) (C1633zX.Xd() ^ (-15561))), Integer.valueOf(iZzf));
            jobScheduler.cancel(iZzf);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void zzb() throws Throwable {
        zzV();
        Preconditions.checkState(this.zza, "Receiver not registered");
        zzw();
        long jZzd = zzcv.zzd();
        if (jZzd > 0) {
            zza();
            zzC().elapsedRealtime();
            this.zzb = true;
            ((Boolean) zzew.zzR.zzb()).booleanValue();
            zzN("Scheduling upload with JobScheduler");
            Context contextZzo = zzo();
            ComponentName componentName = new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsJobService");
            int iZzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo jobInfoBuild = new JobInfo.Builder(iZzf, componentName).setMinimumLatency(jZzd).setOverrideDeadline(jZzd + jZzd).setExtras(persistableBundle).build();
            zzO("Scheduling job. JobID", Integer.valueOf(iZzf));
            zzfx.zza(contextZzo, jobInfoBuild, "com.google.android.gms", "DispatchAlarm");
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() throws Throwable {
        try {
            zza();
            zzw();
            if (zzcv.zzd() > 0) {
                Context contextZzo = zzo();
                Class<?> cls = Class.forName(Wg.Zd("\f4\u0017\u0016\u007fcK\u0006(,\u0018\u000fl_R|~D3\"\b\fm", (short) (ZN.Xd() ^ 31674), (short) (ZN.Xd() ^ 16895)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (C1607wl.Xd() ^ 31573);
                int[] iArr = new int["IHX5GJSJQP9N\\PWVd".length()];
                QB qb = new QB("IHX5GJSJQP9N\\PWVd");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(contextZzo, objArr);
                    ComponentName componentName = new ComponentName(contextZzo, Wg.vd("P]\\\u001eXab[QK\u0015IWN][FB\rGNU\u0011EC7CQMC>O;O}q}\f\b}hyYmlot\u0003bp", (short) (OY.Xd() ^ 23951)));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-11541));
                    short sXd3 = (short) (C1580rY.Xd() ^ (-3335));
                    int[] iArr2 = new int["/;0=92,t)427'/4l.*i\u000b\u001b\u001c#\u0018\u001d\u001a\u0001\u0014 \u0012\u0017\u0014 ".length()];
                    QB qb2 = new QB("/;0=92,t)427'/4l.*i\u000b\u001b\u001c#\u0018\u001d\u001a\u0001\u0014 \u0012\u0017\u0014 ");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                        i3++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(hg.Vd("{\b|\n\u0006~xAu\u0001~\u0004s{\u00019MxuwusiqvOalc", (short) (ZN.Xd() ^ 28630), (short) (ZN.Xd() ^ 18392)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr2 = {componentName, 0};
                    Method method2 = cls2.getMethod(C1561oA.ud("NKY6HEFIUCO%I@H", (short) (C1607wl.Xd() ^ 6748)), clsArr2);
                    try {
                        method2.setAccessible(true);
                        ActivityInfo activityInfo = (ActivityInfo) method2.invoke(packageManager, objArr2);
                        if (activityInfo == null || !activityInfo.enabled) {
                            return;
                        }
                        short sXd4 = (short) (C1607wl.Xd() ^ 88);
                        int[] iArr3 = new int["{\u0010\u000b\u000e\u0017%\u0011\u001fQ%\u0015\u0018\u001f*(\u001a, \u001cX$..\\.2#\"2f(.=;)=17y".length()];
                        QB qb3 = new QB("{\u0010\u000b\u000e\u0017%\u0011\u001fQ%\u0015\u0018\u001f*(\u001a, \u001cX$..\\.2#\"2f(.=;)=17y");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
                            i4++;
                        }
                        zzN(new String(iArr3, 0, i4));
                        this.zza = true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}
