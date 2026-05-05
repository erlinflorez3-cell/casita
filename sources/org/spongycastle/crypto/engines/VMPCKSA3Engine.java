package org.spongycastle.crypto.engines;

/* JADX INFO: loaded from: classes2.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.spongycastle.crypto.engines.VMPCEngine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.spongycastle.crypto.engines.VMPCEngine
    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.f27908s = (byte) 0;
        this.P = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            this.P[i2] = (byte) i2;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            int i4 = (-1) - (((-1) - i3) | ((-1) - 255));
            this.f27908s = this.P[(this.f27908s + this.P[i4] + bArr[i3 % bArr.length]) & 255];
            byte b2 = this.P[i4];
            byte[] bArr3 = this.P;
            byte[] bArr4 = this.P;
            byte b3 = this.f27908s;
            bArr3[i4] = bArr4[(b3 + 255) - (b3 | 255)];
            this.P[(-1) - (((-1) - this.f27908s) | ((-1) - 255))] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            int i6 = i5 & 255;
            this.f27908s = this.P[(this.f27908s + this.P[i6] + bArr2[i5 % bArr2.length]) & 255];
            byte b4 = this.P[i6];
            byte[] bArr5 = this.P;
            byte[] bArr6 = this.P;
            byte b5 = this.f27908s;
            bArr5[i6] = bArr6[(b5 + 255) - (b5 | 255)];
            this.P[(-1) - (((-1) - this.f27908s) | ((-1) - 255))] = b4;
        }
        for (int i7 = 0; i7 < 768; i7++) {
            int i8 = i7 & 255;
            this.f27908s = this.P[(this.f27908s + this.P[i8] + bArr[i7 % bArr.length]) & 255];
            byte b6 = this.P[i8];
            this.P[i8] = this.P[this.f27908s & 255];
            this.P[this.f27908s & 255] = b6;
        }
        this.f27907n = (byte) 0;
    }
}
