package com.incode.welcome_sdk.data.remote.beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class aj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9262b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9263c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Flow> f9264e;

    private aj(List<Flow> list) {
        this.f9264e = list;
    }

    public final List<Flow> a() {
        int i2 = 2 % 2;
        int i3 = f9263c + 125;
        int i4 = i3 % 128;
        f9262b = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<Flow> list = this.f9264e;
        int i5 = i4 + 47;
        f9263c = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public static aj e(ResponseBody responseBody) throws IOException {
        int i2 = 2 % 2;
        String strString = responseBody.string();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strString);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                int i4 = f9263c + 87;
                f9262b = i4 % 128;
                int i5 = i4 % 2;
                Flow flowOrNull = Flow.parseFlowOrNull((JSONObject) jSONArray.get(i3));
                if (flowOrNull != null) {
                    int i6 = f9262b + 61;
                    f9263c = i6 % 128;
                    int i7 = i6 % 2;
                    arrayList.add(flowOrNull);
                }
            }
        } catch (JSONException e2) {
            Timber.e(e2);
        }
        return new aj(arrayList);
    }
}
