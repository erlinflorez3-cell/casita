package org.spongycastle.openpgp.jcajce;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.spongycastle.openpgp.PGPObjectFactory;
import org.spongycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaPGPObjectFactory extends PGPObjectFactory {
    public JcaPGPObjectFactory(InputStream inputStream) {
        super(inputStream, new JcaKeyFingerprintCalculator());
    }

    public JcaPGPObjectFactory(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
