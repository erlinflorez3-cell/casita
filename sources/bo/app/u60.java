package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u60 extends tg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f1917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k00 f1919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(vb0 serverConfigStorageProvider, String urlBase, String str, ArrayList pushDeliveryEvents) {
        super(new b90(urlBase + "push/delivery_events"), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(pushDeliveryEvents, "pushDeliveryEvents");
        this.f1917j = pushDeliveryEvents;
        this.f1918k = pushDeliveryEvents.isEmpty();
        this.f1919l = k00.PUSH_DELIVERY_EVENTS;
    }

    @Override // bo.app.l00
    public final boolean a() {
        return this.f1918k;
    }

    @Override // bo.app.tg, bo.app.l00
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (o60 o60Var : this.f1917j) {
                o60Var.a(this.f1860b);
                jSONArray.put(o60Var.forJsonPut());
            }
            jSONObjectB.put("events", jSONArray);
            String str = this.f1860b;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObjectB.put("user_id", this.f1860b);
            }
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) t60.f1816a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f1919l;
    }
}
