package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class lc0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f1186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc0(String str, Ref.ObjectRef objectRef) {
        super(0);
        this.f1186a = objectRef;
        this.f1187b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Could not create BrazeEvent from [serialized event string=").append((String) this.f1186a.element).append(", unique identifier="), this.f1187b, "] ... Deleting!");
    }
}
