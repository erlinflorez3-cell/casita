package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.hf;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class hl implements Closeable {
    static final Logger V = Logger.getLogger(hg.class.getName());
    private final cf.I B;
    private final I Code;
    private final boolean I;
    private hf.V Z;

    static final class I implements cf.I {
        short B;
        private final cf.I C;
        int Code;
        int I;
        int V;
        byte Z;

        I(cf.I i2) {
            this.C = i2;
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return this.C.S();
        }

        @Override // com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            int i2;
            int iD;
            do {
                int i3 = this.Code;
                if (i3 != 0) {
                    long jV = this.C.V(ieVar, Math.min(j2, i3));
                    if (jV == -1) {
                        return -1L;
                    }
                    this.Code = (int) (((long) this.Code) - jV);
                    return jV;
                }
                this.C.V(this.B);
                this.B = (short) 0;
                if ((-1) - (((-1) - this.Z) | ((-1) - 4)) != 0) {
                    return -1L;
                }
                i2 = this.V;
                int iZ = hl.Z(this.C);
                this.Code = iZ;
                this.I = iZ;
                byte bD = this.C.D();
                this.Z = this.C.D();
                if (hl.V.isLoggable(Level.FINE)) {
                    hl.V.fine(hg.Code(true, this.V, this.I, bD, this.Z));
                }
                iD = (-1) - (((-1) - this.C.d()) | ((-1) - Integer.MAX_VALUE));
                this.V = iD;
                if (bD != 9) {
                    throw hg.Code("%s != TYPE_CONTINUATION", Byte.valueOf(bD));
                }
            } while (iD == i2);
            throw hg.Code("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
        }
    }

    interface Z {
        void B(int i2, gx gxVar);

        void B(int i2, ib ibVar);

        void B(hm hmVar);

        void B(boolean z2, int i2, List<hc> list);

        void Code(int i2, long j2);

        void I(int i2, List<hc> list) throws IOException;

        void V(boolean z2, int i2, int i3);

        void V(boolean z2, int i2, cf.I i3, int i4) throws IOException;
    }

    hl(cf.I i2, boolean z2) {
        this.B = i2;
        this.I = z2;
        I i3 = new I(i2);
        this.Code = i3;
        this.Z = new hf.V(i3, (byte) 0);
    }

    private static int I(int i2, byte b2, short s2) throws IOException {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s2 <= i2) {
            return (short) (i2 - s2);
        }
        throw hg.Code("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i2));
    }

    private List<hc> I(int i2, short s2, byte b2, int i3) throws IOException {
        I i4 = this.Code;
        i4.Code = i2;
        i4.I = i2;
        this.Code.B = s2;
        this.Code.Z = b2;
        this.Code.V = i3;
        this.Z.B();
        return this.Z.V();
    }

    private void I() throws IOException {
        this.B.d();
        this.B.D();
    }

    static int Z(cf.I i2) throws IOException {
        return (-1) - (((-1) - (i2.D() & 255)) & ((-1) - (((i2.D() & 255) << 16) | ((i2.D() & 255) << 8))));
    }

    public final void B(Z z2) throws IOException {
        if (this.I) {
            if (!Z(true, z2)) {
                throw hg.Code("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        ib ibVarCode = this.B.Code(hg.B.S());
        Logger logger = V;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(gg.Code("<< CONNECTION %s", ibVarCode.I()));
        }
        if (!hg.B.equals(ibVarCode)) {
            throw hg.Code("Expected a connection header but was %s", ibVarCode.Z());
        }
    }

    public final boolean Z(boolean z2, Z z3) throws IOException {
        short s2 = 0;
        try {
            this.B.Z(9L);
            int iZ = Z(this.B);
            if (iZ < 0 || iZ > 16384) {
                throw hg.Code("FRAME_SIZE_ERROR: %s", Integer.valueOf(iZ));
            }
            byte bD = this.B.D();
            if (z2 && bD != 4) {
                throw hg.Code("Expected a SETTINGS frame but was %s", Byte.valueOf(bD));
            }
            byte bD2 = this.B.D();
            int iD = this.B.d();
            int i2 = (iD + Integer.MAX_VALUE) - (iD | Integer.MAX_VALUE);
            Logger logger = V;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(hg.Code(true, i2, iZ, bD, bD2));
            }
            switch (bD) {
                case 0:
                    if (i2 == 0) {
                        throw hg.Code("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                    }
                    boolean z4 = (bD2 + 1) - (1 | bD2) != 0;
                    if ((32 & bD2) != 0) {
                        throw hg.Code("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    short sD = (8 & bD2) != 0 ? (short) ((-1) - (((-1) - this.B.D()) | ((-1) - 255))) : (short) 0;
                    z3.V(z4, i2, this.B, I(iZ, bD2, sD));
                    this.B.V(sD);
                    return true;
                case 1:
                    if (i2 == 0) {
                        throw hg.Code("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z5 = (-1) - (((-1) - bD2) | ((-1) - 1)) != 0;
                    short sD2 = (-1) - (((-1) - bD2) | ((-1) - 8)) != 0 ? (short) (this.B.D() & 255) : (short) 0;
                    if ((bD2 + 32) - (32 | bD2) != 0) {
                        I();
                        iZ -= 5;
                    }
                    z3.B(z5, i2, I(I(iZ, bD2, sD2), sD2, bD2, i2));
                    return true;
                case 2:
                    if (iZ != 5) {
                        throw hg.Code("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iZ));
                    }
                    if (i2 == 0) {
                        throw hg.Code("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    I();
                    return true;
                case 3:
                    if (iZ != 4) {
                        throw hg.Code("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iZ));
                    }
                    if (i2 == 0) {
                        throw hg.Code("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iD2 = this.B.d();
                    gx gxVarI = gx.I(iD2);
                    if (gxVarI == null) {
                        throw hg.Code("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iD2));
                    }
                    z3.B(i2, gxVarI);
                    return true;
                case 4:
                    if (i2 != 0) {
                        throw hg.Code("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bD2 + 1) - (bD2 | 1) == 0) {
                        if (iZ % 6 != 0) {
                            throw hg.Code("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iZ));
                        }
                        hm hmVar = new hm();
                        for (int i3 = 0; i3 < iZ; i3 += 6) {
                            int iB = (-1) - (((-1) - this.B.b()) | ((-1) - 65535));
                            int iD3 = this.B.d();
                            if (iB == 2) {
                                if (iD3 != 0 && iD3 != 1) {
                                    throw hg.Code("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                            } else if (iB == 3) {
                                iB = 4;
                            } else if (iB != 4) {
                                if (iB == 5 && (iD3 < 16384 || iD3 > 16777215)) {
                                    throw hg.Code("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iD3));
                                }
                            } else {
                                if (iD3 < 0) {
                                    throw hg.Code("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                }
                                iB = 7;
                            }
                            hmVar.I(iB, iD3);
                        }
                        z3.B(hmVar);
                    } else if (iZ != 0) {
                        throw hg.Code("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (i2 == 0) {
                        throw hg.Code("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    if ((bD2 + 8) - (8 | bD2) != 0) {
                        byte bD3 = this.B.D();
                        s2 = (short) ((bD3 + 255) - (bD3 | 255));
                    }
                    z3.I((-1) - (((-1) - this.B.d()) | ((-1) - Integer.MAX_VALUE)), I(I(iZ - 4, bD2, s2), s2, bD2, i2));
                    return true;
                case 6:
                    if (iZ != 8) {
                        throw hg.Code("TYPE_PING length != 8: %s", Integer.valueOf(iZ));
                    }
                    if (i2 != 0) {
                        throw hg.Code("TYPE_PING streamId != 0", new Object[0]);
                    }
                    z3.V((bD2 + 1) - (bD2 | 1) != 0, this.B.d(), this.B.d());
                    return true;
                case 7:
                    if (iZ < 8) {
                        throw hg.Code("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iZ));
                    }
                    if (i2 != 0) {
                        throw hg.Code("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    int iD4 = this.B.d();
                    int iD5 = this.B.d();
                    int i4 = iZ - 8;
                    if (gx.I(iD5) == null) {
                        throw hg.Code("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iD5));
                    }
                    ib ibVarCode = ib.Code;
                    if (i4 > 0) {
                        ibVarCode = this.B.Code(i4);
                    }
                    z3.B(iD4, ibVarCode);
                    return true;
                case 8:
                    if (iZ != 4) {
                        throw hg.Code("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iZ));
                    }
                    long jD = ((long) this.B.d()) & 2147483647L;
                    if (jD == 0) {
                        throw hg.Code("windowSizeIncrement was 0", Long.valueOf(jD));
                    }
                    z3.Code(i2, jD);
                    return true;
                default:
                    this.B.V(iZ);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.B.close();
    }
}
