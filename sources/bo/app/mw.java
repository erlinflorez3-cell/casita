package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class mw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f1321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(Class cls) {
        super(0);
        this.f1321a = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Not publishing cached event for class: " + this.f1321a + " because events are not allowed to send yet.";
    }
}
