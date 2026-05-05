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
public final class w3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f2100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Braze braze, String str) {
        super(0);
        this.f2099a = str;
        this.f2100b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        String str = this.f2099a;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f2100b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) v3.f1995a, 6, (Object) null);
        } else {
            tf tfVar = ((ci0) this.f2100b.getUdm$android_sdk_base_release()).f403v;
            int i2 = n60.f1344i;
            String campaignId = this.f2099a;
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", campaignId);
            LinkedHashMap linkedHashMap = lx.f1214b;
            tfVar.a(new n60(jSONObject));
        }
        return Unit.INSTANCE;
    }
}
