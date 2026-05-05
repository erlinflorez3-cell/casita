package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import yg.C1499aX;
import yg.C1626yg;
import yg.FB;
import yg.Ig;

/* JADX INFO: loaded from: classes8.dex */
public final class zzawp {
    private static final ExecutorService zza;
    private static final long zzb;
    private static final long zzc;
    private static zzawp zzd = null;
    private final zzawr zze;
    private final ExecutorService zzf;
    private final zzawq zzg;
    private final zzawz zzh;
    private final long zzi;
    private final long zzj;
    private final Object zzk;
    private final zzaxg zzl;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1626yg.Ud("!F\u0004\u000eB4{vRA)\u001c\u0006qh`L\u000ft\u0007t_e\u0013;\u0004hIat", (short) (FB.Xd() ^ NewHope.SENDA_BYTES), (short) (FB.Xd() ^ 24662))).getDeclaredMethod(Ig.wd("v:\u001c]!i\u0005\u0017e*:(hde*%\u0006Y!e?h", (short) (C1499aX.Xd() ^ (-27001))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            zza = (ExecutorService) declaredMethod.invoke(null, objArr);
            zzb = TimeUnit.DAYS.toSeconds(7L);
            zzc = TimeUnit.HOURS.toSeconds(12L);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private zzawp(zzaxg zzaxgVar, ExecutorService executorService, zzawr zzawrVar, zzawq zzawqVar, long j2, long j3) {
        zzaxb zzaxbVar = new zzaxb();
        this.zzk = new Object();
        this.zzl = zzaxgVar;
        this.zzf = executorService;
        this.zze = zzawrVar;
        this.zzh = zzaxbVar;
        this.zzg = zzawqVar;
        this.zzi = j2;
        this.zzj = j3;
    }

    public static synchronized zzawp zza(Context context) {
        if (zzd == null) {
            zzd = new zzawp(zzaxg.zzb(context), zza, new zzawr(context), new zzawq(), zzb, zzc);
        }
        return zzd;
    }

    public final Task zzb(final String str, final String str2, String str3, int i2) {
        String strZzj = zzawt.zza().zza().zzc().zzj();
        try {
            if (Integer.parseInt(strZzj) < 29) {
                return Tasks.forResult(null);
            }
            final String str4 = "com.google.perception";
            final zzawy zzawyVar = new zzawy("com.google.perception", 2);
            zzawyVar.zzf();
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            final int i3 = 2;
            this.zzf.execute(new Runnable(str, str2, str4, i3, zzawyVar, taskCompletionSource) { // from class: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzawn
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ String zzd = "com.google.perception";
                public final /* synthetic */ zzawy zze;
                public final /* synthetic */ TaskCompletionSource zzf;

                {
                    this.zze = zzawyVar;
                    this.zzf = taskCompletionSource;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.zza.zzd(this.zzb, this.zzc, this.zzd, 2, this.zze, this.zzf);
                }
            });
            return taskCompletionSource.getTask();
        } catch (NumberFormatException e2) {
            String.format("Unable to parse OS version returned by the AndroidSystemInfoProvider '%s'", strZzj);
            return Tasks.forException(e2);
        }
    }

    public final zzbhx zzc(String str, String str2, String str3, int i2) {
        zzawy zzawyVar = new zzawy("com.google.perception", 2);
        zzawyVar.zzf();
        try {
            return this.zze.zza(str, str2, "com.google.perception", 2, zzawyVar, this.zzi);
        } finally {
            zzawyVar.zze();
            this.zzg.zzb(zzawyVar);
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0069: INVOKE 
  (r1 I:com.google.android.gms.internal.mlkit_vision_internal_vkp.zzawy)
  (r3 I:com.google.android.gms.internal.mlkit_vision_internal_vkp.zzags)
 VIRTUAL call: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzawy.zzd(com.google.android.gms.internal.mlkit_vision_internal_vkp.zzags):void A[Catch: all -> 0x0078, MD:(com.google.android.gms.internal.mlkit_vision_internal_vkp.zzags):void (m)], block:B:21:0x0067 */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0079: INVOKE (r1 I:com.google.android.gms.internal.mlkit_vision_internal_vkp.zzawy) VIRTUAL call: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzawy.zze():void A[MD:():void (m)], block:B:25:0x0079 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x006c: INVOKE (r2 I:com.google.android.gms.tasks.TaskCompletionSource), (r4 I:java.lang.Exception) VIRTUAL call: com.google.android.gms.tasks.TaskCompletionSource.setException(java.lang.Exception):void A[Catch: all -> 0x0078, MD:(java.lang.Exception):void (m), TRY_LEAVE], block:B:21:0x0067 */
    final /* synthetic */ void zzd(String str, String str2, String str3, int i2, zzawy zzawyVar, TaskCompletionSource taskCompletionSource) throws Throwable {
        zzawy zzawyVarZzd;
        TaskCompletionSource exception;
        zzawy zzawyVarZze;
        zzaxc zzaxcVarZza;
        zzbhx zzbhxVarZza;
        try {
            try {
                zzawyVarZzd = zzawyVar;
                zzbhx zzbhxVarZza2 = this.zze.zza(str, str2, "com.google.perception", 2, zzawyVarZzd, this.zzj);
                if (zzbhxVarZza2 != null) {
                    taskCompletionSource.setResult(zzbhxVarZza2);
                } else {
                    zzaws zzawsVarZza = zzawt.zza();
                    synchronized (this.zzk) {
                        this.zzl.zzc();
                        zzaxcVarZza = this.zzl.zza();
                    }
                    zzawo zzawoVar = new zzawo(zzawyVarZzd, str, str2, "com.google.perception", 2, zzawsVarZza, zzaxcVarZza, this.zzh, this.zzg);
                    if (zzaym.zza(zzawoVar)) {
                        zzbhxVarZza = zzawoVar.zza();
                        this.zze.zzc(zzbhxVarZza, str, str2, "com.google.perception", 2, zzawyVarZzd);
                    } else {
                        zzawyVarZzd.zzd(zzags.RPC_EXPONENTIAL_BACKOFF_FAILED);
                        zzbhxVarZza = null;
                    }
                    taskCompletionSource.setResult(zzbhxVarZza);
                }
            } catch (IOException | InterruptedException e2) {
                zzawyVarZzd.zzd(zzags.RPC_ERROR);
                exception.setException(e2);
            }
            zzawyVarZzd.zze();
            this.zzg.zzb(zzawyVarZzd);
        } catch (Throwable th) {
            zzawyVarZze.zze();
            this.zzg.zzb(zzawyVarZze);
            throw th;
        }
    }
}
