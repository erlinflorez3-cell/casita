package com.incode.welcome_sdk.ui.ekyc;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CapitalLetterOnlyInputFilter implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14128a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f14129c = 1;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(spanned, "");
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            if (!Character.isLetter(cCharAt) || !Character.isUpperCase(cCharAt)) {
                return "";
            }
            i2++;
            int i7 = f14128a + 79;
            f14129c = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = f14129c + 7;
        f14128a = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }
}
