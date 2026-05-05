package bo.app;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import io.cobrowse.CobrowseIO;
import io.sentry.protocol.Device;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tg extends u70 implements l00 {

    /* JADX INFO: renamed from: b */
    public String f1860b;

    /* JADX INFO: renamed from: c */
    public final vb0 f1861c;

    /* JADX INFO: renamed from: d */
    public Long f1862d;

    /* JADX INFO: renamed from: e */
    public String f1863e;

    /* JADX INFO: renamed from: f */
    public String f1864f;

    /* JADX INFO: renamed from: g */
    public String f1865g;

    /* JADX INFO: renamed from: h */
    public nq f1866h;

    /* JADX INFO: renamed from: i */
    public String f1867i;

    public /* synthetic */ tg(b90 b90Var, vb0 vb0Var) {
        this(b90Var, null, vb0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(b90 requestTarget, String str, vb0 serverConfigStorageProvider) {
        super(requestTarget);
        Intrinsics.checkNotNullParameter(requestTarget, "requestTarget");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f1860b = str;
        this.f1861c = serverConfigStorageProvider;
    }

    @Override // bo.app.b10
    public void a(v00 internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        ((vw) internalPublisher).b(v70.class, new v70(this));
    }

    @Override // bo.app.b10
    public void a(v00 internalPublisher, v00 externalPublisher, d10 responseError) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(responseError, "responseError");
        String strA = responseError.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new ig(strA), 6, (Object) null);
        if (responseError instanceof x30) {
            ((vw) internalPublisher).b(x30.class, responseError);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) jg.f1013a, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) kg.f1108a, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) lg.f1194a, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) mg.f1291a, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) ng.f1361a, 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new og(this), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new pg(this), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) qg.f1602a, 6, (Object) null);
        }
        if (responseError instanceof i90) {
            ((vw) externalPublisher).b(BrazeSdkAuthenticationErrorEvent.class, new BrazeSdkAuthenticationErrorEvent((i90) responseError));
        }
    }

    @Override // bo.app.b10
    public void a(v00 internalPublisher, v00 externalPublisher, s50 apiResponse) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        ma0 ma0Var = apiResponse.f1731e;
        if (ma0Var != null) {
            ((vw) externalPublisher).b(BrazeSdkAuthenticationErrorEvent.class, new BrazeSdkAuthenticationErrorEvent(new i90(ma0Var.f1270a, ma0Var.f1271b, ma0Var.f1272c, null)));
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c() == k00.SDK_DEBUGGER_LOG, new rg(this), 3, (Object) null);
    }

    @Override // bo.app.b10
    public void a(vw internalPublisher) {
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        internalPublisher.b(w70.class, new w70(this));
    }

    public void a(HashMap existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        existingHeaders.put("X-Braze-Api-Key", this.f1864f);
        String str = this.f1867i;
        if (str == null || str.length() == 0) {
            return;
        }
        existingHeaders.put("X-Braze-Auth-Signature", this.f1867i);
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            nq nqVar = this.f1866h;
            if (nqVar != null && !nqVar.isEmpty()) {
                jSONObject.put(Device.TYPE, nqVar.forJsonPut());
            }
            String str = this.f1863e;
            if (str != null) {
                jSONObject.put(CobrowseIO.DEVICE_ID_KEY, str);
            }
            Long l2 = this.f1862d;
            if (l2 != null) {
                jSONObject.put("time", l2);
            }
            String str2 = this.f1864f;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.f1865g;
            if (str3 != null) {
                jSONObject.put("sdk_version", str3);
            }
            return jSONObject;
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) sg.f1767a, 4, (Object) null);
            return null;
        }
    }

    public final Long d() {
        return this.f1862d;
    }

    public final b90 e() {
        return new b90(Braze.Companion.getApiEndpoint(this.f1921a.f254b), false);
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(b()) + "\nto target: " + e();
    }
}
