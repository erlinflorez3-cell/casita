package yg;

/* JADX INFO: renamed from: yg.oA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1561oA {
    public static short[] Xd = null;

    static {
        short[] sArr = new short[OY.Xd() ^ (561869370 ^ 626424572)];
        // fill-array-data instruction
        sArr[0] = 0;
        sArr[1] = 25237;
        sArr[2] = 25127;
        sArr[3] = 25031;
        sArr[4] = 24443;
        sArr[5] = 24359;
        sArr[6] = 24203;
        sArr[7] = 23671;
        sArr[8] = 23593;
        sArr[9] = 22993;
        sArr[10] = 22871;
        sArr[11] = 22769;
        sArr[12] = 22691;
        sArr[13] = 22573;
        sArr[14] = 21683;
        sArr[15] = 21589;
        sArr[16] = 21517;
        sArr[17] = 21407;
        sArr[18] = 21319;
        sArr[19] = 20183;
        sArr[20] = 20113;
        sArr[21] = 19267;
        sArr[22] = 19181;
        sArr[23] = 18541;
        sArr[24] = 18451;
        sArr[25] = 18367;
        sArr[26] = 18269;
        sArr[27] = 17419;
        sArr[28] = 17341;
        sArr[29] = 17231;
        sArr[30] = 17123;
        sArr[31] = 17029;
        sArr[32] = 16937;
        sArr[33] = 16843;
        sArr[34] = 15803;
        sArr[35] = 15733;
        sArr[36] = 15643;
        sArr[37] = 15551;
        sArr[38] = 14249;
        sArr[39] = 14143;
        sArr[40] = 14011;
        sArr[41] = 13907;
        sArr[42] = 13829;
        sArr[43] = 13723;
        sArr[44] = 13669;
        sArr[45] = 13553;
        Xd = sArr;
    }

    public static String Kd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((s2 + s2) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String Qd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(s2 + s2 + s2 + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String Xd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (s2 + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String Yd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((s2 + s2) + s2) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String od(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(s2 + s2 + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String ud(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(s2 + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static String yd(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (s2 ^ i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
