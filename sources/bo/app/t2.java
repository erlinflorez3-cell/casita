package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Ref.ObjectRef objectRef) {
        super(0);
        this.f1802a = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Custom event with name "), (String) this.f1802a.element, " logged with invalid properties. Not logging custom event to Braze.");
    }
}
