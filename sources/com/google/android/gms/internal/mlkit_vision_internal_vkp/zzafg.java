package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafg {
    public static zzael zza(zzafk zzafkVar) throws zzaep {
        boolean z2;
        try {
            try {
                zzafkVar.zzn();
                z2 = false;
                try {
                    return (zzael) zzafi.zza.zza(zzafkVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z2) {
                        return zzaen.zza;
                    }
                    throw new zzaes(e);
                }
            } catch (zzafn e3) {
                throw new zzaes(e3);
            } catch (IOException e4) {
                throw new zzaem(e4);
            } catch (NumberFormatException e5) {
                throw new zzaes(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z2 = true;
        }
    }
}
