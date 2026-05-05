package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f2044a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(k10 k10Var) {
        super(0);
        this.f2044a = k10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Trigger manager received failed triggered action with id: <"), ((bh0) this.f2044a).f280a, ">. Will attempt to perform fallback triggered actions, if present.");
    }
}
