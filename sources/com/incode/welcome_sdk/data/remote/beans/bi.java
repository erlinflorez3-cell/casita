package com.incode.welcome_sdk.data.remote.beans;

import com.google.firebase.messaging.Constants;
import com.incode.welcome_sdk.data.local.Region;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9486c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9487e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Region> f9488b;

    private bi(List<Region> list) {
        this.f9488b = list;
    }

    public final List<Region> e() {
        int i2 = 2 % 2;
        int i3 = f9486c + 123;
        f9487e = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9488b;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseRegions{regions=").append(this.f9488b).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9486c + 35;
        f9487e = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static bi c(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        JSONArray jSONArrayB = com.incode.welcome_sdk.commons.extensions.i.b(new JSONObject(responseBody.string()), "regions");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < jSONArrayB.length()) {
            try {
                JSONObject jSONObject = jSONArrayB.getJSONObject(i3);
                arrayList.add(new Region(jSONObject.getString(Constants.ScionAnalytics.PARAM_LABEL), jSONObject.getString("code"), jSONObject.getString("emoji")));
            } catch (IllegalArgumentException e2) {
                Timber.e(e2);
            } catch (JSONException e3) {
                Timber.e(e3);
            }
            i3++;
            int i4 = f9487e + 15;
            f9486c = i4 % 128;
            int i5 = i4 % 2;
        }
        return new bi(arrayList);
    }
}
