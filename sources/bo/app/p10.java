package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class p10 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1479a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(int i2) {
        super(0);
        this.f1479a = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Set in-app message duration to " + this.f1479a + " milliseconds.";
    }
}
