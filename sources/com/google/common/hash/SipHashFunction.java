package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3510d;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final long f3511k0;
    private final long k1;

    private static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f3512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3514d;
        private long finalM;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private long f3515v0;
        private long v1;
        private long v2;
        private long v3;

        SipHasher(int c2, int d2, long k02, long k1) {
            super(8);
            this.f3512b = 0L;
            this.finalM = 0L;
            this.f3513c = c2;
            this.f3514d = d2;
            this.f3515v0 = 8317987319222330741L ^ k02;
            this.v1 = 7237128888997146477L ^ k1;
            this.v2 = 7816392313619706465L ^ k02;
            this.v3 = 8387220255154660723L ^ k1;
        }

        private void processM(long m2) {
            this.v3 ^= m2;
            sipRound(this.f3513c);
            this.f3515v0 = m2 ^ this.f3515v0;
        }

        private void sipRound(int iterations) {
            for (int i2 = 0; i2 < iterations; i2++) {
                long j2 = this.f3515v0;
                long j3 = this.v1;
                this.f3515v0 = j2 + j3;
                this.v2 += this.v3;
                this.v1 = Long.rotateLeft(j3, 13);
                long jRotateLeft = Long.rotateLeft(this.v3, 16);
                long j4 = this.v1;
                long j5 = this.f3515v0;
                this.v1 = j4 ^ j5;
                this.v3 = jRotateLeft ^ this.v2;
                long jRotateLeft2 = Long.rotateLeft(j5, 32);
                long j6 = this.v2;
                long j7 = this.v1;
                this.v2 = j6 + j7;
                this.f3515v0 = jRotateLeft2 + this.v3;
                this.v1 = Long.rotateLeft(j7, 17);
                long jRotateLeft3 = Long.rotateLeft(this.v3, 21);
                long j8 = this.v1;
                long j9 = this.v2;
                this.v1 = j8 ^ j9;
                this.v3 = jRotateLeft3 ^ this.f3515v0;
                this.v2 = Long.rotateLeft(j9, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode makeHash() {
            long j2 = this.finalM ^ (this.f3512b << 56);
            this.finalM = j2;
            processM(j2);
            this.v2 ^= 255;
            sipRound(this.f3514d);
            return HashCode.fromLong(((this.f3515v0 ^ this.v1) ^ this.v2) ^ this.v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void process(ByteBuffer buffer) {
            this.f3512b += 8;
            processM(buffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void processRemaining(ByteBuffer buffer) {
            this.f3512b += (long) buffer.remaining();
            int i2 = 0;
            while (buffer.hasRemaining()) {
                this.finalM ^= ((-1) - (((-1) - ((long) buffer.get())) | ((-1) - 255))) << i2;
                i2 += 8;
            }
        }
    }

    SipHashFunction(int c2, int d2, long k02, long k1) {
        Preconditions.checkArgument(c2 > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c2);
        Preconditions.checkArgument(d2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d2);
        this.f3509c = c2;
        this.f3510d = d2;
        this.f3511k0 = k02;
        this.k1 = k1;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(@CheckForNull Object object) {
        if (!(object instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) object;
        return this.f3509c == sipHashFunction.f3509c && this.f3510d == sipHashFunction.f3510d && this.f3511k0 == sipHashFunction.f3511k0 && this.k1 == sipHashFunction.k1;
    }

    public int hashCode() {
        return (int) ((((long) ((getClass().hashCode() ^ this.f3509c) ^ this.f3510d)) ^ this.f3511k0) ^ this.k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f3509c, this.f3510d, this.f3511k0, this.k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f3509c + "" + this.f3510d + "(" + this.f3511k0 + ", " + this.k1 + ")";
    }
}
