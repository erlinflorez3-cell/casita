package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class wh extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w40 f2147a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(w40 w40Var) {
        super(0);
        this.f2147a = w40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Checking if this session needs to be sealed: " + this.f2147a.f2375a;
    }
}
