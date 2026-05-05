package yg;

import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Vu extends C1583sY {
    private int Kd;
    private final byte[] Yd;

    public Vu(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.Kd = -1;
        this.Yd = bArr;
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Vu) {
            return Arrays.equals(getEncoded(), ((Vu) obj).getEncoded());
        }
        return false;
    }

    @Override // yg.C1583sY, java.security.cert.Certificate
    public byte[] getEncoded() {
        return this.Yd;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (this.Kd == (ZN.Xd() ^ (-864698097))) {
            this.Kd = Arrays.hashCode(getEncoded());
        }
        return this.Kd;
    }
}
