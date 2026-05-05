package com.google.android.gms.internal.gtm;

import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class zzon implements zzjw {
    @Override // com.google.android.gms.internal.gtm.zzjw
    public final zzqz zzd(zzie zzieVar, zzqz... zzqzVarArr) {
        Preconditions.checkArgument(zzqzVarArr != null);
        Preconditions.checkArgument(zzqzVarArr.length == 0);
        return new zzrk(EventMetricsAggregator.OS_NAME);
    }
}
