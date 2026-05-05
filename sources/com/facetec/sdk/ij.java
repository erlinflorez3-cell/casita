package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class ij implements cf.I {
    private final ig B;
    private final cf.I Code;
    private final Inflater I;
    private int Z = 0;
    private final CRC32 V = new CRC32();

    public ij(cf.I i2) {
        if (i2 == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.I = inflater;
        cf.I iCode = ik.Code(i2);
        this.Code = iCode;
        this.B = new ig(iCode, inflater);
    }

    private void I(ie ieVar, long j2, long j3) {
        il ilVar = ieVar.V;
        while (j2 >= ilVar.I - ilVar.Z) {
            j2 -= (long) (ilVar.I - ilVar.Z);
            ilVar = ilVar.C;
        }
        while (j3 > 0) {
            int i2 = (int) (((long) ilVar.Z) + j2);
            int iMin = (int) Math.min(ilVar.I - i2, j3);
            this.V.update(ilVar.V, i2, iMin);
            j3 -= (long) iMin;
            ilVar = ilVar.C;
            j2 = 0;
        }
    }

    private static void V(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return this.Code.S();
    }

    @Override // com.facetec.sdk.cf.I
    public final long V(ie ieVar, long j2) throws IOException {
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.Z == 0) {
            this.Code.Z(10L);
            byte bF = this.Code.L().F(3L);
            int i2 = bF >> 1;
            boolean z2 = (i2 + 1) - (i2 | 1) == 1;
            if (z2) {
                I(this.Code.L(), 0L, 10L);
            }
            V("ID1ID2", 8075, this.Code.b());
            this.Code.V(8L);
            if ((-1) - (((-1) - (bF >> 2)) | ((-1) - 1)) == 1) {
                this.Code.Z(2L);
                if (z2) {
                    I(this.Code.L(), 0L, 2L);
                }
                long jE = this.Code.L().e();
                this.Code.Z(jE);
                if (z2) {
                    I(this.Code.L(), 0L, jE);
                }
                this.Code.V(jE);
            }
            int i3 = bF >> 3;
            if ((i3 + 1) - (i3 | 1) == 1) {
                long jG = this.Code.g();
                if (jG == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    I(this.Code.L(), 0L, jG + 1);
                }
                this.Code.V(jG + 1);
            }
            if (((bF >> 4) & 1) == 1) {
                long jG2 = this.Code.g();
                if (jG2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    I(this.Code.L(), 0L, jG2 + 1);
                }
                this.Code.V(jG2 + 1);
            }
            if (z2) {
                V("FHCRC", this.Code.e(), (short) this.V.getValue());
                this.V.reset();
            }
            this.Z = 1;
        }
        if (this.Z == 1) {
            long j3 = ieVar.Z;
            long jV = this.B.V(ieVar, j2);
            if (jV != -1) {
                I(ieVar, j3, jV);
                return jV;
            }
            this.Z = 2;
        }
        if (this.Z == 2) {
            V("CRC", this.Code.a(), (int) this.V.getValue());
            V("ISIZE", this.Code.a(), (int) this.I.getBytesWritten());
            this.Z = 3;
            if (!this.Code.F()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        this.B.close();
    }
}
