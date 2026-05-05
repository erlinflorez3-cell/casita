package co.com.rbm.sdkqrcode;

import com.dynatrace.android.agent.AdkSettings;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class BuildConfig {

    @Deprecated
    public static final String APPLICATION_ID = "co.com.rbm.sdkqrcode";
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final String LIBRARY_PACKAGE_NAME = "co.com.rbm.sdkqrcode";
    public static final int VERSION_CODE = 14;
    public static final String VERSION_NAME = "2.0.1";

    /* JADX INFO: renamed from: co.com.rbm.sdkqrcode.BuildConfig$1, reason: invalid class name */
    public class AnonymousClass1 {
        public static int concat() {
            try {
                return new Random().nextInt(75) + 1;
            } catch (ParseException unused) {
                return 0;
            }
        }

        public static String concat(String str, int i2) {
            int i3;
            char c2;
            String str2;
            char[] charArray;
            int length;
            char c3;
            String str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
            int i4 = 4;
            if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
                c2 = 11;
                str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
                i3 = 4;
            } else {
                i3 = 5;
                c2 = '\f';
                str2 = "41";
            }
            char[] cArr = null;
            if (c2 != 0) {
                i2 += 14;
                charArray = str.toCharArray();
            } else {
                str3 = str2;
                charArray = null;
            }
            if (Integer.parseInt(str3) != 0) {
                length = 1;
                c3 = 6;
            } else {
                length = charArray.length;
                c3 = 14;
            }
            if (c3 != 0) {
                i4 = 4 << i3;
                cArr = charArray;
            }
            int i5 = (i4 - 1) ^ 32;
            for (int i6 = 0; i6 != length; i6++) {
                int i7 = cArr[i6] ^ ((-1) - (((-1) - i2) | ((-1) - i5)));
                i2 += 15;
                cArr[i6] = (char) i7;
            }
            return String.valueOf(cArr, 0, length);
        }
    }

    public class ParseException extends RuntimeException {
    }
}
