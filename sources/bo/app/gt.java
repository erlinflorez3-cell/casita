package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gt extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu f774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(fu fuVar) {
        super(0);
        this.f774a = fuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Got call to endStream(). Stream job: " + this.f774a.f687a;
    }
}
