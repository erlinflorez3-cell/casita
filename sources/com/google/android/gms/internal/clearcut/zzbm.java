package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
final class zzbm extends zzbk {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzfu;
    private int zzfv;
    private int zzfw;
    private int zzfx;

    /* JADX INFO: Access modifiers changed from: private */
    zzbm(byte[] bArr, int i2, int i3, boolean z2) {
        super();
        this.zzfx = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i3 + i2;
        this.pos = i2;
        this.zzfw = i2;
        this.zzfu = z2;
    }

    /* synthetic */ zzbm(byte[] bArr, int i2, int i3, boolean z2, zzbl zzblVar) {
        this(bArr, i2, i3, z2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzaf() {
        return this.pos - this.zzfw;
    }

    @Override // com.google.android.gms.internal.clearcut.zzbk
    public final int zzl(int i2) throws zzco {
        if (i2 < 0) {
            throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzaf = i2 + zzaf();
        int i3 = this.zzfx;
        if (iZzaf > i3) {
            throw zzco.zzbl();
        }
        this.zzfx = iZzaf;
        int i4 = this.limit + this.zzfv;
        this.limit = i4;
        int i5 = i4 - this.zzfw;
        if (i5 > iZzaf) {
            int i6 = i5 - iZzaf;
            this.zzfv = i6;
            this.limit = i4 - i6;
        } else {
            this.zzfv = 0;
        }
        return i3;
    }
}
