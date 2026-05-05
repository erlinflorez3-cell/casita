package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o10 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(int i2) {
        super(0);
        this.f1409a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Requested in-app message duration " + this.f1409a + " is lower than the minimum of 999. Defaulting to 5000 milliseconds.";
    }
}
