package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(Class cls) {
        super(0);
        this.f1554a = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not publishing null message to event class ".concat(this.f1554a.getName());
    }
}
