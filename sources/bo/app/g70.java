package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g70 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f723b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(int i2, int i3) {
        super(0);
        this.f722a = i2;
        this.f723b = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Stored push registration ID version code " + this.f722a + " does not match live version code " + this.f723b + ". Not returning saved registration ID.";
    }
}
