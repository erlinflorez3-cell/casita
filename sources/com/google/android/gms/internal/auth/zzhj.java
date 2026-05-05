package com.google.android.gms.internal.auth;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    static {
        boolean z2;
        boolean z3;
        zzhi zzhiVar;
        Unsafe unsafeZzg = zzg();
        zzb = unsafeZzg;
        int i2 = zzds.zza;
        zzc = Memory.class;
        boolean zZzs = zzs(Long.TYPE);
        zzd = zZzs;
        boolean zZzs2 = zzs(Integer.TYPE);
        zzhi zzhgVar = null;
        if (unsafeZzg != null) {
            if (zZzs) {
                zzhgVar = new zzhh(unsafeZzg);
            } else if (zZzs2) {
                zzhgVar = new zzhg(unsafeZzg);
            }
        }
        zze = zzhgVar;
        if (zzhgVar != null) {
            try {
                Class<?> cls = zzhgVar.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzh(th);
            }
            z2 = zzy() != null;
        }
        zzf = z2;
        zzhi zzhiVar2 = zze;
        if (zzhiVar2 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls2 = zzhiVar2.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod("getLong", Object.class, Long.TYPE);
                cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z3 = true;
            } catch (Throwable th2) {
                zzh(th2);
                z3 = false;
            }
        }
        zzg = z3;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field fieldZzy = zzy();
        if (fieldZzy != null && (zzhiVar = zze) != null) {
            zzhiVar.zza.objectFieldOffset(fieldZzy);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    static double zza(Object obj, long j2) {
        return zze.zza(obj, j2);
    }

    static float zzb(Object obj, long j2) {
        return zze.zzb(obj, j2);
    }

    static int zzc(Object obj, long j2) {
        return zze.zza.getInt(obj, j2);
    }

    static long zzd(Object obj, long j2) {
        return zze.zza.getLong(obj, j2);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object zzf(Object obj, long j2) {
        return zze.zza.getObject(obj, j2);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j2, boolean z2) {
        zzhi zzhiVar = zze;
        long j3 = ((-4) + j2) - ((-4) | j2);
        int i2 = zzhiVar.zza.getInt(obj, j3);
        int i3 = ((-1) - (((-1) - (~((int) j2))) | ((-1) - 3))) << 3;
        int i4 = ~(255 << i3);
        int i5 = (i4 + i2) - (i4 | i2);
        Unsafe unsafe = zzhiVar.zza;
        int i6 = (z2 ? 1 : 0) << i3;
        unsafe.putInt(obj, j3, (i6 + i5) - (i6 & i5));
    }

    static /* synthetic */ void zzj(Object obj, long j2, boolean z2) {
        zzhi zzhiVar = zze;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zzhiVar.zza.putInt(obj, j3, ((z2 ? 1 : 0) << i2) | ((~(255 << i2)) & zzhiVar.zza.getInt(obj, j3)));
    }

    static void zzk(Object obj, long j2, boolean z2) {
        zze.zzc(obj, j2, z2);
    }

    static void zzl(Object obj, long j2, double d2) {
        zze.zzd(obj, j2, d2);
    }

    static void zzm(Object obj, long j2, float f2) {
        zze.zze(obj, j2, f2);
    }

    static void zzn(Object obj, long j2, int i2) {
        zze.zza.putInt(obj, j2, i2);
    }

    static void zzo(Object obj, long j2, long j3) {
        zze.zza.putLong(obj, j2, j3);
    }

    static void zzp(Object obj, long j2, Object obj2) {
        zze.zza.putObject(obj, j2, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j2) {
        int i2 = zze.zza.getInt(obj, (-1) - (((-1) - (-4)) | ((-1) - j2)));
        long j3 = ~j2;
        int i3 = i2 >>> ((int) (((j3 + 3) - (j3 | 3)) << 3));
        return ((byte) ((i3 + 255) - (i3 | 255))) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j2) {
        int i2 = zze.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3));
        return ((byte) ((i2 + 255) - (i2 | 255))) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzs(Class cls) {
        int i2 = zzds.zza;
        try {
            Class cls2 = zzc;
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

    static boolean zzt(Object obj, long j2) {
        return zze.zzf(obj, j2);
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i2 = zzds.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
