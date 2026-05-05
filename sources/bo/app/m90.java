package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class m90 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x90 f1268a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m90(x90 x90Var) {
        super(0);
        this.f1268a = x90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + this.f1268a.f2196a;
    }
}
