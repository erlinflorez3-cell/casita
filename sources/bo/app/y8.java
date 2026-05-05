package bo.app;

import com.braze.Constants;
import com.braze.models.outgoing.BrazeProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class y8 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeProperties f2287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(String str, BrazeProperties brazeProperties) {
        super(0);
        this.f2286a = str;
        this.f2287b = brazeProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, this.f2286a);
        BrazeProperties brazeProperties = this.f2287b;
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            eventData.put("p", this.f2287b.forJsonPut());
        }
        lx lxVar = lx.CUSTOM_EVENT;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
