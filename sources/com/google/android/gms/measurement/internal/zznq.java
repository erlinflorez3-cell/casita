package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import com.npmdavi.davinotification.Constant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.dataflow.qual.Pure;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zznq extends zznr {
    private final AlarmManager zza;
    private zzav zzb;
    private Integer zzc;

    protected zznq(zznv zznvVar) throws Throwable {
        super(zznvVar);
        Context contextZza = zza();
        String strUd = C1561oA.ud("gqeuo", (short) (C1580rY.Xd() ^ (-2465)));
        short sXd = (short) (OY.Xd() ^ 31579);
        int[] iArr = new int["}\n~\f\u0010\t\u0003K\b\u0013\u0011\u0016\u000e\u0016\u001bSOzx}u\b\u0003".length()];
        QB qb = new QB("}\n~\f\u0010\t\u0003K\b\u0013\u0011\u0016\u000e\u0016\u001bSOzx}u\b\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = {strUd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("LK[;b]_QZATbg[VY", (short) (OY.Xd() ^ 11383), (short) (OY.Xd() ^ 13539)), Class.forName(C1561oA.Yd("'\u001f5!n.$2,s\u001a<;393", (short) (C1633zX.Xd() ^ (-10946)))));
        try {
            method.setAccessible(true);
            this.zza = (AlarmManager) method.invoke(contextZza, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final int zzv() throws Throwable {
        if (this.zzc == null) {
            Context contextZza = zza();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("&q\"v/g-0,r1\u0002){<4\u0015wA\u00060\u000e@", (short) (C1499aX.Xd() ^ (-26029)), (short) (C1499aX.Xd() ^ (-3720)))).getMethod(ZO.xd("du\u0002NI }T(A@n\u0004\t", (short) (Od.Xd() ^ (-6336)), (short) (Od.Xd() ^ (-8682))), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(contextZza, objArr);
                short sXd = (short) (C1633zX.Xd() ^ (-16400));
                short sXd2 = (short) (C1633zX.Xd() ^ (-6531));
                int[] iArr = new int["e`TMv\u007f^\u000fpyH".length()];
                QB qb = new QB("e`TMv\u007f^\u000fpyH");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                    i2++;
                }
                this.zzc = Integer.valueOf((new String(iArr, 0, i2) + str).hashCode());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzw() {
        Context contextZza = zza();
        return com.google.android.gms.internal.measurement.zzcw.zza(contextZza, 0, new Intent().setClassName(contextZza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcw.zza);
    }

    private final zzav zzx() {
        if (this.zzb == null) {
            this.zzb = new zznp(this, this.zzg.zzk());
        }
        return this.zzb;
    }

    private final void zzy() throws Throwable {
        Context contextZza = zza();
        String strWd = Ig.wd("\u0011^/ v7P\u0007E8\u001b\u0002", (short) (ZN.Xd() ^ 8470));
        Class<?> cls = Class.forName(EO.Od("\fkc\u001a\u0007U$NFvk\u0018Wb8\u0018\u0002(_]\u0011`r", (short) (OY.Xd() ^ 29703)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (-31839));
        int[] iArr = new int["4*>(s1%1)n\u001330&*\"".length()];
        QB qb = new QB("4*>(s1%1)n\u001330&*\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strWd};
        Method method = cls.getMethod(C1593ug.zd("\u000e\r\u001d|$\u001f!\u0013\u001c\u0003\u0016$)\u001d\u0018\u001b", (short) (ZN.Xd() ^ 30726), (short) (ZN.Xd() ^ 28303)), clsArr);
        try {
            method.setAccessible(true);
            JobScheduler jobScheduler = (JobScheduler) method.invoke(contextZza, objArr);
            if (jobScheduler != null) {
                jobScheduler.cancel(zzv());
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final void zza(long j2) {
        zzal();
        Context contextZza = zza();
        if (!zzos.zza(contextZza)) {
            zzj().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzos.zza(contextZza, false)) {
            zzj().zzc().zza("Service not registered/enabled");
        }
        zzu();
        zzj().zzp().zza("Scheduling upload, millis", Long.valueOf(j2));
        zzb().elapsedRealtime();
        if (j2 < Math.max(0L, zzbh.zzy.zza(null).longValue()) && !zzx().zzc()) {
            zzx().zza(j2);
        }
        Context contextZza2 = zza();
        ComponentName componentName = new ComponentName(contextZza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzv = zzv();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzcv.zza(contextZza2, new JobInfo.Builder(iZzv, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() throws Throwable {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzw());
        }
        zzy();
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zzu() {
        zzal();
        zzj().zzp().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzw());
        }
        zzx().zza();
        zzy();
    }
}
