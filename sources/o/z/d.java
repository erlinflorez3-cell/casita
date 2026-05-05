package o.z;

import fr.antelop.sdk.exception.WalletValidationDomain;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import o.ea.m;

/* JADX INFO: loaded from: classes6.dex */
public interface d {
    default void a(int i2, int i3, int i4, String str) throws WalletValidationException {
        int i5 = 2 % 2;
        if (!m.c.b(i2, i3, i4)) {
            throw c(str);
        }
    }

    default void b(byte[] bArr, int i2, String str) throws WalletValidationException {
        int i3 = 2 % 2;
        if (!m.c.b(bArr, 0, i2)) {
            throw c(str);
        }
    }

    default WalletValidationException c(String str) {
        int i2 = 2 % 2;
        return new WalletValidationException(WalletValidationErrorCode.InvalidFormat, WalletValidationDomain.CREATE_CARD_REQUEST_BUILDER, str);
    }

    default void c(String str, int i2, int i3, String str2) throws WalletValidationException {
        int i4 = 2 % 2;
        if (str != null && !m.c.c(str, i2, i3)) {
            throw c(str2);
        }
    }

    default <T> void d(T t2, String str) throws WalletValidationException {
        int i2 = 2 % 2;
        if (t2 == null) {
            throw c(str);
        }
    }
}
