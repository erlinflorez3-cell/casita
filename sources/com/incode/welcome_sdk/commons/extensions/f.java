package com.incode.welcome_sdk.commons.extensions;

import android.text.Editable;
import android.util.Patterns;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5122d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5123e = 1;

    public static final boolean b(EditText editText) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(editText, "");
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        if (text.length() <= 0) {
            return false;
        }
        int i3 = f5122d + 1;
        int i4 = i3 % 128;
        f5123e = i4;
        if (i3 % 2 == 0) {
            return false;
        }
        int i5 = i4 + 75;
        f5122d = i5 % 128;
        int i6 = i5 % 2;
        return Patterns.EMAIL_ADDRESS.matcher(editText.getText()).matches();
    }

    public static final boolean d(EditText editText) {
        int i2 = 2 % 2;
        int i3 = f5122d + 33;
        f5123e = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(editText, "");
            Editable text = editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            text.length();
            throw null;
        }
        Intrinsics.checkNotNullParameter(editText, "");
        Editable text2 = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "");
        if (text2.length() > 0) {
            return true;
        }
        int i4 = f5122d + 121;
        f5123e = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return false;
    }
}
