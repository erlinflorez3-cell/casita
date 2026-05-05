package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class ii implements cf.I {
    private ie Code = new ie();
    private boolean V;
    private cf.I Z;

    ii(cf.I i2) {
        if (i2 == null) {
            throw new NullPointerException("sink == null");
        }
        this.Z = i2;
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I B(long j2) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.B(j2);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I C() throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        long jF = this.Code.f();
        if (jF > 0) {
            this.Z.Z(this.Code, jF);
        }
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I Code(int i2) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.Code(i2);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I I(int i2) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.I(i2);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I I(long j2) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.I(j2);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final ie L() {
        return this.Code;
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return this.Z.S();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I V(String str) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.V(str);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I Z(int i2) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.Z(i2);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I Z(byte[] bArr) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.Z(bArr);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final cf.I Z(byte[] bArr, int i2, int i3) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.Z(bArr, i2, i3);
        return C();
    }

    @Override // com.facetec.sdk.cf.I
    public final void Z(ie ieVar, long j2) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        this.Code.Z(ieVar, j2);
        C();
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        if (this.V) {
            return;
        }
        try {
            if (this.Code.Z > 0) {
                cf.I i2 = this.Z;
                ie ieVar = this.Code;
                i2.Z(ieVar, ieVar.Z);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.Z.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.V = true;
        if (th != null) {
            is.I(th);
        }
    }

    @Override // com.facetec.sdk.cf.I, java.io.Flushable
    public final void flush() throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        if (this.Code.Z > 0) {
            cf.I i2 = this.Z;
            ie ieVar = this.Code;
            i2.Z(ieVar, ieVar.Z);
        }
        this.Z.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.V;
    }

    public final String toString() {
        return new StringBuilder("buffer(").append(this.Z).append(")").toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (this.V) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.Code.write(byteBuffer);
        C();
        return iWrite;
    }
}
