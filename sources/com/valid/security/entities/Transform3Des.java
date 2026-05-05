package com.valid.security.entities;

import com.valid.security.helpers.CipherHelperImp;
import yg.C1626yg;
import yg.Od;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class Transform3Des {
    private static final /* synthetic */ Transform3Des[] $VALUES;
    public static final Transform3Des CBC;

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    static {
        try {
            Transform3Des transform3Des = new Transform3Des(CipherHelperImp.AnonymousClass2.concat((37031184 ^ 1917423194) ^ 1887208270, C1626yg.Ud("a\u0010:", (short) (Od.Xd() ^ ((1556315598 ^ 1712371835) ^ (-986948102))), (short) (Od.Xd() ^ ((1922037983 ^ 1022732499) ^ (-1316623262))))), 0);
            CBC = transform3Des;
            $VALUES = new Transform3Des[]{transform3Des};
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    private Transform3Des(String str, int i2) {
    }

    public static Transform3Des valueOf(String str) {
        try {
            return (Transform3Des) Enum.valueOf(Transform3Des.class, str);
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    public static Transform3Des[] values() {
        try {
            return (Transform3Des[]) $VALUES.clone();
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }
}
