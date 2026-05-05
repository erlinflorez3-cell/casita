package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes8.dex */
public class TagManagerService extends Service {
    public static void initialize(Context context) {
        zzbo.zze(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return zzbo.zza(this);
    }
}
