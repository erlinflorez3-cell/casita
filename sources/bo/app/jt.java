package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class jt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fu f1033a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(fu fuVar) {
        super(0);
        this.f1033a = fuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Got call to endStreamAndJoin(). Stream job: " + this.f1033a.f687a;
    }
}
