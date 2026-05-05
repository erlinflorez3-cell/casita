package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k10 f829a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(bh0 bh0Var) {
        super(0);
        this.f829a = bh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return h1.a(new StringBuilder("Found potential triggered action for incoming trigger event. Action id "), ((bh0) this.f829a).f280a, '.');
    }
}
