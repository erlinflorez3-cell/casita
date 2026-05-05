package bo.app;

import com.braze.Constants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1088a = "feed_displayed";

    public k9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, this.f1088a);
        lx lxVar = lx.INTERNAL;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
