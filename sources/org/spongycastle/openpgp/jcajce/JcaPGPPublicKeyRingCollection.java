package org.spongycastle.openpgp.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPPublicKeyRingCollection;
import org.spongycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPPublicKeyRingCollection extends PGPPublicKeyRingCollection {
    public JcaPGPPublicKeyRingCollection(InputStream inputStream) throws PGPException, IOException {
        super(inputStream, new JcaKeyFingerprintCalculator());
    }

    public JcaPGPPublicKeyRingCollection(Collection collection) throws PGPException, IOException {
        super(collection);
    }

    public JcaPGPPublicKeyRingCollection(byte[] bArr) throws PGPException, IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
