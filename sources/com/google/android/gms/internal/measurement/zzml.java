package com.google.android.gms.internal.measurement;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzml {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    private static final class zza extends zzb {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, byte b2) {
            if (zzml.zza) {
                zzml.zzc(obj, j2, b2);
            } else {
                zzml.zzd(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzml.zza) {
                zzml.zza(obj, j2, z2);
            } else {
                zzml.zzb(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final boolean zzc(Object obj, long j2) {
            return zzml.zza ? zzml.zzf(obj, j2) : zzml.zzg(obj, j2);
        }
    }

    private static abstract class zzb {
        Unsafe zza;

        zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j2);

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

        public final boolean zza() {
            Unsafe unsafe = this.zza;
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
                return true;
            } catch (Throwable th) {
                zzml.zza(th);
                return false;
            }
        }

        public abstract float zzb(Object obj, long j2);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzml.zze() != null;
            } catch (Throwable th) {
                zzml.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j2);

        public final int zzd(Object obj, long j2) {
            return this.zza.getInt(obj, j2);
        }

        public final long zze(Object obj, long j2) {
            return this.zza.getLong(obj, j2);
        }
    }

    private static final class zzc extends zzb {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final double zza(Object obj, long j2) {
            return Double.longBitsToDouble(zze(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, byte b2) {
            if (zzml.zza) {
                zzml.zzc(obj, j2, b2);
            } else {
                zzml.zzd(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzml.zza) {
                zzml.zza(obj, j2, z2);
            } else {
                zzml.zzb(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final float zzb(Object obj, long j2) {
            return Float.intBitsToFloat(zzd(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final boolean zzc(Object obj, long j2) {
            return zzml.zza ? zzml.zzf(obj, j2) : zzml.zzg(obj, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    static {
        /*
            sun.misc.Unsafe r2 = zzb()
            com.google.android.gms.internal.measurement.zzml.zzb = r2
            java.lang.Class r0 = com.google.android.gms.internal.measurement.zzih.zza()
            com.google.android.gms.internal.measurement.zzml.zzc = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r1 = zzd(r0)
            com.google.android.gms.internal.measurement.zzml.zzd = r1
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = zzd(r0)
            com.google.android.gms.internal.measurement.zzml.zze = r0
            if (r2 == 0) goto L99
            if (r1 == 0) goto L91
            com.google.android.gms.internal.measurement.zzml$zzc r3 = new com.google.android.gms.internal.measurement.zzml$zzc
            r3.<init>(r2)
        L25:
            com.google.android.gms.internal.measurement.zzml.zzf = r3
            r2 = 0
            if (r3 != 0) goto L8c
            r0 = r2
        L2b:
            com.google.android.gms.internal.measurement.zzml.zzg = r0
            if (r3 != 0) goto L87
            r0 = r2
        L30:
            com.google.android.gms.internal.measurement.zzml.zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzb(r0)
            long r0 = (long) r0
            com.google.android.gms.internal.measurement.zzml.zzi = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            zzb(r0)
            zzc(r0)
            java.lang.Class<int[]> r0 = int[].class
            zzb(r0)
            zzc(r0)
            java.lang.Class<long[]> r0 = long[].class
            zzb(r0)
            zzc(r0)
            java.lang.Class<float[]> r0 = float[].class
            zzb(r0)
            zzc(r0)
            java.lang.Class<double[]> r0 = double[].class
            zzb(r0)
            zzc(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzb(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzc(r0)
            java.lang.reflect.Field r1 = zze()
            if (r1 == 0) goto L75
            if (r3 != 0) goto L81
        L75:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r0) goto L7e
            r2 = 1
        L7e:
            com.google.android.gms.internal.measurement.zzml.zza = r2
            return
        L81:
            sun.misc.Unsafe r0 = r3.zza
            r0.objectFieldOffset(r1)
            goto L75
        L87:
            boolean r0 = r3.zza()
            goto L30
        L8c:
            boolean r0 = r3.zzb()
            goto L2b
        L91:
            if (r0 == 0) goto L99
            com.google.android.gms.internal.measurement.zzml$zza r3 = new com.google.android.gms.internal.measurement.zzml$zza
            r3.<init>(r2)
            goto L25
        L99:
            r3 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.<clinit>():void");
    }

    private zzml() {
    }

    static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
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

    static /* synthetic */ void zza(Object obj, long j2, boolean z2) {
        zzc(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzml.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: " + String.valueOf(th));
    }

    static void zza(byte[] bArr, long j2, byte b2) {
        zzf.zza((Object) bArr, zzi + j2, b2);
    }

    static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzb(Object obj, long j2, boolean z2) {
        zzd(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j2) {
        return zzf.zzd(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j2, byte b2) {
        long j3 = ((-4) + j2) - ((-4) | j2);
        int iZzc = zzc(obj, j3);
        int i2 = ((-1) - (((-1) - (~((int) j2))) | ((-1) - 3))) << 3;
        int i3 = ~(255 << i2);
        zza(obj, j3, (((-1) - (((-1) - 255) | ((-1) - b2))) << i2) | ((iZzc + i3) - (iZzc | i3)));
    }

    static void zzc(Object obj, long j2, boolean z2) {
        zzf.zza(obj, j2, z2);
    }

    static boolean zzc() {
        return zzh;
    }

    static long zzd(Object obj, long j2) {
        return zzf.zze(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j2, byte b2) {
        long j3 = ((-4) + j2) - ((-4) | j2);
        int i2 = (((int) j2) & 3) << 3;
        zza(obj, j3, (((255 + b2) - (255 | b2)) << i2) | (zzc(obj, j3) & (~(255 << i2))));
    }

    static boolean zzd() {
        return zzg;
    }

    private static boolean zzd(Class<?> cls) {
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

    static Object zze(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    static /* synthetic */ boolean zzf(Object obj, long j2) {
        int iZzc = zzc(obj, ((-4) + j2) - ((-4) | j2));
        long j3 = ~j2;
        return ((byte) (iZzc >>> ((int) (((j3 + 3) - (j3 | 3)) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j2) {
        return ((byte) (zzc(obj, ((-4) + j2) - ((-4) | j2)) >>> ((int) (((j2 + 3) - (j2 | 3)) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }
}
