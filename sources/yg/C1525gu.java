package yg;

import java.io.IOException;

/* JADX INFO: renamed from: yg.gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1525gu {
    private static final byte Qd = 1;
    public static final int wd = 24;
    public static final int yd = 12;
    public final long Kd;
    public final long Xd;
    public final long Yd;
    private final boolean od;
    public final byte[] ud;

    public C1525gu(byte[] bArr, boolean z2, boolean z3) throws IOException {
        this.od = (-1) - (((-1) - bArr[0]) | ((-1) - 1)) != 0;
        this.ud = (byte[]) bArr.clone();
        HN hn = new HN(bArr, z2, z3);
        this.Xd = hn.Yd();
        this.Yd = hn.Yd();
        this.Kd = hn.Yd();
    }

    public String lY() throws IOException {
        byte b2;
        if (this.od) {
            return new String(ZY.Xd(this.Kd, (int) this.Yd));
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 < this.ud.length && (b2 = this.ud[i2]) != 0; i2++) {
            sb.append((char) b2);
        }
        return sb.toString();
    }

    public boolean uY() {
        return this.od;
    }
}
