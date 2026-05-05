package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ur extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k90 f1962a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(k90 k90Var) {
        super(0);
        this.f1962a = k90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Adding SDK Auth token to request '" + this.f1962a.f1092d.getString("auth_signature", null) + '\'';
    }
}
