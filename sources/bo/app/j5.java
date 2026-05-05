package bo.app;

import com.braze.Braze;
import com.braze.events.FeedUpdatedEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class j5 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f975a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Braze braze) {
        super(0);
        this.f975a = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v00 externalIEventMessenger$android_sdk_base_release = this.f975a.getExternalIEventMessenger$android_sdk_base_release();
        xy xyVar = ((ci0) this.f975a.getUdm$android_sdk_base_release()).A;
        vw vwVar = (vw) externalIEventMessenger$android_sdk_base_release;
        vwVar.b(FeedUpdatedEvent.class, xyVar.a(new JSONArray(xyVar.f2249b.getString("cards", "[]")), xyVar.f2249b.getString("uid", ""), true, xyVar.f2249b.getLong("cards_timestamp", -1L)));
        return Unit.INSTANCE;
    }
}
