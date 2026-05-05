package com.ts.coresdk.logger.a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final String a(String str, int i2) {
        if (str.length() <= i2) {
            return str;
        }
        String strSubstring = str.substring(0, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }
}
