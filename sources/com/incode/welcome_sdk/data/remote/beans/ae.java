package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ae {

    /* JADX INFO: renamed from: a */
    private static int f9223a = 0;

    /* JADX INFO: renamed from: c */
    private static int f9224c = 1;

    /* JADX INFO: renamed from: d */
    public static final e f9225d = new e((byte) 0);

    /* JADX INFO: renamed from: e */
    private static int f9226e = 0;

    /* JADX INFO: renamed from: i */
    private static int f9227i = 1;

    /* JADX INFO: renamed from: b */
    private final List<i> f9228b;

    public ae(List<i> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f9228b = list;
    }

    public final List<i> b() {
        int i2 = 2 % 2;
        int i3 = f9223a;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9224c = i4 % 128;
        int i5 = i4 % 2;
        List<i> list = this.f9228b;
        int i6 = i3 + 49;
        f9224c = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9224c + 1;
        f9223a = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseDocuments(documents=" + this.f9228b + ")";
        int i5 = f9223a + 43;
        f9224c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class e implements bd<ae> {

        /* JADX INFO: renamed from: a */
        private static int f9229a = 0;

        /* JADX INFO: renamed from: d */
        private static int f9230d = 1;

        private e() {
        }

        @Override // com.incode.welcome_sdk.data.remote.beans.bd
        public final /* synthetic */ ae a(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            int i3 = f9230d + 85;
            f9229a = i3 % 128;
            if (i3 % 2 == 0) {
                return d(responseBody);
            }
            d(responseBody);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static ae d(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONArray jSONArray = new JSONObject(responseBody.string()).getJSONArray("documents");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                String string = jSONObject.getString("documentRef");
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jSONObject.getString("documentUrl");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList.add(new i(string, string2));
            }
            ae aeVar = new ae(arrayList);
            int i4 = f9229a + 75;
            f9230d = i4 % 128;
            if (i4 % 2 != 0) {
                return aeVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9226e + 9;
        f9227i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
