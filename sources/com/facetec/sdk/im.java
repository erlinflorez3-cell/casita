package com.facetec.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class im {
    public static final im Code = new im() { // from class: com.facetec.sdk.im.5
        @Override // com.facetec.sdk.im
        public final im B(long j2, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.facetec.sdk.im
        public final void S() throws IOException {
        }

        @Override // com.facetec.sdk.im
        public final im Z(long j2) {
            return this;
        }
    };
    private long B;
    private long V;
    private boolean Z;

    public im B(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j2)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.V = timeUnit.toNanos(j2);
        return this;
    }

    public im L() {
        this.Z = false;
        return this;
    }

    public void S() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.Z && this.B - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public im Z(long j2) {
        this.Z = true;
        this.B = j2;
        return this;
    }

    public long a_() {
        return this.V;
    }

    public long b_() {
        if (this.Z) {
            return this.B;
        }
        throw new IllegalStateException("No deadline");
    }

    public im c_() {
        this.V = 0L;
        return this;
    }

    public boolean d_() {
        return this.Z;
    }
}
