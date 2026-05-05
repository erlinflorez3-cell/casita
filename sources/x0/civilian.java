package x0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class civilian extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ abundant f28437a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civilian(abundant abundantVar) {
        super(1);
        this.f28437a = abundantVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, w0.misplace] */
    public final void a(w0.gregarious gregariousVar) {
        w0.slide slideVar = (w0.slide) gregariousVar;
        slideVar.f28398a.element = w0.misplace.f28393a;
        abundant abundantVar = this.f28437a;
        slideVar.f28399b.element = abundantVar.f28423b;
        slideVar.f28400c.element = true;
        slideVar.f28401d.put("x-ma-hostname", String.valueOf("//" + abundantVar.f28424c));
        if (Intrinsics.areEqual(this.f28437a.f28425d, "")) {
            return;
        }
        slideVar.f28401d.put("x-integration-token", String.valueOf(this.f28437a.f28425d));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((w0.gregarious) obj);
        return Unit.INSTANCE;
    }
}
