package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzhx implements zzhz {
    private zzhx() {
    }

    /* synthetic */ zzhx(zzhs zzhsVar) {
        this();
    }

    @Override // com.google.android.gms.internal.vision.zzhz
    public final byte[] zza(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }
}
