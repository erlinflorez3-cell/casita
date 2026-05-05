package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class vg0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg0(String str) {
        super(0);
        this.f2045a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return d1.a(new StringBuilder("Retaining triggered action "), this.f2045a, " in re-eligibility list.");
    }
}
