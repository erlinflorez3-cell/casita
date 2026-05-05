package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* JADX INFO: loaded from: classes8.dex */
final class zzhp extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.internal.gtm.zzhp";
    private final zzig zzb;

    zzhp(zzig zzigVar) {
        this.zzb = zzigVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(action)) {
            if (!"com.google.analytics.RADIO_POWERED".equals(action) || intent.hasExtra(zza)) {
                return;
            }
            this.zzb.zza();
            return;
        }
        Bundle extras = intent.getExtras();
        Boolean boolValueOf = Boolean.FALSE;
        if (extras != null) {
            boolValueOf = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
        }
        this.zzb.zzb(!boolValueOf.booleanValue());
    }
}
