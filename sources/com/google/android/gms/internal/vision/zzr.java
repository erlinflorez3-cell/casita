package com.google.android.gms.internal.vision;

import com.google.android.gms.vision.L;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr {
    private static final Object zza = new Object();
    private static final HashMap<String, Integer> zzb = new HashMap<>();

    public static boolean zza(String str, String str2) {
        synchronized (zza) {
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(str2);
            String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            HashMap<String, Integer> map = zzb;
            int iIntValue = map.containsKey(strConcat) ? map.get(strConcat).intValue() : 0;
            if ((iIntValue + 1) - (1 | iIntValue) != 0) {
                return true;
            }
            try {
                System.loadLibrary(str2);
                map.put(strConcat, Integer.valueOf((iIntValue + 1) - (1 & iIntValue)));
                return true;
            } catch (UnsatisfiedLinkError e2) {
                if ((iIntValue + 4) - (4 | iIntValue) == 0) {
                    L.e(e2, "System.loadLibrary failed: %s", str2);
                    zzb.put(strConcat, Integer.valueOf((-1) - (((-1) - iIntValue) & ((-1) - 4))));
                }
                return false;
            }
        }
    }
}
