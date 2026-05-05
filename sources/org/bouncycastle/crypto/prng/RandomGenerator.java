package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes6.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j2);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i2, int i3);
}
