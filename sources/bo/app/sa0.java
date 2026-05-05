package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class sa0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fb0 f1755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(fb0 fb0Var) {
        super(0);
        this.f1755a = fb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Banners enabled but maxBannerPlacement is " + this.f1755a.G + ". Not enabling banners.";
    }
}
