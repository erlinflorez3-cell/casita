package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facetec.sdk.cf;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class ig implements cf.I {
    private final cf.I B;
    private boolean I;
    private int V;
    private final Inflater Z;

    ig(cf.I i2, Inflater inflater) {
        if (i2 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.B = i2;
        this.Z = inflater;
    }

    private boolean h() throws IOException {
        if (!this.Z.needsInput()) {
            return false;
        }
        i();
        if (this.Z.getRemaining() != 0) {
            throw new IllegalStateException(Global.QUESTION);
        }
        if (this.B.F()) {
            return true;
        }
        il ilVar = this.B.L().V;
        this.V = ilVar.I - ilVar.Z;
        this.Z.setInput(ilVar.V, ilVar.Z, this.V);
        return false;
    }

    private void i() throws IOException {
        int i2 = this.V;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.Z.getRemaining();
        this.V -= remaining;
        this.B.V(remaining);
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return this.B.S();
    }

    @Override // com.facetec.sdk.cf.I
    public final long V(ie ieVar, long j2) throws IOException {
        boolean zH;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
        }
        if (this.I) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return 0L;
        }
        do {
            zH = h();
            try {
                il ilVarC = ieVar.C(1);
                int iInflate = this.Z.inflate(ilVarC.V, ilVarC.I, (int) Math.min(j2, 8192 - ilVarC.I));
                if (iInflate > 0) {
                    ilVarC.I += iInflate;
                    long j3 = iInflate;
                    ieVar.Z += j3;
                    return j3;
                }
                if (this.Z.finished() || this.Z.needsDictionary()) {
                    i();
                    if (ilVarC.Z != ilVarC.I) {
                        return -1L;
                    }
                    ieVar.V = ilVarC.V();
                    ip.Z(ilVarC);
                    return -1L;
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        } while (!zH);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.I) {
            return;
        }
        this.Z.end();
        this.I = true;
        this.B.close();
    }
}
