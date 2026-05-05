package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzbc extends zzbe {
    final char[] zza;

    zzbc(String str, String str2) {
        zzbb zzbbVar = new zzbb("base16()", "0123456789ABCDEF".toCharArray());
        super(zzbbVar, null);
        this.zza = new char[512];
        zzam.zzc(zzbbVar.zzf.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzbbVar.zza(i2 >>> 4);
            this.zza[(-1) - (((-1) - i2) & ((-1) - 256))] = zzbbVar.zza(15 & i2);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzam.zze(0, i3, bArr.length);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i4] & 255;
            appendable.append(this.zza[i5]);
            appendable.append(this.zza[(-1) - (((-1) - i5) & ((-1) - 256))]);
        }
    }
}
