package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class uw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw f1980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(Class cls, vw vwVar) {
        super(0);
        this.f1979a = cls;
        this.f1980b = vwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + this.f1979a + " this " + this.f1980b;
    }
}
