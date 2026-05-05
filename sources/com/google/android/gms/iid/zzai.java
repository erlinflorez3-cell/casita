package com.google.android.gms.iid;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzai {
    private static zzai zzdd = null;

    public static synchronized zzai zzy() {
        if (zzdd == null) {
            zzdd = new zzac();
        }
        return zzdd;
    }

    public abstract zzaj<Boolean> zzd(String str, boolean z2);
}
