package com.valid.security.managers;

import com.valid.security.entities.EncryptionType;
import com.valid.security.helpers.CipherHelper;
import com.valid.security.helpers.CipherHelperImp;
import com.valid.security.utils.SecurityUtils;
import java.security.Key;

/* JADX INFO: loaded from: classes5.dex */
public abstract class CommonCryptoManager {
    private CipherHelper cipherHelper = new CipherHelperImp();
    private ValidSecurity validSecurity = new ValidSecurityImp();

    public class ParseException extends RuntimeException {
    }

    public byte[] decrypt(EncryptionType encryptionType, String str, Key key) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return this.validSecurity.decryptWithIv(SecurityUtils.getByteArrayFromHexString(str), key, getCipherHelper().getCipher(encryptionType));
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    public byte[] encrypt(EncryptionType encryptionType, String str, Key key) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return this.validSecurity.encryptWithSymmetricCipher(str.getBytes(), key, getCipherHelper().getCipher(encryptionType));
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    public final CipherHelper getCipherHelper() {
        return this.cipherHelper;
    }

    public final ValidSecurity getValidSecurity() {
        return this.validSecurity;
    }
}
