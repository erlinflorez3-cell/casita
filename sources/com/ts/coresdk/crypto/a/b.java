package com.ts.coresdk.crypto.a;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSLog;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Formatter;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static String a(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b2 : bArr) {
            formatter.format("%02x", Byte.valueOf(b2));
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    public static String e(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        try {
            return a(MessageDigest.getInstance(McElieceCCA2ParameterSpec.DEFAULT_MD).digest(f(str)));
        } catch (Throwable th) {
            TSLog.e(context, iTSModuleInfo, "failed to sign data", th);
            return null;
        }
    }

    public static String e(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bytes) {
            sb.append(Integer.toHexString(b2).toUpperCase());
        }
        return sb.toString();
    }

    public static byte[] f(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }
}
