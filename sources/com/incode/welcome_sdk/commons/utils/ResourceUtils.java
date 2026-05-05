package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes5.dex */
public class ResourceUtils {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6333d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6334e = 0;

    public static String getTranslatedString(Context context, String str, String str2) {
        String string;
        int i2 = 2 % 2;
        int i3 = f6333d;
        int i4 = i3 + 81;
        f6334e = i4 % 128;
        int i5 = i4 % 2;
        if (context == null) {
            return null;
        }
        if (str != null) {
            string = new StringBuilder().append(str).append(str2).toString();
        } else {
            int i6 = i3 + 51;
            f6334e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 12 / 0;
            }
            string = str2;
        }
        int stringResourceIdByName = getStringResourceIdByName(context, string);
        if (stringResourceIdByName == 0) {
            int i8 = f6334e + 69;
            f6333d = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 45 / 0;
            }
            return str2;
        }
        return context.getString(stringResourceIdByName);
    }

    private static int getStringResourceIdByName(Context context, String str) {
        int i2 = 2 % 2;
        if (context == null) {
            int i3 = f6334e + 31;
            f6333d = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }
        try {
            int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
            int i5 = f6334e + 123;
            f6333d = i5 % 128;
            if (i5 % 2 != 0) {
                return identifier;
            }
            throw null;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getStatusBarHeight(Context context) {
        int i2 = 2 % 2;
        int i3 = f6334e + 25;
        f6333d = i3 % 128;
        if (i3 % 2 != 0) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                int i4 = f6334e + 71;
                f6333d = i4 % 128;
                return (int) Math.ceil((i4 % 2 == 0 ? 95 : 24) * resources.getDisplayMetrics().density);
            }
            return resources.getDimensionPixelSize(identifier);
        }
        context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        throw null;
    }
}
