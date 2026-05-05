package org.spongycastle.openpgp.bc;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.spongycastle.openpgp.PGPObjectFactory;
import org.spongycastle.openpgp.operator.bc.BcKeyFingerprintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class BcPGPObjectFactory extends PGPObjectFactory {
    public BcPGPObjectFactory(InputStream inputStream) {
        super(inputStream, new BcKeyFingerprintCalculator());
    }

    public BcPGPObjectFactory(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
