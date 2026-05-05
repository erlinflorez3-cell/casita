package com.valid.security.managers;

import java.lang.Enum;
import java.security.Key;

/* JADX INFO: loaded from: classes5.dex */
public interface VsshCryptoManager<T extends Enum<T>> {

    public class NullPointerException extends RuntimeException {
    }

    byte[] decrypt(T t2, String str, Key key);

    byte[] encrypt(T t2, String str, Key key);
}
