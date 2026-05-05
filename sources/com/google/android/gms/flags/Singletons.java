package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes8.dex */
public final class Singletons {
    private static Singletons zzl = null;
    private final FlagRegistry zzm = new FlagRegistry();
    private final zzb zzn = new zzb();

    static {
        Singletons singletons = new Singletons();
        synchronized (Singletons.class) {
            zzl = singletons;
        }
    }

    private Singletons() {
    }

    public static FlagRegistry flagRegistry() {
        return zzc().zzm;
    }

    private static Singletons zzc() {
        Singletons singletons;
        synchronized (Singletons.class) {
            singletons = zzl;
        }
        return singletons;
    }

    public static zzb zzd() {
        return zzc().zzn;
    }
}
