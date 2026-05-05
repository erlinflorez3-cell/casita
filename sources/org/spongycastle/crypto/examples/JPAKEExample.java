package org.spongycastle.crypto.examples;

import cz.msebera.android.httpclient.HttpStatus;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.spongycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup;
import org.spongycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroups;
import org.spongycastle.crypto.agreement.jpake.JPAKERound1Payload;
import org.spongycastle.crypto.agreement.jpake.JPAKERound2Payload;
import org.spongycastle.crypto.agreement.jpake.JPAKERound3Payload;
import org.spongycastle.crypto.digests.SHA256Digest;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKEExample {
    private static BigInteger deriveSessionKey(BigInteger bigInteger) {
        SHA256Digest sHA256Digest = new SHA256Digest();
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[sHA256Digest.getDigestSize()];
        sHA256Digest.update(byteArray, 0, byteArray.length);
        sHA256Digest.doFinal(bArr, 0);
        return new BigInteger(bArr);
    }

    public static void main(String[] strArr) throws Throwable {
        JPAKEPrimeOrderGroup jPAKEPrimeOrderGroup = JPAKEPrimeOrderGroups.NIST_3072;
        BigInteger p2 = jPAKEPrimeOrderGroup.getP();
        BigInteger q2 = jPAKEPrimeOrderGroup.getQ();
        BigInteger g2 = jPAKEPrimeOrderGroup.getG();
        System.out.println(ZO.xd("z\u0015\u007f|I0\u0018I.\u0005c?=ur2i\u0017\u001a$W\u0004]s~\"/jRL\b:a-\u0004", (short) (C1580rY.Xd() ^ (-15974)), (short) (C1580rY.Xd() ^ (-12565))));
        PrintStream printStream = System.out;
        short sXd = (short) (Od.Xd() ^ (-5539));
        short sXd2 = (short) (Od.Xd() ^ (-31361));
        int[] iArr = new int["Da!\u0002b|\u0019Z^qxv\u000fI}Ew9UTev,\u0005'\"T[\u0006gG\u000eRAISS/F".length()];
        QB qb = new QB("Da!\u0002b|\u0019Z^qxv\u000fI}Ew9UTev,\u0005'\"T[\u0006gG\u000eRAISS/F");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        printStream.println(new String(iArr, 0, i2));
        PrintStream printStream2 = System.out;
        StringBuilder sbAppend = new StringBuilder(Ig.wd("}SY", (short) (C1580rY.Xd() ^ (-24297)))).append(p2.bitLength());
        short sXd3 = (short) (Od.Xd() ^ (-31932));
        int[] iArr2 = new int["!\u0012Mq2E4[".length()];
        QB qb2 = new QB("!\u0012Mq2E4[");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        printStream2.println(sbAppend.append(str).append(p2.toString(16)).toString());
        System.out.println(C1561oA.Qd("Z\b\u000f", (short) (C1607wl.Xd() ^ 10131)) + q2.bitLength() + str + q2.toString(16));
        System.out.println(C1593ug.zd("\u0012KT", (short) (OY.Xd() ^ 11074), (short) (OY.Xd() ^ 14781)) + p2.bitLength() + str + g2.toString(16));
        System.out.println(C1561oA.od("9g45)c4a}_", (short) (C1580rY.Xd() ^ (-13203))) + p2.mod(q2).toString(16));
        PrintStream printStream3 = System.out;
        short sXd4 = (short) (C1607wl.Xd() ^ 29041);
        int[] iArr3 = new int["KCaXe\tWZP\r^\u000f-\u0011".length()];
        QB qb3 = new QB("KCaXe\tWZP\r^\u000f-\u0011");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
            i4++;
        }
        printStream3.println(new String(iArr3, 0, i4) + g2.modPow(q2, p2).toString(16));
        System.out.println("");
        PrintStream printStream4 = System.out;
        short sXd5 = (short) (C1633zX.Xd() ^ (-818));
        short sXd6 = (short) (C1633zX.Xd() ^ (-6477));
        int[] iArr4 = new int["S!23aWe4\u0004w),/IK@n\u001ar\u0010\u0005\u0003A#=b&PPin(\r\u0019\u000el\u000e>O*\u000f\u0014\u0002u\u0007*-(J;{\u001c`l\u0006@E3'8;^Y[o,26".length()];
        QB qb4 = new QB("S!23aWe4\u0004w),/IK@n\u001ar\u0010\u0005\u0003A#=b&PPin(\r\u0019\u000el\u000e>O*\u000f\u0014\u0002u\u0007*-(J;{\u001c`l\u0006@E3'8;^Y[o,26");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(((i5 * sXd6) ^ sXd5) + xuXd4.CK(iKK4));
            i5++;
        }
        printStream4.println(new String(iArr4, 0, i5));
        SHA256Digest sHA256Digest = new SHA256Digest();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Xd("NF\\H\u0016\\ONa_Wci\u001fEXWjh\\JZh_kj", (short) (C1633zX.Xd() ^ (-20282)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            String strVd = Wg.vd(")33,)", (short) (FB.Xd() ^ 6521));
            String strKd = Qg.kd("eUfeh_aR", (short) (C1607wl.Xd() ^ 14279), (short) (C1607wl.Xd() ^ 2802));
            JPAKEParticipant jPAKEParticipant = new JPAKEParticipant(strVd, strKd.toCharArray(), jPAKEPrimeOrderGroup, sHA256Digest, secureRandom);
            JPAKEParticipant jPAKEParticipant2 = new JPAKEParticipant(hg.Vd("\\hZ", (short) (C1633zX.Xd() ^ (-15347)), (short) (C1633zX.Xd() ^ (-30835))), strKd.toCharArray(), jPAKEPrimeOrderGroup, sHA256Digest, secureRandom);
            JPAKERound1Payload jPAKERound1PayloadCreateRound1PayloadToSend = jPAKEParticipant.createRound1PayloadToSend();
            JPAKERound1Payload jPAKERound1PayloadCreateRound1PayloadToSend2 = jPAKEParticipant2.createRound1PayloadToSend();
            System.out.println(C1561oA.ud("\u0015\u0014\u0013\u0012\u0011\u0010\u000f\u000e\r\f\u000b\n~0LQI>x\tv\u007f~}|{zyxwvutsr", (short) (C1499aX.Xd() ^ (-11113))));
            PrintStream printStream5 = System.out;
            String strYd = C1561oA.yd("\u000b51*+d7(0%3^2,[|I;\u0012v", (short) (FB.Xd() ^ 29244));
            printStream5.println(strYd);
            PrintStream printStream6 = System.out;
            short sXd7 = (short) (C1499aX.Xd() ^ (-545));
            int[] iArr5 = new int["d\\zx2\u007f@".length()];
            QB qb5 = new QB("d\\zx2\u007f@");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd7 + sXd7) + sXd7) + i6));
                i6++;
            }
            printStream6.println(new String(iArr5, 0, i6) + jPAKERound1PayloadCreateRound1PayloadToSend.getGx1().toString(16));
            System.out.println(Xg.qd("\"\u001a86p=}", (short) (C1607wl.Xd() ^ 30247), (short) (C1607wl.Xd() ^ 3981)) + jPAKERound1PayloadCreateRound1PayloadToSend.getGx2().toString(16));
            PrintStream printStream7 = System.out;
            StringBuilder sbAppend2 = new StringBuilder(Jg.Wd("L\bo!\u0014\u0018\u000f\t", (short) (C1499aX.Xd() ^ (-14419)), (short) (C1499aX.Xd() ^ (-29555)))).append(jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX1()[0].toString(16));
            String strXd = ZO.xd("\u000fXa", (short) (C1607wl.Xd() ^ 15721), (short) (C1607wl.Xd() ^ 23540));
            StringBuilder sbAppend3 = sbAppend2.append(strXd).append(jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX1()[1].toString(16));
            short sXd8 = (short) (C1580rY.Xd() ^ (-30214));
            short sXd9 = (short) (C1580rY.Xd() ^ (-15368));
            int[] iArr6 = new int["<".length()];
            QB qb6 = new QB("<");
            int i7 = 0;
            while (qb6.YK()) {
                int iKK6 = qb6.KK();
                Xu xuXd6 = Xu.Xd(iKK6);
                iArr6[i7] = xuXd6.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + (i7 * sXd9))) + xuXd6.CK(iKK6));
                i7++;
            }
            String str2 = new String(iArr6, 0, i7);
            printStream7.println(sbAppend3.append(str2).toString());
            PrintStream printStream8 = System.out;
            short sXd10 = (short) (ZN.Xd() ^ 26929);
            int[] iArr7 = new int["=\u0013Lh\u0002p\u001cR".length()];
            QB qb7 = new QB("=\u0013Lh\u0002p\u001cR");
            int i8 = 0;
            while (qb7.YK()) {
                int iKK7 = qb7.KK();
                Xu xuXd7 = Xu.Xd(iKK7);
                iArr7[i8] = xuXd7.fK(xuXd7.CK(iKK7) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ (sXd10 + i8)));
                i8++;
            }
            printStream8.println(new String(iArr7, 0, i8) + jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX2()[0].toString(16) + strXd + jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX2()[1].toString(16) + str2);
            System.out.println("");
            PrintStream printStream9 = System.out;
            String strOd = EO.Od(")&l\u0004Ix 7\u0002\u001cpK+X*F\u0006\u00042\u0012", (short) (C1633zX.Xd() ^ (-1342)));
            printStream9.println(strOd);
            System.out.println(C1561oA.Qd("PFb^\u0018a ", (short) (ZN.Xd() ^ 29933)) + jPAKERound1PayloadCreateRound1PayloadToSend2.getGx1().toString(16));
            System.out.println(C1593ug.zd("\u0012\n(&b-m", (short) (ZN.Xd() ^ 4645), (short) (ZN.Xd() ^ 30099)) + jPAKERound1PayloadCreateRound1PayloadToSend2.getGx2().toString(16));
            System.out.println(C1561oA.od("uy$ Y#a\u001f", (short) (FB.Xd() ^ 8703)) + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX1()[0].toString(16) + strXd + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX1()[1].toString(16) + str2);
            System.out.println(C1561oA.Kd("\u000b\u0011=;wB\u0003B", (short) (C1633zX.Xd() ^ (-22222))) + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX2()[0].toString(16) + strXd + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX2()[1].toString(16) + str2);
            System.out.println("");
            jPAKEParticipant.validateRound1PayloadReceived(jPAKERound1PayloadCreateRound1PayloadToSend2);
            System.out.println(Wg.Zd("3J\bi8:^(u_(\u0014\u0011!tY'NT_M\u0005n\u001c\u001c\u007f", (short) (FB.Xd() ^ 4088), (short) (FB.Xd() ^ 8057)));
            System.out.println(C1561oA.Xd("r\u001f\u001d\u0018\u001bV\u001b!\u001f\u001e'0]\n\u0010<:uA~e\u0016\u0013", (short) (Od.Xd() ^ (-16174))));
            System.out.println(Wg.vd("Frpkf\"flbajs\u0019EKw\u000eJ\u0015R1a^", (short) (C1607wl.Xd() ^ 24777)));
            System.out.println("");
            jPAKEParticipant2.validateRound1PayloadReceived(jPAKERound1PayloadCreateRound1PayloadToSend);
            System.out.println(Qg.kd("\u001bG9u8<85<Cn5+GC{Fh\u0004v~c\u0012\r", (short) (C1499aX.Xd() ^ (-3358)), (short) (C1499aX.Xd() ^ (-13573))));
            System.out.println(hg.Vd("&RD\u0001CGC@GNy$(RN\u0006Q~\fp\u001f\u001a", (short) (OY.Xd() ^ 6496), (short) (OY.Xd() ^ 7852)));
            System.out.println(C1561oA.ud("\u001eJ<x;?;8?Fq\u001c JF~Iv\u0004h\u0017\u0012", (short) (C1633zX.Xd() ^ (-7961))));
            System.out.println("");
            JPAKERound2Payload jPAKERound2PayloadCreateRound2PayloadToSend = jPAKEParticipant.createRound2PayloadToSend();
            JPAKERound2Payload jPAKERound2PayloadCreateRound2PayloadToSend2 = jPAKEParticipant2.createRound2PayloadToSend();
            System.out.println(C1561oA.yd("DCBA@?>=LKJI>o\f\u0011xm(9&/.-<;:98765$#\"", (short) (C1607wl.Xd() ^ 8941)));
            System.out.println(strYd);
            System.out.println(C1561oA.Yd("?<", (short) (Od.Xd() ^ (-25196))) + jPAKERound2PayloadCreateRound2PayloadToSend.getA().toString(16));
            PrintStream printStream10 = System.out;
            StringBuilder sbAppend4 = new StringBuilder(Xg.qd("ek\u0018\u0016PI\u0014\u001f_\u001f", (short) (C1499aX.Xd() ^ (-10390)), (short) (C1499aX.Xd() ^ (-17624)))).append(jPAKERound2PayloadCreateRound2PayloadToSend.getKnowledgeProofForX2s()[0].toString(16));
            String strWd = Jg.Wd("T1`", (short) (C1580rY.Xd() ^ (-10225)), (short) (C1580rY.Xd() ^ (-12165)));
            printStream10.println(sbAppend4.append(strWd).append(jPAKERound2PayloadCreateRound2PayloadToSend.getKnowledgeProofForX2s()[1].toString(16)).append(str2).toString());
            System.out.println("");
            System.out.println(ZO.xd("\u000e\u0015o\u001c1CF\fXT[bR]p\u001e;C", (short) (Od.Xd() ^ (-6608)), (short) (Od.Xd() ^ (-23606))));
            System.out.println(C1626yg.Ud(":q", (short) (C1607wl.Xd() ^ 10709), (short) (C1607wl.Xd() ^ HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED)) + jPAKERound2PayloadCreateRound2PayloadToSend2.getA().toString(16));
            PrintStream printStream11 = System.out;
            short sXd11 = (short) (C1633zX.Xd() ^ (-29378));
            int[] iArr8 = new int["n\u001e7(J\u001cu\u001f(J".length()];
            QB qb8 = new QB("n\u001e7(J\u001cu\u001f(J");
            int i9 = 0;
            while (qb8.YK()) {
                int iKK8 = qb8.KK();
                Xu xuXd8 = Xu.Xd(iKK8);
                iArr8[i9] = xuXd8.fK(xuXd8.CK(iKK8) - (C1561oA.Xd[i9 % C1561oA.Xd.length] ^ (sXd11 + i9)));
                i9++;
            }
            printStream11.println(new String(iArr8, 0, i9) + jPAKERound2PayloadCreateRound2PayloadToSend2.getKnowledgeProofForX2s()[0].toString(16) + strWd + jPAKERound2PayloadCreateRound2PayloadToSend2.getKnowledgeProofForX2s()[1].toString(16) + str2);
            System.out.println("");
            jPAKEParticipant.validateRound2PayloadReceived(jPAKERound2PayloadCreateRound2PayloadToSend2);
            System.out.println(EO.Od("^_l\u0004\u0011 }\u0015X9E%\u001cOFN(_ \u001f\u007fv,YLt", (short) (OY.Xd() ^ 374)));
            jPAKEParticipant2.validateRound2PayloadReceived(jPAKERound2PayloadCreateRound2PayloadToSend);
            System.out.println(C1561oA.Qd(",XJ\u0007IMIFMT\u007f*.XT\r\u0004LU\u0011u$\u001f\\", (short) (C1499aX.Xd() ^ (-18926))));
            BigInteger bigIntegerCalculateKeyingMaterial = jPAKEParticipant.calculateKeyingMaterial();
            BigInteger bigIntegerCalculateKeyingMaterial2 = jPAKEParticipant2.calculateKeyingMaterial();
            System.out.println(C1593ug.zd("9:;<=>?@A8Z\u0001\u0010\u0002\u0010>\u0012\u0010\u0017\u0011\bDWFQRSTUVWXYZ[", (short) (OY.Xd() ^ 796), (short) (OY.Xd() ^ 3218)));
            System.out.println(C1561oA.od("p\u001b\u0017\u0010\u0011J\r\u0018\u0015\u0017\u001b\u0019\t\u0016A\f\u0005\u0018=\n|\u000f~\u000b\u0001w\u00024\u001c2\\M", (short) (C1607wl.Xd() ^ 15378)) + bigIntegerCalculateKeyingMaterial.toString(16));
            System.out.println(C1561oA.Kd("Drf%ivuy\u007f\u007fq\u0001.zu\u000b2\u0001u\n{\n\u0002z\u0007;%=i\\", (short) (C1633zX.Xd() ^ (-4259))) + bigIntegerCalculateKeyingMaterial2.toString(16));
            System.out.println();
            deriveSessionKey(bigIntegerCalculateKeyingMaterial);
            deriveSessionKey(bigIntegerCalculateKeyingMaterial2);
            JPAKERound3Payload jPAKERound3PayloadCreateRound3PayloadToSend = jPAKEParticipant.createRound3PayloadToSend(bigIntegerCalculateKeyingMaterial);
            JPAKERound3Payload jPAKERound3PayloadCreateRound3PayloadToSend2 = jPAKEParticipant2.createRound3PayloadToSend(bigIntegerCalculateKeyingMaterial2);
            PrintStream printStream12 = System.out;
            short sXd12 = (short) (C1607wl.Xd() ^ 11924);
            short sXd13 = (short) (C1607wl.Xd() ^ 16615);
            int[] iArr9 = new int["`X=$\u0007ifC0\u0013ulG\\dI\u001f\u001660\u007flhI2\u0013ypS<!\u0002\\]B".length()];
            QB qb9 = new QB("`X=$\u0007ifC0\u0013ulG\\dI\u001f\u001660\u007flhI2\u0013ypS<!\u0002\\]B");
            int i10 = 0;
            while (qb9.YK()) {
                int iKK9 = qb9.KK();
                Xu xuXd9 = Xu.Xd(iKK9);
                iArr9[i10] = xuXd9.fK(((i10 * sXd13) ^ sXd12) + xuXd9.CK(iKK9));
                i10++;
            }
            printStream12.println(new String(iArr9, 0, i10));
            System.out.println(strYd);
            PrintStream printStream13 = System.out;
            short sXd14 = (short) (FB.Xd() ^ 29528);
            int[] iArr10 = new int["q\u0007\n{\n\u0011g".length()];
            QB qb10 = new QB("q\u0007\n{\n\u0011g");
            int i11 = 0;
            while (qb10.YK()) {
                int iKK10 = qb10.KK();
                Xu xuXd10 = Xu.Xd(iKK10);
                iArr10[i11] = xuXd10.fK(xuXd10.CK(iKK10) - (sXd14 + i11));
                i11++;
            }
            String str3 = new String(iArr10, 0, i11);
            printStream13.println(str3 + jPAKERound3PayloadCreateRound3PayloadToSend.getMacTag().toString(16));
            System.out.println("");
            System.out.println(strOd);
            System.out.println(str3 + jPAKERound3PayloadCreateRound3PayloadToSend2.getMacTag().toString(16));
            System.out.println("");
            jPAKEParticipant.validateRound3PayloadReceived(jPAKERound3PayloadCreateRound3PayloadToSend2, bigIntegerCalculateKeyingMaterial);
            System.out.println(Wg.vd("\u000e:4/6q28*).7h\u0017(+\u0011\u001f\"u`\u0011\nI", (short) (C1499aX.Xd() ^ (-4439))));
            jPAKEParticipant2.validateRound3PayloadReceived(jPAKERound3PayloadCreateRound3PayloadToSend, bigIntegerCalculateKeyingMaterial2);
            System.out.println(Qg.kd("\u00062$`#'# '.Y\u0006\u0019\u001a\n\u0016\u001blQ\u007fz8", (short) (Od.Xd() ^ (-650)), (short) (Od.Xd() ^ (-27537))));
            System.out.println();
            System.out.println(hg.Vd("atueqv\u0002-\u0003lvrlhzjh/\"uhdpbbjl^\u0018k^Z\u0014^WjY]U\rYL^NZPGQ\u0004PCUCGCP\n", (short) (C1580rY.Xd() ^ (-12691)), (short) (C1580rY.Xd() ^ (-21645))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
