package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
final class zzg implements Callable<Long> {
    private final /* synthetic */ SharedPreferences zzo;
    private final /* synthetic */ String zzp;
    private final /* synthetic */ Long zzs;

    zzg(SharedPreferences sharedPreferences, String str, Long l2) {
        this.zzo = sharedPreferences;
        this.zzp = str;
        this.zzs = l2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.zzo.getLong(this.zzp, this.zzs.longValue()));
    }
}
