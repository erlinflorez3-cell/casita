package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class hs extends tg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k00 f850j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(vb0 serverConfigStorageProvider, String urlBase, String str) {
        super(new b90(urlBase + "dust/config"), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f850j = k00.DUST_CONFIG;
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
            String str = this.f1860b;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObjectB.put("user_id", this.f1860b);
            }
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) gs.f773a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f850j;
    }
}
