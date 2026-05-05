package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.os.Process;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6502a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f6503b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6504c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6505d = 1;

    public static String e(Context context) {
        int i2 = 2 % 2;
        Map<String, String> mapB = af.b(context);
        StringBuilder sb = new StringBuilder();
        if (mapB != null) {
            int i3 = f6505d + 23;
            f6502a = i3 % 128;
            int i4 = i3 % 2;
            if (!mapB.isEmpty()) {
                int i5 = f6505d + 105;
                f6502a = i5 % 128;
                int i6 = i5 % 2;
                boolean z2 = true;
                for (Map.Entry<String, String> entry : mapB.entrySet()) {
                    int i7 = f6502a + 89;
                    f6505d = i7 % 128;
                    int i8 = i7 % 2;
                    if (!z2) {
                        int i9 = f6505d + 69;
                        f6502a = i9 % 128;
                        if (i9 % 2 != 0) {
                            sb.append(", ");
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        sb.append(", ");
                    }
                    sb.append(String.format(Locale.US, "%s: %s", entry.getKey(), entry.getValue()));
                    z2 = false;
                }
            }
        }
        return sb.toString();
    }

    public static int a() {
        int i2 = f6504c;
        int i3 = i2 % 5685976;
        f6504c = i2 + 1;
        if (i3 != 0) {
            return f6503b;
        }
        int iMyUid = Process.myUid();
        f6503b = iMyUid;
        return iMyUid;
    }
}
