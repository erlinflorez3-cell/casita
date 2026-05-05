package com.incode.welcome_sdk.commons.utils;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6511a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6512b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f6513c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f6514d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6515e = 1;

    private j() {
    }

    public static com.incode.welcome_sdk.data.d e(String str) {
        int i2 = 2 % 2;
        int i3 = f6511a + 75;
        f6515e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Timber.Forest.d("Deep link: " + str, new Object[0]);
        Uri uri = Uri.parse(str);
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "");
        String str2 = (String) CollectionsKt.lastOrNull((List) pathSegments);
        Object obj = null;
        if (str2 == null) {
            int i5 = f6511a + 115;
            f6515e = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str2 = "";
        }
        String queryParameter = uri.getQueryParameter("interviewId");
        if (queryParameter == null) {
            int i6 = f6515e + 97;
            f6511a = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter("module");
        return new com.incode.welcome_sdk.data.d(str2, queryParameter, queryParameter2 != null ? queryParameter2 : "");
    }

    static {
        int i2 = f6514d + 57;
        f6512b = i2 % 128;
        int i3 = i2 % 2;
    }
}
