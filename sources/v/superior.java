package v;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class superior extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ civilian f28348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public superior(civilian civilianVar) {
        super(0);
        this.f28348a = civilianVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new s0.pair(this.f28348a);
    }
}
