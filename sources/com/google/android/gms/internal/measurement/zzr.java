package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import com.npmdavi.davinotification.Constant;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr extends zzal {
    private final zzv zzk;

    public zzr(zzv zzvVar) {
        super("internal.logger");
        this.zzk = zzvVar;
        this.zzb.put(Constant.NOTIFICATION_DETAILS_LOG, new zzu(this, false, true));
        this.zzb.put(NotificationCompat.GROUP_KEY_SILENT, new zzq(this, NotificationCompat.GROUP_KEY_SILENT));
        ((zzal) this.zzb.get(NotificationCompat.GROUP_KEY_SILENT)).zza(Constant.NOTIFICATION_DETAILS_LOG, new zzu(this, true, true));
        this.zzb.put("unmonitored", new zzt(this, "unmonitored"));
        ((zzal) this.zzb.get("unmonitored")).zza(Constant.NOTIFICATION_DETAILS_LOG, new zzu(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzaq.zzc;
    }
}
