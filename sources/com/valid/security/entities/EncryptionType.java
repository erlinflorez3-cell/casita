package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class EncryptionType {
    private static final /* synthetic */ EncryptionType[] $VALUES;
    public static final EncryptionType AES_CBC;
    public static final EncryptionType AES_GCM;
    public static final EncryptionType DES_CBC;
    public static final EncryptionType DES_ECB;
    public static final EncryptionType RSA_ECB;
    public static final EncryptionType RSA_ECB0AEP_SHA;
    public static final EncryptionType RSA_OAEP;
    public static final EncryptionType RSA_PKCS1;

    public class ParseException extends RuntimeException {
    }

    static {
        try {
            int i2 = (2111013190 ^ 151320604) ^ 1960278361;
            EncryptionType encryptionType = new EncryptionType(BuildConfig.AnonymousClass1.equals(ZO.xd(" Q\u001cG\u0014YP", (short) (C1607wl.Xd() ^ (337174890 ^ 337165050)), (short) (C1607wl.Xd() ^ ((2088734826 ^ 869166752) ^ 1337058168))), i2), 0);
            AES_CBC = encryptionType;
            int i3 = 1037226794 ^ 1037226799;
            EncryptionType encryptionType2 = new EncryptionType(CipherHelperImp.AnonymousClass2.concat(i3, C1626yg.Ud("\u0016dWL\u0011X3", (short) (Od.Xd() ^ ((775853919 ^ 719041952) ^ (-82138188))), (short) (Od.Xd() ^ (17683007 ^ (-17693567))))), 1);
            AES_GCM = encryptionType2;
            int i4 = (1988040965 ^ 175278216) ^ 2081264015;
            EncryptionType encryptionType3 = new EncryptionType(BuildConfig.AnonymousClass1.equals(Ig.wd("`96mt\u001e_\u0012{-%9jjt", (short) (ZN.Xd() ^ (1329130230 ^ 1329107065))), i2), i4);
            RSA_ECB0AEP_SHA = encryptionType3;
            EncryptionType encryptionType4 = new EncryptionType(BuildConfig.AnonymousClass1.equals(EO.Od("n9yxw\u001b \to", (short) (ZN.Xd() ^ ((1295056244 ^ 772103162) ^ 1664461491))), i3), i2);
            RSA_PKCS1 = encryptionType4;
            int i5 = 1972552722 ^ 1972552726;
            EncryptionType encryptionType5 = new EncryptionType(CipherHelperImp.AnonymousClass2.concat(1, C1561oA.Qd("5@@84ޖp", (short) (C1607wl.Xd() ^ (2018556632 ^ 2018558642)))), i5);
            RSA_ECB = encryptionType5;
            EncryptionType encryptionType6 = new EncryptionType(BuildConfig.AnonymousClass1.equals(C1593ug.zd("\u0003}q\u000e\u007fOM@", (short) (Od.Xd() ^ (1019884299 ^ (-1019875908))), (short) (Od.Xd() ^ (2009584967 ^ (-2009591143)))), i4), i3);
            RSA_OAEP = encryptionType6;
            short sXd = (short) (Od.Xd() ^ (535392064 ^ (-535364727)));
            int[] iArr = new int["\t\b\u001a\u001e\u0002\u0001\u0002".length()];
            QB qb = new QB("\t\b\u001a\u001e\u0002\u0001\u0002");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(sXd + sXd + i6 + xuXd.CK(iKK));
                i6++;
            }
            EncryptionType encryptionType7 = new EncryptionType(BuildConfig.AnonymousClass1.equals(new String(iArr, 0, i6), i3), (1009529654 ^ 1353312149) ^ 1820710053);
            DES_CBC = encryptionType7;
            EncryptionType encryptionType8 = new EncryptionType(CipherHelperImp.AnonymousClass2.concat(i5, C1561oA.Kd("\u000f&\u001c$.Wd", (short) (Od.Xd() ^ (581594827 ^ (-581598861))))), (1432551797 ^ 1251020367) ^ 535957309);
            DES_ECB = encryptionType8;
            $VALUES = new EncryptionType[]{encryptionType, encryptionType2, encryptionType3, encryptionType4, encryptionType5, encryptionType6, encryptionType7, encryptionType8};
        } catch (ParseException unused) {
        }
    }

    private EncryptionType(String str, int i2) {
    }

    public static EncryptionType valueOf(String str) {
        try {
            return (EncryptionType) Enum.valueOf(EncryptionType.class, str);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static EncryptionType[] values() {
        try {
            return (EncryptionType[]) $VALUES.clone();
        } catch (ParseException unused) {
            return null;
        }
    }
}
