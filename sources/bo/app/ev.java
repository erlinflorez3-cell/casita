package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ev extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e00 f593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(e00 e00Var) {
        super(0);
        this.f593a = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Event already seen in cache. Ignoring duplicate: " + this.f593a;
    }
}
