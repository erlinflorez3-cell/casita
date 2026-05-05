package bo.app;

import com.braze.events.InAppMessageEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n4 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageEvent f1337a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(InAppMessageEvent inAppMessageEvent) {
        super(0);
        this.f1337a = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Error reenqueueing In-App Message from event " + this.f1337a;
    }
}
