package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjs {
    private GoogleAnalytics zza;
    private final Context zzb;
    private Tracker zzc;

    public zzjs(Context context) {
        this.zzb = context;
    }

    private final synchronized void zzb(String str) {
        if (this.zza == null) {
            GoogleAnalytics googleAnalytics = GoogleAnalytics.getInstance(this.zzb);
            this.zza = googleAnalytics;
            googleAnalytics.setLogger(new zzjr());
            this.zzc = this.zza.newTracker("_GTM_DEFAULT_TRACKER_");
        }
    }

    public final Tracker zza(String str) {
        zzb("_GTM_DEFAULT_TRACKER_");
        return this.zzc;
    }
}
