package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class Digest {
    private static final /* synthetic */ Digest[] $VALUES;
    public static final Digest SHA_1;
    public static final Digest SHA_256;
    public static final Digest SHA_512;
    private final String name;
    private final int size;

    public class Exception extends RuntimeException {
    }

    static {
        try {
            short sXd = (short) (C1499aX.Xd() ^ (350729927 ^ (-350729334)));
            short sXd2 = (short) (C1499aX.Xd() ^ ((592105030 ^ 1621261261) ^ (-1139328338)));
            int[] iArr = new int["ipsk;".length()];
            QB qb = new QB("ipsk;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            int i3 = 982678498 ^ 982678496;
            Digest digest = new Digest(CipherHelperImp.AnonymousClass2.concat(i3, new String(iArr, 0, i2)), 0, CipherHelperImp.AnonymousClass2.concat(1, C1561oA.ud("sh}CE", (short) (C1499aX.Xd() ^ (1016085003 ^ (-1016100511))))), (1837961830 ^ 749195500) ^ 1093321258);
            SHA_1 = digest;
            String strEquals = BuildConfig.AnonymousClass1.equals(C1561oA.yd("ZQD`;>o", (short) (Od.Xd() ^ (2107042895 ^ (-2107022128)))), 832777689 ^ 832777690);
            short sXd3 = (short) (C1580rY.Xd() ^ ((467196109 ^ 2129019364) ^ (-1698602660)));
            int[] iArr2 = new int["\n~wah\"!".length()];
            QB qb2 = new QB("\n~wah\"!");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i4));
                i4++;
            }
            Digest digest2 = new Digest(strEquals, 1, BuildConfig.AnonymousClass1.equals(new String(iArr2, 0, i4), i3), (1198518930 ^ 245310541) ^ 1240520671);
            SHA_256 = digest2;
            String strEquals2 = BuildConfig.AnonymousClass1.equals(Xg.qd(")\u001e\u00173\u000bED", (short) (C1580rY.Xd() ^ ((1068150680 ^ 809975880) ^ (-267238299))), (short) (C1580rY.Xd() ^ ((734308390 ^ 1696581607) ^ (-1323005369)))), i3);
            short sXd4 = (short) (FB.Xd() ^ (759554374 ^ 759548551));
            short sXd5 = (short) (FB.Xd() ^ (493246995 ^ 493234822));
            int[] iArr3 = new int["Sf\u0016U\f|m".length()];
            QB qb3 = new QB("Sf\u0016U\f|m");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((i5 * sXd5) ^ sXd4));
                i5++;
            }
            Digest digest3 = new Digest(strEquals2, i3, CipherHelperImp.AnonymousClass2.concat((206672427 ^ 28924728) ^ 233359639, new String(iArr3, 0, i5)), (530878851 ^ 1783373947) ^ 1978184696);
            SHA_512 = digest3;
            $VALUES = new Digest[]{digest, digest2, digest3};
        } catch (Exception unused) {
        }
    }

    private Digest(String str, int i2, String str2, int i3) {
        this.name = str2;
        this.size = i3;
    }

    public static Digest valueOf(String str) {
        try {
            return (Digest) Enum.valueOf(Digest.class, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Digest[] values() {
        try {
            return (Digest[]) $VALUES.clone();
        } catch (Exception unused) {
            return null;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }
}
