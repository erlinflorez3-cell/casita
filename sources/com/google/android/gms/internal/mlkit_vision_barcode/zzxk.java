package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzxk {
    private static final GmsLogger zzf = new GmsLogger("AutoZoom");
    final zzxm zza;
    final zzbw zzb;

    @Nullable
    ScheduledFuture zzc;

    @Nullable
    String zzd;
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private com.google.mlkit.vision.barcode.internal.zze zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zzbbVarZza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new SharedPrefManager(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.zzj = zzbbVarZza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzbbVarZza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            if (zzxkVar.zze != 2 || zzxkVar.zzg.get() || (scheduledFuture = zzxkVar.zzc) == null || scheduledFuture.isCancelled()) {
                return;
            }
            if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                zzf.i("AutoZoom", "Reset zoom = 1");
                zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f2) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f2;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f2) {
        float f3 = this.zzo;
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        return (f3 <= 0.0f || f2 <= f3) ? f2 : f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f2, float f3, @Nullable zzxn zzxnVar) {
        long jConvert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f2));
            zzuoVar.zzc(Float.valueOf(f3));
            synchronized (this.zzh) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(jConvert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z2) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            this.zzb.zzs();
            this.zzp = this.zzj.zza();
            if (z2 && (scheduledFuture = this.zzc) != null) {
                scheduledFuture.cancel(false);
                this.zzc = null;
            }
        }
    }

    public final long zza() {
        long jConvert;
        synchronized (this.zzh) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    final /* synthetic */ zzet zzc(float f2) throws Exception {
        com.google.mlkit.vision.barcode.internal.zze zzeVar = this.zzs;
        float fZzp = zzp(f2);
        ZoomSuggestionOptions zoomSuggestionOptions = zzeVar.zza;
        int i2 = com.google.mlkit.vision.barcode.internal.zzh.zzc;
        if (true != zoomSuggestionOptions.zzb().setZoom(fZzp)) {
            fZzp = 0.0f;
        }
        return zzej.zza(Float.valueOf(fZzp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0241 A[Catch: all -> 0x0260, TryCatch #0 {, blocks: (B:50:0x0186, B:52:0x0194, B:54:0x0197, B:55:0x01c3, B:57:0x01c9, B:60:0x01f1, B:62:0x0200, B:64:0x020f, B:66:0x021a, B:67:0x023f, B:69:0x0241, B:70:0x025e), top: B:80:0x0186, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(int r19, com.google.android.gms.internal.mlkit_vision_barcode.zzxn r20) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzxk.zzi(int, com.google.android.gms.internal.mlkit_vision_barcode.zzxn):void");
    }

    public final void zzj() {
        synchronized (this.zzh) {
            if (this.zze == 4) {
                return;
            }
            zzn(false);
            this.zzi.shutdown();
            this.zze = 4;
        }
    }

    public final void zzk(float f2) {
        synchronized (this.zzh) {
            zzaz.zzd(f2 >= 1.0f);
            this.zzo = f2;
        }
    }

    final void zzl(float f2, zzrc zzrcVar, @Nullable zzxn zzxnVar) {
        synchronized (this.zzh) {
            if (this.zzm == null || this.zzs == null || this.zze != 2) {
                return;
            }
            if (this.zzg.compareAndSet(false, true)) {
                zzej.zzb(zzej.zzc(new zzxh(this, f2), this.zzm), new zzxj(this, zzrcVar, this.zzn, zzxnVar, f2), zzeu.zza());
            }
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            int i2 = this.zze;
            if (i2 != 2 && i2 != 4) {
                zzr(true);
                this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzxk.zzf(this.zza);
                    }
                }, 500L, 500L, TimeUnit.MILLISECONDS);
                if (this.zze == 1) {
                    this.zzd = UUID.randomUUID().toString();
                    this.zzq = this.zzj.zza();
                    this.zzr = false;
                    zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                    float f2 = this.zzn;
                    zzq(zzrcVar, f2, f2, null);
                } else {
                    zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                    float f3 = this.zzn;
                    zzq(zzrcVar2, f3, f3, null);
                }
                this.zze = 2;
            }
        }
    }

    public final void zzn(boolean z2) {
        synchronized (this.zzh) {
            int i2 = this.zze;
            if (i2 != 1 && i2 != 4) {
                zzr(true);
                if (z2) {
                    if (!this.zzr) {
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f2 = this.zzn;
                        zzq(zzrcVar, f2, f2, null);
                    }
                    zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                    float f3 = this.zzn;
                    zzq(zzrcVar2, f3, f3, null);
                } else {
                    zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                    float f4 = this.zzn;
                    zzq(zzrcVar3, f4, f4, null);
                }
                this.zzr = false;
                this.zze = 1;
                this.zzd = null;
            }
        }
    }

    public final void zzo(com.google.mlkit.vision.barcode.internal.zze zzeVar, Executor executor) {
        this.zzs = zzeVar;
        this.zzm = executor;
    }
}
