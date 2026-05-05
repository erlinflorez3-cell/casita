package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ci f1445a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(ci ciVar) {
        super(0);
        this.f1445a = ciVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to register dynamic receiver for " + this.f1445a.f378i;
    }
}
