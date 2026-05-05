package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
class zzid extends zzia {
    protected final byte[] zzb;

    zzid(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzht) || zza() != ((zzht) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof zzid)) {
            return obj.equals(this);
        }
        zzid zzidVar = (zzid) obj;
        int iZzd = zzd();
        int iZzd2 = zzidVar.zzd();
        if (iZzd == 0 || iZzd2 == 0 || iZzd == iZzd2) {
            return zza(zzidVar, 0, zza());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public byte zza(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    protected final int zza(int i2, int i3, int i4) {
        return zzjf.zza(i2, this.zzb, zze(), i4);
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final zzht zza(int i2, int i3) {
        int iZzb = zzb(0, i3, zza());
        return iZzb == 0 ? zzht.zza : new zzhw(this.zzb, zze(), iZzb);
    }

    @Override // com.google.android.gms.internal.vision.zzht
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    @Override // com.google.android.gms.internal.vision.zzht
    final void zza(zzhq zzhqVar) throws IOException {
        zzhqVar.zza(this.zzb, zze(), zza());
    }

    @Override // com.google.android.gms.internal.vision.zzht
    protected void zza(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zzb, 0, bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.vision.zzia
    final boolean zza(zzht zzhtVar, int i2, int i3) {
        if (i3 > zzhtVar.zza()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i3).append(zza()).toString());
        }
        if (i3 > zzhtVar.zza()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: 0, ").append(i3).append(", ").append(zzhtVar.zza()).toString());
        }
        if (!(zzhtVar instanceof zzid)) {
            return zzhtVar.zza(0, i3).equals(zza(0, i3));
        }
        zzid zzidVar = (zzid) zzhtVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzidVar.zzb;
        int iZze = zze() + i3;
        int iZze2 = zze();
        int iZze3 = zzidVar.zze();
        while (iZze2 < iZze) {
            if (bArr[iZze2] != bArr2[iZze3]) {
                return false;
            }
            iZze2++;
            iZze3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzht
    byte zzb(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.vision.zzht
    public final boolean zzc() {
        int iZze = zze();
        return zzmd.zza(this.zzb, iZze, zza() + iZze);
    }

    protected int zze() {
        return 0;
    }
}
