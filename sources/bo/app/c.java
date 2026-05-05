package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f305a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar) {
        super(0);
        this.f305a = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Cache locked successfully for export: " + this.f305a;
    }
}
