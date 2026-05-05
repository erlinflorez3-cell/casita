package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
final class zzgz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    static {
        boolean z2;
        boolean z3;
        zzgy zzgyVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        int i2 = zzct.zza;
        zzd = Memory.class;
        boolean zZzv = zzv(Long.TYPE);
        zze = zZzv;
        boolean zZzv2 = zzv(Integer.TYPE);
        zzgy zzgwVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzgwVar = new zzgx(unsafeZzg);
            } else if (zZzv2) {
                zzgwVar = new zzgw(unsafeZzg);
            }
        }
        zzf = zzgwVar;
        if (zzgwVar != null) {
            try {
                Class<?> cls = zzgwVar.zza.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
            } catch (Throwable th) {
                zzh(th);
            }
            z2 = zzB() != null;
        }
        zzg = z2;
        zzgy zzgyVar2 = zzf;
        if (zzgyVar2 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls2 = zzgyVar2.zza.getClass();
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
        zzh = z3;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzgyVar = zzf) != null) {
            zzgyVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzgz() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i2 = zzct.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, SentryLockReason.JsonKeys.ADDRESS);
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j2, byte b2) {
        zzgy zzgyVar = zzf;
        long j3 = (-1) - (((-1) - (-4)) | ((-1) - j2));
        int i2 = zzgyVar.zza.getInt(obj, j3);
        int i3 = ((~((int) j2)) & 3) << 3;
        zzgyVar.zza.putInt(obj, j3, (-1) - (((-1) - (((-1) - (((-1) - 255) | ((-1) - b2))) << i3)) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - (~(255 << i3))))))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j2, byte b2) {
        zzgy zzgyVar = zzf;
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        zzgyVar.zza.putInt(obj, j3, (-1) - (((-1) - (((-1) - (((-1) - 255) | ((-1) - b2))) << i2)) & ((-1) - (zzgyVar.zza.getInt(obj, j3) & (~(255 << i2))))));
    }

    static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    static int zzc(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    static long zzd(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    static Object zzf(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzgz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void zzm(Object obj, long j2, boolean z2) {
        zzf.zzc(obj, j2, z2);
    }

    static void zzn(byte[] bArr, long j2, byte b2) {
        zzf.zzd(bArr, zza + j2, b2);
    }

    static void zzo(Object obj, long j2, double d2) {
        zzf.zze(obj, j2, d2);
    }

    static void zzp(Object obj, long j2, float f2) {
        zzf.zzf(obj, j2, f2);
    }

    static void zzq(Object obj, long j2, int i2) {
        zzf.zza.putInt(obj, j2, i2);
    }

    static void zzr(Object obj, long j2, long j3) {
        zzf.zza.putLong(obj, j2, j3);
    }

    static void zzs(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j2) {
        int i2 = zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3));
        return ((byte) ((i2 + 255) - (i2 | 255))) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j2) {
        return ((byte) ((-1) - (((-1) - (zzf.zza.getInt(obj, ((-4) + j2) - ((-4) | j2)) >>> ((int) ((j2 & 3) << 3)))) | ((-1) - 255)))) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzv(Class cls) {
        int i2 = zzct.zza;
        try {
            Class cls2 = zzd;
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

    static boolean zzw(Object obj, long j2) {
        return zzf.zzg(obj, j2);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
