package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes8.dex */
final class zzea {
    static int zza(int i2, int i3, int i4) {
        int i5 = i2 & (~i4);
        int i6 = (-1) - (((-1) - i3) | ((-1) - i4));
        return (i5 + i6) - (i5 & i6);
    }

    static int zza(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    static int zza(@NullableDecl Object obj, @NullableDecl Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i3;
        int i4;
        int iZza = zzec.zza(obj);
        int i5 = iZza & i2;
        int iZza2 = zza(obj3, i5);
        if (iZza2 == 0) {
            return -1;
        }
        int i6 = ~i2;
        int i7 = iZza & i6;
        int i8 = -1;
        while (true) {
            i3 = iZza2 - 1;
            i4 = iArr[i3];
            if ((i4 + i6) - (i4 | i6) == i7 && zzcz.zza(obj, objArr[i3]) && (objArr2 == null || zzcz.zza(obj2, objArr2[i3]))) {
                break;
            }
            iZza2 = (-1) - (((-1) - i4) | ((-1) - i2));
            if (iZza2 == 0) {
                return -1;
            }
            i8 = i3;
        }
        int i9 = (-1) - (((-1) - i4) | ((-1) - i2));
        if (i8 == -1) {
            zza(obj3, i5, i9);
        } else {
            iArr[i8] = zza(iArr[i8], i9, i2);
        }
        return i3;
    }

    static Object zza(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(new StringBuilder(52).append("must be power of 2 between 2^1 and 2^30: ").append(i2).toString());
        }
        return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
    }

    static void zza(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    static int zzb(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }
}
