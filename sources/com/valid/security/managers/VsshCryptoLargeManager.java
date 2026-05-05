package com.valid.security.managers;

import com.valid.security.entities.TransformRsa;
import java.security.Key;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface VsshCryptoLargeManager {

    public class NullPointerException extends RuntimeException {
    }

    byte[] decryptLargeRsa(TransformRsa transformRsa, List<String> list, Key key);

    List<String> encryptLargeRsa(TransformRsa transformRsa, String str, Key key);
}
