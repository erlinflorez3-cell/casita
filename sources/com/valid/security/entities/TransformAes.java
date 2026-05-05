package com.valid.security.entities;

import com.valid.security.helpers.CipherHelperImp;
import yg.C1499aX;
import yg.C1633zX;
import yg.EO;
import yg.Ig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class TransformAes {
    private static final /* synthetic */ TransformAes[] $VALUES;
    public static final TransformAes CBC;
    public static final TransformAes GCM;

    public class NullPointerException extends RuntimeException {
    }

    static {
        try {
            TransformAes transformAes = new TransformAes(CipherHelperImp.AnonymousClass2.concat(1957518844 ^ 1957518846, Ig.wd("\u001aX\u0015", (short) (C1633zX.Xd() ^ (1110340754 ^ (-1110316022))))), 0);
            CBC = transformAes;
            TransformAes transformAes2 = new TransformAes(CipherHelperImp.AnonymousClass2.concat(949992925 ^ 949992921, EO.Od(">\u0016d", (short) (C1499aX.Xd() ^ ((1934708382 ^ 211077810) ^ (-2143681012))))), 1);
            GCM = transformAes2;
            $VALUES = new TransformAes[]{transformAes, transformAes2};
        } catch (NullPointerException unused) {
        }
    }

    private TransformAes(String str, int i2) {
    }

    public static TransformAes valueOf(String str) {
        try {
            return (TransformAes) Enum.valueOf(TransformAes.class, str);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static TransformAes[] values() {
        try {
            return (TransformAes[]) $VALUES.clone();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
