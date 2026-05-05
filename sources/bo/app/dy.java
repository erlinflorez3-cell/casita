package bo.app;

import com.braze.models.FeatureFlag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class dy extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureFlag f528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(FeatureFlag featureFlag) {
        super(0);
        this.f528a = featureFlag;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Error storing Feature Flag: " + this.f528a + '.';
    }
}
