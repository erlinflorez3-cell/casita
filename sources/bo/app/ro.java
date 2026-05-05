package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ro extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zo f1701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(zo zoVar) {
        super(0);
        this.f1701a = zoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "currentIntervalMs: " + this.f1701a.f2416g;
    }
}
