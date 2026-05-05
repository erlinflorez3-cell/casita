package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class fn extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn f681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(Ref.ObjectRef objectRef, kn knVar) {
        super(0);
        this.f680a = objectRef;
        this.f681b = knVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("The received cards are for user ").append((String) this.f680a.element).append(" and the current user is "), this.f681b.f1123a, " , the cards will be discarded and no changes will be made.");
    }
}
