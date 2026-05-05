package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class z90 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d10 f2371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(d10 d10Var) {
        super(0);
        this.f2371a = d10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "SDK Debugger Initialization Request failed " + this.f2371a.a() + ". Disabling SDK Debugger.";
    }
}
