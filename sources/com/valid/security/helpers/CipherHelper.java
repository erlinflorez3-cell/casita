package com.valid.security.helpers;

import com.valid.security.entities.EncryptionType;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes5.dex */
public interface CipherHelper {

    public class Exception extends RuntimeException {
    }

    Cipher getCipher(EncryptionType encryptionType);
}
