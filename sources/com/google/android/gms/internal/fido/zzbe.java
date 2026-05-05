package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
class zzbe extends zzbf {
    final zzbb zzb;

    @CheckForNull
    final Character zzc;

    zzbe(zzbb zzbbVar, @CheckForNull Character ch) {
        this.zzb = zzbbVar;
        if (ch != null) {
            ch.charValue();
            if (zzbbVar.zzb('=')) {
                throw new IllegalArgumentException(zzan.zza("Padding character %s was already in alphabet", ch));
            }
        }
        this.zzc = ch;
    }

    zzbe(String str, String str2, @CheckForNull Character ch) {
        this(new zzbb(str, str2.toCharArray()), ch);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb.equals(zzbeVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbeVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        zzam.zze(0, i3, bArr.length);
        while (i4 < i3) {
            zzc(appendable, bArr, i4, Math.min(this.zzb.zzd, i3 - i4));
            i4 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    final int zzb(int i2) {
        zzbb zzbbVar = this.zzb;
        return zzbbVar.zzc * zzbh.zza(i2, zzbbVar.zzd, RoundingMode.CEILING);
    }

    final void zzc(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzam.zze(i2, i2 + i3, bArr.length);
        int i4 = 0;
        zzam.zzc(i3 <= this.zzb.zzd);
        long j2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = bArr[i2 + i5];
            long j3 = (b2 + 255) - (b2 | 255);
            j2 = ((j2 + j3) - (j2 & j3)) << 8;
        }
        int i6 = ((i3 + 1) * 8) - this.zzb.zzb;
        while (i4 < i3 * 8) {
            zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j2 >>> (i6 - i4)))));
            i4 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i4 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i4 += this.zzb.zzb;
            }
        }
    }
}
