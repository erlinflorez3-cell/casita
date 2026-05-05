package org.spongycastle.openpgp;

import java.util.Iterator;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Iterable;

/* JADX INFO: loaded from: classes2.dex */
public class PGPOnePassSignatureList implements Iterable<PGPOnePassSignature> {
    PGPOnePassSignature[] sigs;

    public PGPOnePassSignatureList(PGPOnePassSignature pGPOnePassSignature) {
        this.sigs = new PGPOnePassSignature[]{pGPOnePassSignature};
    }

    public PGPOnePassSignatureList(PGPOnePassSignature[] pGPOnePassSignatureArr) {
        PGPOnePassSignature[] pGPOnePassSignatureArr2 = new PGPOnePassSignature[pGPOnePassSignatureArr.length];
        this.sigs = pGPOnePassSignatureArr2;
        System.arraycopy(pGPOnePassSignatureArr, 0, pGPOnePassSignatureArr2, 0, pGPOnePassSignatureArr.length);
    }

    public PGPOnePassSignature get(int i2) {
        return this.sigs[i2];
    }

    public boolean isEmpty() {
        return this.sigs.length == 0;
    }

    @Override // org.spongycastle.util.Iterable, java.lang.Iterable
    public Iterator<PGPOnePassSignature> iterator() {
        return new Arrays.Iterator(this.sigs);
    }

    public int size() {
        return this.sigs.length;
    }
}
