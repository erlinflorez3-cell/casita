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
public final class bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9535a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9536e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<bk> f9537c;

    private bp(List<bk> list) {
        this.f9537c = list;
    }

    public final List<bk> c() {
        List<bk> list;
        int i2 = 2 % 2;
        int i3 = f9536e;
        int i4 = i3 + 3;
        f9535a = i4 % 128;
        if (i4 % 2 != 0) {
            list = this.f9537c;
            int i5 = 83 / 0;
        } else {
            list = this.f9537c;
        }
        int i6 = i3 + 65;
        f9535a = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public static bp c(ResponseBody responseBody) throws IOException {
        int i2 = 2 % 2;
        String strString = responseBody.string();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(strString).getJSONArray("questionAndAnswers");
            int i3 = f9535a + 47;
            f9536e = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(bk.e((JSONObject) jSONArray.get(i5)));
            }
        } catch (JSONException e2) {
            Timber.e(e2);
        }
        bp bpVar = new bp(arrayList);
        int i6 = f9536e + 39;
        f9535a = i6 % 128;
        int i7 = i6 % 2;
        return bpVar;
    }
}
