package com.valid.security.utils;

import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public final class SecurityUtils {

    public class IOException extends RuntimeException {
    }

    public static byte[] getByteArrayFromHexString(String str) {
        return Hex.decode(str);
    }

    public static String getHexStringFromByteArray(byte[] bArr) {
        try {
            return new String(Hex.encode(bArr));
        } catch (IOException unused) {
            return null;
        }
    }
}
