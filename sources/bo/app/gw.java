package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class gw extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v00 f776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(vw vwVar) {
        super(0);
        this.f776a = vwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Subscribing to events with " + this.f776a;
    }
}
