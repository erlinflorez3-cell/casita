package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class se0 implements f10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1763b = BrazeLogger.getBrazeLogTag((Class<?>) se0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f1764a;

    public se0(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                arrayList2.add(new f60(jSONArray2.getJSONObject(i3)));
            }
            arrayList.add(new h50(arrayList2));
        }
        this.f1764a = new m(arrayList);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f1764a.forJsonPut());
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e2) {
            BrazeLogger.e(f1763b, "Caught exception creating Json.", e2);
        }
        return jSONObject;
    }
}
