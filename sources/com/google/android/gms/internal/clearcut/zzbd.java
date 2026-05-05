package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzbd implements zzbf {
    private zzbd() {
    }

    /* synthetic */ zzbd(zzbc zzbcVar) {
        this();
    }

    @Override // com.google.android.gms.internal.clearcut.zzbf
    public final byte[] zzc(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }
}
