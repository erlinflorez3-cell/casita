package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaeq {
    public static zzael zza(zzafk zzafkVar) throws zzaes, zzaem {
        zzaet zzaetVarZzb = zzafkVar.zzb();
        if (zzaetVarZzb == zzaet.LEGACY_STRICT) {
            zzafkVar.zzk(zzaet.LENIENT);
        }
        try {
            try {
                return zzafg.zza(zzafkVar);
            } catch (OutOfMemoryError e2) {
                throw new zzaep("Failed parsing JSON source: " + zzafkVar.toString() + " to Json", e2);
            } catch (StackOverflowError e3) {
                throw new zzaep("Failed parsing JSON source: " + zzafkVar.toString() + " to Json", e3);
            }
        } finally {
            zzafkVar.zzk(zzaetVarZzb);
        }
    }

    public static zzael zzb(String str) throws zzaes {
        try {
            zzafk zzafkVar = new zzafk(new StringReader(str));
            zzael zzaelVarZza = zza(zzafkVar);
            if (!(zzaelVarZza instanceof zzaen) && zzafkVar.zzn() != 10) {
                throw new zzaes("Did not consume the entire document.");
            }
            return zzaelVarZza;
        } catch (zzafn e2) {
            throw new zzaes(e2);
        } catch (IOException e3) {
            throw new zzaem(e3);
        } catch (NumberFormatException e4) {
            throw new zzaes(e4);
        }
    }
}
