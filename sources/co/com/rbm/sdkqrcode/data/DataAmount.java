package co.com.rbm.sdkqrcode.data;

import androidx.room.RoomMasterTable;
import com.dynatrace.android.agent.AdkSettings;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class DataAmount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f2519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f2520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f2521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f2522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f2523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f2524f;

    /* JADX INFO: renamed from: co.com.rbm.sdkqrcode.data.DataAmount$1, reason: invalid class name */
    public class AnonymousClass1 {
        public static int endsWith() {
            try {
                return new Random().nextInt(75) + 1;
            } catch (ArrayOutOfBoundsException unused) {
                return 0;
            }
        }

        public static String endsWith(int i2, String str) {
            String str2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            char[] charArray;
            int i8;
            int length;
            String str3 = AdkSettings.PLATFORM_TYPE_MOBILE;
            int i9 = Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE);
            String str4 = RoomMasterTable.DEFAULT_ID;
            int i10 = 2;
            if (i9 != 0) {
                str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
                i4 = 0;
                i3 = 2;
                i10 = 9;
            } else {
                str2 = RoomMasterTable.DEFAULT_ID;
                i3 = 4;
                i4 = 1;
            }
            if (i10 != 0) {
                i7 = i4 + i3;
                str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
                i5 = 0;
                i6 = 0;
            } else {
                i5 = i10 + 5;
                i6 = i4;
                i7 = i3;
            }
            char[] cArr = null;
            if (Integer.parseInt(str2) != 0) {
                i8 = i5 + 14;
                i6 = 1;
                str4 = str2;
                charArray = null;
            } else {
                i2 -= 15;
                charArray = str.toCharArray();
                i8 = i5 + 4;
            }
            if (i8 != 0) {
                length = charArray.length;
            } else {
                str3 = str4;
                length = 1;
            }
            if (Integer.parseInt(str3) != 0) {
                i6 = 1;
            } else {
                i3 <<= i7;
                cArr = charArray;
            }
            int i11 = (i3 - 1) ^ 32;
            while (i6 != length) {
                int i12 = cArr[i6] ^ ((i2 + i11) - (i2 | i11));
                i2 -= 11;
                cArr[i6] = (char) i12;
                i6++;
            }
            return String.valueOf(cArr, 0, length);
        }
    }

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    public DataAmount(Double d2, Double d3, Double d4, Double d5, Double d6, Double d7) {
        this.f2519a = d2;
        this.f2520b = d3;
        this.f2521c = d4;
        this.f2522d = d5;
        this.f2523e = d6;
        this.f2524f = d7;
    }

    public Double getBaseAmount() {
        return this.f2522d;
    }

    public Double getInc() {
        return this.f2520b;
    }

    public Double getIva() {
        return this.f2519a;
    }

    public Double getTip() {
        return this.f2524f;
    }

    public Double getTotalAmount() {
        return this.f2523e;
    }

    public Double getTransactionAmount() {
        return this.f2521c;
    }
}
