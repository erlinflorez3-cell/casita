package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class id implements cf.I {
    private final cf.I Code;

    public id(cf.I i2) {
        if (i2 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.Code = i2;
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return this.Code.S();
    }

    @Override // com.facetec.sdk.cf.I
    public void Z(ie ieVar, long j2) throws IOException {
        this.Code.Z(ieVar, j2);
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.Code.close();
    }

    @Override // com.facetec.sdk.cf.I, java.io.Flushable
    public void flush() throws IOException {
        this.Code.flush();
    }

    public String toString() {
        return new StringBuilder().append(getClass().getSimpleName()).append("(").append(this.Code.toString()).append(")").toString();
    }
}
