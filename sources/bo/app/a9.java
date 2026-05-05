package bo.app;

import com.braze.models.FeatureFlag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureFlag f179a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(FeatureFlag featureFlag) {
        super(0);
        this.f179a = featureFlag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject eventData = new JSONObject().put("fid", this.f179a.getId()).put(FeatureFlag.TRACKING_STRING, this.f179a.getTrackingString$android_sdk_base_release());
        lx lxVar = lx.FEATURE_FLAG_IMPRESSION_EVENT;
        Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
        return new ba(lxVar, eventData, 0.0d, 12);
    }
}
