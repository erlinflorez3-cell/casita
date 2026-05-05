package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f27583l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f27584n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i2, int i3, int i4, SecureRandom secureRandom) {
        this(i2, i3, i4, secureRandom, -1);
    }

    public DSAParameterGenerationParameters(int i2, int i3, int i4, SecureRandom secureRandom, int i5) {
        this.f27583l = i2;
        this.f27584n = i3;
        this.certainty = i4;
        this.usageIndex = i5;
        this.random = secureRandom;
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f27583l;
    }

    public int getN() {
        return this.f27584n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }
}
