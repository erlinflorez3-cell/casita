package bo.app;

import com.braze.Braze;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Braze braze, String str, String str2) {
        super(0);
        this.f1635a = str;
        this.f1636b = braze;
        this.f1637c = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        if (StringsKt.isBlank(this.f1635a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.f1636b, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new q0(this.f1637c, this.f1635a), 6, (Object) null);
        } else {
            ((ci0) this.f1636b.getUdm$android_sdk_base_release()).B.a(new dm(this.f1635a), this.f1637c);
            ((vw) this.f1636b.getExternalIEventMessenger$android_sdk_base_release()).b(ContentCardsUpdatedEvent.class, ((ci0) this.f1636b.getUdm$android_sdk_base_release()).B.a(true));
        }
        return Unit.INSTANCE;
    }
}
