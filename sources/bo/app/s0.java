package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1718a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Class cls) {
        super(0);
        this.f1718a = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to add synchronous subscriber for class: " + this.f1718a;
    }
}
