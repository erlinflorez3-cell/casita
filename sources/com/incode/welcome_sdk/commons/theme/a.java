package com.incode.welcome_sdk.commons.theme;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5586a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5587c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f5588b;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f5588b = context;
    }

    public static /* synthetic */ Font e(a aVar, String str) throws IllegalArgumentException {
        int i2 = 2 % 2;
        int i3 = f5587c + 91;
        f5586a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            return aVar.c(str, null);
        }
        aVar.c(str, null);
        obj.hashCode();
        throw null;
    }

    public final Font c(String str, FontWeight fontWeight) throws IllegalArgumentException {
        int i2;
        Object obj;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int identifier = this.f5588b.getResources().getIdentifier(str, "font", this.f5588b.getPackageName());
        if (identifier == 0) {
            throw new IllegalArgumentException(("Provided font name [" + str + "] is not resolved in your application resources, verify font names.").toString());
        }
        if (fontWeight == null) {
            return FontKt.m6216FontYpTlLL0$default(identifier, null, 0, 0, 14, null);
        }
        int i6 = f5587c + 31;
        f5586a = i6 % 128;
        if (i6 % 2 == 0) {
            i2 = 111;
            obj = null;
            i3 = 1;
            i4 = 1;
        } else {
            i2 = 12;
            obj = null;
            i3 = 0;
            i4 = 0;
        }
        Font fontM6216FontYpTlLL0$default = FontKt.m6216FontYpTlLL0$default(identifier, fontWeight, i3, i4, i2, obj);
        int i7 = f5586a + 13;
        f5587c = i7 % 128;
        if (i7 % 2 == 0) {
            return fontM6216FontYpTlLL0$default;
        }
        throw null;
    }

    public final String a(ResourceFont resourceFont) {
        int i2 = 2 % 2;
        int i3 = f5586a + 89;
        f5587c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(resourceFont, "");
        String resourceEntryName = this.f5588b.getResources().getResourceEntryName(resourceFont.getResId());
        Intrinsics.checkNotNullExpressionValue(resourceEntryName, "");
        int i5 = f5586a + 115;
        f5587c = i5 % 128;
        int i6 = i5 % 2;
        return resourceEntryName;
    }
}
