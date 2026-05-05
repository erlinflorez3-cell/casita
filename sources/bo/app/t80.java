package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class t80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80 f1823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(v80 v80Var) {
        super(0);
        this.f1823a = v80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("Kicking off request framework sweeper job ");
        Job job = this.f1823a.f2016f;
        return sb.append(job != null ? Boolean.valueOf(job.isActive()) : null).toString();
    }
}
