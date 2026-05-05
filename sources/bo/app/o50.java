package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o50 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50 f1421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(s50 s50Var) {
        super(0);
        this.f1421a = s50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Found " + this.f1421a.f1734h.size() + " triggered actions in server response.";
    }
}
