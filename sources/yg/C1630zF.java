package yg;

import java.io.IOException;

/* JADX INFO: renamed from: yg.zF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1630zF {
    public static final int Qd = 16;
    public static final int od = 8;
    public final int Kd;
    public final int Xd;
    public final long Yd;
    public final long ud;

    public C1630zF(byte[] bArr, int i2, boolean z2, boolean z3) throws IOException {
        HN hn = new HN(bArr, z2, z3);
        this.Xd = i2;
        this.Yd = hn.Yd();
        this.ud = hn.Yd();
        this.Kd = (int) ((this.ud - this.Yd) / ((long) i2));
    }
}
