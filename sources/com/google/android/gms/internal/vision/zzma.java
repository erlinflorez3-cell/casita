package com.google.android.gms.internal.vision;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzma {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzd zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    private static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final byte zza(Object obj, long j2) {
            return zzma.zza ? zzma.zzk(obj, j2) : zzma.zzl(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, byte b2) {
            if (zzma.zza) {
                zzma.zzc(obj, j2, b2);
            } else {
                zzma.zzd(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzma.zza) {
                zzma.zzd(obj, j2, z2);
            } else {
                zzma.zze(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final boolean zzb(Object obj, long j2) {
            return zzma.zza ? zzma.zzm(obj, j2) : zzma.zzn(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final float zzc(Object obj, long j2) {
            return Float.intBitsToFloat(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final double zzd(Object obj, long j2) {
            return Double.longBitsToDouble(zzf(obj, j2));
        }
    }

    private static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final byte zza(Object obj, long j2) {
            return this.zza.getByte(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, byte b2) {
            this.zza.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, double d2) {
            this.zza.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, float f2) {
            this.zza.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, boolean z2) {
            this.zza.putBoolean(obj, j2, z2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final boolean zzb(Object obj, long j2) {
            return this.zza.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final float zzc(Object obj, long j2) {
            return this.zza.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final double zzd(Object obj, long j2) {
            return this.zza.getDouble(obj, j2);
        }
    }

    private static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final byte zza(Object obj, long j2) {
            return zzma.zza ? zzma.zzk(obj, j2) : zzma.zzl(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, byte b2) {
            if (zzma.zza) {
                zzma.zzc(obj, j2, b2);
            } else {
                zzma.zzd(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzma.zza) {
                zzma.zzd(obj, j2, z2);
            } else {
                zzma.zze(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final boolean zzb(Object obj, long j2) {
            return zzma.zza ? zzma.zzm(obj, j2) : zzma.zzn(obj, j2);
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final float zzc(Object obj, long j2) {
            return Float.intBitsToFloat(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.vision.zzma.zzd
        public final double zzd(Object obj, long j2) {
            return Double.longBitsToDouble(zzf(obj, j2));
        }
    }

    private static abstract class zzd {
        Unsafe zza;

        zzd(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract byte zza(Object obj, long j2);

        public abstract void zza(Object obj, long j2, byte b2);

        public abstract void zza(Object obj, long j2, double d2);

        public abstract void zza(Object obj, long j2, float f2);

        public final void zza(Object obj, long j2, int i2) {
            this.zza.putInt(obj, j2, i2);
        }

        public final void zza(Object obj, long j2, long j3) {
            this.zza.putLong(obj, j2, j3);
        }

        public abstract void zza(Object obj, long j2, boolean z2);

        public abstract boolean zzb(Object obj, long j2);

        public abstract float zzc(Object obj, long j2);

        public abstract double zzd(Object obj, long j2);

        public final int zze(Object obj, long j2) {
            return this.zza.getInt(obj, j2);
        }

        public final long zzf(Object obj, long j2) {
            return this.zza.getLong(obj, j2);
        }
    }

    static {
        Unsafe unsafeZzc = zzc();
        zzb = unsafeZzc;
        zzc = zzhi.zzb();
        boolean zZzd = zzd(Long.TYPE);
        zzd = zZzd;
        boolean zZzd2 = zzd(Integer.TYPE);
        zze = zZzd2;
        zzd zzbVar = null;
        if (unsafeZzc != null) {
            if (!zzhi.zza()) {
                zzbVar = new zzb(unsafeZzc);
            } else if (zZzd) {
                zzbVar = new zzc(unsafeZzc);
            } else if (zZzd2) {
                zzbVar = new zza(unsafeZzc);
            }
        }
        zzf = zzbVar;
        zzg = zze();
        zzh = zzd();
        long jZzb = zzb(byte[].class);
        zzi = jZzb;
        zzj = zzb(boolean[].class);
        zzk = zzc(boolean[].class);
        zzl = zzb(int[].class);
        zzm = zzc(int[].class);
        zzn = zzb(long[].class);
        zzo = zzc(long[].class);
        zzp = zzb(float[].class);
        zzq = zzc(float[].class);
        zzr = zzb(double[].class);
        zzs = zzc(double[].class);
        zzt = zzb(Object[].class);
        zzu = zzc(Object[].class);
        Field fieldZzf = zzf();
        zzv = (fieldZzf == null || zzbVar == null) ? -1L : zzbVar.zza.objectFieldOffset(fieldZzf);
        zzw = (int) (jZzb & 7);
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzma() {
    }

    static byte zza(byte[] bArr, long j2) {
        return zzf.zza(bArr, zzi + j2);
    }

    static int zza(Object obj, long j2) {
        return zzf.zze(obj, j2);
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void zza(Object obj, long j2, double d2) {
        zzf.zza(obj, j2, d2);
    }

    static void zza(Object obj, long j2, float f2) {
        zzf.zza(obj, j2, f2);
    }

    static void zza(Object obj, long j2, int i2) {
        zzf.zza(obj, j2, i2);
    }

    static void zza(Object obj, long j2, long j3) {
        zzf.zza(obj, j2, j3);
    }

    static void zza(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    static void zza(Object obj, long j2, boolean z2) {
        zzf.zza(obj, j2, z2);
    }

    static void zza(byte[] bArr, long j2, byte b2) {
        zzf.zza((Object) bArr, zzi + j2, b2);
    }

    static boolean zza() {
        return zzh;
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long zzb(Object obj, long j2) {
        return zzf.zzf(obj, j2);
    }

    static boolean zzb() {
        return zzg;
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe zzc() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmc());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j2, byte b2) {
        long j3 = (-1) - (((-1) - (-4)) | ((-1) - j2));
        int iZza = zza(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        int i3 = (-1) - (((-1) - iZza) | ((-1) - (~(255 << i2))));
        int i4 = ((255 + b2) - (255 | b2)) << i2;
        zza(obj, j3, (i4 + i3) - (i4 & i3));
    }

    static boolean zzc(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    static float zzd(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j2, byte b2) {
        long j3 = ((-4) + j2) - ((-4) | j2);
        int iZza = zza(obj, j3);
        int i2 = (int) j2;
        int i3 = ((i2 + 3) - (i2 | 3)) << 3;
        int i4 = ~(255 << i3);
        zza(obj, j3, (-1) - (((-1) - (((-1) - (((-1) - 255) | ((-1) - b2))) << i3)) & ((-1) - ((iZza + i4) - (iZza | i4)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j2, boolean z2) {
        zzc(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    private static boolean zzd() {
        Unsafe unsafe = zzb;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzhi.zza()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(zzma.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    private static boolean zzd(Class<?> cls) {
        if (!zzhi.zza()) {
            return false;
        }
        try {
            Class<?> cls2 = zzc;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static double zze(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Object obj, long j2, boolean z2) {
        zzd(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    private static boolean zze() {
        Unsafe unsafe = zzb;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzf() == null) {
                return false;
            }
            if (zzhi.zza()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = Logger.getLogger(zzma.class.getName());
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    static Object zzf(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    private static Field zzf() {
        Field fieldZza;
        if (zzhi.zza() && (fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzk(Object obj, long j2) {
        return (byte) (zza(obj, ((-4) + j2) - ((-4) | j2)) >>> ((int) (((-1) - (((-1) - (~j2)) | ((-1) - 3))) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzl(Object obj, long j2) {
        return (byte) (zza(obj, ((-4) + j2) - ((-4) | j2)) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(Object obj, long j2) {
        return zzk(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzn(Object obj, long j2) {
        return zzl(obj, j2) != 0;
    }
}
