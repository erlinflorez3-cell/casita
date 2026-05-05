package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzy {
    private zzfy.zzf zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzt zzd;

    private zzy(zzt zztVar) {
        this.zzd = zztVar;
    }

    final zzfy.zzf zza(String str, zzfy.zzf zzfVar) {
        String strZzg = zzfVar.zzg();
        List<zzfy.zzh> listZzh = zzfVar.zzh();
        this.zzd.g_();
        Long l2 = (Long) zzoo.zzb(zzfVar, "_eid");
        boolean z2 = l2 != null;
        if (z2 && strZzg.equals("_ep")) {
            Preconditions.checkNotNull(l2);
            this.zzd.g_();
            strZzg = (String) zzoo.zzb(zzfVar, "_en");
            if (TextUtils.isEmpty(strZzg)) {
                this.zzd.zzj().zzn().zza("Extra parameter without an event name. eventId", l2);
                return null;
            }
            if (this.zza == null || this.zzb == null || l2.longValue() != this.zzb.longValue()) {
                Pair<zzfy.zzf, Long> pairZza = this.zzd.zzh().zza(str, l2);
                if (pairZza == null || pairZza.first == null) {
                    this.zzd.zzj().zzn().zza("Extra parameter without existing main event. eventName, eventId", strZzg, l2);
                    return null;
                }
                this.zza = (zzfy.zzf) pairZza.first;
                this.zzc = ((Long) pairZza.second).longValue();
                this.zzd.g_();
                this.zzb = (Long) zzoo.zzb(this.zza, "_eid");
            }
            long j2 = this.zzc - 1;
            this.zzc = j2;
            if (j2 <= 0) {
                zzal zzalVarZzh = this.zzd.zzh();
                zzalVarZzh.zzt();
                zzalVarZzh.zzj().zzp().zza("Clearing complex main event info. appId", str);
                try {
                    zzalVarZzh.e_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e2) {
                    zzalVarZzh.zzj().zzg().zza("Error clearing complex main event", e2);
                }
            } else {
                this.zzd.zzh().zza(str, l2, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfy.zzh zzhVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zzoo.zza(zzfVar, zzhVar.zzg()) == null) {
                    arrayList.add(zzhVar);
                }
            }
            if (arrayList.isEmpty()) {
                this.zzd.zzj().zzn().zza("No unique parameters in main event. eventName", strZzg);
            } else {
                arrayList.addAll(listZzh);
                listZzh = arrayList;
            }
        } else if (z2) {
            this.zzb = l2;
            this.zza = zzfVar;
            this.zzd.g_();
            long jLongValue = ((Long) zzoo.zza(zzfVar, "_epc", (Object) 0L)).longValue();
            this.zzc = jLongValue;
            if (jLongValue <= 0) {
                this.zzd.zzj().zzn().zza("Complex event with zero extra param count. eventName", strZzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l2), this.zzc, zzfVar);
            }
        }
        return (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zzfVar.zzcd().zza(strZzg).zzd().zza(listZzh).zzai());
    }
}
