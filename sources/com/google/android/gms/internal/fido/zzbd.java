package com.google.android.gms.internal.fido;

import java.io.IOException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzbd extends zzbe {
    zzbd(String str, String str2, @CheckForNull Character ch) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch);
        zzam.zzc(zzbbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzam.zze(0, i3, bArr.length);
        for (int i5 = i3; i5 >= 3; i5 -= 3) {
            int i6 = bArr[i4] & 255;
            int i7 = i6 << 16;
            int i8 = (bArr[i4 + 1] & 255) << 8;
            int i9 = ((i8 + i7) - (i8 & i7)) | ((-1) - (((-1) - bArr[i4 + 2]) | ((-1) - 255)));
            appendable.append(this.zzb.zza(i9 >>> 18));
            appendable.append(this.zzb.zza((-1) - (((-1) - (i9 >>> 12)) | ((-1) - 63))));
            appendable.append(this.zzb.zza((i9 >>> 6) & 63));
            appendable.append(this.zzb.zza(i9 & 63));
            i4 += 3;
        }
        if (i4 < i3) {
            zzc(appendable, bArr, i4, i3 - i4);
        }
    }
}
