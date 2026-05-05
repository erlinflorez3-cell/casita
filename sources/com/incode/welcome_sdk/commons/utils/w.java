package com.incode.welcome_sdk.commons.utils;

import dev.b3nedikt.restring.Restring;
import java.util.Locale;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: a */
    private static int f6653a = 0;

    /* JADX INFO: renamed from: c */
    public static int f6654c = 0;

    /* JADX INFO: renamed from: d */
    private static int f6655d = 1;

    /* JADX INFO: renamed from: e */
    public static int f6656e = 0;

    public static final void c(Restring restring, Locale locale) {
        int i2 = 2 % 2;
        int i3 = f6655d + 33;
        f6653a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(restring, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (Intrinsics.areEqual(Restring.getLocale(), locale)) {
            return;
        }
        int i5 = f6655d + 91;
        f6653a = i5 % 128;
        if (i5 % 2 == 0) {
            Restring.setLocale(locale);
            return;
        }
        Restring.setLocale(locale);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r11, (java.lang.CharSequence) com.dynatrace.android.agent.Global.UNDERSCORE, false, 2, (java.lang.Object) null) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0024, code lost:
    
        r0 = (java.lang.String[]) kotlin.text.StringsKt.split$default((java.lang.CharSequence) r11, new java.lang.String[]{com.dynatrace.android.agent.Global.UNDERSCORE}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
        r2 = new java.util.Locale(r0[0], r0[1]);
        r1 = com.incode.welcome_sdk.commons.utils.w.f6653a + 107;
        com.incode.welcome_sdk.commons.utils.w.f6655d = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if ((r1 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r3 = 0 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r11, (java.lang.CharSequence) com.dynatrace.android.agent.Global.UNDERSCORE, false, 2, (java.lang.Object) null) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        timber.log.Timber.Forest.d("Locale is not in the correct format.", new java.lang.Object[0]);
        r0 = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Locale c(java.lang.String r11) {
        /*
            r6 = r11
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.utils.w.f6653a
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.w.f6655d = r0
            int r1 = r1 % r4
            r5 = 0
            java.lang.String r0 = ""
            java.lang.String r2 = "_"
            r3 = 0
            if (r1 != 0) goto L53
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.contains$default(r1, r0, r3, r4, r5)
            if (r0 == 0) goto L63
        L24:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5 = 1
            java.lang.String[] r7 = new java.lang.String[r5]
            r7[r3] = r2
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            java.util.List r1 = kotlin.text.StringsKt.split$default(r6, r7, r8, r9, r10, r11)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.Locale r2 = new java.util.Locale
            r1 = r0[r3]
            r0 = r0[r5]
            r2.<init>(r1, r0)
            int r0 = com.incode.welcome_sdk.commons.utils.w.f6653a
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.w.f6655d = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L52
            int r3 = r3 / r3
        L52:
            return r2
        L53:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.contains$default(r1, r0, r3, r4, r5)
            if (r0 == 0) goto L63
            goto L24
        L63:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.String r1 = "Locale is not in the correct format."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2.d(r1, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.w.c(java.lang.String):java.util.Locale");
    }

    public static int c() {
        int i2 = f6656e;
        int i3 = i2 % 6735980;
        f6656e = i2 + 1;
        if (i3 != 0) {
            return f6654c;
        }
        int iNextInt = new Random().nextInt(61921801);
        f6654c = iNextInt;
        return iNextInt;
    }
}
