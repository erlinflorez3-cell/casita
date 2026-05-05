package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ow extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(Class cls, Object obj) {
        super(0);
        this.f1463a = cls;
        this.f1464b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "SDK is disabled. Not publishing event class: " + this.f1463a.getName() + " and message: " + this.f1464b;
    }
}
