package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class fb implements Closeable, Flushable {
    private gl V;
    final cf.I Z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.V.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.V.flush();
    }
}
