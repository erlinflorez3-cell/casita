package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfi {

    public static final class zza extends zzjb<zza, C0183zza> implements zzkm {
        private static final zza zzf;
        private static volatile zzkx<zza> zzg = null;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        /* JADX INFO: renamed from: com.google.android.gms.internal.vision.zzfi$zza$zza, reason: collision with other inner class name */
        public static final class C0183zza extends zzjb.zzb<zza, C0183zza> implements zzkm {
            private C0183zza() {
                super(zza.zzf);
            }

            /* synthetic */ C0183zza(zzfk zzfkVar) {
                this();
            }

            public final C0183zza zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(str);
                return this;
            }

            public final C0183zza zzb(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).zzb(str);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzf = zzaVar;
            zzjb.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static C0183zza zza() {
            return zzf.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            int i2 = this.zzc;
            this.zzc = (i2 + 2) - (i2 & 2);
            this.zze = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zza>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0183zza(zzfkVar);
                case 3:
                    return zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzkx<zza> zzkxVar = zzg;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zza.class) {
                            zzkx<zza> zzkxVar2 = zzg;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzf);
                                zzg = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzb extends zzjb<zzb, zza> implements zzkm {
        private static final zzji<Integer, zzgz> zzd = new zzfl();
        private static final zzb zze;
        private static volatile zzkx<zzb> zzf = null;
        private zzjj zzc = zzn();

        public static final class zza extends zzjb.zzb<zzb, zza> implements zzkm {
            private zza() {
                super(zzb.zze);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.zzfl, com.google.android.gms.internal.vision.zzji<java.lang.Integer, com.google.android.gms.internal.vision.zzgz>] */
        static {
            zzb zzbVar = new zzb();
            zze = zzbVar;
            zzjb.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzb>] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", zzgz.zzb()});
                case 4:
                    return zze;
                case 5:
                    zzkx<zzb> zzkxVar = zzf;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzb.class) {
                            zzkx<zzb> zzkxVar2 = zzf;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zze);
                                zzf = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzc extends zzjb<zzc, zza> implements zzkm {
        private static final zzc zzg;
        private static volatile zzkx<zzc> zzh = null;
        private int zzc;
        private int zzd;
        private int zze;
        private String zzf = "";

        public static final class zza extends zzjb.zzb<zzc, zza> implements zzkm {
            private zza() {
                super(zzc.zzg);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzg = zzcVar;
            zzjb.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzc>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", zzgz.zzb(), "zze", zzha.zzb(), "zzf"});
                case 4:
                    return zzg;
                case 5:
                    zzkx<zzc> zzkxVar = zzh;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzc.class) {
                            zzkx<zzc> zzkxVar2 = zzh;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzg);
                                zzh = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzd extends zzjb<zzd, zza> implements zzkm {
        private static final zzd zzd;
        private static volatile zzkx<zzd> zze = null;
        private zzjl<zzm> zzc = zzo();

        public static final class zza extends zzjb.zzb<zzd, zza> implements zzkm {
            private zza() {
                super(zzd.zzd);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(zzm.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzd) this.zza).zza((zzm) ((zzjb) zzaVar.zzf()));
                return this;
            }

            public final zza zza(zzm zzmVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzd) this.zza).zza(zzmVar);
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzd = zzdVar;
            zzjb.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zza zza() {
            return zzd.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzm zzmVar) {
            zzmVar.getClass();
            zzjl<zzm> zzjlVar = this.zzc;
            if (!zzjlVar.zza()) {
                this.zzc = zzjb.zza(zzjlVar);
            }
            this.zzc.add(zzmVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzd>] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzm.class});
                case 4:
                    return zzd;
                case 5:
                    zzkx<zzd> zzkxVar = zze;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzd.class) {
                            zzkx<zzd> zzkxVar2 = zze;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzd);
                                zze = zzaVar;
                                r2 = zzaVar;
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

    public static final class zze extends zzjb<zze, zza> implements zzkm {
        private static final zze zzl;
        private static volatile zzkx<zze> zzm = null;
        private int zzc;
        private boolean zze;
        private int zzf;
        private long zzg;
        private long zzh;
        private long zzi;
        private boolean zzk;
        private String zzd = "";
        private String zzj = "";

        public static final class zza extends zzjb.zzb<zze, zza> implements zzkm {
            private zza() {
                super(zze.zzl);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        public enum zzb implements zzje {
            REASON_UNKNOWN(0),
            REASON_MISSING(1),
            REASON_UPGRADE(2),
            REASON_INVALID(3);

            private static final zzjh<zzb> zze = new zzfm();
            private final int zzf;

            zzb(int i2) {
                this.zzf = i2;
            }

            public static zzb zza(int i2) {
                if (i2 == 0) {
                    return REASON_UNKNOWN;
                }
                if (i2 == 1) {
                    return REASON_MISSING;
                }
                if (i2 == 2) {
                    return REASON_UPGRADE;
                }
                if (i2 != 3) {
                    return null;
                }
                return REASON_INVALID;
            }

            public static zzjg zzb() {
                return zzfn.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzf);
                return sb.append(" name=").append(name()).append(Typography.greater).toString();
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }
        }

        static {
            zze zzeVar = new zze();
            zzl = zzeVar;
            zzjb.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zze>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzkx<zze> zzkxVar = zzm;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zze.class) {
                            zzkx<zze> zzkxVar2 = zzm;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzl);
                                zzm = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzf extends zzjb<zzf, zzb> implements zzkm {
        private static final zzf zzl;
        private static volatile zzkx<zzf> zzm = null;
        private int zzc;
        private int zzg;
        private long zzi;
        private long zzj;
        private String zzd = "";
        private String zze = "";
        private zzjl<String> zzf = zzjb.zzo();
        private String zzh = "";
        private zzjl<zzn> zzk = zzo();

        public enum zza implements zzje {
            RESULT_UNKNOWN(0),
            RESULT_SUCCESS(1),
            RESULT_FAIL(2),
            RESULT_SKIPPED(3);

            private static final zzjh<zza> zze = new zzfp();
            private final int zzf;

            zza(int i2) {
                this.zzf = i2;
            }

            public static zza zza(int i2) {
                if (i2 == 0) {
                    return RESULT_UNKNOWN;
                }
                if (i2 == 1) {
                    return RESULT_SUCCESS;
                }
                if (i2 == 2) {
                    return RESULT_FAIL;
                }
                if (i2 != 3) {
                    return null;
                }
                return RESULT_SKIPPED;
            }

            public static zzjg zzb() {
                return zzfo.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzf);
                return sb.append(" name=").append(name()).append(Typography.greater).toString();
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }
        }

        public static final class zzb extends zzjb.zzb<zzf, zzb> implements zzkm {
            private zzb() {
                super(zzf.zzl);
            }

            /* synthetic */ zzb(zzfk zzfkVar) {
                this();
            }

            public final zzb zza(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).zza(j2);
                return this;
            }

            public final zzb zza(Iterable<? extends zzn> iterable) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).zza(iterable);
                return this;
            }

            public final zzb zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).zza(str);
                return this;
            }

            public final zzb zzb(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).zzb(j2);
                return this;
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzl = zzfVar;
            zzjb.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zzb zza() {
            return zzl.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 16));
            this.zzi = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zzn> iterable) {
            zzjl<zzn> zzjlVar = this.zzk;
            if (!zzjlVar.zza()) {
                this.zzk = zzjb.zza(zzjlVar);
            }
            zzhf.zza(iterable, this.zzk);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(long j2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 32));
            this.zzj = j2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzf>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(zzfkVar);
                case 3:
                    return zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zza.zzb(), "zzh", "zzi", "zzj", "zzk", zzn.class});
                case 4:
                    return zzl;
                case 5:
                    zzkx<zzf> zzkxVar = zzm;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzf.class) {
                            zzkx<zzf> zzkxVar2 = zzm;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzl);
                                zzm = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzg extends zzjb<zzg, zza> implements zzkm {
        private static final zzg zzj;
        private static volatile zzkx<zzg> zzk = null;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private boolean zzh;
        private float zzi;

        public static final class zza extends zzjb.zzb<zzg, zza> implements zzkm {
            private zza() {
                super(zzg.zzj);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).zza(f2);
                return this;
            }

            public final zza zza(zzb zzbVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).zza(zzbVar);
                return this;
            }

            public final zza zza(zzc zzcVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).zza(zzcVar);
                return this;
            }

            public final zza zza(zzd zzdVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).zza(zzdVar);
                return this;
            }

            public final zza zza(boolean z2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).zza(z2);
                return this;
            }

            public final zza zzb(boolean z2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).zzb(z2);
                return this;
            }
        }

        public enum zzb implements zzje {
            CLASSIFICATION_UNKNOWN(0),
            CLASSIFICATION_NONE(1),
            CLASSIFICATION_ALL(2);

            private static final zzjh<zzb> zzd = new zzfq();
            private final int zze;

            zzb(int i2) {
                this.zze = i2;
            }

            public static zzb zza(int i2) {
                if (i2 == 0) {
                    return CLASSIFICATION_UNKNOWN;
                }
                if (i2 == 1) {
                    return CLASSIFICATION_NONE;
                }
                if (i2 != 2) {
                    return null;
                }
                return CLASSIFICATION_ALL;
            }

            public static zzjg zzb() {
                return zzfr.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zze);
                return sb.append(" name=").append(name()).append(Typography.greater).toString();
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zze;
            }
        }

        public enum zzc implements zzje {
            LANDMARK_UNKNOWN(0),
            LANDMARK_NONE(1),
            LANDMARK_ALL(2),
            LANDMARK_CONTOUR(3);

            private static final zzjh<zzc> zze = new zzft();
            private final int zzf;

            zzc(int i2) {
                this.zzf = i2;
            }

            public static zzc zza(int i2) {
                if (i2 == 0) {
                    return LANDMARK_UNKNOWN;
                }
                if (i2 == 1) {
                    return LANDMARK_NONE;
                }
                if (i2 == 2) {
                    return LANDMARK_ALL;
                }
                if (i2 != 3) {
                    return null;
                }
                return LANDMARK_CONTOUR;
            }

            public static zzjg zzb() {
                return zzfs.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzf);
                return sb.append(" name=").append(name()).append(Typography.greater).toString();
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }
        }

        public enum zzd implements zzje {
            MODE_UNKNOWN(0),
            MODE_ACCURATE(1),
            MODE_FAST(2),
            MODE_SELFIE(3);

            private static final zzjh<zzd> zze = new zzfu();
            private final int zzf;

            zzd(int i2) {
                this.zzf = i2;
            }

            public static zzd zza(int i2) {
                if (i2 == 0) {
                    return MODE_UNKNOWN;
                }
                if (i2 == 1) {
                    return MODE_ACCURATE;
                }
                if (i2 == 2) {
                    return MODE_FAST;
                }
                if (i2 != 3) {
                    return null;
                }
                return MODE_SELFIE;
            }

            public static zzjg zzb() {
                return zzfv.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzf);
                return sb.append(" name=").append(name()).append(Typography.greater).toString();
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzj = zzgVar;
            zzjb.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zza zza() {
            return zzj.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(float f2) {
            this.zzc |= 32;
            this.zzi = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzb zzbVar) {
            this.zzf = zzbVar.zza();
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzc zzcVar) {
            this.zze = zzcVar.zza();
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzd zzdVar) {
            this.zzd = zzdVar.zza();
            int i2 = this.zzc;
            this.zzc = (i2 + 1) - (i2 & 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(boolean z2) {
            int i2 = this.zzc;
            this.zzc = (i2 + 8) - (i2 & 8);
            this.zzg = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(boolean z2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 16));
            this.zzh = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzg>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", zzd.zzb(), "zze", zzc.zzb(), "zzf", zzb.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzkx<zzg> zzkxVar = zzk;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzg.class) {
                            zzkx<zzg> zzkxVar2 = zzk;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzj);
                                zzk = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzh extends zzjb<zzh, zza> implements zzkm {
        private static final zzh zzj;
        private static volatile zzkx<zzh> zzk = null;
        private int zzc;
        private float zzd;
        private float zze;
        private float zzf;
        private float zzg;
        private float zzh;
        private float zzi;

        public static final class zza extends zzjb.zzb<zzh, zza> implements zzkm {
            private zza() {
                super(zzh.zzj);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).zza(f2);
                return this;
            }

            public final zza zzb(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).zzb(f2);
                return this;
            }

            public final zza zzc(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).zzc(f2);
                return this;
            }

            public final zza zzd(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).zzd(f2);
                return this;
            }

            public final zza zze(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).zze(f2);
                return this;
            }

            public final zza zzf(float f2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).zzf(f2);
                return this;
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzj = zzhVar;
            zzjb.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static zza zza() {
            return zzj.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(float f2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 1));
            this.zzd = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(float f2) {
            this.zzc |= 2;
            this.zze = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(float f2) {
            this.zzc |= 4;
            this.zzf = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(float f2) {
            this.zzc |= 8;
            this.zzg = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(float f2) {
            int i2 = this.zzc;
            this.zzc = (i2 + 16) - (i2 & 16);
            this.zzh = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(float f2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 32));
            this.zzi = f2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzh>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzkx<zzh> zzkxVar = zzk;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzh.class) {
                            zzkx<zzh> zzkxVar2 = zzk;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzj);
                                zzk = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzi extends zzjb<zzi, zza> implements zzkm {
        private static final zzi zzg;
        private static volatile zzkx<zzi> zzh = null;
        private int zzc;
        private zzj zzd;
        private zzl zze;
        private zzjl<zzf> zzf = zzo();

        public static final class zza extends zzjb.zzb<zzi, zza> implements zzkm {
            private zza() {
                super(zzi.zzg);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(zzf.zzb zzbVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzi) this.zza).zza((zzf) ((zzjb) zzbVar.zzf()));
                return this;
            }

            public final zza zza(zzj zzjVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzi) this.zza).zza(zzjVar);
                return this;
            }

            public final zza zza(Iterable<? extends zzf> iterable) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzi) this.zza).zza(iterable);
                return this;
            }
        }

        static {
            zzi zziVar = new zzi();
            zzg = zziVar;
            zzjb.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zza zza() {
            return zzg.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzf zzfVar) {
            zzfVar.getClass();
            zzc();
            this.zzf.add(zzfVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzj zzjVar) {
            zzjVar.getClass();
            this.zzd = zzjVar;
            int i2 = this.zzc;
            this.zzc = (i2 + 1) - (i2 & 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(Iterable<? extends zzf> iterable) {
            zzc();
            zzhf.zza(iterable, this.zzf);
        }

        private final void zzc() {
            zzjl<zzf> zzjlVar = this.zzf;
            if (zzjlVar.zza()) {
                return;
            }
            this.zzf = zzjb.zza(zzjlVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzi>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", zzf.class});
                case 4:
                    return zzg;
                case 5:
                    zzkx<zzi> zzkxVar = zzh;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzi.class) {
                            zzkx<zzi> zzkxVar2 = zzh;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzg);
                                zzh = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzj extends zzjb<zzj, zzb> implements zzkm {
        private static final zzj zzi;
        private static volatile zzkx<zzj> zzj = null;
        private int zzc;
        private int zzd;
        private long zze;
        private long zzf;
        private long zzg;
        private long zzh;

        public enum zza implements zzje {
            FORMAT_UNKNOWN(0),
            FORMAT_LUMINANCE(1),
            FORMAT_RGB8(2),
            FORMAT_MONOCHROME(3);

            private static final zzjh<zza> zze = new zzfx();
            private final int zzf;

            zza(int i2) {
                this.zzf = i2;
            }

            public static zza zza(int i2) {
                if (i2 == 0) {
                    return FORMAT_UNKNOWN;
                }
                if (i2 == 1) {
                    return FORMAT_LUMINANCE;
                }
                if (i2 == 2) {
                    return FORMAT_RGB8;
                }
                if (i2 != 3) {
                    return null;
                }
                return FORMAT_MONOCHROME;
            }

            public static zzjg zzb() {
                return zzfw.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.zzf);
                return sb.append(" name=").append(name()).append(Typography.greater).toString();
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }
        }

        public static final class zzb extends zzjb.zzb<zzj, zzb> implements zzkm {
            private zzb() {
                super(zzj.zzi);
            }

            /* synthetic */ zzb(zzfk zzfkVar) {
                this();
            }

            public final zzb zza(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).zza(j2);
                return this;
            }

            public final zzb zzb(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).zzb(j2);
                return this;
            }

            public final zzb zzc(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).zzc(j2);
                return this;
            }

            public final zzb zzd(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).zzd(j2);
                return this;
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzi = zzjVar;
            zzjb.zza((Class<zzj>) zzj.class, zzjVar);
        }

        private zzj() {
        }

        public static zzb zza() {
            return zzi.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j2) {
            int i2 = this.zzc;
            this.zzc = (i2 + 2) - (i2 & 2);
            this.zze = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(long j2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 4));
            this.zzf = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(long j2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 8));
            this.zzg = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(long j2) {
            this.zzc |= 16;
            this.zzh = j2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzj>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb(zzfkVar);
                case 3:
                    return zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", zza.zzb(), "zze", "zzf", "zzh", "zzg"});
                case 4:
                    return zzi;
                case 5:
                    zzkx<zzj> zzkxVar = zzj;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzj.class) {
                            zzkx<zzj> zzkxVar2 = zzj;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzi);
                                zzj = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzk extends zzjb<zzk, zza> implements zzkm {
        private static final zzk zzj;
        private static volatile zzkx<zzk> zzk = null;
        private int zzc;
        private long zze;
        private zza zzf;
        private zzg zzh;
        private zzb zzi;
        private String zzd = "";
        private String zzg = "";

        public static final class zza extends zzjb.zzb<zzk, zza> implements zzkm {
            private zza() {
                super(zzk.zzj);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(long j2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).zza(j2);
                return this;
            }

            public final zza zza(zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).zza(zzaVar);
                return this;
            }

            public final zza zza(zzg.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).zza((zzg) ((zzjb) zzaVar.zzf()));
                return this;
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).zza(str);
                return this;
            }

            public final zza zzb(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).zzb(str);
                return this;
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzj = zzkVar;
            zzjb.zza((Class<zzk>) zzk.class, zzkVar);
        }

        private zzk() {
        }

        public static zza zza() {
            return zzj.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(long j2) {
            int i2 = this.zzc;
            this.zzc = (i2 + 2) - (i2 & 2);
            this.zze = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zza zzaVar) {
            zzaVar.getClass();
            this.zzf = zzaVar;
            this.zzc |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzg zzgVar) {
            zzgVar.getClass();
            this.zzh = zzgVar;
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 16));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzk>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzkx<zzk> zzkxVar = zzk;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzk.class) {
                            zzkx<zzk> zzkxVar2 = zzk;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzj);
                                zzk = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzl extends zzjb<zzl, zza> implements zzkm {
        private static final zzl zzf;
        private static volatile zzkx<zzl> zzg = null;
        private int zzc;
        private long zzd;
        private long zze;

        public static final class zza extends zzjb.zzb<zzl, zza> implements zzkm {
            private zza() {
                super(zzl.zzf);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzf = zzlVar;
            zzjb.zza((Class<zzl>) zzl.class, zzlVar);
        }

        private zzl() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzl>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzkx<zzl> zzkxVar = zzg;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzl.class) {
                            zzkx<zzl> zzkxVar2 = zzg;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzf);
                                zzg = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzm extends zzjb<zzm, zza> implements zzkm {
        private static final zzm zzf;
        private static volatile zzkx<zzm> zzg = null;
        private int zzc;
        private int zzd;
        private int zze;

        public static final class zza extends zzjb.zzb<zzm, zza> implements zzkm {
            private zza() {
                super(zzm.zzf);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(int i2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzm) this.zza).zza(i2);
                return this;
            }

            public final zza zzb(int i2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzm) this.zza).zzc(i2);
                return this;
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzf = zzmVar;
            zzjb.zza((Class<zzm>) zzm.class, zzmVar);
        }

        private zzm() {
        }

        public static zza zza() {
            return zzf.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(int i2) {
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 2));
            this.zze = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzm>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzkx<zzm> zzkxVar = zzg;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzm.class) {
                            zzkx<zzm> zzkxVar2 = zzg;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzf);
                                zzg = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzn extends zzjb<zzn, zza> implements zzkm {
        private static final zzn zzh;
        private static volatile zzkx<zzn> zzi = null;
        private int zzc;
        private zzd zzd;
        private int zze;
        private zzh zzf;
        private zzc zzg;

        public static final class zza extends zzjb.zzb<zzn, zza> implements zzkm {
            private zza() {
                super(zzn.zzh);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(int i2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).zza(i2);
                return this;
            }

            public final zza zza(zzd.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).zza((zzd) ((zzjb) zzaVar.zzf()));
                return this;
            }

            public final zza zza(zzd zzdVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).zza(zzdVar);
                return this;
            }

            public final zza zza(zzh zzhVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).zza(zzhVar);
                return this;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzh = zznVar;
            zzjb.zza((Class<zzn>) zzn.class, zznVar);
        }

        private zzn() {
        }

        public static zza zza() {
            return zzh.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i2) {
            this.zzc |= 2;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzd zzdVar) {
            zzdVar.getClass();
            this.zzd = zzdVar;
            this.zzc |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzh zzhVar) {
            zzhVar.getClass();
            this.zzf = zzhVar;
            this.zzc |= 4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzn>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzkx<zzn> zzkxVar = zzi;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzn.class) {
                            zzkx<zzn> zzkxVar2 = zzi;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzh);
                                zzi = zzaVar;
                                r2 = zzaVar;
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

    public static final class zzo extends zzjb<zzo, zza> implements zzkm {
        private static final zzo zzi;
        private static volatile zzkx<zzo> zzj = null;
        private int zzc;
        private zze zzd;
        private zzk zze;
        private zzi zzf;
        private int zzg;
        private boolean zzh;

        public static final class zza extends zzjb.zzb<zzo, zza> implements zzkm {
            private zza() {
                super(zzo.zzi);
            }

            /* synthetic */ zza(zzfk zzfkVar) {
                this();
            }

            public final zza zza(zzi zziVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzo) this.zza).zza(zziVar);
                return this;
            }

            public final zza zza(zzk.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzo) this.zza).zza((zzk) ((zzjb) zzaVar.zzf()));
                return this;
            }

            public final zza zza(boolean z2) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzo) this.zza).zza(true);
                return this;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzi = zzoVar;
            zzjb.zza((Class<zzo>) zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zza zza() {
            return zzi.zzj();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzi zziVar) {
            zziVar.getClass();
            this.zzf = zziVar;
            this.zzc |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzk zzkVar) {
            zzkVar.getClass();
            this.zze = zzkVar;
            this.zzc = (-1) - (((-1) - this.zzc) & ((-1) - 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(boolean z2) {
            int i2 = this.zzc;
            this.zzc = (i2 + 16) - (i2 & 16);
            this.zzh = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzo>] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // com.google.android.gms.internal.vision.zzjb
        protected final Object zza(int i2, Object obj, Object obj2) {
            ?? r2;
            zzfk zzfkVar = null;
            switch (zzfk.zza[i2 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(zzfkVar);
                case 3:
                    return zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzkx<zzo> zzkxVar = zzj;
                    Object obj3 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzo.class) {
                            zzkx<zzo> zzkxVar2 = zzj;
                            r2 = zzkxVar2;
                            if (zzkxVar2 == null) {
                                ?? zzaVar = new zzjb.zza(zzi);
                                zzj = zzaVar;
                                r2 = zzaVar;
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
