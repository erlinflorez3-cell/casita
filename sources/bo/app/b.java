package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f f230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(0);
        this.f230a = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Notifying confirmAndUnlock listeners for cache: " + this.f230a;
    }
}
