package bo.app;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ww extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ex f2166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e00 f2167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(ex exVar, e00 e00Var) {
        super(0);
        this.f2166a = exVar;
        this.f2167b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f2166a.f595a.a(this.f2167b);
        return Unit.INSTANCE;
    }
}
