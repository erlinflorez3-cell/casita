package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.material3.internal.CalendarModelKt;
import com.braze.models.FeatureFlag;
import com.dynatrace.android.agent.AdkSettings;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import io.sentry.protocol.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzcm extends zzbu {
    private boolean zza;
    private final zzcg zzb;
    private final zzfg zzc;
    private final zzfe zzd;
    private final zzce zze;
    private long zzf;
    private final zzcy zzg;
    private final zzcy zzh;
    private final zzfq zzi;
    private long zzj;
    private boolean zzk;

    protected zzcm(zzbx zzbxVar, zzby zzbyVar) {
        super(zzbxVar);
        Preconditions.checkNotNull(zzbyVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfe(zzbxVar);
        this.zzb = new zzcg(zzbxVar);
        this.zzc = new zzfg(zzbxVar);
        this.zze = new zzce(zzbxVar);
        this.zzi = new zzfq(zzC());
        this.zzg = new zzci(this, zzbxVar);
        this.zzh = new zzcj(this, zzbxVar);
    }

    private final void zzaf() throws Throwable {
        zzda zzdaVarZzy = zzy();
        if (zzdaVarZzy.zze()) {
            zzdaVarZzy.zza();
        }
    }

    private final void zzag() {
        if (this.zzg.zzh()) {
            zzN("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzah() throws Throwable {
        long jZzc;
        zzda zzdaVarZzy = zzy();
        if (zzdaVarZzy.zzc() && !zzdaVarZzy.zze()) {
            com.google.android.gms.analytics.zzr.zzh();
            zzV();
            try {
                jZzc = this.zzb.zzc();
            } catch (SQLiteException e2) {
                zzJ("Failed to get min/max hit times from local store", e2);
                jZzc = 0;
            }
            if (jZzc != 0) {
                long jAbs = Math.abs(zzC().currentTimeMillis() - jZzc);
                zzw();
                if (jAbs <= ((Long) zzew.zzn.zzb()).longValue()) {
                    zzw();
                    zzO("Dispatch alarm scheduled (ms)", Long.valueOf(zzcv.zzd()));
                    zzdaVarZzy.zzb();
                }
            }
        }
    }

    private final void zzai(zzbz zzbzVar, zzay zzayVar) {
        Preconditions.checkNotNull(zzbzVar);
        Preconditions.checkNotNull(zzayVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzt());
        zzaVar.zzc(zzbzVar.zzc());
        zzaVar.zzd(zzbzVar.zzf());
        com.google.android.gms.analytics.zzh zzhVarZza = zzaVar.zza();
        zzbg zzbgVar = (zzbg) zzhVarZza.zzb(zzbg.class);
        zzbgVar.zzk("data");
        zzbgVar.zzl(true);
        zzhVarZza.zzg(zzayVar);
        zzbb zzbbVar = (zzbb) zzhVarZza.zzb(zzbb.class);
        zzax zzaxVar = (zzax) zzhVarZza.zzb(zzax.class);
        for (Map.Entry entry : zzbzVar.zzd().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                zzaxVar.zzk(str2);
            } else if ("av".equals(str)) {
                zzaxVar.zzl(str2);
            } else if ("aid".equals(str)) {
                zzaxVar.zzi(str2);
            } else if ("aiid".equals(str)) {
                zzaxVar.zzj(str2);
            } else if ("uid".equals(str)) {
                zzbgVar.zzm(str2);
            } else {
                zzbbVar.zze(str, str2);
            }
        }
        zzG("Sending installation campaign to", zzbzVar.zzc(), zzayVar);
        zzhVarZza.zzj(zzA().zza());
        zzhVarZza.zzk();
    }

    private final boolean zzaj(String str) {
        return Wrappers.packageManager(zzo()).checkCallingOrSelfPermission(str) == 0;
    }

    static /* bridge */ /* synthetic */ void zzc(zzcm zzcmVar) {
        try {
            zzcmVar.zzb.zza();
            zzcmVar.zzad();
        } catch (SQLiteException e2) {
            zzcmVar.zzR("Failed to delete stale hits", e2);
        }
        zzcy zzcyVar = zzcmVar.zzh;
        zzcmVar.zzw();
        zzcyVar.zzg(CalendarModelKt.MillisecondsIn24Hours);
    }

    public final void zzY(long j2) {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (j2 < 0) {
            j2 = 0;
        }
        this.zzf = j2;
        zzad();
    }

    final void zzZ() {
        zzV();
        Preconditions.checkState(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().zzi(new zzck(this));
    }

    public final long zza() {
        long j2 = this.zzf;
        if (j2 != Long.MIN_VALUE) {
            return j2;
        }
        zzw();
        long jLongValue = ((Long) zzew.zzi.zzb()).longValue();
        zzfv zzfvVarZzB = zzB();
        zzfvVarZzB.zzV();
        if (!zzfvVarZzB.zzc) {
            return jLongValue;
        }
        zzfv zzfvVarZzB2 = zzB();
        zzfvVarZzB2.zzV();
        return ((long) zzfvVarZzB2.zzd) * 1000;
    }

    protected final void zzaa() {
        zzV();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        Context contextZza = zzt().zza();
        if (!zzfk.zzb(contextZza)) {
            zzQ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfp.zzh(contextZza)) {
            zzI("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzb(contextZza)) {
            zzQ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzaj("android.permission.ACCESS_NETWORK_STATE")) {
            zzI("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (!zzaj("android.permission.INTERNET")) {
            zzI("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzac();
        }
        if (zzfp.zzh(zzo())) {
            zzN("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzQ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzab()) {
                zzi();
            }
        }
        zzad();
    }

    public final void zzab() throws Throwable {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzE("Sync dispatching local hits");
        long j2 = this.zzj;
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (this.zzj != j2) {
                this.zzd.zzb();
            }
        } catch (Exception e2) {
            zzJ("Sync local dispatch failed", e2);
            zzad();
        }
    }

    public final void zzac() {
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        this.zzk = true;
        this.zze.zzc();
        zzad();
    }

    public final void zzad() {
        long jMin;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzab()) {
                    this.zzd.zzc();
                    zzag();
                    zzaf();
                    return;
                }
                if (!((Boolean) zzew.zzJ.zzb()).booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzag();
                        zzaf();
                        zzah();
                        return;
                    }
                }
                zzah();
                long jZza = zza();
                long jZzb = zzA().zzb();
                if (jZzb != 0) {
                    jMin = jZza - Math.abs(zzC().currentTimeMillis() - jZzb);
                    if (jMin <= 0) {
                        zzw();
                        jMin = Math.min(zzcv.zze(), jZza);
                    }
                } else {
                    zzw();
                    jMin = Math.min(zzcv.zze(), jZza);
                }
                zzO("Dispatch scheduled (ms)", Long.valueOf(jMin));
                if (!this.zzg.zzh()) {
                    this.zzg.zzg(jMin);
                    return;
                } else {
                    this.zzg.zze(Math.max(1L, jMin + this.zzg.zzb()));
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzag();
        zzaf();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected final boolean zzae() throws Throwable {
        boolean z2;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzN("Dispatching a batch of local hits");
        if (this.zze.zzg()) {
            z2 = false;
        } else {
            zzw();
            z2 = true;
        }
        boolean zZze = this.zzc.zze();
        if (z2 && !zZze) {
            zzN("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int iZzh = zzcv.zzh();
        zzw();
        long jMax = Math.max(iZzh, zzcv.zzg());
        ArrayList arrayList = new ArrayList();
        long jMax2 = 0;
        while (true) {
            try {
                this.zzb.zzm();
                arrayList.clear();
                try {
                    List listZzj = this.zzb.zzj(jMax);
                    if (listZzj.isEmpty()) {
                        zzN("Store is empty, nothing to dispatch");
                        zzag();
                        zzaf();
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                            return false;
                        } catch (SQLiteException e2) {
                            zzJ("Failed to commit local dispatch transaction", e2);
                            zzag();
                            zzaf();
                            return false;
                        }
                    }
                    zzO("Hits loaded from store. count", Integer.valueOf(listZzj.size()));
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        if (((zzez) it.next()).zzb() == jMax2) {
                            zzK("Database contains successfully uploaded hit", Long.valueOf(jMax2), Integer.valueOf(listZzj.size()));
                            zzag();
                            zzaf();
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e3) {
                                zzJ("Failed to commit local dispatch transaction", e3);
                                zzag();
                                zzaf();
                                return false;
                            }
                        }
                    }
                    if (this.zze.zzg()) {
                        zzw();
                        zzN("Service connected, sending hits to the service");
                        while (!listZzj.isEmpty()) {
                            zzez zzezVar = (zzez) listZzj.get(0);
                            if (!this.zze.zzh(zzezVar)) {
                                break;
                            }
                            jMax2 = Math.max(jMax2, zzezVar.zzb());
                            listZzj.remove(zzezVar);
                            zzF("Hit sent do device AnalyticsService for delivery", zzezVar);
                            try {
                                this.zzb.zzn(zzezVar.zzb());
                                arrayList.add(Long.valueOf(zzezVar.zzb()));
                            } catch (SQLiteException e4) {
                                zzJ("Failed to remove hit that was send for delivery", e4);
                                zzag();
                                zzaf();
                                try {
                                    this.zzb.zzaa();
                                    this.zzb.zzZ();
                                    return false;
                                } catch (SQLiteException e5) {
                                    zzJ("Failed to commit local dispatch transaction", e5);
                                    zzag();
                                    zzaf();
                                    return false;
                                }
                            }
                        }
                    }
                    if (this.zzc.zze()) {
                        List listZzc = this.zzc.zzc(listZzj);
                        Iterator it2 = listZzc.iterator();
                        while (it2.hasNext()) {
                            jMax2 = Math.max(jMax2, ((Long) it2.next()).longValue());
                        }
                        try {
                            this.zzb.zzY(listZzc);
                            arrayList.addAll(listZzc);
                        } catch (SQLiteException e6) {
                            zzJ("Failed to remove successfully uploaded hits", e6);
                            zzag();
                            zzaf();
                            try {
                                this.zzb.zzaa();
                                this.zzb.zzZ();
                                return false;
                            } catch (SQLiteException e7) {
                                zzJ("Failed to commit local dispatch transaction", e7);
                                zzag();
                                zzaf();
                                return false;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        try {
                            this.zzb.zzaa();
                            this.zzb.zzZ();
                            return false;
                        } catch (SQLiteException e8) {
                            zzJ("Failed to commit local dispatch transaction", e8);
                            zzag();
                            zzaf();
                            return false;
                        }
                    }
                    try {
                        this.zzb.zzaa();
                        this.zzb.zzZ();
                    } catch (SQLiteException e9) {
                        zzJ("Failed to commit local dispatch transaction", e9);
                        zzag();
                        zzaf();
                        return false;
                    }
                } catch (SQLiteException e10) {
                    zzR("Failed to read hits from persisted store", e10);
                    zzag();
                    zzaf();
                    try {
                        this.zzb.zzaa();
                        this.zzb.zzZ();
                        return false;
                    } catch (SQLiteException e11) {
                        zzJ("Failed to commit local dispatch transaction", e11);
                        zzag();
                        zzaf();
                        return false;
                    }
                }
            } catch (Throwable th) {
                this.zzb.zzaa();
                this.zzb.zzZ();
                throw th;
            }
            try {
                this.zzb.zzaa();
                this.zzb.zzZ();
                throw th;
            } catch (SQLiteException e12) {
                zzJ("Failed to commit local dispatch transaction", e12);
                zzag();
                zzaf();
                return false;
            }
        }
    }

    public final long zzb(zzbz zzbzVar, boolean z2) {
        Preconditions.checkNotNull(zzbzVar);
        zzV();
        com.google.android.gms.analytics.zzr.zzh();
        try {
            try {
                this.zzb.zzm();
                zzcg zzcgVar = this.zzb;
                String strZzb = zzbzVar.zzb();
                Preconditions.checkNotEmpty(strZzb);
                zzcgVar.zzV();
                com.google.android.gms.analytics.zzr.zzh();
                int iDelete = zzcgVar.zzf().delete(FeatureFlag.PROPERTIES, "app_uid=? AND cid<>?", new String[]{AdkSettings.PLATFORM_TYPE_MOBILE, strZzb});
                if (iDelete > 0) {
                    zzcgVar.zzO("Deleted property records", Integer.valueOf(iDelete));
                }
                long jZze = this.zzb.zze(0L, zzbzVar.zzb(), zzbzVar.zzc());
                zzbzVar.zze(1 + jZze);
                zzcg zzcgVar2 = this.zzb;
                Preconditions.checkNotNull(zzbzVar);
                zzcgVar2.zzV();
                com.google.android.gms.analytics.zzr.zzh();
                SQLiteDatabase sQLiteDatabaseZzf = zzcgVar2.zzf();
                Map mapZzd = zzbzVar.zzd();
                Preconditions.checkNotNull(mapZzd);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry entry : mapZzd.entrySet()) {
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put("cid", zzbzVar.zzb());
                contentValues.put("tid", zzbzVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbzVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbzVar.zza()));
                contentValues.put(Message.JsonKeys.PARAMS, encodedQuery);
                try {
                    if (sQLiteDatabaseZzf.insertWithOnConflict(FeatureFlag.PROPERTIES, null, contentValues, 5) == -1) {
                        zzcgVar2.zzI("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e2) {
                    zzcgVar2.zzJ("Error storing a property", e2);
                }
                this.zzb.zzaa();
                return jZze;
            } finally {
                try {
                    this.zzb.zzZ();
                } catch (SQLiteException e3) {
                    zzJ("Failed to end transaction", e3);
                }
            }
        } catch (SQLiteException e4) {
            zzJ("Failed to update Analytics property", e4);
            try {
                this.zzb.zzZ();
            } catch (SQLiteException e5) {
                zzJ("Failed to end transaction", e5);
            }
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public final void zzf(zzdb zzdbVar) throws Throwable {
        zzg(zzdbVar, this.zzj);
    }

    public final void zzg(zzdb zzdbVar, long j2) throws Throwable {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        long jZzb = zzA().zzb();
        zzF("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jZzb != 0 ? Math.abs(zzC().currentTimeMillis() - jZzb) : -1L));
        zzw();
        zzi();
        try {
            zzae();
            zzA().zzi();
            zzad();
            if (zzdbVar != null) {
                zzdbVar.zza(null);
            }
            if (this.zzj != j2) {
                this.zzd.zzb();
            }
        } catch (Exception e2) {
            zzJ("Local dispatch failed", e2);
            zzA().zzi();
            zzad();
            if (zzdbVar != null) {
                zzdbVar.zza(e2);
            }
        }
    }

    public final void zzh() {
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzw();
        zzN("Delete all hits from local store");
        try {
            zzcg zzcgVar = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzcgVar.zzV();
            zzcgVar.zzf().delete("hits2", null, null);
            zzcg zzcgVar2 = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzcgVar2.zzV();
            zzcgVar2.zzf().delete(FeatureFlag.PROPERTIES, null, null);
            zzad();
        } catch (SQLiteException e2) {
            zzR("Failed to delete hits from store", e2);
        }
        zzi();
        if (this.zze.zze()) {
            zzN("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    protected final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (zzcv.zzl() && !this.zze.zzg()) {
            zzw();
            if (this.zzi.zzc(((Long) zzew.zzO.zzb()).longValue())) {
                this.zzi.zzb();
                zzN("Connecting to service");
                if (this.zze.zzf()) {
                    zzN("Connected to service");
                    this.zzi.zza();
                    zzm();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af A[Catch: SQLiteException -> 0x01f5, TryCatch #0 {SQLiteException -> 0x01f5, blocks: (B:16:0x0078, B:17:0x0097, B:19:0x009d, B:21:0x00b1, B:23:0x00b9, B:25:0x00c1, B:26:0x00cb, B:29:0x00d7, B:31:0x00df, B:32:0x00e8, B:33:0x00ed, B:35:0x0108, B:54:0x016d, B:55:0x0171, B:38:0x011a, B:52:0x0169, B:72:0x01f1, B:73:0x01f4, B:56:0x0181, B:58:0x01af, B:59:0x01b6, B:66:0x01e3, B:60:0x01bc, B:61:0x01c4, B:63:0x01d0, B:64:0x01d7), top: B:77:0x0078, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bc A[Catch: SQLiteException -> 0x01f5, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01f5, blocks: (B:16:0x0078, B:17:0x0097, B:19:0x009d, B:21:0x00b1, B:23:0x00b9, B:25:0x00c1, B:26:0x00cb, B:29:0x00d7, B:31:0x00df, B:32:0x00e8, B:33:0x00ed, B:35:0x0108, B:54:0x016d, B:55:0x0171, B:38:0x011a, B:52:0x0169, B:72:0x01f1, B:73:0x01f4, B:56:0x0181, B:58:0x01af, B:59:0x01b6, B:66:0x01e3, B:60:0x01bc, B:61:0x01c4, B:63:0x01d0, B:64:0x01d7), top: B:77:0x0078, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d0 A[Catch: SQLiteException -> 0x01e2, TryCatch #2 {SQLiteException -> 0x01e2, blocks: (B:61:0x01c4, B:63:0x01d0, B:64:0x01d7), top: B:79:0x01c4, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d7 A[Catch: SQLiteException -> 0x01e2, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x01e2, blocks: (B:61:0x01c4, B:63:0x01d0, B:64:0x01d7), top: B:79:0x01c4, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(com.google.android.gms.internal.gtm.zzez r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcm.zzj(com.google.android.gms.internal.gtm.zzez):void");
    }

    protected final void zzk(zzbz zzbzVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzF("Sending first hit to property", zzbzVar.zzc());
        zzfq zzfqVarZzf = zzA().zzf();
        zzw();
        if (zzfqVarZzf.zzc(zzcv.zzc())) {
            return;
        }
        String strZzg = zzA().zzg();
        if (TextUtils.isEmpty(strZzg)) {
            return;
        }
        zzay zzayVarZzb = zzfu.zzb(zzz(), strZzg);
        zzF("Found relevant installation campaign", zzayVarZzb);
        zzai(zzbzVar, zzayVarZzb);
    }

    final void zzl() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zzj = zzC().currentTimeMillis();
    }

    protected final void zzm() {
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        zzw();
        zzw();
        if (!zzcv.zzl()) {
            zzQ("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzN("Service not connected");
            return;
        }
        if (this.zzb.zzab()) {
            return;
        }
        zzN("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzcg zzcgVar = this.zzb;
                zzw();
                List listZzj = zzcgVar.zzj(zzcv.zzh());
                if (listZzj.isEmpty()) {
                    zzad();
                    return;
                }
                while (!listZzj.isEmpty()) {
                    zzez zzezVar = (zzez) listZzj.get(0);
                    if (!this.zze.zzh(zzezVar)) {
                        zzad();
                        return;
                    }
                    listZzj.remove(zzezVar);
                    try {
                        this.zzb.zzn(zzezVar.zzb());
                    } catch (SQLiteException e2) {
                        zzJ("Failed to remove hit that was send for delivery", e2);
                        zzag();
                        zzaf();
                        return;
                    }
                }
            } catch (SQLiteException e3) {
                zzJ("Failed to read hits from store", e3);
                zzag();
                zzaf();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzn(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcm.zzn(java.lang.String):void");
    }
}
