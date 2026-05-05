package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes2.dex */
class DTLSEpoch {
    private final TlsCipher cipher;
    private final int epoch;
    private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
    private long sequenceNumber = 0;

    DTLSEpoch(int i2, TlsCipher tlsCipher) {
        if (i2 < 0) {
            throw new IllegalArgumentException("'epoch' must be >= 0");
        }
        if (tlsCipher == null) {
            throw new IllegalArgumentException("'cipher' cannot be null");
        }
        this.epoch = i2;
        this.cipher = tlsCipher;
    }

    long allocateSequenceNumber() {
        long j2 = this.sequenceNumber;
        this.sequenceNumber = 1 + j2;
        return j2;
    }

    TlsCipher getCipher() {
        return this.cipher;
    }

    int getEpoch() {
        return this.epoch;
    }

    DTLSReplayWindow getReplayWindow() {
        return this.replayWindow;
    }

    long getSequenceNumber() {
        return this.sequenceNumber;
    }
}
