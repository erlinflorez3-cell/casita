package com.valid.security.entities;

import com.valid.security.BuildConfig;
import com.valid.security.helpers.CipherHelperImp;
import yg.C1580rY;
import yg.C1633zX;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes5.dex */
public final class AesKey extends Enum<AesKey> {
    private static final /* synthetic */ AesKey[] $VALUES;
    public static final AesKey AES_128;
    public static final AesKey AES_256;
    private final int keySize;

    public class Exception extends RuntimeException {
    }

    static {
        try {
            AesKey aesKey = new AesKey(CipherHelperImp.AnonymousClass2.concat((339754416 ^ 443636335) ^ 238118877, Wg.vd("L`V^4\u0006u", (short) (C1580rY.Xd() ^ (561718097 ^ (-561722147))))), 0, Integer.valueOf((906278138 ^ 720307956) ^ 485208718));
            AES_128 = aesKey;
            AesKey aesKey2 = new AesKey(BuildConfig.AnonymousClass1.equals(Qg.kd("iaw{NQR", (short) (C1633zX.Xd() ^ (831285662 ^ (-831286926))), (short) (C1633zX.Xd() ^ ((2123511778 ^ 1939485402) ^ (-218655867)))), 1202363884 ^ 1202363880), 1, Integer.valueOf(832700096 ^ 832700352));
            AES_256 = aesKey2;
            $VALUES = new AesKey[]{aesKey, aesKey2};
        } catch (Exception unused) {
        }
    }

    private AesKey(String str, int i2, Integer num) {
        super(str, i2);
        this.keySize = num.intValue();
    }

    public static AesKey valueOf(String str) {
        try {
            return (AesKey) Enum.valueOf(AesKey.class, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static AesKey[] values() {
        try {
            return (AesKey[]) $VALUES.clone();
        } catch (Exception unused) {
            return null;
        }
    }

    public Integer getKeySize() {
        try {
            return Integer.valueOf(this.keySize);
        } catch (Exception unused) {
            return null;
        }
    }
}
