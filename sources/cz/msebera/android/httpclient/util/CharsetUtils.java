package cz.msebera.android.httpclient.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes5.dex */
public class CharsetUtils {
    public static Charset get(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException unused) {
            throw new UnsupportedEncodingException(str);
        }
    }

    public static Charset lookup(String str) {
        Charset charsetForName = null;
        if (str == null) {
            return null;
        }
        try {
            charsetForName = Charset.forName(str);
            return charsetForName;
        } catch (UnsupportedCharsetException unused) {
            return charsetForName;
        }
    }
}
