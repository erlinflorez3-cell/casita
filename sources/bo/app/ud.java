package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class ud extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1934a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(Ref.ObjectRef objectRef) {
        super(0);
        this.f1934a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Using location providers: " + this.f1934a.element;
    }
}
