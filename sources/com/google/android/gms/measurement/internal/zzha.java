package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzje;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zzha extends zzjd {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzhe zzb;
    public final zzhb zzc;
    public final zzhb zzd;
    public final zzhd zze;
    public final zzhb zzf;
    public final zzgz zzg;
    public final zzhd zzh;
    public final zzhc zzi;
    public final zzgz zzj;
    public final zzhb zzk;
    public final zzhb zzl;
    public boolean zzm;
    public zzgz zzn;
    public zzgz zzo;
    public zzhb zzp;
    public final zzhd zzq;
    public final zzhd zzr;
    public final zzhb zzs;
    public final zzhc zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    zzha(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzw = new Object();
        this.zzf = new zzhb(this, "session_timeout", 1800000L);
        this.zzg = new zzgz(this, "start_new_session", true);
        this.zzk = new zzhb(this, "last_pause_time", 0L);
        this.zzl = new zzhb(this, "session_id", 0L);
        this.zzh = new zzhd(this, "non_personalized_ads", null);
        this.zzi = new zzhc(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgz(this, "allow_remote_dynamite", false);
        this.zzc = new zzhb(this, "first_open_time", 0L);
        this.zzd = new zzhb(this, "app_install_time", 0L);
        this.zze = new zzhd(this, "app_instance_id", null);
        this.zzn = new zzgz(this, "app_backgrounded", false);
        this.zzo = new zzgz(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzhb(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzhd(this, "firebase_feature_rollouts", null);
        this.zzr = new zzhd(this, "deferred_attribution_cache", null);
        this.zzs = new zzhb(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzhc(this, "default_event_parameters", null);
    }

    final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzo().zza(zzje.zza.AD_STORAGE)) {
            return new Pair<>("", false);
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && jElapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = jElapsedRealtime + zze().zzd(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzy = id;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e2) {
            zzj().zzc().zza("Unable to get advertising id", e2);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    final void zza(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.zzi.zza(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
            jArr[i2] = sparseArray.valueAt(i2).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.zzi.zza(bundle);
    }

    final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void zza(boolean z2) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("use_service", z2);
        editorEdit.apply();
    }

    final boolean zza(int i2) {
        return zzje.zza(i2, zzg().getInt("consent_source", 100));
    }

    final boolean zza(long j2) {
        return j2 - this.zzf.zza() > this.zzk.zza();
    }

    final boolean zza(zzax zzaxVar) {
        zzt();
        if (!zzje.zza(zzaxVar.zza(), zzn().zza())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("dma_consent_settings", zzaxVar.zzf());
        editorEdit.apply();
        return true;
    }

    final boolean zza(zzje zzjeVar) {
        zzt();
        int iZza = zzjeVar.zza();
        if (!zza(iZza)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("consent_settings", zzjeVar.zzf());
        editorEdit.putInt("consent_source", iZza);
        editorEdit.apply();
        return true;
    }

    protected final boolean zza(zznm zznmVar) {
        zzt();
        String string = zzg().getString("stored_tcf_param", "");
        String strZzc = zznmVar.zzc();
        if (strZzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("stored_tcf_param", strZzc);
        editorEdit.apply();
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.measurement.internal.zzhe.<init>(com.google.android.gms.measurement.internal.zzha, java.lang.String, long, com.google.android.gms.measurement.internal.zzhg):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:298)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:197)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // com.google.android.gms.measurement.internal.zzjd
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull.List({@org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.preferences"}), @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.monitoringSample"})})
    protected final void zzaa() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzha.zzaa():void");
    }

    final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    final void zzb(String str) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void zzb(boolean z2) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    protected final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                if (this.zzx == null) {
                    Context contextZza = zza();
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Xg.qd("kyp\u007f}xt?u\u0003\u0003\n{\u0006\rG]\u000b\u000b\u0012\u0004\u0018\u0015", (short) (Od.Xd() ^ (-10271)), (short) (Od.Xd() ^ (-7401)))).getMethod(Jg.Wd("\u000b'\u001aB5$0\u0013~I\u00162$\t", (short) (C1607wl.Xd() ^ 18742), (short) (C1607wl.Xd() ^ 31840)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        String str = ((String) method.invoke(contextZza, objArr)) + ZO.xd("\u001247Q}mjZKp/`", (short) (C1580rY.Xd() ^ (-16198)), (short) (C1580rY.Xd() ^ (-29681)));
                        zzj().zzp().zza(C1626yg.Ud("N}K)+\u0005\\\nN\u0002OI`_jt\"\u0001", (short) (OY.Xd() ^ 18718), (short) (OY.Xd() ^ 25729)), str);
                        Context contextZza2 = zza();
                        Class<?> cls = Class.forName(Ig.wd("` D}*\u007fJkj\u001a\u0013\u001fAXFa.x\u001fi\u0014b8", (short) (FB.Xd() ^ 31718)));
                        Class<?>[] clsArr = new Class[2];
                        short sXd = (short) (FB.Xd() ^ 7064);
                        int[] iArr = new int[">\u0006^0\u001e\u0001\u0018W\u0003<9~K6\u0019:".length()];
                        QB qb = new QB(">\u0006^0\u001e\u0001\u0018W\u0003<9~K6\u0019:");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                            i2++;
                        }
                        clsArr[0] = Class.forName(new String(iArr, 0, i2));
                        clsArr[1] = Integer.TYPE;
                        Object[] objArr2 = {str, 0};
                        Method method2 = cls.getMethod(C1561oA.Qd("\t\u0006\u0014q\u0006}\u000e\u007f}h\n{{y\u0006w\u007fst\u0002", (short) (C1633zX.Xd() ^ (-6477))), clsArr);
                        try {
                            method2.setAccessible(true);
                            this.zzx = (SharedPreferences) method2.invoke(contextZza2, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }
        }
        return this.zzx;
    }

    final void zzc(String str) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    protected final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return true;
    }

    final SparseArray<Long> zzm() {
        Bundle bundleZza = this.zzi.zza();
        if (bundleZza == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleZza.getIntArray("uriSources");
        long[] longArray = bundleZza.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            sparseArray.put(intArray[i2], Long.valueOf(longArray[i2]));
        }
        return sparseArray;
    }

    final zzax zzn() {
        zzt();
        return zzax.zza(zzg().getString("dma_consent_settings", null));
    }

    final zzje zzo() {
        zzt();
        return zzje.zza(zzg().getString("consent_settings", "G1"), zzg().getInt("consent_source", 100));
    }

    final Boolean zzp() {
        zzt();
        if (zzg().contains("use_service")) {
            return Boolean.valueOf(zzg().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean zzu() {
        zzt();
        if (zzg().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean zzv() {
        zzt();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String zzw() {
        zzt();
        String string = zzg().getString("previous_os_version", null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = zzg().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final String zzx() {
        zzt();
        return zzg().getString("admob_app_id", null);
    }

    final String zzy() {
        zzt();
        return zzg().getString("gmp_app_id", null);
    }

    final void zzz() {
        zzt();
        Boolean boolZzv = zzv();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolZzv != null) {
            zza(boolZzv);
        }
    }
}
