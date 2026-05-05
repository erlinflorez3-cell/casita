package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.dynatrace.agent.events.enrichment.EventKeys;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.SentryThread;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g90 implements IPutIntoJson {

    /* JADX INFO: renamed from: a */
    public final long f729a;

    /* JADX INFO: renamed from: b */
    public final long f730b;

    /* JADX INFO: renamed from: c */
    public final int f731c;

    /* JADX INFO: renamed from: d */
    public final int f732d;

    /* JADX INFO: renamed from: e */
    public final int f733e;

    /* JADX INFO: renamed from: f */
    public final k70 f734f;

    /* JADX INFO: renamed from: g */
    public final int f735g;

    public g90(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f729a = json.optLong(EventKeys.START_TIME, -1L);
        this.f730b = json.optLong(EventKeys.END_TIME, -1L);
        this.f731c = json.optInt(SentryThread.JsonKeys.PRIORITY, 0);
        this.f735g = json.optInt("min_seconds_since_last_trigger", -1);
        this.f732d = json.optInt("delay", 0);
        this.f733e = json.optInt(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, -1);
        this.f734f = new k70(json);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) this.f734f.forJsonPut();
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put(EventKeys.START_TIME, this.f729a);
            jSONObject.put(EventKeys.END_TIME, this.f730b);
            jSONObject.put(SentryThread.JsonKeys.PRIORITY, this.f731c);
            jSONObject.put("min_seconds_since_last_trigger", this.f735g);
            jSONObject.put(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, this.f733e);
            jSONObject.put("delay", this.f732d);
            return jSONObject;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) f90.f629a, 4, (Object) null);
            return null;
        }
    }
}
