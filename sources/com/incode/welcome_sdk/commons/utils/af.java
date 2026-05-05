package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6373a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6374b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6375c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6376d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static af f6377e = new af();

    private af() {
    }

    private static String c(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = f6375c + 75;
        f6374b = i3 % 128;
        if (i3 % 2 == 0) {
            return b(context, str, "git_commit_hash");
        }
        b(context, str, "git_commit_hash");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String d(Context context, String str) {
        int i2 = 2 % 2;
        int i3 = f6375c + 121;
        f6374b = i3 % 128;
        int i4 = i3 % 2;
        String strB = b(context, str, "version");
        int i5 = f6374b + 41;
        f6375c = i5 % 128;
        int i6 = i5 % 2;
        return strB;
    }

    private static String b(Context context, String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f6374b + 105;
        f6375c = i3 % 128;
        int i4 = i3 % 2;
        int identifier = context.getResources().getIdentifier("onboard_sdk_" + StringsKt.replace$default(str, Global.HYPHEN, Global.UNDERSCORE, false, 4, (Object) null) + Global.UNDERSCORE + str2, "string", context.getPackageName());
        if (identifier != 0) {
            int i5 = f6374b + 123;
            f6375c = i5 % 128;
            int i6 = i5 % 2;
            return context.getString(identifier);
        }
        int i7 = f6374b + 55;
        f6375c = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 56 / 0;
        }
        return null;
    }

    @JvmStatic
    public static final Map<String, String> b(Context context) {
        Pair pair;
        Intrinsics.checkNotNullParameter(context, "");
        List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{"onboard", "core-light", "video-streaming", "nfc", "model-liveness-detection", "model-id-face-detection", "model-face-recognition", "extensions"});
        ArrayList arrayList = new ArrayList();
        for (String str : listListOf) {
            String strD = d(context, str);
            String strC = c(context, str);
            if (strD == null && strC == null) {
                pair = null;
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                if (strD == null) {
                    strD = "unknown";
                }
                if (strC == null) {
                    strC = "unknown";
                }
                String str2 = String.format(locale, "%s (%s)", Arrays.copyOf(new Object[]{strD, strC}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                pair = new Pair(str, str2);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    static {
        int i2 = f6373a + 79;
        f6376d = i2 % 128;
        int i3 = i2 % 2;
    }
}
