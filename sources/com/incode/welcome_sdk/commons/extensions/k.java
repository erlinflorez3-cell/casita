package com.incode.welcome_sdk.commons.extensions;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5134a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5135e = 1;

    public static final void d(TextView textView, int i2) {
        int i3 = 2 % 2;
        int i4 = f5134a + 65;
        f5135e = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        int i6 = f5134a + 11;
        f5135e = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static final void c(TextView textView, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(textView, "");
        SpannableString spannableString = new SpannableString(textView.getContext().getString(i2));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        int i4 = f5134a + 19;
        f5135e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
