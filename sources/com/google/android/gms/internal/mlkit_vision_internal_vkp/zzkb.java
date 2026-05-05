package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzkb {
    public static boolean zza(CharSequence charSequence, CharSequence charSequence2) {
        int iZzb;
        int length = charSequence.length();
        if (charSequence == "application/x-protobuf") {
            return true;
        }
        if (length != "application/x-protobuf".length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = "application/x-protobuf".charAt(i2);
            if (cCharAt != cCharAt2 && ((iZzb = zzb(cCharAt)) >= 26 || iZzb != zzb(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int zzb(char c2) {
        return (char) (((-1) - ((65535 - c2) & ((-1) - 32))) - 97);
    }
}
