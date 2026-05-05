package org.spongycastle.openpgp.bc;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPSecretKeyRing;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;
import org.spongycastle.openpgp.operator.bc.BcKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPSecretKeyRing extends PGPSecretKeyRing {
    private static KeyFingerPrintCalculator fingerPrintCalculator = new BcKeyFingerprintCalculator();

    public BcPGPSecretKeyRing(InputStream inputStream) throws PGPException, IOException {
        super(inputStream, fingerPrintCalculator);
    }

    public BcPGPSecretKeyRing(byte[] bArr) throws PGPException, IOException {
        super(bArr, fingerPrintCalculator);
    }
}
