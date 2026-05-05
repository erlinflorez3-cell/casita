package yg;

import java.io.RandomAccessFile;

/* JADX INFO: renamed from: yg.nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1558nK extends AbstractC1530iB {
    private static boolean Kd() {
        try {
            String strKd = C1561oA.Kd("f),*\u001fk1$,'p68&:<;", (short) (Od.Xd() ^ ((855669146 ^ 667729411) ^ (-348978694))));
            short sXd = (short) (C1580rY.Xd() ^ ((66036224 ^ 487936208) ^ (-519739067)));
            short sXd2 = (short) (C1580rY.Xd() ^ (1083569445 ^ (-1083546873)));
            int[] iArr = new int["\u001c".length()];
            QB qb = new QB("\u001c");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(strKd, new String(iArr, 0, i2));
            while (true) {
                try {
                    String line = randomAccessFile.readLine();
                    if (line == null) {
                        randomAccessFile.close();
                        return false;
                    }
                    short sXd3 = (short) (OY.Xd() ^ ((179893990 ^ 281094390) ^ 444183927));
                    int[] iArr2 = new int[",K;>AO.HD".length()];
                    QB qb2 = new QB(",K;>AO.HD");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                        i3++;
                    }
                    if (line.startsWith(new String(iArr2, 0, i3))) {
                        if (line.split(Wg.vd("a", (short) (C1580rY.Xd() ^ (157077069 ^ (-157077827))))).length != (485686413 ^ 485686415)) {
                            randomAccessFile.close();
                            return false;
                        }
                        if (!r3[1].equals(Qg.kd("\u0005", (short) (OY.Xd() ^ (1922290401 ^ 1922295627)), (short) (OY.Xd() ^ ((1803382439 ^ 957453103) ^ 1382865110))))) {
                            randomAccessFile.close();
                            return true;
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean Xd() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.C1558nK.Xd():boolean");
    }
}
