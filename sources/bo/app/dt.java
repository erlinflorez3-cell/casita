package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class dt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(Ref.ObjectRef objectRef) {
        super(0);
        this.f517a = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Recorded data type: " + ((String) this.f517a.element);
    }
}
