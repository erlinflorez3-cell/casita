package bo.app;

import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rz extends tg {

    /* JADX INFO: renamed from: j */
    public final e00 f1715j;

    /* JADX INFO: renamed from: k */
    public final k00 f1716k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(vb0 serverConfigStorageProvider, String urlBase, IBrazeLocation location) {
        super(new b90(urlBase + "geofence/request"), serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f1715j = ba.f257g.a(location);
        this.f1716k = k00.GEOFENCE_REFRESH;
    }

    @Override // bo.app.l00
    public final boolean a() {
        return false;
    }

    @Override // bo.app.tg, bo.app.l00
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            e00 e00Var = this.f1715j;
            if (e00Var != null) {
                jSONObjectB.put("location_event", ((ba) e00Var).forJsonPut());
            }
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) qz.f1634a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f1716k;
    }
}
