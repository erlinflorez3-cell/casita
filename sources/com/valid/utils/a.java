package com.valid.utils;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static String getChars(String str, int i2) {
        try {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            for (int i3 = 0; i3 != length; i3++) {
                int i4 = charArray[i3] ^ ((i2 + 95) - (95 | i2));
                i2++;
                charArray[i3] = (char) i4;
            }
            return String.valueOf(charArray, 0, length).intern();
        } catch (um unused) {
            return null;
        }
    }
}
