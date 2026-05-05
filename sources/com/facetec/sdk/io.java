package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
final class io implements cf.I {
    private cf.I B;
    private boolean Code;
    private ie Z = new ie();

    io(cf.I i2) {
        if (i2 == null) {
            throw new NullPointerException("source == null");
        }
        this.B = i2;
    }

    private boolean F(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
        }
        if (this.Code) {
            throw new IllegalStateException("closed");
        }
        while (this.Z.Z < j2) {
            if (this.B.V(this.Z, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    private boolean V(ib ibVar, int i2) throws IOException {
        if (this.Code) {
            throw new IllegalStateException("closed");
        }
        if (i2 < 0 || ibVar.S() < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3;
            if (!F(1 + j2) || this.Z.F(j2) != ibVar.B(i3)) {
                return false;
            }
        }
        return true;
    }

    private long Z(byte b2, long j2, long j3) throws IOException {
        long jMax = j2;
        if (this.Code) {
            throw new IllegalStateException("closed");
        }
        if (j3 < 0) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j3)));
        }
        while (jMax < j3) {
            long jZ = this.Z.Z(b2, jMax, j3);
            if (jZ != -1) {
                return jZ;
            }
            long j4 = this.Z.Z;
            if (j4 >= j3 || this.B.V(this.Z, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
        }
        return -1L;
    }

    @Override // com.facetec.sdk.cf.I
    public final String C(long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j2)));
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jZ = Z((byte) 10, 0L, j3);
        if (jZ != -1) {
            return this.Z.S(jZ);
        }
        if (j3 < Long.MAX_VALUE && F(j3) && this.Z.F(j3 - 1) == 13 && F(1 + j3) && this.Z.F(j3) == 10) {
            return this.Z.S(j3);
        }
        ie ieVar = new ie();
        ie ieVar2 = this.Z;
        ieVar2.Code(ieVar, 0L, Math.min(32L, ieVar2.h()));
        throw new EOFException(new StringBuilder("\\n not found: limit=").append(Math.min(this.Z.h(), j2)).append(" content=").append(ieVar.i().I()).append(Typography.ellipsis).toString());
    }

    @Override // com.facetec.sdk.cf.I
    public final ib Code(long j2) throws IOException {
        Z(j2);
        return this.Z.Code(j2);
    }

    @Override // com.facetec.sdk.cf.I
    public final String Code(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.Z.V(this.B);
        return this.Z.Code(charset);
    }

    @Override // com.facetec.sdk.cf.I
    public final void Code(byte[] bArr) throws IOException {
        try {
            Z(bArr.length);
            this.Z.Code(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.Z.Z > 0) {
                ie ieVar = this.Z;
                int iV = ieVar.V(bArr, i2, (int) ieVar.Z);
                if (iV == -1) {
                    throw new AssertionError();
                }
                i2 += iV;
            }
            throw e2;
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final byte D() throws IOException {
        Z(1L);
        return this.Z.D();
    }

    @Override // com.facetec.sdk.cf.I
    public final byte[] D(long j2) throws IOException {
        Z(j2);
        return this.Z.D(j2);
    }

    @Override // com.facetec.sdk.cf.I
    public final boolean F() throws IOException {
        if (this.Code) {
            throw new IllegalStateException("closed");
        }
        return this.Z.F() && this.B.V(this.Z, 8192L) == -1;
    }

    @Override // com.facetec.sdk.cf.I
    public final ie L() {
        return this.Z;
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return this.B.S();
    }

    @Override // com.facetec.sdk.cf.I
    public final long V(ie ieVar, long j2) throws IOException {
        if (ieVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
        }
        if (this.Code) {
            throw new IllegalStateException("closed");
        }
        if (this.Z.Z == 0 && this.B.V(this.Z, 8192L) == -1) {
            return -1L;
        }
        return this.Z.V(ieVar, Math.min(j2, this.Z.Z));
    }

    @Override // com.facetec.sdk.cf.I
    public final void V(long j2) throws IOException {
        if (this.Code) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            if (this.Z.Z == 0 && this.B.V(this.Z, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.Z.h());
            this.Z.V(jMin);
            j2 -= jMin;
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final boolean V(ib ibVar) throws IOException {
        return V(ibVar, ibVar.S());
    }

    @Override // com.facetec.sdk.cf.I
    public final void Z(long j2) throws IOException {
        if (!F(j2)) {
            throw new EOFException();
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final int a() throws IOException {
        Z(4L);
        return this.Z.a();
    }

    @Override // com.facetec.sdk.cf.I
    public final short b() throws IOException {
        Z(2L);
        return this.Z.b();
    }

    @Override // com.facetec.sdk.cf.I
    public final long c() throws IOException {
        byte bF;
        Z(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!F(i3)) {
                break;
            }
            bF = this.Z.F(i2);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bF)));
        }
        return this.Z.c();
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.Code) {
            return;
        }
        this.Code = true;
        this.B.close();
        this.Z.m();
    }

    @Override // com.facetec.sdk.cf.I
    public final int d() throws IOException {
        Z(4L);
        return this.Z.d();
    }

    @Override // com.facetec.sdk.cf.I
    public final short e() throws IOException {
        Z(2L);
        return this.Z.e();
    }

    @Override // com.facetec.sdk.cf.I
    public final long g() throws IOException {
        return Z((byte) 0, 0L, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.Code;
    }

    @Override // com.facetec.sdk.cf.I
    public final String j() throws IOException {
        return C(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.Z.Z == 0 && this.B.V(this.Z, 8192L) == -1) {
            return -1;
        }
        return this.Z.read(byteBuffer);
    }

    public final String toString() {
        return new StringBuilder("buffer(").append(this.B).append(")").toString();
    }
}
