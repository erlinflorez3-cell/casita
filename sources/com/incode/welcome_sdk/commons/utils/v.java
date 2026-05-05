package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6648a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f6649b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6650c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6651d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6652e = 0;

    private v() {
    }

    public static String e(Context context) {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f6648a + 103;
        f6650c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        Intrinsics.checkNotNull(systemService, "");
        String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
        Intrinsics.checkNotNullExpressionValue(simCountryIso, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = simCountryIso.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        String country = upperCase;
        if (country.length() == 0) {
            int i5 = f6648a + 19;
            f6650c = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "");
        }
        return country;
    }

    static {
        int i2 = f6652e + 87;
        f6651d = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
        }
    }
}
