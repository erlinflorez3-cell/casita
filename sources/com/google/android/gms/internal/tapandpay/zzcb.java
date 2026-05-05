package com.google.android.gms.internal.tapandpay;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcb {
    static Object zza(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
        sb.append("at index ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
