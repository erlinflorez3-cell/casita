package org.spongycastle.openpgp.operator;

import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public interface PGPDigestCalculatorProvider {
    PGPDigestCalculator get(int i2) throws PGPException;
}
