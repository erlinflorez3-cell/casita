package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcm {
    public static zzch zza(zzdg zzdgVar) throws zzci, zzco {
        zzcp zzcpVarZzb = zzdgVar.zzb();
        if (zzcpVarZzb == zzcp.LEGACY_STRICT) {
            zzdgVar.zzk(zzcp.LENIENT);
        }
        try {
            try {
                return zzdc.zza(zzdgVar);
            } catch (OutOfMemoryError e2) {
                throw new zzcl("Failed parsing JSON source: " + zzdgVar.toString() + " to Json", e2);
            } catch (StackOverflowError e3) {
                throw new zzcl("Failed parsing JSON source: " + zzdgVar.toString() + " to Json", e3);
            }
        } finally {
            zzdgVar.zzk(zzcpVarZzb);
        }
    }

    public static zzch zzb(String str) throws zzco {
        try {
            zzdg zzdgVar = new zzdg(new StringReader(str));
            zzch zzchVarZza = zza(zzdgVar);
            if (!(zzchVarZza instanceof zzcj) && zzdgVar.zzn() != 10) {
                throw new zzco("Did not consume the entire document.");
            }
            return zzchVarZza;
        } catch (zzdj e2) {
            throw new zzco(e2);
        } catch (IOException e3) {
            throw new zzci(e3);
        } catch (NumberFormatException e4) {
            throw new zzco(e4);
        }
    }
}
