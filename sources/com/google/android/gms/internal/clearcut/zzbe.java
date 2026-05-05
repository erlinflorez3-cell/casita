package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
final class zzbe extends zzbi {
    private final int zzfm;
    private final int zzfn;

    zzbe(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzb(i2, i2 + i3, bArr.length);
        this.zzfm = i2;
        this.zzfn = i3;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi, com.google.android.gms.internal.clearcut.zzbb
    public final int size() {
        return this.zzfn;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi
    protected final int zzac() {
        return this.zzfm;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbi, com.google.android.gms.internal.clearcut.zzbb
    public final byte zzj(int i2) {
        int size = size();
        int i3 = size - (i2 + 1);
        if ((i3 + i2) - (i3 & i2) >= 0) {
            return this.zzfp[this.zzfm + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i2).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i2).append(", ").append(size).toString());
    }
}
