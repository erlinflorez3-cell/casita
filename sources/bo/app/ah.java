package bo.app;

import com.braze.events.FeedUpdatedEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class ah extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih f204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONArray f205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ih ihVar, JSONArray jSONArray, String str) {
        super(0);
        this.f204a = ihVar;
        this.f205b = jSONArray;
        this.f206c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        FeedUpdatedEvent feedUpdatedEventA = this.f204a.f909c.a(this.f206c, this.f205b);
        if (feedUpdatedEventA != null) {
            ((vw) this.f204a.f908b).b(FeedUpdatedEvent.class, feedUpdatedEventA);
        }
        return Unit.INSTANCE;
    }
}
