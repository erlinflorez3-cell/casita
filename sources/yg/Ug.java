package yg;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class Ug {
    public static boolean BX(String str) {
        return str != null && str.isEmpty();
    }

    public static int[] Od() {
        byte[] bArrWd = wd();
        return new int[]{Tg.Xd(bArrWd[91347247 ^ 91347261]), Tg.Xd(bArrWd[OY.Xd() ^ 69929212]), Tg.Xd(bArrWd[ZN.Xd() ^ (1964856461 ^ 1184328299)]), Tg.Xd(bArrWd[(753651404 ^ 603246439) ^ 253690291]), Tg.Xd(bArrWd[(1627410643 ^ 1174136129) ^ 620475784]), Tg.Xd(bArrWd[Od.Xd() ^ 1207800905]), Tg.Xd(bArrWd[C1607wl.Xd() ^ (1151108127 ^ 718837723)]), Tg.Xd(bArrWd[C1607wl.Xd() ^ (42088709 ^ 1824926463)]), Tg.Xd(bArrWd[1725382148 ^ 1725382182]), Tg.Xd(bArrWd[1775442017 ^ 1775441989]), Tg.Xd(bArrWd[C1499aX.Xd() ^ (511896944 ^ (-1561954886))]), Tg.Xd(bArrWd[C1633zX.Xd() ^ (759601009 ^ (-1494741870))]), Tg.Xd(bArrWd[(1665805945 ^ 23190484) ^ 1647048071]), Tg.Xd(bArrWd[C1607wl.Xd() ^ (1967316553 ^ 453430719)]), Tg.Xd(bArrWd[OY.Xd() ^ 69929158]), Tg.Xd(bArrWd[(542525695 ^ 611414485) ^ 69679386]), Tg.Xd(bArrWd[C1633zX.Xd() ^ (-1951491079)]), Tg.Xd(bArrWd[62650336 ^ 62650324]), Tg.Xd(bArrWd[(97884643 ^ 833596009) ^ 880423868]), Tg.Xd(bArrWd[784325488 ^ 784325448])};
    }

    public static ByteBuffer Qd(ByteBuffer byteBuffer, int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C1561oA.Qd("\u001b\u001b\u0007\u0017\u0018\\A", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864690829)))) + i2);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(Ig.wd("E~f\u0003\u0016DDM\u0017x\u0001$V", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (259436294 ^ (-1630699738))))) + i3 + EO.Od("\u0013hn", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849974536)))) + i2);
        }
        int iCapacity = byteBuffer.capacity();
        if (i3 <= byteBuffer.capacity()) {
            int iLimit = byteBuffer.limit();
            int iPosition = byteBuffer.position();
            try {
                byteBuffer.position(0);
                byteBuffer.limit(i3);
                byteBuffer.position(i2);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.order(byteBuffer.order());
                return byteBufferSlice;
            } finally {
                byteBuffer.position(0);
                byteBuffer.limit(iLimit);
                byteBuffer.position(iPosition);
            }
        }
        StringBuilder sb = new StringBuilder();
        int iXd = OY.Xd() ^ 69938177;
        int iXd2 = OY.Xd() ^ (1664576246 ^ 1729904193);
        short sXd = (short) (OY.Xd() ^ iXd);
        short sXd2 = (short) (OY.Xd() ^ iXd2);
        int[] iArr = new int["?c\u001e\u001e,r\u001b\"&\u0010%U5.2\u0013".length()];
        QB qb = new QB("?c\u001e\u001e,r\u001b\"&\u0010%U5.2\u0013");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd2) + sXd)));
            i4++;
        }
        throw new IllegalArgumentException(sb.append(new String(iArr, 0, i4)).append(i3).append(C1626yg.Ud("3Px", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134257126))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831084745))))).append(iCapacity).toString());
    }

    public static int Xd(int i2) {
        return (Integer.rotateRight(i2, ZN.Xd() ^ 864698098) ^ Integer.rotateRight(i2, (1606454796 ^ 1603577232) ^ 5516177)) ^ Integer.rotateRight(i2, (735559704 ^ 1416408414) ^ 2142989648);
    }

    public static String od() {
        try {
            return (String) Class.forName(Wg.vd("&4+:83/y<A|\u0012F;?8X\f{\n\f\u0003\n\n", (short) (C1580rY.Xd() ^ (1097914665 ^ (-1097902169))))).getField(Qg.kd("'\u0019\u001f\u0017\u0012#\u0014", (short) (C1580rY.Xd() ^ (1735418222 ^ (-1735411830))), (short) (C1580rY.Xd() ^ ((953275966 ^ 1529143778) ^ (-1677010569))))).get(null);
        } catch (Exception e2) {
            return null;
        }
    }

    public static void vd(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        C1620yF.Xd = str.length();
    }

    public static byte[] wd() {
        byte[] bArr = new byte[Od.Xd() ^ 1207801063];
        // fill-array-data instruction
        bArr[0] = 63;
        bArr[1] = -116;
        bArr[2] = -70;
        bArr[3] = -17;
        bArr[4] = -83;
        bArr[5] = -17;
        bArr[6] = 48;
        bArr[7] = -23;
        bArr[8] = 103;
        bArr[9] = 26;
        bArr[10] = 64;
        bArr[11] = -65;
        bArr[12] = -16;
        bArr[13] = 15;
        bArr[14] = -93;
        bArr[15] = 92;
        bArr[16] = 105;
        bArr[17] = -106;
        bArr[18] = -7;
        bArr[19] = 6;
        bArr[20] = -44;
        bArr[21] = 43;
        bArr[22] = 7;
        bArr[23] = -8;
        bArr[24] = 119;
        bArr[25] = -120;
        bArr[26] = -113;
        bArr[27] = 112;
        bArr[28] = 77;
        bArr[29] = -78;
        bArr[30] = 56;
        bArr[31] = -57;
        bArr[32] = 30;
        bArr[33] = -31;
        bArr[34] = -45;
        bArr[35] = 44;
        bArr[36] = 74;
        bArr[37] = -75;
        bArr[38] = 13;
        bArr[39] = -14;
        bArr[40] = 90;
        bArr[41] = -91;
        bArr[42] = 72;
        bArr[43] = -73;
        bArr[44] = 6;
        bArr[45] = -7;
        bArr[46] = 29;
        bArr[47] = -30;
        bArr[48] = 81;
        bArr[49] = -82;
        bArr[50] = 121;
        bArr[51] = -122;
        bArr[52] = -21;
        bArr[53] = 20;
        bArr[54] = -82;
        bArr[55] = 81;
        bArr[56] = -33;
        bArr[57] = 32;
        bArr[58] = -65;
        bArr[59] = 64;
        bArr[60] = 15;
        bArr[61] = -16;
        bArr[62] = 92;
        bArr[63] = -93;
        bArr[64] = -106;
        bArr[65] = 105;
        bArr[66] = 6;
        bArr[67] = -7;
        bArr[68] = 43;
        bArr[69] = -44;
        bArr[70] = -8;
        bArr[71] = 7;
        bArr[72] = -120;
        bArr[73] = 119;
        bArr[74] = 112;
        bArr[75] = -113;
        bArr[76] = -78;
        bArr[77] = 77;
        bArr[78] = -57;
        bArr[79] = 56;
        bArr[80] = -31;
        bArr[81] = 30;
        bArr[82] = 44;
        bArr[83] = -45;
        bArr[84] = -75;
        bArr[85] = 74;
        bArr[86] = -14;
        bArr[87] = 13;
        bArr[88] = -91;
        bArr[89] = 90;
        bArr[90] = -73;
        bArr[91] = 72;
        bArr[92] = -7;
        bArr[93] = 6;
        bArr[94] = -30;
        bArr[95] = 29;
        bArr[96] = -82;
        bArr[97] = 81;
        bArr[98] = -122;
        bArr[99] = 121;
        bArr[100] = 20;
        bArr[101] = -21;
        bArr[102] = 81;
        bArr[103] = -82;
        bArr[104] = 32;
        bArr[105] = -33;
        bArr[106] = 0;
        bArr[107] = -1;
        bArr[108] = 9;
        bArr[109] = -10;
        bArr[110] = -1;
        bArr[111] = 0;
        bArr[112] = -10;
        bArr[113] = 9;
        bArr[114] = 0;
        bArr[115] = -1;
        bArr[116] = 0;
        bArr[117] = -1;
        bArr[118] = 0;
        bArr[119] = -1;
        bArr[120] = 0;
        bArr[121] = -1;
        bArr[122] = 0;
        bArr[123] = -1;
        bArr[124] = 25;
        bArr[125] = -26;
        bArr[126] = 86;
        bArr[127] = -87;
        bArr[128] = -120;
        bArr[129] = 119;
        bArr[130] = -1;
        bArr[131] = 0;
        bArr[132] = -1;
        bArr[133] = 0;
        bArr[134] = -1;
        bArr[135] = 0;
        bArr[136] = -1;
        bArr[137] = 0;
        bArr[138] = -1;
        bArr[139] = 0;
        bArr[140] = -26;
        bArr[141] = 25;
        bArr[142] = -87;
        bArr[143] = 86;
        bArr[144] = 119;
        bArr[145] = -120;
        bArr[146] = 0;
        bArr[147] = -1;
        bArr[148] = 9;
        bArr[149] = -10;
        bArr[150] = -1;
        bArr[151] = 0;
        bArr[152] = -10;
        bArr[153] = 9;
        bArr[154] = -126;
        bArr[155] = 125;
        bArr[156] = 125;
        bArr[157] = -126;
        bArr[158] = -120;
        bArr[159] = 119;
        bArr[160] = 119;
        bArr[161] = -120;
        bArr[162] = -124;
        bArr[163] = 123;
        bArr[164] = 123;
        bArr[165] = -124;
        bArr[166] = -127;
        bArr[167] = 126;
        bArr[168] = 126;
        bArr[169] = -127;
        bArr[170] = 52;
        bArr[171] = -53;
        bArr[172] = -31;
        bArr[173] = 30;
        bArr[174] = -53;
        bArr[175] = 52;
        bArr[176] = 30;
        bArr[177] = -31;
        return bArr;
    }
}
