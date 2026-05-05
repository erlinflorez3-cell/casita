package com.incode.welcome_sdk.ui.phone_number;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import io.michaelrocks.libphonenumber.android.AsYouTypeFormatter;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MyPhoneNumberFormattingTextWatcher implements TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16883g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16884j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PhoneNumberUtil f16886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AsYouTypeFormatter f16889e;

    public MyPhoneNumberFormattingTextWatcher(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        PhoneNumberUtil phoneNumberUtilCreateInstance = PhoneNumberUtil.createInstance(context);
        Intrinsics.checkNotNullExpressionValue(phoneNumberUtilCreateInstance, "");
        this.f16886b = phoneNumberUtilCreateInstance;
        AsYouTypeFormatter asYouTypeFormatter = phoneNumberUtilCreateInstance.getAsYouTypeFormatter(str);
        Intrinsics.checkNotNullExpressionValue(asYouTypeFormatter, "");
        this.f16889e = asYouTypeFormatter;
    }

    public /* synthetic */ MyPhoneNumberFormattingTextWatcher(Context context, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? Locale.getDefault().getCountry() : str);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f16883g + 87;
        f16884j = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (this.f16885a) {
            return;
        }
        int i8 = f16884j + 77;
        f16883g = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        if (!this.f16888d && i3 > 0 && b(charSequence, i2, i3)) {
            c();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f16883g + 37;
        f16884j = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (this.f16885a || this.f16888d || i4 <= 0 || (!b(charSequence, i2, i4))) {
            return;
        }
        int i7 = f16883g + 51;
        f16884j = i7 % 128;
        if (i7 % 2 != 0) {
            c();
            int i8 = 69 / 0;
        } else {
            c();
        }
        int i9 = f16883g + 97;
        f16884j = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(editable, "");
        boolean z2 = false;
        if (this.f16888d) {
            if (editable.length() != 1) {
                int i3 = 2 % 2;
                z2 = true;
            }
            this.f16888d = z2;
            return;
        }
        if (this.f16885a) {
            return;
        }
        String strB = b(editable, Selection.getSelectionEnd(editable));
        if (strB != null) {
            int i4 = f16884j + 57;
            f16883g = i4 % 128;
            int i5 = i4 % 2;
            int rememberedPosition = this.f16889e.getRememberedPosition();
            this.f16885a = true;
            editable.replace(0, editable.length(), strB, 0, strB.length());
            if (!(!Intrinsics.areEqual(strB, editable.toString()))) {
                int i6 = f16884j + 123;
                f16883g = i6 % 128;
                if (i6 % 2 == 0) {
                    Selection.setSelection(editable, rememberedPosition);
                    int i7 = 96 / 0;
                } else {
                    Selection.setSelection(editable, rememberedPosition);
                }
            }
            this.f16885a = false;
        }
    }

    private final String b(CharSequence charSequence, int i2) {
        int i3;
        int length;
        int i4;
        char c2;
        boolean z2;
        int i5 = 2 % 2;
        int i6 = f16884j + 69;
        f16883g = i6 % 128;
        String strB = null;
        if (i6 % 2 == 0) {
            i3 = i2 + 1;
            this.f16889e.clear();
            length = charSequence.length();
            c2 = 0;
            z2 = false;
            i4 = 1;
        } else {
            i3 = i2 - 1;
            this.f16889e.clear();
            length = charSequence.length();
            i4 = 0;
            c2 = 0;
            z2 = false;
        }
        while (i4 < length) {
            char cCharAt = charSequence.charAt(i4);
            if (!(!PhoneNumberUtils.isNonSeparator(cCharAt))) {
                if (c2 != 0) {
                    int i7 = f16883g + 89;
                    f16884j = i7 % 128;
                    int i8 = i7 % 2;
                    strB = b(c2, z2);
                    z2 = false;
                }
                c2 = cCharAt;
            }
            if (i4 == i3) {
                int i9 = f16883g + 11;
                f16884j = i9 % 128;
                int i10 = i9 % 2;
                z2 = true;
            }
            i4++;
        }
        return c2 != 0 ? b(c2, z2) : strB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r0 = r4.f16889e.inputDigit(r5);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r6 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        r1 = r2 + 79;
        com.incode.welcome_sdk.ui.phone_number.MyPhoneNumberFormattingTextWatcher.f16883g = r1 % 128;
        r1 = r1 % 2;
        r0 = r4.f16889e.inputDigitAndRememberPosition(r5);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r6 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String b(char r5, boolean r6) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r2 = com.incode.welcome_sdk.ui.phone_number.MyPhoneNumberFormattingTextWatcher.f16884j
            int r1 = r2 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.phone_number.MyPhoneNumberFormattingTextWatcher.f16883g = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L25
            r0 = 31
            int r0 = r0 / 0
            if (r6 == 0) goto L28
        L14:
            int r1 = r2 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.phone_number.MyPhoneNumberFormattingTextWatcher.f16883g = r0
            int r1 = r1 % r3
            io.michaelrocks.libphonenumber.android.AsYouTypeFormatter r0 = r4.f16889e
            java.lang.String r0 = r0.inputDigitAndRememberPosition(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        L25:
            if (r6 == 0) goto L28
            goto L14
        L28:
            io.michaelrocks.libphonenumber.android.AsYouTypeFormatter r0 = r4.f16889e
            java.lang.String r0 = r0.inputDigit(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.phone_number.MyPhoneNumberFormattingTextWatcher.b(char, boolean):java.lang.String");
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f16883g + 111;
        f16884j = i3 % 128;
        int i4 = i3 % 2;
        this.f16888d = true;
        this.f16889e.clear();
    }

    private static boolean b(CharSequence charSequence, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = i3 + i2;
        while (i2 < i5) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i2))) {
                int i6 = f16884j + 31;
                f16883g = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            i2++;
        }
        int i8 = f16884j + 37;
        f16883g = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }
}
