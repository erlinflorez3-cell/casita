package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.hf;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class hj implements Closeable {
    private static final Logger B = Logger.getLogger(hg.class.getName());
    private hf.Z C;
    private final ie Code;
    private boolean D;
    private final cf.I I;
    private int V;
    private final boolean Z;

    hj(cf.I i2, boolean z2) {
        this.I = i2;
        this.Z = z2;
        ie ieVar = new ie();
        this.Code = ieVar;
        this.C = new hf.Z(ieVar);
        this.V = 16384;
    }

    private void Z(int i2, int i3, byte b2, byte b3) throws IOException {
        Logger logger = B;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(hg.Code(false, i2, i3, b2, b3));
        }
        int i4 = this.V;
        if (i3 > i4) {
            throw hg.Z("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            throw hg.Z("reserved bit set: %s", Integer.valueOf(i2));
        }
        Z(this.I, i3);
        this.I.I(b2 & 255);
        this.I.I(b3 & 255);
        this.I.Code(i2 & Integer.MAX_VALUE);
    }

    private void Z(int i2, long j2) throws IOException {
        while (j2 > 0) {
            int iMin = (int) Math.min(this.V, j2);
            long j3 = iMin;
            j2 -= j3;
            Z(i2, iMin, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
            this.I.Z(this.Code, j3);
        }
    }

    private static void Z(cf.I i2, int i3) throws IOException {
        i2.I((-1) - (((-1) - (i3 >>> 16)) | ((-1) - 255)));
        i2.I((i3 >>> 8) & 255);
        i2.I((-1) - (((-1) - i3) | ((-1) - 255)));
    }

    public final synchronized void B(boolean z2, int i2, List<hc> list) throws IOException {
        boolean z3 = this.D;
        if (z3) {
            throw new IOException("closed");
        }
        if (z3) {
            throw new IOException("closed");
        }
        this.C.Z(list);
        long jH = this.Code.h();
        int iMin = (int) Math.min(this.V, jH);
        long j2 = iMin;
        byte b2 = jH == j2 ? (byte) 4 : (byte) 0;
        if (z2) {
            b2 = (byte) ((b2 + 1) - (b2 & 1));
        }
        Z(i2, iMin, (byte) 1, b2);
        this.I.Z(this.Code, j2);
        if (jH > j2) {
            Z(i2, jH - j2);
        }
    }

    public final synchronized void Code() throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        if (this.Z) {
            Logger logger = B;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(gg.Code(">> CONNECTION %s", hg.B.I()));
            }
            this.I.Z(hg.B.D());
            this.I.flush();
        }
    }

    public final synchronized void Code(int i2, long j2) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw hg.Z("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
        }
        Z(i2, 4, (byte) 8, (byte) 0);
        this.I.Code((int) j2);
        this.I.flush();
    }

    public final synchronized void Code(hm hmVar) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        this.V = hmVar.V(this.V);
        if (hmVar.Z() != -1) {
            this.C.B(hmVar.Z());
        }
        Z(0, 0, (byte) 4, (byte) 1);
        this.I.flush();
    }

    public final synchronized void I() throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        this.I.flush();
    }

    public final synchronized void I(int i2, gx gxVar) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        if (gxVar.S == -1) {
            throw new IllegalArgumentException();
        }
        Z(i2, 4, (byte) 3, (byte) 0);
        this.I.Code(gxVar.S);
        this.I.flush();
    }

    public final synchronized void I(boolean z2, int i2, ie ieVar, int i3) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        Z(i2, i3, (byte) 0, z2 ? (byte) 1 : (byte) 0);
        if (i3 > 0) {
            this.I.Z(ieVar, i3);
        }
    }

    public final int V() {
        return this.V;
    }

    public final synchronized void V(int i2, gx gxVar, byte[] bArr) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        if (gxVar.S == -1) {
            throw hg.Z("errorCode.httpCode == -1", new Object[0]);
        }
        Z(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.I.Code(i2);
        this.I.Code(gxVar.S);
        if (bArr.length > 0) {
            this.I.Z(bArr);
        }
        this.I.flush();
    }

    public final synchronized void V(hm hmVar) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        int i2 = 0;
        Z(0, hmVar.V() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (hmVar.B(i2)) {
                this.I.Z(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                this.I.Code(hmVar.I(i2));
            }
            i2++;
        }
        this.I.flush();
    }

    public final synchronized void Z(boolean z2, int i2, int i3) throws IOException {
        if (this.D) {
            throw new IOException("closed");
        }
        Z(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
        this.I.Code(i2);
        this.I.Code(i3);
        this.I.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.D = true;
        this.I.close();
    }
}
