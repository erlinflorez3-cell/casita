package o.a;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static void c(byte[] bArr, byte b2, long j2) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if ((-1) - (((-1) - (1 << i2)) | ((-1) - j2)) != 0) {
                bArr[i2] = (byte) (bArr[i2] ^ b2);
            }
        }
    }
}
