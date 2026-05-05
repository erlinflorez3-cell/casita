package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes6.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(new AESEngine());
    }

    public AESWrapEngine(boolean z2) {
        super(new AESEngine(), z2);
    }
}
