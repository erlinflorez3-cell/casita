package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class aj0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(Ref.ObjectRef objectRef) {
        super(0);
        this.f213a = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Error unpacking zipEntry " + ((String) this.f213a.element);
    }
}
