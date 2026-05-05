package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvf {
    private static zzaq zza = null;
    private static final zzat zzb = zzat.zzd("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzuw zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzvf(Context context, final SharedPrefManager sharedPrefManager, zzuw zzuwVar, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b", (short) (C1499aX.Xd() ^ (-26349)))).getMethod(Qg.kd("olzUefmbgdL^i`", (short) (C1499aX.Xd() ^ (-29471)), (short) (C1499aX.Xd() ^ (-28701))), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzc = (String) method.invoke(context, objArr);
            this.zzd = CommonUtils.getAppVersion(context);
            this.zzf = sharedPrefManager;
            this.zze = zzuwVar;
            zzwk.zza();
            this.zzi = str;
            this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb();
                }
            });
            MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
            Objects.requireNonNull(sharedPrefManager);
            this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return sharedPrefManager.getMlSdkInstanceId();
                }
            });
            zzat zzatVar = zzb;
            this.zzj = zzatVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzatVar.get(str)) : -1;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static long zza(List list, double d2) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d2 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized zzaq zzi() {
        zzaq zzaqVar = zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
        zzan zzanVar = new zzan();
        for (int i2 = 0; i2 < locales.size(); i2++) {
            zzanVar.zzb(CommonUtils.languageTagFromLocale(locales.get(i2)));
        }
        zzaq zzaqVarZzc = zzanVar.zzc();
        zza = zzaqVarZzc;
        return zzaqVarZzc;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzpb zzpbVar, long j2, long j3) {
        return this.zzk.get(zzpbVar) == null || j2 - ((Long) this.zzk.get(zzpbVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(zzuv zzuvVar, zzpb zzpbVar, String str) {
        zzuvVar.zzb(zzpbVar);
        String strZzd = zzuvVar.zzd();
        zzti zztiVar = new zzti();
        zztiVar.zzb(this.zzc);
        zztiVar.zzc(this.zzd);
        zztiVar.zzh(zzi());
        zztiVar.zzg(true);
        zztiVar.zzl(strZzd);
        zztiVar.zzj(str);
        zztiVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zztiVar.zzd(10);
        zztiVar.zzk(Integer.valueOf(this.zzj));
        zzuvVar.zzc(zztiVar);
        this.zze.zza(zzuvVar);
    }

    public final void zzd(zzuv zzuvVar, zzpb zzpbVar) {
        zze(zzuvVar, zzpbVar, zzj());
    }

    public final void zze(final zzuv zzuvVar, final zzpb zzpbVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzva
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzuvVar, zzpbVar, str);
            }
        });
    }

    final /* synthetic */ void zzf(zzpb zzpbVar, com.google.mlkit.vision.objects.defaults.internal.zzd zzdVar) {
        zzaw zzawVar = (zzaw) this.zzl.get(zzpbVar);
        if (zzawVar != null) {
            for (Object obj : zzawVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzawVar.zzc(obj));
                Collections.sort(arrayList);
                zzoa zzoaVar = new zzoa();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zzoaVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzoaVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzoaVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzoaVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzoaVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzoaVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zzoc zzocVarZzg = zzoaVar.zzg();
                int size = arrayList.size();
                zzpc zzpcVar = new zzpc();
                zzpcVar.zze(zzoz.TYPE_THICK);
                zzej zzejVar = new zzej();
                zzejVar.zza(Integer.valueOf(size));
                zzejVar.zzc((zzem) obj);
                zzejVar.zzb(zzocVarZzg);
                zzpcVar.zzd(zzejVar.zze());
                zze(zzvi.zzf(zzpcVar), zzpbVar, zzj());
            }
            this.zzl.remove(zzpbVar);
        }
    }

    final /* synthetic */ void zzg(final zzpb zzpbVar, Object obj, long j2, final com.google.mlkit.vision.objects.defaults.internal.zzd zzdVar) {
        if (!this.zzl.containsKey(zzpbVar)) {
            this.zzl.put(zzpbVar, zzu.zzp());
        }
        ((zzaw) this.zzl.get(zzpbVar)).zzm(obj, Long.valueOf(j2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzpbVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzpbVar, Long.valueOf(jElapsedRealtime));
            MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzvb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(zzpbVar, zzdVar);
                }
            });
        }
    }

    public final void zzh(com.google.mlkit.vision.objects.defaults.internal.zzc zzcVar, zzpb zzpbVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzpbVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzpbVar, Long.valueOf(jElapsedRealtime));
            zze(zzcVar.zza(), zzpbVar, zzj());
        }
    }
}
