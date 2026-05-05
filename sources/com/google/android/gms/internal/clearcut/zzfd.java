package com.google.android.gms.internal.clearcut;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzfd {
    private static final Logger logger = Logger.getLogger(zzfd.class.getName());
    private static final Class<?> zzfb;
    private static final boolean zzfy;
    private static final Unsafe zzmh;
    private static final boolean zzpg;
    private static final boolean zzph;
    private static final zzd zzpi;
    private static final boolean zzpj;
    private static final long zzpk;
    private static final long zzpl;
    private static final long zzpm;
    private static final long zzpn;
    private static final long zzpo;
    private static final long zzpp;
    private static final long zzpq;
    private static final long zzpr;
    private static final long zzps;
    private static final long zzpt;
    private static final long zzpu;
    private static final long zzpv;
    private static final long zzpw;
    private static final long zzpx;
    private static final long zzpy;
    private static final boolean zzpz;

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j2, byte b2) {
            Memory.pokeByte((int) j2, b2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzfd.zzpz) {
                zzfd.zzb(obj, j2, z2);
            } else {
                zzfd.zzc(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j2, long j3, long j4) {
            Memory.pokeByteArray((int) j3, bArr, (int) j2, (int) j4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(Object obj, long j2, byte b2) {
            if (zzfd.zzpz) {
                zzfd.zza(obj, j2, b2);
            } else {
                zzfd.zzb(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(Object obj, long j2) {
            return zzfd.zzpz ? zzfd.zzr(obj, j2) : zzfd.zzs(obj, j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(Object obj, long j2) {
            return Float.intBitsToFloat(zzj(obj, j2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(Object obj, long j2) {
            return Double.longBitsToDouble(zzk(obj, j2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(Object obj, long j2) {
            return zzfd.zzpz ? zzfd.zzp(obj, j2) : zzfd.zzq(obj, j2);
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j2, byte b2) {
            Memory.pokeByte(j2, b2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, double d2) {
            zza(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, float f2) {
            zza(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, boolean z2) {
            if (zzfd.zzpz) {
                zzfd.zzb(obj, j2, z2);
            } else {
                zzfd.zzc(obj, j2, z2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j2, long j3, long j4) {
            Memory.pokeByteArray(j3, bArr, (int) j2, (int) j4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(Object obj, long j2, byte b2) {
            if (zzfd.zzpz) {
                zzfd.zza(obj, j2, b2);
            } else {
                zzfd.zzb(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(Object obj, long j2) {
            return zzfd.zzpz ? zzfd.zzr(obj, j2) : zzfd.zzs(obj, j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(Object obj, long j2) {
            return Float.intBitsToFloat(zzj(obj, j2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(Object obj, long j2) {
            return Double.longBitsToDouble(zzk(obj, j2));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(Object obj, long j2) {
            return zzfd.zzpz ? zzfd.zzp(obj, j2) : zzfd.zzq(obj, j2);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j2, byte b2) {
            this.zzqa.putByte(j2, b2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, double d2) {
            this.zzqa.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, float f2) {
            this.zzqa.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j2, boolean z2) {
            this.zzqa.putBoolean(obj, j2, z2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j2, long j3, long j4) {
            this.zzqa.copyMemory(bArr, zzfd.zzpk + j2, (Object) null, j3, j4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(Object obj, long j2, byte b2) {
            this.zzqa.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(Object obj, long j2) {
            return this.zzqa.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(Object obj, long j2) {
            return this.zzqa.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(Object obj, long j2) {
            return this.zzqa.getDouble(obj, j2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(Object obj, long j2) {
            return this.zzqa.getByte(obj, j2);
        }
    }

    static abstract class zzd {
        Unsafe zzqa;

        zzd(Unsafe unsafe) {
            this.zzqa = unsafe;
        }

        public final long zza(Field field) {
            return this.zzqa.objectFieldOffset(field);
        }

        public abstract void zza(long j2, byte b2);

        public abstract void zza(Object obj, long j2, double d2);

        public abstract void zza(Object obj, long j2, float f2);

        public final void zza(Object obj, long j2, int i2) {
            this.zzqa.putInt(obj, j2, i2);
        }

        public final void zza(Object obj, long j2, long j3) {
            this.zzqa.putLong(obj, j2, j3);
        }

        public abstract void zza(Object obj, long j2, boolean z2);

        public abstract void zza(byte[] bArr, long j2, long j3, long j4);

        public abstract void zze(Object obj, long j2, byte b2);

        public final int zzj(Object obj, long j2) {
            return this.zzqa.getInt(obj, j2);
        }

        public final long zzk(Object obj, long j2) {
            return this.zzqa.getLong(obj, j2);
        }

        public abstract boolean zzl(Object obj, long j2);

        public abstract float zzm(Object obj, long j2);

        public abstract double zzn(Object obj, long j2);

        public abstract byte zzx(Object obj, long j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002b  */
    static {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfd.<clinit>():void");
    }

    private zzfd() {
    }

    static byte zza(byte[] bArr, long j2) {
        return zzpi.zzx(bArr, zzpk + j2);
    }

    static long zza(Field field) {
        return zzpi.zza(field);
    }

    static void zza(long j2, byte b2) {
        zzpi.zza(j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iZzj = zzj(obj, j3);
        int i2 = ((-1) - (((-1) - (~((int) j2))) | ((-1) - 3))) << 3;
        zza(obj, j3, ((255 & b2) << i2) | (iZzj & (~(255 << i2))));
    }

    static void zza(Object obj, long j2, double d2) {
        zzpi.zza(obj, j2, d2);
    }

    static void zza(Object obj, long j2, float f2) {
        zzpi.zza(obj, j2, f2);
    }

    static void zza(Object obj, long j2, int i2) {
        zzpi.zza(obj, j2, i2);
    }

    static void zza(Object obj, long j2, long j3) {
        zzpi.zza(obj, j2, j3);
    }

    static void zza(Object obj, long j2, Object obj2) {
        zzpi.zzqa.putObject(obj, j2, obj2);
    }

    static void zza(Object obj, long j2, boolean z2) {
        zzpi.zza(obj, j2, z2);
    }

    static void zza(byte[] bArr, long j2, byte b2) {
        zzpi.zze(bArr, zzpk + j2, b2);
    }

    static void zza(byte[] bArr, long j2, long j3, long j4) {
        zzpi.zza(bArr, j2, j3, j4);
    }

    private static long zzb(Field field) {
        zzd zzdVar;
        if (field == null || (zzdVar = zzpi) == null) {
            return -1L;
        }
        return zzdVar.zza(field);
    }

    static long zzb(ByteBuffer byteBuffer) {
        return zzpi.zzk(byteBuffer, zzpx);
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((-1) - (((-1) - ((int) j2)) | ((-1) - 3))) << 3;
        zza(obj, j3, (((-1) - (((-1) - 255) | ((-1) - b2))) << i2) | ((-1) - (((-1) - zzj(obj, j3)) | ((-1) - (~(255 << i2))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j2, boolean z2) {
        zza(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j2, boolean z2) {
        zzb(obj, j2, z2 ? (byte) 1 : (byte) 0);
    }

    static boolean zzed() {
        return zzfy;
    }

    static boolean zzee() {
        return zzpj;
    }

    static Unsafe zzef() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfe());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzeg() {
        Unsafe unsafe = zzmh;
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
            if (zzaw.zzx()) {
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
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    private static boolean zzeh() {
        Unsafe unsafe = zzmh;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzei() == null) {
                return false;
            }
            if (zzaw.zzx()) {
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
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(strValueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(strValueOf).toString());
            return false;
        }
    }

    private static Field zzei() {
        Field fieldZzb;
        if (zzaw.zzx() && (fieldZzb = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldZzb;
        }
        Field fieldZzb2 = zzb(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZzb2 == null || fieldZzb2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzb2;
    }

    private static int zzg(Class<?> cls) {
        if (zzfy) {
            return zzpi.zzqa.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzh(Class<?> cls) {
        if (zzfy) {
            return zzpi.zzqa.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzi(Class<?> cls) {
        if (!zzaw.zzx()) {
            return false;
        }
        try {
            Class<?> cls2 = zzfb;
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

    static int zzj(Object obj, long j2) {
        return zzpi.zzj(obj, j2);
    }

    static long zzk(Object obj, long j2) {
        return zzpi.zzk(obj, j2);
    }

    static boolean zzl(Object obj, long j2) {
        return zzpi.zzl(obj, j2);
    }

    static float zzm(Object obj, long j2) {
        return zzpi.zzm(obj, j2);
    }

    static double zzn(Object obj, long j2) {
        return zzpi.zzn(obj, j2);
    }

    static Object zzo(Object obj, long j2) {
        return zzpi.zzqa.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzp(Object obj, long j2) {
        int iZzj = zzj(obj, (-4) & j2);
        long j3 = ~j2;
        return (byte) (iZzj >>> ((int) (((j3 + 3) - (j3 | 3)) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j2) {
        return (byte) (zzj(obj, ((-4) + j2) - ((-4) | j2)) >>> ((int) (((-1) - (((-1) - j2) | ((-1) - 3))) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzr(Object obj, long j2) {
        return zzp(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j2) {
        return zzq(obj, j2) != 0;
    }
}
