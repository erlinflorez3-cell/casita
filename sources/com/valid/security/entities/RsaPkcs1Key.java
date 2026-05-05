package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public final class RsaPkcs1Key extends Enum<RsaPkcs1Key> {
    private static final /* synthetic */ RsaPkcs1Key[] $VALUES;
    public static final RsaPkcs1Key RSA_1024;
    public static final RsaPkcs1Key RSA_2048;
    public static final RsaPkcs1Key RSA_4096;
    private final int keySize;
    private final int maxDataLength;

    public class Exception extends RuntimeException {
    }

    static {
        try {
            int i2 = 48219410 ^ 48219415;
            RsaPkcs1Key rsaPkcs1Key = new RsaPkcs1Key(CipherHelperImp.AnonymousClass2.concat(i2, Xg.qd("|ik}W%\u0015%", (short) (C1633zX.Xd() ^ (400227351 ^ (-400213021))), (short) (C1633zX.Xd() ^ (951084109 ^ (-951084542))))), 0, 1810382711 ^ 1810381687, 551361460 ^ 551361488);
            RSA_1024 = rsaPkcs1Key;
            RsaPkcs1Key rsaPkcs1Key2 = new RsaPkcs1Key(CipherHelperImp.AnonymousClass2.concat(430995242 ^ 430995246, Jg.Wd("\u0014\u00161<\u0012[jq", (short) (OY.Xd() ^ (1605585985 ^ 1605575129)), (short) (OY.Xd() ^ (1576501855 ^ 1576520397)))), 1, (1012113862 ^ 475141930) ^ 536985324, (312823358 ^ 623355792) ^ 931326280);
            RSA_2048 = rsaPkcs1Key2;
            RsaPkcs1Key rsaPkcs1Key3 = new RsaPkcs1Key(BuildConfig.AnonymousClass1.equals(ZO.xd("[5zgHisV", (short) (C1607wl.Xd() ^ (1296110387 ^ 1296112804)), (short) (C1607wl.Xd() ^ ((684943119 ^ 327194978) ^ 995351792))), i2), (678371340 ^ 474931978) ^ 874627844, 773716594 ^ 773712498, (1099954462 ^ 1896573674) ^ 813994526);
            RSA_4096 = rsaPkcs1Key3;
            $VALUES = new RsaPkcs1Key[]{rsaPkcs1Key, rsaPkcs1Key2, rsaPkcs1Key3};
        } catch (Exception unused) {
        }
    }

    private RsaPkcs1Key(String str, int i2, int i3, int i4) {
        super(str, i2);
        this.keySize = i3;
        this.maxDataLength = i4;
    }

    public static RsaPkcs1Key valueOf(int i2) {
        try {
            for (RsaPkcs1Key rsaPkcs1Key : values()) {
                if (rsaPkcs1Key.getKeySize() == i2) {
                    return rsaPkcs1Key;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static RsaPkcs1Key valueOf(String str) {
        try {
            return (RsaPkcs1Key) Enum.valueOf(RsaPkcs1Key.class, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static RsaPkcs1Key[] values() {
        try {
            return (RsaPkcs1Key[]) $VALUES.clone();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getMaxDataLength() {
        return this.maxDataLength;
    }
}
