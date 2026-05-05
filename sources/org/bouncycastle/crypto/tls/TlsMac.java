package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.LongDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class TlsMac {
    protected TlsContext context;
    protected int digestBlockSize;
    protected int digestOverhead;
    protected Mac mac;
    protected int macLength;
    protected byte[] secret;

    public TlsMac(TlsContext tlsContext, Digest digest, byte[] bArr, int i2, int i3) {
        int i4;
        this.context = tlsContext;
        KeyParameter keyParameter = new KeyParameter(bArr, i2, i3);
        this.secret = Arrays.clone(keyParameter.getKey());
        if (digest instanceof LongDigest) {
            this.digestBlockSize = 128;
            i4 = 16;
        } else {
            this.digestBlockSize = 64;
            i4 = 8;
        }
        this.digestOverhead = i4;
        if (TlsUtils.isSSL(tlsContext)) {
            this.mac = new SSL3Mac(digest);
            if (digest.getDigestSize() == 20) {
                this.digestOverhead = 4;
            }
        } else {
            this.mac = new HMac(digest);
        }
        this.mac.init(keyParameter);
        this.macLength = this.mac.getMacSize();
        if (tlsContext.getSecurityParameters().truncatedHMac) {
            this.macLength = Math.min(this.macLength, 10);
        }
    }

    public byte[] calculateMac(long j2, short s2, byte[] bArr, int i2, int i3) {
        ProtocolVersion serverVersion = this.context.getServerVersion();
        boolean zIsSSL = serverVersion.isSSL();
        int i4 = zIsSSL ? 11 : 13;
        byte[] bArr2 = new byte[i4];
        TlsUtils.writeUint64(j2, bArr2, 0);
        TlsUtils.writeUint8(s2, bArr2, 8);
        if (!zIsSSL) {
            TlsUtils.writeVersion(serverVersion, bArr2, 9);
        }
        TlsUtils.writeUint16(i3, bArr2, i4 - 2);
        this.mac.update(bArr2, 0, i4);
        this.mac.update(bArr, i2, i3);
        byte[] bArr3 = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr3, 0);
        return truncate(bArr3);
    }

    public byte[] calculateMacConstantTime(long j2, short s2, byte[] bArr, int i2, int i3, int i4, byte[] bArr2) {
        byte[] bArrCalculateMac = calculateMac(j2, s2, bArr, i2, i3);
        int i5 = TlsUtils.isSSL(this.context) ? 11 : 13;
        int digestBlockCount = getDigestBlockCount(i4 + i5) - getDigestBlockCount(i5 + i3);
        while (true) {
            digestBlockCount--;
            if (digestBlockCount < 0) {
                this.mac.update(bArr2[0]);
                this.mac.reset();
                return bArrCalculateMac;
            }
            this.mac.update(bArr2, 0, this.digestBlockSize);
        }
    }

    protected int getDigestBlockCount(int i2) {
        return (i2 + this.digestOverhead) / this.digestBlockSize;
    }

    public byte[] getMACSecret() {
        return this.secret;
    }

    public int getSize() {
        return this.macLength;
    }

    protected byte[] truncate(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.macLength;
        return length <= i2 ? bArr : Arrays.copyOf(bArr, i2);
    }
}
