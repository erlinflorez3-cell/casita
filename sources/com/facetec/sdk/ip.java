package com.facetec.sdk;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class ip {

    @Nullable
    private static il B = null;
    private static long Code = 0;

    private ip() {
    }

    static il Code() {
        synchronized (ip.class) {
            il ilVar = B;
            if (ilVar == null) {
                return new il();
            }
            B = ilVar.C;
            ilVar.C = null;
            Code -= 8192;
            return ilVar;
        }
    }

    static void Z(il ilVar) {
        if (ilVar.C != null || ilVar.D != null) {
            throw new IllegalArgumentException();
        }
        if (ilVar.B) {
            return;
        }
        synchronized (ip.class) {
            long j2 = Code;
            if (j2 + 8192 > 65536) {
                return;
            }
            Code = j2 + 8192;
            ilVar.C = B;
            ilVar.I = 0;
            ilVar.Z = 0;
            B = ilVar;
        }
    }
}
