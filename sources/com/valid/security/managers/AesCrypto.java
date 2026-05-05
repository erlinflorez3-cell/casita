package com.valid.security.managers;

import com.valid.security.entities.EncryptionType;
import com.valid.security.entities.TransformAes;
import java.security.Key;

/* JADX INFO: loaded from: classes5.dex */
public class AesCrypto extends CommonCryptoManager implements VsshCryptoManager<TransformAes> {

    public class ParseException extends RuntimeException {
    }

    private static EncryptionType getEncryptionType(TransformAes transformAes) {
        return transformAes.equals(TransformAes.CBC) ? EncryptionType.AES_CBC : EncryptionType.AES_GCM;
    }

    public byte[] decrypt(TransformAes transformAes, String str, Key key) {
        return (str == null || str.isEmpty()) ? new byte[0] : decrypt(getEncryptionType(transformAes), str, key);
    }

    @Override // com.valid.security.managers.VsshCryptoManager
    public /* bridge */ /* synthetic */ byte[] decrypt(Enum r2, String str, Key key) {
        try {
            return decrypt((TransformAes) r2, str, key);
        } catch (ParseException unused) {
            return null;
        }
    }

    public byte[] encrypt(TransformAes transformAes, String str, Key key) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return encrypt(getEncryptionType(transformAes), str, key);
                }
            } catch (ParseException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    @Override // com.valid.security.managers.VsshCryptoManager
    public /* bridge */ /* synthetic */ byte[] encrypt(Enum r2, String str, Key key) {
        try {
            return encrypt((TransformAes) r2, str, key);
        } catch (ParseException unused) {
            return null;
        }
    }
}
