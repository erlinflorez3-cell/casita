package org.spongycastle.openpgp.jcajce;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.openpgp.PGPPublicKeyRing;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;
import org.spongycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPPublicKeyRing extends PGPPublicKeyRing {
    private static KeyFingerPrintCalculator fingerPrintCalculator = new JcaKeyFingerprintCalculator();

    public JcaPGPPublicKeyRing(InputStream inputStream) throws IOException {
        super(inputStream, fingerPrintCalculator);
    }

    public JcaPGPPublicKeyRing(byte[] bArr) throws IOException {
        super(bArr, fingerPrintCalculator);
    }
}
