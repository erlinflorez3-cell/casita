package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.IOException;

/* JADX INFO: renamed from: com.facetec.sdk.if, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cif implements cf.I {
    private final cf.I I;

    public Cif(cf.I i2) {
        if (i2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.I = i2;
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return this.I.S();
    }

    @Override // com.facetec.sdk.cf.I
    public long V(ie ieVar, long j2) throws IOException {
        return this.I.V(ieVar, j2);
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.I.close();
    }

    public final cf.I f() {
        return this.I;
    }

    public String toString() {
        return new StringBuilder().append(getClass().getSimpleName()).append("(").append(this.I.toString()).append(")").toString();
    }
}
