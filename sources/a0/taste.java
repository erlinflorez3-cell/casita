package a0;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import t.misplace;

/* JADX INFO: loaded from: classes.dex */
public final class taste {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.apparatus f79a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l.tongue f80b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final misplace f81c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f82d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f83e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f84f;

    public taste(CoroutineScope coroutineScope, l.tongue tongueVar, r0.apparatus apparatusVar, misplace misplaceVar) {
        superior superiorVar = superior.f78a;
        this.f79a = apparatusVar;
        this.f80b = tongueVar;
        this.f81c = misplaceVar;
        this.f82d = coroutineScope;
        this.f83e = superiorVar;
        this.f84f = LazyKt.lazy(new civilian(this));
    }
}
