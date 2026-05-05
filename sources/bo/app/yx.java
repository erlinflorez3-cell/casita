package bo.app;

import com.braze.models.FeatureFlag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class yx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureFlag f2333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(FeatureFlag featureFlag) {
        super(0);
        this.f2333a = featureFlag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not logging a Feature Flag impression for Feature Flag with id " + this.f2333a.getId() + ". The Feature Flag already had an impression logged in the current session";
    }
}
