package org.bouncycastle.cms.jcajce;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.InputExpander;
import org.bouncycastle.operator.InputExpanderProvider;

/* JADX INFO: loaded from: classes6.dex */
public class ZlibExpanderProvider implements InputExpanderProvider {
    private final long limit;

    private static class LimitedInputStream extends FilterInputStream {
        private long remaining;

        public LimitedInputStream(InputStream inputStream, long j2) {
            super(inputStream);
            this.remaining = j2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            if (r2 >= 0) goto L8;
         */
        @Override // java.io.FilterInputStream, java.io.InputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int read() throws java.io.IOException {
            /*
                r7 = this;
                long r1 = r7.remaining
                r5 = 0
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 < 0) goto L1c
                java.io.InputStream r0 = r7.in
                int r4 = r0.read()
                if (r4 < 0) goto L1b
                long r2 = r7.remaining
                r0 = 1
                long r2 = r2 - r0
                r7.remaining = r2
                int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r0 < 0) goto L1c
            L1b:
                return r4
            L1c:
                org.bouncycastle.util.io.StreamOverflowException r1 = new org.bouncycastle.util.io.StreamOverflowException
                java.lang.String r0 = "expanded byte limit exceeded"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.cms.jcajce.ZlibExpanderProvider.LimitedInputStream.read():int");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (i3 < 1) {
                return super.read(bArr, i2, i3);
            }
            long j2 = this.remaining;
            if (j2 < 1) {
                read();
                return -1;
            }
            if (j2 <= i3) {
                i3 = (int) j2;
            }
            int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
            if (i4 > 0) {
                this.remaining -= (long) i4;
            }
            return i4;
        }
    }

    public ZlibExpanderProvider() {
        this.limit = -1L;
    }

    public ZlibExpanderProvider(long j2) {
        this.limit = j2;
    }

    @Override // org.bouncycastle.operator.InputExpanderProvider
    public InputExpander get(final AlgorithmIdentifier algorithmIdentifier) {
        return new InputExpander() { // from class: org.bouncycastle.cms.jcajce.ZlibExpanderProvider.1
            @Override // org.bouncycastle.operator.InputExpander
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier;
            }

            @Override // org.bouncycastle.operator.InputExpander
            public InputStream getInputStream(InputStream inputStream) {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
                return ZlibExpanderProvider.this.limit >= 0 ? new LimitedInputStream(inflaterInputStream, ZlibExpanderProvider.this.limit) : inflaterInputStream;
            }
        };
    }
}
