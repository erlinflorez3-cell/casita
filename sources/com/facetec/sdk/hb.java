package com.facetec.sdk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class hb implements fo {
    private volatile gn Code;
    private final ft I;
    private volatile boolean V;
    private Object Z;

    public hb(ft ftVar) {
        this.I = ftVar;
    }

    private boolean I(IOException iOException, gn gnVar, boolean z2, fv fvVar) {
        gnVar.Z(iOException);
        if (this.I.a()) {
            return !(z2 && (fvVar.I() instanceof gy)) && V(iOException, z2) && gnVar.F();
        }
        return false;
    }

    private static int V(fy fyVar, int i2) {
        String strB = fyVar.B("Retry-After");
        if (strB == null) {
            return i2;
        }
        if (strB.matches("\\d+")) {
            return Integer.valueOf(strB).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private static boolean V(fy fyVar, fp fpVar) {
        fp fpVarCode = fyVar.Code().Code();
        return fpVarCode.D().equals(fpVar.D()) && fpVarCode.F() == fpVar.F() && fpVarCode.Z().equals(fpVar.Z());
    }

    private static boolean V(IOException iOException, boolean z2) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z2 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private fc Z(fp fpVar) {
        SSLSocketFactory sSLSocketFactoryC;
        HostnameVerifier hostnameVerifierS;
        fi fiVarL;
        if (fpVar.V()) {
            sSLSocketFactoryC = this.I.C();
            hostnameVerifierS = this.I.S();
            fiVarL = this.I.L();
        } else {
            sSLSocketFactoryC = null;
            hostnameVerifierS = null;
            fiVarL = null;
        }
        return new fc(fpVar.D(), fpVar.F(), this.I.I(), this.I.D(), sSLSocketFactoryC, hostnameVerifierS, fiVarL, this.I.d(), this.I.Code(), this.I.i(), this.I.g(), this.I.V());
    }

    public final boolean B() {
        return this.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0112 A[Catch: IOException -> 0x024a, TryCatch #0 {IOException -> 0x024a, blocks: (B:161:0x0051, B:163:0x0057, B:211:0x0112, B:213:0x011a, B:215:0x0122, B:217:0x0130, B:219:0x0146, B:221:0x014e, B:223:0x015c, B:225:0x0166, B:232:0x017c, B:229:0x016f, B:230:0x0177, B:233:0x018b, B:235:0x0191, B:236:0x0196, B:181:0x0087, B:183:0x008f, B:185:0x009b, B:187:0x00a1, B:189:0x00ab, B:191:0x00b1, B:195:0x00c1, B:196:0x00c5, B:198:0x00cd, B:263:0x023c, B:264:0x0243, B:194:0x00ba, B:199:0x00d9, B:201:0x00df, B:203:0x00e9, B:205:0x00f2, B:206:0x00f8, B:207:0x0104, B:209:0x010a, B:265:0x0244, B:266:0x0249), top: B:278:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0083 A[SYNTHETIC] */
    @Override // com.facetec.sdk.fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facetec.sdk.fy V(com.facetec.sdk.fo.Code r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.hb.V(com.facetec.sdk.fo$Code):com.facetec.sdk.fy");
    }

    public final void V() {
        this.V = true;
        gn gnVar = this.Code;
        if (gnVar != null) {
            gnVar.C();
        }
    }

    public final void Z(Object obj) {
        this.Z = obj;
    }
}
