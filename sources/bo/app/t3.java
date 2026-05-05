package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class t3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(String str, Braze braze, String str2, String str3) {
        super(0);
        this.f1804a = str;
        this.f1805b = braze;
        this.f1806c = str2;
        this.f1807d = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        String str = this.f1804a;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1805b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) q3.f1569a, 6, (Object) null);
        } else {
            String str2 = this.f1806c;
            if (str2 == null || StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1805b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) r3.f1643a, 6, (Object) null);
            } else {
                String str3 = this.f1807d;
                if (str3 == null || StringsKt.isBlank(str3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1805b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) s3.f1723a, 6, (Object) null);
                } else {
                    tf tfVar = ((ci0) this.f1805b.getUdm$android_sdk_base_release()).f403v;
                    int i2 = k60.f1078j;
                    String campaignId = this.f1804a;
                    String actionId = this.f1806c;
                    String actionType = this.f1807d;
                    Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                    Intrinsics.checkNotNullParameter(actionId, "actionId");
                    Intrinsics.checkNotNullParameter(actionType, "actionType");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cid", campaignId);
                    jSONObject.put("a", actionId);
                    LinkedHashMap linkedHashMap = lx.f1214b;
                    tfVar.a(new k60(jSONObject, actionType));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
