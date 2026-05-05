package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class Features extends SignatureSubpacket {
    public static final byte FEATURE_MODIFICATION_DETECTION = 1;

    public Features(boolean z2, byte b2) {
        super(30, z2, false, featureToByteArray(b2));
    }

    public Features(boolean z2, boolean z3, byte[] bArr) {
        super(30, z2, z3, bArr);
    }

    private static final byte[] featureToByteArray(byte b2) {
        return new byte[]{b2};
    }

    private void setSupportsFeature(byte b2, boolean z2) {
        if (b2 == 0) {
            throw new IllegalArgumentException("feature == 0");
        }
        if (supportsFeature(b2) != z2) {
            if (z2) {
                byte[] bArr = new byte[this.data.length + 1];
                System.arraycopy(this.data, 0, bArr, 0, this.data.length);
                bArr[this.data.length] = b2;
                this.data = bArr;
                return;
            }
            for (int i2 = 0; i2 < this.data.length; i2++) {
                if (this.data[i2] == b2) {
                    int length = this.data.length - 1;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(this.data, 0, bArr2, 0, i2);
                    System.arraycopy(this.data, i2 + 1, bArr2, i2, length - i2);
                    this.data = bArr2;
                    return;
                }
            }
        }
    }

    public boolean supportsFeature(byte b2) {
        for (int i2 = 0; i2 < this.data.length; i2++) {
            if (this.data[i2] == b2) {
                return true;
            }
        }
        return false;
    }

    public boolean supportsModificationDetection() {
        return supportsFeature((byte) 1);
    }
}
