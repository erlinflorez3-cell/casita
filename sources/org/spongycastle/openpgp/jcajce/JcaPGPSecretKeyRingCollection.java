package org.spongycastle.openpgp.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPSecretKeyRingCollection;
import org.spongycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPSecretKeyRingCollection extends PGPSecretKeyRingCollection {
    public JcaPGPSecretKeyRingCollection(InputStream inputStream) throws PGPException, IOException {
        super(inputStream, new JcaKeyFingerprintCalculator());
    }

    public JcaPGPSecretKeyRingCollection(Collection collection) throws PGPException, IOException {
        super(collection);
    }

    public JcaPGPSecretKeyRingCollection(byte[] bArr) throws PGPException, IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
