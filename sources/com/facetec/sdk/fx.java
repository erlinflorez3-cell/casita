package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum fx {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    private final String C;

    fx(String str) {
        this.C = str;
    }

    public static fx V(String str) throws IOException {
        fx fxVar = HTTP_1_0;
        if (str.equals(fxVar.C)) {
            return fxVar;
        }
        fx fxVar2 = HTTP_1_1;
        if (str.equals(fxVar2.C)) {
            return fxVar2;
        }
        fx fxVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(fxVar3.C)) {
            return fxVar3;
        }
        fx fxVar4 = HTTP_2;
        if (str.equals(fxVar4.C)) {
            return fxVar4;
        }
        if (str.equals(SPDY_3.C)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.C)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.C;
    }
}
