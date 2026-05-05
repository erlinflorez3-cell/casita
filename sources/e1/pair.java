package e1;

import g1.superior;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: classes5.dex */
public final class pair {

    /* JADX INFO: renamed from: a */
    public final CoroutineDispatcher f18483a = Dispatchers.getIO().limitedParallelism(1);

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f18484b;

    /* JADX INFO: renamed from: c */
    public final CoroutineScope f18485c;

    public pair(superior superiorVar) {
        CoroutineDispatcher coroutineDispatcherLimitedParallelism = Dispatchers.getDefault().limitedParallelism(2);
        this.f18484b = coroutineDispatcherLimitedParallelism;
        this.f18485c = CoroutineScopeKt.CoroutineScope(coroutineDispatcherLimitedParallelism.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(superiorVar.f19680b));
    }
}
