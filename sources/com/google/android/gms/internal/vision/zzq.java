package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class zzq {
    public static boolean zza(Context context, String str, String str2) {
        String strZza = zzdg.zza(str2);
        if (!OptionalModuleUtils.FACE.equals(str) && !OptionalModuleUtils.ICA.equals(str) && !OptionalModuleUtils.OCR.equals(str) && !OptionalModuleUtils.BARCODE.equals(str)) {
            String.format("Unrecognized engine: %s", str);
            return false;
        }
        int iLastIndexOf = strZza.lastIndexOf(".so");
        if (iLastIndexOf == strZza.length() - 3) {
            strZza = strZza.substring(0, iLastIndexOf);
        }
        if (strZza.indexOf("lib") == 0) {
            strZza = strZza.substring(3);
        }
        boolean zZza = zzr.zza(str, strZza);
        if (!zZza) {
            String.format("%s engine not loaded with %s.", str, strZza);
        }
        return zZza;
    }
}
