package com.incode.welcome_sdk.data.local;

import android.content.Context;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.data.local.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8574a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f8575b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<a> f8576c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8577d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8578e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8579f = 1;

    private e() {
    }

    public static List<a> a(Context context) throws IOException {
        int i2 = 2 % 2;
        int i3 = f8577d + 49;
        f8578e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            List<a> list = f8576c;
            int i4 = 27 / 0;
            if (list != null) {
                return list;
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            List<a> list2 = f8576c;
            if (list2 != null) {
                return list2;
            }
        }
        List<a> listE = e(context);
        int i5 = f8577d + 25;
        f8578e = i5 % 128;
        int i6 = i5 % 2;
        return listE;
    }

    private static List<a> e(Context context) throws IOException {
        int i2 = 2 % 2;
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.onboard_sdk_country_list_iso2);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            int i3 = f8577d + 63;
            f8578e = i3 % 128;
            int i4 = i3 % 2;
            a.b bVar = a.f7693c;
            List<a> listE = a.b.e(new JSONArray(text));
            f8576c = listE;
            return listE;
        } finally {
        }
    }

    static {
        int i2 = f8579f + 79;
        f8574a = i2 % 128;
        int i3 = i2 % 2;
    }
}
