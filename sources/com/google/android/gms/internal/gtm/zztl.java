package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztk;
import com.google.android.gms.internal.gtm.zztl;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zztl<MessageType extends zztl<MessageType, BuilderType>, BuilderType extends zztk<MessageType, BuilderType>> implements zzzg {
    protected int zzb = 0;

    int zzQ(zzzt zzztVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final zzud zzR() {
        try {
            int iZzX = zzX();
            zzud zzudVar = zzud.zzb;
            byte[] bArr = new byte[iZzX];
            zzum zzumVar = new zzum(bArr, 0, iZzX);
            zzaw(zzumVar);
            if (zzumVar.zzb() == 0) {
                return new zzua(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e2);
        }
    }

    public final void zzS(OutputStream outputStream) throws IOException {
        int iZzX = zzX();
        int i2 = zzuq.zzf;
        if (iZzX > 4096) {
            iZzX = 4096;
        }
        zzuo zzuoVar = new zzuo(outputStream, iZzX);
        zzaw(zzuoVar);
        zzuoVar.zzJ();
    }
}
