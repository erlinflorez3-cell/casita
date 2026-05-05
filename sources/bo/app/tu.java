package bo.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tu extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1891a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(long j2) {
        super(1);
        this.f1891a = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z80 it = (z80) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a(this.f1891a);
    }
}
