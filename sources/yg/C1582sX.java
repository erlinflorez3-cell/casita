package yg;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: yg.sX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1582sX {
    public final long Kd;
    public final long Xd;
    public final long Yd;

    public C1582sX(long j2, long j3, long j4) {
        this.Xd = j2;
        this.Kd = j3;
        this.Yd = j4;
    }

    public C1582sX(String str) {
        String[] strArrSplit = str.split(Pattern.quote(C1561oA.ud("B", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849960028)))));
        long j2 = 0;
        if (strArrSplit.length >= 1) {
            try {
                j2 = Long.parseLong(strArrSplit[0]);
            } catch (NumberFormatException e2) {
            }
        }
        long j3 = 0;
        int i2 = (435711163 ^ 1741176038) ^ 2117095519;
        if (strArrSplit.length >= i2) {
            try {
                j3 = Long.parseLong(strArrSplit[1]);
            } catch (NumberFormatException e3) {
            }
        }
        long j4 = 0;
        if (strArrSplit.length >= ((426215141 ^ 1605220477) ^ 1187659419)) {
            try {
                j4 = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException e4) {
            }
        }
        this.Xd = j2;
        this.Kd = j3;
        this.Yd = j4;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.Xd);
        String strYd = C1561oA.yd(",", (short) (Od.Xd() ^ (2125415123 ^ (-2125422442))));
        return sbAppend.append(strYd).append(this.Kd).append(strYd).append(this.Yd).toString();
    }
}
