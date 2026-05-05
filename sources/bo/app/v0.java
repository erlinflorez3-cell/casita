package bo.app;

import com.braze.configuration.BrazeConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeConfig f1990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(BrazeConfig brazeConfig) {
        super(0);
        this.f1990a = brazeConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Setting pending config object: " + this.f1990a;
    }
}
