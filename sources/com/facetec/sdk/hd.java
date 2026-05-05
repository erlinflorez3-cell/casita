package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.fo;
import com.facetec.sdk.fr;
import com.facetec.sdk.fy;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes3.dex */
public final class hd implements gp {
    private final he B;
    final gn Code;
    private final fx D;
    private hk L;
    private final fo.Code V;
    private static final List<String> Z = gg.Code("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", RRWebVideoEvent.JsonKeys.ENCODING, "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> I = gg.Code("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", RRWebVideoEvent.JsonKeys.ENCODING, "upgrade");

    class V extends Cif {
        private boolean I;
        private long V;

        V(cf.I i2) {
            super(i2);
            this.I = false;
            this.V = 0L;
        }

        private void I(IOException iOException) {
            if (this.I) {
                return;
            }
            this.I = true;
            hd.this.Code.V(false, (gp) hd.this, iOException);
        }

        @Override // com.facetec.sdk.Cif, com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            try {
                long jV = f().V(ieVar, j2);
                if (jV > 0) {
                    this.V += jV;
                }
                return jV;
            } catch (IOException e2) {
                I(e2);
                throw e2;
            }
        }

        @Override // com.facetec.sdk.Cif, com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            super.close();
            I((IOException) null);
        }
    }

    public hd(ft ftVar, fo.Code code, gn gnVar, he heVar) {
        this.V = code;
        this.Code = gnVar;
        this.B = heVar;
        this.D = ftVar.i().contains(fx.H2_PRIOR_KNOWLEDGE) ? fx.H2_PRIOR_KNOWLEDGE : fx.HTTP_2;
    }

    @Override // com.facetec.sdk.gp
    public final fy.B B(boolean z2) throws IOException {
        fr frVarB = this.L.B();
        fx fxVar = this.D;
        fr.V v2 = new fr.V();
        int iCode = frVarB.Code();
        cf.Code codeZ = null;
        for (int i2 = 0; i2 < iCode; i2++) {
            String strB = frVarB.B(i2);
            String strCode = frVarB.Code(i2);
            if (strB.equals(Header.RESPONSE_STATUS_UTF8)) {
                codeZ = cf.Code.Z("HTTP/1.1 ".concat(String.valueOf(strCode)));
            } else if (!I.contains(strB)) {
                ge.Code.Z(v2, strB, strCode);
            }
        }
        if (codeZ == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        fy.B bCode = new fy.B().Z(fxVar).I(codeZ.I).Z(codeZ.Code).Code(v2.I());
        if (z2 && ge.Code.B(bCode) == 100) {
            return null;
        }
        return bCode;
    }

    @Override // com.facetec.sdk.gp
    public final void B() {
        hk hkVar = this.L;
        if (hkVar != null) {
            hkVar.I(gx.CANCEL);
        }
    }

    @Override // com.facetec.sdk.gp
    public final cf.I Code(fv fvVar, long j2) {
        return this.L.C();
    }

    @Override // com.facetec.sdk.gp
    public final void Code() throws IOException {
        this.L.C().close();
    }

    @Override // com.facetec.sdk.gp
    public final ga V(fy fyVar) throws IOException {
        return new gv(fyVar.B("Content-Type"), gs.Code(fyVar), ik.Code(new V(this.L.V())));
    }

    @Override // com.facetec.sdk.gp
    public final void V() throws IOException {
        this.B.Code();
    }

    @Override // com.facetec.sdk.gp
    public final void Z(fv fvVar) throws IOException {
        if (this.L != null) {
            return;
        }
        boolean z2 = fvVar.I() != null;
        fr frVarV = fvVar.V();
        ArrayList arrayList = new ArrayList(frVarV.Code() + 4);
        arrayList.add(new hc(hc.B, fvVar.Z()));
        arrayList.add(new hc(hc.Z, gu.I(fvVar.Code())));
        String strZ = fvVar.Z("Host");
        if (strZ != null) {
            arrayList.add(new hc(hc.D, strZ));
        }
        arrayList.add(new hc(hc.Code, fvVar.Code().Z()));
        int iCode = frVarV.Code();
        for (int i2 = 0; i2 < iCode; i2++) {
            ib ibVarV = ib.V(frVarV.B(i2).toLowerCase(Locale.US));
            if (!Z.contains(ibVarV.Z())) {
                arrayList.add(new hc(ibVarV, frVarV.Code(i2)));
            }
        }
        hk hkVarI = this.B.I(arrayList, z2);
        this.L = hkVarI;
        hkVarI.D.B(this.V.Code(), TimeUnit.MILLISECONDS);
        this.L.L.B(this.V.Z(), TimeUnit.MILLISECONDS);
    }
}
