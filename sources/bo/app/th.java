package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class th extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w40 f1870a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(w40 w40Var) {
        super(0);
        this.f1870a = w40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Clearing completely dispatched sealed session " + this.f1870a.f2375a;
    }
}
