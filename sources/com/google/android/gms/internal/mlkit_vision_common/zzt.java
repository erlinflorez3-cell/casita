package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes8.dex */
public final class zzt {
    static Object[] zza(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException("at index " + i3);
            }
        }
        return objArr;
    }
}
