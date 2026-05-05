package org.bouncycastle.crypto.tls;

/* JADX INFO: loaded from: classes2.dex */
public class SupplementalDataEntry {
    protected byte[] data;
    protected int dataType;

    public SupplementalDataEntry(int i2, byte[] bArr) {
        this.dataType = i2;
        this.data = bArr;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDataType() {
        return this.dataType;
    }
}
