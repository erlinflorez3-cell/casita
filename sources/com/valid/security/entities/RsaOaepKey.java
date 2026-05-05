package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class RsaOaepKey extends Enum<RsaOaepKey> {
    private static final /* synthetic */ RsaOaepKey[] $VALUES;
    public static final RsaOaepKey RSA_1024_SHA_1;
    public static final RsaOaepKey RSA_1024_SHA_256;
    public static final RsaOaepKey RSA_2048_SHA_1;
    public static final RsaOaepKey RSA_2048_SHA_256;
    public static final RsaOaepKey RSA_2048_SHA_512;
    public static final RsaOaepKey RSA_4096_SHA_1;
    public static final RsaOaepKey RSA_4096_SHA_256;
    public static final RsaOaepKey RSA_4096_SHA_512;
    private final Digest digest;
    private final int keySize;
    private final int maxDataLength;

    public class IOException extends RuntimeException {
    }

    static {
        try {
            int i2 = 148482932 ^ 148483956;
            RsaOaepKey rsaOaepKey = new RsaOaepKey(CipherHelperImp.AnonymousClass2.concat(1, Wg.Zd("c+f\u001fK\u000fx \u00060PO?0", (short) (C1499aX.Xd() ^ (1454249652 ^ (-1454250175))), (short) (C1499aX.Xd() ^ ((972138866 ^ 1717943709) ^ (-1603565965))))), 0, i2, Digest.SHA_1);
            RSA_1024_SHA_1 = rsaOaepKey;
            int i3 = 710086681 ^ 710086683;
            RsaOaepKey rsaOaepKey2 = new RsaOaepKey(BuildConfig.AnonymousClass1.equals(C1561oA.Xd("ID8T(gec}\u0004\u000f\u0016\u0006ede", (short) (C1633zX.Xd() ^ (792779986 ^ (-792786354)))), i3), 1, i2, Digest.SHA_256);
            RSA_1024_SHA_256 = rsaOaepKey2;
            int i4 = 1338369764 ^ 1338369767;
            int i5 = 763041580 ^ 763043628;
            RsaOaepKey rsaOaepKey3 = new RsaOaepKey(BuildConfig.AnonymousClass1.equals(Wg.vd("on\\vOK\n\u0004\".5<*\r", (short) (C1499aX.Xd() ^ (1370648682 ^ (-1370635256)))), i4), i3, i5, Digest.SHA_1);
            RSA_2048_SHA_1 = rsaOaepKey3;
            short sXd = (short) (C1580rY.Xd() ^ ((529768818 ^ 1174874682) ^ (-1502919991)));
            short sXd2 = (short) (C1580rY.Xd() ^ ((1437698399 ^ 1394188534) ^ (-111697494)));
            int[] iArr = new int["VaaY&tdd\u0013\u0001HK;2%j".length()];
            QB qb = new QB("VaaY&tdd\u0013\u0001HK;2%j");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(((sXd + i6) + xuXd.CK(iKK)) - sXd2);
                i6++;
            }
            RsaOaepKey rsaOaepKey4 = new RsaOaepKey(CipherHelperImp.AnonymousClass2.concat(1, new String(iArr, 0, i6)), i4, i5, Digest.SHA_256);
            RSA_2048_SHA_256 = rsaOaepKey4;
            short sXd3 = (short) (Od.Xd() ^ ((140117474 ^ 653299010) ^ (-782951174)));
            short sXd4 = (short) (Od.Xd() ^ ((956721444 ^ 85094238) ^ (-1007947070)));
            int[] iArr2 = new int["\u0016\u0015\u0003\u0019mmoqĈDKR8#\u001b\u001c".length()];
            QB qb2 = new QB("\u0016\u0015\u0003\u0019mmoqĈDKR8#\u001b\u001c");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK(sXd3 + i7 + xuXd2.CK(iKK2) + sXd4);
                i7++;
            }
            int i8 = (503353511 ^ 397051986) ^ 162142448;
            int i9 = 1064636951 ^ 1064636947;
            RsaOaepKey rsaOaepKey5 = new RsaOaepKey(BuildConfig.AnonymousClass1.equals(new String(iArr2, 0, i7), i8), i9, i5, Digest.SHA_512);
            RSA_2048_SHA_512 = rsaOaepKey5;
            short sXd5 = (short) (C1580rY.Xd() ^ ((715560654 ^ 93162867) ^ (-791368416)));
            int[] iArr3 = new int["\u0019\n\"\u001af7*)SI\u000b\u0010{w".length()];
            QB qb3 = new QB("\u0019\n\"\u001af7*)SI\u000b\u0010{w");
            int i10 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i10] = xuXd3.fK(sXd5 + i10 + xuXd3.CK(iKK3));
                i10++;
            }
            int i11 = 1665497422 ^ 1665493326;
            RsaOaepKey rsaOaepKey6 = new RsaOaepKey(CipherHelperImp.AnonymousClass2.concat(i3, new String(iArr3, 0, i10)), i8, i11, Digest.SHA_1);
            RSA_4096_SHA_1 = rsaOaepKey6;
            RsaOaepKey rsaOaepKey7 = new RsaOaepKey(CipherHelperImp.AnonymousClass2.concat(i9, C1561oA.yd("\u0002l\u0007|S\u001e\u000f\u001c4,ov|[J\u001c", (short) (ZN.Xd() ^ ((336070649 ^ 243419796) ^ 445281667)))), (294232904 ^ 521300382) ^ 245091024, i11, Digest.SHA_256);
            RSA_4096_SHA_256 = rsaOaepKey7;
            RsaOaepKey rsaOaepKey8 = new RsaOaepKey(BuildConfig.AnonymousClass1.equals(C1561oA.Yd("ZUIe<xqv\u000f\u0015 '\u0017syz", (short) (ZN.Xd() ^ ((627647163 ^ 839677960) ^ 392519822))), i3), 188076093 ^ 188076090, i11, Digest.SHA_512);
            RSA_4096_SHA_512 = rsaOaepKey8;
            $VALUES = new RsaOaepKey[]{rsaOaepKey, rsaOaepKey2, rsaOaepKey3, rsaOaepKey4, rsaOaepKey5, rsaOaepKey6, rsaOaepKey7, rsaOaepKey8};
        } catch (IOException unused) {
        }
    }

    private RsaOaepKey(String str, int i2, int i3, Digest digest) {
        super(str, i2);
        this.keySize = i3;
        this.digest = digest;
        this.maxDataLength = (i3 - (digest.getSize() << 1)) / 10;
    }

    public static RsaOaepKey valueOf(int i2, Digest digest) {
        try {
            for (RsaOaepKey rsaOaepKey : values()) {
                if (rsaOaepKey.getKeySize() == i2 && rsaOaepKey.getDigest() == digest) {
                    return rsaOaepKey;
                }
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public static RsaOaepKey valueOf(String str) {
        try {
            return (RsaOaepKey) Enum.valueOf(RsaOaepKey.class, str);
        } catch (IOException unused) {
            return null;
        }
    }

    public static RsaOaepKey[] values() {
        try {
            return (RsaOaepKey[]) $VALUES.clone();
        } catch (IOException unused) {
            return null;
        }
    }

    public Digest getDigest() {
        return this.digest;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getMaxDataLength() {
        return this.maxDataLength;
    }
}
