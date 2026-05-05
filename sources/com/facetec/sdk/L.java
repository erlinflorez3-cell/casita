package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class L implements ZoomEncryptStrings {
    private static int B = 0;
    private static int Code = 1;
    private static long V = 6536776563242845936L;

    L() {
    }

    private static String I(String str, int i2) {
        int i3 = 2 % 2;
        int i4 = B + 121;
        int i5 = i4 % 128;
        Code = i5;
        int i6 = i4 % 2;
        Object charArray = str;
        if (str != null) {
            int i7 = i5 + 45;
            B = i7 % 128;
            int i8 = i7 % 2;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        char[] cArr2 = new char[cArr.length];
        for (int i9 = 0; i9 < cArr.length; i9++) {
            int i10 = Code + 115;
            B = i10 % 128;
            int i11 = i10 % 2;
            cArr2[i9] = (char) (((long) (cArr[i9] ^ (i9 * i2))) ^ V);
        }
        return new String(cArr2);
    }

    private static Method V() {
        int i2 = 2 % 2;
        int i3 = Code + 97;
        B = i3 % 128;
        int i4 = i3 % 2;
        Method method = null;
        try {
            method = Class.forName(I("䚓场旗爱\u0007ẻ⽏㴀쮰\ud851\uf6fb蒓锥ꏲ놅乵峁浫笎ঽ♻㐐슺팍\ue1cbﾟ豓髤ꢔ뤭域摿爹Öᅩ", Color.blue(0) + 4517).intern()).getMethod(I("䚜㧦롥㣞뭬㯎멃㫏뵌㷘밥㲭", 32633 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), Throwable.class);
            int i5 = Code + 71;
            B = i5 % 128;
            int i6 = i5 % 2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        return method;
    }

    static void V(Throwable th) {
        int i2 = 2 % 2;
        String strF = n.F(null);
        if (strF == null || !strF.startsWith(I("䚓澎ᒿ㷭\ue2d2评냵姢ฌ㜌\udc39蕥", 10513 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern())) {
            return;
        }
        int i3 = Code + 123;
        int i4 = i3 % 128;
        B = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 43;
        Code = i6 % 128;
        int i7 = i6 % 2;
        Method methodV = V();
        if (methodV != null) {
            int i8 = Code + 65;
            B = i8 % 128;
            int i9 = i8 % 2;
            try {
                methodV.invoke(null, th);
            } catch (Exception unused) {
            }
        }
    }
}
