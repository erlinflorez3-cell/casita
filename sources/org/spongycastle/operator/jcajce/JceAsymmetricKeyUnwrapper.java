package org.spongycastle.operator.jcajce;

import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.AsymmetricKeyUnwrapper;

/* JADX INFO: loaded from: classes2.dex */
public class JceAsymmetricKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private OperatorHelper helper;
    private PrivateKey privKey;
    private boolean unwrappedKeyMustBeEncodable;

    public JceAsymmetricKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.privKey = privateKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // org.spongycastle.operator.KeyUnwrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.spongycastle.operator.GenericKey generateUnwrappedKey(org.spongycastle.asn1.x509.AlgorithmIdentifier r6, byte[] r7) throws org.spongycastle.operator.OperatorException {
        /*
            r5 = this;
            org.spongycastle.operator.jcajce.OperatorHelper r2 = r5.helper     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            org.spongycastle.asn1.x509.AlgorithmIdentifier r0 = r5.getAlgorithmIdentifier()     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            org.spongycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            java.util.Map r0 = r5.extraMappings     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            javax.crypto.Cipher r3 = r2.createAsymmetricWrapper(r1, r0)     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            org.spongycastle.operator.jcajce.OperatorHelper r1 = r5.helper     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            org.spongycastle.asn1.x509.AlgorithmIdentifier r0 = r5.getAlgorithmIdentifier()     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            java.security.AlgorithmParameters r4 = r1.createAlgorithmParameters(r0)     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r1 = 4
            r2 = 0
            if (r4 == 0) goto L1f
            goto L25
        L1f:
            java.security.PrivateKey r0 = r5.privKey     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r3.init(r1, r0)     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            goto L2a
        L25:
            java.security.PrivateKey r0 = r5.privKey     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r3.init(r1, r0, r4)     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
        L2a:
            org.spongycastle.operator.jcajce.OperatorHelper r1 = r5.helper     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            org.spongycastle.asn1.ASN1ObjectIdentifier r0 = r6.getAlgorithm()     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            java.lang.String r1 = r1.getKeyAlgorithmName(r0)     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r0 = 3
            java.security.Key r1 = r3.unwrap(r7, r1, r0)     // Catch: java.lang.Throwable -> L46 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            boolean r0 = r5.unwrappedKeyMustBeEncodable     // Catch: java.lang.Throwable -> L49 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            if (r0 == 0) goto L49
            byte[] r0 = r1.getEncoded()     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            if (r0 == 0) goto L46
            int r0 = r0.length     // Catch: java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49 java.lang.Throwable -> L49 javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            if (r0 != 0) goto L49
        L46:
            if (r2 != 0) goto L62
            goto L4b
        L49:
            r2 = r1
            goto L46
        L4b:
            java.security.PrivateKey r1 = r5.privKey     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r0 = 2
            r3.init(r0, r1)     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            byte[] r1 = r3.doFinal(r7)     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            org.spongycastle.asn1.ASN1ObjectIdentifier r0 = r6.getAlgorithm()     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            java.lang.String r0 = r0.getId()     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r2.<init>(r1, r0)     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
        L62:
            org.spongycastle.operator.jcajce.JceGenericKey r0 = new org.spongycastle.operator.jcajce.JceGenericKey     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            r0.<init>(r6, r2)     // Catch: javax.crypto.BadPaddingException -> L68 javax.crypto.IllegalBlockSizeException -> L82 java.security.InvalidKeyException -> L9c
            return r0
        L68:
            r3 = move-exception
            org.spongycastle.operator.OperatorException r2 = new org.spongycastle.operator.OperatorException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "bad padding: "
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r3)
            throw r2
        L82:
            r3 = move-exception
            org.spongycastle.operator.OperatorException r2 = new org.spongycastle.operator.OperatorException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "illegal blocksize: "
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r3)
            throw r2
        L9c:
            r3 = move-exception
            org.spongycastle.operator.OperatorException r2 = new org.spongycastle.operator.OperatorException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "key invalid: "
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.operator.jcajce.JceAsymmetricKeyUnwrapper.generateUnwrappedKey(org.spongycastle.asn1.x509.AlgorithmIdentifier, byte[]):org.spongycastle.operator.GenericKey");
    }

    public JceAsymmetricKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceAsymmetricKeyUnwrapper setMustProduceEncodableUnwrappedKey(boolean z2) {
        this.unwrappedKeyMustBeEncodable = z2;
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
