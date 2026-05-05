package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b60 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(int i2) {
        super(0);
        this.f245a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "App Target API version of " + this.f245a + " is too low to display push permission prompt.";
    }
}
