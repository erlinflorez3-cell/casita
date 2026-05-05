package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgt {

    public static final class zza extends zzcg<zza, C0172zza> implements zzdq {
        private static volatile zzdz<zza> zzbg = null;
        private static final zza zzbil;

        /* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.zzgt$zza$zza, reason: collision with other inner class name */
        public static final class C0172zza extends zzcg.zza<zza, C0172zza> implements zzdq {
            private C0172zza() {
                super(zza.zzbil);
            }

            /* synthetic */ C0172zza(zzgu zzguVar) {
                this();
            }
        }

        public enum zzb implements zzcj {
            NO_RESTRICTION(0),
            SIDEWINDER_DEVICE(1),
            LATCHSKY_DEVICE(2);

            private static final zzck<zzb> zzbq = new zzgv();
            private final int value;

            zzb(int i2) {
                this.value = i2;
            }

            public static zzb zzbe(int i2) {
                if (i2 == 0) {
                    return NO_RESTRICTION;
                }
                if (i2 == 1) {
                    return SIDEWINDER_DEVICE;
                }
                if (i2 != 2) {
                    return null;
                }
                return LATCHSKY_DEVICE;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            zza zzaVar = new zza();
            zzbil = zzaVar;
            zzcg.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt$zza>] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzgu zzguVar = null;
            switch (zzgu.zzba[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0172zza(zzguVar);
                case 3:
                    return zza(zzbil, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzbil;
                case 5:
                    zzdz<zza> zzdzVar = zzbg;
                    Object obj3 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (zza.class) {
                            zzdz<zza> zzdzVar2 = zzbg;
                            r2 = zzdzVar2;
                            if (zzdzVar2 == null) {
                                ?? zzbVar = new zzcg.zzb(zzbil);
                                zzbg = zzbVar;
                                r2 = zzbVar;
                            }
                            break;
                        }
                        obj3 = r2;
                    }
                    return obj3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
