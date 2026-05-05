package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbdn extends IOException {
    zzbdn() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzbdn(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzbdn(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
