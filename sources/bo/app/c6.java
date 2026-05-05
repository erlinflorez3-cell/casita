package bo.app;

import com.braze.Braze;
import com.braze.events.InAppMessageEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageEvent f319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(Braze braze, InAppMessageEvent inAppMessageEvent) {
        super(0);
        this.f318a = braze;
        this.f319b = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ci0) this.f318a.getUdm$android_sdk_base_release()).f404w.a(this.f319b.getTriggerEvent(), this.f319b.getTriggerAction());
        return Unit.INSTANCE;
    }
}
