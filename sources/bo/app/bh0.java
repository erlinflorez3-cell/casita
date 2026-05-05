package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bh0 implements k10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g90 f281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dg0 f283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f284e;

    public bh0(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        ArrayList arrayList = new ArrayList();
        this.f284e = arrayList;
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "json.getString(ID)");
        this.f280a = string;
        this.f281b = new g90(json);
        JSONArray triggers = json.getJSONArray("trigger_condition");
        if (triggers.length() > 0) {
            ng0 ng0Var = ng0.f1362a;
            Intrinsics.checkNotNullExpressionValue(triggers, "triggers");
            arrayList.addAll(ng0.a(triggers));
        }
        this.f282c = json.optBoolean("prefetch", true);
    }

    public JSONObject b() {
        try {
            JSONObject jSONObject = (JSONObject) this.f281b.forJsonPut();
            if (jSONObject != null) {
                jSONObject.put("id", this.f280a);
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f284e.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((f10) it.next()).forJsonPut());
                }
                jSONObject.put("trigger_condition", jSONArray);
                jSONObject.put("prefetch", this.f282c);
                return jSONObject;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public final boolean b(g10 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((this.f281b.f729a != -1 && DateTimeUtils.nowInSeconds() <= this.f281b.f729a) || (this.f281b.f730b != -1 && DateTimeUtils.nowInSeconds() >= this.f281b.f730b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ah0(this, event), 7, (Object) null);
            return false;
        }
        Iterator it = this.f284e.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((f10) it.next()).a(event)) {
                return i2 != -1;
            }
            i2++;
        }
        return false;
    }

    public final g90 c() {
        return this.f281b;
    }
}
