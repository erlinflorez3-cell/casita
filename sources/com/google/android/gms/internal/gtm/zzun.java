package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzun extends IOException {
    zzun() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzun(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    zzun(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
