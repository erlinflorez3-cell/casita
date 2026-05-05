package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.dynatrace.agent.events.enrichment.EventKeys;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class zb0 implements IPutIntoJson {

    /* JADX INFO: renamed from: a */
    public final cc0 f2375a;

    /* JADX INFO: renamed from: b */
    public final double f2376b;

    /* JADX INFO: renamed from: c */
    public volatile Double f2377c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f2378d;

    public zb0(cc0 sessionId, double d2, Double d3, boolean z2) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f2375a = sessionId;
        this.f2376b = d2;
        a(d3);
        this.f2378d = z2;
    }

    public zb0(JSONObject sessionData) throws JSONException {
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        String string = sessionData.getString("session_id");
        Intrinsics.checkNotNullExpressionValue(string, "sessionData.getString(SESSION_ID_KEY)");
        this.f2375a = bc0.a(string);
        this.f2376b = sessionData.getDouble(EventKeys.START_TIME);
        this.f2378d = sessionData.getBoolean("is_sealed");
        a(JsonUtils.getDoubleOrNull(sessionData, EventKeys.END_TIME));
    }

    public void a(Double d2) {
        this.f2377c = d2;
    }

    public final long b() {
        Double dC = c();
        if (dC == null) {
            return -1L;
        }
        double dDoubleValue = dC.doubleValue();
        long j2 = (long) (dDoubleValue - this.f2376b);
        if (j2 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new xb0(dDoubleValue, this), 6, (Object) null);
        }
        return j2;
    }

    public Double c() {
        return this.f2377c;
    }

    public final boolean d() {
        return this.f2378d;
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f2375a);
            jSONObject.put(EventKeys.START_TIME, this.f2376b);
            jSONObject.put("is_sealed", this.f2378d);
            if (c() != null) {
                jSONObject.put(EventKeys.END_TIME, c());
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) yb0.f2295a, 4, (Object) null);
        }
        return jSONObject;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f2375a + ", startTime=" + this.f2376b + ", endTime=" + c() + ", isSealed=" + this.f2378d + ", duration=" + b() + ')';
    }
}
