package bo.app;

import com.braze.configuration.BrazeConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e90 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeConfig f556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(BrazeConfig brazeConfig) {
        super(0);
        this.f556a = brazeConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Setting Braze Override configuration with config: " + this.f556a;
    }
}
