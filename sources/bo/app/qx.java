package bo.app;

import com.braze.models.FeatureFlag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qx extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeatureFlag f1632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(String str, FeatureFlag featureFlag) {
        super(0);
        this.f1631a = str;
        this.f1632b = featureFlag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Key " + this.f1631a + " does not exist in properties " + this.f1632b.getProperties() + '.';
    }
}
