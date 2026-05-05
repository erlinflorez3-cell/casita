package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public class zzch {
    @Deprecated
    public zzch() {
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzdi zzdiVar = new zzdi(stringWriter);
            zzdiVar.zzj(zzcp.LENIENT);
            zzde.zza.zzb(zzdiVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final zzck zzb() {
        if (this instanceof zzck) {
            return (zzck) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }
}
