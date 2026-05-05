package com.incode.welcome_sdk.commons.ui.otp;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OTPChildEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: d */
    private static int f5964d = 0;

    /* JADX INFO: renamed from: e */
    private static int f5965e = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPChildEditText(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        c(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPChildEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        c(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPChildEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        c(context);
    }

    private final void c(Context context) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f5964d + 17;
        f5965e = i4 % 128;
        if (i4 % 2 == 0) {
            setCursorVisible(true);
            setTextColor(context.getResources().getColor(R.color.transparent));
            setBackgroundDrawable(null);
            i2 = 5102;
        } else {
            setCursorVisible(false);
            setTextColor(context.getResources().getColor(R.color.transparent));
            setBackgroundDrawable(null);
            i2 = 4096;
        }
        setInputType(i2);
        setSelectAllOnFocus(false);
        setTextIsSelectable(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r6 != r2.length()) goto L20;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSelectionChanged(int r5, int r6) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5965e
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5964d = r0
            int r1 = r1 % r3
            android.text.Editable r2 = r4.getText()
            if (r2 == 0) goto L3c
            int r0 = com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5965e
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5964d = r0
            int r1 = r1 % r3
            int r0 = r2.length()
            if (r5 != r0) goto L30
            int r0 = com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5964d
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5965e = r0
            int r1 = r1 % r3
            int r0 = r2.length()
            if (r6 == r0) goto L3c
        L30:
            int r1 = r2.length()
            int r0 = r2.length()
            r4.setSelection(r1, r0)
            return
        L3c:
            super.onSelectionChanged(r5, r6)
            int r0 = com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5964d
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.f5965e = r0
            int r1 = r1 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.otp.OTPChildEditText.onSelectionChanged(int, int):void");
    }
}
