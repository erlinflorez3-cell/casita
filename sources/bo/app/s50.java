package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class s50 extends n {

    /* JADX INFO: renamed from: c */
    public final JSONObject f1729c;

    /* JADX INFO: renamed from: d */
    public final d10 f1730d;

    /* JADX INFO: renamed from: e */
    public final ma0 f1731e;

    /* JADX INFO: renamed from: f */
    public final dm f1732f;

    /* JADX INFO: renamed from: g */
    public final InAppMessageBase f1733g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1734h;

    /* JADX INFO: renamed from: i */
    public final fb0 f1735i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f1736j;

    /* JADX INFO: renamed from: k */
    public final JSONArray f1737k;

    /* JADX INFO: renamed from: l */
    public final String f1738l;

    /* JADX INFO: renamed from: m */
    public final JSONArray f1739m;

    /* JADX INFO: renamed from: n */
    public final long f1740n;

    /* JADX INFO: renamed from: o */
    public final r90 f1741o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s50(l00 request, w00 connectionResult, h00 brazeManager) {
        dm dmVar;
        fb0 fb0Var;
        super(request, connectionResult);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        JSONObject jSONObjectA = connectionResult.a();
        jSONObjectA = jSONObjectA == null ? new JSONObject() : jSONObjectA;
        this.f1729c = jSONObjectA;
        d10 d10VarA = r50.a(jSONObjectA, request);
        this.f1730d = d10VarA;
        this.f1731e = r50.b(jSONObjectA, request);
        this.f1737k = jSONObjectA.optJSONArray("feature_flags");
        this.f1739m = jSONObjectA.optJSONArray("feed");
        this.f1740n = jSONObjectA.optLong("last_sync_at", -1L);
        if (d10VarA == null && (request instanceof mn)) {
            try {
                dmVar = new dm(jSONObjectA);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new n50(this), 4, (Object) null);
                dmVar = null;
            }
        } else {
            dmVar = null;
        }
        this.f1732f = dmVar;
        ArrayList arrayListA = ng0.f1362a.a(this.f1729c.optJSONArray("triggers"), brazeManager);
        this.f1734h = arrayListA;
        if (arrayListA != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new o50(this), 6, (Object) null);
        }
        JSONObject jSONObjectOptJSONObject = this.f1729c.optJSONObject("config");
        if (jSONObjectOptJSONObject != null) {
            try {
                fb0Var = new fb0(jSONObjectOptJSONObject);
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new p50(jSONObjectOptJSONObject), 6, (Object) null);
                } catch (Exception e3) {
                    e = e3;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new q50(jSONObjectOptJSONObject), 4, (Object) null);
                }
            } catch (Exception e4) {
                e = e4;
                fb0Var = null;
            }
        } else {
            fb0Var = null;
        }
        this.f1735i = fb0Var;
        JSONObject jSONObjectOptJSONObject2 = this.f1729c.optJSONObject("templated_message");
        ng0 ng0Var = ng0.f1362a;
        this.f1733g = ng0.a(jSONObjectOptJSONObject2, brazeManager);
        JSONArray jSONArrayOptJSONArray = this.f1729c.optJSONArray("geofences");
        this.f1736j = jSONArrayOptJSONArray != null ? com.braze.support.g.a(jSONArrayOptJSONArray) : null;
        this.f1738l = request instanceof hs ? JsonUtils.getOptionalString(this.f1729c, "mite") : null;
        this.f1741o = request instanceof ba0 ? w90.f2113k.a(this.f1729c, true) : null;
    }
}
