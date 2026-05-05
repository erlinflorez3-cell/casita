package org.spongycastle.crypto.tls;

import java.io.IOException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.engines.ChaChaEngine;
import org.spongycastle.crypto.generators.Poly1305KeyGenerator;
import org.spongycastle.crypto.macs.Poly1305;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class Chacha20Poly1305 implements TlsCipher {
    protected TlsContext context;
    protected ChaChaEngine decryptCipher;
    protected ChaChaEngine encryptCipher;

    public Chacha20Poly1305(TlsContext tlsContext) throws IOException {
        if (!TlsUtils.isTLSv12(tlsContext)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.context = tlsContext;
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, 64);
        KeyParameter keyParameter = new KeyParameter(bArrCalculateKeyBlock, 0, 32);
        KeyParameter keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, 32, 32);
        this.encryptCipher = new ChaChaEngine(20);
        this.decryptCipher = new ChaChaEngine(20);
        if (tlsContext.isServer()) {
            keyParameter2 = keyParameter;
            keyParameter = keyParameter2;
        }
        byte[] bArr = new byte[8];
        this.encryptCipher.init(true, new ParametersWithIV(keyParameter, bArr));
        this.decryptCipher.init(false, new ParametersWithIV(keyParameter2, bArr));
    }

    protected byte[] calculateRecordMAC(KeyParameter keyParameter, byte[] bArr, byte[] bArr2, int i2, int i3) {
        Poly1305 poly1305 = new Poly1305();
        poly1305.init(keyParameter);
        updateRecordMAC(poly1305, bArr, 0, bArr.length);
        updateRecordMAC(poly1305, bArr2, i2, i3);
        byte[] bArr3 = new byte[poly1305.getMacSize()];
        poly1305.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j2, short s2, byte[] bArr, int i2, int i3) throws IOException {
        if (getPlaintextLimit(i3) < 0) {
            throw new TlsFatalAlert((short) 50);
        }
        int i4 = i3 - 16;
        if (!Arrays.constantTimeAreEqual(calculateRecordMAC(initRecordMAC(this.decryptCipher, false, j2), getAdditionalData(j2, s2, i4), bArr, i2, i4), Arrays.copyOfRange(bArr, i2 + i4, i3 + i2))) {
            throw new TlsFatalAlert((short) 20);
        }
        byte[] bArr2 = new byte[i4];
        this.decryptCipher.processBytes(bArr, i2, i4, bArr2, 0);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j2, short s2, byte[] bArr, int i2, int i3) throws IOException {
        KeyParameter keyParameterInitRecordMAC = initRecordMAC(this.encryptCipher, true, j2);
        byte[] bArr2 = new byte[i3 + 16];
        this.encryptCipher.processBytes(bArr, i2, i3, bArr2, 0);
        byte[] bArrCalculateRecordMAC = calculateRecordMAC(keyParameterInitRecordMAC, getAdditionalData(j2, s2, i3), bArr2, 0, i3);
        System.arraycopy(bArrCalculateRecordMAC, 0, bArr2, i3, bArrCalculateRecordMAC.length);
        return bArr2;
    }

    protected byte[] getAdditionalData(long j2, short s2, int i2) throws IOException {
        byte[] bArr = new byte[13];
        TlsUtils.writeUint64(j2, bArr, 0);
        TlsUtils.writeUint8(s2, bArr, 8);
        TlsUtils.writeVersion(this.context.getServerVersion(), bArr, 9);
        TlsUtils.writeUint16(i2, bArr, 11);
        return bArr;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i2) {
        return i2 - 16;
    }

    protected KeyParameter initRecordMAC(ChaChaEngine chaChaEngine, boolean z2, long j2) {
        byte[] bArr = new byte[8];
        TlsUtils.writeUint64(j2, bArr, 0);
        chaChaEngine.init(z2, new ParametersWithIV(null, bArr));
        byte[] bArr2 = new byte[64];
        chaChaEngine.processBytes(bArr2, 0, 64, bArr2, 0);
        System.arraycopy(bArr2, 0, bArr2, 32, 16);
        KeyParameter keyParameter = new KeyParameter(bArr2, 16, 32);
        Poly1305KeyGenerator.clamp(keyParameter.getKey());
        return keyParameter;
    }

    protected void updateRecordMAC(Mac mac, byte[] bArr, int i2, int i3) {
        mac.update(bArr, i2, i3);
        byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(((long) i3) & 4294967295L);
        mac.update(bArrLongToLittleEndian, 0, bArrLongToLittleEndian.length);
    }
}
