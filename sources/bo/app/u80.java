package bo.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u80 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f1923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(long j2) {
        super(1);
        this.f1923a = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uu it = (uu) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.c(this.f1923a);
    }
}
