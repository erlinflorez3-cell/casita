package org.spongycastle.openpgp.bc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPSecretKeyRingCollection;
import org.spongycastle.openpgp.operator.bc.BcKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPSecretKeyRingCollection extends PGPSecretKeyRingCollection {
    public BcPGPSecretKeyRingCollection(InputStream inputStream) throws PGPException, IOException {
        super(inputStream, new BcKeyFingerprintCalculator());
    }

    public BcPGPSecretKeyRingCollection(Collection collection) throws PGPException, IOException {
        super(collection);
    }

    public BcPGPSecretKeyRingCollection(byte[] bArr) throws PGPException, IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
