package yg;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: yg.uX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1590uX {
    private byte[] Xd;

    public C1590uX(byte[] bArr) {
        this.Xd = bArr;
    }

    public String LY(int i2) throws IOException {
        if (i2 >= this.Xd.length) {
            return null;
        }
        int length = this.Xd.length;
        int i3 = i2 + 1;
        while (true) {
            if (i3 >= this.Xd.length) {
                break;
            }
            if (this.Xd[i3] == 0) {
                length = i3;
                break;
            }
            i3++;
        }
        return new String(Arrays.copyOfRange(this.Xd, i2, length));
    }
}
