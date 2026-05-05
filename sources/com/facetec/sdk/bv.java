package com.facetec.sdk;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
class bv implements Serializable {
    private final int I;
    private final int V;
    private final byte[] Z;

    private bv(byte[] bArr, int i2, int i3) {
        this.Z = bArr;
        this.V = i2;
        this.I = i3;
    }

    byte[] getBytes() {
        return this.Z;
    }

    int getHeight() {
        return this.I;
    }

    int getWidth() {
        return this.V;
    }
}
