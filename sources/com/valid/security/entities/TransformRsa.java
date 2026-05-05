package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class TransformRsa {
    private static final /* synthetic */ TransformRsa[] $VALUES;
    public static final TransformRsa ECB;
    public static final TransformRsa ECBOAEP_WITH_SHA;
    public static final TransformRsa OAEP;
    public static final TransformRsa PKCS1;

    public class NullPointerException extends RuntimeException {
    }

    static {
        try {
            short sXd = (short) (C1499aX.Xd() ^ (1630180980 ^ (-1630196256)));
            int[] iArr = new int["\u0002\b\u0001\f}\u0002J;CMFH;?RI".length()];
            QB qb = new QB("\u0002\b\u0001\f}\u0002J;CMFH;?RI");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            int i3 = 1957481862 ^ 1957481861;
            TransformRsa transformRsa = new TransformRsa(BuildConfig.AnonymousClass1.equals(new String(iArr, 0, i2), i3), 0);
            ECBOAEP_WITH_SHA = transformRsa;
            TransformRsa transformRsa2 = new TransformRsa(BuildConfig.AnonymousClass1.equals(C1593ug.zd("YRLV:", (short) (C1633zX.Xd() ^ (932730580 ^ (-932735763))), (short) (C1633zX.Xd() ^ (559546701 ^ (-559548538)))), (803415608 ^ 2078988952) ^ 1409940644), 1);
            PKCS1 = transformRsa2;
            short sXd2 = (short) (ZN.Xd() ^ ((1994464869 ^ 2033764792) ^ 265940588));
            int[] iArr2 = new int["\" \u001f".length()];
            QB qb2 = new QB("\" \u001f");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            int i5 = 1490872340 ^ 1490872342;
            TransformRsa transformRsa3 = new TransformRsa(BuildConfig.AnonymousClass1.equals(new String(iArr2, 0, i4), i5), i5);
            ECB = transformRsa3;
            TransformRsa transformRsa4 = new TransformRsa(CipherHelperImp.AnonymousClass2.concat((1131504289 ^ 239232154) ^ 1295189566, C1561oA.Kd("HRF_", (short) (C1633zX.Xd() ^ ((52731014 ^ 1618012505) ^ (-1666463745))))), i3);
            OAEP = transformRsa4;
            $VALUES = new TransformRsa[]{transformRsa, transformRsa2, transformRsa3, transformRsa4};
        } catch (NullPointerException unused) {
        }
    }

    private TransformRsa(String str, int i2) {
    }

    public static TransformRsa valueOf(String str) {
        try {
            return (TransformRsa) Enum.valueOf(TransformRsa.class, str);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static TransformRsa[] values() {
        try {
            return (TransformRsa[]) $VALUES.clone();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
