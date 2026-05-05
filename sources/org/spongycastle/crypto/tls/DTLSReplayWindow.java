package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes2.dex */
class DTLSReplayWindow {
    private static final long VALID_SEQ_MASK = 281474976710655L;
    private static final long WINDOW_SIZE = 64;
    private long latestConfirmedSeq = -1;
    private long bitmap = 0;

    DTLSReplayWindow() {
    }

    void reportAuthenticated(long j2) {
        if ((-1) - (((-1) - VALID_SEQ_MASK) | ((-1) - j2)) != j2) {
            throw new IllegalArgumentException("'seq' out of range");
        }
        long j3 = this.latestConfirmedSeq;
        if (j2 <= j3) {
            long j4 = j3 - j2;
            if (j4 < WINDOW_SIZE) {
                this.bitmap = (-1) - (((-1) - this.bitmap) & ((-1) - (1 << ((int) j4))));
                return;
            }
            return;
        }
        long j5 = j2 - j3;
        if (j5 >= WINDOW_SIZE) {
            this.bitmap = 1L;
        } else {
            long j6 = this.bitmap << ((int) j5);
            this.bitmap = (j6 + 1) - (j6 & 1);
        }
        this.latestConfirmedSeq = j2;
    }

    void reset() {
        this.latestConfirmedSeq = -1L;
        this.bitmap = 0L;
    }

    boolean shouldDiscard(long j2) {
        if ((VALID_SEQ_MASK + j2) - (VALID_SEQ_MASK | j2) != j2) {
            return true;
        }
        long j3 = this.latestConfirmedSeq;
        if (j2 > j3) {
            return false;
        }
        long j4 = j3 - j2;
        return j4 >= WINDOW_SIZE || (-1) - (((-1) - this.bitmap) | ((-1) - (1 << ((int) j4)))) != 0;
    }
}
