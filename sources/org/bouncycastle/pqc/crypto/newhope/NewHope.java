package org.bouncycastle.pqc.crypto.newhope;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
class NewHope {
    public static final int AGREEMENT_SIZE = 32;
    public static final int POLY_SIZE = 1024;
    public static final int SENDA_BYTES = 1824;
    public static final int SENDB_BYTES = 2048;
    private static final boolean STATISTICAL_TEST = false;

    NewHope() {
    }

    static void decodeA(short[] sArr, byte[] bArr, byte[] bArr2) {
        Poly.fromBytes(sArr, bArr2);
        System.arraycopy(bArr2, 1792, bArr, 0, 32);
    }

    static void decodeB(short[] sArr, short[] sArr2, byte[] bArr) {
        Poly.fromBytes(sArr, bArr);
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2 * 4;
            byte b2 = bArr[i2 + 1792];
            int i4 = b2 & 255;
            sArr2[i3] = (short) (b2 & 3);
            int i5 = i4 >>> 2;
            sArr2[i3 + 1] = (short) ((i5 + 3) - (i5 | 3));
            sArr2[i3 + 2] = (short) ((i4 >>> 4) & 3);
            sArr2[i3 + 3] = (short) (i4 >>> 6);
        }
    }

    static void encodeA(byte[] bArr, short[] sArr, byte[] bArr2) {
        Poly.toBytes(bArr, sArr);
        System.arraycopy(bArr2, 0, bArr, 1792, 32);
    }

    static void encodeB(byte[] bArr, short[] sArr, short[] sArr2) {
        Poly.toBytes(bArr, sArr);
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2 * 4;
            int i4 = (-1) - (((-1) - ((-1) - (((-1) - sArr2[i3]) & ((-1) - (sArr2[i3 + 1] << 2))))) & ((-1) - (sArr2[i3 + 2] << 4)));
            int i5 = sArr2[i3 + 3] << 6;
            bArr[i2 + 1792] = (byte) ((i5 + i4) - (i5 & i4));
        }
    }

    static void generateA(short[] sArr, byte[] bArr) {
        Poly.uniform(sArr, bArr);
    }

    public static void keygen(SecureRandom secureRandom, byte[] bArr, short[] sArr) throws Throwable {
        byte[] bArr2 = new byte[32];
        Object[] objArr = {bArr2};
        Method method = Class.forName(Wg.Zd("T,%x\u0007)rEiV\"#|\u001d+C\u0011\u0004F\u001enZ\u001ewg3", (short) (OY.Xd() ^ 23555), (short) (OY.Xd() ^ 23211))).getMethod(C1561oA.Xd("D<PM\u001cTPBQ", (short) (Od.Xd() ^ (-18391))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            short[] sArr2 = new short[1024];
            generateA(sArr2, bArr2);
            byte[] bArr3 = new byte[32];
            Object[] objArr2 = {bArr3};
            Method method2 = Class.forName(Wg.vd("( 2\u001eo6%$;9-9Cx\u001b.\u0011$\u001e\u0012\u0004\u0014\u001e\u0015%$", (short) (C1607wl.Xd() ^ 31287))).getMethod(Qg.kd("\u0018\u000e \u001bg\u001e\u0018\b\u0015", (short) (C1607wl.Xd() ^ 3406), (short) (C1607wl.Xd() ^ 18972)), byte[].class);
            try {
                method2.setAccessible(true);
                method2.invoke(secureRandom, objArr2);
                Poly.getNoise(sArr, bArr3, (byte) 0);
                Poly.toNTT(sArr);
                short[] sArr3 = new short[1024];
                Poly.getNoise(sArr3, bArr3, (byte) 1);
                Poly.toNTT(sArr3);
                short[] sArr4 = new short[1024];
                Poly.pointWise(sArr2, sArr, sArr4);
                short[] sArr5 = new short[1024];
                Poly.add(sArr4, sArr3, sArr5);
                encodeA(bArr, sArr5, bArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static void sha3(byte[] bArr) {
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        sHA3Digest.update(bArr, 0, 32);
        sHA3Digest.doFinal(bArr, 0);
    }

    public static void sharedA(byte[] bArr, short[] sArr, byte[] bArr2) {
        short[] sArr2 = new short[1024];
        short[] sArr3 = new short[1024];
        decodeB(sArr2, sArr3, bArr2);
        short[] sArr4 = new short[1024];
        Poly.pointWise(sArr, sArr2, sArr4);
        Poly.fromNTT(sArr4);
        ErrorCorrection.rec(bArr, sArr4, sArr3);
        sha3(bArr);
    }

    public static void sharedB(SecureRandom secureRandom, byte[] bArr, byte[] bArr2, byte[] bArr3) throws Throwable {
        short[] sArr = new short[1024];
        byte[] bArr4 = new byte[32];
        decodeA(sArr, bArr4, bArr3);
        short[] sArr2 = new short[1024];
        generateA(sArr2, bArr4);
        byte[] bArr5 = new byte[32];
        short sXd = (short) (ZN.Xd() ^ 30197);
        short sXd2 = (short) (ZN.Xd() ^ 30256);
        int[] iArr = new int["{q\u0006o;\u007fpm~zpz~2VgduqcO]i^he".length()];
        QB qb = new QB("{q\u0006o;\u007fpm~zpz~2VgduqcO]i^he");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Object[] objArr = {bArr5};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("QGYT!WQAN", (short) (C1633zX.Xd() ^ (-19839))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            short[] sArr3 = new short[1024];
            Poly.getNoise(sArr3, bArr5, (byte) 0);
            Poly.toNTT(sArr3);
            short[] sArr4 = new short[1024];
            Poly.getNoise(sArr4, bArr5, (byte) 1);
            Poly.toNTT(sArr4);
            short[] sArr5 = new short[1024];
            Poly.pointWise(sArr2, sArr3, sArr5);
            Poly.add(sArr5, sArr4, sArr5);
            short[] sArr6 = new short[1024];
            Poly.pointWise(sArr, sArr3, sArr6);
            Poly.fromNTT(sArr6);
            short[] sArr7 = new short[1024];
            Poly.getNoise(sArr7, bArr5, (byte) 2);
            Poly.add(sArr6, sArr7, sArr6);
            short[] sArr8 = new short[1024];
            ErrorCorrection.helpRec(sArr8, sArr6, bArr5, (byte) 3);
            encodeB(bArr2, sArr5, sArr8);
            ErrorCorrection.rec(bArr, sArr6, sArr8);
            sha3(bArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
