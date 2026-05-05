package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Class cls) {
        super(0);
        this.f171a = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to remove " + this.f171a.getName() + " subscriber.";
    }
}
