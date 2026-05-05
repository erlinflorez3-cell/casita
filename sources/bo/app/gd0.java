package bo.app;

import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class gd0 extends tg {

    /* JADX INFO: renamed from: j */
    public final md0 f744j;

    /* JADX INFO: renamed from: k */
    public final g10 f745k;

    /* JADX INFO: renamed from: l */
    public final k00 f746l;

    /* JADX INFO: renamed from: m */
    public final String f747m;

    /* JADX INFO: renamed from: n */
    public final long f748n;

    /* JADX INFO: renamed from: o */
    public final long f749o;

    /* JADX INFO: renamed from: p */
    public final md0 f750p;

    /* JADX INFO: renamed from: q */
    public final k50 f751q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(vb0 serverConfigStorageProvider, String urlBase, md0 templatedTriggeredAction, g10 triggerEvent, String str) {
        super(new b90(urlBase + "template"), str, serverConfigStorageProvider);
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(templatedTriggeredAction, "templatedTriggeredAction");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f744j = templatedTriggeredAction;
        this.f745k = triggerEvent;
        this.f746l = k00.TEMPLATE_REQUEST;
        this.f747m = templatedTriggeredAction.d();
        this.f748n = a(templatedTriggeredAction.c());
        this.f749o = templatedTriggeredAction.e();
        this.f750p = templatedTriggeredAction;
        this.f751q = new j50().a(str).a();
    }

    public static long a(g90 g90Var) {
        int i2 = g90Var.f733e;
        return i2 == -1 ? TimeUnit.SECONDS.toMillis(g90Var.f732d + 30) : i2;
    }

    @Override // bo.app.tg, bo.app.b10
    public final void a(v00 internalPublisher, v00 externalPublisher, d10 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        super.a(internalPublisher, externalPublisher, responseError);
        if (responseError instanceof t) {
            ((vw) internalPublisher).b(ch0.class, new ch0(this.f745k, this.f744j));
        }
    }

    @Override // bo.app.tg, bo.app.b10
    public final void a(v00 internalPublisher, v00 externalPublisher, s50 apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        InAppMessageBase inAppMessageBase = apiResponse.f1733g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(MapsKt.toMap(this.f744j.f494f));
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
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f747m);
            jSONObject.put("trigger_event_type", this.f745k.a());
            e00 e00Var = ((we0) this.f745k).f2141c;
            jSONObject.put("data", e00Var != null ? ((ba) e00Var).forJsonPut() : null);
            jSONObjectB.put("template", jSONObject);
            String str = this.f751q.f1073a;
            if (!(str == null || str.length() == 0)) {
                jSONObjectB.put("respond_with", this.f751q.forJsonPut());
            }
            return jSONObjectB;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) fd0.f664a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l00
    public final k00 c() {
        return this.f746l;
    }

    @Override // bo.app.tg
    public final String toString() {
        return "TemplateRequest(templatedTriggeredAction=" + this.f744j + ", triggerEvent=" + this.f745k + ", triggerAnalyticsId='" + this.f747m + "', templatePayloadExpirationTimestamp=" + this.f749o + ", getTemplatedDataExpiration=" + (((we0) this.f745k).f2140b + this.f748n) + "triggeredAction=" + this.f750p + ')';
    }
}
