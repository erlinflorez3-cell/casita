package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class f70 extends tg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k00 f623m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(vb0 serverConfigStorageProvider, String urlBase, String str, ArrayList campaignIds, long j2, List dedupeIds) {
        super(new b90(urlBase + "push/redeliver"), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(campaignIds, "campaignIds");
        Intrinsics.checkNotNullParameter(dedupeIds, "dedupeIds");
        this.f620j = campaignIds;
        this.f621k = j2;
        this.f622l = dedupeIds;
        this.f623m = k00.PUSH_REDELIVER;
    }

    @Override // bo.app.tg, bo.app.b10
    public final void a(v00 internalPublisher, v00 externalPublisher, s50 apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) d70.f465a, 7, (Object) null);
        long j2 = apiResponse.f1740n;
        if (j2 != -1) {
            ((vw) internalPublisher).b(c70.class, new c70(j2));
        }
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
            jSONObjectB.put("campaign_ids", new JSONArray((Collection) this.f620j));
            jSONObjectB.put("last_sync_at", this.f621k);
            if (!this.f622l.isEmpty()) {
                jSONObjectB.put("dedupe_ids", new JSONArray((Collection) this.f622l));
            }
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) e70.f551a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f623m;
    }
}
