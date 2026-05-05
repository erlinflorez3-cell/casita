package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facetec.sdk.cf;
import com.facetec.sdk.fo;
import com.facetec.sdk.fv;
import com.facetec.sdk.fy;
import com.facetec.sdk.he;
import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class gm extends he.V implements cf.I {
    public int B;
    private Socket C;
    private Socket D;
    private fs F;
    private final fg L;
    private final gc S;
    public boolean V;

    /* JADX INFO: renamed from: a */
    private fx f3226a;

    /* JADX INFO: renamed from: b */
    private cf.I f3227b;

    /* JADX INFO: renamed from: c */
    private he f3228c;

    /* JADX INFO: renamed from: e */
    private cf.I f3230e;

    /* JADX INFO: renamed from: d */
    private int f3229d = 1;
    public final List<Reference<gn>> I = new ArrayList();
    public long Code = Long.MAX_VALUE;

    public gm(fg fgVar, gc gcVar) {
        this.L = fgVar;
        this.S = gcVar;
    }

    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.facetec.sdk.ft, com.facetec.sdk.gn] */
    private void I(int i2, int i3, int i4) throws IOException {
        boolean z2 = false;
        boolean z3 = true;
        fv fvVarZ = new fv.Z().I(this.S.Code().Z()).I("CONNECT", null).Code("Host", gg.V(this.S.Code().Z(), true)).Code("Proxy-Connection", "Keep-Alive").Code("User-Agent", gu.I()).Z();
        new fy.B().Code(fvVarZ).Z(fx.HTTP_1_1).I(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED).Z("Preemptive Authenticate").B(gg.I).V(-1L).B(-1L).I("Proxy-Authenticate", "OkHttp-Preemptive").V();
        fv fvVarB = this.S.Code().B().B();
        if (fvVarB != null) {
            fvVarZ = fvVarB;
        }
        fp fpVarCode = fvVarZ.Code();
        int i5 = 0;
        while (i5 < 21) {
            Z(i2, i3);
            String string = new StringBuilder("CONNECT ").append(gg.V(fpVarCode, z3)).append(" HTTP/1.1").toString();
            ?? r1 = z2;
            while (true) {
                ha haVar = new ha(r1, r1, this.f3227b, this.f3230e);
                this.f3227b.S().B(i3, TimeUnit.MILLISECONDS);
                this.f3230e.S().B(i4, TimeUnit.MILLISECONDS);
                haVar.I(fvVarZ.V(), string);
                haVar.Code();
                fy fyVarV = haVar.B(false).Code(fvVarZ).V();
                long jCode = gs.Code(fyVarV);
                if (jCode == -1) {
                    jCode = 0;
                }
                cf.I iV = haVar.V(jCode);
                gg.B(iV, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                iV.close();
                int I = fyVarV.I();
                if (I != 200) {
                    if (I != 407) {
                        throw new IOException(new StringBuilder("Unexpected response code for CONNECT: ").append(fyVarV.I()).toString());
                    }
                    fvVarZ = this.S.Code().B().B();
                    if (fvVarZ == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(fyVarV.B("Connection"))) {
                        break;
                    } else {
                        r1 = 0;
                    }
                } else {
                    if (!this.f3227b.L().F() || !this.f3230e.L().F()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    fvVarZ = null;
                }
            }
            if (fvVarZ == null) {
                return;
            }
            gg.V(this.D);
            z2 = false;
            this.D = null;
            this.f3230e = null;
            this.f3227b = null;
            this.S.V();
            this.S.I();
            i5++;
            z3 = true;
        }
    }

    private void V(int i2) throws IOException {
        this.C.setSoTimeout(0);
        he heVarCode = new he.I().Z(this.C, this.S.Code().Z().D(), this.f3227b, this.f3230e).V(this).B(i2).Code();
        this.f3228c = heVarCode;
        heVarCode.V();
    }

    private void Z(int i2, int i3) throws IOException {
        Proxy proxyI = this.S.I();
        this.D = (proxyI.type() == Proxy.Type.DIRECT || proxyI.type() == Proxy.Type.HTTP) ? this.S.Code().V().createSocket() : new Socket(proxyI);
        this.S.V();
        this.D.setSoTimeout(i3);
        try {
            hv.B().I(this.D, this.S.V(), i2);
            try {
                this.f3227b = ik.Code(ik.Z(this.D));
                this.f3230e = ik.Z(ik.Code(this.D));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException(new StringBuilder("Failed to connect to ").append(this.S.V()).toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final boolean B(fp fpVar) {
        if (fpVar.F() != this.S.Code().Z().F()) {
            return false;
        }
        if (fpVar.D().equals(this.S.Code().Z().D())) {
            return true;
        }
        if (this.F != null) {
            ia iaVar = ia.B;
            if (ia.I(fpVar.D(), (X509Certificate) this.F.I().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean Code(fc fcVar, @Nullable gc gcVar) {
        if (this.I.size() >= this.f3229d || this.V || !ge.Code.Code(this.S.Code(), fcVar)) {
            return false;
        }
        if (fcVar.Z().D().equals(i().Code().Z().D())) {
            return true;
        }
        if (this.f3228c == null || gcVar == null || gcVar.I().type() != Proxy.Type.DIRECT || this.S.I().type() != Proxy.Type.DIRECT || !this.S.V().equals(gcVar.V()) || gcVar.Code().F() != ia.B || !B(fcVar.Z())) {
            return false;
        }
        try {
            fcVar.d().I(fcVar.Z().D(), n().I());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean Code(boolean z2) {
        if (this.C.isClosed() || this.C.isInputShutdown() || this.C.isOutputShutdown()) {
            return false;
        }
        he heVar = this.f3228c;
        if (heVar != null) {
            return !heVar.Z();
        }
        if (z2) {
            try {
                int soTimeout = this.C.getSoTimeout();
                try {
                    this.C.setSoTimeout(1);
                    return !this.f3227b.F();
                } finally {
                    this.C.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facetec.sdk.he.V
    public final void I(he heVar) {
        synchronized (this.L) {
            this.f3229d = heVar.B();
        }
    }

    public final gp V(ft ftVar, fo.Code code, gn gnVar) throws SocketException {
        if (this.f3228c != null) {
            return new hd(ftVar, code, gnVar, this.f3228c);
        }
        this.C.setSoTimeout(code.Code());
        this.f3227b.S().B(code.Code(), TimeUnit.MILLISECONDS);
        this.f3230e.S().B(code.Z(), TimeUnit.MILLISECONDS);
        return new ha(ftVar, gnVar, this.f3227b, this.f3230e);
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0300 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r20, int r21, int r22, int r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gm.V(int, int, int, int, boolean):void");
    }

    @Override // com.facetec.sdk.he.V
    public final void V(hk hkVar) throws IOException {
        hkVar.V(gx.REFUSED_STREAM);
    }

    public final void f() {
        gg.V(this.D);
    }

    public final Socket h() {
        return this.C;
    }

    public final gc i() {
        return this.S;
    }

    public final fs n() {
        return this.F;
    }

    public final boolean o() {
        return this.f3228c != null;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder("Connection{").append(this.S.Code().Z().D()).append(Global.COLON).append(this.S.Code().Z().F()).append(", proxy=").append(this.S.I()).append(" hostAddress=").append(this.S.V()).append(" cipherSuite=");
        fs fsVar = this.F;
        return sbAppend.append(fsVar != null ? fsVar.Code() : "none").append(" protocol=").append(this.f3226a).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
