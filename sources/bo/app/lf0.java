package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class lf0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1193a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(long j2) {
        super(0);
        this.f1193a = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Performing triggered action after a delay of " + this.f1193a + " ms.";
    }
}
