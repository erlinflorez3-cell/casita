package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class gl implements Closeable, Flushable {
    private LinkedHashMap<String, V> B;
    private boolean C;
    private int Code;
    private final Runnable D;
    private int F;
    private long I;
    private boolean L;
    private final Executor S;
    private long V;
    private cf.I Z;

    final class V {
        final String B;
        Z Code;
        boolean I;
        final long[] Z;

        final void Z(cf.I i2) throws IOException {
            for (long j2 : this.Z) {
                i2.I(32).B(j2);
            }
        }
    }

    public final class Z {
        private boolean B;
        final V V;
        private /* synthetic */ gl Z;

        public final void Z() throws IOException {
            synchronized (this.Z) {
                if (this.B) {
                    throw new IllegalStateException();
                }
                if (this.V.Code == this) {
                    this.Z.I(this);
                }
                this.B = true;
            }
        }
    }

    static {
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    private synchronized boolean B() {
        return this.L;
    }

    private boolean Code() {
        int i2 = this.F;
        return i2 >= 2000 && i2 >= this.B.size();
    }

    private synchronized void V() {
        if (B()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private boolean V(V v2) throws IOException {
        if (v2.Code != null) {
            Z z2 = v2.Code;
            if (z2.V.Code == z2) {
                z2.V.Code = null;
            }
        }
        for (int i2 = 0; i2 < this.Code; i2++) {
            this.V -= v2.Z[i2];
            v2.Z[i2] = 0;
        }
        this.F++;
        this.Z.V("REMOVE").I(32).V(v2.B).I(10);
        this.B.remove(v2.B);
        if (Code()) {
            this.S.execute(this.D);
        }
        return true;
    }

    private void Z() throws IOException {
        while (this.V > this.I) {
            V(this.B.values().iterator().next());
        }
    }

    final synchronized void I(Z z2) throws IOException {
        V v2 = z2.V;
        if (v2.Code != z2) {
            throw new IllegalStateException();
        }
        this.F++;
        v2.Code = null;
        if (v2.I) {
            v2.I = true;
            this.Z.V("CLEAN").I(32);
            this.Z.V(v2.B);
            v2.Z(this.Z);
            this.Z.I(10);
        } else {
            this.B.remove(v2.B);
            this.Z.V("REMOVE").I(32);
            this.Z.V(v2.B);
            this.Z.I(10);
        }
        this.Z.flush();
        if (this.V > this.I || Code()) {
            this.S.execute(this.D);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (!this.C || this.L) {
            this.L = true;
            return;
        }
        for (V v2 : (V[]) this.B.values().toArray(new V[this.B.size()])) {
            if (v2.Code != null) {
                v2.Code.Z();
            }
        }
        Z();
        this.Z.close();
        this.Z = null;
        this.L = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.C) {
            V();
            Z();
            this.Z.flush();
        }
    }
}
