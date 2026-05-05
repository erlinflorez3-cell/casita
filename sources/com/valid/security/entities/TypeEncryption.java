package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeEncryption {
    private static final /* synthetic */ TypeEncryption[] $VALUES;
    public static final TypeEncryption AES_CBC;
    public static final TypeEncryption AES_GCM;
    public static final TypeEncryption DES_CBC;
    public static final TypeEncryption DES_ECB;
    public static final TypeEncryption RSA_ECB;
    public static final TypeEncryption RSA_ECB0AEP_SHA;
    public static final TypeEncryption RSA_OAEP;
    public static final TypeEncryption RSA_PKCS1;

    public class ParseException extends RuntimeException {
    }

    static {
        try {
            int i2 = (589715212 ^ 157006031) ^ 712896449;
            TypeEncryption typeEncryption = new TypeEncryption(CipherHelperImp.AnonymousClass2.concat(i2, Wg.Zd("OO\u007fo%'V", (short) (FB.Xd() ^ ((2023646107 ^ 1929111102) ^ 174443954)), (short) (FB.Xd() ^ (1786842561 ^ 1786839841)))), 0);
            AES_CBC = typeEncryption;
            int i3 = (1428814742 ^ 259963421) ^ 1515667855;
            TypeEncryption typeEncryption2 = new TypeEncryption(BuildConfig.AnonymousClass1.equals(C1561oA.Xd("`Zrxb`l", (short) (OY.Xd() ^ ((1182286344 ^ 397549853) ^ 1372206752))), i3), 1);
            AES_GCM = typeEncryption2;
            TypeEncryption typeEncryption3 = new TypeEncryption(BuildConfig.AnonymousClass1.equals(Wg.vd("\u0013\f\u0002\u001c\u0006[^/QQ@;CVQ", (short) (C1607wl.Xd() ^ (1037689102 ^ 1037673666))), i2), i2);
            RSA_ECB0AEP_SHA = typeEncryption3;
            short sXd = (short) (FB.Xd() ^ (982163545 ^ 982185247));
            short sXd2 = (short) (FB.Xd() ^ (1975509987 ^ 1975508867));
            int[] iArr = new int["dOO_V\u0017!\u001b\b".length()];
            QB qb = new QB("dOO_V\u0017!\u001b\b");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                i4++;
            }
            int i5 = 296915104 ^ 296915109;
            int i6 = (1395011861 ^ 514712201) ^ 1301009311;
            TypeEncryption typeEncryption4 = new TypeEncryption(CipherHelperImp.AnonymousClass2.concat(i5, new String(iArr, 0, i4)), i6);
            RSA_PKCS1 = typeEncryption4;
            TypeEncryption typeEncryption5 = new TypeEncryption(CipherHelperImp.AnonymousClass2.concat(i6, hg.Vd("\"\r)\u001d%LU", (short) (C1607wl.Xd() ^ (1946747690 ^ 1946769265)), (short) (C1607wl.Xd() ^ (1692474269 ^ 1692474042)))), i3);
            RSA_ECB = typeEncryption5;
            TypeEncryption typeEncryption6 = new TypeEncryption(CipherHelperImp.AnonymousClass2.concat(i5, C1561oA.ud("U@@PR\u0002\f\u000b", (short) (C1499aX.Xd() ^ ((816757661 ^ 1440082258) ^ (-1702566266))))), i5);
            RSA_OAEP = typeEncryption6;
            TypeEncryption typeEncryption7 = new TypeEncryption(BuildConfig.AnonymousClass1.equals(C1561oA.yd("v{\n\u0016uNQ", (short) (C1580rY.Xd() ^ (779707638 ^ (-779710558)))), i2), (351368839 ^ 675611725) ^ 1018458828);
            DES_CBC = typeEncryption7;
            TypeEncryption typeEncryption8 = new TypeEncryption(CipherHelperImp.AnonymousClass2.concat(1, C1561oA.Yd("\u0002\u0007\r\u0015\u0013ւS", (short) (ZN.Xd() ^ ((1174582816 ^ 1062862569) ^ 2036019978)))), 257038051 ^ 257038052);
            DES_ECB = typeEncryption8;
            $VALUES = new TypeEncryption[]{typeEncryption, typeEncryption2, typeEncryption3, typeEncryption4, typeEncryption5, typeEncryption6, typeEncryption7, typeEncryption8};
        } catch (ParseException unused) {
        }
    }

    private TypeEncryption(String str, int i2) {
    }

    public static TypeEncryption valueOf(String str) {
        try {
            return (TypeEncryption) Enum.valueOf(TypeEncryption.class, str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static TypeEncryption[] values() {
        try {
            return (TypeEncryption[]) $VALUES.clone();
        } catch (ParseException unused) {
            return null;
        }
    }
}
