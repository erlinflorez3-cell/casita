package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facetec.sdk.cf;
import com.facetec.sdk.fr;
import com.facetec.sdk.fy;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ha implements gp {
    final cf.I B;
    final gn Code;
    final ft I;
    final cf.I V;
    int Z = 0;
    private long D = 262144;

    final class B implements cf.I {
        private final ih V;
        private boolean Z;

        B() {
            this.V = new ih(ha.this.V.S());
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return this.V;
        }

        @Override // com.facetec.sdk.cf.I
        public final void Z(ie ieVar, long j2) throws IOException {
            if (this.Z) {
                throw new IllegalStateException("closed");
            }
            if (j2 == 0) {
                return;
            }
            ha.this.V.I(j2);
            ha.this.V.V("\r\n");
            ha.this.V.Z(ieVar, j2);
            ha.this.V.V("\r\n");
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final synchronized void close() throws IOException {
            if (this.Z) {
                return;
            }
            this.Z = true;
            ha.this.V.V("0\r\n\r\n");
            ha.V(this.V);
            ha.this.Z = 3;
        }

        @Override // com.facetec.sdk.cf.I, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.Z) {
                return;
            }
            ha.this.V.flush();
        }
    }

    class C extends V {
        private boolean B;

        C(ha haVar) {
            super(haVar, (byte) 0);
        }

        @Override // com.facetec.sdk.ha.V, com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            }
            if (this.Code) {
                throw new IllegalStateException("closed");
            }
            if (this.B) {
                return -1L;
            }
            long jV = super.V(ieVar, j2);
            if (jV != -1) {
                return jV;
            }
            this.B = true;
            I(true, null);
            return -1L;
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (this.Code) {
                return;
            }
            if (!this.B) {
                I(false, null);
            }
            this.Code = true;
        }
    }

    class Code extends V {
        private long Z;

        Code(ha haVar, long j2) throws IOException {
            super(haVar, (byte) 0);
            this.Z = j2;
            if (j2 == 0) {
                I(true, null);
            }
        }

        @Override // com.facetec.sdk.ha.V, com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            }
            if (this.Code) {
                throw new IllegalStateException("closed");
            }
            long j3 = this.Z;
            if (j3 == 0) {
                return -1L;
            }
            long jV = super.V(ieVar, Math.min(j3, j2));
            if (jV == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                I(false, protocolException);
                throw protocolException;
            }
            long j4 = this.Z - jV;
            this.Z = j4;
            if (j4 == 0) {
                I(true, null);
            }
            return jV;
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (this.Code) {
                return;
            }
            if (this.Z != 0 && !gg.B(this, TimeUnit.MILLISECONDS)) {
                I(false, null);
            }
            this.Code = true;
        }
    }

    class I extends V {
        private long B;
        private final fp I;
        private boolean Z;

        I(fp fpVar) {
            super(ha.this, (byte) 0);
            this.B = -1L;
            this.Z = true;
            this.I = fpVar;
        }

        @Override // com.facetec.sdk.ha.V, com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
            }
            if (this.Code) {
                throw new IllegalStateException("closed");
            }
            if (!this.Z) {
                return -1L;
            }
            long j3 = this.B;
            if (j3 == 0 || j3 == -1) {
                if (j3 != -1) {
                    ha.this.B.j();
                }
                try {
                    this.B = ha.this.B.c();
                    String strTrim = ha.this.B.j().trim();
                    if (this.B < 0 || !(strTrim.isEmpty() || strTrim.startsWith(Global.SEMICOLON))) {
                        throw new ProtocolException(new StringBuilder("expected chunk size and optional extensions but was \"").append(this.B).append(strTrim).append("\"").toString());
                    }
                    if (this.B == 0) {
                        this.Z = false;
                        gs.I(ha.this.I.B(), this.I, ha.this.Z());
                        I(true, null);
                    }
                    if (!this.Z) {
                        return -1L;
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            }
            long jV = super.V(ieVar, Math.min(j2, this.B));
            if (jV != -1) {
                this.B -= jV;
                return jV;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            I(false, protocolException);
            throw protocolException;
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (this.Code) {
                return;
            }
            if (this.Z && !gg.B(this, TimeUnit.MILLISECONDS)) {
                I(false, null);
            }
            this.Code = true;
        }
    }

    abstract class V implements cf.I {
        protected boolean Code;
        private long I;
        private ih V;

        private V() {
            this.V = new ih(ha.this.B.S());
            this.I = 0L;
        }

        /* synthetic */ V(ha haVar, byte b2) {
            this();
        }

        protected final void I(boolean z2, IOException iOException) throws IOException {
            if (ha.this.Z == 6) {
                return;
            }
            if (ha.this.Z != 5) {
                throw new IllegalStateException(new StringBuilder("state: ").append(ha.this.Z).toString());
            }
            ha.V(this.V);
            ha.this.Z = 6;
            if (ha.this.Code != null) {
                ha.this.Code.V(!z2, ha.this, iOException);
            }
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return this.V;
        }

        @Override // com.facetec.sdk.cf.I
        public long V(ie ieVar, long j2) throws IOException {
            try {
                long jV = ha.this.B.V(ieVar, j2);
                if (jV > 0) {
                    this.I += jV;
                }
                return jV;
            } catch (IOException e2) {
                I(false, e2);
                throw e2;
            }
        }
    }

    final class Z implements cf.I {
        private boolean B;
        private final ih V;
        private long Z;

        Z(long j2) {
            this.V = new ih(ha.this.V.S());
            this.Z = j2;
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return this.V;
        }

        @Override // com.facetec.sdk.cf.I
        public final void Z(ie ieVar, long j2) throws IOException {
            if (this.B) {
                throw new IllegalStateException("closed");
            }
            gg.V(ieVar.h(), j2);
            if (j2 > this.Z) {
                throw new ProtocolException(new StringBuilder("expected ").append(this.Z).append(" bytes but received ").append(j2).toString());
            }
            ha.this.V.Z(ieVar, j2);
            this.Z -= j2;
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (this.B) {
                return;
            }
            this.B = true;
            if (this.Z > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            ha.V(this.V);
            ha.this.Z = 3;
        }

        @Override // com.facetec.sdk.cf.I, java.io.Flushable
        public final void flush() throws IOException {
            if (this.B) {
                return;
            }
            ha.this.V.flush();
        }
    }

    public ha(ft ftVar, gn gnVar, cf.I i2, cf.I i3) {
        this.I = ftVar;
        this.Code = gnVar;
        this.B = i2;
        this.V = i3;
    }

    private String I() throws IOException {
        String strC = this.B.C(this.D);
        this.D -= (long) strC.length();
        return strC;
    }

    static void V(ih ihVar) {
        im imVarCode = ihVar.Code();
        ihVar.Z(im.Code);
        imVarCode.L();
        imVarCode.c_();
    }

    @Override // com.facetec.sdk.gp
    public final fy.B B(boolean z2) throws IOException {
        int i2 = this.Z;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
        }
        try {
            cf.Code codeZ = cf.Code.Z(I());
            fy.B bCode = new fy.B().Z(codeZ.V).I(codeZ.I).Z(codeZ.Code).Code(Z());
            if (z2 && codeZ.I == 100) {
                return null;
            }
            if (codeZ.I == 100) {
                this.Z = 3;
                return bCode;
            }
            this.Z = 4;
            return bCode;
        } catch (EOFException e2) {
            IOException iOException = new IOException(new StringBuilder("unexpected end of stream on ").append(this.Code).toString());
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.facetec.sdk.gp
    public final void B() {
        gm gmVarI = this.Code.I();
        if (gmVarI != null) {
            gmVarI.f();
        }
    }

    @Override // com.facetec.sdk.gp
    public final cf.I Code(fv fvVar, long j2) {
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(fvVar.Z("Transfer-Encoding"))) {
            if (this.Z != 1) {
                throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
            }
            this.Z = 2;
            return new B();
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.Z != 1) {
            throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
        }
        this.Z = 2;
        return new Z(j2);
    }

    @Override // com.facetec.sdk.gp
    public final void Code() throws IOException {
        this.V.flush();
    }

    public final void I(fr frVar, String str) throws IOException {
        if (this.Z != 0) {
            throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
        }
        this.V.V(str).V("\r\n");
        int iCode = frVar.Code();
        for (int i2 = 0; i2 < iCode; i2++) {
            this.V.V(frVar.B(i2)).V(": ").V(frVar.Code(i2)).V("\r\n");
        }
        this.V.V("\r\n");
        this.Z = 1;
    }

    public final cf.I V(long j2) throws IOException {
        if (this.Z != 4) {
            throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
        }
        this.Z = 5;
        return new Code(this, j2);
    }

    @Override // com.facetec.sdk.gp
    public final ga V(fy fyVar) throws IOException {
        String strB = fyVar.B("Content-Type");
        if (!gs.Z(fyVar)) {
            return new gv(strB, 0L, ik.Code(V(0L)));
        }
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(fyVar.B("Transfer-Encoding"))) {
            fp fpVarCode = fyVar.Code().Code();
            if (this.Z != 4) {
                throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
            }
            this.Z = 5;
            return new gv(strB, -1L, ik.Code(new I(fpVarCode)));
        }
        long jCode = gs.Code(fyVar);
        if (jCode != -1) {
            return new gv(strB, jCode, ik.Code(V(jCode)));
        }
        if (this.Z != 4) {
            throw new IllegalStateException(new StringBuilder("state: ").append(this.Z).toString());
        }
        gn gnVar = this.Code;
        if (gnVar == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.Z = 5;
        gnVar.B();
        return new gv(strB, -1L, ik.Code(new C(this)));
    }

    @Override // com.facetec.sdk.gp
    public final void V() throws IOException {
        this.V.flush();
    }

    public final fr Z() throws IOException {
        fr.V v2 = new fr.V();
        while (true) {
            String strI = I();
            if (strI.length() == 0) {
                return v2.I();
            }
            ge.Code.V(v2, strI);
        }
    }

    @Override // com.facetec.sdk.gp
    public final void Z(fv fvVar) throws IOException {
        I(fvVar.V(), gu.Z(fvVar, this.Code.I().i().I().type()));
    }
}
