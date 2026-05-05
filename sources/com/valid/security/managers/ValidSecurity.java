package com.valid.security.managers;

import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes5.dex */
public interface ValidSecurity {

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    byte[] decryptLargeRsa(List<String> list, Key key, Cipher cipher);

    byte[] decryptRsa(byte[] bArr, Key key, Cipher cipher);

    byte[] decryptWithIv(byte[] bArr, Key key, Cipher cipher);

    List<String> encryptLargeRsa(byte[] bArr, Key key, Cipher cipher);

    byte[] encryptRsa(byte[] bArr, Key key, Cipher cipher);

    byte[] encryptWithSymmetricCipher(byte[] bArr, Key key, Cipher cipher);
}
