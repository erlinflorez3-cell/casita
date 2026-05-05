package bo.app;

import com.braze.events.InAppMessageEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageEvent f244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(InAppMessageEvent inAppMessageEvent) {
        super(0);
        this.f244a = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Error retrying In-App Message from event " + this.f244a;
    }
}
