package com.incode.welcome_sdk.commons.ui;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes5.dex */
public class CustomTypefaceSpan extends TypefaceSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5778b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5779e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f5780d;

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i2 = 2 % 2;
        int i3 = f5778b + 55;
        f5779e = i3 % 128;
        if (i3 % 2 == 0) {
            e(textPaint, this.f5780d);
            int i4 = 52 / 0;
        } else {
            e(textPaint, this.f5780d);
        }
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        int i2 = 2 % 2;
        int i3 = f5778b + 49;
        f5779e = i3 % 128;
        int i4 = i3 % 2;
        e(textPaint, this.f5780d);
        int i5 = f5779e + 49;
        f5778b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[PHI: r1
  0x004b: PHI (r1v3 android.graphics.Typeface) = (r1v2 android.graphics.Typeface), (r1v11 android.graphics.Typeface) binds: [B:16:0x0048, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(android.graphics.Paint r4, android.graphics.Typeface r5) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.f5779e
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.f5778b = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 == 0) goto L44
            android.graphics.Typeface r1 = r4.getTypeface()
            r0 = 66
            int r0 = r0 / r2
            if (r1 != 0) goto L4b
        L18:
            int r0 = com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.f5779e
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.f5778b = r0
            int r1 = r1 % r3
        L21:
            int r0 = r5.getStyle()
            int r1 = ~r0
            r1 = r1 & r2
            r0 = r1 & 1
            if (r0 == 0) goto L2f
            r0 = 1
            r4.setFakeBoldText(r0)
        L2f:
            r1 = r1 & r3
            if (r1 == 0) goto L40
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            r4.setTextSkewX(r0)
            int r0 = com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.f5778b
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.f5779e = r0
            int r1 = r1 % r3
        L40:
            r4.setTypeface(r5)
            return
        L44:
            android.graphics.Typeface r1 = r4.getTypeface()
            if (r1 != 0) goto L4b
            goto L18
        L4b:
            int r2 = r1.getStyle()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.CustomTypefaceSpan.e(android.graphics.Paint, android.graphics.Typeface):void");
    }
}
