package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class qn extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(Object obj) {
        super(0);
        this.f1616a = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Could not add unsupported custom attribute type with value: " + this.f1616a;
    }
}
