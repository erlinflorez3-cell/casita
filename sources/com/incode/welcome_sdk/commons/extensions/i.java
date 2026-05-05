package com.incode.welcome_sdk.commons.extensions;

import com.biocatch.client.android.sdk.core.Constants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5130b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5131d = 1;

    public static final JSONArray b(JSONObject jSONObject, String str) {
        int i2 = 2 % 2;
        int i3 = f5130b + 51;
        f5131d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Intrinsics.checkNotNullParameter(str, "");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            int i4 = 30 / 0;
            if (jSONArrayOptJSONArray != null) {
                return jSONArrayOptJSONArray;
            }
        } else {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Intrinsics.checkNotNullParameter(str, "");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray2 != null) {
                return jSONArrayOptJSONArray2;
            }
        }
        JSONArray jSONArray = new JSONArray();
        int i5 = f5130b + 87;
        f5131d = i5 % 128;
        int i6 = i5 % 2;
        return jSONArray;
    }

    public static final <T, R> List<R> d(JSONArray jSONArray, Function1<? super T, ? extends R> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jSONArray, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            Object obj = jSONArray.get(i3);
            if (!Intrinsics.areEqual(obj, JSONObject.NULL)) {
                int i4 = f5131d + 79;
                f5130b = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(function1.invoke(obj));
                int i6 = f5131d + 23;
                f5130b = i6 % 128;
                int i7 = i6 % 2;
            }
            i3++;
            int i8 = f5131d + 107;
            f5130b = i8 % 128;
            int i9 = i8 % 2;
        }
        return arrayList;
    }

    public static final <T, R> List<R> a(JSONArray jSONArray, Function1<? super T, ? extends R> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(jSONArray, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = f5130b + 15;
            f5131d = i4 % 128;
            int i5 = i4 % 2;
            Object obj = jSONArray.get(i3);
            if (!Intrinsics.areEqual(obj, JSONObject.NULL)) {
                linkedHashSet.add(function1.invoke(obj));
                int i6 = f5130b + 37;
                f5131d = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    public static final RequestBody c(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = f5130b + 115;
        f5131d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            RequestBody.Companion companion = RequestBody.Companion;
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            companion.create(string, MediaType.Companion.get(Constants.WUP_CONTENT_TYPE));
            throw null;
        }
        Intrinsics.checkNotNullParameter(jSONObject, "");
        RequestBody.Companion companion2 = RequestBody.Companion;
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        RequestBody requestBodyCreate = companion2.create(string2, MediaType.Companion.get(Constants.WUP_CONTENT_TYPE));
        int i4 = f5130b + 107;
        f5131d = i4 % 128;
        int i5 = i4 % 2;
        return requestBodyCreate;
    }
}
