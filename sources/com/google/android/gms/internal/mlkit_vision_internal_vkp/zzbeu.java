package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbeu {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        int i2 = zzbdj.zzd;
        zzbdj.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    static int zzb(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    static boolean zzd(zzbfs zzbfsVar) {
        if (!(zzbfsVar instanceof zzbcl)) {
            return false;
        }
        throw null;
    }
}
