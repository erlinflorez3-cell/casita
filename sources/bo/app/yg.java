package bo.app;

import com.braze.events.ContentCardsUpdatedEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class yg extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f2309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dm f2310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(ih ihVar, dm dmVar, String str) {
        super(0);
        this.f2309a = ihVar;
        this.f2310b = dmVar;
        this.f2311c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        ContentCardsUpdatedEvent contentCardsUpdatedEventA = this.f2309a.f911e.a(this.f2310b, this.f2311c);
        if (contentCardsUpdatedEventA != null) {
            ((vw) this.f2309a.f908b).b(ContentCardsUpdatedEvent.class, contentCardsUpdatedEventA);
        }
        return Unit.INSTANCE;
    }
}
