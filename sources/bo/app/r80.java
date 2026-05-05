package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r80 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50 f1652a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(s50 s50Var) {
        super(0);
        this.f1652a = s50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Shutdown sync got success response: " + this.f1652a;
    }
}
