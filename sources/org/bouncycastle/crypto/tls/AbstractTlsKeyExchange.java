package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractTlsKeyExchange implements TlsKeyExchange {
    protected TlsContext context;
    protected int keyExchange;
    protected Vector supportedSignatureAlgorithms;

    protected AbstractTlsKeyExchange(int i2, Vector vector) {
        this.keyExchange = i2;
        this.supportedSignatureAlgorithms = vector;
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public byte[] generateServerKeyExchange() throws IOException {
        if (requiresServerKeyExchange()) {
            throw new TlsFatalAlert((short) 80);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(org.bouncycastle.crypto.tls.TlsContext r5) {
        /*
            r4 = this;
            r4.context = r5
            org.bouncycastle.crypto.tls.ProtocolVersion r3 = r5.getClientVersion()
            boolean r0 = org.bouncycastle.crypto.tls.TlsUtils.isSignatureAlgorithmsExtensionAllowed(r3)
            if (r0 == 0) goto L3a
            java.util.Vector r0 = r4.supportedSignatureAlgorithms
            if (r0 != 0) goto L45
            int r1 = r4.keyExchange
            r0 = 1
            if (r1 == r0) goto L35
            r0 = 3
            if (r1 == r0) goto L30
            r0 = 5
            if (r1 == r0) goto L35
            r0 = 7
            if (r1 == r0) goto L30
            r0 = 9
            if (r1 == r0) goto L35
            switch(r1) {
                case 13: goto L45;
                case 14: goto L45;
                case 15: goto L35;
                case 16: goto L3f;
                case 17: goto L3f;
                case 18: goto L35;
                case 19: goto L35;
                default: goto L25;
            }
        L25:
            switch(r1) {
                case 21: goto L45;
                case 22: goto L30;
                case 23: goto L35;
                case 24: goto L45;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unsupported key exchange algorithm"
            r1.<init>(r0)
            throw r1
        L30:
            java.util.Vector r0 = org.bouncycastle.crypto.tls.TlsUtils.getDefaultDSSSignatureAlgorithms()
            goto L43
        L35:
            java.util.Vector r0 = org.bouncycastle.crypto.tls.TlsUtils.getDefaultRSASignatureAlgorithms()
            goto L43
        L3a:
            java.util.Vector r0 = r4.supportedSignatureAlgorithms
            if (r0 != 0) goto L46
            goto L45
        L3f:
            java.util.Vector r0 = org.bouncycastle.crypto.tls.TlsUtils.getDefaultECDSASignatureAlgorithms()
        L43:
            r4.supportedSignatureAlgorithms = r0
        L45:
            return
        L46:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "supported_signature_algorithms not allowed for "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.tls.AbstractTlsKeyExchange.init(org.bouncycastle.crypto.tls.TlsContext):void");
    }

    protected DigitallySigned parseSignature(InputStream inputStream) throws IOException {
        DigitallySigned digitallySigned = DigitallySigned.parse(this.context, inputStream);
        SignatureAndHashAlgorithm algorithm = digitallySigned.getAlgorithm();
        if (algorithm != null) {
            TlsUtils.verifySupportedSignatureAlgorithm(this.supportedSignatureAlgorithms, algorithm);
        }
        return digitallySigned;
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processClientCertificate(Certificate certificate) throws IOException {
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processClientKeyExchange(InputStream inputStream) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerCertificate(Certificate certificate) throws IOException {
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerCredentials(TlsCredentials tlsCredentials) throws IOException {
        processServerCertificate(tlsCredentials.getCertificate());
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
        if (!requiresServerKeyExchange()) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public boolean requiresServerKeyExchange() {
        return false;
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipClientCredentials() throws IOException {
    }

    @Override // org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerKeyExchange() throws IOException {
        if (requiresServerKeyExchange()) {
            throw new TlsFatalAlert((short) 10);
        }
    }
}
