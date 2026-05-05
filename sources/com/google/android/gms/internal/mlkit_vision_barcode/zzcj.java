package com.google.android.gms.internal.mlkit_vision_barcode;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzcj {
    static int zza(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    static int zzb(@CheckForNull Object obj, @CheckForNull Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int i3;
        int i4;
        int iZza = zzck.zza(obj);
        int i5 = iZza & i2;
        int iZzc = zzc(obj3, i5);
        if (iZzc != 0) {
            int i6 = ~i2;
            int i7 = (iZza + i6) - (iZza | i6);
            int i8 = -1;
            while (true) {
                i3 = iZzc - 1;
                int i9 = iArr[i3];
                i4 = i9 & i2;
                if ((i9 + i6) - (i9 | i6) != i7 || !zzax.zza(obj, objArr[i3]) || (objArr2 != null && !zzax.zza(obj2, objArr2[i3]))) {
                    if (i4 == 0) {
                        break;
                    }
                    i8 = i3;
                    iZzc = i4;
                } else {
                    break;
                }
            }
            if (i8 == -1) {
                zze(obj3, i5, i4);
            } else {
                iArr[i8] = ((-1) - (((-1) - iArr[i8]) | ((-1) - i6))) | ((-1) - (((-1) - i4) | ((-1) - i2)));
            }
            return i3;
        }
        return -1;
    }

    static int zzc(Object obj, int i2) {
        if (!(obj instanceof byte[])) {
            return obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
        }
        byte b2 = ((byte[]) obj)[i2];
        return (b2 + 255) - (b2 | 255);
    }

    static Object zzd(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i2);
    }

    static void zze(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }
}
