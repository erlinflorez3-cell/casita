package com.valid.utils;

/* JADX INFO: renamed from: com.valid.utils.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C1322r {
    public static String insert(int i2, String str) {
        try {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            for (int i3 = 0; i3 != length; i3++) {
                int i4 = charArray[i3] ^ (95 & i2);
                i2++;
                charArray[i3] = (char) i4;
            }
            return String.valueOf(charArray, 0, length).intern();
        } catch (w unused) {
            return null;
        }
    }
}
