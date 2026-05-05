package com.braze.support;

import bo.app.qy;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    public static final f f2704a = new f();

    public final FeatureFlag a(JSONObject featureFlagObject) {
        Intrinsics.checkNotNullParameter(featureFlagObject, "featureFlagObject");
        try {
            String string = featureFlagObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "featureFlagObject.getString(FeatureFlag.ID)");
            boolean z2 = featureFlagObject.getBoolean("enabled");
            JSONObject jSONObjectOptJSONObject = featureFlagObject.optJSONObject(FeatureFlag.PROPERTIES);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z2, jSONObjectOptJSONObject, JsonUtils.getOptionalString(featureFlagObject, FeatureFlag.TRACKING_STRING));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new qy(featureFlagObject), 4, (Object) null);
            return null;
        }
    }
}
