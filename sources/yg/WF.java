package yg;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class WF implements Comparable {
    public final byte[] Xd;

    public WF(byte[] bArr) {
        this.Xd = bArr;
    }

    public boolean equals(Object obj) {
        return Arrays.equals(this.Xd, ((WF) obj).Xd);
    }

    public int hashCode() {
        return Arrays.hashCode(this.Xd);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: mK, reason: merged with bridge method [inline-methods] */
    public int compareTo(WF wf) {
        int length = this.Xd.length - wf.Xd.length;
        if (length != 0) {
            return length;
        }
        for (int i2 = 0; i2 < this.Xd.length; i2++) {
            int i3 = this.Xd[i2] - wf.Xd[i2];
            if (i3 != 0) {
                return i3;
            }
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.Xd.length * 2);
        for (byte b2 : this.Xd) {
            sb.append(String.format(Jg.Wd("w3!W", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1029819131 ^ (-2057064320)))), (short) (C1633zX.Xd() ^ (1587842916 ^ (-1587869190)))), Byte.valueOf(b2)));
        }
        return sb.toString();
    }
}
