package v;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ civilian f28336a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(civilian civilianVar) {
        super(0);
        this.f28336a = civilianVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new u0.pair(this.f28336a);
    }
}
