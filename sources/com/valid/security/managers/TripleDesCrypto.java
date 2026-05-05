package com.valid.security.managers;

import com.valid.security.entities.EncryptionType;
import com.valid.security.entities.Transform3Des;
import java.security.Key;

/* JADX INFO: loaded from: classes5.dex */
public class TripleDesCrypto extends CommonCryptoManager implements VsshCryptoManager<Transform3Des> {

    public class IOException extends RuntimeException {
    }

    public byte[] decrypt(Transform3Des transform3Des, String str, Key key) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return transform3Des.equals(Transform3Des.CBC) ? decrypt(EncryptionType.DES_CBC, str, key) : new byte[0];
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return new byte[0];
    }

    @Override // com.valid.security.managers.VsshCryptoManager
    public /* bridge */ /* synthetic */ byte[] decrypt(Enum r2, String str, Key key) {
        try {
            return decrypt((Transform3Des) r2, str, key);
        } catch (IOException unused) {
            return null;
        }
    }

    public byte[] encrypt(Transform3Des transform3Des, String str, Key key) {
        return (str == null || str.isEmpty()) ? new byte[0] : transform3Des.equals(Transform3Des.CBC) ? encrypt(EncryptionType.DES_CBC, str, key) : new byte[0];
    }

    @Override // com.valid.security.managers.VsshCryptoManager
    public /* bridge */ /* synthetic */ byte[] encrypt(Enum r2, String str, Key key) {
        try {
            return encrypt((Transform3Des) r2, str, key);
        } catch (IOException unused) {
            return null;
        }
    }
}
