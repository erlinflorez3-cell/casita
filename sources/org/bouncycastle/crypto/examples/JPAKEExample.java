package org.bouncycastle.crypto.examples;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup;
import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroups;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound2Payload;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound3Payload;
import org.bouncycastle.crypto.digests.SHA256Digest;
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

/* JADX INFO: loaded from: classes6.dex */
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
        System.out.println(C1561oA.yd("\u0006\u0005\u0004\u0003\n\t\b\u0007}r\u001b?AK?6XTdJdX][\u0004\r\f\u000b\u0012\u0011\u0010\u000fedc", (short) (OY.Xd() ^ 24387)));
        System.out.println(C1561oA.Yd("o\u0016\u0004\u000f\r\bE\u0017\t\u001b\u000b\u0018\u0011!\u0013!#P\u0018\"&T*\u001f\u001dX\u001d4\u001f)'\"_(4295\u007f", (short) (ZN.Xd() ^ 5109)));
        PrintStream printStream = System.out;
        StringBuilder sbAppend = new StringBuilder(Xg.qd("\u001dMV", (short) (C1580rY.Xd() ^ (-6040)), (short) (C1580rY.Xd() ^ (-27887)))).append(p2.bitLength());
        String strWd = Jg.Wd("f\u0013{p`\u007frC", (short) (C1633zX.Xd() ^ (-16847)), (short) (C1633zX.Xd() ^ (-28191)));
        printStream.println(sbAppend.append(strWd).append(p2.toString(16)).toString());
        System.out.println(ZO.xd("\\\\3", (short) (C1499aX.Xd() ^ (-1589)), (short) (C1499aX.Xd() ^ (-10484))) + q2.bitLength() + strWd + q2.toString(16));
        PrintStream printStream2 = System.out;
        short sXd = (short) (C1499aX.Xd() ^ (-17980));
        short sXd2 = (short) (C1499aX.Xd() ^ (-22986));
        int[] iArr = new int["\u0012\u0016>".length()];
        QB qb = new QB("\u0012\u0016>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        printStream2.println(new String(iArr, 0, i2) + p2.bitLength() + strWd + g2.toString(16));
        System.out.println(Ig.wd("\u0003am\b\r#PO98", (short) (FB.Xd() ^ 21157)) + p2.mod(q2).toString(16));
        System.out.println(EO.Od("$R\u0014#\nq%p9qZ2~U", (short) (C1607wl.Xd() ^ 13513)) + g2.modPow(q2, p2).toString(16));
        System.out.println("");
        System.out.println(C1561oA.Qd("\u0003->;I;IsC3DCF=?0>i>;,*d&<a\u0002,(!\"[\u001c(\u001dWx%\u0017mRS!\u0011\"!$\u001b\u001d\u000eJG\b\u0014\tCD\u0012\u0002\u0013\u0012\u0015\f\u000e~;A!", (short) (Od.Xd() ^ (-20673))));
        SHA256Digest sHA256Digest = new SHA256Digest();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1593ug.zd("*\"8$q8+*=;3?Ez!43FD8&6D;GF", (short) (OY.Xd() ^ 3299), (short) (OY.Xd() ^ 25008))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            String strOd = C1561oA.od("w\u0002}vw", (short) (C1607wl.Xd() ^ 23098));
            String strKd = C1561oA.Kd("H:MNSLPC", (short) (FB.Xd() ^ 32378));
            JPAKEParticipant jPAKEParticipant = new JPAKEParticipant(strOd, strKd.toCharArray(), jPAKEPrimeOrderGroup, sHA256Digest, secureRandom);
            short sXd3 = (short) (C1580rY.Xd() ^ (-212));
            short sXd4 = (short) (C1580rY.Xd() ^ (-20918));
            int[] iArr2 = new int["ke\u0006".length()];
            QB qb2 = new QB("ke\u0006");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                i3++;
            }
            JPAKEParticipant jPAKEParticipant2 = new JPAKEParticipant(new String(iArr2, 0, i3), strKd.toCharArray(), jPAKEPrimeOrderGroup, sHA256Digest, secureRandom);
            JPAKERound1Payload jPAKERound1PayloadCreateRound1PayloadToSend = jPAKEParticipant.createRound1PayloadToSend();
            JPAKERound1Payload jPAKERound1PayloadCreateRound1PayloadToSend2 = jPAKEParticipant2.createRound1PayloadToSend();
            System.out.println(C1561oA.Xd("\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u000eA_f`W\u0014&\u0016!\"#$%&'()*+,-.", (short) (FB.Xd() ^ 16432)));
            PrintStream printStream3 = System.out;
            short sXd5 = (short) (C1607wl.Xd() ^ 14618);
            int[] iArr3 = new int["+UQJK\u0005WHPES~RL{\u001dI;\u0012v".length()];
            QB qb3 = new QB("+UQJK\u0005WHPES~RL{\u001dI;\u0012v");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd5 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            String str = new String(iArr3, 0, i4);
            printStream3.println(str);
            System.out.println(Qg.kd("LB^Z\u0012]\u001c", (short) (ZN.Xd() ^ 13625), (short) (ZN.Xd() ^ 26981)) + jPAKERound1PayloadCreateRound1PayloadToSend.getGx1().toString(16));
            System.out.println(hg.Vd("dZvr+u4", (short) (C1607wl.Xd() ^ 29102), (short) (C1607wl.Xd() ^ 17276)) + jPAKERound1PayloadCreateRound1PayloadToSend.getGx2().toString(16));
            PrintStream printStream4 = System.out;
            StringBuilder sbAppend2 = new StringBuilder(C1561oA.ud("/3]Y\u0011\\\u001bX", (short) (C1580rY.Xd() ^ (-1253)))).append(jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX1()[0].toString(16));
            String strYd = C1561oA.yd("\u001e\\\u001a", (short) (C1499aX.Xd() ^ (-5934)));
            StringBuilder sbAppend3 = sbAppend2.append(strYd).append(jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX1()[1].toString(16));
            String strYd2 = C1561oA.Yd("#", (short) (C1580rY.Xd() ^ (-25956)));
            printStream4.println(sbAppend3.append(strYd2).toString());
            System.out.println(Xg.qd("\u0007\r97q>~>", (short) (ZN.Xd() ^ 21395), (short) (ZN.Xd() ^ 8500)) + jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX2()[0].toString(16) + strYd + jPAKERound1PayloadCreateRound1PayloadToSend.getKnowledgeProofForX2()[1].toString(16) + strYd2);
            System.out.println("");
            PrintStream printStream5 = System.out;
            String strWd2 = Jg.Wd("\u001b<3R&6C\u001b2\u0002T/a'PE!'\u001b~", (short) (C1607wl.Xd() ^ 31064), (short) (C1607wl.Xd() ^ 28770));
            printStream5.println(strWd2);
            PrintStream printStream6 = System.out;
            short sXd6 = (short) (OY.Xd() ^ 17354);
            short sXd7 = (short) (OY.Xd() ^ 15271);
            int[] iArr4 = new int["!|\u000eLk5y".length()];
            QB qb4 = new QB("!|\u000eLk5y");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd7) + sXd6)));
                i5++;
            }
            printStream6.println(new String(iArr4, 0, i5) + jPAKERound1PayloadCreateRound1PayloadToSend2.getGx1().toString(16));
            System.out.println(C1626yg.Ud("\u0002G TlI;", (short) (C1499aX.Xd() ^ (-22173)), (short) (C1499aX.Xd() ^ (-22422))) + jPAKERound1PayloadCreateRound1PayloadToSend2.getGx2().toString(16));
            System.out.println(Ig.wd("l#:\u001aRoe\u0012", (short) (ZN.Xd() ^ 3530)) + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX1()[0].toString(16) + strYd + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX1()[1].toString(16) + strYd2);
            System.out.println(EO.Od("\rB\u001c50Fmt", (short) (Od.Xd() ^ (-32479))) + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX2()[0].toString(16) + strYd + jPAKERound1PayloadCreateRound1PayloadToSend2.getKnowledgeProofForX2()[1].toString(16) + strYd2);
            System.out.println("");
            jPAKEParticipant.validateRound1PayloadReceived(jPAKERound1PayloadCreateRound1PayloadToSend2);
            System.out.println(C1561oA.Qd("\u007f*&\u001f Y\u001c \u001c\u0019 'R\u0019\u000f+'a*LgZbGup", (short) (OY.Xd() ^ 24315)));
            System.out.println(C1593ug.zd("U\u0002\u007fz}9}\u0004\u0002\u0001\n\u0013@lr\u001f\u001dX$aHxu", (short) (C1580rY.Xd() ^ (-11083)), (short) (C1580rY.Xd() ^ (-14311))));
            System.out.println(C1561oA.od("Kuqjk%gkgdkr\u001eHLvr-u1\u0016D?", (short) (C1607wl.Xd() ^ 142)));
            System.out.println("");
            jPAKEParticipant2.validateRound1PayloadReceived(jPAKERound1PayloadCreateRound1PayloadToSend);
            System.out.println(C1561oA.Kd(";i]\u001c`fdclu#kc\u0002\u007f:\u0007+H=G.^[", (short) (C1580rY.Xd() ^ (-27042))));
            System.out.println(Wg.Zd("I\u0007E\u001a+<~\n]}u0z2|Jb!rgdt", (short) (OY.Xd() ^ 23227), (short) (OY.Xd() ^ 22616)));
            PrintStream printStream7 = System.out;
            short sXd8 = (short) (C1580rY.Xd() ^ (-2937));
            int[] iArr5 = new int["g\u0016\nH\r\u0013\u0011\u0010\u0019\"O{\u0002.,f3bqX\t\u0006".length()];
            QB qb5 = new QB("g\u0016\nH\r\u0013\u0011\u0010\u0019\"O{\u0002.,f3bqX\t\u0006");
            int i6 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (sXd8 + i6));
                i6++;
            }
            printStream7.println(new String(iArr5, 0, i6));
            System.out.println("");
            JPAKERound2Payload jPAKERound2PayloadCreateRound2PayloadToSend = jPAKEParticipant.createRound2PayloadToSend();
            JPAKERound2Payload jPAKERound2PayloadCreateRound2PayloadToSend2 = jPAKEParticipant2.createRound2PayloadToSend();
            System.out.println(Wg.vd("\u0010\u000f\u0012\u0011\f\u000b\u000e\r\b\u0007\n\ty+KPdY\u0018)\u0012\u001b\u001e\u001d\u0018\u0017\u001a\u0019\u0014\u0013\u0016\u00150/2", (short) (Od.Xd() ^ (-14553))));
            System.out.println(str);
            System.out.println(Qg.kd("\u0006\u0001", (short) (C1607wl.Xd() ^ 26084), (short) (C1607wl.Xd() ^ 12790)) + jPAKERound2PayloadCreateRound2PayloadToSend.getA().toString(16));
            PrintStream printStream8 = System.out;
            StringBuilder sbAppend4 = new StringBuilder(hg.Vd("\u0012\u0016@<tk4={9", (short) (OY.Xd() ^ 8833), (short) (OY.Xd() ^ 13292))).append(jPAKERound2PayloadCreateRound2PayloadToSend.getKnowledgeProofForX2s()[0].toString(16));
            String strUd = C1561oA.ud("W\u0005S", (short) (FB.Xd() ^ 16762));
            printStream8.println(sbAppend4.append(strUd).append(jPAKERound2PayloadCreateRound2PayloadToSend.getKnowledgeProofForX2s()[1].toString(16)).append(strYd2).toString());
            System.out.println("");
            System.out.println(C1561oA.yd("Jxh'wjpg\u00041\u0003~,Nvt[^", (short) (C1633zX.Xd() ^ (-31971))));
            System.out.println(C1561oA.Yd("JF", (short) (C1633zX.Xd() ^ (-16727))) + jPAKERound2PayloadCreateRound2PayloadToSend2.getA().toString(16));
            System.out.println(Xg.qd("\f\u0012><xo:E\u0006E", (short) (C1499aX.Xd() ^ (-15760)), (short) (C1499aX.Xd() ^ (-82))) + jPAKERound2PayloadCreateRound2PayloadToSend2.getKnowledgeProofForX2s()[0].toString(16) + strUd + jPAKERound2PayloadCreateRound2PayloadToSend2.getKnowledgeProofForX2s()[1].toString(16) + strYd2);
            System.out.println("");
            jPAKEParticipant.validateRound2PayloadReceived(jPAKERound2PayloadCreateRound2PayloadToSend2);
            System.out.println(Jg.Wd("KU\nz4-($X\u0015TS7!]\u007f4N?@A|Y@3p", (short) (FB.Xd() ^ 25055), (short) (FB.Xd() ^ 25404)));
            jPAKEParticipant2.validateRound2PayloadReceived(jPAKERound2PayloadCreateRound2PayloadToSend);
            System.out.println(ZO.xd("bL/z[3\u007f1\"\u0007\u0015nil/\u0015CF ]C2.\u0003", (short) (C1607wl.Xd() ^ 8029), (short) (C1607wl.Xd() ^ 4925)));
            BigInteger bigIntegerCalculateKeyingMaterial = jPAKEParticipant.calculateKeyingMaterial();
            BigInteger bigIntegerCalculateKeyingMaterial2 = jPAKEParticipant2.calculateKeyingMaterial();
            System.out.println(C1626yg.Ud("S\u0002\\5d @w(G\u0016YF2<I\r\u000es\u001d38s!Eah\u0016\u0014[)t\u0005\u001d_", (short) (C1633zX.Xd() ^ (-20599)), (short) (C1633zX.Xd() ^ (-14168))));
            System.out.println(Ig.wd("}_N!jgWc2\u0012\u001dy??OyV\u0005R\u0018M\u0018/8`\\\tc\u0007/\u0007\u0016", (short) (Od.Xd() ^ (-11803))) + bigIntegerCalculateKeyingMaterial.toString(16));
            System.out.println(EO.Od("+\u0013s\u0012<\r7:\u0016YL4+l\u001b\n\\8d G|UI;zB\u0002#C", (short) (C1580rY.Xd() ^ (-26621))) + bigIntegerCalculateKeyingMaterial2.toString(16));
            System.out.println();
            deriveSessionKey(bigIntegerCalculateKeyingMaterial);
            deriveSessionKey(bigIntegerCalculateKeyingMaterial2);
            JPAKERound3Payload jPAKERound3PayloadCreateRound3PayloadToSend = jPAKEParticipant.createRound3PayloadToSend(bigIntegerCalculateKeyingMaterial);
            JPAKERound3Payload jPAKERound3PayloadCreateRound3PayloadToSend2 = jPAKEParticipant2.createRound3PayloadToSend(bigIntegerCalculateKeyingMaterial2);
            System.out.println(C1561oA.Qd("BA@?>=<;:987,]y~vk&8$-,+*)('&%$#\"! ", (short) (C1499aX.Xd() ^ (-9832))));
            System.out.println(str);
            PrintStream printStream9 = System.out;
            String strZd = C1593ug.zd("v\f\u000f\u0001\u000f\u0016l", (short) (C1499aX.Xd() ^ (-13394)), (short) (C1499aX.Xd() ^ (-29191)));
            printStream9.println(strZd + jPAKERound3PayloadCreateRound3PayloadToSend.getMacTag().toString(16));
            System.out.println("");
            System.out.println(strWd2);
            System.out.println(strZd + jPAKERound3PayloadCreateRound3PayloadToSend2.getMacTag().toString(16));
            System.out.println("");
            jPAKEParticipant.validateRound3PayloadReceived(jPAKERound3PayloadCreateRound3PayloadToSend2, bigIntegerCalculateKeyingMaterial);
            System.out.println(C1561oA.od("Oyuno)kokhov\"NabR^c5\u001aHC\u0001", (short) (C1499aX.Xd() ^ (-31407))));
            jPAKEParticipant2.validateRound3PayloadReceived(jPAKERound3PayloadCreateRound3PayloadToSend, bigIntegerCalculateKeyingMaterial2);
            System.out.println(C1561oA.Kd("\u0014B6t9?=<EN{*?B4BI\u001d\u000441p", (short) (C1580rY.Xd() ^ (-7370))));
            System.out.println();
            System.out.println(Wg.Zd(">L0\u001b\niw}6\u001b\b\u0001]6K\u0016v8\u000e\\2\t\u0016jEP+\u007f4jX7M\u001bndN5(DkaN\u001f.~X]r:\u0010zkJ+3O", (short) (C1499aX.Xd() ^ (-8595)), (short) (C1499aX.Xd() ^ (-25120))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
