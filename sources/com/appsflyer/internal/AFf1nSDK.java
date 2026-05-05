package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component2 = 1;
    private static char[] getCurrencyIso4217Code = null;
    private static int getMediationNetwork = 0;
    private static boolean getMonetizationNetwork = false;
    private static boolean getRevenue = false;

    static {
        getMediationNetwork();
        ExpandableListView.getPackedPositionChild(0L);
        int i2 = component2 + 25;
        AFAdRevenueData = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) throws UnsupportedEncodingException {
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = getCurrencyIso4217Code;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr3[i6] = (char) (((long) cArr2[i6]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i7 = (int) (1825820251896122634L ^ ((long) getMediationNetwork));
        if (getRevenue) {
            int i8 = $11 + 3;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            aFk1oSDK.getMonetizationNetwork = bArr.length;
            char[] cArr4 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr4[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[bArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i2] - i7);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (getMonetizationNetwork) {
            aFk1oSDK.getMonetizationNetwork = cArr.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[cArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i7);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = iArr.length;
        char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            int i10 = $11 + 81;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i7);
            aFk1oSDK.AFAdRevenueData++;
        }
        String str3 = new String(cArr6);
        int i12 = $11 + 41;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str3;
    }

    private static AFi1sSDK getCurrencyIso4217Code(AFi1vSDK aFi1vSDK, String str, String str2, String str3) throws UnsupportedEncodingException {
        String string;
        if (str == null) {
            return new AFi1sSDK(aFi1vSDK.getRevenue == AFh1dSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getRevenue == AFh1dSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = getMonetizationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.getMediationNetwork, "android", "v1", string).equals(str);
        return new AFi1sSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    static void getMediationNetwork() {
        getCurrencyIso4217Code = new char[]{36169, 36173, 36172, 36163, 36168, 36174, 36175, 36162, 36170, 36190, 36171, 36187, 36191};
        getMediationNetwork = 1912311066;
        getMonetizationNetwork = true;
        getRevenue = true;
    }

    private static String getMonetizationNetwork(String str, String str2, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (monetizationNetwork.length() >= 12) {
            return monetizationNetwork.substring(0, 12);
        }
        int i3 = AFAdRevenueData + 113;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 111;
        AFAdRevenueData = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
        return monetizationNetwork;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFi1sSDK getRevenue(com.appsflyer.internal.AFi1vSDK r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            r2 = 0
            if (r5 == 0) goto L20
            int r0 = com.appsflyer.internal.AFf1nSDK.AFAdRevenueData
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.appsflyer.internal.AFf1nSDK.component2 = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L1d
            r0 = 89
            int r0 = r0 / r2
            if (r7 == 0) goto L20
        L16:
            if (r8 == 0) goto L20
            com.appsflyer.internal.AFi1sSDK r0 = getCurrencyIso4217Code(r5, r6, r7, r8)
            return r0
        L1d:
            if (r7 == 0) goto L20
            goto L16
        L20:
            int r0 = com.appsflyer.internal.AFf1nSDK.AFAdRevenueData
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.appsflyer.internal.AFf1nSDK.component2 = r0
            int r1 = r1 % r3
            com.appsflyer.internal.AFi1sSDK r1 = new com.appsflyer.internal.AFi1sSDK
            com.appsflyer.internal.AFi1ySDK r0 = com.appsflyer.internal.AFi1ySDK.INTERNAL_ERROR
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1nSDK.getRevenue(com.appsflyer.internal.AFi1vSDK, java.lang.String, java.lang.String, java.lang.String):com.appsflyer.internal.AFi1sSDK");
    }
}
