package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

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
import yg.C1561oA;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class zztt {
    private static zzav zza = null;
    private static final zzax zzb = zzax.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zztk zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zztt(Context context, final SharedPrefManager sharedPrefManager, zztk zztkVar, String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd(">LCRPKG\u0012HUU\\NX_\u001a0]]dVjg", (short) (ZN.Xd() ^ 30004))).getMethod(Wg.vd(":9E\"8;@721\u0017+<5", (short) (C1499aX.Xd() ^ (-25399))), new Class[0]);
        try {
            method.setAccessible(true);
            this.zzc = (String) method.invoke(context, objArr);
            this.zzd = CommonUtils.getAppVersion(context);
            this.zzf = sharedPrefManager;
            this.zze = zztkVar;
            zzuf.zza();
            this.zzi = str;
            this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb();
                }
            });
            MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
            Objects.requireNonNull(sharedPrefManager);
            this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return sharedPrefManager.getMlSdkInstanceId();
                }
            });
            zzax zzaxVar = zzb;
            this.zzj = zzaxVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzaxVar.get(str)) : -1;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static long zza(List list, double d2) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d2 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized zzav zzi() {
        zzav zzavVar = zza;
        if (zzavVar != null) {
            return zzavVar;
        }
        LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
        zzas zzasVar = new zzas();
        for (int i2 = 0; i2 < locales.size(); i2++) {
            zzasVar.zza(CommonUtils.languageTagFromLocale(locales.get(i2)));
        }
        zzav zzavVarZzb = zzasVar.zzb();
        zza = zzavVarZzb;
        return zzavVarZzb;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzoa zzoaVar, long j2, long j3) {
        return this.zzk.get(zzoaVar) == null || j2 - ((Long) this.zzk.get(zzoaVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(zztj zztjVar, zzoa zzoaVar, String str) {
        zztjVar.zzb(zzoaVar);
        String strZzd = zztjVar.zzd();
        zzsj zzsjVar = new zzsj();
        zzsjVar.zzb(this.zzc);
        zzsjVar.zzc(this.zzd);
        zzsjVar.zzh(zzi());
        zzsjVar.zzg(true);
        zzsjVar.zzl(strZzd);
        zzsjVar.zzj(str);
        zzsjVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzsjVar.zzd(10);
        zzsjVar.zzk(Integer.valueOf(this.zzj));
        zztjVar.zzc(zzsjVar);
        this.zze.zza(zztjVar);
    }

    public final void zzd(zztj zztjVar, zzoa zzoaVar) {
        zze(zztjVar, zzoaVar, zzj());
    }

    public final void zze(final zztj zztjVar, final zzoa zzoaVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzto
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zztjVar, zzoaVar, str);
            }
        });
    }

    final /* synthetic */ void zzf(zzoa zzoaVar, com.google.mlkit.vision.objects.custom.internal.zzd zzdVar) {
        zzba zzbaVar = (zzba) this.zzl.get(zzoaVar);
        if (zzbaVar != null) {
            for (Object obj : zzbaVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzbaVar.zzc(obj));
                Collections.sort(arrayList);
                zzmz zzmzVar = new zzmz();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                zzmzVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzmzVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzmzVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzmzVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzmzVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzmzVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zznb zznbVarZzg = zzmzVar.zzg();
                int size = arrayList.size();
                zzob zzobVar = new zzob();
                zzobVar.zze(zzny.TYPE_THICK);
                zzdi zzdiVar = new zzdi();
                zzdiVar.zza(Integer.valueOf(size));
                zzdiVar.zzc((zzdl) obj);
                zzdiVar.zzb(zznbVarZzg);
                zzobVar.zzd(zzdiVar.zze());
                zze(zztw.zzf(zzobVar), zzoaVar, zzj());
            }
            this.zzl.remove(zzoaVar);
        }
    }

    final /* synthetic */ void zzg(final zzoa zzoaVar, Object obj, long j2, final com.google.mlkit.vision.objects.custom.internal.zzd zzdVar) {
        if (!this.zzl.containsKey(zzoaVar)) {
            this.zzl.put(zzoaVar, zzz.zzp());
        }
        ((zzba) this.zzl.get(zzoaVar)).zzm(obj, Long.valueOf(j2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzoaVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzoaVar, Long.valueOf(jElapsedRealtime));
            MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zztp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf(zzoaVar, zzdVar);
                }
            });
        }
    }

    public final void zzh(com.google.mlkit.vision.objects.custom.internal.zzc zzcVar, zzoa zzoaVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzoaVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzoaVar, Long.valueOf(jElapsedRealtime));
            zze(zzcVar.zza(), zzoaVar, zzj());
        }
    }
}
