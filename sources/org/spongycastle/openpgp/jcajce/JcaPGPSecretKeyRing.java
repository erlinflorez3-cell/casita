package org.spongycastle.openpgp.jcajce;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPSecretKeyRing;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;
import org.spongycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPSecretKeyRing extends PGPSecretKeyRing {
    private static KeyFingerPrintCalculator fingerPrintCalculator = new JcaKeyFingerprintCalculator();

    public JcaPGPSecretKeyRing(InputStream inputStream) throws PGPException, IOException {
        super(inputStream, fingerPrintCalculator);
    }

    public JcaPGPSecretKeyRing(byte[] bArr) throws PGPException, IOException {
        super(bArr, fingerPrintCalculator);
    }
}
