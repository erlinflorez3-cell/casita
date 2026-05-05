package com.facebook.react.modules.network;

/* JADX INFO: loaded from: classes3.dex */
class HeaderUtil {
    HeaderUtil() {
    }

    public static String stripHeaderName(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                z2 = true;
            } else {
                sb.append(cCharAt);
            }
        }
        return z2 ? sb.toString() : str;
    }
}
