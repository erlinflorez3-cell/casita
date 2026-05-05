package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ic0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00 f896a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(e00 e00Var) {
        super(0);
        this.f896a = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Storage provider is closed. Not adding event: " + this.f896a;
    }
}
