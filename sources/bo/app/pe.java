package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class pe extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f1509a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(Throwable th) {
        super(0);
        this.f1509a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not logging duplicate error: " + this.f1509a;
    }
}
