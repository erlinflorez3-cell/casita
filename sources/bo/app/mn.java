package bo.app;

import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class mn extends tg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f1305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k00 f1307m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(vb0 serverConfigStorageProvider, String urlBase, long j2, long j3, String str, int i2) {
        super(new b90(urlBase + "content_cards/sync"), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f1304j = j2;
        this.f1305k = j3;
        this.f1306l = i2;
        this.f1307m = k00.CONTENT_CARD_SYNC;
    }

    @Override // bo.app.tg, bo.app.l00
    public final void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
        existingHeaders.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f1306l));
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
            jSONObjectB.put("last_full_sync_at", this.f1305k);
            jSONObjectB.put("last_card_updated_at", this.f1304j);
            String str = this.f1860b;
            if (str != null && !StringsKt.isBlank(str)) {
                jSONObjectB.put("user_id", this.f1860b);
            }
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) ln.f1204a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f1307m;
    }
}
