package org.spongycastle.jce;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
public class ECNamedCurveTable {
    public static Enumeration getNames() {
        return org.spongycastle.asn1.x9.ECNamedCurveTable.getNames();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        r1 = org.spongycastle.asn1.x9.ECNamedCurveTable.getByName(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.spongycastle.jce.spec.ECNamedCurveParameterSpec getParameterSpec(java.lang.String r8) {
        /*
            r3 = r8
            org.spongycastle.asn1.x9.X9ECParameters r1 = org.spongycastle.crypto.ec.CustomNamedCurves.getByName(r3)
            if (r1 != 0) goto L21
            org.spongycastle.asn1.ASN1ObjectIdentifier r0 = new org.spongycastle.asn1.ASN1ObjectIdentifier     // Catch: java.lang.IllegalArgumentException -> L10
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L10
            org.spongycastle.asn1.x9.X9ECParameters r1 = org.spongycastle.crypto.ec.CustomNamedCurves.getByOID(r0)     // Catch: java.lang.IllegalArgumentException -> L10
        L10:
            if (r1 != 0) goto L21
            org.spongycastle.asn1.x9.X9ECParameters r1 = org.spongycastle.asn1.x9.ECNamedCurveTable.getByName(r3)
            if (r1 != 0) goto L21
            org.spongycastle.asn1.ASN1ObjectIdentifier r0 = new org.spongycastle.asn1.ASN1ObjectIdentifier     // Catch: java.lang.IllegalArgumentException -> L21
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L21
            org.spongycastle.asn1.x9.X9ECParameters r1 = org.spongycastle.asn1.x9.ECNamedCurveTable.getByOID(r0)     // Catch: java.lang.IllegalArgumentException -> L21
        L21:
            if (r1 != 0) goto L25
            r0 = 0
            return r0
        L25:
            org.spongycastle.jce.spec.ECNamedCurveParameterSpec r2 = new org.spongycastle.jce.spec.ECNamedCurveParameterSpec
            org.spongycastle.math.ec.ECCurve r4 = r1.getCurve()
            org.spongycastle.math.ec.ECPoint r5 = r1.getG()
            java.math.BigInteger r6 = r1.getN()
            java.math.BigInteger r7 = r1.getH()
            byte[] r8 = r1.getSeed()
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.ECNamedCurveTable.getParameterSpec(java.lang.String):org.spongycastle.jce.spec.ECNamedCurveParameterSpec");
    }
}
