package bo.app;

import com.braze.support.BrazeLogger;
import com.npmdavi.davinotification.Constant;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ha0 extends tg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k00 f816k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(vb0 serverConfigStorageProvider, String urlBase, String str, List logs) {
        super(new b90(urlBase + "debugger/log", true), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f815j = logs;
        this.f816k = k00.SDK_DEBUGGER_LOG;
    }

    @Override // bo.app.tg, bo.app.b10
    public final void a(v00 internalPublisher, v00 externalPublisher, d10 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new fa0(responseError), 3, (Object) null);
        ((vw) internalPublisher).b(x90.class, new x90(new r90()));
    }

    @Override // bo.app.tg, bo.app.l00
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-Rec-Auth-Code", this.f1861c.r());
    }

    @Override // bo.app.l00
    public final boolean a() {
        return this.f815j.isEmpty();
    }

    @Override // bo.app.tg, bo.app.l00
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f1860b;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObjectB.put("user_id", this.f1860b);
            }
            JSONArray jSONArray = new JSONArray();
            for (ea0 ea0Var : this.f815j) {
                ea0Var.getClass();
                jSONArray.put(new JSONObject().put(Constant.NOTIFICATION_DETAILS_LOG, ea0Var.f558a).put("time", ea0Var.f559b));
            }
            jSONObjectB.put("data", new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put("data", jSONArray)));
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.E, (Throwable) e2, true, (Function0<String>) ga0.f737a);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f816k;
    }
}
