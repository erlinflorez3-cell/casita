package bo.app;

import com.braze.Braze;
import com.braze.events.ContentCardsUpdatedEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(Braze braze) {
        super(0);
        this.f609a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((vw) this.f609a.getExternalIEventMessenger$android_sdk_base_release()).b(ContentCardsUpdatedEvent.class, ((ci0) this.f609a.getUdm$android_sdk_base_release()).B.a(true));
        return Unit.INSTANCE;
    }
}
