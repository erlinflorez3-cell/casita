package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9337a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9338b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9339c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9340d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<k> f9341e;

    public as(List<k> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f9341e = list;
    }

    public final List<k> d() {
        int i2 = 2 % 2;
        int i3 = f9339c;
        int i4 = i3 + 47;
        f9337a = i4 % 128;
        int i5 = i4 % 2;
        List<k> list = this.f9341e;
        int i6 = i3 + 29;
        f9337a = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9342b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9343d = 0;

        private b() {
        }

        @JvmStatic
        public static as b(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONArray jSONArray = new JSONArray(responseBody.string());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i3);
                String strOptString = jSONObjectOptJSONObject.optString("id");
                String strOptString2 = jSONObjectOptJSONObject.optString("name");
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                arrayList.add(new k(strOptString, strOptString2));
                i3++;
                int i4 = f9343d + 9;
                f9342b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 5;
                }
            }
            return new as(arrayList);
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        new b((byte) 0);
        int i2 = f9340d + 45;
        f9338b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final as e(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9339c + 115;
        f9337a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            b.b(responseBody);
            obj.hashCode();
            throw null;
        }
        as asVarB = b.b(responseBody);
        int i4 = f9339c + 49;
        f9337a = i4 % 128;
        if (i4 % 2 != 0) {
            return asVarB;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9337a + 97;
            f9339c = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof as)) {
            int i4 = f9339c + 1;
            f9337a = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.f9341e, ((as) obj).f9341e)) {
            return true;
        }
        int i5 = f9337a + 87;
        f9339c = i5 % 128;
        return i5 % 2 != 0;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9339c + 121;
        f9337a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.f9341e.hashCode();
        int i5 = f9337a + 55;
        f9339c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9339c + 53;
        f9337a = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseFlowIndexes(flowIndexes=" + this.f9341e + ")";
        int i5 = f9339c + 75;
        f9337a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return str;
    }
}
