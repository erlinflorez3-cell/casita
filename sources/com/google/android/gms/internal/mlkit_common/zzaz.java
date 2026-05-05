package com.google.android.gms.internal.mlkit_common;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
final class zzaz extends OutputStream {
    private long zza = 0;

    zzaz() {
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.zza++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int length;
        int i4;
        if (i2 < 0 || i2 > (length = bArr.length) || i3 < 0 || (i4 = i2 + i3) > length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.zza += (long) i3;
    }

    final long zza() {
        return this.zza;
    }
}
