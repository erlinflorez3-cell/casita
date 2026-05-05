package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes6.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.f27546s = (byte) 0;
        this.P = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            this.P[i2] = (byte) i2;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr3 = this.P;
            int i4 = (i3 + 255) - (255 | i3);
            int i5 = this.f27546s + this.P[i4] + bArr[i3 % bArr.length];
            this.f27546s = bArr3[(i5 + 255) - (i5 | 255)];
            byte b2 = this.P[i4];
            byte[] bArr4 = this.P;
            byte[] bArr5 = this.P;
            byte b3 = this.f27546s;
            bArr4[i4] = bArr5[(b3 + 255) - (b3 | 255)];
            this.P[(-1) - (((-1) - this.f27546s) | ((-1) - 255))] = b2;
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr6 = this.P;
            int i7 = i6 & 255;
            int i8 = this.f27546s + this.P[i7] + bArr2[i6 % bArr2.length];
            this.f27546s = bArr6[(i8 + 255) - (i8 | 255)];
            byte b4 = this.P[i7];
            this.P[i7] = this.P[this.f27546s & 255];
            byte[] bArr7 = this.P;
            byte b5 = this.f27546s;
            bArr7[(b5 + 255) - (b5 | 255)] = b4;
        }
        for (int i9 = 0; i9 < 768; i9++) {
            int i10 = (-1) - (((-1) - i9) | ((-1) - 255));
            this.f27546s = this.P[(-1) - (((-1) - ((this.f27546s + this.P[i10]) + bArr[i9 % bArr.length])) | ((-1) - 255))];
            byte b6 = this.P[i10];
            byte[] bArr8 = this.P;
            byte[] bArr9 = this.P;
            byte b7 = this.f27546s;
            bArr8[i10] = bArr9[(b7 + 255) - (b7 | 255)];
            this.P[(-1) - (((-1) - this.f27546s) | ((-1) - 255))] = b6;
        }
        this.f27545n = (byte) 0;
    }
}
