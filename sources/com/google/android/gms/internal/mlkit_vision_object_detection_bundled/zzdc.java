package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdc {
    public static zzch zza(zzdg zzdgVar) throws zzcl {
        boolean z2;
        try {
            try {
                zzdgVar.zzn();
                z2 = false;
                try {
                    return (zzch) zzde.zza.zza(zzdgVar);
                } catch (EOFException e2) {
                    e = e2;
                    if (z2) {
                        return zzcj.zza;
                    }
                    throw new zzco(e);
                }
            } catch (zzdj e3) {
                throw new zzco(e3);
            } catch (IOException e4) {
                throw new zzci(e4);
            } catch (NumberFormatException e5) {
                throw new zzco(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z2 = true;
        }
    }
}
