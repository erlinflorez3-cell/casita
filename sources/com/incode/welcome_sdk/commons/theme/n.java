package com.incode.welcome_sdk.commons.theme;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5758c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5759d = 1;

    public static final /* synthetic */ FontWeight a(String str) {
        int i2 = 2 % 2;
        int i3 = f5758c + 9;
        f5759d = i3 % 128;
        int i4 = i3 % 2;
        FontWeight fontWeightC = c(str);
        int i5 = f5758c + 31;
        f5759d = i5 % 128;
        if (i5 % 2 != 0) {
            return fontWeightC;
        }
        throw null;
    }

    public static final /* synthetic */ String e(FontWeight fontWeight) {
        int i2 = 2 % 2;
        int i3 = f5758c + 85;
        f5759d = i3 % 128;
        int i4 = i3 % 2;
        String strA = a(fontWeight);
        int i5 = f5758c + 3;
        f5759d = i5 % 128;
        int i6 = i5 % 2;
        return strA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r1.equals("regular") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.ui.text.font.FontWeight c(java.lang.String r3) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.commons.theme.n.f5758c
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.n.f5759d = r0
            int r1 = r1 % r2
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r3.toLowerCase(r0)
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1078030475: goto L37;
                case -1039745817: goto L46;
                case -252885355: goto L59;
                case 3029637: goto L68;
                case 1086463900: goto L77;
                default: goto L1e;
            }
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r3)
            java.lang.String r0 = " cannot be mapped to font weight."
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L37:
            java.lang.String r0 = "medium"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r0 = r0.getMedium()
            return r0
        L46:
            java.lang.String r0 = "normal"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
            goto L7f
        L4f:
            int r0 = com.incode.welcome_sdk.commons.theme.n.f5758c
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.theme.n.f5759d = r0
            int r1 = r1 % r2
            goto L1e
        L59:
            java.lang.String r0 = "extrabold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r0 = r0.getExtraBold()
            return r0
        L68:
            java.lang.String r0 = "bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r0 = r0.getBold()
            return r0
        L77:
            java.lang.String r0 = "regular"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L7f:
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r0 = r0.getNormal()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.theme.n.c(java.lang.String):androidx.compose.ui.text.font.FontWeight");
    }

    private static final String a(FontWeight fontWeight) {
        int i2 = 2 % 2;
        if (Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal())) {
            int i3 = f5758c + 121;
            f5759d = i3 % 128;
            int i4 = i3 % 2;
            return "regular";
        }
        if (Intrinsics.areEqual(fontWeight, FontWeight.Companion.getMedium())) {
            int i5 = f5759d + 35;
            f5758c = i5 % 128;
            if (i5 % 2 == 0) {
                return "medium";
            }
            throw null;
        }
        if (Intrinsics.areEqual(fontWeight, FontWeight.Companion.getBold())) {
            int i6 = f5758c + 69;
            f5759d = i6 % 128;
            int i7 = i6 % 2;
            return "bold";
        }
        if (Intrinsics.areEqual(fontWeight, FontWeight.Companion.getSemiBold())) {
            return "semiBold";
        }
        if (Intrinsics.areEqual(fontWeight, FontWeight.Companion.getExtraBold())) {
            return "extraBold";
        }
        throw new IllegalArgumentException(fontWeight + " not supported.");
    }
}
