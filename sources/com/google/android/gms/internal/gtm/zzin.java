package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zzin extends zzig {
    private static final Object zza = new Object();
    private static zzin zzb = null;
    private Context zzc;
    private zzhg zzd;
    private volatile zzhd zze;
    private zzij zzj;
    private zzhp zzk;
    private boolean zzf = true;
    private boolean zzg = false;
    private boolean zzh = false;
    private boolean zzi = true;
    private final zzih zzm = new zzih(this);
    private boolean zzl = false;

    private zzin() {
    }

    public static zzin zzf() {
        if (zzb == null) {
            zzb = new zzin();
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzn() {
        return this.zzl || !this.zzi;
    }

    @Override // com.google.android.gms.internal.gtm.zzig
    public final synchronized void zza() {
        if (zzn()) {
            return;
        }
        this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzig
    public final synchronized void zzb(boolean z2) {
        zzk(this.zzl, z2);
    }

    final synchronized zzhg zze() {
        if (this.zzd == null) {
            if (this.zzc == null) {
                throw new IllegalStateException(Qg.kd("!>JOy@=Ku6sFF@B4mB:7/<;f=*c+#7%^\u001f\\\u001f*(-\u001d/*", (short) (Od.Xd() ^ (-23084)), (short) (Od.Xd() ^ (-26642))));
            }
            this.zzd = new zzhs(this.zzm, this.zzc);
        }
        if (this.zzj == null) {
            zzim zzimVar = new zzim(this, null);
            this.zzj = zzimVar;
            zzimVar.zzc(1800000L);
        }
        this.zzg = true;
        if (this.zzf) {
            zzi();
            this.zzf = false;
        }
        if (this.zzk == null) {
            zzhp zzhpVar = new zzhp(this);
            this.zzk = zzhpVar;
            Context context = this.zzc;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(hg.Vd("T`Ub^WQ\u001aYO]\u0016JUSR\u0011%0.-# 0$0\",05\u0018\u001c\u0014 \u0018\u0015", (short) (OY.Xd() ^ 20404), (short) (OY.Xd() ^ 28218)));
            ContextCompat.registerReceiver(context, zzhpVar, intentFilter, 4);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(C1561oA.ud(",74s,32)-%l\u001f+\u001d'3-!\u001a)b\u0006suy~\u000e}{\u0003o{mk", (short) (Od.Xd() ^ (-20844))));
            short sXd = (short) (Od.Xd() ^ (-9729));
            int[] iArr = new int["(6)8:5-w\"/+2(25o\u001aGCJ@TM".length()];
            QB qb = new QB("(6)8:5-w\"/+2(25o\u001aGCJ@TM");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("~}\u000ej|\u007f\t\u007f\u0007\u0006o\u0004\u0011\n", (short) (Od.Xd() ^ (-12164))), new Class[0]);
            try {
                method.setAccessible(true);
                intentFilter2.addCategory((String) method.invoke(context, objArr));
                ContextCompat.registerReceiver(context, zzhpVar, intentFilter2, 4);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return this.zzd;
    }

    public final synchronized void zzi() {
        if (!this.zzg) {
            zzho.zzd("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.zzf = true;
        } else {
            if (this.zzh) {
                return;
            }
            this.zzh = true;
            this.zze.zza(new zzii(this));
        }
    }

    final synchronized void zzj(Context context, zzhd zzhdVar) {
        if (this.zzc != null) {
            return;
        }
        short sXd = (short) (ZN.Xd() ^ 113);
        short sXd2 = (short) (ZN.Xd() ^ 25195);
        int[] iArr = new int["\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74".length()];
        QB qb = new QB("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("Cd\bq\u0002\u001e-F!<c\u007f^qc4\f%2j?", (short) (ZN.Xd() ^ 17327), (short) (ZN.Xd() ^ 24600)), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzc = (Context) method.invoke(context, objArr);
            if (this.zze == null) {
                this.zze = zzhdVar;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    final synchronized void zzk(boolean z2, boolean z3) {
        boolean zZzn = zzn();
        this.zzl = z2;
        this.zzi = z3;
        if (zzn() != zZzn) {
            if (zzn()) {
                this.zzj.zza();
                zzho.zzd("PowerSaveMode initiated.");
            } else {
                this.zzj.zzc(1800000L);
                zzho.zzd("PowerSaveMode terminated.");
            }
        }
    }
}
