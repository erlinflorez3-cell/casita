package com.google.android.gms.flags;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public abstract class Flag<T> {
    private final String mKey;
    private final int zze;
    private final T zzf;

    @Deprecated
    public static class BooleanFlag extends Flag<Boolean> {
        public BooleanFlag(int i2, String str, Boolean bool) {
            super(i2, str, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final Boolean zza(zzc zzcVar) {
            try {
                return Boolean.valueOf(zzcVar.getBooleanFlagValue(getKey(), zzb().booleanValue(), getSource()));
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    @Deprecated
    public static class IntegerFlag extends Flag<Integer> {
        public IntegerFlag(int i2, String str, Integer num) {
            super(i2, str, num);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final Integer zza(zzc zzcVar) {
            try {
                return Integer.valueOf(zzcVar.getIntFlagValue(getKey(), zzb().intValue(), getSource()));
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    @Deprecated
    public static class LongFlag extends Flag<Long> {
        public LongFlag(int i2, String str, Long l2) {
            super(i2, str, l2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final Long zza(zzc zzcVar) {
            try {
                return Long.valueOf(zzcVar.getLongFlagValue(getKey(), zzb().longValue(), getSource()));
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    @Deprecated
    public static class StringFlag extends Flag<String> {
        public StringFlag(int i2, String str, String str2) {
            super(i2, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.flags.Flag
        /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
        public final String zza(zzc zzcVar) {
            try {
                return zzcVar.getStringFlagValue(getKey(), zzb(), getSource());
            } catch (RemoteException unused) {
                return zzb();
            }
        }
    }

    private Flag(int i2, String str, T t2) {
        this.zze = i2;
        this.mKey = str;
        this.zzf = t2;
        Singletons.flagRegistry().zza(this);
    }

    @Deprecated
    public static BooleanFlag define(int i2, String str, Boolean bool) {
        return new BooleanFlag(i2, str, bool);
    }

    @Deprecated
    public static IntegerFlag define(int i2, String str, int i3) {
        return new IntegerFlag(i2, str, Integer.valueOf(i3));
    }

    @Deprecated
    public static LongFlag define(int i2, String str, long j2) {
        return new LongFlag(i2, str, Long.valueOf(j2));
    }

    @Deprecated
    public static StringFlag define(int i2, String str, String str2) {
        return new StringFlag(i2, str, str2);
    }

    public T get() {
        return (T) Singletons.zzd().zzb(this);
    }

    public final String getKey() {
        return this.mKey;
    }

    @Deprecated
    public final int getSource() {
        return this.zze;
    }

    protected abstract T zza(zzc zzcVar);

    public final T zzb() {
        return this.zzf;
    }
}
